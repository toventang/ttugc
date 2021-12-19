package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.p1963b.C26926bq;

public abstract class AssetPackState {
    static {
        Covode.recordClassIndex(32238);
    }

    /* renamed from: a */
    static AssetPackState m53161a(Bundle bundle, String str, C26791ay ayVar, AbstractC26881z zVar) {
        int a = zVar.mo44440a(bundle.getInt(C26926bq.m53480a("status", str)));
        int i = bundle.getInt(C26926bq.m53480a("error_code", str));
        long j = bundle.getLong(C26926bq.m53480a("bytes_downloaded", str));
        long j2 = bundle.getLong(C26926bq.m53480a("total_bytes_to_download", str));
        double b = ayVar.mo44492b(str);
        long j3 = bundle.getLong(C26926bq.m53480a("pack_version", str));
        long j4 = bundle.getLong(C26926bq.m53480a("pack_base_version", str));
        return m53162a(str, a, i, j, j2, b, (a != 4 || j4 == 0 || j4 == j3) ? 1 : 2);
    }

    /* renamed from: a */
    public static AssetPackState m53162a(String str, int i, int i2, long j, long j2, double d, int i3) {
        return new C26774ah(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3);
    }

    /* renamed from: a */
    public abstract String mo44429a();

    /* renamed from: b */
    public abstract int mo44430b();

    /* renamed from: c */
    public abstract int mo44431c();

    /* renamed from: d */
    public abstract long mo44432d();

    /* renamed from: e */
    public abstract long mo44433e();

    /* renamed from: f */
    public abstract int mo44434f();

    /* renamed from: g */
    public abstract int mo44435g();
}
