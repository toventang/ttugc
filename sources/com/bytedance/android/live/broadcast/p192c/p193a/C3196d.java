package com.bytedance.android.live.broadcast.p192c.p193a;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.p425aa.p426a.C6499a;
import com.bytedance.android.livesdk.p425aa.p426a.EnumC6500b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.live.broadcast.c.a.d */
public final class C3196d extends C3197e {
    static {
        Covode.recordClassIndex(3677);
    }

    @Override // com.bytedance.android.live.broadcast.p192c.p193a.C3197e
    /* renamed from: a */
    public final void mo8548a() {
        C3868c.m9490a("ttlive_load_sticker_list_all", 0, mo8552c(), new JSONObject());
    }

    @Override // com.bytedance.android.live.broadcast.p192c.p193a.C3197e
    /* renamed from: b */
    public final void mo8550b() {
        C3868c.m9490a("ttlive_download_sticker_all", 0, mo8553d(), new JSONObject());
    }

    @Override // com.bytedance.android.live.broadcast.p192c.p193a.C3197e
    /* renamed from: a */
    public final void mo8549a(int i, String str) {
        mo8552c();
        JSONObject jSONObject = new JSONObject();
        m9474a(jSONObject, "error_code", (long) i);
        m9475a(jSONObject, "error_msg", str);
        C3868c.m9497b("ttlive_load_sticker_list_all", 1, jSONObject);
        C3868c.m9492a("ttlive_load_sticker_list_error", 1, jSONObject);
        C6499a.m13906a();
        C6499a.m13911a(EnumC6500b.Room.info, "ttlive_load_sticker_list", 1, jSONObject);
    }

    @Override // com.bytedance.android.live.broadcast.p192c.p193a.C3197e
    /* renamed from: b */
    public final void mo8551b(int i, String str) {
        mo8553d();
        JSONObject jSONObject = new JSONObject();
        m9474a(jSONObject, "error_code", (long) i);
        m9475a(jSONObject, "error_msg", str);
        C3868c.m9497b("ttlive_download_sticker_all", 1, jSONObject);
        C3868c.m9492a("ttlive_download_sticker_error", 1, jSONObject);
        C6499a.m13906a();
        C6499a.m13911a(EnumC6500b.Room.info, "ttlive_download_sticker", 1, jSONObject);
    }
}
