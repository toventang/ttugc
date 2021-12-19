package com.bytedance.ext_power_list;

import androidx.lifecycle.AbstractC1204m;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.service.AbstractC12799b;
import com.bytedance.assem.arch.service.AbstractC12800c;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerCell;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.bytedance.ext_power_list.d */
public final class C14518d {
    static {
        Covode.recordClassIndex(16605);
    }

    /* renamed from: a */
    public static /* synthetic */ AbstractC12799b m26526a(PowerCell powerCell, AbstractC89277c cVar) {
        C89219l.m154719c(powerCell, "");
        C89219l.m154719c(cVar, "");
        if (powerCell.mo28070i() instanceof AbstractC12748a) {
            AbstractC1204m i = powerCell.mo28070i();
            if (i != null) {
                return C12801d.m23018a((AbstractC12748a) i, cVar);
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new RuntimeException("currentLifecycleOwner is " + powerCell.mo28070i() + ", PowerList has not attached on Assem.");
    }

    /* renamed from: b */
    public static /* synthetic */ AbstractC12800c m26527b(PowerCell powerCell, AbstractC89277c cVar) {
        C89219l.m154719c(powerCell, "");
        C89219l.m154719c(cVar, "");
        if (powerCell.mo28070i() instanceof AbstractC12748a) {
            AbstractC1204m i = powerCell.mo28070i();
            if (i != null) {
                return C12801d.m23023b((AbstractC12748a) i, cVar);
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
        throw new RuntimeException("currentLifecycleOwner is " + powerCell.mo28070i() + ", PowerList has not attached on Assem.");
    }
}
