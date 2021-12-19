package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder;

import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.C0550b;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.ext.adapter.C20624b;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1478a.C20714a;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1719f.p1720a.C23126b;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Price;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitState;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43745f;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2830b.C43747h;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.OrderShopDigest;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.repository.dto.ShopBill;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.C43878a;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.OrderSubmitInfoView;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.LogisticTextDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.delivery.repo.dto.OrderSKUDTO;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.LogoTuxTextView;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.ProductCounterV2View;
import com.p2082ss.android.ugc.aweme.ecommercebase.view.TagTextView;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH */
public final class ProductInfoVH extends JediSimpleViewHolder<C43745f> implements AbstractC33974au {

    /* renamed from: g */
    public static final C43922b f102400g = new C43922b((byte) 0);

    /* renamed from: f */
    public final View f102401f;

    /* renamed from: j */
    private final AbstractC89244h f102402j;

    /* renamed from: k */
    private boolean f102403k;

    /* renamed from: l */
    private boolean f102404l;

    /* renamed from: m */
    private C43923c f102405m = new C43923c(this);

    static {
        Covode.recordClassIndex(52209);
    }

    /* renamed from: m */
    public final OrderSubmitViewModel mo63351m() {
        return (OrderSubmitViewModel) this.f102402j.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH$b */
    public static final class C43922b {
        static {
            Covode.recordClassIndex(52211);
        }

        private C43922b() {
        }

        public /* synthetic */ C43922b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH$c */
    public final class C43923c extends RecyclerView.AbstractC1350a<C43925b> {

        /* renamed from: a */
        public C43745f f102409a;

        /* renamed from: b */
        public final List<C43747h> f102410b;

        /* renamed from: c */
        final /* synthetic */ ProductInfoVH f102411c;

        static {
            Covode.recordClassIndex(52212);
        }

        /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final /* synthetic */ C43925b onCreateViewHolder(ViewGroup viewGroup, int i) {
            return m86828a(this, viewGroup, i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        public final int getItemCount() {
            return this.f102410b.size();
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH$c$e */
        static final class C43928e extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C43923c f102426a;

            static {
                Covode.recordClassIndex(52217);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43928e(C43923c cVar) {
                super(0);
                this.f102426a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f102426a.f102411c.mo63351m().f101766C = true;
                return C89391z.f203057a;
            }
        }

        public /* synthetic */ C43923c(ProductInfoVH productInfoVH) {
            this(productInfoVH, new ArrayList());
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH$c$a */
        static final class C43924a extends AbstractC89220m implements AbstractC89172b<MotionEvent, C89391z> {

            /* renamed from: a */
            final /* synthetic */ ProductCounterV2View f102412a;

            static {
                Covode.recordClassIndex(52213);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43924a(ProductCounterV2View productCounterV2View) {
                super(1);
                this.f102412a = productCounterV2View;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(MotionEvent motionEvent) {
                MotionEvent motionEvent2 = motionEvent;
                C89219l.m154721d(motionEvent2, "");
                if (motionEvent2.getAction() == 0) {
                    int[] iArr = new int[2];
                    this.f102412a.getLocationInWindow(iArr);
                    int i = iArr[0];
                    int i2 = iArr[1];
                    int measuredWidth = this.f102412a.getMeasuredWidth() + i;
                    int measuredHeight = this.f102412a.getMeasuredHeight() + i2;
                    if (motionEvent2.getRawX() < ((float) i) || motionEvent2.getRawX() > ((float) measuredWidth) || motionEvent2.getRawY() < ((float) i2) || motionEvent2.getRawY() > ((float) measuredHeight)) {
                        KeyboardUtils.m70897c(this.f102412a.getInput());
                    }
                }
                return C89391z.f203057a;
            }
        }

        private C43923c(ProductInfoVH productInfoVH, List<C43747h> list) {
            C89219l.m154721d(list, "");
            this.f102411c = productInfoVH;
            this.f102409a = null;
            this.f102410b = list;
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH$c$d */
        static final class C43927d extends AbstractC89220m implements AbstractC89183m<Boolean, Integer, C89391z> {

            /* renamed from: a */
            final /* synthetic */ ProductCounterV2View f102424a;

            /* renamed from: b */
            final /* synthetic */ C43923c f102425b;

            static {
                Covode.recordClassIndex(52216);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43927d(ProductCounterV2View productCounterV2View, C43923c cVar) {
                super(2);
                this.f102424a = productCounterV2View;
                this.f102425b = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(Boolean bool, Integer num) {
                boolean booleanValue = bool.booleanValue();
                int intValue = num.intValue();
                int[] iArr = new int[2];
                this.f102424a.getLocationInWindow(iArr);
                if (!booleanValue || intValue >= iArr[1] + this.f102424a.getMeasuredHeight()) {
                    this.f102425b.f102411c.mo63351m().mo74419c(0);
                } else {
                    this.f102425b.f102411c.mo63351m().mo74419c((iArr[1] + this.f102424a.getMeasuredHeight()) - intValue);
                }
                this.f102425b.f102411c.mo63351m().f101797s = booleanValue;
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH$c$b */
        public final class C43925b extends RecyclerView.ViewHolder {

            /* renamed from: a */
            public final ConstraintLayout f102413a;

            /* renamed from: b */
            public final LogoTuxTextView f102414b;

            /* renamed from: c */
            public final SmartImageView f102415c;

            /* renamed from: d */
            public final TextView f102416d;

            /* renamed from: e */
            public final TextView f102417e;

            /* renamed from: f */
            public final TextView f102418f;

            /* renamed from: g */
            public final ProductCounterV2View f102419g;

            /* renamed from: h */
            public final TextView f102420h;

            /* renamed from: i */
            public final TagTextView f102421i;

            /* renamed from: j */
            final /* synthetic */ C43923c f102422j;

            static {
                Covode.recordClassIndex(52214);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C43925b(C43923c cVar, View view) {
                super(view);
                C89219l.m154721d(view, "");
                this.f102422j = cVar;
                View findViewById = view.findViewById(R.id.acf);
                C89219l.m154716b(findViewById, "");
                this.f102413a = (ConstraintLayout) findViewById;
                View findViewById2 = view.findViewById(R.id.d7h);
                C89219l.m154716b(findViewById2, "");
                this.f102414b = (LogoTuxTextView) findViewById2;
                View findViewById3 = view.findViewById(R.id.d76);
                C89219l.m154716b(findViewById3, "");
                this.f102415c = (SmartImageView) findViewById3;
                View findViewById4 = view.findViewById(R.id.d7g);
                C89219l.m154716b(findViewById4, "");
                this.f102416d = (TextView) findViewById4;
                View findViewById5 = view.findViewById(R.id.chg);
                C89219l.m154716b(findViewById5, "");
                this.f102417e = (TextView) findViewById5;
                View findViewById6 = view.findViewById(R.id.d6d);
                C89219l.m154716b(findViewById6, "");
                this.f102418f = (TextView) findViewById6;
                View findViewById7 = view.findViewById(R.id.af8);
                C89219l.m154716b(findViewById7, "");
                this.f102419g = (ProductCounterV2View) findViewById7;
                View findViewById8 = view.findViewById(R.id.bra);
                C89219l.m154716b(findViewById8, "");
                this.f102420h = (TextView) findViewById8;
                View findViewById9 = view.findViewById(R.id.cxx);
                C89219l.m154716b(findViewById9, "");
                this.f102421i = (TagTextView) findViewById9;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH$c$c */
        static final class C43926c extends AbstractC89220m implements AbstractC89183m<Integer, String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C43923c f102423a;

            static {
                Covode.recordClassIndex(52215);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C43926c(C43923c cVar) {
                super(2);
                this.f102423a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(Integer num, String str) {
                ArrayList arrayList;
                OrderShopDigest orderShopDigest;
                ArrayList arrayList2;
                OrderSKUDTO a;
                int intValue = num.intValue();
                C89219l.m154721d(str, "");
                OrderSubmitViewModel m = this.f102423a.f102411c.mo63351m();
                C43745f fVar = this.f102423a.f102409a;
                C89219l.m154721d(str, "");
                m.f101767D = true;
                List<OrderShopDigest> list = m.f101784c;
                if (list != null) {
                    ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) list, 10));
                    for (T t : list) {
                        if (C89219l.m154714a((Object) (fVar != null ? fVar.f101978a : null), (Object) t.getSellerId())) {
                            if (C89219l.m154714a((Object) (fVar != null ? fVar.f101979b : null), (Object) t.getWarehouseId())) {
                                List<OrderSKUDTO> orderSKUs = t.getOrderSKUs();
                                if (orderSKUs != null) {
                                    ArrayList arrayList4 = new ArrayList(C89070n.m154526a((Iterable) orderSKUs, 10));
                                    for (T t2 : orderSKUs) {
                                        if (C89219l.m154714a((Object) t2.f103632b, (Object) str)) {
                                            a = OrderSKUDTO.m87142a(t2, null, null, Integer.valueOf(intValue), null, null, null, null, null, null, 507);
                                        } else {
                                            a = OrderSKUDTO.m87142a(t2, null, null, null, null, null, null, null, null, null, 511);
                                        }
                                        arrayList4.add(a);
                                    }
                                    arrayList2 = arrayList4;
                                } else {
                                    arrayList2 = null;
                                }
                                orderShopDigest = OrderShopDigest.copy$default(t, null, null, arrayList2, null, null, 27, null);
                                arrayList3.add(orderShopDigest);
                            }
                        }
                        orderShopDigest = OrderShopDigest.copy$default(t, null, null, null, null, null, 31, null);
                        arrayList3.add(orderShopDigest);
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                OrderSubmitViewModel.m86667a(m, false, false, false, false, arrayList, 45);
                C43732h.m86719a("edit_quantity", (Boolean) null, 6);
                return C89391z.f203057a;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x01b1  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x01e5  */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onBindViewHolder(com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH.C43923c.C43925b r10, int r11) {
            /*
            // Method dump skipped, instructions count: 566
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH.C43923c.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH$c$f */
        public static final class View$OnLayoutChangeListenerC43929f implements View.OnLayoutChangeListener {

            /* renamed from: a */
            final /* synthetic */ C43923c f102427a;

            /* renamed from: b */
            final /* synthetic */ C43925b f102428b;

            /* renamed from: c */
            final /* synthetic */ C43747h f102429c;

            static {
                Covode.recordClassIndex(52218);
            }

            View$OnLayoutChangeListenerC43929f(C43923c cVar, C43925b bVar, C43747h hVar) {
                this.f102427a = cVar;
                this.f102428b = bVar;
                this.f102429c = hVar;
            }

            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9;
                int i10;
                this.f102428b.f102416d.removeOnLayoutChangeListener(this);
                if (view != null && view.getMeasuredHeight() >= C34728n.m70946a(17.0d) * 2) {
                    C0550b bVar = new C0550b();
                    bVar.mo2451a(this.f102428b.f102413a);
                    bVar.mo2444a(R.id.d6d);
                    bVar.mo2452b(-2);
                    bVar.mo2443a();
                    bVar.mo2448a(R.id.d6d, 6, R.id.d7h, 6);
                    String str = this.f102429c.f101997h;
                    if (str == null || str.length() == 0) {
                        i9 = R.id.d7g;
                    } else {
                        i9 = R.id.chg;
                    }
                    bVar.mo2449a(R.id.d6d, 3, i9, 4, C34728n.m70946a(20.0d));
                    if (this.f102427a.f102411c.mo63351m().f101782a == 0) {
                        i10 = R.id.af8;
                    } else {
                        i10 = R.id.bra;
                    }
                    bVar.mo2448a(R.id.d6d, 7, i10, 6);
                    bVar.mo2454b(this.f102428b.f102413a);
                }
            }
        }

        /* renamed from: a */
        private static RecyclerView.ViewHolder m86828a(C43923c cVar, ViewGroup viewGroup, int i) {
            boolean a;
            MethodCollector.m26663i(8281);
            C89219l.m154721d(viewGroup, "");
            View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ri, viewGroup, false);
            C89219l.m154716b(a2, "");
            C43925b bVar = new C43925b(cVar, a2);
            try {
                if (bVar.itemView.getParent() != null) {
                    try {
                        a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (a) {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                        C22708a.m42800a(stringBuffer.toString());
                        ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(bVar.itemView);
                        }
                    }
                }
            } catch (Exception e) {
                C63423ai.m115002a(e);
                C51423a.m95786a(e);
            }
            C80493gg.f180088a = bVar.getClass().getName();
            MethodCollector.m26664o(8281);
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH$a */
    public static final class C43921a extends AbstractC89220m implements AbstractC89171a<OrderSubmitViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f102406a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f102407b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f102408c;

        static {
            Covode.recordClassIndex(52210);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43921a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f102406a = jediViewHolder;
            this.f102407b = cVar;
            this.f102408c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH.C43921a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_viewholder_ProductInfoVH$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86827xa94dc50d(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        C44998a.C44999a.m87685a(this.f102401f, true);
        View view = this.f102401f;
        AbstractC88412b unused = selectSubscribe(mo63351m(), C43942g.f102454a, new C20370ah(), new C43934g(view));
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.e02);
        C89219l.m154716b(recyclerView, "");
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        RecyclerView recyclerView2 = (RecyclerView) view.findViewById(R.id.e02);
        C89219l.m154716b(recyclerView2, "");
        recyclerView2.setAdapter(this.f102405m);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH$e */
    public static final class C43931e extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102434a = 700;

        /* renamed from: b */
        final /* synthetic */ View f102435b;

        /* renamed from: c */
        final /* synthetic */ ProductInfoVH f102436c;

        /* renamed from: d */
        final /* synthetic */ C43745f f102437d;

        static {
            Covode.recordClassIndex(52220);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                Context context = this.f102435b.getContext();
                C89219l.m154716b(context, "");
                final ActivityC0945e b = C20624b.m38846b(context);
                ProductInfoVH productInfoVH = this.f102436c;
                productInfoVH.withState(productInfoVH.mo63351m(), new AbstractC89172b<OrderSubmitState, C89391z>() {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH.C43931e.C439321 */

                    static {
                        Covode.recordClassIndex(52221);
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
                        OrderSubmitState orderSubmitState2 = orderSubmitState;
                        C89219l.m154721d(orderSubmitState2, "");
                        Bundle bundle = new Bundle();
                        bundle.putString("message", orderSubmitState2.getMessage());
                        AbstractC0952i supportFragmentManager = b.getSupportFragmentManager();
                        C89219l.m154716b(supportFragmentManager, "");
                        C89219l.m154721d(supportFragmentManager, "");
                        C89219l.m154721d(bundle, "");
                        if (bundle.getString("message") != null) {
                            C43878a aVar = new C43878a();
                            aVar.setArguments(bundle);
                            aVar.show(supportFragmentManager, "OSPMessagePanelFragment");
                        }
                        return C89391z.f203057a;
                    }
                });
                C43732h.m86726a("message", this.f102436c.mo63351m().mo74424j(), null, null, null, null, null, null, null, null, 1020);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43931e(View view, ProductInfoVH productInfoVH, C43745f fVar) {
            super(700);
            this.f102435b = view;
            this.f102436c = productInfoVH;
            this.f102437d = fVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProductInfoVH(View view) {
        super(view);
        C89219l.m154721d(view, "");
        this.f102401f = view;
        AbstractC89277c a = C89204ab.m154669a(OrderSubmitViewModel.class);
        this.f102402j = C89250i.m154773a((AbstractC89171a) new C43921a(this, a, a));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH$d */
    public static final class C43930d extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102430a = 700;

        /* renamed from: b */
        final /* synthetic */ View f102431b;

        /* renamed from: c */
        final /* synthetic */ ProductInfoVH f102432c;

        /* renamed from: d */
        final /* synthetic */ C43745f f102433d;

        static {
            Covode.recordClassIndex(52219);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            List<LogisticDTO> list;
            Float f;
            String str;
            LogisticTextDTO logisticTextDTO;
            Price price;
            Price price2;
            String priceVal;
            if (view != null && (list = this.f102433d.f101983f) != null && list.size() > 1) {
                String str2 = null;
                if (1 != 0) {
                    OrderSubmitViewModel m = this.f102432c.mo63351m();
                    C43745f fVar = this.f102433d;
                    Context context = this.f102431b.getContext();
                    C89219l.m154716b(context, "");
                    C89219l.m154721d(fVar, "");
                    C89219l.m154721d(list, "");
                    C89219l.m154721d(context, "");
                    m.mo74425k();
                    AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C89652o.f203399a, null, new OrderSubmitViewModel.C43706s(m, context, list, fVar, null), 2);
                    C43732h.m86719a("logistics", (Boolean) null, 6);
                    HashMap<String, Object> j = this.f102432c.mo63351m().mo74424j();
                    LogisticDTO logisticDTO = this.f102433d.f101984g;
                    if (logisticDTO == null || (price2 = logisticDTO.f103619f) == null || (priceVal = price2.getPriceVal()) == null) {
                        f = null;
                    } else {
                        f = C89361p.m154861c(priceVal);
                    }
                    LogisticDTO logisticDTO2 = this.f102433d.f101984g;
                    if (logisticDTO2 == null || (price = logisticDTO2.f103619f) == null) {
                        str = null;
                    } else {
                        str = price.getCurrency();
                    }
                    LogisticDTO logisticDTO3 = this.f102433d.f101984g;
                    if (!(logisticDTO3 == null || (logisticTextDTO = logisticDTO3.f103623j) == null)) {
                        str2 = logisticTextDTO.f103630f;
                    }
                    C43732h.m86726a("logistics", j, null, f, str, str2, null, null, null, null, 964);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43930d(View view, ProductInfoVH productInfoVH, C43745f fVar) {
            super(700);
            this.f102431b = view;
            this.f102432c = productInfoVH;
            this.f102433d = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH$f */
    static final class C43933f extends AbstractC89220m implements AbstractC89172b<OrderSubmitState, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f102439a;

        /* renamed from: b */
        final /* synthetic */ ProductInfoVH f102440b;

        /* renamed from: c */
        final /* synthetic */ C43745f f102441c;

        static {
            Covode.recordClassIndex(52222);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43933f(View view, ProductInfoVH productInfoVH, C43745f fVar) {
            super(1);
            this.f102439a = view;
            this.f102440b = productInfoVH;
            this.f102441c = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(OrderSubmitState orderSubmitState) {
            String str;
            String str2;
            C89219l.m154721d(orderSubmitState, "");
            if (this.f102441c.f101985h && this.f102440b.mo63351m().f101782a != 0) {
                ShopBill shopBill = this.f102441c.f101989l;
                if (shopBill != null) {
                    str = shopBill.getProductTotal();
                } else {
                    str = null;
                }
                if (C80537hk.m139613a(str)) {
                    RelativeLayout relativeLayout = (RelativeLayout) this.f102439a.findViewById(R.id.dzx);
                    C89219l.m154716b(relativeLayout, "");
                    relativeLayout.setVisibility(0);
                    ShopBill shopBill2 = this.f102441c.f101989l;
                    if (shopBill2 == null || (str2 = shopBill2.getProductTotal()) == null) {
                        str2 = "";
                    }
                    Context context = this.f102439a.getContext();
                    C89219l.m154716b(context, "");
                    SpannableString spannableString = new SpannableString(context.getResources().getQuantityString(R.plurals.by, this.f102441c.f101982e.size(), String.valueOf(this.f102441c.f101982e.size()), str2));
                    int a = C89361p.m154888a((CharSequence) spannableString, str2, 0, false, 6);
                    if (a != -1) {
                        spannableString.setSpan(new C23126b(42, true), a, str2.length() + a, 33);
                    }
                    TuxTextView tuxTextView = (TuxTextView) this.f102439a.findViewById(R.id.ebm);
                    C89219l.m154716b(tuxTextView, "");
                    tuxTextView.setText(spannableString);
                    return C89391z.f203057a;
                }
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) this.f102439a.findViewById(R.id.dzx);
            C89219l.m154716b(relativeLayout2, "");
            relativeLayout2.setVisibility(8);
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C43745f fVar) {
        String str;
        int i;
        String str2;
        boolean z;
        String str3;
        String str4;
        LogisticTextDTO logisticTextDTO;
        C20714a thumbFirstImageUrlModel;
        C43745f fVar2 = fVar;
        C89219l.m154721d(fVar2, "");
        View view = this.f102401f;
        Image image = fVar2.f101980c;
        if (!(image == null || (thumbFirstImageUrlModel = image.toThumbFirstImageUrlModel()) == null)) {
            C20766v a = C20761r.m39058a(thumbFirstImageUrlModel);
            a.f49092E = (SmartImageView) view.findViewById(R.id.dzw);
            a.mo34186c();
        }
        C43923c cVar = this.f102405m;
        C89219l.m154721d(fVar2, "");
        cVar.f102409a = fVar2;
        cVar.f102410b.clear();
        cVar.f102410b.addAll(fVar2.f101982e);
        cVar.notifyDataSetChanged();
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.dzz);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(fVar2.f101981d);
        if (fVar2.f101987j) {
            String str5 = null;
            if (!this.f102404l) {
                this.f102404l = true;
                HashMap<String, Object> j = mo63351m().mo74424j();
                LogisticDTO logisticDTO = fVar2.f101984g;
                if (logisticDTO == null || (logisticTextDTO = logisticDTO.f103623j) == null) {
                    str4 = null;
                } else {
                    str4 = logisticTextDTO.f103630f;
                }
                C43732h.m86727a("logistics", j, (String) null, str4, (String) null, (Boolean) null, (Boolean) null, (String) null, 988);
            }
            OrderSubmitInfoView orderSubmitInfoView = (OrderSubmitInfoView) view.findViewById(R.id.dzu);
            C89219l.m154716b(orderSubmitInfoView, "");
            orderSubmitInfoView.setVisibility(0);
            OrderSubmitInfoView orderSubmitInfoView2 = (OrderSubmitInfoView) view.findViewById(R.id.dzu);
            LogisticDTO logisticDTO2 = fVar2.f101984g;
            if (logisticDTO2 == null || (str = logisticDTO2.f103615b) == null) {
                str = view.getResources().getString(R.string.bfe);
                C89219l.m154716b(str, "");
            }
            orderSubmitInfoView2.setTitleText(str);
            LogisticDTO logisticDTO3 = fVar2.f101984g;
            if (logisticDTO3 != null) {
                if (C89219l.m154714a((Object) logisticDTO3.f103621h, (Object) true)) {
                    i = R.color.bh;
                } else {
                    i = R.color.c5;
                }
                OrderSubmitInfoView orderSubmitInfoView3 = (OrderSubmitInfoView) view.findViewById(R.id.dzu);
                Price price = logisticDTO3.f103619f;
                if (price == null || (str2 = price.getPriceStr()) == null) {
                    str2 = "";
                }
                orderSubmitInfoView3.setDescText(str2);
                if (C89219l.m154714a((Object) logisticDTO3.f103621h, (Object) true)) {
                    Integer valueOf = Integer.valueOf((int) R.raw.icon_truck_moving_ltr);
                    View view2 = this.itemView;
                    C89219l.m154716b(view2, "");
                    ((OrderSubmitInfoView) view.findViewById(R.id.dzu)).mo74780a(valueOf, C0643b.m2378c(view2.getContext(), R.color.bh));
                } else {
                    ((OrderSubmitInfoView) view.findViewById(R.id.dzu)).mo74780a(null, -16777216);
                }
                View view3 = this.itemView;
                C89219l.m154716b(view3, "");
                ((OrderSubmitInfoView) view.findViewById(R.id.dzu)).setDescColor(C0643b.m2378c(view3.getContext(), i));
                LogisticTextDTO logisticTextDTO2 = logisticDTO3.f103623j;
                if (!(logisticTextDTO2 == null || (str3 = logisticTextDTO2.f103627c) == null)) {
                    ((OrderSubmitInfoView) view.findViewById(R.id.dzu)).setSubDescText(str3);
                }
                OrderSubmitInfoView orderSubmitInfoView4 = (OrderSubmitInfoView) view.findViewById(R.id.dzu);
                LogisticTextDTO logisticTextDTO3 = logisticDTO3.f103623j;
                if (logisticTextDTO3 != null) {
                    str5 = logisticTextDTO3.f103629e;
                }
                orderSubmitInfoView4.setSubDescExtraText(str5);
                OrderSubmitInfoView orderSubmitInfoView5 = (OrderSubmitInfoView) view.findViewById(R.id.dzu);
                List<LogisticDTO> list = fVar2.f101983f;
                if (list == null || list.size() <= 1) {
                    z = false;
                } else {
                    z = true;
                }
                orderSubmitInfoView5.mo74781a(z);
            }
        } else {
            OrderSubmitInfoView orderSubmitInfoView6 = (OrderSubmitInfoView) view.findViewById(R.id.dzu);
            C89219l.m154716b(orderSubmitInfoView6, "");
            orderSubmitInfoView6.setVisibility(8);
        }
        String string = view.getResources().getString(R.string.fui);
        C89219l.m154716b(string, "");
        ((OrderSubmitInfoView) view.findViewById(R.id.cj9)).setTitleText(string);
        View view4 = this.f102401f;
        if (fVar2.f101985h) {
            OrderSubmitInfoView orderSubmitInfoView7 = (OrderSubmitInfoView) view4.findViewById(R.id.cj9);
            C89219l.m154716b(orderSubmitInfoView7, "");
            orderSubmitInfoView7.setVisibility(0);
            TuxTextView tuxTextView2 = (TuxTextView) view4.findViewById(R.id.f9k);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(8);
            if (!this.f102403k) {
                this.f102403k = true;
                C43732h.m86727a("message", mo63351m().mo74424j(), (String) null, (String) null, (String) null, (Boolean) null, (Boolean) null, (String) null, 1020);
            }
        } else {
            if (fVar2.f101986i != null) {
                TuxTextView tuxTextView3 = (TuxTextView) view4.findViewById(R.id.f9k);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setVisibility(0);
                TuxTextView tuxTextView4 = (TuxTextView) view4.findViewById(R.id.f9k);
                C89219l.m154716b(tuxTextView4, "");
                tuxTextView4.setText(fVar2.f101986i);
            }
            OrderSubmitInfoView orderSubmitInfoView8 = (OrderSubmitInfoView) view4.findViewById(R.id.dzu);
            C89219l.m154716b(orderSubmitInfoView8, "");
            orderSubmitInfoView8.setVisibility(8);
            OrderSubmitInfoView orderSubmitInfoView9 = (OrderSubmitInfoView) view4.findViewById(R.id.cj9);
            C89219l.m154716b(orderSubmitInfoView9, "");
            orderSubmitInfoView9.setVisibility(8);
        }
        OrderSubmitInfoView orderSubmitInfoView10 = (OrderSubmitInfoView) view.findViewById(R.id.dzu);
        C89219l.m154716b(orderSubmitInfoView10, "");
        orderSubmitInfoView10.setOnClickListener(new C43930d(view, this, fVar2));
        OrderSubmitInfoView orderSubmitInfoView11 = (OrderSubmitInfoView) view.findViewById(R.id.cj9);
        C89219l.m154716b(orderSubmitInfoView11, "");
        orderSubmitInfoView11.setOnClickListener(new C43931e(view, this, fVar2));
        RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.als);
        C89219l.m154716b(relativeLayout, "");
        relativeLayout.setVisibility(8);
        OrderSubmitInfoView orderSubmitInfoView12 = (OrderSubmitInfoView) view.findViewById(R.id.dzu);
        C89219l.m154716b(orderSubmitInfoView12, "");
        if (orderSubmitInfoView12.getVisibility() != 0) {
            RelativeLayout relativeLayout2 = (RelativeLayout) view.findViewById(R.id.als);
            C89219l.m154716b(relativeLayout2, "");
            if (relativeLayout2.getVisibility() != 0) {
                OrderSubmitInfoView orderSubmitInfoView13 = (OrderSubmitInfoView) view.findViewById(R.id.cj9);
                C89219l.m154716b(orderSubmitInfoView13, "");
                if (orderSubmitInfoView13.getVisibility() != 0) {
                    Space space = (Space) view.findViewById(R.id.e4m);
                    C89219l.m154716b(space, "");
                    space.setVisibility(8);
                    withState(mo63351m(), new C43933f(view, this, fVar2));
                }
            }
        }
        Space space2 = (Space) view.findViewById(R.id.e4m);
        C89219l.m154716b(space2, "");
        space2.setVisibility(0);
        withState(mo63351m(), new C43933f(view, this, fVar2));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.viewholder.ProductInfoVH$g */
    static final class C43934g extends AbstractC89220m implements AbstractC89183m<JediSimpleViewHolder<C43745f>, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ View f102442a;

        static {
            Covode.recordClassIndex(52223);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43934g(View view) {
            super(2);
            this.f102442a = view;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(JediSimpleViewHolder<C43745f> jediSimpleViewHolder, String str) {
            String str2 = str;
            C89219l.m154721d(jediSimpleViewHolder, "");
            C89219l.m154721d(str2, "");
            OrderSubmitInfoView orderSubmitInfoView = (OrderSubmitInfoView) this.f102442a.findViewById(R.id.cj9);
            if (str2.length() == 0) {
                str2 = this.f102442a.getContext().getString(R.string.fuj);
            }
            C89219l.m154716b(str2, "");
            orderSubmitInfoView.setDescText(str2);
            return C89391z.f203057a;
        }
    }
}
