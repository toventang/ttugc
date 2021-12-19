package com.bytedance.sdk.bdlynx.container;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.sdk.bdlynx.C22587a;
import com.bytedance.sdk.bdlynx.p1677a.p1681d.C22608a;
import com.bytedance.sdk.bdlynx.p1677a.p1682e.AbstractC22609a;
import com.bytedance.sdk.bdlynx.p1687e.AbstractC22637b;
import com.bytedance.sdk.bdlynx.p1687e.AbstractC22658f;
import com.bytedance.sdk.bdlynx.p1687e.C22646c;
import com.bytedance.sdk.bdlynx.p1687e.p1689b.p1690a.C22638a;
import com.bytedance.sdk.bdlynx.view.AbstractC22680e;
import com.bytedance.sdk.bdlynx.view.BDLynxView;
import com.bytedance.sdk.bdlynx.view.C22684g;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import com.lynx.devtoolwrapper.LynxDevtoolGlobalHelper;
import com.lynx.tasm.LynxView;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

public class BDLynxActivity extends Activity {

    /* renamed from: e */
    public static final Map<String, BDLynxActivity> f53440e = new LinkedHashMap();

    /* renamed from: f */
    public static final C22625a f53441f = new C22625a((byte) 0);

    /* renamed from: a */
    public String f53442a;

    /* renamed from: b */
    public Uri f53443b;

    /* renamed from: c */
    public boolean f53444c;

    /* renamed from: d */
    public String f53445d;

    /* renamed from: g */
    private HashMap f53446g;

    /* renamed from: a */
    public final View mo36892a(int i) {
        if (this.f53446g == null) {
            this.f53446g = new HashMap();
        }
        View view = (View) this.f53446g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f53446g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
    }

    /* renamed from: com.bytedance.sdk.bdlynx.container.BDLynxActivity$a */
    public static final class C22625a {
        static {
            Covode.recordClassIndex(26442);
        }

        private C22625a() {
        }

        public /* synthetic */ C22625a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final BDLynxView mo36893a() {
        View findViewById = findViewById(R.id.r_);
        C89219l.m154709a((Object) findViewById, "");
        return (BDLynxView) findViewById;
    }

    static {
        Covode.recordClassIndex(26441);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        C15477a.m28476b(this);
        super.onResume();
        if (this.f53444c) {
            LynxDevtoolGlobalHelper.getInstance().showDebugView((ViewGroup) mo36892a(R.id.ra));
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
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

    /* access modifiers changed from: protected */
    public void onDestroy() {
        String str;
        C15477a.m28479e(this);
        super.onDestroy();
        BDLynxView bDLynxView = (BDLynxView) mo36892a(R.id.r_);
        String str2 = bDLynxView.f53542b;
        if (!(str2 == null || str2.length() == 0 || C22684g.f53588b.get(str2) == null)) {
            Integer num = C22684g.f53588b.get(str2);
            if (num == null) {
                C89219l.m154707a();
            }
            int intValue = num.intValue() - 1;
            if (intValue <= 0) {
                C22684g.f53587a.remove(str2);
                C22684g.f53588b.remove(str2);
            } else {
                C22684g.f53588b.put(str2, Integer.valueOf(intValue));
            }
        }
        LynxView lynxView = bDLynxView.f53541a;
        if (lynxView == null) {
            C89219l.m154710a("lynxView");
        }
        lynxView.destroy();
        if (this.f53444c && (str = this.f53442a) != null) {
            f53440e.remove(str);
        }
    }

    /* renamed from: com.bytedance.sdk.bdlynx.container.BDLynxActivity$b */
    public static final class C22626b extends AbstractC22658f {

        /* renamed from: a */
        final /* synthetic */ BDLynxActivity f53447a;

        static {
            Covode.recordClassIndex(26443);
        }

        @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22657e
        /* renamed from: a */
        public final void mo36901a(int i) {
        }

        @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22658f
        /* renamed from: b */
        public final void mo36903b(C22638a aVar) {
            C89219l.m154719c(aVar, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C22626b(BDLynxActivity bDLynxActivity) {
            this.f53447a = bDLynxActivity;
        }

        @Override // com.bytedance.sdk.bdlynx.p1687e.AbstractC22658f
        /* renamed from: a */
        public final void mo36902a(C22638a aVar) {
            C89219l.m154719c(aVar, "");
            this.f53447a.mo36893a().getLynxView().removeAllViews();
            ((BDLynxView) this.f53447a.mo36892a(R.id.r_)).mo36938a(aVar, "");
        }
    }

    /* renamed from: com.bytedance.sdk.bdlynx.container.BDLynxActivity$c */
    public static final class C22627c implements AbstractC22630c {

        /* renamed from: a */
        final /* synthetic */ BDLynxActivity f53448a;

        static {
            Covode.recordClassIndex(26444);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C22627c(BDLynxActivity bDLynxActivity) {
            this.f53448a = bDLynxActivity;
        }

        @Override // com.bytedance.sdk.bdlynx.container.AbstractC22630c
        /* renamed from: a */
        public final void mo36905a(String str) {
            C89219l.m154719c(str, "");
            this.f53448a.mo36893a().getLynxView().removeAllViews();
            this.f53448a.mo36893a().mo36939a((AbstractC22680e) str, "");
        }

        @Override // com.bytedance.sdk.bdlynx.container.AbstractC22630c
        /* renamed from: b */
        public final void mo36906b(String str) {
            C89219l.m154719c(str, "");
            this.f53448a.mo36893a().getLynxView().removeAllViews();
            this.f53448a.mo36893a().mo36939a((AbstractC22680e) str, "");
        }

        @Override // com.bytedance.sdk.bdlynx.container.AbstractC22630c
        /* renamed from: a */
        public final void mo36904a(C22629b bVar) {
            C89219l.m154719c(bVar, "");
            BDLynxActivity bDLynxActivity = this.f53448a;
            C89219l.m154719c(bVar, "");
            String str = bDLynxActivity.f53445d;
            if (str == null) {
                C89219l.m154710a("scope");
            }
            C89219l.m154719c(str, "");
            AbstractC22637b bVar2 = C22587a.f53367a.get(str);
            if (bVar2 == null) {
                bVar2 = new C22646c();
                C22587a.f53367a.put(str, bVar2);
            }
            bVar2.mo36918a(bVar.f53451b, bVar.f53452c, bVar.f53453d, new C22626b(bDLynxActivity));
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0091, code lost:
        if (r1.equals("https") != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x009a, code lost:
        if (r1.equals("http") != false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009c, code lost:
        r0 = r3.toString();
        p4600h.p4611f.p4613b.C89219l.m154709a((java.lang.Object) r0, "");
        r2.mo36905a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a6, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.bdlynx.container.BDLynxActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private static String m42683a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C89219l.m154719c(strArr, "");
        C89219l.m154719c(iArr, "");
        C89219l.m154719c(this, "");
        C89219l.m154719c(strArr, "");
        C89219l.m154719c(iArr, "");
        C89219l.m154719c(this, "");
        C89219l.m154719c(strArr, "");
        C89219l.m154719c(iArr, "");
        C22608a.f53417a.mo36876a(AbstractC22609a.class);
    }
}
