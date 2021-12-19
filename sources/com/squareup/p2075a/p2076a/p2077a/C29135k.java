package com.squareup.p2075a.p2076a.p2077a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;
import p4632k.AbstractC89426h;
import p4632k.AbstractC89431l;
import p4632k.C89420f;
import p4632k.C89427i;
import p4632k.C89434o;
import p4632k.C89436q;

/* access modifiers changed from: package-private */
/* renamed from: com.squareup.a.a.a.k */
public final class C29135k {

    /* renamed from: a */
    public int f68940a;

    /* renamed from: b */
    final AbstractC89426h f68941b;

    /* renamed from: c */
    private final C89434o f68942c;

    static {
        Covode.recordClassIndex(35484);
    }

    /* renamed from: a */
    private C89427i m58204a() {
        return this.f68941b.mo143823g((long) this.f68941b.mo143832j());
    }

    public C29135k(AbstractC89426h hVar) {
        C89434o oVar = new C89434o(new AbstractC89431l(hVar) {
            /* class com.squareup.p2075a.p2076a.p2077a.C29135k.C291361 */

            static {
                Covode.recordClassIndex(35485);
            }

            @Override // p4632k.AbstractC89408aa, p4632k.AbstractC89431l
            public final long read(C89420f fVar, long j) {
                if (C29135k.this.f68940a == 0) {
                    return -1;
                }
                long read = super.read(fVar, Math.min(j, (long) C29135k.this.f68940a));
                if (read == -1) {
                    return -1;
                }
                C29135k kVar = C29135k.this;
                kVar.f68940a = (int) (((long) kVar.f68940a) - read);
                return read;
            }
        }, new Inflater() {
            /* class com.squareup.p2075a.p2076a.p2077a.C29135k.C291372 */

            static {
                Covode.recordClassIndex(35486);
            }

            @Override // java.util.zip.Inflater
            public final int inflate(byte[] bArr, int i, int i2) {
                int inflate = super.inflate(bArr, i, i2);
                if (inflate != 0 || !needsDictionary()) {
                    return inflate;
                }
                setDictionary(C29142o.f68953a);
                return super.inflate(bArr, i, i2);
            }
        });
        this.f68942c = oVar;
        this.f68941b = C89436q.m155160a(oVar);
    }

    /* renamed from: a */
    public final List<C29123f> mo50825a(int i) {
        this.f68940a += i;
        int j = this.f68941b.mo143832j();
        if (j < 0) {
            throw new IOException("numberOfPairs < 0: ".concat(String.valueOf(j)));
        } else if (j <= 1024) {
            ArrayList arrayList = new ArrayList(j);
            for (int i2 = 0; i2 < j; i2++) {
                C89427i asciiLowercase = m58204a().toAsciiLowercase();
                C89427i a = m58204a();
                if (asciiLowercase.size() != 0) {
                    arrayList.add(new C29123f(asciiLowercase, a));
                } else {
                    throw new IOException("name.size == 0");
                }
            }
            if (this.f68940a > 0) {
                this.f68942c.mo143927a();
                if (this.f68940a != 0) {
                    throw new IOException("compressedLimit > 0: " + this.f68940a);
                }
            }
            return arrayList;
        } else {
            throw new IOException("numberOfPairs > 1024: ".concat(String.valueOf(j)));
        }
    }
}
