package com.p2082ss.android.vesdk.utils;

import android.content.ContentResolver;
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
import com.p2082ss.android.vesdk.C85315al;
import com.p2082ss.android.vesdk.C85616y;
import java.io.FileNotFoundException;
import java.io.IOException;

/* renamed from: com.ss.android.vesdk.utils.BitmapLoader */
public class BitmapLoader {
    public static boolean isSampleSizeRound;
    public static int maxSide = 4096;

    public static int UpAlignPo2(int i, int i2) {
        return ((i + i2) - 1) & ((i2 - 1) ^ -1);
    }

    /* renamed from: com.ss.android.vesdk.utils.BitmapLoader$a */
    public enum EnumC85576a {
        INVALID(-1),
        ROTATION_0(0),
        ROTATION_90(90),
        ROTATION_180(LiveFeedRefreshTimeSetting.DEFAULT),
        ROTATION_270(270);
        

        /* renamed from: a */
        private int f191749a;

        public final int getRotation() {
            return this.f191749a;
        }

        static {
            Covode.recordClassIndex(99758);
        }

        private EnumC85576a(int i) {
            this.f191749a = i;
        }
    }

    static {
        Covode.recordClassIndex(99757);
    }

    private static Bitmap makeDimensionEven(Bitmap bitmap) {
        boolean z;
        MethodCollector.m26663i(3281);
        if (bitmap == null) {
            MethodCollector.m26664o(3281);
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
                MethodCollector.m26664o(3281);
                return bitmap;
            } else if (width <= 0 || height <= 0) {
                MethodCollector.m26664o(3281);
                return null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height);
                bitmap.recycle();
                MethodCollector.m26664o(3281);
                return createBitmap;
            }
        } catch (OutOfMemoryError e) {
            e.getMessage();
            MethodCollector.m26664o(3281);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x007d A[SYNTHETIC, Splitter:B:40:0x007d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point getPictureSize(android.content.ContentResolver r7, java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 137
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.utils.BitmapLoader.getPictureSize(android.content.ContentResolver, java.lang.String):android.graphics.Point");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0074, code lost:
        if (r4 == null) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getRotation(android.content.ContentResolver r6, java.lang.String r7) {
        /*
        // Method dump skipped, instructions count: 164
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.utils.BitmapLoader.getRotation(android.content.ContentResolver, java.lang.String):int");
    }

    public static Bitmap loadBitmap(String str, int i, int i2) {
        return loadBitmap(str, i, i2, EnumC85576a.INVALID, true);
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i, int i2) {
        return loadBitmapCompat(contentResolver, str, i, i2, EnumC85576a.INVALID, true);
    }

    private static int calculateInSampleSize(ContentResolver contentResolver, String str, int i, int i2) {
        MethodCollector.m26663i(3312);
        if (i == -1 || i2 == -1) {
            MethodCollector.m26664o(3312);
            return 1;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (!C85616y.m147707d(str)) {
            BitmapFactory.decodeFile(str, options);
        } else {
            Uri parse = Uri.parse(str);
            ParcelFileDescriptor parcelFileDescriptor = null;
            if (contentResolver == null) {
                try {
                    C85315al.m146642d("BitmapLoader", "contentResolver should not be null after Android Q");
                    MethodCollector.m26664o(3312);
                    return 1;
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                    if (0 != 0) {
                        parcelFileDescriptor.close();
                    }
                } catch (OutOfMemoryError e2) {
                    e2.getMessage();
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
                    MethodCollector.m26664o(3312);
                    throw th;
                }
            } else {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(parse, "r");
                if (openFileDescriptor == null) {
                    MethodCollector.m26664o(3312);
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
        MethodCollector.m26664o(3312);
        return max;
    }

    public static Bitmap loadBitmap(String str, int i, int i2, EnumC85576a aVar, boolean z) {
        return loadBitmap(str, i, i2, EnumC85576a.INVALID, true, false);
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

    public static Bitmap loadBitmap(String str, int i, int i2, EnumC85576a aVar, boolean z, boolean z2) {
        return loadBitmap(str, i, i2, EnumC85576a.INVALID, z, z2, false);
    }

    public static Bitmap loadBitmapCompat(ContentResolver contentResolver, String str, int i, int i2, EnumC85576a aVar, boolean z) {
        return loadBitmapCompat(contentResolver, str, i, i2, EnumC85576a.INVALID, true, false);
    }

    public static Bitmap loadBitmap(String str, int i, int i2, EnumC85576a aVar, boolean z, boolean z2, boolean z3) {
        int i3;
        ExifInterface exifInterface;
        MethodCollector.m26663i(3194);
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (i > 0 && i2 > 0) {
            options.inSampleSize = calculateInSampleSize(null, str, i, i2);
        }
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
            if (decodeFile == null) {
                MethodCollector.m26664o(3194);
                return null;
            }
            if (aVar == EnumC85576a.INVALID) {
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
                i3 = aVar.getRotation();
            }
            if (z3) {
                int[] calAutoScale = calAutoScale(i, i2, decodeFile.getWidth(), decodeFile.getHeight(), i3);
                i = calAutoScale[0];
                i2 = calAutoScale[1];
            }
            if (z2) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeFile, i, i2, true);
                if (!createScaledBitmap.sameAs(decodeFile) && !decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
                decodeFile = createScaledBitmap;
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
            MethodCollector.m26664o(3194);
            return decodeFile;
        } catch (OutOfMemoryError e2) {
            e2.getMessage();
            MethodCollector.m26664o(3194);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0060 A[SYNTHETIC, Splitter:B:30:0x0060] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d5 A[SYNTHETIC, Splitter:B:67:0x00d5] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap loadBitmapCompat(android.content.ContentResolver r9, java.lang.String r10, int r11, int r12, com.p2082ss.android.vesdk.utils.BitmapLoader.EnumC85576a r13, boolean r14, boolean r15) {
        /*
        // Method dump skipped, instructions count: 225
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.vesdk.utils.BitmapLoader.loadBitmapCompat(android.content.ContentResolver, java.lang.String, int, int, com.ss.android.vesdk.utils.BitmapLoader$a, boolean, boolean):android.graphics.Bitmap");
    }
}
