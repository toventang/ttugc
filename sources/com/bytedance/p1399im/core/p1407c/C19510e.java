package com.bytedance.p1399im.core.p1407c;

import android.os.SystemClock;
import android.util.Log;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.internal.p1431d.C19978k;
import com.bytedance.p1399im.core.internal.utils.C19999h;
import com.bytedance.p1399im.core.internal.utils.C20002j;
import com.bytedance.p1399im.core.p1404a.C19483d;
import com.bytedance.p1399im.core.proto.IMCMD;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.im.core.c.e */
public final class C19510e {

    /* renamed from: a */
    public static AbstractC19507b f46308a;

    static {
        Covode.recordClassIndex(22354);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.im.core.c.e$1 */
    public static /* synthetic */ class C195111 {

        /* renamed from: a */
        static final /* synthetic */ int[] f46309a;

        /* JADX WARNING: Can't wrap try/catch for region: R(80:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|(3:79|80|82)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(82:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|60|61|62|63|64|65|66|67|68|69|70|71|72|73|74|75|76|77|78|79|80|82) */
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
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x0119 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0125 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0131 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x013d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x0149 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x0155 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:59:0x0161 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:61:0x016d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0179 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:65:0x0185 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0191 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x019d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:71:0x01a9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x01b5 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:75:0x01c1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:77:0x01cd */
        /* JADX WARNING: Missing exception handler attribute for start block: B:79:0x01d9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0038 */
        static {
            /*
            // Method dump skipped, instructions count: 486
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.p1399im.core.p1407c.C19510e.C195111.<clinit>():void");
        }
    }

    /* renamed from: b */
    public static String m36441b(Throwable th) {
        if (th == null) {
            return "";
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        StringBuilder sb = new StringBuilder();
        if (stackTrace != null) {
            for (int i = 0; i < stackTrace.length; i++) {
                if (i > 0) {
                    sb.append("\n");
                }
                sb.append(stackTrace[i].getClassName()).append(":").append(stackTrace[i].getMethodName()).append(":").append(stackTrace[i].getLineNumber());
            }
        }
        if (sb.length() > 1000) {
            sb.substring(0, 999);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static void m36439a(Throwable th) {
        new C19517i().mo31179a("imsdk_exception").mo31180a("error_stack", Log.getStackTraceString(th)).mo31181b();
        if (f46308a != null && C19483d.m36365a().mo31141b().f46241af) {
            f46308a.mo27982a(th);
        }
    }

    /* renamed from: a */
    public static boolean m36440a(float f) {
        if (C19483d.m36365a().mo31141b().f46222aD) {
            if (f <= 0.0f || Math.random() >= ((double) f)) {
                return false;
            }
            return true;
        } else if (f46308a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static void m36442b(String str, JSONObject jSONObject) {
        AbstractC19507b bVar = f46308a;
        if (bVar != null) {
            bVar.mo27984b(str, jSONObject);
        }
    }

    /* renamed from: c */
    public static void m36443c(String str, JSONObject jSONObject) {
        AbstractC19507b bVar = f46308a;
        if (bVar != null) {
            bVar.mo27985c(str, jSONObject);
        }
    }

    /* renamed from: d */
    public static void m36444d(String str, JSONObject jSONObject) {
        AbstractC19507b bVar = f46308a;
        if (bVar != null) {
            bVar.mo27986d(str, jSONObject);
        }
    }

    /* renamed from: a */
    public static void m36438a(String str, JSONObject jSONObject) {
        AbstractC19507b bVar = f46308a;
        if (bVar != null) {
            bVar.mo27981a(str, jSONObject);
        }
        C19512f.m36457b("imsdk", "IMMonitor serviceName=" + str + " duration=" + jSONObject + " logExtra=" + ((Object) null), (Throwable) null);
    }

    /* renamed from: a */
    public static void m36436a(String str, String str2) {
        if (f46308a != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str2, 1.0d);
                jSONObject.put("service", str);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            f46308a.mo27983a(jSONObject);
        }
        C19512f.m36457b("imsdk", "IMMonitor serviceName=" + str + " key=" + str2 + " value=1.0", (Throwable) null);
    }

    /* renamed from: a */
    public static C19509d m36435a(C19978k kVar, boolean z) {
        C19509d a = new C19509d().mo31164a("duration", Long.valueOf(SystemClock.uptimeMillis() - kVar.f47486j));
        IMCMD fromValue = IMCMD.fromValue(kVar.mo31868k());
        if (fromValue == null) {
            fromValue = IMCMD.IMCMD_NOT_USED;
        }
        switch (C195111.f46309a[fromValue.ordinal()]) {
            case 1:
                a.f46304a = "conversation";
                a.f46305b = "add_participants";
                break;
            case 2:
                a.f46304a = "core";
                a.f46305b = "create_conversation";
                break;
            case 3:
                a.f46304a = "core";
                a.f46305b = "get_conversation_info";
                break;
            case 4:
                a.f46304a = "core";
                a.f46305b = "get_conversation_info_list";
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                a.f46304a = "core";
                a.f46305b = "get_favorite_conversation_list";
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                a.f46304a = "core";
                a.f46305b = "get_top_conversation_list";
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                a.f46304a = "core";
                a.f46305b = "get_msg_by_user";
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 8}*/:
                a.f46304a = "core";
                a.f46305b = "get_stranger_conversation_list";
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 9}*/:
                a.f46304a = "core";
                a.f46305b = "get_stranger_msg_list";
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY /*{ENCODED_INT: 10}*/:
                a.f46304a = "core";
                a.f46305b = "install_init";
                break;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /*{ENCODED_INT: 11}*/:
                a.f46304a = "conversation";
                a.f46305b = "leave";
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE /*{ENCODED_INT: 12}*/:
                a.f46304a = "core";
                a.f46305b = "load_history";
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /*{ENCODED_INT: 13}*/:
                a.f46304a = "core";
                a.f46305b = "load_member";
                break;
            case ABRConfig.ABR_SELECT_SCENE /*{ENCODED_INT: 14}*/:
                a.f46304a = "conversation";
                a.f46305b = "remove_member";
                break;
            case 15:
                a.f46304a = "core";
                a.f46305b = "message_send";
                break;
            case 16:
                a.f46304a = "conversation";
                a.f46305b = "update_core";
                break;
            case 17:
                a.f46304a = "conversation";
                a.f46305b = "update_setting";
                break;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                a.f46304a = "conversation";
                a.f46305b = "update_member";
                break;
            case 19:
                a.f46304a = "conversation";
                a.f46305b = "update_core_ext";
                break;
            case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                a.f46304a = "conversation";
                a.f46305b = "update_setting_ext";
                break;
            case 21:
                a.f46304a = "conversation";
                a.f46305b = "dissolve";
                break;
            case 22:
                a.f46304a = "core";
                a.f46305b = "message_set_property_send";
                break;
            case 23:
                a.f46304a = "conversation";
                a.f46305b = "get_conversation_participants_read_index";
                break;
            case 24:
                a.f46304a = "conversation";
                a.f46305b = "get_conversation_participants_min_index";
                break;
            case 25:
                a.f46304a = "upload";
                a.f46305b = "get_upload_token";
                break;
            case 26:
                a.f46304a = "upload";
                a.f46305b = "get_media_urls";
                break;
            case 27:
                a.f46304a = "conversation";
                a.f46305b = "get_user_count";
                break;
            case 28:
                a.f46304a = "core";
                a.f46305b = "broadcast_send_msg";
                break;
            case 29:
                a.f46304a = "core";
                a.f46305b = "broadcast_recv_msg";
                break;
            case 30:
                a.f46304a = "conversation";
                a.f46305b = "get_user_conversation_list";
                break;
            case 31:
                a.f46304a = "conversation";
                a.f46305b = "batch_update_participant";
                break;
            case 32:
                a.f46304a = "core";
                a.f46305b = "rtc_call";
                break;
            case 33:
                a.f46304a = "core";
                a.f46305b = "rtc_create";
                break;
            case 34:
                a.f46304a = "core";
                a.f46305b = "rtc_update";
            case 35:
                a.f46304a = "core";
                a.f46305b = "stranger_mark_read";
                break;
            case 36:
                a.f46304a = "core";
                a.f46305b = "stranger_mark_all_read";
                break;
            case 37:
                a.f46304a = "core";
                a.f46305b = "stranger_delete_all_conversations";
                break;
            case 38:
                a.f46304a = "core";
                a.f46305b = "get_recent_msg";
                break;
            case 39:
                a.f46304a = "core";
                a.f46305b = "get_cmd_msg";
                break;
            case 40:
                a.f46304a = "core";
                a.f46305b = "get_msg_by_index_v2_range";
                break;
            default:
                a.f46304a = "unknown";
                a.f46305b = "not_use";
                break;
        }
        if (z) {
            a.mo31164a("success", 1);
        } else {
            a.mo31164a("error", Integer.valueOf(kVar.f47485i));
            a.mo31164a("success", 0);
            try {
                if (kVar.f47481e != null) {
                    a.mo31166b("origin_request", C19999h.f47538a.mo46674b(kVar.f47481e));
                }
                if (kVar.f47482f != null) {
                    a.mo31166b("origin_response", C19999h.f47538a.mo46674b(kVar.f47482f));
                }
            } catch (Exception e) {
                C20002j.m37781b("IMMonitor wrapMonitor ", e);
            }
        }
        return a;
    }

    /* renamed from: a */
    public static void m36437a(String str, String str2, Map<String, Object> map, Map<String, Object> map2) {
        AbstractC19507b bVar = f46308a;
        if (bVar != null) {
            bVar.mo27980a(str, str2, map);
        }
        C19512f.m36457b("imsdk", "IMMonitor monitorImEvent() called with: service = [" + str + "], name = [" + str2 + "], map = [" + map + "], originData = [" + map2 + "]", (Throwable) null);
    }
}
