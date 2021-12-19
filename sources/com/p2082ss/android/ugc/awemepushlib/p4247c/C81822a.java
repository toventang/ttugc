package com.p2082ss.android.ugc.awemepushlib.p4247c;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.AccountService;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.utils.C80411ew;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.awemepushlib.c.a */
public final class C81822a {

    /* renamed from: a */
    private static final Keva f182957a = Keva.getRepo("uid_recorder", 0);

    static {
        Covode.recordClassIndex(95234);
    }

    /* renamed from: a */
    private static String m141700a() {
        return "snssdk" + C17867d.f42590n;
    }

    /* renamed from: a */
    private static String m141701a(String str) {
        if (C13627m.m24498a(str)) {
            return str;
        }
        try {
            String scheme = Uri.parse(str).getScheme();
            String a = m141700a();
            if ("sslocal".equals(scheme) || "localsdk".equals(scheme)) {
                return str.replace(scheme, a);
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d3, code lost:
        if (r1.equals(r5) != false) goto L_0x0095;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.Intent m141699a(android.content.Context r11, com.p2082ss.android.ugc.awemepushlib.p4247c.C81823b r12) {
        /*
        // Method dump skipped, instructions count: 286
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.awemepushlib.p4247c.C81822a.m141699a(android.content.Context, com.ss.android.ugc.awemepushlib.c.b):android.content.Intent");
    }

    /* renamed from: a */
    public static void m141703a(String str, Map<String, String> map) {
        String str2;
        map.put("o_url", str);
        Uri parse = Uri.parse(str);
        if (parse != null) {
            if (!TextUtils.isEmpty(parse.getQueryParameter("push_id"))) {
                map.put("rule_id", parse.getQueryParameter("push_id"));
            }
            if (!TextUtils.isEmpty(parse.getQueryParameter("gd_label"))) {
                map.put("push_label", parse.getQueryParameter("gd_label"));
            }
            if (!TextUtils.isEmpty(parse.getQueryParameter("room_id"))) {
                map.put("room_id", parse.getQueryParameter("room_id"));
                if (!TextUtils.isEmpty(parse.getQueryParameter("user_id"))) {
                    map.put("anchor_id", parse.getQueryParameter("user_id"));
                }
            }
            String host = parse.getHost();
            if ("detail".equals(host) && !TextUtils.isEmpty(parse.getQueryParameter("id"))) {
                map.put("group_id", parse.getQueryParameter("id"));
            } else if (!TextUtils.isEmpty(host) && "aweme".equals(host) && !TextUtils.isEmpty(parse.getLastPathSegment())) {
                map.put("group_id", parse.getLastPathSegment());
            }
            if (!TextUtils.isEmpty(parse.getQueryParameter("im_type"))) {
                map.put("im_type", parse.getQueryParameter("im_type"));
            }
            String path = parse.getPath();
            if ("challenge".equals(host) && !TextUtils.isEmpty(path) && path.contains("detail")) {
                map.put("tag_id", parse.getLastPathSegment());
            }
            if (!TextUtils.isEmpty(parse.getQueryParameter("sub_type"))) {
                map.put("sub_type", parse.getQueryParameter("sub_type"));
            }
            if (!TextUtils.isEmpty(parse.getQueryParameter("follow_status"))) {
                map.put("follow_status", parse.getQueryParameter("follow_status"));
            }
            if (!TextUtils.isEmpty(parse.getQueryParameter("follow_status_to_user"))) {
                map.put("follow_status_to_user", parse.getQueryParameter("follow_status_to_user"));
            }
            try {
                IAccountUserService e = AccountService.m65215a().mo57069e();
                boolean isLogin = e.isLogin();
                if (isLogin) {
                    str2 = "1";
                } else {
                    str2 = "0";
                }
                map.put("is_login", str2);
                String queryParameter = parse.getQueryParameter("sec_target_uid");
                if (!TextUtils.isEmpty(queryParameter)) {
                    Keva keva = f182957a;
                    String[] stringArray = keva.getStringArray("logged_in_uids", new String[20]);
                    int i = keva.getInt("num_of_logged_in_uids", 0);
                    if (isLogin) {
                        if (TextUtils.equals(e.getCurUser().getSecUid(), queryParameter)) {
                            map.put("is_self", "1");
                        } else if (m141704a(stringArray, Math.min(i, 20), queryParameter)) {
                            map.put("is_self", "3");
                        } else {
                            map.put("is_self", "0");
                        }
                    } else if (m141704a(stringArray, Math.min(i, 20), queryParameter)) {
                        map.put("is_self", "3");
                    } else {
                        map.put("is_self", "0");
                    }
                    map.put("accounts_number", String.valueOf(Math.min(20, i)));
                    return;
                }
                map.put("is_self", "-1");
            } catch (NullPointerException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    private static boolean m141704a(String[] strArr, int i, String str) {
        for (int i2 = 0; i2 < i; i2++) {
            if (TextUtils.equals(strArr[i2], str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static Map<String, String> m141702a(C81823b bVar, int i, boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("rule_id", String.valueOf(bVar.f182958id));
            hashMap.put("rule_id64", String.valueOf(bVar.rid64));
            if (!TextUtils.isEmpty(bVar.openUrl)) {
                m141703a(bVar.openUrl, hashMap);
            }
            String str6 = "unknown";
            switch (i) {
                case 1:
                    str6 = "MI";
                    break;
                case 2:
                    str6 = "MYSELF";
                    break;
                case 3:
                    str6 = "IXINTUI";
                    break;
                case 4:
                    str6 = "GETUI";
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    str6 = "GCM";
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    str6 = "HW";
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    str6 = "MZ";
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    str6 = "ALIYUN";
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    str6 = "OPPO";
                    break;
            }
            hashMap.put("push_channel", str6);
            String str7 = "1";
            if (bVar.extra.turn_screen_on) {
                str = str7;
            } else {
                str = "0";
            }
            hashMap.put("push_delay", str);
            hashMap.put("post_back", bVar.postBack);
            if (z) {
                str2 = "notify";
            } else {
                str2 = "alert";
            }
            hashMap.put("click_position", str2);
            if (bVar.extra.style == 5) {
                str3 = str7;
            } else {
                str3 = "0";
            }
            hashMap.put("mediastyle", str3);
            if (TextUtils.isEmpty(bVar.extra.bg_color)) {
                str4 = "0";
            } else {
                str4 = str7;
            }
            hashMap.put("colorized", str4);
            if (bVar.extra.isBannerDeteled) {
                str5 = str7;
            } else {
                str5 = "0";
            }
            hashMap.put("is_banner_deleted", str5);
            if (bVar.extra != null) {
                if (!TextUtils.isEmpty(bVar.extra.authorId)) {
                    hashMap.put("author_id", bVar.extra.authorId);
                }
                if (!TextUtils.isEmpty(bVar.extra.roomId)) {
                    hashMap.put("room_id", bVar.extra.roomId);
                }
                if (!TextUtils.isEmpty(bVar.extra.userId)) {
                    hashMap.put("user_id", bVar.extra.userId);
                }
                if (!TextUtils.isEmpty(bVar.extra.musicId)) {
                    hashMap.put("music_id", bVar.extra.musicId);
                }
                if (!TextUtils.isEmpty(bVar.extra.challengeId)) {
                    hashMap.put("tag_id", bVar.extra.challengeId);
                }
                if (!TextUtils.isEmpty(bVar.extra.tagId)) {
                    hashMap.put("tag_id", bVar.extra.tagId);
                }
                if (bVar.extra.actionList.isEmpty()) {
                    str7 = "0";
                }
                hashMap.put("has_button", str7);
                if (!TextUtils.isEmpty(bVar.extra.trackInfo)) {
                    C80411ew.m139396a(bVar.extra.trackInfo, hashMap);
                }
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
