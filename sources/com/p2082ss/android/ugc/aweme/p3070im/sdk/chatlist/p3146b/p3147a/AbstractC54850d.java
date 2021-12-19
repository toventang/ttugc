package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.p3146b.p3147a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.controller.helper.C54881c;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.d */
public abstract class AbstractC54850d extends AbstractC56237a {

    /* renamed from: f */
    public EnumC54851a f125628f = EnumC54851a.SUCCESS;

    static {
        Covode.recordClassIndex(64569);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    /* renamed from: d */
    public final void mo91863d() {
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    public String bL_() {
        return this.f128232k;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.service.p3261k.AbstractC56237a
    /* renamed from: e */
    public final long mo91864e() {
        long j = this.f128236o;
        try {
            C19638h a = AbstractC17420a.C17421a.m32276a().mo27720a(bL_());
            if (a != null) {
                return Math.max(C54881c.m100496b(a), j);
            }
        } catch (Exception e) {
            C51423a.m95788a("", e);
        }
        return j;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.b.a.d$a */
    public enum EnumC54851a {
        SENDING,
        FAILED,
        SUCCESS;

        static {
            Covode.recordClassIndex(64570);
        }
    }

    /* renamed from: a */
    public static EnumC54851a m100445a(int i) {
        if (i == 0 || i == 1) {
            return EnumC54851a.SENDING;
        }
        if (i != 3) {
            return EnumC54851a.SUCCESS;
        }
        return EnumC54851a.FAILED;
    }
}
