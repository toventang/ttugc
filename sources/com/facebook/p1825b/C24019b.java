package com.facebook.p1825b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1832d.C24091i;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/* renamed from: com.facebook.b.b */
public final class C24019b implements AbstractC24018a {

    /* renamed from: a */
    public final File f56886a;

    static {
        Covode.recordClassIndex(28145);
    }

    @Override // com.facebook.p1825b.AbstractC24018a
    /* renamed from: b */
    public final long mo39539b() {
        return this.f56886a.length();
    }

    public final int hashCode() {
        return this.f56886a.hashCode();
    }

    @Override // com.facebook.p1825b.AbstractC24018a
    /* renamed from: a */
    public final InputStream mo39538a() {
        MethodCollector.m26663i(3479);
        FileInputStream fileInputStream = new FileInputStream(this.f56886a);
        MethodCollector.m26664o(3479);
        return fileInputStream;
    }

    private C24019b(File file) {
        this.f56886a = (File) C24091i.m45617a(file);
    }

    /* renamed from: a */
    public static C24019b m45450a(File file) {
        if (file != null) {
            return new C24019b(file);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C24019b)) {
            return false;
        }
        return this.f56886a.equals(((C24019b) obj).f56886a);
    }
}
