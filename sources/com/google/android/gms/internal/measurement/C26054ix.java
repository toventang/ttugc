package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

/* renamed from: com.google.android.gms.internal.measurement.ix */
final class C26054ix {
    static {
        Covode.recordClassIndex(31469);
    }

    /* renamed from: a */
    static String m50895a(AbstractC25943fb fbVar) {
        C26053iw iwVar = new C26053iw(fbVar);
        StringBuilder sb = new StringBuilder(iwVar.mo42750a());
        for (int i = 0; i < iwVar.mo42750a(); i++) {
            byte a = iwVar.mo42749a(i);
            if (a == 34) {
                sb.append("\\\"");
            } else if (a == 39) {
                sb.append("\\'");
            } else if (a != 92) {
                switch (a) {
                    case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        sb.append("\\a");
                        continue;
                    case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        sb.append("\\b");
                        continue;
                    case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        sb.append("\\t");
                        continue;
                    case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                        sb.append("\\n");
                        continue;
                    case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                        sb.append("\\v");
                        continue;
                    case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                        sb.append("\\f");
                        continue;
                    case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                        sb.append("\\r");
                        continue;
                    default:
                        if (a < 32 || a > 126) {
                            sb.append('\\');
                            sb.append((char) (((a >>> 6) & 3) + 48));
                            sb.append((char) (((a >>> 3) & 7) + 48));
                            sb.append((char) ((a & 7) + 48));
                            break;
                        } else {
                            sb.append((char) a);
                            continue;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
