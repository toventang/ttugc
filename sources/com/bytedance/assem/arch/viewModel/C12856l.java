package com.bytedance.assem.arch.viewModel;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.assem.arch.viewModel.l */
public final class C12856l {
    static {
        Covode.recordClassIndex(14688);
    }

    /* renamed from: a */
    public static final <R> C12854k<R> m23100a() {
        C12854k<R> kVar = new C12854k<>();
        kVar.f31279a = true;
        return kVar;
    }

    /* renamed from: b */
    public static final <R> C12854k<R> m23103b() {
        C12854k<R> kVar = new C12854k<>();
        kVar.mo20693a(true);
        kVar.f31279a = true;
        return kVar;
    }

    /* renamed from: c */
    public static final <R> C12854k<R> m23104c() {
        C12854k<R> kVar = new C12854k<>();
        kVar.mo20693a(true);
        return kVar;
    }

    /* renamed from: a */
    public static final <R> C12854k<R> m23102a(boolean z) {
        C12854k<R> kVar = new C12854k<>();
        kVar.mo20693a(!z);
        return kVar;
    }

    /* renamed from: a */
    public static final <R> C12854k<R> m23101a(AbstractC12818f<?> fVar, C12854k<R> kVar, boolean z, boolean z2) {
        boolean uniqueOnlyDefault;
        C89219l.m154719c(fVar, "");
        C89219l.m154719c(kVar, "");
        if (!kVar.f31282d) {
            if (z) {
                uniqueOnlyDefault = false;
            } else {
                uniqueOnlyDefault = fVar.getUniqueOnlyDefault();
            }
            kVar.mo20693a(uniqueOnlyDefault);
        }
        kVar.f31284f = z2;
        return kVar;
    }
}
