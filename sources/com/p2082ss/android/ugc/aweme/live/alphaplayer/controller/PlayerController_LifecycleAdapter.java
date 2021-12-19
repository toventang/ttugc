package com.p2082ss.android.ugc.aweme.live.alphaplayer.controller;

import androidx.lifecycle.AbstractC1191e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1212s;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerController_LifecycleAdapter */
public class PlayerController_LifecycleAdapter implements AbstractC1191e {

    /* renamed from: a */
    final PlayerController f133327a;

    static {
        Covode.recordClassIndex(68833);
    }

    PlayerController_LifecycleAdapter(PlayerController playerController) {
        this.f133327a = playerController;
    }

    @Override // androidx.lifecycle.AbstractC1191e
    /* renamed from: a */
    public final void mo4008a(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar, boolean z, C1212s sVar) {
        boolean z2;
        if (sVar != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
                if (!z2 || sVar.mo4028a("onPause", 1)) {
                    this.f133327a.onPause();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
                if (!z2 || sVar.mo4028a("onResume", 1)) {
                    this.f133327a.onResume();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
                if (!z2 || sVar.mo4028a("onStop", 1)) {
                    this.f133327a.onStop();
                }
            } else if (aVar != AbstractC1196i.EnumC1198a.ON_DESTROY) {
            } else {
                if (!z2 || sVar.mo4028a("onDestroy", 1)) {
                    this.f133327a.onDestroy();
                }
            }
        }
    }
}
