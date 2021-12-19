package com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a;

import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.globalpayment.iap.common.ability.C15122b;
import com.bytedance.globalpayment.iap.common.ability.C15126d;
import com.bytedance.globalpayment.iap.common.ability.model.OrderInfo;
import com.bytedance.globalpayment.iap.common.ability.p1054c.AbstractC15125a;
import com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15155f;
import com.bytedance.globalpayment.iap.model.AbsIapProduct;
import com.bytedance.globalpayment.iap.model.IapChannelUserData;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import com.bytedance.globalpayment.payment.common.lib.p1078h.C15253a;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* renamed from: com.bytedance.globalpayment.iap.common.ability.g.a.e */
public final class C15140e implements AbstractC15155f {

    /* renamed from: a */
    private AbstractC15125a f36959a;

    /* renamed from: b */
    private Set<AbstractC15125a> f36960b;

    static {
        Covode.recordClassIndex(17308);
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15155f
    /* renamed from: a */
    public final void mo24411a(IapPaymentMethod iapPaymentMethod, C15126d dVar) {
        if (m27836d()) {
            mo24418b(iapPaymentMethod, dVar);
        } else {
            C15253a.m28071a().mo24703c().mo24720a().execute(new RunnableC15142f(this, iapPaymentMethod, dVar));
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15155f
    /* renamed from: a */
    public final void mo24412a(IapPaymentMethod iapPaymentMethod, C15126d dVar, List<AbsIapProduct> list) {
        if (m27836d()) {
            mo24408a(dVar, list);
        } else {
            C15253a.m28071a().mo24703c().mo24720a().execute(new RunnableC15145i(this, iapPaymentMethod, dVar, list));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24413a(List<AbsIapProduct> list) {
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (AbsIapProduct absIapProduct : list) {
                jSONArray.put(absIapProduct.getProductId());
            }
        }
        C15122b.m27797e().mo24382b();
        Set<AbstractC15125a> set = this.f36960b;
        if (set != null) {
            Iterator<AbstractC15125a> it = set.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: d */
    private static boolean m27836d() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24404a() {
        C15122b.m27797e().mo24382b();
        Set<AbstractC15125a> set = this.f36960b;
        if (set != null) {
            Iterator<AbstractC15125a> it = set.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo24414b() {
        Set<AbstractC15125a> set = this.f36960b;
        if (set != null) {
            Iterator<AbstractC15125a> it = set.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo24420c() {
        Set<AbstractC15125a> set = this.f36960b;
        if (set != null) {
            Iterator<AbstractC15125a> it = set.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.globalpayment.iap.common.ability.g.a.e$1 */
    public static /* synthetic */ class C151411 {

        /* renamed from: a */
        static final /* synthetic */ int[] f36961a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
                r0 = 17309(0x439d, float:2.4255E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bytedance.globalpayment.iap.common.ability.model.enums.PayType[] r0 = com.bytedance.globalpayment.iap.common.ability.model.enums.PayType.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15140e.C151411.f36961a = r2
                com.bytedance.globalpayment.iap.common.ability.model.enums.PayType r0 = com.bytedance.globalpayment.iap.common.ability.model.enums.PayType.PRE     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r2 = com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15140e.C151411.f36961a     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bytedance.globalpayment.iap.common.ability.model.enums.PayType r0 = com.bytedance.globalpayment.iap.common.ability.model.enums.PayType.EXTRA_QUERY     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                int[] r2 = com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15140e.C151411.f36961a     // Catch:{ NoSuchFieldError -> 0x002d }
                com.bytedance.globalpayment.iap.common.ability.model.enums.PayType r0 = com.bytedance.globalpayment.iap.common.ability.model.enums.PayType.EXTRA_TOKEN     // Catch:{ NoSuchFieldError -> 0x002d }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002d }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002d }
            L_0x002d:
                int[] r2 = com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15140e.C151411.f36961a     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.bytedance.globalpayment.iap.common.ability.model.enums.PayType r0 = com.bytedance.globalpayment.iap.common.ability.model.enums.PayType.CAIJING_TOKEN     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15140e.C151411.f36961a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.bytedance.globalpayment.iap.common.ability.model.enums.PayType r0 = com.bytedance.globalpayment.iap.common.ability.model.enums.PayType.CAIJING_CALLBACK     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.globalpayment.iap.common.ability.p1058g.p1059a.C15140e.C151411.<clinit>():void");
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15155f
    /* renamed from: a */
    public final void mo24405a(AbstractC15125a aVar) {
        AbstractC15125a aVar2 = this.f36959a;
        if (aVar != aVar2) {
            if (aVar2 == null) {
                this.f36959a = aVar;
                return;
            }
            if (this.f36960b == null) {
                HashSet hashSet = new HashSet();
                this.f36960b = hashSet;
                hashSet.add(this.f36959a);
            }
            this.f36960b.add(aVar);
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15155f
    /* renamed from: b */
    public final void mo24415b(AbstractC15125a aVar) {
        Set<AbstractC15125a> set = this.f36960b;
        if (set != null) {
            set.remove(aVar);
            if (this.f36960b.size() == 0) {
                this.f36960b = null;
            }
        }
        if (aVar == this.f36959a) {
            this.f36959a = null;
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15155f
    /* renamed from: a */
    public final void mo24410a(OrderInfo orderInfo) {
        if (m27836d()) {
            mo24404a();
        } else {
            C15253a.m28071a().mo24703c().mo24720a().execute(new RunnableC15144h(this, orderInfo));
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15155f
    /* renamed from: a */
    public final void mo24406a(C15126d dVar, OrderInfo orderInfo) {
        if (m27836d()) {
            mo24416b(dVar, orderInfo);
        } else {
            C15253a.m28071a().mo24703c().mo24720a().execute(new RunnableC15143g(this, dVar, orderInfo));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo24416b(C15126d dVar, OrderInfo orderInfo) {
        C15122b.m27797e().mo24382b();
        int i = C151411.f36961a[dVar.f36930c.ordinal()];
        if (i == 1) {
            Set<AbstractC15125a> set = this.f36960b;
            if (set != null) {
                Iterator<AbstractC15125a> it = set.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                return;
            }
            AbstractC15125a aVar = this.f36959a;
        } else if (i == 2 || i == 3 || i == 4 || i == 5) {
            Set<AbstractC15125a> set2 = this.f36960b;
            if (set2 != null) {
                for (AbstractC15125a aVar2 : set2) {
                    aVar2.mo12345b(dVar, orderInfo);
                }
                return;
            }
            AbstractC15125a aVar3 = this.f36959a;
            if (aVar3 != null) {
                aVar3.mo12345b(dVar, orderInfo);
            }
        } else {
            Set<AbstractC15125a> set3 = this.f36960b;
            if (set3 != null) {
                for (AbstractC15125a aVar4 : set3) {
                    aVar4.mo12341a(dVar, orderInfo);
                }
                return;
            }
            AbstractC15125a aVar5 = this.f36959a;
            if (aVar5 != null) {
                aVar5.mo12341a(dVar, orderInfo);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo24421c(C15126d dVar, List<AbsIapProduct> list) {
        if (list != null) {
            JSONArray jSONArray = new JSONArray();
            for (AbsIapProduct absIapProduct : list) {
                jSONArray.put(absIapProduct.getProductId());
            }
        }
        C15122b.m27797e().mo24382b();
        Set<AbstractC15125a> set = this.f36960b;
        if (set != null) {
            for (AbstractC15125a aVar : set) {
                aVar.mo12346b(dVar, list);
            }
            return;
        }
        AbstractC15125a aVar2 = this.f36959a;
        if (aVar2 != null) {
            aVar2.mo12346b(dVar, list);
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15155f
    /* renamed from: a */
    public final void mo24407a(C15126d dVar, IapChannelUserData iapChannelUserData) {
        if (m27836d()) {
            mo24420c();
        } else {
            C15253a.m28071a().mo24703c().mo24720a().execute(new RunnableC15149m(this, dVar, iapChannelUserData));
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15155f
    /* renamed from: b */
    public final void mo24417b(C15126d dVar, List<AbsIapProduct> list) {
        if (m27836d()) {
            mo24421c(dVar, list);
        } else {
            C15253a.m28071a().mo24703c().mo24720a().execute(new RunnableC15146j(this, dVar, list));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo24408a(C15126d dVar, List<AbsIapProduct> list) {
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            for (AbsIapProduct absIapProduct : list) {
                jSONArray.put(absIapProduct.getProductId());
            }
        }
        C15122b.m27797e().mo24382b();
        Set<AbstractC15125a> set = this.f36960b;
        if (set != null) {
            for (AbstractC15125a aVar : set) {
                aVar.mo12342a(dVar, list);
            }
            return;
        }
        AbstractC15125a aVar2 = this.f36959a;
        if (aVar2 != null) {
            aVar2.mo12342a(dVar, list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo24418b(IapPaymentMethod iapPaymentMethod, C15126d dVar) {
        C15122b.m27797e().mo24382b();
        Set<AbstractC15125a> set = this.f36960b;
        if (set != null) {
            for (AbstractC15125a aVar : set) {
                aVar.mo12343a(iapPaymentMethod, dVar);
            }
            return;
        }
        AbstractC15125a aVar2 = this.f36959a;
        if (aVar2 != null) {
            aVar2.mo12343a(iapPaymentMethod, dVar);
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15155f
    /* renamed from: a */
    public final void mo24409a(C15126d dVar, boolean z, List<AbsIapProduct> list) {
        if (m27836d()) {
            mo24413a(list);
        } else {
            C15253a.m28071a().mo24703c().mo24720a().execute(new RunnableC15148l(this, dVar, z, list));
        }
    }

    @Override // com.bytedance.globalpayment.iap.common.ability.p1058g.p1060b.AbstractC15155f
    /* renamed from: b */
    public final void mo24419b(IapPaymentMethod iapPaymentMethod, C15126d dVar, List<String> list) {
        if (m27836d()) {
            mo24414b();
        } else {
            C15253a.m28071a().mo24703c().mo24720a().execute(new RunnableC15147k(this, iapPaymentMethod, dVar, list));
        }
    }
}
