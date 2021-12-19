package com.p2082ss.android.ugc.aweme.account.login;

import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.internal.LobbyCore;
import com.google.android.gms.common.GoogleApiAvailability;

/* renamed from: com.ss.android.ugc.aweme.account.login.y */
public final class C32819y {

    /* renamed from: a */
    public static final C32820a f78186a = new C32820a((byte) 0);

    static {
        Covode.recordClassIndex(39599);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.y$a */
    public static final class C32820a {
        static {
            Covode.recordClassIndex(39600);
        }

        private C32820a() {
        }

        /* renamed from: a */
        public static boolean m67397a() {
            try {
                GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(LobbyCore.getApplication());
            } catch (Exception unused) {
            }
            return false;
        }

        public /* synthetic */ C32820a(byte b) {
            this();
        }
    }
}
