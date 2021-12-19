package com.bytedance.android.livesdk.p562k;

import android.os.Handler;
import android.view.View;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.k.g */
final /* synthetic */ class View$OnClickListenerC9154g implements View.OnClickListener {

    /* renamed from: a */
    private final DialogC9148b f22274a;

    static {
        Covode.recordClassIndex(10058);
    }

    View$OnClickListenerC9154g(DialogC9148b bVar) {
        this.f22274a = bVar;
    }

    public final void onClick(View view) {
        DialogC9148b bVar = this.f22274a;
        DialogC9148b.m17362a(false, bVar.f22206g);
        new Handler().postDelayed(new RunnableC9158k(bVar), 100);
    }
}
