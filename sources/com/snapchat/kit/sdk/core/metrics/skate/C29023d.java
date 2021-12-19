package com.snapchat.kit.sdk.core.metrics.skate;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.p2067a.C28956d;
import com.snapchat.kit.sdk.core.p2067a.C28957e;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: com.snapchat.kit.sdk.core.metrics.skate.d */
public final class C29023d {

    /* renamed from: a */
    public final SharedPreferences f68569a;

    /* renamed from: b */
    private final Random f68570b;

    static {
        Covode.recordClassIndex(35350);
    }

    /* renamed from: c */
    private float m58015c() {
        float nextFloat = this.f68570b.nextFloat();
        this.f68569a.edit().putFloat("com.snapchat.kit.sdk.core.metrics.skate.deviceSampleValue", nextFloat).apply();
        return nextFloat;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final double mo50687b() {
        float c;
        if (!this.f68569a.contains("com.snapchat.kit.sdk.core.metrics.skate.deviceSampleValue")) {
            c = m58015c();
        } else {
            try {
                return (double) this.f68569a.getFloat("com.snapchat.kit.sdk.core.metrics.skate.deviceSampleValue", 0.99999f);
            } catch (ClassCastException unused) {
                c = m58015c();
            }
        }
        return (double) c;
    }

    /* renamed from: a */
    public final C28956d mo50686a() {
        try {
            long j = this.f68569a.getLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateDay", -1);
            long j2 = this.f68569a.getLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateMonth", -1);
            long j3 = this.f68569a.getLong("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateYear", -1);
            int i = this.f68569a.getInt("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.skateCount", -1);
            if (j < 1 || j > 31 || j2 < 1 || j2 > 12 || j3 < 2020 || i <= 0) {
                return null;
            }
            return new C28956d(new C28957e(j, j2, j3), i);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* renamed from: d */
    private void m58016d() {
        HashMap hashMap = new HashMap();
        hashMap.put("com.snapchat.kit.sdk.SnapLogin", "LOGIN");
        hashMap.put("com.snapchat.kit.sdk.Bitmoji", "BITMOJI");
        hashMap.put("com.snapchat.kit.sdk.SnapCreative", "CREATIVE");
        hashMap.put("com.snapchat.kit.sdk.SnapStoryKit", "STORY");
        ArrayList arrayList = new ArrayList();
        HashMap hashMap2 = new HashMap();
        for (String str : hashMap.keySet()) {
            try {
                Class<?> cls = Class.forName(str);
                Object obj = hashMap.get(str);
                arrayList.add(obj);
                try {
                    hashMap2.put(obj, cls.getMethod("getVersion", new Class[0]).invoke(null, new Object[0]));
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    hashMap2.put(obj, "0.0.0");
                }
            } catch (ClassNotFoundException unused2) {
            }
        }
        this.f68569a.edit().putString("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.kitVersions", new JSONObject(hashMap2).toString()).apply();
        this.f68569a.edit().putString("com.snapchat.kit.sdk.core.metrics.skate.SkateStore.kitVariants", TextUtils.join(",", arrayList)).apply();
    }

    C29023d(SharedPreferences sharedPreferences, Random random) {
        this.f68569a = sharedPreferences;
        this.f68570b = random;
        m58016d();
    }
}
