package com.p2082ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.KtfInfo;
import com.p2082ss.android.ugc.aweme.feed.model.OcrLocation;
import com.p2082ss.android.ugc.aweme.feed.model.VPAInfo;
import com.p2082ss.android.ugc.aweme.live.C58589b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MvModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.i */
public class C71872i implements Serializable {
    @AbstractC27891c(mo46611a = "diamond_game_id")
    public String diamondGameId;
    @AbstractC27891c(mo46611a = "hproject_info")
    public C71873a f2ProjectInfo;
    @AbstractC27891c(mo46611a = "green_screen")
    public int greenScreen;
    @AbstractC27891c(mo46611a = "koi_fish")
    public int koiFish;
    @AbstractC27891c(mo46611a = "ktf_info")
    public KtfInfo ktfInfo;
    @AbstractC27891c(mo46611a = "status_template_id")
    public String mStatusId;
    @AbstractC27891c(mo46611a = "video_tag")
    public int mVideoTag;
    @AbstractC27891c(mo46611a = "mv_info")
    public MvModel mvInfo;
    @AbstractC27891c(mo46611a = "mv_id")
    public String mvThemeId;
    @AbstractC27891c(mo46611a = "mv_type")
    public int mvType;
    @AbstractC27891c(mo46611a = "ocr_location")
    public String ocrLocation;
    @AbstractC27891c(mo46611a = "vpa_info")
    public VPAInfo vpaInfo = new VPAInfo(false, 0);

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.i$a */
    public static class C71873a implements Serializable {
        @AbstractC27891c(mo46611a = "icon_url")
        public UrlModel iconUrl;
        @AbstractC27891c(mo46611a = "schema_url")
        public String schemaUrl;
        @AbstractC27891c(mo46611a = "title")
        public String title;

        static {
            Covode.recordClassIndex(84422);
        }
    }

    static {
        Covode.recordClassIndex(84421);
    }

    public OcrLocation getOcrLocation() {
        OcrLocation ocrLocation2 = null;
        if (TextUtils.isEmpty(this.ocrLocation)) {
            return null;
        }
        try {
            ocrLocation2 = (OcrLocation) new C27910f().mo46670a(this.ocrLocation, OcrLocation.class);
            return ocrLocation2;
        } catch (Exception e) {
            e.printStackTrace();
            return ocrLocation2;
        }
    }

    public static C71872i createStruct(String str) {
        C71872i iVar = new C71872i();
        if (TextUtils.isEmpty(str)) {
            return iVar;
        }
        try {
            iVar = (C71872i) C58589b.m107696a().mo46670a(str, C71872i.class);
            return iVar;
        } catch (Exception e) {
            e.printStackTrace();
            return iVar;
        }
    }
}
