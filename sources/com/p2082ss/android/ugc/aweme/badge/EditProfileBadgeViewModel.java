package com.p2082ss.android.ugc.aweme.badge;

import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.badge.EditProfileBadgeApi;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import java.util.ArrayList;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.badge.EditProfileBadgeViewModel */
public final class EditProfileBadgeViewModel extends JediViewModel<EditProfileBadgeState> {

    /* renamed from: a */
    public List<C34448h> f81342a = new ArrayList();

    static {
        Covode.recordClassIndex(41363);
    }

    /* renamed from: b */
    private final void m70405b() {
        this.f81342a.clear();
    }

    /* renamed from: a */
    public final void mo60841a() {
        m70405b();
        m70406g();
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ EditProfileBadgeState mo23027d() {
        return new EditProfileBadgeState(null, 1, null);
    }

    /* renamed from: g */
    private final void m70406g() {
        mo33689c(new C34416a(this));
        EditProfileBadgeApi.C34415a.m70404a().mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo142915a(new C34417b(this), new C34420c(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.badge.EditProfileBadgeViewModel$c */
    public static final class C34420c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ EditProfileBadgeViewModel f81348a;

        static {
            Covode.recordClassIndex(41368);
        }

        C34420c(EditProfileBadgeViewModel editProfileBadgeViewModel) {
            this.f81348a = editProfileBadgeViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C51423a.m95790a((Throwable) obj);
            this.f81348a.mo33689c(new AbstractC89172b<EditProfileBadgeState, EditProfileBadgeState>(this) {
                /* class com.p2082ss.android.ugc.aweme.badge.EditProfileBadgeViewModel.C34420c.C344211 */

                /* renamed from: a */
                final /* synthetic */ C34420c f81349a;

                static {
                    Covode.recordClassIndex(41369);
                }

                {
                    this.f81349a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ EditProfileBadgeState invoke(EditProfileBadgeState editProfileBadgeState) {
                    EditProfileBadgeState editProfileBadgeState2 = editProfileBadgeState;
                    C89219l.m154721d(editProfileBadgeState2, "");
                    return editProfileBadgeState2.copy(new C34451k(this.f81349a.f81348a.f81342a, false, 11));
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.badge.EditProfileBadgeViewModel$a */
    public static final class C34416a extends AbstractC89220m implements AbstractC89172b<EditProfileBadgeState, EditProfileBadgeState> {

        /* renamed from: a */
        final /* synthetic */ EditProfileBadgeViewModel f81343a;

        static {
            Covode.recordClassIndex(41364);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34416a(EditProfileBadgeViewModel editProfileBadgeViewModel) {
            super(1);
            this.f81343a = editProfileBadgeViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ EditProfileBadgeState invoke(EditProfileBadgeState editProfileBadgeState) {
            EditProfileBadgeState editProfileBadgeState2 = editProfileBadgeState;
            C89219l.m154721d(editProfileBadgeState2, "");
            return editProfileBadgeState2.copy(new C34451k(this.f81343a.f81342a, true, 43));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.badge.EditProfileBadgeViewModel$b */
    public static final class C34417b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ EditProfileBadgeViewModel f81344a;

        static {
            Covode.recordClassIndex(41365);
        }

        C34417b(EditProfileBadgeViewModel editProfileBadgeViewModel) {
            this.f81344a = editProfileBadgeViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C34449i iVar = (C34449i) obj;
            if (iVar.error_code == 0) {
                List<C34448h> list = iVar.f81413b;
                if (list != null) {
                    this.f81344a.f81342a.addAll(list);
                }
                this.f81344a.mo33689c(new AbstractC89172b<EditProfileBadgeState, EditProfileBadgeState>(this) {
                    /* class com.p2082ss.android.ugc.aweme.badge.EditProfileBadgeViewModel.C34417b.C344181 */

                    /* renamed from: a */
                    final /* synthetic */ C34417b f81345a;

                    static {
                        Covode.recordClassIndex(41366);
                    }

                    {
                        this.f81345a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ EditProfileBadgeState invoke(EditProfileBadgeState editProfileBadgeState) {
                        EditProfileBadgeState editProfileBadgeState2 = editProfileBadgeState;
                        C89219l.m154721d(editProfileBadgeState2, "");
                        return editProfileBadgeState2.copy(new C34451k(Integer.valueOf(iVar.status_code), iVar.status_msg, this.f81345a.f81344a.f81342a, iVar.f81412a, false, true));
                    }
                });
                return;
            }
            this.f81344a.mo33689c(new AbstractC89172b<EditProfileBadgeState, EditProfileBadgeState>(this) {
                /* class com.p2082ss.android.ugc.aweme.badge.EditProfileBadgeViewModel.C34417b.C344192 */

                /* renamed from: a */
                final /* synthetic */ C34417b f81347a;

                static {
                    Covode.recordClassIndex(41367);
                }

                {
                    this.f81347a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ EditProfileBadgeState invoke(EditProfileBadgeState editProfileBadgeState) {
                    EditProfileBadgeState editProfileBadgeState2 = editProfileBadgeState;
                    C89219l.m154721d(editProfileBadgeState2, "");
                    return editProfileBadgeState2.copy(new C34451k(this.f81347a.f81344a.f81342a, false, 11));
                }
            });
        }
    }
}
