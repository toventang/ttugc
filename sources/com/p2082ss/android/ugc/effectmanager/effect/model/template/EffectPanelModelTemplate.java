package com.p2082ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.EffectPanelModel;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.EffectPanelModelTemplate */
public class EffectPanelModelTemplate extends EffectPanelModel {
    private final transient EffectPanelModel kPanelModel;

    static {
        Covode.recordClassIndex(95624);
    }

    public EffectPanelModelTemplate() {
        this(null, 1, null);
    }

    public EffectPanelModel getKPanelModel() {
        return this.kPanelModel;
    }

    public EffectPanelModelTemplate(EffectPanelModel effectPanelModel) {
        super(null, null, null, null, null, null, 63, null);
        this.kPanelModel = effectPanelModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectPanelModelTemplate(EffectPanelModel effectPanelModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : effectPanelModel);
    }
}
