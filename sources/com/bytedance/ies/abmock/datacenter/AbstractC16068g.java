package com.bytedance.ies.abmock.datacenter;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.datacenter.p1118c.C16057a;
import com.bytedance.p890c.p891a.p892a.p893a.C13468b;
import com.google.gson.C27910f;

/* renamed from: com.bytedance.ies.abmock.datacenter.g */
public abstract class AbstractC16068g extends C16071j {
    static {
        Covode.recordClassIndex(18339);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: c */
    public final boolean mo25521c(String str) {
        if (C16065e.m29769a().f38696c) {
            return C16057a.f38676a.mo25461b(str);
        }
        return C16069h.f38703a.f38704b.contains(str);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: a */
    public final String[] mo25510a(String str) {
        if (C16065e.m29769a().f38696c) {
            return C16057a.f38676a.mo25454a(str);
        }
        return C16069h.f38703a.mo25527a(str);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: b */
    public final String[] mo25518b(String str) {
        return C16069h.f38703a.mo25527a(str);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: a */
    public final void mo25504a(String str, double d) {
        C16069h.f38703a.f38704b.storeDouble(str, d);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: b */
    public final void mo25516b(String str, String str2) {
        C16069h.f38703a.mo25525a(str, str2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: c */
    public final int mo25519c(String str, int i) {
        return C16069h.f38703a.mo25524a(str, i);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: d */
    public final String mo25523d(String str, String str2) {
        return C16069h.f38703a.mo25528b(str, str2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: a */
    public final void mo25505a(String str, float f) {
        C16069h.f38703a.f38704b.storeFloat(str, f);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: b */
    public final double mo25511b(String str, double d) {
        return C16069h.f38703a.f38704b.getDouble(str, d);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: c */
    public final boolean mo25522c(String str, boolean z) {
        return C16069h.f38703a.mo25526a(str, z);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: a */
    public final Object mo25503a(String str, Class cls) {
        if (C16065e.m29769a().f38696c) {
            return C16057a.f38676a.mo25450a(str, cls);
        }
        return mo25515b(str, cls);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: b */
    public final float mo25512b(String str, float f) {
        return C16069h.f38703a.f38704b.getFloat(str, f);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: c */
    public final String mo25520c(String str, String str2) {
        if (C16065e.m29769a().f38696c) {
            return C16057a.f38676a.mo25451a(str, str2);
        }
        return mo25523d(str, str2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: a */
    public final void mo25506a(String str, int i) {
        C16069h.f38703a.f38704b.storeInt(str, i);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: b */
    public final int mo25513b(String str, int i) {
        if (C16065e.m29769a().f38696c) {
            return C16057a.f38676a.mo25447a(str, i);
        }
        return mo25519c(str, i);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: a */
    public final void mo25507a(String str, long j) {
        C16069h.f38703a.f38704b.storeLong(str, j);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: b */
    public final long mo25514b(String str, long j) {
        return C16069h.f38703a.f38704b.getLong(str, j);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: a */
    public final void mo25508a(String str, String str2) {
        C16069h.f38703a.mo25525a(str, str2);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: b */
    public final Object mo25515b(String str, Class cls) {
        String b = C16069h.f38703a.mo25528b(str, null);
        if (b != null) {
            try {
                C16069h hVar = C16069h.f38703a;
                if (hVar.f38705c == null) {
                    hVar.f38705c = new C27910f();
                }
                return hVar.f38705c.mo46670a(b, cls);
            } catch (Throwable th) {
                C13468b.m24210a(th);
            }
        }
        return null;
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: a */
    public final void mo25509a(String str, boolean z) {
        C16069h.f38703a.f38704b.storeBoolean(str, z);
    }

    @Override // com.bytedance.ies.abmock.datacenter.AbstractC16070i, com.bytedance.ies.abmock.datacenter.C16071j
    /* renamed from: b */
    public final boolean mo25517b(String str, boolean z) {
        if (C16065e.m29769a().f38696c) {
            return C16057a.f38676a.mo25453a(str, z);
        }
        return mo25522c(str, z);
    }
}
