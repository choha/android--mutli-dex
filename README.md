# android--mutli-dex
Android多dex 通过ant实现 
1.在build_multi.xml中添加需要拆分的class文件。

2.继承Application，在oncreate里边：

// 需要需要复制，应该根据版本号之类的做区分
        MultiDex multiDex = MultiDex.getInstance();
        multiDex.addDexPath(new DexPath("dex/classes1.dex", true)); // dex文件路径
        multiDex.addDexPath(new DexPath("dex/classes2.dex", true)); // dex文件路径
        multiDex.loadMultiDex(this);
