package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.c */
final /* synthetic */ class View$OnClickListenerC37100c implements View.OnClickListener {

    /* renamed from: a */
    private final C37035b f87458a;

    static {
        Covode.recordClassIndex(44454);
    }

    View$OnClickListenerC37100c(C37035b bVar) {
        this.f87458a = bVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C37035b bVar = this.f87458a;
        Aweme l = bVar.mo64541l();
        if (l == null || l.getAwemeControl().canComment()) {
            bVar.f87248w = "keyboard_enter";
            bVar.f87245t.mo63506f("comment_panel");
            bVar.f87245t.mo63480a((CharSequence) bVar.f87233d.getText(), (List<TextExtraStruct>) bVar.f87233d.getTextExtraStructList(), bVar.f87245t.f85740k, false, true);
        }
    }
}
