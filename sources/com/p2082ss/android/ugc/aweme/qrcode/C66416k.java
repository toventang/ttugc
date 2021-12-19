package com.p2082ss.android.ugc.aweme.qrcode;

import android.content.Context;
import android.view.View;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qrcode.k */
public final class C66416k implements IQRCodeService {

    /* renamed from: a */
    public static final C66416k f149319a = new C66416k();

    /* renamed from: b */
    private final /* synthetic */ IQRCodeService f149320b;

    @Override // com.p2082ss.android.ugc.aweme.qrcode.IQRCodeService
    /* renamed from: a */
    public final int mo105288a(String str) {
        return this.f149320b.mo105288a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.IQRCodeService
    /* renamed from: a */
    public final C66372b mo105289a(View view, String str, boolean z) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(str, "");
        return this.f149320b.mo105289a(view, str, z);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.IQRCodeService
    /* renamed from: a */
    public final void mo105290a(Context context, String str) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(str, "");
        this.f149320b.mo105290a(context, str);
    }

    @Override // com.p2082ss.android.ugc.aweme.qrcode.IQRCodeService
    /* renamed from: a */
    public final void mo105291a(Context context, boolean z, boolean z2) {
        C89219l.m154721d(context, "");
        this.f149320b.mo105291a(context, z, z2);
    }

    static {
        Covode.recordClassIndex(77948);
    }

    private C66416k() {
        IQRCodeService a = QRCodeServiceImpl.m118047a();
        C89219l.m154716b(a, "");
        this.f149320b = a;
    }
}
