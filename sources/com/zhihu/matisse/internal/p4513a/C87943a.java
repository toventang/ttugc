package com.zhihu.matisse.internal.p4513a;

import android.content.ContentUris;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.MergeCursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import androidx.loader.p062a.C1231b;
import com.bytedance.covode.number.Covode;
import com.zhihu.matisse.EnumC87938b;
import com.zhihu.matisse.internal.entity.Album;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: com.zhihu.matisse.internal.a.a */
public final class C87943a extends C1231b {

    /* renamed from: A */
    private static final String[] f199704A = {"_id", "bucket_id", "bucket_display_name", "mime_type"};

    /* renamed from: B */
    private static final String[] f199705B = {"_id", "bucket_id", "bucket_display_name", "mime_type"};

    /* renamed from: v */
    public static final String[] f199706v = {"1", "3"};

    /* renamed from: w */
    private static final Uri f199707w = MediaStore.Files.getContentUri("external");

    /* renamed from: x */
    private static final String[] f199708x = {"_id", "bucket_id", "bucket_display_name", "mime_type", "uri", "count"};

    /* renamed from: y */
    private static final String[] f199709y = {"_id", "bucket_id", "bucket_display_name", "mime_type", "COUNT(*) AS count"};

    /* renamed from: z */
    private static final String[] f199710z = {"_id", "bucket_id", "bucket_display_name", "mime_type", "COUNT(*) AS count"};

    @Override // androidx.loader.p062a.C1232c
    /* renamed from: o */
    public final void mo4084o() {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // androidx.loader.p062a.C1231b, androidx.loader.p062a.AbstractC1229a
    /* renamed from: d */
    public final /* synthetic */ Cursor mo4067d() {
        return mo4067d();
    }

    static {
        Covode.recordClassIndex(103958);
    }

    @Override // androidx.loader.p062a.C1231b
    /* renamed from: f */
    public final Cursor mo4074f() {
        Uri uri;
        int i;
        long valueOf;
        int i2;
        Uri uri2;
        String uri3;
        char c;
        Cursor f = super.mo4067d();
        String[] strArr = f199708x;
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        if (Build.VERSION.SDK_INT < 29) {
            MatrixCursor matrixCursor2 = new MatrixCursor(strArr);
            if (f != null) {
                i2 = 0;
                while (f.moveToNext()) {
                    long j = f.getLong(f.getColumnIndex("_id"));
                    long j2 = f.getLong(f.getColumnIndex("bucket_id"));
                    String string = f.getString(f.getColumnIndex("bucket_display_name"));
                    String string2 = f.getString(f.getColumnIndex("mime_type"));
                    Uri a = m152959a(f);
                    int i3 = f.getInt(f.getColumnIndex("count"));
                    matrixCursor2.addRow(new String[]{Long.toString(j), Long.toString(j2), string, string2, a.toString(), String.valueOf(i3)});
                    i2 += i3;
                }
                if (f.moveToFirst()) {
                    uri2 = m152959a(f);
                } else {
                    uri2 = null;
                }
            } else {
                uri2 = null;
                i2 = 0;
            }
            String[] strArr2 = new String[6];
            strArr2[0] = Album.f199731a;
            strArr2[1] = Album.f199731a;
            strArr2[2] = "All";
            strArr2[3] = null;
            if (uri2 == null) {
                c = 4;
                uri3 = null;
            } else {
                uri3 = uri2.toString();
                c = 4;
            }
            strArr2[c] = uri3;
            strArr2[5] = String.valueOf(i2);
            matrixCursor.addRow(strArr2);
            return new MergeCursor(new Cursor[]{matrixCursor, matrixCursor2});
        }
        HashMap hashMap = new HashMap();
        if (f != null) {
            while (f.moveToNext()) {
                long j3 = f.getLong(f.getColumnIndex("bucket_id"));
                Long l = (Long) hashMap.get(Long.valueOf(j3));
                if (l == null) {
                    valueOf = 1L;
                } else {
                    valueOf = Long.valueOf(l.longValue() + 1);
                }
                hashMap.put(Long.valueOf(j3), valueOf);
            }
        }
        MatrixCursor matrixCursor3 = new MatrixCursor(f199708x);
        if (f == null || !f.moveToFirst()) {
            uri = null;
            i = 0;
        } else {
            uri = m152959a(f);
            HashSet hashSet = new HashSet();
            i = 0;
            do {
                long j4 = f.getLong(f.getColumnIndex("bucket_id"));
                if (!hashSet.contains(Long.valueOf(j4))) {
                    long j5 = f.getLong(f.getColumnIndex("_id"));
                    String string3 = f.getString(f.getColumnIndex("bucket_display_name"));
                    String string4 = f.getString(f.getColumnIndex("mime_type"));
                    Uri a2 = m152959a(f);
                    long longValue = ((Long) hashMap.get(Long.valueOf(j4))).longValue();
                    matrixCursor3.addRow(new String[]{Long.toString(j5), Long.toString(j4), string3, string4, a2.toString(), String.valueOf(longValue)});
                    hashSet.add(Long.valueOf(j4));
                    i = (int) (((long) i) + longValue);
                }
            } while (f.moveToNext());
        }
        String[] strArr3 = new String[6];
        strArr3[0] = Album.f199731a;
        strArr3[1] = Album.f199731a;
        strArr3[2] = "All";
        String str = null;
        strArr3[3] = null;
        if (uri != null) {
            str = uri.toString();
        }
        strArr3[4] = str;
        strArr3[5] = String.valueOf(i);
        matrixCursor.addRow(strArr3);
        return new MergeCursor(new Cursor[]{matrixCursor, matrixCursor3});
    }

    /* renamed from: a */
    public static String[] m152960a(int i) {
        return new String[]{String.valueOf(i)};
    }

    /* renamed from: a */
    private static Uri m152959a(Cursor cursor) {
        Uri contentUri;
        long j = cursor.getLong(cursor.getColumnIndex("_id"));
        String string = cursor.getString(cursor.getColumnIndex("mime_type"));
        if (EnumC87938b.isImage(string)) {
            contentUri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        } else if (EnumC87938b.isVideo(string)) {
            contentUri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        } else {
            contentUri = MediaStore.Files.getContentUri("external");
        }
        return ContentUris.withAppendedId(contentUri, j);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C87943a(android.content.Context r8, java.lang.String r9, java.lang.String[] r10) {
        /*
            r7 = this;
            android.net.Uri r2 = com.zhihu.matisse.internal.p4513a.C87943a.f199707w
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 >= r0) goto L_0x0014
            java.lang.String[] r3 = com.zhihu.matisse.internal.p4513a.C87943a.f199710z
        L_0x000a:
            java.lang.String r6 = "datetaken DESC"
            r0 = r7
            r1 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0014:
            java.lang.String[] r3 = com.zhihu.matisse.internal.p4513a.C87943a.f199705B
            goto L_0x000a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zhihu.matisse.internal.p4513a.C87943a.<init>(android.content.Context, java.lang.String, java.lang.String[]):void");
    }
}
