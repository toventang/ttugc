package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import android.content.Intent;
import androidx.core.p036g.C0692e;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.AbstractC1215v;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.C16041a;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ttve.monitor.TEMonitorInvoker;
import com.p2082ss.android.ugc.asve.editor.C31060a;
import com.p2082ss.android.ugc.asve.editor.C31079j;
import com.p2082ss.android.ugc.asve.editor.C31080k;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.C69842at;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70073g;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.CutVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.scene.AbstractC70302c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70463h;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70484n;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70409d;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.C70576a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.C72449g;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73950ak;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.themechange.base.C77795c;
import com.p2082ss.android.ugc.aweme.tools.p4098c.C78100a;
import com.p2082ss.android.ugc.aweme.tools.p4098c.C78102c;
import com.p2082ss.android.ugc.aweme.utils.C80532hf;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85391be;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.ROTATE_DEGREE;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.VEUtils;
import dmt.p4542av.video.VEEditorAutoStartStopArbiter;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter */
public final class VECutVideoPresenter implements AbstractC33974au {

    /* renamed from: a */
    public int f156550a;

    /* renamed from: b */
    public boolean f156551b;

    /* renamed from: c */
    public boolean f156552c;

    /* renamed from: d */
    public float f156553d;

    /* renamed from: e */
    public int f156554e;

    /* renamed from: f */
    public AbstractC70078j f156555f;

    /* renamed from: g */
    public C31060a f156556g;

    /* renamed from: h */
    public AbstractC85541q f156557h;

    /* renamed from: i */
    public VEVideoCutterViewModel f156558i;

    /* renamed from: j */
    public VideoEditViewModel f156559j;

    /* renamed from: k */
    public C70484n f156560k;

    /* renamed from: l */
    public C72449g f156561l;

    /* renamed from: m */
    public VEListener.AbstractC85253v f156562m;

    /* renamed from: n */
    public boolean f156563n;

    /* renamed from: o */
    public final AbstractC70098s f156564o;

    /* renamed from: p */
    public boolean f156565p;

    /* renamed from: q */
    private final AbstractC89244h f156566q;

    /* renamed from: r */
    private long f156567r;

    /* renamed from: s */
    private boolean f156568s;

    /* renamed from: t */
    private boolean f156569t;

    /* renamed from: u */
    private CutMultiVideoViewModel f156570u;

    /* renamed from: v */
    private final String f156571v;

    static {
        Covode.recordClassIndex(82432);
    }

    /* renamed from: c */
    public final boolean mo110491c() {
        return ((Boolean) this.f156566q.getValue()).booleanValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_RESUME) {
            performInit();
        } else if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            destroy();
        }
    }

    /* renamed from: a */
    public final void mo110488a(List<? extends VideoSegment> list, int i) {
        C0692e<Long, Long> d = this.f156564o.mo110617d();
        F f = d.f2750a;
        if (f == null) {
            f = 0L;
        }
        C89219l.m154716b(f, "");
        long longValue = f.longValue();
        S s = d.f2751b;
        if (s == null) {
            s = Long.valueOf(this.f156564o.mo110616c());
        }
        C89219l.m154716b(s, "");
        this.f156560k.mo111047a(list, i, longValue, s.longValue());
    }

    /* renamed from: a */
    public final void mo110489a(List<? extends VideoSegment> list, boolean z) {
        C70484n nVar = this.f156560k;
        if (nVar.f157497c) {
            AbstractC70076i iVar = nVar.f157496b;
            if (iVar != null) {
                iVar.mo110540a(list, z);
            }
        } else {
            AbstractC70076i iVar2 = nVar.f157495a;
            if (iVar2 != null) {
                iVar2.mo110540a(list, z);
            }
        }
        this.f156561l.mo114724a(list);
    }

    /* renamed from: a */
    public final void mo110487a(Workspace workspace, BackgroundVideoCompileConfigure backgroundVideoCompileConfigure, boolean z, AbstractC70302c cVar, boolean z2) {
        long j;
        VideoSegment videoSegment;
        MethodCollector.m26663i(11861);
        C89219l.m154721d(workspace, "");
        C89219l.m154721d(cVar, "");
        if (!this.f156569t) {
            C73991bj.m130128a("VECutVideo,return compile because of editor not init");
            MethodCollector.m26664o(11861);
            return;
        }
        boolean z3 = backgroundVideoCompileConfigure != null;
        long currentTimeMillis = System.currentTimeMillis();
        VideoEditViewModel videoEditViewModel = this.f156559j;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        List<VideoSegment> k = videoEditViewModel.mo111232k();
        long j2 = (k == null || (videoSegment = (VideoSegment) C89070n.m154561b(k, 0)) == null) ? -1 : videoSegment.f156710b;
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f156570u;
        if (cutMultiVideoViewModel == null) {
            C89219l.m154710a("cutMultiVideoViewModel");
        }
        if (j2 > cutMultiVideoViewModel.f156541m) {
            C31060a aVar = this.f156556g;
            VideoEditViewModel videoEditViewModel2 = this.f156559j;
            if (videoEditViewModel2 == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            List<VideoSegment> k2 = videoEditViewModel2.mo111232k();
            C89219l.m154716b(k2, "");
            C70097r.m123782a(aVar, k2);
        }
        AbstractC70078j jVar = this.f156555f;
        this.f156568s = jVar != null ? jVar.mo110556d() : false;
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f156558i;
        if (vEVideoCutterViewModel == null) {
            C89219l.m154710a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.mo111336a(new C70576a(2, true));
        AbstractC70078j jVar2 = this.f156555f;
        if (jVar2 != null) {
            j = jVar2.mo110548a();
        } else {
            j = 0;
        }
        this.f156567r = j;
        C70032l lVar = new C70032l(this);
        if (z) {
            this.f156550a = -11008;
        } else if (!z3) {
            this.f156564o.mo110620g();
            if (lVar.mo110497a() && !z2) {
                C70463h.m124289a(true, mo110492d(), String.valueOf(this.f156550a));
                cVar.mo110855a(true);
                C73991bj.m130128a("VECutVideo,using fastImport strategy");
                cVar.onCompileDone();
                if (mo110491c()) {
                    C31060a aVar2 = this.f156556g;
                    if (aVar2 != null) {
                        aVar2.mo56244E().mo131696h();
                    }
                    C31060a aVar3 = this.f156556g;
                    if (aVar3 != null) {
                        C85581w E = aVar3.mo56244E();
                        synchronized (E) {
                            try {
                                E.f191783T = false;
                                C85315al.m146641c("VEEditor", "onReleaseResource... ");
                                if (E.f191765B.getNativeHandler() != 0) {
                                    if (E.f191819af == 1) {
                                        TEMonitorInvoker.nativeMonitorPerfWithType(3);
                                    }
                                    E.f191765B.releasePreviewSurface();
                                    if (E.f191768E != null) {
                                        E.f191768E.getHolder().removeCallback(E.f191824ak);
                                    } else if (E.f191769F != null && E.f191769F.getSurfaceTextureListener() == E.f191823aj) {
                                        E.f191769F.setSurfaceTextureListener(null);
                                    }
                                    E.f191768E = null;
                                    E.f191769F = null;
                                    if (E.f191765B != null) {
                                        E.f191765B.setOpenGLListeners(null);
                                        E.f191765B.setInfoListener(null);
                                        E.f191765B.setErrorListener(null);
                                    }
                                    E.f191838e = null;
                                    if (E.f191818ae != null && !E.f191818ae.isRecycled()) {
                                        E.f191818ae.recycle();
                                        E.f191818ae = null;
                                    }
                                }
                            } catch (Throwable th) {
                                MethodCollector.m26664o(11861);
                                throw th;
                            }
                        }
                    }
                    this.f156569t = false;
                    MethodCollector.m26664o(11861);
                    return;
                }
                destroy();
                MethodCollector.m26664o(11861);
                return;
            }
        }
        cVar.mo110855a(false);
        C73991bj.m130128a("VECutVideo,using normalImport strategy");
        VideoEditViewModel videoEditViewModel3 = this.f156559j;
        if (videoEditViewModel3 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        C1731i b = C1731i.m5640b(new C70073g.CallableC70074a(videoEditViewModel3.mo111232k()), C1731i.f5562a);
        C89219l.m154716b(b, "");
        b.mo5532a((AbstractC1729g) new C70017c(this, currentTimeMillis, backgroundVideoCompileConfigure, workspace, cVar));
        MethodCollector.m26664o(11861);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$b */
    public static final class CallableC70016b<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f156573a;

        static {
            Covode.recordClassIndex(82434);
        }

        CallableC70016b(AbstractC89171a aVar) {
            this.f156573a = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f156573a.invoke();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$i */
    public static final class C70028i implements VEListener.AbstractC85253v {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f156601a;

        static {
            Covode.recordClassIndex(82446);
        }

        C70028i(VECutVideoPresenter vECutVideoPresenter) {
            this.f156601a = vECutVideoPresenter;
        }

        @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85253v
        /* renamed from: a */
        public final void mo56396a() {
            VECutVideoPresenter.m123655a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.C70028i.C700291 */

                /* renamed from: a */
                final /* synthetic */ C70028i f156602a;

                static {
                    Covode.recordClassIndex(82447);
                }

                {
                    this.f156602a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    if (this.f156602a.f156601a.f156551b) {
                        this.f156602a.f156601a.f156564o.mo110622i();
                        this.f156602a.f156601a.f156551b = false;
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$k */
    static final class C70031k extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f156604a;

        static {
            Covode.recordClassIndex(82449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70031k(VECutVideoPresenter vECutVideoPresenter) {
            super(0);
            this.f156604a = vECutVideoPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(m123669a());
        }

        /* renamed from: a */
        private boolean m123669a() {
            try {
                IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                C89219l.m154716b(iESSettingsProxy, "");
                Boolean enableReuseEditorForFastimport = iESSettingsProxy.getEnableReuseEditorForFastimport();
                C89219l.m154716b(enableReuseEditorForFastimport, "");
                if (!enableReuseEditorForFastimport.booleanValue() || this.f156604a.f156564o.mo110620g() != 0 || this.f156604a.f156563n) {
                    return false;
                }
                return true;
            } catch (C16041a unused) {
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$l */
    public static final class C70032l extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f156605a;

        static {
            Covode.recordClassIndex(82450);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70032l(VECutVideoPresenter vECutVideoPresenter) {
            super(0);
            this.f156605a = vECutVideoPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(mo110497a());
        }

        /* renamed from: a */
        public final boolean mo110497a() {
            List<VideoSegment> k = VECutVideoPresenter.m123657b(this.f156605a).mo111232k();
            C89219l.m154716b(k, "");
            ArrayList arrayList = new ArrayList();
            for (T t : k) {
                if (true ^ t.f156717i) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                VideoSegment videoSegment = (VideoSegment) arrayList2.get(i);
                if (C84896h.m145866a(videoSegment.mo110571a(false), true)) {
                    this.f156605a.f156550a = -11009;
                    return false;
                }
                int min = Math.min(videoSegment.f156714f, videoSegment.f156715g);
                int max = Math.max(videoSegment.f156714f, videoSegment.f156715g);
                try {
                    C89219l.m154716b(videoSegment, "");
                    C89378p<Integer, Boolean> a = C73950ak.m130042a(min, max, (int) (((float) videoSegment.mo110570a()) * videoSegment.mo110582f()));
                    this.f156605a.f156550a = a.getFirst().intValue();
                    if (this.f156605a.f156550a != 0) {
                        return false;
                    }
                } catch (Exception e) {
                    C73991bj.m130131b(e.getMessage());
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    public final boolean mo110490b() {
        AbstractC70078j jVar = this.f156555f;
        if (jVar != null) {
            return jVar.mo110551b();
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$j */
    public static final class C70030j extends AbstractC89220m implements AbstractC89171a<VEEditorAutoStartStopArbiter> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f156603a;

        static {
            Covode.recordClassIndex(82448);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70030j(VECutVideoPresenter vECutVideoPresenter) {
            super(0);
            this.f156603a = vECutVideoPresenter;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VEEditorAutoStartStopArbiter invoke() {
            return new VEEditorAutoStartStopArbiter(this.f156603a.f156564o.mo110613a(), this.f156603a.f156564o.mo110615b(), this.f156603a.f156556g, this.f156603a.f156564o.mo110621h(), this.f156603a.f156565p);
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void destroy() {
        if (this.f156569t) {
            C73991bj.m130133d("VECutVideoPresenter Destroy method stack: \n" + C80532hf.m139602a(10));
            this.f156569t = false;
            C31060a aVar = this.f156556g;
            if (aVar != null) {
                aVar.mo56387s();
            }
            this.f156564o.mo110619f();
            if (this.f156555f != null) {
                this.f156555f = null;
            }
        }
    }

    /* renamed from: d */
    public final int mo110492d() {
        VideoEditViewModel videoEditViewModel = this.f156559j;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        if (videoEditViewModel.mo111232k().size() == 1) {
            return 1;
        }
        VideoEditViewModel videoEditViewModel2 = this.f156559j;
        if (videoEditViewModel2 == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        List<VideoSegment> k = videoEditViewModel2.mo111232k();
        C89219l.m154716b(k, "");
        ArrayList arrayList = new ArrayList();
        for (T t : k) {
            if (!t.f156717i) {
                arrayList.add(t);
            }
        }
        if (arrayList.size() > 1) {
            return 2;
        }
        return 3;
    }

    /* renamed from: a */
    public final long mo110484a() {
        AbstractC70078j jVar = this.f156555f;
        if (jVar != null) {
            return jVar.mo110553c();
        }
        return 0;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_RESUME)
    public final void performInit() {
        int size;
        boolean z;
        int a;
        AbstractC70078j jVar;
        if (!this.f156569t) {
            VideoEditViewModel videoEditViewModel = this.f156559j;
            if (videoEditViewModel == null) {
                C89219l.m154710a("videoEditViewModel");
            }
            C1213t<CutVideoContext> tVar = videoEditViewModel.f157698w;
            C89219l.m154716b(tVar, "");
            if (tVar.getValue() == null) {
                C73991bj.m130131b("VECutVideoPresenter,init error because of null cutVideoContext");
            } else {
                VideoEditViewModel videoEditViewModel2 = this.f156559j;
                if (videoEditViewModel2 == null) {
                    C89219l.m154710a("videoEditViewModel");
                }
                List<VideoSegment> k = videoEditViewModel2.mo111232k();
                if (!(k == null || (size = k.size()) == 0)) {
                    this.f156569t = true;
                    C31060a aVar = new C31060a(this.f156571v, this.f156564o.mo110621h());
                    if (this.f156557h == null) {
                        this.f156557h = new C70026h(this);
                    }
                    AbstractC85541q qVar = this.f156557h;
                    if (qVar == null) {
                        C89219l.m154710a("infoCallback");
                    }
                    aVar.mo56344c(qVar);
                    aVar.mo56280a(C85581w.EnumC85606e.SCALE_MODE_CENTER_INSIDE);
                    aVar.mo56311a(true);
                    if (this.f156562m == null) {
                        this.f156562m = new C70028i(this);
                    }
                    VEListener.AbstractC85253v vVar = this.f156562m;
                    if (vVar == null) {
                        C89219l.m154710a("firstFrameListener");
                    }
                    aVar.mo56309a(vVar);
                    this.f156556g = aVar;
                    ArrayList arrayList = new ArrayList();
                    int[] iArr = new int[size];
                    int[] iArr2 = new int[size];
                    float[] fArr = new float[size];
                    int[] iArr3 = new int[size];
                    m123656a(k, arrayList, iArr, iArr2, fArr, iArr3);
                    Object[] array = arrayList.toArray(new String[0]);
                    Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                    C85391be beVar = new C85391be((String[]) array);
                    C31060a aVar2 = this.f156556g;
                    if (aVar2 == null) {
                        C89219l.m154715b();
                    }
                    C70504v vVar2 = new C70504v(aVar2, beVar);
                    C31060a aVar3 = this.f156556g;
                    if (aVar3 == null) {
                        C89219l.m154715b();
                    }
                    C70409d dVar = new C70409d(aVar3, beVar);
                    this.f156560k.f157495a = vVar2;
                    this.f156560k.f157496b = dVar;
                    this.f156561l.f162427a = this.f156556g;
                    C31060a aVar4 = this.f156556g;
                    if (aVar4 == null) {
                        C89219l.m154715b();
                    }
                    this.f156555f = new C70579x(aVar4, new C70030j(this));
                    C31060a aVar5 = this.f156556g;
                    if (aVar5 != null) {
                        aVar5.mo56348d(C63244g.m114602a().mo73281i().getVideoWidth(), C63244g.m114602a().mo73281i().getVideoHeight());
                        if (!C70455f.m124272c() || arrayList.size() <= 1) {
                            z = false;
                            Object[] array2 = arrayList.toArray(new String[0]);
                            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
                            C31079j jVar2 = new C31079j((String[]) array2);
                            jVar2.mo56409a(C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL);
                            jVar2.f74439a = iArr;
                            jVar2.f74440b = iArr2;
                            jVar2.f74445g = fArr;
                            a = aVar5.mo56274a(jVar2);
                        } else {
                            z = true;
                            Object[] array3 = arrayList.toArray(new String[0]);
                            Objects.requireNonNull(array3, "null cannot be cast to non-null type kotlin.Array<T>");
                            a = aVar5.mo56274a(new C31080k((String[]) array3, C85581w.EnumC85613l.VIDEO_OUT_RATIO_ORIGINAL));
                        }
                        if (a == 0) {
                            C78102c.m136523a(beVar, k, iArr, iArr2, fArr, iArr3);
                            C31060a aVar6 = this.f156556g;
                            if (aVar6 != null) {
                                aVar6.mo56277a(beVar);
                            }
                            this.f156561l.mo114724a(k);
                            aVar5.mo56331b(this.f156554e);
                            int a2 = C69842at.m123410a();
                            if (a2 <= 0) {
                                a2 = 30;
                            }
                            aVar5.mo56366i(a2);
                            aVar5.mo56313a(0, 1, 0.5f);
                            if (!z || !this.f156552c) {
                                aVar5.mo56342c(1);
                            } else {
                                aVar5.mo56342c(0);
                            }
                            aVar5.mo56334b(true);
                            aVar5.mo56244E().mo131685f();
                            C0692e<Long, Long> d = this.f156564o.mo110617d();
                            F f = d.f2750a;
                            if (f == null) {
                                f = 0L;
                            }
                            C89219l.m154716b(f, "");
                            long longValue = f.longValue();
                            S s = d.f2751b;
                            if (s == null) {
                                s = Long.valueOf(this.f156564o.mo110616c());
                            }
                            C89219l.m154716b(s, "");
                            aVar5.mo56323b((int) longValue, (int) s.longValue());
                            if (k != null && (!k.isEmpty())) {
                                VideoSegment videoSegment = k.get(0);
                                if (this.f156564o.mo110620g() == 0 && videoSegment.f156718j > 0) {
                                    this.f156560k.mo111048a((float) videoSegment.f156718j, videoSegment.f156719k, videoSegment.f156720l, 0, 0);
                                }
                            }
                            boolean z2 = this.f156568s;
                            if (z2) {
                                AbstractC70078j jVar3 = this.f156555f;
                                if (jVar3 != null) {
                                    jVar3.mo110554c(z2);
                                }
                                this.f156568s = false;
                            }
                            if ((!z || !this.f156552c) && (jVar = this.f156555f) != null) {
                                boolean unused = jVar.mo110549a(this.f156567r, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek, null);
                            }
                            this.f156564o.mo110614a(this.f156556g);
                            return;
                        }
                    }
                }
            }
            this.f156564o.mo110618e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$f */
    public static final class C70024f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC70072f f156597a;

        static {
            Covode.recordClassIndex(82442);
        }

        public C70024f(AbstractC70072f fVar) {
            this.f156597a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f156597a.mo110529a(new IllegalStateException("The job is disposed."));
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ VEVideoCutterViewModel m123650a(VECutVideoPresenter vECutVideoPresenter) {
        VEVideoCutterViewModel vEVideoCutterViewModel = vECutVideoPresenter.f156558i;
        if (vEVideoCutterViewModel == null) {
            C89219l.m154710a("veVideoCutterViewModel");
        }
        return vEVideoCutterViewModel;
    }

    /* renamed from: b */
    public static final /* synthetic */ VideoEditViewModel m123657b(VECutVideoPresenter vECutVideoPresenter) {
        VideoEditViewModel videoEditViewModel = vECutVideoPresenter.f156559j;
        if (videoEditViewModel == null) {
            C89219l.m154710a("videoEditViewModel");
        }
        return videoEditViewModel;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$e */
    public static final class C70023e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC70072f f156596a;

        static {
            Covode.recordClassIndex(82441);
        }

        public C70023e(AbstractC70072f fVar) {
            this.f156596a = fVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Integer num = (Integer) obj;
            AbstractC70072f fVar = this.f156596a;
            C89219l.m154716b(num, "");
            fVar.mo110528a(num.intValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$d */
    public static final class C70022d<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ AbstractC70072f f156590a;

        /* renamed from: b */
        final /* synthetic */ String f156591b;

        /* renamed from: c */
        final /* synthetic */ int f156592c = 0;

        /* renamed from: d */
        final /* synthetic */ String f156593d;

        /* renamed from: e */
        final /* synthetic */ int f156594e;

        /* renamed from: f */
        final /* synthetic */ int f156595f;

        static {
            Covode.recordClassIndex(82440);
        }

        public C70022d(AbstractC70072f fVar, String str, String str2) {
            this.f156590a = fVar;
            this.f156591b = str;
            this.f156593d = str2;
            this.f156594e = 0;
            this.f156595f = -1;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<Integer> vVar) {
            C89219l.m154721d(vVar, "");
            if (vVar.isDisposed()) {
                vVar.mo143024a(new IllegalStateException("The job is disposed."));
            }
            vVar.mo143031a(Integer.valueOf(VEUtils.findAudioSegmentStartTimeInOrigin(this.f156591b, this.f156592c, this.f156593d, this.f156594e, this.f156595f)));
            vVar.mo143023a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$a */
    static final class C70015a<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f156572a;

        static {
            Covode.recordClassIndex(82433);
        }

        C70015a(VECutVideoPresenter vECutVideoPresenter) {
            this.f156572a = vECutVideoPresenter;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Integer valueOf;
            AbstractC70078j jVar;
            C70576a aVar = (C70576a) obj;
            if (aVar != null && (valueOf = Integer.valueOf(aVar.f157914d)) != null) {
                if (valueOf.intValue() == 1) {
                    AbstractC70078j jVar2 = this.f156572a.f156555f;
                    if (jVar2 != null) {
                        jVar2.mo110550a(aVar.f157915e);
                    }
                } else if (valueOf.intValue() == 2) {
                    AbstractC70078j jVar3 = this.f156572a.f156555f;
                    if (jVar3 != null) {
                        jVar3.mo110552b(aVar.f157915e);
                    }
                } else if (valueOf.intValue() == 3 && (jVar = this.f156572a.f156555f) != null) {
                    boolean unused = jVar.mo110549a(aVar.f157912b, aVar.f157911a, null);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m123655a(AbstractC89171a<C89391z> aVar) {
        C1731i.m5640b(new CallableC70016b(aVar), C1731i.f5564c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c */
    public static final class C70017c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f156574a;

        /* renamed from: b */
        final /* synthetic */ long f156575b;

        /* renamed from: c */
        final /* synthetic */ BackgroundVideoCompileConfigure f156576c;

        /* renamed from: d */
        final /* synthetic */ Workspace f156577d;

        /* renamed from: e */
        final /* synthetic */ AbstractC70302c f156578e;

        static {
            Covode.recordClassIndex(82435);
        }

        C70017c(VECutVideoPresenter vECutVideoPresenter, long j, BackgroundVideoCompileConfigure backgroundVideoCompileConfigure, Workspace workspace, AbstractC70302c cVar) {
            this.f156574a = vECutVideoPresenter;
            this.f156575b = j;
            this.f156576c = backgroundVideoCompileConfigure;
            this.f156577d = workspace;
            this.f156578e = cVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            int i;
            ROTATE_DEGREE rotate_degree;
            final C70071e eVar;
            Integer num;
            final long currentTimeMillis = System.currentTimeMillis() - this.f156575b;
            if (iVar == null || (num = (Integer) iVar.mo5545d()) == null) {
                i = 30;
            } else {
                i = num.intValue();
            }
            String a = SettingsManager.m29616a().mo25398a("import_compile_external_settings", "");
            C89219l.m154716b(a, "");
            if (this.f156576c == null) {
                List<VideoSegment> k = VECutVideoPresenter.m123657b(this.f156574a).mo111232k();
                C89219l.m154716b(k, "");
                Workspace workspace = this.f156577d;
                C89219l.m154721d(k, "");
                C89219l.m154721d(workspace, "");
                C89219l.m154721d(a, "");
                File a2 = workspace.mo110089a();
                C89219l.m154716b(a2, "");
                String path = a2.getPath();
                C89219l.m154716b(path, "");
                File b = workspace.mo110091b();
                C89219l.m154716b(b, "");
                eVar = new C70071e(k, path, b.getPath(), -1, -1, i, null, null, null, 0, 0, a, 8128);
            } else {
                List<VideoSegment> k2 = VECutVideoPresenter.m123657b(this.f156574a).mo111232k();
                C89219l.m154716b(k2, "");
                BackgroundVideoCompileConfigure backgroundVideoCompileConfigure = this.f156576c;
                float f = this.f156574a.f156553d;
                C89219l.m154721d(k2, "");
                C89219l.m154721d(backgroundVideoCompileConfigure, "");
                int i2 = k2.get(0).f156714f;
                int i3 = k2.get(0).f156715g;
                int i4 = (int) f;
                if (i4 == 90) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_90;
                } else if (i4 == 180) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_180;
                } else if (i4 != 270) {
                    rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
                } else {
                    rotate_degree = ROTATE_DEGREE.ROTATE_270;
                }
                if (!(rotate_degree == ROTATE_DEGREE.ROTATE_90 || rotate_degree == ROTATE_DEGREE.ROTATE_270)) {
                    i2 = i3;
                    i3 = i2;
                }
                eVar = new C70071e(k2, backgroundVideoCompileConfigure.f156527a, backgroundVideoCompileConfigure.f156528b, 480, (i2 * 480) / i3, i, null, null, null, 0, 2, null, 14272);
            }
            C31060a aVar = this.f156574a.f156556g;
            if (aVar != null) {
                C85581w E = aVar.mo56244E();
                C85315al.m146637a("VEEditor", "setSurfaceReDraw...");
                E.f191817ad = true;
            }
            C31060a aVar2 = this.f156574a.f156556g;
            if (aVar2 != null) {
                aVar2.mo56342c(-1);
            }
            C70484n nVar = this.f156574a.f156560k;
            C700181 r2 = new VEListener.AbstractC85248q(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.C70017c.C700181 */

                /* renamed from: a */
                final /* synthetic */ C70017c f156579a;

                static {
                    Covode.recordClassIndex(82436);
                }

                /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c$1$c */
                static final class C70021c extends AbstractC89220m implements AbstractC89171a<C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ C700181 f156588a;

                    /* renamed from: b */
                    final /* synthetic */ float f156589b;

                    static {
                        Covode.recordClassIndex(82439);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C70021c(C700181 r2, float f) {
                        super(0);
                        this.f156588a = r2;
                        this.f156589b = f;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f156588a.f156579a.f156578e.onCompileProgress(this.f156589b);
                        return C89391z.f203057a;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c$1$a */
                static final class C70019a extends AbstractC89220m implements AbstractC89171a<C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ C700181 f156582a;

                    static {
                        Covode.recordClassIndex(82437);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C70019a(C700181 r2) {
                        super(0);
                        this.f156582a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f156582a.f156579a.f156578e.onCompileDone();
                        this.f156582a.f156579a.f156574a.destroy();
                        return C89391z.f203057a;
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$c$1$b */
                static final class C70020b extends AbstractC89220m implements AbstractC89171a<C89391z> {

                    /* renamed from: a */
                    final /* synthetic */ C700181 f156583a;

                    /* renamed from: b */
                    final /* synthetic */ int f156584b;

                    /* renamed from: c */
                    final /* synthetic */ int f156585c;

                    /* renamed from: d */
                    final /* synthetic */ float f156586d;

                    /* renamed from: e */
                    final /* synthetic */ String f156587e;

                    static {
                        Covode.recordClassIndex(82438);
                    }

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C70020b(C700181 r2, int i, int i2, float f, String str) {
                        super(0);
                        this.f156583a = r2;
                        this.f156584b = i;
                        this.f156585c = i2;
                        this.f156586d = f;
                        this.f156587e = str;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        this.f156583a.f156579a.f156578e.onCompileError(this.f156584b, this.f156585c, this.f156586d, this.f156587e);
                        C31060a aVar = this.f156583a.f156579a.f156574a.f156556g;
                        if (aVar != null) {
                            aVar.mo56244E().mo131685f();
                        }
                        return C89391z.f203057a;
                    }
                }

                @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
                public final void onCompileDone() {
                    C70463h.m124289a(false, this.f156579a.f156574a.mo110492d(), "");
                    VECutVideoPresenter.m123652a(0, currentTimeMillis, System.currentTimeMillis() - this.f156579a.f156575b, eVar, 0, "");
                    VECutVideoPresenter.m123655a(new C70019a(this));
                }

                @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
                public final void onCompileProgress(float f) {
                    VECutVideoPresenter.m123655a(new C70021c(this, f));
                }

                {
                    this.f156579a = r1;
                }

                @Override // com.p2082ss.android.vesdk.VEListener.AbstractC85248q
                public final void onCompileError(int i, int i2, float f, String str) {
                    String str2;
                    long currentTimeMillis = System.currentTimeMillis() - this.f156579a.f156575b;
                    long j = currentTimeMillis;
                    C70071e eVar = eVar;
                    if (str == null) {
                        str2 = "";
                    } else {
                        str2 = str;
                    }
                    VECutVideoPresenter.m123652a(1, j, currentTimeMillis, eVar, i, str2);
                    VECutVideoPresenter.m123655a(new C70020b(this, i, i2, f, str));
                }
            };
            C89219l.m154721d(eVar, "");
            C89219l.m154721d(r2, "");
            AbstractC70076i iVar2 = nVar.f157495a;
            if (iVar2 != null) {
                iVar2.mo110537a(eVar, r2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$g */
    public static final class C70025g extends AbstractC89220m implements AbstractC89172b<long[], List<? extends VideoSegment>> {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f156598a;

        static {
            Covode.recordClassIndex(82443);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C70025g(VECutVideoPresenter vECutVideoPresenter) {
            super(1);
            this.f156598a = vECutVideoPresenter;
        }

        /* renamed from: a */
        public final List<VideoSegment> invoke(long[] jArr) {
            C89219l.m154721d(jArr, "");
            if (this.f156598a.f156564o.mo110620g() == 0 || (C70455f.m124272c() && this.f156598a.f156552c)) {
                jArr[0] = -1;
                jArr[1] = -1;
                List<VideoSegment> k = VECutVideoPresenter.m123657b(this.f156598a).mo111232k();
                C89219l.m154716b(k, "");
                ArrayList arrayList = new ArrayList();
                for (T t : k) {
                    if (!t.f156717i) {
                        arrayList.add(t);
                    }
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList();
            C0692e<Long, Long> d = this.f156598a.f156564o.mo110617d();
            F f = d.f2750a;
            long j = 0;
            if (f == null) {
                f = 0L;
            }
            C89219l.m154716b(f, "");
            long longValue = f.longValue();
            S s = d.f2751b;
            if (s == null) {
                s = Long.valueOf(this.f156598a.f156564o.mo110616c());
            }
            C89219l.m154716b(s, "");
            long longValue2 = s.longValue();
            List<VideoSegment> k2 = VECutVideoPresenter.m123657b(this.f156598a).mo111232k();
            C89219l.m154716b(k2, "");
            ArrayList arrayList3 = new ArrayList();
            for (T t2 : k2) {
                if (!t2.f156717i) {
                    arrayList3.add(t2);
                }
            }
            ArrayList arrayList4 = arrayList3;
            int size = arrayList4.size();
            long j2 = 0;
            long j3 = 0;
            for (int i = 0; i < size && j2 <= longValue2; i++) {
                VideoSegment videoSegment = (VideoSegment) arrayList4.get(i);
                C89219l.m154716b(videoSegment, "");
                j2 += videoSegment.mo110580e() - videoSegment.mo110578d();
                if (longValue > j2) {
                    j3 += videoSegment.mo110580e() - videoSegment.mo110578d();
                } else {
                    arrayList2.add(videoSegment);
                }
            }
            long j4 = longValue - j3;
            if (j4 >= 0) {
                j = j4;
            }
            jArr[0] = j;
            jArr[1] = j2 - longValue2;
            return arrayList2;
        }
    }

    /* renamed from: a */
    public final void mo110485a(C0692e<Long, Long> eVar) {
        long j;
        C89219l.m154721d(eVar, "");
        long c = this.f156564o.mo110616c();
        if (eVar.f2750a != null) {
            F f = eVar.f2750a;
            if (f == null) {
                C89219l.m154715b();
            }
            j = f.longValue();
        } else {
            j = 0;
        }
        if (eVar.f2751b != null) {
            S s = eVar.f2751b;
            if (s == null) {
                C89219l.m154715b();
            }
            c = s.longValue();
        }
        C70484n nVar = this.f156560k;
        int i = (int) j;
        int i2 = (int) c;
        if (nVar.f157497c) {
            AbstractC70076i iVar = nVar.f157496b;
            if (iVar != null) {
                iVar.mo110547c(i, i2);
                return;
            }
            return;
        }
        AbstractC70076i iVar2 = nVar.f157495a;
        if (iVar2 != null) {
            iVar2.mo110547c(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo110486a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
        C89219l.m154716b(a, "");
        this.f156570u = (CutMultiVideoViewModel) a;
        AbstractC1174ac a2 = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(VEVideoCutterViewModel.class);
        C89219l.m154716b(a2, "");
        this.f156558i = (VEVideoCutterViewModel) a2;
        AbstractC1174ac a3 = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(VideoEditViewModel.class);
        C89219l.m154716b(a3, "");
        this.f156559j = (VideoEditViewModel) a3;
        this.f156563n = C89219l.m154714a((Object) "from_chat", (Object) m123651a(eVar.getIntent(), "enter_from"));
        this.f156564o.mo110615b().getLifecycle().mo4012a(this);
        VEVideoCutterViewModel vEVideoCutterViewModel = this.f156558i;
        if (vEVideoCutterViewModel == null) {
            C89219l.m154710a("veVideoCutterViewModel");
        }
        vEVideoCutterViewModel.mo111335a().observe(this.f156564o.mo110615b(), new C70015a(this));
    }

    public /* synthetic */ VECutVideoPresenter(String str, AbstractC70098s sVar) {
        this(str, sVar, true);
    }

    /* renamed from: a */
    private static String m123651a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public VECutVideoPresenter(String str, AbstractC70098s sVar, boolean z) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(sVar, "");
        this.f156571v = str;
        this.f156564o = sVar;
        this.f156565p = z;
        this.f156566q = C89250i.m154773a((AbstractC89171a) new C70031k(this));
        this.f156550a = -1;
        this.f156551b = true;
        this.f156552c = true;
        this.f156554e = C77795c.m135910a(true, false, false, false);
        this.f156560k = new C70484n();
        this.f156561l = new C72449g();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter$h */
    public static final class C70026h implements AbstractC85541q {

        /* renamed from: a */
        final /* synthetic */ VECutVideoPresenter f156599a;

        static {
            Covode.recordClassIndex(82444);
        }

        C70026h(VECutVideoPresenter vECutVideoPresenter) {
            this.f156599a = vECutVideoPresenter;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4101) {
                VECutVideoPresenter.m123655a(new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter.C70026h.C700271 */

                    /* renamed from: a */
                    final /* synthetic */ C70026h f156600a;

                    static {
                        Covode.recordClassIndex(82445);
                    }

                    {
                        this.f156600a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        if (this.f156600a.f156599a.f156565p) {
                            VECutVideoPresenter.m123650a(this.f156600a.f156599a).mo111336a(new C70576a(1, false));
                        } else {
                            VECutVideoPresenter.m123650a(this.f156600a.f156599a).mo111336a(new C70576a(2, false));
                        }
                        return C89391z.f203057a;
                    }
                });
            }
        }
    }

    /* renamed from: a */
    public static void m123652a(int i, long j, long j2, C70071e eVar, int i2, String str) {
        C40982q.m82520a("av_ve_import_compile", i, C78100a.m136518a(C89041ag.m154421a(C89387v.m154943a("fps_time", String.valueOf(j)), C89387v.m154943a("compile_time", String.valueOf(j2)), C89387v.m154943a("is_hard_encode", String.valueOf(eVar.f156688g)), C89387v.m154943a("fps", String.valueOf(eVar.f156687f)), C89387v.m154943a("errorCode", String.valueOf(i2)), C89387v.m154943a("error_message", str))));
    }

    /* renamed from: a */
    private final void m123656a(List<? extends VideoSegment> list, List<String> list2, int[] iArr, int[] iArr2, float[] fArr, int[] iArr3) {
        if (list != null && (!list.isEmpty())) {
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t2 = t;
                String a = t2.mo110571a(false);
                C89219l.m154716b(a, "");
                list2.add(a);
                iArr[i] = (int) t2.mo110578d();
                iArr2[i] = (int) t2.mo110580e();
                fArr[i] = t2.mo110582f();
                iArr3[i] = t2.f156718j;
                i = i2;
            }
            if (this.f156564o.mo110620g() == 0) {
                iArr[0] = 0;
                iArr2[0] = (int) ((VideoSegment) list.get(0)).f156710b;
                iArr3[0] = 0;
            }
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m123653a(VECutVideoPresenter vECutVideoPresenter, int i, float f, boolean z, float f2, float f3, int i2, int i3, int i4) {
        int i5 = i2;
        float f4 = f2;
        if ((i4 & 4) != 0) {
            z = true;
        }
        float f5 = 1.0f;
        if ((i4 & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i4 & 16) == 0) {
            f5 = f3;
        }
        int i6 = 0;
        if ((i4 & 32) != 0) {
            i5 = 0;
        }
        if ((i4 & 64) == 0) {
            i6 = i3;
        }
        vECutVideoPresenter.f156553d = f;
        if (z) {
            vECutVideoPresenter.f156560k.mo111048a(f, f4, f5, i5, i6);
            return;
        }
        C70484n nVar = vECutVideoPresenter.f156560k;
        if (nVar.f157495a != null) {
            AbstractC70076i iVar = nVar.f157495a;
            if (iVar == null) {
                C89219l.m154715b();
            }
            iVar.mo110544a(i, f);
        }
    }
}
