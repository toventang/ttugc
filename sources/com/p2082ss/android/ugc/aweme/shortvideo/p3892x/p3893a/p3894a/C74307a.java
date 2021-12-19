package com.p2082ss.android.ugc.aweme.shortvideo.p3892x.p3893a.p3894a;

import android.content.Context;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.camera.AbstractC29994a;
import com.p2082ss.android.ugc.asve.C31016b;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d;
import com.p2082ss.android.ugc.asve.recorder.camera.C31165b;
import com.p2082ss.android.ugc.asve.recorder.camera.p2224c.C31182a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.x.a.a.a */
public final class C74307a extends C31182a {
    static {
        Covode.recordClassIndex(87079);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.C31182a
    /* renamed from: a */
    public final int mo56734a() {
        if (this.f74772f) {
            return 2;
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.C31182a
    /* renamed from: b */
    public final boolean mo56737b() {
        Context context = this.f74769c;
        C89219l.m154716b(context, "");
        AbstractC31185d dVar = this.f74768b;
        C89219l.m154716b(dVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(dVar, "");
        if (dVar.mo56657a()) {
            int i = dVar.mo56696t().getInt("device_support_wide_angle_mode", -1);
            C31016b.f74339a.mo56122c("CameraDeviceAbility isSupportWideAngle:".concat(String.valueOf(i)));
            if (i == 1) {
                return true;
            }
            return false;
        } else if (-1 == dVar.mo56662b()) {
            return false;
        } else {
            dVar.mo56662b();
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.x.a.a.a$a */
    public static final class C74308a implements AbstractC29994a {

        /* renamed from: a */
        final /* synthetic */ AbstractC29994a f167103a = null;

        static {
            Covode.recordClassIndex(87080);
        }

        C74308a(AbstractC29994a aVar) {
        }

        @Override // com.p2082ss.android.medialib.camera.AbstractC29994a
        /* renamed from: a */
        public final void mo52822a(int i) {
            AbstractC29994a aVar = this.f167103a;
            if (aVar != null) {
                aVar.mo52822a(i);
            }
        }

        @Override // com.p2082ss.android.medialib.camera.AbstractC29994a
        /* renamed from: a */
        public final void mo52823a(int i, int i2, String str) {
            C89219l.m154721d(str, "");
            AbstractC29994a aVar = this.f167103a;
            if (aVar != null) {
                aVar.mo52823a(i, i2, str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.C31182a
    /* renamed from: a */
    public final void mo56736a(boolean z) {
        this.f74770d = true;
        this.f74771e = C31165b.m64582a(C31165b.f74715a);
        this.f74772f = z;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.C31182a
    /* renamed from: b */
    public final boolean mo56738b(boolean z) {
        if (z || !mo56737b()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.C31182a
    /* renamed from: a */
    public final void mo56735a(Context context, PrivacyCert privacyCert) {
        int i;
        C89219l.m154721d(context, "");
        AbstractC31185d dVar = this.f74768b;
        if (this.f74772f) {
            i = 0;
        } else {
            i = 2;
        }
        dVar.mo56664b(i, new C74308a(null), privacyCert);
        this.f74772f = !this.f74772f;
        this.f74768b.mo56678f().mo56742a(this.f74772f);
    }
}
