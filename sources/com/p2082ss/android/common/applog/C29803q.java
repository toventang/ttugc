package com.p2082ss.android.common.applog;

import android.content.Context;
import android.util.Pair;
import com.bytedance.common.utility.AbstractC13621j;
import com.bytedance.common.utility.C13624l;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.AbstractC29742a;
import com.p2082ss.android.deviceregister.p2135b.p2136a.p2137a.C29879c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.common.applog.q */
public class C29803q {

    /* renamed from: a */
    public static AbstractC29804a f71121a;

    /* renamed from: b */
    public static AbstractC29742a f71122b;

    /* renamed from: c */
    public static final ConcurrentHashMap<String, String> f71123c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public static volatile AbstractC29805b f71124d;

    /* renamed from: e */
    static AbstractC29793g f71125e;

    /* renamed from: f */
    private static volatile boolean f71126f;

    /* renamed from: g */
    private static volatile boolean f71127g;

    /* renamed from: h */
    private static volatile int f71128h;

    /* renamed from: i */
    private static Object f71129i = new Object();

    /* renamed from: j */
    private static volatile String f71130j = "app_log_encrypt_switch_count";

    /* renamed from: com.ss.android.common.applog.q$a */
    public interface AbstractC29804a {
        static {
            Covode.recordClassIndex(36209);
        }
    }

    /* renamed from: com.ss.android.common.applog.q$b */
    public interface AbstractC29805b {
        static {
            Covode.recordClassIndex(36210);
        }

        /* renamed from: a */
        HashMap<String, String> mo52078a();
    }

    /* renamed from: b */
    public static void m60037b(Map map, boolean z) {
        m60034a(map, z);
    }

    static {
        Covode.recordClassIndex(36208);
    }

    /* renamed from: a */
    public static boolean m60035a(String str) {
        if (C13627m.m24498a(str) || str.equalsIgnoreCase("unknown") || str.equalsIgnoreCase("None")) {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '0') {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static String m60030a(String str, boolean z) {
        AbstractC29742a aVar = f71122b;
        if (C13627m.m24498a(str) || aVar == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        m60033a(sb, z);
        return sb.toString();
    }

    /* renamed from: a */
    public static void m60032a(String str, String str2) {
        if (!C13627m.m24498a(str) && !C13627m.m24498a(str2)) {
            f71123c.put(str, str2);
        }
    }

    /* renamed from: a */
    public static void m60033a(StringBuilder sb, boolean z) {
        if (!(f71122b == null || sb == null)) {
            if (sb.toString().indexOf(63) < 0) {
                sb.append("?");
            } else {
                sb.append("&");
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            m60037b(linkedHashMap, z);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
            sb.append(C13624l.m24483a(arrayList, "UTF-8"));
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:96:0x01f7 */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0254  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x018b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01c5 A[Catch:{ Exception -> 0x01f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01fb A[Catch:{ all -> 0x023f }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m60034a(java.util.Map r8, boolean r9) {
        /*
        // Method dump skipped, instructions count: 607
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.C29803q.m60034a(java.util.Map, boolean):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:32|33|34|35) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0094, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0096, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(1285);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0099, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0068 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x008c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte[] m60036a(android.content.Context r9, byte[] r10) {
        /*
        // Method dump skipped, instructions count: 161
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.common.applog.C29803q.m60036a(android.content.Context, byte[]):byte[]");
    }

    /* renamed from: a */
    public static String m60031a(String str, byte[] bArr, Context context, boolean z, String[] strArr) {
        if (C13627m.m24498a(str) || bArr == null || bArr.length <= 0) {
            return null;
        }
        byte[] a = m60036a(context, bArr);
        if (a != null) {
            String str2 = str + "&tt_data=a";
            if (z) {
                str2 = str2 + "&config_retry=b";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Content-Type", "application/octet-stream;tt-data=a");
            if (strArr == null || strArr.length != 2) {
                return AbstractC13621j.f33100a.mo21871a(str2, a, hashMap);
            }
            return new String(C29879c.m60223a(C29879c.m60224a(AbstractC13621j.f33100a.mo21877b(str2, a, hashMap), strArr[0], strArr[1])));
        }
        throw new RuntimeException("encrypt failed");
    }
}
