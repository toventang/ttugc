package p4600h.p4610e;

import com.bytedance.covode.number.Covode;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4621l.C89309k;

/* renamed from: h.e.q */
public final class C89167q {
    static {
        Covode.recordClassIndex(105251);
    }

    /* renamed from: h.e.q$a */
    public static final class C89168a extends AbstractC89220m implements AbstractC89172b<String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ ArrayList f202882a;

        static {
            Covode.recordClassIndex(105252);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C89168a(ArrayList arrayList) {
            super(1);
            this.f202882a = arrayList;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(String str) {
            C89219l.m154721d(str, "");
            this.f202882a.add(str);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final AbstractC89306h<String> m154661a(BufferedReader bufferedReader) {
        C89219l.m154721d(bufferedReader, "");
        return C89309k.m154797b(new C89164o(bufferedReader));
    }

    /* renamed from: a */
    public static final String m154662a(Reader reader) {
        C89219l.m154721d(reader, "");
        StringWriter stringWriter = new StringWriter();
        m154660a(reader, stringWriter);
        String stringWriter2 = stringWriter.toString();
        C89219l.m154716b(stringWriter2, "");
        return stringWriter2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static long m154660a(Reader reader, Writer writer) {
        C89219l.m154721d(reader, "");
        C89219l.m154721d(writer, "");
        char[] cArr = new char[8192];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002b, code lost:
        p4600h.p4610e.C89146c.m154636a(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        throw r0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m154663a(java.io.Reader r2, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.String, p4600h.C89391z> r3) {
        /*
            java.lang.String r0 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r2, r0)
            p4600h.p4611f.p4613b.C89219l.m154721d(r3, r0)
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            r0 = r2
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0     // Catch:{ all -> 0x0028 }
            h.l.h r0 = m154661a(r0)     // Catch:{ all -> 0x0028 }
            java.util.Iterator r1 = r0.mo2926a()     // Catch:{ all -> 0x0028 }
        L_0x0015:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0028 }
            r3.invoke(r0)     // Catch:{ all -> 0x0028 }
            goto L_0x0015
        L_0x0023:
            r0 = 0
            p4600h.p4610e.C89146c.m154636a(r2, r0)
            return
        L_0x0028:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            p4600h.p4610e.C89146c.m154636a(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4610e.C89167q.m154663a(java.io.Reader, h.f.a.b):void");
    }
}
