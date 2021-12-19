package com.bytedance.android.live.liveinteract.platform.common.p376g;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.api.p262c.C4431e;
import com.bytedance.android.live.liveinteract.multiguest.opt.p337a.C5271a;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.android.livesdk.p458b.p459a.C6894d;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.p2082ss.avframework.livestreamv2.core.interact.model.Config;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.a */
public final class C5702a {

    /* renamed from: a */
    public static final C5702a f14458a = new C5702a();

    private C5702a() {
    }

    static {
        Covode.recordClassIndex(6300);
    }

    /* renamed from: a */
    public static final void m12447a(String str) {
        C89219l.m154721d(str, "");
        m12449a(str, "");
    }

    /* renamed from: b */
    public static final void m12455b(String str) {
        C89219l.m154721d(str, "");
        m12456b(str, "");
    }

    /* renamed from: b */
    private static void m12457b(Map<String, Object> map) {
        C6894d a = C6894d.m14753a();
        C5271a aVar = (C5271a) C4431e.f12034a.mo10199a("MULTI_GUEST_DATA_HOLDER");
        C89219l.m154716b(a, "");
        map.put("opened", a.f17248n);
        map.put("anchorLinkMicId", a.f17259d);
        map.put("linkMicId", a.f17260e);
        Config.Vendor fromValue = Config.Vendor.fromValue(a.f17261f);
        C89219l.m154716b(fromValue, "");
        map.put("linkMicVendor", Integer.valueOf(fromValue.getValue()));
        if (aVar == null || !aVar.f13637h) {
            map.put("rtcExtInfo", a.f17262g);
            return;
        }
        String str = aVar.f13647r;
        if (str == null) {
            str = a.f17262g;
        }
        map.put("rtcExtInfo", str);
    }

    /* renamed from: a */
    private static void m12452a(Map<String, ? extends Object> map) {
        C89219l.m154721d(map, "");
        C6555i.m14021b().mo9215a("ttlive_interact", map);
    }

    /* renamed from: a */
    public static final void m12448a(String str, Room room) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(room, "");
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        m12453a(hashMap, room);
        m12452a(hashMap);
    }

    /* renamed from: b */
    public static final void m12456b(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        hashMap.put("extra", str2);
        m12457b(hashMap);
        m12452a(hashMap);
    }

    /* renamed from: a */
    public static final void m12449a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        hashMap.put("extra", str2);
        m12452a(hashMap);
    }

    /* renamed from: a */
    public static final void m12450a(String str, boolean z) {
        C89219l.m154721d(str, "");
        m12451a(str, z, "");
    }

    /* renamed from: a */
    private static void m12453a(Map<String, Object> map, Room room) {
        Integer num;
        map.put("roomId", Long.valueOf(room.getId()));
        map.put("owner_user_id", Long.valueOf(room.getOwnerUserId()));
        User owner = room.getOwner();
        if (owner != null) {
            num = Integer.valueOf(owner.getLinkMicStats());
        } else {
            num = null;
        }
        map.put("link_mic_stats", num);
        map.put("with_linkmic", Boolean.valueOf(room.isWithLinkMic()));
        map.put("linkmic_info", C4139e.C4140a.f11575b.mo46674b(room.getLinkMicInfo()));
    }

    /* renamed from: a */
    private static void m12454a(boolean z, Map<String, Object> map) {
        String str;
        C4384b a = C4384b.C4385a.m10496a();
        if (!z) {
            str = "audience";
        } else if (a.f11969q) {
            str = "inviter";
        } else {
            str = "invitee";
        }
        map.put("role", str);
        map.put("inviteType", Integer.valueOf(a.f11968p.getType()));
        map.put("channelId", Long.valueOf(a.f11957e));
        map.put("fromRoomId", Long.valueOf(a.f11960h));
        map.put("currentRoomId", Long.valueOf(a.f11950am));
        map.put("linkMicId", a.f11922L);
        map.put("guestLinkMicId", a.f11923M);
        map.put("guestUserId", Long.valueOf(a.f11958f));
        map.put("linkMicVendor", Integer.valueOf(a.mo10153d().getValue()));
        map.put("rtcExtInfo", a.f11974v);
        map.put("duration", Integer.valueOf(a.f11970r));
    }

    /* renamed from: a */
    public static final void m12451a(String str, boolean z, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        HashMap hashMap = new HashMap();
        hashMap.put("event", str);
        hashMap.put("extra", str2);
        m12454a(z, hashMap);
        m12452a(hashMap);
    }
}
