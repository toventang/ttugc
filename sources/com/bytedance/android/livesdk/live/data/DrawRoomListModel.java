package com.bytedance.android.livesdk.live.data;

import android.util.Pair;
import com.bytedance.android.live.base.model.p181c.C2965a;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.detail.RoomApi;
import com.bytedance.android.livesdk.model.AbstractC9519af;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;

public final class DrawRoomListModel {
    static {
        Covode.recordClassIndex(10215);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.live.data.DrawRoomListModel$a */
    public static final class C9295a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C9295a f22728a = new C9295a();

        static {
            Covode.recordClassIndex(10216);
        }

        C9295a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C5827a aVar = (C5827a) obj;
            C89219l.m154721d(aVar, "");
            ArrayList arrayList = new ArrayList();
            List<T> list = aVar.f14684b;
            if (list != null) {
                arrayList.addAll(list);
            }
            return Pair.create(arrayList, aVar.f14685c);
        }
    }

    private final String getObjectsStr(List<? extends Object> list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i).toString());
            if (i < list.size() - 1) {
                sb.append(",");
            }
        }
        String sb2 = sb.toString();
        C89219l.m154716b(sb2, "");
        return sb2;
    }

    public final void handleRoomParams(FeedItem feedItem) {
        if ((feedItem.type == 1 || feedItem.type == 2) && (feedItem.item instanceof Room)) {
            AbstractC9519af afVar = feedItem.item;
            Objects.requireNonNull(afVar, "null cannot be cast to non-null type com.bytedance.android.livesdkapi.depend.model.live.Room");
            Room room = (Room) afVar;
            room.setLog_pb(feedItem.logPb);
            User owner = room.getOwner();
            if (owner != null) {
                owner.setLogPb(feedItem.logPb);
            }
            room.setRequestId(feedItem.resId);
            room.isFromRecommendCard = feedItem.isRecommendCard;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.livesdk.live.data.DrawRoomListModel$b */
    public static final class C9296b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DrawRoomListModel f22729a;

        static {
            Covode.recordClassIndex(10217);
        }

        C9296b(DrawRoomListModel drawRoomListModel) {
            this.f22729a = drawRoomListModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Pair pair = (Pair) obj;
            if (!(pair == null || pair.first == null || ((List) pair.first).isEmpty() || pair.second == null)) {
                Object obj2 = pair.second;
                C89219l.m154716b(obj2, "");
                C28022o a = ((C2965a) obj2).mo7786a();
                if (a != null) {
                    Object obj3 = pair.first;
                    C89219l.m154716b(obj3, "");
                    for (T t : (Iterable) obj3) {
                        t.logPb = a.toString();
                        this.f22729a.handleRoomParams(t);
                    }
                }
            }
        }
    }

    public final AbstractC88979t<C5832d<Object>> collectUnreadRequest(long j, long j2, String str, List<Long> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        return ((RoomApi) C5805e.m12718a().mo11572a(RoomApi.class)).collectUnreadRequest(j, j2, str, getObjectsStr(list));
    }

    public final AbstractC88979t<Pair<List<FeedItem>, C2965a>> getRoomList(long j, String str, String str2, long j2, long j3, String str3) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        AbstractC88979t<R> b = ((FeedApi) C5805e.m12718a().mo11572a(FeedApi.class)).feed(str3, j, str, str2, 1, j2, j3).mo143292d(C9295a.f22728a).mo143280b(new C9296b(this));
        C89219l.m154716b(b, "");
        return b;
    }
}
