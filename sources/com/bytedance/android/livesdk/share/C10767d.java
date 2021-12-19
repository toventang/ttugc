package com.bytedance.android.livesdk.share;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import com.bytedance.android.live.share.AbstractC6107a;
import com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b;
import com.bytedance.android.livesdkapi.depend.p683e.C11666c;
import com.bytedance.android.livesdkapi.host.IHostShare;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.p4591l.C88967f;

/* renamed from: com.bytedance.android.livesdk.share.d */
public final class C10767d implements AbstractC6107a {

    /* renamed from: a */
    public C88967f<Object> f25927a;

    /* renamed from: b */
    public C88967f<String> f25928b;

    /* renamed from: c */
    private IHostShare f25929c;

    /* renamed from: d */
    private AbstractC11665b f25930d = new AbstractC11665b() {
        /* class com.bytedance.android.livesdk.share.C10767d.C107681 */

        static {
            Covode.recordClassIndex(12368);
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
        /* renamed from: a */
        public final void mo8904a(Throwable th) {
            if (C10767d.this.f25927a != null) {
                C10767d.this.f25927a.onError(th);
                C10767d.this.f25927a = null;
            }
        }

        @Override // com.bytedance.android.livesdkapi.depend.p683e.AbstractC11665b
        /* renamed from: a */
        public final void mo8903a(String str, String str2, Bundle bundle) {
            if (C10767d.this.f25927a != null) {
                C10767d.this.f25927a.onSuccess(new Object());
                C10767d.this.f25927a = null;
            }
        }
    };

    /* renamed from: e */
    private IHostShare.AbstractC11792b f25931e = new IHostShare.AbstractC11792b() {
        /* class com.bytedance.android.livesdk.share.C10767d.C107692 */

        static {
            Covode.recordClassIndex(12369);
        }

        @Override // com.bytedance.android.livesdkapi.host.IHostShare.AbstractC11792b
        /* renamed from: a */
        public final void mo17684a(String str) {
            if (C10767d.this.f25928b != null) {
                C10767d.this.f25928b.onSuccess(str);
                C10767d.this.f25928b = null;
            }
        }
    };

    static {
        Covode.recordClassIndex(12367);
    }

    public C10767d(IHostShare iHostShare) {
        this.f25929c = iHostShare;
    }

    @Override // com.bytedance.android.live.share.AbstractC6107a
    /* renamed from: a */
    public final AbstractC88403ab<Object> mo11988a(Activity activity, C11666c cVar) {
        this.f25929c.share(activity, cVar, this.f25930d);
        C88967f<Object> fVar = new C88967f<>();
        this.f25927a = fVar;
        return fVar;
    }

    @Override // com.bytedance.android.live.share.AbstractC6107a
    /* renamed from: b */
    public final Dialog mo11990b(Activity activity, C11666c cVar, AbstractC11665b bVar) {
        return this.f25929c.getShareDialog(activity, cVar, bVar);
    }

    @Override // com.bytedance.android.live.share.AbstractC6107a
    /* renamed from: c */
    public final Dialog mo11991c(Activity activity, C11666c cVar, AbstractC11665b bVar) {
        cVar.mo18435b();
        return this.f25929c.getLongPressShareDialog(activity, cVar, bVar);
    }

    @Override // com.bytedance.android.live.share.AbstractC6107a
    /* renamed from: a */
    public final void mo11989a(Activity activity, C11666c cVar, AbstractC11665b bVar) {
        cVar.mo18435b();
        Dialog b = mo11990b(activity, cVar, bVar);
        if (b != null) {
            b.show();
        }
    }
}
