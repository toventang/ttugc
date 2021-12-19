package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.p063m.p064a.p065a.C1261i;
import com.bytedance.android.livesdk.chatroom.p499ui.LiveRoundImageView;
import com.bytedance.android.livesdk.p425aa.C6544e;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.common.util.C29844g;
import com.p2082ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.p2082ss.android.ugc.aweme.ecommerce.preloader.LowResolutionImageCache;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.C45792d;
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

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.r */
public final class C45771r extends ConstraintLayout {

    /* renamed from: g */
    public static final C45772a f106622g = new C45772a((byte) 0);

    /* renamed from: h */
    private SparseArray f106623h;

    static {
        Covode.recordClassIndex(54289);
    }

    /* renamed from: b */
    private View m88369b(int i) {
        if (this.f106623h == null) {
            this.f106623h = new SparseArray();
        }
        View view = (View) this.f106623h.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f106623h.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.r$a */
    public static final class C45772a {
        static {
            Covode.recordClassIndex(54290);
        }

        private C45772a() {
        }

        public /* synthetic */ C45772a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.r$d */
    public static final class C45775d extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106628a = 300;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f106629b;

        static {
            Covode.recordClassIndex(54293);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45775d(AbstractC89171a aVar) {
            super(300);
            this.f106629b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            AbstractC89171a aVar;
            if (view != null && (aVar = this.f106629b) != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.r$e */
    public static final class C45776e extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106630a = 300;

        /* renamed from: b */
        final /* synthetic */ C45771r f106631b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f106632c;

        /* renamed from: d */
        final /* synthetic */ PopupCardVO f106633d;

        /* renamed from: e */
        final /* synthetic */ C45806a f106634e;

        static {
            Covode.recordClassIndex(54294);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                AbstractC89172b bVar = this.f106632c;
                if (bVar != null) {
                    bVar.invoke("pic");
                }
                this.f106631b.mo77092a(this.f106633d, this.f106634e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45776e(C45771r rVar, AbstractC89172b bVar, PopupCardVO popupCardVO, C45806a aVar) {
            super(300);
            this.f106631b = rVar;
            this.f106632c = bVar;
            this.f106633d = popupCardVO;
            this.f106634e = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.r$f */
    public static final class C45777f extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106635a = 300;

        /* renamed from: b */
        final /* synthetic */ C45771r f106636b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f106637c;

        /* renamed from: d */
        final /* synthetic */ PopupCardVO f106638d;

        /* renamed from: e */
        final /* synthetic */ C45806a f106639e;

        static {
            Covode.recordClassIndex(54295);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                AbstractC89172b bVar = this.f106637c;
                if (bVar != null) {
                    bVar.invoke("title");
                }
                this.f106636b.mo77092a(this.f106638d, this.f106639e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45777f(C45771r rVar, AbstractC89172b bVar, PopupCardVO popupCardVO, C45806a aVar) {
            super(300);
            this.f106636b = rVar;
            this.f106637c = bVar;
            this.f106638d = popupCardVO;
            this.f106639e = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.r$g */
    public static final class C45778g extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106640a = 300;

        /* renamed from: b */
        final /* synthetic */ C45771r f106641b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f106642c;

        /* renamed from: d */
        final /* synthetic */ PopupCardVO f106643d;

        /* renamed from: e */
        final /* synthetic */ C45806a f106644e;

        static {
            Covode.recordClassIndex(54296);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                AbstractC89172b bVar = this.f106642c;
                if (bVar != null) {
                    bVar.invoke("button");
                }
                this.f106641b.mo77092a(this.f106643d, this.f106644e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45778g(C45771r rVar, AbstractC89172b bVar, PopupCardVO popupCardVO, C45806a aVar) {
            super(300);
            this.f106641b = rVar;
            this.f106642c = bVar;
            this.f106643d = popupCardVO;
            this.f106644e = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.r$h */
    public static final class C45779h extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f106645a = 300;

        /* renamed from: b */
        final /* synthetic */ C45771r f106646b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f106647c;

        /* renamed from: d */
        final /* synthetic */ PopupCardVO f106648d;

        /* renamed from: e */
        final /* synthetic */ C45806a f106649e;

        static {
            Covode.recordClassIndex(54297);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                AbstractC89172b bVar = this.f106647c;
                if (bVar != null) {
                    bVar.invoke("other");
                }
                this.f106646b.mo77092a(this.f106648d, this.f106649e);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45779h(C45771r rVar, AbstractC89172b bVar, PopupCardVO popupCardVO, C45806a aVar) {
            super(300);
            this.f106646b = rVar;
            this.f106647c = bVar;
            this.f106648d = popupCardVO;
            this.f106649e = aVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.r$c */
    public static final class C45774c extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C45774c f106627a = new C45774c();

        static {
            Covode.recordClassIndex(54292);
        }

        C45774c() {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C45771r(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(2174);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, (int) R.style.x6);
        LayoutInflater.from(context).cloneInContext(contextThemeWrapper).inflate(R.layout.y7, this);
        setLayoutParams(new ConstraintLayout.C0547a(C45811a.m88429a(112, context), -2));
        setBackground(C0643b.m2369a(contextThemeWrapper, (int) R.drawable.a6i));
        MethodCollector.m26664o(2174);
    }

    public /* synthetic */ C45771r(Context context, byte b) {
        this(context);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.r$b */
    public static final class C45773b extends AbstractC20727d {

        /* renamed from: a */
        final /* synthetic */ C89233z.C89237d f106624a;

        /* renamed from: b */
        final /* synthetic */ PopupCardVO f106625b;

        /* renamed from: c */
        final /* synthetic */ String f106626c;

        static {
            Covode.recordClassIndex(54291);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20727d, com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34147a(Uri uri, View view) {
            this.f106624a.element = System.currentTimeMillis();
        }

        C45773b(C89233z.C89237d dVar, PopupCardVO popupCardVO, String str) {
            this.f106624a = dVar;
            this.f106625b = popupCardVO;
            this.f106626c = str;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
        /* renamed from: a */
        public final void mo34159a(Uri uri, View view, Throwable th) {
            String str;
            String valueOf = String.valueOf(this.f106625b.getProductId());
            String str2 = this.f106626c;
            String imageUrl = this.f106625b.getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            String fromMessageId = this.f106625b.getFromMessageId();
            if (this.f106625b.isFromMessage()) {
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
            long currentTimeMillis = System.currentTimeMillis() - this.f106624a.element;
            String valueOf = String.valueOf(this.f106625b.getProductId());
            String str2 = this.f106626c;
            String imageUrl = this.f106625b.getImageUrl();
            if (imageUrl == null) {
                imageUrl = "";
            }
            String fromMessageId = this.f106625b.getFromMessageId();
            if (this.f106625b.isFromMessage()) {
                str = "message";
            } else {
                str = "pop";
            }
            C45792d.m88399a(valueOf, str2, imageUrl, fromMessageId, str, Long.valueOf(currentTimeMillis));
            LowResolutionImageCache.m87735a().mo76181a(this.f106625b.getImageUrlKey(), this.f106625b.getImageUrl());
        }
    }

    /* renamed from: c */
    private final void m88371c(PopupCardVO popupCardVO, C45806a aVar) {
        String str;
        C89233z.C89237d dVar = new C89233z.C89237d();
        dVar.element = System.currentTimeMillis();
        if (aVar != null) {
            str = aVar.mo77118b("room_id");
        } else {
            str = null;
        }
        Drawable a = C23009f.m43397a(C45774c.f106627a).mo37389a(new ContextThemeWrapper(getContext(), (int) R.style.x6));
        C20766v a2 = C20761r.m39061a(popupCardVO.getImageUrl());
        a2.f49117n = a;
        a2.f49093F = (ImageView) m88369b(R.id.aqr);
        a2.mo34181a(new C45773b(dVar, popupCardVO, str));
    }

    /* renamed from: b */
    private final void m88370b(PopupCardVO popupCardVO, C45806a aVar) {
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
    public final void mo77092a(PopupCardVO popupCardVO, C45806a aVar) {
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
    public final void mo77093a(PopupCardVO popupCardVO, C45806a aVar, AbstractC89172b<? super String, C89391z> bVar, AbstractC89171a<C89391z> aVar2) {
        C89219l.m154721d(popupCardVO, "");
        m88370b(popupCardVO, aVar);
        m88371c(popupCardVO, aVar);
        TuxTextView tuxTextView = (TuxTextView) m88369b(R.id.aqq);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(popupCardVO.getTitle());
        TuxTextView tuxTextView2 = (TuxTextView) m88369b(R.id.aqs);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(popupCardVO.getPrice());
        if (popupCardVO.isSoldOut()) {
            Context context = getContext();
            C89219l.m154716b(context, "");
            C1261i a = C1261i.m4015a(context.getResources(), R.drawable.a6_, null);
            if (a != null) {
                TuxButton tuxButton = (TuxButton) m88369b(R.id.aqj);
                C89219l.m154716b(tuxButton, "");
                tuxButton.setBackground(a);
            }
            ((TuxButton) m88369b(R.id.aqj)).setTextColor(C0643b.m2378c(getContext(), R.color.bz));
        } else {
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            C1261i a2 = C1261i.m4015a(context2.getResources(), R.drawable.a65, null);
            if (a2 != null) {
                TuxButton tuxButton2 = (TuxButton) m88369b(R.id.aqj);
                C89219l.m154716b(tuxButton2, "");
                tuxButton2.setBackground(a2);
            }
            ((TuxButton) m88369b(R.id.aqj)).setTextColor(C0643b.m2378c(getContext(), R.color.l));
        }
        TuxIconView tuxIconView = (TuxIconView) m88369b(R.id.aqm);
        C89219l.m154716b(tuxIconView, "");
        tuxIconView.setOnClickListener(new C45775d(aVar2));
        LiveRoundImageView liveRoundImageView = (LiveRoundImageView) m88369b(R.id.aqr);
        C89219l.m154716b(liveRoundImageView, "");
        liveRoundImageView.setOnClickListener(new C45776e(this, bVar, popupCardVO, aVar));
        TuxTextView tuxTextView3 = (TuxTextView) m88369b(R.id.aqq);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setOnClickListener(new C45777f(this, bVar, popupCardVO, aVar));
        TuxButton tuxButton3 = (TuxButton) m88369b(R.id.aqj);
        C89219l.m154716b(tuxButton3, "");
        tuxButton3.setOnClickListener(new C45778g(this, bVar, popupCardVO, aVar));
        setOnClickListener(new C45779h(this, bVar, popupCardVO, aVar));
    }
}
