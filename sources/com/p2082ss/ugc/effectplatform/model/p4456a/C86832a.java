package com.p2082ss.ugc.effectplatform.model.p4456a;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.Effect;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryModel;
import com.p2082ss.ugc.effectplatform.model.EffectCategoryResponse;
import com.p2082ss.ugc.effectplatform.model.EffectChannelModel;
import com.p2082ss.ugc.effectplatform.model.EffectChannelResponse;
import com.p2082ss.ugc.effectplatform.model.UrlModel;
import com.p2082ss.ugc.effectplatform.util.C86993j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p4519d.p4520a.p4532e.C88060b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.a.a */
public final class C86832a {

    /* renamed from: a */
    public static final C86833a f195750a = new C86833a((byte) 0);

    /* renamed from: b */
    private final String f195751b;

    /* renamed from: c */
    private final String f195752c;

    /* renamed from: d */
    private final boolean f195753d;

    static {
        Covode.recordClassIndex(102554);
    }

    /* renamed from: com.ss.ugc.effectplatform.model.a.a$a */
    public static final class C86833a {
        static {
            Covode.recordClassIndex(102555);
        }

        private C86833a() {
        }

        public /* synthetic */ C86833a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final EffectChannelResponse mo140149a(EffectChannelModel effectChannelModel) {
        C89219l.m154719c(effectChannelModel, "");
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (Effect effect : effectChannelModel.getEffect_list()) {
            hashMap.put(effect.getEffect_id(), effect);
        }
        for (Effect effect2 : effectChannelModel.getCollection_list()) {
            hashMap2.put(effect2.getEffect_id(), effect2);
        }
        EffectChannelResponse effectChannelResponse = new EffectChannelResponse(null, null, null, null, null, null, null, null, null, 511, null);
        effectChannelResponse.setPanel(this.f195751b);
        effectChannelResponse.setVersion(effectChannelModel.getVersion());
        effectChannelResponse.setAll_category_effects(effectChannelModel.getEffect_list());
        effectChannelResponse.setCollection_list(effectChannelModel.getCollection_list());
        effectChannelResponse.setUrl_prefix(effectChannelModel.getUrl_prefix());
        effectChannelResponse.setCategory_responses(m150401a(effectChannelModel, hashMap));
        m150402a(effectChannelModel.getEffect_list(), hashMap2);
        effectChannelResponse.setPanel_model(effectChannelModel.getPanel_model());
        effectChannelResponse.setFront_effect(m150399a(effectChannelModel.getFront_effect_id(), hashMap));
        effectChannelResponse.setRear_effect(m150399a(effectChannelModel.getRear_effect_id(), hashMap));
        if (!this.f195753d) {
            C86993j.m150661a(this.f195752c, this.f195751b, effectChannelModel.getEffect_list());
            C86993j.m150661a(this.f195752c, this.f195751b, effectChannelModel.getCollection_list());
        }
        return effectChannelResponse;
    }

    /* renamed from: a */
    private static Effect m150399a(String str, Map<String, ? extends Effect> map) {
        if (str == null) {
            return null;
        }
        return (Effect) map.get(str);
    }

    /* renamed from: a */
    private static List<Effect> m150400a(EffectCategoryModel effectCategoryModel, Map<String, ? extends Effect> map) {
        ArrayList arrayList = new ArrayList();
        if (effectCategoryModel.getEffects() == null) {
            C88060b.m153135a("BuildEffectChannelResponse", "categoryModel is null");
        }
        List<String> effects = effectCategoryModel.getEffects();
        if (effects == null) {
            return arrayList;
        }
        for (String str : effects) {
            Object obj = map.get(str);
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m150402a(List<? extends Effect> list, Map<String, ? extends Effect> map) {
        for (Effect effect : list) {
            if (effect.getEffect_type() == 1) {
                ArrayList arrayList = new ArrayList();
                List<String> children = effect.getChildren();
                if (children == null) {
                    children = new ArrayList<>();
                }
                for (String str : children) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        arrayList.add(obj);
                    }
                }
                effect.setChild_effects(arrayList);
            }
        }
    }

    /* renamed from: a */
    private static List<EffectCategoryResponse> m150401a(EffectChannelModel effectChannelModel, Map<String, ? extends Effect> map) {
        List<String> url_list;
        List<String> url_list2;
        List<String> url_list3;
        List<String> url_list4;
        ArrayList arrayList = new ArrayList();
        if (!effectChannelModel.getCategory_list().isEmpty()) {
            for (EffectCategoryModel effectCategoryModel : effectChannelModel.getCategory_list()) {
                String str = null;
                EffectCategoryResponse effectCategoryResponse = new EffectCategoryResponse(null, null, null, null, null, null, null, null, null, null, null, false, null, 8191, null);
                effectCategoryResponse.setId(effectCategoryModel.getId());
                effectCategoryResponse.setName(effectCategoryModel.getName());
                effectCategoryResponse.setKey(effectCategoryModel.getKey());
                UrlModel icon = effectCategoryModel.getIcon();
                if (!(icon == null || (url_list3 = icon.getUrl_list()) == null || !(!url_list3.isEmpty()))) {
                    UrlModel icon2 = effectCategoryModel.getIcon();
                    effectCategoryResponse.setIcon_normal_url((icon2 == null || (url_list4 = icon2.getUrl_list()) == null) ? null : url_list4.get(0));
                }
                UrlModel icon_selected = effectCategoryModel.getIcon_selected();
                if (!(icon_selected == null || (url_list = icon_selected.getUrl_list()) == null || !(!url_list.isEmpty()))) {
                    UrlModel icon_selected2 = effectCategoryModel.getIcon_selected();
                    if (!(icon_selected2 == null || (url_list2 = icon_selected2.getUrl_list()) == null)) {
                        str = url_list2.get(0);
                    }
                    effectCategoryResponse.setIcon_selected_url(str);
                }
                effectCategoryResponse.setTotal_effects(m150400a(effectCategoryModel, map));
                effectCategoryResponse.setTags(effectCategoryModel.getTags());
                effectCategoryResponse.setTags_update_time(effectCategoryModel.getTags_updated_at());
                effectCategoryResponse.setCollection_effect(effectChannelModel.getCollection_list());
                effectCategoryResponse.setExtra(effectCategoryModel.getExtra());
                effectCategoryResponse.set_default(effectCategoryModel.is_default());
                arrayList.add(effectCategoryResponse);
            }
        }
        return arrayList;
    }

    public C86832a(String str, String str2, boolean z) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        this.f195751b = str;
        this.f195752c = str2;
        this.f195753d = z;
    }
}
