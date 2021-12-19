package com.facebook.imagepipeline.p1879d;

import android.net.Uri;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.facebook.common.p1832d.C24091i;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.p1826c.p1827a.AbstractC24026e;
import java.io.File;

/* renamed from: com.facebook.imagepipeline.d.u */
public final class C24403u implements AbstractC24026e {

    /* renamed from: a */
    private final String f57856a;

    /* renamed from: b */
    private final C24363d f57857b;

    /* renamed from: c */
    private final String f57858c;

    /* renamed from: d */
    private final int f57859d;

    static {
        Covode.recordClassIndex(28546);
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    public final int hashCode() {
        return this.f57859d;
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    /* renamed from: a */
    public final String mo39543a() {
        return toString();
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    public final String toString() {
        return C1764a.m5929a(null, "%s_%s_%s_%d", new Object[]{this.f57856a, this.f57857b, this.f57858c, Integer.valueOf(this.f57859d)});
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    /* renamed from: a */
    public final boolean mo39544a(Uri uri) {
        return this.f57856a.contains(uri.toString());
    }

    @Override // com.facebook.p1826c.p1827a.AbstractC24026e
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C24403u) {
            C24403u uVar = (C24403u) obj;
            if (this.f57859d != uVar.f57859d || !this.f57856a.equals(uVar.f57856a) || !this.f57857b.equals(uVar.f57857b) || !this.f57858c.equals(uVar.f57858c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C24403u(String str, C24363d dVar, File file) {
        String str2 = (String) C24091i.m45617a(str);
        this.f57856a = str2;
        this.f57857b = (C24363d) C24091i.m45617a(dVar);
        this.f57858c = Long.toString(((File) C24091i.m45617a(file)).lastModified()) + Long.toString(file.length());
        int hashCode = str2.hashCode();
        this.f57859d = ((((hashCode + 31) * 31) + dVar.hashCode()) * 31) + str2.hashCode();
    }
}
