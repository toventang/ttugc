package com.p2082ss.android.ugc.aweme.p2440ce;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.AbstractC17765f;
import com.bytedance.ies.powerpermissions.p1240c.C17749a;
import com.p2082ss.android.ugc.aweme.p2440ce.C35444b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.ce.c */
public final /* synthetic */ class C35450c implements AbstractC17765f {

    /* renamed from: a */
    private final C35444b.AbstractC35447b f83618a;

    static {
        Covode.recordClassIndex(42626);
    }

    C35450c(C35444b.AbstractC35447b bVar) {
        this.f83618a = bVar;
    }

    @Override // com.bytedance.ies.powerpermissions.AbstractC17765f
    /* renamed from: a */
    public final void mo28241a(C17749a[] aVarArr) {
        C35444b.AbstractC35447b bVar = this.f83618a;
        if (bVar != null) {
            String[] strArr = new String[aVarArr.length];
            int[] iArr = new int[aVarArr.length];
            int i = 0;
            for (C17749a aVar : aVarArr) {
                strArr[i] = aVar.f42425a;
                iArr[i] = aVar.f42426b == C17749a.EnumC17750a.GRANTED ? 0 : -1;
                i++;
            }
            bVar.mo53515a(strArr, iArr);
        }
    }
}
