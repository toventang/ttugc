package com.p2082ss.android.ugc.aweme.profile.widgets.common;

import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1182af;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.assem.arch.core.C12752d;
import com.bytedance.assem.arch.core.C12753e;
import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.service.AbstractC12799b;
import com.bytedance.assem.arch.service.C12801d;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.assem.arch.viewModel.C12814b;
import com.bytedance.assem.jedi_vm.viewModel.C12874b;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3581v2.AbstractC64313x;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.MineProfileInfoVM;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.b */
public final class C64574b extends AbstractC64593h {

    /* renamed from: l */
    private final C12814b f146295l;

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.b$b */
    public static final class C64576b extends AbstractC89220m implements AbstractC89172b<C64590e, C64590e> {
        public static final C64576b INSTANCE = new C64576b();

        static {
            Covode.recordClassIndex(76042);
        }

        public C64576b() {
            super(1);
        }

        public final C64590e invoke(C64590e eVar) {
            C89219l.m154719c(eVar, "");
            return eVar;
        }
    }

    static {
        Covode.recordClassIndex(76040);
    }

    /* renamed from: v */
    public final MineProfileInfoVM mo104144v() {
        return (MineProfileInfoVM) this.f146295l.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64593h
    /* renamed from: w */
    public final String mo104145w() {
        return "personal_homepage";
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.b$d */
    public static final class C64578d extends AbstractC89220m implements AbstractC89171a<AbstractC12748a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146297a;

        static {
            Covode.recordClassIndex(76044);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64578d(AbstractC12748a aVar) {
            super(0);
            this.f146297a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final AbstractC12748a invoke() {
            return this.f146297a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.b$c */
    public static final class C64577c extends AbstractC89220m implements AbstractC89171a<C12874b<C64590e>> {
        public static final C64577c INSTANCE = new C64577c();

        static {
            Covode.recordClassIndex(76043);
        }

        public C64577c() {
            super(0);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12874b<C64590e> invoke() {
            return new C12874b<>();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.b$e */
    public static final class C64579e extends AbstractC89220m implements AbstractC89171a<C1182af> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146298a;

        static {
            Covode.recordClassIndex(76045);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64579e(AbstractC12748a aVar) {
            super(0);
            this.f146298a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1182af invoke() {
            return this.f146298a.getViewModelStore();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.b$f */
    public static final class C64580f extends AbstractC89220m implements AbstractC89171a<C1175ad.AbstractC1177b> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146299a;

        static {
            Covode.recordClassIndex(76046);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64580f(AbstractC12748a aVar) {
            super(0);
            this.f146299a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C1175ad.AbstractC1177b invoke() {
            return this.f146299a.mo20598q();
        }
    }

    /* Return type fixed from 'com.bytedance.assem.arch.service.a' to match base method */
    @Override // com.bytedance.assem.arch.service.AbstractC12799b
    /* renamed from: e */
    public final /* synthetic */ C64615i mo20658e() {
        return new C64615i();
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.b$g */
    public static final class C64581g extends AbstractC89220m implements AbstractC89171a<C12752d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146300a;

        static {
            Covode.recordClassIndex(76047);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64581g(AbstractC12748a aVar) {
            super(0);
            this.f146300a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12752d invoke() {
            return this.f146300a.bD_().f30984f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.b$h */
    public static final class C64582h extends AbstractC89220m implements AbstractC89171a<C12753e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC12748a f146301a;

        static {
            Covode.recordClassIndex(76048);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64582h(AbstractC12748a aVar) {
            super(0);
            this.f146301a = aVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final C12753e invoke() {
            return this.f146301a.bD_().f30985g;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.b$a */
    public static final class C64575a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f146296a;

        static {
            Covode.recordClassIndex(76041);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64575a(AbstractC89277c cVar) {
            super(0);
            this.f146296a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            return "assem_" + C89170a.m154665a(this.f146296a).getName();
        }
    }

    public C64574b() {
        AbstractC89277c a = C89204ab.m154669a(MineProfileInfoVM.class);
        this.f146295l = new C12814b(a, new C64575a(a), C64577c.INSTANCE, new C64578d(this), new C64579e(this), new C64580f(this), C64576b.INSTANCE, new C64581g(this), new C64582h(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.b$k */
    static final class C64586k extends AbstractC89220m implements AbstractC89172b<C64615i, C64615i> {

        /* renamed from: a */
        final /* synthetic */ User f146305a;

        /* renamed from: b */
        final /* synthetic */ EnumC64592g f146306b;

        static {
            Covode.recordClassIndex(76052);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64586k(User user, EnumC64592g gVar) {
            super(1);
            this.f146305a = user;
            this.f146306b = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C64615i invoke(C64615i iVar) {
            C64615i iVar2 = iVar;
            if (iVar2 != null) {
                return C64615i.m116529a(iVar2, this.f146305a, new C12776a(this.f146305a), false, null, this.f146306b, 12);
            }
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64593h, com.bytedance.assem.arch.core.AbstractC12766p
    /* renamed from: b */
    public final void mo20630b(View view) {
        C89219l.m154721d(view, "");
        super.mo20630b(view);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        AbstractC64616j.C64617a.m116532a(this, g.getCurUser(), null, false, 6);
        AssemViewModel.m23030a(mo104144v(), C64587c.f146307a, null, new C64585j(this), null, new C64583i(this), 10);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.b$i */
    static final class C64583i extends AbstractC89220m implements AbstractC89172b<User, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64574b f146302a;

        static {
            Covode.recordClassIndex(76049);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64583i(C64574b bVar) {
            super(1);
            this.f146302a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(User user) {
            User user2 = user;
            final C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = (T) EnumC64592g.NORMAL;
            C64574b.m22977a(this.f146302a.mo104144v(), new AbstractC89172b<C64590e, C89391z>() {
                /* class com.p2082ss.android.ugc.aweme.profile.widgets.common.C64574b.C64583i.C645841 */

                static {
                    Covode.recordClassIndex(76050);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(C64590e eVar) {
                    C64590e eVar2 = eVar;
                    C89219l.m154721d(eVar2, "");
                    eVar.element = (T) eVar2.f146310b;
                    return C89391z.f203057a;
                }
            });
            SpringLayout springLayout = this.f146302a.f146312j;
            if (springLayout != null) {
                springLayout.setRefreshing(false);
            }
            if (user2 != null) {
                AbstractC64616j.C64617a.m116532a(this.f146302a, user2, eVar.element, false, 4);
                ((AbstractC64313x) C12801d.m23018a(this.f146302a, C89204ab.m154669a(AbstractC64313x.class))).mo103793b(user2);
                ((AbstractC64313x) C12801d.m23018a(this.f146302a, C89204ab.m154669a(AbstractC64313x.class))).mo103792a(user2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.widgets.common.b$j */
    static final class C64585j extends AbstractC89220m implements AbstractC89172b<Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C64574b f146304a;

        static {
            Covode.recordClassIndex(76051);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C64585j(C64574b bVar) {
            super(1);
            this.f146304a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Throwable th) {
            Throwable th2 = th;
            C89219l.m154721d(th2, "");
            SpringLayout springLayout = this.f146304a.f146312j;
            if (springLayout != null) {
                springLayout.setRefreshing(false);
            }
            if (th2 instanceof C34485a) {
                C34485a aVar = (C34485a) th2;
                int errorCode = aVar.getErrorCode();
                if (!(TextUtils.isEmpty(aVar.getErrorMsg()) || this.f146304a.az_() == null || errorCode == 3070 || errorCode == 3071 || errorCode == 3072)) {
                    new C79459a(this.f146304a.az_()).mo123052a(aVar.getErrorMsg()).mo123053a();
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j
    /* renamed from: a */
    public final void mo104142a(int i, EnumC64592g gVar) {
        C89219l.m154721d(gVar, "");
        MineProfileInfoVM v = mo104144v();
        C89219l.m154721d(gVar, "");
        AbstractC89568bz unused = C89624i.m155555a(v.aP_(), null, null, new MineProfileInfoVM.C64564a(v, i, gVar, null), 3);
    }

    @Override // com.p2082ss.android.ugc.aweme.profile.widgets.common.AbstractC64616j
    /* renamed from: a */
    public final void mo104143a(User user, EnumC64592g gVar, boolean z) {
        C89219l.m154721d(gVar, "");
        if (user != null) {
            C64586k kVar = new C64586k(user, gVar);
            Class<C64574b> cls = C64574b.class;
            Class<?>[] interfaces = cls.getInterfaces();
            C89219l.m154709a((Object) interfaces, "");
            ArrayList arrayList = new ArrayList();
            for (Class<?> cls2 : interfaces) {
                if (AbstractC12799b.class.isAssignableFrom(cls2)) {
                    arrayList.add(cls2);
                }
            }
            while (true) {
                ArrayList arrayList2 = arrayList;
                if (arrayList2.isEmpty()) {
                    cls = cls.getSuperclass();
                    if (cls != null) {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        C89219l.m154709a((Object) interfaces2, "");
                        arrayList = new ArrayList();
                        for (Class<?> cls3 : interfaces2) {
                            if (AbstractC12799b.class.isAssignableFrom(cls3)) {
                                arrayList.add(cls3);
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    C12753e eVar = bD_().f30985g;
                    Object f = C89070n.m154579f((List) arrayList2);
                    if (f != null) {
                        eVar.mo20613a((Class) f, kVar);
                        return;
                    }
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
    }
}
