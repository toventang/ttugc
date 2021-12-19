package com.bytedance.android.livesdk.rank.impl.p613f;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.rank.impl.api.model.Rank;
import com.bytedance.android.livesdk.rank.impl.view.StarHostView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.rank.impl.f.b */
public final class C10413b {
    static {
        Covode.recordClassIndex(11987);
    }

    /* renamed from: a */
    public static final StarHostView.C10572b m18928a(Rank rank, int i, boolean z) {
        User user;
        int i2;
        boolean z2;
        if (rank != null) {
            user = rank.getUser();
        } else {
            user = null;
        }
        if (rank != null) {
            i2 = rank.getComboCount();
            if (rank != null && rank.getRoomId() > 0) {
                z2 = true;
            }
            z2 = false;
        } else {
            i2 = 1;
            z2 = false;
        }
        return new StarHostView.C10572b(user, i, i2, z2, z);
    }
}
