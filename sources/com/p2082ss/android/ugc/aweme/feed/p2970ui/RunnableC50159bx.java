package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50530af;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bx */
final /* synthetic */ class RunnableC50159bx implements Runnable {

    /* renamed from: a */
    private final C50153bv f115791a;

    /* renamed from: b */
    private final MentionTextView f115792b;

    /* renamed from: c */
    private final int f115793c;

    static {
        Covode.recordClassIndex(59285);
    }

    RunnableC50159bx(C50153bv bvVar, MentionTextView mentionTextView, int i) {
        this.f115791a = bvVar;
        this.f115792b = mentionTextView;
        this.f115793c = i;
    }

    public final void run() {
        C50153bv bvVar = this.f115791a;
        MentionTextView mentionTextView = this.f115792b;
        int i = this.f115793c;
        bvVar.f115771n = mentionTextView.getHeight();
        bvVar.f115770m = (bvVar.f115771n * i) / C50530af.m94719b();
        if (C50153bv.f115758a) {
            bvVar.f115764f.setTruncatedTransTextHeight(bvVar.f115771n);
            bvVar.f115764f.setFullTransTextHeight(bvVar.f115770m);
        }
    }
}
