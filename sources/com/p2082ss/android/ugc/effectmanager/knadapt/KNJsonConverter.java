package com.p2082ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.effectmanager.common.listener.IJsonConverter;
import com.p2082ss.ugc.effectplatform.p4440a.p4442b.AbstractC86694a;
import java.io.ByteArrayInputStream;
import p4600h.p4610e.C89146c;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.ss.android.ugc.effectmanager.knadapt.KNJsonConverter */
public final class KNJsonConverter implements AbstractC86694a {
    private final IJsonConverter jsonConverter;

    static {
        Covode.recordClassIndex(95725);
    }

    @Override // com.p2082ss.ugc.effectplatform.p4440a.p4442b.AbstractC86694a
    public final <T> String convertObjToJson(T t) {
        return this.jsonConverter.convertObjToJson(t);
    }

    public KNJsonConverter(IJsonConverter iJsonConverter) {
        C89219l.m154719c(iJsonConverter, "");
        this.jsonConverter = iJsonConverter;
    }

    @Override // com.p2082ss.ugc.effectplatform.p4440a.p4442b.AbstractC86694a
    public final <T> T convertJsonToObj(String str, Class<T> cls) {
        MethodCollector.m26663i(1590);
        C89219l.m154719c(str, "");
        C89219l.m154719c(cls, "");
        byte[] bytes = str.getBytes(C89338d.f202990a);
        C89219l.m154709a((Object) bytes, "");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            IJsonConverter iJsonConverter = this.jsonConverter;
            byte[] bytes2 = str.getBytes(C89338d.f202990a);
            C89219l.m154709a((Object) bytes2, "");
            T t = (T) iJsonConverter.convertJsonToObj(new ByteArrayInputStream(bytes2), cls);
            C89146c.m154636a(byteArrayInputStream, null);
            MethodCollector.m26664o(1590);
            return t;
        } catch (Throwable th) {
            C89146c.m154636a(byteArrayInputStream, th);
            MethodCollector.m26664o(1590);
            throw th;
        }
    }
}
