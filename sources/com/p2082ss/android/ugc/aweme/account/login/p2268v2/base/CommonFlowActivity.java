package com.p2082ss.android.ugc.aweme.account.login.p2268v2.base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1210r;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.ies.foundation.base.AbstractC17362a;
import com.bytedance.sdk.p1625a.p1642e.AbstractC22367g;
import com.bytedance.sdk.p1625a.p1642e.C22362d;
import com.p2082ss.android.ugc.aweme.IAccountService;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.EnumC32594j;
import com.p2082ss.android.ugc.aweme.account.login.p2268v2.p2271ui.C32791i;
import com.p2082ss.android.ugc.aweme.activity.processor.C33071aa;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity */
public class CommonFlowActivity extends AbstractActivityC32568a {

    /* renamed from: f */
    public static SparseArray<IAccountService.AbstractC31277g> f77692f = new SparseArray<>();

    /* renamed from: g */
    public static final C32560a f77693g = new C32560a((byte) 0);

    /* renamed from: a */
    private EnumC32594j f77694a = EnumC32594j.PHONE_SMS_CHANGE_PASSWORD;

    /* renamed from: b */
    public boolean f77695b;

    /* renamed from: c */
    public Bundle f77696c;

    /* renamed from: d */
    public boolean f77697d = true;

    /* renamed from: e */
    public Integer f77698e;

    /* renamed from: h */
    private final AbstractC89244h f77699h = C89250i.m154773a((AbstractC89171a) new C32565d(this));

    /* renamed from: i */
    private HashMap f77700i;

    /* renamed from: a */
    public static final void m67015a(Activity activity, EnumC32594j jVar, EnumC32592i iVar, Bundle bundle, IAccountService.AbstractC31277g gVar, Class<? extends Activity> cls, Boolean bool) {
        C32560a.m67023a(activity, jVar, iVar, bundle, gVar, cls, bool);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f77700i;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public View _$_findCachedViewById(int i) {
        if (this.f77700i == null) {
            this.f77700i = new HashMap();
        }
        View view = (View) this.f77700i.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f77700i.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public int mo58017c() {
        return 0;
    }

    /* renamed from: h */
    public final Bundle mo58450h() {
        return (Bundle) this.f77699h.getValue();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onResume() {
        C15477a.m28476b(this);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity$a */
    public static final class C32560a {
        static {
            Covode.recordClassIndex(39331);
        }

        private C32560a() {
        }

        public /* synthetic */ C32560a(byte b) {
            this();
        }

        /* renamed from: a */
        private static void m67022a(Activity activity, Intent intent) {
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
        }

        /* renamed from: a */
        public static void m67021a(Activity activity, int i, IAccountService.AbstractC31277g gVar, Boolean bool) {
            C89219l.m154721d(activity, "");
            if (gVar != null) {
                if (C89219l.m154714a((Object) bool, (Object) true)) {
                    CommonFlowActivity.f77692f.put(i, gVar);
                } else if (activity instanceof AbstractC1204m) {
                    CommonFlowActivity.f77692f.put(i, gVar);
                    AbstractC1204m mVar = (AbstractC1204m) activity;
                    mVar.getLifecycle().mo4012a(new CommonFlowActivity$Companion$addResult$1(i, mVar));
                } else {
                    throw new IllegalArgumentException("activity must be a LifecycleOwner!");
                }
            }
        }

        /* renamed from: a */
        public static void m67023a(Activity activity, EnumC32594j jVar, EnumC32592i iVar, Bundle bundle, IAccountService.AbstractC31277g gVar, Class<? extends Activity> cls, Boolean bool) {
            C89219l.m154721d(activity, "");
            C89219l.m154721d(jVar, "");
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(bundle, "");
            int i = bundle.getInt("current_scene", -1);
            if (i != -1) {
                bundle.putInt("last_scene", i);
            }
            if (cls == null) {
                cls = CommonFlowActivity.class;
            }
            Intent intent = new Intent(activity, cls);
            bundle.putInt("next_page", jVar.getValue());
            bundle.putInt("current_scene", iVar.getValue());
            intent.putExtras(bundle);
            intent.putExtra("action_type", iVar.getValue());
            m67021a(activity, iVar.getValue(), gVar, bool);
            m67022a(activity, intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity$d */
    static final class C32565d extends AbstractC89220m implements AbstractC89171a<Bundle> {

        /* renamed from: a */
        final /* synthetic */ CommonFlowActivity f77705a;

        static {
            Covode.recordClassIndex(39336);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32565d(CommonFlowActivity commonFlowActivity) {
            super(0);
            this.f77705a = commonFlowActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Bundle invoke() {
            Bundle a = m67025a(this.f77705a.getIntent());
            if (a == null) {
                a = new Bundle();
            }
            C89219l.m154716b(a, "");
            a.remove("next_page");
            return a;
        }

        /* renamed from: a */
        private static Bundle m67025a(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }
    }

    static {
        Covode.recordClassIndex(39329);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public void finish() {
        int i;
        super.finish();
        int intExtra = getIntent().getIntExtra("action_type", -1);
        if (intExtra != -1 && f77692f.get(intExtra) != null) {
            if (!this.f77697d || this.f77695b) {
                IAccountService.AbstractC31277g gVar = f77692f.get(intExtra);
                if (gVar == null) {
                    C89219l.m154715b();
                }
                IAccountService.AbstractC31277g gVar2 = gVar;
                Integer num = this.f77698e;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = intExtra;
                }
                gVar2.onResult(i, 1, this.f77696c);
            } else {
                IAccountService.AbstractC31277g gVar3 = f77692f.get(intExtra);
                if (gVar3 == null) {
                    C89219l.m154715b();
                }
                gVar3.onResult(intExtra, 2, null);
            }
            f77692f.remove(intExtra);
        }
    }

    /* renamed from: a */
    private static Bundle m67014a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity$b */
    static final class C32561b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        final /* synthetic */ CommonFlowActivity f77701a;

        static {
            Covode.recordClassIndex(39332);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32561b(CommonFlowActivity commonFlowActivity) {
            super(1);
            this.f77701a = commonFlowActivity;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(new AbstractC89171a<AbstractC17362a>(this) {
                /* class com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.CommonFlowActivity.C32561b.C325621 */

                /* renamed from: a */
                final /* synthetic */ C32561b f77702a;

                static {
                    Covode.recordClassIndex(39333);
                }

                {
                    this.f77702a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC17362a invoke() {
                    return new C33071aa(this.f77702a.f77701a.mo58017c());
                }
            });
            baseActivityViewModel2.config(C325632.f77703a);
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a
    /* renamed from: b */
    public final void mo57418b(Bundle bundle) {
        Bundle bundle2;
        this.f77695b = true;
        if (bundle == null || (bundle2 = bundle.getBundle("final_data")) == null) {
            bundle2 = new Bundle();
        }
        this.f77696c = bundle2;
        finish();
    }

    @Override // com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a
    /* renamed from: a */
    public void mo57417a(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        EnumC32594j a = EnumC32594j.C32595a.m67087a(bundle2.getInt("next_page", EnumC32594j.PHONE_SMS_CHANGE_PASSWORD.getValue()));
        int i = bundle2.getInt("previous_page", -1);
        if (i != a.getValue() || i == -1) {
            bundle2.putInt("previous_page", bundle2.getInt("current_page", -1));
            bundle2.putInt("current_page", a.getValue());
            int i2 = bundle2.getInt("next_next_page", -1);
            if (i2 != -1) {
                bundle2.putInt("next_page", i2);
                bundle2.remove("next_next_page");
            } else {
                bundle2.remove("next_page");
            }
            AbstractActivityC32568a.m67029a(this, C32791i.m67383a(a), bundle2);
            return;
        }
        onBackPressed();
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onCreate", true);
        activityConfiguration(new C32561b(this));
        super.onCreate(bundle);
        this.f77694a = EnumC32594j.C32595a.m67087a(getIntent().getIntExtra("next_page", EnumC32594j.PHONE_SMS_CHANGE_PASSWORD.getValue()));
        if (bundle == null) {
            C1210r<Bundle> rVar = ((ActionResultModel) C1181ae.m3881a(this, (C1175ad.AbstractC1177b) null).mo3983a(ActionResultModel.class)).f77690a;
            Bundle a = m67014a(getIntent());
            if (a == null) {
                a = new Bundle();
            }
            a.putString("enter_from", mo58455e());
            a.putString("enter_method", mo58456f());
            a.putString("enter_type", mo58457g());
            a.putInt("next_page", this.f77694a.getValue());
            rVar.postValue(a);
        }
        C22362d.m42100a().mo36726a(C32564c.f77704a);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity", "onCreate", false);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.base.CommonFlowActivity$c */
    static final class C32564c implements AbstractC22367g.AbstractC22368a {

        /* renamed from: a */
        public static final C32564c f77704a = new C32564c();

        static {
            Covode.recordClassIndex(39335);
        }

        C32564c() {
        }

        @Override // com.bytedance.sdk.p1625a.p1642e.AbstractC22367g.AbstractC22368a
        /* renamed from: a */
        public final void mo36733a(String str, Bundle bundle) {
            C39162r.m79453a(str, bundle);
        }
    }

    /* renamed from: a */
    public final void mo58449a(int i, Bundle bundle) {
        this.f77696c = bundle;
        this.f77698e = Integer.valueOf(i);
        this.f77697d = false;
        finish();
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.p2082ss.android.ugc.aweme.account.login.p2268v2.base.AbstractActivityC32568a, com.bytedance.ies.powerpage.ActivityC17733a
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C22362d.m42100a().mo36723a(i, i2, intent);
    }
}
