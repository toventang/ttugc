package com.bytedance.lobby.internal;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lobby.AbstractC20889b;
import com.bytedance.lobby.C20879a;
import com.bytedance.lobby.C20892d;
import com.bytedance.lobby.auth.AbstractC20888d;
import com.bytedance.lobby.facebook.FacebookAuth;
import com.bytedance.lobby.facebook.FacebookShare;
import com.bytedance.lobby.google.GoogleAuth;
import com.bytedance.lobby.google.GoogleOneTapAuth;
import com.bytedance.lobby.google.GoogleShare;
import com.bytedance.lobby.google.GoogleWebAuth;
import com.bytedance.lobby.instagram.InstagramAuth;
import com.bytedance.lobby.internal.C20916c;
import com.bytedance.lobby.kakao.KakaoAuth;
import com.bytedance.lobby.line.LineAuth;
import com.bytedance.lobby.p1492a.AbstractC20881b;
import com.bytedance.lobby.p1492a.C20880a;
import com.bytedance.lobby.p1494vk.VkAuth;
import com.bytedance.lobby.twitter.TwitterAuth;

public final class LobbyCore {
    private static final boolean DEBUG = C20879a.f49364a;
    static volatile boolean isInit;
    private static Application sApplication;
    private static AbstractC20889b sProviderConfig;

    /* renamed from: com_bytedance_lobby_internal_LobbyCore_com_ss_android_ugc_aweme_lancet_LogLancet_d */
    public static int m39329x48d68da2(String str, String str2) {
        return 0;
    }

    public static Application getApplication() {
        return sApplication;
    }

    static {
        Covode.recordClassIndex(24516);
    }

    static void tryInitProviderConfig() {
        MethodCollector.m26663i(8185);
        if (!isInit) {
            synchronized (LobbyCore.class) {
                try {
                    if (!isInit) {
                        if (sProviderConfig.mo20735b() != null) {
                            for (C20892d dVar : sProviderConfig.mo20735b()) {
                                int i = dVar.f49401a;
                                if (i == 2) {
                                    registerAuth(dVar);
                                } else if (i == 3) {
                                    registerShare(dVar);
                                } else {
                                    registerAuth(dVar);
                                    registerShare(dVar);
                                }
                            }
                        }
                        isInit = true;
                    }
                } finally {
                    MethodCollector.m26664o(8185);
                }
            }
            return;
        }
        MethodCollector.m26664o(8185);
    }

    private static AbstractC20881b createShare(C20892d dVar) {
        String str = dVar.f49402b;
        str.hashCode();
        if (str.equals("google")) {
            return new GoogleShare(dVar);
        }
        if (!str.equals("facebook")) {
            return null;
        }
        return new FacebookShare(dVar);
    }

    public static void initialize(C20916c.C20917a aVar) {
        if (aVar.f49466b != null) {
            sApplication = (Application) aVar.f49465a;
            sProviderConfig = aVar.f49466b;
            C20879a.f49364a = aVar.f49467c;
            if (aVar.f49466b.mo20734a()) {
                tryInitProviderConfig();
            }
        } else if (DEBUG) {
            m39329x48d68da2("LobbySDK", "No providers specified, skipping initialization.");
        }
    }

    private static void registerAuth(C20892d dVar) {
        AbstractC20888d createAuth = createAuth(dVar);
        if (createAuth != null) {
            C20919d.m39339a().mo34366a(createAuth);
        } else if (C20879a.f49364a) {
            m39329x48d68da2("LobbySDK", "Cannot find Provider with id " + dVar.f49402b);
            throw new NullPointerException("Cannot find Provider with id " + dVar.f49402b);
        }
    }

    private static void registerShare(C20892d dVar) {
        AbstractC20881b createShare = createShare(dVar);
        if (createShare != null) {
            C20880a.m39236a().mo34313a(createShare);
        } else if (C20879a.f49364a) {
            m39329x48d68da2("LobbySDK", "Cannot find Provider with id " + dVar.f49402b);
            throw new NullPointerException("Cannot find Provider with id " + dVar.f49402b);
        }
    }

    private static AbstractC20888d createAuth(C20892d dVar) {
        String str = dVar.f49402b;
        str.hashCode();
        switch (str.hashCode()) {
            case -1534815154:
                if (!str.equals("google_web")) {
                    return null;
                }
                return new GoogleWebAuth(dVar);
            case -1240244679:
                if (!str.equals("google")) {
                    return null;
                }
                return new GoogleAuth(dVar);
            case -916346253:
                if (!str.equals("twitter")) {
                    return null;
                }
                return new TwitterAuth(dVar);
            case 3765:
                if (!str.equals("vk")) {
                    return null;
                }
                return new VkAuth(dVar, sApplication);
            case 3321844:
                if (!str.equals("line")) {
                    return null;
                }
                return new LineAuth(dVar);
            case 28903346:
                if (!str.equals("instagram")) {
                    return null;
                }
                return new InstagramAuth(dVar);
            case 323062851:
                if (!str.equals("google_onetap")) {
                    return null;
                }
                return new GoogleOneTapAuth(dVar);
            case 486515695:
                if (!str.equals("kakaotalk")) {
                    return null;
                }
                return new KakaoAuth(dVar);
            case 497130182:
                if (!str.equals("facebook")) {
                    return null;
                }
                return new FacebookAuth(dVar);
            default:
                return null;
        }
    }
}
