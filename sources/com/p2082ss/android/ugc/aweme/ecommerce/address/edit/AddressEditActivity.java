package com.p2082ss.android.ugc.aweme.ecommerce.address.edit;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2824c.AbstractC43470c;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2824c.C43467a;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.p2824c.C43468b;
import com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b;
import com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45263i;
import com.p2082ss.android.ugc.aweme.ecommerce.router.StrategyService;
import com.p2082ss.android.ugc.aweme.live.ILiveOuterService;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity */
public final class AddressEditActivity extends AbstractActivityC44311b {

    /* renamed from: a */
    private final AbstractC89244h f101238a = C89250i.m154773a((AbstractC89171a) new C43381c(this));

    /* renamed from: b */
    private long f101239b = -1;

    /* renamed from: c */
    private SparseArray f101240c;

    static {
        Covode.recordClassIndex(51604);
    }

    /* renamed from: a */
    private final AbstractC43470c m86480a() {
        return (AbstractC43470c) this.f101238a.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this.f101240c;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f101240c == null) {
            this.f101240c = new SparseArray();
        }
        View view = (View) this.f101240c.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f101240c.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity$a */
    static final class C43378a extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ AddressEditActivity f101241a;

        static {
            Covode.recordClassIndex(51605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43378a(AddressEditActivity addressEditActivity) {
            super(0);
            this.f101241a = addressEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            AddressEditActivity.super.onBackPressed();
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onBackPressed() {
        m86480a().mo73991a(new C43378a(this));
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        m86480a();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        m86480a().mo73988a();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onPause() {
        C15477a.m28477c(this);
        super.onPause();
        ILiveOuterService s = LiveOuterService.m107269s();
        C89219l.m154716b(s, "");
        s.mo95830d().mo13015b(SystemClock.elapsedRealtime() - this.f101239b);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity", "onResume", true);
        super.onResume();
        this.f101239b = SystemClock.elapsedRealtime();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity", "onResume", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity$c */
    static final class C43381c extends AbstractC89220m implements AbstractC89171a<AbstractC43470c> {

        /* renamed from: a */
        final /* synthetic */ AddressEditActivity f101244a;

        static {
            Covode.recordClassIndex(51608);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43381c(AddressEditActivity addressEditActivity) {
            super(0);
            this.f101244a = addressEditActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC43470c invoke() {
            return C45263i.m87840a(StrategyService.m87825b().mo76330a().mo76349a(new AbstractC89171a<AbstractC45271m>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity.C43381c.C433821 */

                /* renamed from: a */
                final /* synthetic */ C43381c f101245a;

                static {
                    Covode.recordClassIndex(51609);
                }

                {
                    this.f101245a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC45271m invoke() {
                    return new C43468b(this.f101245a.f101244a);
                }
            }).mo76351b(new AbstractC89171a<AbstractC45271m>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity.C43381c.C433832 */

                /* renamed from: a */
                final /* synthetic */ C43381c f101246a;

                static {
                    Covode.recordClassIndex(51610);
                }

                {
                    this.f101246a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC45271m invoke() {
                    return new C43467a(this.f101246a.f101244a);
                }
            }), this.f101244a.getIntent().getData());
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        m86480a().mo73990b();
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity$b */
    static final class C43379b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C43379b f101242a = new C43379b();

        static {
            Covode.recordClassIndex(51606);
        }

        C43379b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C433801.f101243a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.p2082ss.android.ugc.aweme.ecommerce.common.AbstractActivityC44311b, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity", "onCreate", true);
        activityConfiguration(C43379b.f101242a);
        super.onCreate(bundle);
        m86480a().mo73989a(bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditActivity", "onCreate", false);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onRestoreInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onRestoreInstanceState(bundle);
        m86480a().mo76357a(this, bundle);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        m86480a().mo76359b(this, bundle);
    }
}
