package com.p2082ss.android.ugc.aweme.commercialize.tasks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18143b;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18144c;
import com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18145d;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a.C38499b;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a.C38500c;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a.C38501d;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a.C38502e;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a.C38504f;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a.C38505g;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a.C38506h;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a.C38507i;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a.C38508j;
import com.p2082ss.android.ugc.aweme.commercialize.tasks.p2616a.C38513k;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.tasks.c */
public final class C38516c implements AbstractC18145d {

    /* renamed from: a */
    public static final C38516c f91022a = new C38516c();

    private C38516c() {
    }

    static {
        Covode.recordClassIndex(46042);
    }

    @Override // com.bytedance.ies.ugc.aweme.rich.p1271c.p1272a.AbstractC18145d
    /* renamed from: a */
    public final AbstractC18143b mo28930a(int i, AbstractC18144c cVar, Bundle bundle) {
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bundle, "");
        switch (i) {
            case 0:
                return new C38502e(cVar, bundle);
            case 1:
                return new C38508j(cVar, bundle);
            case 2:
                return new C38513k(cVar, bundle);
            case 3:
                return new C38504f(cVar, bundle);
            case 4:
                return new C38506h(cVar, bundle);
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                return new C38507i(cVar, bundle);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                return new C38501d(cVar, bundle);
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return new C38500c(cVar, bundle);
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                return new C38505g(cVar, bundle);
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                return new C38499b(cVar, bundle);
            default:
                return null;
        }
    }
}
