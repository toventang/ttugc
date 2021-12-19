package com.tencent.wcdb;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;

/* renamed from: com.tencent.wcdb.d */
public interface AbstractC87236d extends Cursor {
    static {
        Covode.recordClassIndex(103093);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    int getColumnIndex(String str);

    int getCount();

    int getInt(int i);

    long getLong(int i);

    String getString(int i);

    boolean moveToFirst();

    boolean moveToNext();
}
