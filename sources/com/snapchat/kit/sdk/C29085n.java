package com.snapchat.kit.sdk;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.KitPluginType;
import com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.snapchat.kit.sdk.n */
public class C29085n {

    /* renamed from: a */
    public final Context f68748a;

    /* renamed from: b */
    public final String f68749b;

    /* renamed from: c */
    public final String f68750c;

    /* renamed from: d */
    final List<String> f68751d;

    /* renamed from: e */
    public final SnapKitInitType f68752e;

    /* renamed from: f */
    public final KitPluginType f68753f;

    /* renamed from: g */
    public final boolean f68754g;

    /* renamed from: h */
    final String f68755h;

    static {
        Covode.recordClassIndex(35434);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        r1 = new com.snapchat.kit.sdk.core.security.InsecureEncryptDecrypt();
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ExcHandler: p | IOException | IllegalArgumentException | IllegalStateException | InvalidAlgorithmParameterException | KeyStoreException | NoSuchAlgorithmException | NoSuchProviderException | UnrecoverableEntryException | CertificateException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:8:0x0026] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.snapchat.kit.sdk.core.security.SecureSharedPreferences mo50751a(com.google.gson.C27910f r8, android.content.SharedPreferences r9) {
        /*
        // Method dump skipped, instructions count: 149
        */
        throw new UnsupportedOperationException("Method not decompiled: com.snapchat.kit.sdk.C29085n.mo50751a(com.google.gson.f, android.content.SharedPreferences):com.snapchat.kit.sdk.core.security.SecureSharedPreferences");
    }

    C29085n(Context context, String str, String str2, List<String> list, SnapKitInitType snapKitInitType, KitPluginType kitPluginType, boolean z, String str3) {
        this.f68748a = context;
        this.f68749b = str;
        this.f68750c = str2;
        this.f68751d = list;
        this.f68752e = snapKitInitType;
        this.f68753f = kitPluginType;
        this.f68754g = z;
        this.f68755h = str3;
    }
}
