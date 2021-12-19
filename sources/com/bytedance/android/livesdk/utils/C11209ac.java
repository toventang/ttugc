package com.bytedance.android.livesdk.utils;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.C9542az;
import com.bytedance.android.livesdk.p561j.C9101dm;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.utils.ac */
public final class C11209ac {

    /* renamed from: a */
    public static final C11209ac f26850a = new C11209ac();

    private C11209ac() {
    }

    static {
        Covode.recordClassIndex(12837);
    }

    /* renamed from: a */
    public static final String m19866a(Room room, DataChannel dataChannel) {
        User user;
        Long l;
        C9542az userAttr;
        Long l2 = null;
        if (dataChannel != null) {
            user = (User) dataChannel.mo28318b(C9101dm.class);
            if (user != null) {
                l = Long.valueOf(user.getId());
            }
            l = null;
        } else {
            user = null;
            l = null;
        }
        if (room != null) {
            l2 = Long.valueOf(room.getOwnerUserId());
        }
        if (C89219l.m154714a(l, l2)) {
            return "anchor";
        }
        if (user == null || (userAttr = user.getUserAttr()) == null || !userAttr.f23192b) {
            return "viewer";
        }
        return "admin";
    }
}
