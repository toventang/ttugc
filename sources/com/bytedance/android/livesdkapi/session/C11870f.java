package com.bytedance.android.livesdkapi.session;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdkapi.session.f */
public final class C11870f {

    /* renamed from: a */
    public String f28402a;

    /* renamed from: b */
    private Map<String, AbstractC11867c> f28403b = new ConcurrentHashMap(10);

    static {
        Covode.recordClassIndex(13588);
    }

    /* renamed from: com.bytedance.android.livesdkapi.session.f$a */
    public static class C11871a {

        /* renamed from: a */
        public static C11870f f28404a = new C11870f();

        static {
            Covode.recordClassIndex(13589);
        }
    }

    /* renamed from: a */
    public final EnterRoomLinkSession mo19010a() {
        if (C13627m.m24498a(this.f28402a)) {
            JSONObject jSONObject = new JSONObject();
            EnterRoomLinkSession.m20944a(jSONObject, "error_msg", Log.getStackTraceString(new Throwable("")));
            C11868d.m20958a("live_enter_room_session_null_error", new JSONObject(), null, jSONObject);
            mo19012a(new EnterRoomLinkSession(new EnterRoomConfig()).mo18994a(new Event("session_is_null", 4353, EnumC11866b.BussinessApiCall)));
        }
        return (EnterRoomLinkSession) this.f28403b.get(this.f28402a);
    }

    /* renamed from: a */
    public final void mo19011a(Bundle bundle) {
        if (bundle != null) {
            this.f28402a = bundle.getString("enter_room_session_id");
            EnterRoomLinkSession enterRoomLinkSession = (EnterRoomLinkSession) bundle.getParcelable("enter_room_session");
            if (enterRoomLinkSession != null) {
                this.f28403b.put(enterRoomLinkSession.mo18995a(), enterRoomLinkSession);
            }
        }
    }

    /* renamed from: a */
    public final void mo19012a(EnterRoomLinkSession enterRoomLinkSession) {
        if (!TextUtils.isEmpty(this.f28402a) && TextUtils.equals(enterRoomLinkSession.f28390a, this.f28402a)) {
            this.f28403b.remove(this.f28402a);
        }
        String str = enterRoomLinkSession.f28390a;
        this.f28402a = str;
        this.f28403b.put(str, enterRoomLinkSession);
    }
}
