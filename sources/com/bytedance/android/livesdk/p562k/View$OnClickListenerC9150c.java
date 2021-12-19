package com.bytedance.android.livesdk.p562k;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.k.c */
final /* synthetic */ class View$OnClickListenerC9150c implements View.OnClickListener {

    /* renamed from: a */
    private final DialogC9148b f22270a;

    static {
        Covode.recordClassIndex(10054);
    }

    View$OnClickListenerC9150c(DialogC9148b bVar) {
        this.f22270a = bVar;
    }

    public final void onClick(View view) {
        DialogC9148b bVar = this.f22270a;
        if (!bVar.f22223x) {
            DialogC9148b.m17362a(false, bVar.f22206g);
            new Handler().postDelayed(new RunnableC9152e(bVar), 100);
        }
        if (bVar.f22218s != null) {
            bVar.f22218s.onClick(bVar, 0);
        }
    }
}
