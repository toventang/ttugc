package com.facebook.imagepipeline.p1889n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1835g.AbstractC24113i;
import com.facebook.common.p1839k.C24134g;
import com.facebook.imagepipeline.p1885j.C24456e;
import com.facebook.imagepipeline.p1890o.C24636b;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.n.x */
public final class C24626x extends AbstractC24514aa {

    /* renamed from: a */
    private static final String[] f58527a = {"_id", "_data"};

    /* renamed from: b */
    private final ContentResolver f58528b;

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24514aa
    /* renamed from: a */
    public final String mo40382a() {
        return "LocalContentUriFetchProducer";
    }

    static {
        Covode.recordClassIndex(28770);
    }

    /* renamed from: a */
    private C24456e m47130a(Uri uri) {
        MethodCollector.m26663i(8390);
        Cursor query = this.f58528b.query(uri, f58527a, null, null, null);
        if (query == null) {
            MethodCollector.m26664o(8390);
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (string != null) {
                C24456e b = mo40383b(new FileInputStream(string), (int) new File(string).length());
                query.close();
                MethodCollector.m26664o(8390);
                return b;
            }
            query.close();
            MethodCollector.m26664o(8390);
            return null;
        } finally {
            query.close();
            MethodCollector.m26664o(8390);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.imagepipeline.p1889n.AbstractC24514aa
    /* renamed from: a */
    public final C24456e mo40380a(C24636b bVar) {
        boolean z;
        C24456e a;
        InputStream openContactPhotoInputStream;
        MethodCollector.m26663i(8243);
        Uri uri = bVar.mSourceUri;
        if (!C24134g.m45739d(uri) || !"com.android.contacts".equals(uri.getAuthority()) || uri.getPath().startsWith(C24134g.f57081a.getPath())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (uri.toString().endsWith("/photo")) {
                openContactPhotoInputStream = this.f58528b.openInputStream(uri);
            } else if (uri.toString().endsWith("/display_photo")) {
                try {
                    openContactPhotoInputStream = this.f58528b.openAssetFileDescriptor(uri, "r").createInputStream();
                } catch (IOException unused) {
                    IOException iOException = new IOException("Contact photo does not exist: ".concat(String.valueOf(uri)));
                    MethodCollector.m26664o(8243);
                    throw iOException;
                }
            } else {
                openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f58528b, uri);
                if (openContactPhotoInputStream == null) {
                    IOException iOException2 = new IOException("Contact photo does not exist: ".concat(String.valueOf(uri)));
                    MethodCollector.m26664o(8243);
                    throw iOException2;
                }
            }
            C24456e b = mo40383b(openContactPhotoInputStream, -1);
            MethodCollector.m26664o(8243);
            return b;
        } else if (!C24134g.m45740e(uri) || (a = m47130a(uri)) == null) {
            C24456e b2 = mo40383b(this.f58528b.openInputStream(uri), -1);
            MethodCollector.m26664o(8243);
            return b2;
        } else {
            MethodCollector.m26664o(8243);
            return a;
        }
    }

    public C24626x(Executor executor, AbstractC24113i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f58528b = contentResolver;
    }
}
