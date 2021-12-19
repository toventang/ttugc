package com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel */
public final class FollowRelationTabViewModel extends JediViewModel<FollowRelationState> {
    static {
        Covode.recordClassIndex(60564);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ FollowRelationState mo23027d() {
        return new FollowRelationState(false, 0, 0, 0, false, null, 63, null);
    }

    /* renamed from: a */
    public final void mo86729a(int i) {
        mo33689c(new C51354a(i));
    }

    /* renamed from: b */
    public final void mo86732b(boolean z) {
        mo33689c(new C51355b(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel$a */
    static final class C51354a extends AbstractC89220m implements AbstractC89172b<FollowRelationState, FollowRelationState> {

        /* renamed from: a */
        final /* synthetic */ int f118381a;

        static {
            Covode.recordClassIndex(60565);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51354a(int i) {
            super(1);
            this.f118381a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FollowRelationState invoke(FollowRelationState followRelationState) {
            FollowRelationState followRelationState2 = followRelationState;
            C89219l.m154721d(followRelationState2, "");
            return FollowRelationState.copy$default(followRelationState2, false, 0, this.f118381a, 0, false, null, 59, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel$b */
    public static final class C51355b extends AbstractC89220m implements AbstractC89172b<FollowRelationState, FollowRelationState> {

        /* renamed from: a */
        final /* synthetic */ boolean f118382a;

        static {
            Covode.recordClassIndex(60566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51355b(boolean z) {
            super(1);
            this.f118382a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FollowRelationState invoke(FollowRelationState followRelationState) {
            FollowRelationState followRelationState2 = followRelationState;
            C89219l.m154721d(followRelationState2, "");
            return FollowRelationState.copy$default(followRelationState2, false, 0, 0, 0, this.f118382a, null, 47, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel$c */
    static final class C51356c extends AbstractC89220m implements AbstractC89172b<FollowRelationState, FollowRelationState> {

        /* renamed from: a */
        final /* synthetic */ boolean f118383a;

        static {
            Covode.recordClassIndex(60567);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51356c(boolean z) {
            super(1);
            this.f118383a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FollowRelationState invoke(FollowRelationState followRelationState) {
            FollowRelationState followRelationState2 = followRelationState;
            C89219l.m154721d(followRelationState2, "");
            return FollowRelationState.copy$default(followRelationState2, this.f118383a, 0, 0, 0, false, null, 62, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.FollowRelationTabViewModel$d */
    static final class C51357d extends AbstractC89220m implements AbstractC89172b<FollowRelationState, FollowRelationState> {

        /* renamed from: a */
        final /* synthetic */ String f118384a;

        static {
            Covode.recordClassIndex(60568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51357d(String str) {
            super(1);
            this.f118384a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ FollowRelationState invoke(FollowRelationState followRelationState) {
            FollowRelationState followRelationState2 = followRelationState;
            C89219l.m154721d(followRelationState2, "");
            return FollowRelationState.copy$default(followRelationState2, false, 0, 0, 0, false, this.f118384a, 31, null);
        }
    }

    /* renamed from: a */
    public final void mo86730a(String str) {
        C89219l.m154721d(str, "");
        mo33689c(new C51357d(str));
    }

    /* renamed from: a */
    public final void mo86731a(boolean z) {
        mo33690d(new C51356c(z));
    }
}
