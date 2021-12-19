package com.bytedance.tiktok.homepage.mainfragment.toolbar;

import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.experiment.C46720aw;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49683k;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.live.p3398a.C58487a;
import com.p2082ss.android.ugc.aweme.main.C59014ae;
import com.p2082ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p2082ss.android.ugc.aweme.p2310al.C33491f;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p3668r.AbstractC66586a;
import com.p2082ss.android.ugc.aweme.p3682s.C67248d;
import com.p2082ss.android.ugc.aweme.story.live.C77354d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.d */
public final class C22774d extends AbstractC22773c implements AbstractC90252i, AbstractC90253j {

    /* renamed from: a */
    public int f53785a = 8388627;

    /* renamed from: b */
    public final C59014ae f53786b;

    /* renamed from: c */
    public final AbstractC22772b f53787c;

    /* renamed from: d */
    private AbstractC22775a f53788d;

    /* renamed from: e */
    private ImageView f53789e;

    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.d$a */
    public interface AbstractC22775a {
        static {
            Covode.recordClassIndex(26671);
        }

        /* renamed from: a */
        void mo37099a(boolean z);
    }

    static {
        Covode.recordClassIndex(26670);
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: a */
    public final boolean mo37085a() {
        return true;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(267, new RunnableC90250g(C22774d.class, "onUserLoginSuccessfully", C33491f.class, ThreadMode.MAIN, 0, false));
        hashMap.put(268, new RunnableC90250g(C22774d.class, "onLiveIconEntranceEnable", C49683k.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: c */
    public final int mo37087c() {
        return this.f53785a;
    }

    /* renamed from: e */
    private void m42979e() {
        ImageView imageView = this.f53789e;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: f */
    private void m42980f() {
        ImageView imageView = this.f53789e;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tiktok.homepage.mainfragment.toolbar.d$b */
    public static final class CallableC22776b<V> implements Callable {

        /* renamed from: a */
        public static final CallableC22776b f53790a = new CallableC22776b();

        static {
            Covode.recordClassIndex(26672);
        }

        CallableC22776b() {
        }

        @Override // java.util.concurrent.Callable
        public final Object call() {
            ILiveOuterService s = LiveOuterService.m107269s();
            C89219l.m154716b(s, "");
            s.mo95831e().mo95857a();
            return null;
        }
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: b */
    public final View mo37086b() {
        ImageView imageView = null;
        if (C46720aw.m90103b() || C46720aw.m90102a()) {
            View f = HomePageUIFrameServiceImpl.m108627e().mo89395f(this.f53787c.getActivity());
            if (f instanceof ImageView) {
                imageView = f;
            }
            this.f53789e = imageView;
            if (C67248d.m119180h()) {
                return this.f53789e;
            }
        } else {
            View g = HomePageUIFrameServiceImpl.m108627e().mo89396g(this.f53787c.getActivity());
            if (g instanceof ImageView) {
                imageView = g;
            }
            this.f53789e = (ImageView) imageView;
        }
        boolean a = C58487a.m107308a();
        int a2 = C34728n.m70946a(24.0d);
        int a3 = C34728n.m70946a(44.0d);
        if (a) {
            a2 = C34728n.m70946a(56.0d);
            a3 = C34728n.m70946a(56.0d);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a2, a3);
        if (!a) {
            if (this.f53785a == 8388627) {
                layoutParams.setMargins(C34728n.m70946a(16.0d), 0, 0, 0);
                int i = Build.VERSION.SDK_INT;
                layoutParams.setMarginStart(C34728n.m70946a(16.0d));
            } else {
                layoutParams.setMargins(0, 0, C34728n.m70946a(16.0d), 0);
                int i2 = Build.VERSION.SDK_INT;
                layoutParams.setMarginEnd(C34728n.m70946a(16.0d));
            }
        }
        if (C16048b.m29633a().mo25421a(true, "optimize_feed_tab_layout", false)) {
            layoutParams.topMargin = C34728n.m70946a(-3.0d);
        }
        ImageView imageView2 = this.f53789e;
        if (imageView2 == null) {
            C89219l.m154715b();
        }
        imageView2.setLayoutParams(layoutParams);
        ImageView imageView3 = this.f53789e;
        if (imageView3 == null) {
            C89219l.m154715b();
        }
        return imageView3;
    }

    /* renamed from: a */
    private final void m42978a(boolean z) {
        if (!z) {
            m42979e();
        } else {
            m42980f();
        }
    }

    /* renamed from: a */
    public final void mo37096a(AbstractC22775a aVar) {
        EventBus.m156966a(EventBus.m156962a(), this);
        this.f53788d = aVar;
        C1731i.m5640b(CallableC22776b.f53790a, C40780g.m82241a());
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onUserLoginSuccessfully(C33491f fVar) {
        m42978a(false);
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95831e().mo95857a();
    }

    @Override // com.bytedance.tiktok.homepage.mainfragment.toolbar.AbstractC22773c
    /* renamed from: a */
    public final void mo37084a(View view) {
        String str;
        C89219l.m154721d(view, "");
        ImageView imageView = this.f53789e;
        if (imageView != null && imageView.getVisibility() == 0) {
            C59014ae aeVar = this.f53786b;
            if (aeVar == null || aeVar.af_()) {
                C59014ae aeVar2 = this.f53786b;
                ActivityC0945e eVar = null;
                if (aeVar2 != null && aeVar2.getActivity() != null) {
                    C59014ae aeVar3 = this.f53786b;
                    if (aeVar3 == null || !aeVar3.mo89965k()) {
                        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
                        enterRoomConfig.f28233c.f28298O = true;
                        EnterRoomConfig.LogData logData = enterRoomConfig.f28232b;
                        if (this.f53785a == 8388627) {
                            str = "top_left";
                        } else {
                            str = "top_right";
                        }
                        logData.f28250G = str;
                        C77354d.m135260a("homepage_hot", "");
                        ILiveOuterService s = LiveOuterService.m107269s();
                        C89219l.m154716b(s, "");
                        AbstractC66586a i = s.mo95835i();
                        C59014ae aeVar4 = this.f53786b;
                        if (aeVar4 != null) {
                            eVar = aeVar4.getActivity();
                        }
                        i.mo105595b(eVar, enterRoomConfig, "homepage_hot");
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x003d  */
    @org.greenrobot.eventbus.AbstractC90264r(mo145422a = org.greenrobot.eventbus.ThreadMode.MAIN)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLiveIconEntranceEnable(com.p2082ss.android.ugc.aweme.feed.p2949i.C49683k r7) {
        /*
            r6 = this;
            java.lang.String r5 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r7, r5)
            boolean r0 = r7.f114351a
            r4 = 0
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.framework.services.IUserService r0 = com.p2082ss.android.ugc.aweme.services.BaseUserService.createIUserServicebyMonsterPlugin(r4)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r5)
            boolean r0 = r0.isLogin()
            if (r0 == 0) goto L_0x0044
            r3 = 1
            java.lang.String r0 = "homepage_hot"
            com.p2082ss.android.ugc.aweme.story.live.C77354d.m135258a(r0)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.String r1 = "source"
            java.lang.String r0 = "for_you_feed_toplives"
            r2.put(r1, r0)
            com.ss.android.ugc.aweme.live.ILiveOuterService r0 = com.p2082ss.android.ugc.aweme.live.LiveOuterService.m107269s()
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r5)
            com.ss.android.ugc.aweme.live.j r1 = r0.mo95839m()
            java.lang.String r0 = "ttlive_homepage_toplives_entrance"
            r1.mo34111a(r0, r4, r2)
        L_0x0039:
            com.bytedance.tiktok.homepage.mainfragment.toolbar.d$a r0 = r6.f53788d
            if (r0 == 0) goto L_0x0040
            r0.mo37099a(r3)
        L_0x0040:
            r6.m42978a(r3)
            return
        L_0x0044:
            r3 = 0
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.tiktok.homepage.mainfragment.toolbar.C22774d.onLiveIconEntranceEnable(com.ss.android.ugc.aweme.feed.i.k):void");
    }

    public C22774d(C59014ae aeVar, AbstractC22772b bVar) {
        C89219l.m154721d(aeVar, "");
        C89219l.m154721d(bVar, "");
        this.f53786b = aeVar;
        this.f53787c = bVar;
    }
}
