package com.p2082ss.ugc.effectplatform.model;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.EffectQRCode */
public class EffectQRCode {
    private String qrCodeText;

    static {
        Covode.recordClassIndex(102538);
    }

    public EffectQRCode() {
        this(null, 1, null);
    }

    public String getQrCodeText() {
        return this.qrCodeText;
    }

    public void setQrCodeText(String str) {
        C89219l.m154719c(str, "");
        this.qrCodeText = str;
    }

    public EffectQRCode(String str) {
        C89219l.m154719c(str, "");
        this.qrCodeText = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EffectQRCode(String str, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str);
    }
}
