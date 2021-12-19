package com.p2082ss.android.ugc.aweme.sticker.p3970p;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46402a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73754h;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p2082ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.sticker.p.f */
public final class C75464f {
    static {
        Covode.recordClassIndex(88386);
    }

    /* renamed from: a */
    public static FaceStickerBean m132333a(Effect effect) {
        return m132334a(effect, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.p.f$a */
    public static class C75465a {
        static {
            Covode.recordClassIndex(88387);
        }

        /* renamed from: a */
        public static List<EffectCategoryModel> m132336a(Context context) {
            ArrayList arrayList = new ArrayList();
            String[] stringArray = context.getResources().getStringArray(R.array.q);
            for (String str : stringArray) {
                EffectCategoryModel effectCategoryModel = new EffectCategoryModel();
                effectCategoryModel.setName(str);
                arrayList.add(effectCategoryModel);
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static Effect m132335a(List<Effect> list) {
        if (C84892d.m145850a(list)) {
            return null;
        }
        for (Effect effect : list) {
            if (!C75466g.m132349b(effect)) {
                return effect;
            }
        }
        return list.get(0);
    }

    /* renamed from: a */
    public static FaceStickerBean m132334a(Effect effect, String str) {
        List<String> types;
        if (effect == null) {
            return FaceStickerBean.NONE;
        }
        FaceStickerBean faceStickerBean = new FaceStickerBean();
        if (!(C73754h.m129793b(effect.getEffectId()) == null || C73754h.m129794c(effect.getEffectId()) == null)) {
            faceStickerBean.setForceBindMusicPath(C73754h.m129794c(effect.getEffectId()));
        }
        faceStickerBean.setForceBind(C72847c.m128627a(effect));
        faceStickerBean.setDesignerId(effect.getDesignerId());
        faceStickerBean.setSource(effect.getSource());
        faceStickerBean.setSchema(effect.getSchema());
        if (TextUtils.isEmpty(effect.getRecId())) {
            faceStickerBean.setRecId("0");
        } else {
            faceStickerBean.setRecId(effect.getRecId());
        }
        faceStickerBean.setBusi(effect.isBusiness());
        faceStickerBean.setAdRawData(effect.getAdRawData());
        faceStickerBean.setFaceStickerCommerceBean((FaceStickerCommerceBean) new C27910f().mo46670a(effect.getExtra(), FaceStickerCommerceBean.class));
        faceStickerBean.setIconUrl(C46402a.m89551a(effect.getIconUrl()));
        faceStickerBean.setFileUrl(C46402a.m89551a(effect.getFileUrl()));
        try {
            faceStickerBean.setStickerId(Long.parseLong(effect.getEffectId()));
        } catch (NumberFormatException unused) {
            faceStickerBean.setStickerId(-1);
        }
        faceStickerBean.setId(effect.getId());
        if (!TextUtils.isEmpty(effect.getSearchType())) {
            faceStickerBean.setPropSource(effect.getSearchType());
        } else if (!TextUtils.isEmpty(str)) {
            faceStickerBean.setPropSource(str);
        } else {
            faceStickerBean.setPropSource(FaceStickerBean.sCurPropSource);
        }
        faceStickerBean.setMusicIds(effect.getMusic());
        faceStickerBean.setName(effect.getName());
        faceStickerBean.setHint(effect.getHint());
        faceStickerBean.setHintIcon(C46402a.m89551a(effect.getHintIcon()));
        faceStickerBean.setLocalPath(effect.getUnzipPath());
        if (effect.getTypes() == null) {
            types = new ArrayList<>();
        } else {
            types = effect.getTypes();
        }
        faceStickerBean.setTypes(types);
        faceStickerBean.setTags(effect.getTags());
        faceStickerBean.setChildren(effect.getChildren());
        faceStickerBean.setEffectType(effect.getEffectType());
        faceStickerBean.setParentId(effect.getParentId());
        faceStickerBean.setExtra(effect.getExtra());
        faceStickerBean.setSdkExtra(effect.getSdkExtra());
        faceStickerBean.setGradeKey(effect.getGradeKey());
        faceStickerBean.setRequirements(effect.getRequirements());
        return faceStickerBean;
    }
}
