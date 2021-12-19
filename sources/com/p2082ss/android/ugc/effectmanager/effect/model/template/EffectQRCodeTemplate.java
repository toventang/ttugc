package com.p2082ss.android.ugc.effectmanager.effect.model.template;

import com.bytedance.covode.number.Covode;
import com.p2082ss.ugc.effectplatform.model.EffectQRCode;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.template.EffectQRCodeTemplate */
public class EffectQRCodeTemplate extends EffectQRCode {
    private final transient EffectQRCode kQrcode;

    static {
        Covode.recordClassIndex(95625);
    }

    public EffectQRCodeTemplate() {
        this(null, 1, null);
    }

    public EffectQRCode getKQrcode() {
        return this.kQrcode;
    }

    public EffectQRCodeTemplate(EffectQRCode effectQRCode) {
        super(null, 1, null);
        this.kQrcode = effectQRCode;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectQRCodeTemplate(EffectQRCode effectQRCode, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : effectQRCode);
    }
}
