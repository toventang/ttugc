package com.bytedance.push.settings.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.AbstractC21887a;
import com.p2082ss.android.ugc.aweme.p2387bf.C34822d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.push.settings.storage.g */
class C21909g implements AbstractC21912i {

    /* renamed from: a */
    private SharedPreferences f51892a;

    /* renamed from: b */
    private Map<AbstractC21887a, SharedPreferences.OnSharedPreferenceChangeListener> f51893b = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(25573);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public SharedPreferences.Editor mo35633a() {
        return this.f51892a.edit();
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: b */
    public final int mo35652b(String str) {
        return mo35645a(str, 0);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: c */
    public final long mo35653c(String str) {
        return mo35646a(str, 0L);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: d */
    public final float mo35654d(String str) {
        return mo35644a(str, 0.0f);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: e */
    public final boolean mo35655e(String str) {
        return mo35651a(str, false);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: f */
    public final boolean mo35656f(String str) {
        return this.f51892a.contains(str);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final String mo35647a(String str) {
        return mo35648a(str, (String) null);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final void mo35650a(AbstractC21887a aVar) {
        SharedPreferences.OnSharedPreferenceChangeListener remove;
        if (aVar != null && (remove = this.f51893b.remove(aVar)) != null) {
            this.f51892a.unregisterOnSharedPreferenceChangeListener(remove);
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final float mo35644a(String str, float f) {
        try {
            return this.f51892a.getFloat(str, f);
        } catch (Exception unused) {
            return f;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final int mo35645a(String str, int i) {
        try {
            return this.f51892a.getInt(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    C21909g(Context context, String str) {
        this.f51892a = C34822d.m71158a(context, str, 0);
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final long mo35646a(String str, long j) {
        try {
            return this.f51892a.getLong(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final String mo35648a(String str, String str2) {
        try {
            return this.f51892a.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final boolean mo35651a(String str, boolean z) {
        try {
            return this.f51892a.getBoolean(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    @Override // com.bytedance.push.settings.storage.AbstractC21912i
    /* renamed from: a */
    public final void mo35649a(Context context, final String str, String str2, final AbstractC21887a aVar) {
        if (aVar != null) {
            SharedPreferences$OnSharedPreferenceChangeListenerC219101 r1 = new SharedPreferences.OnSharedPreferenceChangeListener() {
                /* class com.bytedance.push.settings.storage.C21909g.SharedPreferences$OnSharedPreferenceChangeListenerC219101 */

                static {
                    Covode.recordClassIndex(25574);
                }

                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    TextUtils.equals(str, str);
                }
            };
            this.f51893b.put(aVar, r1);
            this.f51892a.registerOnSharedPreferenceChangeListener(r1);
        }
    }
}
