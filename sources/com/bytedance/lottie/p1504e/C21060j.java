package com.bytedance.lottie.p1504e;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1499c.p1501b.C20994c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.lottie.e.j */
public final class C21060j implements AbstractC21051af<C20994c> {

    /* renamed from: a */
    private int f49940a;

    static {
        Covode.recordClassIndex(24676);
    }

    public C21060j(int i) {
        this.f49940a = i;
    }

    /* renamed from: a */
    private void m39646a(C20994c cVar, List<Float> list) {
        double d;
        int i = this.f49940a * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) list.get(i).floatValue();
                } else {
                    dArr2[i2] = (double) list.get(i).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < cVar.f49743b.length; i3++) {
                int i4 = cVar.f49743b[i3];
                double d2 = (double) cVar.f49742a[i3];
                int i5 = 1;
                while (true) {
                    if (i5 >= size) {
                        d = dArr2[size - 1];
                        break;
                    }
                    int i6 = i5 - 1;
                    double d3 = dArr[i6];
                    double d4 = dArr[i5];
                    if (dArr[i5] >= d2) {
                        Double.isNaN(d2);
                        double d5 = dArr2[i6];
                        d = d5 + (((d2 - d3) / (d4 - d3)) * (dArr2[i5] - d5));
                        break;
                    }
                    i5++;
                }
                cVar.f49743b[i3] = Color.argb((int) (d * 255.0d), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.lottie.p1504e.AbstractC21051af
    /* renamed from: a */
    public final /* synthetic */ C20994c mo34520a(JsonReader jsonReader, float f) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
            jsonReader.beginArray();
        } else {
            z = false;
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.f49940a == -1) {
            this.f49940a = arrayList.size() / 4;
        }
        int i = this.f49940a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f49940a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                Double.isNaN(floatValue);
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                Double.isNaN(floatValue);
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                Double.isNaN(floatValue);
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        C20994c cVar = new C20994c(fArr, iArr);
        m39646a(cVar, arrayList);
        return cVar;
    }
}
