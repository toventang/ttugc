package com.p2082ss.android.ugc.aweme.profile.widgets;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2716ct.C40760a;
import com.p2082ss.android.ugc.aweme.profile.survey.C63883d;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.q */
public final class C65084q implements C63883d.AbstractC63884a {

    /* renamed from: a */
    private final WeakReference<MyProfileGuideViewModel> f146935a;

    static {
        Covode.recordClassIndex(76552);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.survey.C63883d.AbstractC63884a
    /* renamed from: a */
    public final void mo103423a() {
        MyProfileGuideViewModel myProfileGuideViewModel = this.f146935a.get();
        if (myProfileGuideViewModel != null) {
            myProfileGuideViewModel.mo75829g(C65086b.f146937a);
        }
    }

    public C65084q(MyProfileGuideViewModel myProfileGuideViewModel) {
        C89219l.m154721d(myProfileGuideViewModel, "");
        this.f146935a = new WeakReference<>(myProfileGuideViewModel);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.q$b */
    static final class C65086b extends AbstractC89220m implements AbstractC89172b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        public static final C65086b f146937a = new C65086b();

        static {
            Covode.recordClassIndex(76554);
        }

        C65086b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            C89219l.m154721d(myProfileGuideState2, "");
            return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, true, null, null, null, false, false, false, null, null, null, null, 16359, null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.survey.C63883d.AbstractC63884a
    /* renamed from: a */
    public final void mo103424a(C40760a aVar) {
        MyProfileGuideViewModel myProfileGuideViewModel = this.f146935a.get();
        if (myProfileGuideViewModel != null) {
            myProfileGuideViewModel.mo75829g(new C65085a(aVar));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.q$a */
    static final class C65085a extends AbstractC89220m implements AbstractC89172b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        final /* synthetic */ C40760a f146936a;

        static {
            Covode.recordClassIndex(76553);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C65085a(C40760a aVar) {
            super(1);
            this.f146936a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            C89219l.m154721d(myProfileGuideState2, "");
            return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, true, this.f146936a, null, null, false, false, false, null, null, null, null, 16359, null);
        }
    }
}
