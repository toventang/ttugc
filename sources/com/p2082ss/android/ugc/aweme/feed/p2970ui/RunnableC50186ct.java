package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.C50166cc;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ct */
final /* synthetic */ class RunnableC50186ct implements Runnable {

    /* renamed from: a */
    private final C50166cc.C501682 f115866a;

    /* renamed from: b */
    private final int f115867b;

    static {
        Covode.recordClassIndex(59312);
    }

    RunnableC50186ct(C50166cc.C501682 r1, int i) {
        this.f115866a = r1;
        this.f115867b = i;
    }

    public final void run() {
        C50166cc.C501682 r4 = this.f115866a;
        int i = this.f115867b;
        MentionTextView mentionTextView = C50166cc.this.f115810d;
        boolean z = C50166cc.f115801a;
        int lineCount = C50166cc.this.f115810d.getLineCount();
        if (z) {
            lineCount = Math.min(i, lineCount);
        }
        mentionTextView.setLines(lineCount);
    }
}
