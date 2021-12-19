package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.ai */
final /* synthetic */ class View$OnClickListenerC37017ai implements View.OnClickListener {

    /* renamed from: a */
    private final C37157k f87190a;

    static {
        Covode.recordClassIndex(44371);
    }

    View$OnClickListenerC37017ai(C37157k kVar) {
        this.f87190a = kVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C37157k kVar = this.f87190a;
        if (kVar.f87623c == null || kVar.f87623c.getAwemeControl().canComment()) {
            kVar.f87641z.mo63506f("comment_panel");
            kVar.f87572N = "keyboard_enter";
            kVar.f87641z.mo63480a((CharSequence) kVar.f87626j.getText(), (List<TextExtraStruct>) kVar.f87626j.getTextExtraStructList(), kVar.f87641z.f85740k, false, true);
            kVar.f87562C.mo64518a(false, true, false);
        }
    }
}
