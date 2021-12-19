package com.bytedance.lynx.hybrid.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.lynx.hybrid.p1515a.AbstractC21156j;
import com.bytedance.lynx.hybrid.resource.config.C21277c;
import com.bytedance.lynx.hybrid.resource.config.C21284j;
import com.bytedance.lynx.hybrid.resource.config.GeckoConfig;
import com.bytedance.lynx.hybrid.resource.config.IHybridResourceLoader;
import com.bytedance.lynx.hybrid.resource.p1528d.C21291b;
import com.bytedance.lynx.hybrid.resource.p1528d.C21294e;
import com.bytedance.lynx.hybrid.resource.p1528d.EnumC21292c;
import com.bytedance.lynx.hybrid.service.p1536a.AbstractC21348a;
import java.util.Map;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

public interface IResourceService extends AbstractC21348a {

    /* renamed from: com.bytedance.lynx.hybrid.service.IResourceService$a */
    public static final class C21346a {
        static {
            Covode.recordClassIndex(24965);
        }
    }

    static {
        Covode.recordClassIndex(24964);
    }

    void cancel(C21291b bVar);

    void deleteResource(C21294e eVar);

    Map<String, String> getPreloadConfigs();

    C21277c getResourceConfig();

    void init(AbstractC21156j jVar);

    C21291b loadAsync(String str, C21284j jVar, AbstractC89172b<? super C21294e, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2);

    C21294e loadSync(String str, C21284j jVar);

    void registerConfig(String str, GeckoConfig geckoConfig);

    void registerCustomLoader(Class<? extends IHybridResourceLoader> cls, EnumC21292c cVar);

    void unRegisterConfig(String str);

    void unregisterCustomLoader(Class<? extends IHybridResourceLoader> cls, EnumC21292c cVar);
}
