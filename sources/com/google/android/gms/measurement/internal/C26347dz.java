package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.internal.C25565r;
import com.google.android.gms.common.util.AbstractC25603e;
import com.google.android.gms.internal.measurement.C26109ku;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.dz */
public final class C26347dz extends AbstractC26400fy {

    /* renamed from: a */
    private static final AtomicReference<String[]> f61806a = new AtomicReference<>();

    /* renamed from: b */
    private static final AtomicReference<String[]> f61807b = new AtomicReference<>();

    /* renamed from: c */
    private static final AtomicReference<String[]> f61808c = new AtomicReference<>();

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26400fy
    /* renamed from: d */
    public final boolean mo43065d() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo42994a() {
        super.mo42994a();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo42999b() {
        super.mo42999b();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ void mo43002c() {
        super.mo43002c();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: k */
    public final /* bridge */ /* synthetic */ C26483j mo43010k() {
        return super.mo43010k();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ AbstractC25603e mo43011l() {
        return super.mo43011l();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: m */
    public final /* bridge */ /* synthetic */ Context mo43012m() {
        return super.mo43012m();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: n */
    public final /* bridge */ /* synthetic */ C26347dz mo43013n() {
        return super.mo43013n();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C26510jz mo43014o() {
        return super.mo43014o();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: p */
    public final /* bridge */ /* synthetic */ C26372ex mo43015p() {
        return super.mo43015p();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: q */
    public final /* bridge */ /* synthetic */ C26350eb mo43016q() {
        return super.mo43016q();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: r */
    public final /* bridge */ /* synthetic */ C26361em mo43017r() {
        return super.mo43017r();
    }

    @Override // com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ C26524km mo43018s() {
        return super.mo43018s();
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC26404gb, com.google.android.gms.measurement.internal.C26401fz
    /* renamed from: t */
    public final /* bridge */ /* synthetic */ C26523kl mo43019t() {
        return super.mo43019t();
    }

    static {
        Covode.recordClassIndex(31769);
    }

    /* renamed from: f */
    private final boolean m51614f() {
        mo43019t();
        if (!TextUtils.isEmpty(this.f62077z.f61997a) || !this.f62077z.mo43016q().mo43117a(3)) {
            return false;
        }
        return true;
    }

    C26347dz(C26381ff ffVar) {
        super(ffVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo43062a(String str) {
        if (str == null) {
            return null;
        }
        if (!m51614f()) {
            return str;
        }
        return m51612a(str, C26407ge.f62085b, C26407ge.f62084a, f61806a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final String mo43063b(String str) {
        if (str == null) {
            return null;
        }
        if (!m51614f()) {
            return str;
        }
        return m51612a(str, C26406gd.f62081b, C26406gd.f62080a, f61807b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final String mo43064c(String str) {
        if (str == null) {
            return null;
        }
        if (!m51614f()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return m51612a(str, C26409gg.f62088b, C26409gg.f62087a, f61808c);
        }
        return "experiment_id" + "(" + str + ")";
    }

    /* renamed from: a */
    private final String m51613a(Object[] objArr) {
        String valueOf;
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            if (obj instanceof Bundle) {
                valueOf = mo43060a((Bundle) obj);
            } else {
                valueOf = String.valueOf(obj);
            }
            if (valueOf != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(valueOf);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo43060a(Bundle bundle) {
        String valueOf;
        if (bundle == null) {
            return null;
        }
        if (!m51614f()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(mo43063b(str));
            sb.append("=");
            C26109ku.m51181b();
            if (mo43018s().mo43641d(null, C26530p.f62493aE)) {
                Object a = m51611a(bundle, str);
                if (a instanceof Bundle) {
                    valueOf = m51613a(new Object[]{a});
                } else if (a instanceof Object[]) {
                    valueOf = m51613a((Object[]) a);
                } else if (a instanceof ArrayList) {
                    valueOf = m51613a(((ArrayList) a).toArray());
                } else {
                    valueOf = String.valueOf(a);
                }
                sb.append(valueOf);
            } else {
                sb.append(m51611a(bundle, str));
            }
        }
        sb.append("}]");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo43061a(zzao zzao) {
        String str = null;
        if (zzao == null) {
            return null;
        }
        if (!m51614f()) {
            return zzao.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(zzao.f62580c);
        sb.append(",name=");
        sb.append(mo43062a(zzao.f62578a));
        sb.append(",params=");
        zzan zzan = zzao.f62579b;
        if (zzan != null) {
            if (!m51614f()) {
                str = zzan.toString();
            } else {
                str = mo43060a(zzan.mo43665a());
            }
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    private static Object m51611a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m51612a(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        boolean z;
        String str2;
        MethodCollector.m26663i(5279);
        C25565r.m49314a(strArr);
        C25565r.m49314a(strArr2);
        C25565r.m49314a(atomicReference);
        if (strArr.length == strArr2.length) {
            z = true;
        } else {
            z = false;
        }
        C25565r.m49324b(z);
        for (int i = 0; i < strArr.length; i++) {
            if (C26510jz.m52405c(str, strArr[i])) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        if (strArr3[i] == null) {
                            strArr3[i] = strArr2[i] + "(" + strArr[i] + ")";
                        }
                        str2 = strArr3[i];
                    } finally {
                        MethodCollector.m26664o(5279);
                    }
                }
                return str2;
            }
        }
        MethodCollector.m26664o(5279);
        return str;
    }
}
