package com.p2082ss.android.ugc.aweme.shortvideo.editcut;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.services.IFoundationAVService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70447e;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70464i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70465j;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70467l;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3801b.C70418a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70436b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.o */
public final class C71780o implements C70467l.AbstractC70470b {

    /* renamed from: a */
    public boolean f160878a;

    /* renamed from: b */
    public C69905c f160879b;

    /* renamed from: c */
    volatile boolean f160880c;

    /* renamed from: d */
    public long f160881d;

    /* renamed from: e */
    public final ActivityC0945e f160882e;

    /* renamed from: f */
    public final AbstractC71792p f160883f;

    /* renamed from: g */
    private final AbstractC89244h f160884g = C89250i.m154773a((AbstractC89171a) C71786e.f160893a);

    /* renamed from: h */
    private final AbstractC89244h f160885h = C89250i.m154773a((AbstractC89171a) C71790h.f160901a);

    static {
        Covode.recordClassIndex(84325);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70467l.AbstractC70470b
    /* renamed from: a */
    public final void mo110889a(long j) {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70467l.AbstractC70470b
    /* renamed from: a */
    public final boolean mo110890a() {
        return true;
    }

    /* renamed from: c */
    public final C70467l mo113444c() {
        return (C70467l) this.f160884g.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C70447e mo113445d() {
        return (C70447e) this.f160885h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.o$e */
    static final class C71786e extends AbstractC89220m implements AbstractC89171a<C70467l> {

        /* renamed from: a */
        public static final C71786e f160893a = new C71786e();

        static {
            Covode.recordClassIndex(84331);
        }

        C71786e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70467l invoke() {
            return new C70467l();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.o$h */
    static final class C71790h extends AbstractC89220m implements AbstractC89171a<C70447e> {

        /* renamed from: a */
        public static final C71790h f160901a = new C71790h();

        static {
            Covode.recordClassIndex(84335);
        }

        C71790h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70447e invoke() {
            return new C70447e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70467l.AbstractC70470b
    /* renamed from: b */
    public final List<VideoSegment> mo110891b() {
        return this.f160883f.mo113381b();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.o$c */
    public static final class C71783c implements AbstractC70436b {

        /* renamed from: a */
        final /* synthetic */ C71780o f160888a;

        /* renamed from: b */
        final /* synthetic */ int f160889b;

        static {
            Covode.recordClassIndex(84328);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.o$c$a */
        public static final class C71784a implements AbstractC70440f {

            /* renamed from: a */
            final /* synthetic */ C71783c f160890a;

            /* renamed from: b */
            final /* synthetic */ C69905c f160891b;

            static {
                Covode.recordClassIndex(84329);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
            /* renamed from: a */
            public final void mo110701a() {
                this.f160890a.f160888a.f160883f.mo113389d(false);
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
            /* renamed from: a */
            public final void mo110702a(int i) {
                this.f160890a.f160888a.mo113441a(this.f160891b);
                this.f160890a.f160888a.f160883f.mo113374a(i);
                this.f160890a.f160888a.f160883f.mo113389d(true);
            }

            C71784a(C71783c cVar, C69905c cVar2) {
                this.f160890a = cVar;
                this.f160891b = cVar2;
            }
        }

        C71783c(C71780o oVar, int i) {
            this.f160888a = oVar;
            this.f160889b = i;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70436b
        /* renamed from: a */
        public final void mo110905a(C69905c cVar, boolean z) {
            if (!z) {
                this.f160888a.f160883f.mo113389d(false);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70436b
        /* renamed from: b */
        public final void mo110906b(C69905c cVar, boolean z) {
            if (!z) {
                this.f160888a.f160883f.mo113389d(false);
            } else {
                this.f160888a.mo113444c().mo111035b(cVar, this.f160889b, 2, new C71784a(this, cVar));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.o$b */
    public static final class C71782b implements AbstractC70440f {

        /* renamed from: a */
        final /* synthetic */ C71780o f160887a;

        static {
            Covode.recordClassIndex(84327);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110701a() {
            this.f160887a.f160883f.mo113389d(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71782b(C71780o oVar) {
            this.f160887a = oVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110702a(int i) {
            this.f160887a.f160883f.mo113389d(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.o$d */
    public static final class C71785d implements C70447e.AbstractC70449b {

        /* renamed from: a */
        final /* synthetic */ C71780o f160892a;

        static {
            Covode.recordClassIndex(84330);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70447e.AbstractC70449b
        /* renamed from: a */
        public final void mo110886a() {
            this.f160892a.f160881d = System.currentTimeMillis();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71785d(C71780o oVar) {
            this.f160892a = oVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70447e.AbstractC70449b
        /* renamed from: a */
        public final void mo110887a(boolean z, boolean z2, boolean z3) {
            if (z) {
                this.f160892a.f160878a = true;
                this.f160892a.mo113444c().mo111040f();
                new C79459a(this.f160892a.f160882e).mo123050a(R.string.g4q).mo123053a();
            }
            if (z3) {
                C80720e.m139931c(new File(C70455f.f157418b).getPath());
            }
            if (z2) {
                this.f160892a.f160883f.mo113379a(this.f160892a.mo110891b());
            }
            C70464i.m124297a(z, z2, System.currentTimeMillis() - this.f160892a.f160881d);
        }
    }

    /* renamed from: f */
    private final void m126726f() {
        mo113441a((C69905c) null);
        mo113444c().mo111038d();
        mo113444c().mo111041g();
        this.f160878a = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.o$f */
    public static final class C71787f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C71780o f160894a;

        /* renamed from: b */
        final /* synthetic */ C69905c f160895b;

        /* renamed from: c */
        final /* synthetic */ boolean f160896c;

        /* renamed from: d */
        final /* synthetic */ int f160897d;

        static {
            Covode.recordClassIndex(84332);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71787f(C71780o oVar, C69905c cVar, boolean z, int i) {
            super(0);
            this.f160894a = oVar;
            this.f160895b = cVar;
            this.f160896c = z;
            this.f160897d = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C71780o oVar = this.f160894a;
            if (!oVar.f160880c) {
                C84911q.m145921a("initBingoAlgorithm when force apply music sync");
                oVar.f160880c = true;
                AbstractC31071f fVar = oVar.mo113444c().f157448a;
                if (fVar != null) {
                    fVar.mo56382q();
                }
            }
            C70455f.m124268a(this.f160895b);
            if (this.f160896c) {
                this.f160894a.mo113444c().mo111028a((AbstractC70440f) new AbstractC70440f(this) {
                    /* class com.p2082ss.android.ugc.aweme.shortvideo.editcut.C71780o.C71787f.C717881 */

                    /* renamed from: a */
                    final /* synthetic */ C71787f f160898a;

                    static {
                        Covode.recordClassIndex(84333);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
                    /* renamed from: a */
                    public final void mo110701a() {
                        this.f160898a.f160894a.f160883f.mo113389d(false);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f160898a = r1;
                    }

                    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
                    /* renamed from: a */
                    public final void mo110702a(int i) {
                        if (i < 0) {
                            this.f160898a.f160894a.f160883f.mo113389d(false);
                        } else {
                            this.f160898a.f160894a.mo113442a(this.f160898a.f160895b, this.f160898a.f160897d);
                        }
                    }
                }, false);
            } else {
                this.f160894a.mo113442a(this.f160895b, this.f160897d);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final List<VideoSegment> mo113446e() {
        List<VideoSegment> b = mo110891b();
        if (C84904k.m145909a(b)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (T t : b) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            if (!t2.f156717i && !t2.f156724p && !mo113445d().mo111014a((VideoSegment) t2) && !C84896h.m145866a(t2.mo110571a(false), true)) {
                arrayList.add(t2);
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.o$a */
    public static final class C71781a implements AbstractC70440f {

        /* renamed from: a */
        final /* synthetic */ C71780o f160886a;

        static {
            Covode.recordClassIndex(84326);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110701a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71781a(C71780o oVar) {
            this.f160886a = oVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110702a(int i) {
            this.f160886a.f160883f.mo113389d(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.o$g */
    public static final class C71789g implements IFoundationAVService.IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ C71780o f160899a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f160900b;

        static {
            Covode.recordClassIndex(84334);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            this.f160900b.invoke();
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            C84911q.m145921a("downloadResourceFinderModelFile failed when start music sync");
            this.f160899a.f160883f.mo113389d(false);
        }

        C71789g(C71780o oVar, AbstractC89171a aVar) {
            this.f160899a = oVar;
            this.f160900b = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.editcut.o$i */
    public static final class C71791i implements AbstractC70440f {

        /* renamed from: a */
        final /* synthetic */ C71780o f160902a;

        static {
            Covode.recordClassIndex(84336);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110701a() {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C71791i(C71780o oVar) {
            this.f160902a = oVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110702a(int i) {
            this.f160902a.f160883f.mo113389d(true);
        }
    }

    /* renamed from: a */
    private final void m126725a(AbstractC89171a<C89391z> aVar) {
        this.f160883f.mo113408w();
        if (C70455f.f157419c) {
            aVar.invoke();
        } else {
            C70465j.m124298a().mo110978a(new C71789g(this, aVar));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70467l.AbstractC70470b
    /* renamed from: a */
    public final void mo110888a(int i) {
        mo113444c();
        if (!C70467l.m124303a(i)) {
            this.f160883f.mo113386c(mo110891b());
        }
    }

    /* renamed from: a */
    public final void mo113441a(C69905c cVar) {
        this.f160879b = cVar;
        mo113444c().f157450c = cVar;
    }

    public C71780o(ActivityC0945e eVar, AbstractC71792p pVar) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(pVar, "");
        this.f160882e = eVar;
        this.f160883f = pVar;
    }

    /* renamed from: a */
    public final void mo113440a(int i, int i2) {
        if (this.f160879b != null) {
            this.f160883f.mo113408w();
            mo113444c().mo111027a(this.f160879b, i, i2, new C71782b(this));
        }
    }

    /* renamed from: a */
    public final void mo113442a(C69905c cVar, int i) {
        C70418a.m124204a(this.f160882e, cVar, new C71783c(this, i));
    }

    /* renamed from: a */
    public final void mo113443a(C69905c cVar, int i, boolean z) {
        if (cVar == null) {
            m126726f();
        } else {
            m126725a(new C71787f(this, cVar, z, i));
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m126724a(C71780o oVar, C69905c cVar, int i, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = true;
        }
        oVar.mo113443a(cVar, i, z);
    }
}
