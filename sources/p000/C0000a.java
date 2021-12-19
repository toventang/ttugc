package p000;

import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.vesdk.faceinfo.C85472c;
import com.p2082ss.android.vesdk.faceinfo.C85474d;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: a */
public final class C0000a {
    static {
        Covode.recordClassIndex(0);
    }

    /* renamed from: a */
    public static final Rect[] m0a(C85474d dVar) {
        C89219l.m154721d(dVar, "");
        ArrayList arrayList = new ArrayList();
        C85472c[] cVarArr = dVar.f191449a;
        if (cVarArr != null) {
            for (C85472c cVar : cVarArr) {
                C89219l.m154716b(cVar, "");
                Rect rect = cVar.f191427a;
                C89219l.m154716b(rect, "");
                arrayList.add(rect);
            }
        }
        Object[] array = arrayList.toArray(new Rect[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (Rect[]) array;
    }
}
