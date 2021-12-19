package com.bytedance.disk.p958c.p959a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.p1746v.p1747a.C23535b;
import java.io.File;

/* renamed from: com.bytedance.disk.c.a.b */
public final class C14431b {

    /* renamed from: a */
    public int f34902a = -1;

    /* renamed from: b */
    public String f34903b;

    /* renamed from: c */
    public int f34904c;

    /* renamed from: d */
    public int f34905d;

    /* renamed from: e */
    public int f34906e = -1;

    /* renamed from: f */
    private String f34907f;

    static {
        Covode.recordClassIndex(16509);
    }

    /* renamed from: b */
    private boolean m26343b() {
        File file = new File(this.f34907f);
        int i = this.f34906e;
        if (i == 1 || i == 2) {
            try {
                if (!file.exists()) {
                    return file.mkdirs();
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        } else {
            if (i == 0) {
                try {
                    File parentFile = file.getParentFile();
                    if (!parentFile.exists()) {
                        return parentFile.mkdirs();
                    }
                    return true;
                } catch (Exception unused2) {
                }
            }
            return false;
        }
    }

    /* renamed from: a */
    public final String mo23257a() {
        if (TextUtils.isEmpty(this.f34907f)) {
            String str = null;
            int i = this.f34905d;
            if (i == 0) {
                str = C23535b.m44237c();
            } else if (i == 1) {
                str = C23535b.m44235b();
            } else if (i == 2) {
                str = C23535b.m44232a();
            }
            if (!TextUtils.isEmpty(str)) {
                if (this.f34903b.startsWith("/")) {
                    this.f34907f = str + this.f34903b;
                } else {
                    this.f34907f = str + "/" + this.f34903b;
                }
            }
        }
        m26343b();
        return this.f34907f;
    }

    public C14431b(String str, int i) {
        this.f34902a = Integer.valueOf(str.substring(0, 1)).intValue();
        this.f34906e = Integer.valueOf(str.substring(1, 2)).intValue();
        this.f34904c = Integer.valueOf(str.substring(2, 3)).intValue();
        this.f34905d = Integer.valueOf(str.substring(3, 4)).intValue();
        this.f34903b = str.substring(i);
    }
}
