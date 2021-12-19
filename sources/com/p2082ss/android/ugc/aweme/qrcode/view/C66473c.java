package com.p2082ss.android.ugc.aweme.qrcode.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerpermissions.AbstractC17765f;
import com.bytedance.ies.powerpermissions.p1240c.C17749a;

/* renamed from: com.ss.android.ugc.aweme.qrcode.view.c */
final /* synthetic */ class C66473c implements AbstractC17765f {

    /* renamed from: a */
    private final QRCodePermissionActivity f149441a;

    static {
        Covode.recordClassIndex(78009);
    }

    C66473c(QRCodePermissionActivity qRCodePermissionActivity) {
        this.f149441a = qRCodePermissionActivity;
    }

    @Override // com.bytedance.ies.powerpermissions.AbstractC17765f
    /* renamed from: a */
    public final void mo28241a(C17749a[] aVarArr) {
        QRCodePermissionActivity qRCodePermissionActivity = this.f149441a;
        for (C17749a aVar : aVarArr) {
            if (aVar.f42426b != C17749a.EnumC17750a.GRANTED) {
                qRCodePermissionActivity.mo105380a();
                return;
            }
        }
        qRCodePermissionActivity.mo105381b();
    }
}
