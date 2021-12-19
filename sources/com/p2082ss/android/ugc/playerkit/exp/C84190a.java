package com.p2082ss.android.ugc.playerkit.exp;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;

/* renamed from: com.ss.android.ugc.playerkit.exp.a */
public final class C84190a<T> {

    /* renamed from: a */
    public final String f187870a;

    /* renamed from: b */
    public final Type f187871b;

    /* renamed from: c */
    private final T f187872c;

    /* renamed from: d */
    private final boolean f187873d;

    static {
        Covode.recordClassIndex(98093);
    }

    /* renamed from: a */
    public final T mo128997a() {
        if (PlayerSettingService.getInstance() != null) {
            T t = (T) PlayerSettingService.getInstance().get(this.f187870a, this.f187871b, this.f187872c, this.f187873d);
            if (PlayerSettingService.isDebug()) {
                new StringBuilder("key ").append(this.f187870a).append(" type ").append(this.f187871b).append(" default ").append((Object) this.f187872c).append(" sticky ").append(this.f187873d).append(" value ").append((Object) t);
            }
            return t;
        } else if (!PlayerSettingService.isDebug()) {
            return this.f187872c;
        } else {
            throw new RuntimeException("Call getValue before PlayerSettingService init");
        }
    }

    public C84190a(String str, T t) {
        this(str, (Class) t.getClass(), (Object) t);
    }

    private C84190a(String str, Class<T> cls, T t) {
        this(str, (Class) cls, (Object) t, (byte) 0);
    }

    public C84190a(String str, Type type, T t) {
        this(str, type, t, (byte) 0);
    }

    private C84190a(String str, Class<T> cls, T t, byte b) {
        this.f187870a = str;
        this.f187872c = t;
        this.f187871b = cls;
        this.f187873d = true;
    }

    private C84190a(String str, Type type, T t, byte b) {
        this.f187870a = str;
        this.f187872c = t;
        this.f187871b = type;
        this.f187873d = true;
    }
}
