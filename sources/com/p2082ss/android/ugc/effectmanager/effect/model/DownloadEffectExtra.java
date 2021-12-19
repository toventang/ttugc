package com.p2082ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.DownloadEffectExtraTemplate;
import com.p2082ss.ugc.effectplatform.model.C86838c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.DownloadEffectExtra */
public final class DownloadEffectExtra extends DownloadEffectExtraTemplate implements Serializable {
    private final transient C86838c kDownloadEffect;

    static {
        Covode.recordClassIndex(95575);
    }

    public DownloadEffectExtra() {
        this(null, 1, null);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.DownloadEffectExtraTemplate
    public final C86838c getKDownloadEffect() {
        return this.kDownloadEffect;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.C86838c
    public final String getPanel() {
        String panel;
        C86838c kDownloadEffect2 = getKDownloadEffect();
        if (kDownloadEffect2 == null || (panel = kDownloadEffect2.getPanel()) == null) {
            return super.getPanel();
        }
        return panel;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.C86838c
    public final void setPanel(String str) {
        C86838c kDownloadEffect2 = getKDownloadEffect();
        if (kDownloadEffect2 != null) {
            kDownloadEffect2.setPanel(str);
        }
        super.setPanel(str);
    }

    public DownloadEffectExtra(C86838c cVar) {
        super(cVar);
        String panel;
        this.kDownloadEffect = cVar;
        C86838c kDownloadEffect2 = getKDownloadEffect();
        if (kDownloadEffect2 != null && (panel = kDownloadEffect2.getPanel()) != null) {
            super.setPanel(panel);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadEffectExtra(C86838c cVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : cVar);
    }
}
