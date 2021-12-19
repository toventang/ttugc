package com.p2082ss.android.ugc.aweme.deeplink.p2731a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.p2479ck.C36132v;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.deeplink.a.a */
public abstract class AbstractC40998a {
    static {
        Covode.recordClassIndex(48861);
    }

    /* renamed from: a */
    public abstract Uri mo70209a(Uri uri);

    /* renamed from: a */
    public static Uri m82612a(Uri uri, int i, String str) {
        Uri parse;
        if (!(!TextUtils.isEmpty(str) || i == 9 || i == 14 || i == 15 || i == 16 || i == 21 || i == 22)) {
            return null;
        }
        String str2 = "snssdk1180://search?";
        switch (i) {
            case 0:
                str2 = "snssdk1180://detail?id=".concat(String.valueOf(str));
                break;
            case 1:
                str2 = "snssdk1180://live?room_id=".concat(String.valueOf(str));
                break;
            case 2:
                str2 = "snssdk1180://profile?unique_id=".concat(String.valueOf(str));
                break;
            case 3:
                str2 = "snssdk1180://challenge/detail/".concat(String.valueOf(str));
                break;
            case 4:
                str2 = "snssdk1180://music/detail/".concat(String.valueOf(str));
                break;
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
                str2 = "snssdk1180://stickers/detail/".concat(String.valueOf(str));
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                str2 = "snssdk1180://profile?id=".concat(String.valueOf(str));
                if (uri != null) {
                    String queryParameter = uri.getQueryParameter("sec_uid");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        str2 = str2 + "&sec_uid=" + queryParameter;
                        break;
                    }
                }
                break;
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                str2 = "snssdk1180://item?id=".concat(String.valueOf(str));
                break;
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                str2 = "snssdk1180://tag?id=".concat(String.valueOf(str));
                break;
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                str2 = "snssdk1180://game?game_id=".concat(String.valueOf(str));
                break;
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                str2 = "snssdk1180://mix_video/detail/".concat(String.valueOf(str));
                break;
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                String b = C36132v.m73608b(uri.toString(), "id");
                if (!TextUtils.isEmpty(b)) {
                    str2 = "snssdk1180://search/trending?type=" + b + "&trending=" + C36132v.m73608b(uri.toString(), "edition_uid");
                    break;
                }
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_SELECT_SCENE:
            default:
                str2 = "";
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                str2 = "snssdk1180://challenge/detail?id=" + str + "&group=0&is_commerce=1";
                break;
            case 15:
                str2 = "snssdk1180://goods/shop/?uid=".concat(String.valueOf(C36132v.m73608b(uri.toString(), "object_id")));
                break;
            case 16:
                str2 = "snssdk1180://openRecord?recordParam=sticker&id=".concat(String.valueOf(C36132v.m73608b(uri.toString(), "object_id")));
                break;
            case 17:
                str2 = Uri.parse("snssdk1180://webview").buildUpon().appendQueryParameter("url", uri.toString()).build().toString();
                break;
            case LiveRechargeAgeThresholdSetting.DEFAULT:
                str2 = "snssdk1180://live?unique_id=".concat(String.valueOf(str));
                break;
            case 19:
                str2 = "snssdk1180://messages/group?invite_id=".concat(String.valueOf(str));
                break;
            case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                break;
            case 21:
                str2 = uri.getQueryParameter("af_dp");
                break;
            case 22:
                str2 = Uri.parse("snssdk1180://feed?").buildUpon().appendQueryParameter("invitation_code", uri.getQueryParameter("invitation_code")).appendQueryParameter("inviter_uid", uri.getQueryParameter("inviter_uid")).appendQueryParameter("inviter_sec_uid", uri.getQueryParameter("inviter_sec_uid")).build().toString();
                break;
            case 23:
                str2 = "snssdk1180://qna/detail/".concat(String.valueOf(str));
                break;
            case 24:
                str2 = Uri.parse(str2).buildUpon().appendQueryParameter("keyword", str).appendQueryParameter("enter_from", "search_engine").appendQueryParameter("enter_method", "click_open").build().toString();
                break;
            case 25:
                str2 = "snssdk1180://assmusic/category?cid=".concat(String.valueOf(str));
                break;
        }
        if (TextUtils.isEmpty(str2) || (parse = Uri.parse(str2)) == null) {
            return null;
        }
        if (uri == null || TextUtils.equals(Uri.parse(str2).getHost(), "webview")) {
            return parse;
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        Uri.Builder buildUpon = parse.buildUpon();
        if (!(queryParameterNames == null || buildUpon == null)) {
            for (String str3 : queryParameterNames) {
                buildUpon.appendQueryParameter(str3, uri.getQueryParameter(str3));
            }
        }
        return buildUpon.build();
    }
}
