package com.bytedance.lobby.facebook;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.lobby.C20879a;
import com.bytedance.lobby.C20892d;
import com.bytedance.lobby.internal.BaseProvider;
import com.facebook.C24798j;
import com.facebook.C24872m;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;

class FacebookProvider<T> extends BaseProvider<T> {

    /* renamed from: b */
    private Application f49413b;

    static {
        Covode.recordClassIndex(24492);
    }

    @Override // com.bytedance.lobby.internal.BaseProvider
    /* renamed from: d */
    public final void mo34346d() {
        if (!C24872m.m47685a()) {
            C24872m.f59041a = this.f49454c.f49403c;
            try {
                Context applicationContext = this.f49413b.getApplicationContext();
                if (C58003a.f132201c) {
                    if (applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                }
                C24872m.m47684a(applicationContext);
            } catch (C24798j e) {
                if (C20879a.f49364a) {
                    throw e;
                }
            }
        }
    }

    FacebookProvider(Application application, C20892d dVar) {
        super(application, dVar);
        this.f49413b = application;
    }
}
