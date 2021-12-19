package com.bytedance.scene.p1624ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.ActivityC0218d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.utils.C15477a;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.AbstractC22233n;
import com.bytedance.scene.C22217i;
import com.bytedance.scene.C22281v;
import com.bytedance.scene.navigation.C22242e;
import com.bytedance.scene.navigation.C22258g;
import com.bytedance.scene.p1617a.AbstractC22129d;
import com.bytedance.scene.p1617a.C22116a;
import com.bytedance.scene.p1621c.AbstractC22156g;
import com.bytedance.scene.p1621c.C22154f;
import com.bytedance.scene.p1622d.C22158a;
import com.bytedance.scene.p1622d.C22160b;
import com.bytedance.scene.p1622d.C22164e;
import com.bytedance.sysoptimizer.BadParcelableCrashOptimizer;
import com.bytedance.sysoptimizer.EnterTransitionCrashOptimizer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.bytedance.scene.ui.SceneContainerActivity */
public class SceneContainerActivity extends ActivityC0218d {

    /* renamed from: a */
    public static final Set<AbstractC22156g> f52682a = new HashSet();

    /* renamed from: b */
    public static final List<SceneContainerActivity> f52683b = new ArrayList();

    /* renamed from: c */
    public int f52684c = -1;

    /* renamed from: d */
    private AbstractC22233n f52685d;

    /* renamed from: e */
    private boolean f52686e;

    @Override // androidx.fragment.app.ActivityC0945e
    public void onPause() {
        C15477a.m28477c(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onResume() {
        C15477a.m28476b(this);
        super.onResume();
    }

    /* renamed from: com.bytedance.scene.ui.SceneContainerActivity$b */
    static class C22275b extends AbstractC22129d {
        static {
            Covode.recordClassIndex(26088);
        }

        private C22275b() {
        }

        /* synthetic */ C22275b(byte b) {
            this();
        }

        @Override // com.bytedance.scene.p1617a.AbstractC22129d
        /* renamed from: a */
        public final void mo36311a(C22116a aVar, C22116a aVar2, Runnable runnable, C22160b bVar) {
            runnable.run();
        }

        @Override // com.bytedance.scene.p1617a.AbstractC22129d
        /* renamed from: b */
        public final void mo36312b(C22116a aVar, C22116a aVar2, Runnable runnable, C22160b bVar) {
            MethodCollector.m26663i(7722);
            View view = aVar.f52296b;
            View view2 = aVar2.f52296b;
            C22158a.m41634a(view);
            C22158a.m41634a(view2);
            view.setVisibility(0);
            int i = Build.VERSION.SDK_INT;
            this.f52312a.getOverlay().add(view);
            runnable.run();
            MethodCollector.m26664o(7722);
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e
    public void onBackPressed() {
        if (!this.f52685d.mo36340a()) {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onDestroy() {
        C15477a.m28479e(this);
        super.onDestroy();
        f52683b.remove(this);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStart() {
        C15477a.m28473a(this);
        super.onStart();
        this.f52686e = true;
    }

    static {
        Covode.recordClassIndex(26085);
    }

    @Override // androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onStop() {
        C15477a.m28478d(this);
        super.onStop();
        this.f52686e = false;
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

    /* renamed from: com.bytedance.scene.ui.SceneContainerActivity$a */
    public static class C22273a extends AbstractC22219j {
        static {
            Covode.recordClassIndex(26086);
        }

        @Override // com.bytedance.scene.AbstractC22219j
        /* renamed from: a */
        public final void mo22704a(Bundle bundle) {
            super.mo22704a(bundle);
            C22164e<? extends Class<? extends AbstractC22219j>, Bundle> a = SceneContainerActivity.m41944a(mo36486t().getIntent());
            C22154f.C22155a aVar = new C22154f.C22155a();
            aVar.f52386c = new C22275b((byte) 0);
            aVar.f52385b = new AbstractC22156g() {
                /* class com.bytedance.scene.p1624ui.SceneContainerActivity.C22273a.C222741 */

                static {
                    Covode.recordClassIndex(26087);
                }

                @Override // com.bytedance.scene.p1621c.AbstractC22156g
                /* renamed from: a */
                public final void mo36339a(Object obj) {
                    C22281v a = C22281v.m41959a(C22273a.this.mo36486t().getIntent());
                    Message obtain = Message.obtain();
                    obtain.obj = obj;
                    try {
                        a.f52704a.send(obtain);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                    C22273a.this.mo36486t().finish();
                }
            };
            C22242e.m41886b(this).mo36533a(a.f52402a, a.f52403b, aVar.mo36338b());
        }

        @Override // com.bytedance.scene.AbstractC22219j
        /* renamed from: a */
        public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            MethodCollector.m26663i(4180);
            View view = new View(mo36486t());
            MethodCollector.m26664o(4180);
            return view;
        }
    }

    /* renamed from: a */
    public static C22164e<? extends Class<? extends AbstractC22219j>, Bundle> m41944a(Intent intent) {
        try {
            Class<?> cls = Class.forName(m41945a(intent, "class_name"));
            Bundle bundleExtra = intent.getBundleExtra("arguments");
            Context context = BadParcelableCrashOptimizer.getContext();
            if (!(bundleExtra == null || context == null)) {
                bundleExtra.setClassLoader(context.getClassLoader());
            }
            return C22164e.m41646a(cls, bundleExtra);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    @Override // androidx.core.app.ActivityC0580d, androidx.fragment.app.ActivityC0945e, androidx.appcompat.app.ActivityC0218d
    public void onCreate(Bundle bundle) {
        C15477a.m28474a(this, bundle);
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("theme", -1);
        if (intExtra != -1) {
            setTheme(intExtra);
        }
        this.f52684c = intExtra;
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 1024);
        }
        f52683b.add(this);
        if (C22281v.m41959a(getIntent()) != null) {
            this.f52685d = C22217i.m41763a(this, new C22258g(C22273a.class, (Bundle) null));
            return;
        }
        C22164e<? extends Class<? extends AbstractC22219j>, Bundle> a = m41944a(getIntent());
        this.f52685d = C22217i.m41763a(this, new C22258g((Class<? extends AbstractC22219j>) a.f52402a, a.f52403b));
    }

    /* renamed from: a */
    private static String m41945a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }
}
