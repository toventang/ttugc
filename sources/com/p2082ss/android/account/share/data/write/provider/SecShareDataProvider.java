package com.p2082ss.android.account.share.data.write.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.account.share.data.write.C29361a;
import com.p2082ss.android.account.share.data.write.C29363b;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.account.share.data.write.provider.SecShareDataProvider */
public final class SecShareDataProvider extends ContentProvider {

    /* renamed from: a */
    public static final C29368a f69724a = new C29368a((byte) 0);

    /* renamed from: c */
    private static final UriMatcher f69725c = new UriMatcher(-1);

    /* renamed from: b */
    private C29361a f69726b;

    public final int delete(Uri uri, String str, String[] strArr) {
        C89219l.m154719c(uri, "");
        return 0;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C89219l.m154719c(uri, "");
        return 0;
    }

    /* renamed from: com.ss.android.account.share.data.write.provider.SecShareDataProvider$a */
    public static final class C29368a {
        static {
            Covode.recordClassIndex(35759);
        }

        private C29368a() {
        }

        public /* synthetic */ C29368a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(35758);
    }

    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            return false;
        }
        this.f69726b = C29361a.C29362a.m58794a(context);
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            return false;
        }
        f69725c.addURI(packageName + ".SecShareProviderAuthority", "sec_share/*", 2);
        return true;
    }

    public final String getType(Uri uri) {
        C89219l.m154719c(uri, "");
        Context context = getContext();
        if (context == null) {
            return null;
        }
        String packageName = context.getPackageName();
        if (!TextUtils.isEmpty(packageName) && f69725c.match(uri) == 2) {
            return packageName + ".SecShareProviderAuthority";
        }
        return null;
    }

    public final synchronized Uri insert(Uri uri, ContentValues contentValues) {
        MethodCollector.m26663i(2318);
        C89219l.m154719c(uri, "");
        MethodCollector.m26664o(2318);
        return uri;
    }

    public final synchronized Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Exception e;
        MethodCollector.m26663i(2419);
        C89219l.m154719c(uri, "");
        int i = Build.VERSION.SDK_INT;
        MatrixCursor matrixCursor = null;
        if (!C29363b.m58797a(getCallingPackage())) {
            MethodCollector.m26664o(2419);
            return null;
        } else if (f69725c.match(uri) != 2) {
            MethodCollector.m26664o(2419);
            return null;
        } else {
            List<String> pathSegments = uri.getPathSegments();
            int size = pathSegments.size();
            if (size > 0) {
                String str3 = pathSegments.get(size - 1);
                C89219l.m154709a((Object) str3, "");
                String str4 = str3;
                try {
                    C29361a aVar = this.f69726b;
                    if (aVar == null) {
                        C89219l.m154707a();
                    }
                    String a = aVar.mo51330a(str4);
                    MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{str4});
                    try {
                        matrixCursor2.newRow().add(str4, a);
                        MethodCollector.m26664o(2419);
                        return matrixCursor2;
                    } catch (Exception e2) {
                        e = e2;
                        matrixCursor = matrixCursor2;
                        e.printStackTrace();
                        MethodCollector.m26664o(2419);
                        return matrixCursor;
                    }
                } catch (Exception e3) {
                    e = e3;
                    e.printStackTrace();
                    MethodCollector.m26664o(2419);
                    return matrixCursor;
                }
            } else {
                MethodCollector.m26664o(2419);
                return null;
            }
        }
    }
}
