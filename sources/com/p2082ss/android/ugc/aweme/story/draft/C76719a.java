package com.p2082ss.android.ugc.aweme.story.draft;

import android.database.Cursor;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.draft.a */
public final class C76719a {
    static {
        Covode.recordClassIndex(89715);
    }

    /* renamed from: a */
    public static final int m134291a(Cursor cursor, String str) {
        C89219l.m154721d(cursor, "");
        C89219l.m154721d(str, "");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return cursor.getInt(columnIndex);
        }
        return 0;
    }

    /* renamed from: b */
    public static final long m134292b(Cursor cursor, String str) {
        C89219l.m154721d(cursor, "");
        C89219l.m154721d(str, "");
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return cursor.getLong(columnIndex);
        }
        return 0;
    }

    /* renamed from: c */
    public static final String m134293c(Cursor cursor, String str) {
        C89219l.m154721d(cursor, "");
        C89219l.m154721d(str, "");
        return cursor.getString(cursor.getColumnIndex(str));
    }
}
