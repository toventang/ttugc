package com.bytedance.android.live.wallet.model;

import android.view.View;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.wallet.model.b */
public final /* synthetic */ class View$OnClickListenerC6379b implements View.OnClickListener {

    /* renamed from: a */
    private final AbstractC6377a f15937a;

    static {
        Covode.recordClassIndex(7109);
    }

    View$OnClickListenerC6379b(AbstractC6377a aVar) {
        this.f15937a = aVar;
    }

    public final void onClick(View view) {
        AbstractC6377a aVar = this.f15937a;
        if (aVar.f15936r != null) {
            aVar.f15936r.mo12277a(aVar, aVar.f15926h.isChecked());
        }
    }
}
