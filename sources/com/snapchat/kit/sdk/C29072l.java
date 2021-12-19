package com.snapchat.kit.sdk;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.C28023p;
import com.snapchat.kit.sdk.core.security.KeyValueStore;

/* renamed from: com.snapchat.kit.sdk.l */
public final class C29072l implements KeyValueStore {

    /* renamed from: a */
    private final SharedPreferences f68706a;

    /* renamed from: b */
    private final C27910f f68707b;

    static {
        Covode.recordClassIndex(35421);
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public final void clearEntry(String str) {
        this.f68706a.edit().remove(str).apply();
    }

    public C29072l(SharedPreferences sharedPreferences, C27910f fVar) {
        this.f68706a = sharedPreferences;
        this.f68707b = fVar;
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public final String getString(String str, String str2) {
        return this.f68706a.getString(str, str2);
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public final void put(String str, Object obj) {
        putString(str, this.f68707b.mo46674b(obj));
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public final void putString(String str, String str2) {
        this.f68706a.edit().putString(str, str2).apply();
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public final <T> T get(String str, Class<T> cls) {
        String string = getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return (T) this.f68707b.mo46670a(string, (Class) cls);
        } catch (C28023p unused) {
            clearEntry(str);
            return null;
        }
    }
}
