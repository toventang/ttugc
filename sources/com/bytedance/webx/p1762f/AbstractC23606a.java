package com.bytedance.webx.p1762f;

import com.bytedance.covode.number.Covode;
import com.bytedance.webx.AbstractC23547a;
import com.bytedance.webx.p1755d.AbstractC23566b;
import com.bytedance.webx.p1755d.AbstractC23567c;

/* renamed from: com.bytedance.webx.f.a */
public abstract class AbstractC23606a<T extends AbstractC23567c> {

    /* renamed from: a */
    private T f55866a;

    /* renamed from: b */
    private AbstractC23566b f55867b;

    static {
        Covode.recordClassIndex(27705);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC23547a mo34966a();

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final AbstractC23566b mo39034y() {
        if (this.f55867b == null) {
            this.f55867b = mo34966a().f55778e;
        }
        return this.f55867b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final T mo39033x() {
        if (this.f55866a == null) {
            this.f55866a = (T) ((AbstractC23567c) mo34966a().mo38631b());
        }
        return this.f55866a;
    }
}
