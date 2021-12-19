package com.bytedance.android.live.liveinteract.platform.common.p376g;

import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.EnumC4442m;
import com.bytedance.android.live.liveinteract.api.p260a.C4384b;
import com.bytedance.android.live.liveinteract.cohost.p263a.p266c.C4502a;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveRandomLinkmicSetting;
import com.bytedance.android.livesdk.model.RandomLinkMicSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.g.w */
public final class C5737w {
    static {
        Covode.recordClassIndex(6335);
    }

    /* renamed from: b */
    public static final void m12602b() {
        Integer num;
        C6501b a = C6501b.C6502a.m13948a("livesdk_connection_banned").mo12639a().mo12651a("invitee_list", C4502a.f12085q.getType()).mo12651a("connection_type", "anchor");
        RandomLinkMicSetting value = LiveRandomLinkmicSetting.INSTANCE.getValue();
        if (value != null) {
            num = Integer.valueOf(value.banTime);
        } else {
            num = null;
        }
        a.mo12645a("banned_time", num.intValue()).mo12655b();
    }

    /* renamed from: a */
    public static final void m12599a() {
        C6501b.C6502a.m13948a("livesdk_connection_overtime").mo12639a().mo12651a("invitee_list", C4502a.f12085q.getType()).mo12651a("connection_type", "anchor").mo12655b();
    }

    /* renamed from: a */
    public static final String m12598a(EnumC4442m mVar) {
        C89219l.m154721d(mVar, "");
        int i = C5738x.f14557a[mVar.ordinal()];
        if (i == 1) {
            return "mutual_follow";
        }
        if (i == 2) {
            return "recommend";
        }
        if (i != 3) {
            return "";
        }
        return C4502a.f12085q.getType();
    }

    /* renamed from: a */
    public static final void m12600a(Map<String, String> map) {
        C89219l.m154721d(map, "");
        try {
            if (!C4384b.C4385a.m10496a().f11969q) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!TextUtils.isEmpty(C4502a.f12084p)) {
                map.put("match_id", C4502a.f12084p);
            } else {
                throw new IllegalStateException("Check failed.".toString());
            }
        } catch (IllegalStateException unused) {
        }
    }

    /* renamed from: a */
    public static final void m12601a(Map<String, String> map, EnumC4442m mVar) {
        C89219l.m154721d(map, "");
        C89219l.m154721d(mVar, "");
        int i = C5738x.f14559c[mVar.ordinal()];
        if (i == 1) {
            map.put("invitee_list", "mutual_follow");
        } else if (i == 2) {
            map.put("invitee_list", "recommend");
        } else if (i == 3) {
            map.put("invitee_list", "random_match");
            map.put("is_change_pairing", "0");
            map.put("is_system_rematching", "0");
            int i2 = C5738x.f14558b[C4502a.f12085q.ordinal()];
            if (i2 == 1) {
                map.put("is_change_pairing", "1");
            } else if (i2 == 2) {
                map.put("is_system_rematching", "1");
            }
        }
    }
}
