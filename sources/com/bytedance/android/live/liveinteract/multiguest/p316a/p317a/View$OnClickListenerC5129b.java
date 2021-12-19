package com.bytedance.android.live.liveinteract.multiguest.p316a.p317a;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.p218f.p219a.C3899h;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.p449am.C6779a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.live.liveinteract.multiguest.a.a.b */
final /* synthetic */ class View$OnClickListenerC5129b implements View.OnClickListener {

    /* renamed from: a */
    static final View.OnClickListener f13312a = new View$OnClickListenerC5129b();

    static {
        Covode.recordClassIndex(5721);
    }

    private View$OnClickListenerC5129b() {
    }

    public final void onClick(View view) {
        Object a = C3899h.m9527a(view, String.valueOf(view.getId()));
        if (a != null) {
            C6779a.m14563a().mo13053a(new UserProfileEvent((User) a, "guest_waiting_list"));
        }
    }
}
