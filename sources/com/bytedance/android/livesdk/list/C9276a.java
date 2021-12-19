package com.bytedance.android.livesdk.list;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p691g.C11760a;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.list.a */
public final /* synthetic */ class C9276a implements AbstractC88433f {

    /* renamed from: a */
    private final MultiPlusFeedRoomListProvider f22673a;

    /* renamed from: b */
    private final int f22674b;

    /* renamed from: c */
    private final long[] f22675c;

    static {
        Covode.recordClassIndex(10194);
    }

    C9276a(MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider, int i, long[] jArr) {
        this.f22673a = multiPlusFeedRoomListProvider;
        this.f22674b = i;
        this.f22675c = jArr;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        MultiPlusFeedRoomListProvider multiPlusFeedRoomListProvider = this.f22673a;
        int i = this.f22674b;
        long[] jArr = this.f22675c;
        C5832d dVar = (C5832d) obj;
        if (!(dVar == null || dVar.data == null)) {
            Map map = (Map) dVar.data;
            String str = multiPlusFeedRoomListProvider.f22646c.f28232b.f28257a;
            String str2 = multiPlusFeedRoomListProvider.f22646c.f28232b.f28263g;
            for (int i2 = i; i2 < jArr.length + i; i2++) {
                long j = multiPlusFeedRoomListProvider.f22658o[i2];
                if (map.containsKey(Long.toString(j))) {
                    multiPlusFeedRoomListProvider.f22657n.add(Long.valueOf(j));
                    Room room = (Room) map.get(Long.toString(j));
                    room.setLog_pb(str2);
                    room.setRequestId(str);
                    multiPlusFeedRoomListProvider.f22644a.set(i2, room);
                    multiPlusFeedRoomListProvider.f22645b.set(i2, C11760a.m20718a(room, false));
                } else {
                    multiPlusFeedRoomListProvider.f22644a.set(i2, null);
                }
            }
            multiPlusFeedRoomListProvider.f22648e = false;
        }
    }
}
