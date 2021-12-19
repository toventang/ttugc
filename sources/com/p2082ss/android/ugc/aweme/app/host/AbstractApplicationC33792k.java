package com.p2082ss.android.ugc.aweme.app.host;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.common.util.C29843f;
import com.p2082ss.android.ugc.aweme.app.host.C33775j;
import dagger.hilt.android.internal.managers.AbstractC88112d;
import dagger.hilt.android.internal.managers.C88109b;
import dagger.hilt.android.internal.p4540c.C88103c;
import dagger.hilt.p4536a.AbstractC88084b;
import dagger.p4535a.C88081f;

/* renamed from: com.ss.android.ugc.aweme.app.host.k */
abstract class AbstractApplicationC33792k extends Application implements AbstractC88084b<Object> {

    /* renamed from: a */
    public final C88109b f80035a = new C88109b(new AbstractC88112d() {
        /* class com.p2082ss.android.ugc.aweme.app.host.AbstractApplicationC33792k.C337931 */

        static {
            Covode.recordClassIndex(40690);
        }

        @Override // dagger.hilt.android.internal.managers.AbstractC88112d
        /* renamed from: a */
        public final Object mo60036a() {
            C33775j.C33791c cVar = new C33775j.C33791c((byte) 0);
            cVar.f80034a = (C88103c) C88081f.m153152a(new C88103c(AbstractApplicationC33792k.this));
            if (cVar.f80034a != null) {
                return new C33775j(cVar.f80034a, (byte) 0);
            }
            throw new IllegalStateException(C88103c.class.getCanonicalName() + " must be set");
        }
    });

    static {
        Covode.recordClassIndex(40689);
    }

    @Override // dagger.hilt.p4536a.AbstractC88084b
    public final Object generatedComponent() {
        return this.f80035a.generatedComponent();
    }

    AbstractApplicationC33792k() {
    }

    public void onCreate() {
        if (C29843f.m60129a(this)) {
            generatedComponent();
        }
        super.onCreate();
    }
}
