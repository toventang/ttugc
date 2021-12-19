package com.android.installreferrer.api;

import android.content.Context;
import com.bytedance.covode.number.Covode;

public abstract class InstallReferrerClient {
    static {
        Covode.recordClassIndex(2471);
    }

    /* renamed from: a */
    public abstract void mo6229a(InstallReferrerStateListener installReferrerStateListener);

    /* renamed from: a */
    public abstract boolean mo6230a();

    /* renamed from: b */
    public abstract void mo6231b();

    /* renamed from: c */
    public abstract ReferrerDetails mo6232c();

    /* renamed from: com.android.installreferrer.api.InstallReferrerClient$a */
    public static final class C2264a {

        /* renamed from: a */
        private final Context f6797a;

        static {
            Covode.recordClassIndex(2472);
        }

        private C2264a(Context context) {
            this.f6797a = context;
        }

        /* synthetic */ C2264a(Context context, byte b) {
            this(context);
        }

        /* renamed from: a */
        public final InstallReferrerClient mo6233a() {
            Context context = this.f6797a;
            if (context != null) {
                return new C2265a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    /* renamed from: a */
    public static C2264a m6882a(Context context) {
        return new C2264a(context, (byte) 0);
    }
}
