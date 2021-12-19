package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteTableLockedException extends SQLiteException {
    static {
        Covode.recordClassIndex(103130);
    }

    public SQLiteTableLockedException() {
    }

    public SQLiteTableLockedException(String str) {
        super(str);
    }
}
