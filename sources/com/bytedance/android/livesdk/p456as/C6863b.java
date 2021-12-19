package com.bytedance.android.livesdk.p456as;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.as.b */
public final class C6863b implements AbstractC6864c {
    static {
        Covode.recordClassIndex(7601);
    }

    @Override // com.bytedance.android.livesdk.p456as.AbstractC6864c
    /* renamed from: a */
    public final CharSequence mo13135a(Room room, User user) {
        if (user == null) {
            return "";
        }
        if (room == null) {
            return user.getNickName();
        }
        if (room.getOwnerUserId() == user.getId()) {
            return user.getDisplayId();
        }
        if (room.getNameMode() == 1) {
            return user.getNickName();
        }
        return user.getDisplayId();
    }
}
