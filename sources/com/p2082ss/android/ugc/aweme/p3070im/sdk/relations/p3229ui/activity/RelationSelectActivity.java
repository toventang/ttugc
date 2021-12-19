package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.aweme.base.AbstractC34585f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3174e.C55076b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.group.feature.selector.p3205ui.p3207b.C55539b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.p3231b.C55899a;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3252c.C56201b;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity */
public final class RelationSelectActivity extends ActivityC17312a implements AbstractC34585f {

    /* renamed from: a */
    public static final C55896a f127430a = new C55896a((byte) 0);

    /* renamed from: b */
    private Fragment f127431b;

    /* renamed from: c */
    private HashMap f127432c;

    static {
        Covode.recordClassIndex(65686);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f127432c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f127432c == null) {
            this.f127432c = new HashMap();
        }
        View view = (View) this.f127432c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f127432c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.AbstractC34585f
    /* renamed from: c */
    public final String mo61041c() {
        return "contact_list";
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity$a */
    public static final class C55896a {
        static {
            Covode.recordClassIndex(65687);
        }

        private C55896a() {
        }

        public /* synthetic */ C55896a(byte b) {
            this();
        }

        /* renamed from: a */
        private static void m101699a(Context context, Intent intent) {
            C84349a.m145093a(intent, context);
            context.startActivity(intent);
        }

        /* renamed from: a */
        public static void m101700a(Context context, Bundle bundle) {
            C89219l.m154721d(context, "");
            Intent intent = new Intent(context, RelationSelectActivity.class);
            if (bundle != null) {
                intent.putExtra("key_member_list_type", 1);
                intent.putExtras(bundle);
            } else {
                intent.putExtra("key_member_list_type", 0);
            }
            m101699a(context, intent);
        }

        /* renamed from: a */
        public static void m101698a(Activity activity, Bundle bundle, int i) {
            C89219l.m154721d(activity, "");
            Intent intent = new Intent(activity, RelationSelectActivity.class);
            intent.putExtras(bundle);
            activity.startActivityForResult(intent, i);
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

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        if ((r2 - r1.bottom) != 0) goto L_0x004e;
     */
    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.powerpage.ActivityC17733a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBackPressed() {
        /*
        // Method dump skipped, instructions count: 134
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.activity.RelationSelectActivity.onBackPressed():void");
    }

    /* renamed from: a */
    private static Bundle m101696a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity$b */
    static final class C55897b extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C55897b f127433a = new C55897b();

        static {
            Covode.recordClassIndex(65688);
        }

        C55897b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C558981.f127434a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        C55539b.C55555p pVar;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity", "onCreate", true);
        activityConfiguration(C55897b.f127433a);
        super.onCreate(bundle);
        setContentView(R.layout.a48);
        C55076b.m100725d().setupStatusBar(this);
        AbstractC0952i supportFragmentManager = getSupportFragmentManager();
        AbstractC0976n a = supportFragmentManager.mo3552a();
        C89219l.m154716b(a, "");
        Fragment a2 = supportFragmentManager.mo3551a("relation_fragment_tag");
        this.f127431b = a2;
        if (a2 == null) {
            if (C56201b.m102110a() && (pVar = (C55539b.C55555p) getIntent().getSerializableExtra("member_select_config")) != null) {
                this.f127431b = new C55539b();
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("init_config", pVar);
                Fragment fragment = this.f127431b;
                if (fragment != null) {
                    fragment.setArguments(bundle2);
                }
                a.mo3451a(R.anim.af, R.anim.ah);
            }
            if (this.f127431b == null) {
                C55899a aVar = new C55899a();
                this.f127431b = aVar;
                aVar.setArguments(m101696a(getIntent()));
            }
        }
        Fragment fragment2 = this.f127431b;
        if (fragment2 == null) {
            C89219l.m154715b();
        }
        a.mo3470b(R.id.b4i, fragment2, "relation_fragment_tag").mo3473c();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.im.sdk.relations.ui.activity.RelationSelectActivity", "onCreate", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.f127431b;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }
}
