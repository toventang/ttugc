package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.p063m.p064a.p065a.C1261i;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20745e;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20727d;
import com.bytedance.retrofit2.C22099u;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1722h.C23163i;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.p2082ss.android.ugc.aweme.ecommerce.preloader.LowResolutionImageCache;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.GImage;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionItem;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.PromotionView;
import com.p2082ss.android.ugc.aweme.ecommercebase.view.TagTextView;
import com.p2082ss.android.ugc.aweme.ecommercebase.view.p2864a.C45678b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.AudienceProductListApi;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45689b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45690c;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.api.p2867a.C45694e;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45784e;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.C45792d;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.view.LogoTuxTextView;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.p2865a.C45681a;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.p2865a.C45682b;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.network.BaseResponse;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.network.C45818a;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45806a;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2875d.C45811a;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2875d.p2876a.C45813b;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89624i;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.p */
public final class C45751p extends RelativeLayout implements AbstractC45747m {

    /* renamed from: a */
    public static final C45752a f106558a = new C45752a((byte) 0);

    /* renamed from: b */
    private SparseArray f106559b;

    static {
        Covode.recordClassIndex(54269);
    }

    /* renamed from: a */
    private View m88336a(int i) {
        if (this.f106559b == null) {
            this.f106559b = new SparseArray();
        }
        View view = (View) this.f106559b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f106559b.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.p$a */
    public static final class C45752a {
        static {
            Covode.recordClassIndex(54270);
        }

        private C45752a() {
        }

        public /* synthetic */ C45752a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.p$b */
    public static final class C45753b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Integer f106560a;

        /* renamed from: b */
        final /* synthetic */ String f106561b;

        /* renamed from: c */
        final /* synthetic */ String f106562c;

        /* renamed from: d */
        final /* synthetic */ String f106563d;

        static {
            Covode.recordClassIndex(54271);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45753b(Integer num, String str, String str2, String str3) {
            super(0);
            this.f106560a = num;
            this.f106561b = str;
            this.f106562c = str2;
            this.f106563d = str3;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(mo77089a());
        }

        /* renamed from: a */
        public final boolean mo77089a() {
            String str;
            if (this.f106560a == null || this.f106561b == null || this.f106562c == null || (str = this.f106563d) == null || str.length() == 0) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    private static C20745e m88337a() {
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48961e = C89393b.m154948a(2.0f);
        aVar.f48957a = false;
        C20745e a = aVar.mo34169a();
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.p$f */
    public static final class C45757f extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106572a = 300;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f106573b;

        static {
            Covode.recordClassIndex(54275);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45757f(AbstractC89171a aVar) {
            super(300);
            this.f106573b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            AbstractC89171a aVar;
            if (view != null && (aVar = this.f106573b) != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.p$g */
    public static final class C45758g extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106574a = 300;

        /* renamed from: b */
        final /* synthetic */ C45751p f106575b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f106576c;

        /* renamed from: d */
        final /* synthetic */ PopupCardVO f106577d;

        /* renamed from: e */
        final /* synthetic */ C45806a f106578e;

        static {
            Covode.recordClassIndex(54276);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                AbstractC89172b bVar = this.f106576c;
                if (bVar != null) {
                    bVar.invoke("pic");
                }
                this.f106575b.mo77088b(this.f106577d, this.f106578e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45758g(C45751p pVar, AbstractC89172b bVar, PopupCardVO popupCardVO, C45806a aVar) {
            super(300);
            this.f106575b = pVar;
            this.f106576c = bVar;
            this.f106577d = popupCardVO;
            this.f106578e = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.p$h */
    public static final class C45759h extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106579a = 300;

        /* renamed from: b */
        final /* synthetic */ C45751p f106580b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f106581c;

        /* renamed from: d */
        final /* synthetic */ PopupCardVO f106582d;

        /* renamed from: e */
        final /* synthetic */ C45806a f106583e;

        static {
            Covode.recordClassIndex(54277);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                AbstractC89172b bVar = this.f106581c;
                if (bVar != null) {
                    bVar.invoke("title");
                }
                this.f106580b.mo77088b(this.f106582d, this.f106583e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45759h(C45751p pVar, AbstractC89172b bVar, PopupCardVO popupCardVO, C45806a aVar) {
            super(300);
            this.f106580b = pVar;
            this.f106581c = bVar;
            this.f106582d = popupCardVO;
            this.f106583e = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.p$i */
    public static final class C45760i extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106584a = 300;

        /* renamed from: b */
        final /* synthetic */ C45751p f106585b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f106586c;

        /* renamed from: d */
        final /* synthetic */ PopupCardVO f106587d;

        /* renamed from: e */
        final /* synthetic */ C45806a f106588e;

        static {
            Covode.recordClassIndex(54278);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                AbstractC89172b bVar = this.f106586c;
                if (bVar != null) {
                    bVar.invoke("button");
                }
                this.f106585b.mo77088b(this.f106587d, this.f106588e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45760i(C45751p pVar, AbstractC89172b bVar, PopupCardVO popupCardVO, C45806a aVar) {
            super(300);
            this.f106585b = pVar;
            this.f106586c = bVar;
            this.f106587d = popupCardVO;
            this.f106588e = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.p$j */
    public static final class C45761j extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106589a = 300;

        /* renamed from: b */
        final /* synthetic */ C45751p f106590b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f106591c;

        /* renamed from: d */
        final /* synthetic */ PopupCardVO f106592d;

        /* renamed from: e */
        final /* synthetic */ C45806a f106593e;

        static {
            Covode.recordClassIndex(54279);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                AbstractC89172b bVar = this.f106591c;
                if (bVar != null) {
                    bVar.invoke("other");
                }
                this.f106590b.mo77088b(this.f106592d, this.f106593e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45761j(C45751p pVar, AbstractC89172b bVar, PopupCardVO popupCardVO, C45806a aVar) {
            super(300);
            this.f106590b = pVar;
            this.f106591c = bVar;
            this.f106592d = popupCardVO;
            this.f106593e = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45747m
    public final void setFlashSaleInfo(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) m88336a(R.id.ew_);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.p$e */
    public static final class C45756e extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C45756e f106571a = new C45756e();

        static {
            Covode.recordClassIndex(54274);
        }

        C45756e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54463b = Integer.valueOf((int) R.attr.a3d);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54464c = Float.valueOf(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45747m
    public final void setFlashSaleViewVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        View a = m88336a(R.id.fer);
        C89219l.m154716b(a, "");
        a.setVisibility(i);
        TuxIconView tuxIconView = (TuxIconView) m88336a(R.id.b5v);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setVisibility(i);
        TuxTextView tuxTextView = (TuxTextView) m88336a(R.id.ew_);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setVisibility(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.p$c */
    public static final class C45754c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f106564a;

        /* renamed from: b */
        final /* synthetic */ C45751p f106565b;

        /* renamed from: c */
        final /* synthetic */ C45806a f106566c;

        /* renamed from: d */
        final /* synthetic */ PopupCardVO f106567d;

        static {
            Covode.recordClassIndex(54272);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45754c(C45751p pVar, C45806a aVar, PopupCardVO popupCardVO, AbstractC89124d dVar) {
            super(2, dVar);
            this.f106565b = pVar;
            this.f106566c = aVar;
            this.f106567d = popupCardVO;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C45754c(this.f106565b, this.f106566c, this.f106567d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C45754c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
            // Method dump skipped, instructions count: 171
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.C45751p.C45754c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C45751p(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(1706);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, (int) R.style.x6);
        LayoutInflater.from(context).cloneInContext(contextThemeWrapper).inflate(R.layout.y8, this);
        setLayoutParams(new RelativeLayout.LayoutParams(C45811a.m88429a(300, context), -2));
        setBackground(C0643b.m2369a(contextThemeWrapper, (int) R.drawable.a6h));
        TuxTextView tuxTextView = (TuxTextView) m88336a(R.id.aqn);
        C89219l.m154716b(tuxTextView, "");
        TextPaint paint = tuxTextView.getPaint();
        paint.setFlags(16);
        paint.setAntiAlias(true);
        TuxIconView tuxIconView = (TuxIconView) m88336a(R.id.b5v);
        C89219l.m154716b(tuxIconView, "");
        C23163i.m43668b(tuxIconView, 0, 0, 0, 0, false, 16);
        C11279p.m20020c(m88336a(R.id.b5v), C45811a.m88429a(2, context));
        TuxIconView tuxIconView2 = (TuxIconView) m88336a(R.id.b5v);
        C89219l.m154716b(tuxIconView2, "");
        ViewGroup.LayoutParams layoutParams = tuxIconView2.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
            aVar.f2279q = -1;
            aVar.f2266d = R.id.fer;
            aVar.f2280r = -1;
            aVar.f2268f = R.id.ew_;
            TuxTextView tuxTextView2 = (TuxTextView) m88336a(R.id.ew_);
            C89219l.m154716b(tuxTextView2, "");
            C23163i.m43668b(tuxTextView2, 0, 0, 0, 0, false, 16);
            C11279p.m20025d(m88336a(R.id.ew_), C45811a.m88429a(2, context));
            TuxIconView tuxIconView3 = (TuxIconView) m88336a(R.id.b5v);
            C89219l.m154716b(tuxIconView3, "");
            ViewGroup.LayoutParams layoutParams2 = tuxIconView3.getLayoutParams();
            if (layoutParams2 != null) {
                ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams2;
                aVar2.f2281s = -1;
                aVar2.f2269g = R.id.fer;
                aVar2.f2278p = -1;
                aVar2.f2267e = R.id.b5v;
                MethodCollector.m26664o(1706);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            MethodCollector.m26664o(1706);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        MethodCollector.m26664o(1706);
        throw nullPointerException2;
    }

    public /* synthetic */ C45751p(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.p$d */
    public static final class C45755d extends AbstractC20727d {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89237d f106568a;

        /* renamed from: b */
        final /* synthetic */ PopupCardVO f106569b;

        /* renamed from: c */
        final /* synthetic */ String f106570c;

        static {
            Covode.recordClassIndex(54273);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20727d, com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34147a(Uri uri, View view) {
            this.f106568a.element = System.currentTimeMillis();
        }

        C45755d(C89233z.C89237d dVar, PopupCardVO popupCardVO, String str) {
            this.f106568a = dVar;
            this.f106569b = popupCardVO;
            this.f106570c = str;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
            String str;
            String valueOf = String.valueOf(this.f106569b.getProductId());
            String str2 = this.f106570c;
            String imageUrl = this.f106569b.getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            String fromMessageId = this.f106569b.getFromMessageId();
            if (this.f106569b.isFromMessage()) {
                str = "message";
            } else {
                str = "pop";
            }
            C45792d.m88398a(valueOf, str2, imageUrl, fromMessageId, str);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
            String str;
            long currentTimeMillis = System.currentTimeMillis() - this.f106568a.element;
            String valueOf = String.valueOf(this.f106569b.getProductId());
            String str2 = this.f106570c;
            String imageUrl = this.f106569b.getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            String fromMessageId = this.f106569b.getFromMessageId();
            if (this.f106569b.isFromMessage()) {
                str = "message";
            } else {
                str = "pop";
            }
            C45792d.m88399a(valueOf, str2, imageUrl, fromMessageId, str, Long.valueOf(currentTimeMillis));
            LowResolutionImageCache.m87735a().mo76181a(this.f106569b.getImageUrlKey(), this.f106569b.getImageUrl());
        }
    }

    /* renamed from: a */
    private static void m88339a(TuxTextView tuxTextView, int i) {
        if (tuxTextView.getMaxLines() != i) {
            tuxTextView.setMaxLines(i);
        }
    }

    /* renamed from: d */
    private final void m88341d(PopupCardVO popupCardVO, C45806a aVar) {
        String str;
        C89233z.C89237d dVar = new C89233z.C89237d();
        dVar.element = System.currentTimeMillis();
        if (aVar != null) {
            str = aVar.mo77118b("room_id");
        } else {
            str = null;
        }
        Drawable a = C23009f.m43397a(C45756e.f106571a).mo37389a(new ContextThemeWrapper(getContext(), (int) R.style.x6));
        C20766v a2 = C20761r.m39061a(popupCardVO.getImageUrl());
        a2.f49117n = a;
        a2.f49126w = m88337a();
        a2.f49092E = (SmartImageView) m88336a(R.id.aqr);
        a2.mo34181a(new C45755d(dVar, popupCardVO, str));
    }

    /* renamed from: b */
    public final void mo77088b(PopupCardVO popupCardVO, C45806a aVar) {
        int i;
        int i2;
        List<PromotionItem> promotion_items;
        PromotionItem promotionItem;
        Integer style;
        List<PromotionItem> promotion_items2;
        PromotionItem promotionItem2;
        Integer type;
        PromotionView promotionView = popupCardVO.getPromotionView();
        if (promotionView == null || (promotion_items2 = promotionView.getPromotion_items()) == null || (promotionItem2 = (PromotionItem) C89070n.m154583g((List) promotion_items2)) == null || (type = promotionItem2.getType()) == null) {
            i = 0;
        } else {
            i = type.intValue();
        }
        PromotionView promotionView2 = popupCardVO.getPromotionView();
        if (promotionView2 == null || (promotion_items = promotionView2.getPromotion_items()) == null || (promotionItem = (PromotionItem) C89070n.m154583g((List) promotion_items)) == null || (style = promotionItem.getStyle()) == null) {
            i2 = -1;
        } else {
            i2 = style.intValue();
        }
        if (i == 3 && i2 == 1) {
            AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C45813b.f106733b), null, null, new C45754c(this, aVar, popupCardVO, null), 3);
        } else {
            mo77085a(popupCardVO, aVar);
        }
    }

    /* renamed from: c */
    private final void m88340c(PopupCardVO popupCardVO, C45806a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        if (popupCardVO.getPlatform() == 5 || (popupCardVO.getPlatform() == 6 && popupCardVO.getSchema() != null)) {
            String str8 = null;
            if (aVar != null) {
                str = aVar.mo77118b("author_id");
                str2 = aVar.mo77118b("room_id");
                str3 = aVar.mo77118b("enter_from_merge");
                str4 = aVar.mo77118b("enter_method");
                str5 = aVar.mo77118b("action_type");
                str6 = aVar.mo77118b("follow_status");
                str7 = aVar.mo77118b("list_skin_type");
                str8 = aVar.mo77118b("product_skin_type");
            } else {
                str = null;
                str2 = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
                str7 = null;
            }
            int platform = popupCardVO.getPlatform();
            String schema = popupCardVO.getSchema();
            C45681a aVar2 = new C45681a((byte) 0);
            if (str == null) {
                str = "";
            }
            aVar2.f106345b = str;
            aVar2.f106346c = String.valueOf(popupCardVO.getProductId());
            aVar2.f106354k = "live";
            aVar2.f106344a = "live_popup_card";
            aVar2.f106352i = str2;
            aVar2.f106347d = str3 + "_temai_" + str4;
            aVar2.f106348e = str5;
            aVar2.f106349f = String.valueOf(popupCardVO.getPlatform());
            aVar2.f106350g = String.valueOf(popupCardVO.getSourceFrom());
            aVar2.f106351h = popupCardVO.getSource();
            aVar2.f106353j = str6;
            aVar2.f106360q = str7;
            aVar2.f106361r = str8;
            String a = C45682b.m88189a(platform, schema, aVar2);
            if (a != null) {
                ECommerceService.createIECommerceServicebyMonsterPlugin(false).prefetchPdp(a, getContext());
            }
        }
    }

    /* renamed from: a */
    public final void mo77085a(PopupCardVO popupCardVO, C45806a aVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Map<String, String> map;
        if (aVar != null) {
            str = aVar.mo77118b("author_id");
            str2 = aVar.mo77118b("room_id");
            str3 = aVar.mo77118b("enter_from_merge");
            str4 = aVar.mo77118b("enter_method");
            str5 = aVar.mo77118b("action_type");
            str6 = aVar.mo77118b("follow_status");
            str7 = aVar.mo77118b("entrance_form");
            str8 = aVar.mo77118b("is_ad");
            str9 = aVar.mo77118b("request_id");
            str10 = aVar.mo77118b("list_skin_type");
            str11 = aVar.mo77118b("product_skin_type");
            str12 = aVar.mo77118b("search_id");
            str13 = aVar.mo77118b("search_result_id");
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
            str12 = null;
            str13 = null;
        }
        C45681a aVar2 = new C45681a((byte) 0);
        if (str == null) {
            str = "";
        }
        aVar2.f106345b = str;
        aVar2.f106346c = String.valueOf(popupCardVO.getProductId());
        aVar2.f106354k = "live";
        aVar2.f106344a = "live_popup_card";
        aVar2.f106352i = str2;
        aVar2.f106347d = str3 + "_temai_" + str4;
        aVar2.f106348e = str5;
        aVar2.f106349f = String.valueOf(popupCardVO.getPlatform());
        aVar2.f106350g = String.valueOf(popupCardVO.getSourceFrom());
        aVar2.f106351h = popupCardVO.getSource();
        aVar2.f106353j = str6;
        aVar2.f106355l = str7;
        aVar2.f106356m = str8;
        if (aVar != null) {
            map = (Map) aVar.mo77114a("effect_ad_extra");
        } else {
            map = null;
        }
        aVar2.f106364u = map;
        aVar2.f106357n = C6544e.m14001o();
        aVar2.f106358o = C6544e.m14002p();
        if (str9 == null) {
            str9 = "";
        }
        aVar2.f106359p = str9;
        aVar2.f106360q = str10;
        aVar2.f106361r = str11;
        aVar2.f106362s = str12;
        aVar2.f106363t = str13;
        if (C80538hl.m139614a(popupCardVO.getSchema())) {
            SmartRouter.buildRoute(getContext(), C45682b.m88189a(popupCardVO.getPlatform(), popupCardVO.getSchema(), aVar2)).open();
            return;
        }
        int c = C13628n.m24522c(getContext(), ((float) C13628n.m24521b(getContext())) * 0.9f);
        C29844g gVar = new C29844g("sslocal://webcast_webview");
        gVar.mo52130a("title", popupCardVO.getTitle());
        gVar.mo52130a("gravity", "bottom");
        gVar.mo52130a(StringSet.type, "popup");
        gVar.mo52130a("height", String.valueOf(c));
        gVar.mo52128a("hide_nav_bar", 1);
        C29844g gVar2 = new C29844g(popupCardVO.getOpenUrl());
        gVar2.mo52130a("web_bg_color", "FFFFFF");
        gVar2.mo52128a("hide_loading", 0);
        gVar.mo52130a("url", gVar2.mo52126a());
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95830d().mo13004a(getContext(), Uri.parse(gVar.mo52126a() + "&use_page_back=true&show_title_bar=true&show_title_close=true"));
    }

    /* renamed from: a */
    public final void mo77086a(PopupCardVO popupCardVO, C45806a aVar, C45690c cVar) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        int i;
        String str16;
        List<String> urls;
        if (aVar != null) {
            str = aVar.mo77118b("author_id");
        } else {
            str = null;
        }
        if (aVar != null) {
            str2 = aVar.mo77118b("room_id");
            str3 = aVar.mo77118b("enter_from_merge");
            str4 = aVar.mo77118b("enter_method");
            str5 = aVar.mo77118b("action_type");
            str6 = aVar.mo77118b("follow_status");
            str7 = aVar.mo77118b("entrance_form");
            str8 = aVar.mo77118b("is_ad");
            str9 = aVar.mo77118b("request_id");
            str10 = aVar.mo77118b("list_skin_type");
            str11 = aVar.mo77118b("product_skin_type");
            str12 = aVar.mo77118b("search_id");
        } else {
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            str7 = null;
            str8 = null;
            str9 = null;
            str10 = null;
            str11 = null;
            str12 = null;
        }
        if (aVar != null) {
            str13 = aVar.mo77118b("search_result_id");
        } else {
            str13 = null;
        }
        int platform = popupCardVO.getPlatform();
        String schema = popupCardVO.getSchema();
        C45681a aVar2 = new C45681a((byte) 0);
        if (str == null) {
            str = "";
        }
        aVar2.f106345b = str;
        aVar2.f106346c = String.valueOf(popupCardVO.getProductId());
        aVar2.f106354k = "live";
        aVar2.f106344a = "live_popup_card";
        aVar2.f106352i = str2;
        aVar2.f106347d = str3 + "_temai_" + str4;
        aVar2.f106348e = str5;
        aVar2.f106349f = String.valueOf(popupCardVO.getPlatform());
        aVar2.f106350g = String.valueOf(popupCardVO.getSourceFrom());
        aVar2.f106351h = popupCardVO.getSource();
        aVar2.f106353j = str6;
        aVar2.f106355l = str7;
        aVar2.f106356m = str8;
        aVar2.f106357n = C6544e.m14001o();
        aVar2.f106358o = C6544e.m14002p();
        if (str9 == null) {
            str9 = "";
        }
        aVar2.f106359p = str9;
        aVar2.f106360q = str10;
        aVar2.f106361r = str11;
        aVar2.f106362s = str12;
        aVar2.f106363t = str13;
        String a = C45682b.m88189a(platform, schema, aVar2);
        Uri.Builder builder = new Uri.Builder();
        Uri parse = Uri.parse(cVar.f106406g);
        if (parse != null) {
            Uri.Builder encodedPath = builder.scheme(parse.getScheme()).encodedAuthority(parse.getAuthority()).encodedPath(parse.getPath());
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            C89219l.m154716b(queryParameterNames, "");
            for (T t : queryParameterNames) {
                encodedPath.appendQueryParameter(t, parse.getQueryParameter(t));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            GImage gImage = cVar.f106407h;
            if (!(gImage == null || (urls = gImage.getUrls()) == null)) {
                arrayList.addAll(urls);
            }
            linkedHashMap2.put("image_url", arrayList);
            String str17 = cVar.f106401b;
            if (str17 == null) {
                str17 = "";
            }
            linkedHashMap2.put("title", str17);
            String str18 = cVar.f106402c;
            if (str18 == null) {
                str18 = "";
            }
            linkedHashMap2.put("desc", str18);
            String str19 = cVar.f106403d;
            if (str19 == null) {
                str19 = "";
            }
            linkedHashMap2.put("from_price", str19);
            String str20 = cVar.f106404e;
            if (str20 == null) {
                str20 = "";
            }
            linkedHashMap2.put("to_price", str20);
            ArrayList arrayList2 = new ArrayList();
            List<C45689b> list = cVar.f106405f;
            if (list != null) {
                for (T t2 : list) {
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    String str21 = t2.f106397a;
                    if (str21 == null) {
                        str21 = "";
                    }
                    linkedHashMap3.put("text", str21);
                    Integer num = t2.f106398b;
                    if (num == null) {
                        num = "";
                    }
                    linkedHashMap3.put("action", num);
                    if (a == null) {
                        str16 = "";
                    } else {
                        str16 = a;
                    }
                    linkedHashMap3.put("redirect", str16);
                    arrayList2.add(linkedHashMap3);
                }
            }
            linkedHashMap2.put("buttons", arrayList2);
            linkedHashMap.put("content_params", linkedHashMap2);
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            linkedHashMap4.put("enter_from", C45690c.C45691a.C45692a.f106408a);
            if (aVar == null || (str14 = aVar.mo77118b("room_id")) == null) {
                str14 = "";
            }
            linkedHashMap4.put("room_id", str14);
            if (aVar == null || (str15 = aVar.mo77118b("author_id")) == null) {
                str15 = "";
            }
            linkedHashMap4.put("anchor_id", str15);
            linkedHashMap.put("track_params", linkedHashMap4);
            Integer num2 = cVar.f106400a;
            if (num2 != null) {
                i = num2.intValue();
            } else {
                i = 0;
            }
            linkedHashMap.put("popup_type", Integer.valueOf(i));
            encodedPath.appendQueryParameter("popup_params", C80342dg.m139300a().mo46674b(linkedHashMap));
        }
        String uri = builder.build().toString();
        C89219l.m154716b(uri, "");
        SmartRouter.buildRoute(getContext(), uri).open();
    }

    /* renamed from: a */
    public static C45694e m88338a(Integer num, String str, String str2, String str3) {
        Object obj;
        C45694e eVar;
        T t;
        Boolean valueOf = Boolean.valueOf(new C45753b(num, str, str2, str3).mo77089a());
        int i = 0;
        boolean z = true;
        if (!valueOf.booleanValue()) {
            z = false;
        }
        C45694e eVar2 = null;
        if (!z) {
            return null;
        }
        valueOf.booleanValue();
        try {
            AudienceProductListApi audienceProductListApi = (AudienceProductListApi) C45818a.m88431a(AudienceProductListApi.class, "https://oec-api.tiktokv.com");
            if (num != null) {
                i = num.intValue();
            }
            if (str == null) {
                str = "";
            }
            if (str2 == null) {
                str2 = "";
            }
            if (str3 == null) {
                str3 = "";
            }
            C22099u<BaseResponse<C45694e>> execute = audienceProductListApi.getFansPopUp(i, str, str2, str3).execute();
            if (execute == null || (t = execute.f52262b) == null) {
                eVar = null;
            } else {
                eVar = (C45694e) t.getData();
            }
            obj = C89379q.m157068constructorimpl(eVar);
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (!C89379q.m157073isFailureimpl(obj)) {
            eVar2 = obj;
        }
        return eVar2;
    }

    /* renamed from: a */
    public final void mo77087a(PopupCardVO popupCardVO, C45806a aVar, AbstractC89172b<? super String, C89391z> bVar, AbstractC89171a<C89391z> aVar2) {
        PromotionItem promotionItem;
        GImage gImage;
        List<PromotionItem> promotion_items;
        C89219l.m154721d(popupCardVO, "");
        m88340c(popupCardVO, aVar);
        m88341d(popupCardVO, aVar);
        LogoTuxTextView logoTuxTextView = (LogoTuxTextView) m88336a(R.id.aqq);
        C89219l.m154716b(logoTuxTextView, "");
        logoTuxTextView.setText(popupCardVO.getTitle());
        PromotionView promotionView = popupCardVO.getPromotionView();
        if (promotionView == null || (promotion_items = promotionView.getPromotion_items()) == null) {
            promotionItem = null;
        } else {
            promotionItem = (PromotionItem) C89070n.m154583g((List) promotion_items);
        }
        ((TagTextView) m88336a(R.id.aqo)).setTagUi(C45678b.C45679a.m88187a(promotionItem));
        if (((TagTextView) m88336a(R.id.aqo)).f106315a) {
            LogoTuxTextView logoTuxTextView2 = (LogoTuxTextView) m88336a(R.id.aqq);
            C89219l.m154716b(logoTuxTextView2, "");
            m88339a(logoTuxTextView2, 1);
        } else {
            LogoTuxTextView logoTuxTextView3 = (LogoTuxTextView) m88336a(R.id.aqq);
            C89219l.m154716b(logoTuxTextView3, "");
            m88339a(logoTuxTextView3, 2);
        }
        C45784e promotionSkin = popupCardVO.getPromotionSkin();
        if (!(promotionSkin == null || (gImage = promotionSkin.f106679a) == null)) {
            C20766v a = C20761r.m39058a(gImage.toImageUrlModel());
            a.f49092E = (SmartImageView) m88336a(R.id.aqk);
            a.mo34186c();
        }
        ((LogoTuxTextView) m88336a(R.id.aqq)).mo77103a(popupCardVO.getTitle(), popupCardVO.getPromotionLogos());
        TuxTextView tuxTextView = (TuxTextView) m88336a(R.id.aqs);
        C89219l.m154716b(tuxTextView, "");
        String formatAvailablePrice = popupCardVO.getFormatAvailablePrice();
        if (formatAvailablePrice == null) {
            formatAvailablePrice = popupCardVO.getPrice();
        }
        tuxTextView.setText(formatAvailablePrice);
        TuxTextView tuxTextView2 = (TuxTextView) m88336a(R.id.aqn);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(popupCardVO.getFormatOriginPrice());
        TuxTextView tuxTextView3 = (TuxTextView) m88336a(R.id.aql);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setText(popupCardVO.getSource());
        if (popupCardVO.isSoldOut()) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            C1261i a2 = C1261i.m4015a(context.getResources(), R.drawable.a6_, null);
            if (a2 != null) {
                TuxTextView tuxTextView4 = (TuxTextView) m88336a(R.id.aqj);
                C89219l.m154716b(tuxTextView4, "");
                tuxTextView4.setBackground(a2);
            }
            ((TuxTextView) m88336a(R.id.aqj)).setTextColor(C0643b.m2378c(getContext(), R.color.bz));
        } else {
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            C1261i a3 = C1261i.m4015a(context2.getResources(), R.drawable.a65, null);
            if (a3 != null) {
                TuxTextView tuxTextView5 = (TuxTextView) m88336a(R.id.aqj);
                C89219l.m154716b(tuxTextView5, "");
                tuxTextView5.setBackground(a3);
            }
            ((TuxTextView) m88336a(R.id.aqj)).setTextColor(C0643b.m2378c(getContext(), R.color.l));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) m88336a(R.id.aqm);
        C89219l.m154716b(appCompatImageView, "");
        appCompatImageView.setOnClickListener(new C45757f(aVar2));
        SmartImageView smartImageView = (SmartImageView) m88336a(R.id.aqr);
        C89219l.m154716b(smartImageView, "");
        smartImageView.setOnClickListener(new C45758g(this, bVar, popupCardVO, aVar));
        LogoTuxTextView logoTuxTextView4 = (LogoTuxTextView) m88336a(R.id.aqq);
        C89219l.m154716b(logoTuxTextView4, "");
        logoTuxTextView4.setOnClickListener(new C45759h(this, bVar, popupCardVO, aVar));
        TuxTextView tuxTextView6 = (TuxTextView) m88336a(R.id.aqj);
        C89219l.m154716b(tuxTextView6, "");
        tuxTextView6.setOnClickListener(new C45760i(this, bVar, popupCardVO, aVar));
        setOnClickListener(new C45761j(this, bVar, popupCardVO, aVar));
    }
}
