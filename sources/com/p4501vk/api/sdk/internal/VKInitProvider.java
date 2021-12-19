package com.p4501vk.api.sdk.internal;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p4501vk.api.sdk.C87816VK;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.vk.api.sdk.internal.VKInitProvider */
public final class VKInitProvider extends ContentProvider {
    static {
        Covode.recordClassIndex(103910);
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
        try {
            Context context = getContext();
            if (context == null) {
                C89219l.m154707a();
            }
            C89219l.m154709a((Object) context, "");
            C87816VK.m152824a(context);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
