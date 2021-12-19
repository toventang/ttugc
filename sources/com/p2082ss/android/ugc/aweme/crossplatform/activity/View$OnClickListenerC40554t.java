package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.C13340a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.utils.C80228av;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.t */
public final /* synthetic */ class View$OnClickListenerC40554t implements View.OnClickListener {

    /* renamed from: a */
    private final C40553s f94889a;

    static {
        Covode.recordClassIndex(48375);
    }

    View$OnClickListenerC40554t(C40553s sVar) {
        this.f94889a = sVar;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C40553s sVar = this.f94889a;
        int id = view.getId();
        sVar.mo69674a().dismiss();
        String currentUrl = sVar.f94886f.mo67258f().getCurrentUrl();
        if (id == R.id.cwu) {
            Activity activity = sVar.f94885e;
            if (!C13627m.m24498a(currentUrl)) {
                try {
                    Intent intent = new Intent();
                    intent.setData(Uri.parse(currentUrl));
                    intent.setAction("android.intent.action.VIEW");
                    C84349a.m145093a(intent, activity);
                    activity.startActivity(intent);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else if (id == R.id.aeg) {
            Activity activity2 = sVar.f94885e;
            PrivacyCert build = PrivacyCert.Builder.with("bpea-214").usage("").tag("PopupWindowManager_copyLink").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build();
            if (!C13627m.m24498a(currentUrl)) {
                try {
                    C80228av.m139063a("", currentUrl, activity2, build);
                } catch (C13340a e2) {
                    C51423a.m95786a((Exception) e2);
                }
                new C23144b(activity2).mo37636b(2131231922).mo37640e(R.string.gfg).mo37637b();
            }
        } else if (id == R.id.dh9) {
            sVar.f94886f.mo67258f().mo67259g();
        }
    }
}
