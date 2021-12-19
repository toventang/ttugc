package com.linecorp.linesdk.auth.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.util.StringTokenizer;

/* renamed from: com.linecorp.linesdk.auth.internal.b */
final class C28171b {

    /* renamed from: a */
    final int f65935a;

    /* renamed from: b */
    final int f65936b;

    /* renamed from: c */
    final int f65937c;

    static {
        Covode.recordClassIndex(34117);
    }

    public final int hashCode() {
        return (((this.f65935a * 31) + this.f65936b) * 31) + this.f65937c;
    }

    /* renamed from: a */
    public static C28171b m56275a(Context context) {
        String str = context.getPackageManager().getPackageInfo("jp.naver.line.android", 128).versionName;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        try {
            return new C28171b(Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()), Integer.parseInt(stringTokenizer.nextToken()));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C28171b bVar = (C28171b) obj;
        if (this.f65935a == bVar.f65935a && this.f65936b == bVar.f65936b && this.f65937c == bVar.f65937c) {
            return true;
        }
        return false;
    }

    public C28171b(int i, int i2, int i3) {
        this.f65935a = i;
        this.f65936b = i2;
        this.f65937c = i3;
    }
}
