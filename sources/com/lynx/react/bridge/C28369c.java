package com.lynx.react.bridge;

import androidx.core.p036g.C0693f;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.react.bridge.c */
public class C28369c implements AbstractC28367a {

    /* renamed from: a */
    private static final C0693f.C0695b<C28369c> f66622a = new C0693f.C0695b<>(10);

    /* renamed from: b */
    private ReadableMap f66623b;

    /* renamed from: c */
    private String f66624c;

    private C28369c() {
    }

    static {
        Covode.recordClassIndex(34353);
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: i */
    public final void mo48560i() {
        this.f66623b = null;
        this.f66624c = null;
        f66622a.release(this);
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: b */
    public final boolean mo48553b() {
        String str;
        ReadableMap readableMap = this.f66623b;
        if (readableMap != null && (str = this.f66624c) != null) {
            return readableMap.getBoolean(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: c */
    public final double mo48554c() {
        String str;
        ReadableMap readableMap = this.f66623b;
        if (readableMap != null && (str = this.f66624c) != null) {
            return readableMap.getDouble(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: d */
    public final int mo48555d() {
        String str;
        ReadableMap readableMap = this.f66623b;
        if (readableMap != null && (str = this.f66624c) != null) {
            return readableMap.getInt(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: e */
    public final String mo48556e() {
        String str;
        ReadableMap readableMap = this.f66623b;
        if (readableMap != null && (str = this.f66624c) != null) {
            return readableMap.getString(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: f */
    public final ReadableArray mo48557f() {
        String str;
        ReadableMap readableMap = this.f66623b;
        if (readableMap != null && (str = this.f66624c) != null) {
            return readableMap.getArray(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: g */
    public final ReadableMap mo48558g() {
        String str;
        ReadableMap readableMap = this.f66623b;
        if (readableMap != null && (str = this.f66624c) != null) {
            return readableMap.getMap(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: h */
    public final ReadableType mo48559h() {
        String str;
        ReadableMap readableMap = this.f66623b;
        if (readableMap != null && (str = this.f66624c) != null) {
            return readableMap.getType(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: a */
    public final boolean mo48552a() {
        String str;
        ReadableMap readableMap = this.f66623b;
        if (readableMap != null && (str = this.f66624c) != null) {
            return readableMap.isNull(str);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    /* renamed from: a */
    public static C28369c m56691a(ReadableMap readableMap, String str) {
        C28369c acquire = f66622a.acquire();
        if (acquire == null) {
            acquire = new C28369c();
        }
        acquire.f66623b = readableMap;
        acquire.f66624c = str;
        return acquire;
    }
}
