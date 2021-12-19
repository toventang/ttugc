package com.p2082ss.android.ugc.aweme.p2482cn;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import com.p2082ss.android.ugc.aweme.utils.C80361dw;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.cn.a */
public abstract class AbstractC36144a {

    /* renamed from: a */
    protected String f85379a;

    static {
        Covode.recordClassIndex(43397);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo63261a();

    public AbstractC36144a() {
        mo63261a();
    }

    /* renamed from: b */
    private void m73625b() {
        if (TextUtils.isEmpty(this.f85379a)) {
            throw new IllegalStateException("filename can not bo null");
        }
    }

    /* renamed from: a */
    private SharedPreferences m73624a(Context context) {
        if (context == null) {
            return null;
        }
        m73625b();
        return C34822d.m71158a(context, this.f85379a, 0);
    }

    /* renamed from: b */
    public final int mo63267b(Context context, String str) {
        SharedPreferences a = m73624a(context);
        if (a == null) {
            return 0;
        }
        return a.getInt(str, 0);
    }

    /* renamed from: c */
    public final boolean mo63271c(Context context, String str) {
        SharedPreferences a = m73624a(context);
        if (a == null) {
            return false;
        }
        return a.getBoolean(str, false);
    }

    /* renamed from: d */
    public final long mo63272d(Context context, String str) {
        SharedPreferences a = m73624a(context);
        if (a == null) {
            return 0;
        }
        return a.getLong(str, 0);
    }

    /* renamed from: e */
    public final long mo63273e(Context context, String str) {
        SharedPreferences a = m73624a(context);
        if (a == null) {
            return 0;
        }
        return a.getLong(str, 0);
    }

    /* renamed from: a */
    public final String mo63260a(Context context, String str) {
        SharedPreferences a = m73624a(context);
        if (a == null) {
            return null;
        }
        return a.getString(str, "");
    }

    /* renamed from: a */
    public final <T> T mo63259a(Context context, String str, Class<T> cls) {
        SharedPreferences a = m73624a(context);
        if (a == null) {
            return null;
        }
        String string = a.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (T) C80361dw.m139333a(string, cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (Error e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final String mo63268b(Context context, String str, String str2) {
        SharedPreferences a = m73624a(context);
        if (a == null) {
            return null;
        }
        return a.getString(str, str2);
    }

    /* renamed from: a */
    public final void mo63262a(Context context, String str, int i) {
        SharedPreferences.Editor edit = C34822d.m71158a(context, this.f85379a, 0).edit();
        edit.putInt(str, i);
        edit.apply();
    }

    /* renamed from: b */
    public final <T> List<T> mo63269b(Context context, String str, Class<T> cls) {
        SharedPreferences a = m73624a(context);
        if (a == null) {
            return null;
        }
        String string = a.getString(str, "");
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return C80361dw.m139335b(string, cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } catch (Error e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo63263a(Context context, String str, long j) {
        SharedPreferences a = m73624a(context);
        if (a != null) {
            SharedPreferences.Editor edit = a.edit();
            edit.putLong(str, j);
            edit.apply();
        }
    }

    /* renamed from: b */
    public final boolean mo63270b(Context context, String str, boolean z) {
        SharedPreferences a = m73624a(context);
        if (a == null) {
            return false;
        }
        return a.getBoolean(str, z);
    }

    /* renamed from: a */
    public final void mo63264a(Context context, String str, Object obj) {
        try {
            SharedPreferences a = m73624a(context);
            if (a != null && obj != null) {
                SharedPreferences.Editor edit = a.edit();
                edit.putString(str, C80361dw.m139334a(obj));
                edit.apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo63265a(Context context, String str, String str2) {
        SharedPreferences a = m73624a(context);
        if (a != null) {
            SharedPreferences.Editor edit = a.edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }

    /* renamed from: a */
    public final void mo63266a(Context context, String str, boolean z) {
        SharedPreferences a = m73624a(context);
        if (a != null) {
            SharedPreferences.Editor edit = a.edit();
            edit.putBoolean(str, z);
            edit.apply();
        }
    }
}
