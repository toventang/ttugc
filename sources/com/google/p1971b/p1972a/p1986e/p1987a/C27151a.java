package com.google.p1971b.p1972a.p1986e.p1987a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2020c.C27900c;
import com.google.p1971b.p1972a.p1986e.AbstractC27153b;
import com.google.p1971b.p1972a.p1986e.AbstractC27154c;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

/* renamed from: com.google.b.a.e.a.a */
public final class C27151a extends AbstractC27153b {
    static {
        Covode.recordClassIndex(32731);
    }

    @Override // com.google.p1971b.p1972a.p1986e.AbstractC27153b
    /* renamed from: a */
    public final AbstractC27154c mo45197a(OutputStream outputStream, Charset charset) {
        return new C27152b(this, new C27900c(new OutputStreamWriter(outputStream, charset)));
    }
}
