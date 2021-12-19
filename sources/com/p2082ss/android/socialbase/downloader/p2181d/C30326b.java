package com.p2082ss.android.socialbase.downloader.p2181d;

import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.socialbase.downloader.downloader.C30399c;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.ss.android.socialbase.downloader.d.b */
public final class C30326b {

    /* renamed from: a */
    static SparseArray<C30327a> f72347a;

    /* renamed from: com.ss.android.socialbase.downloader.d.b$a */
    static class C30327a {

        /* renamed from: a */
        public Uri f72348a;

        /* renamed from: b */
        public String f72349b;

        /* renamed from: c */
        public String f72350c;

        static {
            Covode.recordClassIndex(36839);
        }

        C30327a() {
        }

        /* renamed from: a */
        static C30327a m61489a(Uri uri, String str) {
            C30327a aVar = new C30327a();
            aVar.f72348a = uri;
            aVar.f72349b = uri.toString();
            aVar.f72350c = str;
            return aVar;
        }
    }

    static {
        boolean z;
        Covode.recordClassIndex(36838);
        try {
            f72347a = new SparseArray<>();
            if (Build.VERSION.SDK_INT >= 29) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f72347a.put(2, C30327a.m61489a(MediaStore.Images.Media.getContentUri("external_primary"), "_id"));
                f72347a.put(3, C30327a.m61489a(MediaStore.Video.Media.getContentUri("external_primary"), "_id"));
                f72347a.put(4, C30327a.m61489a(MediaStore.Audio.Media.getContentUri("external_primary"), "_id"));
                return;
            }
            f72347a.put(2, C30327a.m61489a(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "_id"));
            f72347a.put(3, C30327a.m61489a(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, "_id"));
            f72347a.put(4, C30327a.m61489a(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, "_id"));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static long m61484a(Uri uri) {
        ParcelFileDescriptor parcelFileDescriptor;
        try {
            parcelFileDescriptor = m61488b(uri, "r");
            try {
                long statSize = parcelFileDescriptor.getStatSize();
                C30535g.m62556a(parcelFileDescriptor);
                return statSize;
            } catch (Throwable unused) {
                C30535g.m62556a(parcelFileDescriptor);
                return -1;
            }
        } catch (Throwable unused2) {
            parcelFileDescriptor = null;
            C30535g.m62556a(parcelFileDescriptor);
            return -1;
        }
    }

    /* renamed from: a */
    public static int m61483a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 5;
        }
        if (!str.startsWith("content")) {
            return 1;
        }
        for (int i = 0; i < f72347a.size(); i++) {
            int keyAt = f72347a.keyAt(i);
            if (str.startsWith(f72347a.get(keyAt).f72349b)) {
                return keyAt;
            }
        }
        return 5;
    }

    /* renamed from: a */
    public static boolean m61486a(C30325a aVar) {
        if (!aVar.mo53840b() || aVar.mo53837a() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m61487a(FileOutputStream fileOutputStream) {
        MethodCollector.m26663i(11217);
        try {
            fileOutputStream.write(new byte[0]);
            fileOutputStream.close();
            MethodCollector.m26664o(11217);
            return true;
        } catch (Throwable unused) {
            MethodCollector.m26664o(11217);
            return false;
        }
    }

    /* renamed from: b */
    private static ParcelFileDescriptor m61488b(Uri uri, String str) {
        MethodCollector.m26663i(11215);
        if (uri != null) {
            try {
                ParcelFileDescriptor openFileDescriptor = C30399c.m61674B().getContentResolver().openFileDescriptor(uri, str);
                if (openFileDescriptor != null) {
                    MethodCollector.m26664o(11215);
                    return openFileDescriptor;
                }
                IOException iOException = new IOException("Fail to get ParcelFileDescriptor, fileDescriptor is null");
                MethodCollector.m26664o(11215);
                throw iOException;
            } catch (Exception e) {
                e.printStackTrace();
                IOException iOException2 = new IOException("Fail to get ParcelFileDescriptor", e);
                MethodCollector.m26664o(11215);
                throw iOException2;
            }
        } else {
            IOException iOException3 = new IOException("Fail to get ParcelFileDescriptor, uri is null");
            MethodCollector.m26664o(11215);
            throw iOException3;
        }
    }

    /* renamed from: a */
    public static FileDescriptor m61485a(Uri uri, String str) {
        ParcelFileDescriptor b = m61488b(uri, str);
        if (b != null) {
            return b.getFileDescriptor();
        }
        throw new IOException("Fail to get FileDescriptor, ParcelFileDescriptor is null");
    }
}
