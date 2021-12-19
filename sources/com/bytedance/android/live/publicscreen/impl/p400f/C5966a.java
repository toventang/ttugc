package com.bytedance.android.live.publicscreen.impl.p400f;

import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.liveinteract.api.AbstractC4409b;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.chatroom.C7411d;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.f.a */
public final class C5966a {

    /* renamed from: a */
    public int f14980a;

    /* renamed from: b */
    public boolean f14981b;

    /* renamed from: c */
    public DataChannel f14982c;

    static {
        Covode.recordClassIndex(6574);
    }

    /* renamed from: a */
    public final void mo11855a(boolean z, String str) {
        if (this.f14981b != z) {
            if (z) {
                this.f14980a = 0;
            } else if (this.f14980a < 0) {
                C6501b a = C6501b.C6502a.m13948a("livesdk_comment_slide_up").mo12643a(this.f14982c);
                AbstractC2953a a2 = C6193a.m13435a(AbstractC4409b.class);
                C89219l.m154716b(a2, "");
                C6501b a3 = a.mo12651a("comment_slide_up_scene", ((AbstractC4409b) a2).getRoomScene()).mo12651a("admin_type", str);
                C7411d a4 = C7411d.m15284a();
                C89219l.m154716b(a4, "");
                a3.mo12651a("enter_live_method", a4.mo13614e()).mo12655b();
            }
            this.f14981b = z;
        }
    }
}
