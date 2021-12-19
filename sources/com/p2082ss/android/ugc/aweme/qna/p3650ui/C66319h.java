package com.p2082ss.android.ugc.aweme.qna.p3650ui;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.qna.model.C66291d;
import com.p2082ss.android.ugc.aweme.qna.model.C66293f;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.ui.h */
public final class C66319h extends C66318g {

    /* renamed from: a */
    public final Context f149127a;

    static {
        Covode.recordClassIndex(77830);
    }

    @Override // com.p2082ss.android.ugc.aweme.qna.p3650ui.C66318g
    /* renamed from: a */
    public final void mo105231a(C66293f fVar) {
        int i;
        C89219l.m154721d(fVar, "");
        super.mo105231a(fVar);
        C66291d dVar = (C66291d) fVar;
        TuxIconView tuxIconView = (TuxIconView) this.f149126c.findViewById(R.id.dbq);
        if (tuxIconView != null) {
            if (dVar.f149036c) {
                i = 0;
            } else {
                i = 8;
            }
            tuxIconView.setVisibility(i);
        }
        TuxTextView tuxTextView = (TuxTextView) this.f149126c.findViewById(R.id.dbr);
        if (tuxTextView != null) {
            String str = dVar.f149035b;
            if (C80537hk.m139613a(str)) {
                tuxTextView.setText(this.f149127a.getString(dVar.f149034a, str));
                return;
            }
            tuxTextView.setText(this.f149127a.getString(dVar.f149034a));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66319h(View view, Context context) {
        super(view);
        C89219l.m154721d(view, "");
        C89219l.m154721d(context, "");
        this.f149127a = context;
    }
}
