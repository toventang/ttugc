package com.p2082ss.android.ugc.aweme.profile;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.profile.q */
public final /* synthetic */ class RunnableC63863q implements Runnable {

    /* renamed from: a */
    private final C63810k f144788a;

    static {
        Covode.recordClassIndex(75287);
    }

    RunnableC63863q(C63810k kVar) {
        this.f144788a = kVar;
    }

    public final void run() {
        ActivityC0945e activity = this.f144788a.getActivity();
        if (activity != null) {
            ScrollSwitchStateManager.C52950a.m97811a(activity).mo89345a(false);
        }
    }
}
