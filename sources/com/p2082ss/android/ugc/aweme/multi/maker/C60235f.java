package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.EnumC60206g;
import com.p2082ss.android.ugc.aweme.multi.p3462ui.ToolsAnchorItem;
import com.p2082ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.f */
public final class C60235f extends AbstractC60267o {

    /* renamed from: d */
    public AnchorPanelAction f137291d;

    static {
        Covode.recordClassIndex(70767);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: l */
    public final String mo97925l() {
        return "app_page";
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60231e();
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.f$a */
    static final class C60236a extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60235f f137292a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f137293b;

        /* renamed from: c */
        final /* synthetic */ C33744d f137294c;

        static {
            Covode.recordClassIndex(70768);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60236a(C60235f fVar, ViewGroup viewGroup, C33744d dVar) {
            super(1);
            this.f137292a = fVar;
            this.f137293b = viewGroup;
            this.f137294c = dVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.maker.f$a$b */
        static final class C60238b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C60236a f137297a;

            /* renamed from: b */
            final /* synthetic */ AnchorCommonStruct f137298b;

            static {
                Covode.recordClassIndex(70770);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C60238b(C60236a aVar, AnchorCommonStruct anchorCommonStruct) {
                super(0);
                this.f137297a = aVar;
                this.f137298b = anchorCommonStruct;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                String id;
                String str;
                C60235f fVar = this.f137297a.f137292a;
                AnchorCommonStruct anchorCommonStruct = fVar.f137358h;
                if (!(anchorCommonStruct == null || (id = anchorCommonStruct.getId()) == null)) {
                    if (C37699a.m76218U(fVar.mo97949o())) {
                        C39162r.m79460a("dou_promote_layer_show", new C33744d().mo59983a("enter_from", fVar.mo97950p()).mo59983a("group_id", fVar.mo97949o().getAid()).mo59983a("author_id", fVar.mo97949o().getAuthorUid()).f79943a);
                        new C23144b(fVar.mo97952r()).mo37640e(R.string.o7).mo37637b();
                    } else if (AVExternalServiceImpl.m113114a().publishService().checkIsAlreadyPublished(fVar.mo97952r())) {
                        MovieReuseServiceImpl.m110905a().mo98780a(fVar.mo97952r(), null, id, null, "anchor_combine_mv", "anchor_combine_page");
                        C33744d a = new C33744d().mo59983a("shoot_way", "anchor_combine_mv").mo59983a("enter_from", "anchor_combine_page").mo59983a("mv_id", id).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80054a(new LogPbBean())).mo59983a("group_id", fVar.mo97949o().getAid()).mo59983a("author_id", fVar.mo97949o().getAuthorUid());
                        if (fVar.mo97949o().getUploadMiscInfoStruct().mvType == 1) {
                            str = "jianying_mv";
                        } else {
                            str = "mv";
                        }
                        C39162r.m79460a("shoot", a.mo59983a("content_type", str).f79943a);
                    }
                }
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.maker.f$a$a */
        static final class View$OnClickListenerC60237a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C60236a f137295a;

            /* renamed from: b */
            final /* synthetic */ AnchorCommonStruct f137296b;

            static {
                Covode.recordClassIndex(70769);
            }

            View$OnClickListenerC60237a(C60236a aVar, AnchorCommonStruct anchorCommonStruct) {
                this.f137295a = aVar;
                this.f137296b = anchorCommonStruct;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f137295a.f137292a.mo97893d(this.f137295a.f137294c);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AnchorCommonStruct anchorCommonStruct) {
            UrlModel urlModel;
            MethodCollector.m26663i(11925);
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            String str = "";
            C89219l.m154721d(anchorCommonStruct2, str);
            Context context = this.f137293b.getContext();
            C89219l.m154716b(context, str);
            ToolsAnchorItem a = ToolsAnchorItem.C60301a.m109982a(context);
            UrlModel thumbnail = anchorCommonStruct2.getThumbnail();
            if (thumbnail != null) {
                a.setIcon(thumbnail);
            }
            String keyword = anchorCommonStruct2.getKeyword();
            if (keyword != null) {
                str = keyword;
            }
            a.setTitle(str);
            a.setSubTitle(anchorCommonStruct2.getDescription());
            a.setOnClickListener(new View$OnClickListenerC60237a(this, anchorCommonStruct2));
            AnchorPanelAction anchorPanelAction = this.f137292a.f137291d;
            if (anchorPanelAction != null) {
                urlModel = anchorPanelAction.getIcon();
            } else {
                urlModel = null;
            }
            a.setButtonIcon(urlModel);
            a.setButtonOnClickListener(new C60238b(this, anchorCommonStruct2));
            this.f137293b.addView(a);
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(11925);
            return zVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: c */
    public final void mo97892c(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        C39162r.m79460a("multi_anchor_entrance_click", m109819e(dVar).f79943a);
        C39162r.m79460a("anchor_entrance_click", m109819e(mo97954t()).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97891b(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        C39162r.m79460a("multi_anchor_entrance_show", m109819e(dVar).f79943a);
        C39162r.m79460a("anchor_entrance_show", m109819e(mo97954t()).f79943a);
    }

    /* renamed from: e */
    private final C33744d m109819e(C33744d dVar) {
        String str;
        String str2;
        String str3;
        Aweme o = mo97949o();
        String optString = mo97953s().optString("request_id");
        if (optString == null) {
            optString = "";
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(optString);
        C33744d a = dVar.mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80054a(logPbBean));
        if (o == null || (str = o.getAuthorUid()) == null) {
            str = "";
        }
        C33744d a2 = a.mo59983a("author_id", str);
        if (o == null || (str2 = o.getAid()) == null) {
            str2 = "";
        }
        C33744d a3 = a2.mo59983a("group_id", str2).mo59983a("enter_from", mo97950p());
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct != null) {
            str3 = anchorCommonStruct.getId();
        } else {
            str3 = null;
        }
        C33744d a4 = a3.mo59983a("mv_id", str3);
        C89219l.m154716b(a4, "");
        return a4;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: a */
    public final EnumC60206g mo97888a(List<AnchorCommonStruct> list) {
        AnchorPanelAction anchorPanelAction;
        List<AnchorPanelAction> actions;
        C89219l.m154721d(list, "");
        Aweme b = mo97864a().mo97883b();
        if (AVExternalServiceImpl.m113114a().configService().avsettingsConfig().getMvThemeRecordMode()) {
            int i = mo97949o().getUploadMiscInfoStruct().mvType;
            int mvPlan = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().getMvPlan();
            if ((i != 1 || mvPlan >= 2) && b.getAwemeType() != 61) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    anchorPanelAction = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    T t = next;
                    if (t.getType() == 29 && (actions = t.getActions()) != null) {
                        Iterator<T> it2 = actions.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            T next2 = it2.next();
                            if (next2.getActionType() == 1) {
                                if (next2 != null) {
                                    arrayList.add(next);
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList2 = arrayList;
                if (arrayList2.size() == 0) {
                    return EnumC60206g.NOT_FOUND;
                }
                AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) C89070n.m154579f((List) arrayList2);
                mo97868a(anchorCommonStruct);
                mo97929b(anchorCommonStruct);
                list.remove(anchorCommonStruct);
                List<AnchorPanelAction> actions2 = anchorCommonStruct.getActions();
                if (actions2 != null) {
                    Iterator<T> it3 = actions2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        T next3 = it3.next();
                        if (next3.getActionType() == 1) {
                            anchorPanelAction = next3;
                            break;
                        }
                    }
                    anchorPanelAction = anchorPanelAction;
                }
                this.f137291d = anchorPanelAction;
                this.f137358h = anchorCommonStruct;
                if (arrayList2.size() > 1) {
                    return EnumC60206g.PROCEED;
                }
                return EnumC60206g.DONE;
            }
        }
        return EnumC60206g.NOT_FOUND;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        String id;
        String str;
        String str2 = "";
        C89219l.m154721d(dVar, str2);
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct != null && (id = anchorCommonStruct.getId()) != null && !TextUtils.isEmpty(id)) {
            C33744d e = m109819e(dVar);
            C89219l.m154721d(e, str2);
            C33744d a = new C33744d().mo59985a(new HashMap<>(e.f79943a));
            C89219l.m154716b(a, str2);
            C39162r.m79460a("enter_multi_anchor_detail", a.mo59983a("click_type", "app_page").f79943a);
            SmartRoute withParam = SmartRouter.buildRoute(mo97952r(), "//movie/detail").withParam("mv_id", id).withParam("enter_from", mo97950p());
            String aid = mo97949o().getAid();
            if (aid != null) {
                str2 = aid;
            }
            SmartRoute withParam2 = withParam.withParam("group_id", str2);
            AnchorCommonStruct anchorCommonStruct2 = this.f137358h;
            if (anchorCommonStruct2 != null) {
                str = anchorCommonStruct2.getId();
            } else {
                str = null;
            }
            withParam2.withParam(StringSet.type, str).open(10086);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97890b(ViewGroup viewGroup, Dialog dialog, C33744d dVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(dialog, "");
        C89219l.m154721d(dVar, "");
        mo97945a(new C60236a(this, viewGroup, dVar));
    }
}
