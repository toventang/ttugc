package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.google.p1998c.p1999a.C27258s;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34500b;
import com.p2082ss.android.ugc.aweme.commerce.service.C37533a;
import com.p2082ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p2082ss.android.ugc.aweme.commerce.service.p2521a.C37534a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40563b;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.global.config.settings.C52912c;
import com.p2082ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.C60211k;
import com.p2082ss.android.ugc.aweme.multi.C60215m;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.l */
public final class C60253l extends AbstractC60267o implements AbstractC90252i, AbstractC90253j {

    /* renamed from: e */
    public static final C60254a f137327e = new C60254a((byte) 0);

    /* renamed from: d */
    public String f137328d;

    /* renamed from: f */
    private C33744d f137329f;

    /* renamed from: g */
    private final List<C60211k> f137330g = new ArrayList();

    static {
        Covode.recordClassIndex(70785);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(152, new RunnableC90250g(C60253l.class, "onEvent", C40563b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: j */
    public final boolean mo97922j() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: l */
    public final String mo97925l() {
        return "webview";
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.l$a */
    public static final class C60254a {
        static {
            Covode.recordClassIndex(70786);
        }

        private C60254a() {
        }

        public /* synthetic */ C60254a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60253l();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.ANCHOR_SHOP_LINK.getTYPE();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        this.f137329f = dVar;
        AbstractC60267o.m109921a(this, dVar, false, false, 6);
        mo97945a(new C60256c(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.l$b */
    static final class C60255b extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60253l f137331a;

        static {
            Covode.recordClassIndex(70787);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60255b(C60253l lVar) {
            super(1);
            this.f137331a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AnchorCommonStruct anchorCommonStruct) {
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            C89219l.m154721d(anchorCommonStruct2, "");
            String extra = anchorCommonStruct2.getExtra();
            if (extra.length() > 0) {
                String str = null;
                if (!(1 == 0 || extra == null)) {
                    AbstractC28019l a = C28024q.m56139a(extra);
                    C89219l.m154716b(a, "");
                    C28022o j = a.mo46789j();
                    C60253l lVar = this.f137331a;
                    AbstractC28019l c = j.mo46803c("product_type");
                    if (c != null) {
                        str = c.mo46689c();
                    }
                    lVar.f137328d = str;
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97929b(AnchorCommonStruct anchorCommonStruct) {
        C89219l.m154721d(anchorCommonStruct, "");
        mo97945a(new C60255b(this));
        if (!(!this.f137330g.isEmpty())) {
            String extra = anchorCommonStruct.getExtra();
            try {
                JSONArray jSONArray = new JSONArray(extra);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String optString = jSONObject.optString("extra");
                    C60215m mVar = new C60215m();
                    C89219l.m154716b(optString, "");
                    if (optString.length() > 0) {
                        Object a = new C27910f().mo46670a(optString, C60215m.class);
                        C89219l.m154716b(a, "");
                        mVar = (C60215m) a;
                    }
                    List<C60211k> list = this.f137330g;
                    String optString2 = jSONObject.optString("keyword");
                    C89219l.m154716b(optString2, "");
                    String optString3 = jSONObject.optString("id");
                    C89219l.m154716b(optString3, "");
                    Integer valueOf = Integer.valueOf(jSONObject.optInt(StringSet.type));
                    Integer valueOf2 = Integer.valueOf(jSONObject.optInt("platform"));
                    String optString4 = jSONObject.optString("log_extra");
                    C89219l.m154716b(optString4, "");
                    String optString5 = jSONObject.optString("schema");
                    C89219l.m154716b(optString5, "");
                    list.add(new C60211k(optString, mVar, optString2, optString3, valueOf, valueOf2, optString4, optString5));
                }
            } catch (Exception e) {
                C39162r.m79460a("rd_tiktokec_shop_anchor_exception", new C33744d().mo59983a("e_stack_trace", C27258s.m54268b(e)).mo59983a("extra_data", "anchor.extra : ".concat(String.valueOf(extra))).mo59983a("where", "ShopLinkAnchorMaker").f79943a);
                C51423a.m95786a(e);
            }
        }
    }

    @AbstractC90264r
    public final void onEvent(C40563b bVar) {
        String str;
        C89219l.m154721d(bVar, "");
        ICommerceService a = C37533a.m75656a();
        C37534a aVar = new C37534a();
        String p = mo97950p();
        if (p == null) {
            p = "";
        }
        aVar.f88680b = p;
        aVar.f88682d = mo97949o().getAuthorUid();
        aVar.f88681c = mo97949o().getAid();
        aVar.f88695q = this.f137328d;
        aVar.f88696r = String.valueOf(bVar.f94910a);
        aVar.f88699u = "video";
        aVar.f88700v = "video_cart_tag";
        aVar.f88664I = C34500b.m70485a(mo97949o());
        if (mo97864a().mo97882a()) {
            str = "video_single_anchor";
        } else {
            str = "video_multi_anchor";
        }
        aVar.f88662G = str;
        aVar.f88663H = "video";
        a.logCommerceEvents("product_stay_time", aVar);
        C33744d dVar = this.f137329f;
        if (dVar != null) {
            C33744d a2 = dVar.mo59983a("author_id", mo97949o().getAuthorUid()).mo59983a("duration", String.valueOf(bVar.f94910a)).mo59983a("group_id", mo97949o().getAid());
            Long c = C59208ac.m108767c(mo97949o());
            C89219l.m154716b(c, "");
            C39162r.m79460a("anchor_stay_time", a2.mo59981a("music_id", c.longValue()).mo59983a("enter_from", mo97950p()).f79943a);
        }
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.l$c */
    static final class C60256c extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60253l f137332a;

        static {
            Covode.recordClassIndex(70788);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60256c(C60253l lVar) {
            super(1);
            this.f137332a = lVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AnchorCommonStruct anchorCommonStruct) {
            String str;
            String str2;
            boolean z;
            MethodCollector.m26663i(11744);
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            String str3 = "";
            C89219l.m154721d(anchorCommonStruct2, str3);
            String schema = anchorCommonStruct2.getSchema();
            if (schema != null) {
                try {
                    IESSettingsProxy iESSettingsProxy = C52912c.f121688a.f121689b;
                    C89219l.m154716b(iESSettingsProxy, str3);
                    str2 = iESSettingsProxy.getShopLinkAnchorDisclaimer();
                } catch (Exception unused) {
                    str2 = str3;
                }
                if (str2 == null || str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Context a = C17867d.m33078a();
                    Toast toast = new Toast(a);
                    toast.setDuration(1);
                    toast.setGravity(55, 0, 0);
                    Object a2 = C60253l.m109864a(a, "layout_inflater");
                    if (a2 != null) {
                        View inflate = ((LayoutInflater) a2).inflate(R.layout.aha, (ViewGroup) null);
                        View findViewById = inflate.findViewById(R.id.eu6);
                        C89219l.m154716b(findViewById, str3);
                        ((TextView) findViewById).setText(str2);
                        toast.setView(inflate);
                        if (Build.VERSION.SDK_INT == 25) {
                            C80567ic.m139657a(toast);
                        }
                        toast.show();
                    } else {
                        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.LayoutInflater");
                        MethodCollector.m26664o(11744);
                        throw nullPointerException;
                    }
                }
                Activity e = this.f137332a.mo97864a().mo97886e();
                MainServiceImpl.createIMainServicebyMonsterPlugin(false).openAdWebUrl(e, schema, str3);
                EventBus.m156966a(EventBus.m156962a(), anchorCommonStruct2);
                if (e instanceof AbstractC1204m) {
                    ((AbstractC1204m) e).getLifecycle().mo4012a(new ShopLinkAnchorMaker$whenMyAnchorClicked$1$1$1());
                }
            }
            ICommerceService a3 = C37533a.m75656a();
            C37534a aVar = new C37534a();
            String p = this.f137332a.mo97950p();
            if (p != null) {
                str3 = p;
            }
            aVar.f88680b = str3;
            aVar.f88682d = this.f137332a.mo97949o().getAuthorUid();
            aVar.f88681c = this.f137332a.mo97949o().getAid();
            aVar.f88695q = this.f137332a.f137328d;
            aVar.f88699u = "video";
            aVar.f88700v = "video_cart_tag";
            aVar.f88664I = C34500b.m70485a(this.f137332a.mo97949o());
            if (this.f137332a.mo97864a().mo97882a()) {
                str = "video_single_anchor";
            } else {
                str = "video_multi_anchor";
            }
            aVar.f88662G = str;
            aVar.f88663H = "video";
            a3.logCommerceEvents("enter_product_detail", aVar);
            if (this.f137332a.mo97949o().isAd()) {
                C18129a.m33746a("anchor_detail", "otherclick", this.f137332a.mo97949o().getAwemeRawAd()).mo28900b("refer", "shop_anchor").mo28901b();
            }
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(11744);
            return zVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97891b(C33744d dVar) {
        String str;
        Integer num;
        String str2;
        String str3;
        Long l;
        int i;
        String str4;
        int i2;
        C60215m mVar;
        C60215m mVar2;
        C60215m mVar3;
        C60215m mVar4;
        C89219l.m154721d(dVar, "");
        super.mo97891b(dVar);
        ICommerceService a = C37533a.m75656a();
        C37534a aVar = new C37534a();
        String p = mo97950p();
        if (p == null) {
            p = "";
        }
        aVar.f88680b = p;
        aVar.f88682d = mo97949o().getAuthorUid();
        aVar.f88681c = mo97949o().getAid();
        aVar.f88695q = this.f137328d;
        aVar.f88699u = "video";
        aVar.f88700v = "video_cart_tag";
        aVar.f88664I = C34500b.m70485a(mo97949o());
        String str5 = "video_single_anchor";
        if (mo97864a().mo97882a()) {
            str = str5;
        } else {
            str = "video_multi_anchor";
        }
        aVar.f88662G = str;
        aVar.f88663H = "video";
        a.logCommerceEvents("product_anchor_show", aVar);
        ICommerceService a2 = C37533a.m75656a();
        C37534a aVar2 = new C37534a();
        aVar2.f88658C = "TEMAI";
        aVar2.f88681c = mo97949o().getAid();
        aVar2.f88682d = mo97949o().getAuthorUid();
        aVar2.f88683e = mo97949o().getRequestId();
        String p2 = mo97950p();
        if (p2 == null) {
            p2 = "";
        }
        aVar2.f88680b = p2;
        aVar2.f88700v = "video_cart_tag";
        C60211k kVar = (C60211k) C89070n.m154583g((List) this.f137330g);
        String str6 = null;
        if (kVar == null || (mVar4 = kVar.f137247b) == null) {
            num = null;
        } else {
            num = mVar4.f137265i;
        }
        aVar2.f88703y = String.valueOf(num);
        C60211k kVar2 = (C60211k) C89070n.m154583g((List) this.f137330g);
        if (kVar2 == null || (mVar3 = kVar2.f137247b) == null) {
            str2 = null;
        } else {
            str2 = mVar3.f137267k;
        }
        aVar2.f88702x = str2;
        C60211k kVar3 = (C60211k) C89070n.m154583g((List) this.f137330g);
        if (kVar3 == null || (mVar2 = kVar3.f137247b) == null) {
            str3 = null;
        } else {
            str3 = mVar2.f137268l;
        }
        aVar2.f88701w = str3;
        C60211k kVar4 = (C60211k) C89070n.m154583g((List) this.f137330g);
        if (kVar4 == null || (mVar = kVar4.f137247b) == null) {
            l = null;
        } else {
            l = mVar.f137258b;
        }
        aVar2.f88704z = String.valueOf(l);
        String authorUid = mo97949o().getAuthorUid();
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
        if (C89219l.m154714a((Object) authorUid, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
            i = 1;
        } else {
            i = 0;
        }
        aVar2.f88656A = i;
        if (mo97864a().mo97882a()) {
            str4 = "yes";
        } else {
            str4 = "no";
        }
        aVar2.f88657B = str4;
        if (mo97949o().isAd()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        aVar2.f88660E = i2;
        if (mo97949o().isAd()) {
            str6 = mo97949o().getAwemeRawAdIdStr();
        }
        aVar2.f88661F = str6;
        aVar2.f88664I = C34500b.m70485a(mo97949o());
        if (!mo97864a().mo97882a()) {
            str5 = "video_multi_anchor";
        }
        aVar2.f88662G = str5;
        aVar2.f88663H = "video";
        a2.logCommerceEvents("tiktok_video_anchor_view", aVar2);
        if (mo97949o().isAd()) {
            C18129a.m33746a("draw_ad", "othershow", mo97949o().getAwemeRawAd()).mo28900b("refer", "shop_anchor").mo28901b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: c */
    public final void mo97892c(C33744d dVar) {
        Integer num;
        String str;
        String str2;
        Long l;
        int i;
        String str3;
        int i2;
        String str4;
        String str5;
        C60215m mVar;
        C60215m mVar2;
        C60215m mVar3;
        C60215m mVar4;
        C89219l.m154721d(dVar, "");
        super.mo97892c(dVar);
        ICommerceService a = C37533a.m75656a();
        C37534a aVar = new C37534a();
        aVar.f88658C = "TEMAI";
        aVar.f88681c = mo97949o().getAid();
        aVar.f88682d = mo97949o().getAuthorUid();
        aVar.f88683e = mo97949o().getRequestId();
        String p = mo97950p();
        if (p == null) {
            p = "";
        }
        aVar.f88680b = p;
        aVar.f88700v = "video_cart_tag";
        C60211k kVar = (C60211k) C89070n.m154583g((List) this.f137330g);
        String str6 = null;
        if (kVar == null || (mVar4 = kVar.f137247b) == null) {
            num = null;
        } else {
            num = mVar4.f137265i;
        }
        aVar.f88703y = String.valueOf(num);
        C60211k kVar2 = (C60211k) C89070n.m154583g((List) this.f137330g);
        if (kVar2 == null || (mVar3 = kVar2.f137247b) == null) {
            str = null;
        } else {
            str = mVar3.f137267k;
        }
        aVar.f88702x = str;
        C60211k kVar3 = (C60211k) C89070n.m154583g((List) this.f137330g);
        if (kVar3 == null || (mVar2 = kVar3.f137247b) == null) {
            str2 = null;
        } else {
            str2 = mVar2.f137268l;
        }
        aVar.f88701w = str2;
        C60211k kVar4 = (C60211k) C89070n.m154583g((List) this.f137330g);
        if (kVar4 == null || (mVar = kVar4.f137247b) == null) {
            l = null;
        } else {
            l = mVar.f137258b;
        }
        aVar.f88704z = String.valueOf(l);
        String authorUid = mo97949o().getAuthorUid();
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
        if (C89219l.m154714a((Object) authorUid, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
            i = 1;
        } else {
            i = 0;
        }
        aVar.f88656A = i;
        if (mo97864a().mo97882a()) {
            str3 = "yes";
        } else {
            str3 = "no";
        }
        aVar.f88657B = str3;
        if (mo97949o().isAd()) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        aVar.f88660E = i2;
        if (mo97949o().isAd()) {
            str6 = mo97949o().getAwemeRawAdIdStr();
        }
        aVar.f88661F = str6;
        aVar.f88664I = C34500b.m70485a(mo97949o());
        if (mo97864a().mo97882a()) {
            str4 = "video_single_anchor";
        } else {
            str4 = "video_multi_anchor";
        }
        aVar.f88662G = str4;
        aVar.f88663H = "video";
        a.logCommerceEvents("tiktok_video_anchor_click", aVar);
        if (mo97949o().isAd()) {
            AwemeRawAd awemeRawAd = mo97949o().getAwemeRawAd();
            if (awemeRawAd == null || awemeRawAd.getAnchorClickType() != 2) {
                str5 = "otherclick";
            } else {
                str5 = "click";
            }
            C18129a.m33746a("draw_ad", str5, mo97949o().getAwemeRawAd()).mo28900b("refer", "shop_anchor").mo28901b();
        }
    }

    /* renamed from: a */
    static Object m109864a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(5815);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(5815);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
