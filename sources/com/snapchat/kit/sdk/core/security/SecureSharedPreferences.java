package com.snapchat.kit.sdk.core.security;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.C28023p;

public class SecureSharedPreferences implements KeyValueStore {
    private final EncryptDecryptAlgorithm mAlgorithm;
    private final C27910f mGson;
    private final SharedPreferences mSharedPreferences;

    static {
        Covode.recordClassIndex(35386);
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public void clearEntry(String str) {
        this.mSharedPreferences.edit().remove(str).apply();
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public void put(String str, Object obj) {
        putString(str, this.mGson.mo46674b(obj));
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public <T> T get(String str, Class<T> cls) {
        String string = getString(str, null);
        if (string == null) {
            return null;
        }
        try {
            return (T) this.mGson.mo46670a(string, (Class) cls);
        } catch (C28023p unused) {
            clearEntry(str);
            return null;
        }
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public String getString(String str, String str2) {
        try {
            String string = this.mSharedPreferences.getString(str, null);
            if (string == null) {
                return str2;
            }
            String decrypt = this.mAlgorithm.decrypt(string);
            if (decrypt != null) {
                return decrypt;
            }
            clearEntry(str);
            return str2;
        } catch (ClassCastException unused) {
            return str2;
        }
    }

    @Override // com.snapchat.kit.sdk.core.security.KeyValueStore
    public void putString(String str, String str2) {
        String encrypt;
        if (str2 == null) {
            encrypt = null;
        } else {
            encrypt = this.mAlgorithm.encrypt(str2);
        }
        this.mSharedPreferences.edit().putString(str, encrypt).apply();
    }

    public SecureSharedPreferences(SharedPreferences sharedPreferences, EncryptDecryptAlgorithm encryptDecryptAlgorithm, C27910f fVar) {
        this.mSharedPreferences = sharedPreferences;
        this.mAlgorithm = encryptDecryptAlgorithm;
        this.mGson = fVar;
    }
}
