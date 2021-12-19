package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.measurement.ay */
public class C25828ay {

    /* renamed from: a */
    public static final Uri f60930a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b */
    public static final Pattern f60931b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);

    /* renamed from: c */
    public static final Pattern f60932c = Pattern.compile("^(0|false|f|off|no|n)$", 2);

    /* renamed from: d */
    static final AtomicBoolean f60933d = new AtomicBoolean();

    /* renamed from: e */
    private static final Uri f60934e = Uri.parse("content://com.google.android.gsf.gservices/prefix");

    /* renamed from: f */
    private static HashMap<String, String> f60935f;

    /* renamed from: g */
    private static final HashMap<String, Boolean> f60936g = new HashMap<>();

    /* renamed from: h */
    private static final HashMap<String, Integer> f60937h = new HashMap<>();

    /* renamed from: i */
    private static final HashMap<String, Long> f60938i = new HashMap<>();

    /* renamed from: j */
    private static final HashMap<String, Float> f60939j = new HashMap<>();

    /* renamed from: k */
    private static Object f60940k;

    /* renamed from: l */
    private static boolean f60941l;

    /* renamed from: m */
    private static String[] f60942m = new String[0];

    static {
        Covode.recordClassIndex(31243);
    }

    /* renamed from: a */
    private static Map<String, String> m50012a(ContentResolver contentResolver, String... strArr) {
        MethodCollector.m26663i(7524);
        Cursor query = contentResolver.query(f60934e, null, null, strArr, null);
        TreeMap treeMap = new TreeMap();
        if (query == null) {
            MethodCollector.m26664o(7524);
            return treeMap;
        }
        while (query.moveToNext()) {
            try {
                treeMap.put(query.getString(0), query.getString(1));
            } finally {
                query.close();
                MethodCollector.m26664o(7524);
            }
        }
        return treeMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c0, code lost:
        r2 = r15.query(com.google.android.gms.internal.measurement.C25828ay.f60930a, null, null, new java.lang.String[]{r16}, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ce, code lost:
        if (r2 != null) goto L_0x00d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7369);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d8, code lost:
        if (r2.moveToFirst() != false) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00da, code lost:
        m50013a(r6, r16, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e4, code lost:
        r1 = r2.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e8, code lost:
        if (r1 == null) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ee, code lost:
        if (r1.equals(null) == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00f0, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f1, code lost:
        m50013a(r6, r16, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f4, code lost:
        if (r1 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f6, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f7, code lost:
        r2.close();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7369);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00fd, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fe, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ff, code lost:
        r2.close();
        com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(7369);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0105, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m50011a(android.content.ContentResolver r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 268
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C25828ay.m50011a(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static void m50013a(Object obj, String str, String str2) {
        MethodCollector.m26663i(7370);
        synchronized (C25828ay.class) {
            try {
                if (obj == f60940k) {
                    f60935f.put(str, str2);
                }
            } finally {
                MethodCollector.m26664o(7370);
            }
        }
    }
}
