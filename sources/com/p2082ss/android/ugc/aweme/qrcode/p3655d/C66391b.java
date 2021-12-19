package com.p2082ss.android.ugc.aweme.qrcode.p3655d;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.C34608n;
import com.p2082ss.android.ugc.aweme.p2426bw.p2427a.AbstractC35320a;
import com.p2082ss.android.ugc.aweme.qrcode.api.QRCodeApi;
import java.io.File;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.qrcode.d.b */
public class C66391b extends AbstractC35320a<C66390a> {
    static {
        Covode.recordClassIndex(77923);
    }

    /* renamed from: a */
    public void mo105310a(String str) {
    }

    /* renamed from: a */
    public boolean mo105311a() {
        return false;
    }

    /* renamed from: b */
    public File mo105312b() {
        return null;
    }

    /* renamed from: a */
    public final void mo105309a(final int i, final String str) {
        C34608n.m70658a().mo61083a(this.mHandler, new Callable() {
            /* class com.p2082ss.android.ugc.aweme.qrcode.p3655d.C66391b.CallableC663921 */

            /* renamed from: c */
            final /* synthetic */ String f149294c = null;

            static {
                Covode.recordClassIndex(77924);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return QRCodeApi.m118058a(i, str, this.f149294c);
            }
        }, 0);
    }
}
