package com.bytedance.android.live.liveinteract.cohost.p270c;

import android.text.TextUtils;
import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.core.p214d.C3866a;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p262c.AbstractC4432f;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5702a;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5710e;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5713h;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5721p;
import com.bytedance.android.live.liveinteract.platform.common.p376g.C5736v;
import com.bytedance.android.live.liveinteract.platform.p363a.p366c.C5661a;
import com.bytedance.android.live.liveinteract.platform.p367b.C5664b;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7667f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

@AbstractC4432f(mo10206a = "LINK_LOGGER")
/* renamed from: com.bytedance.android.live.liveinteract.cohost.c.a */
public final class C4616a extends C5664b {
    static {
        Covode.recordClassIndex(5192);
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: a */
    public final void mo10351a(Throwable th) {
        C5721p.m12581a(C5721p.f14514b, th);
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "error_code", 102L);
        C4617b.m12488a(jSONObject, th);
        C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C4617b.f12261c);
        C4617b.m10742a("join_channel_failed", jSONObject, 1);
        C5736v.m12592a(C5710e.m12494a(jSONObject));
        C5702a.m12449a("LinkCross_JoinChannel_Failed", "throwable:".concat(String.valueOf(th)));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: c */
    public final void mo10356c(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        C5702a.m12449a("LinkCross_JoinChannel", "channelId:" + map.get("channel_id"));
        C4617b.m10738a(C4617b.f12263e, "join_channel_request", new JSONObject());
        C4617b.f12261c = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: d */
    public final void mo10357d(Map<String, Object> map) {
        C5832d dVar;
        C89219l.m154721d(map, "");
        C5702a.m12447a("LinkCross_JoinChannel_Success");
        C5661a aVar = (C5661a) map.get("response");
        if (aVar != null && (dVar = (C5832d) aVar.f14391a) != null) {
            C89219l.m154721d(dVar, "");
            JSONObject jSONObject = new JSONObject();
            C4617b.m12484a(jSONObject, dVar);
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C4617b.f12261c);
            C4617b.m10742a("join_channel_succeed", jSONObject, 0);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: e */
    public final void mo10358e(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        Object obj = map.get("to_room_id");
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj).longValue();
        JSONObject jSONObject = new JSONObject();
        C3866a.m9474a(jSONObject, "invite_room_id", longValue);
        C4617b.m10738a(C4617b.f12263e, "invite_request", jSONObject);
        C4617b.f12259a = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: f */
    public final void mo10359f(Map<String, Object> map) {
        String str;
        C89219l.m154721d(map, "");
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            C4384b a = C4384b.C4385a.m10496a();
            if (a.f11968p == EnumC4442m.FOLLOW_INVITE) {
                str = "mutual_follow";
            } else {
                str = "recommend";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("room_id", room.getIdStr());
            hashMap.put("invitee_id", String.valueOf(a.f11958f));
            hashMap.put("invitee_list", str);
            hashMap.put("invite_scene", C5713h.m12501a());
            if (a.f11932V != null) {
                hashMap.put("enter_from", a.f11932V);
            }
            String str2 = a.f11976x;
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put("request_id", str2);
            }
            C5713h.m12517a("livesdk_anchor_connection_invite_success", hashMap);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: g */
    public final void mo10360g(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        Integer num = (Integer) map.get("finishCode");
        if (num != null) {
            int intValue = num.intValue();
            Object obj = map.get("channel_id");
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj).longValue();
            C5702a.m12449a("FINISH_CROSS", "finishCode = ".concat(String.valueOf(intValue)));
            JSONObject jSONObject = new JSONObject();
            C4617b.m12483a(jSONObject, longValue);
            C3866a.m9475a(jSONObject, "finish_code", String.valueOf(intValue));
            C4617b.m10742a("finish_request", jSONObject, 0);
            C3868c.m9492a("ttlive_client_linkmic_anchor_finish", 0, C5710e.m12494a(jSONObject));
            C4617b.f12262d = System.currentTimeMillis();
            C5702a.m12449a("LinkCross_Finish", "channelId:".concat(String.valueOf(longValue)));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: h */
    public final void mo10361h(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        Integer num = (Integer) map.get("finishCode");
        if (num != null) {
            int intValue = num.intValue();
            Object obj = map.get("channel_id");
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Long");
            long longValue = ((Long) obj).longValue();
            C5661a aVar = (C5661a) map.get("response");
            if (aVar != null) {
                C5832d dVar = (C5832d) aVar.f14391a;
                if (dVar != null) {
                    C89219l.m154721d(dVar, "");
                    JSONObject jSONObject = new JSONObject();
                    C4617b.m12484a(jSONObject, dVar);
                    C4617b.m12483a(jSONObject, longValue);
                    C3866a.m9475a(jSONObject, "finish_code", String.valueOf(intValue));
                    C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C4617b.f12262d);
                    C4617b.m10742a("finish_succeed", jSONObject, 0);
                }
                C5702a.m12447a("LinkCross_Finish_Success");
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: a */
    public final void mo10353a(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        Integer num = (Integer) map.get("reply_status");
        if (num != null) {
            num.intValue();
            if (num.intValue() == 1) {
                C4617b.m10737a(num.intValue(), (Map<String, ? extends Object>) null);
            } else {
                C4617b.m10737a(num.intValue(), map);
            }
            C5702a.m12449a("LinkCross_Reply", "channelId:" + map.get("channel_id") + "; roomId:" + map.get("room_id") + "; replyStatus:" + num + "; guestUserId:" + map.get("guest_user_id"));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: b */
    public final void mo10355b(Map<String, Object> map) {
        C89219l.m154721d(map, "");
        C5661a aVar = (C5661a) map.get("response");
        if (aVar != null) {
            if (aVar.f14391a instanceof C7667f) {
                Object obj = aVar.f14391a;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type com.bytedance.android.livesdk.chatroom.model.interact.LinkReplyResult");
                if (obj != null) {
                    String b = C4139e.C4140a.f11575b.mo46674b(obj);
                    C89219l.m154716b(b, "");
                    C5702a.m12449a("LinkCross_Reply_Success", b);
                }
            }
            C5832d dVar = (C5832d) aVar.f14391a;
            if (dVar != null) {
                Object obj2 = map.get("reply_status");
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                C4617b.m10736a(((Integer) obj2).intValue(), dVar, map);
            }
        }
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: a */
    public final void mo10352a(Throwable th, Map<String, Object> map) {
        Integer num;
        if (!(map == null || (num = (Integer) map.get("reply_status")) == null)) {
            num.intValue();
            int intValue = num.intValue();
            JSONObject jSONObject = new JSONObject();
            C3866a.m9474a(jSONObject, "error_code", 101L);
            C4617b.m12488a(jSONObject, th);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                C4617b.m12487a(jSONObject, entry.getKey(), entry.getValue());
            }
            C3866a.m9475a(jSONObject, "answer", String.valueOf(intValue));
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C4617b.f12260b);
            C4617b.m10742a("reply_failed", jSONObject, 1);
            if (intValue == 1) {
                C5736v.m12592a(C5710e.m12494a(jSONObject));
            }
        }
        C5702a.m12449a("LinkCross_Reply_Failed", "throwable:".concat(String.valueOf(th)));
    }

    @Override // com.bytedance.android.live.liveinteract.platform.p367b.C5664b, com.bytedance.android.live.liveinteract.platform.p363a.AbstractC5646a
    /* renamed from: b */
    public final void mo10354b(Throwable th, Map<String, Object> map) {
        Integer num;
        long j;
        if (map != null && (num = (Integer) map.get("finishCode")) != null) {
            int intValue = num.intValue();
            Long l = (Long) map.get("channel_id");
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            JSONObject jSONObject = new JSONObject();
            C4617b.m12483a(jSONObject, j);
            C3866a.m9475a(jSONObject, "finish_code", String.valueOf(intValue));
            C4617b.m12488a(jSONObject, th);
            C3866a.m9474a(jSONObject, "cost", System.currentTimeMillis() - C4617b.f12262d);
            C4617b.m10742a("finish_failed", jSONObject, 1);
            C5702a.m12449a("LinkCross_Finish_Failed", "throwable:".concat(String.valueOf(th)));
        }
    }
}
