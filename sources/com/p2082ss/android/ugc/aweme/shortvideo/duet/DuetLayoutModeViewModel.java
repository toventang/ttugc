package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.ui_component.AbstractC23517a;
import com.bytedance.ui_component.LifecycleAwareViewModel;
import com.p2082ss.android.ugc.aweme.base.C34602l;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel */
public final class DuetLayoutModeViewModel extends LifecycleAwareViewModel<DuetLayoutModeState> implements AbstractC70668d {

    /* renamed from: a */
    public final C2563k<Boolean> f158150a = new C2563k<>();

    /* renamed from: b */
    public final C2563k<C34602l> f158151b = new C2563k<>();

    static {
        Covode.recordClassIndex(83125);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.duet.AbstractC70668d
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2559g mo111482a() {
        return this.f158150a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.duet.AbstractC70668d
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C2559g mo111485b() {
        return this.f158151b;
    }

    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ AbstractC20368af mo23027d() {
        return new DuetLayoutModeState(0, 0, 0, 0, null, null, 63, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.duet.AbstractC70668d
    /* renamed from: a */
    public final void mo111483a(String str) {
        C89219l.m154721d(str, "");
        mo33690d(new C70658d(str));
    }

    /* renamed from: b */
    public final void mo111486b(boolean z) {
        this.f158150a.mo6999a(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel$a */
    static final class C70655a extends AbstractC89220m implements AbstractC89172b<DuetLayoutModeState, DuetLayoutModeState> {

        /* renamed from: a */
        final /* synthetic */ int f158152a;

        /* renamed from: b */
        final /* synthetic */ int f158153b;

        /* renamed from: c */
        final /* synthetic */ int f158154c;

        static {
            Covode.recordClassIndex(83126);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70655a(int i, int i2, int i3) {
            super(1);
            this.f158152a = i;
            this.f158153b = i2;
            this.f158154c = i3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ DuetLayoutModeState invoke(DuetLayoutModeState duetLayoutModeState) {
            DuetLayoutModeState duetLayoutModeState2 = duetLayoutModeState;
            C89219l.m154721d(duetLayoutModeState2, "");
            return DuetLayoutModeState.copy$default(duetLayoutModeState2, this.f158152a, 0, this.f158153b, this.f158154c, null, null, 50, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel$b */
    static final class C70656b extends AbstractC89220m implements AbstractC89172b<DuetLayoutModeState, DuetLayoutModeState> {

        /* renamed from: a */
        final /* synthetic */ int f158155a;

        static {
            Covode.recordClassIndex(83127);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70656b(int i) {
            super(1);
            this.f158155a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ DuetLayoutModeState invoke(DuetLayoutModeState duetLayoutModeState) {
            DuetLayoutModeState duetLayoutModeState2 = duetLayoutModeState;
            C89219l.m154721d(duetLayoutModeState2, "");
            return DuetLayoutModeState.copy$default(duetLayoutModeState2, 0, this.f158155a, 0, 0, null, null, 61, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel$d */
    static final class C70658d extends AbstractC89220m implements AbstractC89172b<DuetLayoutModeState, DuetLayoutModeState> {

        /* renamed from: a */
        final /* synthetic */ String f158157a;

        static {
            Covode.recordClassIndex(83129);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70658d(String str) {
            super(1);
            this.f158157a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ DuetLayoutModeState invoke(DuetLayoutModeState duetLayoutModeState) {
            DuetLayoutModeState duetLayoutModeState2 = duetLayoutModeState;
            C89219l.m154721d(duetLayoutModeState2, "");
            return DuetLayoutModeState.copy$default(duetLayoutModeState2, 0, 0, 0, 0, this.f158157a, null, 47, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.duet.AbstractC70668d
    /* renamed from: a */
    public final void mo111484a(boolean z) {
        mo33690d(new C70657c(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel$c */
    static final class C70657c extends AbstractC89220m implements AbstractC89172b<DuetLayoutModeState, DuetLayoutModeState> {

        /* renamed from: a */
        final /* synthetic */ boolean f158156a;

        static {
            Covode.recordClassIndex(83128);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70657c(boolean z) {
            super(1);
            this.f158156a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ DuetLayoutModeState invoke(DuetLayoutModeState duetLayoutModeState) {
            AbstractC23517a aVar;
            DuetLayoutModeState duetLayoutModeState2 = duetLayoutModeState;
            C89219l.m154721d(duetLayoutModeState2, "");
            if (this.f158156a) {
                aVar = new AbstractC23517a.C23519b();
            } else {
                aVar = new AbstractC23517a.C23518a();
            }
            return DuetLayoutModeState.copy$default(duetLayoutModeState2, 0, 0, 0, 0, null, aVar, 31, null);
        }
    }
}
