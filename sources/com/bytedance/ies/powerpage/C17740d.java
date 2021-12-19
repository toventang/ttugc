package com.bytedance.ies.powerpage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerpage.p1235a.AbstractC17735a;
import com.bytedance.ies.powerpage.p1236b.C17737a;
import com.bytedance.router.FakeFragment;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.powerpage.d */
public final class C17740d {

    /* renamed from: a */
    public static final C17740d f42407a = new C17740d();

    /* renamed from: b */
    private static String f42408b = "";

    /* renamed from: c */
    private static Class<? extends ActivityC0945e> f42409c;

    /* renamed from: d */
    private static boolean f42410d;

    private C17740d() {
    }

    static {
        Covode.recordClassIndex(20302);
    }

    /* JADX DEBUG: Type inference failed for r0v5. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<? extends androidx.fragment.app.e> */
    /* renamed from: a */
    public final void mo28216a() {
        MethodCollector.m26663i(6968);
        f42408b = "com.ss.android.ugc.aweme.host.TikTokHostActivity";
        if (f42410d) {
            MethodCollector.m26664o(6968);
            return;
        }
        synchronized (this) {
            try {
                if (!f42410d) {
                    Class cls = Class.forName(f42408b);
                    if (cls != null) {
                        f42409c = cls;
                        SmartRouter.addLastInterceptor(new C17737a());
                        f42410d = true;
                    } else {
                        C89388w wVar = new C89388w("null cannot be cast to non-null type");
                        MethodCollector.m26664o(6968);
                        throw wVar;
                    }
                }
            } finally {
                MethodCollector.m26664o(6968);
            }
        }
    }

    /* renamed from: a */
    public final Intent mo28214a(Context context, Class<? extends Fragment> cls, Bundle bundle) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(cls, "");
        mo28216a();
        AbstractC17735a aVar = (AbstractC17735a) cls.getAnnotation(AbstractC17735a.class);
        if (aVar == null) {
            return null;
        }
        Intent intent = new Intent();
        if (C89219l.m154714a(C89204ab.m154669a(aVar.mo28211a()), C89204ab.m154669a(ActivityC0945e.class))) {
            Class<? extends ActivityC0945e> cls2 = f42409c;
            if (cls2 == null || intent.setClass(context, cls2) == null) {
                throw new RuntimeException("No default FragmentActivity!!!");
            }
        } else {
            intent.setClass(context, aVar.mo28211a());
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("POWER_FRAGMENT_CLASS_NAME", cls.getName());
        return intent;
    }

    /* renamed from: a */
    public final Intent mo28215a(Context context, Class<? extends Fragment> cls, Bundle bundle, int i, OnActivityResultCallback onActivityResultCallback) {
        C89219l.m154719c(context, "");
        C89219l.m154719c(cls, "");
        Intent a = mo28214a(context, cls, bundle);
        if (a == null) {
            return null;
        }
        if (i == Integer.MIN_VALUE) {
            C84349a.m145093a(a, context);
            context.startActivity(a);
        } else {
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                if (onActivityResultCallback == null || !(activity instanceof ActivityC0945e)) {
                    activity.startActivityForResult(a, i);
                } else {
                    FakeFragment fakeFragment = new FakeFragment();
                    fakeFragment.setCallback(onActivityResultCallback);
                    ((ActivityC0945e) activity).getSupportFragmentManager().mo3552a().mo3456a(fakeFragment, String.valueOf(System.currentTimeMillis())).mo3476d();
                    fakeFragment.startActivityForResult(a, i);
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ Intent m32875a(C17740d dVar, Context context, Class cls, Bundle bundle, int i, int i2) {
        if ((i2 & 4) != 0) {
            bundle = null;
        }
        if ((i2 & 8) != 0) {
            i = Integer.MIN_VALUE;
        }
        return dVar.mo28215a(context, cls, bundle, i, null);
    }
}
