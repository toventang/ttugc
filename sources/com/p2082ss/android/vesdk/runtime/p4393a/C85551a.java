package com.p2082ss.android.vesdk.runtime.p4393a;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.vesdk.runtime.a.a */
public final class C85551a {

    /* renamed from: a */
    public boolean f191674a;

    /* renamed from: b */
    public SharedPreferences f191675b;

    /* renamed from: c */
    private SharedPreferences.Editor f191676c;

    static {
        Covode.recordClassIndex(99725);
    }

    private C85551a() {
    }

    /* renamed from: com.ss.android.vesdk.runtime.a.a$a */
    public enum EnumC85552a {
        INSTANCE;
        

        /* renamed from: b */
        public C85551a f191679b = new C85551a((byte) 0);

        static {
            Covode.recordClassIndex(99726);
        }

        private EnumC85552a(String str) {
        }
    }

    /* renamed from: a */
    private synchronized void m147442a() {
        MethodCollector.m26663i(5143);
        if (this.f191676c == null) {
            this.f191676c = this.f191675b.edit();
        }
        MethodCollector.m26664o(5143);
    }

    /* synthetic */ C85551a(byte b) {
        this();
    }

    /* renamed from: a */
    public final <T> T mo131519a(String str, T t) {
        return t instanceof String ? (T) this.f191675b.getString(str, t) : t instanceof Integer ? (T) Integer.valueOf(this.f191675b.getInt(str, t.intValue())) : t instanceof Boolean ? (T) Boolean.valueOf(this.f191675b.getBoolean(str, t.booleanValue())) : t instanceof Float ? (T) Float.valueOf(this.f191675b.getFloat(str, t.floatValue())) : t instanceof Long ? (T) Long.valueOf(this.f191675b.getLong(str, t.longValue())) : (T) this.f191675b.getString(str, null);
    }

    /* renamed from: a */
    public final void mo131520a(String str, Object obj, boolean z) {
        m147442a();
        if (obj instanceof String) {
            this.f191676c.putString(str, (String) obj);
        } else if (obj instanceof Integer) {
            this.f191676c.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Boolean) {
            this.f191676c.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Float) {
            this.f191676c.putFloat(str, ((Float) obj).floatValue());
        } else if (obj instanceof Long) {
            this.f191676c.putLong(str, ((Long) obj).longValue());
        } else {
            this.f191676c.putString(str, obj.toString());
        }
        if (z) {
            this.f191676c.apply();
        } else {
            this.f191676c.commit();
        }
    }
}
