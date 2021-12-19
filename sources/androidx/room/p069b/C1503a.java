package androidx.room.p069b;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.room.b.a */
public final class C1503a {
    static {
        Covode.recordClassIndex(1642);
    }

    /* renamed from: a */
    public static int m5129a(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }
}
