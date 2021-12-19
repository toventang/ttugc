package com.kakao.network;

import com.bytedance.covode.number.Covode;
import com.kakao.common.KakaoContextService;
import com.kakao.common.PhaseInfo;

public final class ServerProtocol {
    public static final String ACCOUNT_AUTHORITY = initAccountAuthority();
    public static final String AGE_AUTH_AUTHORITY = initAccountAuthority();
    public static final String API_AUTHORITY = initAPIAuthority();
    public static final String AUTH_AUTHORITY = initAuthAuthority();
    public static final String NAVI_AUTHORITY = initNaviAuthority();
    public static final String TALK_CHAT_LIST_PATH = "v1/api/talk/chats";

    private static String initAPIAuthority() {
        return "kapi.kakao.com";
    }

    private static String initAccountAuthority() {
        return "auth.kakao.com";
    }

    private static String initAuthAuthority() {
        return "kauth.kakao.com";
    }

    private static String initNaviAuthority() {
        return "kakaonavi-wguide.kakao.com";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.kakao.network.ServerProtocol$1 */
    public static /* synthetic */ class C280991 {
        static final /* synthetic */ int[] $SwitchMap$com$kakao$common$KakaoPhase;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 33943(0x8497, float:4.7564E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.kakao.common.KakaoPhase[] r0 = com.kakao.common.KakaoPhase.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.kakao.network.ServerProtocol.C280991.$SwitchMap$com$kakao$common$KakaoPhase = r2
                com.kakao.common.KakaoPhase r0 = com.kakao.common.KakaoPhase.DEV     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.kakao.network.ServerProtocol.C280991.$SwitchMap$com$kakao$common$KakaoPhase     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.kakao.common.KakaoPhase r0 = com.kakao.common.KakaoPhase.SANDBOX     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.kakao.network.ServerProtocol.C280991.$SwitchMap$com$kakao$common$KakaoPhase     // Catch:{ NoSuchFieldError -> 0x002e }
                com.kakao.common.KakaoPhase r0 = com.kakao.common.KakaoPhase.CBT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.kakao.network.ServerProtocol.C280991.$SwitchMap$com$kakao$common$KakaoPhase     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.kakao.common.KakaoPhase r0 = com.kakao.common.KakaoPhase.PRODUCTION     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kakao.network.ServerProtocol.C280991.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(33942);
    }

    public static String accountAuthority() {
        PhaseInfo phaseInfo;
        if (KakaoContextService.getInstance() == null || (phaseInfo = KakaoContextService.getInstance().phaseInfo()) == null || phaseInfo.phase() == null) {
            return initAccountAuthority();
        }
        int i = C280991.$SwitchMap$com$kakao$common$KakaoPhase[phaseInfo.phase().ordinal()];
        if (i == 1) {
            return "alpha-auth.kakao.com";
        }
        if (i == 2) {
            return "sandbox-auth.kakao.com";
        }
        if (i != 3) {
            return "auth.kakao.com";
        }
        return "beta-auth.kakao.com";
    }

    public static String accountsAuthority() {
        PhaseInfo phaseInfo;
        if (KakaoContextService.getInstance() == null) {
            phaseInfo = null;
        } else {
            phaseInfo = KakaoContextService.getInstance().phaseInfo();
        }
        if (phaseInfo == null || phaseInfo.phase() == null) {
            return "accounts.kakao.com";
        }
        int i = C280991.$SwitchMap$com$kakao$common$KakaoPhase[phaseInfo.phase().ordinal()];
        if (i == 1) {
            return "alpha-accounts.kakao.com";
        }
        if (i == 2) {
            return "sandbox-accounts.kakao.com";
        }
        if (i != 3) {
            return "accounts.kakao.com";
        }
        return "beta-accounts.kakao.com";
    }

    public static String apiAuthority() {
        PhaseInfo phaseInfo;
        if (KakaoContextService.getInstance() == null || (phaseInfo = KakaoContextService.getInstance().phaseInfo()) == null || phaseInfo.phase() == null) {
            return initAPIAuthority();
        }
        int i = C280991.$SwitchMap$com$kakao$common$KakaoPhase[phaseInfo.phase().ordinal()];
        if (i == 1) {
            return "alpha-kapi.kakao.com";
        }
        if (i == 2) {
            return "sandbox-kapi.kakao.com";
        }
        if (i != 3) {
            return "kapi.kakao.com";
        }
        return "beta-kapi.kakao.com";
    }

    public static String authAuthority() {
        PhaseInfo phaseInfo;
        if (KakaoContextService.getInstance() == null || (phaseInfo = KakaoContextService.getInstance().phaseInfo()) == null || phaseInfo.phase() == null) {
            return initAuthAuthority();
        }
        int i = C280991.$SwitchMap$com$kakao$common$KakaoPhase[phaseInfo.phase().ordinal()];
        if (i == 1) {
            return "alpha-kauth.kakao.com";
        }
        if (i == 2) {
            return "sandbox-kauth.kakao.com";
        }
        if (i != 3) {
            return "kauth.kakao.com";
        }
        return "beta-kauth.kakao.com";
    }
}
