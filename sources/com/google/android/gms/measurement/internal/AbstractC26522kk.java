package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.internal.measurement.C25773am;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.kk */
public abstract class AbstractC26522kk {

    /* renamed from: a */
    String f62434a;

    /* renamed from: b */
    int f62435b;

    /* renamed from: c */
    Boolean f62436c;

    /* renamed from: d */
    Boolean f62437d;

    /* renamed from: e */
    Long f62438e;

    /* renamed from: f */
    Long f62439f;

    static {
        Covode.recordClassIndex(31944);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract int mo43624a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo43626b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo43627c();

    AbstractC26522kk(String str, int i) {
        this.f62434a = str;
        this.f62435b = i;
    }

    /* renamed from: a */
    static Boolean m52485a(double d, C25773am.C25780d dVar) {
        try {
            return m52491a(new BigDecimal(d), dVar, Math.ulp(d));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static Boolean m52486a(long j, C25773am.C25780d dVar) {
        try {
            return m52491a(new BigDecimal(j), dVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static Boolean m52487a(Boolean bool, boolean z) {
        boolean z2;
        if (bool == null) {
            return null;
        }
        if (bool.booleanValue() != z) {
            z2 = true;
        } else {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    /* renamed from: a */
    static Boolean m52488a(String str, C25773am.C25780d dVar) {
        if (!C26506jv.m52344a(str)) {
            return null;
        }
        try {
            return m52491a(new BigDecimal(str), dVar, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: a */
    static Boolean m52490a(String str, C25773am.C25785f fVar, C26350eb ebVar) {
        String str2;
        List<String> list;
        C25565r.m49314a(fVar);
        String str3 = null;
        if (str == null || !fVar.mo42036a() || fVar.mo42037b() == C25773am.C25785f.EnumC25786a.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (fVar.mo42037b() == C25773am.C25785f.EnumC25786a.IN_LIST) {
            if (fVar.mo42039d() == 0) {
                return null;
            }
        } else if (!fVar.mo42038c()) {
            return null;
        }
        C25773am.C25785f.EnumC25786a b = fVar.mo42037b();
        boolean z = fVar.zzf;
        if (z || b == C25773am.C25785f.EnumC25786a.REGEXP || b == C25773am.C25785f.EnumC25786a.IN_LIST) {
            str2 = fVar.zze;
        } else {
            str2 = fVar.zze.toUpperCase(Locale.ENGLISH);
        }
        if (fVar.mo42039d() == 0) {
            list = null;
        } else {
            list = fVar.zzg;
            if (!z) {
                ArrayList arrayList = new ArrayList(list.size());
                for (String str4 : list) {
                    arrayList.add(str4.toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        if (b == C25773am.C25785f.EnumC25786a.REGEXP) {
            str3 = str2;
        }
        return m52489a(str, b, z, str2, list, str3, ebVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0075, code lost:
        if (r3 != null) goto L_0x0077;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.Boolean m52491a(java.math.BigDecimal r10, com.google.android.gms.internal.measurement.C25773am.C25780d r11, double r12) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.AbstractC26522kk.m52491a(java.math.BigDecimal, com.google.android.gms.internal.measurement.am$d, double):java.lang.Boolean");
    }

    /* renamed from: a */
    private static Boolean m52489a(String str, C25773am.C25785f.EnumC25786a aVar, boolean z, String str2, List<String> list, String str3, C26350eb ebVar) {
        int i;
        if (str == null) {
            return null;
        }
        if (aVar == C25773am.C25785f.EnumC25786a.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z && aVar != C25773am.C25785f.EnumC25786a.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (C26518kg.f62424a[aVar.ordinal()]) {
            case 1:
                if (z) {
                    i = 0;
                } else {
                    i = 66;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (ebVar != null) {
                        ebVar.f61830f.mo43170a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    }
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return Boolean.valueOf(str.equals(str2));
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }
}
