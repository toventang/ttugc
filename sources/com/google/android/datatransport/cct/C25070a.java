package com.google.android.datatransport.cct;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.C25068b;
import com.google.android.datatransport.runtime.AbstractC25155f;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.datatransport.cct.a */
public final class C25070a implements AbstractC25155f {

    /* renamed from: a */
    static final String f59447a;

    /* renamed from: b */
    static final String f59448b;

    /* renamed from: c */
    public static final Set<C25068b> f59449c = Collections.unmodifiableSet(new HashSet(Arrays.asList(C25068b.m48045a("proto"), C25068b.m48045a("json"))));

    /* renamed from: d */
    public static final C25070a f59450d;

    /* renamed from: e */
    public static final C25070a f59451e;

    /* renamed from: h */
    private static final String f59452h;

    /* renamed from: f */
    public final String f59453f;

    /* renamed from: g */
    public final String f59454g;

    @Override // com.google.android.datatransport.runtime.AbstractC25153e
    /* renamed from: a */
    public final String mo40993a() {
        return "cct";
    }

    @Override // com.google.android.datatransport.runtime.AbstractC25155f
    /* renamed from: c */
    public final Set<C25068b> mo40995c() {
        return f59449c;
    }

    @Override // com.google.android.datatransport.runtime.AbstractC25153e
    /* renamed from: b */
    public final byte[] mo40994b() {
        String str = this.f59454g;
        if (str == null && this.f59453f == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.f59453f;
        objArr[2] = "\\";
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return C1764a.m5928a("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }

    static {
        Covode.recordClassIndex(30435);
        String a = C25110e.m48140a("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
        f59447a = a;
        String a2 = C25110e.m48140a("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
        f59448b = a2;
        String a3 = C25110e.m48140a("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");
        f59452h = a3;
        f59450d = new C25070a(a, null);
        f59451e = new C25070a(a2, a3);
    }

    public C25070a(String str, String str2) {
        this.f59453f = str;
        this.f59454g = str2;
    }
}
