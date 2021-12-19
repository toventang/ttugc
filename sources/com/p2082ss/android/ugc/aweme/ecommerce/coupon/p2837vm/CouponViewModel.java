package com.p2082ss.android.ugc.aweme.ecommerce.coupon.p2837vm;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.p2835a.C44323a;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.p2836b.C44326a;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.Voucher;
import com.p2082ss.android.ugc.aweme.ecommerce.coupon.repository.dto.VoucherInfo;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.vm.CouponViewModel */
public final class CouponViewModel extends AbstractC1174ac {

    /* renamed from: a */
    public VoucherInfo f103390a;

    /* renamed from: b */
    public final C1213t<Voucher> f103391b = new C1213t<>();

    /* renamed from: c */
    public final C1213t<Price> f103392c = new C1213t<>();

    /* renamed from: d */
    public final C1213t<List<C44326a>> f103393d = new C1213t<>();

    /* renamed from: e */
    public final C1213t<Boolean> f103394e = new C1213t<>();

    /* renamed from: f */
    public final C1213t<Integer> f103395f = new C44338a();

    /* renamed from: g */
    private C44326a f103396g;

    static {
        Covode.recordClassIndex(52664);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.vm.CouponViewModel$a */
    public static final class C44338a extends C1213t<Integer> {

        /* renamed from: a */
        public boolean f103397a = true;

        static {
            Covode.recordClassIndex(52665);
        }

        C44338a() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.LiveData, androidx.lifecycle.C1213t
        public final /* bridge */ /* synthetic */ void setValue(Integer num) {
            this.f103397a = true;
            super.setValue(num);
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.coupon.vm.CouponViewModel$a$a */
        static final class C44339a<T> implements AbstractC1214u {

            /* renamed from: a */
            final /* synthetic */ C44338a f103398a;

            /* renamed from: b */
            final /* synthetic */ AbstractC1214u f103399b;

            static {
                Covode.recordClassIndex(52666);
            }

            C44339a(C44338a aVar, AbstractC1214u uVar) {
                this.f103398a = aVar;
                this.f103399b = uVar;
            }

            @Override // androidx.lifecycle.AbstractC1214u
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
                if (this.f103398a.f103397a) {
                    this.f103398a.f103397a = false;
                    this.f103399b.onChanged(obj);
                }
            }
        }

        @Override // androidx.lifecycle.LiveData
        public final void observe(AbstractC1204m mVar, AbstractC1214u<? super Integer> uVar) {
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(uVar, "");
            super.observe(mVar, new C44339a(this, uVar));
        }
    }

    /* renamed from: a */
    public final void mo75366a(VoucherInfo voucherInfo) {
        List<Voucher> vouchers;
        this.f103396g = null;
        this.f103392c.setValue(voucherInfo != null ? voucherInfo.getLowestPrice() : null);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        if (!(voucherInfo == null || (vouchers = voucherInfo.getVouchers()) == null)) {
            for (T t : vouchers) {
                C44326a aVar = new C44326a(t);
                arrayList.add(aVar);
                String voucherID = t.getVoucherID();
                if (voucherID == null || !C80538hl.m139614a(voucherID)) {
                    int a = C44323a.m87048a(t.getVoucherTypeID());
                    if (a != -1) {
                        aVar.f103373b = a;
                    } else {
                        aVar.f103373b = 1;
                    }
                } else {
                    aVar.f103373b = 3;
                }
                if (C89219l.m154714a((Object) t.getSelected(), (Object) true) && this.f103396g == null) {
                    aVar.f103372a = true;
                    this.f103396g = aVar;
                    this.f103391b.setValue(t);
                }
            }
        }
        this.f103393d.setValue(arrayList);
        C1213t<Boolean> tVar = this.f103394e;
        if (this.f103396g == null) {
            z = true;
        }
        tVar.setValue(Boolean.valueOf(z));
        this.f103395f.setValue(null);
        this.f103390a = voucherInfo;
    }
}
