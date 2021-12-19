package com.bytedance.ies.powerpage;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

public final class PagerProvider extends ContentProvider {
    static {
        Covode.recordClassIndex(20294);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        C89219l.m154719c(uri, "");
        return 0;
    }

    public final String getType(Uri uri) {
        C89219l.m154719c(uri, "");
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        C89219l.m154719c(uri, "");
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C89219l.m154719c(uri, "");
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C89219l.m154719c(uri, "");
        return 0;
    }

    public final boolean onCreate() {
        getContext();
        return true;
    }
}
