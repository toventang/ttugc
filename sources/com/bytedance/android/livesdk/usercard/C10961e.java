package com.bytedance.android.livesdk.usercard;

import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.liveinteract.api.EnumC4408av;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveHideAudienceFollowingSetting;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.usercard.e */
public final class C10961e {

    /* renamed from: a */
    public static final C10961e f26346a = new C10961e();

    private C10961e() {
    }

    static {
        Covode.recordClassIndex(12576);
    }

    /* renamed from: a */
    public static final boolean m19582a(long j, long j2, long j3, String str, long j4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (j == j3) {
            z = true;
        } else {
            z = false;
        }
        if (j2 == j) {
            z2 = true;
        } else {
            z2 = false;
        }
        EnumC4408av userRole = ((AbstractC4409b) C6193a.m13435a(AbstractC4409b.class)).getUserRole(j2);
        if (userRole == EnumC4408av.GUEST_AUDIENCE) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (userRole == EnumC4408av.GUEST_ANCHOR) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (j2 == j4) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z || z2 || z5 || z4 || C89219l.m154714a((Object) str, (Object) "hourly_rank") || C89219l.m154714a((Object) str, (Object) "mic_room") || ((z3 && C89219l.m154714a((Object) str, (Object) "guest_connection")) || !LiveHideAudienceFollowingSetting.INSTANCE.getValue())) {
            return false;
        }
        return true;
    }
}
