package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.p1610b.AbstractC22000h;
import com.bytedance.retrofit2.p1610b.AbstractC22018z;
import p4560f.p4561a.AbstractC88979t;

public interface PortalApi {
    static {
        Covode.recordClassIndex(8046);
    }

    @AbstractC22000h(mo35789a = "/webcast/gift/portal/ping/")
    AbstractC88979t<C5832d<Object>> ping(@AbstractC22018z(mo35807a = "room_id") long j, @AbstractC22018z(mo35807a = "portal_id") long j2, @AbstractC22018z(mo35807a = "ping_type") EnumC7288a aVar);

    @AbstractC22000h(mo35789a = "/webcast/gift/portal/user_portals/")
    AbstractC88979t<C5832d<Object>> stats(@AbstractC22018z(mo35807a = "room_id") long j);

    /* renamed from: com.bytedance.android.livesdk.chatroom.api.PortalApi$a */
    public enum EnumC7288a {
        WAIT_REWARD(0),
        RECEIVE_INVITATION(1),
        CLICK_INVITATION(2),
        JUMP_TO_ROOM(3);
        

        /* renamed from: a */
        private int f18122a;

        public final String toString() {
            return String.valueOf(this.f18122a);
        }

        static {
            Covode.recordClassIndex(8047);
        }

        private EnumC7288a(int i) {
            this.f18122a = i;
        }
    }
}
