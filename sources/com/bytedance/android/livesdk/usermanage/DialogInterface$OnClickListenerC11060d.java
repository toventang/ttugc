package com.bytedance.android.livesdk.usermanage;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.p425aa.C6501b;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.usermanage.d */
final /* synthetic */ class DialogInterface$OnClickListenerC11060d implements DialogInterface.OnClickListener {

    /* renamed from: a */
    private final DialogC11058b f26618a;

    static {
        Covode.recordClassIndex(12681);
    }

    DialogInterface$OnClickListenerC11060d(DialogC11058b bVar) {
        this.f26618a = bVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        DialogC11058b bVar = this.f26618a;
        C6501b.C6502a.m13948a("blocked_list_toast_click").mo12652a(bVar.mo17886c()).mo12654b("relation").mo12658d("live_detail").mo12656c("click").mo12661f("no").mo12655b();
        if (bVar.isShowing()) {
            bVar.dismiss();
        }
        C6779a.m14563a().mo13053a(new C11061e(1));
    }
}
