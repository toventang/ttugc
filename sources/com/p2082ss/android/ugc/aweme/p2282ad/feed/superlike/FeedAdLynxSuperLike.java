package com.p2082ss.android.ugc.aweme.p2282ad.feed.superlike;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC35142e;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38241j;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33242d;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33125h;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33126i;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.superlike.FeedAdLynxSuperLike */
public final class FeedAdLynxSuperLike implements AbstractC33242d, AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: j */
    public static final C33341a f79212j = new C33341a((byte) 0);

    /* renamed from: a */
    Aweme f79213a;

    /* renamed from: b */
    AwemeRawAd f79214b;

    /* renamed from: c */
    String f79215c;

    /* renamed from: d */
    AbstractC33214c f79216d;

    /* renamed from: e */
    AbstractC35142e f79217e;

    /* renamed from: f */
    public AbstractC16208i f79218f;

    /* renamed from: g */
    public boolean f79219g;

    /* renamed from: h */
    public boolean f79220h;

    /* renamed from: i */
    final FrameLayout f79221i;

    /* renamed from: k */
    private final View f79222k;

    /* renamed from: l */
    private BulletContainerView f79223l;

    /* renamed from: m */
    private final AbstractC34952a f79224m;

    /* renamed from: n */
    private final C33344a f79225n;

    static {
        Covode.recordClassIndex(40178);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(388, new RunnableC90250g(FeedAdLynxSuperLike.class, "onPopupWindowCloseEvent", C33125h.class, ThreadMode.MAIN, 0, false));
        hashMap.put(389, new RunnableC90250g(FeedAdLynxSuperLike.class, "onSuperLikeStatusEvent", C33126i.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.superlike.FeedAdLynxSuperLike$a */
    public static final class C33341a {
        static {
            Covode.recordClassIndex(40179);
        }

        private C33341a() {
        }

        public /* synthetic */ C33341a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.superlike.FeedAdLynxSuperLike$c */
    public static final class C33343c implements AbstractC16191p {

        /* renamed from: a */
        public final JSONObject f79227a;

        /* renamed from: b */
        final /* synthetic */ String f79228b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f79229c = null;

        /* renamed from: d */
        private final String f79230d;

        static {
            Covode.recordClassIndex(40181);
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: a */
        public final String mo25699a() {
            return this.f79230d;
        }

        @Override // com.bytedance.ies.bullet.p1129c.p1132c.p1133a.AbstractC16191p
        /* renamed from: b */
        public final /* bridge */ /* synthetic */ Object mo25700b() {
            return this.f79227a;
        }

        C33343c(String str, JSONObject jSONObject) {
            this.f79228b = str;
            this.f79230d = str;
            this.f79227a = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.superlike.FeedAdLynxSuperLike$b */
    public static final class C33342b extends AbstractC34952a {

        /* renamed from: a */
        final /* synthetic */ FeedAdLynxSuperLike f79226a;

        static {
            Covode.recordClassIndex(40180);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33342b(FeedAdLynxSuperLike feedAdLynxSuperLike) {
            this.f79226a = feedAdLynxSuperLike;
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(iVar, "");
            super.mo25853a(view, uri, iVar);
            this.f79226a.f79219g = true;
            this.f79226a.f79218f = iVar;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onSuperLikeStatusEvent(C33126i iVar) {
        C89219l.m154721d(iVar, "");
        if (iVar.f78716a == 1) {
            this.f79220h = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33242d
    /* renamed from: a */
    public final void mo59200a(String str) {
        C89219l.m154721d(str, "");
        AbstractC16208i iVar = this.f79218f;
        if (iVar != null) {
            iVar.onEvent(new C33343c(str, null));
        }
    }

    /* renamed from: b */
    public final void mo59342b(String str) {
        C18129a.m33746a("draw_ad", "othershow_fail", this.f79214b).mo28900b("refer", "superlike").mo28897a("fail_reason", str).mo28901b();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onPopupWindowCloseEvent(C33125h hVar) {
        C89219l.m154721d(hVar, "");
        if (hVar.f78715a == this.f79223l.hashCode()) {
            this.f79225n.mo59208b();
        }
    }

    /* renamed from: a */
    public final void mo59341a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        C38241j lynxEntryData;
        this.f79213a = aweme;
        String str = null;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        this.f79214b = awemeRawAd;
        if (!(aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (lynxEntryData = awemeRawAd2.getLynxEntryData()) == null)) {
            str = lynxEntryData.getLynxScheme();
        }
        this.f79215c = str;
        if (aweme != null) {
            EventBus.m156966a(EventBus.m156962a(), this);
        }
    }

    public FeedAdLynxSuperLike(C33344a aVar, FrameLayout frameLayout) {
        AbstractC35142e eVar;
        AbstractC1196i lifecycle;
        String str;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(frameLayout, "");
        MethodCollector.m26663i(8726);
        this.f79225n = aVar;
        this.f79221i = frameLayout;
        AbstractC39043a a = CommercializeAdServiceImpl.m79243a().mo67720a(17);
        ActivityC0580d dVar = null;
        this.f79216d = (AbstractC33214c) (!(a instanceof AbstractC33214c) ? null : a);
        View inflate = View.inflate(frameLayout.getContext(), R.layout.af4, null);
        C89219l.m154716b(inflate, "");
        this.f79222k = inflate;
        C33342b bVar = new C33342b(this);
        this.f79224m = bVar;
        frameLayout.addView(inflate);
        View findViewById = inflate.findViewById(R.id.azx);
        C89219l.m154716b(findViewById, "");
        BulletContainerView bulletContainerView = (BulletContainerView) findViewById;
        this.f79223l = bulletContainerView;
        AbstractC33214c cVar = this.f79216d;
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
        this.f79217e = eVar;
        Context context = frameLayout.getContext();
        ActivityC0580d dVar2 = context instanceof ActivityC0945e ? context : dVar;
        if (dVar2 == null || (lifecycle = dVar2.getLifecycle()) == null) {
            MethodCollector.m26664o(8726);
            return;
        }
        lifecycle.mo4012a(this);
        MethodCollector.m26664o(8726);
    }
}
