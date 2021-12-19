package dmt.p4542av.video;

import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: dmt.av.video.a */
public final class C88151a {

    /* renamed from: a */
    public static final SparseArray<HashMap<String, Object>> f200099a = new SparseArray<>();

    /* renamed from: b */
    public static final C88151a f200100b = new C88151a();

    private C88151a() {
    }

    /* renamed from: a */
    public static void m153228a() {
        HashMap<String, Object> hashMap = f200099a.get(1);
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    static {
        Covode.recordClassIndex(104186);
    }

    /* renamed from: a */
    public static void m153229a(String str) {
        C89219l.m154721d(str, "");
        HashMap<String, Object> hashMap = f200099a.get(1);
        if (hashMap != null) {
            hashMap.remove(str);
        }
    }

    /* renamed from: a */
    public static void m153230a(String str, Object obj) {
        C89219l.m154721d(str, "");
        SparseArray<HashMap<String, Object>> sparseArray = f200099a;
        if (sparseArray.get(1) == null) {
            sparseArray.put(1, new HashMap<>());
        }
        HashMap<String, Object> hashMap = sparseArray.get(1);
        C89219l.m154716b(hashMap, "");
        hashMap.put(str, obj);
    }
}
