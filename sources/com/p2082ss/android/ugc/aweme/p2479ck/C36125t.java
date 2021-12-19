package com.p2082ss.android.ugc.aweme.p2479ck;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.AbsOpenResultCallback;
import com.bytedance.router.SmartRouter;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.lancet.C58036q;
import com.p2082ss.android.ugc.aweme.p2479ck.C36096c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.ck.t */
public class C36125t {

    /* renamed from: a */
    public static Set<AbstractC36129a> f85341a = new LinkedHashSet();

    /* renamed from: b */
    public static AbstractC36130b f85342b = null;

    /* renamed from: d */
    static boolean f85343d = false;

    /* renamed from: e */
    private static final String f85344e = C36125t.class.getName();

    /* renamed from: f */
    private static Application f85345f;

    /* renamed from: g */
    private static final LinkedHashMap<String, AbstractC36109j> f85346g = new LinkedHashMap<>();

    /* renamed from: h */
    private static boolean f85347h = false;

    /* renamed from: i */
    private static C36125t f85348i;

    /* renamed from: c */
    public C36123r f85349c = new C36123r();

    /* renamed from: com.ss.android.ugc.aweme.ck.t$a */
    public interface AbstractC36129a {
        static {
            Covode.recordClassIndex(43382);
        }

        /* renamed from: a */
        void mo63246a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ck.t$b */
    public interface AbstractC36130b {
        static {
            Covode.recordClassIndex(43383);
        }

        /* renamed from: a */
        String mo59992a(String str);
    }

    /* renamed from: a */
    public static C36125t m73591a() {
        C36125t tVar = f85348i;
        if (tVar != null) {
            return tVar;
        }
        throw new RuntimeException("RouterManager need init first before use!");
    }

    static {
        Covode.recordClassIndex(43378);
    }

    /* renamed from: b */
    private static void m73599b() {
        MethodCollector.m26663i(13748);
        if (f85347h) {
            MethodCollector.m26664o(13748);
            return;
        }
        synchronized (f85346g) {
            try {
                for (AbstractC36129a aVar : f85341a) {
                    aVar.mo63246a();
                }
                f85347h = true;
            } finally {
                MethodCollector.m26664o(13748);
            }
        }
    }

    private C36125t(Application application) {
        f85345f = application;
    }

    /* renamed from: a */
    public static void m73592a(Application application) {
        MethodCollector.m26663i(13747);
        if (f85348i == null) {
            synchronized (C36125t.class) {
                try {
                    if (f85348i == null) {
                        f85348i = new C36125t(application);
                    }
                } finally {
                    MethodCollector.m26664o(13747);
                }
            }
            return;
        }
        MethodCollector.m26664o(13747);
    }

    /* renamed from: a */
    public static void m73593a(String str, AbstractC36109j jVar) {
        f85346g.put(str, jVar);
    }

    /* renamed from: a */
    public static void m73594a(String str, Class<? extends Activity> cls) {
        C36095b bVar = new C36095b(f85345f, str, cls);
        bVar.f85294c = f85343d;
        LinkedHashMap<String, AbstractC36109j> linkedHashMap = f85346g;
        if (linkedHashMap.get(str) == null) {
            linkedHashMap.put(str, bVar);
        }
    }

    /* renamed from: a */
    public static void m73595a(String str, boolean z) {
        String str2;
        try {
            if (TextUtils.isEmpty(str)) {
                str = "empty url";
            }
            JSONObject jSONObject = new JSONObject();
            if (z) {
                str2 = "smartrouter";
            } else {
                str2 = "all";
            }
            jSONObject.put(StringSet.type, str2);
            jSONObject.put("open_url", str);
            C12290b.m22066a("in_app_router_no_matched", (JSONObject) null, (JSONObject) null, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        m73595a(r5, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005b, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m73598a(com.p2082ss.android.ugc.aweme.p2479ck.C36125t r4, java.lang.String r5) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2479ck.C36125t.m73598a(com.ss.android.ugc.aweme.ck.t, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static boolean m73596a(C36125t tVar, Activity activity, String str) {
        C58036q.m104857a(str);
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute(activity, str).withCallback(new AbsOpenResultCallback() {
            /* class com.p2082ss.android.ugc.aweme.p2479ck.C36125t.C361272 */

            static {
                Covode.recordClassIndex(43380);
            }

            @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
            public final void onSuccess(Intent intent) {
                zArr[0] = true;
            }

            @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
            public final void onFail(String str, String str2) {
                zArr[0] = false;
                C36125t.m73595a(str, true);
            }
        }).open();
        if (!zArr[0]) {
            m73599b();
            AbstractC36130b bVar = f85342b;
            if (bVar != null) {
                str = bVar.mo59992a(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Iterator<String> it = f85346g.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (C36132v.m73607a(next, str)) {
                    AbstractC36109j jVar = f85346g.get(next);
                    if (jVar != null) {
                        zArr[0] = jVar.mo63240a(activity, str);
                    }
                }
            }
            m73595a(str, false);
            return false;
        }
        if (!zArr[0]) {
            m73595a(str, false);
        }
        return zArr[0];
    }

    /* renamed from: a */
    public static boolean m73597a(C36125t tVar, Activity activity, String str, int i) {
        C58036q.m104857a(str);
        final boolean[] zArr = new boolean[1];
        SmartRouter.buildRoute(activity, str).withCallback(new AbsOpenResultCallback() {
            /* class com.p2082ss.android.ugc.aweme.p2479ck.C36125t.C361283 */

            static {
                Covode.recordClassIndex(43381);
            }

            @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
            public final void onSuccess(Intent intent) {
                zArr[0] = true;
            }

            @Override // com.bytedance.router.OpenResultCallback, com.bytedance.router.AbsOpenResultCallback
            public final void onFail(String str, String str2) {
                zArr[0] = false;
                C36125t.m73595a(str, true);
            }
        }).open(i);
        if (!zArr[0]) {
            m73599b();
            AbstractC36130b bVar = f85342b;
            if (bVar != null) {
                str = bVar.mo59992a(str);
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Iterator<String> it = f85346g.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (C36132v.m73607a(next, str)) {
                    AbstractC36109j jVar = f85346g.get(next);
                    if (jVar != null) {
                        if (jVar instanceof C36095b) {
                            C36095b bVar2 = (C36095b) jVar;
                            C36096c.C36097a aVar = new C36096c.C36097a();
                            aVar.f85303a = 1;
                            C36096c cVar = new C36096c();
                            cVar.f85302e = aVar.f85303a;
                            cVar.f85298a = aVar.f85304b;
                            cVar.f85299b = aVar.f85305c;
                            cVar.f85300c = aVar.f85306d;
                            cVar.f85301d = aVar.f85307e;
                            cVar.f85300c = i;
                            bVar2.f85293b = cVar;
                            zArr[0] = bVar2.mo63241b(activity, str);
                        } else {
                            zArr[0] = jVar.mo63240a(activity, str);
                        }
                    }
                }
            }
            m73595a(str, false);
            return false;
        }
        if (!zArr[0]) {
            m73595a(str, false);
        }
        return zArr[0];
    }
}
