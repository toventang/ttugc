package com.bytedance.android.livesdk.p455ar;

import com.bytedance.android.live.C4139e;
import com.bytedance.android.p150e.p151a.p152a.C2726d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.C27910f;
import com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87086h;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89338d;

/* renamed from: com.bytedance.android.livesdk.ar.f */
public final class C6840f implements AbstractC87086h {

    /* renamed from: a */
    private final Type f17136a;

    static {
        Covode.recordClassIndex(7578);
    }

    public C6840f(Type type) {
        C89219l.m154721d(type, "");
        this.f17136a = type;
    }

    @Override // com.p2082ss.ugc.live.sdk.msg.p4471b.AbstractC87086h
    /* renamed from: a */
    public final Object mo13094a(byte[] bArr) {
        MethodCollector.m26663i(11774);
        C89219l.m154721d(bArr, "");
        if (C89219l.m154714a(this.f17136a, String.class)) {
            String str = new String(bArr, C89338d.f202990a);
            MethodCollector.m26664o(11774);
            return str;
        } else if (C89219l.m154714a(this.f17136a, C2726d.AbstractC2728b.class)) {
            C2726d.AbstractC2728b a = C2726d.m7875a(new ByteArrayInputStream(bArr));
            C89219l.m154716b(a, "");
            MethodCollector.m26664o(11774);
            return a;
        } else {
            Object a2 = new C6839e(this.f17136a).mo13094a(bArr);
            if (a2 == null) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                C27910f fVar = C4139e.C4140a.f11575b;
                a2 = fVar.mo46666a(fVar.mo46659a((Reader) new InputStreamReader(byteArrayInputStream)), this.f17136a);
            }
            C89219l.m154716b(a2, "");
            MethodCollector.m26664o(11774);
            return a2;
        }
    }
}
