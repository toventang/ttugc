package com.p2082ss.android.ugc.aweme.qrcode.view;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qrcode.view.ScanQRCodeActivityV2;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVCameraService;
import com.p2082ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.f */
final /* synthetic */ class C66476f implements IAVCameraService.IAVCameraReadyCallback {

    /* renamed from: a */
    private final ScanQRCodeActivityV2 f149449a;

    /* renamed from: b */
    private final ScanQRCodeActivityV2.AbstractC66465b f149450b;

    static {
        Covode.recordClassIndex(78012);
    }

    C66476f(ScanQRCodeActivityV2 scanQRCodeActivityV2, ScanQRCodeActivityV2.AbstractC66465b bVar) {
        this.f149449a = scanQRCodeActivityV2;
        this.f149450b = bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVCameraService.IAVCameraReadyCallback
    public final void finish(Object obj) {
        ScanQRCodeActivityV2 scanQRCodeActivityV2 = this.f149449a;
        ScanQRCodeActivityV2.AbstractC66465b bVar = this.f149450b;
        IQRCodeScanner iQRCodeScanner = (IQRCodeScanner) obj;
        if (iQRCodeScanner != null) {
            scanQRCodeActivityV2.f149388d = iQRCodeScanner;
            if (scanQRCodeActivityV2.f149389e == scanQRCodeActivityV2.f149390f) {
                scanQRCodeActivityV2.f149388d.setScanListener(scanQRCodeActivityV2.f149402r);
            }
        }
        if (bVar != null) {
            bVar.mo105404a();
        }
    }
}
