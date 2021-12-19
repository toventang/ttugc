package com.bytedance.ies.ugc.aweme.network;

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

/* renamed from: com.bytedance.ies.ugc.aweme.network.c */
final class C18094c<T> implements AbstractC22043e<T, TypedOutput> {

    /* renamed from: a */
    private static final Charset f43081a = Charset.forName("UTF-8");

    /* renamed from: b */
    private final C27910f f43082b;

    /* renamed from: c */
    private final AbstractC28031v<T> f43083c;

    static {
        Covode.recordClassIndex(20732);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.bytedance.retrofit2.AbstractC22043e
    /* renamed from: a */
    public final /* synthetic */ TypedOutput mo11580a(Object obj) {
        MethodCollector.m26663i(10644);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1024);
        C27900c a = this.f43082b.mo46660a((Writer) new OutputStreamWriter(byteArrayOutputStream, f43081a));
        this.f43083c.write(a, obj);
        a.close();
        TypedByteArray typedByteArray = new TypedByteArray("application/json; charset=UTF-8", byteArrayOutputStream.toByteArray(), new String[0]);
        MethodCollector.m26664o(10644);
        return typedByteArray;
    }

    C18094c(C27910f fVar, AbstractC28031v<T> vVar) {
        this.f43082b = fVar;
        this.f43083c = vVar;
    }
}
