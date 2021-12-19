package com.bytedance.android.livesdk.usercard;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.p253j.AbstractC4367a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p425aa.p428c.C6526e;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.livesdk.usercard.v */
public final class C10985v {

    /* renamed from: a */
    Context f26447a;

    /* renamed from: b */
    Room f26448b;

    /* renamed from: c */
    boolean f26449c;

    /* renamed from: d */
    public Map<String, String> f26450d = new HashMap();

    /* renamed from: e */
    private long f26451e;

    static {
        Covode.recordClassIndex(12600);
    }

    /* renamed from: a */
    public final void mo17841a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("rid", this.f26448b.getId());
            jSONObject.put("request_id", this.f26448b.getRequestId());
            jSONObject.put("log_pb", this.f26448b.getLog_pb());
        } catch (Exception unused) {
        }
    }

    public C10985v(Context context, Room room, long j) {
        this.f26447a = context;
        this.f26448b = room;
        this.f26451e = j;
    }

    /* renamed from: a */
    public final void mo17842a(boolean z, long j, String str, boolean z2, int i, boolean z3, long j2, boolean z4) {
        String str2;
        String str3;
        Room room;
        String str4 = str;
        C6526e eVar = new C6526e("", this.f26451e);
        if (TextUtils.isEmpty(str4)) {
            str4 = null;
        }
        if (z2) {
            if (z3) {
                eVar.f16285a = "live_anchor_c_anchor";
                str4 = "live_anchor_c_anchor";
            } else {
                eVar.f16285a = "live_anchor_c_audience";
            }
            if (TextUtils.isEmpty(str4)) {
                eVar.f16285a = "live_anchor_c_audience";
                str4 = "live_anchor_c_audience";
            }
        } else if (i != 1) {
            eVar.f16285a = "live_audience_c_anchor";
            str4 = "live_audience_c_anchor";
        } else {
            if (z3) {
                eVar.f16285a = "live_audience_c_anchor";
            } else {
                eVar.f16285a = "live_audience_c_audience";
            }
            if (TextUtils.isEmpty(str4)) {
                eVar.f16285a = "live_audience_c_audience";
                str4 = "live_audience_c_audience";
            }
        }
        eVar.f16288d = z;
        HashMap hashMap = new HashMap();
        if (z3) {
            hashMap.put("invitee_list", ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getCurrentInviteeList());
        }
        String valueOf = String.valueOf(j);
        AbstractC4367a aVar = (AbstractC4367a) C6193a.m13435a(AbstractC4367a.class);
        if (!(aVar == null || (room = this.f26448b) == null || !aVar.isMicRoomForRoom(room) || this.f26448b.officialChannelInfo == null)) {
            if (this.f26448b.officialChannelInfo.f23136a.getId() == j) {
                if (aVar.isMicAudience()) {
                    str4 = "carousel_audience_c_official_id";
                } else {
                    str4 = "loyal_audience_c_official_id";
                }
                valueOf = String.valueOf(this.f26448b.officialChannelInfo.f23136a.getId());
            } else if (j == this.f26448b.getOwner().getId()) {
                if (aVar.isMicAudience()) {
                    str4 = "carousel_audience_c_anchor";
                } else {
                    str4 = "loyal_audience_c_anchor";
                }
                valueOf = String.valueOf(this.f26448b.officialChannelInfo.f23136a.getId());
            }
        }
        hashMap.put("to_user_id", valueOf);
        hashMap.put("request_page", str4);
        hashMap.put("click_user_position", "profile_card");
        if (z) {
            hashMap.put("growth_deepevent", "1");
            long ownerUserId = this.f26448b.getOwnerUserId();
            long j3 = C4384b.C4385a.m10496a().f11958f;
            if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isInCoHost()) {
                if (j == this.f26448b.getOwnerUserId()) {
                    hashMap.put("anchor_type", "current");
                }
                if (z3) {
                    hashMap.put("anchor_type", "opposite");
                }
                hashMap.put("connection_type", "anchor");
                hashMap.put("channel_id", String.valueOf(C4384b.C4385a.m10496a().f11957e));
                hashMap.put("invitee_list", ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getCurrentInviteeList());
                if (C4384b.C4385a.m10496a().f11969q) {
                    hashMap.put("connection_inviter_id", String.valueOf(ownerUserId));
                    hashMap.put("connection_invitee_id", String.valueOf(j3));
                } else {
                    hashMap.put("connection_invitee_id", String.valueOf(ownerUserId));
                    hashMap.put("connection_inviter_id", String.valueOf(j3));
                }
            }
            if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isRoomInBattle()) {
                hashMap.put("connection_type", "manual_pk");
                hashMap.put("pk_id", String.valueOf(C4384b.C4385a.m10496a().f11946ai));
                if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isBattleStarter()) {
                    hashMap.put("pk_inviter_id", String.valueOf(ownerUserId));
                    hashMap.put("pk_invitee_id", String.valueOf(j3));
                } else {
                    hashMap.put("pk_invitee_id", String.valueOf(ownerUserId));
                    hashMap.put("pk_inviter_id", String.valueOf(j3));
                }
            }
            if (((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isInMultiGuest()) {
                hashMap.put("connection_type", "audience");
            }
        }
        if (!C13627m.m24498a(C7411d.m15284a().mo13614e())) {
            hashMap.put("enter_live_method", C7411d.m15284a().mo13614e());
        }
        hashMap.put("follow_status", String.valueOf(j2));
        Map<String, String> map = this.f26450d;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                hashMap.put(entry.getKey().toString(), entry.getValue().toString());
            }
        }
        String g = C6544e.m13993g();
        if (TextUtils.isEmpty(g) || !"click_push_live_cd_user".equals(g)) {
            hashMap.put("is_subscribe", "0");
        } else {
            hashMap.put("is_subscribe", "1");
        }
        if (z4) {
            str2 = "portrait";
        } else {
            str2 = "landscape";
        }
        hashMap.put("room_orientation", str2);
        if (z) {
            str3 = "follow";
        } else {
            str3 = "unfollow";
        }
        C6501b.C6502a.m13948a(str3).mo12652a((Map<String, String>) hashMap).mo12640a(eVar).mo12639a().mo12654b("live_interact").mo12658d("live_detail").mo12655b();
    }
}
