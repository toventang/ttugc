package com.bytedance.android.live.liveinteract.platform.common.p376g;

import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.p261b.EnumC4422k;
import com.bytedance.android.live.liveinteract.multilive.p359b.C5586a;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.p561j.C9009ac;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.g */
public final class C5712g {

    /* renamed from: a */
    public static long f14476a;

    /* renamed from: b */
    public static String f14477b = "";

    /* renamed from: c */
    public static final C5712g f14478c = new C5712g();

    private C5712g() {
    }

    static {
        Covode.recordClassIndex(6310);
    }

    /* renamed from: a */
    public static final void m12498a(String str, EnumC4422k kVar) {
        C89219l.m154721d(str, "");
        if (f14476a > 0) {
            m12499b(str, kVar);
        }
    }

    /* renamed from: b */
    private static void m12499b(String str, EnumC4422k kVar) {
        HashMap hashMap = new HashMap();
        Room room = (Room) DataChannelGlobal.f42558d.mo28324b(C9009ac.class);
        if (room != null) {
            hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
            String idStr = room.getIdStr();
            C89219l.m154716b(idStr, "");
            hashMap.put("room_id", idStr);
            hashMap.put("duration", String.valueOf((System.currentTimeMillis() - f14476a) / 1000));
            hashMap.put("live_type", "video_live");
            hashMap.put("connection_over_type", str);
            User owner = room.getOwner();
            C89219l.m154716b(owner, "");
            FollowInfo followInfo = owner.getFollowInfo();
            C89219l.m154716b(followInfo, "");
            hashMap.put("anchor_relationship", String.valueOf(followInfo.getFollowStatus()));
            hashMap.put("guest_invite_type", f14477b);
            hashMap.put("enter_method", C6544e.m13990d());
            hashMap.put("enter_from_merge", C6544e.m13987a());
            hashMap.put("action_type", C6544e.m13991e());
            hashMap.put("layout_setting", C5586a.m12128a(kVar).getFirst());
            hashMap.put("window_setting", C5586a.m12128a(kVar).getSecond());
            C6501b.C6502a.m13948a("livesdk_guest_connection_over").mo12652a((Map<String, String>) hashMap).mo12655b();
        }
        f14476a = 0;
    }
}
