package com.p2082ss.android.ugc.asve.recorder;

import android.app.Application;
import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.medialib.listener.AbstractC30012b;
import com.p2082ss.android.ugc.asve.C31012a;
import com.p2082ss.android.ugc.asve.C31016b;
import com.p2082ss.android.ugc.asve.context.AbstractC31040h;
import com.p2082ss.android.ugc.asve.p2215d.AbstractC31049a;
import com.p2082ss.android.ugc.asve.recorder.camera.AbstractC31185d;
import com.p2082ss.android.ugc.asve.recorder.camera.p2224c.C31182a;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.p2219a.AbstractC31123a;
import com.p2082ss.android.ugc.asve.recorder.p2220b.AbstractC31130a;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.asve.recorder.reaction.AbstractC31218a;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85346av;
import com.p2082ss.android.vesdk.runtime.AbstractC85556e;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.asve.recorder.a */
public final class C31117a implements AbstractC31191d {

    /* renamed from: e */
    public static final C31118a f74565e = new C31118a((byte) 0);

    /* renamed from: a */
    public final EnumC31119b f74566a;

    /* renamed from: b */
    public final AbstractC1204m f74567b;

    /* renamed from: c */
    public final AbstractC31191d f74568c;

    /* renamed from: d */
    public final AbstractC31040h f74569d;

    /* renamed from: f */
    private final C89378p<Integer, Integer> f74570f;

    /* renamed from: g */
    private final String f74571g;

    /* renamed from: h */
    private final String f74572h;

    /* renamed from: i */
    private final boolean f74573i;

    /* renamed from: j */
    private final String f74574j;

    /* renamed from: k */
    private final String f74575k;

    /* renamed from: com.ss.android.ugc.asve.recorder.a$b */
    public enum EnumC31119b {
        CUSTOM,
        REACTION,
        DUET;

        static {
            Covode.recordClassIndex(37762);
        }
    }

    static {
        Covode.recordClassIndex(37760);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: a */
    public final void mo56536a(Context context) {
        C89219l.m154721d(context, "");
        this.f74568c.mo56536a(context);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: a */
    public final void mo56537a(AbstractC30012b bVar) {
        C89219l.m154721d(bVar, "");
        this.f74568c.mo56537a(bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: a */
    public final void mo56538a(C85346av.AbstractC85365j jVar) {
        this.f74568c.mo56538a(jVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: a */
    public final void mo56539a(AbstractC85541q qVar) {
        this.f74568c.mo56539a(qVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: a */
    public final void mo56540a(AbstractC85556e eVar, String str) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(str, "");
        this.f74568c.mo56540a(eVar, str);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: a */
    public final void mo56541a(AbstractC89172b<? super Integer, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        this.f74568c.mo56541a(bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: a */
    public final void mo56542a(AbstractC89188r<? super Integer, ? super Integer, ? super String, ? super C85346av, C89391z> rVar) {
        C89219l.m154721d(rVar, "");
        this.f74568c.mo56542a(rVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: b */
    public final AbstractC31123a mo56543b() {
        return this.f74568c.mo56543b();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: b */
    public final void mo56544b(AbstractC30012b bVar) {
        C89219l.m154721d(bVar, "");
        this.f74568c.mo56544b(bVar);
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: c */
    public final AbstractC31185d mo56545c() {
        return this.f74568c.mo56545c();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: d */
    public final AbstractC31130a mo56546d() {
        return this.f74568c.mo56546d();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: e */
    public final AbstractC31193a mo56547e() {
        return this.f74568c.mo56547e();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: f */
    public final AbstractC31133a mo56548f() {
        return this.f74568c.mo56548f();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: g */
    public final AbstractC31218a mo56549g() {
        return this.f74568c.mo56549g();
    }

    @Override // com.p2082ss.android.ugc.asve.recorder.AbstractC31191d
    /* renamed from: h */
    public final AbstractC31049a mo56550h() {
        return this.f74568c.mo56550h();
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.a$a */
    public static final class C31118a {
        static {
            Covode.recordClassIndex(37761);
        }

        private C31118a() {
        }

        public /* synthetic */ C31118a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C31117a m64349a(AbstractC1204m mVar, AbstractC31040h hVar, C31182a aVar) {
            C89219l.m154721d(hVar, "");
            Application b = C31012a.m63726b();
            C89219l.m154721d(b, "");
            C89219l.m154721d(hVar, "");
            return new C31117a(mVar, new VERecorderImpl(b, hVar, mVar, aVar), hVar);
        }
    }

    /* renamed from: a */
    public final void mo56564a() {
        String str;
        mo56536a(C31012a.m63726b());
        AbstractC31133a f = mo56548f();
        int c = mo56545c().mo56671c();
        int d = mo56545c().mo56674d();
        String absolutePath = this.f74569d.mo56158e().mo56220b().getAbsolutePath();
        C89219l.m154716b(absolutePath, "");
        int intValue = this.f74570f.getSecond().intValue();
        int intValue2 = this.f74570f.getFirst().intValue();
        boolean j = this.f74569d.mo56163j();
        f.mo56584a(c, d, absolutePath, intValue, intValue2, "", j ? 1 : 0, this.f74569d.mo56160g());
        boolean z = true;
        mo56548f().mo56603a(true);
        mo56548f();
        this.f74569d.mo56169p();
        mo56547e().mo56798b(3);
        mo56547e();
        if (this.f74566a == EnumC31119b.DUET) {
            C31016b.f74339a.mo56123d("initDuet() called");
            int d2 = this.f74569d.mo56165l().mo56209d();
            int e = this.f74569d.mo56165l().mo56210e();
            if (this.f74569d.mo56165l().mo56206a()) {
                str = null;
            } else {
                str = this.f74572h;
            }
            double d3 = (double) d2;
            Double.isNaN(d3);
            if (d3 * 1.3333333333333333d <= ((double) e)) {
                z = false;
            }
            if (!this.f74569d.mo56164k().invoke().booleanValue()) {
                mo56548f().mo56600a(str, 0L, 0L, false);
            }
            mo56546d().mo56581a(this.f74571g, str, z);
        }
        if (this.f74566a == EnumC31119b.REACTION) {
            C31016b.f74339a.mo56123d("initReaction() called");
            if (!this.f74569d.mo56164k().invoke().booleanValue()) {
                mo56548f().mo56600a(this.f74575k, 0L, 0L, false);
            }
            mo56549g().mo56856d();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.a$c */
    public static final class SurfaceHolder$CallbackC31120c implements SurfaceHolder.Callback {

        /* renamed from: a */
        final /* synthetic */ C31117a f74577a;

        static {
            Covode.recordClassIndex(37763);
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            C89219l.m154721d(surfaceHolder, "");
        }

        /* renamed from: com.ss.android.ugc.asve.recorder.a$c$a */
        static final class C31121a extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

            /* renamed from: a */
            public static final C31121a f74578a = new C31121a();

            static {
                Covode.recordClassIndex(37764);
            }

            C31121a() {
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

        /* JADX WARN: Incorrect args count in method signature: ()V */
        SurfaceHolder$CallbackC31120c(C31117a aVar) {
            this.f74577a = aVar;
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            C89219l.m154721d(surfaceHolder, "");
            this.f74577a.mo56564a();
            AbstractC31133a f = this.f74577a.f74568c.mo56548f();
            Surface surface = surfaceHolder.getSurface();
            C89219l.m154716b(surface, "");
            f.mo56591a(surface, "", C31121a.f74578a);
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            C89219l.m154721d(surfaceHolder, "");
            this.f74577a.f74568c.mo56548f().mo56613c();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.recorder.a$d */
    static final class C31122d extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        public static final C31122d f74579a = new C31122d();

        static {
            Covode.recordClassIndex(37765);
        }

        C31122d() {
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

    public C31117a(AbstractC1204m mVar, AbstractC31191d dVar, AbstractC31040h hVar) {
        EnumC31119b bVar;
        Surface surface;
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(hVar, "");
        this.f74567b = mVar;
        this.f74568c = dVar;
        this.f74569d = hVar;
        this.f74570f = hVar.mo56159f();
        String c = hVar.mo56165l().mo56208c();
        this.f74571g = c;
        String b = hVar.mo56165l().mo56207b();
        this.f74572h = b;
        this.f74573i = hVar.mo56165l().mo56211f();
        String b2 = hVar.mo56166m().mo56213b();
        this.f74574j = b2;
        String a = hVar.mo56166m().mo56212a();
        this.f74575k = a;
        if (b2.length() > 0 && a.length() > 0) {
            bVar = EnumC31119b.REACTION;
        } else if (c.length() <= 0 || b.length() <= 0) {
            bVar = EnumC31119b.CUSTOM;
        } else {
            bVar = EnumC31119b.DUET;
        }
        this.f74566a = bVar;
        if (hVar.mo56156c()) {
            SurfaceHolder d = hVar.mo56157d();
            if (d != null) {
                d.addCallback(new SurfaceHolder$CallbackC31120c(this));
            }
            SurfaceHolder d2 = hVar.mo56157d();
            if (d2 != null && (surface = d2.getSurface()) != null && surface.isValid()) {
                mo56564a();
                dVar.mo56548f().mo56591a(surface, "", C31122d.f74579a);
            }
        }
    }
}
