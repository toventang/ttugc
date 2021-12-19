package com.p2082ss.android.ugc.aweme.p2282ad.feed.sticker;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.p1129c.p1132c.AbstractC16208i;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.google.gson.C28022o;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a;
import com.p2082ss.android.ugc.aweme.bullet.AbstractC35142e;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38220ag;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38244m;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.lynx.AbstractFeedLynxView;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2294c.C33216b;
import com.p2082ss.android.ugc.aweme.p2282ad.p2285c.C33124g;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.AdLandPagePreloadServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.preload.IAdLandPagePreloadService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
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

/* renamed from: com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker */
public final class FeedAdLynxSticker extends AbstractFeedLynxView implements AbstractC33974au, AbstractC90252i, AbstractC90253j {

    /* renamed from: k */
    public static final C33335a f79190k = new C33335a((byte) 0);

    /* renamed from: j */
    public boolean f79191j;

    /* renamed from: l */
    private String f79192l;

    /* renamed from: m */
    private final AbstractC34952a f79193m;

    /* renamed from: n */
    private AbstractC35142e f79194n;

    /* renamed from: o */
    private C38244m f79195o;

    static {
        Covode.recordClassIndex(40171);
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(154, new RunnableC90250g(FeedAdLynxSticker.class, "onCardStatusEvent", C33124g.class, ThreadMode.MAIN, 0, false));
        hashMap.put(292, new RunnableC90250g(FeedAdLynxSticker.class, "onAdPlayEvent", C33216b.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.AbstractC1202k, com.p2082ss.android.ugc.aweme.p2282ad.feed.lynx.AbstractFeedLynxView
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker$a */
    public static final class C33335a {
        static {
            Covode.recordClassIndex(40172);
        }

        private C33335a() {
        }

        public /* synthetic */ C33335a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.lynx.AbstractFeedLynxView
    /* renamed from: a */
    public final String mo59279a() {
        return this.f79192l;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.lynx.AbstractFeedLynxView
    /* renamed from: c */
    public final AbstractC35142e mo59283c() {
        return this.f79194n;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.lynx.AbstractFeedLynxView
    /* renamed from: f */
    public final void mo59286f() {
        C18129a.m33746a("draw_ad", "othershow", this.f79099b).mo28900b("refer", "sticker").mo28901b();
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.lynx.AbstractFeedLynxView
    /* renamed from: e */
    public final C28022o mo59285e() {
        User author;
        String str;
        String str2;
        C28022o e = super.mo59285e();
        AwemeRawAd awemeRawAd = this.f79099b;
        String str3 = null;
        if (awemeRawAd != null) {
            JSONObject frontendData = awemeRawAd.getFrontendData();
            if (frontendData != null) {
                str = frontendData.toString();
            } else {
                str = null;
            }
            e.mo46801a("frontendData", str);
            C38220ag nativeSiteConfig = awemeRawAd.getNativeSiteConfig();
            if (nativeSiteConfig != null) {
                str2 = nativeSiteConfig.getLynxScheme();
            } else {
                str2 = null;
            }
            e.mo46801a("lynxSchema", str2);
        }
        Aweme aweme = this.f79098a;
        if (!(aweme == null || (author = aweme.getAuthor()) == null)) {
            str3 = author.getNickname();
        }
        e.mo46801a("accountName", str3);
        return e;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.sticker.FeedAdLynxSticker$b */
    public static final class C33336b extends AbstractC34952a {

        /* renamed from: a */
        final /* synthetic */ FeedAdLynxSticker f79196a;

        static {
            Covode.recordClassIndex(40173);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33336b(FeedAdLynxSticker feedAdLynxSticker) {
            this.f79196a = feedAdLynxSticker;
        }

        @Override // com.p2082ss.android.ugc.aweme.bullet.AbstractC34952a, com.bytedance.ies.bullet.p1184ui.common.AbstractC17046h.AbstractC17048b
        /* renamed from: a */
        public final void mo25853a(View view, Uri uri, AbstractC16208i iVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(uri, "");
            C89219l.m154721d(iVar, "");
            super.mo25853a(view, uri, iVar);
            this.f79196a.f79101d = true;
            this.f79196a.f79103f = iVar;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.lynx.AbstractFeedLynxView
    /* renamed from: a */
    public final void mo59280a(Aweme aweme) {
        String str;
        super.mo59280a(aweme);
        C38244m R = C37699a.m76215R(aweme);
        this.f79195o = R;
        if (R != null) {
            str = R.getStickerUrl();
        } else {
            str = null;
        }
        this.f79192l = str;
        if (aweme != null) {
            EventBus.m156966a(EventBus.m156962a(), this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.lynx.AbstractFeedLynxView
    /* renamed from: b */
    public final void mo59282b(String str) {
        C18129a.m33746a("draw_ad", "othershow_fail", this.f79099b).mo28900b("refer", "sticker").mo28897a("fail_reason", str).mo28901b();
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCardStatusEvent(C33124g gVar) {
        C89219l.m154721d(gVar, "");
        if (gVar.f78714b == mo59281b().hashCode() && gVar.f78713a == 1) {
            this.f79191j = true;
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onAdPlayEvent(C33216b bVar) {
        C89219l.m154721d(bVar, "");
        AbstractC33252e eVar = this.f79106i;
        if (!(eVar instanceof C33337a)) {
            eVar = null;
        }
        C33337a aVar = (C33337a) eVar;
        if (aVar != null && !aVar.mo59339d() && this.f79106i.mo59209c()) {
            mo59200a("event_card_show");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedAdLynxSticker(ViewGroup viewGroup, C33337a aVar) {
        super(viewGroup, aVar);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(aVar, "");
        C33336b bVar = new C33336b(this);
        this.f79193m = bVar;
        AbstractC33214c cVar = this.f79100c;
        AbstractC35142e eVar = null;
        String g = null;
        if (cVar != null) {
            BulletContainerView b = mo59281b();
            IAdLandPagePreloadService f = AdLandPagePreloadServiceImpl.m68380f();
            eVar = cVar.mo59142a(b, f != null ? f.mo59391g("lynx_feed") : g, bVar);
        }
        this.f79194n = eVar;
    }
}
