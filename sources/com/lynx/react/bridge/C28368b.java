package com.lynx.react.bridge;

import androidx.core.p036g.C0693f;
import com.bytedance.covode.number.Covode;

/* renamed from: com.lynx.react.bridge.b */
public class C28368b implements AbstractC28367a {

    /* renamed from: a */
    private static final C0693f.C0695b<C28368b> f66619a = new C0693f.C0695b<>(10);

    /* renamed from: b */
    private ReadableArray f66620b;

    /* renamed from: c */
    private int f66621c = -1;

    private C28368b() {
    }

    static {
        Covode.recordClassIndex(34352);
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: i */
    public final void mo48560i() {
        this.f66620b = null;
        this.f66621c = -1;
        f66619a.release(this);
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: b */
    public final boolean mo48553b() {
        ReadableArray readableArray = this.f66620b;
        if (readableArray != null) {
            return readableArray.getBoolean(this.f66621c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: c */
    public final double mo48554c() {
        ReadableArray readableArray = this.f66620b;
        if (readableArray != null) {
            return readableArray.getDouble(this.f66621c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: d */
    public final int mo48555d() {
        ReadableArray readableArray = this.f66620b;
        if (readableArray != null) {
            return readableArray.getInt(this.f66621c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: e */
    public final String mo48556e() {
        ReadableArray readableArray = this.f66620b;
        if (readableArray != null) {
            return readableArray.getString(this.f66621c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: f */
    public final ReadableArray mo48557f() {
        ReadableArray readableArray = this.f66620b;
        if (readableArray != null) {
            return readableArray.getArray(this.f66621c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: g */
    public final ReadableMap mo48558g() {
        ReadableArray readableArray = this.f66620b;
        if (readableArray != null) {
            return readableArray.getMap(this.f66621c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: h */
    public final ReadableType mo48559h() {
        ReadableArray readableArray = this.f66620b;
        if (readableArray != null) {
            return readableArray.getType(this.f66621c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    @Override // com.lynx.react.bridge.AbstractC28367a
    /* renamed from: a */
    public final boolean mo48552a() {
        ReadableArray readableArray = this.f66620b;
        if (readableArray != null) {
            return readableArray.isNull(this.f66621c);
        }
        throw new IllegalStateException("This dynamic value has been recycled");
    }

    /* renamed from: a */
    public static C28368b m56681a(ReadableArray readableArray, int i) {
        C28368b acquire = f66619a.acquire();
        if (acquire == null) {
            acquire = new C28368b();
        }
        acquire.f66620b = readableArray;
        acquire.f66621c = i;
        return acquire;
    }
}
