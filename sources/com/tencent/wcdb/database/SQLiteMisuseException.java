package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class SQLiteMisuseException extends SQLiteException {
    static {
        Covode.recordClassIndex(103127);
    }

    public SQLiteMisuseException() {
    }

    public SQLiteMisuseException(String str) {
        super(str);
    }
}
