package com.p2082ss.avframework.livestreamv2.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bytedance.android.livesdk.livesetting.feed.LiveFeedRefreshTimeSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.ss.avframework.livestreamv2.utils.ImageLoadUtils */
public class ImageLoadUtils {
    public static boolean isSampleSizeRound;
    public static int maxSide = 4096;

    public static int UpAlignPo2(int i, int i2) {
        return ((i + i2) - 1) & ((i2 - 1) ^ -1);
    }

    /* renamed from: com_ss_avframework_livestreamv2_utils_ImageLoadUtils_com_ss_android_ugc_aweme_lancet_LogLancet_e */
    public static int m147789xcdb3d453(String str, String str2) {
        return 0;
    }

    /* renamed from: com.ss.avframework.livestreamv2.utils.ImageLoadUtils$ImageRotation */
    public enum ImageRotation {
        INVALID(-1),
        ROTATION_0(0),
        ROTATION_90(90),
        ROTATION_180(LiveFeedRefreshTimeSetting.DEFAULT),
        ROTATION_270(270);
        
        private int value;

        public final int getRotation() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(100622);
        }

        private ImageRotation(int i) {
            this.value = i;
        }
    }

    static {
        Covode.recordClassIndex(100621);
    }

    private static Bitmap makeDimensionEven(Bitmap bitmap) {
        boolean z;
        MethodCollector.m26663i(522);
        if (bitmap == null) {
            MethodCollector.m26664o(522);
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            boolean z2 = true;
            if ((bitmap.getWidth() & 1) == 1) {
                width = bitmap.getWidth() - 1;
                z = true;
            } else {
                z = false;
            }
            if ((bitmap.getHeight() & 1) == 1) {
                height = bitmap.getHeight() - 1;
            } else {
                z2 = z;
            }
            if (!z2) {
                MethodCollector.m26664o(522);
                return bitmap;
            } else if (width <= 0 || height <= 0) {
                MethodCollector.m26664o(522);
                return null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height);
                bitmap.recycle();
                MethodCollector.m26664o(522);
                return createBitmap;
            }
        } catch (OutOfMemoryError e) {
            m147789xcdb3d453("makeDimensionEven", e.getMessage());
            MethodCollector.m26664o(522);
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0069, code lost:
        if (r4 == null) goto L_0x0095;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getRotation(android.content.ContentResolver r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 153
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.utils.ImageLoadUtils.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i, int i2) {
        return loadBitmapCompat(contentResolver, str, i, i2, ImageRotation.INVALID, true);
    }

    public static Bitmap loadBitmapCompat(Context context, String str, int i, int i2) {
        return loadBitmapCompat(context.getContentResolver(), str, i, i2, ImageRotation.INVALID, true);
    }

    private static int calculateInSampleSize(ContentResolver contentResolver, String str, int i, int i2) {
        MethodCollector.m26663i(83);
        if (i == -1 || i2 == -1) {
            MethodCollector.m26664o(83);
            return 1;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (!str.startsWith("content")) {
            BitmapFactory.decodeFile(str, options);
        } else {
            Uri parse = Uri.parse(str);
            ParcelFileDescriptor parcelFileDescriptor = null;
            if (contentResolver == null) {
                try {
                    m147789xcdb3d453("ImageLoadUtils", "contentResolver should not be null after Android Q");
                    MethodCollector.m26664o(83);
                    return 1;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    if (0 != 0) {
                        parcelFileDescriptor.close();
                    }
                } catch (OutOfMemoryError e2) {
                    m147789xcdb3d453("loadBitmap", e2.getMessage());
                    if (0 != 0) {
                        parcelFileDescriptor.close();
                    }
                } catch (Throwable th) {
                    if (0 != 0) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                    MethodCollector.m26664o(83);
                    throw th;
                }
            } else {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor == null) {
                    MethodCollector.m26664o(83);
                    return 1;
                }
                BitmapFactory.decodeFileDescriptor(openFileDescriptor.getFileDescriptor(), new Rect(-1, -1, -1, -1), options);
                try {
                    openFileDescriptor.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
        }
        int i3 = options.outHeight;
        int i4 = options.outWidth;
        int i5 = 0;
        if (i2 <= i) {
            i2 = i;
            i = i2;
        }
        if (i3 > i4) {
            i4 = i3;
            i3 = i4;
        }
        if (i3 > i || i4 > i2) {
            float f = ((float) i4) / ((float) i2);
            float f2 = ((float) i3) / ((float) i);
            if (isSampleSizeRound) {
                i5 = Math.round(Math.max(f2, f));
                while (Math.max(i4, i3) / i5 > maxSide) {
                    i5 *= 2;
                }
            } else {
                i5 = (int) Math.max(f2, f);
            }
        }
        int max = Math.max(1, i5);
        MethodCollector.m26664o(83);
        return max;
    }

    public static int[] calAutoScale(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        int[] iArr = new int[2];
        if (i > 0 || i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (i5 == 90 || i5 == 270) {
            i4 = i3;
            i3 = i4;
        }
        if (z) {
            if (i <= 0) {
                i = (i2 * i3) / i4;
            }
            if (i2 <= 0) {
                i2 = (i4 * i) / i3;
            }
            i3 = UpAlignPo2(i, 2);
            i4 = UpAlignPo2(i2, 2);
        }
        if (i5 == 90 || i5 == 270) {
            i4 = i3;
            i3 = i4;
        }
        iArr[0] = i3;
        iArr[1] = i4;
        return iArr;
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i, int i2, ImageRotation imageRotation, boolean z) {
        return loadBitmapCompat(contentResolver, str, i, i2, ImageRotation.INVALID, z, false);
    }

    public static Bitmap loadBitmap(String str, int i, int i2, ImageRotation imageRotation, boolean z, boolean z2, boolean z3) {
        int i3;
        ExifInterface exifInterface;
        MethodCollector.m26663i(573);
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i > 0 && i2 > 0) {
            options.inSampleSize = calculateInSampleSize(null, str, i, i2);
        }
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            if (decodeFile == null) {
                m147789xcdb3d453("loadBitmap", "BitmapFactory.decodeFile failed, imgPath".concat(String.valueOf(str)));
                MethodCollector.m26664o(573);
                return null;
            }
            if (z2) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, i, i2, true);
                if (!createScaledBitmap.sameAs(decodeFile) && !decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
                decodeFile = createScaledBitmap;
            }
            if (imageRotation == ImageRotation.INVALID) {
                try {
                    exifInterface = new ExifInterface(str);
                } catch (IOException e) {
                    e.printStackTrace();
                    exifInterface = null;
                }
                if (exifInterface != null) {
                    int attributeInt = exifInterface.getAttributeInt("Orientation", 0);
                    if (attributeInt == 3) {
                        i3 = LiveFeedRefreshTimeSetting.DEFAULT;
                    } else if (attributeInt == 6) {
                        i3 = 90;
                    } else if (attributeInt == 8) {
                        i3 = 270;
                    }
                }
                i3 = 0;
            } else {
                i3 = imageRotation.getRotation();
            }
            if (z3) {
                int[] calAutoScale = calAutoScale(i, i2, decodeFile.getWidth(), decodeFile.getHeight(), i3);
                i = calAutoScale[0];
                i2 = calAutoScale[1];
            }
            if (z2) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeFile, i, i2, true);
                if (!createScaledBitmap2.sameAs(decodeFile) && !decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
                decodeFile = createScaledBitmap2;
            }
            if (i3 != 0) {
                Matrix matrix = new Matrix();
                matrix.postRotate((float) i3);
                Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
                if (!decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
                decodeFile = createBitmap;
            }
            if (z) {
                decodeFile = makeDimensionEven(decodeFile);
            }
            MethodCollector.m26664o(573);
            return decodeFile;
        } catch (OutOfMemoryError e2) {
            m147789xcdb3d453("loadBitmap", e2.getMessage());
            MethodCollector.m26664o(573);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090 A[SYNTHETIC, Splitter:B:31:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0117 A[SYNTHETIC, Splitter:B:68:0x0117] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap loadBitmapCompat(android.content.ContentResolver r15, java.lang.String r16, int r17, int r18, com.p2082ss.avframework.livestreamv2.utils.ImageLoadUtils.ImageRotation r19, boolean r20, boolean r21) {
        /*
        // Method dump skipped, instructions count: 291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.avframework.livestreamv2.utils.ImageLoadUtils.loadBitmapCompat(android.content.ContentResolver, java.lang.String, int, int, com.ss.avframework.livestreamv2.utils.ImageLoadUtils$ImageRotation, boolean, boolean):android.graphics.Bitmap");
    }
}
