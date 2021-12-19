package com.p2082ss.android.ugc.aweme.shortvideo.p3839l;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.l.n */
public final class C71947n {

    /* renamed from: a */
    public String f161223a;

    /* renamed from: b */
    public boolean f161224b;

    /* renamed from: c */
    public String f161225c;

    /* renamed from: d */
    public long f161226d;

    static {
        Covode.recordClassIndex(84496);
    }

    public final String toString() {
        return this.f161223a + ": " + this.f161225c + "  exists?" + this.f161224b + " size: " + this.f161226d;
    }

    public C71947n(String str, String str2) {
        this.f161223a = str;
        this.f161225c = str2;
        if (!TextUtils.isEmpty(str2)) {
            File file = new File(str2);
            if (file.exists() && file.isFile()) {
                this.f161224b = true;
                this.f161226d = file.length();
                return;
            }
        }
        this.f161224b = false;
        this.f161226d = 0;
    }
}
