package com.bytedance.bdlocation.p853f;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.bdlocation.C13182f;
import com.bytedance.bdlocation.p848c.C13162b;
import com.bytedance.bdlocation.p850e.p851a.C13170b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;

/* renamed from: com.bytedance.bdlocation.f.a */
public final class C13183a {

    /* renamed from: a */
    public SharedPreferences f32185a;

    /* renamed from: b */
    public C13184b f32186b;

    /* renamed from: c */
    private C13170b f32187c;

    static {
        Covode.recordClassIndex(15130);
    }

    /* renamed from: b */
    public final void mo21286b() {
        m23714c("location_cache");
        m23714c("LBSResult");
        C13184b bVar = this.f32186b;
        if (bVar != null) {
            bVar.f32190c = null;
            this.f32186b.f32189b = null;
            this.f32186b = null;
        }
        this.f32187c = null;
    }

    /* renamed from: a */
    public final C13184b mo21282a() {
        if (this.f32186b == null) {
            this.f32186b = m23716e(m23715d("location_cache"));
        }
        return this.f32186b;
    }

    /* renamed from: a */
    public final int mo21281a(String str) {
        return this.f32185a.getInt(str, 0);
    }

    public C13183a(Context context) {
        this.f32185a = C34822d.m71158a(context, "BDRegionLocationCache", 0);
    }

    /* renamed from: c */
    private void m23714c(String str) {
        SharedPreferences.Editor edit = this.f32185a.edit();
        edit.remove(str);
        edit.commit();
    }

    /* renamed from: d */
    private String m23715d(String str) {
        return this.f32185a.getString(str, "");
    }

    /* renamed from: b */
    public final long mo21285b(String str) {
        return this.f32185a.getLong(str, 0);
    }

    /* renamed from: a */
    public static String m23713a(C13184b bVar) {
        if (bVar != null) {
            try {
                return C13182f.f32181a.mo46674b(bVar);
            } catch (Throwable th) {
                C13162b.m23685a("BDLocation", "BDRegionLocation", th);
            }
        }
        return null;
    }

    /* renamed from: e */
    private static C13184b m23716e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (C13184b) C13182f.f32181a.mo46670a(str, C13184b.class);
        } catch (Throwable th) {
            C13162b.m23685a("BDLocation", "BDRegionLocation", th);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo21283a(String str, int i) {
        SharedPreferences.Editor edit = this.f32185a.edit();
        edit.putInt(str, i);
        edit.apply();
    }

    /* renamed from: a */
    public final void mo21284a(String str, long j) {
        SharedPreferences.Editor edit = this.f32185a.edit();
        edit.putLong(str, j);
        edit.apply();
    }
}
