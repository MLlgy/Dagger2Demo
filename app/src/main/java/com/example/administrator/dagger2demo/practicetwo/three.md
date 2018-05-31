![Dagger2](https://upload-images.jianshu.io/upload_images/1969719-98793c5733981aec.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 该系列博客的最终目标： 搭建 MVP + Dagger2 框架
* 该系列博客包含以下几篇内容：
  1. [Dagger 2  系列（一） -- 前奏篇：基本概念介绍](https://www.jianshu.com/p/4571fe68d614)
  2. [Dagger 2  系列（二） -- 基础篇：基本功能的实现](https://www.jianshu.com/p/33f7fab24650)
  3. **Dagger 2 系列（三） -- 基础篇：@Module 和@Provides**

在这篇文章中你会看到什么：
* `@Module` 是什么 ?
* `@Provides` 是什么 ?
 * `@Module` 、`@Provides` 和`@Component` 如何协同作战。


---
## @Module
既然在[Dagger 2 系列（二） -- 基础篇：基本功能的实现](https://www.jianshu.com/p/33f7fab24650)一文中通过 `@Inject` 和 `@Component` 我们已经实现了 DI，那么为什么 `Dagger2` 还要实现其他的DI 方式。
其实在上文中我们实现的 DI 方式中我们不难发现，通过`@Inject` 的注解实体类的构造函数是必不可少，它标识着 Dagger2 可以实例化该类。那么当你需要实例化一个第三方的对象时，是不是懵逼了，要实现注解该类的构造函数，这是不可能的。那么现在就需要 @Module 来充分发挥作用了。**其实Module 其实是一个简单工厂模式，Module 里面的方法都是创建相应类实例的方法。**

> 具体什么是 简单工厂模式，请看[代码段简单学习设计模式 -- 简单工厂模式](https://www.jianshu.com/p/c2d3b1443356)

**栗子**：通过 `@Module` 的方式获得第三方类库的对象 -- `Gson`(当然也可以获得自定义类对象)
```
@Module
public class AModule {

    @Provides
    public Gson provideGson(){
        return new Gson();
    }
}
```
你应该看到的是：
 1. 类通过 @Module 注解
 2. 方法通过 @Provides 注解

## @Provides
在上面的栗子中出现了依着新的注解 -- @Provides，`@Provides` 的作用：**标注 Module 中能够提供实例化对象的方法**

## @Component
此时 DI 不是通过 @Inject 注解类构造器的方式，那么这个注解器的使用方法肯定也有所变化。此时 Component 的职责是管理 Module，Component  中的属性可以把Module加入到 Component，同时一个Component可以加入多个 Module。
具体工作流程：
![协作流程](https://upload-images.jianshu.io/upload_images/1969719-d91dea216d6b4838.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
## 代码示例

```
@Component(modules = UserTwoModule.class)
public interface UserTwoComponent {
    void injectToSecondActivity(SecondActivity mSecondActivity);
}

@Module
public class UserTwoModule {
    @Provides
    UserTwo provideUserTwo(){
        return new UserTwo("男",1243);
    }
}

public class SecondActivity extends AppCompatActivity {
    @Inject
    UserTwo mUserTwo;
    private static final String TAG = "SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
     DaggerUserTwoComponent.builder().build().injectToSecondActivity(this);

    }
}

```
[Dagger2 sample github地址](https://github.com/MLlgy/Dagger2Demo/tree/master/app/src/main/java/com/example/administrator/dagger2demo/practiceThree)
## 总结

到此为止，我们已经实现了基本的基于`Dagger2`的` @Module` 和`@Provides`的依赖注入。下面我们把过程再梳理一遍：
1. 用@Inject注解标注目标类中其他类
2. 在 `Module` 中创建返回值为相应实体类的方法，并用 `@Provides` 标注
3. 若其他类还依赖于其他的类，则重复进行上面2个步骤
4. 调用`Component`（注入器）的`injectXXX`（Object）方法开始注入（`injectXXX`方法名字是官方推荐的名字,以inject开始）

Component 就像媒介,连接 `Module `和 `目标类`，把目标类依赖的实例注入到目标类中，来初始化目标类中的依赖。

