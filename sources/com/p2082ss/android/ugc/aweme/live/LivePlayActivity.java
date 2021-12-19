package com.p2082ss.android.ugc.aweme.live;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import androidx.fragment.app.AbstractC0976n;
import com.bytedance.android.C2690b;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p255l.AbstractC4374a;
import com.bytedance.android.live.p408u.C6204h;
import com.bytedance.android.livesdk.AbstractC10135q;
import com.bytedance.android.livesdk.feed.FullDraggableContainer;
import com.bytedance.android.livesdk.feed.LiveDrawerSettings;
import com.bytedance.android.livesdk.livesetting.other.LiveDrawerVersion;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveOptRoomNetUnavailable;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import com.bytedance.android.livesdk.utils.C11226ao;
import com.bytedance.android.livesdk.watch.AbstractC11321b;
import com.bytedance.android.livesdk.watch.AbstractC11322c;
import com.bytedance.android.livesdkapi.AbstractC11615c;
import com.bytedance.android.livesdkapi.C11755f;
import com.bytedance.android.livesdkapi.depend.model.live.C11725f;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11650h;
import com.bytedance.android.livesdkapi.p691g.AbstractC11762c;
import com.bytedance.android.livesdkapi.p700m.C11830c;
import com.bytedance.android.livesdkapi.session.C11870f;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnumC11866b;
import com.bytedance.android.livesdkapi.session.Event;
import com.bytedance.android.livesdkapi.view.AbstractC11873b;
import com.bytedance.android.p145b.p146a.C2695a;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.p1469l.p1473b.C20700a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.sdk.p2174a.C30222a;
import com.p2082ss.android.ugc.aweme.app.p2321b.C33716a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f;
import com.p2082ss.android.ugc.aweme.feed.C48020ab;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.live.C58492ad;
import com.p2082ss.android.ugc.aweme.live.p3410g.C58635a;
import com.p2082ss.android.ugc.aweme.live.p3410g.C58641e;
import com.p2082ss.android.ugc.aweme.live.p3411h.C58645a;
import com.p2082ss.android.ugc.aweme.main.AbstractC59053bc;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.C56257j;
import com.p2082ss.android.ugc.aweme.utils.C80422fe;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;

/* renamed from: com.ss.android.ugc.aweme.live.LivePlayActivity */
public class LivePlayActivity extends ActivityC58486a implements AbstractC10135q, AbstractC11615c, AbstractC11762c, AbstractC34471f, AbstractC90252i, AbstractC90253j {

    /* renamed from: g */
    private static long f133148g;

    /* renamed from: a */
    public C58641e.C58642a f133149a = new C58641e.C58642a();

    /* renamed from: b */
    private Rect f133150b;

    /* renamed from: c */
    private AbstractC11650h f133151c;

    /* renamed from: d */
    private boolean f133152d = false;

    /* renamed from: e */
    private boolean f133153e = false;

    /* renamed from: f */
    private boolean f133154f = false;

    /* renamed from: h */
    private C58645a f133155h;

    /* renamed from: i */
    private boolean f133156i = false;

    /* renamed from: j */
    private AbstractC34467b f133157j = null;

    /* renamed from: k */
    private AbstractC11321b f133158k;

    static {
        Covode.recordClassIndex(68774);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.live.ActivityC58486a
    /* renamed from: e */
    public final int mo95845e() {
        return 0;
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(26, new RunnableC90250g(LivePlayActivity.class, "onEvent", C56257j.class, ThreadMode.POSTING, 0, false));
        hashMap.put(43, new RunnableC90250g(LivePlayActivity.class, "onEvent", C30222a.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @AbstractC90264r
    public void onEvent(C56257j jVar) {
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.bytedance.android.livesdk.AbstractC10135q
    /* renamed from: a */
    public final AbstractC11321b mo16975a() {
        return this.f133158k;
    }

    @Override // com.bytedance.android.livesdkapi.AbstractC11615c
    /* renamed from: c */
    public final void mo18409c() {
        C58645a aVar = this.f133155h;
        if (aVar != null) {
            aVar.mo96096a();
        }
    }

    @Override // com.bytedance.android.livesdkapi.AbstractC11615c
    /* renamed from: d */
    public final void mo18410d() {
        C58645a aVar = this.f133155h;
        if (aVar != null) {
            aVar.mo96097b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo95851h() {
        overridePendingTransition(0, 0);
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        AbstractC11650h hVar = this.f133151c;
        if (hVar != null) {
            hVar.mo12716s();
        }
    }

    /* renamed from: g */
    public final void mo95850g() {
        if (!this.f133152d) {
            m107295i();
            super.finish();
            return;
        }
        C58635a.m107765a(findViewById(R.id.dnh), this.f133150b, new RunnableC58579am(this));
    }

    /* renamed from: i */
    private void m107295i() {
        if (getIntent() != null) {
            long longExtra = getIntent().getLongExtra("current_room_id", 0);
            boolean booleanExtra = getIntent().getBooleanExtra("has_page_slide", false);
            if (longExtra > 0 && booleanExtra) {
                LiveHostOuterService.m107232p().mo95799a(longExtra);
            }
        }
    }

    /* renamed from: j */
    private static boolean m107296j() {
        EnterRoomConfig enterRoomConfig = C11870f.C11871a.f28404a.mo19010a().f28391b;
        if (!C80580in.m139687c() && !C80580in.m139691e()) {
            return false;
        }
        String str = enterRoomConfig.f28233c.f28295L;
        String str2 = enterRoomConfig.f28233c.f28295L;
        HashMap hashMap = new HashMap();
        hashMap.put("enter_from_merge", str);
        hashMap.put("enter_method", str2);
        C20700a.C20701a.f48888a.mo34111a("ttlive_minor_mode_live", 1, hashMap);
        return true;
    }

    @Override // com.bytedance.android.livesdk.AbstractC10135q
    /* renamed from: b */
    public final void mo16976b() {
        if (!LiveDrawerVersion.INSTANCE.getValue() && this.f133158k == null) {
            AbstractC0976n a = getSupportFragmentManager().mo3552a();
            AbstractC11321b a2 = C11755f.m20713a().mo12975a((FullDraggableContainer) findViewById(R.id.dnh), new Bundle());
            this.f133158k = a2;
            a.mo3453a(R.id.cbh, a2.mo14739b()).mo3473c();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        AbstractC11321b bVar = this.f133158k;
        if (bVar == null || !bVar.mo14741c()) {
            AbstractC11650h hVar = this.f133151c;
            if (hVar != null && (hVar.mo12701b() instanceof AbstractC11873b) && !((AbstractC11873b) this.f133151c.mo12701b()).mo12706g()) {
                super.onBackPressed();
                return;
            }
            return;
        }
        C2695a.f8059g.f8063c = "close_btn";
        this.f133158k.mo14738a(false, true);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        if (EnterTransitionCrashOptimizer.getContext() != null && Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused) {
            }
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                getWindow().getDecorView().getViewTreeObserver().dispatchOnPreDraw();
            } catch (Throwable unused2) {
            }
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        C2690b.m7786a();
        C2695a aVar = C2695a.f8059g;
        aVar.f8062b = null;
        aVar.f8065e = 0;
        aVar.f8061a = 0;
        aVar.mo7216a().clear();
        aVar.mo7219b().clear();
        aVar.f8063c = "scroll";
        aVar.f8064d = "drawer";
        aVar.f8066f = 0;
        Live.getService().mo13044y();
        AbstractC4374a x = Live.getService().mo13043x();
        if (x != null) {
            x.mo10135b(false);
        }
        String a = m107292a(getIntent(), "player_tag");
        if (!(a == null || Live.getService() == null)) {
            Live.getService().mo13022d(a);
        }
        Live.getService().mo13026g().mo16682b(hashCode());
        if (this.f133151c == null) {
            C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("liveplay_activity_ondestory", 33814, EnumC11866b.SdkInterfaceCall));
        }
        if (this.f133156i) {
            AbstractC81915c.m141874a(new C48020ab(true));
        }
        C11725f.f28049a = null;
        AbstractC11322c b = Live.getService().mo13011b();
        if (b != null) {
            b.mo13687a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0117  */
    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
        // Method dump skipped, instructions count: 391
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.live.LivePlayActivity.finish():void");
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f
    public void setActivityResultListener(AbstractC34467b bVar) {
        this.f133157j = bVar;
    }

    @AbstractC90264r
    public void onEvent(C30222a aVar) {
        if (Live.getService() != null) {
            Live.getService().mo13033n();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C11870f.C11871a.f28404a.mo19011a(bundle);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C11870f fVar = C11870f.C11871a.f28404a;
        if (bundle != null) {
            bundle.putString("enter_room_session_id", fVar.f28402a);
            bundle.putParcelable("enter_room_session", fVar.mo19010a());
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, android.view.ContextThemeWrapper, androidx.appcompat.app.ActivityC0218d, android.app.Activity
    public void setTheme(int i) {
        if (getIntent().getBooleanExtra("smooth_enter_room", false)) {
            super.setTheme(R.style.zk);
        } else {
            super.setTheme(R.style.zl);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.AbstractC17736b, com.bytedance.ies.powerpage.ActivityC17733a
    public void onNewIntent(Intent intent) {
        AbstractC11650h hVar;
        boolean z;
        AbstractC11321b bVar;
        super.onNewIntent(intent);
        if (intent != null) {
            Event event = new Event("live_play_create_room_fg", 2820, EnumC11866b.SdkInterfaceCall);
            event.mo19003a("onNewIntent");
            C11870f.C11871a.f28404a.mo19010a().mo18994a(event);
            AbstractC11650h hVar2 = this.f133151c;
            if (hVar2 == null || hVar2.mo12702c() == null) {
                hVar = null;
                z = false;
            } else {
                EnterRoomConfig w = this.f133151c.mo12702c().mo14149w();
                if (w == null) {
                    z = false;
                } else {
                    z = w.f28233c.f28298O;
                }
                hVar = this.f133151c;
                if (!(hVar instanceof AbstractC11650h)) {
                    hVar = null;
                }
            }
            EnterRoomConfig enterRoomConfig = C11870f.C11871a.f28404a.mo19010a().f28391b;
            long longExtra = intent.getLongExtra("room_id", 0);
            if (longExtra != -3) {
                if (longExtra == -4) {
                    if (!(getIntent() == null || getIntent().getLongExtra("room_id", 0) == -3)) {
                        C58645a aVar = this.f133155h;
                        if (aVar == null) {
                            return;
                        }
                        if (!aVar.f133547c && !aVar.f133548d) {
                            return;
                        }
                    }
                    finish();
                    return;
                }
                if (getIntent() == null || getIntent().getLongExtra("room_id", 0) == -3) {
                    setIntent(intent);
                } else {
                    this.f133155h = null;
                }
                if (z && ("push".equals(enterRoomConfig.f28233c.f28293J) || "push".equals(enterRoomConfig.f28233c.f28295L))) {
                    enterRoomConfig.f28233c.f28298O = true;
                }
                enterRoomConfig.f28233c.f28301R = longExtra;
                enterRoomConfig.f28233c.f28325af.f28388a = f133148g;
                String a = m107292a(intent, "player_tag");
                if (a != null) {
                    enterRoomConfig.f28233c.f28288E = a;
                }
                this.f133151c = Live.getService().mo12978a(enterRoomConfig);
                if (hVar != null) {
                    hVar.mo12697a(enterRoomConfig);
                }
                AbstractC0976n a2 = getSupportFragmentManager().mo3552a();
                a2.mo3469b(R.id.b82, this.f133151c.mo12701b());
                a2.mo3467b();
                if (!LiveDrawerVersion.INSTANCE.getValue() && C11870f.C11871a.f28404a.mo19010a().f28391b.f28233c.f28312aB == 1 && LiveDrawerSettings.INSTANCE.getValue().openDrawerReturn() && (bVar = this.f133158k) != null) {
                    bVar.mo14738a(true, false);
                }
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        int i;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onCreate", true);
        if (bundle != null && bundle.containsKey("enter_room_session")) {
            C11870f.C11871a.f28404a.mo19011a(bundle);
        }
        C2690b.m7788a(this);
        C58492ad.C58493a.f133169a.mo12989a((Context) this);
        Live.getService().mo12990a(this, 4);
        activityConfiguration(C58503al.f133178a);
        Intent intent = getIntent();
        long longExtra = intent.getLongExtra("room_id", 0);
        super.onCreate(bundle);
        EnterRoomConfig enterRoomConfig = C11870f.C11871a.f28404a.mo19010a().f28391b;
        this.f133154f = TextUtils.equals("live_square", enterRoomConfig.f28233c.f28297N);
        this.f133150b = enterRoomConfig.f28233c.f28290G;
        this.f133153e = TextUtils.equals(enterRoomConfig.f28233c.f28293J, "push");
        boolean z = enterRoomConfig.f28234d.f28237a;
        this.f133156i = z;
        if (z) {
            overridePendingTransition(0, 0);
        } else if (this.f133150b == null || !this.f133152d) {
            try {
                C11830c.m20832a(this, "convertFromTranslucent");
            } catch (Throwable th) {
                C51423a.m95790a(th);
            }
            overridePendingTransition(R.anim.dq, R.anim.dv);
        } else {
            overridePendingTransition(0, 0);
        }
        String a = m107292a(getIntent(), "schema");
        if (!TextUtils.isEmpty(a)) {
            enterRoomConfig.f28233c.f28316aF = a;
        }
        View decorView = getWindow().getDecorView();
        if (decorView != null && this.f133156i) {
            decorView.setBackgroundColor(0);
            getWindow().setBackgroundDrawable(null);
        }
        setContentView(R.layout.ajb);
        if (this.f133152d && this.f133150b != null) {
            View findViewById = findViewById(R.id.dnh);
            findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener(findViewById, this.f133150b, new View[0]) {
                /* class com.p2082ss.android.ugc.aweme.live.p3410g.C58635a.ViewTreeObserver$OnGlobalLayoutListenerC586361 */

                /* renamed from: a */
                final /* synthetic */ View f133536a;

                /* renamed from: b */
                final /* synthetic */ Rect f133537b;

                /* renamed from: c */
                final /* synthetic */ View[] f133538c;

                static {
                    Covode.recordClassIndex(68936);
                }

                public final void onGlobalLayout() {
                    this.f133536a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    this.f133536a.setPivotX((float) this.f133537b.centerX());
                    this.f133536a.setPivotY((float) this.f133537b.centerY());
                    this.f133536a.setScaleX(0.0f);
                    this.f133536a.setScaleY(0.0f);
                    this.f133536a.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).setInterpolator(new DecelerateInterpolator()).withEndAction(RunnableC58637b.f133539a).start();
                    View[] viewArr = this.f133538c;
                    if (!(viewArr == null || viewArr.length == 0)) {
                        for (View view : viewArr) {
                            Rect rect = new Rect();
                            if (view != null) {
                                int[] iArr = new int[2];
                                view.getLocationOnScreen(iArr);
                                rect.left = iArr[0];
                                rect.top = iArr[1];
                                rect.right = iArr[0] + view.getMeasuredWidth();
                                rect.bottom = iArr[1] + view.getMeasuredHeight();
                                view.setTranslationX((float) (this.f133537b.left - rect.left));
                                view.setTranslationY((float) (this.f133537b.top - rect.top));
                                view.setPivotX(0.0f);
                                view.setPivotY(0.0f);
                                view.setScaleX(((float) this.f133537b.width()) / ((float) view.getWidth()));
                                view.setScaleY(((float) this.f133537b.height()) / ((float) view.getHeight()));
                                view.animate().scaleX(1.0f).scaleY(1.0f).translationX(0.0f).translationY(0.0f).setDuration(200).start();
                            }
                        }
                    }
                }

                {
                    this.f133536a = r1;
                    this.f133537b = r2;
                    this.f133538c = r3;
                }
            });
        }
        getWindow().setSoftInputMode(48);
        getWindow().addFlags(128);
        if (Build.VERSION.SDK_INT != 19 && !C33716a.m69034a(this)) {
            LiveHostOuterService.m107232p().mo95800a((Activity) this);
        }
        int i2 = Build.VERSION.SDK_INT;
        View decorView2 = getWindow().getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 1280);
        if (Build.VERSION.SDK_INT >= 28) {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 1;
            getWindow().setAttributes(attributes);
        }
        AbstractC4374a x = Live.getService().mo13043x();
        if (x != null) {
            x.mo10134a(false);
        }
        Live.getService().mo13026g().mo16680a(hashCode(), this);
        if (longExtra == -3) {
            C58645a aVar = new C58645a(this);
            this.f133155h = aVar;
            if (aVar.f133550f != null) {
                aVar.f133550f.setVisibility(0);
            }
            View view = aVar.f133549e;
            if (aVar.f133547c) {
                i = 0;
            } else {
                i = 8;
            }
            C13628n.m24510a(view, i);
            long j = C11870f.C11871a.f28404a.mo19010a().f28391b.f28233c.f28365u;
            if (j > 0) {
                C11870f.C11871a.f28404a.mo19010a().f28391b.f28233c.f28365u = 0;
                aVar.f133551g = SystemClock.elapsedRealtime() - j;
            }
            C58645a aVar2 = this.f133155h;
            if (aVar2.f133548d && aVar2.f133545a != null) {
                C13628n.m24510a(aVar2.f133546b, 0);
            }
        } else {
            mo18409c();
            mo18410d();
            C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("live_play_create_room_fg", 2819, EnumC11866b.BussinessApiCall).mo19003a("onCreate"));
            mo95856f();
            AbstractC0976n a2 = getSupportFragmentManager().mo3552a();
            EnterRoomConfig enterRoomConfig2 = C11870f.C11871a.f28404a.mo19010a().f28391b;
            enterRoomConfig2.f28233c.f28301R = longExtra;
            enterRoomConfig2.f28233c.f28325af.f28388a = f133148g;
            String a3 = m107292a(intent, "player_tag");
            if (a3 != null) {
                enterRoomConfig2.f28233c.f28288E = a3;
            }
            AbstractC11650h a4 = Live.getService().mo12978a(enterRoomConfig2);
            this.f133151c = a4;
            a2.mo3453a(R.id.b82, a4.mo12701b());
            a2.mo3467b();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.live.LivePlayActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m107292a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static void m107293a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    /* renamed from: a */
    private static Object m107291a(LivePlayActivity livePlayActivity, String str) {
        Object obj;
        MethodCollector.m26663i(1137);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = livePlayActivity.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = livePlayActivity.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = livePlayActivity.getSystemService(str);
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
                    MethodCollector.m26664o(1137);
                }
            }
        } else {
            obj = livePlayActivity.getSystemService(str);
        }
        return obj;
    }

    /* renamed from: a */
    public static void m107294a(Context context, EnterRoomConfig enterRoomConfig) {
        if (!LiveOptRoomNetUnavailable.INSTANCE.isEnable() || C80422fe.m139425a(context)) {
            if (!LivePerformanceManager.getInstance().hasInitValue()) {
                C6204h.m13476a(RunnableC58502ak.f133177a);
            }
            C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("create_live_play_activity", 2817, EnumC11866b.BussinessApiCall));
            if (m107296j()) {
                C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("ttlive_minor_mode_live", 35584, EnumC11866b.SdkInterfaceCall).mo19003a("is ftc mode , can not watch live"));
                return;
            }
            long j = enterRoomConfig.f28233c.f28301R;
            f133148g = System.currentTimeMillis();
            LiveHostOuterService.m107232p();
            Intent intent = new Intent(context, LivePlayActivity.class);
            intent.putExtra("room_id", j);
            intent.putExtra("smooth_enter_room", enterRoomConfig.f28234d.f28237a);
            intent.putExtra("backurl", enterRoomConfig.f28233c.f28303T);
            int i = enterRoomConfig.f28233c.f28364t;
            if (i >= 0) {
                intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", AbstractC59053bc.m108535a(Integer.valueOf(i)));
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            C11870f.C11871a.f28404a.mo19010a().mo18994a(new Event("warm_up_player", 2818, EnumC11866b.SdkInterfaceCall).mo19003a("room player warm up.").mo19002a());
            if (enterRoomConfig.f28231a.f28384k) {
                enterRoomConfig.f28231a = new EnterRoomConfig.StreamData();
                enterRoomConfig.f28231a.f28384k = true;
            }
            String a = Live.getService().mo12982a(j, enterRoomConfig, context);
            if (a != null) {
                intent.putExtra("player_tag", a);
                if (enterRoomConfig.f28231a.f28374a) {
                    enterRoomConfig.f28233c.f28346b = Live.getService().mo13006a(a, context);
                }
            }
            AbstractC11322c b = Live.getService().mo13011b();
            if (b != null) {
                b.mo13689a(enterRoomConfig);
            }
            m107293a(context, intent);
            return;
        }
        C11226ao.m19882a(C3966y.m9669e(), (int) R.string.gj1);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.live.ActivityC58486a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC34467b bVar = this.f133157j;
        if (bVar != null) {
            bVar.mo60905a(i, i2, intent);
        }
    }
}
