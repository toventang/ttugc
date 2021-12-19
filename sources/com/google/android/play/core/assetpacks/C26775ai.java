package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.ai */
public final class C26775ai extends AbstractC26847d {

    /* renamed from: a */
    private final long f63448a;

    /* renamed from: b */
    private final Map<String, AssetPackState> f63449b;

    static {
        Covode.recordClassIndex(32250);
    }

    C26775ai(long j, Map<String, AssetPackState> map) {
        this.f63448a = j;
        this.f63449b = map;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26847d
    /* renamed from: a */
    public final long mo44474a() {
        return this.f63448a;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26847d
    /* renamed from: b */
    public final Map<String, AssetPackState> mo44475b() {
        return this.f63449b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC26847d) {
            AbstractC26847d dVar = (AbstractC26847d) obj;
            return this.f63448a == dVar.mo44474a() && this.f63449b.equals(dVar.mo44475b());
        }
    }

    public final int hashCode() {
        long j = this.f63448a;
        return this.f63449b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f63448a;
        String valueOf = String.valueOf(this.f63449b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
