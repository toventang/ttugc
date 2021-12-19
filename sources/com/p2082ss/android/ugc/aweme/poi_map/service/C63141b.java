package com.p2082ss.android.ugc.aweme.poi_map.service;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider;
import java.util.Objects;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.poi_map.service.b */
public final class C63141b implements IPoiMapService {

    /* renamed from: a */
    public static final C63141b f143491a = new C63141b();

    /* renamed from: b */
    private final /* synthetic */ IPoiMapService f143492b;

    @Override // com.p2082ss.android.ugc.aweme.poi_map.service.IPoiMapService
    /* renamed from: a */
    public final Bundle mo101480a(String str, String str2, String str3, String str4, String str5, String str6, String str7, Integer num, String str8, Long l, String str9, String str10, String str11, String str12, UrlModel urlModel, String str13, String str14, String str15, String str16, String str17, String str18) {
        C89219l.m154721d(str3, "");
        C89219l.m154721d(str4, "");
        return this.f143492b.mo101480a(str, str2, str3, str4, str5, str6, str7, num, str8, l, str9, str10, str11, str12, urlModel, str13, str14, str15, str16, str17, str18);
    }

    @Override // com.p2082ss.android.ugc.aweme.poi_map.service.IPoiMapService
    /* renamed from: a */
    public final Class<? extends Fragment> mo101481a() {
        return this.f143492b.mo101481a();
    }

    /* renamed from: com.ss.android.ugc.aweme.poi_map.service.b$a */
    static final class C63142a<T> implements ServiceProvider {

        /* renamed from: a */
        final /* synthetic */ Class f143493a;

        static {
            Covode.recordClassIndex(74406);
        }

        C63142a(Class cls) {
            this.f143493a = cls;
        }

        @Override // com.p2082ss.android.ugc.aweme.framework.services.ServiceProvider
        public final /* synthetic */ Object get() {
            Object newInstance = this.f143493a.newInstance();
            Objects.requireNonNull(newInstance, "null cannot be cast to non-null type com.ss.android.ugc.aweme.poi_map.service.IPoiMapService");
            return newInstance;
        }
    }

    static {
        Covode.recordClassIndex(74405);
    }

    private C63141b() {
        Object obj;
        IPoiMapService poiMapServiceEmptylmpl;
        try {
            obj = C89379q.m157068constructorimpl(Class.forName("com.ss.android.ugc.aweme.poi_map.service.PoiMapServiceImpl"));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        Class cls = (Class) (C89379q.m157073isFailureimpl(obj) ? null : obj);
        if (cls != null) {
            ServiceManager.get().bind(C63140a.f143490a, new C63142a(cls)).asSingleton();
            poiMapServiceEmptylmpl = (IPoiMapService) ServiceManager.get().getService(C63140a.f143490a);
        } else {
            poiMapServiceEmptylmpl = new PoiMapServiceEmptylmpl();
        }
        C89219l.m154716b(poiMapServiceEmptylmpl, "");
        this.f143492b = poiMapServiceEmptylmpl;
    }
}
