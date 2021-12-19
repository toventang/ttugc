package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27917g;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.TimeSpeedModelExtension;
import com.p2082ss.android.ugc.tools.C84401c;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.du */
public final class C70651du {
    static {
        Covode.recordClassIndex(83117);
    }

    /* renamed from: a */
    public static final String m124878a(ArrayList<TimeSpeedModelExtension> arrayList) {
        C89219l.m154721d(arrayList, "");
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<TimeSpeedModelExtension> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().toJson(C84401c.f188719c));
        }
        C27917g gVar = new C27917g();
        gVar.f65563c = true;
        return gVar.mo46682b().mo46674b(arrayList2);
    }
}
