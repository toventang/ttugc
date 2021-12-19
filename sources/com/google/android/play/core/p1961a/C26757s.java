package com.google.android.play.core.p1961a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.install.C27055a;
import com.google.android.play.core.p1963b.AbstractC26931bv;
import com.google.android.play.core.p1963b.C26903au;
import com.google.android.play.core.p1963b.C26909b;
import com.google.android.play.core.p1963b.C26952l;
import com.google.android.play.core.p1965d.C26991q;
import com.google.android.play.core.tasks.AbstractC27062d;
import com.google.android.play.core.tasks.C27064f;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.a.s */
public final class C26757s {

    /* renamed from: a */
    static final C26909b f63383a = new C26909b("AppUpdateService");

    /* renamed from: e */
    private static final Intent f63384e = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* renamed from: b */
    C26952l<AbstractC26931bv> f63385b;

    /* renamed from: c */
    final String f63386c;

    /* renamed from: d */
    final C26759u f63387d;

    /* renamed from: f */
    private final Context f63388f;

    static {
        Covode.recordClassIndex(32229);
    }

    public C26757s(Context context, C26759u uVar) {
        this.f63386c = context.getPackageName();
        this.f63388f = context;
        this.f63387d = uVar;
        if (C26903au.m53445a(context)) {
            this.f63385b = new C26952l<>(C26991q.m53630a(context), f63383a, "AppUpdateService", f63384e, C26751m.f63371a);
        }
    }

    /* renamed from: a */
    static /* synthetic */ Bundle m53132a(C26757s sVar, String str) {
        Integer num;
        Bundle bundle = new Bundle();
        bundle.putAll(m53134b());
        bundle.putString("package.name", str);
        try {
            num = Integer.valueOf(sVar.f63388f.getPackageManager().getPackageInfo(sVar.f63388f.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f63383a.mo44596b("The current version of the app could not be retrieved", new Object[0]);
            num = null;
        }
        if (num != null) {
            bundle.putInt("app.version.code", num.intValue());
        }
        return bundle;
    }

    /* renamed from: a */
    static <T> AbstractC27062d<T> m53133a() {
        f63383a.mo44596b("onError(%d)", -9);
        return C27064f.m53800a((Exception) new C27055a(-9));
    }

    /* renamed from: b */
    static Bundle m53134b() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore.version.code", 10803);
        return bundle;
    }
}
