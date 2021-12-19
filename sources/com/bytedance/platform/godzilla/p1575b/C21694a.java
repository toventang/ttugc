package com.bytedance.platform.godzilla.p1575b;

import android.app.Application;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21706a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21712d;
import com.bytedance.platform.godzilla.p1585c.AbstractC21717a;

/* renamed from: com.bytedance.platform.godzilla.b.a */
public final class C21694a extends AbstractC21717a {

    /* renamed from: b */
    private Application f51468b;

    static {
        Covode.recordClassIndex(25335);
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: b */
    public final String mo35351b() {
        return "DeadSystemExceptionPlugin";
    }

    @Override // com.bytedance.platform.godzilla.p1585c.AbstractC21717a
    /* renamed from: a */
    public final void mo35350a() {
        super.mo35350a();
        new C21708b().mo35361a();
        if (Build.VERSION.SDK_INT == 29) {
            new C21712d().mo35362a(this.f51468b);
            new C21706a().mo35360a();
        }
    }

    public C21694a(Application application) {
        this.f51468b = application;
        if (application == null) {
            throw new IllegalArgumentException("Argument application can not be null!");
        }
    }
}
