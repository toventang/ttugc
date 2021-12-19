package com.p2082ss.android.ugc.aweme.friends.p3022ui;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.AbstractC17207b;
import com.bytedance.ies.dmt.p1194ui.dialog.dialogmanager.C17205a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.base.AbstractC17362a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.p3019i.C51526g;
import com.p2082ss.android.ugc.aweme.friends.service.C51648a;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.profile.p3575f.C63770ai;
import com.p2082ss.android.ugc.aweme.ufr.AbstractC79495a;
import com.p2082ss.android.ugc.aweme.ufr.C79515b;
import com.p2082ss.android.ugc.aweme.ufr.C79546d;
import com.p2082ss.android.ugc.aweme.ufr.EnumC79549g;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity */
public final class FacebookAuthorizeActivity extends ActivityC17312a {

    /* renamed from: a */
    public static final C51656a f119011a = new C51656a((byte) 0);

    /* renamed from: b */
    private String f119012b = "";

    /* renamed from: c */
    private AbstractC88412b f119013c;

    /* renamed from: d */
    private SparseArray f119014d;

    static {
        Covode.recordClassIndex(61010);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f119014d;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f119014d == null) {
            this.f119014d = new SparseArray();
        }
        View view = (View) this.f119014d.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f119014d.put(i, findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity$a */
    public static final class C51656a {
        static {
            Covode.recordClassIndex(61011);
        }

        private C51656a() {
        }

        public /* synthetic */ C51656a(byte b) {
            this();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        super.onBackPressed();
        finish();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        AbstractC88412b bVar = this.f119013c;
        if (bVar != null) {
            bVar.dispose();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void finish() {
        super.finish();
        if (isTaskRoot()) {
            C36125t.m73596a(C36125t.m73591a(), this, "aweme://main");
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

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity$c */
    static final class C51658c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C33103x f119016a;

        static {
            Covode.recordClassIndex(61013);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51658c(C33103x xVar) {
            super(1);
            this.f119016a = xVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(new AbstractC89171a<AbstractC17362a>(this) {
                /* class com.p2082ss.android.ugc.aweme.friends.p3022ui.FacebookAuthorizeActivity.C51658c.C516591 */

                /* renamed from: a */
                final /* synthetic */ C51658c f119017a;

                static {
                    Covode.recordClassIndex(61014);
                }

                {
                    this.f119017a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* bridge */ /* synthetic */ AbstractC17362a invoke() {
                    return this.f119017a.f119016a;
                }
            });
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public final void mo87376a(int i) {
        C39162r.m79460a("authorize_facebook_response", new C33744d().mo59983a("enter_from", this.f119012b).mo59980a("is_allow", i).f79943a);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity$b */
    static final class C51657b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ FacebookAuthorizeActivity f119015a;

        static {
            Covode.recordClassIndex(61012);
        }

        C51657b(FacebookAuthorizeActivity facebookAuthorizeActivity) {
            this.f119015a = facebookAuthorizeActivity;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C79546d dVar = (C79546d) obj;
            if (dVar.f178516a == EnumC79549g.AUTHORIZED) {
                this.f119015a.mo87376a(1);
                C51526g.m95988a("contact_list", 1);
            }
            if (dVar.f178516a == EnumC79549g.REQUEST_ACTUAL_PERMISSION && !dVar.f178517b.f178518a) {
                this.f119015a.mo87376a(0);
                C51526g.m95988a("contact_list", 0);
                this.f119015a.finish();
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onCreate", true);
        C33103x xVar = new C33103x(0, false, false, 7);
        xVar.f78667a = false;
        xVar.f78674h = false;
        xVar.f78673g = R.color.ur;
        activityConfiguration(new C51658c(xVar));
        super.onCreate(bundle);
        setContentView(R.layout.a1x);
        if (getIntent().hasExtra("enter_from")) {
            String a = m96323a(getIntent(), "enter_from");
            if (a == null) {
                a = "";
            }
            this.f119012b = a;
        }
        Class<? extends AbstractC79495a> f = C51648a.f118980a.mo87326f();
        String str = this.f119012b;
        User b = C63770ai.m139683b();
        C89219l.m154716b(b, "");
        this.f119013c = C79515b.m138229a(this, f, b.getUid(), str, "auto", true, true, null).mo143289d(new C51657b(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.friends.ui.FacebookAuthorizeActivity", "onCreate", false);
    }

    /* renamed from: a */
    private static String m96323a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C17205a.C17206a.f41116a.mo27210a(AbstractC17207b.EnumC17208a.FRIENDSLIST_PERMISSION);
        if (i == 101) {
            finish();
        }
    }
}
