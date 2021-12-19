package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.flashsale;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.C45685a;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.C45698b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45687a;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45696g;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.network.BaseResponse;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2875d.p2876a.C45813b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89703z;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89599cu;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.ProductSyncViewModel */
public final class ProductSyncViewModel extends AndroidViewModel {

    /* renamed from: g */
    public static final C45702a f106429g = new C45702a((byte) 0);

    /* renamed from: b */
    public final AbstractC89516am f106430b;

    /* renamed from: c */
    public int f106431c;

    /* renamed from: d */
    final AbstractC89244h f106432d = C89250i.m154773a((AbstractC89171a) C45704c.f106438a);

    /* renamed from: e */
    public C45703b f106433e;

    /* renamed from: f */
    public final C1213t<List<C45687a>> f106434f = new C1213t<>();

    /* renamed from: h */
    private final AbstractC89703z f106435h;

    static {
        Covode.recordClassIndex(54218);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.ProductSyncViewModel$a */
    public static final class C45702a {
        static {
            Covode.recordClassIndex(54219);
        }

        private C45702a() {
        }

        public /* synthetic */ C45702a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.ProductSyncViewModel$c */
    static final class C45704c extends AbstractC89220m implements AbstractC89171a<C45685a> {

        /* renamed from: a */
        public static final C45704c f106438a = new C45704c();

        static {
            Covode.recordClassIndex(54221);
        }

        C45704c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C45685a invoke() {
            return new C45685a();
        }
    }

    @Override // androidx.lifecycle.AbstractC1174ac
    public final void onCleared() {
        this.f106435h.mo143985a((CancellationException) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.ProductSyncViewModel$b */
    public static final class C45703b {

        /* renamed from: a */
        public final List<String> f106436a = new ArrayList();

        /* renamed from: b */
        public final String f106437b;

        static {
            Covode.recordClassIndex(54220);
        }

        public C45703b(String str) {
            C89219l.m154721d(str, "");
            this.f106437b = str;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductSyncViewModel(Application application) {
        super(application);
        C89219l.m154721d(application, "");
        AbstractC89703z a = C89599cu.m155531a();
        this.f106435h = a;
        this.f106430b = C89517an.m155448a(C89652o.f203399a.plus(a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.flashsale.ProductSyncViewModel$d */
    public static final class C45705d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f106439a;

        /* renamed from: b */
        final /* synthetic */ ProductSyncViewModel f106440b;

        /* renamed from: c */
        final /* synthetic */ String f106441c;

        /* renamed from: d */
        final /* synthetic */ List f106442d;

        static {
            Covode.recordClassIndex(54222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45705d(ProductSyncViewModel productSyncViewModel, String str, List list, AbstractC89124d dVar) {
            super(2, dVar);
            this.f106440b = productSyncViewModel;
            this.f106441c = str;
            this.f106442d = list;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C45705d(this.f106440b, this.f106441c, this.f106442d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C45705d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            BaseResponse<C45696g> baseResponse;
            List<C45687a> list;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f106439a;
            if (i == 0) {
                C89382r.m154942a(obj);
                String str = this.f106441c;
                List list2 = this.f106442d;
                this.f106439a = 1;
                obj = C89624i.m155554a(C45813b.f106732a, new C45685a.C45686a((C45685a) this.f106440b.f106432d.getValue(), list2, str, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C45698b bVar = (C45698b) obj;
            if (bVar.f106417b == null && (baseResponse = bVar.f106416a) != null && baseResponse.isSuccess()) {
                this.f106440b.f106431c = 2;
                C45696g data = bVar.f106416a.getData();
                if (!(data == null || (list = data.f106413a) == null || !(!list.isEmpty()))) {
                    this.f106440b.f106434f.setValue(list);
                }
            } else {
                this.f106440b.f106431c = 3;
            }
            if (this.f106440b.f106433e != null) {
                this.f106440b.f106433e = null;
                this.f106440b.mo76994a(this.f106441c, this.f106442d);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo76994a(String str, List<String> list) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(list, "");
        String str2 = null;
        if (this.f106431c == 1) {
            C45703b bVar = this.f106433e;
            if (bVar != null) {
                str2 = bVar.f106437b;
            }
            if (!C89219l.m154714a((Object) str2, (Object) str)) {
                bVar = new C45703b(str);
            }
            C89219l.m154721d(list, "");
            if (bVar.f106436a.isEmpty()) {
                bVar.f106436a.addAll(list);
            } else {
                for (String str3 : list) {
                    if (!bVar.f106436a.contains(str3)) {
                        bVar.f106436a.add(str3);
                    }
                }
            }
            this.f106433e = bVar;
            return;
        }
        this.f106433e = null;
        this.f106431c = 1;
        AbstractC89568bz unused = C89624i.m155555a(this.f106430b, null, null, new C45705d(this, str, list, null), 3);
    }
}
