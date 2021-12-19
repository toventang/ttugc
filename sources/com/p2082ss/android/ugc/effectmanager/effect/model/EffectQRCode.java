package com.p2082ss.android.ugc.effectmanager.effect.model;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectQRCodeTemplate;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.effect.model.EffectQRCode */
public final class EffectQRCode extends EffectQRCodeTemplate implements Serializable {
    private final transient com.p2082ss.ugc.effectplatform.model.EffectQRCode kQrcode;

    static {
        Covode.recordClassIndex(95586);
    }

    public EffectQRCode() {
        this(null, 1, null);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectQRCodeTemplate
    public final com.p2082ss.ugc.effectplatform.model.EffectQRCode getKQrcode() {
        return this.kQrcode;
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectQRCode
    public final String getQrCodeText() {
        String qrCodeText;
        com.p2082ss.ugc.effectplatform.model.EffectQRCode kQrcode2 = getKQrcode();
        if (kQrcode2 == null || (qrCodeText = kQrcode2.getQrCodeText()) == null) {
            return super.getQrCodeText();
        }
        return qrCodeText;
    }

    public EffectQRCode(com.p2082ss.ugc.effectplatform.model.EffectQRCode effectQRCode) {
        super(effectQRCode);
        String qrCodeText;
        this.kQrcode = effectQRCode;
        com.p2082ss.ugc.effectplatform.model.EffectQRCode kQrcode2 = getKQrcode();
        if (kQrcode2 != null && (qrCodeText = kQrcode2.getQrCodeText()) != null) {
            super.setQrCodeText(qrCodeText);
        }
    }

    @Override // com.p2082ss.ugc.effectplatform.model.EffectQRCode
    public final void setQrCodeText(String str) {
        C89219l.m154719c(str, "");
        com.p2082ss.ugc.effectplatform.model.EffectQRCode kQrcode2 = getKQrcode();
        if (kQrcode2 != null) {
            kQrcode2.setQrCodeText(str);
        }
        super.setQrCodeText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectQRCode(com.p2082ss.ugc.effectplatform.model.EffectQRCode effectQRCode, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : effectQRCode);
    }
}
