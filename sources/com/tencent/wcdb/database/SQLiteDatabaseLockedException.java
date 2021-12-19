package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteDatabaseLockedException extends SQLiteException {
    static {
        Covode.recordClassIndex(103115);
    }

    public SQLiteDatabaseLockedException() {
    }

    public SQLiteDatabaseLockedException(String str) {
        super(str);
    }
}
