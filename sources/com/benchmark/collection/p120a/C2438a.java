package com.benchmark.collection.p120a;

import com.benchmark.tools.C2512a;
import com.benchmark.tools.C2522g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttffmpeg.FFmpegLibLoaderWrapper;
import java.util.ArrayList;

/* renamed from: com.benchmark.collection.a.a */
public final class C2438a extends C2522g {

    /* renamed from: a */
    public static volatile boolean f7339a;

    /* renamed from: b */
    protected static ArrayList<Object> f7340b = new ArrayList<>();

    static {
        Covode.recordClassIndex(2791);
    }

    /* renamed from: a */
    public static void m7275a() {
        if (!f7339a) {
            C2512a.m7381a();
            ArrayList arrayList = new ArrayList();
            arrayList.add("bytevc0");
            arrayList.addAll(FFmpegLibLoaderWrapper.m148177a());
            arrayList.add("ByteVC1_dec");
            arrayList.add("bytenn");
            arrayList.add("btch_collection");
            if (f7638d != null) {
                if (!f7638d.mo6980a(arrayList)) {
                    f7339a = false;
                    return;
                }
            } else if (!f7639e.mo6980a(arrayList)) {
                f7339a = false;
                return;
            }
            f7339a = true;
        }
    }
}
