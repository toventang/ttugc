package com.bytedance.android.livesdk.olddialog.giftpanellist.p601c;

import android.view.View;
import com.bytedance.android.livesdk.dialogv2.p516b.C8348d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.olddialog.giftpanellist.c.k */
final /* synthetic */ class View$OnClickListenerC10033k implements View.OnClickListener {

    /* renamed from: a */
    private final C10031j f24373a;

    static {
        Covode.recordClassIndex(11587);
    }

    View$OnClickListenerC10033k(C10031j jVar) {
        this.f24373a = jVar;
    }

    public final void onClick(View view) {
        C10031j jVar = this.f24373a;
        if (jVar.f24346j instanceof C8348d) {
            Prop prop = (Prop) jVar.f24346j.f21695b;
            if (prop == null || prop.count > 0) {
                jVar.f24347k.mo16819a(jVar.f24346j, jVar);
            } else if (prop.banner != null) {
                jVar.f24347k.mo16822a(prop.banner.f23249f, "gray_prop");
            }
        }
    }
}
