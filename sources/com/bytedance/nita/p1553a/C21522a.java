package com.bytedance.nita.p1553a;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.nita.p1554b.C21531a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.tiktok.security.p4333a.C84349a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import p4600h.C89388w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.nita.a.a */
public final class C21522a extends ContextThemeWrapper {

    /* renamed from: a */
    public WeakReference<Context> f51100a;

    static {
        Covode.recordClassIndex(25162);
    }

    public final Resources getResources() {
        Context context;
        Resources resources;
        WeakReference<Context> weakReference = this.f51100a;
        if (weakReference != null && (context = weakReference.get()) != null && (resources = context.getResources()) != null) {
            return resources;
        }
        Resources resources2 = super.getResources();
        C89219l.m154709a((Object) resources2, "");
        return resources2;
    }

    public final AssetManager getAssets() {
        Context context;
        Resources resources;
        AssetManager assets;
        WeakReference<Context> weakReference = this.f51100a;
        if (weakReference != null && (context = weakReference.get()) != null && (resources = context.getResources()) != null && (assets = resources.getAssets()) != null) {
            return assets;
        }
        AssetManager assets2 = super.getAssets();
        C89219l.m154709a((Object) assets2, "");
        return assets2;
    }

    /* renamed from: a */
    public final void mo35183a(Context context) {
        C89219l.m154719c(context, "");
        this.f51100a = new WeakReference<>(context);
    }

    @Override // android.content.Context, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final Object getSystemService(String str) {
        C89219l.m154719c(str, "");
        return m40435a(this, str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21522a(Context context) {
        super(context, 0);
        C89219l.m154719c(context, "");
        this.f51100a = new WeakReference<>(context);
    }

    public final void startActivity(Intent intent) {
        Context context;
        WeakReference<Context> weakReference = this.f51100a;
        Context context2 = null;
        if (weakReference != null) {
            context2 = weakReference.get();
        }
        if (context2 instanceof Activity) {
            WeakReference<Context> weakReference2 = this.f51100a;
            if (weakReference2 == null || (context = weakReference2.get()) == null) {
                throw new C89388w("null cannot be cast to non-null type");
            }
            Activity activity = (Activity) context;
            C84349a.m145093a(intent, activity);
            activity.startActivity(intent);
            return;
        }
        throw new C21531a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C21522a(android.content.Context r3, int r4) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154719c(r3, r0)
            android.content.Context r1 = r3.getApplicationContext()
            boolean r0 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132201c
            if (r0 != 0) goto L_0x0018
        L_0x000d:
            r2.<init>(r1, r4)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f51100a = r0
            return
        L_0x0018:
            if (r1 == 0) goto L_0x001b
            goto L_0x000d
        L_0x001b:
            android.app.Application r1 = com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a.f132199a
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.nita.p1553a.C21522a.<init>(android.content.Context, int):void");
    }

    /* renamed from: a */
    private static Object m40435a(ContextThemeWrapper contextThemeWrapper, String str) {
        Object obj;
        MethodCollector.m26663i(6493);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = super.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = super.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = super.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(6493);
                }
            }
        } else {
            obj = super.getSystemService(str);
        }
        return obj;
    }
}
