package com.toutiao.proxyserver;

import android.content.Context;
import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.toutiao.proxyserver.C87291ae;
import com.toutiao.proxyserver.C87331h;
import com.toutiao.proxyserver.p4491c.C87299a;
import com.toutiao.proxyserver.p4491c.C87301c;
import com.toutiao.proxyserver.p4493e.AbstractC87311b;
import com.toutiao.proxyserver.p4493e.C87312c;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: com.toutiao.proxyserver.u */
public final class C87383u {

    /* renamed from: A */
    public static boolean f198076A;

    /* renamed from: B */
    public static boolean f198077B;

    /* renamed from: C */
    public static volatile boolean f198078C = true;

    /* renamed from: D */
    private static volatile String f198079D;

    /* renamed from: E */
    private static long f198080E;

    /* renamed from: a */
    public static volatile C87325g f198081a;

    /* renamed from: b */
    public static volatile C87331h f198082b;

    /* renamed from: c */
    public static volatile C87369r f198083c;

    /* renamed from: d */
    public static volatile C87301c f198084d;

    /* renamed from: e */
    public static volatile Context f198085e;

    /* renamed from: f */
    public static volatile String f198086f;

    /* renamed from: g */
    public static volatile AbstractC87366o f198087g;

    /* renamed from: h */
    public static volatile AbstractC87353n f198088h;

    /* renamed from: i */
    public static volatile AbstractC87352m f198089i;

    /* renamed from: j */
    public static volatile AbstractC87351l f198090j;

    /* renamed from: k */
    public static volatile AbstractC87367p f198091k;

    /* renamed from: l */
    public static volatile boolean f198092l;

    /* renamed from: m */
    public static volatile boolean f198093m = true;

    /* renamed from: n */
    public static int f198094n = 8192;

    /* renamed from: o */
    public static int f198095o = 10;

    /* renamed from: p */
    public static volatile boolean f198096p = true;

    /* renamed from: q */
    public static boolean f198097q;

    /* renamed from: r */
    public static boolean f198098r = true;

    /* renamed from: s */
    public static boolean f198099s;

    /* renamed from: t */
    public static boolean f198100t = true;

    /* renamed from: u */
    public static boolean f198101u;

    /* renamed from: v */
    public static volatile int f198102v = 10;

    /* renamed from: w */
    public static volatile boolean f198103w;

    /* renamed from: x */
    public static volatile int f198104x;

    /* renamed from: y */
    public static volatile AbstractC87311b f198105y;

    /* renamed from: z */
    public static volatile boolean f198106z = true;

    static {
        Covode.recordClassIndex(103280);
    }

    /* renamed from: b */
    public static synchronized long m151663b() {
        long j;
        synchronized (C87383u.class) {
            MethodCollector.m26663i(11077);
            j = f198080E;
            MethodCollector.m26664o(11077);
        }
        return j;
    }

    /* renamed from: a */
    public static synchronized long m151656a() {
        long j;
        synchronized (C87383u.class) {
            MethodCollector.m26663i(10931);
            long j2 = f198080E;
            j = 1;
            if (j2 < Long.MAX_VALUE) {
                j = 1 + j2;
            }
            f198080E = j;
            MethodCollector.m26664o(10931);
        }
        return j;
    }

    /* renamed from: a */
    private static Context m151657a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public static void m151659a(int i, String str) {
        if (f198090j != null) {
            f198090j.mo124031a(i, str);
        }
    }

    /* renamed from: a */
    public static void m151661a(C87331h hVar, Context context) {
        if (hVar == null || context == null) {
            throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
        }
        f198085e = m151657a(context);
        if (f198082b == null) {
            C87325g gVar = f198081a;
            if (gVar == null || !gVar.f197933a.getAbsolutePath().equals(hVar.f197943a.getAbsolutePath())) {
                f198082b = hVar;
                f198084d = C87301c.m151508a(context);
                f198082b.mo141360a(new C87331h.AbstractC87341a() {
                    /* class com.toutiao.proxyserver.C87383u.C873841 */

                    static {
                        Covode.recordClassIndex(103281);
                    }

                    @Override // com.toutiao.proxyserver.C87331h.AbstractC87341a
                    /* renamed from: a */
                    public final void mo141371a(String str) {
                        C87312c.m151524b("TAG_PROXY_DiskLruCache", "new cache created: ".concat(String.valueOf(str)), null);
                    }

                    @Override // com.toutiao.proxyserver.C87331h.AbstractC87341a
                    /* renamed from: a */
                    public final void mo141372a(Set<String> set) {
                        MethodCollector.m26663i(10780);
                        C87301c cVar = C87383u.f198084d;
                        if (set != null && !set.isEmpty()) {
                            int size = set.size() + 1;
                            String[] strArr = new String[size];
                            int i = -1;
                            Map<String, C87299a> map = cVar.f197886a.get(0);
                            for (String str : set) {
                                if (map != null) {
                                    map.remove(str);
                                }
                                i++;
                                strArr[i] = str;
                            }
                            strArr[i + 1] = "0";
                            try {
                                cVar.f197887b.getWritableDatabase().delete("video_http_header_t", "key IN(" + C87301c.m151509a(size - 1) + ") AND flag=?", strArr);
                            } catch (Throwable unused) {
                            }
                        }
                        C87312c.m151524b("TAG_PROXY_DiskLruCache", "cache file removed, ".concat(String.valueOf(set)), null);
                        if (set != null) {
                            for (String str2 : set) {
                                C87291ae aeVar = C87291ae.C87293b.f197857a;
                                String str3 = aeVar.f197853b.get(str2);
                                if (str3 != null) {
                                    aeVar.f197852a.remove(str3);
                                }
                            }
                        }
                        MethodCollector.m26664o(10780);
                    }
                });
                C87385v a = C87385v.m151666a();
                a.f198113f = hVar;
                a.f198112e = f198084d;
                C87371t a2 = C87371t.m151640a();
                a2.f198046d = hVar;
                a2.f198045c = f198084d;
                return;
            }
            throw new IllegalArgumentException("DiskLruCache & DiskCache can not use same path");
        }
    }

    /* renamed from: a */
    public static void m151662a(C87369r rVar, Context context) {
        if (context != null) {
            f198085e = m151657a(context);
            if (f198083c == null) {
                C87331h hVar = f198082b;
                if (hVar == null || !hVar.f197943a.getAbsolutePath().equals(rVar.f198037k.getAbsolutePath())) {
                    f198083c = rVar;
                    C87385v.m151666a().f198114g = rVar;
                    C87371t.m151640a().f198048f = rVar;
                    return;
                }
                throw new IllegalArgumentException("DiskLruCache & DiskCache can not use same path");
            }
            return;
        }
        throw new IllegalArgumentException("MusicDiskCache and Context can't be null");
    }

    /* renamed from: a */
    public static void m151660a(int i, String str, String str2) {
        if (f198089i != null) {
            f198089i.mo124030a(i, str, str2);
        }
    }

    /* renamed from: a */
    public static String m151658a(String str, String str2, List<String> list, String str3) {
        Object[] objArr = new Object[3];
        if (f198079D == null) {
            f198079D = String.valueOf(new Random().nextInt());
        }
        objArr[0] = f198079D;
        objArr[1] = str;
        objArr[2] = str2;
        StringBuilder sb = new StringBuilder(C1764a.m5928a("%s-%s-%s", objArr));
        if (!TextUtils.isEmpty(str3)) {
            sb.append("-").append(str3);
        }
        for (String str4 : list) {
            sb.append("-").append(str4);
        }
        C87312c.m151523a("TAG_PROXY", "------as-----:" + sb.toString(), null);
        return new StringBuilder().append(sb.toString().hashCode()).toString();
    }
}
