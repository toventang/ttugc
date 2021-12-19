package com.bytedance.android.livesdk.p604qa;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.livesdk.model.message.C9676bi;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p604qa.C10262i;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.qa.q */
final /* synthetic */ class View$OnClickListenerC10279q implements View.OnClickListener {

    /* renamed from: a */
    private final C10262i.C10271f f24864a;

    /* renamed from: b */
    private final ImageView f24865b;

    /* renamed from: c */
    private final TextView f24866c;

    static {
        Covode.recordClassIndex(11845);
    }

    View$OnClickListenerC10279q(C10262i.C10271f fVar, ImageView imageView, TextView textView) {
        this.f24864a = fVar;
        this.f24865b = imageView;
        this.f24866c = textView;
    }

    public final void onClick(View view) {
        C10262i.C10271f fVar = this.f24864a;
        ImageView imageView = this.f24865b;
        TextView textView = this.f24866c;
        if (!fVar.f24846g) {
            fVar.f24846g = true;
            int i = !fVar.f24844e.booleanValue();
            if (!fVar.f24844e.booleanValue()) {
                fVar.f24845f++;
                C10262i.C10271f.m18744a(imageView, textView, 2131234847, R.attr.am9, fVar.f24845f);
            } else {
                fVar.f24845f--;
                C10262i.C10271f.m18744a(imageView, textView, 2131234549, R.attr.amt, fVar.f24845f);
            }
            C9676bi biVar = fVar.f24840a;
            C6501b.C6502a.m13948a(Boolean.valueOf(fVar.f24844e.booleanValue() ^ true).booleanValue() ? "livesdk_qa_question_like" : "livesdk_qa_question_cancel_like").mo12639a().mo12651a("question_content", biVar.f23547b).mo12646a("question_user_id", biVar.f23550e.getId()).mo12651a("like_enter_from", "qa_list").mo12651a("qa_list_enter_from", C10262i.this.f24820o).mo12655b();
            fVar.f24847h.mo142945a(((QAApi) C5805e.m12718a().mo11572a(QAApi.class)).likeQuestion(fVar.f24840a.f23546a, i, 1).mo143271a(new C11191f()).mo143254a(new C10285w(fVar), new C10286x(fVar, imageView, textView)));
        }
    }
}
