package com.p2082ss.android.ugc.aweme.live.alphaplayer.p3404f;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.live.alphaplayer.p3401c.C58527b;

/* renamed from: com.ss.android.ugc.aweme.live.alphaplayer.f.a */
public final class C58572a {
    static {
        Covode.recordClassIndex(68867);
    }

    /* renamed from: a */
    public static Bitmap m107675a(C58527b bVar) {
        MethodCollector.m26663i(1737);
        if (TextUtils.isEmpty(bVar.f133265e)) {
            MethodCollector.m26664o(1737);
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setStyle(Paint.Style.FILL);
        if (bVar.f133268h) {
            textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
        if (bVar.f133267g <= 0) {
            bVar.f133267g = 36;
        }
        textPaint.setTextSize(((float) bVar.f133267g) * 0.6f);
        if (TextUtils.isEmpty(bVar.f133266f)) {
            bVar.f133266f = "#FF000000";
        }
        textPaint.setColor(Color.parseColor(bVar.f133266f));
        Rect rect = new Rect();
        textPaint.getTextBounds(bVar.f133265e, 0, bVar.f133265e.length(), rect);
        int width = rect.width();
        int height = rect.height();
        rect.set(0, 0, width, height);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        createBitmap.eraseColor(0);
        Paint.FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        canvas.drawText(bVar.f133265e, (float) rect.centerX(), (float) ((rect.centerY() + ((fontMetricsInt.bottom - fontMetricsInt.top) / 2)) - fontMetricsInt.bottom), textPaint);
        MethodCollector.m26664o(1737);
        return createBitmap;
    }
}
