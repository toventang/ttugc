package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.IOException;

/* renamed from: com.toutiao.proxyserver.r */
public class C87369r extends AbstractC87294b {

    /* renamed from: k */
    final File f198037k;

    static {
        Covode.recordClassIndex(103266);
    }

    @Override // com.toutiao.proxyserver.AbstractC87294b
    /* renamed from: a */
    public File mo98175a(String str) {
        return mo141410f(str);
    }

    @Override // com.toutiao.proxyserver.AbstractC87294b
    /* renamed from: e */
    public final File mo141331e(String str) {
        return mo141410f(str);
    }

    /* renamed from: f */
    public final File mo141410f(String str) {
        return new File(this.f198037k, str);
    }

    public C87369r(File file) {
        String str;
        if (file == null) {
            str = "dir null";
        } else if (!file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
        } else {
            this.f198037k = file;
            return;
        }
        throw new IOException("dir error! ".concat(String.valueOf(str)));
    }
}
