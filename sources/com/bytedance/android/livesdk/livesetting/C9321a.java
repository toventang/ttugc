package com.bytedance.android.livesdk.livesetting;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live_settings.AbstractC6412d;
import com.bytedance.covode.number.Covode;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.livesetting.a */
public final class C9321a implements AbstractC6412d {
    static {
        Covode.recordClassIndex(10257);
    }

    @Override // com.bytedance.android.live_settings.AbstractC6412d
    /* renamed from: a */
    public final void mo12559a(String str, long j) {
        C89219l.m154721d(str, "");
        C3868c.m9491a("ttlive_settings_manager_performance_monitor", 0, C89041ag.m154412a(C89387v.m154943a(str, Long.valueOf(j))));
    }

    @Override // com.bytedance.android.live_settings.AbstractC6412d
    /* renamed from: a */
    public final void mo12560a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C3868c.m9491a("ttlive_settings_manager_monitor", 0, C89041ag.m154412a(C89387v.m154943a("exception", str + ", " + str2)));
    }
}
