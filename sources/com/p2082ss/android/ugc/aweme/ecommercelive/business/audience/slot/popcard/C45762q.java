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
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
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
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2868a.C45784e;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.C45792d;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.view.LogoTuxTextView;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.p2865a.C45681a;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.p2865a.C45682b;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45806a;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2875d.C45811a;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.q */
public final class C45762q extends RelativeLayout implements AbstractC45747m {

    /* renamed from: a */
    public static final C45763a f106594a = new C45763a((byte) 0);

    /* renamed from: b */
    private SparseArray f106595b;

    static {
        Covode.recordClassIndex(54280);
    }

    /* renamed from: a */
    private View m88355a(int i) {
        if (this.f106595b == null) {
            this.f106595b = new SparseArray();
        }
        View view = (View) this.f106595b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f106595b.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.q$a */
    public static final class C45763a {
        static {
            Covode.recordClassIndex(54281);
        }

        private C45763a() {
        }

        public /* synthetic */ C45763a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    private static C20745e m88356a() {
        C20745e.C20746a aVar = new C20745e.C20746a();
        aVar.f48961e = C89393b.m154948a(2.0f);
        aVar.f48957a = false;
        C20745e a = aVar.mo34169a();
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.q$d */
    public static final class C45766d extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106600a = 300;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f106601b;

        static {
            Covode.recordClassIndex(54284);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45766d(AbstractC89171a aVar) {
            super(300);
            this.f106601b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            AbstractC89171a aVar;
            if (view != null && (aVar = this.f106601b) != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.q$e */
    public static final class C45767e extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106602a = 300;

        /* renamed from: b */
        final /* synthetic */ C45762q f106603b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f106604c;

        /* renamed from: d */
        final /* synthetic */ PopupCardVO f106605d;

        /* renamed from: e */
        final /* synthetic */ C45806a f106606e;

        static {
            Covode.recordClassIndex(54285);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                AbstractC89172b bVar = this.f106604c;
                if (bVar != null) {
                    bVar.invoke("pic");
                }
                this.f106603b.mo77090a(this.f106605d, this.f106606e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45767e(C45762q qVar, AbstractC89172b bVar, PopupCardVO popupCardVO, C45806a aVar) {
            super(300);
            this.f106603b = qVar;
            this.f106604c = bVar;
            this.f106605d = popupCardVO;
            this.f106606e = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.q$f */
    public static final class C45768f extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106607a = 300;

        /* renamed from: b */
        final /* synthetic */ C45762q f106608b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f106609c;

        /* renamed from: d */
        final /* synthetic */ PopupCardVO f106610d;

        /* renamed from: e */
        final /* synthetic */ C45806a f106611e;

        static {
            Covode.recordClassIndex(54286);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                AbstractC89172b bVar = this.f106609c;
                if (bVar != null) {
                    bVar.invoke("title");
                }
                this.f106608b.mo77090a(this.f106610d, this.f106611e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45768f(C45762q qVar, AbstractC89172b bVar, PopupCardVO popupCardVO, C45806a aVar) {
            super(300);
            this.f106608b = qVar;
            this.f106609c = bVar;
            this.f106610d = popupCardVO;
            this.f106611e = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.q$g */
    public static final class C45769g extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106612a = 300;

        /* renamed from: b */
        final /* synthetic */ C45762q f106613b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f106614c;

        /* renamed from: d */
        final /* synthetic */ PopupCardVO f106615d;

        /* renamed from: e */
        final /* synthetic */ C45806a f106616e;

        static {
            Covode.recordClassIndex(54287);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                AbstractC89172b bVar = this.f106614c;
                if (bVar != null) {
                    bVar.invoke("button");
                }
                this.f106613b.mo77090a(this.f106615d, this.f106616e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45769g(C45762q qVar, AbstractC89172b bVar, PopupCardVO popupCardVO, C45806a aVar) {
            super(300);
            this.f106613b = qVar;
            this.f106614c = bVar;
            this.f106615d = popupCardVO;
            this.f106616e = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.q$h */
    public static final class C45770h extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106617a = 300;

        /* renamed from: b */
        final /* synthetic */ C45762q f106618b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f106619c;

        /* renamed from: d */
        final /* synthetic */ PopupCardVO f106620d;

        /* renamed from: e */
        final /* synthetic */ C45806a f106621e;

        static {
            Covode.recordClassIndex(54288);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                AbstractC89172b bVar = this.f106619c;
                if (bVar != null) {
                    bVar.invoke("other");
                }
                this.f106618b.mo77090a(this.f106620d, this.f106621e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45770h(C45762q qVar, AbstractC89172b bVar, PopupCardVO popupCardVO, C45806a aVar) {
            super(300);
            this.f106618b = qVar;
            this.f106619c = bVar;
            this.f106620d = popupCardVO;
            this.f106621e = aVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45747m
    public final void setFlashSaleInfo(String str) {
        C89219l.m154721d(str, "");
        TuxTextView tuxTextView = (TuxTextView) m88355a(R.id.ew_);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.q$c */
    public static final class C45765c extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C45765c f106599a = new C45765c();

        static {
            Covode.recordClassIndex(54283);
        }

        C45765c() {
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
        View a = m88355a(R.id.fer);
        C89219l.m154716b(a, "");
        a.setVisibility(i);
        TuxIconView tuxIconView = (TuxIconView) m88355a(R.id.b5v);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setVisibility(i);
        TuxTextView tuxTextView = (TuxTextView) m88355a(R.id.ew_);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C45762q(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(3961);
        LayoutInflater.from(context).cloneInContext(new ContextThemeWrapper(context, (int) R.style.x6)).inflate(R.layout.y9, this);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        TuxTextView tuxTextView = (TuxTextView) m88355a(R.id.aqn);
        C89219l.m154716b(tuxTextView, "");
        TextPaint paint = tuxTextView.getPaint();
        paint.setFlags(16);
        paint.setAntiAlias(true);
        TuxIconView tuxIconView = (TuxIconView) m88355a(R.id.b5v);
        C89219l.m154716b(tuxIconView, "");
        C23163i.m43668b(tuxIconView, 0, 0, 0, 0, false, 16);
        C11279p.m20020c(m88355a(R.id.b5v), C45811a.m88429a(1, context));
        TuxIconView tuxIconView2 = (TuxIconView) m88355a(R.id.b5v);
        C89219l.m154716b(tuxIconView2, "");
        ViewGroup.LayoutParams layoutParams = tuxIconView2.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
            aVar.f2279q = -1;
            aVar.f2266d = R.id.fer;
            aVar.f2280r = -1;
            aVar.f2268f = R.id.ew_;
            TuxTextView tuxTextView2 = (TuxTextView) m88355a(R.id.ew_);
            C89219l.m154716b(tuxTextView2, "");
            C23163i.m43668b(tuxTextView2, 0, 0, 0, 0, false, 16);
            C11279p.m20025d(m88355a(R.id.ew_), C45811a.m88429a(2, context));
            TuxIconView tuxIconView3 = (TuxIconView) m88355a(R.id.b5v);
            C89219l.m154716b(tuxIconView3, "");
            ViewGroup.LayoutParams layoutParams2 = tuxIconView3.getLayoutParams();
            if (layoutParams2 != null) {
                ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams2;
                aVar2.f2281s = -1;
                aVar2.f2269g = R.id.fer;
                aVar2.f2278p = -1;
                aVar2.f2267e = R.id.b5v;
                MethodCollector.m26664o(3961);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            MethodCollector.m26664o(3961);
            throw nullPointerException;
        }
        NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        MethodCollector.m26664o(3961);
        throw nullPointerException2;
    }

    public /* synthetic */ C45762q(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.q$b */
    public static final class C45764b extends AbstractC20727d {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89237d f106596a;

        /* renamed from: b */
        final /* synthetic */ PopupCardVO f106597b;

        /* renamed from: c */
        final /* synthetic */ String f106598c;

        static {
            Covode.recordClassIndex(54282);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20727d, com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34147a(Uri uri, View view) {
            this.f106596a.element = System.currentTimeMillis();
        }

        C45764b(C89233z.C89237d dVar, PopupCardVO popupCardVO, String str) {
            this.f106596a = dVar;
            this.f106597b = popupCardVO;
            this.f106598c = str;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
            String str;
            String valueOf = String.valueOf(this.f106597b.getProductId());
            String str2 = this.f106598c;
            String imageUrl = this.f106597b.getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            String fromMessageId = this.f106597b.getFromMessageId();
            if (this.f106597b.isFromMessage()) {
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
            long currentTimeMillis = System.currentTimeMillis() - this.f106596a.element;
            String valueOf = String.valueOf(this.f106597b.getProductId());
            String str2 = this.f106598c;
            String imageUrl = this.f106597b.getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            String fromMessageId = this.f106597b.getFromMessageId();
            if (this.f106597b.isFromMessage()) {
                str = "message";
            } else {
                str = "pop";
            }
            C45792d.m88399a(valueOf, str2, imageUrl, fromMessageId, str, Long.valueOf(currentTimeMillis));
            LowResolutionImageCache.m87735a().mo76181a(this.f106597b.getImageUrlKey(), this.f106597b.getImageUrl());
        }
    }

    /* renamed from: c */
    private final void m88358c(PopupCardVO popupCardVO, C45806a aVar) {
        String str;
        C89233z.C89237d dVar = new C89233z.C89237d();
        dVar.element = System.currentTimeMillis();
        if (aVar != null) {
            str = aVar.mo77118b("room_id");
        } else {
            str = null;
        }
        Drawable a = C23009f.m43397a(C45765c.f106599a).mo37389a(new ContextThemeWrapper(getContext(), (int) R.style.x6));
        C20766v a2 = C20761r.m39061a(popupCardVO.getImageUrl());
        a2.f49117n = a;
        a2.f49092E = (SmartImageView) m88355a(R.id.aqr);
        a2.f49126w = m88356a();
        a2.mo34181a(new C45764b(dVar, popupCardVO, str));
    }

    /* renamed from: b */
    private final void m88357b(PopupCardVO popupCardVO, C45806a aVar) {
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
    public final void mo77090a(PopupCardVO popupCardVO, C45806a aVar) {
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
        String str13 = null;
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
    public final void mo77091a(PopupCardVO popupCardVO, C45806a aVar, AbstractC89172b<? super String, C89391z> bVar, AbstractC89171a<C89391z> aVar2) {
        GImage gImage;
        C89219l.m154721d(popupCardVO, "");
        m88357b(popupCardVO, aVar);
        m88358c(popupCardVO, aVar);
        C45784e promotionSkin = popupCardVO.getPromotionSkin();
        if (!(promotionSkin == null || (gImage = promotionSkin.f106679a) == null)) {
            C20766v a = C20761r.m39058a(gImage.toImageUrlModel());
            a.f49092E = (SmartImageView) m88355a(R.id.aqk);
            a.mo34186c();
        }
        ((LogoTuxTextView) m88355a(R.id.aqq)).mo77103a(popupCardVO.getTitle(), popupCardVO.getPromotionLogos());
        TuxTextView tuxTextView = (TuxTextView) m88355a(R.id.aqs);
        C89219l.m154716b(tuxTextView, "");
        String formatAvailablePrice = popupCardVO.getFormatAvailablePrice();
        if (formatAvailablePrice == null) {
            formatAvailablePrice = popupCardVO.getPrice();
        }
        tuxTextView.setText(formatAvailablePrice);
        TuxTextView tuxTextView2 = (TuxTextView) m88355a(R.id.aqn);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(popupCardVO.getFormatOriginPrice());
        TuxTextView tuxTextView3 = (TuxTextView) m88355a(R.id.aql);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setText(popupCardVO.getSource());
        if (popupCardVO.isSoldOut()) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            C1261i a2 = C1261i.m4015a(context.getResources(), R.drawable.a6_, null);
            if (a2 != null) {
                TuxButton tuxButton = (TuxButton) m88355a(R.id.aqj);
                C89219l.m154716b(tuxButton, "");
                tuxButton.setBackground(a2);
            }
            ((TuxButton) m88355a(R.id.aqj)).setTextColor(C0643b.m2378c(getContext(), R.color.bz));
        } else {
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            C1261i a3 = C1261i.m4015a(context2.getResources(), R.drawable.a65, null);
            if (a3 != null) {
                TuxButton tuxButton2 = (TuxButton) m88355a(R.id.aqj);
                C89219l.m154716b(tuxButton2, "");
                tuxButton2.setBackground(a3);
            }
            ((TuxButton) m88355a(R.id.aqj)).setTextColor(C0643b.m2378c(getContext(), R.color.l));
        }
        TuxIconView tuxIconView = (TuxIconView) m88355a(R.id.aqm);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setOnClickListener(new C45766d(aVar2));
        SmartImageView smartImageView = (SmartImageView) m88355a(R.id.aqr);
        C89219l.m154716b(smartImageView, "");
        smartImageView.setOnClickListener(new C45767e(this, bVar, popupCardVO, aVar));
        LogoTuxTextView logoTuxTextView = (LogoTuxTextView) m88355a(R.id.aqq);
        C89219l.m154716b(logoTuxTextView, "");
        logoTuxTextView.setOnClickListener(new C45768f(this, bVar, popupCardVO, aVar));
        TuxButton tuxButton3 = (TuxButton) m88355a(R.id.aqj);
        C89219l.m154716b(tuxButton3, "");
        tuxButton3.setOnClickListener(new C45769g(this, bVar, popupCardVO, aVar));
        setOnClickListener(new C45770h(this, bVar, popupCardVO, aVar));
    }
}
