package com.p2082ss.android.ugc.asve.recorder.camera.p2224c;

import android.content.Context;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.C31012a;
import com.p2082ss.android.ugc.asve.p2217f.C31092a;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.c.c */
public final class C31184c implements AbstractC31183b {

    /* renamed from: a */
    private final Context f74774a;

    /* renamed from: b */
    private C31182a f74775b;

    static {
        Covode.recordClassIndex(37829);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.AbstractC31183b
    /* renamed from: a */
    public final float mo56739a(float f) {
        return f;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.AbstractC31183b
    /* renamed from: b */
    public final int mo56744b() {
        return this.f74775b.mo56734a();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.AbstractC31183b
    /* renamed from: c */
    public final boolean mo56746c() {
        return this.f74775b.f74770d;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.AbstractC31183b
    /* renamed from: d */
    public final boolean mo56748d() {
        return this.f74775b.f74771e;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.AbstractC31183b
    /* renamed from: f */
    public final boolean mo56750f() {
        return this.f74775b.mo56737b();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.AbstractC31183b
    /* renamed from: e */
    public final boolean mo56749e() {
        if (!this.f74775b.f74770d || !mo56743a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.AbstractC31183b
    /* renamed from: a */
    public final boolean mo56743a() {
        if (!this.f74775b.mo56737b()) {
            mo56742a(false);
            return false;
        }
        int a = C31092a.C31093a.m64295a(this.f74774a).mo56515a();
        if (a == 0) {
            C31012a.m63724a();
            mo56742a(false);
            return false;
        } else if (a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m64611a(Context context) {
        if (C31092a.C31093a.m64295a(context).mo56515a() == 1) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.AbstractC31183b
    /* renamed from: c */
    public final boolean mo56747c(boolean z) {
        return this.f74775b.mo56738b(z);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.AbstractC31183b
    /* renamed from: a */
    public final void mo56740a(int i) {
        if (this.f74775b.f74773g != null) {
            this.f74775b.f74773g.mo52822a(i);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.AbstractC31183b
    /* renamed from: b */
    public final boolean mo56745b(boolean z) {
        if (!this.f74775b.mo56738b(z) || !mo56743a()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.AbstractC31183b
    /* renamed from: a */
    public final void mo56741a(PrivacyCert privacyCert) {
        this.f74775b.mo56735a(C31012a.m63726b(), privacyCert);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.p2224c.AbstractC31183b
    /* renamed from: a */
    public final void mo56742a(boolean z) {
        int i;
        C31092a a = C31092a.C31093a.m64295a(this.f74774a);
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        a.mo56516a(i);
    }

    public C31184c(Context context, AbstractC31185d dVar, C31182a aVar) {
        this.f74774a = context;
        if (aVar != null) {
            this.f74775b = aVar;
        } else {
            this.f74775b = new C31182a();
        }
        this.f74775b.f74767a = this;
        this.f74775b.f74768b = dVar;
        this.f74775b.f74769c = context;
        this.f74775b.mo56736a(mo56743a());
    }
}
