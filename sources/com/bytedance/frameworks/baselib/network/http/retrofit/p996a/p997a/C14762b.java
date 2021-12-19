package com.bytedance.frameworks.baselib.network.http.retrofit.p996a.p997a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27910f;
import com.google.gson.p2020c.C27900c;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a.a.b */
final class C14762b<T> implements AbstractC22043e<T, TypedOutput> {

    /* renamed from: a */
    private static final Charset f35976a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final C27910f f35977b;

    /* renamed from: c */
    private final AbstractC28031v<T> f35978c;

    static {
        Covode.recordClassIndex(16861);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.retrofit2.AbstractC22043e
    /* renamed from: a */
    public final /* synthetic */ TypedOutput mo11580a(Object obj) {
        MethodCollector.m26663i(10203);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        C27900c a = this.f35977b.mo46660a((Writer) new OutputStreamWriter(byteArrayOutputStream, f35976a));
        this.f35978c.write(a, obj);
        a.close();
        TypedByteArray typedByteArray = new TypedByteArray("application/json; charset=UTF-8", byteArrayOutputStream.toByteArray(), new String[0]);
        MethodCollector.m26664o(10203);
        return typedByteArray;
    }

    C14762b(C27910f fVar, AbstractC28031v<T> vVar) {
        this.f35977b = fVar;
        this.f35978c = vVar;
    }
}
