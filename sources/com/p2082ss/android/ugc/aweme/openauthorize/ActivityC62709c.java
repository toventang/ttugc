package com.p2082ss.android.ugc.aweme.openauthorize;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sdk.p1625a.p1638c.p1640b.C22353b;
import com.p2082ss.android.ugc.aweme.authorize.C33985b;
import com.p2082ss.android.ugc.aweme.i18n.language.C53438a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.openauthorize.c */
public class ActivityC62709c extends ActivityC17312a {
    private SparseArray _$_findViewCache;
    private Fragment currentFragment;
    private String mCallerSignature;

    static {
        Covode.recordClassIndex(73515);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public void _$_clearFindViewByIdCache() {
        SparseArray sparseArray = this._$_findViewCache;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new SparseArray();
        }
        View view = (View) this._$_findViewCache.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m113087x8f222e2f(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.openauthorize.c$a */
    static final class C62710a extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C62710a f142170a = new C62710a();

        static {
            Covode.recordClassIndex(73516);
        }

        C62710a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C627111.f142171a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public void onConfigurationChanged(Configuration configuration) {
        C89219l.m154721d(configuration, "");
        super.onConfigurationChanged(configuration);
        C53438a.m98620a(this);
    }

    private final void getCallerInfo(Intent intent) {
        String callingPackage;
        if (intent != null && (callingPackage = getCallingPackage()) != null) {
            intent.putExtra("_bytedance_params_type_caller_package", callingPackage);
            List<String> a = C22353b.m42071a(this, callingPackage);
            if (a != null && !a.isEmpty()) {
                this.mCallerSignature = a.get(0);
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public void onCreate(Bundle bundle) {
        Bundle com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras;
        activityConfiguration(C62710a.f142170a);
        super.onCreate(bundle);
        C53438a.m98620a(this);
        setContentView(R.layout.az);
        getCallerInfo(getIntent());
        try {
            Intent intent = getIntent();
            if (intent != null && (com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras = m113087x8f222e2f(intent)) != null) {
                C89219l.m154716b(com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "");
                String str = this.mCallerSignature;
                C89219l.m154721d(com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras, "");
                C33985b bVar = new C33985b();
                com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras.putString("caller_signature_key", str);
                bVar.setArguments(com_ss_android_ugc_aweme_openauthorize_BaseI18nAuthorizedNewActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras);
                this.currentFragment = bVar;
                getSupportFragmentManager().mo3552a().mo3453a(R.id.b82, bVar).mo3473c();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return true;
        }
        Fragment fragment = this.currentFragment;
        if (fragment == null || !(fragment instanceof C33985b)) {
            finish();
            return false;
        }
        Objects.requireNonNull(fragment, "null cannot be cast to non-null type com.ss.android.ugc.aweme.authorize.BaseI18nAuthorizedFragment");
        ((C33985b) fragment).mo60279b();
        return false;
    }
}
