package com.p2082ss.android.ugc.aweme.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import java.util.HashMap;

/* renamed from: com.ss.android.ugc.aweme.deeplink.y */
final /* synthetic */ class View$OnClickListenerC41071y implements View.OnClickListener {

    /* renamed from: a */
    private final UpdateTipActivity f96005a;

    static {
        Covode.recordClassIndex(48941);
    }

    View$OnClickListenerC41071y(UpdateTipActivity updateTipActivity) {
        this.f96005a = updateTipActivity;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        UpdateTipActivity updateTipActivity = this.f96005a;
        Intent intent = new Intent("android.intent.action.VIEW");
        try {
            intent.setData(Uri.parse("market://details?id=" + updateTipActivity.getPackageName()));
            intent.setPackage("com.android.vending");
            if (intent.resolveActivity(updateTipActivity.getPackageManager()) != null) {
                UpdateTipActivity.m82605a(updateTipActivity, intent);
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + updateTipActivity.getPackageName()));
                if (intent2.resolveActivity(updateTipActivity.getPackageManager()) != null) {
                    UpdateTipActivity.m82605a(updateTipActivity, intent2);
                }
            }
        } catch (Exception unused) {
            Intent intent3 = new Intent("android.intent.action.VIEW");
            intent3.setData(Uri.parse("https://play.google.com/store/apps/details?id=" + updateTipActivity.getPackageName()));
            if (intent3.resolveActivity(updateTipActivity.getPackageManager()) != null) {
                UpdateTipActivity.m82605a(updateTipActivity, intent3);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("schema_url", updateTipActivity.f95867a);
        hashMap.put("click_position", "update");
        C39162r.m79460a("schema_update_toast_click", hashMap);
    }
}
