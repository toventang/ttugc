package com.p2082ss.android.ugc.aweme.p2282ad.feed.mask;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.i */
public final class C33322i extends AbstractView$OnClickListenerC33314d {
    static {
        Covode.recordClassIndex(40155);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ce  */
    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractView$OnClickListenerC33314d
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59312c() {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.C33322i.mo59312c():void");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractView$OnClickListenerC33314d
    /* renamed from: a */
    public final void mo59310a(View view) {
        Integer valueOf;
        if (view != null && (valueOf = Integer.valueOf(view.getId())) != null) {
            if (valueOf.intValue() == R.id.ds) {
                this.f79150c.mo59294a(12);
            } else if (valueOf.intValue() == R.id.ef) {
                this.f79150c.mo59294a(11);
            } else if (valueOf.intValue() == R.id.eu) {
                this.f79150c.mo59294a(14);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33322i(LinearLayout linearLayout, C33313c cVar) {
        super(linearLayout, cVar);
        C89219l.m154721d(linearLayout, "");
        C89219l.m154721d(cVar, "");
    }
}
