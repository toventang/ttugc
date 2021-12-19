package com.p2082ss.android.ugc.aweme.shortvideo.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.SimpleAVChallenge */
public class SimpleAVChallenge {
    private static final C27910f GSON = C63244g.m114602a().mo73261G();
    public String challengeName;
    public String cid;
    public String stickerId;
    public int type;
    public int userCount;
    public long viewCount = -1;

    /* renamed from: com_ss_android_ugc_aweme_shortvideo_model_SimpleAVChallenge_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m127079xb3d5fd2(String str, String str2, Throwable th) {
        return 0;
    }

    static {
        Covode.recordClassIndex(84618);
    }

    public AVChallenge parse2AVChallenge() {
        AVChallenge aVChallenge = new AVChallenge();
        aVChallenge.cid = this.cid;
        aVChallenge.challengeName = this.challengeName;
        aVChallenge.type = this.type;
        aVChallenge.stickerId = this.stickerId;
        aVChallenge.viewCount = this.viewCount;
        aVChallenge.userCount = this.userCount;
        return aVChallenge;
    }

    public static SimpleAVChallenge deserializeFromJson(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (SimpleAVChallenge) GSON.mo46670a(str, SimpleAVChallenge.class);
        } catch (Exception e) {
            m127079xb3d5fd2("SimpleAVChallenge", "fromJson: ", e);
            return null;
        }
    }

    public static SimpleAVChallenge fromAVChallenge(AVChallenge aVChallenge) {
        SimpleAVChallenge simpleAVChallenge = new SimpleAVChallenge();
        simpleAVChallenge.cid = aVChallenge.cid;
        simpleAVChallenge.challengeName = aVChallenge.challengeName;
        simpleAVChallenge.type = aVChallenge.type;
        simpleAVChallenge.stickerId = aVChallenge.stickerId;
        simpleAVChallenge.viewCount = aVChallenge.viewCount;
        simpleAVChallenge.userCount = aVChallenge.userCount;
        return simpleAVChallenge;
    }

    public static String serializeToStr(SimpleAVChallenge simpleAVChallenge) {
        if (simpleAVChallenge == null) {
            return null;
        }
        try {
            return GSON.mo46674b(simpleAVChallenge);
        } catch (Exception e) {
            m127079xb3d5fd2("SimpleAVChallenge", "toJson: ", e);
            return null;
        }
    }
}
