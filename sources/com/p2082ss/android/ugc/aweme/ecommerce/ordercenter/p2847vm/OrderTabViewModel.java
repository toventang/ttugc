package com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.p2847vm;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.bytedance.services.apm.api.C22708a;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.C43612a;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.EntranceData;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.ListOrderTabData;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.ListOrderTabResponse;
import com.p2082ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.OrderListTabInfo;
import java.util.List;
import p4560f.p4561a.p4586g.AbstractC88922b;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.vm.OrderTabViewModel */
public final class OrderTabViewModel extends AbstractC1174ac {

    /* renamed from: d */
    public static final C44623a f104094d = new C44623a((byte) 0);

    /* renamed from: a */
    Keva f104095a;

    /* renamed from: b */
    public final C1213t<List<EntranceData>> f104096b;

    /* renamed from: c */
    public final C1213t<List<OrderListTabInfo>> f104097c;

    /* renamed from: e */
    private final Keva.OnChangeListener f104098e;

    static {
        Covode.recordClassIndex(53001);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.vm.OrderTabViewModel$a */
    public static final class C44623a {
        static {
            Covode.recordClassIndex(53002);
        }

        private C44623a() {
        }

        public /* synthetic */ C44623a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.vm.OrderTabViewModel$c */
    public static final class C44625c extends AbstractC88922b<ListOrderTabResponse> {

        /* renamed from: a */
        final /* synthetic */ OrderTabViewModel f104100a;

        static {
            Covode.recordClassIndex(53004);
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onComplete() {
            dispose();
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C44625c(OrderTabViewModel orderTabViewModel) {
            this.f104100a = orderTabViewModel;
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
            dispose();
        }

        @Override // p4560f.p4561a.AbstractC88986z
        public final /* synthetic */ void onNext(Object obj) {
            C43612a aVar = (C43612a) obj;
            C89219l.m154721d(aVar, "");
            if (aVar.isCodeOK() && aVar.data != null) {
                this.f104100a.f104095a.storeString("list_order_tab_data", new C27910f().mo46674b(aVar.data));
            }
            dispose();
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        super.onCleared();
        this.f104095a.unRegisterChangeListener(this.f104098e);
    }

    public OrderTabViewModel() {
        C44624b bVar = new C44624b(this);
        this.f104098e = bVar;
        Keva repo = Keva.getRepo("ec_order_center_tab_data");
        C89219l.m154716b(repo, "");
        this.f104095a = repo;
        ListOrderTabData a = mo75727a();
        C1213t<List<EntranceData>> tVar = new C1213t<>();
        tVar.setValue(a.getEntrances());
        this.f104096b = tVar;
        C1213t<List<OrderListTabInfo>> tVar2 = new C1213t<>();
        tVar2.setValue(a.getTabs());
        this.f104097c = tVar2;
        this.f104095a.registerChangeListener(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final ListOrderTabData mo75727a() {
        try {
            Object a = new C27910f().mo46670a(this.f104095a.getString("list_order_tab_data", "{}"), ListOrderTabData.class);
            C89219l.m154716b(a, "");
            return (ListOrderTabData) a;
        } catch (Throwable th) {
            C22708a.m42802a(th);
            return new ListOrderTabData(C89086z.INSTANCE, C89086z.INSTANCE);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.ordercenter.vm.OrderTabViewModel$b */
    static final class C44624b implements Keva.OnChangeListener {

        /* renamed from: a */
        final /* synthetic */ OrderTabViewModel f104099a;

        static {
            Covode.recordClassIndex(53003);
        }

        C44624b(OrderTabViewModel orderTabViewModel) {
            this.f104099a = orderTabViewModel;
        }

        @Override // com.bytedance.keva.Keva.OnChangeListener
        public final void onChanged(Keva keva, String str) {
            if ("list_order_tab_data" == str) {
                OrderTabViewModel orderTabViewModel = this.f104099a;
                ListOrderTabData a = orderTabViewModel.mo75727a();
                if (!C89219l.m154714a(a.getEntrances(), orderTabViewModel.f104096b.getValue())) {
                    orderTabViewModel.f104096b.postValue(a.getEntrances());
                }
                if (!C89219l.m154714a(a.getTabs(), orderTabViewModel.f104097c.getValue())) {
                    orderTabViewModel.f104097c.postValue(a.getTabs());
                }
            }
        }
    }
}
