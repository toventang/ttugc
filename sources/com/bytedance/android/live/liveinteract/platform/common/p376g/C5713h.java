package com.bytedance.android.live.liveinteract.platform.common.p376g;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.C4394ah;
import com.bytedance.android.live.liveinteract.api.EnumC4440k;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.EnumC4949c;
import com.bytedance.android.live.liveinteract.multiguest.p316a.p319c.C5146c;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.interact.model.C7610h;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMtInteractInviterCancelEnableSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.p428c.C6528g;
import com.bytedance.android.livesdk.p452ao.AbstractC6804a;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.h */
public final class C5713h {

    /* renamed from: a */
    public static boolean f14479a;

    /* renamed from: b */
    public static String f14480b;

    /* renamed from: c */
    public static long f14481c;

    /* renamed from: d */
    public static boolean f14482d;

    /* renamed from: e */
    public static long f14483e;

    /* renamed from: f */
    public static long f14484f;

    /* renamed from: g */
    public static long f14485g;

    static {
        Covode.recordClassIndex(6311);
    }

    /* renamed from: a */
    public static String m12502a(int i) {
        return i == 0 ? "multi_live_apply" : "multi_live_accept";
    }

    /* renamed from: a */
    public static void m12511a(DataChannel dataChannel) {
        HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "anchor");
        C6501b.C6502a.m13948a("connection_click").mo12652a((Map<String, String>) hashMap).mo12658d("live_detail").mo12654b("live").mo12656c("click").mo12643a(dataChannel).mo12655b();
    }

    /* renamed from: a */
    public static void m12521a(boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from", z ? "connecton_icon" : "anchor_host_notice");
        hashMap.put("notice_type", z2 ? "random_notice" : "normal_notice");
        if (z2) {
            hashMap.put("connection_type", "anchor");
            hashMap.put("invitee_list", "random_match");
        }
        C5586a.m12137a(hashMap, (EnumC4422k) null);
        m12524b("guest_connection_anchor", hashMap, "show");
    }

    /* renamed from: a */
    public static void m12512a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("request_page", str);
        m12524b("guest_connection", hashMap, "show");
    }

    /* renamed from: a */
    public static void m12516a(String str, String str2, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("request_page", str);
        hashMap.put("notice_type", z ? "random_notice" : "normal_notice");
        hashMap.put("enter_from", str2);
        m12517a("connection_icon_click", hashMap);
    }

    /* renamed from: a */
    public static void m12520a(boolean z, String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("is_open", String.valueOf(z ? 1 : 0));
        hashMap.put("enter_from", str);
        m12517a("anchor_connection_recommend_open", hashMap);
    }

    /* renamed from: a */
    public static void m12508a(EnumC4442m mVar, long j, long j2, String str, long j3, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "anchor");
        C5737w.m12601a(hashMap, mVar);
        long currentTimeMillis = System.currentTimeMillis();
        f14484f = currentTimeMillis;
        hashMap.put("time_stamp", String.valueOf(currentTimeMillis));
        if (mVar == EnumC4442m.FOLLOW_INVITE || mVar == EnumC4442m.RECOMMEND_INVITE) {
            hashMap.put("show_to_decide_dur", String.valueOf(f14484f - f14485g));
        }
        hashMap.put("inviter_id", String.valueOf(j));
        hashMap.put("invitee_id", String.valueOf(j2));
        hashMap.put("selection", str);
        hashMap.put("invited_room_id", String.valueOf(j3));
        hashMap.put("is_turn_off_invitation", z ? "1" : "0");
        C4384b a = C4384b.C4385a.m10496a();
        if (a.f11932V != null) {
            hashMap.put("enter_from", a.f11932V);
        }
        String str2 = a.f11976x;
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("request_id", str2);
        }
        m12517a("connection_invited", hashMap);
    }

    /* renamed from: a */
    public static void m12515a(String str, Room room, int i, C7610h hVar) {
        if (room != null && room.getOwner() != null) {
            int i2 = (hVar == null || hVar.f18898f != 0) ? 0 : 1;
            String str2 = i == 1 ? "mutual_follow" : "recommend";
            HashMap hashMap = new HashMap();
            hashMap.put("connection_type", "anchor");
            hashMap.put("invitee_list", str2);
            hashMap.put("invitee_status", String.valueOf(i2));
            hashMap.put("invited_room_id", room.getIdStr());
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("request_id", str);
            }
            C4384b a = C4384b.C4385a.m10496a();
            if (a.f11932V != null) {
                hashMap.put("enter_from", a.f11932V);
            }
            m12517a("connection_invite_show", hashMap);
        }
    }

    /* renamed from: a */
    public static void m12509a(EnumC4442m mVar, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("invitee_list", C5737w.m12598a(mVar));
        hashMap.put("click_position", str);
        hashMap.put("selection", str2);
        m12517a("cancel_connection_popup_click", hashMap);
    }

    /* renamed from: a */
    public static void m12519a(boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("choose_type", z ? "dismiss" : "contact_us");
        m12524b("guest_connection_underage_popup", hashMap, "click");
    }

    /* renamed from: a */
    public static void m12513a(String str, int i) {
        String str2;
        HashMap hashMap = new HashMap();
        if (C4384b.C4385a.m10496a().f11968p == EnumC4442m.FOLLOW_INVITE) {
            str2 = "mutual_follow";
        } else {
            str2 = "recommend";
        }
        hashMap.put("invitee_list", str2);
        if (!(C4947a.f12909a.mo10672a() != EnumC4949c.NORMAL)) {
            hashMap.put("connection_type", "anchor");
        } else {
            hashMap.put("connection_type", "manual_pk");
        }
        hashMap.put("selection", str);
        hashMap.put("is_dont_suggest", String.valueOf(i));
        m12517a("cancel_connection_select", hashMap);
    }

    /* renamed from: a */
    public static void m12510a(Room room, EnumC4442m mVar, String str) {
        C4384b a = C4384b.C4385a.m10496a();
        HashMap hashMap = new HashMap();
        hashMap.put("connection_type", "anchor");
        C5737w.m12601a(hashMap, mVar);
        f14483e = System.currentTimeMillis();
        if (mVar != EnumC4442m.RANDOM_LINK_MIC_INVITE) {
            hashMap.put("invitee_id", room.getOwner().getIdStr());
            hashMap.put("invited_room_id", room.getIdStr());
            hashMap.put("time_stamp", String.valueOf(f14483e));
        }
        C5737w.m12601a(hashMap, mVar);
        hashMap.put("invite_scene", m12501a());
        if (!TextUtils.isEmpty(a.f11932V)) {
            hashMap.put("enter_from", a.f11932V);
        }
        String str2 = a.f11976x;
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("request_id", str2);
        } else {
            hashMap.put("request_id", str);
        }
        hashMap.put("connection_inviter_id", String.valueOf(C11115u.m19743a().mo17915b().mo13161c()));
        hashMap.put("connection_invitee_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
        C5737w.m12600a(hashMap);
        m12517a("connection_invite", hashMap);
    }

    /* renamed from: a */
    public static void m12518a(String str, Map<String, String> map, String str2) {
        C6501b.C6502a.m13948a(str).mo12639a().mo12658d(str2).mo12652a(map).mo12655b();
    }

    /* renamed from: a */
    public static void m12514a(String str, long j) {
        C6501b.C6502a.m13948a("livesdk_guest_connection_icon_show").mo12639a().mo12651a("request_page", str).mo12646a("anchor_relationship", j).mo12655b();
    }

    /* renamed from: b */
    public static void m12522b() {
        String str;
        C6501b c = C6501b.C6502a.m13948a("livesdk_guest_linkmic_ban").mo12639a().mo12656c("show");
        if (C11279p.m20029f()) {
            str = "anchor";
        } else {
            str = "guest";
        }
        c.mo12651a("user_type", str).mo12655b();
    }

    /* renamed from: a */
    public static String m12501a() {
        boolean a = C4394ah.m10505a(((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getCurrentLinkMode(), 2);
        boolean isInMultiGuest = ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).isInMultiGuest();
        if (!a) {
            return "guest_close";
        }
        if (isInMultiGuest) {
            return "guest";
        }
        return "guest_open";
    }

    /* renamed from: c */
    public static void m12525c(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("reason", str);
        m12517a("guest_connection_unable_connect_toast", hashMap);
    }

    /* renamed from: b */
    public static void m12523b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("request_page", str);
        m12524b("guest_connection", hashMap, "click");
    }

    /* renamed from: a */
    public static C6528g m12500a(Room room) {
        C4384b a = C4384b.C4385a.m10496a();
        C6528g gVar = new C6528g();
        gVar.mo12675a(a.f11968p.getType());
        if (a.f11969q) {
            gVar.f16298a = room.getOwner().getId();
            gVar.f16299b = a.f11958f;
        } else {
            gVar.f16298a = a.f11958f;
            gVar.f16299b = room.getOwner().getId();
        }
        gVar.f16304g = a.f11957e;
        return gVar;
    }

    /* renamed from: a */
    public static void m12507a(EnumC4422k kVar) {
        String str;
        boolean booleanValue = AbstractC6804a.f17036cj.mo13066a().booleanValue();
        C6501b a = C6501b.C6502a.m13948a("livesdk_guest_connection_status").mo12639a();
        if (booleanValue) {
            str = "open";
        } else {
            str = "close";
        }
        a.mo12651a("status", str).mo12651a("layout_setting", C5586a.m12128a(kVar).getFirst()).mo12651a("window_setting", C5586a.m12128a(kVar).getSecond()).mo12655b();
    }

    /* renamed from: a */
    public static void m12517a(String str, Map<String, String> map) {
        C6501b.C6502a.m13948a(str).mo12639a().mo12652a(map).mo12655b();
    }

    /* renamed from: a */
    public static void m12505a(int i, String str) {
        C6501b.C6502a.m13948a("livesdk_appeal_popup_window_click").mo12651a("request_page", m12502a(i)).mo12651a("click_type", str).mo12639a().mo12655b();
    }

    /* renamed from: a */
    public static void m12506a(long j, EnumC4422k kVar) {
        C6501b.C6502a.m13948a("livesdk_anchor_invite_guest_connection").mo12639a().mo12651a("enter_from", C5146c.m11381a(j)).mo12651a("live_type", "video_live").mo12651a("layout_setting", C5586a.m12128a(kVar).getFirst()).mo12651a("window_setting", C5586a.m12128a(kVar).getSecond()).mo12655b();
    }

    /* renamed from: b */
    public static void m12524b(String str, Map<String, String> map, String str2) {
        C6501b.C6502a.m13948a(str).mo12639a().mo12652a(map).mo12661f(str2).mo12655b();
    }

    /* renamed from: a */
    public static void m12503a(int i, int i2, long j, int i3, EnumC4422k kVar) {
        String str;
        HashMap hashMap = new HashMap();
        if (i == 1) {
            str = "video";
        } else {
            str = "voice";
        }
        hashMap.put("guest_connection_type", str);
        hashMap.put("weight_decay_type", String.valueOf(i2));
        hashMap.put("anchor_relationship", String.valueOf(j));
        if (!TextUtils.isEmpty(f14480b)) {
            hashMap.put("request_page", f14480b);
        }
        hashMap.put("connected_guest_cnt", String.valueOf(i3));
        hashMap.put("layout_setting", C5586a.m12128a(kVar).getFirst());
        hashMap.put("window_setting", C5586a.m12128a(kVar).getSecond());
        m12518a("guest_connection_apply", hashMap, "live_take_detail");
    }

    /* renamed from: a */
    public static void m12504a(int i, Room room, EnumC4422k kVar, boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        int i2 = Build.VERSION.SDK_INT;
        if (room == null || room.getMosaicStatus() == 1 || i != 4 || (!C4384b.C4385a.m10496a().mo10150a(EnumC4440k.CONNECTION_START) && (C4384b.C4385a.m10496a().mo10151b() != EnumC4440k.INVITING || !LiveMtInteractInviterCancelEnableSetting.INSTANCE.getValue()))) {
            str = "connection";
        } else {
            str = "cancel";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("click_type", str);
        hashMap.put("layout_setting", C5586a.m12128a(kVar).getFirst());
        hashMap.put("window_setting", C5586a.m12128a(kVar).getSecond());
        if (z) {
            str2 = "connection_icon";
        } else {
            str2 = "anchor_host_notice";
        }
        hashMap.put("enter_from", str2);
        if (z2) {
            str3 = "random_notice";
        } else {
            str3 = "normal_notice";
        }
        hashMap.put("notice_type", str3);
        if (z2) {
            hashMap.put("connection_type", "anchor");
            hashMap.put("invitee_list", "random_match");
        }
        m12524b("guest_connection_anchor", hashMap, "click");
    }
}
