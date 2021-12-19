package com.p2082ss.android.ugc.aweme.shortvideo;

import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.als.C2560h;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14182g;
import com.bytedance.creativex.recorder.p940b.p941a.C14206w;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74172g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74215h;
import com.p2082ss.android.ugc.aweme.tools.C78600h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.dw */
public final class C70748dw {

    /* renamed from: a */
    final ActivityC0218d f158361a;

    /* renamed from: b */
    final C74172g<?> f158362b;

    /* renamed from: c */
    private final ASCameraView f158363c;

    /* renamed from: d */
    private final CameraComponentModel f158364d;

    /* renamed from: e */
    private final C74172g.C74180b f158365e;

    /* renamed from: f */
    private final C2560h<Boolean> f158366f;

    static {
        Covode.recordClassIndex(83219);
    }

    /* renamed from: a */
    public final void mo111540a(C14206w wVar) {
        boolean z;
        if (!this.f158365e.f166676q || !Boolean.FALSE.equals(this.f158366f.f7727a.getValue())) {
            CameraComponentModel cameraComponentModel = this.f158364d;
            ASCameraView aSCameraView = this.f158363c;
            if (cameraComponentModel.f155649e == 1) {
                z = true;
            } else {
                z = false;
            }
            C74215h.m130482a(cameraComponentModel, aSCameraView, z, wVar.f34482a, this.f158364d.mo109899k(), this.f158365e, new C70749dx(this, wVar));
            return;
        }
        this.f158362b.mo116657a(new AbstractC14182g.C14187e(wVar));
    }

    public final void onEvent(C14206w wVar) {
        String e;
        if (this.f158364d.mo109896h() >= this.f158364d.mo109899k()) {
            this.f158362b.mo22880a(new C78600h("record_full"));
            return;
        }
        if (!this.f158364d.f155652h.mo110096e().exists()) {
            this.f158364d.f155652h.mo110096e().mkdirs();
        }
        if (this.f158364d.mo109890c() && this.f158365e.f166664e != null) {
            this.f158365e.f166664e.mo116637a();
        }
        if (this.f158364d.f155665u != 1) {
            if (this.f158364d.mo109889b()) {
                e = this.f158364d.f155659o.f155682d;
            } else if (this.f158364d.mo109890c()) {
                e = this.f158364d.f155660p.f155723a.wavPath;
            } else {
                e = this.f158364d.mo109893e();
            }
            this.f158363c.mo56918a(e, this.f158364d.mo109895g(), this.f158364d.mo109896h(), this.f158364d.f155670z);
        }
        this.f158363c.setVideoQuality(this.f158365e.f166661b.f166729a);
        this.f158362b.mo116670e_(false);
        this.f158362b.mo116672h(false);
        this.f158365e.f166669j.mo22928a();
        mo111540a(wVar);
    }

    public C70748dw(ActivityC0218d dVar, AbstractC14177d dVar2, C74172g gVar, C74172g.C74180b bVar) {
        this.f158361a = dVar;
        this.f158363c = dVar2.mo22747A();
        this.f158362b = gVar;
        this.f158364d = dVar2.mo22803b();
        this.f158365e = bVar;
        this.f158366f = dVar2.mo22818g();
    }
}
