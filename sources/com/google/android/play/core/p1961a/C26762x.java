package com.google.android.play.core.p1961a;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1961a.AbstractC26741d;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.a.x */
public final class C26762x extends AbstractC26741d.AbstractC26742a {

    /* renamed from: a */
    Integer f63407a;

    /* renamed from: b */
    private Boolean f63408b;

    static {
        Covode.recordClassIndex(32234);
    }

    C26762x() {
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26741d.AbstractC26742a
    /* renamed from: a */
    public final AbstractC26741d.AbstractC26742a mo44408a() {
        this.f63408b = false;
        return this;
    }

    @Override // com.google.android.play.core.p1961a.AbstractC26741d.AbstractC26742a
    /* renamed from: b */
    public final AbstractC26741d mo44409b() {
        String str = "";
        if (this.f63407a == null) {
            str = str.concat(" appUpdateType");
        }
        if (this.f63408b == null) {
            str = String.valueOf(str).concat(" allowAssetPackDeletion");
        }
        if (str.isEmpty()) {
            return new C26763y(this.f63407a.intValue(), this.f63408b.booleanValue());
        }
        String valueOf = String.valueOf(str);
        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
    }
}
