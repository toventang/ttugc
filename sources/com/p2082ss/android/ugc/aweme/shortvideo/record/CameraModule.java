package com.p2082ss.android.ugc.aweme.shortvideo.record;

import android.os.Build;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.als.C2559g;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.medialib.camera.AbstractC29994a;
import com.p2082ss.android.medialib.camera.C29998d;
import com.p2082ss.android.medialib.presenter.AbstractC30025b;
import com.p2082ss.android.ugc.asve.recorder.C31117a;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31186e;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31187f;
import com.p2082ss.android.ugc.asve.recorder.camera.p2222a.C31163b;
import com.p2082ss.android.ugc.asve.recorder.camera.p2224c.AbstractC31183b;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.AbstractC71881g;
import com.p2082ss.android.ugc.tools.C84401c;
import com.p2082ss.android.ugc.tools.view.widget.C85052j;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.CameraModule */
public class CameraModule implements AbstractC31187f, AbstractC33974au {

    /* renamed from: i */
    public static SparseIntArray f163078i;

    /* renamed from: a */
    final ActivityC0218d f163079a;

    /* renamed from: b */
    public final AbstractC72741a f163080b;

    /* renamed from: c */
    public AbstractC71881g f163081c;

    /* renamed from: d */
    public boolean f163082d;

    /* renamed from: e */
    public C31163b f163083e;

    /* renamed from: f */
    public ASCameraView f163084f;

    /* renamed from: g */
    public Boolean f163085g;

    /* renamed from: h */
    public int f163086h;

    /* renamed from: j */
    private boolean f163087j;

    /* renamed from: k */
    private final AbstractC14179f f163088k;

    /* renamed from: l */
    private Integer f163089l;

    /* renamed from: m */
    private C72791h f163090m;

    /* renamed from: n */
    private Handler f163091n;

    /* renamed from: o */
    private boolean f163092o;

    /* renamed from: p */
    private boolean f163093p;

    /* renamed from: q */
    private boolean f163094q;

    /* renamed from: r */
    private AbstractC30025b f163095r = new AbstractC30025b() {
        /* class com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule.C727404 */

        static {
            Covode.recordClassIndex(85426);
        }

        @Override // com.p2082ss.android.medialib.presenter.AbstractC30025b
        /* renamed from: a */
        public final void mo53174a(int i, int i2) {
            CameraModule.this.f163080b.mo115033a(i, i2);
        }
    };

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.record.CameraModule$a */
    public interface AbstractC72741a {
        static {
            Covode.recordClassIndex(85427);
        }

        /* renamed from: a */
        void mo115030a();

        /* renamed from: a */
        void mo115031a(int i);

        /* renamed from: a */
        void mo115032a(int i, float f, boolean z);

        /* renamed from: a */
        void mo115033a(int i, int i2);

        /* renamed from: a */
        void mo115034a(int i, int i2, String str);

        /* renamed from: a */
        void mo115035a(int i, boolean z, boolean z2, float f, List<Integer> list);

        /* renamed from: a */
        void mo115036a(long j, String str, String str2, String str3);

        /* renamed from: b */
        void mo115037b();

        /* renamed from: b */
        void mo115038b(int i);

        /* renamed from: b */
        void mo115039b(int i, int i2, String str);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public void onStop() {
        mo115017a(0);
    }

    /* renamed from: a */
    public final AbstractC31183b mo115016a() {
        return this.f163084f.getCameraController().mo56678f();
    }

    /* renamed from: b */
    public final boolean mo115021b() {
        if (mo115026g() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo115025f() {
        this.f163084f.mo56937e();
        mo115022c();
    }

    /* renamed from: c */
    public final void mo115022c() {
        this.f163087j = false;
        this.f163082d = false;
        C31117a aVar = this.f163084f.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56686n();
    }

    /* renamed from: g */
    public final int mo115026g() {
        Integer num = this.f163089l;
        if (num == null) {
            return this.f163081c.mo113531a();
        }
        int a = this.f163081c.mo113532a(num.intValue());
        this.f163089l = null;
        this.f163081c.mo113533b(a);
        return a;
    }

    /* renamed from: h */
    public final void mo115027h() {
        C2559g<Boolean> k = this.f163088k.mo22823k();
        if (k.mo6996a() != null && !k.mo6996a().booleanValue()) {
            this.f163088k.mo22788a(true);
        }
    }

    static {
        Covode.recordClassIndex(85422);
        SparseIntArray sparseIntArray = new SparseIntArray(4);
        f163078i = sparseIntArray;
        sparseIntArray.put(0, 2131232553);
        f163078i.put(1, 2131232555);
        f163078i.put(2, 2131232555);
        f163078i.put(3, 2131232551);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo115023d() {
        int i = this.f163086h;
        if (i != 0) {
            if (i == 1 && !this.f163084f.mo56935d() && !this.f163093p) {
                this.f163093p = true;
                C85052j.C85053a.m146245a(this.f163079a, (int) R.string.a8p, 1).mo129996a();
            }
        } else if (!this.f163084f.mo56935d() && !this.f163094q) {
            this.f163094q = true;
            C85052j.C85053a.m146245a(this.f163079a, (int) R.string.a8p, 1).mo129996a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo115024e() {
        C31117a aVar = this.f163084f.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        if (aVar.mo56545c().mo56692p()) {
            return false;
        }
        if (!this.f163087j) {
            C85052j.C85053a.m146245a(this.f163079a, (int) R.string.hbt, 1).mo129996a();
            this.f163087j = true;
        }
        return true;
    }

    /* renamed from: i */
    public final synchronized void mo115028i() {
        MethodCollector.m26663i(1867);
        C31117a aVar = this.f163084f.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56653a(false);
        MethodCollector.m26664o(1867);
    }

    /* renamed from: a */
    public final void mo115017a(int i) {
        this.f163084f.mo56902a(i);
    }

    /* renamed from: b */
    public final void mo115020b(int i) {
        C31117a aVar = this.f163084f.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56672c(i);
    }

    /* renamed from: a */
    public final void mo115018a(PrivacyCert privacyCert) {
        boolean z;
        boolean z2;
        int frontCameraPos;
        this.f163084f.mo56930c();
        this.f163084f.setCameraPreviewSizeInterface(this.f163095r);
        this.f163084f.mo56910a(this);
        boolean z3 = true;
        if (this.f163084f.getCameraController().mo56683k() == 3) {
            z = true;
        } else {
            z = false;
        }
        C84401c.f188722f.mo123658a("CameraModule initCamera cameraAlreadyOpened:".concat(String.valueOf(z)));
        if (mo115026g() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ASCameraView aSCameraView = this.f163084f;
        if (z2) {
            frontCameraPos = aSCameraView.getBackCameraPos();
        } else {
            frontCameraPos = aSCameraView.getFrontCameraPos();
        }
        C31163b bVar = this.f163083e;
        if (!z2 && !this.f163090m.f163227d) {
            z3 = false;
        }
        bVar.mo56708b(z3);
        C84401c.f188722f.mo123658a("CameraModule => open camera");
        m128236a(frontCameraPos, new AbstractC29994a() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule.C727371 */

            static {
                Covode.recordClassIndex(85423);
            }

            @Override // com.p2082ss.android.medialib.camera.AbstractC29994a
            /* renamed from: a */
            public final void mo52822a(int i) {
                C84401c.f188722f.mo123658a("CameraModule => onOpenSuccess");
                CameraModule.this.f163086h = i;
                int g = CameraModule.this.mo115026g();
                CameraModule.this.f163081c.mo113533b(g);
                CameraModule.this.f163080b.mo115031a(g);
                ASCameraView aSCameraView = CameraModule.this.f163084f;
                boolean booleanValue = CameraModule.this.f163085g.booleanValue();
                C31117a aVar = aSCameraView.f74875d;
                if (aVar == null) {
                    C89219l.m154710a("recorder");
                }
                aVar.mo56548f().mo56612b(booleanValue);
                CameraModule.this.mo115027h();
            }

            @Override // com.p2082ss.android.medialib.camera.AbstractC29994a
            /* renamed from: a */
            public final void mo52823a(int i, int i2, String str) {
                CameraModule.this.f163080b.mo115034a(i, i2, str);
                CameraModule.this.mo115027h();
            }
        }, privacyCert);
    }

    /* renamed from: b */
    private void m128237b(boolean z, PrivacyCert privacyCert) {
        C31117a aVar = this.f163084f.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56654a(z, privacyCert);
    }

    /* renamed from: a */
    public final int mo115015a(PrivacyCert privacyCert, final String str) {
        boolean z;
        int frontCameraPos;
        AbstractC71881g gVar = this.f163081c;
        gVar.mo113533b(gVar.mo113531a() ^ 1);
        if (mo115026g() == 0) {
            z = true;
        } else {
            z = false;
        }
        ASCameraView aSCameraView = this.f163084f;
        if (z) {
            frontCameraPos = aSCameraView.getBackCameraPos();
        } else {
            frontCameraPos = aSCameraView.getFrontCameraPos();
        }
        C31163b bVar = this.f163083e;
        boolean z2 = !z;
        if (!bVar.f74710g.mo56704a() || !bVar.mo56707a() || Build.VERSION.SDK_INT < 23) {
            if (bVar.mo56707a() && Build.VERSION.SDK_INT >= 23) {
                if (z2) {
                    bVar.f74709f.mo56669b(false);
                } else {
                    bVar.f74709f.mo56669b(C31163b.m64575a(bVar.f74707d));
                }
            }
        } else if (z2) {
            bVar.f74709f.mo56669b(false);
            C84401c.f188722f.mo123658a("CameraAntiShakeV1 -> updateWhenSwitchFrontRear: setEnableAntiShake(false)");
        } else {
            bVar.f74709f.mo56669b(true);
            C84401c.f188722f.mo123658a("CameraAntiShakeV1 -> updateWhenSwitchFrontRear: setEnableAntiShake(true)");
        }
        try {
            final C27252o a = C27252o.m54253a();
            ASCameraView aSCameraView2 = this.f163084f;
            C727382 r1 = new AbstractC29994a() {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule.C727382 */

                static {
                    Covode.recordClassIndex(85424);
                }

                @Override // com.p2082ss.android.medialib.camera.AbstractC29994a
                /* renamed from: a */
                public final void mo52822a(int i) {
                    String str;
                    String str2;
                    if (a.f64413a) {
                        a.mo45341c();
                    }
                    int g = CameraModule.this.mo115026g();
                    CameraModule.this.f163086h = i;
                    CameraModule.this.f163081c.mo113533b(g);
                    CameraModule.this.f163084f.setPreviewSizeRatio((((float) CameraModule.this.f163084f.getCameraPreviewWidth()) * 1.0f) / ((float) CameraModule.this.f163084f.getCameraPreviewHeight()));
                    CameraModule.this.f163080b.mo115038b(g);
                    AbstractC72741a aVar = CameraModule.this.f163080b;
                    long a = a.mo45339a(TimeUnit.MILLISECONDS);
                    if (i == 1) {
                        str = "camera1";
                    } else if (i == 2) {
                        str = "camera2";
                    } else if (i == 3) {
                        str = "xiaomicamera";
                    } else if (i != 4) {
                        str = "";
                    } else {
                        str = "oppocamera";
                    }
                    if (g == 0) {
                        str2 = "front";
                    } else {
                        str2 = "back";
                    }
                    aVar.mo115036a(a, str, str2, str);
                    CameraModule.this.mo115027h();
                }

                @Override // com.p2082ss.android.medialib.camera.AbstractC29994a
                /* renamed from: a */
                public final void mo52823a(int i, int i2, String str) {
                    a.mo45342d();
                    CameraModule.this.mo115027h();
                    CameraModule.this.f163080b.mo115039b(i, i2, str);
                }
            };
            C31117a aVar = aSCameraView2.f74875d;
            if (aVar == null) {
                C89219l.m154710a("recorder");
            }
            aVar.mo56545c().mo56664b(frontCameraPos, r1, privacyCert);
        } catch (Exception unused) {
        }
        ASCameraView aSCameraView3 = this.f163084f;
        C727393 r12 = new C29998d.AbstractC30001a() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.record.CameraModule.C727393 */

            static {
                Covode.recordClassIndex(85425);
            }

            @Override // com.p2082ss.android.medialib.camera.C29998d.AbstractC30001a
            /* renamed from: a */
            public final void mo52828a() {
                CameraModule.this.f163080b.mo115037b();
                C31117a aVar = CameraModule.this.f163084f.f74875d;
                if (aVar == null) {
                    C89219l.m154710a("recorder");
                }
                aVar.mo56545c().mo56667b(this);
            }
        };
        C31117a aVar2 = aSCameraView3.f74875d;
        if (aVar2 == null) {
            C89219l.m154710a("recorder");
        }
        aVar2.mo56545c().mo56644a(r12);
        return frontCameraPos;
    }

    /* renamed from: a */
    public final void mo115019a(boolean z, PrivacyCert privacyCert) {
        C84401c.f188722f.mo123662d("camera release");
        mo115017a(0);
        m128237b(z, privacyCert);
        this.f163084f.setCameraPreviewSizeInterface(null);
        this.f163084f.mo56926b(this);
        if (!this.f163092o) {
            return;
        }
        if (this.f163090m.f163226c) {
            this.f163084f.mo56933d((PrivacyCert) null);
        } else {
            this.f163084f.mo56920a(false, (PrivacyCert) null);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31187f
    /* renamed from: a */
    public final void mo56751a(int i, float f, boolean z) {
        this.f163080b.mo115032a(i, f, z);
    }

    /* renamed from: a */
    private void m128236a(int i, AbstractC29994a aVar, PrivacyCert privacyCert) {
        this.f163080b.mo115030a();
        if (this.f163090m.f163225b.invoke().booleanValue()) {
            C84401c.f188722f.mo123662d("CameraModule => forbid open camera in background");
        } else {
            this.f163084f.mo56904a(i, aVar, privacyCert);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31187f
    /* renamed from: a */
    public final void mo56752a(int i, boolean z, boolean z2, float f, List<Integer> list) {
        this.f163080b.mo115035a(i, z, z2, f, list);
    }

    public CameraModule(ActivityC0218d dVar, AbstractC71881g gVar, AbstractC72741a aVar, ASCameraView aSCameraView, AbstractC14179f fVar, Integer num, int i, boolean z, C72791h hVar, boolean z2, AbstractC31186e eVar) {
        this.f163079a = dVar;
        this.f163081c = gVar;
        this.f163084f = aSCameraView;
        this.f163080b = aVar;
        this.f163088k = fVar;
        this.f163089l = num;
        this.f163085g = Boolean.valueOf(z);
        this.f163090m = hVar;
        this.f163091n = new SafeHandler(dVar);
        this.f163092o = z2;
        this.f163083e = new C31163b(dVar, aSCameraView.getCameraController(), i, hVar.f163227d, eVar);
    }
}
