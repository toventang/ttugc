package com.snapchat.kit.sdk;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.snapchat.kit.sdk.core.metrics.model.SnapKitInitType;
import java.util.concurrent.TimeUnit;

public final class SnapKitInitProvider extends ContentProvider {
    static {
        Covode.recordClassIndex(35117);
    }

    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public final String getType(Uri uri) {
        return null;
    }

    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final boolean onCreate() {
        Context context = getContext();
        C29071k kVar = new C29071k((byte) 0);
        kVar.mo50740a().schedule(new Runnable(context) {
            /* class com.snapchat.kit.sdk.C28951c.RunnableC289521 */

            /* renamed from: a */
            final /* synthetic */ Context f68397a;

            static {
                Covode.recordClassIndex(35136);
            }

            public final void run() {
                C28951c.m57974a(this.f68397a, SnapKitInitType.INIT_TYPE_AUTO);
            }

            {
                this.f68397a = r1;
            }
        }, 5, TimeUnit.SECONDS);
        return false;
    }
}
