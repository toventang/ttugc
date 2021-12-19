package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39110a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.ui.bb */
public final /* synthetic */ class View$OnClickListenerC37040bb implements View.OnClickListener {

    /* renamed from: a */
    private final C37157k f87258a;

    static {
        Covode.recordClassIndex(44394);
    }

    View$OnClickListenerC37040bb(C37157k kVar) {
        this.f87258a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C37157k kVar = this.f87258a;
        if (kVar.f87567I != null) {
            Map<String, Comment> map = kVar.f87567I.f87767b;
            if (kVar.f87568J == null) {
                kVar.f87568J = new C39110a(kVar.getActivity());
                kVar.f87568J.mo67871a(new String[]{kVar.getActivity().getResources().getString(R.string.ajs), kVar.getActivity().getResources().getString(R.string.aje)}, new DialogInterface$OnClickListenerC37042bd(kVar, map));
            }
            kVar.f87568J.f92306a.mo458b();
            int i = 0;
            for (Map.Entry<String, Comment> entry : map.entrySet()) {
                if (entry.getValue().getAliasAweme() != null) {
                    i++;
                }
            }
            String enterFrom = kVar.f87622b.getEnterFrom();
            C89219l.m154721d(enterFrom, "");
            C39162r.m79460a("comment_batch_management_more_ck", new C33744d().mo59980a("video_reply_number", i).mo59983a("enter_from", enterFrom).f79943a);
        }
    }
}
