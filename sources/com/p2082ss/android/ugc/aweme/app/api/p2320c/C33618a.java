package com.p2082ss.android.ugc.aweme.app.api.p2320c;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.AbstractC22043e;
import com.bytedance.retrofit2.mime.MimeUtil;
import com.bytedance.retrofit2.mime.TypedInput;
import com.google.gson.C27910f;
import com.google.gson.p2019b.C27895a;
import com.p2082ss.android.ugc.aweme.app.api.C33654q;
import com.p2082ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.logger.C58945a;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;

/* renamed from: com.ss.android.ugc.aweme.app.api.c.a */
public final class C33618a implements AbstractC22043e<TypedInput, C33620c> {

    /* renamed from: a */
    static String f79800a = "wire_convert";

    /* renamed from: c */
    private static AtomicBoolean f79801c = new AtomicBoolean(true);

    /* renamed from: b */
    public final Type f79802b;

    /* renamed from: d */
    private final C27910f f79803d;

    /* renamed from: e */
    private final C33654q f79804e;

    /* renamed from: f */
    private AbstractC33621d f79805f;

    static {
        Covode.recordClassIndex(40511);
    }

    /* renamed from: b */
    private C33620c m68850b(TypedInput typedInput) {
        String str = "UTF-8";
        if (typedInput.mimeType() != null) {
            str = MimeUtil.parseCharset(typedInput.mimeType(), str);
        }
        InputStreamReader inputStreamReader = new InputStreamReader(typedInput.mo11577in(), str);
        try {
            return new C33620c(this.f79803d.mo46663a((C27895a) C27895a.get(this.f79802b)).read(this.f79803d.mo46659a((Reader) inputStreamReader)), null);
        } finally {
            try {
                inputStreamReader.close();
            } catch (IOException unused) {
            }
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.retrofit2.AbstractC22043e
    /* renamed from: a */
    public final /* synthetic */ C33620c mo11580a(TypedInput typedInput) {
        boolean z;
        TypedInput typedInput2 = typedInput;
        Type type = this.f79802b;
        if (!(type == null || type != FeedItemList.class || typedInput2 == null)) {
            String mimeType = typedInput2.mimeType();
            int i = 1;
            if (TextUtils.isEmpty(mimeType) || !mimeType.contains("json")) {
                z = false;
            } else {
                z = true;
            }
            C58945a aVar = C58945a.C58947b.f134185a;
            if (!z) {
                i = 2;
            }
            if (aVar.f134179f == -1) {
                aVar.f134179f = i;
            }
        }
        return m68849a(typedInput2);
    }

    /* renamed from: a */
    private C33620c m68849a(TypedInput typedInput) {
        boolean z;
        String mimeType = typedInput.mimeType();
        if (TextUtils.isEmpty(mimeType) || !mimeType.contains("json")) {
            z = false;
        } else {
            z = true;
        }
        if (f79801c.get()) {
            f79801c.getAndSet(false);
            AbstractC88979t.m154310b("").mo143261a(C88925a.m154180b(C88946a.f201991c)).mo143289d(new C33619b(z));
        }
        if (z) {
            C51423a.m95784a(2, "ComposePbAndJson", "response json");
            try {
                long currentTimeMillis = System.currentTimeMillis();
                C33620c b = m68850b(typedInput);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                AbstractC33621d dVar = this.f79805f;
                if (dVar != null) {
                    dVar.mo59951a(currentTimeMillis2, b.f79807a, null, true);
                }
                return b;
            } catch (IOException e) {
                AbstractC33621d dVar2 = this.f79805f;
                if (dVar2 != null) {
                    dVar2.mo59952a(e.getMessage());
                }
                throw e;
            }
        } else {
            try {
                long currentTimeMillis3 = System.currentTimeMillis();
                C33620c cVar = new C33620c(null, this.f79804e.mo11580a(typedInput));
                long currentTimeMillis4 = System.currentTimeMillis() - currentTimeMillis3;
                AbstractC33621d dVar3 = this.f79805f;
                if (dVar3 != null) {
                    dVar3.mo59951a(currentTimeMillis4, null, cVar.f79808b, false);
                }
                return cVar;
            } catch (IOException e2) {
                AbstractC33621d dVar4 = this.f79805f;
                if (dVar4 != null) {
                    dVar4.mo59952a(e2.getMessage());
                }
                throw e2;
            }
        }
    }

    public C33618a(ParameterizedType parameterizedType, C27910f fVar, AbstractC33621d dVar) {
        this.f79803d = fVar;
        this.f79805f = dVar;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        this.f79804e = new C33654q(ProtoAdapter.get((Class) actualTypeArguments[0]));
        this.f79802b = actualTypeArguments[1];
    }
}
