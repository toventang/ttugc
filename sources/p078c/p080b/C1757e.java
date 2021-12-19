package p078c.p080b;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p078c.p083d.C1763b;

/* renamed from: c.b.e */
public final class C1757e {

    /* renamed from: a */
    private static final String[] f5626a = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "_size", "width", "height", "relative_path", "datetaken", "orientation"};

    /* renamed from: b */
    private static final String[] f5627b = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "_size", "width", "height", "_data", "datetaken", "orientation"};

    /* renamed from: c */
    private static final String[] f5628c = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "width", "height", "relative_path", "datetaken", "resolution"};

    /* renamed from: d */
    private static final String[] f5629d = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "width", "height", "_data", "datetaken", "resolution"};

    /* renamed from: e */
    private static final String[] f5630e = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "is_music", "album", "album_id", "artist", "title", "relative_path", "datetaken"};

    /* renamed from: f */
    private static final String[] f5631f = {"_id", "_display_name", "date_modified", "date_added", "mime_type", "duration", "_size", "album", "album_id", "artist", "title", "is_music", "_data"};

    /* renamed from: g */
    private static final String[] f5632g = {"1", "3"};

    /* renamed from: h */
    private static final String[] f5633h = {"image/jpeg", "image/png", "image/gif", "image/webp", "image/bmp"};

    /* renamed from: i */
    private static final String[] f5634i = {"video/webm", "video/mp4", "video/ogg", "video/flv", "video/avi", "video/wmv", "video/rmvb"};

    /* renamed from: j */
    private static final String[] f5635j = {"audio/mp3", "audio/midi", "audio/wav", "audio/m3u", "audio/m4a", "audio/ogg", "audio/ra"};

    static {
        Covode.recordClassIndex(1927);
    }

    /* renamed from: a */
    public static Uri m5901a(Context context, String str) {
        return m5906b(context, str, "video/mp4");
    }

    /* renamed from: b */
    public static String m5908b(Context context, Uri uri) {
        return context.getContentResolver().getType(uri);
    }

    /* renamed from: b */
    public static Uri m5905b(Context context, String str) {
        return m5914d(context, str, Environment.DIRECTORY_DCIM + "/Camera/");
    }

    /* renamed from: c */
    public static void m5912c(Context context, String str) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(Uri.fromFile(new File(str)));
        context.sendBroadcast(intent);
        MediaScannerConnection.scanFile(context, new String[]{str}, null, null);
    }

    /* renamed from: a */
    public static long m5900a(Context context, Uri uri) {
        MethodCollector.m26663i(6524);
        if ("file".equals(uri.getScheme())) {
            long length = new File(uri.getPath()).length();
            MethodCollector.m26664o(6524);
            return length;
        } else if ("content".equals(uri.getScheme())) {
            try {
                long statSize = context.getContentResolver().openFileDescriptor(uri, "r").getStatSize();
                MethodCollector.m26664o(6524);
                return statSize;
            } catch (Exception unused) {
                MethodCollector.m26664o(6524);
                return 0;
            }
        } else {
            MethodCollector.m26664o(6524);
            return 0;
        }
    }

    /* renamed from: c */
    public static boolean m5913c(Context context, Uri uri) {
        MethodCollector.m26663i(6692);
        if (context == null || uri == null) {
            MethodCollector.m26664o(6692);
            return false;
        }
        try {
            AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            if (openAssetFileDescriptor == null) {
                MethodCollector.m26664o(6692);
                return false;
            }
            try {
                openAssetFileDescriptor.close();
            } catch (IOException unused) {
            }
            MethodCollector.m26664o(6692);
            return true;
        } catch (FileNotFoundException unused2) {
            MethodCollector.m26664o(6692);
            return false;
        }
    }

    /* renamed from: c */
    public static Uri m5910c(Context context, String str, String str2) {
        return m5911c(context, str, str2, Environment.DIRECTORY_DCIM + "/Camera/");
    }

    /* renamed from: b */
    public static Uri m5906b(Context context, String str, String str2) {
        File file = new File(Environment.getExternalStorageDirectory().getPath() + "/" + Environment.DIRECTORY_DCIM + "/Camera");
        if (!file.exists()) {
            file.mkdirs();
        }
        return m5907b(context, str, str2, Environment.DIRECTORY_DCIM + "/Camera/");
    }

    /* renamed from: a */
    public static Uri m5902a(Context context, String str, String str2) {
        File file = new File(Environment.getExternalStorageDirectory().getPath() + "/" + Environment.DIRECTORY_DCIM + "/Camera");
        if (!file.exists()) {
            file.mkdirs();
        }
        return m5903a(context, str, str2, Environment.DIRECTORY_DCIM + "/Camera/");
    }

    /* JADX WARNING: Removed duplicated region for block: B:56:0x0181  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.net.Uri m5914d(android.content.Context r14, java.lang.String r15, java.lang.String r16) {
        /*
        // Method dump skipped, instructions count: 392
        */
        throw new UnsupportedOperationException("Method not decompiled: p078c.p080b.C1757e.m5914d(android.content.Context, java.lang.String, java.lang.String):android.net.Uri");
    }

    /* renamed from: b */
    public static Uri m5907b(Context context, String str, String str2, String str3) {
        Uri uri;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!str3.endsWith("/")) {
            str3 = str3 + "/";
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", str2);
        if (C1763b.m5925b()) {
            uri = MediaStore.Video.Media.getContentUri("external_primary");
            contentValues.put("relative_path", str3);
        } else {
            uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            contentValues.put("_data", C1763b.m5921a(Environment.getExternalStorageDirectory().getPath() + "/" + str3 + "/" + str));
        }
        return context.getContentResolver().insert(uri, contentValues);
    }

    /* renamed from: a */
    public static Uri m5903a(Context context, String str, String str2, String str3) {
        Uri uri;
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (!str3.endsWith("/")) {
            str3 = str3 + "/";
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name", str);
        contentValues.put("datetaken", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("mime_type", str2);
        if (C1763b.m5925b()) {
            uri = MediaStore.Images.Media.getContentUri("external_primary");
            contentValues.put("relative_path", str3);
        } else {
            uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            contentValues.put("_data", C1763b.m5921a(Environment.getExternalStorageDirectory().getPath() + "/" + str3 + "/" + str));
        }
        return context.getContentResolver().insert(uri, contentValues);
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01c6  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0188 A[EDGE_INSN: B:69:0x0188->B:50:0x0188 ?: BREAK  , SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.net.Uri m5911c(android.content.Context r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
        // Method dump skipped, instructions count: 461
        */
        throw new UnsupportedOperationException("Method not decompiled: p078c.p080b.C1757e.m5911c(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    /* renamed from: b */
    public static List<C1758f> m5909b(Context context, String str, String[] strArr, String str2, int i, int i2) {
        Cursor cursor;
        int columnIndexOrThrow;
        String str3 = str2;
        MethodCollector.m26663i(6690);
        ArrayList arrayList = new ArrayList();
        Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        Cursor cursor2 = null;
        try {
            if (C1763b.m5926c()) {
                cursor = context.getContentResolver().query(uri, f5626a, C1763b.m5920a(str, strArr, i, i2), null);
            } else if (C1763b.m5925b()) {
                if (i > 0) {
                    str3 = str3 + (" LIMIT " + i + " OFFSET " + i2);
                }
                cursor = context.getContentResolver().query(uri, f5626a, str, strArr, str3);
            } else {
                if (i > 0) {
                    str3 = str3 + (" LIMIT " + i + " OFFSET " + i2);
                }
                cursor = context.getContentResolver().query(uri, f5627b, str, strArr, str3);
            }
            if (cursor == null) {
                MethodCollector.m26664o(6690);
                return arrayList;
            }
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("_display_name");
            int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("date_modified");
            int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("date_added");
            int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("mime_type");
            int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("_size");
            int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("width");
            int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("height");
            int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("datetaken");
            int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("orientation");
            int i3 = -1;
            if (C1763b.m5925b()) {
                i3 = cursor.getColumnIndexOrThrow("relative_path");
                columnIndexOrThrow = -1;
            } else {
                columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
            }
            int length = (Environment.getExternalStorageDirectory().getPath() + "/").length();
            while (cursor.moveToNext()) {
                C1758f fVar = new C1758f();
                long j = cursor.getLong(columnIndexOrThrow2);
                fVar.f5636a = j;
                fVar.f5637b = cursor.getString(columnIndexOrThrow3);
                fVar.f5638c = cursor.getLong(columnIndexOrThrow4);
                fVar.f5639d = cursor.getLong(columnIndexOrThrow5);
                fVar.f5640e = cursor.getString(columnIndexOrThrow6);
                fVar.f5642g = cursor.getLong(columnIndexOrThrow7);
                fVar.f5643h = cursor.getInt(columnIndexOrThrow8);
                fVar.f5644i = cursor.getInt(columnIndexOrThrow9);
                fVar.f5648m = cursor.getLong(columnIndexOrThrow10);
                fVar.f5649n = cursor.getInt(columnIndexOrThrow11);
                if (C1763b.m5925b()) {
                    fVar.f5647l = cursor.getString(i3);
                } else {
                    String string = cursor.getString(columnIndexOrThrow);
                    try {
                        fVar.f5647l = string.substring(length, string.lastIndexOf(File.separator)) + File.separator;
                    } catch (IndexOutOfBoundsException unused) {
                        fVar.f5647l = "";
                    }
                }
                fVar.f5646k = ContentUris.withAppendedId(uri, j);
                arrayList.add(fVar);
            }
            cursor.close();
            MethodCollector.m26664o(6690);
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor2.close();
            }
            MethodCollector.m26664o(6690);
            throw th;
        }
    }

    /* renamed from: a */
    public static List<C1758f> m5904a(Context context, String str, String[] strArr, String str2, int i, int i2) {
        Cursor cursor;
        int columnIndexOrThrow;
        int i3;
        String str3 = str2;
        MethodCollector.m26663i(6530);
        ArrayList arrayList = new ArrayList();
        Uri uri = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        Cursor cursor2 = null;
        try {
            if (C1763b.m5926c()) {
                cursor = context.getContentResolver().query(uri, f5628c, C1763b.m5920a(str, strArr, i, i2), null);
            } else if (C1763b.m5925b()) {
                if (i > 0) {
                    str3 = str3 + (" LIMIT " + i + " OFFSET " + i2);
                }
                cursor = context.getContentResolver().query(uri, f5628c, str, strArr, str3);
            } else {
                if (i > 0) {
                    str3 = str3 + (" LIMIT " + i + " OFFSET " + i2);
                }
                cursor = context.getContentResolver().query(uri, f5629d, str, strArr, str3);
            }
            if (cursor == null) {
                MethodCollector.m26664o(6530);
                return arrayList;
            }
            int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("_display_name");
            int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("date_modified");
            int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("date_added");
            int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("mime_type");
            int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("_size");
            int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("width");
            int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("height");
            int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("duration");
            int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("datetaken");
            int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("resolution");
            if (C1763b.m5925b()) {
                i3 = cursor.getColumnIndexOrThrow("relative_path");
                columnIndexOrThrow = -1;
            } else {
                columnIndexOrThrow = cursor.getColumnIndexOrThrow("_data");
                i3 = -1;
            }
            int length = (Environment.getExternalStorageDirectory().getPath() + "/").length();
            while (cursor.moveToNext()) {
                C1758f fVar = new C1758f();
                long j = cursor.getLong(columnIndexOrThrow2);
                fVar.f5636a = j;
                fVar.f5637b = cursor.getString(columnIndexOrThrow3);
                fVar.f5638c = cursor.getLong(columnIndexOrThrow4);
                fVar.f5639d = cursor.getLong(columnIndexOrThrow5);
                fVar.f5640e = cursor.getString(columnIndexOrThrow6);
                fVar.f5642g = cursor.getLong(columnIndexOrThrow7);
                fVar.f5643h = cursor.getInt(columnIndexOrThrow8);
                fVar.f5644i = cursor.getInt(columnIndexOrThrow9);
                fVar.f5641f = cursor.getLong(columnIndexOrThrow10);
                fVar.f5648m = cursor.getLong(columnIndexOrThrow11);
                fVar.f5650o = cursor.getString(columnIndexOrThrow12);
                if (C1763b.m5925b()) {
                    fVar.f5647l = cursor.getString(i3);
                } else {
                    String string = cursor.getString(columnIndexOrThrow);
                    try {
                        fVar.f5647l = string.substring(length, string.lastIndexOf(File.separator)) + File.separator;
                    } catch (IndexOutOfBoundsException unused) {
                        fVar.f5647l = "";
                    }
                }
                fVar.f5646k = ContentUris.withAppendedId(uri, j);
                arrayList.add(fVar);
            }
            cursor.close();
            MethodCollector.m26664o(6530);
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor2.close();
            }
            MethodCollector.m26664o(6530);
            throw th;
        }
    }
}
