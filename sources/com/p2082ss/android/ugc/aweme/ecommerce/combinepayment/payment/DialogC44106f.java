package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.DialogC44308d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.f */
public final class DialogC44106f extends DialogC44308d {

    /* renamed from: a */
    public boolean f102863a = true;

    /* renamed from: b */
    private final AbstractC89244h f102864b = C89250i.m154773a((AbstractC89171a) new C44107a(this));

    static {
        Covode.recordClassIndex(52417);
    }

    /* renamed from: b */
    public final BottomSheetBehavior<View> mo9590b() {
        return (BottomSheetBehavior) this.f102864b.getValue();
    }

    public final void cancel() {
        if (this.f102863a) {
            super.cancel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.f$a */
    static final class C44107a extends AbstractC89220m implements AbstractC89171a<BottomSheetBehavior<View>> {

        /* renamed from: a */
        final /* synthetic */ DialogC44106f f102865a;

        static {
            Covode.recordClassIndex(52418);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44107a(DialogC44106f fVar) {
            super(0);
            this.f102865a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ BottomSheetBehavior<View> invoke() {
            return BottomSheetBehavior.m52754a(this.f102865a.findViewById(R.id.ajx));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC44106f(Context context, int i) {
        super(context, i);
        C89219l.m154721d(context, "");
    }
}
