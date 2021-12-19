package com.snapchat.kit.sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.C1216w;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.lancet.p3386c.C58014b;
import com.snapchat.kit.sdk.C29069j;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType;
import dagger.p4535a.C88081f;
import java.util.Arrays;

/* renamed from: com.snapchat.kit.sdk.c */
public final class C28951c {

    /* renamed from: a */
    protected static C28951c f68395a;

    /* renamed from: b */
    private final SnapKitComponent f68396b;

    static {
        Covode.recordClassIndex(35135);
    }

    /* renamed from: b */
    public static void m57975b(Context context) {
        m57974a(context, SnapKitInitType.INIT_TYPE_DEFERRED);
    }

    /* renamed from: a */
    static SnapKitComponent m57973a(Context context) {
        return m57974a(context, SnapKitInitType.INIT_TYPE_FEATURE).f68396b;
    }

    /* renamed from: a */
    static synchronized C28951c m57974a(Context context, SnapKitInitType snapKitInitType) {
        C28951c cVar;
        synchronized (C28951c.class) {
            MethodCollector.m26663i(9130);
            if (f68395a == null) {
                Context applicationContext = context.getApplicationContext();
                if (C58003a.f132201c) {
                    if (applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                }
                f68395a = new C28951c(applicationContext, snapKitInitType);
            }
            cVar = f68395a;
            MethodCollector.m26664o(9130);
        }
        return cVar;
    }

    private C28951c(Context context, SnapKitInitType snapKitInitType) {
        ApplicationInfo applicationInfo;
        String[] stringArray;
        KitPluginType kitPluginType;
        try {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (TextUtils.equals(packageName, C17867d.m33078a().getPackageName())) {
                if (C58014b.f132218a == null) {
                    C58014b.f132218a = packageManager.getApplicationInfo(packageName, 128);
                }
                applicationInfo = C58014b.f132218a;
            } else {
                applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            }
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                String string = bundle.getString("com.snapchat.kit.sdk.clientId");
                String string2 = bundle.getString("com.snapchat.kit.sdk.redirectUrl", "");
                int i = bundle.getInt("com.snapchat.kit.sdk.scopes", 0);
                if (i == 0) {
                    stringArray = new String[0];
                } else {
                    stringArray = context.getResources().getStringArray(i);
                }
                if (!TextUtils.isEmpty(string)) {
                    try {
                        kitPluginType = KitPluginType.valueOf(bundle.getString("com.snapchat.kit.sdk.plugin", ""));
                    } catch (IllegalArgumentException | NullPointerException unused) {
                        kitPluginType = KitPluginType.NO_PLUGIN;
                    }
                    String string3 = bundle.getString("com.snapchat.kit.sdk.firebaseExtCustomTokenUrl", null);
                    boolean z = bundle.getBoolean("com.snapchat.kit.sdk.isFromReactNativePlugin", false);
                    C29069j.C29070a aVar = new C29069j.C29070a((byte) 0);
                    aVar.f68704a = (C29085n) C88081f.m153152a(new C29085n(context, string, string2, Arrays.asList(stringArray), snapKitInitType, kitPluginType, z, string3));
                    if (aVar.f68704a != null) {
                        C29069j jVar = new C29069j(aVar, (byte) 0);
                        this.f68396b = jVar;
                        C1216w.f4006i.getLifecycle().mo4012a(jVar.snapKitAppLifecycleObserver());
                        return;
                    }
                    throw new IllegalStateException(C29085n.class.getCanonicalName() + " must be set");
                }
                throw new IllegalStateException("client id must be set!");
            }
            throw new IllegalStateException("No metadata for the current app!");
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new IllegalStateException("Could not get metadata for current package");
        }
    }
}
