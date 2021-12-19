package com.p2082ss.android.ugc.asve.recorder.camera;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseIntArray;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.camera.AbstractC29994a;
import com.p2082ss.android.medialib.camera.C29998d;
import com.p2082ss.android.medialib.presenter.AbstractC30025b;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ugc.asve.C31012a;
import com.p2082ss.android.ugc.asve.C31016b;
import com.p2082ss.android.ugc.asve.context.AbstractC31034c;
import com.p2082ss.android.ugc.asve.context.PreviewSize;
import com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b;
import com.p2082ss.android.ugc.asve.p2213b.C31023e;
import com.p2082ss.android.ugc.asve.p2213b.EnumC31020c;
import com.p2082ss.android.ugc.asve.p2214c.C31031b;
import com.p2082ss.android.ugc.asve.p2217f.C31098f;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31191d;
import com.p2082ss.android.ugc.asve.recorder.camera.p2224c.AbstractC31183b;
import com.p2082ss.android.ugc.asve.recorder.camera.p2224c.C31182a;
import com.p2082ss.android.ugc.asve.recorder.camera.p2224c.C31184c;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.vesdk.C85302aa;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.C85528o;
import com.p2082ss.android.vesdk.VECameraSettings;
import com.p2082ss.android.vesdk.VEListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89376n;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController */
public final class VECameraController implements AbstractC31185d, AbstractC33974au {

    /* renamed from: K */
    public static int f74617K;

    /* renamed from: L */
    public static final C31146a f74618L = new C31146a((byte) 0);

    /* renamed from: A */
    public int f74619A;

    /* renamed from: B */
    public final List<AbstractC31187f> f74620B;

    /* renamed from: C */
    public C85346av.AbstractC85373r f74621C;

    /* renamed from: D */
    AbstractC89187q<? super Integer, ? super Integer, ? super String, C89391z> f74622D;

    /* renamed from: E */
    public int f74623E;

    /* renamed from: F */
    public SparseIntArray f74624F;

    /* renamed from: G */
    public final Context f74625G;

    /* renamed from: H */
    public final AbstractC1204m f74626H;

    /* renamed from: I */
    public final C85346av f74627I;

    /* renamed from: J */
    public final C31182a f74628J;

    /* renamed from: M */
    private final boolean f74629M = true;

    /* renamed from: N */
    private final int[] f74630N = {720, 1280};

    /* renamed from: O */
    private final AbstractC89244h f74631O;

    /* renamed from: P */
    private boolean f74632P;

    /* renamed from: Q */
    private int f74633Q;

    /* renamed from: R */
    private boolean f74634R;

    /* renamed from: S */
    private boolean f74635S;

    /* renamed from: T */
    private final AbstractC31191d f74636T;

    /* renamed from: U */
    private final AbstractC31034c f74637U;

    /* renamed from: V */
    private final boolean f74638V;

    /* renamed from: W */
    private final boolean f74639W;

    /* renamed from: a */
    final CopyOnWriteArrayList<Object> f74640a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    final CopyOnWriteArrayList<C29998d.AbstractC30001a> f74641b = new CopyOnWriteArrayList<>();

    /* renamed from: c */
    public final CopyOnWriteArrayList<AbstractC29994a> f74642c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public AbstractC89171a<C89391z> f74643d;

    /* renamed from: e */
    AbstractC30025b f74644e;

    /* renamed from: f */
    public AbstractC31014b f74645f;

    /* renamed from: g */
    final int f74646g = 720;

    /* renamed from: h */
    final int f74647h = 1280;

    /* renamed from: i */
    public boolean f74648i;

    /* renamed from: j */
    public int f74649j = -1;

    /* renamed from: k */
    public final Object f74650k = new Object();

    /* renamed from: l */
    public boolean f74651l;

    /* renamed from: m */
    public boolean f74652m;

    /* renamed from: n */
    public boolean f74653n;

    /* renamed from: o */
    public final C85528o f74654o = new C85528o();

    /* renamed from: p */
    public VECameraSettings f74655p;

    /* renamed from: q */
    public float f74656q;

    /* renamed from: r */
    boolean f74657r;

    /* renamed from: s */
    public boolean f74658s;

    /* renamed from: t */
    public boolean f74659t;

    /* renamed from: u */
    final List<Integer> f74660u;

    /* renamed from: v */
    public float f74661v;

    /* renamed from: w */
    public float f74662w;

    /* renamed from: x */
    public float f74663x;

    /* renamed from: y */
    public boolean f74664y;

    /* renamed from: z */
    public int f74665z;

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$e */
    static final class C31150e implements C85346av.AbstractC85373r {

        /* renamed from: a */
        final /* synthetic */ VECameraController f74672a;

        static {
            Covode.recordClassIndex(37794);
        }

        C31150e(VECameraController vECameraController) {
            this.f74672a = vECameraController;
        }
    }

    static {
        Covode.recordClassIndex(37788);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: f */
    public final AbstractC31183b mo56678f() {
        return (AbstractC31183b) this.f74631O.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_CREATE) {
            onCreate();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_STOP) {
            onStop();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_START) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            onDestroy();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$a */
    public static final class C31146a {
        static {
            Covode.recordClassIndex(37790);
        }

        private C31146a() {
        }

        public /* synthetic */ C31146a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: b */
    public final int mo56662b() {
        return this.f74649j;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: c */
    public final int mo56671c() {
        return this.f74646g;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: d */
    public final int mo56674d() {
        return this.f74647h;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: g */
    public final boolean mo56679g() {
        return this.f74648i;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: h */
    public final int mo56680h() {
        return this.f74623E;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: j */
    public final int mo56682j() {
        return f74617K;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: l */
    public final float mo56684l() {
        return this.f74656q;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: m */
    public final List<Integer> mo56685m() {
        return this.f74660u;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final boolean mo56657a() {
        return this.f74629M;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56655a(float[] fArr, double d) {
        C89219l.m154721d(fArr, "");
        this.f74627I.mo130764a(fArr, d);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56653a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("enable_body_beauty", z);
        this.f74654o.mo131480a(bundle);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final boolean mo56660a(int i, int i2, float f, float[] fArr) {
        C89219l.m154721d(fArr, "");
        if (fArr.length >= 2 && this.f74654o.mo131471a(i, i2, f, (int) fArr[0], (int) fArr[1]) == 0) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final boolean mo56661a(C85302aa aaVar) {
        C89219l.m154721d(aaVar, "");
        return this.f74654o.mo131476a(aaVar) == 0;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56654a(boolean z, PrivacyCert privacyCert) {
        if (!this.f74637U.mo56146i()) {
            m64499b(z, privacyCert);
            return;
        }
        throw new IllegalAccessError("Cannot be turned off in automatic mode");
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56650a(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f74643d = aVar;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56651a(AbstractC89172b<? super float[], C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f74654o.mo131485a(new C31188g(bVar));
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final boolean mo56658a(float f) {
        float f2;
        if (!mo56687o()) {
            return false;
        }
        C31016b.f74339a.mo56123d("ZOOM startZoom newZoom = " + f + ", currentZoom = " + this.f74662w + ", shouldUseShaderZoom:" + C31189h.m64681a(this) + ", isFrontCamera:" + this.f74634R);
        AbstractC31183b f3 = mo56678f();
        float f4 = this.f74656q;
        mo56676e();
        float a = f3.mo56739a(f4);
        mo56678f();
        mo56676e();
        float max = Math.max(Math.min(this.f74656q, f), 0.0f);
        C31016b.f74339a.mo56123d("ZOOM startZoom zoomUpperLimit:" + a + ", zoomBottomLimit:0.0, maxZoom:" + this.f74656q + ", zoomTemp:" + max);
        if (max < 0.0f || max > a) {
            return false;
        }
        if (!C31189h.m64681a(this) || !this.f74634R) {
            f2 = max;
        } else {
            float f5 = this.f74656q;
            f2 = ((max / f5) * (f5 - 1.0f)) + 1.0f;
        }
        m64502d(f2);
        this.f74662w = max;
        return true;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final boolean mo56659a(float f, float f2) {
        if (!mo56687o() || !mo56692p()) {
            return false;
        }
        if (C31189h.m64682b(this)) {
            return m64501c(f2);
        }
        C31016b.f74339a.mo56122c("ZOOM scaleCamera distanceDelta = ".concat(String.valueOf(f)));
        return mo56658a(Math.max(0.0f, ((this.f74656q / 1000.0f) * f) + this.f74662w));
    }

    /* renamed from: a */
    public final void mo56652a(AbstractC89187q<? super Integer, ? super Integer, ? super String, C89391z> qVar) {
        C89219l.m154721d(qVar, "");
        this.f74622D = qVar;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56656a(int[] iArr) {
        C89219l.m154721d(iArr, "");
        VECameraSettings.C85211a aVar = new VECameraSettings.C85211a(this.f74655p);
        aVar.mo130241a(iArr);
        VECameraSettings vECameraSettings = aVar.f190733a;
        C89219l.m154716b(vECameraSettings, "");
        this.f74655p = vECameraSettings;
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$i */
    public static final class C31156i implements AbstractC31014b.AbstractC31015a {

        /* renamed from: a */
        final /* synthetic */ VECameraController f74686a;

        static {
            Covode.recordClassIndex(37800);
        }

        @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b.AbstractC31015a
        /* renamed from: a */
        public final void mo56118a() {
            this.f74686a.f74654o.mo131497l();
        }

        @Override // com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b.AbstractC31015a
        /* renamed from: b */
        public final void mo56119b() {
            this.f74686a.f74654o.mo131496k();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31156i(VECameraController vECameraController) {
            this.f74686a = vECameraController;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$j */
    public static final class C31157j implements C85346av.AbstractC85366k {

        /* renamed from: a */
        final /* synthetic */ VECameraController f74687a;

        static {
            Covode.recordClassIndex(37801);
        }

        @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85366k
        /* renamed from: a */
        public final boolean mo56703a() {
            return this.f74687a.f74657r;
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$j$a */
        static final class C31158a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C31157j f74688a;

            /* renamed from: b */
            final /* synthetic */ float f74689b;

            /* renamed from: c */
            final /* synthetic */ int f74690c;

            /* renamed from: d */
            final /* synthetic */ boolean f74691d;

            static {
                Covode.recordClassIndex(37802);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31158a(C31157j jVar, float f, int i, boolean z) {
                super(0);
                this.f74688a = jVar;
                this.f74689b = f;
                this.f74690c = i;
                this.f74691d = z;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f74688a.f74687a.f74663x = this.f74689b;
                Iterator<T> it = this.f74688a.f74687a.f74620B.iterator();
                while (it.hasNext()) {
                    it.next().mo56751a(this.f74690c, this.f74689b, this.f74691d);
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$j$b */
        static final class C31159b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C31157j f74692a;

            /* renamed from: b */
            final /* synthetic */ float f74693b;

            /* renamed from: c */
            final /* synthetic */ List f74694c;

            /* renamed from: d */
            final /* synthetic */ int f74695d;

            /* renamed from: e */
            final /* synthetic */ boolean f74696e;

            /* renamed from: f */
            final /* synthetic */ boolean f74697f;

            static {
                Covode.recordClassIndex(37803);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31159b(C31157j jVar, float f, List list, int i, boolean z, boolean z2) {
                super(0);
                this.f74692a = jVar;
                this.f74693b = f;
                this.f74694c = list;
                this.f74695d = i;
                this.f74696e = z;
                this.f74697f = z2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                if (!C31181c.f74765a || !C31189h.m64682b(this.f74692a.f74687a)) {
                    this.f74692a.f74687a.f74656q = this.f74693b;
                } else {
                    VECameraController vECameraController = this.f74692a.f74687a;
                    float f = this.f74693b;
                    if (f > 10.0f) {
                        f = 10.0f;
                    }
                    vECameraController.f74656q = f;
                }
                C31016b.f74339a.mo56123d("ZOOM maxZoom:" + this.f74692a.f74687a.f74656q);
                this.f74692a.f74687a.f74660u.clear();
                List list = this.f74694c;
                if (list != null) {
                    this.f74692a.f74687a.f74660u.addAll(list);
                }
                Iterator<T> it = this.f74692a.f74687a.f74620B.iterator();
                while (it.hasNext()) {
                    it.next().mo56752a(this.f74695d, this.f74696e, this.f74697f, this.f74693b, this.f74694c);
                }
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31157j(VECameraController vECameraController) {
            this.f74687a = vECameraController;
        }

        @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85366k
        /* renamed from: a */
        public final void mo56701a(int i, float f, boolean z) {
            boolean z2;
            VECameraController vECameraController = this.f74687a;
            if (f > 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            vECameraController.f74664y = z2;
            C31098f.m64301a(new C31158a(this, f, i, z));
        }

        @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85366k
        /* renamed from: a */
        public final void mo56702a(int i, boolean z, boolean z2, float f, List<Integer> list) {
            C31098f.m64301a(new C31159b(this, f, list, i, z, z2));
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: k */
    public final int mo56683k() {
        return this.f74654o.mo131492g();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: q */
    public final boolean mo56693q() {
        return this.f74654o.mo131495j();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: r */
    public final C30933l.C30943d mo56694r() {
        return this.f74654o.mo131494i();
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$h */
    static final class C31155h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ VECameraController f74684a;

        /* renamed from: b */
        final /* synthetic */ AbstractC31187f f74685b;

        static {
            Covode.recordClassIndex(37799);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31155h(VECameraController vECameraController, AbstractC31187f fVar) {
            super(0);
            this.f74684a = vECameraController;
            this.f74685b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f74684a.f74620B.remove(this.f74685b);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$k */
    static final class C31160k extends AbstractC89220m implements AbstractC89171a<C31184c> {

        /* renamed from: a */
        final /* synthetic */ VECameraController f74698a;

        static {
            Covode.recordClassIndex(37804);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31160k(VECameraController vECameraController) {
            super(0);
            this.f74698a = vECameraController;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31184c invoke() {
            Context context = this.f74698a.f74625G;
            VECameraController vECameraController = this.f74698a;
            return new C31184c(context, vECameraController, vECameraController.f74628J);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: e */
    public final int mo56676e() {
        return this.f74655p.f190711l.ordinal();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: i */
    public final int mo56681i() {
        return this.f74624F.get(this.f74623E);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: t */
    public final Bundle mo56696t() {
        Bundle a = this.f74654o.mo131478a(this.f74625G);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: o */
    public final boolean mo56687o() {
        if (this.f74656q != -1.0f && !this.f74660u.isEmpty()) {
            return true;
        }
        return false;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_CREATE)
    public final void onCreate() {
        if (this.f74637U.mo56146i() && !this.f74635S) {
            this.f74635S = true;
            m64500c(this.f74655p.f190711l.ordinal(), null, C31031b.f74356f);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void onDestroy() {
        if (this.f74648i || this.f74638V) {
            m64499b(this.f74637U.mo56143f(), C31031b.f74353c);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_START)
    public final void onResume() {
        if (this.f74637U.mo56146i() && !this.f74635S) {
            this.f74635S = true;
            m64500c(this.f74655p.f190711l.ordinal(), null, C31031b.f74354d);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_STOP)
    public final void onStop() {
        if (this.f74637U.mo56146i() && this.f74635S) {
            this.f74635S = false;
            m64499b(this.f74637U.mo56143f(), C31031b.f74355e);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: s */
    public final boolean mo56695s() {
        if (!this.f74659t) {
            return false;
        }
        return this.f74654o.mo131490b(this.f74625G, this.f74655p);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$b */
    static final class C31147b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ VECameraController f74667a;

        /* renamed from: b */
        final /* synthetic */ AbstractC31187f f74668b;

        static {
            Covode.recordClassIndex(37791);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31147b(VECameraController vECameraController, AbstractC31187f fVar) {
            super(0);
            this.f74667a = vECameraController;
            this.f74668b = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f74667a.f74620B.add(this.f74668b);
            if (this.f74667a.f74656q > 0.0f && this.f74667a.f74649j > 0 && this.f74667a.f74648i) {
                this.f74668b.mo56752a(this.f74667a.f74649j, true, this.f74667a.f74657r, this.f74667a.f74656q, this.f74667a.f74660u);
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: n */
    public final void mo56686n() {
        C31016b.f74339a.mo56122c("ZOOM [" + System.identityHashCode(this) + "] scaleEnd");
        this.f74661v = 0.0f;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: p */
    public final boolean mo56692p() {
        boolean z;
        if (!mo56687o()) {
            return false;
        }
        if (this.f74632P) {
            AbstractC31183b f = mo56678f();
            if (mo56676e() == 1) {
                z = true;
            } else {
                z = false;
            }
            if (f.mo56745b(z)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$g */
    public static final class C31152g implements VEListener.AbstractC85242k {

        /* renamed from: a */
        public int f74675a = -9999;

        /* renamed from: b */
        public String f74676b = "";

        /* renamed from: c */
        final /* synthetic */ VECameraController f74677c;

        static {
            Covode.recordClassIndex(37796);
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$g$a */
        static final class C31153a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C31152g f74678a;

            /* renamed from: b */
            final /* synthetic */ int f74679b;

            static {
                Covode.recordClassIndex(37797);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31153a(C31152g gVar, int i) {
                super(0);
                this.f74678a = gVar;
                this.f74679b = i;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f74678a.f74677c.f74648i = false;
                this.f74678a.f74677c.f74649j = -1;
                if (C31165b.f74716b) {
                    C31165b.f74715a = -1;
                }
                this.f74678a.f74677c.f74661v = 0.0f;
                this.f74678a.f74677c.f74662w = 0.0f;
                AbstractC31014b bVar = this.f74678a.f74677c.f74645f;
                if (bVar != null) {
                    bVar.mo56096a(this.f74678a.f74675a, this.f74678a.f74676b);
                }
                Iterator<T> it = this.f74678a.f74677c.f74642c.iterator();
                while (it.hasNext()) {
                    it.next().mo52823a(this.f74679b, this.f74678a.f74675a, this.f74678a.f74676b);
                }
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85243l
        /* renamed from: a */
        public final void mo56697a() {
            MethodCollector.m26663i(8557);
            AbstractC31014b bVar = this.f74677c.f74645f;
            if (bVar != null) {
                bVar.mo56099b();
            }
            VECameraController vECameraController = this.f74677c;
            AbstractC30025b bVar2 = vECameraController.f74644e;
            if (bVar2 != null) {
                bVar2.mo53174a(vECameraController.f74646g, vECameraController.f74647h);
            }
            synchronized (vECameraController.f74650k) {
                try {
                    vECameraController.f74653n = true;
                    if (vECameraController.f74651l) {
                        if (vECameraController.f74652m) {
                            vECameraController.f74654o.mo130848b();
                        } else {
                            vECameraController.f74652m = true;
                            vECameraController.f74627I.mo130749a(vECameraController.f74654o);
                            AbstractC31014b bVar3 = vECameraController.f74645f;
                            if (bVar3 != null) {
                                bVar3.mo56105e();
                            }
                        }
                    }
                } finally {
                    MethodCollector.m26664o(8557);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$g$b */
        static final class C31154b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C31152g f74680a;

            /* renamed from: b */
            final /* synthetic */ int f74681b;

            /* renamed from: c */
            final /* synthetic */ int f74682c;

            /* renamed from: d */
            final /* synthetic */ String f74683d;

            static {
                Covode.recordClassIndex(37798);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31154b(C31152g gVar, int i, int i2, String str) {
                super(0);
                this.f74680a = gVar;
                this.f74681b = i;
                this.f74682c = i2;
                this.f74683d = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                AbstractC31014b bVar;
                VECameraController vECameraController = this.f74680a.f74677c;
                int i = this.f74681b;
                int i2 = this.f74682c;
                String str = this.f74683d;
                if (i == 2) {
                    vECameraController.f74649j = i2;
                }
                AbstractC89187q<? super Integer, ? super Integer, ? super String, C89391z> qVar = vECameraController.f74622D;
                if (qVar != null) {
                    qVar.invoke(Integer.valueOf(i), Integer.valueOf(i2), str);
                }
                if (i == 0) {
                    AbstractC31014b bVar2 = vECameraController.f74645f;
                    if (bVar2 != null) {
                        bVar2.mo56106f();
                    }
                    Iterator<T> it = vECameraController.f74640a.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    vECameraController.f74654o.mo131486a(new C31149d(vECameraController));
                } else if (i == 2) {
                    vECameraController.f74648i = true;
                    vECameraController.f74661v = 0.0f;
                    vECameraController.f74662w = 0.0f;
                    if (C31165b.f74716b) {
                        C31165b.f74715a = i2;
                    }
                    if (C31189h.m64681a(vECameraController)) {
                        vECameraController.f74654o.mo131491e();
                    }
                    vECameraController.f74654o.mo131488b(C31189h.m64682b(vECameraController));
                    vECameraController.mo56678f().mo56740a(vECameraController.f74649j);
                    Iterator<T> it2 = vECameraController.f74642c.iterator();
                    while (it2.hasNext()) {
                        it2.next().mo52822a(vECameraController.f74649j);
                    }
                    vECameraController.f74654o.mo131484a(new C31150e(vECameraController));
                } else if (i == 3) {
                    Iterator<T> it3 = vECameraController.f74641b.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo52828a();
                    }
                } else if (i == 4) {
                    AbstractC31014b bVar3 = vECameraController.f74645f;
                    if (bVar3 != null) {
                        bVar3.mo56108h();
                    }
                } else if (i == 5 && (bVar = vECameraController.f74645f) != null) {
                    bVar.mo56103d();
                }
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C31152g(VECameraController vECameraController) {
            this.f74677c = vECameraController;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85243l
        /* renamed from: a */
        public final void mo56698a(int i) {
            C31098f.m64301a(new C31153a(this, i));
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85242k
        /* renamed from: a */
        public final void mo56700a(int i, String str) {
            AbstractC31014b bVar;
            this.f74675a = i;
            if (str != null) {
                this.f74676b = str;
            }
            if ((i == -417 || i == -416) && (bVar = this.f74677c.f74645f) != null) {
                if (str == null) {
                    str = "";
                }
                bVar.mo56104d(i, str);
            }
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85242k
        /* renamed from: a */
        public final void mo56699a(int i, int i2, String str) {
            AbstractC89171a<C89391z> aVar;
            if (i == 5 && (aVar = this.f74677c.f74643d) != null) {
                aVar.invoke();
            }
            C31098f.m64301a(new C31154b(this, i, i2, str));
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56645a(AbstractC30025b bVar) {
        this.f74644e = bVar;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: b */
    public final void mo56667b(C29998d.AbstractC30001a aVar) {
        if (aVar != null) {
            this.f74641b.remove(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: c */
    public final void mo56672c(int i) {
        this.f74623E = i;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: d */
    public final void mo56675d(int i) {
        f74617K = i;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: e */
    public final void mo56677e(int i) {
        this.f74654o.mo131479a(i);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$d */
    static final class C31149d implements C30933l.AbstractC30947h {

        /* renamed from: a */
        final /* synthetic */ VECameraController f74671a;

        static {
            Covode.recordClassIndex(37793);
        }

        C31149d(VECameraController vECameraController) {
            this.f74671a = vECameraController;
        }

        @Override // com.p2082ss.android.ttvecamera.C30933l.AbstractC30947h
        /* renamed from: a */
        public final void mo56042a(int[] iArr) {
            this.f74671a.f74619A = iArr[0];
            this.f74671a.f74665z = iArr[1];
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$f */
    public static final class C31151f implements AbstractC29994a {

        /* renamed from: a */
        final /* synthetic */ VECameraController f74673a;

        /* renamed from: b */
        final /* synthetic */ AbstractC29994a f74674b;

        static {
            Covode.recordClassIndex(37795);
        }

        @Override // com.p2082ss.android.medialib.camera.AbstractC29994a
        /* renamed from: a */
        public final void mo52822a(int i) {
            AbstractC29994a aVar = this.f74674b;
            if (aVar != null) {
                aVar.mo52822a(i);
            }
            this.f74673a.mo56666b(this);
        }

        C31151f(VECameraController vECameraController, AbstractC29994a aVar) {
            this.f74673a = vECameraController;
            this.f74674b = aVar;
        }

        @Override // com.p2082ss.android.medialib.camera.AbstractC29994a
        /* renamed from: a */
        public final void mo52823a(int i, int i2, String str) {
            AbstractC29994a aVar = this.f74674b;
            if (aVar != null) {
                aVar.mo52823a(i, i2, str);
            }
            this.f74673a.mo56666b(this);
        }
    }

    /* renamed from: c */
    private final boolean m64501c(float f) {
        if (!mo56687o()) {
            return false;
        }
        this.f74654o.mo131487b(f);
        return true;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56641a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("body_beauty_level", i);
        this.f74654o.mo131480a(bundle);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: b */
    public final void mo56665b(PrivacyCert privacyCert) {
        m64499b(this.f74637U.mo56143f(), privacyCert);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.camera.VECameraController$c */
    public static final class C31148c implements AbstractC29994a {

        /* renamed from: a */
        final /* synthetic */ VECameraController f74669a;

        /* renamed from: b */
        final /* synthetic */ AbstractC29994a f74670b;

        static {
            Covode.recordClassIndex(37792);
        }

        @Override // com.p2082ss.android.medialib.camera.AbstractC29994a
        /* renamed from: a */
        public final void mo52822a(int i) {
            this.f74669a.mo56666b(this);
            this.f74669a.f74661v = 0.0f;
            this.f74669a.f74662w = 0.0f;
            AbstractC29994a aVar = this.f74670b;
            if (aVar != null) {
                aVar.mo52822a(i);
            }
        }

        C31148c(VECameraController vECameraController, AbstractC29994a aVar) {
            this.f74669a = vECameraController;
            this.f74670b = aVar;
        }

        @Override // com.p2082ss.android.medialib.camera.AbstractC29994a
        /* renamed from: a */
        public final void mo52823a(int i, int i2, String str) {
            this.f74669a.mo56666b(this);
            this.f74669a.f74661v = 0.0f;
            this.f74669a.f74662w = 0.0f;
            AbstractC29994a aVar = this.f74670b;
            if (aVar != null) {
                aVar.mo52823a(i, i2, str);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final int mo56639a(PrivacyCert privacyCert) {
        int i = 1;
        if (mo56676e() == 1) {
            i = mo56678f().mo56744b();
        } else {
            mo56678f();
        }
        mo56664b(i, null, privacyCert);
        return i;
    }

    /* renamed from: b */
    public final void mo56666b(AbstractC29994a aVar) {
        C89219l.m154721d(aVar, "");
        this.f74642c.remove(aVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: c */
    public final void mo56673c(PrivacyCert privacyCert) {
        this.f74654o.mo131489b(privacyCert);
    }

    /* renamed from: d */
    private final void m64502d(float f) {
        if (!C31189h.m64681a(this) || !this.f74634R) {
            C31016b.f74339a.mo56123d("ZOOM veStartZoom zoom:".concat(String.valueOf(f)));
            this.f74654o.mo131470a(f);
            return;
        }
        C31016b.f74339a.mo56123d("ZOOM veStartShaderZoom zoom:".concat(String.valueOf(f)));
        this.f74627I.mo130721a(f);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: b */
    public final void mo56668b(AbstractC31187f fVar) {
        C89219l.m154721d(fVar, "");
        C31098f.m64301a(new C31155h(this, fVar));
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56643a(AbstractC29994a aVar) {
        C89219l.m154721d(aVar, "");
        this.f74642c.add(aVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56644a(C29998d.AbstractC30001a aVar) {
        if (aVar != null) {
            this.f74641b.add(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: b */
    public final void mo56663b(int i) {
        VECameraSettings.CAMERA_FLASH_MODE camera_flash_mode;
        AbstractC31014b bVar;
        C31016b.f74339a.mo56122c("Flash:switchFlashMode,mode:".concat(String.valueOf(i)));
        if (i == 0) {
            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF;
        } else if (i == 1) {
            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_ON;
        } else if (i == 2) {
            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH;
        } else if (i == 3) {
            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO;
        } else if (i == 4) {
            camera_flash_mode = VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_RED_EYE;
        } else {
            throw new IllegalStateException();
        }
        if (camera_flash_mode != VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_AUTO) {
            this.f74654o.mo131474a(camera_flash_mode);
        } else {
            this.f74654o.mo131474a(VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF);
        }
        if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_TORCH) {
            AbstractC31014b bVar2 = this.f74645f;
            if (bVar2 != null) {
                bVar2.mo56115o();
            }
        } else if (camera_flash_mode == VECameraSettings.CAMERA_FLASH_MODE.CAMERA_FLASH_OFF && (bVar = this.f74645f) != null) {
            bVar.mo56116p();
        }
        this.f74623E = i;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56647a(AbstractC31014b bVar) {
        this.f74645f = bVar;
        if (bVar != null) {
            bVar.mo56097a(new C31156i(this));
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: b */
    public final void mo56669b(boolean z) {
        VECameraSettings.C85211a aVar = new VECameraSettings.C85211a(this.f74655p);
        aVar.mo130240a(z);
        aVar.mo130235a(this.f74637U.mo56142e());
        VECameraSettings vECameraSettings = aVar.f190733a;
        C89219l.m154716b(vECameraSettings, "");
        this.f74655p = vECameraSettings;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56648a(AbstractC31187f fVar) {
        C89219l.m154721d(fVar, "");
        C31098f.m64301a(new C31147b(this, fVar));
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: b */
    public final boolean mo56670b(float f) {
        if (!mo56687o() || !mo56692p()) {
            return false;
        }
        if (C31189h.m64682b(this)) {
            float f2 = this.f74656q - 1.0f;
            if (this.f74663x <= 0.0f) {
                this.f74663x = 1.0f;
            }
            if (f <= 0.0f) {
                return false;
            }
            float f3 = (((f - this.f74661v) * f2) / this.f74663x) + 1.0f;
            this.f74661v = f;
            C31016b.f74339a.mo56122c("ZOOM scaleCamera factor = ".concat(String.valueOf(f3)));
            C31016b.f74339a.mo56122c("ZOOM scaleCamera zoomV2CurrentZoom = " + this.f74663x);
            float f4 = this.f74663x;
            if (f4 * f3 >= this.f74656q || (!this.f74664y && f3 <= 1.0f)) {
                return false;
            }
            this.f74663x = f4 * f3;
            return m64501c(f3);
        }
        C31016b.f74339a.mo56122c("ZOOM [" + System.identityHashCode(this) + "] scaleCameraByRatio ratio = " + f);
        if (((double) f) <= 0.05d) {
            f /= 4.0f;
        }
        float max = Math.max(0.0f, ((f - this.f74661v) * this.f74656q) + this.f74662w);
        this.f74661v = f;
        return mo56658a(max);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56649a(C85346av.AbstractC85373r rVar) {
        this.f74621C = rVar;
        this.f74654o.mo131484a(rVar);
    }

    /* renamed from: b */
    private final void m64499b(boolean z, PrivacyCert privacyCert) {
        MethodCollector.m26663i(4664);
        synchronized (this.f74650k) {
            try {
                this.f74653n = false;
                this.f74654o.mo130849c();
                AbstractC31014b bVar = this.f74645f;
                if (bVar != null) {
                    bVar.mo56107g();
                }
            } finally {
                MethodCollector.m26664o(4664);
            }
        }
        this.f74654o.mo131477a(z, privacyCert);
        AbstractC31014b bVar2 = this.f74645f;
        if (bVar2 != null) {
            bVar2.mo56101c();
        }
        this.f74654o.mo131482a((VEListener.AbstractC85242k) null);
        this.f74654o.mo131483a((C85346av.AbstractC85366k) null);
        this.f74654o.mo131484a((C85346av.AbstractC85373r) null);
        this.f74642c.clear();
        this.f74648i = false;
        this.f74649j = -1;
        if (C31165b.f74716b) {
            C31165b.f74715a = -1;
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56646a(C30933l.C30934a aVar, PrivacyCert privacyCert) {
        this.f74654o.mo131481a(aVar, privacyCert);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56640a(float f, float f2, float f3) {
        this.f74627I.mo130722a(f, f2, f3);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: a */
    public final void mo56642a(int i, AbstractC29994a aVar, PrivacyCert privacyCert) {
        if (!this.f74637U.mo56146i()) {
            m64500c(i, aVar, privacyCert);
            return;
        }
        throw new IllegalAccessError("Cannot be turned on in automatic mode!");
    }

    /* renamed from: c */
    private final void m64500c(int i, AbstractC29994a aVar, PrivacyCert privacyCert) {
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f74634R = z;
        this.f74655p.f190711l = C31190i.m64683a(i);
        if (C31181c.f74765a && C31189h.m64682b(this)) {
            VECameraSettings.C85211a aVar2 = new VECameraSettings.C85211a(this.f74655p);
            aVar2.mo130242b();
            C31016b.f74339a.mo56122c("ZOOM enableMaxZoomOptimized");
            VECameraSettings vECameraSettings = aVar2.f190733a;
            C89219l.m154716b(vECameraSettings, "");
            this.f74655p = vECameraSettings;
        }
        C85528o oVar = this.f74654o;
        Context applicationContext = this.f74625G.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        oVar.mo131472a(applicationContext, this.f74655p);
        mo56643a(new C31151f(this, aVar));
        this.f74654o.mo131483a(new C31157j(this));
        this.f74654o.mo131482a(new C31152g(this));
        this.f74654o.mo131473a(privacyCert);
        AbstractC31014b bVar = this.f74645f;
        if (bVar != null) {
            bVar.mo56095a();
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d
    /* renamed from: b */
    public final void mo56664b(int i, AbstractC29994a aVar, PrivacyCert privacyCert) {
        if (C31189h.m64681a(this) && this.f74634R) {
            m64502d(1.0f);
        }
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        this.f74634R = z;
        mo56643a(new C31148c(this, aVar));
        VECameraSettings.C85211a aVar2 = new VECameraSettings.C85211a(this.f74655p);
        aVar2.mo130237a(C31190i.m64683a(i));
        aVar2.mo130235a(this.f74637U.mo56142e());
        VECameraSettings vECameraSettings = aVar2.f190733a;
        C89219l.m154716b(vECameraSettings, "");
        this.f74655p = vECameraSettings;
        this.f74654o.mo131475a(vECameraSettings, privacyCert);
    }

    public VECameraController(Context context, AbstractC1204m mVar, C85346av avVar, AbstractC31191d dVar, AbstractC31034c cVar, C31182a aVar, boolean z, boolean z2) {
        VECameraSettings.CAMERA_FACING_ID camera_facing_id;
        VECameraSettings.CAMERA_OUTPUT_MODE camera_output_mode;
        C89219l.m154721d(context, "");
        C89219l.m154721d(avVar, "");
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        this.f74625G = context;
        this.f74626H = mVar;
        this.f74627I = avVar;
        this.f74636T = dVar;
        this.f74637U = cVar;
        this.f74628J = aVar;
        this.f74638V = z;
        this.f74639W = z2;
        C89219l.m154721d(cVar, "");
        VECameraSettings.C85211a aVar2 = new VECameraSettings.C85211a();
        if (!C31165b.f74716b) {
            aVar2.mo130239a(cVar.mo56139b());
            aVar2.mo130244b(cVar.mo56140c());
        } else {
            aVar2.mo130233a();
        }
        EnumC31020c a = cVar.mo56138a();
        C89219l.m154721d(a, "");
        int i = C31023e.f74344a[a.ordinal()];
        if (i == 1) {
            camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
        } else if (i == 2) {
            camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
        } else if (i == 3) {
            camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE;
        } else {
            throw new C89376n();
        }
        aVar2.mo130237a(camera_facing_id);
        aVar2.mo130234a(cVar.mo56141d());
        if (cVar.mo56149l()) {
            camera_output_mode = VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE;
        } else {
            C31012a.m63724a();
            camera_output_mode = VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE;
        }
        aVar2.mo130238a(camera_output_mode);
        aVar2.mo130235a(cVar.mo56142e());
        aVar2.mo130243b(cVar.mo56145h());
        PreviewSize n = C31012a.m63724a().mo56200n();
        if (n != null) {
            aVar2.mo130236a(n.getWidth(), n.getHeight());
        }
        VECameraSettings vECameraSettings = aVar2.f190733a;
        vECameraSettings.f190674D = cVar.mo56151n();
        C89219l.m154716b(vECameraSettings, "");
        this.f74655p = vECameraSettings;
        this.f74656q = -1.0f;
        this.f74631O = C89250i.m154773a((AbstractC89171a) new C31160k(this));
        this.f74632P = true;
        this.f74660u = new ArrayList();
        this.f74663x = 1.0f;
        this.f74664y = true;
        this.f74633Q = -1;
        this.f74665z = -1;
        this.f74619A = 1;
        this.f74620B = new ArrayList();
        C31098f.m64301a(new AbstractC89171a<C89391z>(this) {
            /* class com.p2082ss.android.ugc.asve.recorder.camera.VECameraController.C311451 */

            /* renamed from: a */
            final /* synthetic */ VECameraController f74666a;

            static {
                Covode.recordClassIndex(37789);
            }

            {
                this.f74666a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                AbstractC1196i lifecycle;
                AbstractC1204m mVar = this.f74666a.f74626H;
                if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
                    lifecycle.mo4012a(this.f74666a);
                }
                return C89391z.f203057a;
            }
        });
        SparseIntArray sparseIntArray = new SparseIntArray(3);
        sparseIntArray.put(0, 2);
        sparseIntArray.put(2, 0);
        this.f74624F = sparseIntArray;
    }
}
