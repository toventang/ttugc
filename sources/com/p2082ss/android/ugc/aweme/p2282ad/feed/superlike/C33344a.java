package com.p2082ss.android.ugc.aweme.p2282ad.feed.superlike;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC35142e;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38241j;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80534hh;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.superlike.a */
public final class C33344a implements AbstractC1214u<C33942b>, AbstractC33252e {

    /* renamed from: d */
    public static final C33345a f79231d = new C33345a((byte) 0);

    /* renamed from: a */
    public FeedAdLynxSuperLike f79232a;

    /* renamed from: b */
    public boolean f79233b;

    /* renamed from: c */
    public String f79234c;

    /* renamed from: e */
    private Aweme f79235e;

    /* renamed from: f */
    private DataCenter f79236f;

    /* renamed from: g */
    private FrameLayout f79237g;

    /* renamed from: h */
    private C38241j f79238h;

    /* renamed from: i */
    private Handler f79239i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    private ViewStub f79240j;

    static {
        Covode.recordClassIndex(40182);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.superlike.a$a */
    public static final class C33345a {
        static {
            Covode.recordClassIndex(40183);
        }

        private C33345a() {
        }

        public /* synthetic */ C33345a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e
    /* renamed from: c */
    public final boolean mo59209c() {
        return this.f79233b;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e
    /* renamed from: b */
    public final void mo59208b() {
        FrameLayout frameLayout = this.f79237g;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.f79233b = false;
        this.f79239i.removeCallbacksAndMessages(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.superlike.a$b */
    static final class RunnableC33346b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C33344a f79241a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f79242b;

        static {
            Covode.recordClassIndex(40184);
        }

        RunnableC33346b(C33344a aVar, FrameLayout frameLayout) {
            this.f79241a = aVar;
            this.f79242b = frameLayout;
        }

        public final void run() {
            FeedAdLynxSuperLike feedAdLynxSuperLike = this.f79241a.f79232a;
            if (feedAdLynxSuperLike == null || !feedAdLynxSuperLike.f79219g) {
                this.f79241a.f79234c = "data_load_fail";
                FeedAdLynxSuperLike feedAdLynxSuperLike2 = this.f79241a.f79232a;
                if (feedAdLynxSuperLike2 != null) {
                    feedAdLynxSuperLike2.mo59342b(this.f79241a.f79234c);
                    return;
                }
                return;
            }
            FeedAdLynxSuperLike feedAdLynxSuperLike3 = this.f79241a.f79232a;
            if (feedAdLynxSuperLike3 == null || !feedAdLynxSuperLike3.f79220h) {
                this.f79241a.f79234c = "load_timeout";
                FeedAdLynxSuperLike feedAdLynxSuperLike4 = this.f79241a.f79232a;
                if (feedAdLynxSuperLike4 != null) {
                    feedAdLynxSuperLike4.mo59342b(this.f79241a.f79234c);
                    return;
                }
                return;
            }
            this.f79242b.setVisibility(0);
            this.f79241a.f79233b = true;
            FeedAdLynxSuperLike feedAdLynxSuperLike5 = this.f79241a.f79232a;
            if (feedAdLynxSuperLike5 != null) {
                C18129a.m33746a("draw_ad", "othershow", feedAdLynxSuperLike5.f79214b).mo28900b("refer", "superlike").mo28901b();
            }
            FeedAdLynxSuperLike feedAdLynxSuperLike6 = this.f79241a.f79232a;
            if (feedAdLynxSuperLike6 != null) {
                feedAdLynxSuperLike6.mo59200a("event_superlike_show");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e
    /* renamed from: a */
    public final void mo59204a() {
        FeedAdLynxSuperLike feedAdLynxSuperLike;
        String str;
        String str2;
        String str3;
        List<String> urlList;
        if (C37699a.m76253aY(this.f79235e) && !this.f79233b && (feedAdLynxSuperLike = this.f79232a) != null) {
            feedAdLynxSuperLike.f79219g = false;
            feedAdLynxSuperLike.f79220h = false;
            String str4 = feedAdLynxSuperLike.f79215c;
            if (str4 != null) {
                Uri.Builder buildUpon = Uri.parse(str4).buildUpon();
                C28022o oVar = new C28022o();
                AwemeRawAd awemeRawAd = feedAdLynxSuperLike.f79214b;
                String str5 = null;
                if (awemeRawAd != null) {
                    oVar.mo46801a("adId", String.valueOf(awemeRawAd.getAdId().longValue()));
                    oVar.mo46801a("creativeId", awemeRawAd.getCreativeIdStr());
                    oVar.mo46801a("logExtra", awemeRawAd.getLogExtra());
                    Long groupId = awemeRawAd.getGroupId();
                    if (groupId != null) {
                        str = String.valueOf(groupId.longValue());
                    } else {
                        str = null;
                    }
                    oVar.mo46801a("groupId", str);
                    UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                    if (!(clickTrackUrlList == null || (urlList = clickTrackUrlList.getUrlList()) == null || urlList.isEmpty())) {
                        C27919i iVar = new C27919i();
                        Iterator<T> it = urlList.iterator();
                        while (it.hasNext()) {
                            iVar.mo46687a((String) it.next());
                        }
                        oVar.mo46797a("clickTrackUrlList", iVar);
                    }
                    JSONObject frontendData = awemeRawAd.getFrontendData();
                    if (frontendData != null) {
                        str2 = frontendData.toString();
                    } else {
                        str2 = null;
                    }
                    oVar.mo46801a("frontendData", str2);
                    C38220ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                    if (nativeSiteConfig != null) {
                        str3 = nativeSiteConfig.getLynxScheme();
                    } else {
                        str3 = null;
                    }
                    oVar.mo46801a("lynxSchema", str3);
                }
                Aweme aweme = feedAdLynxSuperLike.f79213a;
                if (aweme != null) {
                    str5 = aweme.getAid();
                }
                oVar.mo46801a("itemId", String.valueOf(str5));
                oVar.mo46800a("isRTL", Integer.valueOf(C80471gb.m139483a(feedAdLynxSuperLike.f79221i.getContext()) ? 1 : 0));
                oVar.mo46800a("topSafeAreaHeight", Integer.valueOf(C80534hh.m139609b()));
                buildUpon.appendQueryParameter("initialData", oVar.toString());
                AbstractC35142e eVar = feedAdLynxSuperLike.f79217e;
                if (eVar != null) {
                    String builder = buildUpon.toString();
                    C89219l.m154716b(builder, "");
                    Bundle bundle = new Bundle();
                    Context context = feedAdLynxSuperLike.f79221i.getContext();
                    AbstractC33214c cVar = feedAdLynxSuperLike.f79216d;
                    if (cVar != null) {
                        Aweme aweme2 = feedAdLynxSuperLike.f79213a;
                        C89219l.m154716b(context, "");
                        cVar.mo59144a(bundle, aweme2, context);
                    }
                    eVar.mo61984a(builder, bundle);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e
    /* renamed from: a */
    public final void mo59206a(DataCenter dataCenter) {
        this.f79236f = dataCenter;
        if (dataCenter != null) {
            dataCenter.mo60189a("ad_feed_on_page_selected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_feed_on_page_unselected", (AbstractC1214u<C33942b>) this);
        }
    }

    public C33344a(ViewStub viewStub) {
        C89219l.m154721d(viewStub, "");
        this.f79240j = viewStub;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e
    /* renamed from: a */
    public final void mo59205a(long j) {
        FrameLayout frameLayout;
        if (C37699a.m76253aY(this.f79235e) && !this.f79233b && (frameLayout = this.f79237g) != null) {
            this.f79239i.postDelayed(new RunnableC33346b(this, frameLayout), j);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        FeedAdLynxSuperLike feedAdLynxSuperLike;
        C33942b bVar2 = bVar;
        if (C37699a.m76253aY(this.f79235e) && bVar2 != null && (str = bVar2.f80277a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1540531799) {
                if (hashCode == -1132409520 && str.equals("ad_feed_on_page_selected") && (feedAdLynxSuperLike = this.f79232a) != null) {
                    EventBus.m156966a(EventBus.m156962a(), feedAdLynxSuperLike);
                }
            } else if (str.equals("ad_feed_on_page_unselected")) {
                FeedAdLynxSuperLike feedAdLynxSuperLike2 = this.f79232a;
                if (feedAdLynxSuperLike2 != null) {
                    EventBus.m156966a(EventBus.m156962a(), feedAdLynxSuperLike2);
                }
                mo59208b();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e
    /* renamed from: a */
    public final void mo59207a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        MethodCollector.m26663i(8578);
        C38241j jVar = null;
        if (!C37699a.m76253aY(aweme)) {
            this.f79235e = null;
            FeedAdLynxSuperLike feedAdLynxSuperLike = this.f79232a;
            if (feedAdLynxSuperLike != null) {
                feedAdLynxSuperLike.mo59341a((Aweme) null);
                MethodCollector.m26664o(8578);
                return;
            }
            MethodCollector.m26664o(8578);
            return;
        }
        C38241j aZ = C37699a.m76254aZ(aweme);
        if (aZ == null || aZ.getEntryType() != 1) {
            this.f79235e = null;
            FeedAdLynxSuperLike feedAdLynxSuperLike2 = this.f79232a;
            if (feedAdLynxSuperLike2 != null) {
                feedAdLynxSuperLike2.mo59341a((Aweme) null);
            }
            MethodCollector.m26664o(8578);
            return;
        }
        this.f79235e = aweme;
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            jVar = awemeRawAd.getLynxEntryData();
        }
        this.f79238h = jVar;
        if (this.f79240j.getParent() != null) {
            this.f79240j.setLayoutResource(R.layout.af4);
            View inflate = this.f79240j.inflate();
            if (inflate != null) {
                this.f79237g = (FrameLayout) inflate;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                MethodCollector.m26664o(8578);
                throw nullPointerException;
            }
        }
        FrameLayout frameLayout = this.f79237g;
        if (frameLayout == null) {
            MethodCollector.m26664o(8578);
            return;
        }
        if (this.f79232a == null) {
            this.f79232a = new FeedAdLynxSuperLike(this, frameLayout);
        }
        FeedAdLynxSuperLike feedAdLynxSuperLike3 = this.f79232a;
        if (feedAdLynxSuperLike3 != null) {
            feedAdLynxSuperLike3.mo59341a(aweme);
        }
        mo59208b();
        MethodCollector.m26664o(8578);
    }
}
