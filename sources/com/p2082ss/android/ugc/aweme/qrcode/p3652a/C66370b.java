package com.p2082ss.android.ugc.aweme.qrcode.p3652a;

import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qrcode.QRCodeFragment;
import dagger.p4535a.AbstractC88078c;
import dagger.p4535a.C88081f;
import javax.p4631a.AbstractC89405a;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.b */
public final class C66370b implements AbstractC88078c<QRCodeFragment> {

    /* renamed from: a */
    private final AbstractC89405a<ActivityC0945e> f149267a;

    static {
        Covode.recordClassIndex(77896);
    }

    @Override // javax.p4631a.AbstractC89405a
    public final /* synthetic */ Object get() {
        return m118057a(this.f149267a.get());
    }

    /* renamed from: a */
    public static QRCodeFragment m118057a(ActivityC0945e eVar) {
        return (QRCodeFragment) C88081f.m153153a(C66369a.m118056a(eVar), "Cannot return null from a non-@Nullable @Provides method");
    }
}
