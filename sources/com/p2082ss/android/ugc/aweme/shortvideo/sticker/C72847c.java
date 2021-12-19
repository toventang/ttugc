package com.p2082ss.android.ugc.aweme.shortvideo.sticker;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.c */
public final class C72847c {
    static {
        Covode.recordClassIndex(85538);
    }

    /* renamed from: e */
    public static boolean m128639e(Effect effect) {
        if (effect == null) {
            return false;
        }
        return m128633b(effect.getSdkExtra());
    }

    /* renamed from: a */
    private static int m128625a(String str) {
        if (!TextUtils.isEmpty(str) && str.contains("lock_type")) {
            try {
                return new JSONObject(str).getInt("lock_type");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static boolean m128640f(Effect effect) {
        if (effect == null || effect.getTags() == null) {
            return false;
        }
        return effect.getTags().contains("audio_effect");
    }

    /* renamed from: h */
    public static boolean m128642h(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (m128629a(effect.getExtra(), "is_music_beat") || C72845b.m128621a(effect.getSdkExtra())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m128626a(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || !faceStickerBean.getTypes().contains("Game2DV2")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m128631b(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || TextUtils.isEmpty(faceStickerBean.getSdkExtra())) {
            return false;
        }
        return m128633b(faceStickerBean.getSdkExtra());
    }

    /* renamed from: c */
    public static boolean m128635c(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null) {
            return false;
        }
        if (m128629a(faceStickerBean.getExtra(), "is_music_beat") || C72845b.m128621a(faceStickerBean.getSdkExtra())) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m128638d(Effect effect) {
        if (effect == null || effect.getTypes() == null || !effect.getTypes().contains("Game2DV2")) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m128641g(Effect effect) {
        if (effect == null || effect.getTags() == null) {
            return false;
        }
        if (effect.getTags().contains("instrument") || effect.getTypes().contains("Instrument")) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m128627a(Effect effect) {
        if (effect == null) {
            return false;
        }
        if (m128642h(effect)) {
            return true;
        }
        return m128629a(effect.getExtra(), "music_is_force_bind");
    }

    /* renamed from: b */
    public static boolean m128632b(Effect effect) {
        if (effect == null) {
            return false;
        }
        for (String str : effect.getTags()) {
            if (str.contains("lock")) {
                return true;
            }
        }
        return m128636c(effect);
    }

    /* renamed from: c */
    public static boolean m128636c(Effect effect) {
        String extra;
        if (effect == null || (extra = effect.getExtra()) == null || m128625a(extra) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m128633b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return "effectControlGame".equals(new JSONObject(str).optString(StringSet.type));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m128628a(Effect effect, String str) {
        if (effect == null || !m128629a(effect.getSdkExtra(), str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static String m128630b(String str, String str2) {
        JSONObject jSONObject;
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
                return null;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString(str2);
    }

    /* renamed from: c */
    public static int m128634c(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return new JSONObject(str).optInt(str2);
        } catch (JSONException unused) {
            return 0;
        }
    }

    /* renamed from: d */
    public static String m128637d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new JSONObject(str).optString(str2);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m128629a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, "{}")) {
            try {
                if (new JSONObject(str).optBoolean(str2)) {
                    return true;
                }
            } catch (JSONException unused) {
                return false;
            }
        }
        return false;
    }
}
