package com.bytedance.android.live.liveinteract.platform.common.p376g;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.p180b.C2963a;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p260a.C4386c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.livesdk.livesetting.linkmic.GuestCountDownTimeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.GuestPushStreamTimeAndroidSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveGuestLinkPreInitEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkListOptiEnableSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.CoHostNeedWaitRtcJoinChannelSucceed;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LinkServerAutoJoinChannel;
import com.bytedance.android.livesdk.model.message.C9606aj;
import com.bytedance.android.livesdk.model.message.C9614an;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdk.p458b.p459a.C6898g;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11225an;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.ttnet.TTNetInit;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.d */
public class C5708d extends C3866a {

    /* renamed from: h */
    public static final C5709a f14472h = new C5709a((byte) 0);

    static {
        Covode.recordClassIndex(6306);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.d$a */
    public static final class C5709a {
        static {
            Covode.recordClassIndex(6307);
        }

        private C5709a() {
        }

        public /* synthetic */ C5709a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    protected static void m12489a(boolean z, JSONObject jSONObject) {
        Object value;
        C89219l.m154721d(jSONObject, "");
        for (Map.Entry<String, Object> entry : m12490b(z).entrySet()) {
            if (!jSONObject.has(entry.getKey()) && (value = entry.getValue()) != null) {
                m12487a(jSONObject, entry.getKey(), value);
            }
        }
        m12492c(jSONObject);
    }

    /* renamed from: a */
    public static void m12488a(JSONObject jSONObject, Throwable th) {
        int i;
        C89219l.m154721d(jSONObject, "");
        String th2 = th != null ? th.toString() : null;
        if (th instanceof C2912a) {
            C2912a aVar = (C2912a) th;
            i = aVar.getErrorCode();
            th2 = aVar.getErrorMsg();
        } else if (th instanceof C2963a) {
            i = ((C2963a) th).statusCode;
            th2 = th.getMessage();
        } else {
            i = 100001;
        }
        C3866a.m9474a(jSONObject, "error_msg", (long) i);
        C3866a.m9475a(jSONObject, "error_detail", th2);
        if (th != null) {
            C3866a.m9475a(jSONObject, "error_class", th.getClass().getName());
        }
    }

    /* renamed from: d */
    public static HashMap<String, Object> m12493d() {
        String str;
        String str2;
        long j;
        String str3;
        HashMap<String, Object> hashMap = new HashMap<>();
        C4384b a = C4384b.C4385a.m10496a();
        hashMap.put("channel_id", Long.valueOf(a.f11957e));
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        String str4 = "0";
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            str = room.getIdStr();
        } else {
            str = str4;
        }
        hashMap.put("room_id", str);
        hashMap.put("vendor", String.valueOf(a.mo10153d().getValue()));
        if (a.f11969q) {
            str2 = "inviter";
        } else {
            str2 = "invitee";
        }
        hashMap.put("role_type", str2);
        long j2 = 0;
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        hashMap.put("user_id", Long.valueOf(j));
        hashMap.put("guest_user_id", Long.valueOf(a.f11958f));
        hashMap.put("link_mic_id", a.f11922L);
        if (a.f11975w) {
            j2 = 1;
        }
        hashMap.put("rtc_join_channel_advance", Long.valueOf(j2));
        hashMap.put("server_auto_joinchannel", Boolean.valueOf(LinkServerAutoJoinChannel.INSTANCE.getValue()));
        EnumC4440k b = a.mo10151b();
        if (b != null) {
            str3 = b.name();
        } else {
            str3 = null;
        }
        hashMap.put("link_state", str3);
        hashMap.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        hashMap.put("network_type", Long.valueOf((long) TTNetInit.getEffectiveConnectionType()));
        if (hashMap.get("invitee_list") == null) {
            hashMap.put("invitee_list", C5737w.m12598a(C4384b.C4385a.m10496a().f11968p));
        }
        if (CoHostNeedWaitRtcJoinChannelSucceed.INSTANCE.getValue()) {
            str4 = "1";
        }
        hashMap.put("need_wait_rtc_joinchannel_succeed", str4);
        return hashMap;
    }

    /* renamed from: b */
    public static void m12491b(JSONObject jSONObject) {
        Object value;
        C89219l.m154721d(jSONObject, "");
        for (Map.Entry<String, Object> entry : m12493d().entrySet()) {
            if (!jSONObject.has(entry.getKey()) && (value = entry.getValue()) != null) {
                m12487a(jSONObject, entry.getKey(), value);
            }
        }
        m12492c(jSONObject);
    }

    /* renamed from: c */
    public static void m12492c(JSONObject jSONObject) {
        C89219l.m154721d(jSONObject, "");
        if (!jSONObject.has("server_timestamp")) {
            C3866a.m9474a(jSONObject, "server_timestamp", System.currentTimeMillis() + C11225an.f26870a);
        }
        if (!jSONObject.has("client_and_server_diff_time")) {
            C3866a.m9474a(jSONObject, "client_and_server_diff_time", C11225an.f26870a);
        }
        if (!jSONObject.has("client_timestamp")) {
            C3866a.m9474a(jSONObject, "client_timestamp", System.currentTimeMillis());
        }
    }

    /* renamed from: b */
    public static HashMap<String, Object> m12490b(boolean z) {
        String str;
        long j;
        String str2;
        String str3;
        HashMap<String, Object> hashMap = new HashMap<>();
        C6894d a = C6894d.m14753a();
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            str = room.getIdStr();
        } else {
            str = "0";
        }
        long j2 = 0;
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", str);
        hashMap.put("anchor_id", Long.valueOf(j));
        hashMap.put("in_rtc_room", Boolean.valueOf(a.f17276w));
        if (z) {
            str2 = "anchor";
        } else {
            str2 = "guest";
        }
        hashMap.put("role_type", str2);
        C89219l.m154716b(a, "");
        Config.Vendor fromValue = Config.Vendor.fromValue(a.f17261f);
        C89219l.m154716b(fromValue, "");
        hashMap.put("vendor", String.valueOf(fromValue.getValue()));
        hashMap.put("link_mic_id", a.f17260e);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b != null) {
            j2 = b.mo13161c();
        }
        hashMap.put("current_user_id", Long.valueOf(j2));
        hashMap.put("current_linkmic_id", C6898g.C6899a.f17285a.mo13196a(j2));
        if (z || C4386c.m10499a().f11990k != 2) {
            str3 = "video";
        } else {
            str3 = DataType.AUDIO;
        }
        hashMap.put("link_type", str3);
        hashMap.put("device_score", Float.valueOf(TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()));
        hashMap.put("network_type", Long.valueOf((long) TTNetInit.getEffectiveConnectionType()));
        if (!z) {
            hashMap.put("rtc_init_advance", Boolean.valueOf(LiveGuestLinkPreInitEnableSetting.INSTANCE.getValue()));
        }
        hashMap.put("list_opti_enable", Boolean.valueOf(LiveLinkListOptiEnableSetting.INSTANCE.getValue()));
        hashMap.put("guest_count_down_time", Integer.valueOf(GuestCountDownTimeSetting.INSTANCE.getValue()));
        hashMap.put("guest_push_stream_time_android", Double.valueOf(GuestPushStreamTimeAndroidSetting.INSTANCE.getValue()));
        return hashMap;
    }

    /* renamed from: a */
    public static void m12483a(JSONObject jSONObject, long j) {
        C89219l.m154721d(jSONObject, "");
        if (!jSONObject.has("channel_id")) {
            C3866a.m9474a(jSONObject, "channel_id", j);
        }
    }

    /* renamed from: a */
    public static <T> void m12484a(JSONObject jSONObject, C5832d<T> dVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(dVar, "");
        C3866a.m9475a(jSONObject, "request_type", String.valueOf(dVar.requestType));
        C3866a.m9475a(jSONObject, "response", C4139e.C4140a.f11575b.mo46674b(dVar));
    }

    /* renamed from: a */
    public static void m12485a(JSONObject jSONObject, C9606aj ajVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(ajVar, "");
        C3866a.m9474a(jSONObject, "channel_id", ajVar.f23320f);
        C3866a.m9475a(jSONObject, "message_from", String.valueOf(ajVar.getMessageFrom()));
        C3866a.m9474a(jSONObject, "message_create_time", ajVar.f28134O.f28135a);
        C3866a.m9474a(jSONObject, "message_fetch_time", ajVar.f28132M);
        C3866a.m9475a(jSONObject, "transfer_extra", ajVar.f23335u);
        C3866a.m9474a(jSONObject, "delay_time", ajVar.mo16563d());
        long currentTimeMillis = System.currentTimeMillis() + C11225an.f26870a;
        C3866a.m9474a(jSONObject, "server_timestamp", currentTimeMillis);
        C3866a.m9474a(jSONObject, "fetch_delay_time", currentTimeMillis - ajVar.f28132M);
        C3866a.m9475a(jSONObject, "message", C4139e.C4140a.f11575b.mo46674b(ajVar));
    }

    /* renamed from: a */
    public static void m12482a(Throwable th, JSONObject jSONObject) {
        String str;
        long j;
        C89219l.m154721d(jSONObject, "");
        if (th != null) {
            if (th instanceof C2912a) {
                C3866a.m9475a(jSONObject, "error_type", "api_error");
                C2912a aVar = (C2912a) th;
                C3866a.m9474a(jSONObject, "error_code", (long) aVar.getErrorCode());
                C3866a.m9475a(jSONObject, "error_msg", aVar.getErrorMsg());
            } else if (th instanceof C2963a) {
                C3866a.m9475a(jSONObject, "error_type", "net_error");
                C3866a.m9474a(jSONObject, "error_code", (long) ((C2963a) th).statusCode);
                C3866a.m9475a(jSONObject, "error_msg", th.getMessage());
            } else {
                C3866a.m9475a(jSONObject, "error_type", "unknow");
                C3866a.m9474a(jSONObject, "error_code", -1L);
                C3866a.m9475a(jSONObject, "error_msg", th.getClass().getName());
            }
        }
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            str = room.getIdStr();
        } else {
            str = "0";
        }
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        C3866a.m9475a(jSONObject, "room_id", str);
        C3866a.m9474a(jSONObject, "anchor_id", j);
    }

    /* renamed from: a */
    public static void m12486a(JSONObject jSONObject, C9614an anVar) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(anVar, "");
        C3866a.m9474a(jSONObject, "battle_id", anVar.f23354a);
        C3866a.m9474a(jSONObject, "message_create_time", anVar.f28134O.f28135a);
        C3866a.m9474a(jSONObject, "message_fetch_time", anVar.f28132M);
        C3866a.m9475a(jSONObject, "message", C4139e.C4140a.f11575b.mo46674b(anVar));
    }

    /* renamed from: a */
    protected static void m12481a(int i, boolean z, JSONObject jSONObject) {
        String str;
        long j;
        String str2;
        boolean z2;
        String str3 = "";
        C89219l.m154721d(jSONObject, str3);
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            str = room.getIdStr();
        } else {
            str = "0";
        }
        long j2 = 0;
        if (Room.isValid(room)) {
            if (room == null) {
                C89219l.m154715b();
            }
            j = room.getOwnerUserId();
        } else {
            j = 0;
        }
        if (i == 2) {
            str2 = str;
        } else if (i != 4) {
            str2 = str3;
        } else {
            str2 = String.valueOf(C4384b.C4385a.m10496a().f11957e);
        }
        C3866a.m9475a(jSONObject, "channel_id", str2);
        C3866a.m9475a(jSONObject, "room_id", str);
        C3866a.m9474a(jSONObject, "anchor_id", j);
        if (i != 4) {
            z2 = false;
        } else {
            z2 = C4384b.C4385a.m10496a().f11942ae;
        }
        int i2 = z2 ? 1 : 0;
        int i3 = z2 ? 1 : 0;
        int i4 = z2 ? 1 : 0;
        C3866a.m9475a(jSONObject, "is_mute", String.valueOf(i2));
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        if (b != null) {
            j2 = b.mo13161c();
        }
        C3866a.m9474a(jSONObject, "current_user_id", j2);
        if (i != 2) {
            if (i == 4) {
                if (!z) {
                    str3 = "audience";
                } else if (C4384b.C4385a.m10496a().f11969q) {
                    str3 = "inviter";
                } else {
                    str3 = "invitee";
                }
            }
        } else if (z) {
            str3 = "anchor";
        } else {
            str3 = "guest";
        }
        C3866a.m9475a(jSONObject, "role_type", str3);
        C3866a.m9474a(jSONObject, "mode", (long) i);
        m12492c(jSONObject);
    }

    /* renamed from: a */
    public static void m12487a(JSONObject jSONObject, String str, Object obj) {
        C89219l.m154721d(jSONObject, "");
        C89219l.m154721d(str, "");
        if (obj != null) {
            if (obj instanceof Long) {
                C3866a.m9474a(jSONObject, str, ((Number) obj).longValue());
            } else if (obj instanceof Float) {
                C3866a.m9473a(jSONObject, str, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                C3866a.m9472a(jSONObject, str, ((Number) obj).doubleValue());
            } else if (obj instanceof JSONObject) {
                C3866a.m9476a(jSONObject, str, (JSONObject) obj);
            } else if (obj instanceof String) {
                C3866a.m9475a(jSONObject, str, (String) obj);
            } else {
                C3866a.m9475a(jSONObject, str, obj.toString());
            }
        }
    }
}
