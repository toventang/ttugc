package com.p2082ss.android.ugc.aweme.bullet.p2409a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.kit.p1148a.p1149a.C16312e;
import com.bytedance.ies.bullet.service.base.C16610ap;
import com.bytedance.ies.bullet.service.base.resourceloader.config.C16667j;
import com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.a.a */
public final class C34954a extends IXResourceLoader {
    static {
        Covode.recordClassIndex(41981);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void cancelLoad() {
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final C16610ap loadSync(C16610ap apVar, C16667j jVar) {
        String g;
        String str = "";
        C89219l.m154721d(apVar, str);
        C89219l.m154721d(jVar, str);
        C16667j a = new C16667j().mo25897a(jVar);
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (!(f == null || (g = f.mo59391g("lynx_feed")) == null)) {
            str = g;
        }
        a.mo26456f(str);
        C16312e eVar = new C16312e();
        eVar.setService(getService());
        return eVar.loadSync(apVar, a);
    }

    @Override // com.bytedance.ies.bullet.service.base.resourceloader.config.IXResourceLoader
    public final void loadAsync(C16610ap apVar, C16667j jVar, AbstractC89172b<? super C16610ap, C89391z> bVar, AbstractC89172b<? super Throwable, C89391z> bVar2) {
        String g;
        String str = "";
        C89219l.m154721d(apVar, str);
        C89219l.m154721d(jVar, str);
        C89219l.m154721d(bVar, str);
        C89219l.m154721d(bVar2, str);
        C16667j a = new C16667j().mo25897a(jVar);
        IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
        if (!(f == null || (g = f.mo59391g("lynx_feed")) == null)) {
            str = g;
        }
        a.mo26456f(str);
        C16312e eVar = new C16312e();
        eVar.setService(getService());
        eVar.loadAsync(apVar, a, bVar, bVar2);
    }
}
