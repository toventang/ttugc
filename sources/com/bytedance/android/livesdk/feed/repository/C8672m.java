package com.bytedance.android.livesdk.feed.repository;

import android.util.Pair;
import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.livesdk.feed.AbstractC8470a;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.C11721e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* renamed from: com.bytedance.android.livesdk.feed.repository.m */
final /* synthetic */ class C8672m implements AbstractC88434g {

    /* renamed from: a */
    private final FeedRepository.C8658a f21420a;

    /* renamed from: b */
    private final boolean f21421b;

    static {
        Covode.recordClassIndex(9538);
    }

    C8672m(FeedRepository.C8658a aVar, boolean z) {
        this.f21420a = aVar;
        this.f21421b = z;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        AbstractC8470a.EnumC8471a aVar;
        String str;
        FeedRepository.C8658a aVar2 = this.f21420a;
        boolean z = this.f21421b;
        C5827a aVar3 = (C5827a) obj;
        ArrayList<FeedItem> arrayList = new ArrayList(aVar3.f14684b);
        if (aVar2.f21399h != 0 && !arrayList.isEmpty()) {
            FeedItem feedItem = (FeedItem) arrayList.get(0);
            if (feedItem.item != null && feedItem.item.getId() == aVar2.f21399h) {
                feedItem.repeatDisable = true;
            }
        }
        C2965a aVar4 = (C2965a) aVar3.f14685c;
        if (!C13617h.m24465a(arrayList)) {
            for (FeedItem feedItem2 : arrayList) {
                if (feedItem2 != null) {
                    if (aVar4 != null && (feedItem2.type == 1 || feedItem2.type == 2)) {
                        Room room = (Room) feedItem2.item;
                        if (aVar4.mo7786a() != null) {
                            room.setLog_pb(aVar4.mo7786a().toString());
                            if (room.getOwner() != null) {
                                room.getOwner().setLogPb(aVar4.mo7786a().toString());
                            }
                        }
                        room.setRequestId(feedItem2.resId);
                    }
                    if (feedItem2.type == 1 && (feedItem2.item instanceof Room)) {
                        ((Room) feedItem2.item).isFromRecommendCard = feedItem2.isRecommendCard;
                    }
                    if (aVar4 != null && feedItem2.type == 3) {
                        C11721e eVar = (C11721e) feedItem2.item;
                        if (aVar4.mo7786a() != null) {
                            eVar.f28009J = aVar4.mo7786a().toString();
                        }
                        eVar.f28008I = feedItem2.resId;
                    }
                }
            }
        }
        aVar2.f21396e.mo14834a(aVar2.f21393b, arrayList, aVar4, z);
        if (z) {
            aVar2.f21392a = arrayList.size();
        } else {
            aVar2.f21392a += arrayList.size();
        }
        AbstractC8470a aVar5 = aVar2.f21400i;
        if (z) {
            aVar = AbstractC8470a.EnumC8471a.REFRESH;
            str = aVar2.f21394c;
        } else {
            aVar = AbstractC8470a.EnumC8471a.LOAD_MORE;
            str = aVar2.f21395d;
        }
        aVar5.mo14804b(aVar, str);
        return Pair.create(arrayList, aVar3.f14685c);
    }
}
