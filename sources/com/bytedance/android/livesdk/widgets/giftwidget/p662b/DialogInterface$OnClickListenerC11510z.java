package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveSdkAppealWebviewSetting;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.z */
public final /* synthetic */ class DialogInterface$OnClickListenerC11510z implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final C11505v f27589a;

    static {
        Covode.recordClassIndex(13169);
    }

    DialogInterface$OnClickListenerC11510z(C11505v vVar) {
        this.f27589a = vVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C11505v vVar = this.f27589a;
        dialogInterface.dismiss();
        String value = LiveSdkAppealWebviewSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            if (((IHostApp) C6193a.m13435a(IHostApp.class)).isInMusicallyRegion()) {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast-va.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            } else {
                value = "sslocal://webcast_webview?url=https%3A%2F%2Fwebcast.tiktokv.com%2Ffalcon%2Fwebcast_mt%2Fpage%2Fappeal%2Findex.html&type=fullscreen&title=&hide_more=0&hide_nav_bar=1&hide_status_bar=0";
            }
        }
        ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(vVar.f27578a, value);
        if (C11115u.m19743a().mo17915b() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("user_id", String.valueOf(C11115u.m19743a().mo17915b().mo13161c()));
            C6501b.C6502a.m13948a("livesdk_anchor_click_contact_us").mo12643a(vVar.f27579b).mo12652a((Map<String, String>) hashMap).mo12655b();
        }
    }
}
