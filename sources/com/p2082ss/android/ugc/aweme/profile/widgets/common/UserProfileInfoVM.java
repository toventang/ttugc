package com.p2082ss.android.ugc.aweme.profile.widgets.common;

import android.text.TextUtils;
import com.bytedance.assem.arch.extensions.C12786i;
import com.bytedance.assem.arch.extensions.C12792n;
import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63762ab;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63804z;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64206ab;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.C64207ac;
import com.p2082ss.android.ugc.aweme.profile.presenter.UserResponse;
import com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b;
import com.p2082ss.android.ugc.aweme.utils.GsonHolder;
import com.p2082ss.android.ugc.aweme.utils.GsonProvider;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM */
public final class UserProfileInfoVM extends AssemViewModel<C64644n> {

    /* renamed from: j */
    public String f146279j;

    /* renamed from: k */
    public String f146280k;

    /* renamed from: l */
    public final AbstractC12644a<AbstractC64647q> f146281l;

    /* renamed from: m */
    private final C12786i f146282m = new C12786i(true, new C64568a(this, null));

    static {
        Covode.recordClassIndex(76033);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C64871b mo23342g() {
        return (C64871b) this.f146282m.getValue();
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    /* renamed from: f */
    public final /* synthetic */ C64644n mo20674f() {
        return new C64644n();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM$a */
    public static final class C64568a extends AbstractC89220m implements AbstractC89171a<C64871b> {

        /* renamed from: a */
        final /* synthetic */ AssemViewModel f146283a;

        /* renamed from: b */
        final /* synthetic */ String f146284b;

        static {
            Covode.recordClassIndex(76034);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64568a(AssemViewModel assemViewModel, String str) {
            super(0);
            this.f146283a = assemViewModel;
            this.f146284b = str;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.profile.widgets.h.a.b, java.lang.Object] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b invoke() {
            /*
                r3 = this;
                com.bytedance.assem.arch.viewModel.AssemViewModel r0 = r3.f146283a
                com.bytedance.assem.arch.core.d r2 = r0.f31150d
                if (r2 == 0) goto L_0x000f
                java.lang.Class<com.ss.android.ugc.aweme.profile.widgets.h.a.b> r1 = com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a.C64871b.class
                java.lang.String r0 = r3.f146284b
                java.lang.Object r0 = r2.mo20606b(r1, r0)
                return r0
            L_0x000f:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM.C64568a.invoke():java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM$c */
    public static final class CallableC64571c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ UserResponse f146290a;

        static {
            Covode.recordClassIndex(76037);
        }

        CallableC64571c(UserResponse userResponse) {
            this.f146290a = userResponse;
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            GsonProvider c = GsonHolder.m138943c();
            C89219l.m154716b(c, "");
            C51423a.m95784a(4, "aweme/v1/user", c.mo123620b().mo46674b(this.f146290a));
            return null;
        }
    }

    /* renamed from: h */
    public final Aweme mo23343h() {
        C64207ac acVar = (C64207ac) C12801d.m23016a(this, C89204ab.m154669a(AbstractC64206ab.class));
        if (acVar != null) {
            return acVar.f145632g;
        }
        return null;
    }

    /* renamed from: i */
    public final User mo104139i() {
        C64615i iVar = (C64615i) C12801d.m23016a(this, C89204ab.m154669a(AbstractC64616j.class));
        if (iVar != null) {
            return iVar.f146329a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final String mo104140j() {
        String str;
        C64207ac acVar = (C64207ac) C12801d.m23016a(this, C89204ab.m154669a(AbstractC64206ab.class));
        if (acVar != null) {
            str = acVar.f145629d;
        } else {
            str = null;
        }
        if (!TextUtils.equals(str, "prop_page") || mo23343h() == null) {
            return str;
        }
        return "prop_page_detail_aweme";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM$d */
    public static final class C64572d extends AbstractC89220m implements AbstractC89172b<C64644n, C64644n> {

        /* renamed from: a */
        final /* synthetic */ User f146291a;

        /* renamed from: b */
        final /* synthetic */ EnumC64592g f146292b;

        static {
            Covode.recordClassIndex(76038);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64572d(User user, EnumC64592g gVar) {
            super(1);
            this.f146291a = user;
            this.f146292b = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64644n invoke(C64644n nVar) {
            C89219l.m154721d(nVar, "");
            return C64644n.m116542a(new C12792n(this.f146291a), this.f146292b);
        }
    }

    public UserProfileInfoVM(AbstractC12644a<AbstractC64647q> aVar) {
        C89219l.m154721d(aVar, "");
        this.f146281l = aVar;
    }

    /* renamed from: a */
    public final void mo104138a(Exception exc) {
        C89219l.m154721d(exc, "");
        C63762ab abVar = C63804z.f144626a;
        if (abVar != null) {
            abVar.mo102327c();
        }
        C33744d a = new C33744d().mo59983a("to_user_id", this.f146279j).mo59983a("enter_from", mo104140j()).mo59980a("is_success", 0).mo59983a("fail_info", exc.getMessage());
        C89219l.m154716b(a, "");
        if (exc instanceof C34485a) {
            a.mo59983a("response", ((C34485a) exc).getResponse());
        }
        Map<String, String> map = a.f79943a;
        C39162r.m79460a("profile_request_response", map);
        C51423a.m95784a(4, "aweme/v1/user", map.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM$b */
    public static final class C64569b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f146285a;

        /* renamed from: b */
        final /* synthetic */ UserProfileInfoVM f146286b;

        /* renamed from: c */
        final /* synthetic */ int f146287c;

        /* renamed from: d */
        final /* synthetic */ EnumC64592g f146288d;

        static {
            Covode.recordClassIndex(76035);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64569b(UserProfileInfoVM userProfileInfoVM, int i, EnumC64592g gVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f146286b = userProfileInfoVM;
            this.f146287c = i;
            this.f146288d = gVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C64569b(this.f146286b, this.f146287c, this.f146288d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C64569b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:73:0x013a A[Catch:{ Exception -> 0x0335 }, RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r25) {
            /*
            // Method dump skipped, instructions count: 840
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM.C64569b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public final void mo104137a(int i, EnumC64592g gVar) {
        C89219l.m154721d(gVar, "");
        AbstractC89568bz unused = C89624i.m155555a(aP_(), null, null, new C64569b(this, i, gVar, null), 3);
    }
}
