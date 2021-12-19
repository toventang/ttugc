package com.bytedance.android.livesdk.live.data;

import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.livesdk.live.model.C9304c;
import com.bytedance.common.utility.C13617h;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.live.data.a */
public final /* synthetic */ class C9297a implements AbstractC88433f {

    /* renamed from: a */
    private final RoomStatsViewModel f22731a;

    static {
        Covode.recordClassIndex(10219);
    }

    C9297a(RoomStatsViewModel roomStatsViewModel) {
        this.f22731a = roomStatsViewModel;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        RoomStatsViewModel roomStatsViewModel = this.f22731a;
        C5831c cVar = (C5831c) obj;
        if (!C13617h.m24465a(cVar.f14684b)) {
            HashMap hashMap = new HashMap();
            for (C9304c cVar2 : cVar.f14684b) {
                hashMap.put(String.valueOf(cVar2.f22741a), cVar2);
            }
            roomStatsViewModel.f22730a.setValue(hashMap);
        }
    }
}
