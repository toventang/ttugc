package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87543g;

/* renamed from: com.ttnet.org.chromium.net.impl.i */
public class C87633i extends CronetEngineBuilderImpl {
    static {
        Covode.recordClassIndex(103615);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: c */
    public final AbstractC87543g mo141818c() {
        if (this.f198665e == null) {
            this.f198665e = mo141840e();
        }
        CronetUrlRequestContext cronetUrlRequestContext = new CronetUrlRequestContext(this);
        this.f198674n = 0;
        return cronetUrlRequestContext;
    }

    public C87633i(Context context) {
        super(context);
    }
}
