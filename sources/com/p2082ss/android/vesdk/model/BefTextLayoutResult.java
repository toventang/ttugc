package com.p2082ss.android.vesdk.model;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ttve.nativePort.C30739f;

/* renamed from: com.ss.android.vesdk.model.BefTextLayoutResult */
public class BefTextLayoutResult {
    Bitmap bitmap;
    int height;
    int lineCount;
    int width;

    static {
        Covode.recordClassIndex(99693);
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public int getHeight() {
        return this.height;
    }

    public int getLineCount() {
        return this.lineCount;
    }

    public int getWidth() {
        return this.width;
    }

    public void setBitmap(Bitmap bitmap2) {
        this.bitmap = bitmap2;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLineCount(int i) {
        this.lineCount = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    public static BefTextLayoutResult readFromByteArray(byte[][] bArr) {
        Bitmap bitmap2;
        MethodCollector.m26663i(2239);
        C30739f fVar = new C30739f(bArr[0]);
        BefTextLayoutResult befTextLayoutResult = new BefTextLayoutResult();
        if (fVar.f73596a.length != 0) {
            bitmap2 = BitmapFactory.decodeByteArray(fVar.f73596a, 0, fVar.f73596a.length);
        } else {
            bitmap2 = null;
        }
        befTextLayoutResult.setBitmap(bitmap2);
        befTextLayoutResult.setWidth(fVar.mo55459a());
        befTextLayoutResult.setHeight(fVar.mo55459a());
        befTextLayoutResult.setLineCount(fVar.mo55459a());
        MethodCollector.m26664o(2239);
        return befTextLayoutResult;
    }
}
