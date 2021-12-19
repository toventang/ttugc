package com.p2082ss.android.ugc.aweme.prop.p3606b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.prop.p3606b.C65283j;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import p077b.AbstractC1729g;
import p077b.C1743j;

/* renamed from: com.ss.android.ugc.aweme.prop.b.y */
final /* synthetic */ class C65306y implements IAVEffectService.IAVEffectReadyCallback {

    /* renamed from: a */
    private final C65283j.C652841 f147406a;

    /* renamed from: b */
    private final C1743j f147407b;

    /* renamed from: c */
    private final AbstractC1729g f147408c;

    static {
        Covode.recordClassIndex(76785);
    }

    C65306y(C65283j.C652841 r1, C1743j jVar, AbstractC1729g gVar) {
        this.f147406a = r1;
        this.f147407b = jVar;
        this.f147408c = gVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public final void finish(Object obj) {
        C65283j.C652841 r0 = this.f147406a;
        C1743j jVar = this.f147407b;
        AbstractC1729g gVar = this.f147408c;
        AbstractC46415f fVar = (AbstractC46415f) obj;
        C65283j.this.f147353av = fVar;
        jVar.mo5555a(fVar);
        jVar.f5610a.mo5532a(gVar);
    }
}
