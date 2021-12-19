package com.p2082ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.r */
final /* synthetic */ class C33097r extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f78664a = new C33097r();

    static {
        Covode.recordClassIndex(39909);
    }

    C33097r() {
        super(C33103x.class, "statusBarColorAttr", "getStatusBarColorAttr()I", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Integer.valueOf(((C33103x) obj).f78671e);
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((C33103x) obj).f78671e = ((Number) obj2).intValue();
    }
}
