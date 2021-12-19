package com.bytedance.android.live.wallet;

import android.app.Activity;
import android.os.SystemClock;
import com.C1764a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.network.C5805e;
import com.bytedance.android.live.network.response.C5827a;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.live.p172a.p173a.C2908a;
import com.bytedance.android.live.p172a.p173a.p174a.C2911c;
import com.bytedance.android.live.p172a.p173a.p175b.C2912a;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.BasePackage;
import com.bytedance.android.live.wallet.model.C6380c;
import com.bytedance.android.live.wallet.model.C6384g;
import com.bytedance.android.live.wallet.p416c.C6318b;
import com.bytedance.android.livesdk.userservice.C11115u;
import com.bytedance.android.livesdk.util.rxutils.C11191f;
import com.bytedance.android.livesdk.wallet.C11314c;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdk.wallet.p658b.C11312a;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11634a;
import com.bytedance.android.livesdkapi.depend.p680d.p682b.AbstractC11636c;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4591l.AbstractC88969g;
import p4560f.p4561a.p4591l.C88960c;

/* renamed from: com.bytedance.android.live.wallet.i */
public final class C6367i implements AbstractC6332d {

    /* renamed from: a */
    public C6384g f15898a;

    /* renamed from: b */
    BalanceStruct f15899b;

    /* renamed from: c */
    public final AbstractC88969g<Long> f15900c;

    /* renamed from: d */
    private final C6318b f15901d;

    static {
        Covode.recordClassIndex(7089);
    }

    @Override // com.bytedance.android.live.base.AbstractC2953a
    public final void onInit() {
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: e */
    public final BalanceStruct mo12380e() {
        return this.f15899b;
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: f */
    public final C6384g mo12382f() {
        return this.f15898a;
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: a */
    public final void mo12371a(String str) {
        ((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).autoExchange(true).mo143271a(new C11191f()).mo143254a(new C6371j(this, str), C6372k.f15911a);
    }

    /* renamed from: a */
    public final void mo12419a(String str, String str2, long j) {
        ((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).getExchangeRatio(str, str2, 101, j, 2).mo143271a(new C11191f()).mo143254a(new C6391t(this), C6392u.f15967a);
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: a */
    public final void mo12372a(List<String> list) {
        this.f15901d.mo12354a(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.wallet.i$a */
    public static class C6370a {

        /* renamed from: a */
        public static final C6367i f15908a = new C6367i((byte) 0);

        static {
            Covode.recordClassIndex(7092);
        }
    }

    /* renamed from: i */
    private static boolean m13738i() {
        return C11115u.m19743a().mo17915b().mo13165e();
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: a */
    public final AbstractC88979t<Long> mo12364a() {
        return this.f15900c.mo143261a(C88391a.m153580a(C88392a.f200660a));
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: b */
    public final long mo12373b() {
        if (!m13738i()) {
            return 0;
        }
        return this.f15898a.f15955a;
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: c */
    public final void mo12377c() {
        this.f15899b = new BalanceStruct();
        this.f15898a = new C6384g();
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: g */
    public final boolean mo12383g() {
        if (!C13627m.m24499a("0", C34822d.m71158a(C3966y.m9669e(), "js_kv_methods_20191113", 0).getString("live_auto_exchange", "0"))) {
            return true;
        }
        return false;
    }

    private C6367i() {
        this.f15898a = new C6384g();
        this.f15899b = new BalanceStruct();
        this.f15900c = new C88960c();
        this.f15901d = new C6318b(0);
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: d */
    public final void mo12379d() {
        if (m13738i()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).getWalletInfoNew().mo143271a(new C11191f()).mo143254a(new C6385n(this, uptimeMillis), new C6386o(uptimeMillis));
        }
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: h */
    public final void mo12384h() {
        if (m13738i()) {
            ((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).getBalanceInfo(1).mo143271a(new C11191f()).mo143254a(new C6387p(this), C6388q.f15963a);
        }
    }

    /* synthetic */ C6367i(byte b) {
        this();
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: a */
    public final void mo12367a(AbstractC6360g gVar) {
        this.f15901d.mo12351a(gVar);
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: b */
    public final void mo12374b(AbstractC6360g gVar) {
        this.f15901d.mo12355b(gVar);
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: c */
    public final String mo12376c(long j) {
        return m13736a(j, this.f15899b.getExchangeInfo());
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: d */
    public final String mo12378d(long j) {
        return m13736a(j, this.f15898a.f15958d);
    }

    /* renamed from: a */
    public static void m13737a(boolean z) {
        String str;
        if (z) {
            str = "1";
        } else {
            str = "0";
        }
        C34822d.m71158a(C3966y.m9669e(), "js_kv_methods_20191113", 0).edit().putString("live_auto_exchange", str).commit();
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: b */
    public final boolean mo12375b(long j) {
        if (m13738i() && this.f15898a.f15955a >= j) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: e */
    public final void mo12381e(long j) {
        if (m13738i() && this.f15899b.getUserBalance() != null && this.f15899b.getExchangeInfo() != null && this.f15899b.getExchangeInfo().getBasePackage() != null) {
            BasePackage basePackage = this.f15899b.getExchangeInfo().getBasePackage();
            double d = (double) j;
            double price = (double) basePackage.getPrice();
            double pow = Math.pow(10.0d, (double) (basePackage.getRealDot() - 2));
            Double.isNaN(price);
            Double.isNaN(d);
            this.f15899b.getExchangeInfo().setMaxCoins((long) (d / (price / pow)));
            this.f15899b.getUserBalance().setBalance(j);
        }
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: a */
    public final void mo12366a(long j) {
        if (m13738i()) {
            this.f15898a.f15955a = j;
            this.f15900c.onNext(Long.valueOf(mo12373b()));
        }
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: a */
    public final void mo12370a(final AbstractC11636c cVar) {
        if (!m13738i()) {
            C2912a aVar = new C2912a(-666);
            aVar.setErrorMsg("user doesn't login");
            cVar.mo12314a(aVar);
            return;
        }
        final long uptimeMillis = SystemClock.uptimeMillis();
        ((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).getWalletInfoNew().mo143271a(new C11191f()).mo143254a(new AbstractC88433f<C5832d<C6384g>>() {
            /* class com.bytedance.android.live.wallet.C6367i.C63681 */

            static {
                Covode.recordClassIndex(7090);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(C5832d<C6384g> dVar) {
                C5832d<C6384g> dVar2 = dVar;
                if (dVar2.data != null) {
                    C6367i.this.f15898a = (C6384g) dVar2.data;
                    BalanceStructExtra balanceStructExtra = C6367i.this.f15898a.f15958d;
                    C6367i.m13737a(((C6384g) dVar2.data).f15956b);
                    if (C6367i.this.f15898a.f15957c != null && C6367i.this.f15898a.f15957c.getEnableExchange()) {
                        C6367i.this.f15898a.f15958d = balanceStructExtra;
                        C6367i iVar = C6367i.this;
                        iVar.mo12419a(iVar.f15898a.f15957c.getCurrency(), C6367i.this.f15898a.f15957c.getRegion(), C6367i.this.f15898a.f15957c.getBalance());
                    }
                    cVar.mo12313a(((C6384g) dVar2.data).f15955a);
                    C6367i.this.f15900c.onNext(Long.valueOf(C6367i.this.mo12373b()));
                } else {
                    cVar.mo12314a(new C2911c());
                }
                C11312a.m20052a(0, SystemClock.uptimeMillis() - uptimeMillis, null);
            }
        }, new AbstractC88433f<Throwable>() {
            /* class com.bytedance.android.live.wallet.C6367i.C63692 */

            static {
                Covode.recordClassIndex(7091);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Throwable th) {
                int i;
                Throwable th2 = th;
                HashMap hashMap = new HashMap();
                hashMap.put("error_msg", th2.getMessage());
                if (th2 instanceof C2908a) {
                    i = ((C2908a) th2).getErrorCode();
                } else {
                    i = -16;
                }
                hashMap.put("error_code", Integer.valueOf(i));
                C11312a.m20053a(SystemClock.uptimeMillis() - uptimeMillis, hashMap);
                C11312a.m20052a(1, SystemClock.uptimeMillis() - uptimeMillis, hashMap);
                cVar.mo12314a(th2);
            }
        });
    }

    /* renamed from: a */
    private static String m13736a(long j, BalanceStructExtra balanceStructExtra) {
        if (balanceStructExtra == null || balanceStructExtra.getBasePackage() == null || balanceStructExtra.getCurrencyInfo() == null) {
            return "";
        }
        int realDot = balanceStructExtra.getBasePackage().getRealDot();
        long price = balanceStructExtra.getBasePackage().getPrice();
        StringBuilder append = new StringBuilder().append(balanceStructExtra.getCurrencyInfo().getSymbol());
        double d = (double) price;
        double pow = Math.pow(10.0d, (double) realDot);
        Double.isNaN(d);
        double d2 = d / pow;
        double d3 = (double) j;
        Double.isNaN(d3);
        return append.append(C1764a.m5928a("%.2f", new Object[]{Double.valueOf(d2 * d3)})).toString();
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: a */
    public final void mo12368a(C6380c cVar, AbstractC11634a aVar) {
        ((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).exchangeCoins(cVar.f15938a, cVar.f15941d, cVar.f15940c, cVar.f15942e, cVar.f15943f, cVar.f15944g, cVar.f15945h).mo143271a(new C11191f()).mo143254a(new C6373l(this, aVar), new C6374m(aVar));
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: a */
    public final void mo12369a(C11314c cVar, Activity activity) {
        this.f15901d.mo12361a(cVar, activity);
    }

    @Override // com.bytedance.android.live.wallet.AbstractC6332d
    /* renamed from: a */
    public final AbstractC88979t<C5827a<C11314c, DiamondPackageExtra>> mo12365a(String str, long j, long j2, long j3) {
        return ((IapApi) C5805e.m12718a().mo11572a(IapApi.class)).fetchDiamondPackage(str, j, j2, j3);
    }
}
