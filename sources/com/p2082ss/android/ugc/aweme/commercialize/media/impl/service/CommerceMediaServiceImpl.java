package com.p2082ss.android.ugc.aweme.commercialize.media.impl.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.aweme.commercialize.media.api.p2601a.AbstractC38207a;
import com.p2082ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.p2602a.C38208a;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.p2603b.C38210a;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl */
public final class CommerceMediaServiceImpl implements ICommerceMediaService {
    static {
        Covode.recordClassIndex(45692);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    /* renamed from: e */
    public final boolean mo66517e() {
        return C38210a.f90255a;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    /* renamed from: a */
    public final boolean mo66511a() {
        return C38210a.m77569a();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    /* renamed from: b */
    public final boolean mo66513b() {
        return C38210a.m77572c();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    /* renamed from: c */
    public final boolean mo66515c() {
        return C38210a.m77571b();
    }

    /* renamed from: f */
    public static ICommerceMediaService m77578f() {
        MethodCollector.m26663i(13254);
        Object a = C81908b.m141854a(ICommerceMediaService.class, false);
        if (a != null) {
            ICommerceMediaService iCommerceMediaService = (ICommerceMediaService) a;
            MethodCollector.m26664o(13254);
            return iCommerceMediaService;
        }
        if (C81908b.f183187aq == null) {
            synchronized (ICommerceMediaService.class) {
                try {
                    if (C81908b.f183187aq == null) {
                        C81908b.f183187aq = new CommerceMediaServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(13254);
                    throw th;
                }
            }
        }
        CommerceMediaServiceImpl commerceMediaServiceImpl = (CommerceMediaServiceImpl) C81908b.f183187aq;
        MethodCollector.m26664o(13254);
        return commerceMediaServiceImpl;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    /* renamed from: d */
    public final boolean mo66516d() {
        AbstractC38207a a;
        AbstractC38207a a2 = C38208a.m77568a();
        if ((a2 == null || !a2.mo65698d()) && (a = C38208a.m77568a()) != null && a.mo65700f() != null && !C38210a.m77572c()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    /* renamed from: a */
    public final void mo66510a(boolean z) {
        C38210a.f90255a = z;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    /* renamed from: a */
    public final void mo66509a(AbstractC38207a aVar) {
        C89219l.m154721d(aVar, "");
        C38208a.f90252a.mo123715a(aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    /* renamed from: b */
    public final boolean mo66514b(Music music) {
        if (!C38210a.m77569a() || !C38210a.m77570a(music)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService
    /* renamed from: a */
    public final boolean mo66512a(Music music) {
        return C38210a.m77570a(music);
    }
}
