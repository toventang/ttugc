package com.facebook.soloader;

import android.content.Context;
import android.os.StrictMode;
import com.bytedance.covode.number.Covode;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.soloader.l */
public abstract class AbstractC25021l extends C25008c {

    /* renamed from: a */
    private final Map<String, Object> f59353a = new HashMap();

    /* renamed from: f */
    protected final Context f59354f;

    /* renamed from: g */
    protected String f59355g;

    /* renamed from: h */
    public String[] f59356h;

    static {
        Covode.recordClassIndex(30353);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract AbstractC25027e mo40896a();

    /* access modifiers changed from: protected */
    /* renamed from: com.facebook.soloader.l$d */
    public static abstract class AbstractC25026d implements Closeable {
        static {
            Covode.recordClassIndex(30358);
        }

        /* renamed from: a */
        public abstract boolean mo40909a();

        /* renamed from: b */
        public abstract C25025c mo40910b();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        protected AbstractC25026d() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.facebook.soloader.l$e */
    public static abstract class AbstractC25027e implements Closeable {
        static {
            Covode.recordClassIndex(30359);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract C25024b mo40906b();

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public abstract AbstractC25026d mo40907c();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        protected AbstractC25027e() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.facebook.soloader.l$c */
    public static final class C25025c implements Closeable {

        /* renamed from: a */
        public final C25023a f59366a;

        /* renamed from: b */
        public final InputStream f59367b;

        static {
            Covode.recordClassIndex(30357);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f59367b.close();
        }

        public C25025c(C25023a aVar, InputStream inputStream) {
            this.f59366a = aVar;
            this.f59367b = inputStream;
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0038, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0041, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo40897b() {
        /*
            r5 = this;
            android.os.Parcel r4 = android.os.Parcel.obtain()
            com.facebook.soloader.l$e r3 = r5.mo40896a()
            com.facebook.soloader.l$b r0 = r3.mo40906b()     // Catch:{ all -> 0x0036 }
            com.facebook.soloader.l$a[] r2 = r0.f59365a     // Catch:{ all -> 0x0036 }
            r0 = 1
            r4.writeByte(r0)     // Catch:{ all -> 0x0036 }
            int r0 = r2.length     // Catch:{ all -> 0x0036 }
            r4.writeInt(r0)     // Catch:{ all -> 0x0036 }
            r1 = 0
        L_0x0017:
            int r0 = r2.length     // Catch:{ all -> 0x0036 }
            if (r1 >= r0) goto L_0x002b
            r0 = r2[r1]     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = r0.f59363c     // Catch:{ all -> 0x0036 }
            r4.writeString(r0)     // Catch:{ all -> 0x0036 }
            r0 = r2[r1]     // Catch:{ all -> 0x0036 }
            java.lang.String r0 = r0.f59364d     // Catch:{ all -> 0x0036 }
            r4.writeString(r0)     // Catch:{ all -> 0x0036 }
            int r1 = r1 + 1
            goto L_0x0017
        L_0x002b:
            r3.close()
            byte[] r0 = r4.marshall()
            r4.recycle()
            return r0
        L_0x0036:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x003d }
            goto L_0x0041
        L_0x003d:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x0041:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.AbstractC25021l.mo40897b():byte[]");
    }

    /* renamed from: com.facebook.soloader.l$b */
    public static final class C25024b {

        /* renamed from: a */
        public final C25023a[] f59365a;

        static {
            Covode.recordClassIndex(30356);
        }

        public C25024b(C25023a[] aVarArr) {
            this.f59365a = aVarArr;
        }

        /* renamed from: a */
        static final C25024b m47984a(DataInput dataInput) {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt >= 0) {
                    C25023a[] aVarArr = new C25023a[readInt];
                    for (int i = 0; i < readInt; i++) {
                        aVarArr[i] = new C25023a(dataInput.readUTF(), dataInput.readUTF());
                    }
                    return new C25024b(aVarArr);
                }
                throw new RuntimeException("illegal number of shared libraries");
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        /* renamed from: a */
        public final void mo40914a(DataOutput dataOutput) {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f59365a.length);
            int i = 0;
            while (true) {
                C25023a[] aVarArr = this.f59365a;
                if (i < aVarArr.length) {
                    dataOutput.writeUTF(aVarArr[i].f59363c);
                    dataOutput.writeUTF(this.f59365a[i].f59364d);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    private Object m47978b(String str) {
        Object obj;
        synchronized (this.f59353a) {
            obj = this.f59353a.get(str);
            if (obj == null) {
                obj = new Object();
                this.f59353a.put(str, obj);
            }
        }
        return obj;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final synchronized void mo40912a(String str) {
        synchronized (m47978b(str)) {
            this.f59355g = str;
            mo40900a(2);
        }
    }

    /* renamed from: a */
    private void m47976a(C25023a[] aVarArr) {
        String[] list = this.f59339b.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                    int i = 0;
                    while (true) {
                        if (i < aVarArr.length) {
                            if (aVarArr[i].f59363c.equals(str)) {
                                break;
                            }
                            i++;
                            if (0 != 0) {
                                break;
                            }
                        } else {
                            C25018j.m47970a(new File(this.f59339b, str));
                            break;
                        }
                    }
                }
            }
            return;
        }
        throw new IOException("unable to list directory " + this.f59339b);
    }

    /* access modifiers changed from: protected */
    @Override // com.facebook.soloader.AbstractC25017i
    /* renamed from: a */
    public final void mo40900a(int i) {
        File file = this.f59339b;
        if (file.mkdirs() || file.isDirectory()) {
            C25013f fVar = new C25013f(new File(this.f59339b, "dso_lock"));
            try {
                if (!m47977a(fVar, i, mo40897b())) {
                }
            } finally {
                fVar.close();
            }
        } else {
            throw new IOException("cannot mkdir: ".concat(String.valueOf(file)));
        }
    }

    /* renamed from: com.facebook.soloader.l$a */
    public static class C25023a {

        /* renamed from: c */
        public final String f59363c;

        /* renamed from: d */
        public final String f59364d;

        static {
            Covode.recordClassIndex(30355);
        }

        public C25023a(String str, String str2) {
            this.f59363c = str;
            this.f59364d = str2;
        }
    }

    protected AbstractC25021l(Context context, String str) {
        super(new File(context.getApplicationInfo().dataDir + "/" + str), 1);
        this.f59354f = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0023, code lost:
        r1 = move-exception;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m47975a(java.io.File r4, byte r5) {
        /*
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile
            java.lang.String r0 = "rw"
            r3.<init>(r4, r0)
            r0 = 0
            r3.seek(r0)     // Catch:{ all -> 0x0021 }
            r3.write(r5)     // Catch:{ all -> 0x0021 }
            long r0 = r3.getFilePointer()     // Catch:{ all -> 0x0021 }
            r3.setLength(r0)     // Catch:{ all -> 0x0021 }
            java.io.FileDescriptor r0 = r3.getFD()     // Catch:{ all -> 0x0021 }
            r0.sync()     // Catch:{ all -> 0x0021 }
            r3.close()
            return
        L_0x0021:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0028 }
            goto L_0x002c
        L_0x0028:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x002c:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.AbstractC25021l.m47975a(java.io.File, byte):void");
    }

    @Override // com.facebook.soloader.C25008c, com.facebook.soloader.AbstractC25017i
    /* renamed from: a */
    public final int mo40899a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        int a;
        synchronized (m47978b(str)) {
            a = mo40903a(str, i, this.f59339b, threadPolicy);
        }
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r5 != 1) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        if ((r14 & 2) == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a2, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a8, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ab, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ae, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00b4, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00b7, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ba, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c0, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00c3, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r0 = move-exception;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m47977a(final com.facebook.soloader.C25013f r13, int r14, final byte[] r15) {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.AbstractC25021l.m47977a(com.facebook.soloader.f, int, byte[]):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f7, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00fa, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0108, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x010d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x010e, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0111, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[Catch:{ all -> 0x0108 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m47974a(byte r15, com.facebook.soloader.AbstractC25021l.C25024b r16, com.facebook.soloader.AbstractC25021l.AbstractC25026d r17) {
        /*
        // Method dump skipped, instructions count: 274
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.AbstractC25021l.m47974a(byte, com.facebook.soloader.l$b, com.facebook.soloader.l$d):void");
    }
}
