package com.p2082ss.android.ugc.aweme.p2929fe.p2930a;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.bpea.entry.common.DataType;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.util.List;
import p078c.p083d.C1762a;
import p078c.p083d.C1763b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.fe.a.b */
public final class C47806b {

    /* renamed from: a */
    public static final C47806b f110759a = new C47806b();

    private C47806b() {
    }

    static {
        Covode.recordClassIndex(56432);
    }

    /* renamed from: a */
    private static Uri m90820a(Uri uri) {
        Uri uri2;
        String documentId = DocumentsContract.getDocumentId(uri);
        C89219l.m154716b(documentId, "");
        List<String> b = C89361p.m154915b(documentId, new String[]{":"});
        String str = b.get(0);
        if (TextUtils.equals("image", str)) {
            uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            if (C1763b.m5925b()) {
                uri2 = MediaStore.Images.Media.getContentUri("external_primary");
            }
        } else if (TextUtils.equals("video", str)) {
            uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            if (C1763b.m5925b()) {
                uri2 = MediaStore.Video.Media.getContentUri("external_primary");
            }
        } else if (TextUtils.equals(DataType.AUDIO, str)) {
            uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            if (C1763b.m5925b()) {
                uri2 = MediaStore.Audio.Media.getContentUri("external_primary");
            }
        } else {
            uri2 = null;
        }
        if (TextUtils.isEmpty(b.get(1))) {
            return null;
        }
        if (uri2 == null) {
            C89219l.m154715b();
        }
        return ContentUris.withAppendedId(uri2, Long.parseLong(b.get(1)));
    }

    /* JADX WARNING: Removed duplicated region for block: B:76:0x010c A[SYNTHETIC, Splitter:B:76:0x010c] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0111 A[Catch:{ IOException -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0116 A[Catch:{ IOException -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x011b A[Catch:{ IOException -> 0x011e }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0134  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0139  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m90822a(java.lang.String r14) {
        /*
        // Method dump skipped, instructions count: 330
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p2929fe.p2930a.C47806b.m90822a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static Long m90821a(Context context, Uri uri) {
        ContentResolver contentResolver;
        ParcelFileDescriptor openFileDescriptor;
        MethodCollector.m26663i(5587);
        C89219l.m154721d(uri, "");
        int i = Build.VERSION.SDK_INT;
        if (DocumentsContract.isDocumentUri(context, uri) && TextUtils.equals("com.android.providers.media.documents", uri.getAuthority())) {
            uri = m90820a(uri);
            if (uri == null) {
                MethodCollector.m26664o(5587);
                return null;
            }
        } else if (!TextUtils.equals("media", uri.getAuthority())) {
            Long valueOf = Long.valueOf(new File(C1762a.m5918a(context, uri)).length());
            MethodCollector.m26664o(5587);
            return valueOf;
        }
        if (context == null || (contentResolver = context.getContentResolver()) == null || (openFileDescriptor = contentResolver.openFileDescriptor(uri, "r")) == null) {
            MethodCollector.m26664o(5587);
            return null;
        }
        Long valueOf2 = Long.valueOf(openFileDescriptor.getStatSize());
        MethodCollector.m26664o(5587);
        return valueOf2;
    }
}
