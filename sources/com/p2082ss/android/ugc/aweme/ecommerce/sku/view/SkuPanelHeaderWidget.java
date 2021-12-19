package com.p2082ss.android.ugc.aweme.ecommerce.sku.view;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.ext.adapter.C20624b;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20734k;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.gallery.C44482a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2850b.C44720k;
import com.p2082ss.android.ugc.aweme.ecommerce.preloader.C45090c;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuPanelViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.viewmodel.SkuState;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionItem;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import com.p2082ss.android.ugc.aweme.ecommercebase.view.TagTextView;
import com.p2082ss.android.ugc.aweme.ecommercebase.view.p2864a.C45678b;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget */
public final class SkuPanelHeaderWidget extends SkuPanelBaseWidget implements AbstractC33974au {

    /* renamed from: r */
    public static final C45465a f105920r = new C45465a((byte) 0);

    /* renamed from: h */
    public SmartImageView f105921h;

    /* renamed from: i */
    public TuxIconView f105922i;

    /* renamed from: j */
    public TuxTextView f105923j;

    /* renamed from: k */
    public TuxTextView f105924k;

    /* renamed from: l */
    public TagTextView f105925l;

    /* renamed from: m */
    public TuxTextView f105926m;

    /* renamed from: n */
    public TuxTextView f105927n;

    /* renamed from: o */
    public TuxTextView f105928o;

    /* renamed from: p */
    public int f105929p;

    /* renamed from: q */
    public int f105930q;

    /* renamed from: s */
    private final int f105931s = R.layout.qy;

    /* renamed from: t */
    private Barrier f105932t;

    /* renamed from: u */
    private Barrier f105933u;

    static {
        Covode.recordClassIndex(53951);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget, com.bytedance.widget.Widget, androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.base.arch.JediBaseWidget
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget$a */
    public static final class C45465a {
        static {
            Covode.recordClassIndex(53952);
        }

        private C45465a() {
        }

        public /* synthetic */ C45465a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.widget.Widget
    /* renamed from: b */
    public final int mo39079b() {
        return this.f105931s;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget
    /* renamed from: m */
    public final void mo76668m() {
        super.mo76668m();
        SkuPanelViewModel l = mo76667l();
        AbstractC88412b unused = selectSubscribe(l, C45482f.f105950a, new C20370ah(), new C45466b(this));
        AbstractC88412b unused2 = selectSubscribe(l, C45486j.f105954a, new C20370ah(), new C45468c(this));
        AbstractC88412b unused3 = selectSubscribe(l, C45487k.f105955a, new C20370ah(), new C45469d(this));
        AbstractC88412b unused4 = selectSubscribe(l, C45488l.f105956a, new C20370ah(), new C45470e(this));
        AbstractC88412b unused5 = selectSubscribe(l, C45489m.f105957a, new C20370ah(), new C45471f(this));
        AbstractC88412b unused6 = selectSubscribe(l, C45483g.f105951a, new C20370ah(), new C45472g(this));
        AbstractC88412b unused7 = selectSubscribe(l, C45484h.f105952a, new C20370ah(), new C45473h(this));
        AbstractC88412b unused8 = selectSubscribe(l, C45485i.f105953a, new C20370ah(), new C45474i(this));
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelBaseWidget
    /* renamed from: n */
    public final void mo76669n() {
        super.mo76669n();
        this.f105921h = (SmartImageView) mo76666a(R.id.e2e);
        this.f105922i = (TuxIconView) mo76666a(R.id.e2a);
        this.f105923j = (TuxTextView) mo76666a(R.id.e2h);
        this.f105924k = (TuxTextView) mo76666a(R.id.e2f);
        this.f105925l = (TagTextView) mo76666a(R.id.e2j);
        this.f105926m = (TuxTextView) mo76666a(R.id.e2i);
        this.f105927n = (TuxTextView) mo76666a(R.id.e2g);
        this.f105928o = (TuxTextView) mo76666a(R.id.e2c);
        this.f105932t = (Barrier) mo76666a(R.id.e2d);
        this.f105933u = (Barrier) mo76666a(R.id.e2b);
        Barrier barrier = this.f105932t;
        if (barrier == null) {
            C89219l.m154710a("discountLineBarrier");
        }
        barrier.setReferencedIds(new int[]{R.id.e2c, R.id.e2g});
        Barrier barrier2 = this.f105933u;
        if (barrier2 == null) {
            C89219l.m154710a("skuHeaderBarrier");
        }
        barrier2.setReferencedIds(new int[]{R.id.e2i, R.id.e2e});
        TuxTextView tuxTextView = this.f105927n;
        if (tuxTextView == null) {
            C89219l.m154710a("originalPriceView");
        }
        TextPaint paint = tuxTextView.getPaint();
        C89219l.m154716b(paint, "");
        paint.setFlags(16);
        TuxTextView tuxTextView2 = this.f105927n;
        if (tuxTextView2 == null) {
            C89219l.m154710a("originalPriceView");
        }
        TextPaint paint2 = tuxTextView2.getPaint();
        C89219l.m154716b(paint2, "");
        paint2.setAntiAlias(true);
        SmartImageView smartImageView = this.f105921h;
        if (smartImageView == null) {
            C89219l.m154710a("headerImageView");
        }
        smartImageView.setOnClickListener(new View$OnClickListenerC45475j(this));
        this.f105929p = (int) C13628n.m24520b(mo39077a().getContext(), 8.0f);
        this.f105930q = (int) C13628n.m24520b(mo39077a().getContext(), 0.0f);
    }

    /* renamed from: a */
    public static final /* synthetic */ TuxTextView m88020a(SkuPanelHeaderWidget skuPanelHeaderWidget) {
        TuxTextView tuxTextView = skuPanelHeaderWidget.f105923j;
        if (tuxTextView == null) {
            C89219l.m154710a("priceView");
        }
        return tuxTextView;
    }

    /* renamed from: b */
    public static final /* synthetic */ TuxTextView m88021b(SkuPanelHeaderWidget skuPanelHeaderWidget) {
        TuxTextView tuxTextView = skuPanelHeaderWidget.f105924k;
        if (tuxTextView == null) {
            C89219l.m154710a("lowStockWarningView");
        }
        return tuxTextView;
    }

    /* renamed from: c */
    public static final /* synthetic */ TuxTextView m88022c(SkuPanelHeaderWidget skuPanelHeaderWidget) {
        TuxTextView tuxTextView = skuPanelHeaderWidget.f105927n;
        if (tuxTextView == null) {
            C89219l.m154710a("originalPriceView");
        }
        return tuxTextView;
    }

    /* renamed from: d */
    public static final /* synthetic */ TuxTextView m88023d(SkuPanelHeaderWidget skuPanelHeaderWidget) {
        TuxTextView tuxTextView = skuPanelHeaderWidget.f105928o;
        if (tuxTextView == null) {
            C89219l.m154710a("discountTextView");
        }
        return tuxTextView;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget$j */
    static final class View$OnClickListenerC45475j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ SkuPanelHeaderWidget f105943a;

        static {
            Covode.recordClassIndex(53962);
        }

        View$OnClickListenerC45475j(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            this.f105943a = skuPanelHeaderWidget;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            SkuPanelHeaderWidget skuPanelHeaderWidget = this.f105943a;
            skuPanelHeaderWidget.withState(skuPanelHeaderWidget.mo76667l(), new AbstractC89172b<SkuState, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget.View$OnClickListenerC45475j.C454761 */

                /* renamed from: a */
                final /* synthetic */ View$OnClickListenerC45475j f105944a;

                static {
                    Covode.recordClassIndex(53963);
                }

                {
                    this.f105944a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(SkuState skuState) {
                    String productId;
                    Object obj;
                    String str;
                    SkuState skuState2 = skuState;
                    String str2 = "";
                    C89219l.m154721d(skuState2, str2);
                    if (C89219l.m154714a((Object) skuState2.getKeyBoardVisibility(), (Object) true)) {
                        this.f105944a.f105943a.mo76667l().mo76704a(false);
                    } else {
                        List<Image> list = this.f105944a.f105943a.mo76667l().f106003a;
                        if (list != null && !list.isEmpty()) {
                            C44720k a = C44720k.C44721a.m87476a(C20624b.m38846b(this.f105944a.f105943a));
                            if (a != null) {
                                Image image = (Image) C89070n.m154561b((List) this.f105944a.f105943a.mo76667l().f106003a, skuState2.getCurrentImagePosition());
                                if (image != null) {
                                    str = image.getUri();
                                } else {
                                    str = null;
                                }
                                a.mo75880d(str);
                            }
                            ActivityC0945e b = C20624b.m38846b(this.f105944a.f105943a);
                            int currentImagePosition = skuState2.getCurrentImagePosition();
                            int size = this.f105944a.f105943a.mo76667l().f106003a.size();
                            List<Image> list2 = this.f105944a.f105943a.mo76667l().f106003a;
                            ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list2, 10));
                            Iterator<T> it = list2.iterator();
                            while (it.hasNext()) {
                                List<String> list3 = it.next().toImageUrlModel().f48941a;
                                if (list3 == null || (obj = C89070n.m154561b((List) list3, 0)) == null) {
                                    obj = str2;
                                }
                                arrayList.add(obj);
                            }
                            ArrayList arrayList2 = arrayList;
                            List<String> list4 = this.f105944a.f105943a.mo76667l().f106004b;
                            SkuPanelStarter.SkuEnterParams skuEnterParams = this.f105944a.f105943a.mo76667l().f106007e;
                            if (!(skuEnterParams == null || (productId = skuEnterParams.getProductId()) == null)) {
                                str2 = productId;
                            }
                            C44482a.m87167a(b, currentImagePosition, size, arrayList2, str2, "sku", list4, null, null, null, 14144);
                        }
                    }
                    return C89391z.f203057a;
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget$d */
    static final class C45469d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelHeaderWidget f105937a;

        static {
            Covode.recordClassIndex(53956);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45469d(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.f105937a = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, String str) {
            String str2 = str;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(str2, "");
            SkuPanelHeaderWidget.m88020a(this.f105937a).setText(str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget$g */
    static final class C45472g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelHeaderWidget f105940a;

        static {
            Covode.recordClassIndex(53959);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45472g(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.f105940a = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, String str) {
            String str2 = str;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(str2, "");
            TuxTextView tuxTextView = this.f105940a.f105926m;
            if (tuxTextView == null) {
                C89219l.m154710a("specsView");
            }
            tuxTextView.setText(str2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget$c */
    static final class C45468c extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelHeaderWidget f105936a;

        static {
            Covode.recordClassIndex(53955);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45468c(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.f105936a = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Boolean bool) {
            int i;
            int i2;
            C89219l.m154721d(iVar, "");
            TuxIconView tuxIconView = this.f105936a.f105922i;
            if (tuxIconView == null) {
                C89219l.m154710a("couponIcon");
            }
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                i = 0;
            } else {
                i = 8;
            }
            tuxIconView.setVisibility(i);
            TuxTextView a = SkuPanelHeaderWidget.m88020a(this.f105936a);
            if (C89219l.m154714a((Object) bool, (Object) true)) {
                i2 = R.attr.ay;
            } else {
                i2 = R.attr.bc;
            }
            a.setTextColorRes(i2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget$e */
    static final class C45470e extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelHeaderWidget f105938a;

        static {
            Covode.recordClassIndex(53957);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45470e(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.f105938a = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, String str) {
            String str2 = str;
            C89219l.m154721d(iVar, "");
            if (str2 == null || !(!C89219l.m154714a((Object) str2, (Object) ""))) {
                SkuPanelHeaderWidget.m88021b(this.f105938a).setVisibility(8);
            } else {
                SkuPanelHeaderWidget.m88021b(this.f105938a).setVisibility(0);
                SkuPanelHeaderWidget.m88021b(this.f105938a).setText(str2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget$f */
    static final class C45471f extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, PromotionView, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelHeaderWidget f105939a;

        static {
            Covode.recordClassIndex(53958);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45471f(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.f105939a = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, PromotionView promotionView) {
            PromotionItem promotionItem;
            List<PromotionItem> promotion_items;
            PromotionView promotionView2 = promotionView;
            C89219l.m154721d(iVar, "");
            if (promotionView2 == null || (promotion_items = promotionView2.getPromotion_items()) == null) {
                promotionItem = null;
            } else {
                promotionItem = (PromotionItem) C89070n.m154583g((List) promotion_items);
            }
            C45678b a = C45678b.C45679a.m88187a(promotionItem);
            TagTextView tagTextView = this.f105939a.f105925l;
            if (tagTextView == null) {
                C89219l.m154710a("promotionTag");
            }
            tagTextView.setTagUi(a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget$i */
    static final class C45474i extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelHeaderWidget f105942a;

        static {
            Covode.recordClassIndex(53961);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45474i(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.f105942a = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, String str) {
            String str2 = str;
            C89219l.m154721d(iVar, "");
            if (str2 == null || !(!C89361p.m154870a((CharSequence) str2))) {
                SkuPanelHeaderWidget.m88023d(this.f105942a).setVisibility(8);
            } else {
                SkuPanelHeaderWidget.m88023d(this.f105942a).setVisibility(0);
                SkuPanelHeaderWidget.m88023d(this.f105942a).setText(str2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget$b */
    static final class C45466b extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Image, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelHeaderWidget f105934a;

        static {
            Covode.recordClassIndex(53953);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45466b(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.f105934a = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Image image) {
            Image image2 = image;
            C89219l.m154721d(iVar, "");
            if (image2 != null) {
                final C45090c cVar = new C45090c();
                cVar.mo76187a("sku_head");
                cVar.mo76183a(-1);
                cVar.mo76184a(image2.toThumbFirstImageUrlModel());
                C20766v a = C20761r.m39058a(image2.toThumbFirstImageUrlModel()).mo34179a("SkuPanelHeaderWidget");
                SmartImageView smartImageView = this.f105934a.f105921h;
                if (smartImageView == null) {
                    C89219l.m154710a("headerImageView");
                }
                a.f49092E = smartImageView;
                a.mo34181a(new AbstractC20734k() {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget.C45466b.C454671 */

                    static {
                        Covode.recordClassIndex(53954);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34146a(Uri uri) {
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34147a(Uri uri, View view) {
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34148a(Uri uri, C20758o oVar) {
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34149a(Uri uri, Throwable th) {
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34159a(Uri uri, View view, Throwable th) {
                        cVar.mo76188a(th);
                    }

                    @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                    /* renamed from: a */
                    public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
                        cVar.mo76185a(oVar);
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.view.SkuPanelHeaderWidget$h */
    static final class C45473h extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ SkuPanelHeaderWidget f105941a;

        static {
            Covode.recordClassIndex(53960);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45473h(SkuPanelHeaderWidget skuPanelHeaderWidget) {
            super(2);
            this.f105941a = skuPanelHeaderWidget;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, String str) {
            String str2 = str;
            C89219l.m154721d(iVar, "");
            if (str2 != null) {
                SkuPanelHeaderWidget.m88022c(this.f105941a).setVisibility(0);
                SkuPanelHeaderWidget.m88022c(this.f105941a).setText(str2);
                ViewGroup.LayoutParams layoutParams = SkuPanelHeaderWidget.m88023d(this.f105941a).getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ConstraintLayout.C0547a) layoutParams).leftMargin = this.f105941a.f105929p;
            } else {
                SkuPanelHeaderWidget.m88022c(this.f105941a).setVisibility(8);
                ViewGroup.LayoutParams layoutParams2 = SkuPanelHeaderWidget.m88023d(this.f105941a).getLayoutParams();
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                ((ConstraintLayout.C0547a) layoutParams2).leftMargin = this.f105941a.f105930q;
            }
            return C89391z.f203057a;
        }
    }
}
