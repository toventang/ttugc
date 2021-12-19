package com.p2082ss.android.ugc.asve.recorder.camera;

import androidx.lifecycle.AbstractC1191e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1212s;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController_LifecycleAdapter */
public class VECameraController_LifecycleAdapter implements AbstractC1191e {

    /* renamed from: a */
    final VECameraController f74699a;

    static {
        Covode.recordClassIndex(37805);
    }

    VECameraController_LifecycleAdapter(VECameraController vECameraController) {
        this.f74699a = vECameraController;
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
            if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
                if (!z2 || sVar.mo4028a("onCreate", 1)) {
                    this.f74699a.onCreate();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
                if (!z2 || sVar.mo4028a("onStop", 1)) {
                    this.f74699a.onStop();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
                if (!z2 || sVar.mo4028a("onResume", 1)) {
                    this.f74699a.onResume();
                }
            } else if (aVar != AbstractC1196i.EnumC1198a.ON_DESTROY) {
            } else {
                if (!z2 || sVar.mo4028a("onDestroy", 1)) {
                    this.f74699a.onDestroy();
                }
            }
        }
    }
}
