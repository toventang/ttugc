package com.bytedance.android.live.liveinteract.match.p304c;

import com.bytedance.android.live.base.model.user.AbstractC2994b;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4948b;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5708d;
import com.bytedance.android.livesdk.model.message.C9613am;
import com.bytedance.android.livesdk.model.message.C9614an;
import com.bytedance.android.livesdk.model.message.p578b.C9642h;
import com.bytedance.android.livesdk.model.message.p578b.C9645j;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.p692h.C11778b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.match.c.a */
public final class C5009a extends C5708d {

    /* renamed from: a */
    public static long f13030a = System.currentTimeMillis();

    /* renamed from: b */
    public static long f13031b = System.currentTimeMillis();

    /* renamed from: c */
    public static long f13032c = System.currentTimeMillis();

    /* renamed from: d */
    public static long f13033d = System.currentTimeMillis();

    /* renamed from: e */
    public static long f13034e = System.currentTimeMillis();

    /* renamed from: f */
    public static long f13035f = System.currentTimeMillis();

    /* renamed from: g */
    public static final C5009a f13036g = new C5009a();

    /* renamed from: i */
    private static final String f13037i = "ttlive_client_anchor_match_icon_monitor";

    /* renamed from: j */
    private static long f13038j = System.currentTimeMillis();

    /* renamed from: k */
    private static long f13039k = System.currentTimeMillis();

    private C5009a() {
    }

    /* renamed from: a */
    public static final void m11211a(Map<Long, C9642h> map, C9613am amVar, boolean z) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(amVar, "");
        Map<Long, C9645j> map2 = amVar.f23351f;
        long j = C4384b.C4385a.m10496a().f11958f;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room == null) {
            C3854a.m9459b("battle monitor monitorScoreJump  room is null");
            return;
        }
        long ownerUserId = room.getOwnerUserId();
        C9642h hVar = map.get(Long.valueOf(j));
        long j2 = 0;
        long j3 = hVar != null ? hVar.f23492c : 0;
        C9645j jVar = map2.get(Long.valueOf(j));
        if (j3 >= (jVar != null ? (long) jVar.f23499a : 0)) {
            C9642h hVar2 = map.get(Long.valueOf(ownerUserId));
            long j4 = hVar2 != null ? hVar2.f23492c : 0;
            C9645j jVar2 = map2.get(Long.valueOf(ownerUserId));
            if (j4 >= (jVar2 != null ? (long) jVar2.f23499a : 0)) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        C11778b bVar = amVar.f28134O;
        C3866a.m9474a(jSONObject, "msg_id", bVar.f28138d);
        C3866a.m9474a(jSONObject, "create_time", bVar.f28135a);
        C3866a.m9475a(jSONObject, "source", "finish");
        C9645j jVar3 = map2.get(Long.valueOf(j));
        C3866a.m9474a(jSONObject, "current_score_other", jVar3 != null ? (long) jVar3.f23499a : 0);
        C9642h hVar3 = map.get(Long.valueOf(j));
        C3866a.m9474a(jSONObject, "new_score_other", hVar3 != null ? hVar3.f23492c : 0);
        C9642h hVar4 = map.get(Long.valueOf(ownerUserId));
        C3866a.m9474a(jSONObject, "new_score", hVar4 != null ? hVar4.f23492c : 0);
        C9645j jVar4 = map2.get(Long.valueOf(ownerUserId));
        if (jVar4 != null) {
            j2 = (long) jVar4.f23499a;
        }
        C3866a.m9474a(jSONObject, "current_score", j2);
        if (z) {
            m11209a("pk_finish_score_jump", jSONObject);
        } else {
            m11219b("pk_finish_score_jump", jSONObject);
        }
    }

    /* renamed from: a */
    public static final void m11217a(boolean z, String str, Map<String, ? extends Object> map) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                m12487a(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        C3866a.m9475a(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        C3866a.m9475a(jSONObject, "scene", str);
        m11205a(f13036g, "reject_request", jSONObject, z, 8);
        f13038j = System.currentTimeMillis();
    }

    /* renamed from: a */
    public static final void m11216a(boolean z, String str, Throwable th, Map<String, ? extends Object> map) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                m12487a(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        m12488a(jSONObject, th);
        C3866a.m9475a(jSONObject, "scene", str);
        C3866a.m9475a(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - f13038j);
        m11210a("reject_failed", jSONObject, z, 1);
    }

    /* renamed from: a */
    public static final void m11215a(boolean z, C9614an anVar) {
        C89219l.m154721d(anVar, "");
        JSONObject jSONObject = new JSONObject();
        m12486a(jSONObject, anVar);
        if (z) {
            long j = 0;
            if (C4947a.f12909a.f12925n > 0) {
                j = System.currentTimeMillis() - C4947a.f12909a.f12925n;
            }
            C3866a.m9474a(jSONObject, "cost", j);
            m11205a(f13036g, "open_message", jSONObject, false, 12);
            return;
        }
        f13036g.mo10708a("open_message", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m11214a(boolean z, long j) {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "count", j);
        if (z) {
            m11205a(f13036g, "battle_start", jSONObject, false, 12);
        } else {
            f13036g.mo10708a("battle_start", jSONObject, 0);
        }
    }

    /* renamed from: a */
    public final void mo10708a(String str, JSONObject jSONObject, int i) {
        m11221d(jSONObject);
        C3866a.m9475a(jSONObject, "event_id", str);
        C3868c.m9492a("ttlive_client_audience_battle_monitor", i, jSONObject);
    }

    /* renamed from: a */
    private static void m11213a(JSONObject jSONObject, C4948b bVar) {
        String str;
        long j;
        String str2;
        C4384b a = C4384b.C4385a.m10496a();
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        AbstractC2994b a2 = b != null ? b.mo13147a() : null;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            str = room.getIdStr();
        } else {
            str = "0";
        }
        C3866a.m9475a(jSONObject, "room_id", str);
        if (!jSONObject.has("channel_id")) {
            C3866a.m9474a(jSONObject, "channel_id", a.f11957e);
        }
        if (!jSONObject.has("battle_id")) {
            C3866a.m9474a(jSONObject, "battle_id", bVar.mo10677b());
        }
        long id = a2 != null ? a2.getId() : 0;
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        C3866a.m9474a(jSONObject, "current_user_id", id);
        C3866a.m9474a(jSONObject, "current_anchor_id", j);
        if (!jSONObject.has("guest_anchor_id")) {
            C3866a.m9474a(jSONObject, "guest_anchor_id", a.f11958f);
        }
        if (!jSONObject.has("role_type")) {
            if (id <= 0 || j <= 0 || id != j) {
                str2 = "audience";
            } else {
                str2 = bVar.f12914c ? "inviter" : "invitee";
            }
            C3866a.m9475a(jSONObject, "role_type", str2);
        }
        if (!jSONObject.has("battle_time")) {
            C3866a.m9474a(jSONObject, "battle_time", bVar.f12919h);
        }
        if (!jSONObject.has("punish_time")) {
            C3866a.m9474a(jSONObject, "punish_time", bVar.f12920i);
        }
        m12492c(jSONObject);
    }

    /* renamed from: b */
    public static final void m11218b() {
        m11210a("rematch_click", new JSONObject(), false, 1);
    }

    /* renamed from: a */
    public static final void m11203a() {
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "event_id", "battle_icon_show");
        C3866a.m9474a(jSONObject, "channel_id", C4384b.C4385a.m10496a().f11957e);
        m12482a((Throwable) null, jSONObject);
        m11212a(jSONObject);
    }

    static {
        Covode.recordClassIndex(5592);
    }

    /* renamed from: a */
    public static final void m11212a(JSONObject jSONObject) {
        C3868c.m9492a(f13037i, 0, jSONObject);
    }

    /* renamed from: d */
    private static /* synthetic */ void m11221d(JSONObject jSONObject) {
        m11213a(jSONObject, C4947a.f12909a);
    }

    /* renamed from: a */
    public static final void m11206a(String str) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "scene", str);
        f13036g.mo10708a("battle_info_request", jSONObject, 0);
        f13039k = System.currentTimeMillis();
    }

    /* renamed from: b */
    public static final void m11219b(String str, JSONObject jSONObject) {
        m11221d(jSONObject);
        C3866a.m9475a(jSONObject, "event_id", str);
        C3868c.m9492a("ttlive_client_battle_audience_score_monitor", 0, jSONObject);
    }

    /* renamed from: a */
    public static final void m11204a(int i, String str) {
        C89219l.m154721d(str, "");
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "selection", str);
        m11205a(f13036g, "reply_click", jSONObject, z, 8);
    }

    /* renamed from: a */
    public static final void m11207a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        JSONObject jSONObject = new JSONObject();
        C3866a.m9475a(jSONObject, "response", str2);
        C3866a.m9475a(jSONObject, "scene", str);
        C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - f13039k);
        f13036g.mo10708a("battle_info_succeed", jSONObject, 0);
    }

    /* renamed from: a */
    public static final void m11208a(String str, Throwable th) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        m12488a(jSONObject, th);
        C3866a.m9475a(jSONObject, "scene", str);
        C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - f13039k);
        f13036g.mo10708a("battle_info_failed", jSONObject, 1);
    }

    /* renamed from: a */
    public static final void m11209a(String str, JSONObject jSONObject) {
        m11221d(jSONObject);
        C3866a.m9475a(jSONObject, "event_id", str);
        C3868c.m9492a("ttlive_client_battle_anchor_score_monitor", 0, jSONObject);
    }

    /* renamed from: b */
    public static final void m11220b(boolean z, String str, Map<String, ? extends Object> map) {
        C89219l.m154721d(str, "");
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                m12487a(jSONObject, entry.getKey(), entry.getValue());
            }
        }
        C3866a.m9475a(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        C3866a.m9475a(jSONObject, "scene", str);
        C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - f13038j);
        m11205a(f13036g, "reject_succeed", jSONObject, z, 8);
    }

    /* renamed from: a */
    public static void m11210a(String str, JSONObject jSONObject, boolean z, int i) {
        C4948b bVar;
        if (z) {
            bVar = C4947a.f12910b;
        } else {
            bVar = C4947a.f12909a;
        }
        if (!jSONObject.has("invite_type")) {
            C3866a.m9475a(jSONObject, "invite_type", String.valueOf(z ? 1 : 0));
        }
        m11213a(jSONObject, bVar);
        C3866a.m9475a(jSONObject, "event_id", str);
        C3868c.m9492a("ttlive_client_anchor_battle_monitor", i, jSONObject);
    }

    /* renamed from: a */
    public static /* synthetic */ void m11205a(C5009a aVar, String str, JSONObject jSONObject, boolean z, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        m11210a(str, jSONObject, z, 0);
    }
}
