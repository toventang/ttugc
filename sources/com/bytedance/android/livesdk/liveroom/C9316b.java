package com.bytedance.android.livesdk.liveroom;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88438k;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.liveroom.b */
public final /* synthetic */ class C9316b implements AbstractC88438k {

    /* renamed from: a */
    private final Map f22752a;

    static {
        Covode.recordClassIndex(10250);
    }

    C9316b(Map map) {
        this.f22752a = map;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88438k
    /* renamed from: a */
    public final boolean mo7718a(Object obj) {
        return RoomStatusController.lambda$refreshRoomStats$0$RoomStatusController(this.f22752a, (Room) obj);
    }
}
