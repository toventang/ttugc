package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.BaseJediViewModel;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel */
public final class CutVideoSpeedViewModel extends BaseJediViewModel<CutVideoSpeedState> {

    /* renamed from: a */
    private final AbstractC89244h f156816a = C89250i.m154773a((AbstractC89171a) C70135b.f156820a);

    /* renamed from: b */
    private final AbstractC89244h f156817b = C89250i.m154773a((AbstractC89171a) C70138e.f156823a);

    /* renamed from: c */
    private final AbstractC89244h f156818c = C89250i.m154773a((AbstractC89171a) C70134a.f156819a);

    static {
        Covode.recordClassIndex(82570);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C1213t<EnumC78601i> mo110748a() {
        return (C1213t) this.f156816a.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C1213t<Float> mo110752b() {
        return (C1213t) this.f156817b.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C1213t<Float> mo110755g() {
        return (C1213t) this.f156818c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel$a */
    static final class C70134a extends AbstractC89220m implements AbstractC89171a<C1213t<Float>> {

        /* renamed from: a */
        public static final C70134a f156819a = new C70134a();

        static {
            Covode.recordClassIndex(82571);
        }

        C70134a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Float> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel$b */
    static final class C70135b extends AbstractC89220m implements AbstractC89171a<C1213t<EnumC78601i>> {

        /* renamed from: a */
        public static final C70135b f156820a = new C70135b();

        static {
            Covode.recordClassIndex(82572);
        }

        C70135b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<EnumC78601i> invoke() {
            return new C1213t();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel$e */
    static final class C70138e extends AbstractC89220m implements AbstractC89171a<C1213t<Float>> {

        /* renamed from: a */
        public static final C70138e f156823a = new C70138e();

        static {
            Covode.recordClassIndex(82575);
        }

        C70138e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C1213t<Float> invoke() {
            return new C1213t();
        }
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new CutVideoSpeedState(null, null, 3, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel$c */
    static final class C70136c extends AbstractC89220m implements AbstractC89172b<CutVideoSpeedState, CutVideoSpeedState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156821a;

        static {
            Covode.recordClassIndex(82573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70136c(boolean z) {
            super(1);
            this.f156821a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoSpeedState invoke(CutVideoSpeedState cutVideoSpeedState) {
            CutVideoSpeedState cutVideoSpeedState2 = cutVideoSpeedState;
            C89219l.m154721d(cutVideoSpeedState2, "");
            return CutVideoSpeedState.copy$default(cutVideoSpeedState2, Boolean.valueOf(this.f156821a), null, 2, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.CutVideoSpeedViewModel$d */
    public static final class C70137d extends AbstractC89220m implements AbstractC89172b<CutVideoSpeedState, CutVideoSpeedState> {

        /* renamed from: a */
        final /* synthetic */ boolean f156822a;

        static {
            Covode.recordClassIndex(82574);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70137d(boolean z) {
            super(1);
            this.f156822a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ CutVideoSpeedState invoke(CutVideoSpeedState cutVideoSpeedState) {
            CutVideoSpeedState cutVideoSpeedState2 = cutVideoSpeedState;
            C89219l.m154721d(cutVideoSpeedState2, "");
            return CutVideoSpeedState.copy$default(cutVideoSpeedState2, null, Boolean.valueOf(this.f156822a), 1, null);
        }
    }

    /* renamed from: a */
    public final void mo110749a(float f) {
        mo110752b().setValue(Float.valueOf(f));
    }

    /* renamed from: b */
    public final void mo110753b(float f) {
        mo110755g().setValue(Float.valueOf(f));
    }

    /* renamed from: a */
    public final void mo110750a(EnumC78601i iVar) {
        C89219l.m154721d(iVar, "");
        mo110748a().setValue(iVar);
    }

    /* renamed from: b */
    public final void mo110754b(boolean z) {
        mo33689c(new C70137d(z));
    }

    /* renamed from: a */
    public final void mo110751a(boolean z) {
        mo33689c(new C70136c(z));
    }
}
