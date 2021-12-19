package com.p2082ss.android.ugc.aweme.p2282ad.feed.sticker;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.p1184ui.common.BulletContainerView;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38229ao;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38244m;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import org.greenrobot.eventbus.EventBus;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.sticker.a */
public final class C33337a implements AbstractC1214u<C33942b>, AbstractC33252e {

    /* renamed from: f */
    public static final C33338a f79197f = new C33338a((byte) 0);

    /* renamed from: a */
    public FeedAdLynxSticker f79198a;

    /* renamed from: b */
    C38244m f79199b;

    /* renamed from: c */
    public boolean f79200c;

    /* renamed from: d */
    C38229ao f79201d;

    /* renamed from: e */
    public String f79202e;

    /* renamed from: g */
    private Aweme f79203g;

    /* renamed from: h */
    private DataCenter f79204h;

    /* renamed from: i */
    private FrameLayout f79205i;

    /* renamed from: j */
    private final Handler f79206j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    private ViewStub f79207k;

    static {
        Covode.recordClassIndex(40174);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.sticker.a$a */
    public static final class C33338a {
        static {
            Covode.recordClassIndex(40175);
        }

        private C33338a() {
        }

        public /* synthetic */ C33338a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e
    /* renamed from: c */
    public final boolean mo59209c() {
        return this.f79200c;
    }

    /* renamed from: d */
    public final boolean mo59339d() {
        C38244m mVar = this.f79199b;
        if (mVar == null || mVar.getShowSeconds() <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e
    /* renamed from: a */
    public final void mo59204a() {
        FeedAdLynxSticker feedAdLynxSticker;
        if (C37699a.m76214Q(this.f79203g) && !this.f79200c && (feedAdLynxSticker = this.f79198a) != null) {
            feedAdLynxSticker.mo59284d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e
    /* renamed from: b */
    public final void mo59208b() {
        FrameLayout frameLayout = this.f79205i;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        this.f79200c = false;
        this.f79206j.removeCallbacksAndMessages(null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.sticker.a$b */
    static final class RunnableC33339b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C33337a f79208a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f79209b;

        static {
            Covode.recordClassIndex(40176);
        }

        RunnableC33339b(C33337a aVar, FrameLayout frameLayout) {
            this.f79208a = aVar;
            this.f79209b = frameLayout;
        }

        public final void run() {
            FeedAdLynxSticker feedAdLynxSticker;
            FeedAdLynxSticker feedAdLynxSticker2;
            int width;
            int height;
            int i;
            int i2;
            int i3;
            int i4;
            FeedAdLynxSticker feedAdLynxSticker3 = this.f79208a.f79198a;
            if (feedAdLynxSticker3 == null || !feedAdLynxSticker3.f79101d) {
                this.f79208a.f79202e = "data_load_fail";
                if (this.f79208a.mo59339d() && (feedAdLynxSticker = this.f79208a.f79198a) != null) {
                    feedAdLynxSticker.mo59282b(this.f79208a.f79202e);
                    return;
                }
                return;
            }
            FeedAdLynxSticker feedAdLynxSticker4 = this.f79208a.f79198a;
            if (feedAdLynxSticker4 == null || !feedAdLynxSticker4.f79191j) {
                this.f79208a.f79202e = "load_timeout";
                if (this.f79208a.mo59339d() && (feedAdLynxSticker2 = this.f79208a.f79198a) != null) {
                    feedAdLynxSticker2.mo59282b(this.f79208a.f79202e);
                    return;
                }
                return;
            }
            C33337a aVar = this.f79208a;
            FrameLayout frameLayout = this.f79209b;
            ViewParent parent = frameLayout.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            C38244m mVar = aVar.f79199b;
            if (mVar != null) {
                C38229ao aoVar = aVar.f79201d;
                if (aoVar != null) {
                    width = aoVar.f90317a;
                } else {
                    width = viewGroup.getWidth();
                }
                C38229ao aoVar2 = aVar.f79201d;
                if (aoVar2 != null) {
                    height = aoVar2.f90318b;
                } else {
                    height = viewGroup.getHeight();
                }
                if (width < viewGroup.getWidth()) {
                    i = (viewGroup.getWidth() - width) / 2;
                } else {
                    i = 0;
                }
                if (height < viewGroup.getHeight()) {
                    i2 = (viewGroup.getHeight() - height) / 2;
                } else {
                    i2 = 0;
                }
                float f = (float) width;
                float f2 = (float) height;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) (mVar.getWidth() * f), (int) (mVar.getHeight() * f2));
                BulletContainerView bulletContainerView = (BulletContainerView) frameLayout.findViewById(R.id.zl);
                C89219l.m154716b(bulletContainerView, "");
                bulletContainerView.setLayoutParams(layoutParams);
                if (width > viewGroup.getWidth()) {
                    i3 = (width - viewGroup.getWidth()) / 2;
                } else {
                    i3 = 0;
                }
                if (height > viewGroup.getHeight()) {
                    i4 = (height - viewGroup.getHeight()) / 2;
                } else {
                    i4 = 0;
                }
                float positionX = ((f * mVar.getPositionX()) - ((float) i3)) + ((float) i);
                float positionY = ((f2 * mVar.getPositionY()) - ((float) i4)) + ((float) i2);
                if (C80471gb.m139482a()) {
                    positionX = -positionX;
                }
                frameLayout.setTranslationX(positionX);
                frameLayout.setTranslationY(positionY);
                frameLayout.setRotation(mVar.getAngle());
            }
            this.f79209b.setVisibility(0);
            if (this.f79208a.mo59339d()) {
                FeedAdLynxSticker feedAdLynxSticker5 = this.f79208a.f79198a;
                if (feedAdLynxSticker5 != null) {
                    feedAdLynxSticker5.mo59286f();
                }
                FeedAdLynxSticker feedAdLynxSticker6 = this.f79208a.f79198a;
                if (feedAdLynxSticker6 != null) {
                    feedAdLynxSticker6.mo59200a("event_card_show");
                }
            }
            this.f79208a.f79200c = true;
        }
    }

    public C33337a(ViewStub viewStub) {
        C89219l.m154721d(viewStub, "");
        this.f79207k = viewStub;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e
    /* renamed from: a */
    public final void mo59205a(long j) {
        FrameLayout frameLayout;
        if (C37699a.m76214Q(this.f79203g) && (frameLayout = this.f79205i) != null && !this.f79200c) {
            this.f79206j.postDelayed(new RunnableC33339b(this, frameLayout), j);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e
    /* renamed from: a */
    public final void mo59206a(DataCenter dataCenter) {
        this.f79204h = dataCenter;
        if (dataCenter != null) {
            dataCenter.mo60189a("ad_feed_on_page_selected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_feed_on_page_unselected", (AbstractC1214u<C33942b>) this);
            dataCenter.mo60189a("ad_feed_bind_texture_size", (AbstractC1214u<C33942b>) this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33252e
    /* renamed from: a */
    public final void mo59207a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        MethodCollector.m26663i(7335);
        C38244m mVar = null;
        if (!C37699a.m76214Q(aweme)) {
            this.f79203g = null;
            FeedAdLynxSticker feedAdLynxSticker = this.f79198a;
            if (feedAdLynxSticker != null) {
                feedAdLynxSticker.mo59280a((Aweme) null);
                MethodCollector.m26664o(7335);
                return;
            }
            MethodCollector.m26664o(7335);
            return;
        }
        this.f79203g = aweme;
        if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
            mVar = awemeRawAd.getStickerData();
        }
        this.f79199b = mVar;
        if (this.f79207k.getParent() != null) {
            this.f79207k.setLayoutResource(R.layout.af3);
            View inflate = this.f79207k.inflate();
            if (inflate != null) {
                this.f79205i = (FrameLayout) inflate;
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
                MethodCollector.m26664o(7335);
                throw nullPointerException;
            }
        }
        FrameLayout frameLayout = this.f79205i;
        if (frameLayout == null) {
            MethodCollector.m26664o(7335);
            return;
        }
        if (this.f79198a == null) {
            this.f79198a = new FeedAdLynxSticker(frameLayout, this);
        }
        FeedAdLynxSticker feedAdLynxSticker2 = this.f79198a;
        if (feedAdLynxSticker2 != null) {
            feedAdLynxSticker2.mo59280a(aweme);
        }
        mo59208b();
        MethodCollector.m26664o(7335);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        C33942b bVar2 = bVar;
        if (C37699a.m76214Q(this.f79203g) && bVar2 != null && (str = bVar2.f80277a) != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1540531799) {
                if (hashCode != -1304146782) {
                    if (hashCode == -1132409520 && str.equals("ad_feed_on_page_selected")) {
                        FeedAdLynxSticker feedAdLynxSticker = this.f79198a;
                        if (feedAdLynxSticker != null) {
                            EventBus.m156966a(EventBus.m156962a(), feedAdLynxSticker);
                        }
                        C38244m mVar = this.f79199b;
                        if (mVar != null && mVar.getShowSeconds() == 0) {
                            if (this.f79200c) {
                                FeedAdLynxSticker feedAdLynxSticker2 = this.f79198a;
                                if (feedAdLynxSticker2 != null) {
                                    feedAdLynxSticker2.mo59286f();
                                    return;
                                }
                                return;
                            }
                            FeedAdLynxSticker feedAdLynxSticker3 = this.f79198a;
                            if (feedAdLynxSticker3 != null) {
                                feedAdLynxSticker3.mo59282b(this.f79202e);
                            }
                        }
                    }
                } else if (str.equals("ad_feed_bind_texture_size")) {
                    Object a = bVar2.mo60212a();
                    C89219l.m154716b(a, "");
                    this.f79201d = (C38229ao) a;
                }
            } else if (str.equals("ad_feed_on_page_unselected")) {
                FeedAdLynxSticker feedAdLynxSticker4 = this.f79198a;
                if (feedAdLynxSticker4 != null) {
                    EventBus.m156962a().mo145395b(feedAdLynxSticker4);
                }
                if (mo59339d()) {
                    mo59208b();
                }
            }
        }
    }
}
