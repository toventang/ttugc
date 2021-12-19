package com.p2082ss.android.ugc.aweme.shortvideo.record;

import android.os.Build;
import android.view.SurfaceHolder;
import androidx.core.p036g.AbstractC0688a;
import com.C1764a;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.p1559o.C21582f;
import com.p2082ss.android.ttve.monitor.TEMonitorInvoker;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31211g;
import com.p2082ss.android.ugc.asve.recorder.C31210f;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.p3878a.AbstractC73354a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.p3878a.AbstractC73355b;
import com.p2082ss.android.ugc.tools.C84401c;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.k */
public class C72796k<T extends AbstractC14177d> extends C72809t<T> implements AbstractC14177d {

    /* renamed from: W */
    private boolean f163236W = true;

    /* renamed from: X */
    private boolean f163237X;

    /* renamed from: b */
    protected boolean f163238b = true;

    /* renamed from: c */
    protected boolean f163239c;

    static {
        Covode.recordClassIndex(85482);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d
    /* renamed from: a */
    public final void mo22738a() {
        this.f163236W = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t, com.bytedance.als.AbstractC2562j
    public void onResume() {
        super.onResume();
        if (this.f163310K.f163249D) {
            mo22741a(true, (PrivacyCert) null, false);
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onStart() {
        super.onStart();
        if (!this.f163310K.f163249D) {
            mo22741a(true, (PrivacyCert) null, false);
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onPause() {
        super.onPause();
        mo115136ax();
        if (this.f163310K.f163249D) {
            mo22742b(true, (PrivacyCert) null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: ao */
    public final void mo115085ao() {
        MethodCollector.m26663i(2741);
        TEMonitorInvoker.nativeReset();
        mo115131as();
        mo115135aw();
        getLifecycle().mo4012a(this.f163388v);
        this.f163385s.mo56916a(new C72797l(this));
        if (this.f163310K.f163264c) {
            this.f163385s.getCameraController().mo56649a(new C72798m(this));
        }
        mo115120aK();
        MethodCollector.m26664o(2741);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: ap */
    public void mo115086ap() {
        this.f163388v.mo115019a(this.f163308I, this.f163303D.mo116019c().mo56126b());
        this.f163378l.mo6999a(C89391z.f203057a);
        C84401c.f188722f.mo123658a("CameraLogicComponent => surfaceDestroyed, stopPreviewAsync called()");
        this.f163385s.mo56921a(this.f163308I, C72800o.f163243a);
        mo115138az();
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: aq */
    public void mo115087aq() {
        C84401c.f188722f.mo123658a("CameraLogicComponent => surfaceCreated");
        this.f163385s.mo56909a(this.f163321V);
        mo115113aD();
        mo115115aF();
        this.f163385s.mo56906a(this.f163384r, Build.DEVICE, C72801p.f163244a);
        if (this.f163238b) {
            this.f163238b = false;
            if (this.f163239c) {
                mo115134av();
                return;
            }
            return;
        }
        this.f163388v.mo115018a(this.f163303D.mo116019c().mo56125a());
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onStop() {
        super.onStop();
        if (!this.f163310K.f163249D) {
            mo22742b(true, (PrivacyCert) null);
        }
        if (this.f163309J) {
            C84401c.f188722f.mo123658a("CameraLogicComponent => release camera in onStop");
            this.f163388v.mo115019a(this.f163308I, this.f163303D.mo116019c().mo56129e());
        }
        if (this.f163238b) {
            this.f163385s.mo56924b(this.f163303D.mo116019c().mo56128d());
            this.f163238b = false;
        }
        if (mo22750D() != null && this.f163310K.f163258M) {
            mo22750D().setVisibility(8);
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d
    /* renamed from: a */
    public void mo22739a(PrivacyCert privacyCert) {
        mo22741a(false, privacyCert, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: a */
    public void mo115084a(SurfaceHolder surfaceHolder) {
        C84401c.f188722f.mo123658a("CameraLogicComponent => surfaceCreated");
        if (!this.f163238b || !this.f163310K.f163274m) {
            this.f163385s.mo56909a(this.f163321V);
        }
        mo115113aD();
        mo115115aF();
        this.f163392z = surfaceHolder;
        if (!this.f163238b || !this.f163310K.f163274m) {
            this.f163385s.mo56906a(mo115126aQ(), Build.DEVICE, C72799n.f163242a);
        } else {
            this.f163385s.mo56905a(mo115126aQ());
        }
        if (this.f163238b) {
            this.f163238b = false;
            if (this.f163239c) {
                mo115134av();
            }
        } else if (!this.f163310K.f163249D) {
            this.f163388v.mo115018a(this.f163303D.mo116019c().mo56125a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.record.C72809t
    /* renamed from: c */
    public void mo115088c(int i) {
        MethodCollector.m26663i(289);
        if (mo22750D().getVisibility() == 8) {
            MethodCollector.m26664o(289);
            return;
        }
        mo115112aC();
        this.f163239c = true;
        if (!(this.f163392z == null && this.f163384r == null)) {
            mo115134av();
        }
        ASCameraView aSCameraView = this.f163385s;
        AbstractC31211g gVar = this.f163314O;
        C89219l.m154721d(gVar, "");
        C31210f onFrameAvailableListenerDispatcher = aSCameraView.getOnFrameAvailableListenerDispatcher();
        C89219l.m154721d(gVar, "");
        synchronized (onFrameAvailableListenerDispatcher) {
            try {
                if (onFrameAvailableListenerDispatcher.f74808a.isEmpty()) {
                    onFrameAvailableListenerDispatcher.f74809b.mo56538a(onFrameAvailableListenerDispatcher);
                }
                onFrameAvailableListenerDispatcher.f74808a.add(gVar);
            } finally {
                MethodCollector.m26664o(289);
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d
    /* renamed from: c */
    public void mo22743c(boolean z, PrivacyCert privacyCert) {
        mo22742b(false, privacyCert);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d
    /* renamed from: a */
    public final void mo22740a(boolean z, PrivacyCert privacyCert) {
        mo22741a(z, privacyCert, false);
    }

    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d
    /* renamed from: b */
    public final void mo22742b(boolean z, PrivacyCert privacyCert) {
        C84401c.f188722f.mo123662d(C1764a.m5928a("%s stopPreview fromLifecycle: %b isStoppedFromLifecycle: %b", new Object[]{"CameraLogicComponent", Boolean.valueOf(z), Boolean.valueOf(this.f163236W)}));
        if (this.f163236W) {
            if (!z || this.f163310K.f163249D || this.f163310K.f163258M) {
                this.f163388v.mo115019a(this.f163308I, privacyCert);
            }
            if (mo22750D() != null && !this.f163310K.f163258M) {
                mo22750D().setVisibility(8);
            }
            this.f163236W = z;
            this.f163380n.mo7000b((Object) false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ C89391z mo115083a(Integer num, Integer num2, String str) {
        if (num.intValue() == 1050) {
            mo115125aP();
        }
        this.f163379m.mo7000b(new C20375am(num, num2, str));
        return C89391z.f203057a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        if (r7.f163310K.f163249D != false) goto L_0x0069;
     */
    @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22741a(boolean r8, com.bytedance.bpea.basics.PrivacyCert r9, boolean r10) {
        /*
        // Method dump skipped, instructions count: 135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.record.C72796k.mo22741a(boolean, com.bytedance.bpea.basics.PrivacyCert, boolean):void");
    }

    public C72796k(C21582f fVar, CameraComponentModel cameraComponentModel, AbstractC72769aq aqVar, AbstractC73355b bVar, AbstractC73354a aVar, AbstractC0688a<C72802q> aVar2, AbstractC72790g gVar) {
        super(fVar, cameraComponentModel, aqVar, bVar, aVar, aVar2, gVar);
    }
}
