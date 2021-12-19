package com.bytedance.android.livesdk.p457at;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import com.bytedance.android.livesdk.live.data.RoomStatsViewModel;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.at.a */
public final class C6883a implements C1175ad.AbstractC1177b {
    static {
        Covode.recordClassIndex(7621);
    }

    @Override // androidx.lifecycle.C1175ad.AbstractC1177b
    /* renamed from: a */
    public final <T extends AbstractC1174ac> T mo3261a(Class<T> cls) {
        if (cls.isAssignableFrom(RoomStatsViewModel.class)) {
            return new RoomStatsViewModel();
        }
        throw new IllegalArgumentException("Unknown ViewModel class");
    }
}
