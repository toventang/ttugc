package com.bytedance.android.livesdk;

import com.bytedance.android.livesdkapi.p702ws.AbstractC11887d;
import com.bytedance.android.livesdkapi.p702ws.EnumC11885b;
import com.bytedance.android.livesdkapi.p702ws.LiveWsMessage;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.f */
public final class C8463f implements AbstractC11887d {

    /* renamed from: a */
    public AbstractC11887d f20919a;

    static {
        Covode.recordClassIndex(9311);
    }

    @Override // com.bytedance.android.livesdkapi.p702ws.AbstractC11887d
    /* renamed from: a */
    public final void mo14461a(LiveWsMessage liveWsMessage) {
        AbstractC11887d dVar = this.f20919a;
        if (dVar != null) {
            dVar.mo14461a(liveWsMessage);
        }
    }

    @Override // com.bytedance.android.livesdkapi.p702ws.AbstractC11887d
    /* renamed from: a */
    public final void mo14462a(EnumC11885b bVar, JSONObject jSONObject) {
        AbstractC11887d dVar = this.f20919a;
        if (dVar != null) {
            dVar.mo14462a(bVar, jSONObject);
        }
    }
}
