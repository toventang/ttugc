package com.bytedance.frameworks.baselib.network.http.retrofit.p996a.p997a;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27910f;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: com.bytedance.frameworks.baselib.network.http.retrofit.a.a.c */
final class C14763c<T> implements AbstractC22043e<TypedInput, T> {

    /* renamed from: a */
    private final C27910f f35979a;

    /* renamed from: b */
    private final AbstractC28031v<T> f35980b;

    static {
        Covode.recordClassIndex(16862);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public T mo11580a(TypedInput typedInput) {
        String str = "UTF-8";
        if (typedInput.mimeType() != null) {
            str = MimeUtil.parseCharset(typedInput.mimeType(), str);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.mo11577in(), str);
        try {
            return this.f35980b.read(this.f35979a.mo46659a((Reader) inputStreamReader));
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    C14763c(C27910f fVar, AbstractC28031v<T> vVar) {
        this.f35979a = fVar;
        this.f35980b = vVar;
    }
}
