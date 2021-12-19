package com.p2082ss.android.ugc.aweme.question;

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
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.analysis.AbstractC33501c;
import com.p2082ss.android.ugc.aweme.analysis.Analysis;
import com.p2082ss.android.ugc.aweme.base.AbstractC34585f;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34466a;
import com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g;
import com.p2082ss.android.ugc.aweme.miniapp_api.C59287a;
import com.p2082ss.android.ugc.aweme.push.C65691a;
import com.p2082ss.android.ugc.aweme.question.model.QuestionDetailParam;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.QuestionDetailActivity */
public final class QuestionDetailActivity extends ActivityC17312a implements AbstractC33501c, AbstractC34472g, AbstractC34585f {

    /* renamed from: c */
    public static final C66488a f149466c = new C66488a((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f149467a = RouteArgExtension.INSTANCE.navArg(this);

    /* renamed from: b */
    String f149468b = "";

    /* renamed from: d */
    private final AbstractC89244h f149469d = C89250i.m154773a((AbstractC89171a) new C66489b(this));

    /* renamed from: e */
    private final ArrayList<AbstractC34466a> f149470e = new ArrayList<>();

    /* renamed from: f */
    private SparseArray f149471f;

    static {
        Covode.recordClassIndex(78026);
    }

    /* renamed from: a */
    private final QuestionDetailParam m118240a() {
        return (QuestionDetailParam) this.f149469d.getValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f149471f;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f149471f == null) {
            this.f149471f = new SparseArray();
        }
        View view = (View) this.f149471f.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f149471f.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.AbstractC34585f
    /* renamed from: c */
    public final String mo61041c() {
        return "qa_detail";
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.question.QuestionDetailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.question.QuestionDetailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.question.QuestionDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.question.QuestionDetailActivity$a */
    public static final class C66488a {
        static {
            Covode.recordClassIndex(78027);
        }

        private C66488a() {
        }

        public /* synthetic */ C66488a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        C65691a.m117584a(this);
        C59287a.m108997a(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.question.QuestionDetailActivity$b */
    static final class C66489b extends AbstractC89220m implements AbstractC89171a<QuestionDetailParam> {

        /* renamed from: a */
        final /* synthetic */ QuestionDetailActivity f149472a;

        static {
            Covode.recordClassIndex(78028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66489b(QuestionDetailActivity questionDetailActivity) {
            super(0);
            this.f149472a = questionDetailActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ QuestionDetailParam invoke() {
            Object value = this.f149472a.f149467a.getValue();
            if (value == null) {
                return new QuestionDetailParam(null, null, null, null, null, null, 63, null);
            }
            return value;
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
            String id = m118240a().getId();
            if (id == null) {
                C89219l.m154715b();
            }
            j = Long.parseLong(id);
        } catch (Exception e) {
            e.printStackTrace();
            j = 0;
        }
        try {
            String awemeId = m118240a().getAwemeId();
            if (awemeId == null) {
                C89219l.m154715b();
            }
            j2 = Long.parseLong(awemeId);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("process_id", m118240a().getProcessId());
            jSONObject.put("question_id", this.f149468b);
        } catch (JSONException unused) {
        }
        Analysis ext_json = new Analysis().setLabelName("qa_detail").setExt_value(j).setValue(j2).setExt_json(jSONObject);
        C89219l.m154716b(ext_json, "");
        return ext_json;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
    public final void unRegisterActivityOnKeyDownListener(AbstractC34466a aVar) {
        C89219l.m154721d(aVar, "");
        ArrayList<AbstractC34466a> arrayList = this.f149470e;
        if (arrayList != null) {
            arrayList.remove(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.QuestionDetailActivity$c */
    static final class C66490c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C66490c f149473a = new C66490c();

        static {
            Covode.recordClassIndex(78029);
        }

        C66490c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C664911.f149474a);
            baseActivityViewModel2.config(C664922.f149475a);
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2364a.AbstractC34472g
    public final void registerActivityOnKeyDownListener(AbstractC34466a aVar) {
        C89219l.m154721d(aVar, "");
        if (!this.f149470e.contains(aVar)) {
            this.f149470e.add(aVar);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.question.QuestionDetailActivity", "onCreate", true);
        activityConfiguration(C66490c.f149473a);
        super.onCreate(bundle);
        setContentView(R.layout.aj0);
        View findViewById = findViewById(R.id.acf);
        C89219l.m154716b(findViewById, "");
        findViewById.setFitsSystemWindows(false);
        if (TextUtils.isEmpty(m118240a().getId())) {
            finish();
        } else {
            AbstractC0952i supportFragmentManager = getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            QuestionDetailParam a = m118240a();
            C89219l.m154721d(supportFragmentManager, "");
            C89219l.m154721d(a, "");
            AbstractC0976n a2 = supportFragmentManager.mo3552a();
            C89219l.m154716b(a2, "");
            Fragment a3 = supportFragmentManager.mo3551a("question_detail_fragment_tag");
            if (a3 == null) {
                C89219l.m154721d(a, "");
                a3 = new C66541i();
                RouteArgExtension.INSTANCE.withNavArg(a3, a);
            }
            a3.setUserVisibleHint(true);
            a2.mo3470b(R.id.acf, a3, "question_detail_fragment_tag");
            a2.mo3467b();
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.question.QuestionDetailActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isDestroyed()) {
            return false;
        }
        Iterator<AbstractC34466a> it = this.f149470e.iterator();
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
        if (i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
