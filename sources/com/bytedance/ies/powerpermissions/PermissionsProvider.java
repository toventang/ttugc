package com.bytedance.ies.powerpermissions;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.keva.KevaBuilder;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import p4600h.p4611f.p4613b.C89219l;

public final class PermissionsProvider extends ContentProvider {
    static {
        Covode.recordClassIndex(20304);
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
        Context context = getContext();
        if (context == null) {
            return true;
        }
        C89219l.m154709a((Object) context, "");
        C89219l.m154719c(context, "");
        KevaBuilder instance = KevaBuilder.getInstance();
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            applicationContext = C58003a.f132199a;
        }
        instance.setContext(applicationContext);
        return true;
    }
}
