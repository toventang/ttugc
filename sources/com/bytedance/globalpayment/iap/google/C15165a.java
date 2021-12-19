package com.bytedance.globalpayment.iap.google;

import android.app.Activity;
import android.app.Application;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.android.billingclient.api.AbstractC2235d;
import com.android.billingclient.api.AbstractC2239f;
import com.android.billingclient.api.AbstractC2247k;
import com.android.billingclient.api.AbstractC2250m;
import com.android.billingclient.api.C2220a;
import com.android.billingclient.api.C2232b;
import com.android.billingclient.api.C2237e;
import com.android.billingclient.api.C2240g;
import com.android.billingclient.api.C2242h;
import com.android.billingclient.api.C2244i;
import com.android.billingclient.api.C2248l;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.bytedance.common.utility.p907b.RunnableC13596e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.globalpayment.iap.common.ability.C15122b;
import com.bytedance.globalpayment.iap.common.ability.C15124c;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderData;
import com.bytedance.globalpayment.iap.common.ability.model.enums.PayType;
import com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15127a;
import com.bytedance.globalpayment.iap.common.ability.p1055d.AbstractC15128b;
import com.bytedance.globalpayment.iap.common.ability.p1056e.C15130b;
import com.bytedance.globalpayment.iap.google.helper.C15197a;
import com.bytedance.globalpayment.iap.google.helper.C15198b;
import com.bytedance.globalpayment.iap.google.helper.C15199c;
import com.bytedance.globalpayment.iap.google.helper.RestoreOrderService;
import com.bytedance.globalpayment.iap.google.p1065a.AbstractC15178a;
import com.bytedance.globalpayment.iap.google.p1066b.AbstractC15180a;
import com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b;
import com.bytedance.globalpayment.iap.google.p1067c.C15183a;
import com.bytedance.globalpayment.iap.google.p1067c.C15184b;
import com.bytedance.globalpayment.iap.google.p1070f.C15194c;
import com.bytedance.globalpayment.iap.model.AbsIapChannelOrderData;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.AbsResult;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.iap.p1049a.AbstractC15108b;
import com.bytedance.globalpayment.payment.common.lib.p1071a.AbstractC15237c;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import com.bytedance.globalpayment.payment.common.lib.p1078h.p1080b.AbstractC15272d;
import com.bytedance.globalpayment.payment.common.lib.p1082j.C15283e;
import com.bytedance.globalpayment.service.manager.iap.google.ConsumeIapProductListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.globalpayment.iap.google.a */
public class C15165a implements AbstractC2247k, AbstractC15178a {

    /* renamed from: a */
    public static final String f36998a = C15165a.class.getSimpleName();

    /* renamed from: b */
    public static boolean f36999b = false;

    /* renamed from: p */
    private static String f37000p = "CONSTRUCT_YOUR";

    /* renamed from: t */
    private static volatile AbstractC15178a f37001t;

    /* renamed from: c */
    public AtomicBoolean f37002c = new AtomicBoolean(false);

    /* renamed from: d */
    public ConcurrentMap<String, ConsumeIapProductListener> f37003d = new ConcurrentHashMap();

    /* renamed from: e */
    public CopyOnWriteArraySet<Purchase> f37004e = new CopyOnWriteArraySet<>();

    /* renamed from: f */
    public CopyOnWriteArraySet<AbstractC15181b> f37005f = new CopyOnWriteArraySet<>();

    /* renamed from: g */
    public Map<String, SkuDetails> f37006g = new HashMap();

    /* renamed from: h */
    List<AbsIapChannelOrderData> f37007h = new ArrayList();

    /* renamed from: i */
    public AtomicBoolean f37008i = new AtomicBoolean(false);

    /* renamed from: j */
    public AbstractC2235d f37009j;

    /* renamed from: k */
    public AbstractC15127a f37010k;

    /* renamed from: l */
    public AtomicBoolean f37011l = new AtomicBoolean(false);

    /* renamed from: m */
    public boolean f37012m;

    /* renamed from: n */
    private ConcurrentMap<String, AbstractC15180a> f37013n = new ConcurrentHashMap();

    /* renamed from: o */
    private ConcurrentMap<String, AbstractC15180a> f37014o = new ConcurrentHashMap();

    /* renamed from: q */
    private ConcurrentHashMap<String, AbsIapChannelOrderData> f37015q = new ConcurrentHashMap<>();

    /* renamed from: r */
    private AbstractC15181b f37016r = new AbstractC15181b() {
        /* class com.bytedance.globalpayment.iap.google.C15165a.C151661 */

        static {
            Covode.recordClassIndex(17346);
        }

        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
        /* renamed from: a */
        public final void mo24522a() {
            C15165a.this.f37010k.onPurchasesUpdated(null, null);
            RestoreOrderService.getIns(C15253a.m28071a().mo24709i().mo24713b());
            if (!C15253a.m28071a().mo24708h().mo24737d()) {
                C15253a.m28071a().mo24705e();
            }
        }

        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
        /* renamed from: a */
        public final void mo24523a(C15126d dVar) {
            C15165a.this.f37010k.onQueryFinished(IapPaymentMethod.GOOGLE, null, null);
            C15253a.m28071a().mo24705e();
        }
    };

    /* renamed from: s */
    private AbstractC2239f f37017s = new AbstractC2239f() {
        /* class com.bytedance.globalpayment.iap.google.C15165a.C151693 */

        static {
            Covode.recordClassIndex(17349);
        }

        @Override // com.android.billingclient.api.AbstractC2239f
        /* renamed from: a */
        public final void mo6206a() {
            C15253a.m28071a().mo24705e();
            C15165a.this.f37011l.set(false);
            C15165a.this.f37002c.set(false);
            C15165a.this.f37002c.set(false);
        }

        @Override // com.android.billingclient.api.AbstractC2239f
        /* renamed from: b */
        public final void mo6207b(C2242h hVar) {
            C15253a.m28071a().mo24705e();
            C15165a.this.f37011l.set(false);
            C15126d a = C15199c.m28008a(hVar);
            if (hVar.f6732a == 0) {
                C15165a.this.f37002c.set(true);
                Iterator<AbstractC15181b> it = C15165a.this.f37005f.iterator();
                while (it.hasNext()) {
                    it.next().mo24522a();
                }
                C15165a.this.f37005f.clear();
                return;
            }
            C15165a.this.f37002c.set(false);
            Iterator<AbstractC15181b> it2 = C15165a.this.f37005f.iterator();
            while (it2.hasNext()) {
                it2.next().mo24523a(a);
            }
            C15165a.this.f37005f.clear();
        }
    };

    /* renamed from: u */
    private Application f37018u;

    @Override // com.bytedance.globalpayment.iap.google.p1065a.AbstractC15178a
    /* renamed from: b */
    public final boolean mo24520b() {
        return this.f37012m;
    }

    @Override // com.bytedance.globalpayment.iap.google.p1065a.AbstractC15178a
    /* renamed from: a */
    public final void mo24515a(final AbstractC15128b bVar) {
        if (this.f37009j == null) {
            AbstractC2235d.C2236a aVar = new AbstractC2235d.C2236a(C15253a.m28071a().mo24709i().mo24713b(), (byte) 0);
            aVar.f6692c = this;
            aVar.f6690a = true;
            if (aVar.f6691b == null) {
                throw new IllegalArgumentException("Please provide a valid Context.");
            } else if (aVar.f6692c == null) {
                throw new IllegalArgumentException("Please provide a valid listener for purchases updates.");
            } else if (aVar.f6690a) {
                this.f37009j = new C2237e(aVar.f6690a, aVar.f6691b, aVar.f6692c);
            } else {
                throw new IllegalArgumentException("Support for pending purchases must be enabled. Enable this by calling 'enablePendingPurchases()' on BillingClientBuilder.");
            }
        }
        f37000p = C15253a.m28071a().mo24709i().mo24715d().f37214b;
        C15253a.m28071a().mo24705e();
        this.f37005f.size();
        this.f37005f.add(this.f37016r);
        C15253a.m28071a().mo24705e();
        this.f37005f.size();
        mo24516a(new AbstractC15181b() {
            /* class com.bytedance.globalpayment.iap.google.C15165a.C151704 */

            static {
                Covode.recordClassIndex(17350);
            }

            @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
            /* renamed from: a */
            public final void mo24522a() {
                C15165a.this.f37012m = true;
                bVar.mo24391a((C15126d) new C15126d().withErrorCode(0));
            }

            @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
            /* renamed from: a */
            public final void mo24523a(C15126d dVar) {
                bVar.mo24391a(dVar);
            }
        });
    }

    /* renamed from: a */
    public final void mo24516a(AbstractC15181b bVar) {
        if (this.f37011l.get()) {
            this.f37005f.add(bVar);
            C15253a.m28071a().mo24705e();
            this.f37005f.size();
        } else if (this.f37002c.get()) {
            bVar.mo24522a();
        } else {
            this.f37005f.add(bVar);
            C15253a.m28071a().mo24705e();
            this.f37005f.size();
            try {
                if (!this.f37011l.getAndSet(true)) {
                    C15253a.m28071a().mo24705e();
                    this.f37009j.mo6193a(this.f37017s);
                }
            } catch (Throwable th) {
                C15253a.m28071a().mo24705e();
                th.getMessage();
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.google.p1065a.AbstractC15178a
    /* renamed from: a */
    public final void mo24513a(final AbstractC15108b bVar) {
        mo24516a(new AbstractC15181b() {
            /* class com.bytedance.globalpayment.iap.google.C15165a.C151715 */

            static {
                Covode.recordClassIndex(17351);
            }

            @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
            /* renamed from: a */
            public final void mo24522a() {
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    RunnableC13596e.m24423a(new Runnable() {
                        /* class com.bytedance.globalpayment.iap.google.C15165a.C151715.RunnableC151721 */

                        static {
                            Covode.recordClassIndex(17352);
                        }

                        public final void run() {
                            C15165a.this.mo24519b(bVar);
                        }
                    });
                } else {
                    C15165a.this.mo24519b(bVar);
                }
            }

            @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
            /* renamed from: a */
            public final void mo24523a(C15126d dVar) {
                AbstractC15108b bVar = bVar;
                if (bVar != null) {
                    bVar.onQueryFinished(IapPaymentMethod.GOOGLE, dVar, Collections.emptyList());
                }
            }
        });
    }

    @Override // com.bytedance.globalpayment.iap.google.p1065a.AbstractC15178a
    /* renamed from: a */
    public final void mo24518a(final boolean z, final String str, final ConsumeIapProductListener consumeIapProductListener) {
        if (this.f37003d.containsKey(str)) {
            C15253a.m28071a().mo24705e();
        } else {
            mo24516a(new AbstractC15181b() {
                /* class com.bytedance.globalpayment.iap.google.C15165a.C151747 */

                static {
                    Covode.recordClassIndex(17354);
                }

                @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
                /* renamed from: a */
                public final void mo24522a() {
                    boolean z = z;
                    String str = str;
                    ConsumeIapProductListener consumeIapProductListener = consumeIapProductListener;
                    if (consumeIapProductListener != null) {
                        C15165a.this.f37003d.put(str, consumeIapProductListener);
                    }
                    C15253a.m28071a().mo24705e();
                    if (z) {
                        C2232b.C2233a aVar = new C2232b.C2233a((byte) 0);
                        aVar.f6689a = str;
                        if (aVar.f6689a != null) {
                            C2232b bVar = new C2232b((byte) 0);
                            bVar.f6688a = aVar.f6689a;
                            C15165a.this.f37009j.mo6192a(bVar, new C15179b(this, str));
                            return;
                        }
                        throw new IllegalArgumentException("Purchase token must be set");
                    }
                    C2244i.C2245a aVar2 = new C2244i.C2245a((byte) 0);
                    aVar2.f6737a = str;
                    if (aVar2.f6737a != null) {
                        C2244i iVar = new C2244i((byte) 0);
                        iVar.f6736a = aVar2.f6737a;
                        C15165a.this.f37009j.mo6194a(iVar, new C15182c(this));
                        return;
                    }
                    throw new IllegalArgumentException("Purchase token must be set");
                }

                @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
                /* renamed from: a */
                public final void mo24523a(C15126d dVar) {
                    ConsumeIapProductListener consumeIapProductListener = consumeIapProductListener;
                    if (consumeIapProductListener != null) {
                        consumeIapProductListener.onConsumeFinished(dVar);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.globalpayment.iap.google.p1065a.AbstractC15178a
    /* renamed from: a */
    public final void mo24517a(final List<String> list, final boolean z, final AbstractC15237c<AbsIapProduct> cVar) {
        mo24516a(new AbstractC15181b() {
            /* class com.bytedance.globalpayment.iap.google.C15165a.C151758 */

            static {
                Covode.recordClassIndex(17355);
            }

            @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
            /* renamed from: a */
            public final void mo24522a() {
                String str;
                if (z) {
                    str = "subs";
                } else {
                    str = "inapp";
                }
                AbstractC15272d e = C15253a.m28071a().mo24705e();
                Object[] objArr = new Object[2];
                int i = 0;
                objArr[0] = str;
                StringBuilder sb = new StringBuilder();
                List list = list;
                if (list != null) {
                    i = list.size();
                }
                objArr[1] = sb.append(i).toString();
                e.mo24723a("BillingManager: query skuDetails list from google service, itemType: %s, skuList length is: %s", objArr);
                C2248l.C2249a a = C2248l.m6868a().mo6214a(list);
                a.f6741a = str;
                C15165a.this.f37009j.mo6195a(a.mo6215a(), new C15185d(this, cVar));
            }

            @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
            /* renamed from: a */
            public final void mo24523a(C15126d dVar) {
                cVar.mo24682a(dVar, null);
            }
        });
    }

    @Override // com.android.billingclient.api.AbstractC2247k
    /* renamed from: a */
    public final void mo6213a(C2242h hVar, List<Purchase> list) {
        C15184b bVar;
        Map<String, SkuDetails> map = this.f37006g;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Purchase purchase : list) {
                SkuDetails skuDetails = map.get(purchase.mo6161b());
                arrayList.add(new C15183a(purchase, skuDetails != null && skuDetails.mo6173c().equals("subs")));
            }
        }
        this.f37010k.onPurchasesUpdated(C15199c.m28008a(hVar), arrayList);
        this.f37008i.compareAndSet(true, false);
        C15126d a = C15199c.m28008a(hVar);
        if (list != null) {
            list.size();
            list.size();
            Iterator<Purchase> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        C15198b.m28002a().mo24568a(a, list);
        if (hVar.f6732a == 0) {
            HashSet hashSet = new HashSet(this.f37013n.keySet());
            hashSet.addAll(this.f37014o.keySet());
            ArrayList<Purchase> arrayList2 = new ArrayList();
            if (list != null) {
                for (Purchase purchase2 : list) {
                    if (!m27923b(purchase2.f6646a, purchase2.f6647b)) {
                        C15253a.m28071a().mo24705e();
                        purchase2.mo6160a();
                        String b = purchase2.mo6161b();
                        if (!hashSet.contains(b)) {
                            C15253a.m28071a().mo24705e();
                            C15198b.m28002a().mo24567a(purchase2);
                            mo24513a((AbstractC15108b) this.f37010k);
                        } else {
                            AbstractC15180a aVar = this.f37013n.get(b);
                            AbstractC15180a aVar2 = this.f37014o.get(b);
                            SkuDetails skuDetails2 = this.f37006g.get(b);
                            boolean z = skuDetails2 != null && skuDetails2.mo6173c().equals("subs");
                            if (aVar2 != null) {
                                aVar2.mo24529a(new C15183a(purchase2, z));
                            } else if (aVar != null) {
                                aVar.mo24529a(new C15183a(purchase2, z));
                            }
                        }
                    } else {
                        arrayList2.add(purchase2);
                        if (purchase2.mo6163d() == 1) {
                            this.f37004e.add(purchase2);
                        }
                    }
                }
            }
            for (final Purchase purchase3 : arrayList2) {
                String b2 = purchase3.mo6161b();
                C15253a.m28071a().mo24705e();
                if (!hashSet.contains(b2)) {
                    String optString = purchase3.f6648c.optString("obfuscatedAccountId");
                    String optString2 = purchase3.f6648c.optString("obfuscatedProfileId");
                    if (!(optString == null && optString2 == null)) {
                        C2220a aVar3 = new C2220a(optString, optString2);
                        JSONObject a2 = m27921a(aVar3.f6658a, aVar3.f6659b);
                        if (a2 != null) {
                            final String optString3 = a2.optString("merchant_id");
                            final String optString4 = a2.optString("uid");
                            final String optString5 = a2.optString("trade_no");
                            if (!TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(optString4) && !TextUtils.isEmpty(optString5)) {
                                if (this.f37007h.size() == 0) {
                                    mo24513a(new AbstractC15108b() {
                                        /* class com.bytedance.globalpayment.iap.google.C15165a.C151682 */

                                        static {
                                            Covode.recordClassIndex(17348);
                                        }

                                        @Override // com.bytedance.globalpayment.iap.p1049a.AbstractC15108b
                                        public final void onQueryFinished(IapPaymentMethod iapPaymentMethod, AbsResult absResult, List<AbsIapChannelOrderData> list) {
                                            C15165a.this.mo24512a(purchase3, optString3, optString4, optString5);
                                        }
                                    });
                                } else {
                                    mo24512a(purchase3, optString3, optString4, optString5);
                                }
                            }
                        }
                    }
                    C15253a.m28071a().mo24705e();
                    C15198b.m28002a().mo24567a(purchase3);
                    mo24513a((AbstractC15108b) this.f37010k);
                }
                AbstractC15180a aVar4 = this.f37013n.get(b2);
                AbstractC15180a aVar5 = this.f37014o.get(b2);
                SkuDetails skuDetails3 = this.f37006g.get(b2);
                C15183a aVar6 = new C15183a(purchase3, skuDetails3 != null && skuDetails3.mo6173c().equals("subs"));
                if (skuDetails3 == null) {
                    bVar = null;
                } else {
                    bVar = new C15184b(skuDetails3);
                }
                RestoreOrderService.getIns(this.f37018u).onGoogleCallback(aVar6);
                if (aVar5 != null) {
                    C15253a.m28071a().mo24705e().mo24723a("BillingManager: dispatch '%s' to pendingListener(%s) to deal with.", b2, Integer.valueOf(aVar5.hashCode()));
                    aVar5.mo24528a(C15199c.m28008a(hVar), aVar6, bVar);
                    this.f37014o.remove(b2, aVar5);
                } else if (aVar4 != null) {
                    C15253a.m28071a().mo24705e().mo24723a("BillingManager: dispatch '%s' to purchasedListener(%s) to deal with.", b2, Integer.valueOf(aVar4.hashCode()));
                    aVar4.mo24528a(C15199c.m28008a(hVar), aVar6, bVar);
                    this.f37013n.remove(b2, aVar4);
                    C15253a.m28071a().mo24705e();
                    aVar4.hashCode();
                    if (purchase3.mo6163d() == 2) {
                        C15253a.m28071a().mo24705e();
                        aVar4.hashCode();
                        this.f37014o.put(b2, aVar4);
                    }
                } else {
                    C15253a.m28071a().mo24705e().mo24724b("BillingManager: Serious error! sku: '%s' cannot be deal with.", b2);
                }
            }
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (String str : this.f37013n.keySet()) {
            final AbstractC15180a aVar7 = this.f37013n.get(str);
            if (!(aVar7 == null || aVar7.mo24530b() > 0 || aVar7.mo24533e() || aVar7.mo24531c() == null || aVar7.mo24532d() == null)) {
                if (hVar.f6732a == -1 && this.f37008i.compareAndSet(false, true)) {
                    mo24516a(new AbstractC15181b() {
                        /* class com.bytedance.globalpayment.iap.google.C15165a.C1516710 */

                        static {
                            Covode.recordClassIndex(17347);
                        }

                        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
                        /* renamed from: a */
                        public final void mo24522a() {
                            C15165a.this.mo24508a(aVar7.mo24531c(), aVar7.mo24532d(), aVar7);
                        }

                        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
                        /* renamed from: a */
                        public final void mo24523a(C15126d dVar) {
                            aVar7.mo24528a(dVar, null, null);
                        }
                    });
                } else if ((hVar.f6732a == -3 || TextUtils.equals("An internal error occurred.", hVar.f6733b)) && this.f37008i.compareAndSet(false, true)) {
                    mo24508a(aVar7.mo24531c(), aVar7.mo24532d(), aVar7);
                }
                concurrentHashMap.put(str, aVar7);
            }
            aVar7.mo24528a(C15199c.m28008a(hVar), null, null);
        }
        this.f37013n.clear();
        this.f37013n.putAll(concurrentHashMap);
        C15253a.m28071a().mo24705e();
    }

    static {
        Covode.recordClassIndex(17345);
    }

    /* renamed from: a */
    public static AbstractC15178a m27920a() {
        MethodCollector.m26663i(2309);
        if (f37001t == null) {
            synchronized (C15165a.class) {
                try {
                    if (f37001t == null) {
                        f37001t = new C15165a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(2309);
                    throw th;
                }
            }
        }
        AbstractC15178a aVar = f37001t;
        MethodCollector.m26664o(2309);
        return aVar;
    }

    @Override // com.bytedance.globalpayment.iap.google.p1065a.AbstractC15178a
    /* renamed from: c */
    public final void mo24521c() {
        Purchase.C2218a b = this.f37009j.mo6197b("subs");
        C15253a.m28071a().mo24705e();
        if (b.f6650b.f6732a == 0) {
            List<Purchase> list = b.f6649a;
            ArrayList arrayList = new ArrayList();
            for (Purchase purchase : list) {
                if (purchase.mo6164e()) {
                    arrayList.add(purchase.mo6161b());
                }
            }
            C15122b.m27797e().mo24381a().mo24419b(IapPaymentMethod.GOOGLE, new C15126d(0, "query has subscription success in google service"), arrayList);
            return;
        }
        C15122b.m27797e().mo24381a().mo24419b(IapPaymentMethod.GOOGLE, C15199c.m28008a(b.f6650b), null);
    }

    @Override // com.bytedance.globalpayment.iap.google.p1065a.AbstractC15178a
    /* renamed from: a */
    public final void mo24514a(AbstractC15127a aVar) {
        if (this.f37010k == null) {
            this.f37010k = aVar;
        }
    }

    /* renamed from: b */
    public final synchronized void mo24519b(AbstractC15108b bVar) {
        MethodCollector.m26663i(2407);
        System.currentTimeMillis();
        this.f37007h.clear();
        Purchase.C2218a b = this.f37009j.mo6197b("inapp");
        C15253a.m28071a().mo24705e();
        System.currentTimeMillis();
        int i = this.f37009j.mo6191a("subscriptions").f6732a;
        if (i != 0) {
            C15253a.m28071a().mo24705e();
        }
        if (i == 0) {
            Purchase.C2218a b2 = this.f37009j.mo6197b("subs");
            C15253a.m28071a().mo24705e();
            System.currentTimeMillis();
            if (b2.f6650b.f6732a == 0) {
                List<Purchase> list = b2.f6649a;
                ArrayList arrayList = new ArrayList();
                for (Purchase purchase : list) {
                    if (!purchase.mo6164e()) {
                        arrayList.add(purchase);
                    }
                }
                m27922a((List<Purchase>) arrayList, true);
            }
        } else if (b.f6650b.f6732a == 0) {
            C15253a.m28071a().mo24705e();
        }
        if (b.f6650b.f6732a == 0) {
            m27922a(b.f6649a, false);
        }
        bVar.onQueryFinished(IapPaymentMethod.GOOGLE, new C15126d(0, "query success."), this.f37007h);
        MethodCollector.m26664o(2407);
    }

    /* renamed from: a */
    private static JSONObject m27921a(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            String[] split = C15283e.m28158a(str).split("-");
            String[] split2 = C15283e.m28158a(str2).split("-");
            if (split.length != 0) {
                if (split2.length != 0) {
                    jSONObject.put("trade_no", split2[0]);
                    jSONObject.put("trade_amount", split2[1]);
                    jSONObject.put("app_id", split[0]);
                    jSONObject.put("merchant_id", split[1]);
                    jSONObject.put("uid", split[2]);
                    return jSONObject;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    /* renamed from: b */
    private static boolean m27923b(String str, String str2) {
        if (!f37000p.contains("CONSTRUCT_YOUR")) {
            try {
                String str3 = f37000p;
                C15253a.m28071a().mo24705e();
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str2)) {
                    return C15194c.m28000a(C15194c.m27999a(str3), str, str2);
                }
                C15253a.m28071a().mo24705e();
                return false;
            } catch (Exception e) {
                C15253a.m28071a().mo24705e();
                e.getLocalizedMessage();
                return false;
            }
        } else {
            throw new RuntimeException("Please update your app's public key at: BASE_64_ENCODED_PUBLIC_KEY");
        }
    }

    /* renamed from: a */
    private void m27922a(List<Purchase> list, boolean z) {
        this.f37004e.addAll(list);
        for (Purchase purchase : list) {
            this.f37007h.add(new C15183a(purchase, z));
        }
        list.size();
        if (z) {
            C15253a.m28071a().mo24705e();
        } else {
            C15253a.m28071a().mo24705e();
        }
    }

    /* renamed from: a */
    public final void mo24508a(Activity activity, C2240g gVar, AbstractC15180a aVar) {
        aVar.mo24526a();
        this.f37009j.mo6190a(activity, gVar);
    }

    /* renamed from: a */
    public final void mo24510a(Activity activity, String str, C2240g gVar, AbstractC15180a aVar) {
        aVar.mo24527a(gVar);
        this.f37013n.put(str, aVar);
        aVar.mo24534f();
        mo24508a(activity, gVar, aVar);
    }

    /* renamed from: a */
    public final void mo24512a(Purchase purchase, String str, String str2, String str3) {
        for (AbsIapChannelOrderData absIapChannelOrderData : this.f37007h) {
            if (TextUtils.equals(absIapChannelOrderData.getProductId(), purchase.mo6161b())) {
                boolean isSubscription = absIapChannelOrderData.isSubscription();
                C15253a.m28071a().mo24705e();
                C15124c cVar = new C15124c(SystemClock.uptimeMillis());
                cVar.f36917b = str;
                cVar.f36920e = str2;
                cVar.f36922g = isSubscription;
                OrderData orderData = new OrderData(cVar, PayType.CAIJING_CALLBACK);
                orderData.setProductId(absIapChannelOrderData.getProductId());
                orderData.setOrderId(str3);
                orderData.setIapPaymentMethod(IapPaymentMethod.GOOGLE);
                orderData.setUserId(str2);
                orderData.setAbsIapChannelOrderData(absIapChannelOrderData);
                orderData.setIapPayMonitor(new C15130b(absIapChannelOrderData.getProductId(), str3, isSubscription, PayType.CAIJING_CALLBACK, orderData));
                this.f37010k.onCJBillingCallback(orderData);
            }
        }
    }

    @Override // com.bytedance.globalpayment.iap.google.p1065a.AbstractC15178a
    /* renamed from: a */
    public final void mo24511a(final Activity activity, final String str, final boolean z, final OrderData orderData, final AbstractC15180a aVar) {
        mo24516a(new AbstractC15181b() {
            /* class com.bytedance.globalpayment.iap.google.C15165a.C151736 */

            static {
                Covode.recordClassIndex(17353);
            }

            @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
            /* renamed from: a */
            public final void mo24522a() {
                String str;
                if (C15165a.this.f37008i.get()) {
                    C15253a.m28071a().mo24705e();
                    return;
                }
                C15165a.this.f37008i.compareAndSet(false, true);
                C15165a aVar = C15165a.this;
                Activity activity = activity;
                String str2 = str;
                boolean z = z;
                OrderData orderData = orderData;
                AbstractC15180a aVar2 = aVar;
                SkuDetails skuDetails = aVar.f37006g.get(str2);
                if (skuDetails != null) {
                    aVar.mo24510a(activity, str2, C15197a.m28001a(C2240g.m6860b().mo6209a(skuDetails), orderData), aVar2);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(str2);
                C2248l.C2249a a = C2248l.m6868a().mo6214a(arrayList);
                if (z) {
                    str = "subs";
                } else {
                    str = "inapp";
                }
                a.f6741a = str;
                aVar.mo24509a(activity, a.mo6215a(), str2, orderData, aVar2, 0, null);
            }

            @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
            /* renamed from: a */
            public final void mo24523a(C15126d dVar) {
                AbstractC15180a aVar = aVar;
                if (aVar != null) {
                    aVar.mo24528a(dVar, null, null);
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo24509a(final Activity activity, final C2248l lVar, final String str, final OrderData orderData, final AbstractC15180a aVar, final int i, final C2242h hVar) {
        this.f37009j.mo6195a(lVar, new AbstractC2250m() {
            /* class com.bytedance.globalpayment.iap.google.C15165a.C151769 */

            static {
                Covode.recordClassIndex(17356);
            }

            /* renamed from: a */
            private void m27955a(List<SkuDetails> list) {
                if (list == null || list.isEmpty()) {
                    C15126d dVar = new C15126d(-1, "-1:google details is empty, doesn't has this product.");
                    C15253a.m28071a().mo24705e();
                    mo24525a(str, orderData, dVar);
                    return;
                }
                for (SkuDetails skuDetails : list) {
                    if (skuDetails != null) {
                        C15165a.this.f37006g.put(skuDetails.mo6171a(), skuDetails);
                    }
                }
                SkuDetails skuDetails2 = C15165a.this.f37006g.get(str);
                if (skuDetails2 != null) {
                    C15165a.this.mo24510a(activity, str, C15197a.m28001a(C2240g.m6860b().mo6209a(skuDetails2), orderData), aVar);
                    return;
                }
                C15126d dVar2 = new C15126d(-2, "-2:google details doesn't has this product.");
                C15253a.m28071a().mo24705e().mo24725c("BillingManager: onQuerySkuDetailsSuccess but doesn't contain %s", str);
                mo24525a(str, orderData, dVar2);
            }

            @Override // com.android.billingclient.api.AbstractC2250m
            /* renamed from: b */
            public final void mo6216b(final C2242h hVar, List<SkuDetails> list) {
                C15198b a = C15198b.m28002a();
                int i = i;
                C2242h hVar2 = hVar;
                JSONObject jSONObject = new JSONObject();
                a.add(jSONObject, "retry_count", (long) i);
                if (hVar != null) {
                    a.add(jSONObject, "cur_result_code", (long) hVar.f6732a);
                    a.add(jSONObject, "cur_result_message", hVar.f6733b);
                } else {
                    a.add(jSONObject, "cur_result_code", -1L);
                    a.add(jSONObject, "cur_result_message", "unknown");
                }
                if (hVar2 != null) {
                    a.add(jSONObject, "pre_result_code", (long) hVar.f6732a);
                    a.add(jSONObject, "pre_result_message", hVar.f6733b);
                } else {
                    a.add(jSONObject, "pre_result_code", -1L);
                    a.add(jSONObject, "pre_result_message", "unknown");
                }
                a.add(jSONObject, "payment_method", IapPaymentMethod.GOOGLE.channelName);
                C15253a.m28071a().mo24710j().mo12362a("retry_query_sku_details_event", jSONObject);
                if (hVar.f6732a == 0) {
                    m27955a(list);
                } else if (i != 0) {
                    C15126d a2 = C15199c.m28008a(hVar);
                    C15253a.m28071a().mo24705e().mo24725c("BillingManager: querySkuDetailsAsync before execute new purchase had error, result: %s", a2);
                    mo24525a(str, orderData, a2);
                } else if (hVar.f6732a == -3) {
                    C15165a.this.mo24509a(activity, lVar, str, orderData, aVar, i + 1, hVar);
                } else if (hVar.f6732a == -1) {
                    C15165a.this.mo24516a(new AbstractC15181b() {
                        /* class com.bytedance.globalpayment.iap.google.C15165a.C151769.C151771 */

                        static {
                            Covode.recordClassIndex(17357);
                        }

                        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
                        /* renamed from: a */
                        public final void mo24522a() {
                            C15165a.this.mo24509a(activity, lVar, str, orderData, aVar, i + 1, hVar);
                        }

                        @Override // com.bytedance.globalpayment.iap.google.p1066b.AbstractC15181b
                        /* renamed from: a */
                        public final void mo24523a(C15126d dVar) {
                            C15126d a = C15199c.m28008a(hVar);
                            C15253a.m28071a().mo24705e().mo24725c("BillingManager: querySkuDetailsAsync before execute new purchase had error, result: %s", a);
                            C151769 r2 = C151769.this;
                            r2.mo24525a(str, orderData, a);
                        }
                    });
                } else if (TextUtils.equals("An internal error occurred.", hVar.f6733b)) {
                    C15165a.this.mo24509a(activity, lVar, str, orderData, aVar, i + 1, hVar);
                } else {
                    C15126d a3 = C15199c.m28008a(hVar);
                    C15253a.m28071a().mo24705e().mo24725c("BillingManager: querySkuDetailsAsync before execute new purchase had error, result: %s", a3);
                    mo24525a(str, orderData, a3);
                }
            }

            /* renamed from: a */
            public final void mo24525a(String str, OrderData orderData, C15126d dVar) {
                C15198b.m28002a().mo24569a(str, orderData.getOrderId(), orderData.getIapPayRequest().f36917b, orderData.getUserId(), dVar);
                AbstractC15180a aVar = aVar;
                if (aVar != null) {
                    aVar.mo24528a(dVar, null, null);
                }
                C15165a.this.f37008i.compareAndSet(true, false);
            }
        });
    }
}
