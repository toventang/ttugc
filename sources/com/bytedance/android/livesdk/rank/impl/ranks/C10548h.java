package com.bytedance.android.livesdk.rank.impl.ranks;

import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.h */
public final /* synthetic */ class C10548h implements AbstractC88433f {

    /* renamed from: a */
    private final C10546f f25367a;

    /* renamed from: b */
    private final Room f25368b;

    static {
        Covode.recordClassIndex(12123);
    }

    C10548h(C10546f fVar, Room room) {
        this.f25367a = fVar;
        this.f25368b = room;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        String th;
        C10546f fVar = this.f25367a;
        Room room = this.f25368b;
        Throwable th2 = (Throwable) obj;
        fVar.f25356b = false;
        String str = "";
        if (th2 == null) {
            th = str;
        } else {
            th = th2.toString();
        }
        fVar.mo17373a(-1, (String) null, (String) null, th);
        fVar.mo17377c();
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "room_id", room.getId());
        C3866a.m9474a(jSONObject, "user_id", C11115u.m19743a().mo17915b().mo13161c());
        C3866a.m9475a(jSONObject, "error_code", "1");
        if (th2 != null) {
            str = th2.toString();
        }
        C3866a.m9475a(jSONObject, "error_msg", str);
        C3868c.m9492a("ttlive_hourly_rank_entrance", 1, jSONObject);
    }
}
