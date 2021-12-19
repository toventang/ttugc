package com.p2082ss.android.ugc.aweme.port.internal;

import android.database.sqlite.SQLiteDatabase;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.DraftLoadResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftSaveResult;

/* renamed from: com.ss.android.ugc.aweme.port.internal.e */
public interface AbstractC63277e {
    static {
        Covode.recordClassIndex(74554);
    }

    /* renamed from: a */
    void mo101856a(int i, String str, C43223c cVar);

    /* renamed from: a */
    void mo101857a(SQLiteDatabase sQLiteDatabase);

    /* renamed from: a */
    void mo101858a(SQLiteDatabase sQLiteDatabase, int i, int i2);

    /* renamed from: a */
    void mo101859a(DraftLoadResult draftLoadResult);

    /* renamed from: a */
    void mo101860a(DraftSaveResult draftSaveResult);

    /* renamed from: a */
    void mo101861a(String str, int i, C43223c cVar);

    /* renamed from: a */
    void mo101862a(boolean z, Exception exc);

    /* renamed from: b */
    void mo101863b(SQLiteDatabase sQLiteDatabase);

    /* renamed from: b */
    void mo101864b(SQLiteDatabase sQLiteDatabase, int i, int i2);
}
