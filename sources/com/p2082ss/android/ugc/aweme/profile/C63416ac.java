package com.p2082ss.android.ugc.aweme.profile;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideState;
import com.p2082ss.android.ugc.aweme.profile.viewmodel.MyProfileGuideViewModel;
import java.lang.ref.WeakReference;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ac */
public final class C63416ac {

    /* renamed from: a */
    public static boolean f143967a;

    /* renamed from: b */
    public static WeakReference<MyProfileGuideViewModel> f143968b;

    /* renamed from: c */
    public static final C63416ac f143969c = new C63416ac();

    private C63416ac() {
    }

    static {
        Covode.recordClassIndex(74707);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ac$a */
    static final class C63417a extends AbstractC89220m implements AbstractC89172b<MyProfileGuideState, MyProfileGuideState> {

        /* renamed from: a */
        final /* synthetic */ boolean f143970a;

        static {
            Covode.recordClassIndex(74708);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C63417a(boolean z) {
            super(1);
            this.f143970a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ MyProfileGuideState invoke(MyProfileGuideState myProfileGuideState) {
            MyProfileGuideState myProfileGuideState2 = myProfileGuideState;
            C89219l.m154721d(myProfileGuideState2, "");
            return MyProfileGuideState.copy$default(myProfileGuideState2, false, false, false, false, null, null, null, false, this.f143970a, false, null, null, null, null, 16127, null);
        }
    }
}
