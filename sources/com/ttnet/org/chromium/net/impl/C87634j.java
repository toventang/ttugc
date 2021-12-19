package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87536c;
import com.ttnet.org.chromium.net.AbstractC87547i;
import com.ttnet.org.chromium.net.impl.VersionSafeCallbacks;

/* renamed from: com.ttnet.org.chromium.net.impl.j */
public final class C87634j extends C87633i {

    /* renamed from: F */
    private VersionSafeCallbacks.C87584a f199023F;

    static {
        Covode.recordClassIndex(103616);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl
    /* renamed from: f */
    public final VersionSafeCallbacks.C87584a mo141841f() {
        return this.f199023F;
    }

    public C87634j(Context context) {
        super(context);
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl, com.ttnet.org.chromium.net.AbstractC87547i
    /* renamed from: a */
    public final /* synthetic */ AbstractC87547i mo141807a(AbstractC87536c.C87537a.AbstractC87539a aVar) {
        return mo141807a(aVar);
    }

    @Override // com.ttnet.org.chromium.net.impl.CronetEngineBuilderImpl
    /* renamed from: b */
    public final CronetEngineBuilderImpl mo141839b(AbstractC87536c.C87537a.AbstractC87539a aVar) {
        this.f199023F = new VersionSafeCallbacks.C87584a(aVar);
        return this;
    }
}
