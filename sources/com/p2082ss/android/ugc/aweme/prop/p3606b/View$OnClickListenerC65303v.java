package com.p2082ss.android.ugc.aweme.prop.p3606b;

import android.os.Bundle;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.prop.b.v */
public final /* synthetic */ class View$OnClickListenerC65303v implements View.OnClickListener {

    /* renamed from: a */
    private final C65283j f147399a;

    /* renamed from: b */
    private final Map f147400b;

    /* renamed from: c */
    private final int f147401c;

    /* renamed from: d */
    private final C75445g f147402d;

    /* renamed from: e */
    private final Bundle f147403e;

    static {
        Covode.recordClassIndex(76782);
    }

    View$OnClickListenerC65303v(C65283j jVar, Map map, int i, C75445g gVar, Bundle bundle) {
        this.f147399a = jVar;
        this.f147400b = map;
        this.f147401c = i;
        this.f147402d = gVar;
        this.f147403e = bundle;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C65283j jVar = this.f147399a;
        Map map = this.f147400b;
        int i = this.f147401c;
        C75445g gVar = this.f147402d;
        Bundle bundle = this.f147403e;
        C39162r.m79460a("donation_effect_banner_click", map);
        DonationServiceImpl.m86009b().mo73342b(i, gVar.f169545id, bundle).show(jVar.getChildFragmentManager(), "DonationDialogFragment");
    }
}
