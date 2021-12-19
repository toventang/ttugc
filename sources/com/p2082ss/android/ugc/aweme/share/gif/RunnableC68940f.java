package com.p2082ss.android.ugc.aweme.share.gif;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.share.gif.f */
final /* synthetic */ class RunnableC68940f implements Runnable {

    /* renamed from: a */
    private final C68935b f154237a;

    /* renamed from: b */
    private final Activity f154238b;

    static {
        Covode.recordClassIndex(81250);
    }

    RunnableC68940f(C68935b bVar, Activity activity) {
        this.f154237a = bVar;
        this.f154238b = activity;
    }

    public final void run() {
        C68935b bVar = this.f154237a;
        Activity activity = this.f154238b;
        bVar.f154220b = ProgressDialogC74145d.m130371a(activity, activity.getString(R.string.cxr));
        if (bVar.f154219a != null) {
            bVar.f154219a.f155234h.setValue(true);
        }
    }
}
