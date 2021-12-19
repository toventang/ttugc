package com.bytedance.android.livesdk.feed.drawerfeed.p528a;

import android.view.View;
import com.bytedance.android.livesdk.feed.AbstractC8593h;
import com.bytedance.android.livesdk.feed.AbstractC8643m;
import com.bytedance.android.livesdk.feed.dislike.C8527a;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p529e.C8565a;
import com.bytedance.android.livesdk.feed.p533i.AbstractC8610k;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.android.livesdkapi.p691g.AbstractC11767g;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.a.i */
public abstract class AbstractC8542i extends AbstractC8610k {
    static {
        Covode.recordClassIndex(9397);
    }

    @Override // com.bytedance.android.livesdk.feed.p533i.AbstractC8597a
    /* renamed from: a */
    public final boolean mo14844a(FeedItem feedItem, EnterRoomConfig enterRoomConfig) {
        boolean a = super.mo14844a(feedItem, enterRoomConfig);
        if (a) {
            C6779a.m14563a().mo13053a(new C8565a(0));
            C2695a.f8059g.f8063c = "transfer";
        }
        return a;
    }

    public AbstractC8542i(View view, C8527a aVar, AbstractC8593h hVar, FeedDataKey feedDataKey, AbstractC8643m mVar, AbstractC11767g gVar, C88960c<FeedItem> cVar, C88960c<Boolean> cVar2, C88960c<Object> cVar3, C88960c<Object> cVar4) {
        super(view, aVar, hVar, feedDataKey, mVar, gVar, cVar, cVar2, cVar3, cVar4);
        this.f21252h = true;
    }
}
