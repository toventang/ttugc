package com.p2082ss.android.ugc.aweme.p2282ad.feed.survey;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.apm.C12290b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.keva.Keva;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC35142e;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38243l;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.survey.FeedAdLynxSurvey;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.survey.a */
public final class C33352a implements AbstractC1214u<C33942b>, AbstractC33355c {

    /* renamed from: d */
    public static final C33353a f79268d = new C33353a((byte) 0);

    /* renamed from: a */
    DataCenter f79269a;

    /* renamed from: b */
    public boolean f79270b;

    /* renamed from: c */
    C33354b f79271c;

    /* renamed from: e */
    private FeedAdLynxSurvey f79272e;

    /* renamed from: f */
    private FrameLayout f79273f;

    /* renamed from: g */
    private Aweme f79274g;

    /* renamed from: h */
    private Long f79275h;

    /* renamed from: i */
    private final Keva f79276i;

    /* renamed from: j */
    private final AbstractC33214c f79277j;

    /* renamed from: k */
    private final ViewStub f79278k;

    static {
        Covode.recordClassIndex(40192);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.survey.a$a */
    public static final class C33353a {
        static {
            Covode.recordClassIndex(40193);
        }

        private C33353a() {
        }

        public /* synthetic */ C33353a(byte b) {
            this();
        }
    }

    /* renamed from: d */
    private void m68369d() {
        DataCenter dataCenter = this.f79269a;
        if (dataCenter != null) {
            dataCenter.mo60191a("action_ad_pop_up_web_pause_video", (Object) null);
        }
    }

    /* renamed from: b */
    public final void mo59356b() {
        FrameLayout frameLayout = this.f79273f;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.f79270b = false;
        this.f79271c = null;
    }

    /* renamed from: e */
    private final void m68370e() {
        try {
            this.f79275h = Long.valueOf(this.f79276i.getLong("feed_ad_survey_last_show_time", -1));
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    private final boolean m68368c() {
        Long l;
        int i;
        AwemeRawAd awemeRawAd;
        C38243l adQuestionnaire;
        Integer showInterval;
        if (this.f79275h == null) {
            m68370e();
        }
        Long l2 = this.f79275h;
        if ((l2 != null && l2.longValue() == -1) || (l = this.f79275h) == null) {
            return true;
        }
        long longValue = l.longValue();
        Aweme aweme = this.f79274g;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adQuestionnaire = awemeRawAd.getAdQuestionnaire()) == null || (showInterval = adQuestionnaire.getShowInterval()) == null) {
            i = 259200;
        } else {
            i = showInterval.intValue();
        }
        if (System.currentTimeMillis() - longValue > ((long) (i * 1000))) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.survey.AbstractC33355c
    /* renamed from: a */
    public final void mo59352a() {
        FeedAdLynxSurvey feedAdLynxSurvey;
        String schema;
        String str;
        String str2;
        String str3;
        AbstractC33214c cVar = this.f79277j;
        if (cVar != null && cVar.mo59146a(this.f79274g) && m68368c() && !this.f79270b && (feedAdLynxSurvey = this.f79272e) != null) {
            feedAdLynxSurvey.f79251h = false;
            C38243l lVar = feedAdLynxSurvey.f79246c;
            if (lVar != null && (schema = lVar.getSchema()) != null) {
                Uri.Builder buildUpon = Uri.parse(schema).buildUpon();
                C28022o oVar = new C28022o();
                AwemeRawAd awemeRawAd = feedAdLynxSurvey.f79245b;
                String str4 = null;
                if (awemeRawAd != null) {
                    Long adId = awemeRawAd.getAdId();
                    if (adId != null) {
                        str = String.valueOf(adId.longValue());
                    } else {
                        str = null;
                    }
                    oVar.mo46801a("adId", str);
                    oVar.mo46801a("creativeId", awemeRawAd.getCreativeIdStr());
                    oVar.mo46801a("logExtra", awemeRawAd.getLogExtra());
                    Long groupId = awemeRawAd.getGroupId();
                    if (groupId != null) {
                        str2 = String.valueOf(groupId.longValue());
                    } else {
                        str2 = null;
                    }
                    oVar.mo46801a("groupId", str2);
                    C38243l adQuestionnaire = awemeRawAd.getAdQuestionnaire();
                    if (adQuestionnaire != null) {
                        str3 = adQuestionnaire.getContent();
                    } else {
                        str3 = null;
                    }
                    oVar.mo46801a("content", str3);
                }
                oVar.mo46800a("isRTL", Integer.valueOf(C80471gb.m139483a(feedAdLynxSurvey.f79253j.getContext()) ? 1 : 0));
                String oVar2 = oVar.toString();
                C89219l.m154716b(oVar2, "");
                buildUpon.appendQueryParameter("initialData", oVar2);
                AbstractC35142e eVar = feedAdLynxSurvey.f79248e;
                if (eVar != null) {
                    String builder = buildUpon.toString();
                    C89219l.m154716b(builder, "");
                    Bundle bundle = new Bundle();
                    Context context = feedAdLynxSurvey.f79253j.getContext();
                    AbstractC33214c a = feedAdLynxSurvey.mo59346a();
                    if (a != null) {
                        Aweme aweme = feedAdLynxSurvey.f79244a;
                        C89219l.m154716b(context, "");
                        a.mo59144a(bundle, aweme, context);
                    }
                    AwemeRawAd awemeRawAd2 = feedAdLynxSurvey.f79245b;
                    if (awemeRawAd2 != null) {
                        str4 = awemeRawAd2.getNativeSiteCustomData();
                    }
                    bundle.putString("bundle_native_site_custom_data", str4);
                    eVar.mo61984a(builder, bundle);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.survey.AbstractC33355c
    /* renamed from: a */
    public final void mo59353a(DataCenter dataCenter) {
        this.f79269a = dataCenter;
        if (dataCenter != null) {
            dataCenter.mo60189a("ad_feed_on_page_selected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_feed_on_page_unselected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_video_on_resume_play", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_video_on_render_ready", (AbstractC1214u<C33942b>) this);
        }
    }

    public C33352a(ViewStub viewStub) {
        C89219l.m154721d(viewStub, "");
        this.f79278k = viewStub;
        Keva repo = Keva.getRepo("feed_ad_survey_repo");
        C89219l.m154716b(repo, "");
        this.f79276i = repo;
        AbstractC39043a a = CommercializeAdServiceImpl.m79243a().mo67720a(17);
        this.f79277j = (AbstractC33214c) (!(a instanceof AbstractC33214c) ? null : a);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        int i;
        FeedAdLynxSurvey feedAdLynxSurvey;
        C33942b bVar2 = bVar;
        AbstractC33214c cVar = this.f79277j;
        if (cVar != null && cVar.mo59146a(this.f79274g)) {
            Long l = null;
            if (bVar2 != null && (str = bVar2.f80277a) != null) {
                switch (str.hashCode()) {
                    case -1929582278:
                        if (str.equals("ad_video_on_render_ready") && this.f79270b) {
                            m68369d();
                            return;
                        }
                        return;
                    case -1540531799:
                        if (str.equals("ad_feed_on_page_unselected")) {
                            FeedAdLynxSurvey feedAdLynxSurvey2 = this.f79272e;
                            if (feedAdLynxSurvey2 != null) {
                                if (feedAdLynxSurvey2.f79252i.f79270b) {
                                    C18129a.C18130a a = C18129a.m33746a("draw_ad", "othershow_over", feedAdLynxSurvey2.f79245b);
                                    AwemeRawAd awemeRawAd = feedAdLynxSurvey2.f79245b;
                                    if (awemeRawAd != null) {
                                        l = awemeRawAd.getAdId();
                                    }
                                    C18129a.C18130a a2 = a.mo28900b("ad_id", l).mo28900b("refer", feedAdLynxSurvey2.f79250g).mo28897a("duration", Long.valueOf(System.currentTimeMillis() - feedAdLynxSurvey2.f79247d));
                                    C38243l lVar = feedAdLynxSurvey2.f79246c;
                                    if (lVar != null) {
                                        i = lVar.getId();
                                    } else {
                                        i = 0;
                                    }
                                    a2.mo28897a("five_star_survey_id", Integer.valueOf(i)).mo28901b();
                                }
                                EventBus.m156962a().mo145395b(feedAdLynxSurvey2);
                            }
                            mo59356b();
                            return;
                        }
                        return;
                    case -1132409520:
                        if (str.equals("ad_feed_on_page_selected") && (feedAdLynxSurvey = this.f79272e) != null) {
                            EventBus.m156966a(EventBus.m156962a(), feedAdLynxSurvey);
                            return;
                        }
                        return;
                    case 2040441990:
                        if (str.equals("ad_video_on_resume_play") && this.f79270b) {
                            m68369d();
                            return;
                        }
                        return;
                    default:
                        return;
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.survey.AbstractC33355c
    /* renamed from: a */
    public final void mo59354a(Aweme aweme, int i) {
        MethodCollector.m26663i(8874);
        AbstractC33214c cVar = this.f79277j;
        if (cVar == null || !cVar.mo59146a(aweme)) {
            this.f79274g = null;
            FeedAdLynxSurvey feedAdLynxSurvey = this.f79272e;
            if (feedAdLynxSurvey != null) {
                feedAdLynxSurvey.mo59347a(null, 0);
                MethodCollector.m26664o(8874);
                return;
            }
            MethodCollector.m26664o(8874);
            return;
        }
        this.f79274g = aweme;
        if (this.f79278k.getParent() != null) {
            this.f79278k.setLayoutResource(R.layout.af5);
            View inflate = this.f79278k.inflate();
            if (inflate != null) {
                this.f79273f = (FrameLayout) inflate;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                MethodCollector.m26664o(8874);
                throw nullPointerException;
            }
        }
        FrameLayout frameLayout = this.f79273f;
        if (frameLayout == null) {
            MethodCollector.m26664o(8874);
            return;
        }
        if (this.f79272e == null) {
            this.f79272e = new FeedAdLynxSurvey(this, frameLayout);
        }
        FeedAdLynxSurvey feedAdLynxSurvey2 = this.f79272e;
        if (feedAdLynxSurvey2 != null) {
            feedAdLynxSurvey2.mo59347a(aweme, i);
        }
        mo59356b();
        MethodCollector.m26664o(8874);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.survey.AbstractC33355c
    /* renamed from: a */
    public final boolean mo59355a(int i, int i2, int i3) {
        FrameLayout frameLayout;
        AwemeRawAd awemeRawAd;
        int i4;
        String str;
        C38243l adQuestionnaire;
        AwemeRawAd awemeRawAd2;
        C38243l adQuestionnaire2;
        String str2;
        C38243l adQuestionnaire3;
        Long l;
        int i5;
        AbstractC33214c cVar = this.f79277j;
        if (cVar == null || !cVar.mo59146a(this.f79274g) || (frameLayout = this.f79273f) == null || this.f79270b || !m68368c()) {
            return false;
        }
        FeedAdLynxSurvey feedAdLynxSurvey = this.f79272e;
        Long l2 = null;
        if (feedAdLynxSurvey == null || !feedAdLynxSurvey.f79251h) {
            Aweme aweme = this.f79274g;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C18129a.C18130a a = C18129a.m33746a("draw_ad", "show_failed", awemeRawAd);
            Aweme aweme2 = this.f79274g;
            if (aweme2 == null || (awemeRawAd2 = aweme2.getAwemeRawAd()) == null || (adQuestionnaire2 = awemeRawAd2.getAdQuestionnaire()) == null) {
                i4 = 0;
            } else {
                i4 = adQuestionnaire2.getId();
            }
            a.mo28897a("five_star_survey_id", Integer.valueOf(i4)).mo28901b();
            Aweme aweme3 = this.f79274g;
            if (aweme3 != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    AwemeRawAd awemeRawAd3 = aweme3.getAwemeRawAd();
                    if (awemeRawAd3 == null || (adQuestionnaire = awemeRawAd3.getAdQuestionnaire()) == null) {
                        str = null;
                    } else {
                        str = adQuestionnaire.getSchema();
                    }
                    jSONObject.put("feed_ad_survey_url", str);
                    AwemeRawAd awemeRawAd4 = aweme3.getAwemeRawAd();
                    if (awemeRawAd4 != null) {
                        l2 = awemeRawAd4.getCreativeId();
                    }
                    jSONObject.put("feed_ad_survey_creative_id", l2);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                C12290b.m22060a("aweme_feed_ad_lynx_survey_show_error_rate", 1, jSONObject);
            }
            return false;
        }
        frameLayout.setVisibility(0);
        long currentTimeMillis = System.currentTimeMillis();
        FeedAdLynxSurvey feedAdLynxSurvey2 = this.f79272e;
        if (feedAdLynxSurvey2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("time", currentTimeMillis);
            AbstractC16208i iVar = feedAdLynxSurvey2.f79249f;
            if (iVar != null) {
                iVar.onEvent(new FeedAdLynxSurvey.C33350d("ad_survey_show", jSONObject2));
            }
            feedAdLynxSurvey2.f79247d = currentTimeMillis;
            feedAdLynxSurvey2.f79250g = "";
            feedAdLynxSurvey2.f79252i.m68369d();
            C18129a.C18130a a2 = C18129a.m33746a("draw_ad", "othershow", feedAdLynxSurvey2.f79245b);
            AwemeRawAd awemeRawAd5 = feedAdLynxSurvey2.f79245b;
            if (awemeRawAd5 != null) {
                l = awemeRawAd5.getAdId();
            } else {
                l = null;
            }
            C18129a.C18130a b = a2.mo28900b("ad_id", l);
            C38243l lVar = feedAdLynxSurvey2.f79246c;
            if (lVar != null) {
                i5 = lVar.getId();
            } else {
                i5 = 0;
            }
            b.mo28897a("five_star_survey_id", Integer.valueOf(i5)).mo28901b();
        }
        this.f79275h = Long.valueOf(currentTimeMillis);
        try {
            this.f79276i.storeLong("feed_ad_survey_last_show_time", currentTimeMillis);
        } catch (Exception e2) {
            C51423a.m95790a((Throwable) e2);
            e2.printStackTrace();
        }
        this.f79270b = true;
        this.f79271c = new C33354b(i, i2, i3);
        Aweme aweme4 = this.f79274g;
        if (aweme4 != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                AwemeRawAd awemeRawAd6 = aweme4.getAwemeRawAd();
                if (awemeRawAd6 == null || (adQuestionnaire3 = awemeRawAd6.getAdQuestionnaire()) == null) {
                    str2 = null;
                } else {
                    str2 = adQuestionnaire3.getSchema();
                }
                jSONObject3.put("feed_ad_survey_url", str2);
                AwemeRawAd awemeRawAd7 = aweme4.getAwemeRawAd();
                if (awemeRawAd7 != null) {
                    l2 = awemeRawAd7.getCreativeId();
                }
                jSONObject3.put("feed_ad_survey_creative_id", l2);
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            C12290b.m22060a("aweme_feed_ad_lynx_survey_show_error_rate", 0, jSONObject3);
        }
        return true;
    }
}
