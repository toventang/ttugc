package com.p2082ss.android.ugc.asve.recorder.camera;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.C31016b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.a */
public final class C31161a implements AbstractC31186e {

    /* renamed from: a */
    public static final C31161a f74700a = new C31161a();

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31186e
    /* renamed from: a */
    public final boolean mo56704a() {
        return false;
    }

    private C31161a() {
    }

    static {
        Covode.recordClassIndex(37806);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31186e
    /* renamed from: a */
    public final boolean mo56705a(Context context, AbstractC31185d dVar, int i) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(dVar, "");
        if (dVar.mo56657a()) {
            int i2 = dVar.mo56696t().getInt("device_support_antishake_mode", -1);
            C31016b.f74339a.mo56122c("CameraDeviceAbility isSupportAntiShake:".concat(String.valueOf(i2)));
            if (i2 == 1) {
                return true;
            }
        } else if (-1 == dVar.mo56662b()) {
            return false;
        } else {
            dVar.mo56662b();
        }
        return false;
    }
}
