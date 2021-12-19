package com.p2082ss.android.ugc.aweme.question;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.C17273d;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p1194ui.widget.MtEmptyView;
import com.bytedance.router.SmartRoute;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.qna.services.QnaService;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.question.e */
public final class C66519e extends C35658s {

    /* renamed from: I */
    public C66504c f149566I;

    /* renamed from: J */
    protected String f149567J;

    static {
        Covode.recordClassIndex(78062);
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    /* renamed from: g */
    public final void mo62676g() {
        C17273d dVar;
        if (QnaService.m117969a().enablePublicQna()) {
            TuxTextView a = mo62662a(R.string.cxj);
            a.setOnClickListener(new View$OnClickListenerC66525f(this));
            if (this.f149566I.getCreator() == null || !this.f149566I.getCreator().getUid().equals(C31575b.m65865g().getCurUserId())) {
                dVar = new C17273d.C17274a(getActivity()).mo27462b(R.string.f2s).mo27464c(R.string.f2r).f41365a;
            } else {
                dVar = new C17273d.C17274a(getActivity()).mo27462b(R.string.f2u).mo27464c(R.string.f2t).f41365a;
            }
            MtEmptyView a2 = MtEmptyView.m31926a(getContext());
            a2.setStatus(dVar);
            this.f84131o.setBuilder(DmtStatusView.C17269a.m31905a(getContext()).mo27406b(a2).mo27408c(a));
            return;
        }
        super.mo62676g();
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    /* renamed from: a */
    public final void mo62663a(Bundle bundle) {
        super.mo62663a(bundle);
        if (bundle != null) {
            this.f149566I = (C66504c) bundle.getSerializable("detail_question_detail");
            this.f149567J = (String) bundle.getSerializable("from_group_id");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2454ui.C35658s
    /* renamed from: a */
    public final SmartRoute mo62661a(Aweme aweme, C35658s.C35664c cVar) {
        SmartRoute a = super.mo62661a(aweme, cVar);
        C66504c cVar2 = this.f149566I;
        if (cVar2 != null) {
            a.withParam("question_content", cVar2.getContent());
            a.withParam("show_answer_question_button", 1);
            a.withParam("video_from", "qa_detail");
            a.withParam("enter_from", "qa_detail");
            a.withParam("from_group_id", this.f149567J);
        }
        return a;
    }
}
