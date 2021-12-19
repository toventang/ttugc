package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.dq */
final /* synthetic */ class RunnableC50227dq implements Runnable {

    /* renamed from: a */
    private final C50224dn f115984a;

    /* renamed from: b */
    private final String f115985b;

    static {
        Covode.recordClassIndex(59353);
    }

    RunnableC50227dq(C50224dn dnVar, String str) {
        this.f115984a = dnVar;
        this.f115985b = str;
    }

    public final void run() {
        C50224dn dnVar = this.f115984a;
        String str = this.f115985b;
        str.hashCode();
        if (str.equals("on_page_selected") && dnVar.f113953L != null && dnVar.f115981a != null) {
            dnVar.f115981a.mo59622l();
        }
    }
}
