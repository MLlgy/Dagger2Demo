# Scope




* 当实例类被 @Scope 标注时，而 Component 没有被 @Scope 标注，则会报出类似以下的错误：

```
错误: com.example.administrator.dagger2demo.practiceFifth.FruitComponent (unscoped) may not reference scoped bindings:
@com.example.administrator.dagger2demo.practiceFifth.TestScope class com.example.administrator.dagger2demo.practiceFifth.AppleBean
```

查看错误信息，差不多也是这个意思。
