package com.p2082ss.android.ugc.aweme.p2282ad.feed.mask;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC35142e;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.model.CardStruct;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33120c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33129l;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33131n;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33132o;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer */
public final class FeedAdLynxMaskContainer implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: j */
    public static final C33301a f79111j = new C33301a((byte) 0);

    /* renamed from: a */
    Aweme f79112a;

    /* renamed from: b */
    AwemeRawAd f79113b;

    /* renamed from: c */
    CardStruct f79114c;

    /* renamed from: d */
    JSONObject f79115d;

    /* renamed from: e */
    public AbstractC16208i f79116e;

    /* renamed from: f */
    final AbstractC33214c f79117f;

    /* renamed from: g */
    AbstractC35142e f79118g;

    /* renamed from: h */
    public boolean f79119h;

    /* renamed from: i */
    final BulletContainerView f79120i;

    /* renamed from: k */
    private final AbstractC34952a f79121k;

    /* renamed from: l */
    private final C33318f f79122l;

    static {
        Covode.recordClassIndex(40133);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(316, new RunnableC90250g(FeedAdLynxMaskContainer.class, "onHideMaskLayoutEvent", C33129l.class, ThreadMode.MAIN, 0, false));
        hashMap.put(317, new RunnableC90250g(FeedAdLynxMaskContainer.class, "onPopUpPageHideResumeVideoEvent", C33131n.class, ThreadMode.MAIN, 0, false));
        hashMap.put(318, new RunnableC90250g(FeedAdLynxMaskContainer.class, "onPopUpPageShowHideMaskLayoutEvent", C33132o.class, ThreadMode.MAIN, 0, false));
        hashMap.put(319, new RunnableC90250g(FeedAdLynxMaskContainer.class, "onCardGetCodeButtonClickedEvent", C33120c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer$a */
    public static final class C33301a {
        static {
            Covode.recordClassIndex(40134);
        }

        private C33301a() {
        }

        public /* synthetic */ C33301a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer$c */
    public static final class C33303c implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f79124a;

        /* renamed from: b */
        final /* synthetic */ String f79125b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f79126c = null;

        /* renamed from: d */
        private final String f79127d;

        static {
            Covode.recordClassIndex(40136);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f79127d;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f79124a;
        }

        C33303c(String str) {
            this.f79125b = str;
            this.f79127d = str;
            this.f79124a = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.mask.FeedAdLynxMaskContainer$b */
    public static final class C33302b extends AbstractC34952a {

        /* renamed from: a */
        final /* synthetic */ FeedAdLynxMaskContainer f79123a;

        static {
            Covode.recordClassIndex(40135);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33302b(FeedAdLynxMaskContainer feedAdLynxMaskContainer) {
            this.f79123a = feedAdLynxMaskContainer;
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(iVar, "");
            super.mo25853a(view, uri, iVar);
            this.f79123a.f79116e = iVar;
            this.f79123a.f79119h = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo59288a(String str) {
        AbstractC16208i iVar = this.f79116e;
        if (iVar != null) {
            iVar.onEvent(new C33303c(str));
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCardGetCodeButtonClickedEvent(C33120c cVar) {
        C89219l.m154721d(cVar, "");
        mo59288a("gameCodeClicked");
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onPopUpPageHideResumeVideoEvent(C33131n nVar) {
        C89219l.m154721d(nVar, "");
        this.f79122l.mo59320c();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onHideMaskLayoutEvent(C33129l lVar) {
        C89219l.m154721d(lVar, "");
        if (lVar.f78721a == this.f79120i.hashCode()) {
            this.f79122l.mo59318b(true);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onPopUpPageShowHideMaskLayoutEvent(C33132o oVar) {
        C89219l.m154721d(oVar, "");
        this.f79122l.mo59318b(false);
        DataCenter dataCenter = this.f79122l.f79158a;
        if (dataCenter != null) {
            dataCenter.mo60191a("ad_feed_pause_video", (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo59287a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        CardStruct cardStruct;
        Map<String, CardStruct> cardInfos;
        this.f79112a = aweme;
        JSONObject jSONObject = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f79113b = awemeRawAd;
        if (awemeRawAd == null || (cardInfos = awemeRawAd.getCardInfos()) == null) {
            cardStruct = null;
        } else {
            cardStruct = cardInfos.get("5");
        }
        this.f79114c = cardStruct;
        if (cardStruct != null) {
            jSONObject = cardStruct.getCardData();
        }
        this.f79115d = jSONObject;
    }

    public FeedAdLynxMaskContainer(C33318f fVar, BulletContainerView bulletContainerView) {
        AbstractC35142e eVar;
        AbstractC1196i lifecycle;
        String str;
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bulletContainerView, "");
        this.f79122l = fVar;
        this.f79120i = bulletContainerView;
        AbstractC39043a a = CommercializeAdServiceImpl.m79243a().mo67720a(17);
        ActivityC0580d dVar = null;
        AbstractC33214c cVar = (AbstractC33214c) (!(a instanceof AbstractC33214c) ? null : a);
        this.f79117f = cVar;
        C33302b bVar = new C33302b(this);
        this.f79121k = bVar;
        if (cVar != null) {
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            if (f != null) {
                str = f.mo59391g("lynx_feed");
            } else {
                str = null;
            }
            eVar = cVar.mo59142a(bulletContainerView, str, bVar);
        } else {
            eVar = null;
        }
        this.f79118g = eVar;
        Context context = bulletContainerView.getContext();
        ActivityC0580d dVar2 = context instanceof ActivityC0945e ? context : dVar;
        if (dVar2 != null && (lifecycle = dVar2.getLifecycle()) != null) {
            lifecycle.mo4012a(this);
        }
    }
}
