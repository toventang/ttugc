package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.api.PaymentApi;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoItem;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoRequest;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.BindInfoResponseData;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44073c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44083l;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44090s;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2832a.C44048c;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2832a.C44050d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44057a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44058b;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44061e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44064h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44066j;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.EnumC44266l;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlinx.coroutines.AbstractC89516am;
import p4560f.p4561a.AbstractC88986z;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.C89134h;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel */
public final class PaymentViewModel extends JediViewModel<PaymentState> implements IEventCenter.AbstractC45375b {

    /* renamed from: m */
    public static List<? extends Object> f102645m = C89086z.INSTANCE;

    /* renamed from: n */
    public static final C44028a f102646n = new C44028a((byte) 0);

    /* renamed from: a */
    public AbstractC89172b<? super EnumC44266l, C89391z> f102647a = C44035g.f102663a;

    /* renamed from: b */
    public Address f102648b;

    /* renamed from: c */
    public List<C44090s> f102649c;

    /* renamed from: d */
    public C44161t f102650d;

    /* renamed from: e */
    public boolean f102651e = true;

    /* renamed from: f */
    public final Map<String, Map<String, List<C44084m>>> f102652f = new LinkedHashMap();

    /* renamed from: g */
    public List<? extends Object> f102653g;

    /* renamed from: k */
    public final List<BindInfoItem> f102654k = new ArrayList();

    /* renamed from: l */
    public String f102655l;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$a */
    public static final class C44028a {
        static {
            Covode.recordClassIndex(52333);
        }

        private C44028a() {
        }

        public /* synthetic */ C44028a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m86893a(List<? extends Object> list) {
            C89219l.m154721d(list, "");
            PaymentViewModel.f102645m = list;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$a$a */
        public static final class C44029a extends AbstractC89220m implements AbstractC89172b<Object, Boolean> {

            /* renamed from: a */
            final /* synthetic */ C44086o f102656a;

            static {
                Covode.recordClassIndex(52334);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C44029a(C44086o oVar) {
                super(1);
                this.f102656a = oVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
                if (r4 == false) goto L_0x0034;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
                if ((!p4600h.p4611f.p4613b.C89219l.m154714a((java.lang.Object) r1, (java.lang.Object) false)) == false) goto L_0x002e;
             */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final /* synthetic */ java.lang.Boolean invoke(java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.String r0 = ""
                    p4600h.p4611f.p4613b.C89219l.m154721d(r6, r0)
                    boolean r4 = r6 instanceof com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44058b
                    r3 = 0
                    r2 = 1
                    if (r4 == 0) goto L_0x002e
                    r0 = r6
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e r0 = (com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44061e) r0
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r1 = r0.f102704c
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = r5.f102656a
                    boolean r0 = com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44083l.m86908a(r1, r0)
                    if (r0 != 0) goto L_0x0034
                    r0 = r6
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.b.e r0 = (com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44061e) r0
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.o r0 = r0.f102704c
                    com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.a r0 = r0.f102813t
                    if (r0 == 0) goto L_0x003a
                    java.lang.Boolean r1 = r0.f102725a
                L_0x0023:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                    boolean r0 = p4600h.p4611f.p4613b.C89219l.m154714a(r1, r0)
                    r0 = r0 ^ r2
                    if (r0 != 0) goto L_0x0034
                L_0x002e:
                    boolean r0 = r6 instanceof com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.p2833b.C44061e
                    if (r0 == 0) goto L_0x0035
                    if (r4 != 0) goto L_0x0035
                L_0x0034:
                    r3 = 1
                L_0x0035:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
                    return r0
                L_0x003a:
                    r1 = 0
                    goto L_0x0023
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.C44028a.C44029a.invoke(java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: a */
        public static void m86894a(List<Object> list, C44086o oVar) {
            C89219l.m154721d(list, "");
            C89070n.m154537a((List) list, (AbstractC89172b) new C44029a(oVar));
        }

        /* renamed from: a */
        public static void m86892a(C44064h hVar, C44086o oVar, List<Object> list) {
            ArrayList arrayList;
            boolean z;
            C44073c cVar;
            String str;
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(oVar, "");
            C89219l.m154721d(list, "");
            int indexOf = list.indexOf(hVar) + 1;
            List<C44075e> a = oVar.mo74949a();
            if (a != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = a.iterator();
                while (it.hasNext()) {
                    C44061e a2 = AbstractC44225e.C44226a.m86983a(it.next(), hVar.f102707a);
                    if (a2 != null) {
                        arrayList2.add(a2);
                    }
                }
                arrayList = arrayList2;
            } else {
                arrayList = C89086z.INSTANCE;
            }
            List g = C89070n.m154585g(arrayList);
            String str2 = hVar.f102707a.f102806m;
            if (str2 == null || str2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                g.add(new C44066j(new C44075e("save_element", hVar.f102707a.f102806m, 15870), hVar.f102707a, (byte) 0));
            }
            String str3 = hVar.f102707a.f102812s;
            if (!((str3 == null || str3.length() == 0) && ((cVar = hVar.f102707a.f102814u) == null || (str = cVar.f102734a) == null || str.length() == 0))) {
                g.add(new C44058b(new C44075e("balance_element", hVar.f102707a.f102795b, 15870), hVar.f102707a, (byte) 0));
            }
            list.addAll(indexOf, g);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter.AbstractC45375b
    /* renamed from: a */
    public final void mo74032a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        int hashCode = str.hashCode();
        if (hashCode != -1413704395) {
            if (hashCode == 1150715295 && str.equals("ec_payment_method_activate_clicked")) {
                mo33689c(C44033e.f102661a);
            }
        } else if (str.equals("ec_resend_pay_request")) {
            mo33689c(C44034f.f102662a);
        }
    }

    /* renamed from: a */
    public final void mo74862a(C44086o oVar, String str, List<C44084m> list) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        Map<String, List<C44084m>> map = this.f102652f.get(C89219l.m154704a(oVar.f102794a, (Object) oVar.f102809p));
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        this.f102652f.put(C89219l.m154704a(oVar.f102794a, (Object) oVar.f102809p), map);
        map.put(str, list);
    }

    static {
        Covode.recordClassIndex(52332);
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ PaymentState mo23027d() {
        return new PaymentState(null, null, null, null, false, null, null, false, false, null, 1023, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$c */
    public static final class C44031c implements AbstractC88986z<C43612a<BindInfoResponseData>> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89124d f102659a;

        static {
            Covode.recordClassIndex(52336);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        C44031c(AbstractC89124d dVar) {
            this.f102659a = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(C43612a<BindInfoResponseData> aVar) {
            C89219l.m154721d(aVar, "");
            this.f102659a.resumeWith(C89379q.m157068constructorimpl(aVar));
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            this.f102659a.resumeWith(C89379q.m157068constructorimpl(C89382r.m154941a(th)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$g */
    static final class C44035g extends AbstractC89220m implements AbstractC89172b<EnumC44266l, C89391z> {

        /* renamed from: a */
        public static final C44035g f102663a = new C44035g();

        static {
            Covode.recordClassIndex(52340);
        }

        C44035g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(EnumC44266l lVar) {
            C89219l.m154721d(lVar, "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo74863a(boolean z) {
        mo33689c(new C44041l(this, z));
    }

    /* renamed from: b */
    public final void mo74865b(boolean z) {
        mo33689c(new C44040k(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$d */
    static final class C44032d extends AbstractC89220m implements AbstractC89172b<PaymentState, PaymentState> {

        /* renamed from: a */
        public static final C44032d f102660a = new C44032d();

        static {
            Covode.recordClassIndex(52337);
        }

        C44032d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            C89219l.m154721d(paymentState2, "");
            return PaymentState.copy$default(paymentState2, null, null, null, null, false, null, null, false, true, null, 767, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$e */
    static final class C44033e extends AbstractC89220m implements AbstractC89172b<PaymentState, PaymentState> {

        /* renamed from: a */
        public static final C44033e f102661a = new C44033e();

        static {
            Covode.recordClassIndex(52338);
        }

        C44033e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            C89219l.m154721d(paymentState2, "");
            return PaymentState.copy$default(paymentState2, null, null, null, null, false, null, null, true, false, null, 895, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$f */
    static final class C44034f extends AbstractC89220m implements AbstractC89172b<PaymentState, PaymentState> {

        /* renamed from: a */
        public static final C44034f f102662a = new C44034f();

        static {
            Covode.recordClassIndex(52339);
        }

        C44034f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            C89219l.m154721d(paymentState2, "");
            return PaymentState.copy$default(paymentState2, null, null, null, null, false, null, null, false, false, new Object(), 511, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$k */
    public static final class C44040k extends AbstractC89220m implements AbstractC89172b<PaymentState, PaymentState> {

        /* renamed from: a */
        final /* synthetic */ boolean f102671a;

        static {
            Covode.recordClassIndex(52345);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44040k(boolean z) {
            super(1);
            this.f102671a = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            C89219l.m154721d(paymentState2, "");
            return PaymentState.copy$default(paymentState2, null, null, null, null, this.f102671a, null, null, false, false, null, 1007, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$n */
    public static final class C44043n extends AbstractC89220m implements AbstractC89172b<PaymentState, PaymentState> {

        /* renamed from: a */
        public static final C44043n f102675a = new C44043n();

        static {
            Covode.recordClassIndex(52348);
        }

        C44043n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            C89219l.m154721d(paymentState2, "");
            return PaymentState.copy$default(paymentState2, null, null, null, UUID.randomUUID().toString(), false, null, null, false, false, null, 1015, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$o */
    public static final class C44044o extends AbstractC89220m implements AbstractC89172b<PaymentState, PaymentState> {

        /* renamed from: a */
        public static final C44044o f102676a = new C44044o();

        static {
            Covode.recordClassIndex(52349);
        }

        C44044o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            PaymentState paymentState2 = paymentState;
            C89219l.m154721d(paymentState2, "");
            return PaymentState.copy$default(paymentState2, null, null, null, UUID.randomUUID().toString(), false, null, null, false, false, null, 1015, null);
        }
    }

    /* renamed from: a */
    public static boolean m86882a(C44086o oVar) {
        T t;
        C44086o oVar2;
        List<? extends Object> list = f102645m;
        if (list == null || list.isEmpty() || oVar == null) {
            return false;
        }
        Iterator<T> it = f102645m.iterator();
        while (true) {
            String str = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (!(next instanceof C44064h)) {
                t = null;
            } else {
                t = next;
            }
            T t2 = t;
            if (!(t2 == null || (oVar2 = t2.f102707a) == null)) {
                str = oVar2.f102794a;
            }
            if (C89219l.m154714a((Object) str, (Object) oVar.f102794a)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$b */
    static final class C44030b extends AbstractC89220m implements AbstractC89172b<PaymentState, PaymentState> {

        /* renamed from: a */
        final /* synthetic */ C44086o f102657a;

        /* renamed from: b */
        final /* synthetic */ C44086o f102658b;

        static {
            Covode.recordClassIndex(52335);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44030b(C44086o oVar, C44086o oVar2) {
            super(1);
            this.f102657a = oVar;
            this.f102658b = oVar2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            List list;
            PaymentState paymentState2 = paymentState;
            C89219l.m154721d(paymentState2, "");
            List g = C89070n.m154585g((Collection) paymentState2.getPaymentList());
            Object obj = null;
            C44028a.m86894a(g, null);
            Iterator it = g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if ((next instanceof C44064h) && C44083l.m86908a(((C44064h) next).f102707a, this.f102657a)) {
                    obj = next;
                    break;
                }
            }
            int a = C89070n.m154546a(g, obj);
            List<C44075e> a2 = this.f102658b.mo74949a();
            if (a2 != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it2 = a2.iterator();
                while (it2.hasNext()) {
                    C44061e a3 = AbstractC44225e.C44226a.m86983a(it2.next(), this.f102657a);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                list = C89070n.m154585g((Collection) arrayList);
            } else {
                list = new ArrayList();
            }
            if (C80538hl.m139614a(this.f102658b.f102806m)) {
                list.add(new C44066j(new C44075e("save_element", this.f102658b.f102806m, 15870), this.f102657a, (byte) 0));
            }
            g.addAll(a + 1, list);
            return PaymentState.copy$default(paymentState2, null, g, null, null, false, null, null, false, false, null, 1021, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$h */
    static final class C44036h extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f102664a;

        /* renamed from: b */
        final /* synthetic */ PaymentViewModel f102665b;

        /* renamed from: c */
        final /* synthetic */ List f102666c;

        static {
            Covode.recordClassIndex(52341);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44036h(PaymentViewModel paymentViewModel, List list, AbstractC89124d dVar) {
            super(2, dVar);
            this.f102665b = paymentViewModel;
            this.f102666c = list;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C44036h(this.f102665b, this.f102666c, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C44036h) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f102664a;
            if (i == 0) {
                C89382r.m154942a(obj);
                BindInfoRequest bindInfoRequest = new BindInfoRequest(this.f102666c);
                this.f102664a = 1;
                C89134h hVar = new C89134h(C89099b.m154605a(this));
                C89219l.m154721d(bindInfoRequest, "");
                ((PaymentApi) PaymentApi.C44053a.f102695a.mo28858a(PaymentApi.class)).getBindInfo(bindInfoRequest).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143062b(new C44031c(hVar));
                obj = hVar.mo143576a();
                if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                    C89219l.m154721d(this, "");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C43612a aVar2 = (C43612a) obj;
            T t = aVar2.data;
            if (!aVar2.isCodeOK() || t == null) {
                this.f102665b.mo33689c(C440371.f102667a);
                return C89391z.f203057a;
            }
            PaymentViewModel paymentViewModel = this.f102665b;
            paymentViewModel.f102654k.clear();
            List<BindInfoItem> bindInfoList = t.getBindInfoList();
            if (bindInfoList != null) {
                Iterator<T> it = bindInfoList.iterator();
                while (it.hasNext()) {
                    paymentViewModel.f102654k.add(it.next());
                }
            }
            paymentViewModel.mo33689c(new C44042m(paymentViewModel));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$i */
    static final class C44038i extends AbstractC89220m implements AbstractC89172b<PaymentState, PaymentState> {

        /* renamed from: a */
        final /* synthetic */ C44052aa f102668a;

        static {
            Covode.recordClassIndex(52343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44038i(C44052aa aaVar) {
            super(1);
            this.f102668a = aaVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            C44064h hVar;
            PaymentState paymentState2 = paymentState;
            C89219l.m154721d(paymentState2, "");
            int indexOf = paymentState2.getPaymentList().indexOf(this.f102668a);
            List g = C89070n.m154585g((Collection) paymentState2.getPaymentList());
            g.remove(indexOf);
            int i = indexOf - 1;
            Object obj = g.get(i);
            if (obj instanceof C44064h) {
                g.set(i, C44064h.m86903a(hVar.f102707a, hVar.f102708b, ((C44064h) obj).f102709c));
            }
            List<C44086o> list = this.f102668a.f102693b;
            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C44064h(it.next()));
            }
            g.addAll(indexOf, arrayList);
            int i2 = 0;
            for (Object obj2 : g) {
                if (obj2 instanceof C44064h) {
                    ((C44064h) obj2).f102709c = i2;
                    i2++;
                }
            }
            return PaymentState.copy$default(paymentState2, null, g, null, null, false, null, null, false, false, null, 1021, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$m */
    public static final class C44042m extends AbstractC89220m implements AbstractC89172b<PaymentState, PaymentState> {

        /* renamed from: a */
        final /* synthetic */ PaymentViewModel f102674a;

        static {
            Covode.recordClassIndex(52347);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44042m(PaymentViewModel paymentViewModel) {
            super(1);
            this.f102674a = paymentViewModel;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ PaymentState invoke(PaymentState paymentState) {
            String str;
            T t;
            String paymentMethodBindUrl;
            PaymentState paymentState2 = paymentState;
            C89219l.m154721d(paymentState2, "");
            if (paymentState2.getShowLoading() && (!this.f102674a.f102654k.isEmpty()) && (str = this.f102674a.f102655l) != null && str.length() != 0) {
                Iterator<T> it = this.f102674a.f102654k.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C89219l.m154714a((Object) t.getPaymentMethodId(), (Object) this.f102674a.f102655l)) {
                        break;
                    }
                }
                T t2 = t;
                if (!(t2 == null || (paymentMethodBindUrl = t2.getPaymentMethodBindUrl()) == null || paymentMethodBindUrl.length() <= 0)) {
                    EventCenter.m87158a().mo75479a("ec_payment_method_activate_clicked", "{}");
                    SmartRouter.buildRoute(C17867d.m33078a(), paymentMethodBindUrl).open();
                }
            }
            return PaymentState.copy$default(paymentState2, null, null, null, null, false, null, null, false, false, null, 767, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$j */
    static final class C44039j extends AbstractC89220m implements AbstractC89172b<PaymentState, PaymentState> {

        /* renamed from: a */
        final /* synthetic */ PaymentViewModel f102669a;

        /* renamed from: b */
        final /* synthetic */ C44086o f102670b;

        static {
            Covode.recordClassIndex(52344);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44039j(PaymentViewModel paymentViewModel, C44086o oVar) {
            super(1);
            this.f102669a = paymentViewModel;
            this.f102670b = oVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x012d, code lost:
            if (r6 == null) goto L_0x012f;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentState invoke(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentState r22) {
            /*
            // Method dump skipped, instructions count: 336
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.C44039j.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel$l */
    public static final class C44041l extends AbstractC89220m implements AbstractC89172b<PaymentState, PaymentState> {

        /* renamed from: a */
        final /* synthetic */ PaymentViewModel f102672a;

        /* renamed from: b */
        final /* synthetic */ boolean f102673b;

        static {
            Covode.recordClassIndex(52346);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44041l(PaymentViewModel paymentViewModel, boolean z) {
            super(1);
            this.f102672a = paymentViewModel;
            this.f102673b = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ab, code lost:
            if (r11 == null) goto L_0x00ad;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentState invoke(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentState r42) {
            /*
            // Method dump skipped, instructions count: 947
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.PaymentViewModel.C44041l.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: a */
    public static int m86880a(C44086o oVar, List<? extends Object> list) {
        T t;
        T t2;
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(list, "");
        Iterator<T> it = list.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if ((t2 instanceof C44064h) && C44083l.m86908a(t2.f102707a, oVar)) {
                break;
            }
        }
        if (t2 instanceof C44064h) {
            t = t2;
        }
        T t3 = t;
        if (t3 != null) {
            return t3.f102709c;
        }
        return 0;
    }

    /* renamed from: b */
    public final List<C44084m> mo74864b(C44086o oVar, String str) {
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(str, "");
        Map<String, List<C44084m>> map = this.f102652f.get(C89219l.m154704a(oVar.f102794a, (Object) oVar.f102809p));
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        List<C44084m> list = map.get(str);
        if (list == null) {
            return C89086z.INSTANCE;
        }
        return list;
    }

    /* renamed from: a */
    public static List<C44084m> m86881a(List<C44075e> list, Address address) {
        Collection a;
        int i;
        C44084m mVar;
        String str;
        String str2;
        List<Region> list2 = address.f101190d;
        int i2 = 0;
        if (list2 == null || list2.isEmpty() || address.f101189c == null) {
            return C89086z.INSTANCE;
        }
        List g = C89070n.m154585g((Collection) address.f101190d);
        g.add(0, address.f101189c);
        if (list == null) {
            return C89086z.INSTANCE;
        }
        int i3 = 10;
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            String str3 = t.f102742a;
            if (str3 == null) {
                a = C89086z.INSTANCE;
            } else {
                int hashCode = str3.hashCode();
                if (hashCode != -304863367) {
                    if (hashCode != 1981981399) {
                        if (hashCode == 2002908406 && str3.equals("eg_ccdc_global_billing_address_street_mobile")) {
                            a = C89070n.m154516a(new C44084m(t.f102742a, t.f102747f, address.mo73871a("address"), t.f102752k, null, 16, null));
                        }
                    } else if (str3.equals("eg_ccdc_global_billing_address")) {
                        List<C44075e> list3 = t.f102750i;
                        if (list3 != null) {
                            i = list3.size();
                        } else {
                            i = 0;
                        }
                        List subList = g.subList(i2, i);
                        a = new ArrayList(C89070n.m154526a((Iterable) subList, i3));
                        int i4 = 0;
                        for (Object obj : subList) {
                            int i5 = i4 + 1;
                            if (i4 < 0) {
                                C89070n.m154520a();
                            }
                            Region region = (Region) obj;
                            List<C44075e> list4 = t.f102750i;
                            Boolean bool = null;
                            C44075e eVar = list4 != null ? list4.get(i4) : null;
                            if (i4 == 0) {
                                if (C89219l.m154714a((Object) (eVar != null ? eVar.f102742a : null), (Object) "eg_ccdc_global_billing_address_country_regin")) {
                                    mVar = new C44084m(eVar.f102742a, eVar.f102747f, C89219l.m154704a(C44050d.m86897a(region.f101210b), (Object) ("," + region.f101209a + ',' + region.f101210b)), eVar.f102752k, null, 16, null);
                                    a.add(mVar);
                                    i4 = i5;
                                }
                            }
                            if (eVar != null) {
                                str = eVar.f102742a;
                                str2 = eVar.f102747f;
                            } else {
                                str = null;
                                str2 = null;
                            }
                            String str4 = region.f101209a;
                            if (eVar != null) {
                                bool = eVar.f102752k;
                            }
                            mVar = new C44084m(str, str2, str4, bool, null, 16, null);
                            a.add(mVar);
                            i4 = i5;
                        }
                    }
                } else if (str3.equals("eg_ccdc_global_billing_address_postal_code")) {
                    a = C89070n.m154516a(new C44084m(t.f102742a, t.f102747f, address.mo73871a("zipcode"), t.f102752k, null, 16, null));
                }
                a = C89070n.m154516a(new C44084m(t.f102742a, t.f102747f, address.mo73871a(t.f102742a), t.f102752k, null, 16, null));
            }
            arrayList.add(a);
            i2 = 0;
            i3 = 10;
        }
        return C89070n.m154528a((Iterable) arrayList);
    }

    /* renamed from: a */
    public final String mo74860a(C44086o oVar, String str) {
        List<C44090s> list;
        Price price;
        String priceStr;
        C89219l.m154721d(str, "");
        T t = null;
        if (oVar == null || oVar.f102794a == null || (list = this.f102649c) == null) {
            return str;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C89219l.m154714a((Object) next.f102832a, (Object) oVar.f102794a)) {
                t = next;
                break;
            }
        }
        T t2 = t;
        return (t2 == null || (price = t2.f102833b) == null || (priceStr = price.getPriceStr()) == null) ? str : priceStr;
    }

    /* renamed from: a */
    public final String mo74859a(C44061e eVar, C44086o oVar, List<C44084m> list) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(oVar, "");
        C89219l.m154721d(list, "");
        String a = C44048c.m86895a(eVar.f102703b, oVar, list);
        if (!C89219l.m154714a((Object) a, (Object) "system_error")) {
            return a;
        }
        mo33689c(C44044o.f102676a);
        return "";
    }

    /* renamed from: a */
    public final Map<String, String> mo74861a(C44057a aVar, C44086o oVar, List<C44084m> list) {
        Map<String, String> d = C89041ag.m154431d(C44048c.m86896b(aVar.f102703b, oVar, list));
        boolean z = false;
        for (Map.Entry<String, String> entry : d.entrySet()) {
            if (C89219l.m154714a((Object) entry.getValue(), (Object) "system_error")) {
                d.put(entry.getKey(), "");
                z = true;
            }
        }
        if (z) {
            mo33689c(C44043n.f102675a);
        }
        return d;
    }
}
