package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.p1625a.p1642e.C22359a;
import com.p2082ss.android.ugc.aweme.C36085cj;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractC32572b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.p2272a.C32634g;
import com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32853e;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.user.C80061e;
import java.util.HashMap;
import org.p4663a.AbstractC90213b;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.AbstractC88955l;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4592m.AbstractC88971a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.ad */
public final class C32360ad {

    /* renamed from: a */
    public AbstractC88412b f77184a;

    /* renamed from: b */
    private AbstractC88971a<C32380d> f77185b;

    /* renamed from: c */
    private final AbstractC89244h f77186c = C89250i.m154773a((AbstractC89171a) C32361a.f77189a);

    /* renamed from: d */
    private final AbstractC89244h f77187d = C89250i.m154773a((AbstractC89171a) C32362b.f77190a);

    /* renamed from: e */
    private final AbstractC88434g<String, AbstractC90213b<C32380d>> f77188e = C32367f.f77196a;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.ad$d */
    public static final class C32365d<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C32365d f77194a = new C32365d();

        static {
            Covode.recordClassIndex(39133);
        }

        C32365d() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.ad$e */
    public static final class C32366e<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C32366e f77195a = new C32366e();

        static {
            Covode.recordClassIndex(39134);
        }

        C32366e() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(39128);
    }

    /* renamed from: c */
    private final HashMap<String, String> m66728c() {
        return (HashMap) this.f77186c.getValue();
    }

    /* renamed from: a */
    public final HashMap<String, String> mo58410a() {
        return (HashMap) this.f77187d.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.ad$a */
    static final class C32361a extends AbstractC89220m implements AbstractC89171a<HashMap<String, String>> {

        /* renamed from: a */
        public static final C32361a f77189a = new C32361a();

        static {
            Covode.recordClassIndex(39129);
        }

        C32361a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, String> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.ad$b */
    static final class C32362b extends AbstractC89220m implements AbstractC89171a<HashMap<String, String>> {

        /* renamed from: a */
        public static final C32362b f77190a = new C32362b();

        static {
            Covode.recordClassIndex(39130);
        }

        C32362b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ HashMap<String, String> invoke() {
            return new HashMap();
        }
    }

    /* renamed from: b */
    public final void mo58412b() {
        AbstractC88971a<C32380d> aVar = this.f77185b;
        if (aVar != null && !aVar.isDisposed()) {
            AbstractC88971a<C32380d> aVar2 = this.f77185b;
            if (aVar2 == null) {
                C89219l.m154715b();
            }
            aVar2.dispose();
        }
        AbstractC88412b bVar = this.f77184a;
        if (bVar != null && !bVar.isDisposed()) {
            AbstractC88412b bVar2 = this.f77184a;
            if (bVar2 == null) {
                C89219l.m154715b();
            }
            bVar2.dispose();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.ad$f */
    static final class C32367f<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C32367f f77196a = new C32367f();

        static {
            Covode.recordClassIndex(39135);
        }

        C32367f() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C89219l.m154721d(str, "");
            return new AbstractC90213b() {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32360ad.C32367f.C323681 */

                static {
                    Covode.recordClassIndex(39136);
                }

                @Override // org.p4663a.AbstractC90213b
                /* renamed from: a_ */
                public final void mo57509a_(AbstractC90214c<? super C32380d> cVar) {
                    Object a = NetworkProxyAccount.f78256b.mo58679a().mo46670a(str, (Class) C32380d.class);
                    if (a == null) {
                        a = new C32380d();
                    }
                    cVar.onNext(a);
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.ad$c */
    public static final class C32363c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ String f77191a;

        /* renamed from: b */
        final /* synthetic */ AbstractC32572b f77192b;

        static {
            Covode.recordClassIndex(39131);
        }

        public C32363c(String str, AbstractC32572b bVar) {
            this.f77191a = str;
            this.f77192b = bVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            C32382f fVar = (C32382f) obj;
            String str2 = this.f77191a;
            C32381e eVar = fVar.f77220b;
            if (eVar != null) {
                str = eVar.f77218c;
            } else {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                C32381e eVar2 = fVar.f77220b;
                if (eVar2 == null) {
                    C89219l.m154715b();
                }
                str2 = eVar2.f77218c;
                if (str2 == null) {
                    C89219l.m154715b();
                }
            }
            C80061e.f179403k.mo123512b(str2);
            User b = C80061e.f179403k.mo123510b();
            if (b != null) {
                b.setNicknameUpdateReminder(false);
            }
            IAccountUserService e = C36085cj.f85262b.mo57069e();
            C89219l.m154716b(e, "");
            if (!e.isChildrenMode()) {
                C22359a a = C32853e.m67446a();
                if (a == null) {
                    Bundle arguments = this.f77192b.getArguments();
                    if (arguments == null) {
                        C89219l.m154715b();
                    }
                    arguments.putInt("next_page", EnumC32594j.FINISH.getValue());
                    AbstractC32572b bVar = this.f77192b;
                    Bundle arguments2 = bVar.getArguments();
                    if (arguments2 == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(arguments2, "");
                    bVar.mo58461a(arguments2);
                    return;
                }
                Bundle arguments3 = this.f77192b.getArguments();
                if (arguments3 != null) {
                    arguments3.putString("gms_store_platform", C32853e.f78227a);
                }
                C32853e.m67447a(this.f77192b.getActivity(), this.f77192b.getArguments(), new C32853e.AbstractC32854a(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32360ad.C32363c.C323641 */

                    /* renamed from: a */
                    final /* synthetic */ C32363c f77193a;

                    static {
                        Covode.recordClassIndex(39132);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.account.p2274n.C32853e.AbstractC32854a
                    /* renamed from: a */
                    public final void mo57639a() {
                        Bundle arguments = this.f77193a.f77192b.getArguments();
                        if (arguments == null) {
                            C89219l.m154715b();
                        }
                        arguments.putInt("next_page", EnumC32594j.FINISH.getValue());
                        AbstractC32572b bVar = this.f77193a.f77192b;
                        Bundle arguments2 = this.f77193a.f77192b.getArguments();
                        if (arguments2 == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(arguments2, "");
                        bVar.mo58461a(arguments2);
                    }

                    /* JADX WARN: Incorrect args count in method signature: ()V */
                    {
                        this.f77193a = r1;
                    }
                }, a);
                if (C32634g.f77840b) {
                    C39223a.m79605s().mo68679b("email_consent");
                    return;
                }
                return;
            }
            Bundle arguments4 = this.f77192b.getArguments();
            if (arguments4 == null) {
                C89219l.m154715b();
            }
            arguments4.putInt("next_page", EnumC32594j.FINISH.getValue());
            AbstractC32572b bVar2 = this.f77192b;
            Bundle arguments5 = bVar2.getArguments();
            if (arguments5 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(arguments5, "");
            bVar2.mo58461a(arguments5);
        }
    }

    /* renamed from: a */
    public final void mo58411a(String str, AbstractC88971a<C32380d> aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        mo58412b();
        this.f77185b = aVar;
        m66728c().put("unique_id", str);
        NetworkProxyAccount.f78256b.mo58687c("/aweme/v1/unique/id/check/", m66728c()).mo143198a(this.f77188e).mo143195a(C88391a.m153580a(C88392a.f200660a)).mo143201a((AbstractC88955l<? super R>) aVar);
    }
}
