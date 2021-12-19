package com.bytedance.disk.p958c;

import com.bytedance.covode.number.Covode;
import com.bytedance.disk.p958c.p959a.C14432c;
import java.io.File;

/* renamed from: com.bytedance.disk.c.a */
public final class C14429a {

    /* renamed from: a */
    public String f34900a;

    static {
        Covode.recordClassIndex(16507);
    }

    /* renamed from: a */
    public final String mo23254a() {
        if (this.f34900a != null) {
            try {
                return new File(this.f34900a).getCanonicalPath();
            } catch (Exception unused) {
            }
        }
        return this.f34900a;
    }

    public C14429a(String str) {
        String a = C14432c.m26345a(str);
        this.f34900a = a != null ? a : str;
    }

    public C14429a(String str, String str2) {
        String a = C14432c.m26345a(str);
        if (a != null) {
            this.f34900a = new File(a, str2).getPath();
        } else {
            this.f34900a = new File(str, str2).getPath();
        }
    }
}
