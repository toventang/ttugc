package com.ttnet.org.chromium.net.impl;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87536c;
import com.ttnet.org.chromium.net.AbstractC87541e;
import com.ttnet.org.chromium.net.AbstractC87543g;
import java.util.Arrays;

public class NativeCronetProvider extends AbstractC87541e {
    static {
        Covode.recordClassIndex(103559);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87541e
    /* renamed from: b */
    public final String mo141740b() {
        return "App-Packaged-Cronet-Provider";
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87541e
    /* renamed from: c */
    public final String mo141741c() {
        return "77.0.3844.0";
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87541e
    /* renamed from: a */
    public final AbstractC87536c.C87537a mo141739a() {
        return new AbstractC87543g.C87544a(new C87634j(this.f198620a));
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{NativeCronetProvider.class, this.f198620a});
    }

    public NativeCronetProvider(Context context) {
        super(context);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof NativeCronetProvider) || !this.f198620a.equals(((NativeCronetProvider) obj).f198620a)) {
            return false;
        }
        return true;
    }
}
