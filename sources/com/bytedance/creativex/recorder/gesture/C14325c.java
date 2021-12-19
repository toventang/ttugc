package com.bytedance.creativex.recorder.gesture;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14217g;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14314a;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14320e;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14323h;
import com.bytedance.creativex.recorder.gesture.api.C14322g;
import com.bytedance.creativex.recorder.gesture.api.EnumC14321f;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.ugc.asve.p2214c.C31031b;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.recorder.gesture.c */
public final class C14325c extends AbstractC2562j<AbstractC14315b> implements AbstractC14315b, AbstractC21566a {

    /* renamed from: a */
    public final AbstractC14315b f34685a = this;

    /* renamed from: b */
    public final AbstractC14177d f34686b = ((AbstractC14177d) getDiContainer().mo35248a(AbstractC14177d.class, (String) null));

    /* renamed from: c */
    public final AbstractC14217g f34687c = ((AbstractC14217g) getDiContainer().mo35254c(AbstractC14217g.class));

    /* renamed from: d */
    public final Activity f34688d = ((Activity) getDiContainer().mo35248a(Activity.class, (String) null));

    /* renamed from: e */
    public AbstractC89172b<? super ScaleGestureDetector, C89378p<Boolean, Boolean>> f34689e;

    /* renamed from: f */
    public final CopyOnWriteArrayList<AbstractC14323h> f34690f = new CopyOnWriteArrayList<>();

    /* renamed from: g */
    public CopyOnWriteArraySet<AbstractC14314a> f34691g = new CopyOnWriteArraySet<>();

    /* renamed from: h */
    public PrivacyCert f34692h = C31031b.f74362l;

    /* renamed from: i */
    final AbstractC89244h f34693i = C89250i.m154773a((AbstractC89171a) new C14327b(this));

    /* renamed from: j */
    public final C2564l<VideoRecordGestureLayout.AbstractC14312a> f34694j = new C2564l<>(null);

    /* renamed from: k */
    public final C2564l<ScaleGestureDetector> f34695k = new C2564l<>(null);

    /* renamed from: l */
    public final C2563k<AbstractC14320e> f34696l = new C2563k<>();

    /* renamed from: m */
    public final AbstractC22186b f34697m;

    /* renamed from: n */
    private final AbstractC89244h f34698n = C89250i.m154773a((AbstractC89171a) new C14326a(this));

    /* renamed from: o */
    private final C21582f f34699o;

    /* renamed from: p */
    private final int f34700p;

    static {
        Covode.recordClassIndex(16398);
    }

    /* renamed from: b */
    public final DefaultGesturePresenter mo23115b() {
        return (DefaultGesturePresenter) this.f34698n.getValue();
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.AbstractC14315b
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ C2560h mo23101c() {
        return this.f34694j;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.AbstractC14315b
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C2560h mo23102d() {
        return this.f34695k;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC14315b getApiComponent() {
        return this.f34685a;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f34699o;
    }

    /* renamed from: com.bytedance.creativex.recorder.gesture.c$b */
    static final class C14327b extends AbstractC89220m implements AbstractC89171a<C143281> {

        /* renamed from: a */
        final /* synthetic */ C14325c f34702a;

        static {
            Covode.recordClassIndex(16400);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14327b(C14325c cVar) {
            super(0);
            this.f34702a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C143281 invoke() {
            return new AbstractC14324b(this) {
                /* class com.bytedance.creativex.recorder.gesture.C14325c.C14327b.C143281 */

                /* renamed from: a */
                final /* synthetic */ C14327b f34703a;

                static {
                    Covode.recordClassIndex(16401);
                }

                @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
                /* renamed from: b */
                public final boolean mo23110b() {
                    return false;
                }

                @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
                /* renamed from: c */
                public final boolean mo23112c() {
                    return true;
                }

                @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
                /* renamed from: d */
                public final void mo23113d() {
                    this.f34703a.f34702a.f34686b.mo22771Y();
                    this.f34703a.f34702a.f34696l.mo6999a(new C14322g(EnumC14321f.SCALE_END));
                }

                @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
                /* renamed from: a */
                public final boolean mo23105a() {
                    if (C89219l.m154714a((Object) this.f34703a.f34702a.f34686b.mo22823k().mo6996a(), (Object) false)) {
                        return false;
                    }
                    this.f34703a.f34702a.f34686b.mo22788a(false);
                    this.f34703a.f34702a.f34686b.mo22774a(true, C31031b.f74362l, "double_click");
                    return true;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f34703a = r1;
                }

                @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
                /* renamed from: b */
                public final boolean mo23111b(float f) {
                    this.f34703a.f34702a.f34686b.mo22775a(f);
                    return true;
                }

                @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
                /* renamed from: a */
                public final boolean mo23106a(float f) {
                    CopyOnWriteArrayList<AbstractC14323h> copyOnWriteArrayList = this.f34703a.f34702a.f34690f;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator<T> it = copyOnWriteArrayList.iterator();
                        if (it.hasNext()) {
                            it.next();
                            return true;
                        }
                    }
                    if (this.f34703a.f34702a.f34687c == null) {
                        return false;
                    }
                    this.f34703a.f34702a.f34687c.mo22969a(f);
                    return true;
                }

                @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
                /* renamed from: a */
                public final boolean mo23108a(MotionEvent motionEvent) {
                    C89219l.m154721d(motionEvent, "");
                    if (!this.f34703a.f34702a.mo23114a().mo56939f()) {
                        return false;
                    }
                    CopyOnWriteArraySet<AbstractC14314a> copyOnWriteArraySet = this.f34703a.f34702a.f34691g;
                    if (!(copyOnWriteArraySet instanceof Collection) || !copyOnWriteArraySet.isEmpty()) {
                        Iterator<T> it = copyOnWriteArraySet.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (!(!it.next().mo23094a())) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        return true;
                    }
                    this.f34703a.f34702a.f34686b.mo22776a(motionEvent.getX(), motionEvent.getY());
                    return true;
                }

                @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
                /* renamed from: a */
                public final boolean mo23109a(ScaleGestureDetector scaleGestureDetector) {
                    C89219l.m154721d(scaleGestureDetector, "");
                    if (!this.f34703a.f34702a.mo23114a().mo56939f()) {
                        return false;
                    }
                    AbstractC89172b<? super ScaleGestureDetector, C89378p<Boolean, Boolean>> bVar = this.f34703a.f34702a.f34689e;
                    if (bVar != null) {
                        C89378p<Boolean, Boolean> invoke = bVar.invoke(scaleGestureDetector);
                        if (invoke.getFirst().booleanValue()) {
                            return invoke.getSecond().booleanValue();
                        }
                    }
                    return this.f34703a.f34702a.f34686b.mo22791a(scaleGestureDetector);
                }

                @Override // com.bytedance.creativex.recorder.gesture.AbstractC14324b
                /* renamed from: a */
                public final boolean mo23107a(float f, float f2) {
                    CopyOnWriteArrayList<AbstractC14323h> copyOnWriteArrayList = this.f34703a.f34702a.f34690f;
                    if (!(copyOnWriteArrayList instanceof Collection) || !copyOnWriteArrayList.isEmpty()) {
                        Iterator<T> it = copyOnWriteArrayList.iterator();
                        if (it.hasNext()) {
                            it.next();
                            return true;
                        }
                    }
                    if (this.f34703a.f34702a.f34687c == null) {
                        return false;
                    }
                    AbstractC14217g gVar = this.f34703a.f34702a.f34687c;
                    if (gVar != null) {
                        gVar.mo22970a(f, f2);
                    }
                    return true;
                }
            };
        }
    }

    /* renamed from: a */
    public final ASCameraView mo23114a() {
        return this.f34686b.mo22747A();
    }

    /* renamed from: com.bytedance.creativex.recorder.gesture.c$a */
    static final class C14326a extends AbstractC89220m implements AbstractC89171a<DefaultGesturePresenter> {

        /* renamed from: a */
        final /* synthetic */ C14325c f34701a;

        static {
            Covode.recordClassIndex(16399);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14326a(C14325c cVar) {
            super(0);
            this.f34701a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DefaultGesturePresenter invoke() {
            Context applicationContext = this.f34701a.f34688d.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            return new DefaultGesturePresenter(applicationContext, this.f34701a.f34697m, (AbstractC14324b) this.f34701a.f34693i.getValue(), null);
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        View c = this.f34697m.mo36475c(this.f34700p);
        C89219l.m154716b(c, "");
        VideoRecordGestureLayout videoRecordGestureLayout = (VideoRecordGestureLayout) c;
        mo23115b().mo23042a(videoRecordGestureLayout);
        this.f34694j.mo7019b(videoRecordGestureLayout.getOnGestureListener());
        this.f34695k.mo7019b(videoRecordGestureLayout.getScaleGestureDetector());
        this.f34686b.mo22836x().mo7036a(this, new C14329c(this));
    }

    /* renamed from: com.bytedance.creativex.recorder.gesture.c$c */
    static final class C14329c<T> implements AbstractC2565m<AbstractC14318d> {

        /* renamed from: a */
        final /* synthetic */ C14325c f34704a;

        static {
            Covode.recordClassIndex(16402);
        }

        C14329c(C14325c cVar) {
            this.f34704a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(AbstractC14318d dVar) {
            AbstractC14318d dVar2 = dVar;
            if (dVar2 != null) {
                this.f34704a.mo23115b().mo23043a(dVar2);
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.AbstractC14315b
    /* renamed from: a */
    public final AbstractC14318d mo23095a(int i) {
        return mo23115b().mo23039a(i);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.AbstractC14315b
    /* renamed from: a */
    public final void mo23096a(AbstractC14318d dVar) {
        C89219l.m154721d(dVar, "");
        mo23115b().mo23043a(dVar);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.AbstractC14315b
    /* renamed from: b */
    public final void mo23100b(AbstractC14323h hVar) {
        C89219l.m154721d(hVar, "");
        this.f34690f.remove(hVar);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.AbstractC14315b
    /* renamed from: a */
    public final void mo23098a(AbstractC14323h hVar) {
        C89219l.m154721d(hVar, "");
        if (!this.f34690f.contains(hVar)) {
            this.f34690f.add(hVar);
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.AbstractC14315b
    /* renamed from: a */
    public final void mo23099a(boolean z) {
        mo23115b().f34658a = z;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.AbstractC14315b
    /* renamed from: a */
    public final void mo23097a(AbstractC14318d dVar, int i) {
        C89219l.m154721d(dVar, "");
        mo23115b().mo23040a(i, dVar);
    }

    public C14325c(AbstractC22186b bVar, C21582f fVar, int i) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f34697m = bVar;
        this.f34699o = fVar;
        this.f34700p = i;
    }
}
