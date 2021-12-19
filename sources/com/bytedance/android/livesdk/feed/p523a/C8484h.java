package com.bytedance.android.livesdk.feed.p523a;

import com.bytedance.android.live.base.model.media.Media;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.feed.a.h */
final /* synthetic */ class C8484h implements AbstractC88433f {

    /* renamed from: a */
    private final C8476d f20991a;

    static {
        Covode.recordClassIndex(9337);
    }

    C8484h(C8476d dVar) {
        this.f20991a = dVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C8476d dVar = this.f20991a;
        FeedItem feedItem = (FeedItem) obj;
        dVar.f20972k = true;
        if (feedItem != null && (feedItem.item instanceof Media)) {
            dVar.f20962a.mo14808c();
        }
        if (dVar.f20969h != null) {
            dVar.f20969h.mo14812a();
        }
    }
}
