package com.p2082ss.android.ugc.aweme.watermark;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.watermark.c */
public class C81489c {

    /* renamed from: b */
    private static final String f182195b = C81489c.class.getSimpleName();

    /* renamed from: a */
    public Bitmap f182196a;

    static {
        Covode.recordClassIndex(94862);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if (r2 == null) goto L_0x0045;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004b A[SYNTHETIC, Splitter:B:31:0x004b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo125202a(java.lang.String r7) {
        /*
            r6 = this;
            r5 = 4374(0x1116, float:6.129E-42)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r5)
            android.graphics.Bitmap r0 = r6.f182196a
            r4 = 0
            if (r0 != 0) goto L_0x0013
            java.lang.String r0 = "mBitmap is null"
            com.p2082ss.android.ugc.tools.utils.C84911q.m145926b(r0)
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r4
        L_0x0013:
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0035 }
            r3.<init>(r7)     // Catch:{ FileNotFoundException -> 0x0035 }
            android.graphics.Bitmap r2 = r6.f182196a     // Catch:{ FileNotFoundException -> 0x0032, all -> 0x002f }
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ FileNotFoundException -> 0x0032, all -> 0x002f }
            r0 = 100
            r2.compress(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0032, all -> 0x002f }
            r3.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x002a
        L_0x0026:
            r0 = move-exception
            r0.printStackTrace()
        L_0x002a:
            r0 = 1
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r0
        L_0x002f:
            r1 = move-exception
            r2 = r3
            goto L_0x003d
        L_0x0032:
            r0 = move-exception
            r2 = r3
            goto L_0x0036
        L_0x0035:
            r0 = move-exception
        L_0x0036:
            r0.printStackTrace()     // Catch:{ all -> 0x003a }
            goto L_0x0049
        L_0x003a:
            r1 = move-exception
            if (r2 == 0) goto L_0x0045
        L_0x003d:
            r2.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0045:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            throw r1
        L_0x0049:
            if (r2 == 0) goto L_0x0053
            r2.close()     // Catch:{ IOException -> 0x004f }
            goto L_0x0053
        L_0x004f:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0053:
            com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.watermark.C81489c.mo125202a(java.lang.String):boolean");
    }

    /* renamed from: a */
    public final C81489c mo125199a(int i, int i2, String str, Bitmap bitmap, boolean z, boolean z2) {
        float f;
        int i3;
        float width;
        float f2;
        float f3;
        float f4;
        float width2;
        float f5;
        MethodCollector.m26663i(4561);
        if (i == 0 || i2 == 0) {
            f = 1.0f;
        } else {
            f = Math.min(((float) i) / 750.0f, ((float) i2) / 750.0f);
        }
        Resources resources = C63238c.f143574a.getResources();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (90.0f * f), (int) (87.0f * f), true);
        if (TextUtils.isEmpty(str)) {
            this.f182196a = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources.getColor(R.color.o1));
            float f6 = 20.0f * f;
            textPaint.setTextSize(f6);
            C30745b.m63132b(C63238c.f143574a, 1.0f);
            textPaint.setShadowLayer(0.0f, 1.0f, 4.0f, resources.getColor(R.color.fj));
            int i4 = (int) f6;
            int measureText = (int) (textPaint.measureText(str) + (5.0f * f));
            int width3 = createScaledBitmap.getWidth();
            if (z) {
                i3 = ((int) Math.ceil((double) (f * 4.0f))) + i4;
            } else {
                i3 = 0;
            }
            int max = Math.max(width3, i3 + measureText);
            Bitmap createBitmap = Bitmap.createBitmap(max, (int) (((float) createScaledBitmap.getHeight()) + (28.0f * f)), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            if (z) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, 2131232704, null), i4, i4, true);
                if (z2) {
                    f4 = 0.0f;
                } else {
                    f4 = ((float) (max - measureText)) - (((float) i4) + (f * 4.0f));
                }
                canvas.drawBitmap(createScaledBitmap2, f4, ((float) createScaledBitmap.getHeight()) + (6.0f * f), paint);
                if (z2) {
                    width2 = 0.0f;
                } else {
                    width2 = (float) ((max - createScaledBitmap.getWidth()) + 3);
                }
                canvas.drawBitmap(createScaledBitmap, width2, 0.0f, paint);
                if (z2) {
                    f5 = ((float) i4) + (f * 4.0f);
                } else {
                    f5 = (float) (max - measureText);
                }
                canvas.drawText(str, f5, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) + (f * 4.0f), textPaint);
            } else {
                if (z2) {
                    f2 = 0.0f;
                    width = 0.0f;
                } else {
                    width = (float) ((max - createScaledBitmap.getWidth()) + 3);
                    f2 = 0.0f;
                }
                canvas.drawBitmap(createScaledBitmap, width, f2, paint);
                if (z2) {
                    f3 = 0.0f;
                } else {
                    f3 = (float) (max - measureText);
                }
                canvas.drawText(str, f3, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) + (f * 4.0f), textPaint);
            }
            this.f182196a = createBitmap;
        }
        MethodCollector.m26664o(4561);
        return this;
    }

    /* renamed from: a */
    public final C81489c mo125200a(int i, int i2, String str, Bitmap bitmap, boolean z, boolean z2, C81490d dVar) {
        float f;
        int i3;
        float width;
        float f2;
        float width2;
        float f3;
        float f4;
        MethodCollector.m26663i(4531);
        if (i == 0 || i2 == 0) {
            f = 1.0f;
        } else {
            f = Math.min(((float) i) / 750.0f, ((float) i2) / 750.0f);
        }
        Resources resources = C63238c.f143574a.getResources();
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (90.0f * f), (int) (87.0f * f), true);
        if (TextUtils.isEmpty(str)) {
            this.f182196a = createScaledBitmap;
        } else {
            TextPaint textPaint = new TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTypeface(Typeface.DEFAULT_BOLD);
            textPaint.setColor(resources.getColor(R.color.o1));
            float f5 = 20.0f * f;
            textPaint.setTextSize(f5);
            float b = C30745b.m63132b(C63238c.f143574a, 1.0f);
            float f6 = b * 4.0f;
            float f7 = 0.0f;
            textPaint.setShadowLayer(0.0f, b, f6, resources.getColor(R.color.fj));
            int i4 = (int) f5;
            int measureText = (int) (textPaint.measureText(str) + (5.0f * f));
            int width3 = createScaledBitmap.getWidth();
            if (z) {
                i3 = ((int) Math.ceil((double) (f * 4.0f))) + i4;
            } else {
                i3 = 0;
            }
            int max = Math.max(width3, i3 + measureText);
            Bitmap createBitmap = Bitmap.createBitmap(max, (int) (((float) createScaledBitmap.getHeight()) + (28.0f * f)), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setShadowLayer(0.0f, b, f6, resources.getColor(R.color.fj));
            if (z) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, dVar.f182197a, null), i4, i4, true);
                if (z2) {
                    f2 = 0.0f;
                } else {
                    f2 = ((float) (max - measureText)) - (((float) i4) + (f * 4.0f));
                }
                canvas.drawBitmap(createScaledBitmap2, f2, ((float) createScaledBitmap.getHeight()) + (6.0f * f), paint);
                if (z2) {
                    width2 = 0.0f;
                } else {
                    width2 = (float) ((max - createScaledBitmap.getWidth()) + 3);
                }
                canvas.drawBitmap(createScaledBitmap, width2, 0.0f, paint);
                if (z2) {
                    float f8 = (float) i4;
                    f3 = 4.0f;
                    f4 = f8 + (f * 4.0f);
                } else {
                    f3 = 4.0f;
                    f4 = (float) (max - measureText);
                }
                canvas.drawText(str, f4, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) + (f * f3), textPaint);
            } else {
                if (z2) {
                    width = 0.0f;
                } else {
                    width = (float) ((max - createScaledBitmap.getWidth()) + 3);
                }
                canvas.drawBitmap(createScaledBitmap, width, 0.0f, paint);
                if (!z2) {
                    f7 = (float) (max - measureText);
                }
                canvas.drawText(str, f7, (((float) createScaledBitmap.getHeight()) - textPaint.ascent()) + (f * 4.0f), textPaint);
            }
            this.f182196a = createBitmap;
        }
        MethodCollector.m26664o(4531);
        return this;
    }

    /* renamed from: a */
    public final C81489c mo125201a(int i, int i2, String str, String str2, boolean z, boolean z2, boolean z3, C81490d dVar) {
        MethodCollector.m26663i(4389);
        Bitmap decodeFile = BitmapFactory.decodeFile(str2);
        if (decodeFile == null) {
            C40970e.m82485a("I18nWaterMarkImage --> pic Path   => ".concat(String.valueOf(str2)));
            File file = new File(str2);
            C40970e.m82485a("I18nWaterMarkImage --> pic exists => " + file.exists());
            C40970e.m82485a("I18nWaterMarkImage --> pic size   => " + file.length());
            MethodCollector.m26664o(4389);
            return this;
        } else if (!z2) {
            C81489c a = mo125200a(i, i2, str, decodeFile, z, z3, dVar);
            MethodCollector.m26664o(4389);
            return a;
        } else {
            C81489c a2 = mo125199a(i, i2, str, decodeFile, z, z3);
            MethodCollector.m26664o(4389);
            return a2;
        }
    }
}
