package com.p2082ss.android.ugc.aweme.qna.p3650ui;

import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.qna.model.C66296h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.ui.n */
public final class C66338n extends C66318g {
    static {
        Covode.recordClassIndex(77849);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66338n(View view) {
        super(view);
        C89219l.m154721d(view, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3650ui.C66318g
    /* renamed from: a */
    public final void mo105231a(C66293f fVar) {
        C89219l.m154721d(fVar, "");
        String str = ((C66296h) fVar).f149061j;
        if (str != null) {
            View findViewById = this.f149126c.findViewById(R.id.db_);
            C89219l.m154716b(findViewById, "");
            ((TuxTextView) findViewById).setText(str);
        }
    }
}
