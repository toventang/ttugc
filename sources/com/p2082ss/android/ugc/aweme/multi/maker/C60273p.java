package com.p2082ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.C39163s;
import com.p2082ss.android.ugc.aweme.experiment.C46847dp;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.p2082ss.android.ugc.aweme.feed.model.AnchorPanelAction;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50557v;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.model.p3458a.C60104a;
import com.p2082ss.android.ugc.aweme.multi.AbstractC60201c;
import com.p2082ss.android.ugc.aweme.multi.EnumC60206g;
import com.p2082ss.android.ugc.aweme.multi.p3462ui.ToolsAnchorItem;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.tools.detail.IPropReuseService;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.multi.maker.p */
public final class C60273p extends AbstractC60267o {

    /* renamed from: e */
    public static final C60274a f137370e = new C60274a((byte) 0);

    /* renamed from: d */
    public AnchorPanelAction f137371d;

    /* renamed from: f */
    private final int f137372f;

    static {
        Covode.recordClassIndex(70805);
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: l */
    public final String mo97925l() {
        return "app_page";
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.p$a */
    public static final class C60274a {
        static {
            Covode.recordClassIndex(70806);
        }

        private C60274a() {
        }

        public /* synthetic */ C60274a(byte b) {
            this();
        }

        /* renamed from: a */
        public static int m109958a(String str) {
            if (str == null) {
                return 0;
            }
            try {
                return new JSONObject(str).optInt("green_screen_materials_type");
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    public /* synthetic */ C60273p() {
        this(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.p$c */
    static final class C60276c extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60273p f137373a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f137374b;

        /* renamed from: c */
        final /* synthetic */ C33744d f137375c;

        static {
            Covode.recordClassIndex(70808);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60276c(C60273p pVar, ViewGroup viewGroup, C33744d dVar) {
            super(1);
            this.f137373a = pVar;
            this.f137374b = viewGroup;
            this.f137375c = dVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.maker.p$c$b */
        static final class C60278b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C60276c f137379a;

            /* renamed from: b */
            final /* synthetic */ AnchorCommonStruct f137380b;

            /* renamed from: c */
            final /* synthetic */ C89233z.C89238e f137381c;

            static {
                Covode.recordClassIndex(70810);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C60278b(C60276c cVar, AnchorCommonStruct anchorCommonStruct, C89233z.C89238e eVar) {
                super(0);
                this.f137379a = cVar;
                this.f137380b = anchorCommonStruct;
                this.f137381c = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                C60273p pVar = this.f137379a.f137373a;
                pVar.mo97945a(new C60279d(pVar));
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.multi.maker.p$c$a */
        static final class View$OnClickListenerC60277a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C60276c f137376a;

            /* renamed from: b */
            final /* synthetic */ AnchorCommonStruct f137377b;

            /* renamed from: c */
            final /* synthetic */ C89233z.C89238e f137378c;

            static {
                Covode.recordClassIndex(70809);
            }

            View$OnClickListenerC60277a(C60276c cVar, AnchorCommonStruct anchorCommonStruct, C89233z.C89238e eVar) {
                this.f137376a = cVar;
                this.f137377b = anchorCommonStruct;
                this.f137378c = eVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f137376a.f137373a.mo97893d(this.f137376a.f137375c);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AnchorCommonStruct anchorCommonStruct) {
            T t;
            MethodCollector.m26663i(7280);
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            String str = "";
            C89219l.m154721d(anchorCommonStruct2, str);
            C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = (T) anchorCommonStruct2.getKeyword();
            Context context = this.f137374b.getContext();
            C89219l.m154716b(context, str);
            ToolsAnchorItem a = ToolsAnchorItem.C60301a.m109982a(context);
            UrlModel thumbnail = anchorCommonStruct2.getThumbnail();
            if (thumbnail != null) {
                a.setIcon(thumbnail);
            }
            UrlModel urlModel = null;
            if (C46847dp.m90162a() && !C80580in.m139689d() && Aweme.isGreenScreenGiphyAnchor(this.f137373a.f137358h)) {
                String b = C34722h.m70923b(R.string.c3y);
                if (b != null) {
                    t = (T) C1764a.m5928a(b, Arrays.copyOf(new Object[]{anchorCommonStruct2.getKeyword()}, 1));
                    C89219l.m154716b(t, str);
                } else {
                    t = null;
                }
                eVar.element = t;
            }
            T t2 = eVar.element;
            if (t2 != null) {
                str = t2;
            }
            a.setTitle(str);
            a.setSubTitle(anchorCommonStruct2.getDescription());
            a.setOnClickListener(new View$OnClickListenerC60277a(this, anchorCommonStruct2, eVar));
            AnchorPanelAction anchorPanelAction = this.f137373a.f137371d;
            if (anchorPanelAction != null) {
                urlModel = anchorPanelAction.getIcon();
            }
            a.setButtonIcon(urlModel);
            a.setButtonOnClickListener(new C60278b(this, anchorCommonStruct2, eVar));
            this.f137374b.addView(a);
            C89391z zVar = C89391z.f203057a;
            MethodCollector.m26664o(7280);
            return zVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: g */
    public final String mo97895g() {
        String keyword;
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct == null || (keyword = anchorCommonStruct.getKeyword()) == null) {
            return "";
        }
        return keyword;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: i */
    public final AbstractC60201c mo97897i() {
        return new C60273p(this.f137372f + 1);
    }

    /* renamed from: n */
    private final String m109949n() {
        String str;
        JSONObject s = mo97953s();
        if (s == null || (str = s.optString("request_id")) == null) {
            str = "";
        }
        LogPbBean logPbBean = new LogPbBean();
        logPbBean.setImprId(str);
        String a = C48027ac.C48028a.f111257a.mo80054a(logPbBean);
        C89219l.m154716b(a, "");
        return a;
    }

    private C60273p(int i) {
        this.f137372f = i;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97891b(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        C39162r.m79460a("multi_anchor_entrance_show", m109920a(dVar, m109948c("")).f79943a);
        C39162r.m79460a("anchor_entrance_show", m109920a(mo97954t(), m109948c("")).f79943a);
        if (mo97949o().isAd()) {
            C18129a.m33746a("draw_ad", "othershow", mo97949o().getAwemeRawAd()).mo28900b("refer", "prop_anchor").mo28901b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: c */
    public final void mo97892c(C33744d dVar) {
        C89219l.m154721d(dVar, "");
        C39162r.m79460a("multi_anchor_entrance_click", m109920a(dVar, m109948c("")).f79943a);
        C39162r.m79460a("anchor_entrance_click", m109920a(mo97954t(), m109948c("")).f79943a);
        if (mo97949o().isAd()) {
            C18129a.m33746a("draw_ad", "otherclick", mo97949o().getAwemeRawAd()).mo28900b("refer", "prop_anchor").mo28901b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.multi.maker.p$d */
    static final class C60279d extends AbstractC89220m implements AbstractC89172b<AnchorCommonStruct, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C60273p f137382a;

        static {
            Covode.recordClassIndex(70811);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C60279d(C60273p pVar) {
            super(1);
            this.f137382a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AnchorCommonStruct anchorCommonStruct) {
            String str;
            AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
            C89219l.m154721d(anchorCommonStruct2, "");
            if (!C46847dp.m90162a() || C80580in.m139689d() || !Aweme.isGreenScreenGiphyAnchor(this.f137382a.f137358h)) {
                str = null;
            } else {
                str = this.f137382a.mo97949o().getGiphyGifIds();
            }
            boolean downloadEffectOrMusicAfterEnterCamera = AVExternalServiceImpl.m113114a().configService().avsettingsConfig().downloadEffectOrMusicAfterEnterCamera();
            IPropReuseService c = PropReuseServiceImpl.m116994c();
            Activity e = this.f137382a.mo97864a().mo97886e();
            List<String> a = C89070n.m154516a(anchorCommonStruct2.getId());
            if (str == null) {
                str = "";
            }
            Music music = this.f137382a.mo97949o().getMusic();
            Video video = this.f137382a.mo97949o().getVideo();
            C89219l.m154716b(video, "");
            c.mo104484a(e, a, new C60104a("anchor_combine_prop", music, "prop_auto", "anchor_combine_page", "anchor_combine_prop", null, null, false, str, Integer.valueOf(video.getVideoLength()), 26449), downloadEffectOrMusicAfterEnterCamera);
            return C89391z.f203057a;
        }
    }

    /* renamed from: c */
    private JSONObject m109948c(String str) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C89219l.m154721d(str, "");
        Aweme o = mo97949o();
        C39163s a = new C39163s().mo67941a("log_pb", m109949n());
        if (o == null || (str2 = o.getAuthorUid()) == null) {
            str2 = "";
        }
        C39163s a2 = a.mo67941a("author_id", str2);
        if (o == null || (str3 = o.getAid()) == null) {
            str3 = "";
        }
        C39163s a3 = a2.mo67941a("group_id", str3).mo67941a("enter_from", mo97950p());
        if (o == null || !o.isForwardAweme()) {
            str4 = "0";
        } else {
            str4 = "1";
        }
        C39163s a4 = a3.mo67941a("is_reposted", str4);
        String str9 = null;
        if (o != null) {
            str5 = o.getRepostFromGroupId();
        } else {
            str5 = null;
        }
        C39163s a5 = a4.mo67941a("repost_from_group_id", str5);
        if (o != null) {
            str6 = o.getRepostFromUserId();
        } else {
            str6 = null;
        }
        C39163s a6 = a5.mo67941a("repost_from_user_id", str6);
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct == null || (str7 = anchorCommonStruct.getId()) == null) {
            str7 = "";
        }
        C39163s a7 = a6.mo67941a("prop_id", str7);
        AnchorCommonStruct anchorCommonStruct2 = this.f137358h;
        if (anchorCommonStruct2 != null) {
            str9 = anchorCommonStruct2.getExtra();
        }
        int a8 = C60274a.m109958a(str9);
        if (a8 == 1) {
            str8 = UGCMonitor.TYPE_PHOTO;
        } else if (a8 != 3) {
            str8 = "Unknown";
        } else {
            str8 = "giphy";
        }
        a7.mo67941a("media_type", str8);
        if (!TextUtils.isEmpty(str)) {
            a7.mo67941a("impr_type", str);
        }
        C50557v.m94787b(mo97950p(), new C60275b(a7));
        JSONObject a9 = a7.mo67942a();
        C89219l.m154716b(a9, "");
        return a9;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: a */
    public final EnumC60206g mo97888a(List<AnchorCommonStruct> list) {
        AnchorPanelAction anchorPanelAction;
        List<AnchorPanelAction> actions;
        C89219l.m154721d(list, "");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            anchorPanelAction = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            T t = next;
            if (t.getType() == 28 && (actions = t.getActions()) != null) {
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
        this.f137371d = anchorPanelAction;
        this.f137358h = anchorCommonStruct;
        if (arrayList2.size() > 1) {
            return EnumC60206g.PROCEED;
        }
        return EnumC60206g.DONE;
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c
    /* renamed from: d */
    public final void mo97893d(C33744d dVar) {
        C69905c cVar;
        Music music;
        String str;
        C89219l.m154721d(dVar, "");
        Aweme o = mo97949o();
        String str2 = null;
        if (o.getMusic() == null || CommerceMediaServiceImpl.m77578f().mo66514b(o.getMusic())) {
            cVar = null;
        } else {
            cVar = MainServiceImpl.createIMainServicebyMonsterPlugin(false).avMusicApply(o.getMusic().convertToMusicModel());
        }
        if (o.getMusic() == null || CommerceMediaServiceImpl.m77578f().mo66514b(o.getMusic())) {
            music = null;
        } else {
            music = o.getMusic();
        }
        SmartRoute withParam = SmartRouter.buildRoute(mo97952r(), "//stickers/detail").withParam("aweme_id", o.getAid()).withParam("music_model", music).withParam("sticker_music", cVar);
        String[] strArr = new String[1];
        AnchorCommonStruct anchorCommonStruct = this.f137358h;
        if (anchorCommonStruct == null || (str = anchorCommonStruct.getId()) == null) {
            str = "";
        }
        strArr[0] = str;
        SmartRoute withParam2 = withParam.withParam("extra_stickers", C89070n.m154525d(strArr)).withParam("extra_log_pb", m109949n());
        AnchorCommonStruct anchorCommonStruct2 = this.f137358h;
        if (anchorCommonStruct2 != null) {
            str2 = anchorCommonStruct2.getExtra();
        }
        SmartRoute withParam3 = withParam2.withParam("media_type", C60274a.m109958a(str2));
        Video video = o.getVideo();
        C89219l.m154716b(video, "");
        withParam3.withParam("EXTRA_VIDEO_LENGTH", video.getVideoLength()).withParam("extra_previous_page", mo97950p()).open();
        String j = C59208ac.m108776j(o);
        C89219l.m154716b(j, "");
        C39162r.m79461a("enter_prop_detail", m109948c(j));
        C39162r.m79460a("enter_multi_anchor_detail", m109920a(dVar, m109948c("")).f79943a);
        if (mo97949o().isAd()) {
            C18129a.m33746a("anchor_detail", "otherclick", mo97949o().getAwemeRawAd()).mo28900b("refer", "prop_anchor").mo28901b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.multi.maker.p$b */
    public static final /* synthetic */ class C60275b extends C89217j implements AbstractC89183m<String, String, C39163s> {
        static {
            Covode.recordClassIndex(70807);
        }

        C60275b(C39163s sVar) {
            super(2, sVar, C39163s.class, "addParam", "addParam(Ljava/lang/String;Ljava/lang/String;)Lcom/ss/android/ugc/aweme/common/MobJsonHelper;", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C39163s invoke(String str, String str2) {
            return ((C39163s) this.receiver).mo67941a(str, str2);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.multi.AbstractC60201c, com.p2082ss.android.ugc.aweme.multi.maker.AbstractC60267o
    /* renamed from: b */
    public final void mo97890b(ViewGroup viewGroup, Dialog dialog, C33744d dVar) {
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(dialog, "");
        C89219l.m154721d(dVar, "");
        mo97945a(new C60276c(this, viewGroup, dVar));
    }
}
