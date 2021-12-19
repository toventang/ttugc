package com.google.firebase.p2013e;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.google.firebase.p2010b.AbstractC27701c;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.firebase.e.a */
public final class C27741a {

    /* renamed from: a */
    public final AtomicBoolean f65185a;

    /* renamed from: b */
    private final Context f65186b;

    /* renamed from: c */
    private final SharedPreferences f65187c;

    /* renamed from: d */
    private final AbstractC27701c f65188d;

    static {
        Covode.recordClassIndex(33325);
    }

    /* renamed from: a */
    private boolean m55461a() {
        ApplicationInfo applicationInfo;
        if (this.f65187c.contains("firebase_data_collection_default_enabled")) {
            return this.f65187c.getBoolean("firebase_data_collection_default_enabled", true);
        }
        try {
            PackageManager packageManager = this.f65186b.getPackageManager();
            if (packageManager != null) {
                String packageName = this.f65186b.getPackageName();
                if (TextUtils.equals(packageName, C17867d.m33078a().getPackageName())) {
                    if (C58014b.f132218a == null) {
                        C58014b.f132218a = packageManager.getApplicationInfo(packageName, 128);
                    }
                    applicationInfo = C58014b.f132218a;
                } else {
                    applicationInfo = packageManager.getApplicationInfo(packageName, 128);
                }
                if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))) {
                    return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return true;
    }

    public C27741a(Context context, String str, AbstractC27701c cVar) {
        Context context2;
        if (Build.VERSION.SDK_INT < 24 || C0643b.m2377b(context)) {
            context2 = context;
        } else {
            context2 = C0643b.m2368a(context);
        }
        this.f65186b = context2;
        this.f65187c = C34822d.m71158a(context, "com.google.firebase.common.prefs:".concat(String.valueOf(str)), 0);
        this.f65188d = cVar;
        this.f65185a = new AtomicBoolean(m55461a());
    }
}
