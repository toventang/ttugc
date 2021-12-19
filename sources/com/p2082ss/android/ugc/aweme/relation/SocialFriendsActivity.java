package com.p2082ss.android.ugc.aweme.relation;

import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.friends.service.AbstractC51649b;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.relation.p3672a.C66824a;
import com.p2082ss.android.ugc.aweme.relation.p3672a.C66825b;
import com.p2082ss.android.ugc.aweme.relation.p3673b.C66870b;
import com.p2082ss.android.ugc.aweme.relation.p3674c.EnumC66892b;
import com.p2082ss.android.ugc.aweme.relation.recommend.C66994m;
import com.p2082ss.android.ugc.aweme.relation.recommend.C66995n;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.C67103e;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.SocialRecFlowModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.relation.SocialFriendsActivity */
public final class SocialFriendsActivity extends ActivityC17312a {

    /* renamed from: a */
    public static final C66814a f150063a = new C66814a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f150064b = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C66815b.f150067a, "nextStep", Integer.class);

    /* renamed from: c */
    private final AbstractC89244h f150065c = RouteArgExtension.INSTANCE.optionalArgNotNull(this, C66822g.f150073a, "socialRecType", Integer.class);

    /* renamed from: d */
    private SparseArray f150066d;

    /* renamed from: com.ss.android.ugc.aweme.relation.SocialFriendsActivity$f */
    final /* synthetic */ class C66821f implements AbstractC1214u {

        /* renamed from: a */
        private final /* synthetic */ AbstractC89172b f150072a;

        static {
            Covode.recordClassIndex(78395);
        }

        C66821f(AbstractC89172b bVar) {
            this.f150072a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C89219l.m154716b(this.f150072a.invoke(obj), "");
        }
    }

    static {
        Covode.recordClassIndex(78387);
    }

    /* renamed from: a */
    private final int m118548a() {
        return ((Number) this.f150064b.getValue()).intValue();
    }

    /* renamed from: b */
    private final int m118550b() {
        return ((Number) this.f150065c.getValue()).intValue();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f150066d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f150066d == null) {
            this.f150066d = new SparseArray();
        }
        View view = (View) this.f150066d.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f150066d.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.relation.SocialFriendsActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.relation.SocialFriendsActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.relation.SocialFriendsActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.SocialFriendsActivity$a */
    public static final class C66814a {
        static {
            Covode.recordClassIndex(78388);
        }

        private C66814a() {
        }

        public /* synthetic */ C66814a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        AbstractC51649b s = C51648a.f118980a.mo87339s();
        if (s != null) {
            s.mo87353a();
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

    /* renamed from: com.ss.android.ugc.aweme.relation.SocialFriendsActivity$b */
    static final class C66815b extends AbstractC89220m implements AbstractC89172b<Boolean, Integer> {

        /* renamed from: a */
        public static final C66815b f150067a = new C66815b();

        static {
            Covode.recordClassIndex(78389);
        }

        C66815b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return Integer.valueOf(EnumC66892b.NONE.getValue());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.SocialFriendsActivity$d */
    static final /* synthetic */ class C66819d extends C89217j implements AbstractC89172b<C67103e, C89391z> {
        static {
            Covode.recordClassIndex(78393);
        }

        C66819d(SocialFriendsActivity socialFriendsActivity) {
            super(1, socialFriendsActivity, SocialFriendsActivity.class, "handleActionTransition", "handleActionTransition(Lcom/ss/android/ugc/aweme/relation/viewmodel/SocialRecFlowData;)V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C67103e eVar) {
            ((SocialFriendsActivity) this.receiver).mo105771a(eVar);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.SocialFriendsActivity$e */
    static final class C66820e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ SocialFriendsActivity f150071a;

        static {
            Covode.recordClassIndex(78394);
        }

        C66820e(SocialFriendsActivity socialFriendsActivity) {
            this.f150071a = socialFriendsActivity;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            if (!this.f150071a.isFinishing()) {
                this.f150071a.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.SocialFriendsActivity$g */
    static final class C66822g extends AbstractC89220m implements AbstractC89172b<Boolean, Integer> {

        /* renamed from: a */
        public static final C66822g f150073a = new C66822g();

        static {
            Covode.recordClassIndex(78396);
        }

        C66822g() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Integer invoke(Boolean bool) {
            bool.booleanValue();
            return 0;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.relation.SocialFriendsActivity$c */
    static final class C66816c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C66816c f150068a = new C66816c();

        static {
            Covode.recordClassIndex(78390);
        }

        C66816c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C668171.f150069a);
            baseActivityViewModel2.config(C668182.f150070a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo105771a(C67103e eVar) {
        if (eVar == null) {
            finish();
            return;
        }
        int i = eVar.f150486a;
        boolean z = false;
        if (i == EnumC66892b.CONSENT.getValue()) {
            C66824a c = C66870b.m118590c(m118550b());
            if (c != null) {
                m118549a(C66825b.C66830d.m118563a(c), false);
            } else {
                finish();
            }
        } else if (i == EnumC66892b.RECOMMEND.getValue()) {
            C66994m d = C66870b.m118592d(m118550b());
            if (d != null) {
                C66995n a = C66995n.C67000d.m118705a(d);
                if (m118548a() == EnumC66892b.CONSENT.getValue()) {
                    z = true;
                }
                m118549a(a, z);
                return;
            }
            finish();
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.relation.SocialFriendsActivity", "onCreate", true);
        activityConfiguration(C66816c.f150068a);
        super.onCreate(bundle);
        setContentView(R.layout.a21);
        int b = m118550b();
        if (b == 2 || b == 1) {
            ((SocialRecFlowModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(SocialRecFlowModel.class)).f150411a.observe(this, new C66821f(new C66819d(this)));
            ((SocialRecFlowModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(SocialRecFlowModel.class)).f150412b.observe(this, new C66820e(this));
            mo105771a(new C67103e(m118548a(), null, null, null, 14));
            ActivityAgent.onTrace("com.ss.android.ugc.aweme.relation.SocialFriendsActivity", "onCreate", false);
            return;
        }
        finish();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.relation.SocialFriendsActivity", "onCreate", false);
    }

    /* renamed from: a */
    private final void m118549a(Fragment fragment, boolean z) {
        AbstractC0976n a = getSupportFragmentManager().mo3552a();
        C89219l.m154716b(a, "");
        if (z) {
            a.mo3451a(R.anim.bp, R.anim.bq);
        }
        a.mo3469b(R.id.b40, fragment);
        a.mo3473c();
    }
}
