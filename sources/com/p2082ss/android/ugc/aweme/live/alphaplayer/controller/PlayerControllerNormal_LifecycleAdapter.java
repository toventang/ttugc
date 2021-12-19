package com.p2082ss.android.ugc.aweme.live.alphaplayer.controller;

import androidx.lifecycle.AbstractC1191e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1212s;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.controller.PlayerControllerNormal_LifecycleAdapter */
public class PlayerControllerNormal_LifecycleAdapter implements AbstractC1191e {

    /* renamed from: a */
    final PlayerControllerNormal f133326a;

    static {
        Covode.recordClassIndex(68832);
    }

    PlayerControllerNormal_LifecycleAdapter(PlayerControllerNormal playerControllerNormal) {
        this.f133326a = playerControllerNormal;
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
                    this.f133326a.onPause();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
                if (!z2 || sVar.mo4028a("onResume", 1)) {
                    this.f133326a.onResume();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
                if (!z2 || sVar.mo4028a("onStop", 1)) {
                    this.f133326a.onStop();
                }
            } else if (aVar != AbstractC1196i.EnumC1198a.ON_DESTROY) {
            } else {
                if (!z2 || sVar.mo4028a("onDestroy", 1)) {
                    this.f133326a.onDestroy();
                }
            }
        }
    }
}
