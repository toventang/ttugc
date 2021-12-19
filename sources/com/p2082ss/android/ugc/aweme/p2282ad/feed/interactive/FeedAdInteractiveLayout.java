package com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.fresco.animation.p1867c.AbstractC24295b;
import com.facebook.fresco.animation.p1867c.C24290a;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38229ao;
import com.p2082ss.android.ugc.aweme.commercialize.p2566g.C38006d;
import com.p2082ss.android.ugc.aweme.component.music.MusicService;
import com.p2082ss.android.ugc.aweme.feed.model.AdInteractionData;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61066c;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive.FeedAdInteractiveAwardMask;
import com.p2082ss.android.ugc.musicprovider.p4318a.C84126a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveLayout */
public final class FeedAdInteractiveLayout extends FrameLayout implements AbstractC33299d {

    /* renamed from: o */
    public static final C33292a f79074o = new C33292a((byte) 0);

    /* renamed from: a */
    SimpleDraweeView f79075a;

    /* renamed from: b */
    FeedAdInteractiveDrawView f79076b;

    /* renamed from: c */
    FeedAdInteractiveClickView f79077c;

    /* renamed from: d */
    Aweme f79078d;

    /* renamed from: e */
    AdInteractionData f79079e;

    /* renamed from: f */
    String f79080f;

    /* renamed from: g */
    public C24290a f79081g;

    /* renamed from: h */
    C38229ao f79082h;

    /* renamed from: i */
    public boolean f79083i;

    /* renamed from: j */
    public boolean f79084j;

    /* renamed from: k */
    boolean f79085k;

    /* renamed from: l */
    boolean f79086l;

    /* renamed from: m */
    public int f79087m;

    /* renamed from: n */
    AbstractC61066c f79088n;

    /* renamed from: p */
    private Fragment f79089p;

    /* renamed from: q */
    private DataCenter f79090q;

    static {
        Covode.recordClassIndex(40122);
    }

    public FeedAdInteractiveLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveLayout$a */
    public static final class C33292a {
        static {
            Covode.recordClassIndex(40123);
        }

        private C33292a() {
        }

        public /* synthetic */ C33292a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive.AbstractC33299d
    /* renamed from: c */
    public final void mo59259c() {
        m68243i();
    }

    public final DataCenter getDataCenter() {
        return this.f79090q;
    }

    public final Fragment getFragment() {
        return this.f79089p;
    }

    public final C38229ao getTextureSize() {
        return this.f79082h;
    }

    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive.AbstractC33299d
    /* renamed from: e */
    public final void mo59261e() {
        mo59262f();
        mo59268h();
    }

    /* access modifiers changed from: package-private */
    public final C24202c<AbstractC24457f> getControllerListener() {
        return new C33293b(this);
    }

    /* renamed from: a */
    public final void mo59256a() {
        this.f79086l = false;
        mo59262f();
        mo59260d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo59263g() {
        DataCenter dataCenter = this.f79090q;
        if (dataCenter != null) {
            dataCenter.mo60191a("ad_feed_pause_video", (Object) null);
        }
    }

    /* renamed from: h */
    public final void mo59268h() {
        DataCenter dataCenter = this.f79090q;
        if (dataCenter != null) {
            dataCenter.mo60191a("ad_feed_resume_video", (Object) null);
        }
    }

    /* renamed from: i */
    private final void m68243i() {
        AwemeRawAd awemeRawAd;
        Aweme aweme = this.f79078d;
        if (aweme != null) {
            awemeRawAd = aweme.getAwemeRawAd();
        } else {
            awemeRawAd = null;
        }
        C18129a.m33746a("draw_ad", "otherclick", awemeRawAd).mo28900b("refer", "interactive_gesture").mo28901b();
    }

    /* renamed from: d */
    public final void mo59260d() {
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity != null) {
            FeedAdInteractiveAwardMask feedAdInteractiveAwardMask = (FeedAdInteractiveAwardMask) activity.findViewById(R.id.azu);
            if (!(feedAdInteractiveAwardMask == null || feedAdInteractiveAwardMask.getVisibility() == 8)) {
                feedAdInteractiveAwardMask.setVisibility(8);
            }
            this.f79085k = false;
        }
    }

    /* renamed from: f */
    public final void mo59262f() {
        C24290a aVar;
        this.f79084j = false;
        setVisibility(8);
        C24290a aVar2 = this.f79081g;
        if (!(aVar2 == null || !aVar2.isRunning() || (aVar = this.f79081g) == null)) {
            aVar.stop();
        }
        this.f79081g = null;
        AbstractC61066c cVar = this.f79088n;
        if (cVar != null) {
            cVar.mo98591c();
        }
        this.f79088n = null;
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.el);
        C89219l.m154716b(findViewById, "");
        this.f79075a = (SimpleDraweeView) findViewById;
        View findViewById2 = findViewById(R.id.ek);
        C89219l.m154716b(findViewById2, "");
        this.f79076b = (FeedAdInteractiveDrawView) findViewById2;
        View findViewById3 = findViewById(R.id.ej);
        C89219l.m154716b(findViewById3, "");
        this.f79077c = (FeedAdInteractiveClickView) findViewById3;
        SimpleDraweeView simpleDraweeView = this.f79075a;
        if (simpleDraweeView == null) {
            C89219l.m154710a("interactiveGuideView");
        }
        Context context = getContext();
        C89219l.m154716b(context, "");
        simpleDraweeView.setHierarchy(new C24247b(context.getResources()).mo39976a(C24229q.AbstractC24231b.f57454d).mo39973a());
        FeedAdInteractiveDrawView feedAdInteractiveDrawView = this.f79076b;
        if (feedAdInteractiveDrawView == null) {
            C89219l.m154710a("interactiveDrawView");
        }
        feedAdInteractiveDrawView.setInteractiveListener(this);
        FeedAdInteractiveClickView feedAdInteractiveClickView = this.f79077c;
        if (feedAdInteractiveClickView == null) {
            C89219l.m154710a("interactiveClickView");
        }
        feedAdInteractiveClickView.setInteractiveListener(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (r10 == null) goto L_0x002f;
     */
    @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive.AbstractC33299d
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo59258b() {
        /*
        // Method dump skipped, instructions count: 380
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive.FeedAdInteractiveLayout.mo59258b():void");
    }

    public final void setDataCenter(DataCenter dataCenter) {
        this.f79090q = dataCenter;
    }

    public final void setFragment(Fragment fragment) {
        this.f79089p = fragment;
    }

    public final void setTextureSize(C38229ao aoVar) {
        this.f79082h = aoVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveLayout$b */
    public static final class C33293b extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ FeedAdInteractiveLayout f79091a;

        static {
            Covode.recordClassIndex(40124);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33293b(FeedAdInteractiveLayout feedAdInteractiveLayout) {
            this.f79091a = feedAdInteractiveLayout;
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFailure(String str, Throwable th) {
            if (th != null) {
                th.getMessage();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            AwemeRawAd awemeRawAd;
            UrlModel music;
            List<String> urlList;
            try {
                if (!this.f79091a.f79083i) {
                    return;
                }
                if (animatable == null || !(animatable instanceof C24290a)) {
                    this.f79091a.mo59262f();
                    return;
                }
                this.f79091a.f79084j = true;
                Aweme aweme = this.f79091a.f79078d;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C18129a.m33746a("draw_ad", "othershow", awemeRawAd).mo28900b("refer", "interactive_gesture").mo28901b();
                this.f79091a.f79081g = (C24290a) animatable;
                FeedAdInteractiveLayout feedAdInteractiveLayout = this.f79091a;
                C24290a aVar = (C24290a) animatable;
                AdInteractionData adInteractionData = feedAdInteractiveLayout.f79079e;
                if (adInteractionData != null) {
                    C38006d dVar = new C38006d(aVar.f57588d, 1);
                    aVar.mo40069a(dVar);
                    aVar.mo40070a(new C33295d(feedAdInteractiveLayout, dVar));
                    aVar.start();
                    if (adInteractionData.getInteractionType() == 0) {
                        FeedAdInteractiveClickView feedAdInteractiveClickView = feedAdInteractiveLayout.f79077c;
                        if (feedAdInteractiveClickView == null) {
                            C89219l.m154710a("interactiveClickView");
                        }
                        feedAdInteractiveClickView.setVisibility(0);
                        FeedAdInteractiveDrawView feedAdInteractiveDrawView = feedAdInteractiveLayout.f79076b;
                        if (feedAdInteractiveDrawView == null) {
                            C89219l.m154710a("interactiveDrawView");
                        }
                        feedAdInteractiveDrawView.setVisibility(8);
                    } else {
                        FeedAdInteractiveClickView feedAdInteractiveClickView2 = feedAdInteractiveLayout.f79077c;
                        if (feedAdInteractiveClickView2 == null) {
                            C89219l.m154710a("interactiveClickView");
                        }
                        feedAdInteractiveClickView2.setVisibility(8);
                        FeedAdInteractiveDrawView feedAdInteractiveDrawView2 = feedAdInteractiveLayout.f79076b;
                        if (feedAdInteractiveDrawView2 == null) {
                            C89219l.m154710a("interactiveDrawView");
                        }
                        feedAdInteractiveDrawView2.setVisibility(0);
                    }
                    feedAdInteractiveLayout.mo59263g();
                    AdInteractionData adInteractionData2 = feedAdInteractiveLayout.f79079e;
                    if (adInteractionData2 != null && (music = adInteractionData2.getMusic()) != null && (urlList = music.getUrlList()) != null && !urlList.isEmpty()) {
                        AbstractC61066c a = MusicService.m81198m().mo69294a(feedAdInteractiveLayout.getContext());
                        C84126a aVar2 = new C84126a();
                        aVar2.f187737b = urlList;
                        a.mo98586a(aVar2, true);
                        feedAdInteractiveLayout.f79088n = a;
                    }
                }
            } catch (Throwable th) {
                C51423a.m95790a(th);
                th.getMessage();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveLayout$c */
    public static final class C33294c implements FeedAdInteractiveAwardMask.AbstractC33284a {

        /* renamed from: a */
        final /* synthetic */ FeedAdInteractiveLayout f79092a;

        static {
            Covode.recordClassIndex(40125);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C33294c(FeedAdInteractiveLayout feedAdInteractiveLayout) {
            this.f79092a = feedAdInteractiveLayout;
        }

        @Override // com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive.FeedAdInteractiveAwardMask.AbstractC33284a
        /* renamed from: a */
        public final void mo59249a(boolean z) {
            AwemeRawAd awemeRawAd;
            this.f79092a.mo59260d();
            if (z) {
                this.f79092a.mo59268h();
                Aweme aweme = this.f79092a.f79078d;
                if (aweme != null) {
                    awemeRawAd = aweme.getAwemeRawAd();
                } else {
                    awemeRawAd = null;
                }
                C18129a.m33746a("draw_ad", "close", awemeRawAd).mo28900b("refer", "popup_window").mo28901b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveLayout$d */
    public static final class C33295d implements AbstractC24295b {

        /* renamed from: a */
        final /* synthetic */ FeedAdInteractiveLayout f79093a;

        /* renamed from: b */
        final /* synthetic */ C38006d f79094b;

        static {
            Covode.recordClassIndex(40126);
        }

        @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
        /* renamed from: a */
        public final void mo9283a(C24290a aVar) {
            C89219l.m154721d(aVar, "");
        }

        @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
        /* renamed from: b */
        public final void mo9285b(C24290a aVar) {
            C89219l.m154721d(aVar, "");
        }

        @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
        /* renamed from: c */
        public final void mo9286c(C24290a aVar) {
            C89219l.m154721d(aVar, "");
        }

        C33295d(FeedAdInteractiveLayout feedAdInteractiveLayout, C38006d dVar) {
            this.f79093a = feedAdInteractiveLayout;
            this.f79094b = dVar;
        }

        @Override // com.facebook.fresco.animation.p1867c.AbstractC24295b
        /* renamed from: a */
        public final void mo9284a(C24290a aVar, int i) {
            C89219l.m154721d(aVar, "");
            this.f79093a.f79087m = i;
            if (i == this.f79094b.mo40050e() - 1) {
                this.f79093a.mo59262f();
                this.f79093a.mo59268h();
            }
        }
    }

    /* renamed from: a */
    public final void mo59257a(Aweme aweme, String str) {
        AdInteractionData adInteractionData;
        AwemeRawAd awemeRawAd;
        this.f79078d = aweme;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            adInteractionData = null;
        } else {
            adInteractionData = awemeRawAd.getAdInteractionData();
        }
        this.f79079e = adInteractionData;
        this.f79080f = str;
    }

    /* renamed from: a */
    private static Object m68242a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(6590);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(6590);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    private /* synthetic */ FeedAdInteractiveLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FeedAdInteractiveLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6736);
        MethodCollector.m26664o(6736);
    }
}
