package com.bytedance.android.livesdk.feed.p533i;

import android.view.View;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.i.t */
final /* synthetic */ class View$OnClickListenerC8625t implements View.OnClickListener {

    /* renamed from: a */
    private final C8620p f21340a;

    /* renamed from: b */
    private final FeedItem f21341b;

    static {
        Covode.recordClassIndex(9482);
    }

    View$OnClickListenerC8625t(C8620p pVar, FeedItem feedItem) {
        this.f21340a = pVar;
        this.f21341b = feedItem;
    }

    public final void onClick(View view) {
        C8620p pVar = this.f21340a;
        pVar.mo14923a(this.f21341b);
        pVar.mo14924a("image");
    }
}
