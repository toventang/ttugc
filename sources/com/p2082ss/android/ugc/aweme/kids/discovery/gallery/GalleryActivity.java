package com.p2082ss.android.ugc.aweme.kids.discovery.gallery;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.AbstractC0976n;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ActivityAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.ies.dmt.p1194ui.titlebar.AbstractC17250a;
import com.bytedance.ies.dmt.p1194ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a;
import com.bytedance.ies.foundation.activity.ActivityC17312a;
import com.bytedance.ies.foundation.activity.BaseActivityViewModel;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity */
public final class GalleryActivity extends ActivityC17312a {

    /* renamed from: a */
    public static final C57573a f131429a = new C57573a((byte) 0);

    /* renamed from: b */
    private C57577a f131430b;

    /* renamed from: c */
    private HashMap f131431c;

    static {
        Covode.recordClassIndex(67528);
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final void _$_clearFindViewByIdCache() {
        HashMap hashMap = this.f131431c;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a, com.bytedance.ies.powerpage.ActivityC17733a
    public final View _$_findCachedViewById(int i) {
        if (this.f131431c == null) {
            this.f131431c = new HashMap();
        }
        View view = (View) this.f131431c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f131431c.put(Integer.valueOf(i), findViewById);
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
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity", "onResume", true);
        super.onResume();
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity", "onResume", false);
    }

    @Override // androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d
    public final void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    @Override // com.bytedance.ies.foundation.activity.ActivityC17312a
    public final void onWindowFocusChanged(boolean z) {
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity$a */
    public static final class C57573a {
        static {
            Covode.recordClassIndex(67529);
        }

        private C57573a() {
        }

        public /* synthetic */ C57573a(byte b) {
            this();
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

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity$b */
    public static final class C57574b implements AbstractC17251a {

        /* renamed from: a */
        final /* synthetic */ GalleryActivity f131432a;

        static {
            Covode.recordClassIndex(67530);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: b */
        public final void mo27340b(View view) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C57574b(GalleryActivity galleryActivity) {
            this.f131432a = galleryActivity;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.titlebar.p1202a.AbstractC17251a
        /* renamed from: a */
        public final void mo27339a(View view) {
            this.f131432a.finish();
        }
    }

    /* renamed from: a */
    private static Bundle m104293a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity$c */
    static final class C57575c extends AbstractC89220m implements AbstractC89172b<BaseActivityViewModel, C89391z> {

        /* renamed from: a */
        public static final C57575c f131433a = new C57575c();

        static {
            Covode.recordClassIndex(67531);
        }

        C57575c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(BaseActivityViewModel baseActivityViewModel) {
            BaseActivityViewModel baseActivityViewModel2 = baseActivityViewModel;
            C89219l.m154721d(baseActivityViewModel2, "");
            baseActivityViewModel2.config(C575761.f131434a);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, com.bytedance.ies.foundation.activity.ActivityC17312a, androidx.appcompat.app.ActivityC0218d, com.bytedance.ies.powerpage.ActivityC17733a
    public final void onCreate(Bundle bundle) {
        String string;
        C15477a.m28474a(this, bundle);
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity", "onCreate", true);
        activityConfiguration(C57575c.f131433a);
        super.onCreate(bundle);
        setContentView(R.layout.ach);
        Fragment a = getSupportFragmentManager().mo3551a("gallery_grid_fragment");
        C57577a aVar = null;
        if (!(a instanceof C57577a)) {
            a = null;
        }
        C57577a aVar2 = (C57577a) a;
        this.f131430b = aVar2;
        String str = "";
        if (aVar2 == null) {
            Bundle a2 = m104293a(getIntent());
            if (a2 == null) {
                a2 = new Bundle();
            }
            C89219l.m154716b(a2, str);
            C89219l.m154721d(a2, str);
            C57577a aVar3 = new C57577a();
            String string2 = a2.getString("challenge_id");
            if (string2 == null) {
                string2 = str;
            }
            C89219l.m154716b(string2, str);
            if (string2.length() != 0) {
                aVar3.f130783b = new C57579b(string2);
                aVar3.setArguments(a2);
                aVar = aVar3;
            }
            this.f131430b = aVar;
            if (aVar != null) {
                AbstractC0976n a3 = getSupportFragmentManager().mo3552a();
                C89219l.m154716b(a3, str);
                a3.mo3470b(R.id.b82, aVar, "gallery_grid_fragment");
                a3.mo3474c(aVar).mo3467b();
            }
        }
        AbstractC17250a aVar4 = (AbstractC17250a) _$_findCachedViewById(R.id.c21);
        C89219l.m154716b(aVar4, str);
        aVar4.setColorMode(0);
        AbstractC17250a aVar5 = (AbstractC17250a) _$_findCachedViewById(R.id.c21);
        Bundle a4 = m104293a(getIntent());
        if (!(a4 == null || (string = a4.getString("title")) == null)) {
            str = string;
        }
        aVar5.setTitle(str);
        ((NormalTitleBar) _$_findCachedViewById(R.id.c21)).setOnTitleBarClickListener(new C57574b(this));
        ActivityAgent.onTrace("com.ss.android.ugc.aweme.kids.discovery.gallery.GalleryActivity", "onCreate", false);
    }
}
