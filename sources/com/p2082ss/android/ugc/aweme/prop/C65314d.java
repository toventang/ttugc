package com.p2082ss.android.ugc.aweme.prop;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.prop.C65241a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import p077b.AbstractC1729g;
import p077b.C1731i;

/* renamed from: com.ss.android.ugc.aweme.prop.d */
final /* synthetic */ class C65314d implements AbstractC1729g {

    /* renamed from: a */
    private final C65241a.C652472 f147426a;

    /* renamed from: b */
    private final Effect f147427b;

    static {
        Covode.recordClassIndex(76793);
    }

    C65314d(C65241a.C652472 r1, Effect effect) {
        this.f147426a = r1;
        this.f147427b = effect;
    }

    @Override // p077b.AbstractC1729g
    public final Object then(C1731i iVar) {
        C65241a.C652472 r3 = this.f147426a;
        Effect effect = this.f147427b;
        if (r3.mo104418a(iVar)) {
            return null;
        }
        C65241a.this.mo104409a(effect, C65241a.this.f147213k);
        return null;
    }
}
