package com.google.android.play.core.p1966e;

import android.app.Activity;
import android.content.IntentSender;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.common.AbstractC26970a;

/* renamed from: com.google.android.play.core.e.ar */
final class C27012ar implements AbstractC26970a {

    /* renamed from: a */
    final /* synthetic */ Activity f63923a;

    static {
        Covode.recordClassIndex(32488);
    }

    C27012ar(Activity activity) {
        this.f63923a = activity;
    }

    @Override // com.google.android.play.core.common.AbstractC26970a
    /* renamed from: a */
    public final void mo44412a(IntentSender intentSender, int i) {
        this.f63923a.startIntentSenderForResult(intentSender, i, null, 0, 0, 0);
    }
}
