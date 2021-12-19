package com.airbnb.lottie.p105h;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.airbnb.lottie.p099e.C2047a;
import com.airbnb.lottie.p099e.p101b.C2077l;
import com.airbnb.lottie.p106i.C2192f;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.h.aa */
public final class C2154aa implements AbstractC2159af<C2077l> {

    /* renamed from: a */
    public static final C2154aa f6518a = new C2154aa();

    private C2154aa() {
    }

    static {
        Covode.recordClassIndex(2349);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.airbnb.lottie.p105h.AbstractC2159af
    /* renamed from: a */
    public final /* synthetic */ C2077l mo6078a(JsonReader jsonReader, float f) {
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
                        list2 = C2172n.m6732a(jsonReader, f);
                        break;
                    }
                case 111:
                    if (!nextName.equals("o")) {
                        break;
                    } else {
                        list3 = C2172n.m6732a(jsonReader, f);
                        break;
                    }
                case 118:
                    if (!nextName.equals("v")) {
                        break;
                    } else {
                        list = C2172n.m6732a(jsonReader, f);
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
            return new C2077l(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i2 = i - 1;
                arrayList.add(new C2047a(C2192f.m6789a(list.get(i2), list3.get(i2)), C2192f.m6789a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i3 = size - 1;
                arrayList.add(new C2047a(C2192f.m6789a(list.get(i3), list3.get(i3)), C2192f.m6789a(pointF3, list2.get(0)), pointF3));
            }
            return new C2077l(pointF, z, arrayList);
        }
    }
}
