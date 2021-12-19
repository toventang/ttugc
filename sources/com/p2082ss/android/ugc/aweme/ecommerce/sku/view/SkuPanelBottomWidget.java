package com.p2082ss.android.ugc.aweme.ecommerce.sku.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.widget.Widget;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.C43625a;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.C43626a;
import com.p2082ss.android.ugc.aweme.ecommerce.cart.repository.p2828a.C43641b;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.C43967x;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.IPdpStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductPackStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.C45421d;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.C45429a;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.SkuPanelState;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.AddToCartButton;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuInfo;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.model.dto.SkuItem;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.p2859a.C45383a;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.C45591a;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget */
public final class SkuPanelBottomWidget extends SkuPanelBaseWidget implements AbstractC33974au {

    /* renamed from: h */
    TuxButton f105877h;

    /* renamed from: i */
    public TuxButton f105878i;

    /* renamed from: j */
    public boolean f105879j;

    /* renamed from: k */
    public int f105880k;

    /* renamed from: l */
    private final int f105881l = R.layout.qv;

    /* renamed from: m */
    private final AbstractC89244h f105882m;

    static {
        Covode.recordClassIndex(53925);
    }

    /* renamed from: o */
    public final SkuPanelViewModel mo76672o() {
        return (SkuPanelViewModel) this.f105882m.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: b */
    public final int mo39079b() {
        return this.f105881l;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget$h */
    static final class RunnableC45448h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ SkuPanelBottomWidget f105893a;

        static {
            Covode.recordClassIndex(53933);
        }

        RunnableC45448h(SkuPanelBottomWidget skuPanelBottomWidget) {
            this.f105893a = skuPanelBottomWidget;
        }

        public final void run() {
            this.f105893a.f105879j = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget$a */
    public static final class C45441a extends AbstractC89220m implements AbstractC89171a<SkuPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ Widget f105883a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f105884b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f105885c;

        static {
            Covode.recordClassIndex(53926);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45441a(Widget widget, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f105883a = widget;
            this.f105884b = cVar;
            this.f105885c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget.C45441a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_sku_view_SkuPanelBottomWidget$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m88011x780adc49(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget$d */
    static final class C45444d extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelBottomWidget f105888a;

        static {
            Covode.recordClassIndex(53929);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45444d(SkuPanelBottomWidget skuPanelBottomWidget) {
            super(0);
            this.f105888a = skuPanelBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Context context;
            boolean z;
            Boolean pdpFullScreen;
            List<SkuItem> list;
            SkuPanelViewModel o = this.f105888a.mo76672o();
            View view = this.f105888a.f56005e;
            String str = null;
            if (view != null) {
                context = view.getContext();
            } else {
                context = null;
            }
            SkuPanelState skuPanelState = o.f106005c;
            if (skuPanelState != null) {
                skuPanelState.setJumpOSP(true);
            }
            SkuPanelState skuPanelState2 = o.f106005c;
            if (skuPanelState2 != null) {
                skuPanelState2.setCloseFrom(1);
            }
            SkuPanelState skuPanelState3 = o.f106005c;
            if (skuPanelState3 != null) {
                SkuPanelState skuPanelState4 = o.f106005c;
                if (skuPanelState4 != null) {
                    SkuInfo skuInfo = o.f106006d;
                    if (skuInfo != null) {
                        list = skuInfo.f105853a;
                    } else {
                        list = null;
                    }
                    SkuItem fullSkuItem = skuPanelState4.getFullSkuItem(list);
                    if (fullSkuItem != null) {
                        str = fullSkuItem.getSkuId();
                    }
                }
                skuPanelState3.setSkuId(str);
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams = o.f106007e;
            if (!(skuEnterParams == null || !skuEnterParams.getNeedRequest() || context == null)) {
                SkuPanelState skuPanelState5 = o.f106005c;
                if (skuPanelState5 != null) {
                    skuPanelState5.setJumpOSP(false);
                }
                ProductPackStruct productPackStruct = o.f106008f;
                SkuPanelState skuPanelState6 = o.f106005c;
                IPdpStarter.PdpEnterParam a = SkuPanelStarter.m87953a(o.f106007e);
                SkuPanelStarter.SkuEnterParams skuEnterParams2 = o.f106007e;
                if (skuEnterParams2 == null || (pdpFullScreen = skuEnterParams2.getPdpFullScreen()) == null) {
                    z = false;
                } else {
                    z = pdpFullScreen.booleanValue();
                }
                C43967x.m86845a(context, productPackStruct, null, skuPanelState6, a, z, null);
            }
            o.mo33689c(SkuPanelViewModel.C45512f.f106023a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget$e */
    static final class C45445e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelBottomWidget f105889a;

        static {
            Covode.recordClassIndex(53930);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45445e(SkuPanelBottomWidget skuPanelBottomWidget) {
            super(0);
            this.f105889a = skuPanelBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Integer num;
            String str;
            Integer num2;
            String str2;
            List<SkuItem> list;
            SkuPanelViewModel o = this.f105889a.mo76672o();
            SkuPanelState skuPanelState = o.f106005c;
            if (skuPanelState != null) {
                skuPanelState.setJumpOSP(false);
            }
            SkuPanelState skuPanelState2 = o.f106005c;
            if (skuPanelState2 != null) {
                skuPanelState2.setCloseFrom(3);
            }
            SkuPanelState skuPanelState3 = o.f106005c;
            String str3 = null;
            if (skuPanelState3 != null) {
                SkuPanelState skuPanelState4 = o.f106005c;
                if (skuPanelState4 != null) {
                    SkuInfo skuInfo = o.f106006d;
                    if (skuInfo != null) {
                        list = skuInfo.f105853a;
                    } else {
                        list = null;
                    }
                    SkuItem fullSkuItem = skuPanelState4.getFullSkuItem(list);
                    if (fullSkuItem != null) {
                        str2 = fullSkuItem.getSkuId();
                        skuPanelState3.setSkuId(str2);
                    }
                }
                str2 = null;
                skuPanelState3.setSkuId(str2);
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams = o.f106007e;
            if (skuEnterParams != null) {
                num = Integer.valueOf(skuEnterParams.getClickFrom());
            } else {
                num = null;
            }
            String a = C45429a.m87999a(num);
            SkuPanelState skuPanelState5 = o.f106005c;
            if (skuPanelState5 != null) {
                str = skuPanelState5.getSkuId();
            } else {
                str = null;
            }
            Integer valueOf = Integer.valueOf(C89219l.m154714a(o.f106010k, true) ? 1 : 0);
            SkuPanelStarter.SkuEnterParams skuEnterParams2 = o.f106007e;
            if (skuEnterParams2 != null) {
                num2 = Integer.valueOf(skuEnterParams2.getClickFrom());
            } else {
                num2 = null;
            }
            String a2 = C43625a.m86645a(num2);
            SkuPanelStarter.SkuEnterParams skuEnterParams3 = o.f106007e;
            if (skuEnterParams3 != null) {
                str3 = skuEnterParams3.getEnterFrom();
            }
            C45383a.m87961a(a, str, valueOf, a2, "sku", str3, null);
            o.mo33689c(SkuPanelViewModel.C45513g.f106024a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget$c */
    static final class C45443c extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelBottomWidget f105887a;

        static {
            Covode.recordClassIndex(53928);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45443c(SkuPanelBottomWidget skuPanelBottomWidget) {
            super(0);
            this.f105887a = skuPanelBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            SkuItem skuItem;
            Integer num;
            String str;
            Integer num2;
            String str2;
            Object obj;
            String str3;
            String str4;
            String str5;
            Integer num3;
            Object obj2;
            HashMap<String, Object> hashMap;
            HashMap<String, Object> hashMap2;
            Object obj3;
            View view;
            ActivityC0945e activity;
            Window window;
            HashMap<String, Object> trackParams;
            HashMap<String, Object> visitReportParams;
            HashMap<String, Object> visitReportParams2;
            String str6;
            String str7;
            List<SkuItem> list;
            SkuPanelViewModel o = this.f105887a.mo76672o();
            View view2 = this.f105887a.f56005e;
            SkuPanelState skuPanelState = o.f106005c;
            if (skuPanelState != null) {
                skuPanelState.setJumpOSP(false);
            }
            SkuPanelState skuPanelState2 = o.f106005c;
            if (skuPanelState2 != null) {
                skuPanelState2.setCloseFrom(2);
            }
            SkuPanelState skuPanelState3 = o.f106005c;
            String str8 = null;
            if (skuPanelState3 != null) {
                SkuInfo skuInfo = o.f106006d;
                if (skuInfo != null) {
                    list = skuInfo.f105853a;
                } else {
                    list = null;
                }
                skuItem = skuPanelState3.getFullSkuItem(list);
            } else {
                skuItem = null;
            }
            SkuPanelState skuPanelState4 = o.f106005c;
            if (skuPanelState4 != null) {
                if (skuItem != null) {
                    str7 = skuItem.getSkuId();
                } else {
                    str7 = null;
                }
                skuPanelState4.setSkuId(str7);
            }
            SkuPanelState skuPanelState5 = o.f106005c;
            if (skuPanelState5 != null) {
                if (skuItem != null) {
                    str6 = skuItem.getWarehouseId();
                } else {
                    str6 = null;
                }
                skuPanelState5.setWarehouseId(str6);
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams = o.f106007e;
            if (skuEnterParams != null) {
                num = Integer.valueOf(skuEnterParams.getClickFrom());
            } else {
                num = null;
            }
            String a = C45429a.m87999a(num);
            SkuPanelState skuPanelState6 = o.f106005c;
            if (skuPanelState6 != null) {
                str = skuPanelState6.getSkuId();
            } else {
                str = null;
            }
            Integer valueOf = Integer.valueOf(C89219l.m154714a(o.f106010k, true) ? 1 : 0);
            SkuPanelStarter.SkuEnterParams skuEnterParams2 = o.f106007e;
            if (skuEnterParams2 != null) {
                num2 = Integer.valueOf(skuEnterParams2.getClickFrom());
            } else {
                num2 = null;
            }
            String a2 = C43625a.m86645a(num2);
            SkuPanelStarter.SkuEnterParams skuEnterParams3 = o.f106007e;
            if (skuEnterParams3 != null) {
                str2 = skuEnterParams3.getEnterFrom();
            } else {
                str2 = null;
            }
            C45383a.m87961a(a, str, valueOf, a2, "sku", str2, null);
            C43626a aVar = C43626a.f101693c;
            SkuPanelStarter.SkuEnterParams skuEnterParams4 = o.f106007e;
            if (skuEnterParams4 == null || (visitReportParams2 = skuEnterParams4.getVisitReportParams()) == null) {
                obj = null;
            } else {
                obj = visitReportParams2.get("seller_id");
            }
            String str9 = (String) obj;
            if (str9 == null) {
                str9 = o.f106011l;
            }
            SkuPanelState skuPanelState7 = o.f106005c;
            if (skuPanelState7 != null) {
                str3 = skuPanelState7.getWarehouseId();
            } else {
                str3 = null;
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams5 = o.f106007e;
            if (skuEnterParams5 != null) {
                str4 = skuEnterParams5.getProductId();
            } else {
                str4 = null;
            }
            SkuPanelState skuPanelState8 = o.f106005c;
            if (skuPanelState8 != null) {
                str5 = skuPanelState8.getSkuId();
            } else {
                str5 = null;
            }
            SkuPanelState skuPanelState9 = o.f106005c;
            if (skuPanelState9 != null) {
                num3 = skuPanelState9.getProductQuantity();
            } else {
                num3 = null;
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams6 = o.f106007e;
            if (skuEnterParams6 == null || (visitReportParams = skuEnterParams6.getVisitReportParams()) == null) {
                obj2 = null;
            } else {
                obj2 = visitReportParams.get("chain_key");
            }
            String str10 = (String) obj2;
            SkuPanelStarter.SkuEnterParams skuEnterParams7 = o.f106007e;
            if (skuEnterParams7 != null) {
                hashMap = skuEnterParams7.getTrackParams();
            } else {
                hashMap = null;
            }
            String a3 = C43626a.C43627a.m86650a(hashMap);
            SkuPanelStarter.SkuEnterParams skuEnterParams8 = o.f106007e;
            if (skuEnterParams8 != null) {
                hashMap2 = skuEnterParams8.getTrackParams();
            } else {
                hashMap2 = null;
            }
            Integer valueOf2 = Integer.valueOf(IPdpStarter.C44631a.m87368a(hashMap2));
            SkuPanelStarter.SkuEnterParams skuEnterParams9 = o.f106007e;
            if (skuEnterParams9 == null || (trackParams = skuEnterParams9.getTrackParams()) == null) {
                obj3 = null;
            } else {
                obj3 = trackParams.get("author_id");
            }
            C43641b bVar = new C43641b(str9, str3, str4, str5, num3, str10, a3, valueOf2, (String) obj3);
            C45421d dVar = o.f106009g;
            if (dVar == null || (activity = dVar.getActivity()) == null || (window = activity.getWindow()) == null || (view = window.getDecorView()) == null) {
                view = view2;
            }
            SkuPanelStarter.SkuEnterParams skuEnterParams10 = o.f106007e;
            if (skuEnterParams10 != null) {
                str8 = skuEnterParams10.getEnterFrom();
            }
            aVar.mo74301a(bVar, view2, view, !C89219l.m154714a((Object) str8, (Object) "product_detail"), new SkuPanelViewModel.C45507b(o, view2), new SkuPanelViewModel.C45508c(o)).mo143254a(new SkuPanelViewModel.C45509d(o, skuItem), SkuPanelViewModel.C45511e.f106022a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget
    /* renamed from: n */
    public final void mo76669n() {
        super.mo76669n();
        this.f105877h = (TuxButton) mo76666a(R.id.e24);
        TuxButton tuxButton = (TuxButton) mo76666a(R.id.e25);
        this.f105878i = tuxButton;
        int i = this.f105880k;
        if (i == 0) {
            TuxButton tuxButton2 = this.f105877h;
            if (tuxButton2 == null) {
                C89219l.m154710a("addToCartBtn");
            }
            tuxButton2.setButtonVariant(1);
            TuxButton tuxButton3 = this.f105877h;
            if (tuxButton3 == null) {
                C89219l.m154710a("addToCartBtn");
            }
            int c = C0643b.m2378c(tuxButton3.getContext(), R.color.bh);
            TuxButton tuxButton4 = this.f105877h;
            if (tuxButton4 == null) {
                C89219l.m154710a("addToCartBtn");
            }
            tuxButton4.setTextColor(c);
            TuxButton tuxButton5 = this.f105877h;
            if (tuxButton5 == null) {
                C89219l.m154710a("addToCartBtn");
            }
            TuxButton tuxButton6 = this.f105877h;
            if (tuxButton6 == null) {
                C89219l.m154710a("addToCartBtn");
            }
            Context context = tuxButton6.getContext();
            C89219l.m154716b(context, "");
            tuxButton5.setBackgroundDrawable(C45591a.m88135a(context));
            TuxButton tuxButton7 = this.f105877h;
            if (tuxButton7 == null) {
                C89219l.m154710a("addToCartBtn");
            }
            tuxButton7.setText(R.string.bin);
            AbstractC88412b unused = selectSubscribe(mo76672o(), C45477a.f105945a, new C20370ah(), new C45447g(this));
        } else if (i == 1) {
            TuxButton tuxButton8 = this.f105877h;
            if (tuxButton8 == null) {
                C89219l.m154710a("addToCartBtn");
            }
            tuxButton8.setVisibility(8);
            TuxButton tuxButton9 = this.f105878i;
            if (tuxButton9 == null) {
                C89219l.m154710a("buyNowBtn");
            }
            tuxButton9.setText(R.string.bh3);
        } else if (i == 2) {
            if (tuxButton == null) {
                C89219l.m154710a("buyNowBtn");
            }
            tuxButton.setVisibility(8);
            TuxButton tuxButton10 = this.f105877h;
            if (tuxButton10 == null) {
                C89219l.m154710a("addToCartBtn");
            }
            ViewGroup.LayoutParams layoutParams = tuxButton10.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            int i2 = Build.VERSION.SDK_INT;
            TuxButton tuxButton11 = this.f105877h;
            if (tuxButton11 == null) {
                C89219l.m154710a("addToCartBtn");
            }
            ViewGroup.LayoutParams layoutParams2 = tuxButton11.getLayoutParams();
            Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            ((LinearLayout.LayoutParams) layoutParams2).setMarginEnd(0);
            TuxButton tuxButton12 = this.f105877h;
            if (tuxButton12 == null) {
                C89219l.m154710a("addToCartBtn");
            }
            tuxButton12.setText(R.string.bh3);
            TuxButton tuxButton13 = this.f105877h;
            if (tuxButton13 == null) {
                C89219l.m154710a("addToCartBtn");
            }
            tuxButton13.setButtonVariant(0);
            mo76671a(false, null);
        } else if (i == 3) {
            TuxButton tuxButton14 = this.f105877h;
            if (tuxButton14 == null) {
                C89219l.m154710a("addToCartBtn");
            }
            tuxButton14.setVisibility(8);
            TuxButton tuxButton15 = this.f105878i;
            if (tuxButton15 == null) {
                C89219l.m154710a("buyNowBtn");
            }
            tuxButton15.setText(R.string.bh3);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC45448h(this), 450);
        mo76671a(false, null);
        TuxButton tuxButton16 = this.f105878i;
        if (tuxButton16 == null) {
            C89219l.m154710a("buyNowBtn");
        }
        tuxButton16.setOnClickListener(new C45446f(this));
        AbstractC88412b unused2 = selectSubscribe(mo76672o(), C45478b.f105946a, new C20370ah(), new C45449i(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget$f */
    public static final class C45446f extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105890a = 700;

        /* renamed from: b */
        final /* synthetic */ SkuPanelBottomWidget f105891b;

        static {
            Covode.recordClassIndex(53931);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45446f(SkuPanelBottomWidget skuPanelBottomWidget) {
            super(700);
            this.f105891b = skuPanelBottomWidget;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null && this.f105891b.f105879j) {
                if (this.f105891b.f105880k == 3) {
                    SkuPanelBottomWidget skuPanelBottomWidget = this.f105891b;
                    String a = skuPanelBottomWidget.mo76667l().mo76700a();
                    if (a != null) {
                        View view2 = skuPanelBottomWidget.f56005e;
                        if (view2 != null) {
                            Context context = skuPanelBottomWidget.mo39077a().getContext();
                            C89219l.m154716b(context, "");
                            String string = context.getResources().getString(R.string.bg5, a);
                            C89219l.m154716b(string, "");
                            new C23144b(view2).mo37635a(string).mo37637b();
                            return;
                        }
                        return;
                    }
                    skuPanelBottomWidget.mo76670a(new C45445e(skuPanelBottomWidget));
                    return;
                }
                SkuPanelBottomWidget skuPanelBottomWidget2 = this.f105891b;
                String a2 = skuPanelBottomWidget2.mo76667l().mo76700a();
                if (a2 != null) {
                    View view3 = skuPanelBottomWidget2.f56005e;
                    if (view3 != null) {
                        Context context2 = skuPanelBottomWidget2.mo39077a().getContext();
                        C89219l.m154716b(context2, "");
                        String string2 = context2.getResources().getString(R.string.bg5, a2);
                        C89219l.m154716b(string2, "");
                        new C23144b(view3).mo37635a(string2).mo37637b();
                        return;
                    }
                    return;
                }
                skuPanelBottomWidget2.mo76670a(new C45444d(skuPanelBottomWidget2));
            }
        }
    }

    public SkuPanelBottomWidget(int i) {
        this.f105880k = i;
        AbstractC89277c a = C89204ab.m154669a(SkuPanelViewModel.class);
        this.f105882m = C89250i.m154773a((AbstractC89171a) new C45441a(this, a, a));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo76670a(AbstractC89171a<C89391z> aVar) {
        IAccountService a = AccountService.m65215a();
        IAccountUserService e = a.mo57069e();
        C89219l.m154716b(e, "");
        if (!e.isLogin()) {
            AbstractC34892bo g = a.mo57071g();
            IAccountService.C31274d dVar = new IAccountService.C31274d();
            dVar.f74960a = mo60928k();
            dVar.f74964e = new C45442b(aVar);
            g.showLoginAndRegisterView(dVar.mo57084a());
            return;
        }
        aVar.invoke();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget$j */
    public static final class C45450j extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f105895a = 700;

        /* renamed from: b */
        final /* synthetic */ SkuPanelBottomWidget f105896b;

        /* renamed from: c */
        final /* synthetic */ boolean f105897c;

        /* renamed from: d */
        final /* synthetic */ AddToCartButton f105898d;

        static {
            Covode.recordClassIndex(53935);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            String str;
            if (view != null && this.f105896b.f105879j) {
                if (this.f105897c) {
                    View view2 = this.f105896b.f56005e;
                    if (view2 != null) {
                        C23144b bVar = new C23144b(view2);
                        AddToCartButton addToCartButton = this.f105898d;
                        if (addToCartButton != null) {
                            str = addToCartButton.getClickHint();
                        } else {
                            str = null;
                        }
                        bVar.mo37635a(str).mo37637b();
                        return;
                    }
                    return;
                }
                SkuPanelBottomWidget skuPanelBottomWidget = this.f105896b;
                String a = skuPanelBottomWidget.mo76667l().mo76700a();
                if (a != null) {
                    Context context = skuPanelBottomWidget.mo39077a().getContext();
                    C89219l.m154716b(context, "");
                    String string = context.getResources().getString(R.string.bg5, a);
                    C89219l.m154716b(string, "");
                    View view3 = skuPanelBottomWidget.f56005e;
                    if (view3 != null) {
                        new C23144b(view3).mo37635a(string).mo37637b();
                        return;
                    }
                    return;
                }
                skuPanelBottomWidget.mo76670a(new C45443c(skuPanelBottomWidget));
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45450j(SkuPanelBottomWidget skuPanelBottomWidget, boolean z, AddToCartButton addToCartButton) {
            super(700);
            this.f105896b = skuPanelBottomWidget;
            this.f105897c = z;
            this.f105898d = addToCartButton;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo76671a(boolean z, AddToCartButton addToCartButton) {
        TuxButton tuxButton = this.f105877h;
        if (tuxButton == null) {
            C89219l.m154710a("addToCartBtn");
        }
        tuxButton.setOnClickListener(new C45450j(this, z, addToCartButton));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget$i */
    static final class C45449i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelBottomWidget f105894a;

        static {
            Covode.recordClassIndex(53934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45449i(SkuPanelBottomWidget skuPanelBottomWidget) {
            super(2);
            this.f105894a = skuPanelBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            int i;
            C89219l.m154721d(iVar, "");
            TuxButton tuxButton = this.f105894a.f105878i;
            if (tuxButton == null) {
                C89219l.m154710a("buyNowBtn");
            }
            Context context = this.f105894a.mo39077a().getContext();
            C89219l.m154716b(context, "");
            Resources resources = context.getResources();
            if (this.f105894a.f105880k == 1 || this.f105894a.f105880k == 3) {
                i = R.string.bh3;
            } else if (C89219l.m154714a((Object) bool, (Object) true)) {
                i = R.string.bgw;
            } else {
                i = R.string.bf_;
            }
            tuxButton.setText(resources.getString(i));
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget$g */
    static final class C45447g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, AddToCartButton, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelBottomWidget f105892a;

        static {
            Covode.recordClassIndex(53932);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45447g(SkuPanelBottomWidget skuPanelBottomWidget) {
            super(2);
            this.f105892a = skuPanelBottomWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, AddToCartButton addToCartButton) {
            Integer num;
            AddToCartButton addToCartButton2 = addToCartButton;
            C89219l.m154721d(iVar, "");
            SkuPanelBottomWidget skuPanelBottomWidget = this.f105892a;
            if (addToCartButton2 != null) {
                num = addToCartButton2.getStatus();
            } else {
                num = null;
            }
            if (num != null) {
                if (num.intValue() == 2) {
                    TuxButton tuxButton = skuPanelBottomWidget.f105877h;
                    if (tuxButton == null) {
                        C89219l.m154710a("addToCartBtn");
                    }
                    tuxButton.setVisibility(0);
                    TuxButton tuxButton2 = skuPanelBottomWidget.f105877h;
                    if (tuxButton2 == null) {
                        C89219l.m154710a("addToCartBtn");
                    }
                    TuxButton tuxButton3 = skuPanelBottomWidget.f105877h;
                    if (tuxButton3 == null) {
                        C89219l.m154710a("addToCartBtn");
                    }
                    tuxButton2.setBackgroundColor(C0643b.m2378c(tuxButton3.getContext(), R.color.f));
                    TuxButton tuxButton4 = skuPanelBottomWidget.f105877h;
                    if (tuxButton4 == null) {
                        C89219l.m154710a("addToCartBtn");
                    }
                    int c = C0643b.m2378c(tuxButton4.getContext(), R.color.bz);
                    TuxButton tuxButton5 = skuPanelBottomWidget.f105877h;
                    if (tuxButton5 == null) {
                        C89219l.m154710a("addToCartBtn");
                    }
                    tuxButton5.setTextColor(c);
                    skuPanelBottomWidget.mo76671a(true, addToCartButton2);
                } else if (num.intValue() == 1) {
                    TuxButton tuxButton6 = skuPanelBottomWidget.f105877h;
                    if (tuxButton6 == null) {
                        C89219l.m154710a("addToCartBtn");
                    }
                    tuxButton6.setVisibility(0);
                    TuxButton tuxButton7 = skuPanelBottomWidget.f105877h;
                    if (tuxButton7 == null) {
                        C89219l.m154710a("addToCartBtn");
                    }
                    int c2 = C0643b.m2378c(tuxButton7.getContext(), R.color.bh);
                    TuxButton tuxButton8 = skuPanelBottomWidget.f105877h;
                    if (tuxButton8 == null) {
                        C89219l.m154710a("addToCartBtn");
                    }
                    tuxButton8.setTextColor(c2);
                    TuxButton tuxButton9 = skuPanelBottomWidget.f105877h;
                    if (tuxButton9 == null) {
                        C89219l.m154710a("addToCartBtn");
                    }
                    TuxButton tuxButton10 = skuPanelBottomWidget.f105877h;
                    if (tuxButton10 == null) {
                        C89219l.m154710a("addToCartBtn");
                    }
                    Context context = tuxButton10.getContext();
                    C89219l.m154716b(context, "");
                    tuxButton9.setBackgroundDrawable(C45591a.m88135a(context));
                    skuPanelBottomWidget.mo76671a(false, null);
                }
                return C89391z.f203057a;
            }
            TuxButton tuxButton11 = skuPanelBottomWidget.f105877h;
            if (tuxButton11 == null) {
                C89219l.m154710a("addToCartBtn");
            }
            tuxButton11.setVisibility(8);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBottomWidget$b */
    public static final class C45442b implements IAccountService.AbstractC31277g {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f105886a;

        static {
            Covode.recordClassIndex(53927);
        }

        C45442b(AbstractC89171a aVar) {
            this.f105886a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.IAccountService.AbstractC31277g
        public final void onResult(int i, int i2, Object obj) {
            if (i == 1 && i2 == 1) {
                this.f105886a.invoke();
            }
        }
    }
}
