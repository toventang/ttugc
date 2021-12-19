package com.bytedance.android.live.liveinteract.platform.common.p376g;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4947a;
import com.bytedance.android.live.liveinteract.match.p295b.p297b.C4948b;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveInteractBattleDurationSetting;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdk.model.message.p578b.C9644i;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.p688a.C11695b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.b */
public final class C5703b {

    /* renamed from: a */
    public static long f14459a;

    /* renamed from: b */
    public static long f14460b;

    /* renamed from: c */
    public static final C5703b f14461c = new C5703b();

    /* renamed from: d */
    private static long f14462d;

    /* renamed from: e */
    private static final HashSet<Long> f14463e = new HashSet<>();

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.b$a */
    public enum EnumC5704a {
        POSITIVE_OVER("positive_over"),
        NEGATIVE_OVER("negative_over"),
        TIME_OUT("time_out");
        

        /* renamed from: b */
        private final String f14465b;

        public final String getType() {
            return this.f14465b;
        }

        static {
            Covode.recordClassIndex(6302);
        }

        private EnumC5704a(String str) {
            this.f14465b = str;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.b$b */
    public enum EnumC5705b {
        PK_ICON("pk_icon"),
        PK_GUIDE("pk_guide");
        

        /* renamed from: b */
        private final String f14467b;

        public final String getValue() {
            return this.f14467b;
        }

        static {
            Covode.recordClassIndex(6303);
        }

        private EnumC5705b(String str) {
            this.f14467b = str;
        }
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.b$c */
    public enum EnumC5706c {
        ANCHOR("anchor"),
        MANUAL_PK("manual_pk");
        

        /* renamed from: b */
        private final String f14469b;

        public final String getType() {
            return this.f14469b;
        }

        static {
            Covode.recordClassIndex(6304);
        }

        private EnumC5706c(String str) {
            this.f14469b = str;
        }
    }

    private C5703b() {
    }

    /* renamed from: a */
    public static void m12469a(boolean z, boolean z2) {
        HashMap hashMap = new HashMap();
        String str = C4384b.C4385a.m10496a().f11947aj;
        if (str == null) {
            str = "";
        }
        hashMap.put("request_from", str);
        hashMap.put("invitee_list", C5737w.m12598a(C4384b.C4385a.m10496a().f11968p));
        hashMap.put("anchor_type", C4384b.C4385a.m10496a().f11969q ? "inviter" : "invitee");
        m12466a(hashMap);
        m12475b(hashMap);
        m12470a(true, false, (Map<String, String>) hashMap);
        hashMap.put("status", z2 ? "turn_on" : "close");
        hashMap.put("is_dont_show_again", z ? "1" : "0");
        m12465a("livesdk_no_gift_reminder_click", hashMap);
    }

    /* renamed from: a */
    public static void m12467a(boolean z, int i, EnumC5705b bVar) {
        HashMap hashMap = new HashMap();
        m12466a(hashMap);
        m12475b(hashMap);
        m12470a(true, z, (Map<String, String>) hashMap);
        if (bVar != null) {
            hashMap.put("request_from", bVar.getValue());
        }
        hashMap.put("invitee_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
        hashMap.put("invitee_status", String.valueOf(i));
        long currentTimeMillis = System.currentTimeMillis();
        f14459a = currentTimeMillis;
        hashMap.put("time_stamp", String.valueOf(currentTimeMillis));
        C5737w.m12601a(hashMap, C4384b.C4385a.m10496a().f11968p);
        C5737w.m12600a(hashMap);
        m12465a("livesdk_connection_invite", hashMap);
    }

    /* renamed from: a */
    public static void m12468a(boolean z, C11695b bVar) {
        if (bVar != null) {
            HashMap hashMap = new HashMap();
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            hashMap.put("connection_type", "manual_pk");
            int i = C5707c.f14470a[C4384b.C4385a.m10496a().f11968p.ordinal()];
            int i2 = 2;
            hashMap.put("invitee_list", i != 1 ? i != 2 ? i != 3 ? "none" : "random_match" : "recommend" : "manual_follow");
            hashMap.put("user_type", z ? "anchor" : "user");
            hashMap.put("pk_id", String.valueOf(C4947a.f12909a.mo10677b()));
            hashMap.put("channel_id", String.valueOf(C4384b.C4385a.m10496a().f11957e));
            if (room != null) {
                String idStr = room.getIdStr();
                C89219l.m154716b(idStr, "");
                hashMap.put("room_id", idStr);
            }
            hashMap.put("win_status", String.valueOf(bVar.f27978c));
            if (room != null) {
                if (bVar.f27976a == room.getOwnerUserId()) {
                    i2 = 1;
                }
                hashMap.put("anchor_type", String.valueOf(i2));
            }
            m12465a("connection_win_click", hashMap);
        }
    }

    /* renamed from: a */
    public static void m12466a(Map<String, String> map) {
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            map.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            C89219l.m154716b(idStr, "");
            map.put("room_id", idStr);
            map.put("enter_method", C6544e.m13990d());
            map.put("enter_from_merge", C6544e.m13987a());
            map.put("action_type", C6544e.m13991e());
            String str = C4384b.C4385a.m10496a().f11976x;
            if (!TextUtils.isEmpty(str)) {
                if (str == null) {
                    C89219l.m154715b();
                }
                map.put("request_id", str);
            }
        }
    }

    /* renamed from: a */
    public static void m12470a(boolean z, boolean z2, Map<String, String> map) {
        C4948b bVar;
        String valueOf;
        map.put("connection_type", "manual_pk");
        if (z2) {
            bVar = C4947a.f12910b;
        } else {
            bVar = C4947a.f12909a;
        }
        Integer num = null;
        if (z) {
            C9644i iVar = bVar.f12912a;
            if (iVar == null || iVar.f23496d <= 0) {
                valueOf = String.valueOf(LiveInteractBattleDurationSetting.INSTANCE.getValue());
            } else {
                C9644i iVar2 = bVar.f12912a;
                if (iVar2 != null) {
                    num = Integer.valueOf(iVar2.f23496d);
                }
                valueOf = String.valueOf(num);
            }
        } else {
            C9644i iVar3 = bVar.f12912a;
            if (iVar3 != null) {
                num = Integer.valueOf(iVar3.f23496d);
            }
            valueOf = String.valueOf(num);
        }
        map.put("pk_time", valueOf);
        if (z) {
            map.put("is_oncemore", String.valueOf(bVar.f12913b ? 1 : 0));
        }
        map.put("channel_id", String.valueOf(C4384b.C4385a.m10496a().f11957e));
        map.put("pk_id", String.valueOf(bVar.mo10677b()));
    }

    static {
        Covode.recordClassIndex(6301);
    }

    /* renamed from: a */
    public static void m12458a() {
        HashMap hashMap = new HashMap();
        m12466a(hashMap);
        hashMap.put("invitee_list", C5737w.m12598a(C4384b.C4385a.m10496a().f11968p));
        C5737w.m12600a(hashMap);
        m12465a("livesdk_pk_icon_click", hashMap);
    }

    /* renamed from: b */
    public static void m12471b() {
        HashMap hashMap = new HashMap();
        m12466a(hashMap);
        m12470a(false, false, (Map<String, String>) hashMap);
        hashMap.put("right_user_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
        m12465a("livesdk_pk_transform", hashMap);
    }

    /* renamed from: c */
    public static void m12478c() {
        HashMap hashMap = new HashMap();
        m12466a(hashMap);
        m12475b(hashMap);
        m12470a(true, false, (Map<String, String>) hashMap);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        long c = b.mo13161c();
        hashMap.put("right_user_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
        C5737w.m12601a(hashMap, C4384b.C4385a.m10496a().f11968p);
        hashMap.put("connection_inviter_id", String.valueOf(c));
        hashMap.put("connection_invitee_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
        m12465a("livesdk_pk_oncemore_click", hashMap);
    }

    /* renamed from: b */
    public static final void m12473b(String str) {
        C89219l.m154721d(str, "");
        HashMap hashMap = new HashMap();
        hashMap.put("action_type", "click");
        hashMap.put("invite_entrance", str);
        C5586a.m12142b(hashMap);
        m12465a("livesdk_anchor_guest_connection_entrance_click", hashMap);
    }

    /* renamed from: c */
    public static final void m12479c(String str) {
        C89219l.m154721d(str, "");
        HashMap hashMap = new HashMap();
        m12466a(hashMap);
        hashMap.put("open_method", str);
        m12465a("livesdk_anchor_guest_connection_open", hashMap);
    }

    /* renamed from: d */
    public static final void m12480d(String str) {
        C89219l.m154721d(str, "");
        HashMap hashMap = new HashMap();
        m12466a(hashMap);
        hashMap.put("end_reason", str);
        m12465a("livesdk_anchor_guest_connection_close", hashMap);
    }

    /* renamed from: a */
    public static void m12463a(String str) {
        C89219l.m154721d(str, "");
        C3854a.m9453a(4, "BattleWatchTAG", "logBattleWatchDuration, source = ".concat(String.valueOf(str)));
        long j = C4947a.f12909a.f12926o;
        if (j > 0) {
            HashMap hashMap = new HashMap();
            m12466a(hashMap);
            m12470a(false, false, (Map<String, String>) hashMap);
            hashMap.put("right_user_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
            hashMap.put("watch_connection_duration", String.valueOf((System.currentTimeMillis() - j) / 1000));
            m12465a("livesdk_connection_watch_duration", hashMap);
        }
    }

    /* renamed from: a */
    public static final void m12459a(EnumC4422k kVar) {
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            if (idStr == null) {
                idStr = "";
            }
            hashMap.put("room_id", idStr);
            hashMap.put("enter_method", C6544e.m13990d());
            hashMap.put("enter_from_merge", C6544e.m13987a());
            hashMap.put("action_type", C6544e.m13991e());
            User owner = room.getOwner();
            C89219l.m154716b(owner, "");
            FollowInfo followInfo = owner.getFollowInfo();
            C89219l.m154716b(followInfo, "");
            hashMap.put("anchor_relationship", String.valueOf(followInfo.getFollowStatus()));
            hashMap.put("layout_setting", C5586a.m12128a(kVar).getFirst());
            hashMap.put("window_setting", C5586a.m12128a(kVar).getSecond());
            m12465a("livesdk_guest_connection_apply_withdraw", hashMap);
        }
    }

    /* renamed from: b */
    public static void m12472b(EnumC5704a aVar) {
        String str;
        C89219l.m154721d(aVar, "");
        long j = C4947a.f12909a.f12927p;
        if (j > 0) {
            HashMap hashMap = new HashMap();
            m12466a(hashMap);
            m12470a(true, false, (Map<String, String>) hashMap);
            m12475b(hashMap);
            if (!TextUtils.isEmpty(C4384b.C4385a.m10496a().f11947aj)) {
                String str2 = C4384b.C4385a.m10496a().f11947aj;
                if (str2 == null) {
                    C89219l.m154715b();
                }
                hashMap.put("request_from", str2);
            }
            hashMap.put("right_user_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
            hashMap.put("over_type", aVar.getType());
            if (C4947a.f12909a.f12914c) {
                str = "inviter";
            } else {
                str = "invitee";
            }
            hashMap.put("anchor_type", str);
            hashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - j) / 1000));
            C5737w.m12601a(hashMap, C4384b.C4385a.m10496a().f11968p);
            if (C4384b.C4385a.m10496a().f11928R) {
                hashMap.put("is_live_end", "1");
            }
            m12465a("livesdk_punish_end", hashMap);
        }
    }

    /* renamed from: a */
    public static final void m12460a(EnumC5704a aVar) {
        String str;
        String str2;
        String valueOf;
        String str3;
        String valueOf2;
        C89219l.m154721d(aVar, "");
        long j = C4947a.f12909a.f12926o;
        if (j > 0) {
            HashSet<Long> hashSet = f14463e;
            if (!hashSet.contains(Long.valueOf(C4947a.f12909a.mo10677b()))) {
                hashSet.add(Long.valueOf(C4947a.f12909a.mo10677b()));
                HashMap hashMap = new HashMap();
                m12466a(hashMap);
                m12475b(hashMap);
                m12470a(true, false, (Map<String, String>) hashMap);
                hashMap.put("over_type", aVar.getType());
                hashMap.put("right_user_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
                hashMap.put("connection_time", String.valueOf((System.currentTimeMillis() - j) / 1000));
                C5737w.m12601a(hashMap, C4384b.C4385a.m10496a().f11968p);
                if (C4384b.C4385a.m10496a().f11928R) {
                    hashMap.put("is_live_end", "1");
                }
                if (!TextUtils.isEmpty(C4384b.C4385a.m10496a().f11947aj)) {
                    String str4 = C4384b.C4385a.m10496a().f11947aj;
                    if (str4 == null) {
                        C89219l.m154715b();
                    }
                    hashMap.put("request_from", str4);
                }
                if (C4947a.f12909a.f12914c) {
                    str = "inviter";
                } else {
                    str = "invitee";
                }
                hashMap.put("anchor_type", str);
                AbstractC6872f b = C11115u.m19743a().mo17915b();
                C89219l.m154716b(b, "");
                long c = b.mo13161c();
                String str5 = "0";
                if (C4947a.f12909a.f12914c) {
                    Long l = C4947a.f12909a.f12931t.get(Long.valueOf(c));
                    if (l == null || (str3 = String.valueOf(l.longValue())) == null) {
                        str3 = str5;
                    }
                    hashMap.put("inviter_pk_score", str3);
                    Long l2 = C4947a.f12909a.f12931t.get(Long.valueOf(C4384b.C4385a.m10496a().f11958f));
                    if (!(l2 == null || (valueOf2 = String.valueOf(l2.longValue())) == null)) {
                        str5 = valueOf2;
                    }
                    hashMap.put("invitee_pk_score", str5);
                } else {
                    Long l3 = C4947a.f12909a.f12931t.get(Long.valueOf(c));
                    if (l3 == null || (str2 = String.valueOf(l3.longValue())) == null) {
                        str2 = str5;
                    }
                    hashMap.put("invitee_pk_score", str2);
                    Long l4 = C4947a.f12909a.f12931t.get(Long.valueOf(C4384b.C4385a.m10496a().f11958f));
                    if (!(l4 == null || (valueOf = String.valueOf(l4.longValue())) == null)) {
                        str5 = valueOf;
                    }
                    hashMap.put("inviter_pk_score", str5);
                }
                C11695b bVar = C4947a.f12909a.f12917f;
                if (bVar != null) {
                    hashMap.put("win_status", String.valueOf(bVar.f27978c));
                }
                C5737w.m12600a(hashMap);
                m12465a("livesdk_pk_end", hashMap);
            }
        }
    }

    /* renamed from: b */
    public static void m12475b(Map<String, String> map) {
        Long l;
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            l = Long.valueOf(room.getOwnerUserId());
        } else {
            l = null;
        }
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        long c = b.mo13161c();
        if (l != null && l.longValue() == c) {
            if (C4384b.C4385a.m10496a().f11969q) {
                map.put("connection_inviter_id", String.valueOf(c));
                map.put("connection_invitee_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
            } else {
                map.put("connection_inviter_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
                map.put("connection_invitee_id", String.valueOf(c));
            }
            if (C4947a.f12909a.f12914c) {
                map.put("pk_inviter_id", String.valueOf(c));
                map.put("pk_invitee_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
                return;
            }
            map.put("pk_inviter_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
            map.put("pk_invitee_id", String.valueOf(c));
        }
    }

    /* renamed from: a */
    public static void m12465a(String str, Map<String, String> map) {
        C6501b.C6502a.m13948a(str).mo12639a().mo12652a(map).mo12655b();
    }

    /* renamed from: a */
    public static final void m12462a(EnumC5706c cVar, boolean z) {
        String str;
        C89219l.m154721d(cVar, "");
        HashMap hashMap = new HashMap();
        m12466a(hashMap);
        m12475b(hashMap);
        hashMap.put("connection_type", cVar.getType());
        if (cVar == EnumC5706c.MANUAL_PK) {
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("is_oncemore", str);
        }
        C5737w.m12601a(hashMap, C4384b.C4385a.m10496a().f11968p);
        m12465a("livesdk_connection_invited_received", hashMap);
    }

    /* renamed from: b */
    public static final void m12474b(String str, long j) {
        String str2 = "";
        C89219l.m154721d(str, str2);
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            String idStr = room.getIdStr();
            if (idStr != null) {
                str2 = idStr;
            }
            hashMap.put("room_id", str2);
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            hashMap.put("action_type", str);
            hashMap.put("anchor_relationship", String.valueOf(j));
            m12465a("livesdk_anchor_refuse_guest_connection", hashMap);
        }
    }

    /* renamed from: a */
    public static void m12461a(EnumC5705b bVar, boolean z) {
        String str;
        C89219l.m154721d(bVar, "");
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        long c = b.mo13161c();
        HashMap hashMap = new HashMap();
        m12466a(hashMap);
        m12475b(hashMap);
        hashMap.put("request_from", bVar.getValue());
        C5737w.m12601a(hashMap, C4384b.C4385a.m10496a().f11968p);
        String str2 = "1";
        if (z) {
            str = str2;
        } else {
            str = "0";
        }
        hashMap.put("is_effective", str);
        hashMap.put("channel_id", String.valueOf(C4384b.C4385a.m10496a().f11957e));
        hashMap.put("pk_inviter_id", String.valueOf(c));
        hashMap.put("pk_invitee_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            RoomAuthStatus roomAuthStatus = room.getRoomAuthStatus();
            C89219l.m154716b(roomAuthStatus, "");
            if (!roomAuthStatus.isEnableGift()) {
                str2 = "0";
            }
            hashMap.put("is_from_gift_permission", str2);
        }
        m12465a("livesdk_pk_click", hashMap);
    }

    /* renamed from: b */
    public static void m12476b(boolean z, C11695b bVar) {
        String str;
        String str2;
        if (bVar != null) {
            HashMap hashMap = new HashMap();
            Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
            hashMap.put("connection_type", "manual_pk");
            int i = C5707c.f14471b[C4384b.C4385a.m10496a().f11968p.ordinal()];
            int i2 = 2;
            if (i == 1) {
                str = "manual_follow";
            } else if (i == 2) {
                str = "recommend";
            } else if (i != 3) {
                str = "none";
            } else {
                str = "random_match";
            }
            hashMap.put("invitee_list", str);
            if (z) {
                str2 = "anchor";
            } else {
                str2 = "user";
            }
            hashMap.put("user_type", str2);
            hashMap.put("pk_id", String.valueOf(C4947a.f12909a.mo10677b()));
            hashMap.put("channel_id", String.valueOf(C4384b.C4385a.m10496a().f11957e));
            if (room != null) {
                String idStr = room.getIdStr();
                C89219l.m154716b(idStr, "");
                hashMap.put("room_id", idStr);
            }
            hashMap.put("win_status", String.valueOf(bVar.f27978c));
            if (room != null) {
                if (bVar.f27976a == room.getOwnerUserId()) {
                    i2 = 1;
                }
                hashMap.put("anchor_type", String.valueOf(i2));
            }
            m12465a("livesdk_connection_win_show", hashMap);
        }
    }

    /* renamed from: a */
    public static final void m12464a(String str, long j) {
        C89219l.m154721d(str, "");
        HashMap hashMap = new HashMap();
        m12466a(hashMap);
        hashMap.put("request_page", str);
        hashMap.put("anchor_relationship", String.valueOf(j));
        m12465a("livesdk_guest_connection_icon_click", hashMap);
    }

    /* renamed from: b */
    public static void m12477b(boolean z, boolean z2) {
        String str;
        HashMap hashMap = new HashMap();
        m12466a(hashMap);
        m12475b(hashMap);
        m12470a(true, z, (Map<String, String>) hashMap);
        hashMap.put("inviter_id", String.valueOf(C4384b.C4385a.m10496a().f11958f));
        if (z2) {
            str = "accept";
        } else {
            str = "reject";
        }
        hashMap.put("selection", str);
        C5737w.m12601a(hashMap, C4384b.C4385a.m10496a().f11968p);
        long currentTimeMillis = System.currentTimeMillis();
        f14462d = currentTimeMillis;
        hashMap.put("time_stamp", String.valueOf(currentTimeMillis));
        hashMap.put("show_to_decide_dur", String.valueOf(f14462d - f14460b));
        C5737w.m12600a(hashMap);
        m12465a("livesdk_connection_invited", hashMap);
    }
}
