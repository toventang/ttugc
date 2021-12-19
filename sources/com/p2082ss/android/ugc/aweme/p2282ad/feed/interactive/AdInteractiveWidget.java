package com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive;

import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.p2566g.C38002b;
import com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget;
import com.p2082ss.android.ugc.aweme.commercialize.widget.C39039a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.AdGestureGuidance;
import com.p2082ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.AdInteractiveWidget */
public final class AdInteractiveWidget extends AbsAdFeedWidget implements AbstractC33974au {

    /* renamed from: a */
    public static final C33280a f79048a = new C33280a((byte) 0);

    /* renamed from: h */
    private final AbstractC89244h f79049h = C89250i.m154773a((AbstractC89171a) C33281b.f79051a);

    /* renamed from: i */
    private FeedAdInteractiveLayout f79050i;

    static {
        Covode.recordClassIndex(40106);
    }

    /* renamed from: e */
    private final AbstractC33214c m68232e() {
        return (AbstractC33214c) this.f79049h.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget, com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.AdInteractiveWidget$a */
    public static final class C33280a {
        static {
            Covode.recordClassIndex(40107);
        }

        private C33280a() {
        }

        public /* synthetic */ C33280a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.AdInteractiveWidget$b */
    static final class C33281b extends AbstractC89220m implements AbstractC89171a<AbstractC33214c> {

        /* renamed from: a */
        public static final C33281b f79051a = new C33281b();

        static {
            Covode.recordClassIndex(40108);
        }

        C33281b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC33214c invoke() {
            AbstractC39043a a = CommercializeAdServiceImpl.m79243a().mo67720a(17);
            if (!(a instanceof AbstractC33214c)) {
                return null;
            }
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.AdInteractiveWidget$c */
    static final class CallableC33282c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f79052a;

        static {
            Covode.recordClassIndex(40109);
        }

        CallableC33282c(String str) {
            this.f79052a = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (!C38002b.m77063a(Uri.parse(this.f79052a))) {
                C38002b.m77062a(this.f79052a, new C38002b.AbstractC38004a() {
                    /* class com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive.AdInteractiveWidget.CallableC33282c.C332831 */

                    static {
                        Covode.recordClassIndex(40110);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.p2566g.C38002b.AbstractC38004a
                    /* renamed from: a */
                    public final void mo59242a() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.commercialize.p2566g.C38002b.AbstractC38004a
                    /* renamed from: b */
                    public final void mo59243b() {
                    }
                });
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: a */
    public final void mo59238a() {
        super.mo59238a();
        DataCenter dataCenter = this.f80273e;
        if (dataCenter != null) {
            dataCenter.mo60189a("ad_feed_show_interactive_ad", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_feed_bind_texture_size", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_feed_on_page_selected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_feed_on_page_unselected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_video_on_resume_play", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_on_fragment_pager_resume", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_on_fragment_pager_pause", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("on_ad_pop_up_web_page_hide", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("on_ad_pop_up_web_page_show", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_video_on_render_ready", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_on_holder_pause", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_on_holder_resume", (AbstractC1214u<C33942b>) this);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    public final /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: a */
    public final void mo59240a(C39039a aVar) {
        AwemeRawAd awemeRawAd;
        AdInteractionData adInteractionData;
        AdGestureGuidance gestureGuidance;
        UrlModel image;
        List<String> urlList;
        MethodCollector.m26663i(6670);
        C89219l.m154721d(aVar, "");
        super.mo59240a(aVar);
        AbstractC33214c e = m68232e();
        if (e == null || !e.mo59149c(this.f92081o)) {
            FeedAdInteractiveLayout feedAdInteractiveLayout = this.f79050i;
            if (feedAdInteractiveLayout != null) {
                feedAdInteractiveLayout.mo59257a((Aweme) null, (String) null);
                feedAdInteractiveLayout.setVisibility(8);
                MethodCollector.m26664o(6670);
                return;
            }
            MethodCollector.m26664o(6670);
            return;
        }
        if (this.f79050i == null) {
            View view = this.f80272d;
            if (view != null) {
                ViewStub viewStub = (ViewStub) view;
                viewStub.setLayoutResource(R.layout.af0);
                View inflate = viewStub.inflate();
                if (inflate != null) {
                    this.f79050i = (FeedAdInteractiveLayout) inflate;
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveLayout");
                    MethodCollector.m26664o(6670);
                    throw nullPointerException;
                }
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
                MethodCollector.m26664o(6670);
                throw nullPointerException2;
            }
        }
        FeedAdInteractiveLayout feedAdInteractiveLayout2 = this.f79050i;
        if (feedAdInteractiveLayout2 == null) {
            MethodCollector.m26664o(6670);
            return;
        }
        Aweme aweme = this.f92081o;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (adInteractionData = awemeRawAd.getAdInteractionData()) == null || (gestureGuidance = adInteractionData.getGestureGuidance()) == null || (image = gestureGuidance.getImage()) == null || (urlList = image.getUrlList()) == null || !(true ^ urlList.isEmpty())) {
            MethodCollector.m26664o(6670);
            return;
        }
        String str = urlList.get(0);
        C89219l.m154716b(str, "");
        C1731i.m5640b(new CallableC33282c(str), C1731i.f5562a);
        feedAdInteractiveLayout2.mo59257a(this.f92081o, str);
        feedAdInteractiveLayout2.setFragment(this.f92082p);
        feedAdInteractiveLayout2.setDataCenter(this.f80273e);
        feedAdInteractiveLayout2.setVisibility(8);
        MethodCollector.m26664o(6670);
    }

    /* JADX WARNING: Removed duplicated region for block: B:131:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:161:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:169:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00be  */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.widget.AbsAdFeedWidget
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59239a(com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b r15) {
        /*
        // Method dump skipped, instructions count: 584
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive.AdInteractiveWidget.mo59239a(com.ss.android.ugc.aweme.arch.widgets.base.b):void");
    }
}
