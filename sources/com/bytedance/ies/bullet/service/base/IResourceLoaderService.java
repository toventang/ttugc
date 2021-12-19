package com.bytedance.ies.bullet.service.base;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.service.base.p1163a.AbstractC16568c;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16666i;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.bytedance.ies.bullet.service.base.resourceloader.config.GeckoConfig;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

public interface IResourceLoaderService extends AbstractC16568c {

    /* renamed from: com.bytedance.ies.bullet.service.base.IResourceLoaderService$a */
    public static final class C16564a {
        static {
            Covode.recordClassIndex(19001);
        }
    }

    static {
        Covode.recordClassIndex(19000);
    }

    void cancel(C16600aj ajVar);

    void deleteResource(C16610ap apVar);

    Map<String, String> getPreloadConfigs();

    C16666i getResourceConfig();

    void init(C16666i iVar);

    C16600aj loadAsync(String str, C16667j jVar, AbstractC89172b<? super C16610ap, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2);

    C16610ap loadSync(String str, C16667j jVar);

    void registerConfig(String str, GeckoConfig geckoConfig);

    void registerCustomLoader(Class<? extends IXResourceLoader> cls, EnumC16636e eVar);

    void unRegisterConfig(String str);

    void unregisterCustomLoader(Class<? extends IXResourceLoader> cls, EnumC16636e eVar);
}
