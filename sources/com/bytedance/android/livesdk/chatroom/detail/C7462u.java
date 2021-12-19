package com.bytedance.android.livesdk.chatroom.detail;

import com.bytedance.android.live.p250i.p251a.AbstractC4356c;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.chatroom.detail.u */
public final class C7462u implements AbstractC4356c {

    /* renamed from: a */
    private AbstractC4356c f18547a;

    /* renamed from: b */
    private RoomPlayer2 f18548b;

    static {
        Covode.recordClassIndex(8232);
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4356c
    /* renamed from: a */
    public final void mo10106a(String str) {
        this.f18547a.mo10106a(str);
    }

    public C7462u(AbstractC4356c cVar, RoomPlayer2 roomPlayer2) {
        this.f18547a = cVar;
        this.f18548b = roomPlayer2;
    }

    @Override // com.bytedance.android.live.p250i.p251a.AbstractC4356c
    /* renamed from: a */
    public final void mo10107a(JSONObject jSONObject, String str) {
        this.f18548b.onPlayerLog(jSONObject);
        this.f18547a.mo10107a(jSONObject, str);
    }
}
