package com.bytedance.android.livesdk.feed.p533i;

import android.view.View;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.feed.i.l */
final /* synthetic */ class View$OnClickListenerC8613l implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC8610k f21298a;

    /* renamed from: b */
    private final FeedItem f21299b;

    /* renamed from: c */
    private final Room f21300c;

    static {
        Covode.recordClassIndex(9470);
    }

    View$OnClickListenerC8613l(AbstractC8610k kVar, FeedItem feedItem, Room room) {
        this.f21298a = kVar;
        this.f21299b = feedItem;
        this.f21300c = room;
    }

    public final void onClick(View view) {
        this.f21298a.mo14916a(this.f21299b, this.f21300c, view);
    }
}
