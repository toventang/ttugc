package com.p2082ss.android.ugc.aweme.account.login.trusted;

import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.p1610b.AbstractC21999g;
import com.p2082ss.android.ugc.aweme.account.login.C31975q;
import com.p2082ss.android.ugc.aweme.account.login.trusted.C32107j;
import com.p2082ss.android.ugc.aweme.utils.C80214ai;
import java.util.ArrayList;
import java.util.List;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.account.login.trusted.TrustedEnvApi */
public final class TrustedEnvApi {

    /* renamed from: a */
    public static final EndPoints f76563a;

    /* renamed from: b */
    public static final TrustedEnvApi f76564b = new TrustedEnvApi();

    /* renamed from: c */
    private static final AbstractC89244h f76565c;

    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.TrustedEnvApi$EndPoints */
    public interface EndPoints {
        static {
            Covode.recordClassIndex(38839);
        }

        @AbstractC89731o(mo144285a = "/passport/device/trust_users/")
        @AbstractC21999g
        C1731i<C32107j> fetchTrustedUsers(@AbstractC89719c(mo144273a = "last_sec_user_id") String str, @AbstractC89719c(mo144273a = "d_ticket") String str2, @AbstractC89719c(mo144273a = "last_login_way") int i, @AbstractC89719c(mo144273a = "last_login_time") long j, @AbstractC89719c(mo144273a = "last_login_platform") String str3);

        @AbstractC89731o(mo144285a = "/passport/user/device_record_status/get/")
        C1731i<C32087a> getLoginHistoryFeatureState();

        @AbstractC89731o(mo144285a = "/passport/user/device_record_status/set/")
        @AbstractC21999g
        C1731i<C32087a> setLoginHistoryFeatureState(@AbstractC89719c(mo144273a = "user_device_record_status") int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.TrustedEnvApi$a */
    static final class C32081a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        public static final C32081a f76566a = new C32081a();

        static {
            Covode.recordClassIndex(38840);
        }

        C32081a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "https://api.tiktokv.com";
        }
    }

    private TrustedEnvApi() {
    }

    static {
        Covode.recordClassIndex(38838);
        AbstractC89244h a = C89250i.m154773a((AbstractC89171a) C32081a.f76566a);
        f76565c = a;
        f76563a = (EndPoints) RetrofitFactory.m33635a().mo28817b((String) a.getValue()).mo28832d().mo28858a(EndPoints.class);
    }

    /* renamed from: a */
    public static void m66469a(AbstractC89172b<? super C32107j, C89391z> bVar) {
        C89219l.m154721d(bVar, "");
        m66470a("", "", "", bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.TrustedEnvApi$c */
    public static final class C32083c<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f76568a;

        static {
            Covode.recordClassIndex(38842);
        }

        C32083c(AbstractC89172b bVar) {
            this.f76568a = bVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC89172b bVar = this.f76568a;
            C89219l.m154716b(iVar, "");
            bVar.invoke(iVar.mo5545d());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.TrustedEnvApi$e */
    public static final class C32086e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89172b f76573a;

        static {
            Covode.recordClassIndex(38845);
        }

        public C32086e(AbstractC89172b bVar) {
            this.f76573a = bVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            AbstractC89172b bVar = this.f76573a;
            C89219l.m154716b(iVar, "");
            bVar.invoke(iVar.mo5545d());
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.TrustedEnvApi$d */
    public static final class C32084d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC1204m f76569a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f76570b;

        static {
            Covode.recordClassIndex(38843);
        }

        public C32084d(AbstractC1204m mVar, AbstractC89172b bVar) {
            this.f76569a = mVar;
            this.f76570b = bVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(final C1731i iVar) {
            AbstractC1204m mVar = this.f76569a;
            if (mVar == null) {
                AbstractC89172b bVar = this.f76570b;
                C89219l.m154716b(iVar, "");
                bVar.invoke(iVar.mo5545d());
            } else {
                C320851 r2 = new AbstractC89171a<C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.account.login.trusted.TrustedEnvApi.C32084d.C320851 */

                    /* renamed from: a */
                    final /* synthetic */ C32084d f76571a;

                    static {
                        Covode.recordClassIndex(38844);
                    }

                    {
                        this.f76571a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ C89391z invoke() {
                        AbstractC89172b bVar = this.f76571a.f76570b;
                        C1731i iVar = iVar;
                        C89219l.m154716b(iVar, "");
                        bVar.invoke(iVar.mo5545d());
                        return C89391z.f203057a;
                    }
                };
                C89219l.m154721d(mVar, "");
                C89219l.m154721d(r2, "");
                AbstractC1196i lifecycle = mVar.getLifecycle();
                C89219l.m154716b(lifecycle, "");
                if (lifecycle.mo4011a() != AbstractC1196i.EnumC1199b.DESTROYED) {
                    r2.invoke();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.account.login.trusted.TrustedEnvApi$b */
    public static final class C32082b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        public static final C32082b f76567a = new C32082b();

        static {
            Covode.recordClassIndex(38841);
        }

        C32082b() {
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            List<C32105h> list;
            Long l;
            String str;
            String str2;
            String str3;
            if (C80214ai.m139043a(iVar)) {
                C89219l.m154716b(iVar, "");
                String str4 = ((C32107j) iVar.mo5545d()).f76609a;
                if (str4 != null && C89361p.m154872a(str4, "success", true)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C32106i.m66489a().storeLong("last_success_fetch", currentTimeMillis);
                    C32107j.C32108a aVar = ((C32107j) iVar.mo5545d()).f76610b;
                    if (!(aVar == null || (list = aVar.f76611a) == null)) {
                        ArrayList arrayList = new ArrayList();
                        for (T t : list) {
                            T t2 = t;
                            if (t2.f76603c != null && (((l = t2.f76603c) == null || l.longValue() != 0) && (str = t2.f76602b) != null && str.length() > 0 && (str2 = t2.f76607g) != null && str2.length() > 0 && (str3 = t2.f76604d) != null && str3.length() > 0)) {
                                arrayList.add(t);
                            }
                        }
                        ArrayList<C32105h> arrayList2 = arrayList;
                        ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                        for (C32105h hVar : arrayList2) {
                            hVar.f76601a = currentTimeMillis;
                            arrayList3.add(hVar);
                        }
                        C32106i.m66490a(C89070n.m154590j(arrayList3));
                        C31975q.m66356b(list);
                    }
                }
            }
            C89219l.m154716b(iVar, "");
            return iVar.mo5545d();
        }
    }

    /* renamed from: a */
    private static void m66470a(String str, String str2, String str3, AbstractC89172b<? super C32107j, C89391z> bVar) {
        C89219l.m154721d(str2, "");
        C89219l.m154721d(bVar, "");
        f76563a.fetchTrustedUsers(str, str2, -1, 0, str3).mo5532a(C32082b.f76567a).mo5534a(new C32083c(bVar), C1731i.f5564c, null);
    }
}
