package com.bytedance.android.livesdk.p656w;

import android.text.TextUtils;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.model.message.C9601ae;
import com.bytedance.android.livesdk.model.message.C9691bw;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.rank.api.AbstractC10339d;
import com.bytedance.android.livesdk.rank.api.EnumC10345i;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.p2082ss.ugc.live.sdk.message.data.IMessage;
import com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor;

/* renamed from: com.bytedance.android.livesdk.w.d */
public final class C11304d implements IInterceptor {
    static {
        Covode.recordClassIndex(12941);
    }

    @Override // com.p2082ss.ugc.live.sdk.message.interfaces.IInterceptor
    public final boolean onMessage(IMessage iMessage) {
        if ((iMessage instanceof C9691bw) && TextUtils.equals(((C9691bw) iMessage).f23606k, "hourly_rank")) {
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            if (room == null || !((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).isRankEnabledInTheRoom(EnumC10345i.HOURLY_RANK.getType(), room.getId())) {
                return true;
            }
            return false;
        } else if (!(iMessage instanceof C9601ae)) {
            return false;
        } else {
            if (!((AbstractC10339d) C6193a.m13435a(AbstractC10339d.class)).isRankEnabled(EnumC10345i.HOURLY_RANK.getType()) || ((AbstractC4367a) C6193a.m13435a(AbstractC4367a.class)).isMicRoomForCurrentRoom()) {
                return true;
            }
            return false;
        }
    }
}
