package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.ap */
public final class C38230ap {

    /* renamed from: a */
    public String f90319a;

    /* renamed from: b */
    public long f90320b;

    /* renamed from: c */
    public String f90321c;

    /* renamed from: d */
    public String f90322d;

    /* renamed from: e */
    public String f90323e;

    /* renamed from: f */
    public String f90324f;

    /* renamed from: g */
    public String f90325g;

    /* renamed from: h */
    public int f90326h;

    /* renamed from: i */
    public String f90327i;

    /* renamed from: j */
    public String f90328j;

    /* renamed from: k */
    public JSONObject f90329k;

    /* renamed from: l */
    public String f90330l;

    /* renamed from: m */
    public int f90331m;

    /* renamed from: n */
    public boolean f90332n;

    static {
        Covode.recordClassIndex(45714);
    }

    /* renamed from: a */
    public static String m77595a(int i) {
        switch (i) {
            case 1:
                return "feed_download_ad";
            case 2:
                return "detail_download_ad";
            case 3:
                return "comment_download_ad";
            case 4:
                return "wap";
            case ABRConfig.ABR_STARTUP_MODEL_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                return "landing_ad";
            default:
                return "draw_ad";
        }
    }
}
