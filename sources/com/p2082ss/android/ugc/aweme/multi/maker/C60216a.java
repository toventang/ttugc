package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.google.gson.AbstractC28019l;
import com.google.gson.C27910f;
import com.google.gson.C28022o;
import com.google.gson.C28024q;
import com.google.gson.p2019b.C27895a;
import com.lynx.tasm.EnumC28856r;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.anchor.multi.p2313a.AbstractC33504a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c;
import com.p2082ss.android.ugc.aweme.bullet.C34963b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.crossplatform.p2707b.C40565d;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.C60202d;
import com.p2082ss.android.ugc.aweme.multi.EnumC60206g;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.aweme.utils.C80538hl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89047am;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.a */
public final class C60216a extends AbstractC60267o implements AbstractC90252i, AbstractC90253j {

    /* renamed from: d */
    public static final C60217a f137273d = new C60217a((byte) 0);

    /* renamed from: e */
    private C33744d f137274e;

    /* renamed from: f */
    private boolean f137275f;

    /* renamed from: g */
    private final AbstractC89244h f137276g = C89250i.m154773a((AbstractC89171a) C60219c.f137277a);

    static {
        Covode.recordClassIndex(70748);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(156, new RunnableC90250g(C60216a.class, "onWebViewFinish", C40565d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.a$a */
    public static final class C60217a {
        static {
            Covode.recordClassIndex(70749);
        }

        private C60217a() {
        }

        public /* synthetic */ C60217a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.a$b */
    public static final class C60218b extends C27895a<List<? extends String>> {
        static {
            Covode.recordClassIndex(70750);
        }

        C60218b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.a$d */
    public static final class C60220d extends C27895a<Boolean> {
        static {
            Covode.recordClassIndex(70752);
        }

        C60220d() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60216a();
    }

    /* renamed from: n */
    private final void m109770n() {
        if (m109772v()) {
            AdLandPagePreloadServiceImpl.m68380f().mo59376a().mo59418c(m109771u());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: j */
    public final boolean mo97922j() {
        Integer num;
        Set set = (Set) this.f137276g.getValue();
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct != null) {
            num = Integer.valueOf(anchorCommonStruct.getType());
        } else {
            num = null;
        }
        if (!C89070n.m154556a((Iterable) set, (Object) num)) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.a$c */
    static final class C60219c extends AbstractC89220m implements AbstractC89171a<Set<? extends Integer>> {

        /* renamed from: a */
        public static final C60219c f137277a = new C60219c();

        static {
            Covode.recordClassIndex(70751);
        }

        C60219c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Set<? extends Integer> invoke() {
            return C89047am.m154438a((Object[]) new Integer[]{Integer.valueOf(EnumC31359ab.DUET.getTYPE()), Integer.valueOf(EnumC31359ab.QUIZLET.getTYPE())});
        }
    }

    /* renamed from: u */
    private final List<String> m109771u() {
        String extra;
        String str;
        C28022o oVar;
        AbstractC28019l lVar;
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct == null || (extra = anchorCommonStruct.getExtra()) == null || extra.length() == 0) {
            return null;
        }
        AnchorCommonStruct anchorCommonStruct2 = this.f137358h;
        if (anchorCommonStruct2 != null) {
            str = anchorCommonStruct2.getExtra();
        } else {
            str = null;
        }
        AbstractC28019l a = C28024q.m56139a(str);
        if (a != null) {
            oVar = a.mo46789j();
        } else {
            oVar = null;
        }
        C27910f fVar = new C27910f();
        if (oVar != null) {
            lVar = oVar.mo46803c("gecko_channel");
        } else {
            lVar = null;
        }
        List<String> list = (List) fVar.mo46668a(lVar, new C60218b().type);
        if (!C13603b.m24435a((Collection) list)) {
            return list;
        }
        return null;
    }

    /* renamed from: v */
    private final boolean m109772v() {
        String str;
        String str2;
        C28022o oVar;
        List<String> u;
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        AbstractC28019l lVar = null;
        if (anchorCommonStruct != null) {
            str = anchorCommonStruct.getExtra();
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            return false;
        }
        AnchorCommonStruct anchorCommonStruct2 = this.f137358h;
        if (anchorCommonStruct2 != null) {
            str2 = anchorCommonStruct2.getExtra();
        } else {
            str2 = null;
        }
        AbstractC28019l a = C28024q.m56139a(str2);
        if (a != null) {
            oVar = a.mo46789j();
        } else {
            oVar = null;
        }
        C27910f fVar = new C27910f();
        if (oVar != null) {
            lVar = oVar.mo46803c("is_schema_lynx");
        }
        Boolean bool = (Boolean) fVar.mo46668a(lVar, new C60220d().type);
        if (bool == null || !bool.booleanValue() || (u = m109771u()) == null || u.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97891b(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        this.f137275f = true;
        m109770n();
        super.mo97891b(dVar);
    }

    @AbstractC90264r
    public final void onWebViewFinish(C40565d dVar) {
        Map<String, String> map;
        C89219l.m154721d(dVar, "");
        if (mo97922j()) {
            C39162r.m79460a("anchor_stay_time", mo97954t().mo59981a("duration", dVar.f94911a).f79943a);
        }
        C33744d t = mo97954t();
        C33744d dVar2 = this.f137274e;
        if (dVar2 == null || (map = dVar2.f79943a) == null) {
            map = C89041ag.m154415a();
        }
        C39162r.m79460a("multi_anchor_stay_time", t.mo59985a(new HashMap<>(map)).mo59981a("duration", dVar.f94911a).f79943a);
        EventBus.m156962a().mo145395b(this);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: a */
    public final EnumC60206g mo97888a(List<AnchorCommonStruct> list) {
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        String str = "";
        boolean z = false;
        for (T t : list) {
            T t2 = t;
            try {
                WikipediaExtra wikipediaExtra = (WikipediaExtra) new C27910f().mo46670a(t2.getExtra(), WikipediaExtra.class);
                Integer num = null;
                if (wikipediaExtra != null) {
                    num = wikipediaExtra.getStatus();
                }
                if (num != null) {
                    if (num.intValue() == 2) {
                        String authorUid = mo97949o().getAuthorUid();
                        IAccountUserService g = C31575b.m65865g();
                        C89219l.m154716b(g, "");
                        if (TextUtils.equals(authorUid, g.getCurUserId()) && !mo97946a(t2.getId())) {
                            mo97947b(t2.getId());
                            str = wikipediaExtra.getWarningMsg();
                            z = true;
                        }
                    }
                }
                if (C80538hl.m139614a(t2.getSchema()) && C80538hl.m139614a(t2.getKeyword()) && t2.getGeneralType() == 1) {
                    if (wikipediaExtra != null) {
                        Integer status = wikipediaExtra.getStatus();
                        if (status != null) {
                            if (status.intValue() != 2) {
                            }
                        }
                    }
                    arrayList.add(t);
                }
            } catch (Exception unused) {
                if (C80538hl.m139614a(t2.getSchema())) {
                    if (C80538hl.m139614a(t2.getKeyword())) {
                        if (t2.getGeneralType() != 1) {
                        }
                    }
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        if (z) {
            Aweme o = mo97949o();
            if (TextUtils.isEmpty(str)) {
                str = C17867d.m33078a().getString(R.string.hby);
            }
            o.setAnchorWikiOfflineText(str);
        }
        if (arrayList2.size() == 0) {
            return EnumC60206g.NOT_FOUND;
        }
        AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) arrayList2.get(0);
        list.remove(anchorCommonStruct);
        mo97929b(anchorCommonStruct);
        mo97868a(anchorCommonStruct);
        this.f137358h = anchorCommonStruct;
        if (arrayList2.size() == 1) {
            return EnumC60206g.DONE;
        }
        return EnumC60206g.PROCEED;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        String str;
        String str2;
        String str3 = "";
        C89219l.m154721d(dVar, str3);
        if (!this.f137275f) {
            m109770n();
        }
        this.f137274e = dVar;
        Activity e = mo97864a().mo97886e();
        AbstractC60267o.m109921a(this, dVar, false, false, 6);
        if (m109772v()) {
            Bundle bundle = new Bundle();
            AnchorCommonStruct anchorCommonStruct = this.f137358h;
            if (anchorCommonStruct == null || (str = anchorCommonStruct.getSchema()) == null) {
                str = str3;
            }
            bundle.putBoolean("is_lynx_landing_page", true);
            bundle.putBoolean("hide_nav_bar", true);
            bundle.putBoolean("hide_status_bar", false);
            bundle.putBoolean("bundle_nav_bar_status_padding", true);
            bundle.putBoolean("need_bottom_out", true);
            String authorUid = mo97864a().mo97883b().getAuthorUid();
            if (authorUid == null) {
                authorUid = str3;
            }
            bundle.putString("author_id", authorUid);
            String aid = mo97864a().mo97883b().getAid();
            if (aid == null) {
                aid = str3;
            }
            bundle.putString("group_id", aid);
            AnchorCommonStruct anchorCommonStruct2 = this.f137358h;
            if (anchorCommonStruct2 == null || (str2 = anchorCommonStruct2.getId()) == null) {
                str2 = str3;
            }
            bundle.putString("anchor_id", str2);
            Map<String, String> f = mo97948f(dVar);
            Objects.requireNonNull(f, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            bundle.putSerializable("anchor_event_map", (HashMap) f);
            Uri parse = Uri.parse(str);
            C89219l.m154716b(parse, str3);
            if (parse.isHierarchical()) {
                bundle.putString("bundle_origin_url", parse.getQueryParameter("fallback_url"));
                if (TextUtils.equals(parse.getQueryParameter("async_layout"), "1")) {
                    bundle.putBoolean("preset_safe_point", true);
                    bundle.putInt("thread_strategy", EnumC28856r.PART_ON_LAYOUT.mo49985id());
                }
            }
            Uri.Builder buildUpon = parse.buildUpon();
            C28022o oVar = new C28022o();
            oVar.mo46800a("isRTL", Integer.valueOf(C80471gb.m139483a(mo97952r()) ? 1 : 0));
            oVar.mo46800a("topSafeAreaHeight", Integer.valueOf(C80534hh.m139609b()));
            buildUpon.appendQueryParameter("lynx_landing_page_data", oVar.toString());
            String builder = buildUpon.toString();
            C89219l.m154716b(builder, str3);
            C34963b.m71413a(e, builder, null, bundle);
            return;
        }
        AnchorCommonStruct anchorCommonStruct3 = this.f137358h;
        if (anchorCommonStruct3 != null) {
            EventBus.m156966a(EventBus.m156962a(), this);
            SmartRoute buildRoute = SmartRouter.buildRoute(e, anchorCommonStruct3.getSchema());
            Map<String, String> f2 = mo97948f(dVar);
            Objects.requireNonNull(f2, "null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
            SmartRoute withParam = buildRoute.withParam("anchor_event_map", (HashMap) f2);
            String authorUid2 = mo97864a().mo97883b().getAuthorUid();
            if (authorUid2 == null) {
                authorUid2 = str3;
            }
            SmartRoute withParam2 = withParam.withParam("author_id", authorUid2);
            String aid2 = mo97864a().mo97883b().getAid();
            if (aid2 != null) {
                str3 = aid2;
            }
            withParam2.withParam("group_id", str3).withParam("anchor_id", anchorCommonStruct3.getId()).open();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.AbstractC60189a
    /* renamed from: a */
    public final void mo97871a(C60202d dVar, AbstractC34673c cVar, AbstractC33504a aVar) {
        C89219l.m154721d(dVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(aVar, "");
        if (!this.f137275f) {
            m109770n();
        }
    }
}
