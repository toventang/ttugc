package com.bytedance.android.livesdk.liveroom;

import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.liveroom.a */
public final /* synthetic */ class C9315a implements AbstractC1214u {

    /* renamed from: a */
    private final RoomStatusController f22751a;

    static {
        Covode.recordClassIndex(10249);
    }

    C9315a(RoomStatusController roomStatusController) {
        this.f22751a = roomStatusController;
    }

    @Override // androidx.lifecycle.AbstractC1214u
    public final void onChanged(Object obj) {
        this.f22751a.bridge$lambda$0$RoomStatusController((Map) obj);
    }
}
