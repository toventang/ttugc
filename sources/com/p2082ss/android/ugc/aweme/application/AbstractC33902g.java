package com.p2082ss.android.ugc.aweme.application;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.application.g */
public abstract class AbstractC33902g extends ContentProvider {
    static {
        Covode.recordClassIndex(40820);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        C89219l.m154721d(uri, "");
        return 0;
    }

    public String getType(Uri uri) {
        C89219l.m154721d(uri, "");
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        C89219l.m154721d(uri, "");
        return null;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C89219l.m154721d(uri, "");
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C89219l.m154721d(uri, "");
        return 0;
    }
}
