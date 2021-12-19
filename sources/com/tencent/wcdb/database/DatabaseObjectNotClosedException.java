package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;

public class DatabaseObjectNotClosedException extends RuntimeException {
    static {
        Covode.recordClassIndex(103095);
    }

    public DatabaseObjectNotClosedException() {
        super("Application did not close the cursor or database object that was opened here");
    }
}
