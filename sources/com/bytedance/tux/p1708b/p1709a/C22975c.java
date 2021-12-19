package com.bytedance.tux.p1708b.p1709a;

import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.AbstractC23168a;
import com.bytedance.tux.p1708b.C22983g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tux.b.a.c */
public final class C22975c extends AbstractC22974b<AbstractC23168a> {
    static {
        Covode.recordClassIndex(26892);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
    @Override // com.bytedance.tux.p1708b.p1709a.AbstractC22974b
    /* renamed from: a */
    public final /* synthetic */ boolean mo37290a(AbstractC23168a aVar, int i, Object obj) {
        AbstractC23168a aVar2 = aVar;
        C89219l.m154719c(aVar2, "");
        C89219l.m154719c(obj, "");
        if (i == C22983g.m43339m().f54332a) {
            C22983g.m43339m();
            C89219l.m154719c(obj, "");
            aVar2.setIconWidth(((Number) obj).intValue());
            return true;
        } else if (i == C22983g.m43340n().f54332a) {
            C22983g.m43340n();
            C89219l.m154719c(obj, "");
            aVar2.setIconHeight(((Number) obj).intValue());
            return true;
        } else if (i != C22983g.m43348v().f54332a) {
            return false;
        } else {
            C22983g.m43348v();
            C89219l.m154719c(obj, "");
            aVar2.setIconTintColorRes(((Number) obj).intValue());
            return true;
        }
    }
}
