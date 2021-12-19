package com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2644b;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.dialog.C23013a;
import com.bytedance.tux.dialog.C23023b;
import com.bytedance.tux.dialog.internal.AbstractDialogInterfaceC23060a;
import com.bytedance.tux.dialog.p1712a.C23019c;
import com.bytedance.tux.dialog.p1713b.C23024a;
import com.bytedance.tux.dialog.p1713b.C23025b;
import com.bytedance.tux.dialog.p1713b.C23028c;
import com.p2082ss.android.ugc.aweme.compliance.api.model.AppealStatusResponse;
import com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39233d;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.api.AppealApi;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c.AbstractC39336b;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.p2645c.C39335a;
import com.p2082ss.android.ugc.aweme.compliance.business.banappeal.viewmodel.NewAppealDialogViewModel;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.b */
public final class C39326b implements AbstractC39233d {

    /* renamed from: a */
    DialogInterface f92831a;

    /* renamed from: b */
    boolean f92832b;

    /* renamed from: c */
    final Activity f92833c;

    /* renamed from: d */
    private boolean f92834d;

    /* renamed from: e */
    private final NewAppealDialogViewModel f92835e;

    static {
        Covode.recordClassIndex(47006);
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39233d
    /* renamed from: b */
    public final void mo68118b() {
        this.f92834d = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39233d
    /* renamed from: a */
    public final boolean mo68117a() {
        return this.f92834d;
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39233d
    /* renamed from: c */
    public final boolean mo68119c() {
        return this.f92832b;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.b$a */
    static final class C39327a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39326b f92836a;

        static {
            Covode.recordClassIndex(47007);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39327a(C39326b bVar) {
            super(0);
            this.f92836a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            this.f92836a.f92832b = true;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39233d
    /* renamed from: e */
    public final boolean mo68121e() {
        DialogInterface dialogInterface = this.f92831a;
        if (!(dialogInterface instanceof C23013a)) {
            return false;
        }
        Objects.requireNonNull(dialogInterface, "null cannot be cast to non-null type com.bytedance.tux.dialog.TuxDialog");
        return ((C23013a) dialogInterface).f54483c.isShowing();
    }

    @Override // com.p2082ss.android.ugc.aweme.compliance.api.p2639c.AbstractC39233d
    /* renamed from: d */
    public final void mo68120d() {
        NewAppealDialogViewModel newAppealDialogViewModel;
        AbstractC88979t<R> d;
        this.f92834d = false;
        if (!this.f92833c.isFinishing() && !mo68121e() && (this.f92833c instanceof ActivityC0945e) && (newAppealDialogViewModel = this.f92835e) != null) {
            newAppealDialogViewModel.f92891a.observe((AbstractC1204m) this.f92833c, new C39331c(this));
            NewAppealDialogViewModel newAppealDialogViewModel2 = this.f92835e;
            AbstractC88412b bVar = newAppealDialogViewModel2.f92893c;
            if (bVar != null && !bVar.isDisposed()) {
                bVar.dispose();
            }
            int appealType = newAppealDialogViewModel2.f92895e.getAppealType();
            if (appealType == 12) {
                d = AppealApi.C39318a.f92809a.apiUserInfo(1, 0).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143292d(NewAppealDialogViewModel.C39361j.f92911a);
                C89219l.m154716b(d, "");
            } else if (appealType != 102) {
                d = AbstractC88979t.m154310b((Object) true);
                C89219l.m154716b(d, "");
            } else {
                d = AbstractC88979t.m154310b((Object) true);
                C89219l.m154716b(d, "");
            }
            newAppealDialogViewModel2.f92893c = d.mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new NewAppealDialogViewModel.C39362k(newAppealDialogViewModel2), new NewAppealDialogViewModel.C39363l(newAppealDialogViewModel2));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.b$b */
    static final class C39328b extends AbstractC89220m implements AbstractC89172b<C23025b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C39326b f92837a;

        /* renamed from: b */
        final /* synthetic */ AbstractC39336b.C39338b f92838b;

        static {
            Covode.recordClassIndex(47008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39328b(C39326b bVar, AbstractC39336b.C39338b bVar2) {
            super(1);
            this.f92837a = bVar;
            this.f92838b = bVar2;
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.b$b$a */
        static final class C39329a extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C39328b f92839a;

            /* renamed from: b */
            final /* synthetic */ C23025b f92840b;

            static {
                Covode.recordClassIndex(47009);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39329a(C39328b bVar, C23025b bVar2) {
                super(1);
                this.f92839a = bVar;
                this.f92840b = bVar2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                C89219l.m154721d(aVar, "");
                DialogInterface dialogInterface = this.f92839a.f92837a.f92831a;
                if (dialogInterface != null) {
                    this.f92839a.f92838b.f92860d.f92851b.invoke(dialogInterface, 0);
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.b$b$b */
        static final class C39330b extends AbstractC89220m implements AbstractC89172b<C23024a, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C39328b f92841a;

            /* renamed from: b */
            final /* synthetic */ C23025b f92842b;

            static {
                Covode.recordClassIndex(47010);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39330b(C39328b bVar, C23025b bVar2) {
                super(1);
                this.f92841a = bVar;
                this.f92842b = bVar2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C23024a aVar) {
                C89219l.m154721d(aVar, "");
                DialogInterface dialogInterface = this.f92841a.f92837a.f92831a;
                if (dialogInterface != null) {
                    this.f92841a.f92838b.f92861e.f92851b.invoke(dialogInterface, 0);
                }
                return C89391z.f203057a;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23025b bVar) {
            String str;
            String str2;
            C23025b bVar2 = bVar;
            C89219l.m154721d(bVar2, "");
            C39335a aVar = this.f92838b.f92860d;
            if (!(aVar == null || (str2 = aVar.f92850a) == null)) {
                bVar2.mo37417a(str2, new C39329a(this, bVar2));
            }
            C39335a aVar2 = this.f92838b.f92861e;
            if (!(aVar2 == null || (str = aVar2.f92850a) == null)) {
                bVar2.mo37419b(str, new C39330b(this, bVar2));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.banappeal.b.b$c */
    static final class C39331c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C39326b f92843a;

        static {
            Covode.recordClassIndex(47011);
        }

        C39331c(C39326b bVar) {
            this.f92843a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC39336b.C39338b bVar = (AbstractC39336b.C39338b) obj;
            C39326b bVar2 = this.f92843a;
            C89219l.m154716b(bVar, "");
            C23023b c = new C23023b(bVar2.f92833c).mo37411b(bVar.f92857a).mo37413d(bVar.f92858b);
            C39332c cVar = new C39332c(bVar2.f92833c, (byte) 0);
            if (bVar.f92859c != null) {
                cVar.mo68756a(bVar.f92859c.f92866a, bVar.f92859c.f92867b, bVar.f92859c.f92868c);
            }
            C23013a a = C23028c.m43435a(C23019c.m43408a(c, cVar), new C39328b(bVar2, bVar)).mo37405a();
            a.mo37395a();
            bVar2.f92831a = a;
            AbstractC89171a<C89391z> aVar = bVar.f92863g;
            if (aVar != null) {
                aVar.invoke();
            }
            DialogInterface dialogInterface = this.f92843a.f92831a;
            Objects.requireNonNull(dialogInterface, "null cannot be cast to non-null type com.bytedance.tux.dialog.TuxDialog");
            ((AbstractDialogInterfaceC23060a) dialogInterface).mo37396b().show();
        }
    }

    public C39326b(Activity activity, AppealStatusResponse appealStatusResponse) {
        NewAppealDialogViewModel newAppealDialogViewModel;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(appealStatusResponse, "");
        this.f92833c = activity;
        if (activity instanceof ActivityC0945e) {
            newAppealDialogViewModel = new NewAppealDialogViewModel(activity, appealStatusResponse, new C39327a(this));
        } else {
            newAppealDialogViewModel = null;
        }
        this.f92835e = newAppealDialogViewModel;
    }
}
