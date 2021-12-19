package com.bytedance.android.live.wallet;

import android.widget.CompoundButton;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.wallet.y */
final /* synthetic */ class C6396y implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final AbstractC6246a f15970a;

    static {
        Covode.recordClassIndex(7126);
    }

    C6396y(AbstractC6246a aVar) {
        this.f15970a = aVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.f15970a.mo12253a(Boolean.valueOf(z));
    }
}
