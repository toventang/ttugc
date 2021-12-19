package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteFullException extends SQLiteException {
    static {
        Covode.recordClassIndex(103125);
    }

    public SQLiteFullException() {
    }

    public SQLiteFullException(String str) {
        super(str);
    }
}
