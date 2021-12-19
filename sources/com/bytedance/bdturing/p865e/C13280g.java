package com.bytedance.bdturing.p865e;

import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.bdturing.C13285g;
import com.bytedance.bdturing.p862b.C13251b;
import com.bytedance.bdturing.p865e.C13278f;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.bdturing.e.g */
public final class C13280g implements C13278f.AbstractC13279a {

    /* renamed from: a */
    public static boolean f32469a;

    /* renamed from: b */
    public static boolean f32470b;

    /* renamed from: c */
    public static boolean f32471c;

    /* renamed from: d */
    public static Handler f32472d;

    /* renamed from: e */
    public static AbstractC13272a f32473e;

    /* renamed from: f */
    public static final List<C13278f.AbstractC13279a> f32474f = new LinkedList();

    /* renamed from: g */
    public static boolean f32475g;

    /* renamed from: h */
    public static final C13280g f32476h = new C13280g();

    /* renamed from: i */
    private static int f32477i;

    /* renamed from: j */
    private static JSONObject f32478j = C13274c.f32457a;

    /* renamed from: k */
    private static final List<C13278f.AbstractC13279a> f32479k = new LinkedList();

    /* renamed from: l */
    private static final Runnable f32480l = new RunnableC13281a();

    /* renamed from: com.bytedance.bdturing.e.g$a */
    public static final class RunnableC13281a implements Runnable {
        static {
            Covode.recordClassIndex(15243);
        }

        RunnableC13281a() {
        }

        public final void run() {
            String str;
            C13280g gVar = C13280g.f32476h;
            HashMap hashMap = new HashMap();
            AbstractC13272a aVar = C13280g.f32473e;
            if (aVar == null) {
                C89219l.m154710a("configProvider");
            }
            C89378p a = C89387v.m154943a("aid", aVar.mo21401b());
            hashMap.put(a.getFirst(), a.getSecond());
            AbstractC13272a aVar2 = C13280g.f32473e;
            if (aVar2 == null) {
                C89219l.m154710a("configProvider");
            }
            C89378p a2 = C89387v.m154943a("lang", aVar2.mo21404e());
            hashMap.put(a2.getFirst(), a2.getSecond());
            AbstractC13272a aVar3 = C13280g.f32473e;
            if (aVar3 == null) {
                C89219l.m154710a("configProvider");
            }
            C89378p a3 = C89387v.m154943a("app_name", aVar3.mo21405f());
            hashMap.put(a3.getFirst(), a3.getSecond());
            AbstractC13272a aVar4 = C13280g.f32473e;
            if (aVar4 == null) {
                C89219l.m154710a("configProvider");
            }
            C89378p a4 = C89387v.m154943a("channel", aVar4.mo21408i());
            hashMap.put(a4.getFirst(), a4.getSecond());
            AbstractC13272a aVar5 = C13280g.f32473e;
            if (aVar5 == null) {
                C89219l.m154710a("configProvider");
            }
            C89378p a5 = C89387v.m154943a("region", aVar5.mo21409j());
            hashMap.put(a5.getFirst(), a5.getSecond());
            C89378p a6 = C89387v.m154943a("os_type", "0");
            hashMap.put(a6.getFirst(), a6.getSecond());
            C89378p a7 = C89387v.m154943a("datetime", String.valueOf(System.currentTimeMillis()));
            hashMap.put(a7.getFirst(), a7.getSecond());
            AbstractC13272a aVar6 = C13280g.f32473e;
            if (aVar6 == null) {
                C89219l.m154710a("configProvider");
            }
            C89378p a8 = C89387v.m154943a("sdk_version", aVar6.mo21407h());
            hashMap.put(a8.getFirst(), a8.getSecond());
            AbstractC13272a aVar7 = C13280g.f32473e;
            if (aVar7 == null) {
                C89219l.m154710a("configProvider");
            }
            C89378p a9 = C89387v.m154943a("iid", aVar7.mo21402c());
            hashMap.put(a9.getFirst(), a9.getSecond());
            AbstractC13272a aVar8 = C13280g.f32473e;
            if (aVar8 == null) {
                C89219l.m154710a("configProvider");
            }
            C89378p a10 = C89387v.m154943a("app_version", aVar8.mo21406g());
            hashMap.put(a10.getFirst(), a10.getSecond());
            C89378p a11 = C89387v.m154943a("os_name", "Android");
            hashMap.put(a11.getFirst(), a11.getSecond());
            C89378p a12 = C89387v.m154943a("os_version", String.valueOf(Build.VERSION.SDK_INT));
            hashMap.put(a12.getFirst(), a12.getSecond());
            AbstractC13272a aVar9 = C13280g.f32473e;
            if (aVar9 == null) {
                C89219l.m154710a("configProvider");
            }
            C89378p a13 = C89387v.m154943a("did", aVar9.mo21403d());
            hashMap.put(a13.getFirst(), a13.getSecond());
            String str2 = Build.BRAND;
            try {
                str2 = URLEncoder.encode(str2, "utf-8");
            } catch (UnsupportedEncodingException e) {
                C13285g.m23900a(e);
            }
            C89378p a14 = C89387v.m154943a("device_brand", str2);
            hashMap.put(a14.getFirst(), a14.getSecond());
            String a15 = C13280g.m23880a("common");
            if (a15 == null) {
                str = null;
            } else if (C89361p.m154876c(a15, "/", false)) {
                str = a15 + "vc/setting";
            } else {
                str = a15 + '/' + "vc/setting";
            }
            C13285g.m23905d(str);
            if (str != null || !C13285g.m23902a()) {
                if (str == null) {
                    str = "";
                }
                AbstractC13272a aVar10 = C13280g.f32473e;
                if (aVar10 == null) {
                    C89219l.m154710a("configProvider");
                }
                new C13278f(str, hashMap, gVar, aVar10.mo21400a()).mo21445a();
                return;
            }
            throw new RuntimeException("url should not empty");
        }
    }

    private C13280g() {
    }

    /* renamed from: a */
    public static long m23878a() {
        return f32478j.optLong("available_time");
    }

    /* renamed from: b */
    private static int m23884b() {
        return m23885b("common").optInt("retry_count", 0);
    }

    /* renamed from: c */
    private static long m23887c() {
        return m23885b("common").optLong("retry_interval", 30000);
    }

    /* renamed from: d */
    private static long m23889d() {
        return m23885b("common").optLong("period", 30000);
    }

    static {
        Covode.recordClassIndex(15242);
    }

    /* renamed from: b */
    private static void m23886b(long j) {
        f32478j.put("available_time", j);
    }

    /* renamed from: a */
    public static String m23880a(String str) {
        C89219l.m154719c(str, "");
        return m23881a(str, "host");
    }

    /* renamed from: b */
    public static JSONObject m23885b(String str) {
        C89219l.m154719c(str, "");
        JSONObject optJSONObject = f32478j.optJSONObject(str);
        if (optJSONObject != null) {
            return optJSONObject;
        }
        JSONObject optJSONObject2 = C13274c.f32457a.optJSONObject(str);
        if (optJSONObject2 == null) {
            return new JSONObject();
        }
        return optJSONObject2;
    }

    /* renamed from: c */
    public static void m23888c(String str) {
        try {
            f32478j = new JSONObject(str);
            m23886b(System.currentTimeMillis() + m23889d());
            C13251b.f32365b.mo21416a(str);
        } catch (JSONException e) {
            C13285g.m23900a(e);
        }
    }

    /* renamed from: a */
    public static long m23879a(boolean z) {
        if (z || f32477i >= m23884b() || m23887c() == 0) {
            return Math.max(Math.min(m23878a() - System.currentTimeMillis(), m23889d()), 30000L);
        }
        f32477i++;
        return m23887c();
    }

    /* renamed from: a */
    public static void m23882a(long j) {
        Handler handler = f32472d;
        if (handler != null) {
            handler.removeCallbacks(f32480l);
        }
        Handler handler2 = f32472d;
        if (handler2 != null) {
            handler2.postDelayed(f32480l, j);
        }
    }

    /* renamed from: a */
    public static boolean m23883a(C13278f.AbstractC13279a aVar) {
        boolean add;
        MethodCollector.m26663i(221);
        C89219l.m154719c(aVar, "");
        List<C13278f.AbstractC13279a> list = f32479k;
        synchronized (list) {
            try {
                add = list.add(aVar);
            } finally {
                MethodCollector.m26664o(221);
            }
        }
        return add;
    }

    /* renamed from: a */
    public static String m23881a(String str, String str2) {
        String str3;
        JSONObject optJSONObject;
        JSONObject optJSONObject2 = m23885b(str).optJSONObject(str2);
        if (optJSONObject2 != null) {
            AbstractC13272a aVar = f32473e;
            if (aVar == null) {
                C89219l.m154710a("configProvider");
            }
            str3 = optJSONObject2.optString(aVar.mo21409j());
        } else {
            str3 = null;
        }
        if (!TextUtils.isEmpty(str3)) {
            return str3;
        }
        JSONObject optJSONObject3 = C13274c.f32457a.optJSONObject(str);
        if (optJSONObject3 == null || (optJSONObject = optJSONObject3.optJSONObject(str2)) == null) {
            return null;
        }
        AbstractC13272a aVar2 = f32473e;
        if (aVar2 == null) {
            C89219l.m154710a("configProvider");
        }
        return optJSONObject.optString(aVar2.mo21409j());
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003c A[LOOP:0: B:8:0x0036->B:10:0x003c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0061 A[SYNTHETIC, Splitter:B:15:0x0061] */
    @Override // com.bytedance.bdturing.p865e.C13278f.AbstractC13279a
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21399a(int r6, java.lang.String r7, long r8) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.bdturing.p865e.C13280g.mo21399a(int, java.lang.String, long):void");
    }
}
