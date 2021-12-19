package com.bytedance.android.livesdk.list;

import android.util.Pair;
import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p691g.C11760a;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.list.c */
final /* synthetic */ class C9278c implements AbstractC88433f {

    /* renamed from: a */
    private final MultiPlusFeedRoomListProvider f22677a;

    static {
        Covode.recordClassIndex(10196);
    }

    C9278c(MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider) {
        this.f22677a = multiPlusFeedRoomListProvider;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider = this.f22677a;
        Pair pair = (Pair) obj;
        multiPlusFeedRoomListProvider.f22647d = false;
        if (pair != null) {
            multiPlusFeedRoomListProvider.f22649f = (C2965a) pair.second;
            List<FeedItem> list = (List) pair.first;
            if (list != null && !list.isEmpty()) {
                for (FeedItem feedItem : list) {
                    if (feedItem.item == null) {
                        try {
                            feedItem.item = feedItem.getRoom();
                            if ((feedItem.type == 1 || feedItem.type == 2) && (feedItem.item instanceof Room)) {
                                Room room = (Room) feedItem.item;
                                room.setLog_pb(feedItem.logPb);
                                room.getOwner().setLogPb(feedItem.logPb);
                                room.setRequestId(feedItem.resId);
                                room.isFromRecommendCard = feedItem.isRecommendCard;
                                feedItem.item = room;
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (feedItem.item instanceof Room) {
                        Room room2 = (Room) feedItem.item;
                        if (multiPlusFeedRoomListProvider.f22653j.longValue() == room2.getOwner().getLiveRoomId()) {
                            C3854a.m9453a(3, "MultiPlusFeedRoomListProvider", "Remove duplicate room " + multiPlusFeedRoomListProvider.f22653j);
                        } else if (!multiPlusFeedRoomListProvider.f22657n.contains(Long.valueOf(room2.getId()))) {
                            EnterRoomConfig a = C11760a.m20718a(room2, false);
                            if (C13627m.m24498a(a.f28231a.f28377d) && C13627m.m24498a(a.f28231a.f28375b)) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("roomid", Long.valueOf(a.f28233c.f28301R));
                                C3868c.m9491a("ttlive_webcast_feed_empty_stream", 0, hashMap);
                            }
                            multiPlusFeedRoomListProvider.f22657n.add(Long.valueOf(room2.getId()));
                            if (multiPlusFeedRoomListProvider.f22650g) {
                                a.f28233c.f28298O = multiPlusFeedRoomListProvider.f22650g;
                                a.f28233c.f28299P = multiPlusFeedRoomListProvider.f22651h;
                                a.f28233c.f28300Q = multiPlusFeedRoomListProvider.f22652i;
                                a.f28233c.f28284A = multiPlusFeedRoomListProvider.f22656m;
                                a.f28233c.f28306W = "full_screen";
                            }
                            multiPlusFeedRoomListProvider.f22654k.add(room2);
                            multiPlusFeedRoomListProvider.f22655l.add(a);
                        }
                    }
                }
                multiPlusFeedRoomListProvider.mo15375a(list);
            }
            multiPlusFeedRoomListProvider.mo18715f();
        }
    }
}
