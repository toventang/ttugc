package com.bytedance.android.livesdk.p562k;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.k.f */
final /* synthetic */ class View$OnClickListenerC9153f implements View.OnClickListener {

    /* renamed from: a */
    private final DialogC9148b f22273a;

    static {
        Covode.recordClassIndex(10057);
    }

    View$OnClickListenerC9153f(DialogC9148b bVar) {
        this.f22273a = bVar;
    }

    public final void onClick(View view) {
        DialogC9148b bVar = this.f22273a;
        if (!bVar.f22224y) {
            DialogC9148b.m17362a(false, bVar.f22206g);
            new Handler().postDelayed(new RunnableC9159l(bVar), 100);
        }
        if (bVar.f22219t != null) {
            bVar.f22219t.onClick(bVar, 1);
        }
    }
}
