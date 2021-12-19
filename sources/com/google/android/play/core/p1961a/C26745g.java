package com.google.android.play.core.p1961a;

import android.app.Activity;
import android.content.IntentSender;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.common.AbstractC26970a;

/* renamed from: com.google.android.play.core.a.g */
final class C26745g implements AbstractC26970a {

    /* renamed from: a */
    final /* synthetic */ Activity f63360a;

    static {
        Covode.recordClassIndex(32217);
    }

    C26745g(Activity activity) {
        this.f63360a = activity;
    }

    @Override // com.google.android.play.core.common.AbstractC26970a
    /* renamed from: a */
    public final void mo44412a(IntentSender intentSender, int i) {
        this.f63360a.startIntentSenderForResult(intentSender, i, null, 0, 0, 0, null);
    }
}
