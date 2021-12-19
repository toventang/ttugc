package com.bytedance.android.livesdk.p424a;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.a.g */
final /* synthetic */ class View$OnClickListenerC6426g implements View.OnClickListener {

    /* renamed from: a */
    private final User f16020a;

    static {
        Covode.recordClassIndex(7162);
    }

    View$OnClickListenerC6426g(User user) {
        this.f16020a = user;
    }

    public final void onClick(View view) {
        C6779a.m14563a().mo13053a(new UserProfileEvent(this.f16020a));
    }
}
