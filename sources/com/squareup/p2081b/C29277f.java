package com.squareup.p2081b;

import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.b.f */
public final class C29277f extends AbstractC29315y {

    /* renamed from: a */
    private static final UriMatcher f69454a;

    /* renamed from: b */
    private final Context f69455b;

    static {
        Covode.recordClassIndex(35626);
        UriMatcher uriMatcher = new UriMatcher(-1);
        f69454a = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    C29277f(Context context) {
        this.f69455b = context;
    }

    @Override // com.squareup.p2081b.AbstractC29315y
    /* renamed from: a */
    public final boolean mo51062a(C29312w wVar) {
        Uri uri = wVar.f69562d;
        if (!"content".equals(uri.getScheme()) || !ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) || f69454a.match(wVar.f69562d) == -1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0035, code lost:
        if (r4 == null) goto L_0x0037;
     */
    @Override // com.squareup.p2081b.AbstractC29315y
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.squareup.p2081b.AbstractC29315y.C29316a mo51063b(com.squareup.p2081b.C29312w r8) {
        /*
            r7 = this;
            r6 = 10151(0x27a7, float:1.4225E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
            android.content.Context r0 = r7.f69455b
            android.content.ContentResolver r5 = r0.getContentResolver()
            android.net.Uri r4 = r8.f69562d
            android.content.UriMatcher r0 = com.squareup.p2081b.C29277f.f69454a
            int r2 = r0.match(r4)
            r3 = 0
            r1 = 1
            if (r2 == r1) goto L_0x0031
            r0 = 2
            if (r2 == r0) goto L_0x0020
            r0 = 3
            if (r2 == r0) goto L_0x003b
            r0 = 4
            if (r2 != r0) goto L_0x0044
        L_0x0020:
            java.io.InputStream r2 = r5.openInputStream(r4)
        L_0x0024:
            if (r2 == 0) goto L_0x0037
            com.squareup.b.y$a r1 = new com.squareup.b.y$a
            com.squareup.b.t$d r0 = com.squareup.p2081b.C29299t.EnumC29305d.DISK
            r1.<init>(r2, r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r1
        L_0x0031:
            android.net.Uri r4 = android.provider.ContactsContract.Contacts.lookupContact(r5, r4)
            if (r4 != 0) goto L_0x003b
        L_0x0037:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            return r3
        L_0x003b:
            int r0 = android.os.Build.VERSION.SDK_INT
            r0 = 14
            java.io.InputStream r2 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r4, r1)
            goto L_0x0024
        L_0x0044:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = java.lang.String.valueOf(r4)
            java.lang.String r0 = "Invalid uri: "
            java.lang.String r0 = r0.concat(r1)
            r2.<init>(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.p2081b.C29277f.mo51063b(com.squareup.b.w):com.squareup.b.y$a");
    }
}
