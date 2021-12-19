package com.bytedance.android.livesdk.p562k;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.k.d */
final /* synthetic */ class View$OnClickListenerC9151d implements View.OnClickListener {

    /* renamed from: a */
    private final DialogC9148b f22271a;

    static {
        Covode.recordClassIndex(10055);
    }

    View$OnClickListenerC9151d(DialogC9148b bVar) {
        this.f22271a = bVar;
    }

    public final void onClick(View view) {
        DialogC9148b bVar = this.f22271a;
        if (!bVar.f22222w) {
            DialogC9148b.m17362a(false, bVar.f22206g);
            new Handler().postDelayed(new RunnableC9160m(bVar), 100);
        }
        if (bVar.f22217r != null) {
            bVar.f22217r.onClick(bVar, 1);
        }
    }
}
