package com.bytedance.helios.sdk.p1105g;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.api.p1088b.C15307e;
import com.bytedance.helios.api.p1088b.C15318n;
import com.bytedance.helios.api.p1088b.C15322p;
import com.bytedance.helios.sdk.C15427e;
import com.bytedance.helios.sdk.p1097d.C15400e;
import com.bytedance.helios.sdk.utils.C15484f;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.bytedance.helios.sdk.g.b */
public final class C15475b {

    /* renamed from: a */
    public static final Calendar f37715a;

    /* renamed from: b */
    public static C15322p f37716b;

    /* renamed from: c */
    public static Map<String, C15307e> f37717c = new LinkedHashMap();

    /* renamed from: d */
    public static Map<Integer, C15307e> f37718d = new LinkedHashMap();

    /* renamed from: e */
    public static final C15475b f37719e = new C15475b();

    private C15475b() {
    }

    static {
        Covode.recordClassIndex(17727);
        Calendar instance = Calendar.getInstance();
        C89219l.m154709a((Object) instance, "");
        f37715a = instance;
    }

    /* renamed from: a */
    public static boolean m28470a(int i) {
        String str;
        C15322p pVar = f37716b;
        if (pVar == null) {
            return false;
        }
        C15307e eVar = f37718d.get(Integer.valueOf(i));
        if (eVar == null) {
            C15400e b = C15427e.m28380b(i);
            if (b != null) {
                str = b.f37595a;
            } else {
                str = null;
            }
            eVar = f37717c.get(str);
            if (eVar == null) {
                eVar = pVar.f37392d;
            }
        }
        if (eVar.f37332a || eVar.f37333b) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m28472a(C15318n nVar, C15307e eVar) {
        if (C89219l.m154714a((Object) nVar.f37370p, (Object) "SensitiveApiInterceptException")) {
            nVar.mo24856h(nVar.f37369o + "intercept_error");
            return eVar.f37334c;
        }
        Set<Object> set = nVar.f37379y.f37331g;
        if ((set == null || set.isEmpty()) && !nVar.f37375u.contains("pair_monitor")) {
            nVar.mo24856h(nVar.f37369o + "monitor_normal");
            return eVar.f37332a;
        }
        nVar.mo24856h(nVar.f37369o + "monitor_error");
        return eVar.f37333b;
    }

    /* renamed from: a */
    public static boolean m28471a(long j, double d) {
        if (d <= 0.0d) {
            return false;
        }
        if (d >= 1.0d) {
            return true;
        }
        String plainString = new BigDecimal(String.valueOf(d)).toPlainString();
        C89219l.m154709a((Object) plainString, "");
        String a = C89361p.m154868a(plainString, "0.", "");
        long parseLong = Long.parseLong(a);
        long j2 = 1;
        for (int i = 0; i < a.length(); i++) {
            j2 *= 10;
        }
        long j3 = parseLong;
        long j4 = j2;
        while (j4 != 0) {
            j4 = j3 % j4;
            j3 = j4;
        }
        long j5 = parseLong / j3;
        long j6 = j2 / j3;
        long j7 = j % j6;
        int i2 = f37715a.get(6);
        long j8 = (((long) i2) % (j6 / j5)) * j5;
        long j9 = j5 + j8;
        C15484f.m28491a("Helios-Common-Env", "generateSampleRate hashCode=" + j + " sampleRateValue=" + j5 + '/' + j6 + '(' + d + ") dayOfYear=" + i2 + " range=" + j8 + '-' + j9, (String) null, 12);
        if (j7 < j8 || j7 >= j9) {
            return false;
        }
        return true;
    }
}
