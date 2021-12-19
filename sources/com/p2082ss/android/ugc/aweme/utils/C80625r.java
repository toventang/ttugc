package com.p2082ss.android.ugc.aweme.utils;

import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerTrackingRequestListener;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;

/* renamed from: com.ss.android.ugc.aweme.utils.r */
public final class C80625r {

    /* renamed from: a */
    public static boolean f180271a;

    /* renamed from: b */
    public static boolean f180272b;

    /* renamed from: c */
    public static boolean f180273c = true;

    /* renamed from: d */
    public static boolean f180274d = true;

    /* renamed from: e */
    public static final C80625r f180275e = new C80625r();

    /* renamed from: f */
    private static final Keva f180276f = Keva.getRepo("tpc_consent");

    /* renamed from: g */
    private static boolean f180277g;

    /* renamed from: com.ss.android.ugc.aweme.utils.r$a */
    public static final class C80626a implements AppsFlyerTrackingRequestListener {
        static {
            Covode.recordClassIndex(93900);
        }

        @Override // com.appsflyer.AppsFlyerTrackingRequestListener
        public final void onTrackingRequestFailure(String str) {
        }

        C80626a() {
        }

        @Override // com.appsflyer.AppsFlyerTrackingRequestListener
        public final void onTrackingRequestSuccess() {
            AppsFlyerLib.getInstance().setDeviceTrackingDisabled(C80625r.f180273c);
        }
    }

    private C80625r() {
    }

    static {
        Covode.recordClassIndex(93899);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r0 == false) goto L_0x008a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void m139793a() {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.utils.C80625r.m139793a():void");
    }
}
