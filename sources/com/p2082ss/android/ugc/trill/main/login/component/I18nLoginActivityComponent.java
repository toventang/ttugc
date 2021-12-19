package com.p2082ss.android.ugc.trill.main.login.component;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34892bo;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.base.AbstractC34530c;
import com.p2082ss.android.ugc.aweme.base.component.AbstractC34543f;
import com.p2082ss.android.ugc.aweme.base.component.BaseLoginActivityComponent;
import com.p2082ss.android.ugc.trill.p4370a.p4371a.C85068a;
import com.p2082ss.android.ugc.trill.p4370a.p4371a.C85069b;

/* renamed from: com.ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent */
public class I18nLoginActivityComponent extends BaseLoginActivityComponent implements AbstractC34530c<Boolean>, AbstractC34530c {

    /* renamed from: a */
    public Activity f190388a;

    /* renamed from: b */
    public Fragment f190389b;

    /* renamed from: c */
    public AbstractC34543f f190390c;

    /* renamed from: d */
    public Bundle f190391d;

    /* renamed from: e */
    public String f190392e;

    /* renamed from: f */
    public String f190393f;

    /* renamed from: g */
    private Handler f190394g = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    private Runnable f190395h = new Runnable() {
        /* class com.p2082ss.android.ugc.trill.main.login.component.I18nLoginActivityComponent.RunnableC850981 */

        static {
            Covode.recordClassIndex(99123);
        }

        public final void run() {
            Activity activity;
            if (I18nLoginActivityComponent.this.f190388a != null || (I18nLoginActivityComponent.this.f190389b != null && I18nLoginActivityComponent.this.f190389b.getActivity() != null)) {
                if (I18nLoginActivityComponent.this.f190388a == null) {
                    activity = I18nLoginActivityComponent.this.f190389b.getActivity();
                } else {
                    activity = I18nLoginActivityComponent.this.f190388a;
                }
                AbstractC34892bo b = C31575b.m65860b();
                IAccountService.C31274d dVar = new IAccountService.C31274d();
                dVar.f74960a = activity;
                dVar.f74961b = I18nLoginActivityComponent.this.f190392e;
                dVar.f74962c = I18nLoginActivityComponent.this.f190393f;
                dVar.f74963d = I18nLoginActivityComponent.this.f190391d;
                dVar.f74964e = new C85069b(I18nLoginActivityComponent.this.f190390c);
                dVar.f74965f = new C85068a(I18nLoginActivityComponent.this.f190388a);
                b.showLoginAndRegisterView(dVar.mo57084a());
            }
        }
    };

    static {
        Covode.recordClassIndex(99122);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.BaseLoginActivityComponent, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.BaseLoginActivityComponent
    public void onDestroy() {
        super.onDestroy();
        Activity activity = this.f190388a;
        if (activity instanceof AbstractC1204m) {
            ((AbstractC1204m) activity).getLifecycle().mo4013b(this);
        }
        this.f190388a = null;
        this.f190389b = null;
        this.f190391d = null;
        this.f190390c = null;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.AbstractC34530c
    /* renamed from: a */
    public final /* synthetic */ void mo60998a(Object obj) {
        Handler handler;
        Fragment fragment;
        Boolean bool = (Boolean) obj;
        if (this.f190388a != null || ((fragment = this.f190389b) != null && fragment.getActivity() != null)) {
            Activity activity = this.f190388a;
            if (activity == null) {
                activity = this.f190389b.getActivity();
            }
            if (bool != null && !bool.booleanValue() && activity != null && !activity.isFinishing() && (handler = this.f190394g) != null) {
                handler.removeCallbacks(this.f190395h);
                this.f190394g.post(this.f190395h);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.BaseLoginActivityComponent, com.p2082ss.android.ugc.aweme.base.component.AbstractC34542e
    /* renamed from: a */
    public final void mo61010a(Activity activity, String str, String str2, Bundle bundle, AbstractC34543f fVar) {
        Bundle bundle2 = bundle;
        if (activity != null && !activity.isFinishing()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            super.mo61010a(activity, str, str2, bundle2, fVar);
            this.f190389b = null;
            this.f190388a = activity;
            this.f190391d = bundle2;
            this.f190392e = str;
            this.f190393f = str2;
            this.f190390c = fVar;
            if (bundle2.getBoolean("is_disable_animation", false)) {
                this.f190395h.run();
                return;
            }
            this.f190394g.removeCallbacks(this.f190395h);
            this.f190394g.post(this.f190395h);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.component.BaseLoginActivityComponent, com.p2082ss.android.ugc.aweme.base.component.AbstractC34542e
    /* renamed from: a */
    public final void mo61011a(Fragment fragment, String str, String str2, Bundle bundle, AbstractC34543f fVar) {
        Bundle bundle2 = bundle;
        if (fragment != null && fragment.getActivity() != null && !fragment.getActivity().isFinishing()) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            super.mo61011a(fragment, str, str2, bundle2, fVar);
            this.f190389b = fragment;
            this.f190388a = fragment.getActivity();
            this.f190391d = bundle2;
            this.f190392e = str;
            this.f190393f = str2;
            this.f190390c = fVar;
            if (bundle2.getBoolean("is_disable_animation", false)) {
                this.f190395h.run();
                return;
            }
            this.f190394g.removeCallbacks(this.f190395h);
            this.f190394g.post(this.f190395h);
        }
    }
}
