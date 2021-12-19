package com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount;
import java.util.HashMap;
import org.p4663a.AbstractC90213b;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.ae */
public final class C32369ae {

    /* renamed from: a */
    public static final C32369ae f77198a = new C32369ae();

    private C32369ae() {
    }

    static {
        Covode.recordClassIndex(39137);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.ae$a */
    public static final class C32370a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C32370a f77199a = new C32370a();

        static {
            Covode.recordClassIndex(39138);
        }

        C32370a() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C89219l.m154721d(str, "");
            return new AbstractC90213b() {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32369ae.C32370a.C323711 */

                static {
                    Covode.recordClassIndex(39139);
                }

                @Override // org.p4663a.AbstractC90213b
                /* renamed from: a_ */
                public final void mo57509a_(AbstractC90214c<? super C32378b> cVar) {
                    int i;
                    String str;
                    Integer num;
                    Object a = NetworkProxyAccount.f78256b.mo58679a().mo46670a(str, (Class) C32379c.class);
                    C89219l.m154716b(a, "");
                    C32379c cVar2 = (C32379c) a;
                    if (TextUtils.equals(cVar2.f77212a, "success")) {
                        cVar.onNext(cVar2.f77213b);
                    } else {
                        C32378b bVar = cVar2.f77213b;
                        if (bVar == null || (num = bVar.f77211d) == null) {
                            i = -1;
                        } else {
                            i = num.intValue();
                        }
                        C32378b bVar2 = cVar2.f77213b;
                        if (bVar2 != null) {
                            str = bVar2.f77210c;
                        } else {
                            str = null;
                        }
                        cVar.onError(new C32405w(i, str, EnumC32592i.LOGIN, EnumC32594j.PUSH_VERIFY, null, null, 32, null));
                    }
                    cVar.onComplete();
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.a.ae$b */
    static final class C32372b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C32372b f77201a = new C32372b();

        static {
            Covode.recordClassIndex(39140);
        }

        C32372b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C89219l.m154721d(str, "");
            return new AbstractC90213b() {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2269a.C32369ae.C32372b.C323731 */

                static {
                    Covode.recordClassIndex(39141);
                }

                @Override // org.p4663a.AbstractC90213b
                /* renamed from: a_ */
                public final void mo57509a_(AbstractC90214c<? super C32358ab> cVar) {
                    int i;
                    String str;
                    Integer num;
                    Object a = NetworkProxyAccount.f78256b.mo58679a().mo46670a(str, (Class) C32359ac.class);
                    C89219l.m154716b(a, "");
                    C32359ac acVar = (C32359ac) a;
                    if (TextUtils.equals(acVar.f77182a, "success")) {
                        cVar.onNext(acVar.f77183b);
                    } else {
                        C32358ab abVar = acVar.f77183b;
                        if (abVar == null || (num = abVar.f77175d) == null) {
                            i = -1;
                        } else {
                            i = num.intValue();
                        }
                        C32358ab abVar2 = acVar.f77183b;
                        if (abVar2 != null) {
                            str = abVar2.f77174c;
                        } else {
                            str = null;
                        }
                        cVar.onError(new C32405w(i, str, EnumC32592i.LOGIN, EnumC32594j.PUSH_VERIFY, null, null, 32, null));
                    }
                    cVar.onComplete();
                }
            };
        }
    }

    /* renamed from: a */
    public static AbstractC88924h<C32358ab> m66734a(String str, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            if (str == null) {
                C89219l.m154715b();
            }
            hashMap.put("verify_ticket", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            if (str2 == null) {
                C89219l.m154715b();
            }
            hashMap.put("wait_ticket", str2);
        }
        AbstractC88924h<R> a = NetworkProxyAccount.m67480d("/passport/push_challenge/request_2sv/", hashMap).mo143198a(C32372b.f77201a).mo143195a(C88391a.m153580a(C88392a.f200660a));
        C89219l.m154716b(a, "");
        return a;
    }
}
