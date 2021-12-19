package com.p2082ss.android.ugc.aweme.profile.widgets.common;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.profile.api.C63429c;
import com.p2082ss.android.ugc.aweme.profile.api.C63431e;
import com.p2082ss.android.ugc.aweme.profile.api.C63434h;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.d */
public final class C64588d implements AbstractC12644a<AbstractC64591f> {

    /* renamed from: a */
    public final AbstractC64591f f146308a = new C64589a();

    static {
        Covode.recordClassIndex(76054);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.d$a */
    public static final class C64589a implements AbstractC64591f {
        static {
            Covode.recordClassIndex(76055);
        }

        C64589a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64591f
        /* renamed from: a */
        public final Object mo104147a(int i) {
            C63431e.m115024a();
            String a = C63429c.m115019a(C31575b.m65865g().getCurSecUserId(), C31575b.m65865g().getCurUserId(), null, i, false);
            C63434h.m115029a(a);
            return C63429c.m115017a(a, null);
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC64591f mo20458a() {
        return this.f146308a;
    }
}
