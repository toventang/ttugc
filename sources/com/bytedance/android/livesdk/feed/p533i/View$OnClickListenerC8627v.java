package com.bytedance.android.livesdk.feed.p533i;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.C11721e;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.i.v */
final /* synthetic */ class View$OnClickListenerC8627v implements View.OnClickListener {

    /* renamed from: a */
    private final C8620p f21343a;

    /* renamed from: b */
    private final FeedItem f21344b;

    static {
        Covode.recordClassIndex(9484);
    }

    View$OnClickListenerC8627v(C8620p pVar, FeedItem feedItem) {
        this.f21343a = pVar;
        this.f21344b = feedItem;
    }

    public final void onClick(View view) {
        C8620p pVar = this.f21343a;
        FeedItem feedItem = this.f21344b;
        pVar.mo14923a(feedItem);
        if (feedItem != null && feedItem.item != null && (feedItem.item instanceof C11721e) && !TextUtils.equals(((C11721e) feedItem.item).f28012b, "app")) {
            pVar.mo14924a("more_button");
        }
    }
}
