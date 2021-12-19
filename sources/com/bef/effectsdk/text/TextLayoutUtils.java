package com.bef.effectsdk.text;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bef.effectsdk.text.data.BitmapType;
import com.bef.effectsdk.text.data.CharLayout;
import com.bef.effectsdk.text.data.TextBitmapResult;
import com.bef.effectsdk.text.data.TextLayoutParam;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;

public class TextLayoutUtils {
    static {
        Covode.recordClassIndex(2732);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bef.effectsdk.text.TextLayoutUtils$1 */
    public static /* synthetic */ class C23971 {
        static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE;
        static final /* synthetic */ int[] $SwitchMap$com$bef$effectsdk$text$data$BitmapType;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|(2:5|6)|7|9|10|11|12|14) */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0033 */
        static {
            /*
                r0 = 2733(0xaad, float:3.83E-42)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE[] r0 = com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.bef.effectsdk.text.TextLayoutUtils.C23971.$SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE = r1
                r3 = 1
                com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE r0 = com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE.COLOR_TYPE_ALPHA     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0017 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                r2 = 2
                int[] r1 = com.bef.effectsdk.text.TextLayoutUtils.C23971.$SwitchMap$com$bef$effectsdk$text$TextLayoutUtils$COLOR_TYPE     // Catch:{ NoSuchFieldError -> 0x0022 }
                com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE r0 = com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE.COLOR_TYPE_RGBA     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.bef.effectsdk.text.data.BitmapType[] r0 = com.bef.effectsdk.text.data.BitmapType.values()
                int r0 = r0.length
                int[] r1 = new int[r0]
                com.bef.effectsdk.text.TextLayoutUtils.C23971.$SwitchMap$com$bef$effectsdk$text$data$BitmapType = r1
                com.bef.effectsdk.text.data.BitmapType r0 = com.bef.effectsdk.text.data.BitmapType.TEXT_BITMAP_SHAKE_ALPHA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r1[r0] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r1 = com.bef.effectsdk.text.TextLayoutUtils.C23971.$SwitchMap$com$bef$effectsdk$text$data$BitmapType     // Catch:{ NoSuchFieldError -> 0x003d }
                com.bef.effectsdk.text.data.BitmapType r0 = com.bef.effectsdk.text.data.BitmapType.TEXT_BITMAP_NEON_ALPHA     // Catch:{ NoSuchFieldError -> 0x003d }
                int r0 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r1[r0] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.C23971.<clinit>():void");
        }
    }

    enum COLOR_TYPE {
        COLOR_TYPE_RGBA,
        COLOR_TYPE_ALPHA;

        static {
            Covode.recordClassIndex(2734);
        }
    }

    public static String[] splitLyric(String str) {
        int i;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] split = str.replace("\n", " ").replace("\r", " ").split(" ");
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            StringBuilder sb = new StringBuilder();
            if ((i3 % 5) % 3 == 0) {
                i = 6;
            } else {
                i = 10;
            }
            int i4 = 0;
            while (i2 < split.length && (split[i2].length() + i4 + 1 <= i || i4 <= 3)) {
                i4 += split[i2].length() + 1;
                int i5 = i2 + 1;
                sb.append(split[i2]).append(" ");
                if (i5 == split.length - 1 && split[i5].length() < 3) {
                    sb.append(split[i5]);
                }
                i2 = i5;
            }
            i3++;
            arrayList.add(sb.substring(0, sb.length() - 1));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] lyricShakeSplit(String str) {
        boolean z;
        int length;
        if (str == null || str.isEmpty()) {
            return null;
        }
        String[] split = str.replace("\n", " ").replace(",", "").replace("\r", " ").split(" ");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < split.length) {
            if (!split[i].isEmpty()) {
                int length2 = sb.toString().length();
                if (length2 == 0) {
                    if (split[i].length() < 10) {
                        sb.append(split[i]);
                    } else if (split[i].length() == 10) {
                        arrayList.add(split[i]);
                    } else {
                        arrayList.add(split[i].substring(0, 10));
                        if ((split[i].length() - 10) % 9 == 0) {
                            z = true;
                            length = (split[i].length() - 10) / 9;
                        } else {
                            z = false;
                            length = ((split[i].length() - 10) / 9) + 1;
                        }
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            if (i2 != 0) {
                                int i3 = ((i2 - 1) * 9) + 19;
                                if (i2 < length - 1) {
                                    String sb2 = sb.append("-").append(split[i].substring(i3, (i2 * 9) + 19)).toString();
                                    arrayList.add(sb2);
                                    sb.delete(0, sb2.length());
                                } else if (z) {
                                    String sb3 = sb.append("-").append(split[i].substring(i3, (i2 * 9) + 19)).toString();
                                    arrayList.add(sb3);
                                    sb.delete(0, sb3.length());
                                } else {
                                    sb.append("-").append(split[i].substring(i3, split[i].length()));
                                }
                            } else if (z) {
                                String sb4 = sb.append("-").append(split[i].substring(10, 19)).toString();
                                arrayList.add(sb4);
                                sb.delete(0, sb4.length());
                            } else if (length == 1) {
                                sb.append("-").append(split[i].substring(10, split[i].length()));
                                break;
                            } else {
                                String sb5 = sb.append("-").append(split[i].substring(10, 19)).toString();
                                arrayList.add(sb5);
                                sb.delete(0, sb5.length());
                            }
                            i2++;
                        }
                    }
                } else if (sb.toString().length() + split[i].length() + 1 <= 10) {
                    sb.append(" ").append(split[i]);
                } else {
                    arrayList.add(sb.toString());
                    sb.delete(0, length2);
                    i--;
                }
            }
            i++;
        }
        if (sb.toString().length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static TextBitmapResult generateBitmapAtlasAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapAtlasUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapAtlasAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapAtlasUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapAtlasRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapAtlasUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapAtlasRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapAtlasUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapNeonAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapNeonAlphaUTF8(new String(iArr, 0, iArr.length), textLayoutParam);
    }

    public static TextBitmapResult generateBitmapNeonAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        int i = C23971.$SwitchMap$com$bef$effectsdk$text$data$BitmapType[BitmapType.valueOf(textLayoutParam.bitmapType).ordinal()];
        if (i == 1) {
            return generateTextAutoSizedShakeBitmap(str, textLayoutParam);
        }
        if (i != 2) {
            return null;
        }
        return generateTextAutoSizedNeonBitmap(str, textLayoutParam);
    }

    public static TextBitmapResult generateBitmapNormalAlphaUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapNormalUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapNormalAlphaUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapNormalUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_ALPHA);
    }

    public static TextBitmapResult generateBitmapNormalRGBAUTF32(int[] iArr, TextLayoutParam textLayoutParam) {
        if (iArr == null || iArr.length <= 0) {
            return null;
        }
        return generateBitmapNormalUTF8(new String(iArr, 0, iArr.length), textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateBitmapNormalRGBAUTF8(String str, TextLayoutParam textLayoutParam) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return generateBitmapNormalUTF8(str, textLayoutParam, COLOR_TYPE.COLOR_TYPE_RGBA);
    }

    public static TextBitmapResult generateTextAutoSizedNeonBitmap(String str, TextLayoutParam textLayoutParam) {
        boolean z;
        StaticLayout staticLayout;
        float f;
        float f2;
        float f3;
        MethodCollector.m26663i(4094);
        String[] splitLyric = splitLyric(str);
        if (TextUtils.isEmpty(str) || textLayoutParam == null) {
            MethodCollector.m26664o(4094);
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.LEFT);
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam.familyName) && !TextUtils.isEmpty(textLayoutParam.fontPath)) {
            textPaint.setTypeface(FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        boolean z2 = false;
        if (textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = splitLyric.length;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[splitLyric.length];
        int[] iArr = new int[splitLyric.length];
        float f4 = 0.0f;
        float f5 = 0.0f;
        for (int i = 0; i < splitLyric.length; i++) {
            int i2 = 10;
            String str2 = splitLyric[i];
            textPaint.setTextSize(10.0f);
            for (float measureText = textPaint.measureText(str2, 0, str2.length()); measureText <= ((float) textLayoutParam.lineWidth); measureText = textPaint.measureText(str2, 0, str2.length())) {
                i2 += 2;
                textPaint.setTextSize((float) i2);
            }
            iArr[i] = i2 - 2;
            textPaint.setTextSize((float) iArr[i]);
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            if (z) {
                f2 = fontMetrics.bottom;
                f3 = fontMetrics.top;
            } else {
                f2 = fontMetrics.descent;
                f3 = fontMetrics.ascent;
            }
            f5 += f2 - f3;
        }
        Bitmap createBitmap = Bitmap.createBitmap(textLayoutParam.lineWidth, (int) f5, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        textBitmapResult.bitmap = createBitmap;
        int i3 = 0;
        float f6 = 0.0f;
        while (i3 < splitLyric.length) {
            String str3 = splitLyric[i3];
            textPaint.setTextSize((float) iArr[i3]);
            Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
            if (Build.VERSION.SDK_INT >= 23) {
                int length = str3.length();
                int width = canvas.getWidth();
                int i4 = z2 ? 1 : 0;
                int i5 = z2 ? 1 : 0;
                int i6 = z2 ? 1 : 0;
                staticLayout = StaticLayout.Builder.obtain(str3, i4, length, textPaint, width).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(f4, 1.0f).setIncludePad(z2).build();
            } else {
                staticLayout = new StaticLayout(str3, 0, str3.length(), textPaint, canvas.getWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            staticLayout.draw(canvas);
            CharLayout charLayout = new CharLayout();
            if (z) {
                f = fontMetrics2.bottom - fontMetrics2.top;
                charLayout.baseline = (f6 - fontMetrics2.top) / f5;
            } else {
                f = fontMetrics2.descent - fontMetrics2.ascent;
                charLayout.baseline = (f6 - fontMetrics2.ascent) / f5;
            }
            charLayout.top = f6 / f5;
            f6 += f;
            charLayout.bottom = f6 / f5;
            charLayout.left = 0.0f;
            charLayout.right = 1.0f;
            textBitmapResult.charLayouts[i3] = charLayout;
            canvas.translate(0.0f, f);
            i3++;
            f4 = 0.0f;
            z2 = false;
        }
        MethodCollector.m26664o(4094);
        return textBitmapResult;
    }

    public static TextBitmapResult generateTextAutoSizedShakeBitmap(String str, TextLayoutParam textLayoutParam) {
        boolean z;
        StaticLayout staticLayout;
        MethodCollector.m26663i(4475);
        String[] lyricShakeSplit = lyricShakeSplit(str);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(4475);
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        if (!TextUtils.isEmpty(textLayoutParam.familyName) && !TextUtils.isEmpty(textLayoutParam.fontPath)) {
            textPaint.setTypeface(FontCache.getFromFile(textLayoutParam.fontPath, textLayoutParam.familyName));
        }
        textPaint.setTextSize(textLayoutParam.fontSize);
        boolean z2 = false;
        if (textPaint.getFontMetrics().top < textPaint.getFontMetrics().ascent) {
            z = true;
        } else {
            z = false;
        }
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        ArrayList arrayList = new ArrayList();
        float f = (float) textLayoutParam.lineWidth;
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i = 0;
        int i2 = 0;
        while (i2 < lyricShakeSplit.length) {
            String str2 = lyricShakeSplit[i2];
            if (Build.VERSION.SDK_INT >= 23) {
                int i3 = z2 ? 1 : 0;
                int i4 = z2 ? 1 : 0;
                int i5 = z2 ? 1 : 0;
                staticLayout = StaticLayout.Builder.obtain(str2, i3, str2.length(), textPaint, (int) f).setAlignment(Layout.Alignment.ALIGN_OPPOSITE).setLineSpacing(f2, 1.0f).setIncludePad(z2).build();
            } else {
                staticLayout = r19;
                StaticLayout staticLayout2 = new StaticLayout(str2, 0, str2.length(), textPaint, (int) f, Layout.Alignment.ALIGN_OPPOSITE, 1.0f, 0.0f, false);
            }
            i += staticLayout.getLineCount();
            arrayList.add(staticLayout);
            f3 += (float) staticLayout.getHeight();
            i2++;
            f2 = 0.0f;
            z2 = false;
        }
        TextBitmapResult textBitmapResult = new TextBitmapResult();
        textBitmapResult.channel = 1;
        textBitmapResult.lineCount = i;
        textBitmapResult.type = 0;
        textBitmapResult.charLayouts = new CharLayout[i];
        Bitmap createBitmap = Bitmap.createBitmap(textLayoutParam.lineWidth, (int) f3, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(createBitmap);
        textBitmapResult.bitmap = createBitmap;
        float f4 = 0.0f;
        int i6 = 0;
        for (int i7 = 0; i7 < lyricShakeSplit.length; i7++) {
            float height = (float) ((StaticLayout) arrayList.get(i7)).getHeight();
            float lineCount = height / ((float) ((StaticLayout) arrayList.get(i7)).getLineCount());
            for (int i8 = 0; i8 < ((StaticLayout) arrayList.get(i7)).getLineCount(); i8++) {
                CharLayout charLayout = new CharLayout();
                float lineWidth = ((StaticLayout) arrayList.get(i7)).getLineWidth(i8);
                if (z) {
                    charLayout.baseline = (f4 - fontMetrics.top) / f3;
                } else {
                    charLayout.baseline = (f4 - fontMetrics.ascent) / f3;
                }
                charLayout.top = f4 / f3;
                f4 += lineCount;
                charLayout.bottom = (f4 - (Math.abs(fontMetrics.bottom - fontMetrics.descent) / 2.0f)) / f3;
                if (textLayoutParam.textAlign == 0) {
                    charLayout.left = 0.0f;
                    charLayout.right = (f - lineWidth) / f;
                } else {
                    charLayout.left = (f - lineWidth) / f;
                    charLayout.right = 1.0f;
                }
                textBitmapResult.charLayouts[i6] = charLayout;
                i6++;
            }
            ((StaticLayout) arrayList.get(i7)).draw(canvas);
            canvas.translate(0.0f, height * ((float) ((StaticLayout) arrayList.get(i7)).getLineCount()));
        }
        MethodCollector.m26664o(4475);
        return textBitmapResult;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02e7  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x032e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0340  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0349  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bef.effectsdk.text.data.TextBitmapResult generateBitmapAtlasUTF8(java.lang.String r27, com.bef.effectsdk.text.data.TextLayoutParam r28, com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE r29) {
        /*
        // Method dump skipped, instructions count: 957
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.generateBitmapAtlasUTF8(java.lang.String, com.bef.effectsdk.text.data.TextLayoutParam, com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE):com.bef.effectsdk.text.data.TextBitmapResult");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bef.effectsdk.text.data.TextBitmapResult generateBitmapNormalUTF8(java.lang.String r28, com.bef.effectsdk.text.data.TextLayoutParam r29, com.bef.effectsdk.text.TextLayoutUtils.COLOR_TYPE r30) {
        /*
        // Method dump skipped, instructions count: 785
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.text.TextLayoutUtils.generateBitmapNormalUTF8(java.lang.String, com.bef.effectsdk.text.data.TextLayoutParam, com.bef.effectsdk.text.TextLayoutUtils$COLOR_TYPE):com.bef.effectsdk.text.data.TextBitmapResult");
    }
}
