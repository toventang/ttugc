package com.p2082ss.android.ugc.aweme.account.p2251j;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.sdk.p1625a.p1626a.AbstractC22329e;
import com.bytedance.sdk.p1625a.p1626a.p1628b.AbstractC22301g;
import com.bytedance.sdk.p1625a.p1626a.p1630d.C22324k;
import com.bytedance.sdk.p1625a.p1643f.C22374d;
import com.bytedance.sdk.p1625a.p1663n.C22507a;
import com.p2082ss.android.ugc.aweme.AbstractC35326bx;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.C81775y;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31604d;
import com.p2082ss.android.ugc.aweme.account.login.C31975q;
import com.p2082ss.android.ugc.aweme.account.p2250i.C31688b;
import com.p2082ss.android.ugc.aweme.account.p2273m.C32842e;
import com.p2082ss.android.ugc.aweme.account.util.C33052u;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.p2232ac.C31366b;
import java.util.List;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.j.a */
public final class C31692a {

    /* renamed from: a */
    static final boolean f75802a = false;

    /* renamed from: b */
    static int f75803b = -1;

    /* renamed from: c */
    static List<String> f75804c;

    /* renamed from: d */
    public static String f75805d = "";

    /* renamed from: e */
    public static final C31692a f75806e = new C31692a();

    /* renamed from: f */
    private static final AbstractC89244h f75807f = C89250i.m154773a((AbstractC89171a) C31698d.f75821a);

    /* renamed from: g */
    private static final AbstractC89244h f75808g = C89250i.m154773a((AbstractC89171a) C31693a.f75809a);

    /* renamed from: a */
    public static IAccountUserService m66023a() {
        return (IAccountUserService) f75807f.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.j.a$c */
    public static final class C31697c implements AbstractC35326bx {
        static {
            Covode.recordClassIndex(38431);
        }

        C31697c() {
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC35326bx
        /* renamed from: a */
        public final void mo57675a() {
            C31692a.m66025b();
        }

        @Override // com.p2082ss.android.ugc.aweme.AbstractC35326bx
        /* renamed from: a */
        public final void mo57676a(Integer num, String str) {
            C31692a.m66025b();
            C31366b bVar = new C31366b(false);
            C89219l.m154721d(bVar, "");
            Bundle bundle = new Bundle();
            C36085cj.m73551e();
            C81775y.m141657a(bundle, bVar);
        }
    }

    private C31692a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.j.a$a */
    static final class C31693a extends AbstractC89220m implements AbstractC89171a<AbstractC22329e> {

        /* renamed from: a */
        public static final C31693a f75809a = new C31693a();

        static {
            Covode.recordClassIndex(38427);
        }

        C31693a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC22329e invoke() {
            return C22374d.m42169a(C31291a.f74991a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.j.a$d */
    static final class C31698d extends AbstractC89220m implements AbstractC89171a<IAccountUserService> {

        /* renamed from: a */
        public static final C31698d f75821a = new C31698d();

        static {
            Covode.recordClassIndex(38432);
        }

        C31698d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAccountUserService invoke() {
            return C36085cj.f85262b.mo57069e();
        }
    }

    /* renamed from: b */
    public static void m66025b() {
        f75804c = null;
        f75803b = -1;
        f75805d = "";
    }

    /* renamed from: com.ss.android.ugc.aweme.account.j.a$b */
    public static final class C31694b extends AbstractC22301g {

        /* renamed from: c */
        final /* synthetic */ Bundle f75810c;

        /* renamed from: d */
        final /* synthetic */ AbstractC35326bx f75811d;

        /* renamed from: e */
        final /* synthetic */ String f75812e;

        /* renamed from: f */
        final /* synthetic */ boolean f75813f;

        /* renamed from: g */
        final /* synthetic */ Bundle f75814g;

        static {
            Covode.recordClassIndex(38428);
        }

        /* renamed from: com.ss.android.ugc.aweme.account.j.a$b$a */
        public static final class C31695a implements AbstractC34543f {

            /* renamed from: a */
            final /* synthetic */ C31694b f75815a;

            /* renamed from: b */
            final /* synthetic */ int f75816b;

            /* renamed from: c */
            final /* synthetic */ AbstractC89171a f75817c;

            static {
                Covode.recordClassIndex(38429);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: a */
            public final void mo57673a() {
                C31692a.m66024a(this.f75815a.f75812e, this.f75815a.f75814g, this.f75815a.f75813f, false, this.f75815a.f75811d);
            }

            @Override // com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f
            /* renamed from: b */
            public final void mo57674b() {
                if (this.f75816b == 1364) {
                    C31692a.m66024a(this.f75815a.f75812e, this.f75815a.f75814g, this.f75815a.f75813f, true, this.f75815a.f75811d);
                } else {
                    this.f75817c.invoke();
                }
            }

            C31695a(C31694b bVar, int i, AbstractC89171a aVar) {
                this.f75815a = bVar;
                this.f75816b = i;
                this.f75817c = aVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.account.j.a$b$b */
        static final class C31696b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C31694b f75818a;

            /* renamed from: b */
            final /* synthetic */ int f75819b;

            /* renamed from: c */
            final /* synthetic */ C22324k f75820c;

            static {
                Covode.recordClassIndex(38430);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C31696b(C31694b bVar, int i, C22324k kVar) {
                super(0);
                this.f75818a = bVar;
                this.f75819b = i;
                this.f75820c = kVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                String str = null;
                C36085cj.m73546a(false, null);
                AbstractC35326bx bxVar = this.f75818a.f75811d;
                if (bxVar == null) {
                    return null;
                }
                Integer valueOf = Integer.valueOf(this.f75819b);
                C22324k kVar = this.f75820c;
                if (kVar != null) {
                    str = kVar.f52717f;
                }
                bxVar.mo57676a(valueOf, str);
                return C89391z.f203057a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b] */
        @Override // com.bytedance.sdk.p1625a.AbstractC22346c
        /* renamed from: e */
        public final /* synthetic */ void mo36686e(C22324k kVar) {
            C22507a aVar;
            C22324k kVar2 = kVar;
            if (kVar2 != null) {
                aVar = kVar2.f52724j;
            } else {
                aVar = null;
            }
            C36085cj.m73542a(aVar);
            Bundle bundle = this.f75810c;
            if (bundle == null) {
                C89219l.m154716b(C1731i.m5632a(new Exception("Bundle is empty")), "");
            } else {
                C89219l.m154716b(C33052u.m67700a(bundle).mo5537b(new C31604d.C31612g(bundle)).mo5537b(new C31604d.C31613h(bundle)).mo5537b(new C31604d.C31614i(C36085cj.f85262b.mo57069e(), bundle)), "");
            }
            C31688b.m66016b();
            C32842e.C32843a.m67419a(0, (Integer) 0, "");
            AbstractC35326bx bxVar = this.f75811d;
            if (bxVar != null) {
                bxVar.mo57675a();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.sdk.a.a.a.b, int] */
        @Override // com.bytedance.sdk.p1625a.AbstractC22346c
        /* renamed from: a */
        public final /* synthetic */ void mo36681a(C22324k kVar, int i) {
            Integer num;
            String str;
            Integer num2;
            String str2;
            String str3;
            C22324k kVar2 = kVar;
            if (i == 1 || i == 4) {
                long currentTimeMillis = System.currentTimeMillis();
                C31975q.m66348a(this.f75812e, currentTimeMillis, false);
                C31975q.m66355b(this.f75812e, currentTimeMillis);
                C31975q.m66345a(C36085cj.f85262b.mo57069e().findSignificanUserInfo(this.f75812e));
                C31692a.m66023a().delete(this.f75812e, "switch error:1|4");
            }
            String str4 = null;
            if (kVar2 != null) {
                num = Integer.valueOf(kVar2.f52715d);
                str = kVar2.f52717f;
            } else {
                num = null;
                str = null;
            }
            C31688b.m66014a(num, str);
            if (kVar2 != null) {
                num2 = Integer.valueOf(kVar2.f52715d);
            } else {
                num2 = null;
            }
            StringBuilder sb = new StringBuilder();
            if (kVar2 != null) {
                str2 = kVar2.f52717f;
            } else {
                str2 = null;
            }
            StringBuilder append = sb.append(str2).append('|');
            if (kVar2 != null) {
                str3 = kVar2.f52718g;
            } else {
                str3 = null;
            }
            C32842e.C32843a.m67419a(1, num2, append.append(str3).toString());
            if (C31692a.f75804c != null && this.f75813f) {
                int i2 = C31692a.f75803b - 1;
                C31692a.f75803b = i2;
                if (i2 >= 0) {
                    List<String> list = C31692a.f75804c;
                    if (list == null) {
                        C89219l.m154715b();
                    }
                    C31692a.m66024a(list.get(C31692a.f75803b), this.f75814g, true, false, this.f75811d);
                    return;
                }
            }
            C31696b bVar = new C31696b(this, i, kVar2);
            if (i == 1349 || i == 1364) {
                Activity j = C17873f.m33102j();
                if (kVar2 != null) {
                    str4 = kVar2.f52717f;
                }
                C31706f.m66037a(j, str4, new C31695a(this, i, bVar), "settings_page", "switch_account_bind");
                return;
            }
            bVar.invoke();
        }

        C31694b(Bundle bundle, AbstractC35326bx bxVar, String str, boolean z, Bundle bundle2) {
            this.f75810c = bundle;
            this.f75811d = bxVar;
            this.f75812e = str;
            this.f75813f = z;
            this.f75814g = bundle2;
        }
    }

    static {
        Covode.recordClassIndex(38426);
    }

    /* renamed from: a */
    public static final void m66024a(String str, Bundle bundle, boolean z, boolean z2, AbstractC35326bx bxVar) {
        Bundle bundle2;
        String str2;
        String str3;
        if (str != null && str.length() != 0) {
            IAccountUserService a = m66023a();
            C89219l.m154716b(a, "");
            if (!C89361p.m154872a(str, a.getCurUserId(), true)) {
                if (bundle == null) {
                    bundle2 = new Bundle();
                } else {
                    bundle2 = bundle;
                }
                IAccountUserService a2 = m66023a();
                C89219l.m154716b(a2, "");
                if (a2.isLogin()) {
                    IAccountUserService a3 = m66023a();
                    C89219l.m154716b(a3, "");
                    str2 = a3.getCurUserId();
                } else {
                    str2 = f75805d;
                }
                bundle2.putString("previous_uid", str2);
                AbstractC22329e eVar = (AbstractC22329e) f75808g.getValue();
                if (z2) {
                    str3 = "1";
                } else {
                    str3 = "0";
                }
                eVar.mo36656a(str, C89041ag.m154412a(new C89378p("force_switch", str3)), (AbstractC22301g) new C31694b(bundle2, bxVar, str, z, bundle));
            }
        }
    }
}
