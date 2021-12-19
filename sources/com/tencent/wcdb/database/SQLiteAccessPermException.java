package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteAccessPermException extends SQLiteException {
    static {
        Covode.recordClassIndex(103097);
    }

    public SQLiteAccessPermException() {
    }

    public SQLiteAccessPermException(String str) {
        super(str);
    }
}
