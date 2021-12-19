package com.bytedance.ies.ugc.aweme.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.AbstractC28031v;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.aweme.app.api.AbstractC33617c;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/* renamed from: com.bytedance.ies.ugc.aweme.network.d */
final class C18095d<T> implements AbstractC22043e<TypedInput, T> {

    /* renamed from: a */
    private final C27910f f43084a;

    /* renamed from: b */
    private final AbstractC28031v<T> f43085b;

    static {
        Covode.recordClassIndex(20733);
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
            T read = this.f43085b.read(this.f43084a.mo46659a((Reader) inputStreamReader));
            if ((read instanceof AbstractC33617c) && (typedInput instanceof TypedByteArray)) {
                read.setJsonData(new String(((TypedByteArray) typedInput).getBytes(), str));
            }
            return read;
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    C18095d(C27910f fVar, AbstractC28031v<T> vVar) {
        this.f43084a = fVar;
        this.f43085b = vVar;
    }
}
