package com.bytedance.android.livesdk.chatroom.end.newaudienceend;

import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.end.newaudienceend.j */
public final /* synthetic */ class C7543j implements AbstractC88433f {

    /* renamed from: a */
    private final Map f18753a;

    /* renamed from: b */
    private final DataChannel f18754b;

    static {
        Covode.recordClassIndex(8316);
    }

    C7543j(Map map, DataChannel dataChannel) {
        this.f18753a = map;
        this.f18754b = dataChannel;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        Map<String, String> map = this.f18753a;
        DataChannel dataChannel = this.f18754b;
        map.putAll((Map) obj);
        C6501b.C6502a.m13948a("livesdk_live_show").mo12643a(dataChannel).mo12652a(map).mo12655b();
    }
}
