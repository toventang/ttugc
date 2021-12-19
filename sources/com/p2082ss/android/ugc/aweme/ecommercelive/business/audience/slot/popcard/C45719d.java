package com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.p176b.AbstractC2932i;
import com.bytedance.android.livesdk.container.AbstractC8220c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.C45749o;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.C45790b;
import com.p2082ss.android.ugc.aweme.ecommercelive.business.common.p2869b.C45792d;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2873b.C45806a;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2874c.C45810a;
import com.p2082ss.android.ugc.aweme.ecommercelive.framework.p2875d.p2876a.C45813b;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89536ay;
import kotlinx.coroutines.C89624i;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.d */
public final class C45719d extends AbstractC45716a implements AbstractC2932i.AbstractC2935c, IEventCenter.AbstractC45375b {

    /* renamed from: f */
    public static final C45720a f106481f = new C45720a((byte) 0);

    /* renamed from: b */
    public AbstractC8220c f106482b;

    /* renamed from: c */
    public AbstractC8220c f106483c;

    /* renamed from: d */
    public final Context f106484d;

    /* renamed from: e */
    public String f106485e;

    /* renamed from: g */
    private AbstractC89171a<C89391z> f106486g;

    /* renamed from: h */
    private long f106487h;

    /* renamed from: i */
    private final Map<String, String> f106488i;

    static {
        Covode.recordClassIndex(54237);
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2932i.AbstractC2935c
    /* renamed from: a */
    public final void mo7660a() {
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2932i.AbstractC2935c
    /* renamed from: a */
    public final void mo7661a(String str) {
        C89219l.m154721d(str, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.d$a */
    public static final class C45720a {
        static {
            Covode.recordClassIndex(54238);
        }

        private C45720a() {
        }

        public /* synthetic */ C45720a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45716a
    /* renamed from: c */
    public final void mo77052c() {
        super.mo77052c();
        EventCenter.m87158a().mo75479a("ec_pin_card_show", "{}");
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45716a
    /* renamed from: d */
    public final void mo77053d() {
        super.mo77053d();
        EventCenter.m87158a().mo75479a("ec_pin_card_hide", "{}");
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45716a
    /* renamed from: e */
    public final void mo77055e() {
        super.mo77055e();
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C45813b.f106733b), null, null, new C45722c(this, null), 3);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.d$b */
    static final class C45721b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f106489a;

        /* renamed from: b */
        final /* synthetic */ C45719d f106490b;

        static {
            Covode.recordClassIndex(54239);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45721b(C45719d dVar, AbstractC89124d dVar2) {
            super(2, dVar2);
            this.f106490b = dVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C45721b(this.f106490b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C45721b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f106489a;
            if (i == 0) {
                C89382r.m154942a(obj);
                this.f106489a = 1;
                if (C89536ay.m155464a(400, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC8220c cVar = this.f106490b.f106483c;
            if (cVar != null) {
                cVar.mo14482c();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.d$c */
    static final class C45722c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f106491a;

        /* renamed from: b */
        final /* synthetic */ C45719d f106492b;

        static {
            Covode.recordClassIndex(54240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45722c(C45719d dVar, AbstractC89124d dVar2) {
            super(2, dVar2);
            this.f106492b = dVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C45722c(this.f106492b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C45722c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f106491a;
            if (i == 0) {
                C89382r.m154942a(obj);
                this.f106491a = 1;
                if (C89536ay.m155464a(400, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC8220c cVar = this.f106492b.f106482b;
            if (cVar != null) {
                cVar.mo14482c();
            }
            AbstractC8220c cVar2 = this.f106492b.f106483c;
            if (cVar2 != null) {
                cVar2.mo14482c();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2932i.AbstractC2935c
    /* renamed from: b */
    public final void mo7662b(String str) {
        String str2;
        C89219l.m154721d(str, "");
        AbstractC89171a<C89391z> aVar = this.f106486g;
        if (aVar != null) {
            aVar.invoke();
        }
        PopupCardVO popupCardVO = this.f106475a.f106552e;
        String str3 = null;
        if (popupCardVO != null) {
            str2 = String.valueOf(popupCardVO.getProductId());
        } else {
            str2 = null;
        }
        C45806a aVar2 = this.f106475a.f106477a;
        if (aVar2 != null) {
            str3 = aVar2.mo77118b("room_id");
        }
        C45792d.m88400a(str2, str3, this.f106485e, true, System.currentTimeMillis() - this.f106487h);
    }

    @Override // com.bytedance.android.live.p176b.AbstractC2932i.AbstractC2935c
    /* renamed from: c */
    public final void mo7663c(String str) {
        String str2;
        C89219l.m154721d(str, "");
        PopupCardVO popupCardVO = this.f106475a.f106552e;
        String str3 = null;
        if (popupCardVO != null) {
            str2 = String.valueOf(popupCardVO.getProductId());
        } else {
            str2 = null;
        }
        C45806a aVar = this.f106475a.f106477a;
        if (aVar != null) {
            str3 = aVar.mo77118b("room_id");
        }
        C45792d.m88400a(str2, str3, this.f106485e, false, System.currentTimeMillis() - this.f106487h);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45716a
    /* renamed from: a */
    public final View mo77049a(Context context) {
        FrameLayout frameLayout;
        MethodCollector.m26663i(2200);
        C89219l.m154721d(context, "");
        AbstractC8220c cVar = this.f106482b;
        if (cVar == null || (frameLayout = cVar.getFrameLayout()) == null) {
            View view = new View(context);
            MethodCollector.m26664o(2200);
            return view;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C34728n.m70946a(300.0d), -2);
        layoutParams.gravity = 80;
        layoutParams.leftMargin = C34728n.m70946a(12.0d);
        layoutParams.bottomMargin = C34728n.m70946a(8.0d);
        frameLayout.setLayoutParams(layoutParams);
        EventCenter.m87158a().mo75480a("ec_pin_card_close", this);
        MethodCollector.m26664o(2200);
        return frameLayout;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45716a
    /* renamed from: a */
    public final void mo77050a(AbstractC89171a<C89391z> aVar) {
        String b;
        String b2;
        Map<String, String> map;
        C89219l.m154721d(aVar, "");
        super.mo77050a(aVar);
        this.f106486g = aVar;
        this.f106487h = System.currentTimeMillis();
        AbstractC8220c cVar = this.f106483c;
        if (cVar != null) {
            cVar.mo14482c();
        }
        Context context = this.f106484d;
        C45806a aVar2 = this.f106475a.f106477a;
        AbstractC8220c cVar2 = null;
        C33744d a = aVar2 != null ? C45790b.m88388a(aVar2) : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(a == null || (map = a.f79943a) == null)) {
            linkedHashMap.putAll(map);
        }
        Map<String, String> map2 = this.f106488i;
        if (map2 != null) {
            linkedHashMap.put("effect_ad_extra", map2);
        }
        C45806a aVar3 = this.f106475a.f106477a;
        if (!(aVar3 == null || (b2 = aVar3.mo77118b("traffic_source")) == null)) {
            linkedHashMap.put("traffic_source", b2);
        }
        C45806a aVar4 = this.f106475a.f106477a;
        if (!(aVar4 == null || (b = aVar4.mo77118b("is_ad")) == null)) {
            linkedHashMap.put("is_ad", Integer.valueOf(Integer.parseInt(b)));
        }
        Uri.Builder builder = new Uri.Builder();
        Uri parse = Uri.parse(this.f106485e);
        C89219l.m154716b(parse, "");
        Uri.Builder encodedPath = builder.scheme(parse.getScheme()).encodedAuthority(parse.getAuthority()).encodedPath(parse.getPath());
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        C89219l.m154716b(queryParameterNames, "");
        for (T t : queryParameterNames) {
            encodedPath.appendQueryParameter(t, parse.getQueryParameter(t));
        }
        encodedPath.appendQueryParameter("track_params", C80342dg.m139300a().mo46674b(linkedHashMap)).appendQueryParameter("duration", String.valueOf(C45810a.m88428b()));
        Uri build = builder.build();
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        AbstractC8220c b3 = s.mo95830d().mo13010b(context, build);
        if (b3 != null) {
            b3.setContainerId("ECCardSlotLynxImpl");
            b3.setHybridLoadListener(this);
            b3.mo14480a();
            b3.mo14481b();
            cVar2 = b3;
        }
        this.f106482b = cVar2;
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p2082ss.android.ugc.aweme.ecommercelive.business.audience.slot.popcard.AbstractC45716a
    /* renamed from: d */
    public final void mo77054d(String str) {
        int i;
        C89219l.m154721d(str, "");
        int hashCode = str.hashCode();
        if (hashCode == 108401282 ? !str.equals("repin") : hashCode != 111439964 || !str.equals("unpin")) {
            AbstractC89172b<? super String, C89391z> bVar = this.f106475a.f106555h;
            if (bVar != null) {
                bVar.invoke(str);
            }
        } else {
            IEventCenter a = EventCenter.m87158a();
            switch (str.hashCode()) {
                case -2077031716:
                    if (str.equals("time_out")) {
                        i = 1;
                        break;
                    }
                    i = 0;
                    break;
                case -580047918:
                    if (str.equals("conflict")) {
                        i = 5;
                        break;
                    }
                    i = 0;
                    break;
                case 108401282:
                    if (str.equals("repin")) {
                        i = 4;
                        break;
                    }
                    i = 0;
                    break;
                case 111439964:
                    if (str.equals("unpin")) {
                        i = 3;
                        break;
                    }
                    i = 0;
                    break;
                case 1919805572:
                    if (str.equals("user_close")) {
                        i = 2;
                        break;
                    }
                    i = 0;
                    break;
                default:
                    i = 0;
                    break;
            }
            String b = C80342dg.m139300a().mo46674b(new C45749o(i));
            if (b == null) {
                b = "{}";
            }
            a.mo75479a("ec_pin_card_close", b);
        }
        this.f106483c = this.f106482b;
        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C45813b.f106733b), null, null, new C45721b(this, null), 3);
        EventCenter.m87158a().mo75481b("ec_pin_card_close", this);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter.AbstractC45375b
    /* renamed from: a */
    public final void mo74032a(String str, String str2) {
        String str3;
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        if (str.hashCode() == -719370572 && str.equals("ec_pin_card_close")) {
            C45749o a = C45749o.C45750a.m88335a(str2);
            int i = a.f106557a;
            if (i == 1 || i == 2) {
                int i2 = a.f106557a;
                if (i2 == 1) {
                    str3 = "time_out";
                } else if (i2 == 2) {
                    str3 = "user_close";
                } else if (i2 == 3) {
                    str3 = "unpin";
                } else if (i2 == 4) {
                    str3 = "repin";
                } else if (i2 != 5) {
                    str3 = "other";
                } else {
                    str3 = "conflict";
                }
                mo77054d(str3);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C45719d(Context context, C45718c cVar, String str, Map<String, String> map) {
        super(cVar);
        C89219l.m154721d(context, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(str, "");
        this.f106484d = context;
        this.f106485e = str;
        this.f106488i = map;
    }
}
