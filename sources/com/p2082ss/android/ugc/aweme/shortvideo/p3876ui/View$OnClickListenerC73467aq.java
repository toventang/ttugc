package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.aq */
final /* synthetic */ class View$OnClickListenerC73467aq implements View.OnClickListener {

    /* renamed from: a */
    private final C73461ak f165072a;

    static {
        Covode.recordClassIndex(86204);
    }

    View$OnClickListenerC73467aq(C73461ak akVar) {
        this.f165072a = akVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C73461ak akVar = this.f165072a;
        if (akVar.f165031P) {
            if (akVar.f165032Q) {
                akVar.mo116067b(1, R.string.bds);
            } else if (C73461ak.m129603d()) {
                akVar.mo116063a(1, akVar.f165023H, akVar.f165024I);
            } else if (!TextUtils.isEmpty(akVar.f165026K)) {
                akVar.mo116063a(1, akVar.f165023H, akVar.f165026K);
            } else if (TextUtils.isEmpty(akVar.f165027L) || akVar.f165035T != 0) {
                akVar.mo116066b(1);
            } else {
                akVar.mo116063a(1, akVar.f165023H, akVar.f165027L);
            }
        } else if (akVar.mo116069c()) {
            akVar.mo116062a(1, R.string.bdt);
        } else if (C73461ak.m129603d()) {
            akVar.mo116063a(1, akVar.f165023H, akVar.f165024I);
        } else if (!TextUtils.isEmpty(akVar.f165026K)) {
            akVar.mo116063a(1, akVar.f165023H, akVar.f165026K);
        } else if (TextUtils.isEmpty(akVar.f165027L) || akVar.f165035T != 0) {
            akVar.mo116066b(1);
        } else {
            akVar.mo116063a(1, akVar.f165023H, akVar.f165027L);
        }
        akVar.f165019D.setEnabled(true);
        akVar.f165019D.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_post));
    }
}
