package com.p2082ss.android.ugc.asve.recorder;

import androidx.lifecycle.AbstractC1191e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1212s;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl_LifecycleAdapter */
public class VERecorderImpl_LifecycleAdapter implements AbstractC1191e {

    /* renamed from: a */
    final VERecorderImpl f74564a;

    static {
        Covode.recordClassIndex(37759);
    }

    VERecorderImpl_LifecycleAdapter(VERecorderImpl vERecorderImpl) {
        this.f74564a = vERecorderImpl;
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
            if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
                if (!z2 || sVar.mo4028a("onResume", 1)) {
                    this.f74564a.onResume();
                }
            } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
                if (!z2 || sVar.mo4028a("onPause", 1)) {
                    this.f74564a.onPause();
                }
            } else if (aVar != AbstractC1196i.EnumC1198a.ON_DESTROY) {
            } else {
                if (!z2 || sVar.mo4028a("release", 1)) {
                    this.f74564a.release();
                }
            }
        }
    }
}
