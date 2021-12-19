package com.bytedance.ies.powerlist;

import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.experiment.C46726bb;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import p4600h.p4611f.p4613b.C89219l;

public final class ContextProvider extends ContentProvider {
    static {
        Covode.recordClassIndex(20163);
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
        Context context;
        if (C46726bb.m90107b() || C46726bb.m90108c()) {
            return false;
        }
        Context context2 = getContext();
        Application application = null;
        if (context2 != null) {
            context = context2.getApplicationContext();
            if (C58003a.f132201c && context == null) {
                context = C58003a.f132199a;
            }
        } else {
            context = null;
        }
        if (context instanceof Application) {
            application = context;
        }
        Application application2 = application;
        if (application2 == null) {
            return true;
        }
        C17643c.m32759a(application2);
        return true;
    }
}
