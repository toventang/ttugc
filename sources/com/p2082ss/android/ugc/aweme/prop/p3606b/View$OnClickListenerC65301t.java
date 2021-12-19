package com.p2082ss.android.ugc.aweme.prop.p3606b;

import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.GreenScreenMaterial;

/* renamed from: com.ss.android.ugc.aweme.prop.b.t */
final /* synthetic */ class View$OnClickListenerC65301t implements View.OnClickListener {

    /* renamed from: a */
    private final C65283j f147397a;

    static {
        Covode.recordClassIndex(76780);
    }

    View$OnClickListenerC65301t(C65283j jVar) {
        this.f147397a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C65283j jVar = this.f147397a;
        C39162r.m79460a("click_media_type_dropdown", new C33744d().mo59983a("prop_id", jVar.f147347ap == null ? "" : jVar.f147347ap.f169545id).mo59983a("media_type", GreenScreenMaterial.Companion.getMEDIA_TYPE_STRING()[jVar.f147345an]).f79943a);
        jVar.f147305a.show(jVar.getChildFragmentManager(), "MediaFilterFragment");
    }
}
