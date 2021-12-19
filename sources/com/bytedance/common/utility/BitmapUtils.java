package com.bytedance.common.utility;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Environment;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class BitmapUtils {
    static {
        Covode.recordClassIndex(15602);
    }

    private BitmapUtils() {
    }

    public static Bitmap decodeBitmap(byte[] bArr, int i, int i2) {
        MethodCollector.m26663i(11095);
        if (bArr == null || i <= 0 || i2 <= 0) {
            MethodCollector.m26664o(11095);
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i3 = options.outWidth;
            int i4 = options.outHeight;
            int i5 = 1;
            while (true) {
                if (i3 / 2 >= i || i4 / 2 >= i2) {
                    i3 /= 2;
                    i4 /= 2;
                    i5 *= 2;
                } else {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = i5;
                    options2.inPurgeable = true;
                    options2.inPreferredConfig = Bitmap.Config.RGB_565;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options2);
                    MethodCollector.m26664o(11095);
                    return decodeByteArray;
                }
            }
        } catch (Exception unused) {
            MethodCollector.m26664o(11095);
            return null;
        }
    }

    public static Bitmap getBitmapFromSD(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return null;
        }
        try {
            return decodeBitmap(file);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static int readPictureDegree(String str) {
        try {
            int attributeInt = new ExifInterface(str).getAttributeInt("Orientation", 1);
            if (attributeInt == 3) {
                return LiveFeedRefreshTimeSetting.DEFAULT;
            }
            if (attributeInt == 6) {
                return 90;
            }
            if (attributeInt != 8) {
                return 0;
            }
            return 270;
        } catch (IOException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: com_bytedance_common_utility_BitmapUtils_com_ss_android_ugc_aweme_storage_FileLancet_delete */
    public static boolean m24394x39a095ac(File file) {
        MethodCollector.m26663i(11397);
        try {
            C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
            if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
            }
            if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                MethodCollector.m26664o(11397);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.m26664o(11397);
        return delete;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0073, code lost:
        if (r3 == null) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0069 A[SYNTHETIC, Splitter:B:30:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086 A[SYNTHETIC, Splitter:B:43:0x0086] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void rotateImage(java.lang.String r13) {
        /*
        // Method dump skipped, instructions count: 159
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.rotateImage(java.lang.String):void");
    }

    public static Bitmap decodeBitmap(File file) {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        MethodCollector.m26663i(11563);
        FileInputStream fileInputStream2 = null;
        if (!file.exists()) {
            MethodCollector.m26664o(11563);
            return null;
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
                try {
                    fileInputStream.close();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                MethodCollector.m26664o(11563);
                return decodeStream;
            } catch (Exception e3) {
                e = e3;
                try {
                    e.printStackTrace();
                    try {
                        fileInputStream.close();
                    } catch (Exception e4) {
                        e4.printStackTrace();
                    }
                    MethodCollector.m26664o(11563);
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    try {
                        fileInputStream2.close();
                    } catch (Exception e5) {
                        e5.printStackTrace();
                    }
                    MethodCollector.m26664o(11563);
                    throw th;
                }
            }
        } catch (Exception e6) {
            e = e6;
            fileInputStream = null;
            e.printStackTrace();
            fileInputStream.close();
            MethodCollector.m26664o(11563);
            return null;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2.close();
            MethodCollector.m26664o(11563);
            throw th;
        }
    }

    public static Bitmap decodeBitmap(File file, int i) {
        return decodeBitmap(file, i, false);
    }

    public static Bitmap getBitmapFromSD(String str, int i) {
        return getBitmapFromSD(str, i, false);
    }

    public static Bitmap loadBitmap(int i, String str) {
        return loadBitmap(i, str, false);
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i) {
        MethodCollector.m26663i(12040);
        if (bitmap != null) {
            Matrix matrix = new Matrix();
            matrix.postRotate((float) i);
            Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            MethodCollector.m26664o(12040);
            return createBitmap;
        }
        MethodCollector.m26664o(12040);
        return bitmap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        if (r4 == 1) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap compressBitmap(android.graphics.Bitmap r8, long r9) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.compressBitmap(android.graphics.Bitmap, long):android.graphics.Bitmap");
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2) {
        return getBitmapFromSD(str, i, i2, -1, null);
    }

    public static Bitmap resizeBitmap(Bitmap bitmap, int i, int i2) {
        MethodCollector.m26663i(12322);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width > i || height > i2) {
            if (width <= height || width <= i) {
                i = (int) (((float) width) * (((float) i2) / ((float) height)));
            } else {
                i2 = (int) (((float) height) * (((float) i) / ((float) width)));
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i, i2, true);
            MethodCollector.m26664o(12322);
            return createScaledBitmap;
        }
        MethodCollector.m26664o(12322);
        return bitmap;
    }

    public static Bitmap loadBitmap(int i, String str, boolean z) {
        Bitmap.CompressFormat compressFormat;
        Bitmap.Config config;
        MethodCollector.m26663i(12436);
        Bitmap bitmapFromSD = getBitmapFromSD(str, i, z);
        if (bitmapFromSD == null) {
            MethodCollector.m26664o(12436);
            return null;
        }
        int width = bitmapFromSD.getWidth();
        int height = bitmapFromSD.getHeight();
        if (width > i + 150 || (width > i && height > 4000)) {
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmapFromSD, i, (int) (((((float) i) * 1.0f) * ((float) height)) / ((float) width)), true);
            bitmapFromSD.recycle();
            if (createScaledBitmap == null) {
                MethodCollector.m26664o(12436);
                return null;
            }
            bitmapFromSD = createScaledBitmap;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (z) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            compressFormat = Bitmap.CompressFormat.JPEG;
        }
        bitmapFromSD.compress(compressFormat, 80, byteArrayOutputStream);
        bitmapFromSD.recycle();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPurgeable = true;
        if (z) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.RGB_565;
        }
        options.inPreferredConfig = config;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        MethodCollector.m26664o(12436);
        return decodeByteArray;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (0 == 0) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean saveImageData(byte[] r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = 11896(0x2e78, float:1.667E-41)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r4)
            r3 = 0
            r2 = 0
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0046, all -> 0x0041 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x0046, all -> 0x0041 }
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0046, all -> 0x0041 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.mkdirs()     // Catch:{ Exception -> 0x0046, all -> 0x0041 }
            if (r0 != 0) goto L_0x0022
            boolean r0 = r1.exists()     // Catch:{ Exception -> 0x0046, all -> 0x0041 }
            if (r0 != 0) goto L_0x0022
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r3
        L_0x0022:
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r7)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r0)
            r1.write(r5)     // Catch:{ Exception -> 0x003f, all -> 0x003a }
            r1.flush()     // Catch:{ Exception -> 0x003f, all -> 0x003a }
            r1.close()     // Catch:{ Exception -> 0x003f, all -> 0x003a }
            r0 = 1
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r0
        L_0x003a:
            r0 = move-exception
            r1.close()     // Catch:{ Exception -> 0x0042 }
            goto L_0x0042
        L_0x003f:
            r2 = r1
            goto L_0x0048
        L_0x0041:
            r0 = move-exception
        L_0x0042:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            throw r0
        L_0x0046:
            if (r2 == 0) goto L_0x004b
        L_0x0048:
            r2.close()     // Catch:{ Exception -> 0x004b }
        L_0x004b:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.saveImageData(byte[], java.lang.String, java.lang.String):boolean");
    }

    public static boolean saveBitmapToSD(Bitmap bitmap, String str, String str2) {
        Throwable th;
        Exception e;
        MethodCollector.m26663i(11726);
        if ("mounted".equals(Environment.getExternalStorageState())) {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file + "/" + str2);
            if (!file2.exists()) {
                try {
                    file2.createNewFile();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    MethodCollector.m26664o(11726);
                    return false;
                }
            }
            FileOutputStream fileOutputStream = null;
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2);
                    fileOutputStream2.flush();
                    try {
                        fileOutputStream2.close();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                    }
                    MethodCollector.m26664o(11726);
                    return true;
                } catch (Exception e4) {
                    e = e4;
                    fileOutputStream = fileOutputStream2;
                    try {
                        e.printStackTrace();
                        try {
                            fileOutputStream.close();
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        MethodCollector.m26664o(11726);
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            fileOutputStream.close();
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                        MethodCollector.m26664o(11726);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = fileOutputStream2;
                    fileOutputStream.close();
                    MethodCollector.m26664o(11726);
                    throw th;
                }
            } catch (Exception e7) {
                e = e7;
                e.printStackTrace();
                fileOutputStream.close();
                MethodCollector.m26664o(11726);
                return false;
            }
        } else {
            MethodCollector.m26664o(11726);
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:3|4|5|6|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0014 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap getBitmapFromSD(java.lang.String r4, int r5, boolean r6) {
        /*
            java.io.File r3 = new java.io.File
            r3.<init>(r4)
            boolean r0 = r3.exists()
            r2 = 0
            if (r0 != 0) goto L_0x000d
            return r2
        L_0x000d:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0014 }
            r3.setLastModified(r0)     // Catch:{ Exception -> 0x0014 }
        L_0x0014:
            android.graphics.Bitmap r0 = decodeBitmap(r3, r5, r6)     // Catch:{ Exception -> 0x0019 }
            return r0
        L_0x0019:
            r0 = move-exception
            r0.printStackTrace()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.getBitmapFromSD(java.lang.String, int, boolean):android.graphics.Bitmap");
    }

    public static Bitmap decodeBitmap(File file, int i, boolean z) {
        Bitmap.Config config;
        MethodCollector.m26663i(11395);
        Bitmap bitmap = null;
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            FileInputStream fileInputStream = new FileInputStream(file);
            BitmapFactory.decodeStream(fileInputStream, null, options);
            fileInputStream.close();
            if (options.outWidth <= 0 || options.outHeight <= 0) {
                m24394x39a095ac(file);
                MethodCollector.m26664o(11395);
                return null;
            }
            int i2 = 1;
            while (options.outWidth >= i * 2 && options.outHeight >= 4000) {
                options.outWidth /= 2;
                options.outHeight /= 2;
                i2 *= 2;
            }
            BitmapFactory.Options options2 = new BitmapFactory.Options();
            options2.inSampleSize = i2;
            options2.inPurgeable = true;
            if (z) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = Bitmap.Config.RGB_565;
            }
            options2.inPreferredConfig = config;
            FileInputStream fileInputStream2 = new FileInputStream(file);
            bitmap = BitmapFactory.decodeStream(fileInputStream2, null, options2);
            fileInputStream2.close();
            if (bitmap == null) {
                m24394x39a095ac(file);
            }
            MethodCollector.m26664o(11395);
            return bitmap;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2, int i3) {
        return getBitmapFromSD(str, i, i2, i3, null);
    }

    public static Bitmap decodeBitmap(ContentResolver contentResolver, Uri uri, int i, int i2) {
        MethodCollector.m26663i(12551);
        byte[] bArr = null;
        if (contentResolver == null || uri == null || i <= 0 || i2 <= 0) {
            MethodCollector.m26664o(12551);
            return null;
        }
        try {
            InputStream openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream == null) {
                MethodCollector.m26664o(12551);
                return null;
            }
            byte[] bArr2 = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = openInputStream.read(bArr2);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr2, 0, read);
            }
            bArr = byteArrayOutputStream.toByteArray();
            Bitmap decodeBitmap = decodeBitmap(bArr, i, i2);
            MethodCollector.m26664o(12551);
            return decodeBitmap;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Bitmap decodeBitmap(Context context, int i, int i2, int i3) {
        MethodCollector.m26663i(12659);
        if (context == null || i == 0 || i2 <= 0 || i3 <= 0) {
            MethodCollector.m26664o(12659);
            return null;
        }
        Resources resources = context.getResources();
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(resources, i, options);
            int i4 = options.outWidth;
            int i5 = options.outHeight;
            int i6 = 1;
            while (true) {
                if (i4 / 2 >= i2 || i5 / 2 >= i3) {
                    i4 /= 2;
                    i5 /= 2;
                    i6 *= 2;
                } else {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = i6;
                    options2.inPurgeable = true;
                    options2.inPreferredConfig = Bitmap.Config.RGB_565;
                    return BitmapFactory.decodeResource(resources, i, options2);
                }
            }
        } catch (Exception unused) {
            return null;
        } finally {
            MethodCollector.m26664o(12659);
        }
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2, Bitmap.Config config) {
        return getBitmapFromSD(str, i, i2, -1, config);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e A[SYNTHETIC, Splitter:B:36:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0078 A[SYNTHETIC, Splitter:B:45:0x0078] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap decodeBitmap(java.io.File r8, int r9, int r10, android.graphics.Bitmap.Config r11) {
        /*
        // Method dump skipped, instructions count: 127
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.utility.BitmapUtils.decodeBitmap(java.io.File, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public static Bitmap getBitmapFromSD(String str, int i, int i2, int i3, Bitmap.Config config) {
        try {
            File file = new File(str);
            if (!file.isFile()) {
                return null;
            }
            if (i3 <= 0 || file.length() <= ((long) i3)) {
                try {
                    file.setLastModified(System.currentTimeMillis());
                } catch (Exception unused) {
                }
                return decodeBitmap(file, i, i2, config);
            }
            m24394x39a095ac(file);
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }
}
