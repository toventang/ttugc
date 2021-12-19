package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.am */
final /* synthetic */ class View$OnClickListenerC73463am implements View.OnClickListener {

    /* renamed from: a */
    private final C73461ak f165067a;

    static {
        Covode.recordClassIndex(86200);
    }

    View$OnClickListenerC73463am(C73461ak akVar) {
        this.f165067a = akVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C73461ak akVar = this.f165067a;
        if (akVar.f165031P) {
            if (akVar.f165032Q) {
                akVar.mo116067b(2, R.string.bdp);
            } else if (C73461ak.m129604e()) {
                akVar.mo116063a(2, akVar.f165022G, akVar.f165025J);
            } else if (!TextUtils.isEmpty(akVar.f165026K)) {
                akVar.mo116063a(2, akVar.f165022G, akVar.f165026K);
            } else if (TextUtils.isEmpty(akVar.f165027L) || akVar.f165035T != 0) {
                akVar.mo116066b(2);
            } else {
                akVar.mo116063a(2, akVar.f165022G, akVar.f165027L);
            }
        } else if (akVar.mo116069c()) {
            akVar.mo116062a(2, R.string.bdr);
        } else if (C73461ak.m129604e()) {
            akVar.mo116063a(2, akVar.f165022G, akVar.f165025J);
        } else if (!TextUtils.isEmpty(akVar.f165026K)) {
            akVar.mo116063a(2, akVar.f165022G, akVar.f165026K);
        } else if (TextUtils.isEmpty(akVar.f165027L) || akVar.f165035T != 0) {
            akVar.mo116066b(2);
        } else {
            akVar.mo116063a(2, akVar.f165022G, akVar.f165027L);
        }
        akVar.f165019D.setEnabled(true);
        akVar.f165019D.setButtonStartIcon(Integer.valueOf((int) R.raw.icon_post));
    }
}
