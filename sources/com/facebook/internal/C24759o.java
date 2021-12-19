package com.facebook.internal;

import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.facebook.C24872m;
import com.facebook.internal.C24764p;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.o */
public final class C24759o {

    /* renamed from: a */
    private static final Map<EnumC24763b, String[]> f58738a = new HashMap();

    /* renamed from: com.facebook.internal.o$a */
    public interface AbstractC24762a {
        static {
            Covode.recordClassIndex(28915);
        }

        /* renamed from: a */
        void mo39416a(boolean z);
    }

    static {
        Covode.recordClassIndex(28912);
    }

    /* renamed from: com.facebook.internal.o$b */
    public enum EnumC24763b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        Monitoring(196608),
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        Share(33554432),
        Places(50331648);
        

        /* renamed from: a */
        private final int f58743a;

        /* renamed from: a */
        public final String mo40587a() {
            return "FBSDKFeature" + toString();
        }

        public final EnumC24763b getParent() {
            int i = this.f58743a;
            if ((i & 255) > 0) {
                return m47413a(i & -256);
            }
            if ((65280 & i) > 0) {
                return m47413a(i & -65536);
            }
            if ((16711680 & i) > 0) {
                return m47413a(i & -16777216);
            }
            return m47413a(0);
        }

        public final String toString() {
            switch (C247612.f58741a[ordinal()]) {
                case 1:
                    return "RestrictiveDataFiltering";
                case 2:
                    return "Instrument";
                case 3:
                    return "CrashReport";
                case 4:
                    return "CrashShield";
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    return "ThreadCheck";
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    return "ErrorReport";
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    return "AAM";
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    return "PrivacyProtection";
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    return "SuggestedEvents";
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    return "IntelligentIntegrity";
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    return "ModelRequest";
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    return "EventDeactivation";
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    return "OnDeviceEventProcessing";
                case ABRConfig.ABR_SELECT_SCENE:
                    return "OnDevicePostInstallEventProcessing";
                case 15:
                    return "ChromeCustomTabsPrefetching";
                case 16:
                    return "Monitoring";
                case 17:
                    return "IgnoreAppSwitchToLoggedOut";
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    return "CoreKit";
                case 19:
                    return "AppEvents";
                case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                    return "CodelessEvents";
                case 21:
                    return "LoginKit";
                case 22:
                    return "ShareKit";
                case 23:
                    return "PlacesKit";
                default:
                    return "unknown";
            }
        }

        static {
            Covode.recordClassIndex(28916);
        }

        /* renamed from: a */
        private static EnumC24763b m47413a(int i) {
            EnumC24763b[] values = values();
            for (EnumC24763b bVar : values) {
                if (bVar.f58743a == i) {
                    return bVar;
                }
            }
            return Unknown;
        }

        private EnumC24763b(int i) {
            this.f58743a = i;
        }
    }

    /* renamed from: a */
    private static synchronized void m47406a() {
        synchronized (C24759o.class) {
            MethodCollector.m26663i(9321);
            Map<EnumC24763b, String[]> map = f58738a;
            if (!map.isEmpty()) {
                MethodCollector.m26664o(9321);
                return;
            }
            map.put(EnumC24763b.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(EnumC24763b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(EnumC24763b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(EnumC24763b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(EnumC24763b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(EnumC24763b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(EnumC24763b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(EnumC24763b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(EnumC24763b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(EnumC24763b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
            MethodCollector.m26664o(9321);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.internal.o$2 */
    public static /* synthetic */ class C247612 {

        /* renamed from: a */
        static final /* synthetic */ int[] f58741a;

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|(3:45|46|48)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(48:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|48) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0059 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0065 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x007d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0089 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0095 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x00a1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00dd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00f5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0101 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x010d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 282
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C24759o.C247612.<clinit>():void");
        }
    }

    /* renamed from: b */
    private static boolean m47409b(EnumC24763b bVar) {
        boolean c = m47410c(bVar);
        String a = bVar.mo40587a();
        C24699ae.m47299a();
        return C24764p.m47419a(a, C24872m.f59041a, c);
    }

    /* renamed from: a */
    public static EnumC24763b m47405a(String str) {
        m47406a();
        for (Map.Entry<EnumC24763b, String[]> entry : f58738a.entrySet()) {
            String[] value = entry.getValue();
            int length = value.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (str.startsWith(value[i])) {
                        return entry.getKey();
                    }
                    i++;
                }
            }
        }
        return EnumC24763b.Unknown;
    }

    /* renamed from: c */
    private static boolean m47410c(EnumC24763b bVar) {
        switch (C247612.f58741a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
            case ABRConfig.ABR_SELECT_SCENE:
            case 15:
            case 16:
            case 17:
                return false;
            default:
                return true;
        }
    }

    /* renamed from: a */
    public static boolean m47408a(EnumC24763b bVar) {
        if (EnumC24763b.Unknown == bVar) {
            return false;
        }
        if (EnumC24763b.Core == bVar) {
            return true;
        }
        C24699ae.m47299a();
        String string = C34822d.m71158a(C24872m.f59047g, "com.facebook.internal.FEATURE_MANAGER", 0).getString(bVar.mo40587a(), null);
        if (string != null && string.equals("9.0.0")) {
            return false;
        }
        EnumC24763b parent = bVar.getParent();
        if (parent == bVar) {
            return m47409b(bVar);
        }
        if (!m47408a(parent) || !m47409b(bVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m47407a(final EnumC24763b bVar, final AbstractC24762a aVar) {
        C24764p.m47418a(new C24764p.AbstractC24767a() {
            /* class com.facebook.internal.C24759o.C247601 */

            static {
                Covode.recordClassIndex(28913);
            }

            @Override // com.facebook.internal.C24764p.AbstractC24767a
            /* renamed from: a */
            public final void mo40586a() {
                aVar.mo39416a(C24759o.m47408a(bVar));
            }
        });
    }
}
