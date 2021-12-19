package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p456as.AbstractC6872f;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.aw */
public final class C11477aw {

    /* renamed from: a */
    public static final C11477aw f27539a = new C11477aw();

    private C11477aw() {
    }

    static {
        Covode.recordClassIndex(13136);
    }

    /* renamed from: a */
    public static void m20312a(DataChannel dataChannel, long j) {
        String str;
        C6501b a = C6501b.C6502a.m13948a("livesdk_balance_exchange_window_show").mo12643a(dataChannel).mo12646a("gift_id", j);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        C6501b a2 = a.mo12646a("user_id", b.mo13161c()).mo12651a("enter_from", "anchor_income");
        if (C11279p.m20029f()) {
            str = "1";
        } else {
            str = "0";
        }
        a2.mo12651a("is_anchor", str).mo12655b();
    }

    /* renamed from: b */
    public static void m20314b(DataChannel dataChannel, long j) {
        String str;
        C6501b a = C6501b.C6502a.m13948a("livesdk_balance_exchange_confirm").mo12643a(dataChannel).mo12651a("enter_from", "anchor_income");
        if (C11279p.m20029f()) {
            str = "1";
        } else {
            str = "0";
        }
        C6501b a2 = a.mo12651a("is_anchor", str).mo12646a("gift_id", j);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        a2.mo12646a("user_id", b.mo13161c()).mo12655b();
    }

    /* renamed from: c */
    public static void m20316c(DataChannel dataChannel, long j) {
        String str;
        C6501b a = C6501b.C6502a.m13948a("livesdk_balance_exchange_cancel").mo12643a(dataChannel).mo12651a("enter_from", "anchor_income");
        if (C11279p.m20029f()) {
            str = "1";
        } else {
            str = "0";
        }
        C6501b a2 = a.mo12651a("is_anchor", str).mo12646a("gift_id", j);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        a2.mo12646a("user_id", b.mo13161c()).mo12655b();
    }

    /* renamed from: a */
    public static void m20313a(DataChannel dataChannel, String str, long j) {
        String str2;
        C89219l.m154721d(str, "");
        C6501b a = C6501b.C6502a.m13948a("livesdk_balance_exchange_window_show").mo12643a(dataChannel).mo12651a("show_reason", str).mo12646a("gift_id", j);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        C6501b a2 = a.mo12646a("user_id", b.mo13161c()).mo12651a("enter_from", "ug_exchange");
        if (C11279p.m20029f()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        a2.mo12651a("is_anchor", str2).mo12655b();
    }

    /* renamed from: b */
    public static void m20315b(DataChannel dataChannel, String str, long j) {
        String str2;
        C89219l.m154721d(str, "");
        C6501b a = C6501b.C6502a.m13948a("livesdk_balance_exchange_confirm").mo12643a(dataChannel).mo12651a("request_from", str).mo12651a("enter_from", "ug_exchange");
        if (C11279p.m20029f()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C6501b a2 = a.mo12651a("is_anchor", str2).mo12646a("gift_id", j);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        a2.mo12646a("user_id", b.mo13161c()).mo12655b();
    }

    /* renamed from: c */
    public static void m20317c(DataChannel dataChannel, String str, long j) {
        String str2;
        C89219l.m154721d(str, "");
        C6501b a = C6501b.C6502a.m13948a("livesdk_balance_exchange_cancel").mo12643a(dataChannel).mo12651a("request_from", str).mo12651a("enter_from", "ug_exchange");
        if (C11279p.m20029f()) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        C6501b a2 = a.mo12651a("is_anchor", str2).mo12646a("gift_id", j);
        AbstractC6872f b = C11115u.m19743a().mo17915b();
        C89219l.m154716b(b, "");
        a2.mo12646a("user_id", b.mo13161c()).mo12655b();
    }
}
