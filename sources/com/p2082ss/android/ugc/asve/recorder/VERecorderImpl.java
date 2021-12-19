package com.p2082ss.android.ugc.asve.recorder;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.Surface;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.listener.AbstractC30012b;
import com.p2082ss.android.ugc.asve.C31016b;
import com.p2082ss.android.ugc.asve.context.AbstractC31040h;
import com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b;
import com.p2082ss.android.ugc.asve.p2212a.C31013a;
import com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a;
import com.p2082ss.android.ugc.asve.p2215d.C31052b;
import com.p2082ss.android.ugc.asve.p2217f.C31098f;
import com.p2082ss.android.ugc.asve.recorder.camera.VECameraController;
import com.p2082ss.android.ugc.asve.recorder.camera.p2224c.C31182a;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.effect.C31194b;
import com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31123a;
import com.p2082ss.android.ugc.asve.recorder.p2219a.C31125c;
import com.p2082ss.android.ugc.asve.recorder.p2220b.AbstractC31130a;
import com.p2082ss.android.ugc.asve.recorder.p2220b.C31131b;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.asve.recorder.p2221c.C31134b;
import com.p2082ss.android.ugc.asve.recorder.reaction.AbstractC31218a;
import com.p2082ss.android.ugc.asve.recorder.reaction.C31226b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VEVolumeParam;
import com.p2082ss.android.vesdk.audio.AbstractC85340h;
import com.p2082ss.android.vesdk.audio.EnumC85339g;
import com.p2082ss.android.vesdk.lens.VEAdaptiveSharpenParams;
import com.p2082ss.android.vesdk.runtime.AbstractC85556e;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl */
public final class VERecorderImpl implements AbstractC31191d, AbstractC33974au {

    /* renamed from: a */
    public AbstractC89172b<? super Integer, C89391z> f74536a;

    /* renamed from: b */
    public AbstractC89188r<? super Integer, ? super Integer, ? super String, ? super C85346av, C89391z> f74537b;

    /* renamed from: c */
    public final Context f74538c;

    /* renamed from: d */
    public final AbstractC31040h f74539d;

    /* renamed from: e */
    public final AbstractC1204m f74540e;

    /* renamed from: f */
    public final C31182a f74541f;

    /* renamed from: g */
    private final AbstractC89244h f74542g = C89250i.m154773a((AbstractC89171a) new C31115j(this));

    /* renamed from: h */
    private final AbstractC89244h f74543h = C89250i.m154773a((AbstractC89171a) new C31106a(this));

    /* renamed from: i */
    private final AbstractC89244h f74544i = C89250i.m154773a((AbstractC89171a) new C31108c(this));

    /* renamed from: j */
    private final AbstractC89244h f74545j = C89250i.m154773a((AbstractC89171a) new C31109d(this));

    /* renamed from: k */
    private final AbstractC89244h f74546k = C89250i.m154773a((AbstractC89171a) new C31107b(this));

    /* renamed from: l */
    private final AbstractC89244h f74547l = C89250i.m154773a((AbstractC89171a) new C31116k(this));

    /* renamed from: m */
    private final C31052b f74548m;

    /* renamed from: n */
    private final AbstractC89244h f74549n;

    /* renamed from: o */
    private final AbstractC89244h f74550o;

    /* renamed from: p */
    private final AbstractC89244h f74551p;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$f */
    public static final class C31111f implements VEListener.AbstractC85241j {

        /* renamed from: a */
        public static final C31111f f74558a = new C31111f();

        static {
            Covode.recordClassIndex(37753);
        }

        C31111f() {
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85241j
        /* renamed from: a */
        public final void mo56563a(int i) {
        }
    }

    static {
        Covode.recordClassIndex(37745);
    }

    /* renamed from: a */
    public final VECameraController mo56535a() {
        return (VECameraController) this.f74542g.getValue();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: a */
    public final void mo56536a(Context context) {
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: b */
    public final AbstractC31123a mo56543b() {
        return (AbstractC31123a) this.f74543h.getValue();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: d */
    public final AbstractC31130a mo56546d() {
        return (AbstractC31130a) this.f74544i.getValue();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: e */
    public final AbstractC31193a mo56547e() {
        return (AbstractC31193a) this.f74545j.getValue();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: f */
    public final AbstractC31133a mo56548f() {
        return (AbstractC31133a) this.f74550o.getValue();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: g */
    public final AbstractC31218a mo56549g() {
        return (AbstractC31218a) this.f74551p.getValue();
    }

    /* renamed from: i */
    public final VECameraController mo56545c() {
        return (VECameraController) this.f74546k.getValue();
    }

    /* renamed from: j */
    public final C85346av mo56552j() {
        return (C85346av) this.f74547l.getValue();
    }

    /* renamed from: k */
    public final CopyOnWriteArrayList<AbstractC30012b> mo56553k() {
        return (CopyOnWriteArrayList) this.f74549n.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            onResume();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_PAUSE) {
            onPause();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            release();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$e */
    public static final class C31110e implements C85346av.AbstractC85372q {
        static {
            Covode.recordClassIndex(37752);
        }

        @Override // com.p2082ss.android.vesdk.C85346av.AbstractC85372q
        /* renamed from: a */
        public final void mo56562a(int i, float f, int i2) {
        }

        C31110e() {
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: h */
    public final AbstractC31049a mo56550h() {
        return this.f74548m;
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$b */
    static final class C31107b extends AbstractC89220m implements AbstractC89171a<VECameraController> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f74555a;

        static {
            Covode.recordClassIndex(37749);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31107b(VERecorderImpl vERecorderImpl) {
            super(0);
            this.f74555a = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VECameraController invoke() {
            return this.f74555a.mo56535a();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$h */
    static final class C31113h extends AbstractC89220m implements AbstractC89171a<CopyOnWriteArrayList<AbstractC30012b>> {

        /* renamed from: a */
        public static final C31113h f74560a = new C31113h();

        static {
            Covode.recordClassIndex(37755);
        }

        C31113h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CopyOnWriteArrayList<AbstractC30012b> invoke() {
            return new CopyOnWriteArrayList();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$a */
    static final class C31106a extends AbstractC89220m implements AbstractC89171a<C31125c> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f74554a;

        static {
            Covode.recordClassIndex(37748);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31106a(VERecorderImpl vERecorderImpl) {
            super(0);
            this.f74554a = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31125c invoke() {
            return new C31125c(this.f74554a.mo56552j(), this.f74554a.f74539d);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$c */
    static final class C31108c extends AbstractC89220m implements AbstractC89171a<C31131b> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f74556a;

        static {
            Covode.recordClassIndex(37750);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31108c(VERecorderImpl vERecorderImpl) {
            super(0);
            this.f74556a = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31131b invoke() {
            return new C31131b(this.f74556a.mo56552j());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$d */
    static final class C31109d extends AbstractC89220m implements AbstractC89171a<C31194b> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f74557a;

        static {
            Covode.recordClassIndex(37751);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31109d(VERecorderImpl vERecorderImpl) {
            super(0);
            this.f74557a = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31194b invoke() {
            return new C31194b(this.f74557a.mo56552j());
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_PAUSE)
    public final void onPause() {
        if (this.f74539d.mo56161h()) {
            mo56543b().mo56576b();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$g */
    static final class C31112g extends AbstractC89220m implements AbstractC89171a<C31134b> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f74559a;

        static {
            Covode.recordClassIndex(37754);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31112g(VERecorderImpl vERecorderImpl) {
            super(0);
            this.f74559a = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31134b invoke() {
            return new C31134b(this.f74559a.mo56552j(), this.f74559a.f74539d, this.f74559a.mo56535a().f74655p);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$i */
    static final class C31114i extends AbstractC89220m implements AbstractC89171a<C31226b> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f74561a;

        static {
            Covode.recordClassIndex(37756);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31114i(VERecorderImpl vERecorderImpl) {
            super(0);
            this.f74561a = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31226b invoke() {
            C85346av j = this.f74561a.mo56552j();
            Context context = this.f74561a.f74538c;
            VERecorderImpl vERecorderImpl = this.f74561a;
            return new C31226b(j, context, vERecorderImpl, vERecorderImpl.f74539d.mo56159f(), this.f74561a.f74539d.mo56166m());
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void release() {
        C31016b.f74339a.mo56122c("camera ON_DESTROY ");
        AbstractC31014b bVar = mo56545c().f74645f;
        if (bVar != null) {
            bVar.mo56117q();
        }
        mo56552j().mo130823o();
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$k */
    static final class C31116k extends AbstractC89220m implements AbstractC89171a<C85346av> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f74563a;

        static {
            Covode.recordClassIndex(37758);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31116k(VERecorderImpl vERecorderImpl) {
            super(0);
            this.f74563a = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C85346av invoke() {
            C31217m mVar = new C31217m(this.f74563a.f74539d.mo56158e());
            Context applicationContext = this.f74563a.f74538c.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            return new C85346av(mVar, applicationContext);
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.VERecorderImpl$j */
    static final class C31115j extends AbstractC89220m implements AbstractC89171a<VECameraController> {

        /* renamed from: a */
        final /* synthetic */ VERecorderImpl f74562a;

        static {
            Covode.recordClassIndex(37757);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31115j(VERecorderImpl vERecorderImpl) {
            super(0);
            this.f74562a = vERecorderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VECameraController invoke() {
            Context context = this.f74562a.f74538c;
            AbstractC1204m mVar = this.f74562a.f74540e;
            C85346av j = this.f74562a.mo56552j();
            VERecorderImpl vERecorderImpl = this.f74562a;
            VECameraController vECameraController = new VECameraController(context, mVar, j, vERecorderImpl, vERecorderImpl.f74539d.mo56168o(), this.f74562a.f74541f, this.f74562a.f74539d.mo56175v(), this.f74562a.f74539d.mo56179z());
            vECameraController.f74658s = this.f74562a.f74539d.mo56154a();
            vECameraController.f74659t = this.f74562a.f74539d.mo56155b();
            if (this.f74562a.f74539d.mo56178y()) {
                SparseIntArray sparseIntArray = new SparseIntArray(3);
                sparseIntArray.put(0, 2);
                sparseIntArray.put(2, 3);
                sparseIntArray.put(3, 0);
                C89219l.m154721d(sparseIntArray, "");
                vECameraController.f74624F = sparseIntArray;
            }
            return vECameraController;
        }
    }

    /* renamed from: l */
    public final void mo56554l() {
        if (this.f74539d.mo56153B()) {
            mo56552j().mo130697a(C31215k.m64883a(this.f74539d), C31215k.m64882a(), C31215k.m64884b(this.f74539d));
        } else {
            mo56552j().mo130698a(C31215k.m64883a(this.f74539d), C31215k.m64882a(), C31215k.m64884b(this.f74539d), mo56545c().mo56695s());
        }
        if (this.f74539d.mo56176w()) {
            mo56552j().mo130732a((Surface) null, C31111f.f74558a);
        }
        if (this.f74539d.mo56177x()) {
            C85346av j = mo56552j();
            VEAdaptiveSharpenParams vEAdaptiveSharpenParams = new VEAdaptiveSharpenParams();
            vEAdaptiveSharpenParams.algorithmFlag = 24;
            j.mo130751a(vEAdaptiveSharpenParams, new C31110e());
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void onResume() {
        if (this.f74539d.mo56161h()) {
            AbstractC31040h hVar = this.f74539d;
            C89219l.m154721d(this, "");
            C89219l.m154721d(hVar, "");
            if (hVar.mo56164k().invoke().booleanValue()) {
                mo56552j();
                mo56543b().mo56570a().mo131427a((AbstractC85340h) null);
            } else {
                mo56543b().mo56570a().mo131427a(EnumC85339g.INSTANCE);
            }
            mo56543b().mo56573a("record");
        }
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: a */
    public final void mo56537a(AbstractC30012b bVar) {
        C89219l.m154721d(bVar, "");
        mo56553k().add(bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: b */
    public final void mo56544b(AbstractC30012b bVar) {
        C89219l.m154721d(bVar, "");
        mo56553k().remove(bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: a */
    public final void mo56538a(C85346av.AbstractC85365j jVar) {
        mo56552j().mo130745a(jVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: a */
    public final void mo56539a(AbstractC85541q qVar) {
        mo56552j().mo130752a(qVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: a */
    public final void mo56541a(AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f74536a = bVar;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: a */
    public final void mo56542a(AbstractC89188r<? super Integer, ? super Integer, ? super String, ? super C85346av, C89391z> rVar) {
        C89219l.m154721d(rVar, "");
        this.f74537b = rVar;
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: a */
    public final void mo56540a(AbstractC85556e eVar, String str) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        mo56552j().mo130703a(eVar);
        mo56547e().mo56809d();
    }

    public VERecorderImpl(Context context, AbstractC31040h hVar, AbstractC1204m mVar, C31182a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hVar, "");
        this.f74538c = context;
        this.f74539d = hVar;
        this.f74540e = mVar;
        this.f74541f = aVar;
        this.f74548m = new C31052b(mo56552j(), hVar);
        this.f74549n = C89250i.m154773a((AbstractC89171a) C31113h.f74560a);
        if (hVar.mo56168o().mo56146i()) {
            C31216l lVar = new C31216l(this);
            C89219l.m154721d(lVar, "");
            lVar.get();
        }
        C31098f.m64301a(new AbstractC89171a<C89391z>(this) {
            /* class com.p2082ss.android.ugc.asve.recorder.VERecorderImpl.C311041 */

            /* renamed from: a */
            final /* synthetic */ VERecorderImpl f74552a;

            static {
                Covode.recordClassIndex(37746);
            }

            {
                this.f74552a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                AbstractC1196i lifecycle;
                AbstractC1204m mVar = this.f74552a.f74540e;
                if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
                    lifecycle.mo4012a(this.f74552a);
                }
                return C89391z.f203057a;
            }
        });
        VEVolumeParam vEVolumeParam = new VEVolumeParam();
        hVar.mo56167n();
        vEVolumeParam.f190875b = 1.0f;
        vEVolumeParam.f190876c = hVar.mo56167n().mo56180a();
        mo56552j().mo130741a(vEVolumeParam);
        mo56552j().mo130761a(hVar.mo56160g());
        mo56552j().mo130737a(new VEListener.AbstractC85229ah(this) {
            /* class com.p2082ss.android.ugc.asve.recorder.VERecorderImpl.C311052 */

            /* renamed from: a */
            final /* synthetic */ VERecorderImpl f74553a;

            static {
                Covode.recordClassIndex(37747);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f74553a = r1;
            }

            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85230ai
            /* renamed from: a */
            public final void mo56558a(int i) {
                Iterator<T> it = this.f74553a.mo56553k().iterator();
                while (it.hasNext()) {
                    it.next().mo52865a(i);
                }
                if (i == 0) {
                    this.f74553a.mo56552j().mo130699a(new C31013a());
                }
            }

            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85230ai
            /* renamed from: a */
            public final void mo56561a(boolean z) {
                for (T t : this.f74553a.mo56553k()) {
                    if (this.f74553a.f74539d.mo56164k().invoke().booleanValue()) {
                        t.mo52866a(!z ? 1 : 0, 1);
                    } else {
                        t.mo52866a(z ? 1 : 0, 1);
                    }
                }
            }

            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85229ah
            /* renamed from: a */
            public final void mo56560a(int i, String str) {
                C89219l.m154721d(str, "");
                AbstractC89172b<? super Integer, C89391z> bVar = this.f74553a.f74536a;
                if (bVar == null) {
                    C89219l.m154710a("runningErrorCallback");
                }
                bVar.invoke(Integer.valueOf(i));
            }

            @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85229ah
            /* renamed from: a */
            public final void mo56559a(int i, int i2, String str) {
                MethodCollector.m26663i(9020);
                boolean z = false;
                if (i == 1000) {
                    VECameraController i3 = this.f74553a.mo56545c();
                    if (i3 != null) {
                        synchronized (i3.f74650k) {
                            try {
                                i3.f74651l = true;
                                if (i3.f74653n) {
                                    i3.f74627I.mo130749a(i3.f74654o);
                                    AbstractC31014b bVar = i3.f74645f;
                                    if (bVar != null) {
                                        bVar.mo56105e();
                                    }
                                    z = true;
                                }
                                i3.f74652m = z;
                            } catch (Throwable th) {
                                MethodCollector.m26664o(9020);
                                throw th;
                            }
                        }
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.camera.VECameraController");
                        MethodCollector.m26664o(9020);
                        throw nullPointerException;
                    }
                } else if (i == 1001) {
                    VECameraController i4 = this.f74553a.mo56545c();
                    if (i4 != null) {
                        synchronized (i4.f74650k) {
                            try {
                                i4.f74651l = false;
                                if (i4.f74652m) {
                                    i4.f74627I.mo130815k();
                                    i4.f74652m = false;
                                }
                            } catch (Throwable th2) {
                                MethodCollector.m26664o(9020);
                                throw th2;
                            }
                        }
                    } else {
                        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.asve.recorder.camera.VECameraController");
                        MethodCollector.m26664o(9020);
                        throw nullPointerException2;
                    }
                } else if (i == 1040) {
                    C31214j.f74812a = Integer.valueOf(i2);
                } else if (i == 1041) {
                    C31214j.f74813b = Integer.valueOf(i2);
                }
                AbstractC89188r<? super Integer, ? super Integer, ? super String, ? super C85346av, C89391z> rVar = this.f74553a.f74537b;
                if (rVar != null) {
                    rVar.mo8774a(Integer.valueOf(i), Integer.valueOf(i2), str, this.f74553a.mo56552j());
                    MethodCollector.m26664o(9020);
                    return;
                }
                MethodCollector.m26664o(9020);
            }
        });
        mo56552j().mo130806f(hVar.mo56161h());
        mo56554l();
        this.f74550o = C89250i.m154773a((AbstractC89171a) new C31112g(this));
        this.f74551p = C89250i.m154773a((AbstractC89171a) new C31114i(this));
    }
}
