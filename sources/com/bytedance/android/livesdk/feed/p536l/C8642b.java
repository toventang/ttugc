package com.bytedance.android.livesdk.feed.p536l;

import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.AbstractC9519af;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.feed.l.b */
public final class C8642b {

    /* renamed from: a */
    public static final C8642b f21362a = new C8642b();

    private C8642b() {
    }

    static {
        Covode.recordClassIndex(9499);
    }

    /* renamed from: a */
    public static void m16905a(C8641a aVar) {
        List<FeedItem> list;
        C89219l.m154721d(aVar, "");
        if (!(C13617h.m24465a(aVar.f21360a) || aVar.f21361b == null || (list = aVar.f21360a) == null)) {
            for (T t : list) {
                C2965a aVar2 = aVar.f21361b;
                C28022o oVar = null;
                if (!(aVar2 == null || aVar2.mo7786a() == null)) {
                    C2965a aVar3 = aVar.f21361b;
                    if (aVar3 != null) {
                        oVar = aVar3.mo7786a();
                    }
                    t.logPb = String.valueOf(oVar);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m16906a(FeedItem feedItem) {
        if (feedItem == null) {
            return;
        }
        if ((feedItem.type == 1 || feedItem.type == 2) && (feedItem.item instanceof Room)) {
            AbstractC9519af afVar = feedItem.item;
            Objects.requireNonNull(afVar, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
            Room room = (Room) afVar;
            room.setLog_pb(feedItem.logPb);
            if (room.getOwner() != null) {
                User owner = room.getOwner();
                C89219l.m154716b(owner, "");
                owner.setLogPb(feedItem.logPb);
            }
            room.setRequestId(feedItem.resId);
        }
    }

    /* renamed from: a */
    public static void m16907a(List<? extends FeedItem> list) {
        C89219l.m154721d(list, "");
        if (!C13617h.m24465a(list)) {
            for (FeedItem feedItem : list) {
                if (feedItem.item == null) {
                    try {
                        feedItem.item = feedItem.getRoom();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
