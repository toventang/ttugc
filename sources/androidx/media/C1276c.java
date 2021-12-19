package androidx.media;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import java.util.Arrays;

/* renamed from: androidx.media.c */
class C1276c implements AbstractC1270a {

    /* renamed from: a */
    int f4200a;

    /* renamed from: b */
    int f4201b;

    /* renamed from: c */
    int f4202c;

    /* renamed from: d */
    int f4203d = -1;

    static {
        Covode.recordClassIndex(1389);
    }

    C1276c() {
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4201b), Integer.valueOf(this.f4202c), Integer.valueOf(this.f4200a), Integer.valueOf(this.f4203d)});
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f4203d != -1) {
            sb.append(" stream=").append(this.f4203d);
            sb.append(" derived");
        }
        StringBuilder append = sb.append(" usage=");
        int i = this.f4200a;
        switch (i) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                str = "USAGE_NOTIFICATION";
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = "unknown usage ".concat(String.valueOf(i));
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        append.append(str).append(" content=").append(this.f4201b).append(" flags=0x").append(Integer.toHexString(this.f4202c).toUpperCase());
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        if (r6 == 7) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r11) {
        /*
        // Method dump skipped, instructions count: 108
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media.C1276c.equals(java.lang.Object):boolean");
    }
}
