package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteCantOpenDatabaseException extends SQLiteException {
    static {
        Covode.recordClassIndex(103101);
    }

    public SQLiteCantOpenDatabaseException() {
    }

    public SQLiteCantOpenDatabaseException(String str) {
        super(str);
    }
}
