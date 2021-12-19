package com.bytedance.ies.powerpage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpage.a */
public class ActivityC17733a extends ActivityC0218d implements AbstractC17736b {
    public static final C17734a Companion = new C17734a((byte) 0);
    private HashMap _$_findViewCache;
    private Fragment mRootFragment;

    static {
        Covode.recordClassIndex(20295);
    }

    /* renamed from: com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m32865x8ca95904(String str, String str2) {
        return 0;
    }

    /* renamed from: com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_LogLancet_i */
    public static int m32866x8ca95908(String str, String str2) {
        return 0;
    }

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public void onBeforeActivityCreated(Activity activity) {
    }

    /* renamed from: com.bytedance.ies.powerpage.a$a */
    public static final class C17734a {
        static {
            Covode.recordClassIndex(20296);
        }

        private C17734a() {
        }

        public /* synthetic */ C17734a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public void onBackPressed_Activity() {
        super.onBackPressed();
    }

    public final String getRootFragmentClsName() {
        return m32864x88e10ad4(getIntent(), "POWER_FRAGMENT_CLASS_NAME");
    }

    public final Fragment getRootFragment() {
        Fragment fragment = this.mRootFragment;
        if (fragment != null) {
            return fragment;
        }
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        if (supportFragmentManager != null) {
            return supportFragmentManager.mo3549a(R.id.d53);
        }
        return null;
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onBackPressed() {
        Fragment fragment = this.mRootFragment;
        if (!(fragment instanceof AbstractC17736b)) {
            super.onBackPressed();
        } else if (fragment != null) {
            ((AbstractC17736b) fragment).onBackPressed_Activity();
        } else {
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* renamed from: com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getExtras */
    public static Bundle m32863x138568ee(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.AbstractC17736b
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Fragment fragment = this.mRootFragment;
        if (fragment != null) {
            injectFields(fragment, intent);
            if (!(fragment instanceof AbstractC17736b)) {
                fragment = null;
            }
            AbstractC17736b bVar = (AbstractC17736b) fragment;
            if (bVar != null) {
                bVar.onNewIntent(intent);
            }
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra = m32864x88e10ad4(getIntent(), "POWER_FRAGMENT_CLASS_NAME");
        if (com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra != null) {
            Fragment a = getSupportFragmentManager().mo3549a(R.id.d53);
            AbstractC17736b bVar = null;
            if (a != null) {
                this.mRootFragment = a;
                C89219l.m154709a((Object) a, "");
                injectFields(a, getIntent());
            } else {
                Object newInstance = Class.forName(com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra).newInstance();
                if (!(newInstance instanceof Fragment)) {
                    newInstance = null;
                }
                Fragment fragment = (Fragment) newInstance;
                if (fragment != null) {
                    this.mRootFragment = fragment;
                    injectFields(fragment, getIntent());
                    getSupportFragmentManager().mo3552a().mo3453a(R.id.d53, fragment).mo3473c();
                }
            }
            Fragment fragment2 = this.mRootFragment;
            if (fragment2 instanceof AbstractC17736b) {
                bVar = fragment2;
            }
            AbstractC17736b bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.onBeforeActivityCreated(this);
            }
            setContentView(R.layout.bv);
        }
    }

    /* renamed from: com_bytedance_ies_powerpage_PowerActivity_com_ss_android_ugc_aweme_lancet_IntentLancet_getStringExtra */
    public static String m32864x88e10ad4(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private final void injectFields(Fragment fragment, Intent intent) {
        Class<?> loadClass;
        Constructor<?> constructor;
        if (intent != null) {
            Class<?> cls = fragment.getClass();
            String name = cls.getName();
            m32866x8ca95908("PowerActivity", "injecting fields for ".concat(String.valueOf(name)));
            try {
                ClassLoader classLoader = cls.getClassLoader();
                if (!(classLoader == null || (loadClass = classLoader.loadClass(name + "__BindExtra")) == null || (constructor = loadClass.getConstructor(cls, Intent.class)) == null)) {
                    constructor.newInstance(fragment, intent);
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("injecting fields field\n");
                e.printStackTrace();
                m32865x8ca95904("PowerActivity", sb.append(C89391z.f203057a.toString()).toString());
            }
            if (fragment.getArguments() == null) {
                fragment.setArguments(new Bundle());
            }
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                arguments.putAll(m32863x138568ee(intent));
            }
        }
    }

    @Override // com.bytedance.ies.powerpage.AbstractC17736b
    public void onActivityResult_Activity(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onActivityResult(int i, int i2, Intent intent) {
        Fragment fragment = this.mRootFragment;
        if (!(fragment instanceof AbstractC17736b)) {
            fragment = null;
        }
        AbstractC17736b bVar = (AbstractC17736b) fragment;
        if (bVar != null) {
            bVar.onActivityResult_Activity(i, i2, intent);
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }
}
