package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.feed.ui.by */
public final /* synthetic */ class RunnableC50160by implements Runnable {

    /* renamed from: a */
    private final MentionTextView f115794a;

    static {
        Covode.recordClassIndex(59286);
    }

    RunnableC50160by(MentionTextView mentionTextView) {
        this.f115794a = mentionTextView;
    }

    public final void run() {
        MentionTextView mentionTextView = this.f115794a;
        if (mentionTextView.getLineCount() != 0) {
            mentionTextView.setLines(mentionTextView.getLineCount());
        }
    }
}
