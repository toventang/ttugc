package com.p2082ss.android.ugc.aweme.util;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.api.EOYApi;
import com.p2082ss.android.ugc.aweme.settings.C68740f;
import java.util.Map;
import org.json.JSONObject;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4560f.p4561a.p4591l.C88956a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.util.m */
public final class C80141m {

    /* renamed from: a */
    public static final C80141m f179563a = new C80141m();

    /* renamed from: b */
    private static C88956a<JSONObject> f179564b;

    /* renamed from: c */
    private static long f179565c;

    private C80141m() {
    }

    static {
        Covode.recordClassIndex(93385);
    }

    /* renamed from: a */
    public static AbstractC88979t<JSONObject> m138904a() {
        if (f179564b == null || f179565c < System.currentTimeMillis()) {
            C88956a<JSONObject> aVar = new C88956a<>();
            f179564b = aVar;
            f179565c = System.currentTimeMillis() + (((long) C68740f.m121172a()) * 1000);
            EOYApi.C33530a.m68693a().questionCloud().mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(C80142a.f179566a).mo143062b((AbstractC88986z<? super R>) aVar);
            C89219l.m154716b(aVar, "");
            return aVar;
        }
        C88956a<JSONObject> aVar2 = f179564b;
        if (aVar2 != null) {
            return aVar2;
        }
        C89219l.m154715b();
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.util.m$a */
    public static final class C80142a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C80142a f179566a = new C80142a();

        static {
            Covode.recordClassIndex(93386);
        }

        C80142a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            Map map = (Map) obj;
            C89219l.m154721d(map, "");
            return new JSONObject(map);
        }
    }
}
