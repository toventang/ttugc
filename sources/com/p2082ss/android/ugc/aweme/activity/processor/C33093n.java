package com.p2082ss.android.ugc.aweme.activity.processor;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4620k.AbstractC89284h;

/* renamed from: com.ss.android.ugc.aweme.activity.processor.n */
final /* synthetic */ class C33093n extends C89225r {

    /* renamed from: a */
    public static final AbstractC89284h f78660a = new C33093n();

    static {
        Covode.recordClassIndex(39905);
    }

    C33093n() {
        super(C33103x.class, "statusBarColor", "getStatusBarColor()I", 0);
    }

    @Override // p4600h.p4611f.p4613b.C89225r, p4600h.p4620k.AbstractC89290k
    public final Object get(Object obj) {
        return Integer.valueOf(((C33103x) obj).f78673g);
    }

    @Override // p4600h.p4611f.p4613b.C89225r
    public final void set(Object obj, Object obj2) {
        ((C33103x) obj).f78673g = ((Number) obj2).intValue();
    }
}
