package com.p2082ss.android.ugc.aweme.crossplatform.p2709c;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.c.f */
public final class C40611f {

    /* renamed from: a */
    public static final AbstractC89244h f95042a = C89250i.m154773a((AbstractC89171a) C40613b.f95045a);

    /* renamed from: b */
    public static final C40612a f95043b = new C40612a((byte) 0);

    /* renamed from: c */
    private final Map<Object, C40614g> f95044c = new LinkedHashMap();

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.f$a */
    public static final class C40612a {
        static {
            Covode.recordClassIndex(48452);
        }

        /* renamed from: a */
        public static C40611f m81980a() {
            return (C40611f) C40611f.f95042a.getValue();
        }

        private C40612a() {
        }

        public /* synthetic */ C40612a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.c.f$b */
    static final class C40613b extends AbstractC89220m implements AbstractC89171a<C40611f> {

        /* renamed from: a */
        public static final C40613b f95045a = new C40613b();

        static {
            Covode.recordClassIndex(48453);
        }

        C40613b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C40611f invoke() {
            return new C40611f();
        }
    }

    static {
        Covode.recordClassIndex(48451);
    }

    /* renamed from: a */
    private static String m81975a(Object obj) {
        if (obj == null || !(obj instanceof WebView)) {
            return "";
        }
        return "h5";
    }

    /* renamed from: b */
    public final void mo69767b(Object obj, String str, int i) {
        String queryParameter;
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                if (parse != null && C89219l.m154714a((Object) parse.getQueryParameter("_enable_stay_time_report"), (Object) "1") && (queryParameter = parse.getQueryParameter("_enter_from")) != null) {
                    C89219l.m154716b(queryParameter, "");
                    String queryParameter2 = parse.getQueryParameter("_project_name");
                    if (queryParameter2 == null) {
                        queryParameter2 = "unknown";
                    }
                    C89219l.m154716b(queryParameter2, "");
                    if (obj != null && this.f95044c.containsKey(obj)) {
                        if (i == 1) {
                            C40614g gVar = this.f95044c.get(obj);
                            if (gVar == null) {
                                C89219l.m154715b();
                            }
                            C40614g gVar2 = gVar;
                            gVar2.f95048b = true;
                            gVar2.mo69768a();
                        } else if (i == 2) {
                            this.f95044c.remove(obj);
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo69766a(Object obj, String str, int i) {
        String queryParameter;
        if (str != null) {
            try {
                Uri parse = Uri.parse(str);
                if (parse != null && C89219l.m154714a((Object) parse.getQueryParameter("_enable_stay_time_report"), (Object) "1") && (queryParameter = parse.getQueryParameter("_enter_from")) != null) {
                    C89219l.m154716b(queryParameter, "");
                    String queryParameter2 = parse.getQueryParameter("_project_name");
                    if (queryParameter2 == null) {
                        queryParameter2 = "unknown";
                    }
                    C89219l.m154716b(queryParameter2, "");
                    if (obj == null) {
                        return;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i == 3 && this.f95044c.containsKey(obj)) {
                                m81976a(obj, queryParameter2, queryParameter, obj);
                            }
                        } else if (this.f95044c.containsKey(obj)) {
                            m81976a(obj, queryParameter2, queryParameter, obj);
                        } else {
                            m81977a(obj, queryParameter2, queryParameter, m81975a(obj));
                        }
                    } else if (this.f95044c.containsKey(obj)) {
                        C40614g gVar = this.f95044c.get(obj);
                        if (gVar == null) {
                            C89219l.m154715b();
                        }
                        C40614g gVar2 = gVar;
                        if (gVar2.f95048b) {
                            gVar2.f95048b = false;
                            gVar2.f95047a = System.currentTimeMillis();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private final void m81977a(Object obj, String str, String str2, String str3) {
        Map<Object, C40614g> map = this.f95044c;
        C40614g gVar = new C40614g(new C40610e(str, str2, str3));
        gVar.f95047a = System.currentTimeMillis();
        map.put(obj, gVar);
    }

    /* renamed from: a */
    private final void m81976a(Object obj, String str, String str2, Object obj2) {
        C40614g gVar = this.f95044c.get(obj);
        if (gVar == null) {
            C89219l.m154715b();
        }
        C40614g gVar2 = gVar;
        if (!(!C89219l.m154714a((Object) gVar2.f95049c.f95039a, (Object) str)) && !(!C89219l.m154714a((Object) gVar2.f95049c.f95040b, (Object) str2))) {
            gVar = null;
        }
        C40614g gVar3 = gVar;
        if (gVar3 != null) {
            gVar3.mo69768a();
            this.f95044c.remove(obj);
            m81977a(obj, str, str2, m81975a(obj2));
        }
    }
}
