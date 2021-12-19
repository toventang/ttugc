package com.bytedance.creativex.p936a.p937a;

import android.os.Bundle;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27910f;
import com.google.gson.p2020c.C27897a;
import com.google.gson.p2020c.C27900c;
import java.io.Serializable;
import java.util.Set;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.creativex.a.a.e */
public final class C14087e extends AbstractC28031v<Bundle> {

    /* renamed from: a */
    private final C27910f f34267a;

    /* renamed from: b */
    private final AbstractC14085c f34268b;

    static {
        Covode.recordClassIndex(16154);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ Bundle read(C27897a aVar) {
        C89219l.m154721d(aVar, "");
        Bundle bundle = new Bundle(getClass().getClassLoader());
        aVar.mo46623c();
        while (aVar.mo46626e()) {
            String h = aVar.mo46628h();
            AbstractC14085c cVar = this.f34268b;
            C89219l.m154716b(h, "");
            Object a = this.f34267a.mo46670a(aVar.mo46629i(), (Class) cVar.mo22599a(h));
            if (a == null) {
                bundle.putSerializable(h, null);
            } else if (a instanceof Parcelable) {
                bundle.putParcelable(h, (Parcelable) a);
            } else if (a instanceof Serializable) {
                bundle.putSerializable(h, (Serializable) a);
            } else if (a instanceof Byte) {
                bundle.putByte(h, ((Number) a).byteValue());
            } else if (a instanceof Character) {
                bundle.putChar(h, ((Character) a).charValue());
            } else if (a instanceof Boolean) {
                bundle.putBoolean(h, ((Boolean) a).booleanValue());
            } else if (a instanceof Integer) {
                bundle.putInt(h, ((Number) a).intValue());
            } else if (a instanceof Short) {
                bundle.putShort(h, ((Number) a).shortValue());
            } else if (a instanceof Long) {
                bundle.putLong(h, ((Number) a).longValue());
            } else if (a instanceof Float) {
                bundle.putFloat(h, ((Number) a).floatValue());
            } else if (a instanceof Double) {
                bundle.putDouble(h, ((Number) a).doubleValue());
            } else if (a instanceof String) {
                bundle.putString(h, (String) a);
            } else {
                throw new IllegalStateException("type not supported yet".toString());
            }
        }
        aVar.mo46625d();
        return bundle;
    }

    /* renamed from: a */
    private static Object m25680a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public C14087e(C27910f fVar, AbstractC14085c cVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(cVar, "");
        this.f34267a = fVar;
        this.f34268b = cVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.google.gson.c.c, java.lang.Object] */
    @Override // com.google.gson.AbstractC28031v
    public final /* synthetic */ void write(C27900c cVar, Bundle bundle) {
        Bundle bundle2 = bundle;
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bundle2, "");
        cVar.mo46652d();
        if (bundle2.getClassLoader() == null) {
            bundle2.setClassLoader(getClass().getClassLoader());
        }
        Set<String> keySet = bundle2.keySet();
        C89219l.m154716b(keySet, "");
        for (T t : keySet) {
            AbstractC14085c cVar2 = this.f34268b;
            C89219l.m154716b(t, "");
            Class<?> a = cVar2.mo22599a(t);
            Object a2 = m25680a(bundle2, t);
            cVar.mo46645a((String) t);
            cVar.mo46648b(this.f34267a.mo46675b(a2, a));
        }
        cVar.mo46653e();
    }
}
