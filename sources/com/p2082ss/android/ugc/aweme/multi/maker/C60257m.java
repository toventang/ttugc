package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.utils.C11279p;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.router.SmartRouter;
import com.google.gson.C27910f;
import com.google.p1998c.p1999a.C27258s;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.api.AnchorApi;
import com.p2082ss.android.ugc.aweme.api.request.GetItemProductInfoRequest;
import com.p2082ss.android.ugc.aweme.api.resp.C33546d;
import com.p2082ss.android.ugc.aweme.api.resp.C33547e;
import com.p2082ss.android.ugc.aweme.api.resp.EnterContext;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34500b;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.utils.C34727m;
import com.p2082ss.android.ugc.aweme.commerce.service.C37533a;
import com.p2082ss.android.ugc.aweme.commerce.service.ICommerceService;
import com.p2082ss.android.ugc.aweme.commerce.service.p2521a.C37534a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40563b;
import com.p2082ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.p2082ss.android.ugc.aweme.ecommerce.service.p2858vo.ProductBaseEpt;
import com.p2082ss.android.ugc.aweme.ecommerce.service.p2858vo.ProductPriceEpt;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.framework.services.IUserService;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60200b;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60203e;
import com.p2082ss.android.ugc.aweme.multi.C60202d;
import com.p2082ss.android.ugc.aweme.multi.C60209i;
import com.p2082ss.android.ugc.aweme.multi.C60210j;
import com.p2082ss.android.ugc.aweme.multi.C60211k;
import com.p2082ss.android.ugc.aweme.multi.C60212l;
import com.p2082ss.android.ugc.aweme.multi.C60215m;
import com.p2082ss.android.ugc.aweme.multi.p3462ui.C60311c;
import com.p2082ss.android.ugc.aweme.multi.viewmodel.ShopWindowAnchorViewModel;
import com.p2082ss.android.ugc.aweme.p2312an.C33496a;
import com.p2082ss.android.ugc.aweme.services.BaseUserService;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONArray;
import org.json.JSONObject;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.m */
public final class C60257m extends AbstractC60267o implements AbstractC90252i, AbstractC90253j {

    /* renamed from: g */
    public static final C60258a f137333g = new C60258a((byte) 0);

    /* renamed from: d */
    public C60311c f137334d;

    /* renamed from: e */
    public ShopWindowAnchorViewModel f137335e;

    /* renamed from: f */
    public boolean f137336f = true;

    /* renamed from: j */
    private List<C60211k> f137337j = new ArrayList();

    /* renamed from: k */
    private C60211k f137338k;

    /* renamed from: l */
    private C33744d f137339l;

    /* renamed from: m */
    private int f137340m = 1;

    /* renamed from: n */
    private final Runnable f137341n = new RunnableC60260c(this);

    static {
        Covode.recordClassIndex(70789);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60189a
    /* renamed from: e */
    public final boolean mo97875e() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(152, new RunnableC90250g(C60257m.class, "onEvent", C40563b.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: l */
    public final String mo97925l() {
        return "webview";
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.m$a */
    public static final class C60258a {
        static {
            Covode.recordClassIndex(70790);
        }

        private C60258a() {
        }

        public /* synthetic */ C60258a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.AbstractC60189a
    /* renamed from: a */
    public final void mo97870a(C60202d dVar) {
        C60311c cVar;
        C89219l.m154721d(dVar, "");
        if (!m109881n() && (cVar = this.f137334d) != null) {
            String a = C60212l.m109763a(cVar.f137449e.mo97883b(), cVar.f137453i);
            if (a == null) {
                a = "video_multi_anchor";
            }
            ICommerceService a2 = C37533a.m75656a();
            C37534a aVar = new C37534a();
            aVar.f88658C = "TEMAI";
            aVar.f88666K = "video_shopping_list";
            aVar.f88667L = "video_multi_anchor";
            aVar.f88681c = cVar.f137449e.mo97883b().getAid();
            aVar.f88666K = "video_shopping_list";
            aVar.f88661F = cVar.f137449e.mo97883b().isAd() ? cVar.f137449e.mo97883b().getAwemeRawAdIdStr() : null;
            aVar.f88667L = "video_multi_anchor";
            aVar.f88660E = cVar.f137449e.mo97883b().isAd() ? 1 : 0;
            aVar.f88682d = cVar.f137449e.mo97883b().getAuthorUid();
            String c = cVar.f137449e.mo97884c();
            if (c == null) {
                c = "";
            }
            aVar.f88680b = c;
            String authorUid = cVar.f137449e.mo97883b().getAuthorUid();
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
            aVar.f88656A = C89219l.m154714a(authorUid, createIUserServicebyMonsterPlugin.getCurrentUserID()) ? 1 : 0;
            aVar.f88664I = C34500b.m70485a(cVar.f137449e.mo97883b());
            aVar.f88662G = a;
            aVar.f88663H = "video";
            a2.logCommerceEvents("tiktokec_shopping_list_show", aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.AbstractC60189a
    /* renamed from: a */
    public final void mo97867a(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        m109880d(false);
    }

    /* renamed from: a */
    public final void mo97938a(String str, Long l, Integer num, List<String> list, Integer num2) {
        ICommerceService a = C37533a.m75656a();
        C37534a aVar = new C37534a();
        aVar.f88658C = "TEMAI";
        aVar.f88680b = mo97950p();
        aVar.f88682d = mo97949o().getAuthorUid();
        aVar.f88681c = mo97949o().getAid();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        aVar.f88673R = m109877b(arrayList);
        aVar.f88674S = num2;
        aVar.f88675T = num;
        aVar.f88696r = String.valueOf(l);
        aVar.f88676U = str;
        a.logCommerceEvents("rd_tiktokec_video_shopping_list_request_result", aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.m$b */
    public static final class C60259b implements AbstractC60203e {

        /* renamed from: b */
        final /* synthetic */ C60257m f137342b;

        static {
            Covode.recordClassIndex(70791);
        }

        @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60203e
        /* renamed from: a */
        public final String mo97900a(String str) {
            C89219l.m154721d(str, "");
            return "";
        }

        @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60203e
        /* renamed from: a */
        public final String mo97899a() {
            return this.f137342b.mo97937a(true);
        }

        @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60203e
        /* renamed from: b */
        public final String mo97901b() {
            return this.f137342b.mo97940c(true);
        }

        @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60203e
        /* renamed from: c */
        public final String mo97902c() {
            return this.f137342b.mo97939b(true);
        }

        @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60203e
        /* renamed from: d */
        public final String mo97903d() {
            return this.f137342b.mo97937a(false);
        }

        @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60203e
        /* renamed from: e */
        public final String mo97904e() {
            return this.f137342b.mo97940c(false);
        }

        @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60203e
        /* renamed from: f */
        public final String mo97905f() {
            return this.f137342b.mo97939b(false);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C60259b(C60257m mVar) {
            this.f137342b = mVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.m$c */
    static final class RunnableC60260c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C60257m f137343a;

        static {
            Covode.recordClassIndex(70792);
        }

        RunnableC60260c(C60257m mVar) {
            this.f137343a = mVar;
        }

        public final void run() {
            this.f137343a.f137336f = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.AbstractC60189a
    /* renamed from: b */
    public final AbstractC60203e mo97872b() {
        return new C60259b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.AbstractC60189a
    /* renamed from: d */
    public final int mo97874d() {
        return this.f137337j.size();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60253l();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.ANCHOR_SHOP_MIX.getTYPE();
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.m$f */
    static final class C60263f extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ SmartImageView f137349a;

        static {
            Covode.recordClassIndex(70795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60263f(SmartImageView smartImageView) {
            super(0);
            this.f137349a = smartImageView;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f137349a.setImageResource(2131232528);
            return C89391z.f203057a;
        }
    }

    /* renamed from: n */
    private final boolean m109881n() {
        return mo97864a().mo97882a();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: g */
    public final String mo97895g() {
        if (C33496a.m68619a() && mo97864a().mo97882a()) {
            String string = mo97864a().mo97886e().getResources().getString(R.string.ety);
            C89219l.m154716b(string, "");
            return string;
        } else if (!(!this.f137337j.isEmpty())) {
            return super.mo97895g();
        } else {
            Integer num = this.f137337j.get(0).f137250e;
            int type = EnumC31359ab.ANCHOR_SHOP_WINDOW.getTYPE();
            if (num != null && num.intValue() == type) {
                String str = this.f137337j.get(0).f137247b.f137260d;
                if (TextUtils.isEmpty(str)) {
                    String str2 = this.f137337j.get(0).f137247b.f137259c;
                    if (str2 == null) {
                        return "";
                    }
                    return str2;
                } else if (str == null) {
                    return "";
                } else {
                    return str;
                }
            } else {
                Integer num2 = this.f137337j.get(0).f137250e;
                int type2 = EnumC31359ab.ANCHOR_SHOP_LINK.getTYPE();
                if (num2 != null && num2.intValue() == type2) {
                    return this.f137337j.get(0).f137248c;
                }
                return "";
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: h */
    public final String mo97896h() {
        if (!C33496a.m68619a() || !mo97864a().mo97882a()) {
            return null;
        }
        if (!(!this.f137337j.isEmpty())) {
            return super.mo97895g();
        }
        Integer num = this.f137337j.get(0).f137250e;
        int type = EnumC31359ab.ANCHOR_SHOP_WINDOW.getTYPE();
        if (num != null && num.intValue() == type) {
            String str = this.f137337j.get(0).f137247b.f137260d;
            if (TextUtils.isEmpty(str)) {
                String str2 = this.f137337j.get(0).f137247b.f137259c;
                if (str2 == null) {
                    return "";
                }
                return str2;
            } else if (str == null) {
                return "";
            } else {
                return str;
            }
        } else {
            Integer num2 = this.f137337j.get(0).f137250e;
            int type2 = EnumC31359ab.ANCHOR_SHOP_LINK.getTYPE();
            if (num2 != null && num2.intValue() == type2) {
                return this.f137337j.get(0).f137248c;
            }
            return "";
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.m$d */
    static final class C60261d extends AbstractC89220m implements AbstractC89172b<List<C60211k>, String> {

        /* renamed from: a */
        public static final C60261d f137344a = new C60261d();

        static {
            Covode.recordClassIndex(70793);
        }

        C60261d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ String invoke(List<C60211k> list) {
            return m109911a(list);
        }

        /* renamed from: a */
        public static String m109911a(List<C60211k> list) {
            C89219l.m154721d(list, "");
            if (list.isEmpty()) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            int size = list.size() - 1;
            for (int i = 0; i < size; i++) {
                sb.append(list.get(i).f137250e);
                sb.append(",");
            }
            sb.append(((C60211k) C89070n.m154586h((List) list)).f137250e);
            return sb.toString();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: a */
    public final void mo97889a(SmartImageView smartImageView) {
        C89219l.m154721d(smartImageView, "");
        mo97943a(smartImageView, new C60263f(smartImageView));
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        if (this.f137336f) {
            this.f137336f = false;
            C34727m.m70945a(this.f137341n, 300);
            m109880d(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.m$g */
    static final class C60264g extends AbstractC89220m implements AbstractC89172b<ProductBaseEpt, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60257m f137350a;

        /* renamed from: b */
        final /* synthetic */ C60211k f137351b;

        static {
            Covode.recordClassIndex(70796);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60264g(C60257m mVar, C60211k kVar) {
            super(1);
            this.f137350a = mVar;
            this.f137351b = kVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(ProductBaseEpt productBaseEpt) {
            String str;
            RecyclerView a;
            RecyclerView.AbstractC1350a adapter;
            ProductBaseEpt productBaseEpt2 = productBaseEpt;
            if (!this.f137350a.mo97864a().mo97882a()) {
                C60215m mVar = this.f137351b.f137247b;
                if (productBaseEpt2 != null) {
                    ProductPriceEpt productPriceEpt = productBaseEpt2.f105740d;
                    if (productPriceEpt == null || (str = productPriceEpt.f105742b) == null) {
                        ProductPriceEpt productPriceEpt2 = productBaseEpt2.f105740d;
                        if (productPriceEpt2 != null) {
                            str = productPriceEpt2.f105741a;
                        }
                    }
                    mVar.f137262f = str;
                    C60311c cVar = this.f137350a.f137334d;
                    if (!(cVar == null || (a = cVar.mo97980a()) == null || (adapter = a.getAdapter()) == null)) {
                        adapter.notifyDataSetChanged();
                    }
                }
                str = null;
                mVar.f137262f = str;
                C60311c cVar2 = this.f137350a.f137334d;
                adapter.notifyDataSetChanged();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: b */
    private static String m109877b(List<String> list) {
        C89219l.m154721d(list, "");
        if (list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int size = list.size() - 1;
        for (int i = 0; i < size; i++) {
            sb.append(list.get(i));
            sb.append(",");
        }
        sb.append((String) C89070n.m154586h((List) list));
        return sb.toString();
    }

    /* renamed from: a */
    private final List<String> m109874a(int i) {
        ArrayList arrayList = new ArrayList();
        List<C60211k> list = this.f137337j;
        ArrayList<C60211k> arrayList2 = new ArrayList();
        for (T t : list) {
            Integer num = t.f137247b.f137271o;
            if (num != null && num.intValue() == i) {
                arrayList2.add(t);
            }
        }
        for (C60211k kVar : arrayList2) {
            arrayList.add(String.valueOf(kVar.f137247b.f137258b));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final String mo97939b(boolean z) {
        String str;
        boolean z2;
        Iterator<C60211k> it = this.f137337j.iterator();
        String str2 = "";
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            try {
                str = new JSONObject(it.next().f137252g).optString("anchor_name");
            } catch (Exception unused) {
                C60211k kVar = this.f137338k;
                if (kVar != null) {
                    str = kVar.f137248c;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            }
            C89219l.m154716b(str, "");
            if (str.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z) {
                    str2 = str2 + str;
                    break;
                }
                str2 = str2 + str + ',';
            }
        }
        return C89361p.m154913b(str2, (CharSequence) ",");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.maker.m$e */
    public static final class C60262e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C60257m f137345a;

        /* renamed from: b */
        final /* synthetic */ long f137346b;

        /* renamed from: c */
        final /* synthetic */ List f137347c;

        /* renamed from: d */
        final /* synthetic */ Map f137348d;

        static {
            Covode.recordClassIndex(70794);
        }

        C60262e(C60257m mVar, long j, List list, Map map) {
            this.f137345a = mVar;
            this.f137346b = j;
            this.f137347c = list;
            this.f137348d = map;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            BaseResponse.ServerTimeExtra serverTimeExtra;
            List<C60215m> list;
            String str;
            C60210j jVar;
            C60210j jVar2;
            C89219l.m154716b(iVar, "");
            C33546d dVar = (C33546d) iVar.mo5545d();
            Integer num = null;
            if (dVar != null && dVar.status_code == 0) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C33547e eVar = ((C33546d) iVar.mo5545d()).f79677a;
                if (!(eVar == null || (list = eVar.f79678a) == null)) {
                    for (T t : list) {
                        String valueOf = String.valueOf(t.f137258b);
                        C60209i iVar2 = t.f137272p;
                        if (iVar2 == null || (jVar2 = iVar2.f137243a) == null || (str = jVar2.f137245b) == null) {
                            C60209i iVar3 = t.f137272p;
                            str = (iVar3 == null || (jVar = iVar3.f137243a) == null) ? null : jVar.f137244a;
                        }
                        linkedHashMap.put(valueOf, str);
                    }
                }
                ShopWindowAnchorViewModel shopWindowAnchorViewModel = this.f137345a.f137335e;
                if (shopWindowAnchorViewModel != null) {
                    C89219l.m154721d(linkedHashMap, "");
                    shopWindowAnchorViewModel.f137483a.setValue(linkedHashMap);
                }
            }
            C60257m mVar = this.f137345a;
            C33546d dVar2 = (C33546d) iVar.mo5545d();
            String str2 = (dVar2 == null || (serverTimeExtra = dVar2.extra) == null) ? null : serverTimeExtra.logid;
            Long valueOf2 = Long.valueOf(SystemClock.elapsedRealtime() - this.f137346b);
            C33546d dVar3 = (C33546d) iVar.mo5545d();
            if (dVar3 != null) {
                num = Integer.valueOf(dVar3.status_code);
            }
            List<String> list2 = this.f137347c;
            for (Map.Entry entry : this.f137348d.entrySet()) {
                Integer reqType = ((EnterContext) entry.getValue()).getReqType();
                if (reqType != null) {
                    mVar.mo97938a(str2, valueOf2, num, list2, reqType);
                    return C89391z.f203057a;
                }
            }
            throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
        }
    }

    /* renamed from: c */
    private final List<C60211k> m109878c(AnchorCommonStruct anchorCommonStruct) {
        Exception e;
        boolean z;
        ArrayList arrayList = new ArrayList();
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
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Object a = new C27910f().mo46670a(optString, C60215m.class);
                    C89219l.m154716b(a, "");
                    mVar = (C60215m) a;
                }
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
                arrayList.add(new C60211k(optString, mVar, optString2, optString3, valueOf, valueOf2, optString4, optString5));
            }
            try {
                this.f137338k = (C60211k) C89070n.m154583g((List) arrayList);
                return arrayList;
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            C39162r.m79460a("rd_tiktokec_shop_anchor_exception", new C33744d().mo59983a("e_stack_trace", C27258s.m54268b(e)).mo59983a("extra_data", "anchor.extra : ".concat(String.valueOf(extra))).mo59983a("where", "ShopWindowAnchorMaker").f79943a);
            return new ArrayList();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97929b(AnchorCommonStruct anchorCommonStruct) {
        C89219l.m154721d(anchorCommonStruct, "");
        super.mo97929b(anchorCommonStruct);
        if (this.f137337j.isEmpty()) {
            this.f137337j = m109878c(anchorCommonStruct);
        }
        List<C60211k> list = this.f137337j;
        ICommerceService a = C37533a.m75656a();
        C37534a aVar = new C37534a();
        aVar.f88658C = "TEMAI";
        aVar.f88663H = "video";
        aVar.f88680b = mo97950p();
        aVar.f88682d = mo97949o().getAuthorUid();
        aVar.f88681c = mo97949o().getAid();
        aVar.f88671P = C60261d.m109911a(list);
        aVar.f88672Q = Integer.valueOf(list.size());
        aVar.f88683e = mo97949o().getRequestId();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().f137247b.f137258b));
        }
        aVar.f88673R = m109877b(arrayList);
        a.logCommerceEvents("rd_tiktokec_video_anchor_data_get", aVar);
    }

    /* renamed from: c */
    private final void m109879c(List<String> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = list.iterator();
        while (true) {
            T t = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Iterator<T> it2 = this.f137337j.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next2 = it2.next();
                if (C89219l.m154714a((Object) String.valueOf(next2.f137247b.f137258b), (Object) next)) {
                    t = next2;
                    break;
                }
            }
            T t2 = t;
            if (t2 != null) {
                Integer num = t2.f137247b.f137271o;
                int i = 2;
                if (num != null) {
                    if (num.intValue() != 1) {
                        if (num.intValue() == 2) {
                            i = 1;
                        }
                    }
                    linkedHashMap.put(next, new EnterContext(Integer.valueOf(i), mo97949o().getGroupId()));
                }
                i = 0;
                linkedHashMap.put(next, new EnterContext(Integer.valueOf(i), mo97949o().getGroupId()));
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Integer reqType = ((EnterContext) entry.getValue()).getReqType();
            if (reqType != null) {
                m109876a(list, reqType);
                AnchorApi.m68691a(new GetItemProductInfoRequest(list, mo97949o().getAuthorUid(), linkedHashMap)).mo5534a(new C60262e(this, SystemClock.elapsedRealtime(), list, linkedHashMap), C1731i.f5564c, null);
                return;
            }
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @AbstractC90264r
    public final void onEvent(C40563b bVar) {
        Integer num;
        String str;
        String str2;
        C60215m mVar;
        C60215m mVar2;
        C60215m mVar3;
        String str3 = "";
        C89219l.m154721d(bVar, str3);
        C60211k kVar = this.f137338k;
        if (kVar != null) {
            AbstractC60200b a = mo97864a();
            String c = a.mo97884c();
            Aweme b = a.mo97883b();
            C33744d dVar = this.f137339l;
            if (dVar == null) {
                dVar = new C33744d();
            }
            C89219l.m154716b(dVar, str3);
            C33744d a2 = m109873a(dVar, kVar).mo59983a("enter_from", c).mo59983a("anchor_entry", kVar.f137248c);
            String authorUid = b.getAuthorUid();
            if (authorUid == null) {
                authorUid = str3;
            }
            C33744d a3 = a2.mo59983a("author_id", authorUid);
            String aid = b.getAid();
            if (aid == null) {
                aid = str3;
            }
            C39162r.m79460a("multi_anchor_stay_time", a3.mo59983a("group_id", aid).mo59983a("duration", String.valueOf(bVar.f94910a)).mo59983a("music_id", C59208ac.m108770d(b)).f79943a);
            ICommerceService a4 = C37533a.m75656a();
            C37534a aVar = new C37534a();
            String p = mo97950p();
            if (p != null) {
                str3 = p;
            }
            aVar.f88680b = str3;
            aVar.f88682d = mo97949o().getAuthorUid();
            aVar.f88681c = mo97949o().getAid();
            aVar.f88695q = mo97872b().mo97901b();
            aVar.f88696r = String.valueOf(bVar.f94910a);
            C60211k kVar2 = this.f137338k;
            String str4 = null;
            if (kVar2 == null || (mVar3 = kVar2.f137247b) == null) {
                num = null;
            } else {
                num = mVar3.f137265i;
            }
            aVar.f88703y = String.valueOf(num);
            C60211k kVar3 = this.f137338k;
            if (kVar3 == null || (mVar2 = kVar3.f137247b) == null) {
                str = null;
            } else {
                str = mVar2.f137268l;
            }
            aVar.f88701w = str;
            C60211k kVar4 = this.f137338k;
            if (!(kVar4 == null || (mVar = kVar4.f137247b) == null)) {
                str4 = mVar.f137267k;
            }
            aVar.f88702x = str4;
            aVar.f88699u = "video";
            aVar.f88700v = "video_cart_tag";
            aVar.f88664I = C34500b.m70485a(mo97949o());
            if (mo97864a().mo97882a()) {
                str2 = "video_single_anchor";
            } else {
                str2 = "video_multi_anchor";
            }
            aVar.f88662G = str2;
            aVar.f88663H = "video";
            a4.logCommerceEvents("product_stay_time", aVar);
        }
        EventBus.m156962a().mo145395b(this);
    }

    /* renamed from: d */
    private final void m109880d(boolean z) {
        String str;
        Map<String, String> map;
        Map<String, String> map2;
        Integer num;
        String str2;
        C60215m mVar;
        C60215m mVar2;
        C60215m mVar3;
        Integer num2;
        if (z) {
            C33744d dVar = this.f137339l;
            if (dVar != null) {
                AbstractC60267o.m109921a(this, dVar, false, false, 2);
            }
            this.f137339l = this.f137339l;
        }
        C60211k kVar = this.f137338k;
        if (kVar != null) {
            if (z && mo97949o().isAd()) {
                C18129a.m33746a("anchor_detail", "otherclick", mo97949o().getAwemeRawAd()).mo28900b("refer", "shop_anchor").mo28901b();
            }
            String a = C60212l.m109763a(mo97949o(), z);
            String str3 = "video_single_anchor";
            if (a == null) {
                if (mo97864a().mo97882a()) {
                    a = str3;
                } else {
                    a = "video_multi_anchor";
                }
            }
            if (C80538hl.m139614a(kVar.f137247b.f137266j)) {
                Integer num3 = kVar.f137250e;
                int type = EnumC31359ab.ANCHOR_SHOP_WINDOW.getTYPE();
                if (num3 != null && num3.intValue() == type && (num2 = kVar.f137247b.f137265i) != null && num2.intValue() == 100) {
                    C60212l.m109767a(mo97952r(), kVar, mo97949o(), mo97864a().mo97884c(), a, z);
                } else {
                    SmartRouter.buildRoute(mo97952r(), C60212l.m109764a(kVar, mo97949o(), mo97864a().mo97884c(), a, z)).open();
                }
            } else {
                Integer num4 = kVar.f137250e;
                int type2 = EnumC31359ab.ANCHOR_SHOP_WINDOW.getTYPE();
                String str4 = null;
                String str5 = "";
                if (num4 != null && num4.intValue() == type2) {
                    str = kVar.f137247b.f137269m;
                    String str6 = kVar.f137247b.f137269m;
                    if (str6 == null) {
                        str6 = str5;
                    }
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).openAdWebUrl(mo97952r(), str6, str5);
                    EventBus.m156966a(EventBus.m156962a(), this);
                    Activity r = mo97952r();
                    AbstractC60200b a2 = mo97864a();
                    if (r instanceof AbstractC1204m) {
                        ((AbstractC1204m) r).getLifecycle().mo4012a(new ShopWindowAnchorMaker$whenShopWindowAnchorClicked$1());
                    }
                    C33744d dVar2 = new C33744d();
                    C89219l.m154716b(dVar2, str5);
                    C33744d a3 = m109873a(dVar2, kVar);
                    C33744d dVar3 = this.f137339l;
                    if (dVar3 == null || (map = dVar3.f79943a) == null) {
                        map = C89041ag.m154415a();
                    }
                    C33744d a4 = a3.mo59985a(new HashMap<>(map)).mo59983a("enter_from", a2.mo97884c()).mo59983a("anchor_entry", kVar.f137248c);
                    String authorUid = a2.mo97883b().getAuthorUid();
                    if (authorUid == null) {
                        authorUid = str5;
                    }
                    C33744d a5 = a4.mo59983a("author_id", authorUid);
                    String aid = a2.mo97883b().getAid();
                    if (aid == null) {
                        aid = str5;
                    }
                    C39162r.m79460a("enter_multi_anchor_detail", a5.mo59983a("group_id", aid).mo59983a("music_id", C59208ac.m108770d(a2.mo97883b())).mo59983a("click_type", "webview").f79943a);
                    C33744d dVar4 = this.f137339l;
                    if (dVar4 == null) {
                        C33744d dVar5 = new C33744d();
                        C89219l.m154716b(dVar5, str5);
                        dVar4 = m109873a(dVar5, kVar);
                    }
                    C33744d a6 = dVar4.mo59983a("enter_from", a2.mo97884c()).mo59983a("anchor_entry", kVar.f137248c);
                    String authorUid2 = a2.mo97883b().getAuthorUid();
                    if (authorUid2 == null) {
                        authorUid2 = str5;
                    }
                    C33744d a7 = a6.mo59983a("author_id", authorUid2);
                    String aid2 = a2.mo97883b().getAid();
                    if (aid2 == null) {
                        aid2 = str5;
                    }
                    C39162r.m79460a("multi_anchor_entrance_click", a7.mo59983a("group_id", aid2).mo59983a("music_id", C59208ac.m108770d(a2.mo97883b())).f79943a);
                } else {
                    str = null;
                }
                Integer num5 = kVar.f137250e;
                int type3 = EnumC31359ab.ANCHOR_SHOP_LINK.getTYPE();
                if (num5 != null && num5.intValue() == type3) {
                    str = kVar.f137253h;
                    MainServiceImpl.createIMainServicebyMonsterPlugin(false).openAdWebUrl(mo97952r(), kVar.f137253h, str5);
                    EventBus.m156966a(EventBus.m156962a(), this);
                    Activity r2 = mo97952r();
                    AbstractC60200b a8 = mo97864a();
                    if (r2 instanceof AbstractC1204m) {
                        ((AbstractC1204m) r2).getLifecycle().mo4012a(new ShopWindowAnchorMaker$whenShopLinkAnchorClicked$1());
                    }
                    C33744d dVar6 = new C33744d();
                    C89219l.m154716b(dVar6, str5);
                    C33744d a9 = m109873a(dVar6, kVar);
                    C33744d dVar7 = this.f137339l;
                    if (dVar7 == null || (map2 = dVar7.f79943a) == null) {
                        map2 = C89041ag.m154415a();
                    }
                    C33744d a10 = a9.mo59985a(new HashMap<>(map2)).mo59983a("enter_from", a8.mo97884c()).mo59983a("anchor_entry", kVar.f137248c);
                    String authorUid3 = a8.mo97883b().getAuthorUid();
                    if (authorUid3 == null) {
                        authorUid3 = str5;
                    }
                    C33744d a11 = a10.mo59983a("author_id", authorUid3);
                    String aid3 = a8.mo97883b().getAid();
                    if (aid3 == null) {
                        aid3 = str5;
                    }
                    C39162r.m79460a("enter_multi_anchor_detail", a11.mo59983a("group_id", aid3).mo59983a("music_id", C59208ac.m108770d(a8.mo97883b())).mo59983a("click_type", "webview").f79943a);
                    C33744d dVar8 = this.f137339l;
                    if (dVar8 == null) {
                        C33744d dVar9 = new C33744d();
                        C89219l.m154716b(dVar9, str5);
                        dVar8 = m109873a(dVar9, kVar);
                    }
                    C33744d a12 = dVar8.mo59983a("enter_from", a8.mo97884c()).mo59983a("anchor_entry", kVar.f137248c);
                    String authorUid4 = a8.mo97883b().getAuthorUid();
                    if (authorUid4 == null) {
                        authorUid4 = str5;
                    }
                    C33744d a13 = a12.mo59983a("author_id", authorUid4);
                    String aid4 = a8.mo97883b().getAid();
                    if (aid4 == null) {
                        aid4 = str5;
                    }
                    C39162r.m79460a("multi_anchor_entrance_click", a13.mo59983a("group_id", aid4).mo59983a("music_id", C59208ac.m108770d(a8.mo97883b())).f79943a);
                }
                ECommerceService.createIECommerceServicebyMonsterPlugin(false).showThirdpartyDisclaimerTips(mo97952r(), str);
                ICommerceService a14 = C37533a.m75656a();
                C37534a aVar = new C37534a();
                String p = mo97950p();
                if (p != null) {
                    str5 = p;
                }
                aVar.f88680b = str5;
                aVar.f88682d = mo97949o().getAuthorUid();
                aVar.f88681c = mo97949o().getAid();
                aVar.f88695q = mo97872b().mo97901b();
                aVar.f88699u = "video";
                aVar.f88700v = "video_cart_tag";
                C60211k kVar2 = this.f137338k;
                if (kVar2 == null || (mVar3 = kVar2.f137247b) == null) {
                    num = null;
                } else {
                    num = mVar3.f137265i;
                }
                aVar.f88703y = String.valueOf(num);
                C60211k kVar3 = this.f137338k;
                if (kVar3 == null || (mVar2 = kVar3.f137247b) == null) {
                    str2 = null;
                } else {
                    str2 = mVar2.f137268l;
                }
                aVar.f88701w = str2;
                C60211k kVar4 = this.f137338k;
                if (!(kVar4 == null || (mVar = kVar4.f137247b) == null)) {
                    str4 = mVar.f137267k;
                }
                aVar.f88702x = str4;
                aVar.f88664I = C34500b.m70485a(mo97949o());
                if (!mo97864a().mo97882a()) {
                    str3 = "video_multi_anchor";
                }
                aVar.f88662G = str3;
                aVar.f88663H = "video";
                a14.logCommerceEvents("enter_product_detail", aVar);
            }
        }
    }

    /* renamed from: a */
    public final String mo97937a(boolean z) {
        String str;
        boolean z2;
        String str2 = "";
        for (C60211k kVar : this.f137337j) {
            try {
                str = new JSONObject(kVar.f137252g).optString("anchor_id");
            } catch (Exception unused) {
                C60211k kVar2 = this.f137338k;
                if (kVar2 != null) {
                    str = kVar2.f137249d;
                } else {
                    str = null;
                }
                if (str == null) {
                    str = "";
                }
            }
            C89219l.m154716b(str, "");
            if (str.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                str2 = str2 + str + ',';
                continue;
            }
            if (z) {
                break;
            }
        }
        return C89361p.m154913b(str2, (CharSequence) ",");
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97891b(C33744d dVar) {
        String str;
        Integer num;
        String str2;
        String str3;
        String str4;
        Integer num2;
        Integer num3;
        String str5;
        String str6;
        Long l;
        Integer num4;
        String str7;
        C60215m mVar;
        C60215m mVar2;
        C60215m mVar3;
        C60215m mVar4;
        C60215m mVar5;
        C60215m mVar6;
        C60215m mVar7;
        String str8 = "";
        C89219l.m154721d(dVar, str8);
        super.mo97891b(dVar);
        int i = 0;
        String str9 = null;
        if (!m109881n()) {
            Activity e = mo97864a().mo97886e();
            if (this.f137335e == null && (e instanceof ActivityC0945e)) {
                ActivityC0945e eVar = (ActivityC0945e) e;
                C89219l.m154721d(eVar, str8);
                AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(ShopWindowAnchorViewModel.class);
                C89219l.m154716b(a, str8);
                this.f137335e = (ShopWindowAnchorViewModel) a;
            }
            List<String> a2 = m109874a(1);
            if (a2.size() > 0) {
                this.f137340m = 2;
                m109879c(a2);
            }
        }
        Iterator<C60211k> it = this.f137337j.iterator();
        while (true) {
            str = "video_single_anchor";
            if (!it.hasNext()) {
                break;
            }
            C60211k next = it.next();
            if (C11279p.m20012a(next.f137247b.f137270n) && C80537hk.m139613a(next.f137247b.f137266j)) {
                Aweme o = mo97949o();
                String c = mo97864a().mo97884c();
                if (!mo97864a().mo97882a()) {
                    str = "video_multi_anchor";
                }
                String a3 = C60212l.m109764a(next, o, c, str, true);
                if (a3 != null) {
                    ECommerceService.createIECommerceServicebyMonsterPlugin(false).prefetchPdp(a3, mo97952r(), 2, new C60264g(this, next));
                }
            }
        }
        ICommerceService a4 = C37533a.m75656a();
        C37534a aVar = new C37534a();
        String p = mo97950p();
        if (p == null) {
            p = str8;
        }
        aVar.f88680b = p;
        aVar.f88682d = mo97949o().getAuthorUid();
        aVar.f88681c = mo97949o().getAid();
        aVar.f88695q = mo97872b().mo97901b();
        aVar.f88699u = "video";
        aVar.f88700v = "video_cart_tag";
        C60211k kVar = this.f137338k;
        if (kVar == null || (mVar7 = kVar.f137247b) == null) {
            num = null;
        } else {
            num = mVar7.f137265i;
        }
        aVar.f88703y = String.valueOf(num);
        C60211k kVar2 = this.f137338k;
        if (kVar2 == null || (mVar6 = kVar2.f137247b) == null) {
            str2 = null;
        } else {
            str2 = mVar6.f137268l;
        }
        aVar.f88701w = str2;
        C60211k kVar3 = this.f137338k;
        if (kVar3 == null || (mVar5 = kVar3.f137247b) == null) {
            str3 = null;
        } else {
            str3 = mVar5.f137267k;
        }
        aVar.f88702x = str3;
        aVar.f88664I = C34500b.m70485a(mo97949o());
        if (mo97864a().mo97882a()) {
            str4 = str;
        } else {
            str4 = "video_multi_anchor";
        }
        aVar.f88662G = str4;
        aVar.f88663H = "video";
        if (mo97949o().isAd()) {
            num2 = 1;
        } else {
            num2 = 0;
        }
        aVar.f88660E = num2;
        a4.logCommerceEvents("product_anchor_show", aVar);
        ICommerceService a5 = C37533a.m75656a();
        C37534a aVar2 = new C37534a();
        aVar2.f88658C = "TEMAI";
        aVar2.f88681c = mo97949o().getAid();
        aVar2.f88682d = mo97949o().getAuthorUid();
        aVar2.f88683e = mo97949o().getRequestId();
        String p2 = mo97950p();
        if (p2 == null) {
            p2 = str8;
        }
        aVar2.f88680b = p2;
        aVar2.f88700v = "video_cart_tag";
        C60211k kVar4 = (C60211k) C89070n.m154583g((List) this.f137337j);
        if (kVar4 == null || (mVar4 = kVar4.f137247b) == null) {
            num3 = null;
        } else {
            num3 = mVar4.f137265i;
        }
        aVar2.f88703y = String.valueOf(num3);
        C60211k kVar5 = (C60211k) C89070n.m154583g((List) this.f137337j);
        if (kVar5 == null || (mVar3 = kVar5.f137247b) == null) {
            str5 = null;
        } else {
            str5 = mVar3.f137267k;
        }
        aVar2.f88702x = str5;
        C60211k kVar6 = (C60211k) C89070n.m154583g((List) this.f137337j);
        if (kVar6 == null || (mVar2 = kVar6.f137247b) == null) {
            str6 = null;
        } else {
            str6 = mVar2.f137268l;
        }
        aVar2.f88701w = str6;
        C60211k kVar7 = (C60211k) C89070n.m154583g((List) this.f137337j);
        if (kVar7 == null || (mVar = kVar7.f137247b) == null) {
            l = null;
        } else {
            l = mVar.f137258b;
        }
        aVar2.f88704z = String.valueOf(l);
        String authorUid = mo97949o().getAuthorUid();
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        C89219l.m154716b(createIUserServicebyMonsterPlugin, str8);
        if (C89219l.m154714a((Object) authorUid, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
            num4 = 1;
        } else {
            num4 = 0;
        }
        aVar2.f88656A = num4;
        if (mo97864a().mo97882a()) {
            str7 = "yes";
        } else {
            str7 = "no";
        }
        aVar2.f88657B = str7;
        if (mo97949o().isAd()) {
            i = 1;
        }
        aVar2.f88660E = i;
        if (mo97949o().isAd()) {
            str9 = mo97949o().getAwemeRawAdIdStr();
        }
        aVar2.f88661F = str9;
        aVar2.f88664I = C34500b.m70485a(mo97949o());
        if (!mo97864a().mo97882a()) {
            str = "video_multi_anchor";
        }
        aVar2.f88662G = str;
        aVar2.f88663H = "video";
        aVar2.f88679a = C60212l.m109766a(mo97949o(), "tiktok_video_anchor_view", aVar2.f88680b);
        if (C33496a.m68619a() && mo97864a().mo97882a()) {
            str8 = "SHOP NOW";
        }
        aVar2.f88665J = str8;
        a5.logCommerceEvents("tiktok_video_anchor_view", aVar2);
        if (mo97949o().isAd()) {
            C18129a.m33746a("draw_ad", "othershow", mo97949o().getAwemeRawAd()).mo28900b("refer", "shop_anchor").mo28901b();
        }
    }

    /* renamed from: c */
    public final String mo97940c(boolean z) {
        String str;
        Integer num;
        Iterator<C60211k> it = this.f137337j.iterator();
        String str2 = "";
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            boolean z2 = true;
            try {
                str = new JSONObject(it.next().f137252g).optString("anchor_type");
                C89219l.m154716b(str, "");
            } catch (Exception unused) {
                C60211k kVar = this.f137338k;
                Integer num2 = null;
                if (kVar != null) {
                    num = kVar.f137251f;
                } else {
                    num = null;
                }
                if (num == null || num.intValue() != 1) {
                    C60211k kVar2 = this.f137338k;
                    if (kVar2 != null) {
                        num2 = kVar2.f137251f;
                    }
                    if (num2 == null || num2.intValue() != 0) {
                        str = "";
                    }
                }
                str = "shopify";
            }
            if (str.length() <= 0) {
                z2 = false;
            }
            if (z2) {
                if (z) {
                    str2 = str2 + str;
                    break;
                }
                str2 = str2 + str + ',';
            }
        }
        return C89361p.m154913b(str2, (CharSequence) ",");
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: c */
    public final void mo97892c(C33744d dVar) {
        Integer num;
        String str;
        String str2;
        Long l;
        Integer num2;
        String str3;
        String str4;
        String str5;
        C60215m mVar;
        C60215m mVar2;
        C60215m mVar3;
        C60215m mVar4;
        String str6 = "";
        C89219l.m154721d(dVar, str6);
        super.mo97892c(dVar);
        int i = 1;
        String str7 = null;
        if (!m109881n()) {
            List<String> a = m109874a(2);
            if (a.size() > 0) {
                this.f137340m = 2;
                m109879c(a);
            }
        }
        ICommerceService a2 = C37533a.m75656a();
        C37534a aVar = new C37534a();
        aVar.f88658C = "TEMAI";
        aVar.f88681c = mo97949o().getAid();
        aVar.f88682d = mo97949o().getAuthorUid();
        aVar.f88683e = mo97949o().getRequestId();
        String p = mo97950p();
        if (p == null) {
            p = str6;
        }
        aVar.f88680b = p;
        aVar.f88700v = "video_cart_tag";
        C60211k kVar = (C60211k) C89070n.m154583g((List) this.f137337j);
        if (kVar == null || (mVar4 = kVar.f137247b) == null) {
            num = null;
        } else {
            num = mVar4.f137265i;
        }
        aVar.f88703y = String.valueOf(num);
        C60211k kVar2 = (C60211k) C89070n.m154583g((List) this.f137337j);
        if (kVar2 == null || (mVar3 = kVar2.f137247b) == null) {
            str = null;
        } else {
            str = mVar3.f137267k;
        }
        aVar.f88702x = str;
        C60211k kVar3 = (C60211k) C89070n.m154583g((List) this.f137337j);
        if (kVar3 == null || (mVar2 = kVar3.f137247b) == null) {
            str2 = null;
        } else {
            str2 = mVar2.f137268l;
        }
        aVar.f88701w = str2;
        C60211k kVar4 = (C60211k) C89070n.m154583g((List) this.f137337j);
        if (kVar4 == null || (mVar = kVar4.f137247b) == null) {
            l = null;
        } else {
            l = mVar.f137258b;
        }
        aVar.f88704z = String.valueOf(l);
        String authorUid = mo97949o().getAuthorUid();
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        C89219l.m154716b(createIUserServicebyMonsterPlugin, str6);
        if (C89219l.m154714a((Object) authorUid, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
            num2 = 1;
        } else {
            num2 = 0;
        }
        aVar.f88656A = num2;
        if (mo97864a().mo97882a()) {
            str3 = "yes";
        } else {
            str3 = "no";
        }
        aVar.f88657B = str3;
        if (!mo97949o().isAd()) {
            i = 0;
        }
        aVar.f88660E = i;
        if (mo97949o().isAd()) {
            str7 = mo97949o().getAwemeRawAdIdStr();
        }
        aVar.f88661F = str7;
        aVar.f88664I = C34500b.m70485a(mo97949o());
        if (mo97864a().mo97882a()) {
            str4 = "video_single_anchor";
        } else {
            str4 = "video_multi_anchor";
        }
        aVar.f88662G = str4;
        aVar.f88663H = "video";
        aVar.f88679a = C60212l.m109766a(mo97949o(), "tiktok_video_anchor_click", aVar.f88680b);
        if (C33496a.m68619a() && mo97864a().mo97882a()) {
            str6 = "SHOP NOW";
        }
        aVar.f88665J = str6;
        a2.logCommerceEvents("tiktok_video_anchor_click", aVar);
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
    private static C33744d m109873a(C33744d dVar, C60211k kVar) {
        String str = kVar.f137252g;
        if (str.length() > 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                C89219l.m154716b(keys, "");
                while (keys.hasNext()) {
                    String next = keys.next();
                    Object obj = jSONObject.get(next);
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    String str2 = (String) obj;
                    if (str2 != null) {
                        dVar.mo59983a(next, str2);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return dVar;
    }

    /* renamed from: a */
    private final void m109876a(List<String> list, Integer num) {
        ICommerceService a = C37533a.m75656a();
        C37534a aVar = new C37534a();
        aVar.f88658C = "TEMAI";
        aVar.f88680b = mo97950p();
        aVar.f88682d = mo97949o().getAuthorUid();
        aVar.f88681c = mo97949o().getAid();
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        aVar.f88673R = m109877b(arrayList);
        aVar.f88674S = num;
        a.logCommerceEvents("rd_tiktokec_video_shopping_list_request_send", aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.AbstractC60189a
    /* renamed from: a */
    public final void mo97865a(Activity activity, Dialog dialog) {
        String str;
        String str2;
        int i;
        int i2;
        C89219l.m154721d(activity, "");
        C89219l.m154721d(dialog, "");
        if (C89219l.m154714a((Object) mo97952r().getLocalClassName(), (Object) activity.getLocalClassName()) && !m109881n()) {
            long j = -1;
            if (this.f137359i != -1) {
                j = this.f137359i;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - j;
            if (ActivityStack.isAppBackGround()) {
                str = "close";
            } else if (dialog.isShowing()) {
                str = "next";
            } else {
                str = "return";
            }
            C60311c cVar = this.f137334d;
            if (cVar != null) {
                String a = C60212l.m109763a(cVar.f137449e.mo97883b(), cVar.f137453i);
                if (a == null) {
                    a = "video_multi_anchor";
                }
                ICommerceService a2 = C37533a.m75656a();
                C37534a aVar = new C37534a();
                aVar.f88658C = "TEMAI";
                aVar.f88681c = cVar.f137449e.mo97883b().getAid();
                aVar.f88666K = "video_shopping_list";
                if (cVar.f137449e.mo97883b().isAd()) {
                    str2 = cVar.f137449e.mo97883b().getAwemeRawAdIdStr();
                } else {
                    str2 = null;
                }
                aVar.f88661F = str2;
                aVar.f88667L = "video_multi_anchor";
                if (cVar.f137449e.mo97883b().isAd()) {
                    i = 1;
                } else {
                    i = 0;
                }
                aVar.f88660E = i;
                aVar.f88682d = cVar.f137449e.mo97883b().getAuthorUid();
                String c = cVar.f137449e.mo97884c();
                if (c == null) {
                    c = "";
                }
                aVar.f88680b = c;
                String authorUid = cVar.f137449e.mo97883b().getAuthorUid();
                IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
                C89219l.m154716b(createIUserServicebyMonsterPlugin, "");
                if (C89219l.m154714a((Object) authorUid, (Object) createIUserServicebyMonsterPlugin.getCurrentUserID())) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                aVar.f88656A = i2;
                aVar.f88664I = C34500b.m70485a(cVar.f137449e.mo97883b());
                aVar.f88662G = a;
                aVar.f88663H = "video";
                aVar.f88668M = Integer.valueOf((int) elapsedRealtime);
                aVar.f88669N = Integer.valueOf(cVar.f137445a);
                aVar.f88670O = str;
                a2.logCommerceEvents("tiktokec_shopping_list_staytime", aVar);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.AbstractC60189a
    /* renamed from: a */
    public final void mo97866a(ViewGroup viewGroup, Dialog dialog, C33744d dVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(dialog, "");
        C89219l.m154721d(dVar, "");
        m109875a(viewGroup, dVar, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97890b(ViewGroup viewGroup, Dialog dialog, C33744d dVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(dialog, "");
        C89219l.m154721d(dVar, "");
        m109875a(viewGroup, dVar, true);
    }

    /* renamed from: a */
    private final void m109875a(ViewGroup viewGroup, C33744d dVar, boolean z) {
        C1213t<Map<String, String>> tVar;
        ShopWindowAnchorViewModel shopWindowAnchorViewModel;
        C1213t<Map<String, String>> tVar2;
        ShopWindowAnchorViewModel shopWindowAnchorViewModel2;
        C1213t<Map<String, String>> tVar3;
        MethodCollector.m26663i(10105);
        if (this.f137358h != null) {
            if (!(this.f137334d == null || (shopWindowAnchorViewModel = this.f137335e) == null || (tVar2 = shopWindowAnchorViewModel.f137483a) == null || !tVar2.hasObservers() || (shopWindowAnchorViewModel2 = this.f137335e) == null || (tVar3 = shopWindowAnchorViewModel2.f137483a) == null)) {
                C60311c cVar = this.f137334d;
                if (cVar == null) {
                    C89219l.m154715b();
                }
                tVar3.removeObserver(cVar);
            }
            AbstractC60200b a = mo97864a();
            Context context = viewGroup.getContext();
            C89219l.m154716b(context, "");
            this.f137334d = new C60311c(a, context, this.f137337j, dVar, z, this.f137340m);
            ShopWindowAnchorViewModel shopWindowAnchorViewModel3 = this.f137335e;
            if (!(shopWindowAnchorViewModel3 == null || (tVar = shopWindowAnchorViewModel3.f137483a) == null)) {
                C60311c cVar2 = this.f137334d;
                if (cVar2 == null) {
                    C89219l.m154715b();
                }
                tVar.observeForever(cVar2);
            }
            C60311c cVar3 = this.f137334d;
            if (cVar3 == null) {
                C89219l.m154715b();
            }
            viewGroup.addView(cVar3.mo97980a(), -1, -2);
        }
        MethodCollector.m26664o(10105);
    }
}
