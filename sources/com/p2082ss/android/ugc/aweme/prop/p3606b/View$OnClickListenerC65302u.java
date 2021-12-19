package com.p2082ss.android.ugc.aweme.prop.p3606b;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;

/* renamed from: com.ss.android.ugc.aweme.prop.b.u */
final /* synthetic */ class View$OnClickListenerC65302u implements View.OnClickListener {

    /* renamed from: a */
    private final C65283j f147398a;

    static {
        Covode.recordClassIndex(76781);
    }

    View$OnClickListenerC65302u(C65283j jVar) {
        this.f147398a = jVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C65283j jVar = this.f147398a;
        if (((double) view.getAlpha()) >= 1.0E-6d) {
            C39162r.m79460a("click_prop_maker_entrance", new C33744d().mo59983a("prop_id", jVar.f147347ap.f169545id).mo59983a("enter_from", "prop_page").f79943a);
            Context context = jVar.getContext();
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setData(Uri.parse(SharePrefCache.inst().getStickerArtlistUrl().mo59941c()));
            intent.putExtra("use_webview_title", true);
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }
    }
}
