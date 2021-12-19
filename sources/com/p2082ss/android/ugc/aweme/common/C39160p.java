package com.p2082ss.android.ugc.aweme.common;

import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.gson.internal.C28008j;
import com.google.gson.p2020c.C27897a;
import com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.p */
public final class C39160p implements IJsonConverter {
    static {
        Covode.recordClassIndex(46783);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public final <T> String convertObjToJson(T t) {
        return new C27910f().mo46674b(t);
    }

    @Override // com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter
    public final <T> T convertJsonToObj(InputStream inputStream, Class<T> cls) {
        C89219l.m154721d(inputStream, "");
        C27910f fVar = new C27910f();
        try {
            C27897a aVar = new C27897a(new InputStreamReader(inputStream));
            T t = (T) C28008j.m56097a(cls).cast(fVar.mo46666a(aVar, (Type) cls));
            aVar.close();
            inputStream.close();
            return t;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
