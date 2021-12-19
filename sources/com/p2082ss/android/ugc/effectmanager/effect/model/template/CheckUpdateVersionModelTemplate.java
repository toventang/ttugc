package com.p2082ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.CheckUpdateVersionModel;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.CheckUpdateVersionModelTemplate */
public class CheckUpdateVersionModelTemplate extends CheckUpdateVersionModel {
    private final transient CheckUpdateVersionModel kUpdateModel;

    static {
        Covode.recordClassIndex(95617);
    }

    public CheckUpdateVersionModelTemplate() {
        this(null, 1, null);
    }

    public CheckUpdateVersionModel getKUpdateModel() {
        return this.kUpdateModel;
    }

    public CheckUpdateVersionModelTemplate(CheckUpdateVersionModel checkUpdateVersionModel) {
        super(null, null, null, 7, null);
        this.kUpdateModel = checkUpdateVersionModel;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckUpdateVersionModelTemplate(CheckUpdateVersionModel checkUpdateVersionModel, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : checkUpdateVersionModel);
    }
}
