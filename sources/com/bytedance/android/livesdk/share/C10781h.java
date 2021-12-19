package com.bytedance.android.livesdk.share;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.utils.C11207aa;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.bytedance.android.livesdk.share.h */
final /* synthetic */ class C10781h implements AbstractC89172b {

    /* renamed from: a */
    private final C10772g f25972a;

    static {
        Covode.recordClassIndex(12381);
    }

    C10781h(C10772g gVar) {
        this.f25972a = gVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C10772g gVar = this.f25972a;
        Integer num = (Integer) obj;
        if (gVar.f25949n && gVar.f25950o != null) {
            if (num == null || num.intValue() <= 0) {
                gVar.f25950o.setText(C3966y.m9657a((int) R.string.ebo));
            } else {
                gVar.f25950o.setText(C11207aa.m19863a((long) num.intValue()));
            }
        }
        return C89391z.f203057a;
    }
}
