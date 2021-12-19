package com.p2082ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ea */
public final class C70762ea implements Serializable {
    public static int BEATES_FILE_BEATS_A0 = 2;
    public static int BEATES_FILE_CUSTOM = 3;
    public static int BEATES_FILE_DEFAULT;
    public static int BEATES_FILE_SERVER_C = 1;
    public static final C70763a Companion = new C70763a((byte) 0);
    @AbstractC27891c(mo46611a = "music_id")

    /* renamed from: a */
    private String f158398a;
    @AbstractC27891c(mo46611a = "vebeats_url")

    /* renamed from: b */
    private String f158399b;
    @AbstractC27891c(mo46611a = "vebeats_path")

    /* renamed from: c */
    private String f158400c;
    @AbstractC27891c(mo46611a = "downbeats_url")

    /* renamed from: d */
    private String f158401d;
    @AbstractC27891c(mo46611a = "downbeats_path")

    /* renamed from: e */
    private String f158402e;
    @AbstractC27891c(mo46611a = "nostrengthbeats_url")

    /* renamed from: f */
    private String f158403f;
    @AbstractC27891c(mo46611a = "nostrengthbeats_path")

    /* renamed from: g */
    private String f158404g;
    @AbstractC27891c(mo46611a = "defaultlocal_path")

    /* renamed from: h */
    private String f158405h;
    @AbstractC27891c(mo46611a = "defaultlocal_url")

    /* renamed from: i */
    private String f158406i;
    @AbstractC27891c(mo46611a = "manmodebeats_url")

    /* renamed from: j */
    private String f158407j;
    @AbstractC27891c(mo46611a = "manmodebeats_path")

    /* renamed from: k */
    private String f158408k;
    @AbstractC27891c(mo46611a = "alg_type")

    /* renamed from: l */
    private int f158409l = BEATES_FILE_DEFAULT;
    @AbstractC27891c(mo46611a = "min_seg")

    /* renamed from: m */
    private int f158410m;
    @AbstractC27891c(mo46611a = "max_seg")

    /* renamed from: n */
    private int f158411n;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ea$a */
    public static final class C70763a {
        static {
            Covode.recordClassIndex(83234);
        }

        private C70763a() {
        }

        public /* synthetic */ C70763a(byte b) {
            this();
        }
    }

    public final int getAlgType() {
        return this.f158409l;
    }

    public final String getDefaultLocalPath() {
        return this.f158405h;
    }

    public final String getDefaultLocalUrl() {
        return this.f158406i;
    }

    public final String getDownBeatsPath() {
        return this.f158402e;
    }

    public final String getDownBeatsUrl() {
        return this.f158401d;
    }

    public final String getManModeBeatsPath() {
        return this.f158408k;
    }

    public final String getManModeBeatsUrl() {
        return this.f158407j;
    }

    public final int getMaxSeg() {
        return this.f158411n;
    }

    public final int getMinSeg() {
        return this.f158410m;
    }

    public final String getMusicId() {
        return this.f158398a;
    }

    public final String getNoStrengthBeatsPath() {
        return this.f158404g;
    }

    public final String getNoStrengthBeatsUrl() {
        return this.f158403f;
    }

    public final String getVeBeatsPath() {
        return this.f158400c;
    }

    public final String getVeBeatsUrl() {
        return this.f158399b;
    }

    public final boolean existOnSetAlgFile() {
        return C84902i.m145892a(this.f158400c);
    }

    public final boolean hasOnSetAlgUrl() {
        if (!TextUtils.isEmpty(this.f158399b)) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(83233);
    }

    public final boolean isSuccessivelyAlgType() {
        int i = this.f158409l;
        if (i == BEATES_FILE_SERVER_C || i == BEATES_FILE_BEATS_A0 || i == BEATES_FILE_CUSTOM) {
            return true;
        }
        return false;
    }

    public final boolean existSuccessivelyAlgFile() {
        int i = this.f158409l;
        if (i == BEATES_FILE_BEATS_A0) {
            return C84902i.m145892a(this.f158400c);
        }
        if (i == BEATES_FILE_SERVER_C) {
            return C84902i.m145892a(this.f158402e);
        }
        if (i == BEATES_FILE_CUSTOM) {
            return C84902i.m145892a(this.f158408k);
        }
        return false;
    }

    public final boolean hasSuccessivelyAlgUrl() {
        int i = this.f158409l;
        if (i == BEATES_FILE_BEATS_A0) {
            if (!TextUtils.isEmpty(this.f158399b)) {
                return true;
            }
            return false;
        } else if (i == BEATES_FILE_SERVER_C) {
            if (!TextUtils.isEmpty(this.f158401d)) {
                return true;
            }
            return false;
        } else if (i != BEATES_FILE_CUSTOM || TextUtils.isEmpty(this.f158407j)) {
            return false;
        } else {
            return true;
        }
    }

    public final void setAlgType(int i) {
        this.f158409l = i;
    }

    public final void setDefaultLocalPath(String str) {
        this.f158405h = str;
    }

    public final void setDefaultLocalUrl(String str) {
        this.f158406i = str;
    }

    public final void setDownBeatsPath(String str) {
        this.f158402e = str;
    }

    public final void setDownBeatsUrl(String str) {
        this.f158401d = str;
    }

    public final void setManModeBeatsPath(String str) {
        this.f158408k = str;
    }

    public final void setManModeBeatsUrl(String str) {
        this.f158407j = str;
    }

    public final void setMaxSeg(int i) {
        this.f158411n = i;
    }

    public final void setMinSeg(int i) {
        this.f158410m = i;
    }

    public final void setMusicId(String str) {
        this.f158398a = str;
    }

    public final void setNoStrengthBeatsPath(String str) {
        this.f158404g = str;
    }

    public final void setNoStrengthBeatsUrl(String str) {
        this.f158403f = str;
    }

    public final void setVeBeatsPath(String str) {
        this.f158400c = str;
    }

    public final void setVeBeatsUrl(String str) {
        this.f158399b = str;
    }
}
