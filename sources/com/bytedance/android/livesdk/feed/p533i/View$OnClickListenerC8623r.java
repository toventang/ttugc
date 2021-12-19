package com.bytedance.android.livesdk.feed.p533i;

import android.view.View;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.i.r */
final /* synthetic */ class View$OnClickListenerC8623r implements View.OnClickListener {

    /* renamed from: a */
    private final C8620p f21336a;

    /* renamed from: b */
    private final FeedItem f21337b;

    static {
        Covode.recordClassIndex(9480);
    }

    View$OnClickListenerC8623r(C8620p pVar, FeedItem feedItem) {
        this.f21336a = pVar;
        this.f21337b = feedItem;
    }

    public final void onClick(View view) {
        C8620p pVar = this.f21336a;
        pVar.mo14923a(this.f21337b);
        pVar.mo14924a("title");
    }
}
