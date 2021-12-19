package com.p2082ss.android.ugc.aweme.app;

import android.net.Uri;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.f */
public final class C33739f {
    static {
        Covode.recordClassIndex(40634);
    }

    /* renamed from: b */
    public static boolean m69067b(Uri uri) {
        String str;
        if (uri == null || !"aweme".equals(uri.getHost())) {
            return false;
        }
        try {
            str = uri.getQueryParameter("gd_label");
        } catch (Throwable unused) {
            str = "";
        }
        if ("click_push_recommend".equals(str) || "click_push_newvideo".equals(str) || "click_push_videoat".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static List<String> m69066a(Uri uri) {
        String str;
        String str2 = "";
        ArrayList arrayList = new ArrayList();
        if (uri == null) {
            return arrayList;
        }
        String path = uri.getPath();
        if (m69067b(uri)) {
            if (!C13627m.m24498a(path) && path.startsWith("/detail/")) {
                arrayList.add(uri.getLastPathSegment());
            } else if (!C13627m.m24498a(path) && path.startsWith("/detail_list")) {
                try {
                    str = uri.getQueryParameter("gids");
                } catch (Throwable unused) {
                    str = str2;
                }
                int i = 0;
                if (!C13627m.m24498a(str)) {
                    String[] split = str.split(",");
                    int length = split.length;
                    while (i < length) {
                        arrayList.add(split[i]);
                        i++;
                    }
                } else {
                    try {
                        str2 = uri.getQueryParameter("push_params");
                    } catch (Throwable unused2) {
                    }
                    if (!C13627m.m24498a(str2)) {
                        try {
                            String optString = new JSONObject(str2).optString("gids");
                            if (!C13627m.m24498a(optString)) {
                                String[] split2 = optString.split(",");
                                int length2 = split2.length;
                                while (i < length2) {
                                    arrayList.add(split2[i]);
                                    i++;
                                }
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                }
            }
        }
        return arrayList;
    }
}
