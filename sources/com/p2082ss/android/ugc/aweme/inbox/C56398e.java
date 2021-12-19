package com.p2082ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.inbox.p3267b.C56318b;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.e */
public final class C56398e {

    /* renamed from: a */
    public static final C56398e f128640a = new C56398e();

    /* renamed from: b */
    private static C56399a f128641b;

    private C56398e() {
    }

    static {
        Covode.recordClassIndex(66218);
    }

    /* renamed from: com.ss.android.ugc.aweme.inbox.e$a */
    public static final class C56399a {

        /* renamed from: a */
        final AbstractC89244h f128642a = C89250i.m154773a((AbstractC89171a) new C56401b(this));

        /* renamed from: b */
        final AbstractC89244h f128643b = C89250i.m154773a((AbstractC89171a) new C56402c(this));

        /* renamed from: c */
        public final String f128644c;

        /* renamed from: d */
        private final AbstractC89244h f128645d = C89250i.m154773a((AbstractC89171a) new C56403d(this));

        /* renamed from: e */
        private final AbstractC89244h f128646e = C89250i.m154773a((AbstractC89171a) new C56400a(this));

        static {
            Covode.recordClassIndex(66219);
        }

        /* renamed from: a */
        public final Keva mo93387a() {
            return (Keva) this.f128645d.getValue();
        }

        /* renamed from: d */
        public final boolean mo93391d() {
            return ((Boolean) this.f128646e.getValue()).booleanValue();
        }

        /* renamed from: b */
        public final void mo93389b() {
            mo93387a().storeInt("enter_inbox_times", 0);
            mo93387a().storeLong("enter_inbox_limit_start", 0);
        }

        /* renamed from: c */
        public final void mo93390c() {
            mo93387a().storeInt("expand_times", mo93387a().getInt("expand_times", 0) + 1);
        }

        /* renamed from: com.ss.android.ugc.aweme.inbox.e$a$a */
        static final class C56400a extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C56399a f128647a;

            static {
                Covode.recordClassIndex(66220);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C56400a(C56399a aVar) {
                super(0);
                this.f128647a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                boolean z;
                if (((Boolean) this.f128647a.f128642a.getValue()).booleanValue() || ((Boolean) this.f128647a.f128643b.getValue()).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.inbox.e$a$d */
        static final class C56403d extends AbstractC89220m implements AbstractC89171a<Keva> {

            /* renamed from: a */
            final /* synthetic */ C56399a f128650a;

            static {
                Covode.recordClassIndex(66223);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C56403d(C56399a aVar) {
                super(0);
                this.f128650a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Keva invoke() {
                return Keva.getRepo(("inbox_collapse_" + C56318b.m102310a() + "_") + this.f128650a.f128644c);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.inbox.e$a$b */
        static final class C56401b extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C56399a f128648a;

            static {
                Covode.recordClassIndex(66221);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C56401b(C56399a aVar) {
                super(0);
                this.f128648a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                int i;
                boolean z = true;
                if (System.currentTimeMillis() - this.f128648a.mo93387a().getLong("enter_inbox_limit_start", 0) >= ((long) C56511t.m102471a().f128745a.f128697b) * 86400000 && (i = this.f128648a.mo93387a().getInt("enter_inbox_limit_times", 0)) < C56511t.m102471a().f128745a.f128698c) {
                    if (this.f128648a.mo93387a().getInt("enter_inbox_times", 0) >= C56511t.m102471a().f128745a.f128696a) {
                        this.f128648a.mo93387a().storeLong("enter_inbox_limit_start", System.currentTimeMillis());
                        this.f128648a.mo93387a().storeInt("enter_inbox_times", 0);
                        this.f128648a.mo93387a().storeInt("enter_inbox_limit_times", i + 1);
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.inbox.e$a$c */
        static final class C56402c extends AbstractC89220m implements AbstractC89171a<Boolean> {

            /* renamed from: a */
            final /* synthetic */ C56399a f128649a;

            static {
                Covode.recordClassIndex(66222);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C56402c(C56399a aVar) {
                super(0);
                this.f128649a = aVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ Boolean invoke() {
                int i;
                boolean z = true;
                if (System.currentTimeMillis() - this.f128649a.mo93387a().getLong("expand_limit_start", 0) >= ((long) C56511t.m102471a().f128746b.f128697b) * 86400000 && (i = this.f128649a.mo93387a().getInt("expand_limit_times", 0)) < C56511t.m102471a().f128746b.f128698c) {
                    if (this.f128649a.mo93387a().getInt("expand_times", 0) >= C56511t.m102471a().f128746b.f128696a) {
                        this.f128649a.mo93387a().storeLong("expand_limit_start", System.currentTimeMillis());
                        this.f128649a.mo93387a().storeInt("expand_times", 0);
                        this.f128649a.mo93387a().storeInt("expand_limit_times", i + 1);
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            }
        }

        public C56399a(String str) {
            C89219l.m154721d(str, "");
            this.f128644c = str;
        }

        /* renamed from: a */
        public final void mo93388a(boolean z, boolean z2) {
            if (z && z2) {
                mo93387a().storeInt("enter_inbox_times", mo93387a().getInt("enter_inbox_times", 0) + 1);
            }
        }
    }

    /* renamed from: a */
    public static void m102366a() {
        C56404b bVar = C56404b.f128651a;
        C89219l.m154721d(bVar, "");
        if (C56318b.m102311b() || C56318b.m102312c()) {
            bVar.invoke(m102367b());
        }
    }

    /* renamed from: b */
    public static C56399a m102367b() {
        String str;
        String uid;
        IAccountUserService g = C31575b.m65865g();
        String str2 = "";
        C89219l.m154716b(g, str2);
        User curUser = g.getCurUser();
        if (!(curUser == null || (uid = curUser.getUid()) == null)) {
            str2 = uid;
        }
        C56399a aVar = f128641b;
        if (aVar != null) {
            str = aVar.f128644c;
        } else {
            str = null;
        }
        if (!C89219l.m154714a((Object) str, (Object) str2)) {
            f128641b = new C56399a(str2);
        }
        C56399a aVar2 = f128641b;
        if (aVar2 == null) {
            C89219l.m154715b();
        }
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.inbox.e$b */
    public static final class C56404b extends AbstractC89220m implements AbstractC89172b<C56399a, C89391z> {

        /* renamed from: a */
        public static final C56404b f128651a = new C56404b();

        static {
            Covode.recordClassIndex(66224);
        }

        C56404b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C56399a aVar) {
            final C56399a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            C1731i.m5640b(new Callable() {
                /* class com.p2082ss.android.ugc.aweme.inbox.C56398e.C56404b.CallableC564051 */

                static {
                    Covode.recordClassIndex(66225);
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    aVar2.mo93391d();
                    return C89391z.f203057a;
                }
            }, C1731i.f5562a);
            return C89391z.f203057a;
        }
    }
}
