package com.bytedance.p1782z.p1783a.p1790c;

import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.bytedance.z.a.c.a */
public abstract class AbstractC23737a {

    /* renamed from: a */
    public AbstractC23738b f56195a;

    /* renamed from: b */
    private String f56196b;

    /* renamed from: c */
    private File f56197c;

    static {
        Covode.recordClassIndex(27842);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public AbstractC23738b mo39193a(File file) {
        return null;
    }

    /* renamed from: a */
    public AbstractC23738b mo39192a() {
        if (this.f56196b == null) {
            return null;
        }
        if (this.f56197c == null) {
            this.f56197c = new File(this.f56196b);
        }
        AbstractC23738b a = mo39193a(this.f56197c);
        this.f56195a = a;
        return a;
    }

    public String toString() {
        return "BaseStatFile{mPath='" + this.f56196b + '\'' + ", mFile=" + this.f56197c + ", mLastInfo=" + this.f56195a + '}';
    }

    public AbstractC23737a(String str) {
        this.f56196b = str;
    }
}
