package com.p2082ss.android.ugc.aweme.app;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.app.aj */
public class C33594aj<T> {

    /* renamed from: a */
    protected T f79763a;

    /* renamed from: b */
    public String f79764b;

    /* renamed from: c */
    protected Type f79765c;

    static {
        Covode.recordClassIndex(40484);
    }

    /* renamed from: a */
    public final void mo59935a() {
        mo59937a(this.f79763a);
    }

    /* renamed from: b */
    public final T mo59938b() {
        SharedPreferences sharePref = SharePrefCache.inst().getSharePref();
        try {
            if (this.f79763a != null) {
                return mo59941c();
            }
            Type type = this.f79765c;
            if (type == null || !(type instanceof Class)) {
                return null;
            }
            Class cls = (Class) type;
            if (!sharePref.contains(this.f79764b)) {
                return null;
            }
            if (cls == String.class) {
                return (T) sharePref.getString(this.f79764b, "");
            }
            if (cls == Integer.class) {
                return (T) Integer.valueOf(sharePref.getInt(this.f79764b, -1000));
            }
            if (cls == Float.class) {
                return (T) Float.valueOf(sharePref.getFloat(this.f79764b, -1000.0f));
            }
            if (cls == Long.class) {
                return (T) Long.valueOf(sharePref.getLong(this.f79764b, -1000));
            }
            if (cls == Boolean.class) {
                return (T) Boolean.valueOf(sharePref.getBoolean(this.f79764b, false));
            }
            if (Set.class.isAssignableFrom(cls)) {
                return (T) sharePref.getStringSet(this.f79764b, new HashSet());
            }
            throw new AssertionError();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: c */
    public T mo59941c() {
        T t;
        SharedPreferences sharePref = SharePrefCache.inst().getSharePref();
        try {
            Class<?> cls = this.f79763a.getClass();
            if (cls == String.class) {
                t = (T) sharePref.getString(this.f79764b, this.f79763a);
            } else if (cls == Integer.class) {
                t = (T) Integer.valueOf(sharePref.getInt(this.f79764b, this.f79763a.intValue()));
            } else if (cls == Float.class) {
                t = (T) Float.valueOf(sharePref.getFloat(this.f79764b, this.f79763a.floatValue()));
            } else if (cls == Long.class) {
                t = (T) Long.valueOf(sharePref.getLong(this.f79764b, this.f79763a.longValue()));
            } else if (cls == Boolean.class) {
                t = (T) Boolean.valueOf(sharePref.getBoolean(this.f79764b, this.f79763a.booleanValue()));
            } else if (Set.class.isAssignableFrom(cls)) {
                t = (T) sharePref.getStringSet(this.f79764b, this.f79763a);
            } else {
                throw new AssertionError();
            }
            if (t == null) {
                mo59937a(this.f79763a);
                t = this.f79763a;
            }
            return t.getClass() != this.f79763a.getClass() ? this.f79763a : t;
        } catch (Exception e) {
            e.printStackTrace();
            return this.f79763a;
        }
    }

    /* renamed from: b */
    public final void mo59940b(T t) {
        m68796c(t);
    }

    /* renamed from: c */
    private void m68796c(T t) {
        if (t != null) {
            mo59937a(t);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo59937a(T t) {
        if (t != null) {
            SharedPreferences.Editor edit = SharePrefCache.inst().getSharePref().edit();
            if (t instanceof String) {
                edit.putString(this.f79764b, t);
            } else if (t instanceof Integer) {
                edit.putInt(this.f79764b, t.intValue());
            } else if (t instanceof Float) {
                edit.putFloat(this.f79764b, t.floatValue());
            } else if (t instanceof Long) {
                edit.putLong(this.f79764b, t.longValue());
            } else if (t instanceof Boolean) {
                edit.putBoolean(this.f79764b, t.booleanValue());
            } else if (t instanceof Set) {
                edit.putStringSet(this.f79764b, t);
            }
            edit.apply();
        }
    }

    public C33594aj(String str, T t) {
        Objects.requireNonNull(t);
        this.f79763a = t;
        this.f79764b = str;
    }

    /* renamed from: b */
    public final void mo59939b(SharedPreferences.Editor editor, T t) {
        if (editor != null) {
            mo59936a(editor, t);
            return;
        }
        throw new IllegalArgumentException("editor can not be null!");
    }

    public C33594aj(String str, Type type) {
        Objects.requireNonNull(type);
        this.f79763a = null;
        this.f79764b = str;
        this.f79765c = type;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo59936a(SharedPreferences.Editor editor, T t) {
        if (t instanceof String) {
            editor.putString(this.f79764b, t);
        } else if (t instanceof Integer) {
            editor.putInt(this.f79764b, t.intValue());
        } else if (t instanceof Float) {
            editor.putFloat(this.f79764b, t.floatValue());
        } else if (t instanceof Long) {
            editor.putLong(this.f79764b, t.longValue());
        } else if (t instanceof Boolean) {
            editor.putBoolean(this.f79764b, t.booleanValue());
        } else if (t instanceof Set) {
            editor.putStringSet(this.f79764b, t);
        }
    }
}
