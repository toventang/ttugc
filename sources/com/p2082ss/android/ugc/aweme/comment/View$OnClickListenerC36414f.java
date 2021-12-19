package com.p2082ss.android.ugc.aweme.comment;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.aweme.views.mention.MentionEditText;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.comment.f */
public final /* synthetic */ class View$OnClickListenerC36414f implements View.OnClickListener {

    /* renamed from: a */
    private final C36274b f86107a;

    /* renamed from: b */
    private final String f86108b;

    /* renamed from: c */
    private final String f86109c;

    /* renamed from: d */
    private final MentionEditText f86110d;

    static {
        Covode.recordClassIndex(43709);
    }

    View$OnClickListenerC36414f(C36274b bVar, String str, String str2, MentionEditText mentionEditText) {
        this.f86107a = bVar;
        this.f86108b = str;
        this.f86109c = str2;
        this.f86110d = mentionEditText;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C36274b bVar = this.f86107a;
        String str = this.f86108b;
        String str2 = this.f86109c;
        MentionEditText mentionEditText = this.f86110d;
        if (!bVar.mo63515n()) {
            return;
        }
        if (!C31575b.m65865g().isLogin()) {
            C58957c.m108319a(bVar.f85731b.getActivity(), str, "click_comment_at", new C80222ap().mo123649a("group_id", str2).mo123649a("log_pb", C59208ac.m108768c(str2)).f179700a);
        } else if (!bVar.mo63505e() && bVar.f85732c.mo64434m() != null && !C80636z.m139819d(bVar.f85732c.mo64434m())) {
            bVar.f85736g = true;
            CharSequence hint = mentionEditText.getHint();
            if (bVar.mo63515n()) {
                Bundle a = bVar.mo63464a(hint);
                a.putBoolean("clickAt", true);
                bVar.mo63472a(DialogInterface$OnShowListenerC37084bz.m74807a(bVar.f85732c.mo64438p(), bVar.mo63507f(), bVar.f85738i, a));
            }
        }
    }
}
