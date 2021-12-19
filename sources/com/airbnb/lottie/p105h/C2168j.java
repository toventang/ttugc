package com.airbnb.lottie.p105h;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p099e.p101b.C2065c;
import com.airbnb.lottie.p104g.C2144d;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.h.j */
public final class C2168j implements AbstractC2159af<C2065c> {

    /* renamed from: a */
    private int f6522a;

    static {
        Covode.recordClassIndex(2363);
    }

    public C2168j(int i) {
        this.f6522a = i;
    }

    /* renamed from: a */
    private void m6726a(C2065c cVar, List<Float> list) {
        double d;
        int i = this.f6522a * 4;
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
            for (int i3 = 0; i3 < cVar.f6186b.length; i3++) {
                int i4 = cVar.f6186b[i3];
                double d2 = (double) cVar.f6185a[i3];
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
                cVar.f6186b[i3] = Color.argb((int) (d * 255.0d), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.airbnb.lottie.p105h.AbstractC2159af
    /* renamed from: a */
    public final /* synthetic */ C2065c mo6078a(JsonReader jsonReader, float f) {
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
        if (this.f6522a == -1) {
            this.f6522a = arrayList.size() / 4;
        }
        int i = this.f6522a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f6522a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 != 0) {
                if (i6 == 1) {
                    Double.isNaN(floatValue);
                    i2 = (int) (floatValue * 255.0d);
                } else if (i6 == 2) {
                    Double.isNaN(floatValue);
                    i3 = (int) (floatValue * 255.0d);
                } else if (i6 == 3) {
                    Double.isNaN(floatValue);
                    iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
                }
            } else if (C2144d.C2145a.f6479a) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else {
                fArr[i5] = (float) floatValue;
            }
        }
        C2065c cVar = new C2065c(fArr, iArr);
        m6726a(cVar, arrayList);
        return cVar;
    }
}
