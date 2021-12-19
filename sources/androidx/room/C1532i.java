package androidx.room;

import android.content.Context;
import androidx.room.AbstractC1533j;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.room.i */
public final class C1532i {
    static {
        Covode.recordClassIndex(1671);
    }

    /* renamed from: a */
    static <T, C> T m5167a(Class<C> cls, String str) {
        String str2;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        String str3 = canonicalName.replace('.', '_') + str;
        try {
            if (name.isEmpty()) {
                str2 = str3;
            } else {
                str2 = name + "." + str3;
            }
            return (T) Class.forName(str2).newInstance();
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("cannot find implementation for " + cls.getCanonicalName() + ". " + str3 + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor" + cls.getCanonicalName());
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + cls.getCanonicalName());
        }
    }

    /* renamed from: a */
    public static <T extends AbstractC1533j> AbstractC1533j.C1534a<T> m5166a(Context context, Class<T> cls, String str) {
        if (str.trim().length() != 0) {
            return new AbstractC1533j.C1534a<>(context, cls, str);
        }
        throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
    }
}
