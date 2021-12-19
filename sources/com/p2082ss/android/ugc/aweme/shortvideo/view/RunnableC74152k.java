package com.p2082ss.android.ugc.aweme.shortvideo.view;

import android.text.Editable;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.view.k */
public final /* synthetic */ class RunnableC74152k implements Runnable {

    /* renamed from: a */
    private final HashTagMentionEditText f166552a;

    /* renamed from: b */
    private final int f166553b;

    /* renamed from: c */
    private final Editable f166554c;

    static {
        Covode.recordClassIndex(86911);
    }

    RunnableC74152k(HashTagMentionEditText hashTagMentionEditText, int i, Editable editable) {
        this.f166552a = hashTagMentionEditText;
        this.f166553b = i;
        this.f166554c = editable;
    }

    public final void run() {
        this.f166552a.setSelection(Math.min(this.f166553b, this.f166554c.length()));
    }
}
