package com.p2082ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20767w;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20728e;
import com.bytedance.services.apm.api.C22708a;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1719f.C23142d;
import com.bytedance.tux.p1719f.p1720a.C23127c;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44778g;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.FlashSale;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.PickTag;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.ProductDetailReview;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.WaistBanner;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45562g;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45573n;
import com.p2082ss.android.ugc.aweme.ecommerce.widget.LogoTuxTextView;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionItem;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import com.p2082ss.android.ugc.aweme.ecommercebase.view.C45676a;
import com.p2082ss.android.ugc.aweme.ecommercebase.view.TagTextView;
import com.p2082ss.android.ugc.aweme.ecommercebase.view.p2864a.C45678b;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89047am;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView */
public final class CommerceProductInfoView extends FrameLayout {

    /* renamed from: d */
    public static final C44964c f104893d = new C44964c((byte) 0);

    /* renamed from: w */
    private static final BDDateFormat f104894w = new BDDateFormat("MMM D h:mm A");

    /* renamed from: x */
    private static final SimpleDateFormat f104895x;

    /* renamed from: a */
    public int f104896a;

    /* renamed from: b */
    public PromotionView f104897b;

    /* renamed from: c */
    public AbstractC44965d f104898c;

    /* renamed from: e */
    private final AbstractC89244h f104899e;

    /* renamed from: f */
    private final AbstractC89244h f104900f;

    /* renamed from: g */
    private final AbstractC89244h f104901g;

    /* renamed from: h */
    private final AbstractC89244h f104902h;

    /* renamed from: i */
    private final AbstractC89244h f104903i;

    /* renamed from: j */
    private final AbstractC89244h f104904j;

    /* renamed from: k */
    private final AbstractC89244h f104905k;

    /* renamed from: l */
    private final AbstractC89244h f104906l;

    /* renamed from: m */
    private final AbstractC89244h f104907m;

    /* renamed from: n */
    private final AbstractC89244h f104908n;

    /* renamed from: o */
    private final AbstractC89244h f104909o;

    /* renamed from: p */
    private final AbstractC89244h f104910p;

    /* renamed from: q */
    private final AbstractC89244h f104911q;

    /* renamed from: r */
    private final AbstractC89244h f104912r;

    /* renamed from: s */
    private final AbstractC89244h f104913s;

    /* renamed from: t */
    private final AbstractC89244h f104914t;

    /* renamed from: u */
    private final AbstractC89244h f104915u;

    /* renamed from: v */
    private WaistBanner f104916v;

    /* renamed from: y */
    private SparseArray f104917y;

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$d */
    public interface AbstractC44965d {
        static {
            Covode.recordClassIndex(53383);
        }

        /* renamed from: a */
        void mo76083a(PromotionView promotionView, int i);

        /* renamed from: a */
        void mo76084a(String str, String str2);

        /* renamed from: b */
        void mo76085b(PromotionView promotionView, int i);
    }

    public CommerceProductInfoView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public CommerceProductInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: a */
    private View m87645a(int i) {
        if (this.f104917y == null) {
            this.f104917y = new SparseArray();
        }
        View view = (View) this.f104917y.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f104917y.put(i, findViewById);
        return findViewById;
    }

    private final TuxTextView getActivityNameSingle() {
        return (TuxTextView) this.f104907m.getValue();
    }

    private final LogoTuxTextView getDesc() {
        return (LogoTuxTextView) this.f104899e.getValue();
    }

    private final FlashSaleCountDownView getFlashSaleOnCountdown() {
        return (FlashSaleCountDownView) this.f104912r.getValue();
    }

    private final TuxTextView getFlashSaleOnCountdownEndsText() {
        return (TuxTextView) this.f104913s.getValue();
    }

    private final TuxTextView getFlashSaleOnTitle() {
        return (TuxTextView) this.f104911q.getValue();
    }

    private final TuxIconView getIcCoupon() {
        return (TuxIconView) this.f104909o.getValue();
    }

    private final TuxIconView getOpenCouponSheet() {
        return (TuxIconView) this.f104914t.getValue();
    }

    private final TuxTextView getPickName() {
        return (TuxTextView) this.f104906l.getValue();
    }

    private final View getPlaceHolder() {
        return (View) this.f104908n.getValue();
    }

    private final TuxTextView getSales() {
        return (TuxTextView) this.f104900f.getValue();
    }

    private final TuxIconView getWaistBg() {
        return (TuxIconView) this.f104904j.getValue();
    }

    private final LinearLayout getWaistRight() {
        return (LinearLayout) this.f104905k.getValue();
    }

    public final LinearLayout getCouponTags() {
        return (LinearLayout) this.f104915u.getValue();
    }

    public final TuxTextView getDiscount() {
        return (TuxTextView) this.f104903i.getValue();
    }

    public final FlashSaleBg getFlashSaleOnCountDownContainer() {
        return (FlashSaleBg) this.f104910p.getValue();
    }

    public final TuxTextView getMarketPrice() {
        return (TuxTextView) this.f104901g.getValue();
    }

    public final TuxTextView getPrimaryPrice() {
        return (TuxTextView) this.f104902h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$c */
    public static final class C44964c {
        static {
            Covode.recordClassIndex(53382);
        }

        private C44964c() {
        }

        public /* synthetic */ C44964c(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private final boolean m87652a(PickTag pickTag, boolean z, boolean z2) {
        String str;
        String str2;
        int i;
        LinearLayout linearLayout = (LinearLayout) m87645a(R.id.a42);
        C89219l.m154716b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        String str3 = null;
        if (!(layoutParams instanceof ConstraintLayout.C0547a)) {
            layoutParams = null;
        }
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
        if (aVar != null) {
            ConstraintLayout.C0547a aVar2 = aVar;
            if (z || !z2) {
                i = R.id.cie;
            } else {
                i = R.id.als;
            }
            aVar2.f2271i = i;
            linearLayout.setLayoutParams(aVar);
        }
        if (pickTag == null || (str = pickTag.f104654b) == null || str.length() == 0) {
            LinearLayout linearLayout2 = (LinearLayout) m87645a(R.id.a42);
            C89219l.m154716b(linearLayout2, "");
            linearLayout2.setVisibility(8);
        } else {
            LinearLayout linearLayout3 = (LinearLayout) m87645a(R.id.a42);
            C89219l.m154716b(linearLayout3, "");
            linearLayout3.setVisibility(0);
            C20766v a = C45562g.m88109a((Object) (pickTag != null ? pickTag.f104655c : null));
            a.f49093F = (ImageView) m87645a(R.id.a43);
            a.mo34186c();
            if (!(pickTag == null || (str2 = pickTag.f104654b) == null || str2.length() == 0)) {
                TuxTextView tuxTextView = (TuxTextView) m87645a(R.id.a44);
                C89219l.m154716b(tuxTextView, "");
                if (pickTag != null) {
                    str3 = pickTag.f104654b;
                }
                tuxTextView.setText(str3);
            }
        }
        LinearLayout linearLayout4 = (LinearLayout) m87645a(R.id.a42);
        C89219l.m154716b(linearLayout4, "");
        return linearLayout4.getVisibility() == 0;
    }

    /* renamed from: a */
    private final void m87651a(boolean z, boolean z2, boolean z3) {
        int i;
        TuxTextView primaryPrice = getPrimaryPrice();
        if (z2) {
            i = R.attr.aa;
        } else {
            i = z3 ? R.attr.ay : R.attr.bc;
        }
        primaryPrice.setTextColorRes(i);
        ViewGroup.LayoutParams layoutParams = getPrimaryPrice().getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.C0547a)) {
            layoutParams = null;
        }
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
        if (aVar != null) {
            if (!z2) {
                aVar.topMargin = C34728n.m70946a(16.0d);
            } else if (z) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                aVar.topMargin = C89241a.m154730a(TypedValue.applyDimension(1, 7.5f, system.getDisplayMetrics()));
            } else {
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                aVar.topMargin = C89241a.m154730a(TypedValue.applyDimension(1, 5.0f, system2.getDisplayMetrics()));
            }
            getPrimaryPrice().setLayoutParams(aVar);
        }
        if (z) {
            getPrimaryPrice().setTuxFont(32);
        } else {
            getPrimaryPrice().setTuxFont(22);
        }
    }

    /* renamed from: a */
    public final void mo76098a(C44778g gVar, int i, AbstractC89171a<C89391z> aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        CharSequence charSequence;
        Float f;
        Long g;
        List<PromotionItem> promotion_items;
        FlashSale flashSale;
        Integer num;
        FlashSale flashSale2;
        Integer num2;
        C89219l.m154721d(gVar, "");
        WaistBanner waistBanner = gVar.f104474g;
        int i2 = 0;
        if (waistBanner == null || (waistBanner.f104722a.length() <= 0 && waistBanner.f104723b == null)) {
            z = false;
        } else {
            z = true;
        }
        if (z || !((flashSale2 = gVar.f104478k) == null || (num2 = flashSale2.f104641b) == null || num2.intValue() != 2)) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z4 = gVar.f104473f;
        boolean z5 = !C89361p.m154870a((CharSequence) gVar.f104470c);
        if ((!z2 || !((flashSale = gVar.f104478k) == null || (num = flashSale.f104641b) == null || num.intValue() != 2)) && !C89361p.m154870a((CharSequence) gVar.f104472e)) {
            z3 = true;
        } else {
            z3 = false;
        }
        PromotionView promotionView = gVar.f104482o;
        boolean z6 = (promotionView == null || (promotion_items = promotionView.getPromotion_items()) == null || promotion_items.size() <= 0) ? false : true;
        m87653b(z2, gVar);
        m87655b(gVar.f104480m, z2, z4);
        m87651a(gVar.f104480m, z2, z4);
        m87654b(z2, z5);
        m87650a(z2, z3);
        m87649a(m87652a(gVar.f104479l, z5, z3), gVar.f104478k, z5, z3);
        m87648a(z6, gVar);
        TuxTextView primaryPrice = getPrimaryPrice();
        String str = gVar.f104469b;
        if (str.length() == 0) {
            charSequence = "--";
        } else {
            charSequence = new C17191a.C17192a().mo27179b(str).f40973a;
        }
        primaryPrice.setText(charSequence);
        TextPaint paint = getMarketPrice().getPaint();
        C89219l.m154716b(paint, "");
        paint.setFlags(16);
        TextPaint paint2 = getMarketPrice().getPaint();
        C89219l.m154716b(paint2, "");
        paint2.setAntiAlias(true);
        getMarketPrice().setText(new C17191a.C17192a().mo27179b(gVar.f104470c).f40973a);
        PdpExtraInfoView pdpExtraInfoView = (PdpExtraInfoView) m87645a(R.id.ay6);
        String str2 = gVar.f104471d;
        pdpExtraInfoView.setSales((str2 == null || (g = C89361p.m154865g(str2)) == null) ? 0 : g.longValue());
        PdpExtraInfoView pdpExtraInfoView2 = (PdpExtraInfoView) m87645a(R.id.ay6);
        ProductDetailReview productDetailReview = gVar.f104476i;
        pdpExtraInfoView2.setRate((productDetailReview == null || (f = productDetailReview.f104664a) == null) ? 0.0f : f.floatValue());
        PdpExtraInfoView pdpExtraInfoView3 = (PdpExtraInfoView) m87645a(R.id.ay6);
        C89219l.m154716b(pdpExtraInfoView3, "");
        if (pdpExtraInfoView3.getVisibility() == 0) {
            LinearLayout linearLayout = (LinearLayout) m87645a(R.id.b8w);
            C89219l.m154716b(linearLayout, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            C23163i.m43668b(linearLayout, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()))), null, null, null, false, 30);
            LinearLayout linearLayout2 = (LinearLayout) m87645a(R.id.b8w);
            C89219l.m154716b(linearLayout2, "");
            linearLayout2.setGravity(8388629);
        } else {
            LinearLayout linearLayout3 = (LinearLayout) m87645a(R.id.b8w);
            C89219l.m154716b(linearLayout3, "");
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            C23163i.m43668b(linearLayout3, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 0.0f, system2.getDisplayMetrics()))), null, null, null, false, 30);
            LinearLayout linearLayout4 = (LinearLayout) m87645a(R.id.b8w);
            C89219l.m154716b(linearLayout4, "");
            linearLayout4.setGravity(8388627);
        }
        LinearLayout linearLayout5 = (LinearLayout) m87645a(R.id.b8w);
        C89219l.m154716b(linearLayout5, "");
        if (!gVar.f104477j) {
            i2 = 8;
        }
        linearLayout5.setVisibility(i2);
        getDiscount().setText(gVar.f104472e);
        getDesc().mo76800a(gVar.f104468a, gVar.f104481n);
        if (i != 1) {
            getDesc().setMaxLines(i);
        }
        post(new RunnableC44967f(this, aVar));
        m87656c(z2, z5, z3);
    }

    /* renamed from: a */
    public final void mo76100a(boolean z) {
        if (getFlashSaleOnCountDownContainer().getVisibility() != 0) {
            getPrimaryPrice().setMaxWidth(Integer.MAX_VALUE);
            getMarketPrice().setMaxWidth(Integer.MAX_VALUE);
        } else if (C23163i.m43664a(this)) {
            if (!z) {
                if (getDiscount().getLeft() < getFlashSaleOnCountDownContainer().getRight()) {
                    getDiscount().setVisibility(4);
                } else {
                    getDiscount().setVisibility(0);
                }
                if (getMarketPrice().getLeft() < getFlashSaleOnCountDownContainer().getRight()) {
                    TuxTextView marketPrice = getMarketPrice();
                    int width = getWidth() - getFlashSaleOnCountDownContainer().getRight();
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    marketPrice.setMaxWidth(width - C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics())));
                }
            } else if (getDiscount().getLeft() < getFlashSaleOnCountDownContainer().getRight() || getMarketPrice().getLeft() < getFlashSaleOnCountDownContainer().getRight() || getPrimaryPrice().getLeft() < getFlashSaleOnCountDownContainer().getRight()) {
                m87646a();
            }
        } else if (!z) {
            if (getDiscount().getRight() > getFlashSaleOnCountDownContainer().getLeft()) {
                getDiscount().setVisibility(4);
            } else {
                getDiscount().setVisibility(0);
            }
            if (getMarketPrice().getRight() > getFlashSaleOnCountDownContainer().getLeft()) {
                TuxTextView marketPrice2 = getMarketPrice();
                int left = getFlashSaleOnCountDownContainer().getLeft();
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                marketPrice2.setMaxWidth(left - C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics())));
            }
        } else if (getDiscount().getRight() > getFlashSaleOnCountDownContainer().getLeft() || getMarketPrice().getRight() > getFlashSaleOnCountDownContainer().getLeft() || getPrimaryPrice().getRight() > getPrimaryPrice().getLeft()) {
            m87646a();
        }
    }

    /* renamed from: a */
    public final void mo76099a(FlashSale flashSale, long j) {
        C23142d dVar;
        Long g;
        Long g2;
        C89219l.m154721d(flashSale, "");
        long j2 = j + 999;
        getFlashSaleOnCountdown().mo76119a(j2, getFlashSaleOnCountdownEndsText());
        StringBuilder sb = new StringBuilder();
        String str = flashSale.f104645f;
        if (str == null) {
            str = "";
        }
        C23142d dVar2 = new C23142d(sb.append(str).append(' ').append(flashSale.f104646g).append(" · ").toString());
        dVar2.mo37628a(62);
        int i = j2 >= 86400000 ? R.string.bhx : R.string.bhw;
        if (j2 >= 86400000) {
            Integer num = flashSale.f104641b;
            long j3 = 0;
            if (num != null && num.intValue() == 1) {
                String str2 = flashSale.f104643d;
                if (!(str2 == null || (g = C89361p.m154865g(str2)) == null)) {
                    j3 = g.longValue() * 1000;
                }
                dVar = new C23142d(getContext().getString(i, BDDateFormat.m23653a(f104894w, j3)));
            } else {
                String str3 = flashSale.f104644e;
                if (!(str3 == null || (g2 = C89361p.m154865g(str3)) == null)) {
                    j3 = g2.longValue() * 1000;
                }
                dVar = new C23142d(getContext().getString(i, BDDateFormat.m23653a(f104894w, j3)));
            }
        } else {
            dVar = new C23142d(getContext().getString(i, f104895x.format(Long.valueOf(j2))));
        }
        TuxTextView tuxTextView = (TuxTextView) m87645a(R.id.b5w);
        C89219l.m154716b(tuxTextView, "");
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) dVar2);
        dVar.mo37628a(61);
        tuxTextView.setText(append.append((CharSequence) dVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$ac */
    public static final class RunnableC44960ac implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104922a;

        static {
            Covode.recordClassIndex(53378);
        }

        RunnableC44960ac(CommerceProductInfoView commerceProductInfoView) {
            this.f104922a = commerceProductInfoView;
        }

        public final void run() {
            this.f104922a.mo76100a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$x */
    public static final class C44986x extends AbstractC20728e {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104950a;

        static {
            Covode.recordClassIndex(53404);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$x$a */
        static final class RunnableC44987a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C44986x f104951a;

            /* renamed from: b */
            final /* synthetic */ Bitmap f104952b;

            static {
                Covode.recordClassIndex(53405);
            }

            RunnableC44987a(C44986x xVar, Bitmap bitmap) {
                this.f104951a = xVar;
                this.f104952b = bitmap;
            }

            public final void run() {
                ExecutorC34605m.f81660a.execute(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView.C44986x.RunnableC44987a.RunnableC449881 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC44987a f104953a;

                    static {
                        Covode.recordClassIndex(53406);
                    }

                    {
                        this.f104953a = r1;
                    }

                    public final void run() {
                        this.f104953a.f104951a.f104950a.getFlashSaleOnCountDownContainer().setFlashSaleBg(this.f104953a.f104952b);
                    }
                });
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44986x(CommerceProductInfoView commerceProductInfoView) {
            this.f104950a = commerceProductInfoView;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            if (bitmap != null) {
                C40780g.m82245b().execute(new RunnableC44987a(this, bitmap));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$ad */
    static final class C44961ad extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104923a;

        static {
            Covode.recordClassIndex(53379);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44961ad(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104923a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f104923a.findViewById(R.id.fhy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$ae */
    static final class C44962ae extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104924a;

        static {
            Covode.recordClassIndex(53380);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44962ae(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104924a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f104924a.findViewById(R.id.fhz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$e */
    static final class C44966e extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104927a;

        static {
            Covode.recordClassIndex(53384);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44966e(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104927a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f104927a.findViewById(R.id.cx);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$g */
    static final class C44968g extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104930a;

        static {
            Covode.recordClassIndex(53386);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44968g(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104930a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f104930a.findViewById(R.id.afm);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$h */
    static final class C44969h extends AbstractC89220m implements AbstractC89171a<LogoTuxTextView> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104931a;

        static {
            Covode.recordClassIndex(53387);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44969h(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104931a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LogoTuxTextView invoke() {
            return this.f104931a.findViewById(R.id.bbj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$i */
    static final class C44970i extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104932a;

        static {
            Covode.recordClassIndex(53388);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44970i(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104932a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f104932a.findViewById(R.id.als);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$j */
    static final class C44971j extends AbstractC89220m implements AbstractC89171a<FlashSaleBg> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104933a;

        static {
            Covode.recordClassIndex(53389);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44971j(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104933a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FlashSaleBg invoke() {
            return this.f104933a.findViewById(R.id.b5y);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$k */
    static final class C44972k extends AbstractC89220m implements AbstractC89171a<FlashSaleCountDownView> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104934a;

        static {
            Covode.recordClassIndex(53390);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44972k(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104934a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ FlashSaleCountDownView invoke() {
            return this.f104934a.findViewById(R.id.b5x);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$l */
    static final class C44973l extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104935a;

        static {
            Covode.recordClassIndex(53391);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44973l(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104935a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f104935a.findViewById(R.id.b60);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$m */
    static final class C44974m extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104936a;

        static {
            Covode.recordClassIndex(53392);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44974m(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104936a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f104936a.findViewById(R.id.b61);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$n */
    static final class C44975n extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104937a;

        static {
            Covode.recordClassIndex(53393);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44975n(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104937a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f104937a.findViewById(R.id.bgm);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$o */
    static final class C44976o extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104938a;

        static {
            Covode.recordClassIndex(53394);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44976o(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104938a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f104938a.findViewById(R.id.cie);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$p */
    static final class C44977p extends AbstractC89220m implements AbstractC89171a<TuxIconView> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104939a;

        static {
            Covode.recordClassIndex(53395);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44977p(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104939a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxIconView invoke() {
            return this.f104939a.findViewById(R.id.cwq);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$r */
    static final class C44979r extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104943a;

        static {
            Covode.recordClassIndex(53397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44979r(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104943a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f104943a.findViewById(R.id.d1s);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$s */
    static final class C44980s extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104944a;

        static {
            Covode.recordClassIndex(53398);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44980s(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104944a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f104944a.findViewById(R.id.d2e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$u */
    public static final class RunnableC44982u implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104946a;

        static {
            Covode.recordClassIndex(53400);
        }

        RunnableC44982u(CommerceProductInfoView commerceProductInfoView) {
            this.f104946a = commerceProductInfoView;
        }

        public final void run() {
            this.f104946a.getCouponTags().post(new Runnable(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView.RunnableC44982u.RunnableC449831 */

                /* renamed from: a */
                final /* synthetic */ RunnableC44982u f104947a;

                static {
                    Covode.recordClassIndex(53401);
                }

                {
                    this.f104947a = r1;
                }

                public final void run() {
                    int childCount = this.f104947a.f104946a.getCouponTags().getChildCount();
                    if (childCount >= 0) {
                        int i = 0;
                        while (true) {
                            View childAt = this.f104947a.f104946a.getCouponTags().getChildAt(i);
                            if (childAt != null && childAt.getVisibility() == 0) {
                                this.f104947a.f104946a.f104896a++;
                            }
                            if (i == childCount) {
                                break;
                            }
                            i++;
                        }
                    }
                    AbstractC44965d dVar = this.f104947a.f104946a.f104898c;
                    if (dVar != null) {
                        dVar.mo76083a(this.f104947a.f104946a.f104897b, this.f104947a.f104946a.f104896a);
                    }
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$y */
    static final class C44989y extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104954a;

        static {
            Covode.recordClassIndex(53407);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44989y(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104954a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f104954a.findViewById(R.id.d6h);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$z */
    static final class C44990z extends AbstractC89220m implements AbstractC89171a<TuxTextView> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104955a;

        static {
            Covode.recordClassIndex(53408);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44990z(CommerceProductInfoView commerceProductInfoView) {
            super(0);
            this.f104955a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ TuxTextView invoke() {
            return this.f104955a.findViewById(R.id.dou);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$f */
    static final class RunnableC44967f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104928a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f104929b;

        static {
            Covode.recordClassIndex(53385);
        }

        RunnableC44967f(CommerceProductInfoView commerceProductInfoView, AbstractC89171a aVar) {
            this.f104928a = commerceProductInfoView;
            this.f104929b = aVar;
        }

        public final void run() {
            try {
                AbstractC89171a aVar = this.f104929b;
                if (aVar != null) {
                    aVar.invoke();
                }
                this.f104928a.mo76100a(true);
            } catch (Exception e) {
                C22708a.m42802a((Throwable) e);
            }
        }
    }

    static {
        Covode.recordClassIndex(53374);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        f104895x = simpleDateFormat;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$aa */
    public static final class RunnableC44958aa implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104920a;

        static {
            Covode.recordClassIndex(53376);
        }

        RunnableC44958aa(CommerceProductInfoView commerceProductInfoView) {
            this.f104920a = commerceProductInfoView;
        }

        public final void run() {
            TuxTextView primaryPrice = this.f104920a.getPrimaryPrice();
            int width = this.f104920a.getWidth() - this.f104920a.getFlashSaleOnCountDownContainer().getRight();
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            primaryPrice.setMaxWidth(width - C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics())));
            if (this.f104920a.getDiscount().getVisibility() == 4) {
                TuxTextView marketPrice = this.f104920a.getMarketPrice();
                int width2 = this.f104920a.getWidth() - this.f104920a.getFlashSaleOnCountDownContainer().getRight();
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                marketPrice.setMaxWidth(width2 - C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics())));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$ab */
    public static final class RunnableC44959ab implements Runnable {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104921a;

        static {
            Covode.recordClassIndex(53377);
        }

        RunnableC44959ab(CommerceProductInfoView commerceProductInfoView) {
            this.f104921a = commerceProductInfoView;
        }

        public final void run() {
            TuxTextView primaryPrice = this.f104921a.getPrimaryPrice();
            int left = this.f104921a.getFlashSaleOnCountDownContainer().getLeft();
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            primaryPrice.setMaxWidth(left - C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system.getDisplayMetrics())));
            if (this.f104921a.getDiscount().getVisibility() == 4) {
                TuxTextView marketPrice = this.f104921a.getMarketPrice();
                int left2 = this.f104921a.getFlashSaleOnCountDownContainer().getLeft();
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                marketPrice.setMaxWidth(left2 - C89241a.m154730a(TypedValue.applyDimension(1, 32.0f, system2.getDisplayMetrics())));
            }
        }
    }

    /* renamed from: a */
    private final void m87646a() {
        if (getFlashSaleOnCountDownContainer().getVisibility() == 0) {
            if (C23163i.m43664a(this)) {
                if (getPrimaryPrice().getLeft() < getFlashSaleOnCountDownContainer().getRight()) {
                    LinearLayout linearLayout = (LinearLayout) m87645a(R.id.b5z);
                    C89219l.m154716b(linearLayout, "");
                    int width = linearLayout.getWidth();
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    int a = width + C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
                    int left = getPrimaryPrice().getLeft();
                    Resources system2 = Resources.getSystem();
                    C89219l.m154709a((Object) system2, "");
                    int max = Math.max(a, left - C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics())));
                    FlashSaleBg flashSaleOnCountDownContainer = getFlashSaleOnCountDownContainer();
                    ViewGroup.LayoutParams layoutParams = flashSaleOnCountDownContainer.getLayoutParams();
                    if ((layoutParams instanceof ViewGroup.LayoutParams) && layoutParams != null) {
                        if (getFlashSaleOnCountDownContainer().getWidth() > max) {
                            layoutParams.width = max;
                        }
                        flashSaleOnCountDownContainer.setLayoutParams(layoutParams);
                    }
                    post(new RunnableC44958aa(this));
                }
            } else if (getPrimaryPrice().getRight() > getFlashSaleOnCountDownContainer().getLeft()) {
                LinearLayout linearLayout2 = (LinearLayout) m87645a(R.id.b5z);
                C89219l.m154716b(linearLayout2, "");
                int width2 = linearLayout2.getWidth();
                Resources system3 = Resources.getSystem();
                C89219l.m154709a((Object) system3, "");
                int a2 = width2 + C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system3.getDisplayMetrics()));
                int width3 = getWidth() - getPrimaryPrice().getRight();
                Resources system4 = Resources.getSystem();
                C89219l.m154709a((Object) system4, "");
                int max2 = Math.max(a2, width3 - C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system4.getDisplayMetrics())));
                FlashSaleBg flashSaleOnCountDownContainer2 = getFlashSaleOnCountDownContainer();
                ViewGroup.LayoutParams layoutParams2 = flashSaleOnCountDownContainer2.getLayoutParams();
                if ((layoutParams2 instanceof ViewGroup.LayoutParams) && layoutParams2 != null) {
                    if (getFlashSaleOnCountDownContainer().getWidth() > max2) {
                        layoutParams2.width = max2;
                    }
                    flashSaleOnCountDownContainer2.setLayoutParams(layoutParams2);
                }
                post(new RunnableC44959ab(this));
            }
            post(new RunnableC44960ac(this));
            return;
        }
        getPrimaryPrice().setMaxWidth(Integer.MAX_VALUE);
        getMarketPrice().setMaxWidth(Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$q */
    public static final class C44978q extends AbstractC89220m implements AbstractC89172b<ConstraintLayout.C0547a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ boolean f104940a;

        /* renamed from: b */
        final /* synthetic */ boolean f104941b;

        /* renamed from: c */
        final /* synthetic */ boolean f104942c;

        static {
            Covode.recordClassIndex(53396);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44978q(boolean z, boolean z2, boolean z3) {
            super(1);
            this.f104940a = z;
            this.f104941b = z2;
            this.f104942c = z3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ConstraintLayout.C0547a aVar) {
            mo76111a(aVar);
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo76111a(ConstraintLayout.C0547a aVar) {
            int i;
            C89219l.m154721d(aVar, "");
            if (this.f104940a) {
                aVar.f2271i = R.id.fhy;
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                aVar.topMargin = C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
                return;
            }
            if (this.f104941b || !this.f104942c) {
                i = R.id.cie;
            } else {
                i = R.id.als;
            }
            aVar.f2271i = i;
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar.topMargin = C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
        }
    }

    public final void setCouponLogListener(AbstractC44965d dVar) {
        C89219l.m154721d(dVar, "");
        this.f104898c = dVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$a */
    public static final class C44957a extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f104918a = 700;

        /* renamed from: b */
        final /* synthetic */ CommerceProductInfoView f104919b;

        static {
            Covode.recordClassIndex(53375);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44957a(CommerceProductInfoView commerceProductInfoView) {
            super(700);
            this.f104919b = commerceProductInfoView;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            AbstractC44965d dVar;
            if (view != null && (dVar = this.f104919b.f104898c) != null) {
                dVar.mo76085b(this.f104919b.f104897b, this.f104919b.f104896a);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$b */
    public static final class C44963b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f104925a = 700;

        /* renamed from: b */
        final /* synthetic */ CommerceProductInfoView f104926b;

        static {
            Covode.recordClassIndex(53381);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44963b(CommerceProductInfoView commerceProductInfoView) {
            super(700);
            this.f104926b = commerceProductInfoView;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            AbstractC44965d dVar;
            if (view != null && (dVar = this.f104926b.f104898c) != null) {
                dVar.mo76085b(this.f104926b.f104897b, this.f104926b.f104896a);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$w */
    public static final class C44985w extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C44985w f104949a = new C44985w();

        static {
            Covode.recordClassIndex(53403);
        }

        C44985w() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_bolt_fill;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            aVar2.f54432b = C89241a.m154730a(TypedValue.applyDimension(1, 14.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            aVar2.f54433c = C89241a.m154730a(TypedValue.applyDimension(1, 14.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$t */
    public static final class C44981t extends AbstractC89220m implements AbstractC89172b<TagTextView, C89391z> {

        /* renamed from: a */
        public static final C44981t f104945a = new C44981t();

        static {
            Covode.recordClassIndex(53399);
        }

        C44981t() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(TagTextView tagTextView) {
            TagTextView tagTextView2 = tagTextView;
            C89219l.m154721d(tagTextView2, "");
            tagTextView2.setTextFont(62);
            tagTextView2.setTagLayoutParams(C89047am.m154439b(new C45676a(2, 0, (int) tagTextView2.mo76940a(19.0f), (int) tagTextView2.mo76940a(8.0f), (int) tagTextView2.mo76940a(5.0f), (int) tagTextView2.mo76940a(2.0f), (int) tagTextView2.mo76940a(13.0f), 0, 3162), new C45676a(1, 0, (int) tagTextView2.mo76940a(19.0f), (int) tagTextView2.mo76940a(8.0f), (int) tagTextView2.mo76940a(4.0f), (int) tagTextView2.mo76940a(2.0f), (int) tagTextView2.mo76940a(4.0f), 0, 3162)));
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView$v */
    public static final class C44984v extends AbstractC89220m implements AbstractC89183m<TuxIconView, Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CommerceProductInfoView f104948a;

        static {
            Covode.recordClassIndex(53402);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C44984v(CommerceProductInfoView commerceProductInfoView) {
            super(2);
            this.f104948a = commerceProductInfoView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(TuxIconView tuxIconView, Integer num) {
            mo76114a(tuxIconView, num.intValue());
            return C89391z.f203057a;
        }

        /* renamed from: a */
        public final void mo76114a(TuxIconView tuxIconView, int i) {
            C89219l.m154721d(tuxIconView, "");
            if (this.f104948a.getVisibility() == 0 && tuxIconView != null) {
                if (tuxIconView.getWidth() != i || tuxIconView.getHeight() != i) {
                    ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
                    layoutParams.width = i;
                    layoutParams.height = i;
                }
            }
        }
    }

    /* renamed from: b */
    private final void m87654b(boolean z, boolean z2) {
        int i;
        int i2;
        TuxTextView marketPrice = getMarketPrice();
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        marketPrice.setVisibility(i);
        TuxTextView marketPrice2 = getMarketPrice();
        if (z) {
            i2 = R.attr.ab;
        } else {
            i2 = R.attr.bj;
        }
        marketPrice2.setTextColorRes(i2);
        ViewGroup.LayoutParams layoutParams = getMarketPrice().getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.C0547a)) {
            layoutParams = null;
        }
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
        if (aVar != null) {
            if (z) {
                aVar.topMargin = 0;
            } else {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                aVar.topMargin = C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
            }
            getMarketPrice().setLayoutParams(aVar);
        }
    }

    /* renamed from: a */
    private final void m87648a(boolean z, C44778g gVar) {
        List<PromotionItem> promotion_items;
        int i;
        int i2;
        MethodCollector.m26663i(7124);
        if (z) {
            getCouponTags().setVisibility(0);
            getOpenCouponSheet().setVisibility(0);
        } else {
            getCouponTags().setVisibility(8);
            getOpenCouponSheet().setVisibility(8);
        }
        getCouponTags().removeAllViews();
        int a = C34728n.m70946a(8.0d);
        if (getCouponTags().getVisibility() == 0) {
            ViewGroup.LayoutParams layoutParams = getCouponTags().getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
                ViewGroup.LayoutParams layoutParams2 = getOpenCouponSheet().getLayoutParams();
                if (layoutParams2 != null) {
                    ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams2;
                    int a2 = (((C13628n.m24504a(getContext()) - aVar.leftMargin) - aVar.rightMargin) - aVar2.width) - aVar2.rightMargin;
                    PromotionView promotionView = gVar.f104482o;
                    if (!(promotionView == null || (promotion_items = promotionView.getPromotion_items()) == null)) {
                        int i3 = 0;
                        int i4 = 0;
                        for (T t : promotion_items) {
                            int i5 = i3 + 1;
                            if (i3 < 0) {
                                C89070n.m154520a();
                            }
                            Context context = getContext();
                            C89219l.m154716b(context, "");
                            TagTextView tagTextView = new TagTextView(context, (AttributeSet) null, 6);
                            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                            int i6 = Build.VERSION.SDK_INT;
                            layoutParams3.setMarginEnd(a);
                            tagTextView.setLayoutParams(layoutParams3);
                            C44981t tVar = C44981t.f104945a;
                            C89219l.m154721d(tVar, "");
                            tVar.invoke(tagTextView);
                            tagTextView.setTagUi(C45678b.C45679a.m88187a(t));
                            SmartImageView smartImageView = (SmartImageView) tagTextView.mo76941a(R.id.een);
                            C89219l.m154716b(smartImageView, "");
                            if (smartImageView.getVisibility() == 0) {
                                SmartImageView smartImageView2 = (SmartImageView) tagTextView.mo76941a(R.id.een);
                                C89219l.m154716b(smartImageView2, "");
                                int i7 = smartImageView2.getLayoutParams().width;
                                SmartImageView smartImageView3 = (SmartImageView) tagTextView.mo76941a(R.id.een);
                                C89219l.m154716b(smartImageView3, "");
                                i = i7 + smartImageView3.getPaddingStart() + 0;
                            } else {
                                i = 0;
                            }
                            Paint paint = new Paint();
                            TuxTextView tuxTextView = (TuxTextView) tagTextView.mo76941a(R.id.eex);
                            C89219l.m154716b(tuxTextView, "");
                            paint.setTextSize(tuxTextView.getTextSize());
                            int paddingStart = tagTextView.getPaddingStart() + tagTextView.getPaddingEnd();
                            TuxTextView tuxTextView2 = (TuxTextView) tagTextView.mo76941a(R.id.eex);
                            C89219l.m154716b(tuxTextView2, "");
                            int measureText = i + paddingStart + ((int) paint.measureText(tuxTextView2.getText().toString()));
                            List<PromotionItem> promotion_items2 = gVar.f104482o.getPromotion_items();
                            if (promotion_items2 == null || i5 != promotion_items2.size()) {
                                i2 = a;
                            } else {
                                i2 = 0;
                            }
                            i4 += measureText + i2;
                            if (tagTextView.f106315a && i4 <= a2) {
                                getCouponTags().addView(tagTextView);
                            }
                            i3 = i5;
                        }
                    }
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    MethodCollector.m26664o(7124);
                    throw nullPointerException;
                }
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                MethodCollector.m26664o(7124);
                throw nullPointerException2;
            }
        }
        this.f104897b = gVar.f104482o;
        if (z) {
            this.f104896a = 0;
            getCouponTags().post(new RunnableC44982u(this));
        }
        MethodCollector.m26664o(7124);
    }

    /* renamed from: b */
    private final void m87653b(boolean z, C44778g gVar) {
        boolean z2;
        boolean z3;
        boolean z4;
        Integer num;
        if (z) {
            getWaistBg().setVisibility(0);
            if (gVar.f104478k == null || (num = gVar.f104478k.f104641b) == null || num.intValue() != 2) {
                WaistBanner waistBanner = gVar.f104474g;
                if (waistBanner != null && (waistBanner.f104722a.length() > 0 || waistBanner.f104723b != null)) {
                    getFlashSaleOnCountDownContainer().setVisibility(8);
                    getWaistRight().setVisibility(0);
                    if (gVar.f104474g.f104722a.length() == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean z5 = !z2;
                    String str = gVar.f104474g.f104724c;
                    if (str == null || str.length() == 0) {
                        getPickName().setVisibility(8);
                        z3 = false;
                    } else {
                        getPickName().setText(str);
                        if (z5) {
                            getPickName().setTuxFont(72);
                        } else {
                            getPickName().setTuxFont(52);
                        }
                        getPickName().setVisibility(0);
                        z3 = true;
                    }
                    String str2 = gVar.f104474g.f104722a;
                    if (str2 == null || str2.length() == 0) {
                        getActivityNameSingle().setVisibility(8);
                        z4 = false;
                    } else {
                        if (z3) {
                            getActivityNameSingle().setText(C89361p.m154868a(str2, "\\n", " "));
                            getActivityNameSingle().setTuxFont(92);
                            getActivityNameSingle().setTextColor(C0643b.m2378c(getContext(), R.color.bd));
                            getActivityNameSingle().setBackgroundColor(C0643b.m2378c(getContext(), R.color.a9));
                            m87647a(getActivityNameSingle(), 3.0d, 3.0d);
                        } else {
                            getActivityNameSingle().setText(C89361p.m154868a(str2, "\\n", "\n"));
                            getActivityNameSingle().setTuxFont(62);
                            getActivityNameSingle().setTextColor(C0643b.m2378c(getContext(), R.color.l));
                            getActivityNameSingle().setBackgroundColor(C0643b.m2378c(getContext(), R.color.c9));
                            m87647a(getActivityNameSingle(), 0.0d, 0.0d);
                        }
                        getActivityNameSingle().setVisibility(0);
                        z4 = true;
                    }
                    if (!z3 || !z4) {
                        getPlaceHolder().setVisibility(8);
                    } else {
                        getPlaceHolder().setVisibility(0);
                    }
                    Image image = gVar.f104474g.f104723b;
                    if (image != null) {
                        C20766v a = C45562g.m88109a((Object) image);
                        a.f49125v = EnumC20767w.CENTER_CROP;
                        a.f49093F = getWaistBg();
                        a.mo34186c();
                    }
                    AbstractC44965d dVar = this.f104898c;
                    if (dVar != null) {
                        dVar.mo76084a(gVar.f104474g.f104722a, gVar.f104474g.f104724c);
                    }
                }
            } else {
                getFlashSaleOnCountDownContainer().setVisibility(0);
                getWaistRight().setVisibility(8);
                TuxTextView flashSaleOnTitle = getFlashSaleOnTitle();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                C22999a a2 = C23005c.m43393a(C44985w.f104949a);
                Context context = getContext();
                String str3 = "";
                C89219l.m154716b(context, str3);
                C23127c b = a2.mo37369b(context);
                Context context2 = getContext();
                C89219l.m154716b(context2, str3);
                boolean a3 = C23163i.m43663a(context2);
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, str3);
                b.mo37614a(a3, C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics())));
                C45573n.m88117a(spannableStringBuilder, " ", b);
                String str4 = gVar.f104478k.f104645f;
                if (str4 != null) {
                    str3 = str4;
                }
                spannableStringBuilder.append((CharSequence) str3);
                flashSaleOnTitle.setText(spannableStringBuilder);
                Image image2 = gVar.f104478k.f104647h;
                if (image2 != null) {
                    C20766v a4 = C45562g.m88109a((Object) image2);
                    a4.f49125v = EnumC20767w.CENTER_CROP;
                    a4.f49093F = getWaistBg();
                    a4.mo34186c();
                }
                C45562g.m88109a((Object) gVar.f104478k.f104648i).mo34182a(new C44986x(this));
                AbstractC44965d dVar2 = this.f104898c;
                if (dVar2 != null) {
                    dVar2.mo76084a("flashsale", (String) null);
                }
            }
        } else {
            getWaistBg().setVisibility(8);
            getWaistRight().setVisibility(8);
            getFlashSaleOnCountDownContainer().setVisibility(8);
        }
        this.f104916v = gVar.f104474g;
    }

    /* renamed from: a */
    private final void m87650a(boolean z, boolean z2) {
        int i;
        TuxTextView discount = getDiscount();
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        discount.setVisibility(i);
        ViewGroup.LayoutParams layoutParams = getDiscount().getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.C0547a)) {
            layoutParams = null;
        }
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
        if (aVar != null) {
            if (z) {
                aVar.f2273k = R.id.fhy;
                aVar.topMargin = 0;
                getDiscount().setTextColor(C0643b.m2378c(getContext(), R.color.a9));
                getDiscount().setBackgroundResource(R.drawable.xp);
            } else {
                aVar.f2273k = -1;
                aVar.topMargin = C34728n.m70946a(4.0d);
                getDiscount().setTextColor(C0643b.m2378c(getContext(), R.color.bh));
                getDiscount().setBackgroundResource(R.drawable.yd);
            }
            getDiscount().setLayoutParams(aVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ CommerceProductInfoView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* renamed from: b */
    private final void m87655b(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        TuxIconView icCoupon = getIcCoupon();
        if (z3) {
            i = 0;
        } else {
            i = 8;
        }
        icCoupon.setVisibility(i);
        TuxIconView icCoupon2 = getIcCoupon();
        if (z2) {
            i2 = R.attr.aa;
        } else {
            i2 = R.attr.ay;
        }
        icCoupon2.setTintColorRes(i2);
        C44984v vVar = new C44984v(this);
        if (z) {
            vVar.mo76114a(getIcCoupon(), C34728n.m70946a(16.0d));
        } else {
            vVar.mo76114a(getIcCoupon(), C34728n.m70946a(20.0d));
        }
    }

    /* renamed from: a */
    private static void m87647a(View view, double d, double d2) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (d != 0.0d) {
            i = C34728n.m70946a(d);
        } else {
            i = 0;
        }
        if (d != 0.0d) {
            i2 = C34728n.m70946a(0.0d);
        } else {
            i2 = 0;
        }
        if (d != 0.0d) {
            i3 = C34728n.m70946a(d2);
        } else {
            i3 = 0;
        }
        if (d != 0.0d) {
            i4 = C34728n.m70946a(0.0d);
        }
        if (i != view.getPaddingLeft() || i2 != view.getPaddingTop() || i3 != view.getPaddingRight() || i4 != view.getPaddingBottom()) {
            view.setPadding(i, i2, i3, i4);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommerceProductInfoView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7294);
        this.f104899e = C89250i.m154773a((AbstractC89171a) new C44969h(this));
        this.f104900f = C89250i.m154773a((AbstractC89171a) new C44990z(this));
        this.f104901g = C89250i.m154773a((AbstractC89171a) new C44976o(this));
        this.f104902h = C89250i.m154773a((AbstractC89171a) new C44989y(this));
        this.f104903i = C89250i.m154773a((AbstractC89171a) new C44970i(this));
        this.f104904j = C89250i.m154773a((AbstractC89171a) new C44961ad(this));
        this.f104905k = C89250i.m154773a((AbstractC89171a) new C44962ae(this));
        this.f104906l = C89250i.m154773a((AbstractC89171a) new C44979r(this));
        this.f104907m = C89250i.m154773a((AbstractC89171a) new C44966e(this));
        this.f104908n = C89250i.m154773a((AbstractC89171a) new C44980s(this));
        this.f104909o = C89250i.m154773a((AbstractC89171a) new C44975n(this));
        this.f104910p = C89250i.m154773a((AbstractC89171a) new C44971j(this));
        this.f104911q = C89250i.m154773a((AbstractC89171a) new C44974m(this));
        this.f104912r = C89250i.m154773a((AbstractC89171a) new C44972k(this));
        this.f104913s = C89250i.m154773a((AbstractC89171a) new C44973l(this));
        this.f104914t = C89250i.m154773a((AbstractC89171a) new C44977p(this));
        this.f104915u = C89250i.m154773a((AbstractC89171a) new C44968g(this));
        C44766a.m87492a(context, R.layout.q0, this, true);
        getOpenCouponSheet().setOnClickListener(new C44957a(this));
        getCouponTags().setOnClickListener(new C44963b(this));
        MethodCollector.m26664o(7294);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0127, code lost:
        if (r16 != false) goto L_0x0129;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m87656c(boolean r18, boolean r19, boolean r20) {
        /*
        // Method dump skipped, instructions count: 373
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.CommerceProductInfoView.m87656c(boolean, boolean, boolean):void");
    }

    /* renamed from: a */
    private final void m87649a(boolean z, FlashSale flashSale, boolean z2, boolean z3) {
        Integer num;
        int i;
        LinearLayout linearLayout = (LinearLayout) m87645a(R.id.b5u);
        C89219l.m154716b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.C0547a)) {
            layoutParams = null;
        }
        ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
        if (aVar != null) {
            ConstraintLayout.C0547a aVar2 = aVar;
            if (z2 || !z3) {
                i = R.id.cie;
            } else {
                i = R.id.als;
            }
            aVar2.f2271i = i;
            linearLayout.setLayoutParams(aVar);
        }
        if (!(flashSale == null || (num = flashSale.f104641b) == null)) {
            if (num.intValue() == 1) {
                LinearLayout linearLayout2 = (LinearLayout) m87645a(R.id.b5u);
                C89219l.m154716b(linearLayout2, "");
                linearLayout2.setVisibility(0);
            } else if (num.intValue() == 2) {
                LinearLayout linearLayout3 = (LinearLayout) m87645a(R.id.b5u);
                C89219l.m154716b(linearLayout3, "");
                linearLayout3.setVisibility(8);
            }
        }
        if (z) {
            LinearLayout linearLayout4 = (LinearLayout) m87645a(R.id.b5u);
            C89219l.m154716b(linearLayout4, "");
            linearLayout4.setVisibility(8);
        }
    }
}
