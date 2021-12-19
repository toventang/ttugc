package com.bytedance.ies.ugc.appcontext;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bytedance.ies.ugc.appcontext.b */
public final class C17862b {
    static {
        Covode.recordClassIndex(20463);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.ugc.appcontext.b$a */
    public static final class C17863a<A, B> {

        /* renamed from: a */
        public final A f42572a;

        /* renamed from: b */
        public final B f42573b;

        static {
            Covode.recordClassIndex(20464);
        }

        public final int hashCode() {
            int hashCode;
            A a = this.f42572a;
            int i = 0;
            if (a == null) {
                hashCode = 0;
            } else {
                hashCode = a.hashCode();
            }
            int i2 = (hashCode + 31) * 31;
            B b = this.f42573b;
            if (b != null) {
                i = b.hashCode();
            }
            return i2 + i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C17863a aVar = (C17863a) obj;
            A a = this.f42572a;
            if (a == null) {
                if (aVar.f42572a != null) {
                    return false;
                }
            } else if (!a.equals(aVar.f42572a)) {
                return false;
            }
            B b = this.f42573b;
            if (b == null) {
                if (aVar.f42573b != null) {
                    return false;
                }
            } else if (!b.equals(aVar.f42573b)) {
                return false;
            }
            return true;
        }

        C17863a(A a, B b) {
            this.f42572a = a;
            this.f42573b = b;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.appcontext.b$b */
    public static class C17864b extends Exception {
        private static final long serialVersionUID = 1;

        static {
            Covode.recordClassIndex(20465);
        }

        public C17864b(String str) {
            super(str);
        }

        public C17864b(String str, Throwable th) {
            super(str, th);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (r5 != null) goto L_0x0058;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m33074a(java.lang.String r7) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            r6 = 0
            if (r0 == 0) goto L_0x0008
            return r6
        L_0x0008:
            java.io.RandomAccessFile r5 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0055 }
            java.lang.String r0 = "r"
            r5.<init>(r7, r0)     // Catch:{ all -> 0x0055 }
            java.nio.channels.FileChannel r0 = r5.getChannel()     // Catch:{ all -> 0x0056 }
            com.bytedance.ies.ugc.appcontext.b$a r0 = m33073a(r0)     // Catch:{ all -> 0x0056 }
            A r0 = r0.f42572a     // Catch:{ all -> 0x0056 }
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ all -> 0x0056 }
            java.util.Map r2 = m33076a(r0)     // Catch:{ all -> 0x0056 }
            r1 = 1903654775(0x71777777, float:1.22539554E30)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0056 }
            boolean r0 = r2.containsKey(r0)     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x0058
            java.lang.String r4 = new java.lang.String     // Catch:{ all -> 0x0056 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0056 }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x0056 }
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0     // Catch:{ all -> 0x0056 }
            byte[] r3 = r0.array()     // Catch:{ all -> 0x0056 }
            int r2 = r0.arrayOffset()     // Catch:{ all -> 0x0056 }
            int r1 = r0.position()     // Catch:{ all -> 0x0056 }
            int r1 = r1 + r2
            int r0 = r0.limit()     // Catch:{ all -> 0x0056 }
            int r2 = r2 + r0
            byte[] r0 = java.util.Arrays.copyOfRange(r3, r1, r2)     // Catch:{ all -> 0x0056 }
            r4.<init>(r0)     // Catch:{ all -> 0x0056 }
            r5.close()     // Catch:{ all -> 0x0054 }
        L_0x0054:
            return r4
        L_0x0055:
            r5 = r6
        L_0x0056:
            if (r5 == 0) goto L_0x005b
        L_0x0058:
            r5.close()     // Catch:{ all -> 0x005b }
        L_0x005b:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.ugc.appcontext.C17862b.m33074a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static C17863a<ByteBuffer, Long> m33073a(FileChannel fileChannel) {
        long size = fileChannel.size();
        if (size >= 22) {
            long j = size - 22;
            long min = Math.min(j, 65535L);
            int i = 0;
            while (true) {
                long j2 = (long) i;
                if (j2 <= min) {
                    long j3 = j - j2;
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    fileChannel.position(j3);
                    fileChannel.read(allocate);
                    allocate.order(ByteOrder.LITTLE_ENDIAN);
                    if (allocate.getInt(0) == 101010256) {
                        ByteBuffer allocate2 = ByteBuffer.allocate(2);
                        fileChannel.position(j3 + 20);
                        fileChannel.read(allocate2);
                        allocate2.order(ByteOrder.LITTLE_ENDIAN);
                        short s = allocate2.getShort(0);
                        if (s == i) {
                            ByteBuffer allocate3 = ByteBuffer.allocate(4);
                            allocate3.order(ByteOrder.LITTLE_ENDIAN);
                            fileChannel.position((fileChannel.size() - ((long) s)) - 6);
                            fileChannel.read(allocate3);
                            long j4 = (long) allocate3.getInt(0);
                            if (j4 >= 32) {
                                fileChannel.position(j4 - 24);
                                ByteBuffer allocate4 = ByteBuffer.allocate(24);
                                fileChannel.read(allocate4);
                                allocate4.order(ByteOrder.LITTLE_ENDIAN);
                                if (allocate4.getLong(8) == 2334950737559900225L && allocate4.getLong(16) == 3617552046287187010L) {
                                    long j5 = allocate4.getLong(0);
                                    if (j5 < ((long) allocate4.capacity()) || j5 > 2147483639) {
                                        throw new C17864b("APK Signing Block size out of range: ".concat(String.valueOf(j5)));
                                    }
                                    int i2 = (int) (8 + j5);
                                    long j6 = j4 - ((long) i2);
                                    if (j6 >= 0) {
                                        fileChannel.position(j6);
                                        ByteBuffer allocate5 = ByteBuffer.allocate(i2);
                                        fileChannel.read(allocate5);
                                        allocate5.order(ByteOrder.LITTLE_ENDIAN);
                                        long j7 = allocate5.getLong(0);
                                        if (j7 == j5) {
                                            return new C17863a<>(allocate5, Long.valueOf(j6));
                                        }
                                        throw new C17864b("APK Signing Block sizes in header and footer do not match: " + j7 + " vs " + j5);
                                    }
                                    throw new C17864b("APK Signing Block offset out of range: ".concat(String.valueOf(j6)));
                                }
                                throw new C17864b("No APK Signing Block before ZIP Central Directory");
                            }
                            throw new C17864b("APK too small for APK Signing Block. ZIP Central Directory offset: ".concat(String.valueOf(j4)));
                        }
                    }
                    i++;
                } else {
                    throw new IOException("ZIP End of Central Directory (EOCD) record not found");
                }
            }
        } else {
            throw new IOException("APK too small for ZIP End of Central Directory (EOCD) record");
        }
    }

    /* renamed from: a */
    private static Map<Integer, ByteBuffer> m33076a(ByteBuffer byteBuffer) {
        if (byteBuffer.order() == ByteOrder.LITTLE_ENDIAN) {
            ByteBuffer a = m33075a(byteBuffer, byteBuffer.capacity() - 24);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i = 0;
            while (a.hasRemaining()) {
                i++;
                if (a.remaining() >= 8) {
                    long j = a.getLong();
                    if (j < 4 || j > 2147483647L) {
                        throw new C17864b("APK Signing Block entry #" + i + " size out of range: " + j);
                    }
                    int i2 = (int) j;
                    int position = a.position() + i2;
                    if (i2 <= a.remaining()) {
                        linkedHashMap.put(Integer.valueOf(a.getInt()), m33077b(a, i2 - 4));
                        a.position(position);
                    } else {
                        throw new C17864b("APK Signing Block entry #" + i + " size out of range: " + i2 + ", available: " + a.remaining());
                    }
                } else {
                    throw new C17864b("Insufficient data to read size of APK Signing Block entry #".concat(String.valueOf(i)));
                }
            }
            return linkedHashMap;
        }
        throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
    }

    /* renamed from: b */
    private static ByteBuffer m33077b(ByteBuffer byteBuffer, int i) {
        if (i >= 0) {
            int limit = byteBuffer.limit();
            int position = byteBuffer.position();
            int i2 = i + position;
            if (i2 < position || i2 > limit) {
                throw new BufferUnderflowException();
            }
            byteBuffer.limit(i2);
            try {
                ByteBuffer slice = byteBuffer.slice();
                slice.order(byteBuffer.order());
                byteBuffer.position(i2);
                return slice;
            } finally {
                byteBuffer.limit(limit);
            }
        } else {
            throw new IllegalArgumentException("size: ".concat(String.valueOf(i)));
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    private static ByteBuffer m33075a(ByteBuffer byteBuffer, int i) {
        if (i >= 8) {
            int capacity = byteBuffer.capacity();
            if (i <= byteBuffer.capacity()) {
                int limit = byteBuffer.limit();
                int position = byteBuffer.position();
                try {
                    byteBuffer.position(0);
                    byteBuffer.limit(i);
                    byteBuffer.position(8);
                    ByteBuffer slice = byteBuffer.slice();
                    slice.order(byteBuffer.order());
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    return slice;
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    byteBuffer.limit(limit);
                    byteBuffer.position(position);
                    throw th;
                }
            } else {
                throw new IllegalArgumentException("end > capacity: " + i + " > " + capacity);
            }
        } else {
            throw new IllegalArgumentException("end < start: " + i + " < 8");
        }
    }
}
