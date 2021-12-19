package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.live.base.model.media.AbstractC2989d;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.feed.repository.q */
final /* synthetic */ class C8676q implements AbstractC88433f {

    /* renamed from: a */
    private final FeedRepository.C8658a f21425a;

    static {
        Covode.recordClassIndex(9542);
    }

    C8676q(FeedRepository.C8658a aVar) {
        this.f21425a = aVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        FeedRepository.C8658a aVar = this.f21425a;
        Pair pair = (Pair) obj;
        if (!(pair == null || C13617h.m24465a((List) pair.first))) {
            ArrayList arrayList = new ArrayList();
            for (FeedItem feedItem : (List) pair.first) {
                if (!(feedItem == null || feedItem.item == null || !(feedItem.item instanceof AbstractC2989d) || ((AbstractC2989d) feedItem.item).getVideoModel() == null || ((AbstractC2989d) feedItem.item).getVideoModel().getCoverModel() == null)) {
                    arrayList.add(((AbstractC2989d) feedItem.item).getVideoModel().getCoverModel());
                }
            }
            aVar.f21401j.onNext(arrayList);
        }
    }
}
