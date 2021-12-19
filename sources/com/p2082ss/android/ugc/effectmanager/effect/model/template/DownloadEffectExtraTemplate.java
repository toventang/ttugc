package com.p2082ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.C86838c;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.DownloadEffectExtraTemplate */
public class DownloadEffectExtraTemplate extends C86838c {
    private final transient C86838c kDownloadEffect;

    static {
        Covode.recordClassIndex(95618);
    }

    public DownloadEffectExtraTemplate() {
        this(null, 1, null);
    }

    public C86838c getKDownloadEffect() {
        return this.kDownloadEffect;
    }

    public DownloadEffectExtraTemplate(C86838c cVar) {
        super(null, 1, null);
        this.kDownloadEffect = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DownloadEffectExtraTemplate(C86838c cVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : cVar);
    }
}
