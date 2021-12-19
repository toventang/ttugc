package com.snapchat.kit.sdk.core.metrics.p2069b;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.C28023p;
import com.google.gson.p2019b.C27895a;
import com.snapchat.kit.sdk.core.metrics.C29005d;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.snapchat.kit.sdk.core.metrics.b.a */
public final class C28991a {

    /* renamed from: a */
    private static final Type f68487a = new C27895a<List<C29005d<String>>>() {
        /* class com.snapchat.kit.sdk.core.metrics.p2069b.C28991a.C289921 */

        static {
            Covode.recordClassIndex(35189);
        }
    }.type;

    /* renamed from: b */
    private final C27910f f68488b;

    static {
        Covode.recordClassIndex(35188);
    }

    C28991a(C27910f fVar) {
        this.f68488b = fVar;
    }

    /* renamed from: a */
    public final <T extends Message> String mo50362a(List<C29005d<T>> list) {
        try {
            return this.f68488b.mo46675b(m58000b(list), f68487a);
        } catch (C28023p unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static <T extends Message> List<C29005d<String>> m58000b(List<C29005d<T>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C29005d<T> dVar : list) {
            try {
                arrayList.add(new C29005d(Base64.encodeToString(dVar.f68519b.encode(), 0), dVar.f68518a));
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final <T extends Message> List<C29005d<T>> mo50363a(ProtoAdapter<T> protoAdapter, String str) {
        try {
            List list = (List) this.f68488b.mo46671a(str, f68487a);
            if (list == null) {
                return null;
            }
            return m57999a(protoAdapter, list);
        } catch (C28023p unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static <T extends Message> List<C29005d<T>> m57999a(ProtoAdapter<T> protoAdapter, List<C29005d<String>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C29005d<String> dVar : list) {
            T t = dVar.f68519b;
            if (t != null) {
                try {
                    arrayList.add(new C29005d(protoAdapter.decode(Base64.decode(t, 0)), dVar.f68518a));
                } catch (Exception unused) {
                }
            }
        }
        return arrayList;
    }
}
