package com.google.android.gms.measurement.internal;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.Set;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.kd */
public final class C26515kd extends AbstractC26500jp {

    /* renamed from: a */
    private String f62410a;

    /* renamed from: b */
    private Set<Integer> f62411b;

    /* renamed from: c */
    private Map<Integer, C26517kf> f62412c;

    /* renamed from: d */
    private Long f62413d;

    /* renamed from: e */
    private Long f62414e;

    static {
        Covode.recordClassIndex(31937);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.gms.measurement.internal.AbstractC26500jp
    /* renamed from: d */
    public final boolean mo43092d() {
        return false;
    }

    C26515kd(C26498jo joVar) {
        super(joVar);
    }

    /* renamed from: a */
    private final C26517kf m52467a(int i) {
        if (this.f62412c.containsKey(Integer.valueOf(i))) {
            return this.f62412c.get(Integer.valueOf(i));
        }
        C26517kf kfVar = new C26517kf(this, this.f62410a, (byte) 0);
        this.f62412c.put(Integer.valueOf(i), kfVar);
        return kfVar;
    }

    /* renamed from: a */
    private final boolean m52468a(int i, int i2) {
        if (this.f62412c.get(Integer.valueOf(i)) == null) {
            return false;
        }
        return this.f62412c.get(Integer.valueOf(i)).f62416a.get(i2);
    }

    /* JADX WARN: Type inference failed for: r0v171, types: [com.google.android.gms.internal.measurement.gj, java.lang.Object] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x05d9, code lost:
        if (r9.mo42034a() == false) goto L_0x05f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x05db, code lost:
        r0 = java.lang.Integer.valueOf(r9.zzd);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x05e1, code lost:
        r8.mo43171a("Invalid property filter ID. appId, id", r3, java.lang.String.valueOf(r0));
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x05f8, code lost:
        r0 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03d1  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x03d8 A[SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List<com.google.android.gms.internal.measurement.C25802av.C25803a> mo43618a(java.lang.String r38, java.util.List<com.google.android.gms.internal.measurement.C25802av.C25807c> r39, java.util.List<com.google.android.gms.internal.measurement.C25802av.C25824k> r40, java.lang.Long r41, java.lang.Long r42) {
        /*
        // Method dump skipped, instructions count: 1755
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C26515kd.mo43618a(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
