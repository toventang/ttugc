package com.p2082ss.android.ugc.aweme.challenge.p2454ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.powerpreload.task.C17827e;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.base.AbstractC34585f;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g;
import com.p2082ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59287a;
import com.p2082ss.android.ugc.aweme.p2436cc.C35434c;
import com.p2082ss.android.ugc.aweme.push.C65691a;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity */
public final class ChallengeDetailActivity extends ActivityC17312a implements AbstractC33501c, AbstractC34472g, AbstractC34585f {

    /* renamed from: c */
    public static final C35551a f83829c = new C35551a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f83830a = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: b */
    String f83831b = "";

    /* renamed from: d */
    private final AbstractC89244h f83832d = C89250i.m154773a((AbstractC89171a) new C35552b(this));

    /* renamed from: e */
    private final ArrayList<AbstractC34466a> f83833e = new ArrayList<>();

    /* renamed from: f */
    private SparseArray f83834f;

    static {
        Covode.recordClassIndex(42774);
    }

    /* renamed from: a */
    private final ChallengeDetailParam m72657a() {
        return (ChallengeDetailParam) this.f83832d.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f83834f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f83834f == null) {
            this.f83834f = new SparseArray();
        }
        View view = (View) this.f83834f.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f83834f.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.AbstractC34585f
    /* renamed from: c */
    public final String mo61041c() {
        return "challenge";
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity$a */
    public static final class C35551a {
        static {
            Covode.recordClassIndex(42775);
        }

        private C35551a() {
        }

        public /* synthetic */ C35551a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        C65691a.m117584a(this);
        C59287a.m108997a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity$b */
    static final class C35552b extends AbstractC89220m implements AbstractC89171a<ChallengeDetailParam> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailActivity f83835a;

        static {
            Covode.recordClassIndex(42776);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35552b(ChallengeDetailActivity challengeDetailActivity) {
            super(0);
            this.f83835a = challengeDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ChallengeDetailParam invoke() {
            Object value = this.f83835a.f83830a.getValue();
            if (value == null) {
                return new ChallengeDetailParam(null, null, 0, null, null, null, null, null, null, null, null, false, 0, null, 0, null, null, null, 262143, null);
            }
            return value;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity$c */
    static final class C35553c extends AbstractC89220m implements AbstractC89171a<C89378p<? extends Long, ? extends String>> {

        /* renamed from: a */
        final /* synthetic */ ChallengeDetailActivity f83836a;

        static {
            Covode.recordClassIndex(42777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35553c(ChallengeDetailActivity challengeDetailActivity) {
            super(0);
            this.f83836a = challengeDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89378p<? extends Long, ? extends String> invoke() {
            Long valueOf = Long.valueOf(this.f83836a.getIntent().getLongExtra("EXTRA_PRELOAD_PAGE_START_TIME", 0));
            String a = C17827e.m33010a(this.f83836a.getIntent());
            if (a == null) {
                a = "";
            }
            return new C89378p(valueOf, a);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
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

    @Override // com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c
    /* renamed from: F */
    public final Analysis mo59595F() {
        long j;
        long j2 = 0;
        try {
            String cid = m72657a().getCid();
            if (cid == null) {
                C89219l.m154715b();
            }
            j = Long.parseLong(cid);
        } catch (Exception e) {
            e.printStackTrace();
            j = 0;
        }
        try {
            String awemeId = m72657a().getAwemeId();
            if (awemeId == null) {
                C89219l.m154715b();
            }
            j2 = Long.parseLong(awemeId);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("process_id", m72657a().getProcessId());
            jSONObject.put("challenge_id", this.f83831b);
        } catch (JSONException unused) {
        }
        Analysis ext_json = new Analysis().setLabelName("challenge").setExt_value(j).setValue(j2).setExt_json(jSONObject);
        C89219l.m154716b(ext_json, "");
        return ext_json;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
    public final void unRegisterActivityOnKeyDownListener(AbstractC34466a aVar) {
        C89219l.m154721d(aVar, "");
        ArrayList<AbstractC34466a> arrayList = this.f83833e;
        if (arrayList != null) {
            arrayList.remove(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity$d */
    static final class C35554d extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C35554d f83837a = new C35554d();

        static {
            Covode.recordClassIndex(42778);
        }

        C35554d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C355551.f83838a);
            baseActivityViewModel2.config(C355562.f83839a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
    public final void registerActivityOnKeyDownListener(AbstractC34466a aVar) {
        C89219l.m154721d(aVar, "");
        if (!this.f83833e.contains(aVar)) {
            this.f83833e.add(aVar);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onCreate", true);
        C35434c.m72461a("challenge_detail");
        activityConfiguration(C35554d.f83837a);
        super.onCreate(bundle);
        setContentView(R.layout.aj0);
        View findViewById = findViewById(R.id.acf);
        C89219l.m154716b(findViewById, "");
        findViewById.setFitsSystemWindows(false);
        if (TextUtils.isEmpty(m72657a().getCid())) {
            finish();
        } else {
            m72657a().setShootEnterFrom(m72658a(getIntent(), "shoot_enter_from"));
            m72657a().setBundled(Integer.valueOf(getIntent().getIntExtra("is_bundled", 0)));
            AbstractC0952i supportFragmentManager = getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            ChallengeDetailParam a = m72657a();
            C89219l.m154721d(supportFragmentManager, "");
            C89219l.m154721d(a, "");
            AbstractC0976n a2 = supportFragmentManager.mo3552a();
            C89219l.m154716b(a2, "");
            Fragment a3 = supportFragmentManager.mo3551a("challenge_detail_fragment_tag");
            if (a3 == null) {
                C89219l.m154721d(a, "");
                a3 = new C35612j();
                RouteArgExtension.INSTANCE.withNavArg(a3, a);
            }
            a3.setUserVisibleHint(true);
            a2.mo3470b(R.id.acf, a3, "challenge_detail_fragment_tag");
            a2.mo3467b();
            if (a3 instanceof C35612j) {
                ((C35612j) a3).f84032r = new C35553c(this);
            }
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m72658a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        Iterator<AbstractC34466a> it = this.f83833e.iterator();
        while (it.hasNext()) {
            if (it.next().onKeyDown(i, keyEvent)) {
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
