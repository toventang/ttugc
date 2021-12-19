package com.amazing.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextPaint;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.regex.Pattern;

public class TextMeshUtils {
    static {
        Covode.recordClassIndex(2415);
    }

    private static float getDeviceDpi() {
        return (float) Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d2 A[SYNTHETIC, Splitter:B:48:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00dc A[SYNTHETIC, Splitter:B:57:0x00dc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String[] getAndroidSystemFontPaths() {
        /*
        // Method dump skipped, instructions count: 227
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazing.utils.TextMeshUtils.getAndroidSystemFontPaths():java.lang.String[]");
    }

    private static Bitmap callIStaticGenerateBitmapForEmoji(byte[] bArr, int i) {
        MethodCollector.m26663i(10061);
        String str = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize((float) i);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        Rect rect = new Rect();
        textPaint.getTextBounds(str, 0, str.length(), rect);
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawText(str, (float) (-rect.left), (float) (-rect.top), textPaint);
        canvas.save();
        canvas.restore();
        MethodCollector.m26664o(10061);
        return createBitmap;
    }

    /* renamed from: a */
    private static int m6820a(Canvas canvas, String str, float f, float f2, Paint paint, int i) {
        int width;
        Rect rect = new Rect();
        System.out.printf("the text space is: %d\n", Integer.valueOf(i));
        System.out.printf("the text length is: %d\n", Integer.valueOf(str.length()));
        int i2 = 0;
        int i3 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            String valueOf = String.valueOf(charAt);
            Math.round(paint.measureText(String.valueOf(charAt)));
            if (charAt > 55296) {
                i2++;
                String str2 = String.valueOf(charAt) + str.charAt(i2);
                if (i2 != 1) {
                    paint.getTextBounds(str, i2, i2 + 1, rect);
                    rect.width();
                }
                int width2 = rect.width() + (i / 2);
                f += (float) width2;
                i3 += width2;
                canvas.drawText(str2, f, f2, paint);
            } else {
                if (charAt == ' ') {
                    width = Math.round(paint.measureText(String.valueOf(str.charAt(i2)))) + i;
                } else {
                    paint.getTextBounds(str, i2, i2 + 1, rect);
                    if (charAt >= 128) {
                        width = rect.width() + (i / 2);
                        System.out.printf("%s is not NumOrLetters\n", Character.valueOf(charAt));
                    } else if (Pattern.compile("^[A-Za-z0-9_]+$").matcher(valueOf).matches()) {
                        width = rect.width() + i;
                        System.out.printf("%s is NumOrLetters\n", Character.valueOf(charAt));
                    } else {
                        width = rect.width() + (i * 2);
                    }
                    System.out.printf("%s is: %d, space is: %d, text is %d\n", Character.valueOf(str.charAt(i2)), Integer.valueOf(width), Integer.valueOf(i), Integer.valueOf(rect.width()));
                }
                f += (float) width;
                i3 += width;
                canvas.drawText(String.valueOf(str.charAt(i2)), f, f2, paint);
            }
            i2++;
        }
        return i3;
    }

    private static float[] generateImageSize(String str, float f, byte[] bArr, int i, boolean z, float f2, int i2, boolean z2, float f3, float f4, int i3, float f5) {
        String str2 = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(i);
        Rect rect = new Rect();
        float[] fArr = new float[str2.length()];
        textPaint.getTextWidths(str2, fArr);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        if (!z) {
            f2 = 0.0f;
        }
        if (!z2) {
            f3 = 0.0f;
            f4 = 0.0f;
        }
        return new float[]{(float) rect.left, (float) rect.right, (float) (-rect.bottom), (float) (-rect.top), fArr[0], (f2 + Math.max(Math.abs(f3), Math.abs(f4))) * f, textPaint.ascent(), textPaint.descent()};
    }

    private static Bitmap generateImage(String str, float f, byte[] bArr, int i, boolean z, float f2, int i2, boolean z2, float f3, float f4, int i3, float f5) {
        float f6 = f2;
        float f7 = f5;
        float f8 = f4;
        MethodCollector.m26663i(10222);
        String str2 = new String(bArr);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setColor(i);
        Rect rect = new Rect();
        textPaint.getTextWidths(str2, new float[str2.length()]);
        textPaint.getTextBounds(str2, 0, str2.length(), rect);
        int i4 = rect.left;
        int i5 = rect.right;
        int i6 = rect.bottom;
        int i7 = rect.top;
        float f9 = 0.0f;
        if (!z) {
            f6 = 0.0f;
        }
        if (!z2) {
            f8 = 0.0f;
            f7 = 0.0f;
        } else {
            f9 = f3;
        }
        float max = Math.max(Math.abs(f9), Math.abs(f8)) + f6;
        TextPaint textPaint2 = new TextPaint();
        if (z || z2) {
            textPaint2.setTextSize(f);
            textPaint2.setAntiAlias(true);
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setTextAlign(Paint.Align.LEFT);
            textPaint2.setStrokeWidth(f6 * 2.0f * f);
            textPaint2.setColor(i2);
            if (z2) {
                textPaint2.setShadowLayer(f7 * f, f9 * f, f8 * f, i3);
            }
        }
        float f10 = 2.0f * max * f;
        Bitmap createBitmap = Bitmap.createBitmap((int) (((float) rect.width()) + f10), (int) (((float) rect.height()) + f10), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        if (z || z2) {
            float f11 = max * f;
            canvas.drawText(str2, ((float) (-rect.left)) + f11, ((float) (-rect.top)) + f11, textPaint2);
        }
        float f12 = max * f;
        canvas.drawText(str2, ((float) (-rect.left)) + f12, ((float) (-rect.top)) + f12, textPaint);
        canvas.save();
        canvas.restore();
        MethodCollector.m26664o(10222);
        return createBitmap;
    }

    private static Bitmap callIStaticGenerateBitmapFromTextMesh(byte[] bArr, String str, int i, int i2, int i3, float f, int i4, float f2, int i5, float f3, float f4, float f5, int i6, int i7, int i8, int i9) {
        int i10 = i3;
        MethodCollector.m26663i(9904);
        String str2 = new String(bArr);
        Rect rect = new Rect(0, 0, i8, i9);
        Bitmap createBitmap = Bitmap.createBitmap(i8, i9, Bitmap.Config.ARGB_8888);
        Paint paint = new Paint();
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        Canvas canvas = new Canvas(createBitmap);
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(i2);
        float f6 = (float) i;
        textPaint.setTextSize(f6);
        textPaint.setAntiAlias(true);
        textPaint.setStyle(Paint.Style.FILL);
        if (i7 == 0) {
            textPaint.setTextAlign(Paint.Align.LEFT);
        } else if (i7 == 1) {
            textPaint.setTextAlign(Paint.Align.CENTER);
        } else {
            textPaint.setTextAlign(Paint.Align.RIGHT);
        }
        if ((i4 & 16) == 16) {
            textPaint.setUnderlineText(true);
        }
        if ((i4 & 32) == 32) {
            textPaint.setStrikeThruText(true);
        }
        if ((i4 & 4) == 4) {
            textPaint.setTextSkewX((-f) / 90.0f);
        }
        if ((i4 & 8) == 8) {
            textPaint.setFakeBoldText(true);
        }
        if ((i4 & 2) == 2) {
            textPaint.setShadowLayer(f3, f4, f5, i6);
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        float f7 = fontMetrics.top;
        float f8 = fontMetrics.bottom;
        String[] split = str2.split("\n");
        int length = split.length;
        if ((i4 & 1) == 1) {
            TextPaint textPaint2 = new TextPaint();
            textPaint2.setColor(i5);
            textPaint2.setTextSize(textPaint.getTextSize());
            textPaint2.setAntiAlias(textPaint.isAntiAlias());
            textPaint2.setStyle(Paint.Style.STROKE);
            textPaint2.setStrokeWidth((5.0f * f2) / f6);
            textPaint2.setTextAlign(textPaint.getTextAlign());
            textPaint2.setTextSkewX(textPaint.getTextSkewX());
            textPaint.setFakeBoldText(false);
            textPaint2.setFakeBoldText(true);
            float f9 = ((float) i10) / f6;
            float f10 = (-fontMetrics.ascent) + fontMetrics.descent;
            float f11 = f10 * 0.1f;
            int i11 = 0;
            while (i11 < length) {
                double centerY = (double) ((int) ((((float) rect.centerY()) - (f7 / 2.0f)) - (f8 / 2.0f)));
                double d = (double) (length - 1);
                Double.isNaN(d);
                double d2 = (double) i11;
                Double.isNaN(d2);
                double d3 = (d * 0.5d) - d2;
                double d4 = (double) (f11 + f10);
                Double.isNaN(d4);
                Double.isNaN(centerY);
                int i12 = (int) (centerY - (d3 * d4));
                if (Build.VERSION.SDK_INT >= 21) {
                    textPaint2.setLetterSpacing(f9);
                    if (i7 == 0) {
                        canvas.drawText(split[i11], (float) rect.left, (float) i12, textPaint2);
                    } else if (i7 == 1) {
                        canvas.drawText(split[i11], (float) rect.centerX(), (float) i12, textPaint2);
                    } else {
                        canvas.drawText(split[i11], (float) rect.right, (float) i12, textPaint2);
                    }
                } else {
                    Rect rect2 = new Rect();
                    textPaint.getTextBounds(split[i11], 0, split[i11].length(), rect2);
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < split[i11].length()) {
                        if (split[i11].charAt(i13) > 55296) {
                            i13++;
                            i14++;
                        }
                        i13++;
                    }
                    if (i7 == 0) {
                        m6820a(canvas, split[i11], 0.0f, (float) i12, textPaint2, i3);
                    } else if (i7 == 1) {
                        i3 = i3;
                        m6820a(canvas, split[i11], (float) ((((rect.width() - rect2.width()) + (i14 * i)) - ((str2.length() - 1) * i3)) / 2), (float) i12, textPaint2, i3);
                    } else {
                        i3 = i3;
                        m6820a(canvas, split[i11], (float) (((rect.width() - rect2.width()) + (i14 * i)) - ((str2.length() - 1) * i3)), (float) i12, textPaint2, i3);
                    }
                }
                i11++;
                i10 = i3;
            }
        }
        float f12 = ((float) i10) / f6;
        float f13 = (-fontMetrics.ascent) + fontMetrics.descent;
        float f14 = 0.1f * f13;
        for (int i15 = 0; i15 < length; i15++) {
            double centerY2 = (double) ((int) ((((float) rect.centerY()) - (f7 / 2.0f)) - (f8 / 2.0f)));
            double d5 = (double) (length - 1);
            Double.isNaN(d5);
            double d6 = (double) i15;
            Double.isNaN(d6);
            double d7 = (d5 * 0.5d) - d6;
            double d8 = (double) (f14 + f13);
            Double.isNaN(d8);
            Double.isNaN(centerY2);
            int i16 = (int) (centerY2 - (d7 * d8));
            if (Build.VERSION.SDK_INT >= 21) {
                textPaint.setLetterSpacing(f12);
                if (i7 == 0) {
                    canvas.drawText(split[i15], (float) rect.left, (float) i16, textPaint);
                } else if (i7 == 1) {
                    canvas.drawText(split[i15], (float) rect.centerX(), (float) i16, textPaint);
                } else {
                    canvas.drawText(split[i15], (float) rect.right, (float) i16, textPaint);
                }
            } else {
                Rect rect3 = new Rect();
                textPaint.getTextBounds(split[i15], 0, split[i15].length(), rect3);
                int i17 = 0;
                int i18 = 0;
                while (i17 < split[i15].length()) {
                    if (split[i15].charAt(i17) > 55296) {
                        i17++;
                        i18++;
                    }
                    i17++;
                }
                if (i7 == 0) {
                    m6820a(canvas, split[i15], 0.0f, (float) i16, textPaint, i3);
                } else if (i7 == 1) {
                    m6820a(canvas, split[i15], (float) ((((rect.width() - rect3.width()) + (i18 * i)) - ((str2.length() - 1) * i3)) / 2), (float) i16, textPaint, i3);
                } else {
                    m6820a(canvas, split[i15], (float) (((rect.width() - rect3.width()) + (i18 * i)) - ((str2.length() - 1) * i3)), (float) i16, textPaint, i3);
                }
            }
        }
        canvas.save();
        canvas.restore();
        MethodCollector.m26664o(9904);
        return createBitmap;
    }
}
