package com.p2082ss.android.ugc.asve.recorder.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.medialib.RecordInvoker;
import com.p2082ss.android.medialib.camera.AbstractC29994a;
import com.p2082ss.android.medialib.listener.AbstractC30012b;
import com.p2082ss.android.medialib.presenter.AbstractC30025b;
import com.p2082ss.android.ttvecamera.C30933l;
import com.p2082ss.android.ugc.asve.context.AbstractC31034c;
import com.p2082ss.android.ugc.asve.context.AbstractC31035d;
import com.p2082ss.android.ugc.asve.context.AbstractC31038f;
import com.p2082ss.android.ugc.asve.context.AbstractC31039g;
import com.p2082ss.android.ugc.asve.context.AbstractC31040h;
import com.p2082ss.android.ugc.asve.p2212a.AbstractC31014b;
import com.p2082ss.android.ugc.asve.p2213b.EnumC31020c;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31191d;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31192e;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31211g;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31213i;
import com.p2082ss.android.ugc.asve.recorder.C31117a;
import com.p2082ss.android.ugc.asve.recorder.C31129b;
import com.p2082ss.android.ugc.asve.recorder.C31210f;
import com.p2082ss.android.ugc.asve.recorder.C31212h;
import com.p2082ss.android.ugc.asve.recorder.VERecorderImpl;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31187f;
import com.p2082ss.android.ugc.asve.recorder.camera.p2223b.C31169b;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31123a;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.asve.recorder.reaction.model.ReactionWindowInfo;
import com.p2082ss.android.ugc.asve.recorder.reaction.p2225a.C31223b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.C85519k;
import com.p2082ss.android.vesdk.VEARCoreParam;
import com.p2082ss.android.vesdk.VECameraSettings;
import com.p2082ss.android.vesdk.VEDisplaySettings;
import com.p2082ss.android.vesdk.VEListener;
import com.p2082ss.android.vesdk.audio.C85341i;
import com.p2082ss.android.vesdk.runtime.AbstractC85556e;
import com.p2082ss.android.vesdk.runtime.VEMapBufferInfo;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.libsdl.app.AudioRecorderInterface;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView */
public final class ASCameraView extends FrameLayout {

    /* renamed from: A */
    private String f74871A;

    /* renamed from: a */
    public AbstractC1204m f74872a;

    /* renamed from: b */
    public TextureView f74873b;

    /* renamed from: c */
    public View f74874c;

    /* renamed from: d */
    public C31117a f74875d;

    /* renamed from: e */
    public final CopyOnWriteArrayList<AbstractC89188r<Integer, Integer, String, C85346av, C89391z>> f74876e;

    /* renamed from: f */
    public final AbstractC89188r<Integer, Integer, String, C85346av, C89391z> f74877f;

    /* renamed from: g */
    private SurfaceView f74878g;

    /* renamed from: h */
    private volatile Boolean f74879h;

    /* renamed from: i */
    private final AbstractC89244h f74880i;

    /* renamed from: j */
    private final AbstractC89244h f74881j;

    /* renamed from: k */
    private final AbstractC89244h f74882k;

    /* renamed from: l */
    private final AbstractC89244h f74883l;

    /* renamed from: m */
    private final C31117a.EnumC31119b f74884m;

    /* renamed from: n */
    private final AbstractC89244h f74885n;

    /* renamed from: o */
    private final AbstractC89244h f74886o;

    /* renamed from: p */
    private final C31129b f74887p;

    /* renamed from: q */
    private boolean f74888q;

    /* renamed from: r */
    private volatile boolean f74889r;

    /* renamed from: s */
    private final AbstractC89244h f74890s;

    /* renamed from: t */
    private final AbstractC89244h f74891t;

    /* renamed from: u */
    private final AbstractC89244h f74892u;

    /* renamed from: v */
    private final AbstractC89244h f74893v;

    /* renamed from: w */
    private final AbstractC89244h f74894w;

    /* renamed from: x */
    private Runnable f74895x;

    /* renamed from: y */
    private String f74896y;

    /* renamed from: z */
    private String f74897z;

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$n */
    public static final class C31248n implements AbstractC31040h {

        /* renamed from: a */
        public final AbstractC31034c f74917a;

        /* renamed from: b */
        public final AbstractC31039g f74918b;

        /* renamed from: c */
        public final C31249a f74919c = new C31249a(this);

        /* renamed from: d */
        public final C31250b f74920d;

        /* renamed from: e */
        final /* synthetic */ ASCameraView f74921e;

        /* renamed from: f */
        final /* synthetic */ AbstractC31040h f74922f;

        /* renamed from: g */
        private final boolean f74923g;

        /* renamed from: h */
        private final boolean f74924h;

        /* renamed from: i */
        private final /* synthetic */ AbstractC31040h f74925i;

        static {
            Covode.recordClassIndex(37896);
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: A */
        public final boolean mo56152A() {
            return this.f74925i.mo56152A();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: B */
        public final boolean mo56153B() {
            return this.f74925i.mo56153B();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: a */
        public final boolean mo56154a() {
            return this.f74925i.mo56154a();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: c */
        public final boolean mo56156c() {
            return this.f74925i.mo56156c();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: d */
        public final SurfaceHolder mo56157d() {
            return this.f74925i.mo56157d();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: e */
        public final AbstractC31192e mo56158e() {
            return this.f74925i.mo56158e();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: f */
        public final C89378p<Integer, Integer> mo56159f() {
            return this.f74925i.mo56159f();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: g */
        public final boolean mo56160g() {
            return this.f74925i.mo56160g();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: i */
        public final boolean mo56162i() {
            return this.f74925i.mo56162i();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: j */
        public final boolean mo56163j() {
            return this.f74925i.mo56163j();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: k */
        public final AbstractC89171a<Boolean> mo56164k() {
            return this.f74925i.mo56164k();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: l */
        public final AbstractC31038f mo56165l() {
            return this.f74925i.mo56165l();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: n */
        public final AbstractC31035d mo56167n() {
            return this.f74925i.mo56167n();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: p */
        public final boolean mo56169p() {
            return this.f74925i.mo56169p();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: q */
        public final boolean mo56170q() {
            return this.f74925i.mo56170q();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: r */
        public final boolean mo56171r() {
            return this.f74925i.mo56171r();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: s */
        public final long mo56172s() {
            return this.f74925i.mo56172s();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: t */
        public final boolean mo56173t() {
            return this.f74925i.mo56173t();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: u */
        public final int mo56174u() {
            return this.f74925i.mo56174u();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: v */
        public final boolean mo56175v() {
            return this.f74925i.mo56175v();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: w */
        public final boolean mo56176w() {
            return this.f74925i.mo56176w();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: x */
        public final boolean mo56177x() {
            return this.f74925i.mo56177x();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: y */
        public final boolean mo56178y() {
            return this.f74925i.mo56178y();
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: z */
        public final boolean mo56179z() {
            return this.f74925i.mo56179z();
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$n$a */
        public static final class C31249a implements AbstractC31034c {

            /* renamed from: a */
            final /* synthetic */ C31248n f74926a;

            /* renamed from: b */
            private final int f74927b;

            /* renamed from: c */
            private final /* synthetic */ AbstractC31034c f74928c;

            static {
                Covode.recordClassIndex(37897);
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: a */
            public final EnumC31020c mo56138a() {
                return this.f74928c.mo56138a();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: b */
            public final VECameraSettings.CAMERA_TYPE mo56139b() {
                return this.f74928c.mo56139b();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: c */
            public final boolean mo56140c() {
                return this.f74928c.mo56140c();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: d */
            public final byte mo56141d() {
                return this.f74928c.mo56141d();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: e */
            public final int mo56142e() {
                return this.f74928c.mo56142e();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: f */
            public final boolean mo56143f() {
                return this.f74928c.mo56143f();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: h */
            public final int mo56145h() {
                return this.f74928c.mo56145h();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: i */
            public final boolean mo56146i() {
                return this.f74928c.mo56146i();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: k */
            public final int[] mo56148k() {
                return this.f74928c.mo56148k();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: l */
            public final boolean mo56149l() {
                return this.f74928c.mo56149l();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: m */
            public final VEDisplaySettings mo56150m() {
                return this.f74928c.mo56150m();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: n */
            public final boolean mo56151n() {
                return this.f74928c.mo56151n();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31034c
            /* renamed from: j */
            public final int mo56147j() {
                return this.f74927b;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C31249a(C31248n nVar) {
                int i;
                this.f74926a = nVar;
                this.f74928c = nVar.f74917a;
                if (nVar.f74917a.mo56147j() != 0) {
                    i = nVar.f74917a.mo56147j();
                } else {
                    i = nVar.f74921e.getAttrsHelper().f74933a;
                }
                this.f74927b = i;
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$n$b */
        public static final class C31250b implements AbstractC31039g {

            /* renamed from: a */
            final /* synthetic */ C31248n f74929a;

            /* renamed from: b */
            private final int f74930b;

            /* renamed from: c */
            private final int f74931c;

            /* renamed from: d */
            private final /* synthetic */ AbstractC31039g f74932d;

            static {
                Covode.recordClassIndex(37898);
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
            /* renamed from: a */
            public final String mo56212a() {
                return this.f74932d.mo56212a();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
            /* renamed from: b */
            public final String mo56213b() {
                return this.f74932d.mo56213b();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
            /* renamed from: c */
            public final float mo56214c() {
                return this.f74932d.mo56214c();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
            /* renamed from: d */
            public final boolean mo56215d() {
                return this.f74932d.mo56215d();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
            /* renamed from: g */
            public final int mo56218g() {
                return this.f74932d.mo56218g();
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
            /* renamed from: e */
            public final int mo56216e() {
                return this.f74930b;
            }

            @Override // com.p2082ss.android.ugc.asve.context.AbstractC31039g
            /* renamed from: f */
            public final int mo56217f() {
                return this.f74931c;
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C31250b(C31248n nVar) {
                int i;
                int i2;
                this.f74929a = nVar;
                this.f74932d = nVar.f74918b;
                if (nVar.f74918b.mo56216e() != 0) {
                    i = nVar.f74918b.mo56216e();
                } else {
                    i = nVar.f74921e.getAttrsHelper().f74934b;
                }
                this.f74930b = i;
                if (nVar.f74918b.mo56217f() != 0) {
                    i2 = nVar.f74918b.mo56217f();
                } else {
                    i2 = nVar.f74921e.getAttrsHelper().f74935c;
                }
                this.f74931c = i2;
            }
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: b */
        public final boolean mo56155b() {
            return this.f74923g;
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: h */
        public final boolean mo56161h() {
            return this.f74924h;
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: m */
        public final /* bridge */ /* synthetic */ AbstractC31039g mo56166m() {
            return this.f74920d;
        }

        @Override // com.p2082ss.android.ugc.asve.context.AbstractC31040h
        /* renamed from: o */
        public final /* bridge */ /* synthetic */ AbstractC31034c mo56168o() {
            return this.f74919c;
        }

        public C31248n(ASCameraView aSCameraView, AbstractC31040h hVar) {
            this.f74921e = aSCameraView;
            this.f74922f = hVar;
            this.f74925i = hVar;
            this.f74917a = hVar.mo56168o();
            this.f74918b = hVar.mo56166m();
            this.f74923g = hVar.mo56155b();
            this.f74924h = hVar.mo56161h();
            this.f74920d = new C31250b(this);
        }
    }

    static {
        Covode.recordClassIndex(37880);
    }

    public ASCameraView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public ASCameraView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final C31212h getOnRecordInfoListenerDispatcher() {
        return (C31212h) this.f74893v.getValue();
    }

    public final C31251a getAttrsHelper() {
        return (C31251a) this.f74885n.getValue();
    }

    public final AbstractC31123a getAudioController() {
        return (AbstractC31123a) this.f74883l.getValue();
    }

    public final AbstractC31185d getCameraController() {
        return (AbstractC31185d) this.f74881j.getValue();
    }

    public final C31169b getCameraViewHelper$lib_asve_release() {
        return (C31169b) this.f74890s.getValue();
    }

    public final AbstractC31193a getEffectController() {
        return (AbstractC31193a) this.f74880i.getValue();
    }

    public final AbstractC31257g getGestureDispatcher() {
        return (AbstractC31257g) this.f74894w.getValue();
    }

    public final AbstractC31133a getMediaController() {
        return (AbstractC31133a) this.f74882k.getValue();
    }

    public final C31210f getOnFrameAvailableListenerDispatcher() {
        return (C31210f) this.f74892u.getValue();
    }

    public final C31223b getReactionViewHelper$lib_asve_release() {
        return (C31223b) this.f74891t.getValue();
    }

    public final C31252b getTouchHelper() {
        return (C31252b) this.f74886o.getValue();
    }

    public final String getBeautyFaceRes() {
        return this.f74896y;
    }

    public final Runnable getDataSourceVideoCompleteListener() {
        return this.f74895x;
    }

    public final String getFaceMakeUpRes() {
        return this.f74871A;
    }

    public final C31117a.EnumC31119b getMode() {
        return this.f74884m;
    }

    public final String getReshapeRes() {
        return this.f74897z;
    }

    /* renamed from: a */
    public final void mo56919a(boolean z) {
        getTouchHelper().mo56710a(z);
    }

    /* renamed from: a */
    public final void mo56913a(AbstractC85556e eVar, String str) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56540a(eVar, str);
    }

    /* renamed from: a */
    public final void mo56916a(AbstractC89188r<? super Integer, ? super Integer, ? super String, ? super C85346av, C89391z> rVar) {
        C89219l.m154721d(rVar, "");
        this.f74876e.add(rVar);
    }

    /* renamed from: a */
    public final void mo56909a(AbstractC30012b bVar) {
        C89219l.m154721d(bVar, "");
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56537a(bVar);
    }

    /* renamed from: a */
    public final void mo56911a(AbstractC31211g gVar) {
        MethodCollector.m26663i(7190);
        C89219l.m154721d(gVar, "");
        C31210f onFrameAvailableListenerDispatcher = getOnFrameAvailableListenerDispatcher();
        C89219l.m154721d(gVar, "");
        synchronized (onFrameAvailableListenerDispatcher) {
            try {
                onFrameAvailableListenerDispatcher.f74808a.remove(gVar);
                if (onFrameAvailableListenerDispatcher.f74808a.isEmpty()) {
                    onFrameAvailableListenerDispatcher.f74809b.mo56538a((C85346av.AbstractC85365j) null);
                }
            } finally {
                MethodCollector.m26664o(7190);
            }
        }
    }

    /* renamed from: a */
    public final void mo56912a(AbstractC31213i iVar) {
        C89219l.m154721d(iVar, "");
        C31212h onRecordInfoListenerDispatcher = getOnRecordInfoListenerDispatcher();
        C89219l.m154721d(iVar, "");
        if (onRecordInfoListenerDispatcher.f74810a.isEmpty()) {
            onRecordInfoListenerDispatcher.f74811b.mo56539a(onRecordInfoListenerDispatcher);
        }
        onRecordInfoListenerDispatcher.f74810a.add(iVar);
    }

    /* renamed from: a */
    public final void mo56904a(int i, AbstractC29994a aVar, PrivacyCert privacyCert) {
        C31117a aVar2 = this.f74875d;
        if (aVar2 == null) {
            C89219l.m154710a("recorder");
        }
        aVar2.mo56545c().mo56642a(i, aVar, privacyCert);
    }

    /* renamed from: a */
    public final void mo56910a(AbstractC31187f fVar) {
        C89219l.m154721d(fVar, "");
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56648a(fVar);
    }

    /* renamed from: a */
    public final void mo56907a(PrivacyCert privacyCert) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56639a(privacyCert);
    }

    /* renamed from: a */
    public final void mo56906a(Surface surface, String str, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(surface, "");
        C89219l.m154721d(str, "");
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f().mo56610b(surface, str, bVar);
    }

    /* renamed from: a */
    public final void mo56921a(boolean z, AbstractC89172b<? super Integer, C89391z> bVar) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f().mo56605a(z, bVar);
    }

    /* renamed from: a */
    public final void mo56905a(Surface surface) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f().mo56590a(surface);
    }

    /* renamed from: a */
    public final void mo56918a(String str, long j, long j2, boolean z) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f().mo56600a(str, j, j2, z);
    }

    /* renamed from: a */
    public final void mo56917a(String str, double d, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f().mo56598a(str, d, bVar);
    }

    /* renamed from: a */
    public final void mo56914a(AbstractC89172b<? super Integer, C89391z> bVar) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f().mo56596a(bVar);
    }

    /* renamed from: a */
    public final void mo56915a(AbstractC89172b<? super Integer, C89391z> bVar, AbstractC89171a<C89391z> aVar) {
        C31117a aVar2 = this.f74875d;
        if (aVar2 == null) {
            C89219l.m154710a("recorder");
        }
        aVar2.mo56548f().mo56597a(bVar, aVar);
    }

    /* renamed from: a */
    public final void mo56920a(boolean z, PrivacyCert privacyCert) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        if (!aVar.f74569d.mo56164k().invoke().booleanValue()) {
            Boolean bool = this.f74879h;
            this.f74879h = Boolean.valueOf(bool != null ? bool.booleanValue() : true);
        }
        if (!C89219l.m154714a(Boolean.valueOf(z), this.f74879h)) {
            this.f74879h = Boolean.valueOf(z);
            C31117a aVar2 = this.f74875d;
            if (aVar2 == null) {
                C89219l.m154710a("recorder");
            }
            aVar2.mo56548f().mo56604a(z, privacyCert);
        }
    }

    /* renamed from: a */
    public final void mo56908a(RecordInvoker.OnARTextContentCallback onARTextContentCallback) {
        C89219l.m154721d(onARTextContentCallback, "");
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56547e().mo56775a(onARTextContentCallback);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$a */
    static final class C31233a extends AbstractC89220m implements AbstractC89171a<C31251a> {

        /* renamed from: a */
        final /* synthetic */ Context f74898a;

        static {
            Covode.recordClassIndex(37881);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31233a(Context context) {
            super(0);
            this.f74898a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31251a invoke() {
            return new C31251a(this.f74898a);
        }
    }

    public final int getFPS() {
        return this.f74887p.f74589a;
    }

    public final boolean getIsExposureSeekBarShowing() {
        return getCameraViewHelper$lib_asve_release().f74727b;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m64923k();
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$b */
    static final class C31234b extends AbstractC89220m implements AbstractC89171a<AbstractC31123a> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f74899a;

        static {
            Covode.recordClassIndex(37882);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31234b(ASCameraView aSCameraView) {
            super(0);
            this.f74899a = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC31123a invoke() {
            return ASCameraView.m64920a(this.f74899a).mo56543b();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$c */
    static final class C31235c extends AbstractC89220m implements AbstractC89171a<C31255e> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f74900a;

        static {
            Covode.recordClassIndex(37883);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31235c(ASCameraView aSCameraView) {
            super(0);
            this.f74900a = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31255e invoke() {
            return new C31255e(ASCameraView.m64920a(this.f74900a).mo56545c());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$e */
    static final class C31237e extends AbstractC89220m implements AbstractC89171a<C31256f> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f74903a;

        static {
            Covode.recordClassIndex(37885);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31237e(ASCameraView aSCameraView) {
            super(0);
            this.f74903a = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31256f invoke() {
            return new C31256f(ASCameraView.m64920a(this.f74903a).mo56547e());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$f */
    static final class C31238f extends AbstractC89220m implements AbstractC89171a<AbstractC31257g> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f74904a;

        static {
            Covode.recordClassIndex(37886);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31238f(ASCameraView aSCameraView) {
            super(0);
            this.f74904a = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC31257g invoke() {
            return this.f74904a.getTouchHelper().f74937a;
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$h */
    static final class C31242h extends AbstractC89220m implements AbstractC89171a<C31258h> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f74910a;

        static {
            Covode.recordClassIndex(37890);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31242h(ASCameraView aSCameraView) {
            super(0);
            this.f74910a = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31258h invoke() {
            return new C31258h(ASCameraView.m64920a(this.f74910a).mo56548f());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$i */
    static final class C31243i extends AbstractC89220m implements AbstractC89171a<C31210f> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f74911a;

        static {
            Covode.recordClassIndex(37891);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31243i(ASCameraView aSCameraView) {
            super(0);
            this.f74911a = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31210f invoke() {
            return new C31210f(ASCameraView.m64920a(this.f74911a));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$k */
    static final class C31245k extends AbstractC89220m implements AbstractC89171a<C31212h> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f74913a;

        static {
            Covode.recordClassIndex(37893);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31245k(ASCameraView aSCameraView) {
            super(0);
            this.f74913a = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31212h invoke() {
            return new C31212h(ASCameraView.m64920a(this.f74913a));
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$m */
    static final class C31247m extends AbstractC89220m implements AbstractC89171a<C31252b> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f74915a;

        /* renamed from: b */
        final /* synthetic */ Context f74916b;

        static {
            Covode.recordClassIndex(37895);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31247m(ASCameraView aSCameraView, Context context) {
            super(0);
            this.f74915a = aSCameraView;
            this.f74916b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31252b invoke() {
            Context context = this.f74916b;
            ASCameraView aSCameraView = this.f74915a;
            return new C31252b(context, aSCameraView, ASCameraView.m64920a(aSCameraView));
        }
    }

    /* renamed from: b */
    public final void mo56923b() {
        C31212h onRecordInfoListenerDispatcher = getOnRecordInfoListenerDispatcher();
        onRecordInfoListenerDispatcher.f74810a.clear();
        onRecordInfoListenerDispatcher.f74811b.mo56539a((AbstractC85541q) null);
    }

    /* renamed from: c */
    public final void mo56930c() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c();
    }

    public final C30933l.C30943d getCameraECInfo() {
        return getCameraController().mo56694r();
    }

    public final AbstractC1204m getLifecycleOwner() {
        AbstractC1204m mVar = this.f74872a;
        if (mVar == null) {
            C89219l.m154710a("lifecycleOwner");
        }
        return mVar;
    }

    public final View getPresentView() {
        View view = this.f74874c;
        if (view == null) {
            C89219l.m154710a("presentView");
        }
        return view;
    }

    /* renamed from: j */
    public final void mo56985j() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f();
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$d */
    static final class C31236d extends AbstractC89220m implements AbstractC89171a<C31169b> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f74901a;

        /* renamed from: b */
        final /* synthetic */ Context f74902b;

        static {
            Covode.recordClassIndex(37884);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31236d(ASCameraView aSCameraView, Context context) {
            super(0);
            this.f74901a = aSCameraView;
            this.f74902b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31169b invoke() {
            Context context = this.f74902b;
            ASCameraView aSCameraView = this.f74901a;
            return new C31169b(context, aSCameraView, ASCameraView.m64920a(aSCameraView).f74569d.mo56168o());
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$l */
    static final class C31246l extends AbstractC89220m implements AbstractC89171a<C31223b> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f74914a;

        static {
            Covode.recordClassIndex(37894);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31246l(ASCameraView aSCameraView) {
            super(0);
            this.f74914a = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C31223b invoke() {
            ASCameraView aSCameraView = this.f74914a;
            return new C31223b(aSCameraView, aSCameraView.getPresentView(), ASCameraView.m64920a(this.f74914a).mo56549g());
        }
    }

    /* renamed from: g */
    public final void mo56940g() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f().mo56620g();
    }

    public final int getBackCameraPos() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56678f().mo56744b();
    }

    public final int getCameraPosition() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56676e();
    }

    public final int getCameraPreviewHeight() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56674d();
    }

    public final int getCameraPreviewWidth() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56671c();
    }

    public final List<Integer> getCameraZoomList() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56685m();
    }

    public final int getCurrentCameraType() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56662b();
    }

    public final long getEndFrameTimeUS() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return Math.max(aVar.mo56548f().mo56616d(), 0L);
    }

    public final boolean getExposureCompensationEnable() {
        if (!this.f74888q || getCameraECInfo() == null || !getCameraController().mo56693q()) {
            return false;
        }
        return true;
    }

    public final int getFlashMode() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56680h();
    }

    public final int getFrontCameraPos() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56678f();
        return 1;
    }

    public final VEMapBufferInfo getIntermediatePathFromEffect() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56548f().mo56635v();
    }

    public final int getLastFlashMode() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56682j();
    }

    public final int getLastRecordFrameNum() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56548f().mo56608b();
    }

    public final float getMaxCameraZoom() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56684l();
    }

    public final int getNextFlashMode() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56681i();
    }

    public final int[] getReactionCameraPosInViewPixel() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56549g().mo56855c();
    }

    public final int[] getReactionPosMarginInViewPixel() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56549g().mo56854b();
    }

    public final ReactionWindowInfo getReactionWindowInfo() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56549g().mo56857e();
    }

    public final C31117a getRecorder() {
        if (this.f74875d == null) {
            return null;
        }
        C31117a aVar = this.f74875d;
        if (aVar != null) {
            return aVar;
        }
        C89219l.m154710a("recorder");
        return aVar;
    }

    public final long getSegmentAudioLength() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56548f().mo56619f();
    }

    /* renamed from: h */
    public final void mo56983h() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f().mo56611b((VEListener.AbstractC85241j) null);
    }

    /* renamed from: i */
    public final boolean mo56984i() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56548f().mo56618e();
    }

    /* renamed from: e */
    public final boolean mo56937e() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56658a(0.0f);
    }

    /* renamed from: f */
    public final boolean mo56939f() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56679g();
    }

    public final float[] getSuggestVolume() {
        if (this.f74875d == null) {
            return new float[]{1.0f, 1.0f};
        }
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56548f().mo56632s();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m64923k();
        View view = this.f74873b;
        if (view == null) {
            if (this.f74878g != null) {
                view = this.f74878g;
                if (view == null) {
                    throw new IllegalStateException("no present view!");
                }
            } else {
                throw new IllegalStateException("ASCameraView must contain one SurfaceView or TextureView at least!".toString());
            }
        }
        this.f74874c = view;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m64923k() {
        /*
            r6 = this;
            android.view.TextureView r0 = r6.f74873b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            int r0 = r6.getChildCount()
            r5 = 0
            r4 = 0
            if (r0 <= 0) goto L_0x0026
            int r3 = r6.getChildCount()
            r2 = 0
        L_0x0012:
            if (r2 >= r3) goto L_0x0026
            android.view.View r1 = r6.getChildAt(r2)
            boolean r0 = r1 instanceof android.view.TextureView
            if (r0 == 0) goto L_0x0023
        L_0x001c:
            android.view.TextureView r1 = (android.view.TextureView) r1
            r6.f74873b = r1
            if (r1 == 0) goto L_0x0028
            return
        L_0x0023:
            int r2 = r2 + 1
            goto L_0x0012
        L_0x0026:
            r1 = r4
            goto L_0x001c
        L_0x0028:
            android.view.SurfaceView r0 = r6.f74878g
            if (r0 == 0) goto L_0x002d
            return
        L_0x002d:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L_0x0042
            int r2 = r6.getChildCount()
        L_0x0037:
            if (r5 >= r2) goto L_0x0042
            android.view.View r1 = r6.getChildAt(r5)
            boolean r0 = r1 instanceof android.view.SurfaceView
            if (r0 == 0) goto L_0x0047
            r4 = r1
        L_0x0042:
            android.view.SurfaceView r4 = (android.view.SurfaceView) r4
            r6.f74878g = r4
            return
        L_0x0047:
            int r5 = r5 + 1
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.asve.recorder.view.ASCameraView.m64923k():void");
    }

    /* renamed from: d */
    public final boolean mo56935d() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56545c().mo56687o();
    }

    /* renamed from: a */
    public final C31117a mo56898a() {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar;
    }

    public final void setExposureCompensationEnable(boolean z) {
        this.f74888q = z;
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$g */
    public static final class TextureView$SurfaceTextureListenerC31239g implements TextureView.SurfaceTextureListener {

        /* renamed from: a */
        final /* synthetic */ TextureView.SurfaceTextureListener f74905a;

        /* renamed from: b */
        final /* synthetic */ C31117a f74906b;

        /* renamed from: c */
        final /* synthetic */ AbstractC31040h f74907c;

        static {
            Covode.recordClassIndex(37887);
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$g$a */
        static final class C31240a extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

            /* renamed from: a */
            public static final C31240a f74908a = new C31240a();

            static {
                Covode.recordClassIndex(37888);
            }

            C31240a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Integer num) {
                num.intValue();
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$g$b */
        static final class C31241b extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

            /* renamed from: a */
            public static final C31241b f74909a = new C31241b();

            static {
                Covode.recordClassIndex(37889);
            }

            C31241b() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(Integer num) {
                num.intValue();
                return C89391z.f203057a;
            }
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            C89219l.m154721d(surfaceTexture, "");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f74905a;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureUpdated(surfaceTexture);
            }
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C89219l.m154721d(surfaceTexture, "");
            this.f74906b.mo56548f().mo56605a(this.f74907c.mo56168o().mo56143f(), C31241b.f74909a);
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f74905a;
            if (surfaceTextureListener != null) {
                return surfaceTextureListener.onSurfaceTextureDestroyed(surfaceTexture);
            }
            return true;
        }

        public TextureView$SurfaceTextureListenerC31239g(TextureView.SurfaceTextureListener surfaceTextureListener, C31117a aVar, AbstractC31040h hVar) {
            this.f74905a = surfaceTextureListener;
            this.f74906b = aVar;
            this.f74907c = hVar;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            C89219l.m154721d(surfaceTexture, "");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f74905a;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureSizeChanged(surfaceTexture, i, i2);
            }
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C89219l.m154721d(surfaceTexture, "");
            TextureView.SurfaceTextureListener surfaceTextureListener = this.f74905a;
            if (surfaceTextureListener != null) {
                surfaceTextureListener.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
            Surface surface = new Surface(surfaceTexture);
            AbstractC31133a f = this.f74906b.mo56548f();
            String str = Build.DEVICE;
            C89219l.m154716b(str, "");
            f.mo56591a(surface, str, C31240a.f74908a);
        }
    }

    public final void setBeautyFaceRes(String str) {
        C89219l.m154721d(str, "");
        this.f74896y = str;
    }

    public final void setExposureCompensation(int i) {
        getCameraController().mo56677e(i);
    }

    public final void setFaceMakeUpRes(String str) {
        C89219l.m154721d(str, "");
        this.f74871A = str;
    }

    public final void setLifecycleOwner(AbstractC1204m mVar) {
        C89219l.m154721d(mVar, "");
        this.f74872a = mVar;
    }

    public final void setReshapeRes(String str) {
        C89219l.m154721d(str, "");
        this.f74897z = str;
    }

    /* renamed from: a */
    public static final /* synthetic */ C31117a m64920a(ASCameraView aSCameraView) {
        C31117a aVar = aSCameraView.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        getTouchHelper().mo56709a(motionEvent);
        return true;
    }

    public final void setDetectionMode(boolean z) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56547e();
    }

    public final void setMusicPath(String str) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f();
    }

    public final void setPreviewSizeRatio(float f) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f();
    }

    public final void setVideoQuality(int i) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f();
    }

    /* renamed from: b */
    public final void mo56924b(PrivacyCert privacyCert) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56665b(privacyCert);
    }

    /* renamed from: c */
    public final void mo56931c(PrivacyCert privacyCert) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56543b().mo56571a(privacyCert);
    }

    /* renamed from: d */
    public final void mo56933d(PrivacyCert privacyCert) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56543b().mo56577b(privacyCert);
    }

    /* renamed from: e */
    public final void mo56936e(boolean z) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56547e().mo56807c(z);
    }

    /* renamed from: f */
    public final void mo56938f(boolean z) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56547e().mo56802b(z);
    }

    public final void setARCoreParam(boolean z) {
        VEARCoreParam vEARCoreParam = new VEARCoreParam();
        vEARCoreParam.setEnableARCore(z);
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56547e().mo56780a(vEARCoreParam);
    }

    public final void setAudioCaptureDevice(C85341i iVar) {
        C89219l.m154721d(iVar, "");
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56543b().mo56570a().mo131426a(iVar);
    }

    public final void setBodyBeautyLevel(int i) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56641a(i);
    }

    public final void setCameraPreviewSizeInterface(AbstractC30025b bVar) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56645a(bVar);
    }

    public final void setCloseCameraListener(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        C31117a aVar2 = this.f74875d;
        if (aVar2 == null) {
            C89219l.m154710a("recorder");
        }
        aVar2.mo56545c().mo56650a(aVar);
    }

    public final void setDataSourceVideoCompleteListener(Runnable runnable) {
        if (this.f74875d != null) {
            C31117a aVar = this.f74875d;
            if (aVar == null) {
                C89219l.m154710a("recorder");
            }
            aVar.mo56546d().mo56580a(runnable);
        }
    }

    public final void setDetectInterval(int i) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56547e().mo56766a(i);
    }

    public final void setDuetSupportChangeLayout(boolean z) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56546d().mo56582a(z);
    }

    public final void setFilter(String str) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56547e().mo56783a(str);
    }

    public final void setHandDetectLowpower(boolean z) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56547e().mo56817f(z);
    }

    public final void setRecordMaxDuration(long j) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f().mo56589a(j);
    }

    public final void setSATZoomListener(C85346av.AbstractC85373r rVar) {
        if (this.f74875d != null) {
            C31117a aVar = this.f74875d;
            if (aVar == null) {
                C89219l.m154710a("recorder");
            }
            aVar.mo56545c().mo56649a(rVar);
        }
    }

    /* renamed from: b */
    public final void mo56925b(AbstractC30012b bVar) {
        C89219l.m154721d(bVar, "");
        if (this.f74875d != null) {
            C31117a aVar = this.f74875d;
            if (aVar == null) {
                C89219l.m154710a("recorder");
            }
            aVar.mo56544b(bVar);
        }
    }

    /* renamed from: c */
    public final void mo56932c(boolean z) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f().mo56617d(z);
    }

    /* renamed from: d */
    public final void mo56934d(boolean z) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56547e().mo56815e(z);
    }

    /* renamed from: g */
    public final void mo56941g(boolean z) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56547e().mo56819h(z);
    }

    public final void setAudioDevice(C85341i iVar) {
        C85346av j;
        C85519k r;
        C89219l.m154721d(iVar, "");
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        AbstractC31191d dVar = aVar.f74568c;
        if (!(dVar instanceof VERecorderImpl)) {
            dVar = null;
        }
        VERecorderImpl vERecorderImpl = (VERecorderImpl) dVar;
        if (vERecorderImpl != null && (j = vERecorderImpl.mo56552j()) != null && (r = j.mo130829r()) != null) {
            r.mo131426a(iVar);
        }
    }

    public final void setControllerCallback(AbstractC31014b bVar) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56647a(bVar);
        C31117a aVar2 = this.f74875d;
        if (aVar2 == null) {
            C89219l.m154710a("recorder");
        }
        aVar2.mo56548f().mo56593a(bVar);
        C31117a aVar3 = this.f74875d;
        if (aVar3 == null) {
            C89219l.m154710a("recorder");
        }
        if (aVar3.f74569d.mo56161h()) {
            C31117a aVar4 = this.f74875d;
            if (aVar4 == null) {
                C89219l.m154710a("recorder");
            }
            aVar4.mo56543b().mo56572a(bVar);
        }
    }

    /* renamed from: b */
    public final void mo56926b(AbstractC31187f fVar) {
        C89219l.m154721d(fVar, "");
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56668b(fVar);
    }

    /* renamed from: b */
    public final void mo56927b(AbstractC31213i iVar) {
        C89219l.m154721d(iVar, "");
        C31212h onRecordInfoListenerDispatcher = getOnRecordInfoListenerDispatcher();
        C89219l.m154721d(iVar, "");
        onRecordInfoListenerDispatcher.f74810a.remove(iVar);
        if (onRecordInfoListenerDispatcher.f74810a.isEmpty()) {
            onRecordInfoListenerDispatcher.f74811b.mo56539a((AbstractC85541q) null);
        }
    }

    public final void setExposureSeekBarProgress(float f) {
        C31169b cameraViewHelper$lib_asve_release = getCameraViewHelper$lib_asve_release();
        if (cameraViewHelper$lib_asve_release.f74730e) {
            cameraViewHelper$lib_asve_release.mo56718a().end();
            cameraViewHelper$lib_asve_release.f74731f.removeView(cameraViewHelper$lib_asve_release.f74729d);
            cameraViewHelper$lib_asve_release.f74731f.removeView(cameraViewHelper$lib_asve_release.f74728c);
            cameraViewHelper$lib_asve_release.f74731f.addView(cameraViewHelper$lib_asve_release.f74728c);
            cameraViewHelper$lib_asve_release.f74731f.addView(cameraViewHelper$lib_asve_release.f74729d);
            cameraViewHelper$lib_asve_release.f74727b = true;
            cameraViewHelper$lib_asve_release.f74726a = true;
        } else {
            cameraViewHelper$lib_asve_release.mo56723c().end();
            cameraViewHelper$lib_asve_release.mo56722b().end();
            cameraViewHelper$lib_asve_release.f74731f.removeView(cameraViewHelper$lib_asve_release.f74729d);
            cameraViewHelper$lib_asve_release.f74731f.removeView(cameraViewHelper$lib_asve_release.f74728c);
            cameraViewHelper$lib_asve_release.f74731f.addView(cameraViewHelper$lib_asve_release.f74728c);
            cameraViewHelper$lib_asve_release.f74731f.addView(cameraViewHelper$lib_asve_release.f74729d);
            cameraViewHelper$lib_asve_release.f74727b = true;
            cameraViewHelper$lib_asve_release.f74726a = true;
        }
        cameraViewHelper$lib_asve_release.f74728c.setProgress(f);
        float progress = cameraViewHelper$lib_asve_release.f74728c.getProgress();
        C30933l.C30943d cameraECInfo = cameraViewHelper$lib_asve_release.f74731f.getCameraECInfo();
        if (cameraECInfo != null) {
            int i = cameraECInfo.f74217c;
            int i2 = cameraECInfo.f74215a;
            if (Math.abs(i) < Math.abs(i2)) {
                i2 = -i;
            } else if (Math.abs(i2) < Math.abs(i)) {
                i = -i2;
            }
            cameraViewHelper$lib_asve_release.f74731f.setExposureCompensation((int) ((progress * ((float) (i2 - i))) + ((float) i)));
        }
        cameraViewHelper$lib_asve_release.mo56722b().start();
        cameraViewHelper$lib_asve_release.mo56723c().start();
    }

    /* renamed from: b */
    public final void mo56928b(AbstractC89188r<? super Integer, ? super Integer, ? super String, ? super C85346av, C89391z> rVar) {
        C89219l.m154721d(rVar, "");
        this.f74876e.remove(rVar);
    }

    /* renamed from: a */
    public final void mo56900a(float f) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56549g().mo56851a(f);
    }

    /* renamed from: b */
    public final void mo56929b(boolean z) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f().mo56615c(z);
    }

    /* renamed from: a */
    public final void mo56902a(int i) {
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56545c().mo56663b(i);
    }

    /* renamed from: a */
    public final void mo56901a(float f, float f2) {
        getCameraViewHelper$lib_asve_release().mo56720a(f, f2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m64922a(ASCameraView aSCameraView, boolean z) {
        if (aSCameraView.f74889r != z) {
            aSCameraView.f74889r = z;
            C31117a aVar = aSCameraView.f74875d;
            if (aVar == null) {
                C89219l.m154710a("recorder");
            }
            aVar.mo56548f().mo56604a(z, (PrivacyCert) null);
        }
    }

    /* renamed from: a */
    public final int mo56897a(Context context, AudioRecorderInterface audioRecorderInterface) {
        C89219l.m154721d(context, "");
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        return aVar.mo56548f().mo56609b(context, audioRecorderInterface);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(7031);
        super.addView(view, i, layoutParams);
        m64923k();
        MethodCollector.m26664o(7031);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ ASCameraView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ASCameraView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C31117a.EnumC31119b bVar;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4101);
        this.f74880i = C89250i.m154773a((AbstractC89171a) new C31237e(this));
        this.f74881j = C89250i.m154773a((AbstractC89171a) new C31235c(this));
        this.f74882k = C89250i.m154773a((AbstractC89171a) new C31242h(this));
        this.f74883l = C89250i.m154773a((AbstractC89171a) new C31234b(this));
        if (this.f74875d != null) {
            C31117a aVar = this.f74875d;
            if (aVar == null) {
                C89219l.m154710a("recorder");
            }
            bVar = aVar.f74566a;
        } else {
            bVar = C31117a.EnumC31119b.CUSTOM;
        }
        this.f74884m = bVar;
        this.f74885n = C89250i.m154773a((AbstractC89171a) new C31233a(context));
        this.f74886o = C89250i.m154773a((AbstractC89171a) new C31247m(this, context));
        C31129b bVar2 = new C31129b();
        this.f74887p = bVar2;
        this.f74890s = C89250i.m154773a((AbstractC89171a) new C31236d(this, context));
        this.f74891t = C89250i.m154773a((AbstractC89171a) new C31246l(this));
        CopyOnWriteArrayList<AbstractC89188r<Integer, Integer, String, C85346av, C89391z>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(bVar2);
        this.f74876e = copyOnWriteArrayList;
        this.f74877f = new C31244j(this);
        this.f74892u = C89250i.m154773a((AbstractC89171a) new C31243i(this));
        this.f74893v = C89250i.m154773a((AbstractC89171a) new C31245k(this));
        C31251a attrsHelper = getAttrsHelper();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = attrsHelper.f74936d.obtainStyledAttributes(attributeSet, new int[]{R.attr.ue, R.attr.a9j, R.attr.a9k});
            C89219l.m154716b(obtainStyledAttributes, "");
            attrsHelper.f74933a = obtainStyledAttributes.getResourceId(0, 0);
            attrsHelper.f74934b = obtainStyledAttributes.getResourceId(2, 0);
            attrsHelper.f74935c = obtainStyledAttributes.getResourceId(1, 0);
            obtainStyledAttributes.recycle();
        }
        this.f74894w = C89250i.m154773a((AbstractC89171a) new C31238f(this));
        this.f74896y = "";
        this.f74897z = "";
        this.f74871A = "";
        MethodCollector.m26664o(4101);
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.view.ASCameraView$j */
    static final class C31244j extends AbstractC89220m implements AbstractC89188r<Integer, Integer, String, C85346av, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ASCameraView f74912a;

        static {
            Covode.recordClassIndex(37892);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31244j(ASCameraView aSCameraView) {
            super(4);
            this.f74912a = aSCameraView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89188r
        /* renamed from: a */
        public final /* synthetic */ C89391z mo8774a(Integer num, Integer num2, String str, C85346av avVar) {
            int intValue = num.intValue();
            int intValue2 = num2.intValue();
            C89219l.m154721d(avVar, "");
            Iterator<T> it = this.f74912a.f74876e.iterator();
            while (it.hasNext()) {
                it.next().mo8774a(Integer.valueOf(intValue), Integer.valueOf(intValue2), str, avVar);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo56903a(int i, long j, long j2, String str) {
        C89219l.m154721d(str, "");
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56547e().mo56769a(i, j, j2, str);
    }

    /* renamed from: a */
    public final void mo56899a(double d, boolean z, float f, int i, int i2, AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        C31117a aVar = this.f74875d;
        if (aVar == null) {
            C89219l.m154710a("recorder");
        }
        aVar.mo56548f().mo56587a(d, z, f, i, i2, false, bVar);
    }
}
