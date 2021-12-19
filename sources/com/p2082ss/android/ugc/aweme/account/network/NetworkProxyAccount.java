package com.p2082ss.android.ugc.aweme.account.network;

import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.ext.C18097a;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.retrofit2.client.C22027b;
import com.bytedance.retrofit2.client.C22028c;
import com.bytedance.retrofit2.p1610b.AbstractC21993ag;
import com.bytedance.retrofit2.p1610b.AbstractC21998f;
import com.bytedance.retrofit2.p1610b.AbstractC22004l;
import com.bytedance.retrofit2.p1610b.AbstractC22007o;
import com.google.gson.C27910f;
import com.p2082ss.android.C29910g;
import com.p2082ss.android.C29912h;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.http.p2146a.p2149b.C29934d;
import com.p2082ss.android.ugc.aweme.C31291a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.p4663a.AbstractC90213b;
import org.p4663a.AbstractC90214c;
import p4560f.p4561a.AbstractC88924h;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.network.NetworkProxyAccount */
public final class NetworkProxyAccount implements AbstractC32876a {

    /* renamed from: a */
    static final String f78255a = "https://api.tiktokv.com";

    /* renamed from: b */
    public static final NetworkProxyAccount f78256b = new NetworkProxyAccount();

    /* renamed from: c */
    private static final boolean f78257c = false;

    /* renamed from: d */
    private static final AbstractC89244h f78258d = C89250i.m154773a((AbstractC89171a) C32870a.f78260a);

    /* renamed from: e */
    private static final AbstractC89244h f78259e = C89250i.m154773a((AbstractC89171a) C32875d.f78266a);

    /* renamed from: b */
    private static IAccountNetworkApi m67477b() {
        return (IAccountNetworkApi) f78258d.getValue();
    }

    /* renamed from: c */
    private static AbstractC32883b m67479c() {
        return (AbstractC32883b) f78259e.getValue();
    }

    private NetworkProxyAccount() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.network.NetworkProxyAccount$d */
    static final class C32875d extends AbstractC89220m implements AbstractC89171a<C32885d> {

        /* renamed from: a */
        public static final C32875d f78266a = new C32875d();

        static {
            Covode.recordClassIndex(39663);
        }

        C32875d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C32885d invoke() {
            return new C32885d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.network.AbstractC32876a
    /* renamed from: a */
    public final C27910f mo58679a() {
        return C31291a.m65464b().mo59924a();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.network.NetworkProxyAccount$a */
    static final class C32870a extends AbstractC89220m implements AbstractC89171a<IAccountNetworkApi> {

        /* renamed from: a */
        public static final C32870a f78260a = new C32870a();

        static {
            Covode.recordClassIndex(39658);
        }

        C32870a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ IAccountNetworkApi invoke() {
            return C18097a.m33696a().mo28816a(NetworkProxyAccount.f78255a).mo28858a(IAccountNetworkApi.class);
        }
    }

    static {
        Covode.recordClassIndex(39657);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.network.NetworkProxyAccount$b */
    static final class C32871b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        public static final C32871b f78261a = new C32871b();

        static {
            Covode.recordClassIndex(39659);
        }

        C32871b() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C89219l.m154721d(str, "");
            return new AbstractC90213b() {
                /* class com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount.C32871b.C328721 */

                static {
                    Covode.recordClassIndex(39660);
                }

                @Override // org.p4663a.AbstractC90213b
                /* renamed from: a_ */
                public final void mo57509a_(AbstractC90214c<? super String> cVar) {
                    try {
                        NetworkProxyAccount networkProxyAccount = NetworkProxyAccount.f78256b;
                        String str = str;
                        C89219l.m154716b(str, "");
                        cVar.onNext(networkProxyAccount.mo58683a(str));
                    } catch (Throwable th) {
                        cVar.onError(th);
                    }
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.network.NetworkProxyAccount$c */
    static final class C32873c<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ Map f78263a;

        static {
            Covode.recordClassIndex(39661);
        }

        C32873c(Map map) {
            this.f78263a = map;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            final String str = (String) obj;
            C89219l.m154721d(str, "");
            return new AbstractC90213b(this) {
                /* class com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount.C32873c.C328741 */

                /* renamed from: a */
                final /* synthetic */ C32873c f78264a;

                static {
                    Covode.recordClassIndex(39662);
                }

                {
                    this.f78264a = r1;
                }

                @Override // org.p4663a.AbstractC90213b
                /* renamed from: a_ */
                public final void mo57509a_(AbstractC90214c<? super String> cVar) {
                    try {
                        NetworkProxyAccount networkProxyAccount = NetworkProxyAccount.f78256b;
                        String str = str;
                        C89219l.m154716b(str, "");
                        cVar.onNext(networkProxyAccount.mo58684a(str, this.f78264a.f78263a));
                    } catch (Throwable th) {
                        cVar.onError(th);
                    }
                }
            };
        }
    }

    /* renamed from: c */
    private static int m67478c(String str) {
        try {
            return new JSONObject(str).getJSONObject("data").optInt("error_code");
        } catch (JSONException unused) {
            return 0;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.network.AbstractC32876a
    /* renamed from: b */
    public final String mo58685b(String str) {
        C89219l.m154721d(str, "");
        try {
            String str2 = sendGetRequest(str, Integer.MAX_VALUE, null).f71350d;
            C89219l.m154716b(str2, "");
            return str2;
        } catch (C34485a e) {
            String response = e.getResponse();
            C89219l.m154716b(response, "");
            return response;
        }
    }

    /* renamed from: a */
    private static List<C22027b> m67476a(List<C29910g> list) {
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            arrayList.add(new C22027b(t.f71345a, t.f71346b));
        }
        return C89070n.m154585g((Collection) arrayList);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.network.AbstractC32876a
    /* renamed from: a */
    public final String mo58683a(String str) {
        C89219l.m154721d(str, "");
        String str2 = mo58680a(Integer.MAX_VALUE, str, new ArrayList()).f71350d;
        C89219l.m154716b(str2, "");
        return str2;
    }

    /* renamed from: d */
    public static AbstractC88924h<String> m67480d(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        AbstractC88924h<String> b = AbstractC88924h.m154135a(new C29844g("https://api.tiktokv.com".concat(String.valueOf(str))).mo52126a()).mo143198a((AbstractC88434g) new C32873c(map)).mo143204b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        return b;
    }

    @Override // com.p2082ss.android.ugc.aweme.account.network.AbstractC32876a
    /* renamed from: b */
    public final String mo58686b(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        try {
            String str2 = sendPostRequest(str, map, Integer.MAX_VALUE, null).f71350d;
            C89219l.m154716b(str2, "");
            return str2;
        } catch (C34485a e) {
            String response = e.getResponse();
            C89219l.m154716b(response, "");
            return response;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.network.AbstractC32876a
    /* renamed from: c */
    public final AbstractC88924h<String> mo58687c(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        AbstractC88924h<String> b = AbstractC88924h.m154135a(C32886e.m67518a(new C29844g("https://api.tiktokv.com".concat(String.valueOf(str))), map)).mo143198a((AbstractC88434g) C32871b.f78261a).mo143204b(C88925a.m154180b(C88946a.f201991c));
        C89219l.m154716b(b, "");
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        if (r7 != null) goto L_0x0007;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m67481e(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
        // Method dump skipped, instructions count: 163
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.network.NetworkProxyAccount.m67481e(java.lang.String, java.util.Map):java.lang.String");
    }

    @Override // com.p2082ss.android.ugc.aweme.account.network.AbstractC32876a
    /* renamed from: a */
    public final String mo58684a(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        String str2 = mo58681a(Integer.MAX_VALUE, str, map, new ArrayList()).f71350d;
        C89219l.m154716b(str2, "");
        return str2;
    }

    /* renamed from: a */
    private static C0484a<String, String> m67475a(String str, String str2, Map<String, String> map) {
        C0484a<String, String> aVar = new C0484a<>();
        if (C32884c.m67516a(str)) {
            aVar.putAll(C32884c.m67515a(m67478c(str2), str, str2, map));
        }
        return aVar;
    }

    /* renamed from: a */
    public final C29912h mo58680a(int i, String str, List<C29910g> list) {
        C89219l.m154721d(str, "");
        try {
            C29912h sendGetRequest = sendGetRequest(str, i, list);
            String str2 = sendGetRequest.f71350d;
            C89219l.m154716b(str2, "");
            C0484a<String, String> a = m67475a(str, str2, (Map<String, String>) null);
            if (!a.isEmpty()) {
                return mo58680a(i, m67481e(str, a), list);
            }
            return sendGetRequest;
        } catch (C34485a e) {
            return new C29912h(str, -1, list, e.getResponse());
        }
    }

    private final C29912h sendGetRequest(@AbstractC21993ag String str, @AbstractC22007o int i, @AbstractC22004l List<C29910g> list) {
        List<C22027b> arrayList;
        List list2;
        List<C22027b> f;
        if (f78257c && list != null) {
            Integer.valueOf(list.size());
        }
        m67481e(str, m67479c().mo58688a());
        if (list == null || !(!list.isEmpty())) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = m67476a(list);
        }
        C22099u<String> execute = m67477b().getResponse(str, i, arrayList).execute();
        List<C22027b> list3 = execute.f52261a.f52042d;
        if (list3 == null || list3.size() <= 0 || (f = C89070n.m154580f((Iterable) list3)) == null) {
            list2 = C89086z.INSTANCE;
        } else {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) f, 10));
            for (C22027b bVar : f) {
                arrayList2.add(new C29910g(bVar.f52037a, bVar.f52038b));
            }
            list2 = C89070n.m154585g((Collection) arrayList2);
        }
        C22028c cVar = execute.f52261a;
        C89219l.m154716b(cVar, "");
        String str2 = cVar.f52039a;
        C22028c cVar2 = execute.f52261a;
        C89219l.m154716b(cVar2, "");
        return new C29912h(str2, cVar2.f52040b, list2, execute.f52262b);
    }

    private final C29912h sendPostRequest(@AbstractC21993ag String str, @AbstractC21998f Map<String, String> map, @AbstractC22007o int i, @AbstractC22004l List<C29910g> list) {
        List<C22027b> arrayList;
        List list2;
        List<C22027b> f;
        if (f78257c) {
            map.size();
            if (list != null) {
                Integer.valueOf(list.size());
            }
        }
        Map<String, String> a = m67479c().mo58688a();
        a.putAll(map);
        if (list == null || !(!list.isEmpty())) {
            arrayList = new ArrayList<>();
        } else {
            arrayList = m67476a(list);
        }
        C22099u<String> execute = m67477b().getResponse(str, a, i, arrayList).execute();
        List<C22027b> list3 = execute.f52261a.f52042d;
        if (list3 == null || list3.size() <= 0 || (f = C89070n.m154580f((Iterable) list3)) == null) {
            list2 = C89086z.INSTANCE;
        } else {
            ArrayList arrayList2 = new ArrayList(C89070n.m154526a((Iterable) f, 10));
            for (C22027b bVar : f) {
                arrayList2.add(new C29910g(bVar.f52037a, bVar.f52038b));
            }
            list2 = C89070n.m154585g((Collection) arrayList2);
        }
        C22028c cVar = execute.f52261a;
        C89219l.m154716b(cVar, "");
        String str2 = cVar.f52039a;
        C22028c cVar2 = execute.f52261a;
        C89219l.m154716b(cVar2, "");
        return new C29912h(str2, cVar2.f52040b, list2, execute.f52262b);
    }

    /* renamed from: a */
    public final C29912h mo58681a(int i, String str, Map<String, String> map, List<C29910g> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        C89219l.m154721d(list, "");
        try {
            C29912h sendPostRequest = sendPostRequest(str, map, i, list);
            String str2 = sendPostRequest.f71350d;
            C89219l.m154716b(str2, "");
            C0484a<String, String> a = m67475a(str, str2, map);
            if (a.isEmpty()) {
                return sendPostRequest;
            }
            HashMap hashMap = new HashMap(map);
            hashMap.putAll(a);
            return mo58681a(i, str, hashMap, list);
        } catch (C34485a e) {
            return new C29912h(str, -1, list, e.getResponse());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.network.AbstractC32876a
    /* renamed from: a */
    public final <T> T mo58682a(String str, int i, String str2, Class<T> cls, String str3, List<? extends C29934d> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(cls, "");
        C89219l.m154721d(str3, "");
        return (T) C31291a.m65464b().mo59925a(str, i, str2, cls, str3, list);
    }
}
