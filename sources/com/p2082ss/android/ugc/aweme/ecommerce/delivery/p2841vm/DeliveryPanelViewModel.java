package com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm;

import android.content.Context;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Address;
import com.p2082ss.android.ugc.aweme.ecommerce.address.dto.Region;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2839b.C44384a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.api.DeliveryApi;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44454a;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44455b;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44457d;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45264j;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel */
public final class DeliveryPanelViewModel extends JediViewModel<DeliveryPanelState> {

    /* renamed from: a */
    public Parcelable f103666a;

    /* renamed from: b */
    public AbstractC89171a<C89391z> f103667b = C44474h.f103685a;

    /* renamed from: c */
    public AbstractC89171a<Boolean> f103668c = C44473g.f103684a;

    /* renamed from: d */
    public C44454a f103669d;

    static {
        Covode.recordClassIndex(52811);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel$h */
    static final class C44474h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C44474h f103685a = new C44474h();

        static {
            Covode.recordClassIndex(52821);
        }

        C44474h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel$g */
    static final class C44473g extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C44473g f103684a = new C44473g();

        static {
            Covode.recordClassIndex(52820);
        }

        C44473g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    /* renamed from: a */
    static boolean m87151a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.af' to match base method */
    @Override // com.bytedance.jedi.arch.JediViewModel
    /* renamed from: d */
    public final /* synthetic */ DeliveryPanelState mo23027d() {
        return new DeliveryPanelState(null, false, null, null, null, 0, null, null, 255, null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel$d */
    static final class C44470d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DeliveryPanelViewModel f103679a;

        static {
            Covode.recordClassIndex(52817);
        }

        C44470d(DeliveryPanelViewModel deliveryPanelViewModel) {
            this.f103679a = deliveryPanelViewModel;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f103679a.mo75474a(3);
        }
    }

    /* renamed from: a */
    public final void mo75478a(AbstractC89171a<Boolean> aVar) {
        C89219l.m154721d(aVar, "");
        this.f103668c = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel$a */
    public static final class C44465a extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DeliveryPanelViewModel f103670a;

        static {
            Covode.recordClassIndex(52812);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44465a(DeliveryPanelViewModel deliveryPanelViewModel) {
            super(1);
            this.f103670a = deliveryPanelViewModel;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel$a$a */
        static final class C44466a extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, DeliveryPanelState> {

            /* renamed from: a */
            public static final C44466a f103671a = new C44466a();

            static {
                Covode.recordClassIndex(52813);
            }

            C44466a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ DeliveryPanelState invoke(DeliveryPanelState deliveryPanelState) {
                DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
                C89219l.m154721d(deliveryPanelState2, "");
                return DeliveryPanelState.copy$default(deliveryPanelState2, null, true, null, null, null, 0, null, null, 253, null);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(DeliveryPanelState deliveryPanelState) {
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            C89219l.m154721d(deliveryPanelState2, "");
            if (deliveryPanelState2.getSelectedLogistic() != null) {
                this.f103670a.mo33689c(C44466a.f103671a);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel$b */
    static final class C44467b extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, DeliveryPanelState> {

        /* renamed from: a */
        final /* synthetic */ EnumC44478a f103672a;

        static {
            Covode.recordClassIndex(52814);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44467b(EnumC44478a aVar) {
            super(1);
            this.f103672a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ DeliveryPanelState invoke(DeliveryPanelState deliveryPanelState) {
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            C89219l.m154721d(deliveryPanelState2, "");
            return DeliveryPanelState.copy$default(deliveryPanelState2, new C44479b(this.f103672a), false, null, null, null, 0, null, null, 254, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel$i */
    public static final class C44475i extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, DeliveryPanelState> {

        /* renamed from: a */
        final /* synthetic */ LogisticDTO f103686a;

        static {
            Covode.recordClassIndex(52822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44475i(LogisticDTO logisticDTO) {
            super(1);
            this.f103686a = logisticDTO;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ DeliveryPanelState invoke(DeliveryPanelState deliveryPanelState) {
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            C89219l.m154721d(deliveryPanelState2, "");
            return DeliveryPanelState.copy$default(deliveryPanelState2, null, false, this.f103686a, null, null, 0, null, null, 251, null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel$k */
    public static final class C44477k extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, DeliveryPanelState> {

        /* renamed from: a */
        final /* synthetic */ int f103688a;

        static {
            Covode.recordClassIndex(52824);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44477k(int i) {
            super(1);
            this.f103688a = i;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ DeliveryPanelState invoke(DeliveryPanelState deliveryPanelState) {
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            C89219l.m154721d(deliveryPanelState2, "");
            return DeliveryPanelState.copy$default(deliveryPanelState2, null, false, null, null, null, this.f103688a, null, null, 223, null);
        }
    }

    /* renamed from: a */
    public final void mo75474a(int i) {
        mo33689c(new C44477k(i));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel$c */
    static final class C44468c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ DeliveryPanelViewModel f103673a;

        /* renamed from: b */
        final /* synthetic */ DeliveryPanelStarter.EnterParamForProductDetailPage f103674b;

        static {
            Covode.recordClassIndex(52815);
        }

        C44468c(DeliveryPanelViewModel deliveryPanelViewModel, DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage) {
            this.f103673a = deliveryPanelViewModel;
            this.f103674b = enterParamForProductDetailPage;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            final C43612a aVar = (C43612a) obj;
            final T t = aVar.data;
            if (!aVar.isCodeOK() || t == null) {
                this.f103673a.mo75474a(3);
                return;
            }
            final ArrayList arrayList = new ArrayList();
            arrayList.addAll(t.f103640a);
            this.f103673a.f103669d = t;
            this.f103673a.mo33689c(new AbstractC89172b<DeliveryPanelState, DeliveryPanelState>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel.C44468c.C444691 */

                /* renamed from: a */
                final /* synthetic */ C44468c f103675a;

                static {
                    Covode.recordClassIndex(52816);
                }

                {
                    this.f103675a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
                    if (r3 == null) goto L_0x0049;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
                    if (r6 != null) goto L_0x004b;
                 */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final /* synthetic */ com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState invoke(com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState r19) {
                    /*
                    // Method dump skipped, instructions count: 238
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel.C44468c.C444691.invoke(java.lang.Object):java.lang.Object");
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel$j */
    static final class C44476j extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, DeliveryPanelState> {

        /* renamed from: a */
        final /* synthetic */ Object f103687a;

        static {
            Covode.recordClassIndex(52823);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44476j(Object obj) {
            super(1);
            this.f103687a = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ DeliveryPanelState invoke(DeliveryPanelState deliveryPanelState) {
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            C89219l.m154721d(deliveryPanelState2, "");
            return DeliveryPanelState.copy$default(deliveryPanelState2, new C44479b(EnumC44478a.BACK_TO_LOGISTIC), false, null, new C44384a(this.f103687a), null, 0, null, null, 246, null);
        }
    }

    /* renamed from: a */
    public final void mo75475a(Context context) {
        Parcelable parcelable = this.f103666a;
        if (parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
            mo33687b_(new C44471e(this, context, parcelable));
        } else if (parcelable instanceof DeliveryPanelStarter.EnterParamForOrderSubmitPage) {
            mo33689c(new C44472f(parcelable));
        } else {
            mo75474a(3);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel$f */
    public static final class C44472f extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, DeliveryPanelState> {

        /* renamed from: a */
        final /* synthetic */ Parcelable f103683a;

        static {
            Covode.recordClassIndex(52819);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44472f(Parcelable parcelable) {
            super(1);
            this.f103683a = parcelable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
            if (r7 == null) goto L_0x0035;
         */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState invoke(com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelState r16) {
            /*
            // Method dump skipped, instructions count: 112
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel.C44472f.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.delivery.vm.DeliveryPanelViewModel$e */
    public static final class C44471e extends AbstractC89220m implements AbstractC89172b<DeliveryPanelState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ DeliveryPanelViewModel f103680a;

        /* renamed from: b */
        final /* synthetic */ Context f103681b;

        /* renamed from: c */
        final /* synthetic */ Parcelable f103682c;

        static {
            Covode.recordClassIndex(52818);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44471e(DeliveryPanelViewModel deliveryPanelViewModel, Context context, Parcelable parcelable) {
            super(1);
            this.f103680a = deliveryPanelViewModel;
            this.f103681b = context;
            this.f103682c = parcelable;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(DeliveryPanelState deliveryPanelState) {
            Object obj;
            Object obj2;
            List<Region> list;
            Address address;
            DeliveryPanelState deliveryPanelState2 = deliveryPanelState;
            C89219l.m154721d(deliveryPanelState2, "");
            DeliveryPanelViewModel deliveryPanelViewModel = this.f103680a;
            DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = (DeliveryPanelStarter.EnterParamForProductDetailPage) this.f103682c;
            C44384a selectedShipToInfo = deliveryPanelState2.getSelectedShipToInfo();
            if (!C58029j.f132253e || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132253e = DeliveryPanelViewModel.m87151a();
            }
            if (!C58029j.f132253e) {
                deliveryPanelViewModel.mo75474a(2);
            } else {
                deliveryPanelViewModel.mo75474a(0);
                String str = null;
                try {
                    obj = C45264j.m87844a().mo46670a(enterParamForProductDetailPage.f103420g, HashMap.class);
                } catch (Exception unused) {
                    obj = null;
                }
                HashMap hashMap = (HashMap) obj;
                String str2 = enterParamForProductDetailPage.f103417d;
                String str3 = enterParamForProductDetailPage.f103418e;
                Integer valueOf = Integer.valueOf(enterParamForProductDetailPage.f103419f);
                Integer valueOf2 = Integer.valueOf(IPdpStarter.C44631a.m87368a(hashMap));
                if (hashMap != null) {
                    obj2 = hashMap.get("author_id");
                } else {
                    obj2 = null;
                }
                List a = C89070n.m154516a(new OrderSKUDTO(str2, str3, valueOf, null, valueOf2, null, null, null, (String) obj2, 232));
                if (selectedShipToInfo.f103498a != null) {
                    C44457d a2 = selectedShipToInfo.mo75409a();
                    if (!(a2 == null || (address = a2.f103650b) == null)) {
                        str = address.f101187a;
                    }
                } else {
                    str = enterParamForProductDetailPage.f103415b;
                }
                if (selectedShipToInfo.f103498a != null) {
                    list = selectedShipToInfo.mo75411b();
                } else {
                    list = enterParamForProductDetailPage.f103416c;
                }
                C89219l.m154721d(a, "");
                DeliveryApi deliveryApi = (DeliveryApi) DeliveryApi.C44450a.f103612a.mo28858a(DeliveryApi.class);
                if (list == null) {
                    list = C89086z.INSTANCE;
                }
                deliveryApi.getLogistics(new C44455b(a, str, list)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C44468c(deliveryPanelViewModel, enterParamForProductDetailPage), new C44470d(deliveryPanelViewModel));
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo75477a(EnumC44478a aVar) {
        C89219l.m154721d(aVar, "");
        mo33689c(new C44467b(aVar));
    }

    /* renamed from: a */
    public final void mo75476a(Context context, Object obj) {
        mo33689c(new C44476j(obj));
        mo75475a(context);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0056, code lost:
        if (r5 != null) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO m87150a(com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.C44454a r5, com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO r6, com.p2082ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter.EnterParamForProductDetailPage r7) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.delivery.p2841vm.DeliveryPanelViewModel.m87150a(com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.a, com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO, com.ss.android.ugc.aweme.ecommerce.delivery.DeliveryPanelStarter$EnterParamForProductDetailPage):com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO");
    }
}
