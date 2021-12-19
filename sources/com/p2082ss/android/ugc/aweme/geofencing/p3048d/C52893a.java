package com.p2082ss.android.ugc.aweme.geofencing.p3048d;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.geofencing.p3047c.C52891a;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.geofencing.d.a */
public final class C52893a {
    static {
        Covode.recordClassIndex(62298);
    }

    /* renamed from: a */
    public static final List<C52891a> m97738a(Intent intent) {
        C89219l.m154721d(intent, "");
        Serializable serializableExtra = intent.getSerializableExtra("extra.region.list");
        if (serializableExtra == null) {
            return null;
        }
        C89219l.m154716b(serializableExtra, "");
        if (!(serializableExtra instanceof C52891a[])) {
            serializableExtra = null;
        }
        Object[] objArr = (Object[]) serializableExtra;
        if (objArr != null) {
            return C89064i.m154508i(objArr);
        }
        return null;
    }

    /* renamed from: a */
    public static final void m97739a(Intent intent, List<C52891a> list) {
        C89219l.m154721d(intent, "");
        C89219l.m154721d(list, "");
        Object[] array = list.toArray(new C52891a[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        intent.putExtra("extra.region.list", (Serializable) array);
    }
}
