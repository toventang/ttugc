package com.bytedance.ies.powerpermissions;

import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpermissions.h */
public final class C17768h extends AbstractC17764e {
    static {
        Covode.recordClassIndex(20332);
    }

    @Override // com.bytedance.ies.powerpermissions.AbstractC17764e
    /* renamed from: a */
    public final void mo28239a(C17775m mVar, String... strArr) {
        AbstractC17751d c;
        C89219l.m154719c(strArr, "");
        if (mVar != null && (c = mVar.mo28248c()) != null) {
            c.mo28226a(C89070n.m154522b(Arrays.copyOf(strArr, strArr.length)));
        }
    }
}
