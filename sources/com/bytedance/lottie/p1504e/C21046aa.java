package com.bytedance.lottie.p1504e;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.covode.number.Covode;
import com.bytedance.lottie.p1499c.C20976a;
import com.bytedance.lottie.p1499c.p1501b.C21006l;
import com.bytedance.lottie.p1505f.C21084f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.bytedance.lottie.e.aa */
public final class C21046aa implements AbstractC21051af<C21006l> {

    /* renamed from: a */
    public static final C21046aa f49936a = new C21046aa();

    private C21046aa() {
    }

    static {
        Covode.recordClassIndex(24662);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.lottie.p1504e.AbstractC21051af
    /* renamed from: a */
    public final /* synthetic */ C21006l mo34520a(JsonReader jsonReader, float f) {
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
        }
        jsonReader.beginObject();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName.hashCode()) {
                case 99:
                    if (!nextName.equals("c")) {
                        break;
                    } else {
                        z = jsonReader.nextBoolean();
                        break;
                    }
                case 105:
                    if (!nextName.equals("i")) {
                        break;
                    } else {
                        list2 = C21064n.m39652a(jsonReader, f);
                        break;
                    }
                case 111:
                    if (!nextName.equals("o")) {
                        break;
                    } else {
                        list3 = C21064n.m39652a(jsonReader, f);
                        break;
                    }
                case 118:
                    if (!nextName.equals("v")) {
                        break;
                    } else {
                        list = C21064n.m39652a(jsonReader, f);
                        break;
                    }
            }
        }
        jsonReader.endObject();
        if (jsonReader.peek() == JsonToken.END_ARRAY) {
            jsonReader.endArray();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new C21006l(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new C20976a(C21084f.m39708a(list.get(i2), list3.get(i2)), C21084f.m39708a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new C20976a(C21084f.m39708a(list.get(i3), list3.get(i3)), C21084f.m39708a(pointF3, list2.get(0)), pointF3));
            }
            return new C21006l(pointF, z, arrayList);
        }
    }
}
