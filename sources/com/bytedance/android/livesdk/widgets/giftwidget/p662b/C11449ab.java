package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import android.content.DialogInterface;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.service.p625c.p630e.C10742a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.ab */
public final /* synthetic */ class C11449ab implements LiveDialog.AbstractC4057b {

    /* renamed from: a */
    private final C11505v f27467a;

    /* renamed from: b */
    private final String f27468b;

    static {
        Covode.recordClassIndex(13108);
    }

    C11449ab(C11505v vVar, String str) {
        this.f27467a = vVar;
        this.f27468b = str;
    }

    @Override // com.bytedance.android.live.design.app.LiveDialog.AbstractC4057b
    /* renamed from: a */
    public final void mo8359a(DialogInterface dialogInterface) {
        C11505v vVar = this.f27467a;
        String str = this.f27468b;
        ((IActionHandlerService) C6193a.m13435a(IActionHandlerService.class)).handle(vVar.f27578a, "aweme://webview/?url=https%3a%2f%2fwww.tiktok.com%2ffalcon%2ffe_tiktok_common%2ffaq%2ffeedback%2f%3Fhide_nav_bar%3D1%26feedback_id%3D15889&hide_nav_bar=1");
        C10742a.m19333a(str, "contact_us");
    }
}
