package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteDoneException extends SQLiteException {
    static {
        Covode.recordClassIndex(103123);
    }

    public SQLiteDoneException() {
    }

    public SQLiteDoneException(String str) {
        super(str);
    }
}
