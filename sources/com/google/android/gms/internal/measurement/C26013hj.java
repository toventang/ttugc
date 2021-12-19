package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.hj */
final class C26013hj implements AbstractC26021hr {

    /* renamed from: a */
    private AbstractC26021hr[] f61288a;

    static {
        Covode.recordClassIndex(31428);
    }

    C26013hj(AbstractC26021hr... hrVarArr) {
        this.f61288a = hrVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26021hr
    /* renamed from: a */
    public final boolean mo42611a(Class<?> cls) {
        for (AbstractC26021hr hrVar : this.f61288a) {
            if (hrVar.mo42611a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC26021hr
    /* renamed from: b */
    public final AbstractC26018ho mo42612b(Class<?> cls) {
        String str;
        AbstractC26021hr[] hrVarArr = this.f61288a;
        for (AbstractC26021hr hrVar : hrVarArr) {
            if (hrVar.mo42611a(cls)) {
                return hrVar.mo42612b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        if (valueOf.length() != 0) {
            str = "No factory is available for message type: ".concat(valueOf);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }
}
