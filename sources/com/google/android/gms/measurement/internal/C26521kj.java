package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.measurement.C25773am;
import com.google.android.gms.internal.measurement.C25802av;
import com.google.android.gms.internal.measurement.C26123lh;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.kj */
public final class C26521kj extends AbstractC26522kk {

    /* renamed from: g */
    private C25773am.C25783e f62432g;

    /* renamed from: h */
    private final /* synthetic */ C26515kd f62433h;

    static {
        Covode.recordClassIndex(31943);
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC26522kk
    /* renamed from: b */
    public final boolean mo43626b() {
        return true;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC26522kk
    /* renamed from: c */
    public final boolean mo43627c() {
        return false;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.gms.measurement.internal.AbstractC26522kk
    /* renamed from: a */
    public final int mo43624a() {
        return this.f62432g.zzd;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26521kj(C26515kd kdVar, String str, int i, C25773am.C25783e eVar) {
        super(str, i);
        this.f62433h = kdVar;
        this.f62432g = eVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo43629a(Long l, Long l2, C25802av.C25824k kVar, boolean z) {
        boolean z2;
        Object obj;
        C26123lh.m51205b();
        boolean d = this.f62433h.mo43018s().mo43641d(this.f62434a, C26530p.f62519ae);
        boolean z3 = this.f62432g.zzg;
        boolean z4 = this.f62432g.zzh;
        boolean z5 = this.f62432g.zzi;
        if (z3 || z4 || z5) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean bool = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        if (!z || z2) {
            C25773am.C25778c b = this.f62432g.mo42035b();
            boolean z6 = b.zzf;
            if (kVar.mo42176b()) {
                if (!b.mo42023c()) {
                    this.f62433h.mo43016q().f61830f.mo43170a("No number filter for long property. property", this.f62433h.mo43013n().mo43064c(kVar.zze));
                } else {
                    bool = m52487a(m52486a(kVar.zzg, b.mo42024d()), z6);
                }
            } else if (kVar.mo42177c()) {
                if (!b.mo42023c()) {
                    this.f62433h.mo43016q().f61830f.mo43170a("No number filter for double property. property", this.f62433h.mo43013n().mo43064c(kVar.zze));
                } else {
                    bool = m52487a(m52485a(kVar.zzi, b.mo42024d()), z6);
                }
            } else if ((kVar.zzc & 4) == 0) {
                this.f62433h.mo43016q().f61830f.mo43170a("User property has no value, property", this.f62433h.mo43013n().mo43064c(kVar.zze));
            } else if (b.mo42021a()) {
                bool = m52487a(m52490a(kVar.zzf, b.mo42022b(), this.f62433h.mo43016q()), z6);
            } else if (!b.mo42023c()) {
                this.f62433h.mo43016q().f61830f.mo43170a("No string or number filter defined. property", this.f62433h.mo43013n().mo43064c(kVar.zze));
            } else if (C26506jv.m52344a(kVar.zzf)) {
                bool = m52487a(m52488a(kVar.zzf, b.mo42024d()), z6);
            } else {
                this.f62433h.mo43016q().f61830f.mo43171a("Invalid user property value for Numeric number filter. property, value", this.f62433h.mo43013n().mo43064c(kVar.zze), kVar.zzf);
            }
            C26353ee eeVar = this.f62433h.mo43016q().f61835k;
            if (bool == null) {
                obj = "null";
            } else {
                obj = bool;
            }
            eeVar.mo43170a("Property filter result", obj);
            if (bool == null) {
                return false;
            }
            this.f62436c = true;
            if (z5 && !bool.booleanValue()) {
                return true;
            }
            if (!z || this.f62432g.zzg) {
                this.f62437d = bool;
            }
            if (bool.booleanValue() && z2 && kVar.mo42175a()) {
                long j = kVar.zzd;
                if (l != null) {
                    j = l.longValue();
                }
                if (d && this.f62432g.zzg && !this.f62432g.zzh && l2 != null) {
                    j = l2.longValue();
                }
                if (this.f62432g.zzh) {
                    this.f62439f = Long.valueOf(j);
                } else {
                    this.f62438e = Long.valueOf(j);
                }
            }
            return true;
        }
        C26353ee eeVar2 = this.f62433h.mo43016q().f61835k;
        Integer valueOf = Integer.valueOf(this.f62435b);
        if (this.f62432g.mo42034a()) {
            num = Integer.valueOf(this.f62432g.zzd);
        }
        eeVar2.mo43171a("Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID", valueOf, num);
        return true;
    }
}
