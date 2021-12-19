package com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel;

import com.bytedance.assem.arch.p794a.C12646c;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3572a.C63551b;
import com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.p3572a.C63553c;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsNavBarViewModel */
public final class ProfileEditPronounsNavBarViewModel extends AssemViewModel<C63676a> {

    /* renamed from: l */
    public static final C63662a f144350l = new C63662a((byte) 0);

    /* renamed from: j */
    public final C88411a f144351j = new C88411a();

    /* renamed from: k */
    public final AbstractC89244h f144352k = C12646c.m22778a(this, C89204ab.m154669a(C63551b.class));

    static {
        Covode.recordClassIndex(74979);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsNavBarViewModel$a */
    public static final class C63662a {
        static {
            Covode.recordClassIndex(74980);
        }

        private C63662a() {
        }

        public /* synthetic */ C63662a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C63676a mo20674f() {
        return new C63676a();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        this.f144351j.dispose();
        super.onCleared();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsNavBarViewModel$b */
    public static final class C63663b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileEditPronounsNavBarViewModel f144353a;

        static {
            Covode.recordClassIndex(74981);
        }

        public C63663b(ProfileEditPronounsNavBarViewModel profileEditPronounsNavBarViewModel) {
            this.f144353a = profileEditPronounsNavBarViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C63553c cVar = (C63553c) obj;
            this.f144353a.mo20662a(new AbstractC89172b<C63676a, C63676a>() {
                /* class com.p2082ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsNavBarViewModel.C63663b.C636641 */

                static {
                    Covode.recordClassIndex(74982);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C63676a invoke(C63676a aVar) {
                    C63676a aVar2 = aVar;
                    String str = "";
                    C89219l.m154721d(aVar2, str);
                    String str2 = cVar.f144231a;
                    if (str2 != null) {
                        str = str2;
                    }
                    return C63676a.m115212a(aVar2, true, str, null, 4);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.editprofile.pronouns.viewmodel.ProfileEditPronounsNavBarViewModel$c */
    public static final class C63665c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ ProfileEditPronounsNavBarViewModel f144355a;

        static {
            Covode.recordClassIndex(74983);
        }

        public C63665c(ProfileEditPronounsNavBarViewModel profileEditPronounsNavBarViewModel) {
            this.f144355a = profileEditPronounsNavBarViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            if (!(th instanceof C34485a)) {
                this.f144355a.mo20662a(C636672.f144357a);
            } else if (((C34480a) th).getErrorCode() == 3002131) {
                this.f144355a.mo20662a(C636661.f144356a);
            }
        }
    }
}
