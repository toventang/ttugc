package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.ag */
public final class C26773ag extends AbstractC26793b {

    /* renamed from: a */
    private final int f63438a;

    /* renamed from: b */
    private final String f63439b;

    /* renamed from: c */
    private final String f63440c;

    static {
        Covode.recordClassIndex(32248);
    }

    C26773ag(int i, String str, String str2) {
        this.f63438a = i;
        this.f63439b = str;
        this.f63440c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26793b
    /* renamed from: a */
    public final int mo44465a() {
        return this.f63438a;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26793b
    /* renamed from: b */
    public final String mo44466b() {
        return this.f63439b;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC26793b
    /* renamed from: c */
    public final String mo44467c() {
        return this.f63440c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC26793b) {
            AbstractC26793b bVar = (AbstractC26793b) obj;
            if (this.f63438a == bVar.mo44465a() && ((str = this.f63439b) != null ? str.equals(bVar.mo44466b()) : bVar.mo44466b() == null)) {
                String str2 = this.f63440c;
                String c = bVar.mo44467c();
                if (str2 != null ? str2.equals(c) : c == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f63438a ^ 1000003) * 1000003;
        String str = this.f63439b;
        int i2 = 0;
        int hashCode = (i ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f63440c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        int i = this.f63438a;
        String str = this.f63439b;
        String str2 = this.f63440c;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
