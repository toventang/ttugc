package com.p2082ss.android.ugc.aweme.p2282ad.feed.mask;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.google.gson.C27919i;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC35142e;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.EventBus;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.f */
public final class C33318f implements AbstractC1214u<C33942b>, AbstractC33321h {

    /* renamed from: b */
    public static final C33319a f79157b = new C33319a((byte) 0);

    /* renamed from: a */
    DataCenter f79158a;

    /* renamed from: c */
    private FeedAdLynxMaskContainer f79159c;

    /* renamed from: d */
    private BulletContainerView f79160d;

    /* renamed from: e */
    private Aweme f79161e;

    /* renamed from: f */
    private boolean f79162f;

    /* renamed from: g */
    private final AbstractC33214c f79163g;

    /* renamed from: h */
    private final ViewStub f79164h;

    static {
        Covode.recordClassIndex(40151);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.f$a */
    public static final class C33319a {
        static {
            Covode.recordClassIndex(40152);
        }

        private C33319a() {
        }

        public /* synthetic */ C33319a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33321h
    /* renamed from: d */
    public final boolean mo59321d() {
        return this.f79162f;
    }

    /* renamed from: c */
    public final void mo59320c() {
        DataCenter dataCenter = this.f79158a;
        if (dataCenter != null) {
            dataCenter.mo60191a("ad_feed_resume_video", (Object) null);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33321h
    /* renamed from: b */
    public final boolean mo59319b() {
        BulletContainerView bulletContainerView;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer;
        AbstractC33214c cVar = this.f79163g;
        if (cVar == null || !cVar.mo59148b(this.f79161e) || (bulletContainerView = this.f79160d) == null || this.f79162f || (feedAdLynxMaskContainer = this.f79159c) == null || !feedAdLynxMaskContainer.f79119h) {
            return false;
        }
        bulletContainerView.setAlpha(0.0f);
        bulletContainerView.setVisibility(0);
        bulletContainerView.animate().alpha(1.0f).setDuration(150).start();
        FeedAdLynxMaskContainer feedAdLynxMaskContainer2 = this.f79159c;
        if (feedAdLynxMaskContainer2 != null) {
            feedAdLynxMaskContainer2.mo59288a("maskShow");
        }
        this.f79162f = true;
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33321h
    /* renamed from: a */
    public final void mo59314a() {
        FeedAdLynxMaskContainer feedAdLynxMaskContainer;
        String cardUrl;
        String str;
        String str2;
        String str3;
        String str4;
        List<String> urlList;
        if (!this.f79162f && (feedAdLynxMaskContainer = this.f79159c) != null) {
            feedAdLynxMaskContainer.f79119h = false;
            CardStruct cardStruct = feedAdLynxMaskContainer.f79114c;
            if (cardStruct != null && (cardUrl = cardStruct.getCardUrl()) != null) {
                Uri.Builder buildUpon = Uri.parse(cardUrl).buildUpon();
                C28022o oVar = new C28022o();
                AwemeRawAd awemeRawAd = feedAdLynxMaskContainer.f79113b;
                String str5 = null;
                if (awemeRawAd != null) {
                    Long adId = awemeRawAd.getAdId();
                    if (adId != null) {
                        str2 = String.valueOf(adId.longValue());
                    } else {
                        str2 = null;
                    }
                    oVar.mo46801a("adId", str2);
                    oVar.mo46801a("creativeId", awemeRawAd.getCreativeIdStr());
                    oVar.mo46801a("logExtra", awemeRawAd.getLogExtra());
                    Long groupId = awemeRawAd.getGroupId();
                    if (groupId != null) {
                        str3 = String.valueOf(groupId.longValue());
                    } else {
                        str3 = null;
                    }
                    oVar.mo46801a("groupId", str3);
                    UrlModel clickTrackUrlList = awemeRawAd.getClickTrackUrlList();
                    if (!(clickTrackUrlList == null || (urlList = clickTrackUrlList.getUrlList()) == null || urlList.isEmpty())) {
                        C27919i iVar = new C27919i();
                        Iterator<T> it = urlList.iterator();
                        while (it.hasNext()) {
                            iVar.mo46687a((String) it.next());
                        }
                        oVar.mo46797a("clickTrackUrlList", iVar);
                    }
                    String nativeSiteAdInfo = awemeRawAd.getNativeSiteAdInfo();
                    if (nativeSiteAdInfo == null) {
                        nativeSiteAdInfo = "";
                    }
                    oVar.mo46801a("pageData", nativeSiteAdInfo);
                    C38220ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
                    if (nativeSiteConfig == null || (str4 = nativeSiteConfig.getLynxScheme()) == null) {
                        str4 = "";
                    }
                    oVar.mo46801a("lynxSchema", str4);
                }
                JSONObject jSONObject = feedAdLynxMaskContainer.f79115d;
                if (jSONObject == null || (str = jSONObject.toString()) == null) {
                    str = "";
                }
                oVar.mo46801a("cardData", str);
                oVar.mo46800a("isRTL", Integer.valueOf(C80471gb.m139483a(feedAdLynxMaskContainer.f79120i.getContext()) ? 1 : 0));
                String oVar2 = oVar.toString();
                C89219l.m154716b(oVar2, "");
                buildUpon.appendQueryParameter("initialData", oVar2);
                AbstractC35142e eVar = feedAdLynxMaskContainer.f79118g;
                if (eVar != null) {
                    String builder = buildUpon.toString();
                    C89219l.m154716b(builder, "");
                    Bundle bundle = new Bundle();
                    Context context = feedAdLynxMaskContainer.f79120i.getContext();
                    AbstractC33214c cVar = feedAdLynxMaskContainer.f79117f;
                    if (cVar != null) {
                        Aweme aweme = feedAdLynxMaskContainer.f79112a;
                        C89219l.m154716b(context, "");
                        cVar.mo59144a(bundle, aweme, context);
                    }
                    AwemeRawAd awemeRawAd2 = feedAdLynxMaskContainer.f79113b;
                    if (awemeRawAd2 != null) {
                        str5 = awemeRawAd2.getNativeSiteCustomData();
                    }
                    bundle.putString("bundle_native_site_custom_data", str5);
                    eVar.mo61984a(builder, bundle);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33321h
    /* renamed from: a */
    public final void mo59315a(DataCenter dataCenter) {
        this.f79158a = dataCenter;
        if (dataCenter != null) {
            dataCenter.mo60189a("ad_feed_on_page_selected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_feed_on_page_unselected", (AbstractC1214u<C33942b>) this);
        }
    }

    /* renamed from: b */
    public final void mo59318b(boolean z) {
        DataCenter dataCenter = this.f79158a;
        if (dataCenter != null) {
            dataCenter.mo60191a("action_ad_hide_lynx_mask", Boolean.valueOf(z));
        }
    }

    public C33318f(ViewStub viewStub) {
        this.f79164h = viewStub;
        AbstractC39043a a = CommercializeAdServiceImpl.m79243a().mo67720a(17);
        this.f79163g = (AbstractC33214c) (!(a instanceof AbstractC33214c) ? null : a);
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33321h
    /* renamed from: a */
    public final void mo59317a(boolean z) {
        BulletContainerView bulletContainerView = this.f79160d;
        if (bulletContainerView != null) {
            bulletContainerView.setAlpha(1.0f);
            bulletContainerView.setVisibility(8);
            bulletContainerView.animate().alpha(0.0f).setDuration(150).start();
            this.f79162f = false;
            if (z) {
                mo59320c();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.mask.AbstractC33321h
    /* renamed from: a */
    public final void mo59316a(Aweme aweme) {
        MethodCollector.m26663i(8156);
        AbstractC33214c cVar = this.f79163g;
        if (cVar == null || !cVar.mo59148b(aweme)) {
            this.f79161e = null;
            FeedAdLynxMaskContainer feedAdLynxMaskContainer = this.f79159c;
            if (feedAdLynxMaskContainer != null) {
                feedAdLynxMaskContainer.mo59287a((Aweme) null);
                MethodCollector.m26664o(8156);
                return;
            }
            MethodCollector.m26664o(8156);
            return;
        }
        this.f79161e = aweme;
        ViewStub viewStub = this.f79164h;
        if (!(viewStub == null || viewStub.getParent() == null)) {
            this.f79164h.setLayoutResource(R.layout.af2);
            View inflate = this.f79164h.inflate();
            if (inflate != null) {
                this.f79160d = (BulletContainerView) inflate;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.bytedance.ies.bullet.ui.common.BulletContainerView");
                MethodCollector.m26664o(8156);
                throw nullPointerException;
            }
        }
        BulletContainerView bulletContainerView = this.f79160d;
        if (bulletContainerView == null) {
            MethodCollector.m26664o(8156);
            return;
        }
        if (this.f79159c == null) {
            this.f79159c = new FeedAdLynxMaskContainer(this, bulletContainerView);
        }
        FeedAdLynxMaskContainer feedAdLynxMaskContainer2 = this.f79159c;
        if (feedAdLynxMaskContainer2 != null) {
            feedAdLynxMaskContainer2.mo59287a(aweme);
        }
        BulletContainerView bulletContainerView2 = this.f79160d;
        if (bulletContainerView2 != null) {
            bulletContainerView2.setVisibility(8);
        }
        this.f79162f = false;
        MethodCollector.m26664o(8156);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer;
        FeedAdLynxMaskContainer feedAdLynxMaskContainer2;
        C33942b bVar2 = bVar;
        AbstractC33214c cVar = this.f79163g;
        if (cVar != null && cVar.mo59148b(this.f79161e) && bVar2 != null && (str = bVar2.f80277a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1540531799) {
                if (hashCode == -1132409520 && str.equals("ad_feed_on_page_selected") && (feedAdLynxMaskContainer2 = this.f79159c) != null) {
                    EventBus.m156966a(EventBus.m156962a(), feedAdLynxMaskContainer2);
                }
            } else if (str.equals("ad_feed_on_page_unselected") && (feedAdLynxMaskContainer = this.f79159c) != null) {
                EventBus.m156962a().mo145395b(feedAdLynxMaskContainer);
            }
        }
    }
}
