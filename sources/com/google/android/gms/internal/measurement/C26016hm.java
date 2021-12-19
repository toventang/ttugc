package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.hm */
final class C26016hm implements AbstractC26017hn {
    static {
        Covode.recordClassIndex(31431);
    }

    C26016hm() {
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26017hn
    /* renamed from: a */
    public final C26015hl<?, ?> mo42681a() {
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26017hn
    /* renamed from: b */
    public final Object mo42684b() {
        return C26014hk.zza().zzb();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26017hn
    /* renamed from: a */
    public final Map<?, ?> mo42683a(Object obj) {
        return (C26014hk) obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26017hn
    /* renamed from: b */
    public final Map<?, ?> mo42685b(Object obj) {
        return (C26014hk) obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26017hn
    /* renamed from: d */
    public final Object mo42687d(Object obj) {
        ((C26014hk) obj).zzc();
        return obj;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26017hn
    /* renamed from: c */
    public final boolean mo42686c(Object obj) {
        if (!((C26014hk) obj).zzd()) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26017hn
    /* renamed from: e */
    public final int mo42688e(Object obj) {
        C26014hk hkVar = (C26014hk) obj;
        if (hkVar.isEmpty()) {
            return 0;
        }
        Iterator it = hkVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw new NoSuchMethodError();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26017hn
    /* renamed from: a */
    public final Object mo42682a(Object obj, Object obj2) {
        C26014hk hkVar = (C26014hk) obj;
        C26014hk hkVar2 = (C26014hk) obj2;
        if (!hkVar2.isEmpty()) {
            if (!hkVar.zzd()) {
                hkVar = hkVar.zzb();
            }
            hkVar.zza(hkVar2);
        }
        return hkVar;
    }
}
