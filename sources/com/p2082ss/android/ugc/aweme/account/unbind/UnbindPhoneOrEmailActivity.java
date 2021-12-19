package com.p2082ss.android.ugc.aweme.account.unbind;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.ActionResultModel;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32592i;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32791i;
import com.p2082ss.android.ugc.aweme.account.p2233a.p2235b.C31376a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity */
public final class UnbindPhoneOrEmailActivity extends AbstractActivityC32568a {

    /* renamed from: a */
    public static final boolean f78527a = false;

    /* renamed from: b */
    public static final C32997a f78528b = new C32997a((byte) 0);

    /* renamed from: c */
    private HashMap f78529c;

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f78529c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f78529c == null) {
            this.f78529c = new HashMap();
        }
        View view = (View) this.f78529c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78529c.put(Integer.valueOf(i), findViewById);
        return findViewById;
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity$a */
    public static final class C32997a {
        static {
            Covode.recordClassIndex(39803);
        }

        private C32997a() {
        }

        public /* synthetic */ C32997a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(39802);
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

    /* renamed from: a */
    private static Bundle m67633a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a
    /* renamed from: a */
    public final void mo57417a(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        EnumC32594j a = EnumC32594j.C32595a.m67087a(bundle2.getInt("next_page", EnumC32594j.UNBIND_PHONE_CONFIRM.getValue()));
        bundle2.remove("next_page");
        bundle2.putInt("current_page", a.getValue());
        AbstractActivityC32568a.m67029a(this, C32791i.m67383a(a), bundle2);
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onCreate", true);
        super.onCreate(bundle);
        if (bundle == null) {
            ((ActionResultModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ActionResultModel.class)).f77690a.postValue(m67633a(getIntent()));
        }
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.unbind.UnbindPhoneOrEmailActivity", "onCreate", false);
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a
    /* renamed from: b */
    public final void mo57418b(Bundle bundle) {
        boolean z;
        Integer num;
        String string;
        String str;
        if (bundle != null) {
            z = bundle.getBoolean("unbind_success");
            num = Integer.valueOf(bundle.getInt("unbind_type"));
        } else {
            z = false;
            num = null;
        }
        if (z) {
            int value = EnumC32592i.UNBIND_PHONE.getValue();
            if (num != null && num.intValue() == value) {
                string = getString(R.string.do7);
            } else {
                int value2 = EnumC32592i.UNBIND_EMAIL.getValue();
                if (num != null && num.intValue() == value2) {
                    string = getString(R.string.blw);
                } else {
                    string = "";
                }
            }
        } else {
            string = getString(R.string.h1f);
        }
        C89219l.m154716b(string, "");
        if (!TextUtils.isEmpty(string)) {
            C23144b bVar = new C23144b(this);
            if (z) {
                bVar.mo37636b(R.raw.icon_tick_fill_small);
                bVar.mo37639d(R.attr.ax);
            }
            bVar.mo37635a(string);
            bVar.mo37632a();
            bVar.mo37637b();
            C31376a aVar = new C31376a();
            aVar.mo57399a("enter_from", mo58455e());
            int value3 = EnumC32592i.UNBIND_PHONE.getValue();
            if (num != null && num.intValue() == value3) {
                str = "phone";
            } else {
                str = "email";
            }
            aVar.mo57399a("unlink_type", str);
            C39162r.m79460a("show_unlink_phone_email_success_banner", aVar.f75156a);
        }
        finish();
    }
}
