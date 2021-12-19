package com.bytedance.apm.p785m;

import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p779k.C12535e;
import com.bytedance.apm.p786n.AbstractC12555b;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.apm.m.a */
public final class C12553a implements AbstractC12555b {
    static {
        Covode.recordClassIndex(14369);
    }

    @Override // com.bytedance.apm.p786n.AbstractC12555b
    /* renamed from: a */
    public final boolean mo20374a(String str) {
        return ApmDelegate.C12507a.f30372a.mo20329a(str);
    }

    @Override // com.bytedance.apm.p786n.AbstractC12555b
    /* renamed from: b */
    public final boolean mo20376b(String str) {
        return ApmDelegate.C12507a.f30372a.mo20331b(str);
    }

    @Override // com.bytedance.apm.p786n.AbstractC12555b
    /* renamed from: e */
    public final boolean mo20379e(String str) {
        return C12535e.C12536a.f30450a.mo20360a(str);
    }

    @Override // com.bytedance.apm.p786n.AbstractC12555b
    /* renamed from: c */
    public final boolean mo20377c(String str) {
        ApmDelegate apmDelegate = ApmDelegate.C12507a.f30372a;
        if (!apmDelegate.f30340h || apmDelegate.f30339g == null) {
            return false;
        }
        return apmDelegate.f30339g.getMetricTypeSwitch(str);
    }

    @Override // com.bytedance.apm.p786n.AbstractC12555b
    /* renamed from: d */
    public final boolean mo20378d(String str) {
        Boolean bool = C12535e.C12536a.f30450a.f30443a.get(str);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.bytedance.apm.p786n.AbstractC12555b
    /* renamed from: a */
    public final boolean mo20375a(String str, String str2) {
        boolean z;
        C12535e eVar = C12535e.C12536a.f30450a;
        Boolean bool = eVar.f30444b.get(str);
        if (eVar.f30445c == null || eVar.f30445c.optInt(str2) != 1) {
            z = false;
        } else {
            z = true;
        }
        if ((bool == null || !bool.booleanValue()) && !z) {
            return false;
        }
        return true;
    }
}
