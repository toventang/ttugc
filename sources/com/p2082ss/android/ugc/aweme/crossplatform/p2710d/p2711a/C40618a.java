package com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40617a;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40628b;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40629c;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40632e;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40633f;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.C40634g;
import com.p2082ss.android.ugc.aweme.crossplatform.p2710d.p2711a.C40620b;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.d.a.a */
public class C40618a {

    /* renamed from: a */
    public C40617a f95068a;

    /* renamed from: b */
    public C40628b f95069b;

    /* renamed from: c */
    public C40632e f95070c;

    /* renamed from: d */
    public C40633f f95071d;

    /* renamed from: e */
    public C40634g f95072e;

    /* renamed from: f */
    public C40629c f95073f;

    static {
        Covode.recordClassIndex(48458);
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.d.a.a$a */
    public static final class C40619a {
        static {
            Covode.recordClassIndex(48459);
        }

        /* renamed from: b */
        private static Bundle m81987b(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        /* renamed from: a */
        public static C40618a m81985a(Intent intent) {
            Bundle b = m81987b(intent);
            if (b == null) {
                b = new Bundle();
            }
            if (TextUtils.isEmpty(b.getString("url"))) {
                if (intent.getData() != null && !TextUtils.isEmpty(intent.getData().toString())) {
                    b.putString("url", intent.getData().toString());
                }
                if (TextUtils.isEmpty(b.getString("url")) && !TextUtils.isEmpty(b.getString("rn_schema"))) {
                    b.putString("url", b.getString("rn_schema"));
                }
            }
            try {
                if (!TextUtils.isEmpty(b.getString("url"))) {
                    Uri parse = Uri.parse(b.getString("url"));
                    b.putString("hybrid_report_source", parse.getQueryParameter("hybrid_report_source"));
                    String queryParameter = parse.getQueryParameter("has_adinfojson");
                    b.putString("has_ad_info_json", queryParameter);
                    if (TextUtils.equals(queryParameter, "1")) {
                        b.putString("ad_info_json", Uri.parse(b.getString("url")).getQueryParameter("adinfojson"));
                    }
                }
                String string = b.getString("hide_nav_bar", "-1");
                if (!TextUtils.equals(string, "-1")) {
                    m81986a(b, "hide_nav_bar", string);
                }
                String string2 = b.getString("hide_status_bar", "-1");
                if (!TextUtils.equals(string2, "-1")) {
                    m81986a(b, "hide_status_bar", string2);
                }
                String string3 = b.getString("hide_more", "-1");
                if (!TextUtils.equals(string3, "-1")) {
                    m81986a(b, "hide_more", string3);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return C40620b.C40622b.m81989a(b);
        }

        /* renamed from: a */
        private static void m81986a(Bundle bundle, String str, String str2) {
            if (TextUtils.equals("1", str2)) {
                bundle.putBoolean(str, true);
            } else if (TextUtils.equals("true", str2)) {
                bundle.putBoolean(str, true);
            } else if (TextUtils.equals("0", str2)) {
                bundle.putBoolean(str, false);
            } else if (TextUtils.equals("false", str2)) {
                bundle.putBoolean(str, false);
            }
        }
    }
}
