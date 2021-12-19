package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.internal.bind.C27949i;
import com.google.gson.p2020c.C27900c;
import java.io.Writer;

/* renamed from: com.google.gson.internal.k */
public final class C28009k {
    static {
        Covode.recordClassIndex(33622);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.k$a */
    public static final class C28010a extends Writer {

        /* renamed from: a */
        private final Appendable f65795a;

        /* renamed from: b */
        private final C28011a f65796b = new C28011a();

        /* renamed from: com.google.gson.internal.k$a$a */
        static class C28011a implements CharSequence {

            /* renamed from: a */
            char[] f65797a;

            static {
                Covode.recordClassIndex(33624);
            }

            public final int length() {
                return this.f65797a.length;
            }

            C28011a() {
            }

            public final char charAt(int i) {
                return this.f65797a[i];
            }

            public final CharSequence subSequence(int i, int i2) {
                return new String(this.f65797a, i, i2 - i);
            }
        }

        static {
            Covode.recordClassIndex(33623);
        }

        @Override // java.io.Closeable, java.io.Writer, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public final void flush() {
        }

        @Override // java.io.Writer
        public final void write(int i) {
            this.f65795a.append((char) i);
        }

        C28010a(Appendable appendable) {
            this.f65795a = appendable;
        }

        @Override // java.io.Writer
        public final void write(char[] cArr, int i, int i2) {
            this.f65796b.f65797a = cArr;
            this.f65795a.append(this.f65796b, i, i2 + i);
        }
    }

    /* renamed from: a */
    public static Writer m56100a(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer) appendable;
        }
        return new C28010a(appendable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        throw new com.google.gson.C28027t(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        throw new com.google.gson.C28020m(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        throw new com.google.gson.C28027t(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
        return com.google.gson.C28021n.f65803a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b A[ExcHandler: IOException (r1v2 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0022 A[ExcHandler: d (r1v1 'e' com.google.gson.c.d A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0014 A[ExcHandler: NumberFormatException (r1v3 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:0:0x0000] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.gson.AbstractC28019l m56099a(com.google.gson.p2020c.C27897a r1) {
        /*
            r1.mo46627f()     // Catch:{ EOFException -> 0x0029, d -> 0x0022, IOException -> 0x001b, NumberFormatException -> 0x0014 }
            r0 = 0
            com.google.gson.v<com.google.gson.l> r0 = com.google.gson.internal.bind.C27949i.f65708X     // Catch:{ EOFException -> 0x000d, d -> 0x0022, IOException -> 0x001b, NumberFormatException -> 0x0014 }
            java.lang.Object r0 = r0.read(r1)     // Catch:{ EOFException -> 0x000d, d -> 0x0022, IOException -> 0x001b, NumberFormatException -> 0x0014 }
            com.google.gson.l r0 = (com.google.gson.AbstractC28019l) r0     // Catch:{ EOFException -> 0x000d, d -> 0x0022, IOException -> 0x001b, NumberFormatException -> 0x0014 }
            return r0
        L_0x000d:
            r1 = move-exception
            com.google.gson.t r0 = new com.google.gson.t
            r0.<init>(r1)
            throw r0
        L_0x0014:
            r1 = move-exception
            com.google.gson.t r0 = new com.google.gson.t
            r0.<init>(r1)
            throw r0
        L_0x001b:
            r1 = move-exception
            com.google.gson.m r0 = new com.google.gson.m
            r0.<init>(r1)
            throw r0
        L_0x0022:
            r1 = move-exception
            com.google.gson.t r0 = new com.google.gson.t
            r0.<init>(r1)
            throw r0
        L_0x0029:
            r0 = move-exception
            r0 = 1
            com.google.gson.n r0 = com.google.gson.C28021n.f65803a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C28009k.m56099a(com.google.gson.c.a):com.google.gson.l");
    }

    /* renamed from: a */
    public static void m56101a(AbstractC28019l lVar, C27900c cVar) {
        C27949i.f65708X.write(cVar, lVar);
    }
}
