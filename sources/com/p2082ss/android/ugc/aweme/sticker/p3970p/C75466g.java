package com.p2082ss.android.ugc.aweme.sticker.p3970p;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72845b;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.uploadpicsticker.C76002c;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sticker.p.g */
public final class C75466g {
    static {
        Covode.recordClassIndex(88388);
    }

    /* renamed from: r */
    public static boolean m132366r(Effect effect) {
        return C72847c.m128627a(effect);
    }

    /* renamed from: s */
    public static boolean m132367s(Effect effect) {
        return C72847c.m128642h(effect);
    }

    /* renamed from: v */
    public static boolean m132370v(Effect effect) {
        return C72847c.m128641g(effect);
    }

    /* renamed from: B */
    public static boolean m132338B(Effect effect) {
        if (effect == null) {
            return false;
        }
        return m132350b(effect.getExtra());
    }

    /* renamed from: a */
    public static boolean m132345a(Effect effect) {
        if (effect == null || effect.getEffectType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m132348b(FaceStickerBean faceStickerBean) {
        if (C72847c.m128626a(faceStickerBean) || C72847c.m128631b(faceStickerBean)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m132352d(Effect effect) {
        if (effect == null || effect.getSource() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m132353e(Effect effect) {
        if (effect == null || effect.getEffectType() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m132358j(Effect effect) {
        m132341E(effect);
        if (m132342F(effect)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public static boolean m132359k(Effect effect) {
        if (m132342F(effect) || m132341E(effect)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public static boolean m132368t(Effect effect) {
        if (C72847c.m128638d(effect) || C72847c.m128639e(effect)) {
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public static boolean m132373y(Effect effect) {
        if (effect == null || effect.getEffectType() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public static boolean m132339C(Effect effect) {
        if (effect == null || !C72847c.m128629a(effect.getExtra(), "photosensitive")) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public static boolean m132340D(Effect effect) {
        if (effect != null && !m132345a(effect) && !m132368t(effect) && !effect.isBusiness()) {
            return m132339C(effect);
        }
        return false;
    }

    /* renamed from: E */
    private static boolean m132341E(Effect effect) {
        if (effect == null || effect.getRequirements() == null || !effect.getRequirements().contains("AR")) {
            return false;
        }
        return true;
    }

    /* renamed from: F */
    private static boolean m132342F(Effect effect) {
        if (effect == null || effect.getTypes() == null || !effect.getTypes().contains("AR")) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m132349b(Effect effect) {
        if (effect == null || effect.getEffectType() != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m132351c(Effect effect) {
        if (effect == null || effect.getSource() != 1 || TextUtils.isEmpty(effect.getDesignerId())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m132354f(Effect effect) {
        if (m132347a("BackgroundVideo", effect) || C72847c.m128628a(effect, "BackgroundVideo")) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m132355g(Effect effect) {
        if (effect == null || TextUtils.isEmpty(effect.getSdkExtra())) {
            return false;
        }
        return C72847c.m128629a(effect.getSdkExtra(), "triggered_slow_motion");
    }

    /* renamed from: h */
    public static boolean m132356h(Effect effect) {
        if (!m132354f(effect) || !m132347a("MultiScanBgVideo", effect)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static boolean m132357i(Effect effect) {
        if (m132347a("voice_recognization", effect) || C72845b.m128620a(effect)) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public static boolean m132360l(Effect effect) {
        if (m132359k(effect) || m132363o(effect) || m132361m(effect)) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public static boolean m132362n(Effect effect) {
        if (effect == null || effect.getTags() == null || !effect.getTags().contains("textInShoot")) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public static boolean m132369u(Effect effect) {
        if (effect == null || effect.getTypes() == null) {
            return false;
        }
        return effect.getTypes().contains("TouchGes");
    }

    /* renamed from: z */
    public static boolean m132374z(Effect effect) {
        if (effect == null || effect.getTypes() == null || !effect.getTypes().contains("Composer")) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    public static boolean m132337A(Effect effect) {
        if ((effect == null || effect.getParentId() == null || effect.getParentId().isEmpty()) && !m132373y(effect) && ((effect == null || !effect.getTypes().contains("Adaptive")) && !m132354f(effect) && !C76002c.m133280a(effect) && !m132374z(effect))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static ArrayList<String> m132343a(String str) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split(",");
            for (String str2 : split) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m132350b(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            return new JSONObject(str).optBoolean("need_effect_to_capture_image", false);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: m */
    public static boolean m132361m(Effect effect) {
        if (effect == null) {
            return false;
        }
        if ((effect.getTags() == null || !effect.getTags().contains("text2d")) && !effect.getTypes().contains("Text2D") && !effect.getTypes().contains("Text2DV2")) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public static boolean m132363o(Effect effect) {
        if (effect == null) {
            return false;
        }
        if ((effect.getTags() == null || !effect.getTags().contains("TextEdit")) && !effect.getTypes().contains("TextEdit")) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static boolean m132364p(Effect effect) {
        if (effect == null) {
            return false;
        }
        for (String str : effect.getTags()) {
            if (str.contains(":1")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: w */
    public static boolean m132371w(Effect effect) {
        String b;
        if (effect == null) {
            return true;
        }
        if (C72847c.m128641g(effect) || C72847c.m128638d(effect) || C72847c.m128640f(effect) || C72847c.m128639e(effect) || C72847c.m128629a(effect.getSdkExtra(), "isTC21RedEnvelope") || ((b = C72847c.m128630b(effect.getSdkExtra(), "multi_segments")) != null && !b.isEmpty())) {
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public static boolean m132372x(Effect effect) {
        if (effect == null || !effect.isBusiness()) {
            return false;
        }
        try {
            if (1 == ((FaceStickerCommerceBean) new C27910f().mo46670a(effect.getExtra(), FaceStickerCommerceBean.class)).f169521d) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static boolean m132344a(FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || ((faceStickerBean.getTypes() == null || !faceStickerBean.getTypes().contains("AR")) && (faceStickerBean.getRequirements() == null || !faceStickerBean.getRequirements().contains("AR")))) {
            return false;
        }
        return true;
    }

    /* renamed from: q */
    public static String m132365q(Effect effect) {
        if (effect != null && effect.getTags() != null && !effect.getTags().isEmpty()) {
            Iterator<String> it = effect.getTags().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                if (next != null && next.contains("challenge") && next.contains(":")) {
                    String[] split = next.split(":");
                    if (split.length > 1 && split[1] != null && !split[1].isEmpty() && split[1].matches("[0-9]+")) {
                        return split[1];
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m132346a(String str, FaceStickerBean faceStickerBean) {
        if (faceStickerBean == null || faceStickerBean == FaceStickerBean.NONE || C84892d.m145850a(faceStickerBean.getTags()) || !faceStickerBean.getTags().contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m132347a(String str, Effect effect) {
        if (effect != null && !C84892d.m145850a(effect.getTags()) && effect.getTags().contains(str)) {
            return true;
        }
        return false;
    }
}
