package com.bytedance.android.livesdkapi;

import com.bytedance.android.live.network.model.AbstractC5821c;
import com.bytedance.android.livesdk.livesetting.other.NetMonitorBlockListSettings;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.h */
public final /* synthetic */ class C11776h implements AbstractC5821c {

    /* renamed from: a */
    public static final AbstractC5821c f28130a = new C11776h();

    static {
        Covode.recordClassIndex(13466);
    }

    private C11776h() {
    }

    @Override // com.bytedance.android.live.network.model.AbstractC5821c
    /* renamed from: a */
    public final List mo11596a() {
        return Arrays.asList(NetMonitorBlockListSettings.INSTANCE.getValue());
    }
}
