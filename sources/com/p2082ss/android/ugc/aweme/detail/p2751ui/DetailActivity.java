package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.app.C0569a;
import androidx.core.p037h.C0792v;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20758o;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.EnumC20760q;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20727d;
import com.bytedance.p122a.C2541b;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.agilelogger.ALog;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34467b;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f;
import com.p2082ss.android.ugc.aweme.base.p2364a.C34469d;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.p2082ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.utils.C38693bn;
import com.p2082ss.android.ugc.aweme.detail.C41223i;
import com.p2082ss.android.ugc.aweme.detail.p2747f.C41125a;
import com.p2082ss.android.ugc.aweme.detail.transition.AbstractC41336c;
import com.p2082ss.android.ugc.aweme.detail.transition.C41327a;
import com.p2082ss.android.ugc.aweme.detail.transition.C41333b;
import com.p2082ss.android.ugc.aweme.detail.transition.FeedShareElementInfo;
import com.p2082ss.android.ugc.aweme.experiment.C46778bz;
import com.p2082ss.android.ugc.aweme.feed.helper.C49617c;
import com.p2082ss.android.ugc.aweme.feed.helper.C49625h;
import com.p2082ss.android.ugc.aweme.feed.helper.C49656u;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.param.C49811a;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;
import com.p2082ss.android.ugc.aweme.feed.param.MobParamProvider;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.main.AbstractC59108o;
import com.p2082ss.android.ugc.aweme.main.p3427a.C59008a;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59287a;
import com.p2082ss.android.ugc.aweme.p2433ca.C35345c;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40911c;
import com.p2082ss.android.ugc.aweme.p2725d.AbstractC40912d;
import com.p2082ss.android.ugc.aweme.p2725d.C40916g;
import com.p2082ss.android.ugc.aweme.p2929fe.method.C47959j;
import com.p2082ss.android.ugc.aweme.push.C65691a;
import com.p2082ss.android.ugc.aweme.service.IFeedDebugService;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80219an;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.DetailActivity */
public class DetailActivity extends AbstractActivityC41359ak implements AbstractC34471f, AbstractC40912d, AbstractC41336c, AbstractC41360al, C59008a.AbstractC59009a, AbstractC90252i, AbstractC90253j {

    /* renamed from: c */
    public static boolean f96476c = true;

    /* renamed from: i */
    public static HashSet<Integer> f96477i = new HashSet<>();

    /* renamed from: a */
    protected C41401l f96478a;

    /* renamed from: b */
    protected List<AbstractC34466a> f96479b;

    /* renamed from: d */
    FrameLayout f96480d;

    /* renamed from: e */
    volatile boolean f96481e;

    /* renamed from: f */
    FrameLayout f96482f;

    /* renamed from: g */
    FrameLayout f96483g;

    /* renamed from: h */
    protected int f96484h;

    /* renamed from: j */
    private String f96485j = "";

    /* renamed from: k */
    private volatile boolean f96486k;

    /* renamed from: l */
    private AbstractC34467b f96487l;

    /* renamed from: m */
    private volatile boolean f96488m;

    /* renamed from: n */
    private volatile boolean f96489n;

    /* renamed from: o */
    private int f96490o = -1;

    /* renamed from: p */
    private long f96491p;

    /* renamed from: q */
    private String f96492q;

    /* renamed from: r */
    private C40916g f96493r;

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new RunnableC90250g(DetailActivity.class, "onVideoEvent", C49672ag.class, ThreadMode.POSTING, 0, false));
        hashMap.put(58, new RunnableC90250g(DetailActivity.class, "onJsBroadCastEvent", C47959j.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @AbstractC90264r
    public void onVideoEvent(C49672ag agVar) {
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.main.p3427a.C59008a.AbstractC59009a
    public AbstractC59108o getHelper() {
        return this.f96478a.f96585b;
    }

    /* renamed from: b */
    private static boolean m83201b() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p2725d.AbstractC40912d
    public /* synthetic */ AbstractC40911c getInflater() {
        if (this.f96493r == null) {
            this.f96493r = new C40916g(this);
        }
        return this.f96493r;
    }

    static {
        Covode.recordClassIndex(49230);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", true);
        super.onResume();
        C41223i.m83093a(true);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onResume", false);
    }

    public void finishAfterTransition() {
        Aweme h;
        if (C41333b.f96464a && (h = this.f96478a.mo70671h()) != null) {
            String aid = h.getAid();
            C89219l.m154721d(this, "");
            C89219l.m154721d(aid, "");
            C41333b.m83194a((Activity) this, true);
            Intent intent = new Intent();
            intent.putExtra("feed_share_element_aid", aid);
            setResult(-1, intent);
        }
        super.finishAfterTransition();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        ServiceManager.get().getService(IFeedDebugService.class);
        C41223i.f96337b.removeCallbacksAndMessages(null);
        C41223i.f96337b.postDelayed(C41223i.RunnableC41224a.f96339a, 500);
        C2541b.m7432a();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        if (C41333b.f96464a && Build.VERSION.SDK_INT >= 29 && !isFinishing()) {
            new Instrumentation().callActivityOnSaveInstanceState(this, new Bundle());
        }
        super.onStop();
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.transition.AbstractC41336c
    /* renamed from: a */
    public final FeedShareElementInfo[] mo70603a() {
        C41401l lVar = this.f96478a;
        if (lVar == null || lVar.mo70670g() == null) {
            return new FeedShareElementInfo[0];
        }
        C41426z g = this.f96478a.mo70670g();
        if (g.f96636k == null || g.f96636k.mo70454V() == null) {
            return new FeedShareElementInfo[0];
        }
        return new FeedShareElementInfo[]{new FeedShareElementInfo(g.f96636k.mo70454V())};
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public void onBackPressed() {
        try {
            List<AbstractC34466a> list = this.f96479b;
            if (list != null) {
                for (AbstractC34466a aVar : list) {
                    if (aVar.onKeyDown(4, null)) {
                        return;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        C41401l lVar = this.f96478a;
        if (lVar == null || !lVar.af_()) {
            C51423a.m95784a(6, "DetailActivity", "back when fragment is null!");
            super.onBackPressed();
        } else if (!this.f96478a.mo70668d()) {
            this.f96478a.mo70672i();
        }
        AbstractC81915c.m141874a(new C49672ag(42));
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        C41401l lVar;
        if (Build.VERSION.SDK_INT < 21 || !this.f96488m || this.f96489n || !C41333b.f96464a) {
            super.finish();
            C41401l lVar2 = this.f96478a;
            if (lVar2 != null) {
                lVar2.mo70669e();
            }
            String a = m83199a(getIntent(), "video_from");
            if (!C49656u.m93102b(this) && !TextUtils.equals(a, "from_follow_page")) {
                C81079v.m140776O().mo123951z();
            } else if (!TextUtils.equals("from_mix_video", a)) {
                overridePendingTransition(R.anim.cb, R.anim.cc);
            }
            C59287a.m108997a(this);
            String a2 = m83199a(getIntent(), "back_to");
            if (!TextUtils.isEmpty(a2)) {
                Intent intent = new Intent("android.intent.action.VIEW");
                Uri parse = Uri.parse(a2);
                if ("sslocal".equals(parse.getScheme())) {
                    parse = Uri.parse(a2.replaceFirst("sslocal", "snssdk" + C17867d.f42590n));
                }
                intent.setData(parse);
                intent.setPackage(getPackageName());
                intent.addCategory("android.intent.category.BROWSABLE");
                C84349a.m145093a(intent, this);
                startActivity(intent);
            } else {
                C65691a.m117584a(this);
            }
            getIntent().removeExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
            C41401l lVar3 = this.f96478a;
            if (lVar3 != null) {
                lVar3.mo70661a(!TextUtils.equals(a, "from_follow_page"), this.f96490o);
                return;
            }
            return;
        }
        this.f96489n = true;
        if (this.f96478a.mo70670g() != null) {
            this.f96478a.mo70670g().mo70689b(false);
        }
        if (!(Build.VERSION.SDK_INT < 29 || (lVar = this.f96478a) == null || lVar.mo70671h() == null)) {
            String aid = this.f96478a.mo70671h().getAid();
            C89219l.m154721d(aid, "");
            try {
                Field declaredField = Activity.class.getDeclaredField("mActivityTransitionState");
                C89219l.m154716b(declaredField, "");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Field declaredField2 = Class.forName("android.app.ActivityTransitionState").getDeclaredField("mPendingExitNames");
                C89219l.m154716b(declaredField2, "");
                declaredField2.setAccessible(true);
                if (declaredField2.get(obj) == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aid);
                    declaredField2.set(obj, arrayList);
                }
            } catch (Exception unused) {
            }
        }
        finishAfterTransition();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x012e, code lost:
        if (r8.equals("challenge") == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0137, code lost:
        if (r8.equals("others_homepage") == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0140, code lost:
        if (r8.equals("personal_homepage") == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0149, code lost:
        if (r8.equals("prop_page") == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0152, code lost:
        if (r8.equals("question") == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015b, code lost:
        if (r8.equals("single_song") == false) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015e, code lost:
        r1 = new com.p2082ss.android.ugc.aweme.app.p2328f.C33744d().mo59983a("enter_from", r8);
        r0 = r14.f96478a.mo70670g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x016d, code lost:
        if (r0 == null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x016f, code lost:
        r0 = r0.f96636k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0171, code lost:
        if (r0 == null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0173, code lost:
        r4 = r0.mo70453U();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0177, code lost:
        com.p2082ss.android.ugc.aweme.common.C39162r.m79460a("feed_back", r1.mo59980a("is_last", r4).mo59983a("group_id", r9.getAid()).f79943a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0197, code lost:
        if (r8.equals("ads_engage") == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x022a, code lost:
        if (r8.equals("select_ads") == false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x022e, code lost:
        com.p2082ss.android.ugc.aweme.common.C39162r.m79460a("feed_back", new com.p2082ss.android.ugc.aweme.app.p2328f.C33744d().mo59983a("enter_from", r8).f79943a);
     */
    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDestroy() {
        /*
        // Method dump skipped, instructions count: 752
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity.onDestroy():void");
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34471f
    public void setActivityResultListener(AbstractC34467b bVar) {
        this.f96487l = bVar;
    }

    /* renamed from: a */
    private static Bundle m83198a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
    public void unRegisterActivityOnKeyDownListener(AbstractC34466a aVar) {
        List<AbstractC34466a> list = this.f96479b;
        if (list != null) {
            list.remove(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
    public void registerActivityOnKeyDownListener(AbstractC34466a aVar) {
        if (this.f96479b == null) {
            this.f96479b = new ArrayList();
        }
        if (!this.f96479b.contains(aVar)) {
            this.f96479b.add(aVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C41401l mo70608a(C49812b bVar) {
        Bundle bundle;
        Intent intent = getIntent();
        if (intent == null || (bundle = m83198a(intent)) == null) {
            bundle = new Bundle();
        }
        return C41401l.m83282a(bVar, bundle);
    }

    @Override // androidx.appcompat.app.ActivityC0218d, android.app.Activity
    public <T extends View> T findViewById(int i) {
        T t = (T) super.findViewById(i);
        if (t != null || !f96477i.contains(Integer.valueOf(i))) {
            return t;
        }
        ALog.m59865d("live_fragment_id", "findViewById is null and id is ".concat(String.valueOf(i)));
        return (T) super.findViewById(R.id.eo8);
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public void onJsBroadCastEvent(C47959j jVar) {
        Aweme b;
        try {
            if (TextUtils.equals("adVideoReportSuccess", jVar.f111077b.getString("eventName"))) {
                try {
                    ITalentAdRevenueShareService e = TalentAdRevenueShareServiceImpl.m77931e();
                    if (e != null) {
                        JSONObject jSONObject = jVar.f111077b.getJSONObject("data");
                        if (jSONObject.opt("object_id") != null) {
                            String string = jSONObject.getString("object_id");
                            IAwemeService b2 = AwemeService.m70060b();
                            if (b2 != null && (b = b2.mo60684b(string)) != null) {
                                if (b.getAwemeRawAd() != null) {
                                    e.mo67029a(jSONObject, b.getAwemeRawAd());
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.p2082ss.android.ugc.aweme.detail.p2751ui.AbstractActivityC41359ak, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        Intent intent;
        String a;
        Intent intent2;
        Aweme b;
        MethodCollector.m26663i(10443);
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onCreate", true);
        if (C46778bz.m90128b()) {
            for (String str : C46778bz.m90129c()) {
                C1870c.m6050a(this, str);
            }
        }
        C35434c.m72461a("detail_page");
        C33103x xVar = new C33103x((byte) 0);
        xVar.f78673g = R.color.ur;
        activityConfiguration(new C41362b(xVar));
        if (C41333b.f96464a) {
            C41333b.m83193a(this);
            C89219l.m154721d(this, "");
            C89219l.m154721d(this, "");
            DataCenter a2 = DataCenter.m69492a(C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null), this);
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            C0569a.m2184b((Activity) this);
            setEnterSharedElementCallback(new C41327a.SharedElementCallbackC41331d(this, this, atomicBoolean, a2));
        }
        super.onCreate(bundle);
        Intent intent3 = getIntent();
        if (intent3 != null && intent3.getBooleanExtra("from_notification", false)) {
            C80219an.f179692a = System.currentTimeMillis();
            C80219an.f179693b = 2;
            C80219an.m139045a();
        }
        if (!(intent3 == null || intent3.getData() == null)) {
            Uri data = intent3.getData();
            data.getHost();
            data.getPath();
            if (TextUtils.equals("user/video", data.getHost() + data.getPath())) {
                intent3.putExtra("enter_from", "push");
                intent3.putExtra("refer", "push");
                intent3.putExtra("id", data.getQueryParameter("id"));
                intent3.putExtra("cid", data.getQueryParameter("commentId"));
            }
        }
        getWindow().setSoftInputMode(48);
        setContentView(C1870c.m6045a((Activity) this, (int) R.layout.w9));
        this.f96483g = (FrameLayout) findViewById(R.id.ak8);
        this.f96482f = (FrameLayout) findViewById(R.id.b82);
        this.f96480d = (FrameLayout) findViewById(R.id.b5p);
        C35345c.m72337b();
        this.f96483g.setBackground(null);
        this.f96484h = getIntent().getIntExtra("page_type", -1);
        String a3 = m83199a(getIntent(), "from_micro_app");
        this.f96492q = a3;
        if (TextUtils.isEmpty(a3) && getIntent().getData() != null) {
            this.f96492q = getIntent().getData().getQueryParameter("from");
        }
        C49812b a4 = C49811a.m93273a(this);
        HashMap<String, String> logExtra = a4.getLogExtra();
        C89219l.m154721d(this, "");
        C89219l.m154721d(logExtra, "");
        MobParamProvider.C49810a.m93272a(this).f114584a.putAll(logExtra);
        if (!TextUtils.isEmpty(a4.getAid()) || !TextUtils.isEmpty(a4.getIds()) || !TextUtils.isEmpty(a4.getPushParams()) || a4.isHotSpot() || a4.isSearchTopic() || a4.isfollowSkyLight().booleanValue()) {
            C49625h.m93072a().f114190b = a4.getAid();
            try {
                C51423a.m95791b(4, "DetailActivity", "enter detail page,param from:" + a4.getFrom() + ",eventType:" + a4.getEventType());
            } catch (Exception e) {
                C51423a.m95790a((Throwable) e);
            }
            this.f96485j = a4.getPreviousPage();
            if (!C41400k.m83281a(this, a4, this.f96484h)) {
                AbstractC0952i supportFragmentManager = getSupportFragmentManager();
                C41401l lVar = (C41401l) supportFragmentManager.mo3551a("detailFragment");
                AbstractC0976n a5 = supportFragmentManager.mo3552a();
                if (lVar != null) {
                    this.f96478a = lVar;
                } else {
                    C41401l a6 = mo70608a(a4);
                    this.f96478a = a6;
                    a5.mo3470b(R.id.b82, a6, "detailFragment");
                }
                Activity parent = getParent();
                C41401l lVar2 = this.f96478a;
                if (!(parent == null || lVar2 == null || (intent = parent.getIntent()) == null || (a = C38693bn.m78503a(intent, "trigger_by")) == null)) {
                    Bundle arguments = lVar2.getArguments();
                    if (arguments == null) {
                        arguments = new Bundle();
                        lVar2.setArguments(arguments);
                    }
                    arguments.putString("trigger_by", a);
                }
                a5.mo3474c(this.f96478a);
                a5.mo3467b();
                this.f96478a.setUserVisibleHint(true);
                try {
                    Intent intent4 = getIntent();
                    if (intent4.getBooleanExtra("video_from_dcd", false)) {
                        C41125a aVar = new C41125a();
                        aVar.f96123b = m83199a(intent4, "id");
                        aVar.f96122a = "general_search";
                        aVar.f96124c = ((LogPbBean) intent4.getSerializableExtra("extra_log_pb")).getImprId();
                        aVar.mo96792f();
                    }
                } catch (Exception unused) {
                }
            }
        } else {
            finish();
        }
        this.f96491p = System.currentTimeMillis();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m83201b();
        }
        if (!C58029j.f132256h) {
            finish();
            new C79459a(this).mo123050a(R.string.dcq).mo123053a();
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                getWindow().addFlags(Integer.MIN_VALUE);
                getWindow().setNavigationBarColor(-16777216);
            }
        } catch (Exception e2) {
            C51423a.m95790a((Throwable) e2);
        }
        if (!(getIntent() == null || m83198a(getIntent()) == null)) {
            this.f96490o = m83198a(getIntent()).getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", -1);
            this.f96488m = getIntent().getBooleanExtra("feed_transition_enable", false);
        }
        if (!(Build.VERSION.SDK_INT < 21 || (intent2 = getIntent()) == null || !intent2.getBooleanExtra("video_cover_transition", false) || (b = AwemeService.m70060b().mo60684b(m83199a(intent2, "id"))) == null || b.getVideo() == null || b.getVideo().getCover() == null || C13603b.m24435a((Collection) b.getVideo().getCover().getUrlList()))) {
            this.f96480d.setVisibility(0);
            C49617c cVar = new C49617c();
            C49617c.m93044a(this);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f96480d.getLayoutParams();
            layoutParams.topMargin = C49617c.f114170c;
            layoutParams.bottomMargin = C33403c.m68502a();
            this.f96480d.setLayoutParams(layoutParams);
            SmartImageView smartImageView = new SmartImageView(this);
            this.f96480d.addView(smartImageView, new FrameLayout.LayoutParams(-1, -1, 17));
            cVar.mo81412a(this, b.getVideo(), (View) null, smartImageView, b.getOcrLocation());
            C0792v.m2752a(smartImageView, "video_cover_transition");
            C20766v a7 = C20761r.m39060a(C34735v.m70965a(b.getVideo().getCover()));
            a7.f49088A = EnumC20760q.HIGH;
            C20766v a8 = a7.mo34179a("DetailActivity");
            a8.f49092E = smartImageView;
            a8.mo34181a(new AbstractC20727d() {
                /* class com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity.C413412 */

                static {
                    Covode.recordClassIndex(49232);
                }

                @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                /* renamed from: a */
                public final void mo34159a(Uri uri, View view, Throwable th) {
                    C0569a.m2185c(DetailActivity.this);
                }

                @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20734k
                /* renamed from: a */
                public final void mo34158a(Uri uri, View view, C20758o oVar, Animatable animatable) {
                    C0569a.m2185c(DetailActivity.this);
                }
            });
            this.f96486k = true;
            C0569a.m2184b((Activity) this);
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.addListener((Transition.TransitionListener) new C41345a() {
                /* class com.p2082ss.android.ugc.aweme.detail.p2751ui.DetailActivity.C413401 */

                static {
                    Covode.recordClassIndex(49231);
                }

                @Override // com.p2082ss.android.ugc.aweme.detail.p2751ui.C41345a
                public final void onTransitionEnd(Transition transition) {
                    super.onTransitionEnd(transition);
                    DetailActivity detailActivity = DetailActivity.this;
                    if (!detailActivity.f96481e) {
                        detailActivity.f96481e = true;
                        detailActivity.f96480d.animate().alpha(0.0f).withEndAction(new RunnableC41393d(detailActivity)).setDuration(50).start();
                    }
                }
            });
            getWindow().setSharedElementEnterTransition(autoTransition);
        }
        if (getIntent() != null && !getIntent().getBooleanExtra("activity_has_activity_options", false)) {
            activityConfiguration(C41386c.f96560a);
            C34469d.m70450a(this, 0, true);
        }
        ServiceManager.get().getService(IFeedDebugService.class);
        findViewById(R.id.ak8);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.detail.ui.DetailActivity", "onCreate", false);
        MethodCollector.m26664o(10443);
    }

    /* renamed from: a */
    private static String m83199a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m83200a(Context context, Intent intent) {
        C84349a.m145093a(intent, context);
        context.startActivity(intent);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onActivityReenter(int i, Intent intent) {
        C41327a.m83190a(this, i);
        if (!(-1 != i || intent == null || getHelper() == null)) {
            getHelper().mo96582a(m83199a(intent, "feed_share_element_aid"));
        }
        super.onActivityReenter(i, intent);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        List<AbstractC34466a> list = this.f96479b;
        if (list != null) {
            for (AbstractC34466a aVar : list) {
                if (aVar.onKeyDown(i, keyEvent)) {
                    return true;
                }
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        AbstractC34467b bVar = this.f96487l;
        if (bVar != null) {
            bVar.mo60905a(i, i2, intent);
        }
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            activityConfiguration(C41394e.f96572a);
            finish();
        }
    }
}
