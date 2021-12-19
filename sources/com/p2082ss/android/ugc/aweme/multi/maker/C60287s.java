package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.EnumC31359ab;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.commercialize.p2535b.C37624c;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.feed.model.WikipediaExtra;
import com.p2082ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.EnumC60206g;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.s */
public final class C60287s extends AbstractC60267o {
    static {
        Covode.recordClassIndex(70819);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60287s();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: k */
    public final int mo97924k() {
        return EnumC31359ab.WIKIPEDIA.getTYPE();
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        mo97945a(new C60288a(this, dVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97891b(C33744d dVar) {
        String str;
        C89219l.m154721d(dVar, "");
        String optString = mo97953s().optString("request_id");
        if (optString == null) {
            optString = "";
        }
        String e = C59208ac.m108771e(mo97949o());
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(optString);
        C39163s a = new C39163s().mo67941a("log_pb", C48027ac.C48028a.f111257a.mo80054a(logPbBean));
        Aweme o = mo97949o();
        if (o != null) {
            str = o.getAuthorUid();
        } else {
            str = null;
        }
        C39163s a2 = a.mo67941a("author_id", str).mo67941a("group_id", e).mo67941a("impr_type", C59208ac.m108776j(mo97949o()));
        String p = mo97950p();
        if (p == null) {
            p = "";
        }
        JSONObject a3 = a2.mo67941a("enter_from", p).mo67942a();
        C89219l.m154716b(a3, "");
        C39162r.m79460a("multi_anchor_entrance_show", m109920a(dVar, a3).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.s$a */
    static final class C60288a extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60287s f137389a;

        /* renamed from: b */
        final /* synthetic */ C33744d f137390b;

        static {
            Covode.recordClassIndex(70820);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60288a(C60287s sVar, C33744d dVar) {
            super(1);
            this.f137389a = sVar;
            this.f137390b = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AnchorCommonStruct anchorCommonStruct) {
            String str;
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            C89219l.m154721d(anchorCommonStruct2, "");
            WikipediaInfo wikipediaInfo = new WikipediaInfo();
            wikipediaInfo.setKeyword(anchorCommonStruct2.getKeyword());
            wikipediaInfo.setLang(anchorCommonStruct2.getLanguage());
            wikipediaInfo.setExtra((WikipediaExtra) new C27910f().mo46670a(anchorCommonStruct2.getExtra(), WikipediaExtra.class));
            wikipediaInfo.setAnchorId(anchorCommonStruct2.getId());
            AbstractC60267o.m109921a(this.f137389a, this.f137390b, false, false, 6);
            Activity r = this.f137389a.mo97952r();
            C60287s sVar = this.f137389a;
            HashMap hashMap = new HashMap();
            hashMap.put("close", "false");
            hashMap.put("back", "true");
            hashMap.put("hide_nav_bar", "false");
            String authorUid = sVar.mo97949o().getAuthorUid();
            if (authorUid == null) {
                authorUid = "";
            }
            hashMap.put("author_id", authorUid);
            String aid = sVar.mo97949o().getAid();
            if (aid == null) {
                aid = "";
            }
            hashMap.put("group_id", aid);
            hashMap.put("enter_from", sVar.mo97950p());
            AnchorCommonStruct anchorCommonStruct3 = sVar.f137358h;
            if (anchorCommonStruct3 == null || (str = anchorCommonStruct3.getId()) == null) {
                str = "";
            }
            hashMap.put("anchor_id", str);
            Map<String, String> map = this.f137390b.f79943a;
            C89219l.m154716b(map, "");
            C37624c.m75876a(r, wikipediaInfo, hashMap, map);
            return C89391z.f203057a;
        }
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
                if (t2.getType() == EnumC31359ab.WIKIPEDIA.getTYPE()) {
                    if (wikipediaExtra != null) {
                        Integer status = wikipediaExtra.getStatus();
                        if (status != null) {
                            if (status.intValue() == 2) {
                            }
                        }
                    }
                    arrayList.add(t);
                }
            } catch (Exception unused) {
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
}
