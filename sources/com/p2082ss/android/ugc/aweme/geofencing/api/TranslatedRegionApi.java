package com.p2082ss.android.ugc.aweme.geofencing.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.geofencing.p3047c.C52892b;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63196au;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p2082ss.android.ugc.aweme.tools.AVApi;
import p4560f.p4561a.AbstractC88973n;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;

/* renamed from: com.ss.android.ugc.aweme.geofencing.api.TranslatedRegionApi */
public interface TranslatedRegionApi {

    /* renamed from: a */
    public static final C52879a f121644a = C52879a.f121645a;

    static {
        Covode.recordClassIndex(62283);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/translations/regions/")
    AbstractC88973n<C52892b> getTranslatedRegions();

    /* renamed from: com.ss.android.ugc.aweme.geofencing.api.TranslatedRegionApi$a */
    public static final class C52879a {

        /* renamed from: a */
        static final /* synthetic */ C52879a f121645a = new C52879a();

        private C52879a() {
        }

        static {
            Covode.recordClassIndex(62284);
        }

        /* renamed from: a */
        public static TranslatedRegionApi m97730a() {
            AbstractC63196au C = C63244g.m114602a().mo73257C();
            AVApi b = AVApiImpl.m123134b();
            C89219l.m154716b(b, "");
            String a = b.mo109850a();
            C89219l.m154716b(a, "");
            return (TranslatedRegionApi) C.createRetrofit(a, true, TranslatedRegionApi.class);
        }
    }
}
