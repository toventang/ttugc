package com.p2082ss.android.ugc.aweme.push.downgrade;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.push.downgrade.PushRunningStatusProvider */
public class PushRunningStatusProvider extends ContentProvider {
    static {
        Covode.recordClassIndex(77207);
    }

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return null;
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        return false;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public Bundle call(String str, String str2, Bundle bundle) {
        C65717h.f148070a = true;
        return super.call(str, str2, bundle);
    }
}
