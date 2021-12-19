package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p4646ms.p4647bd.p4648o.AbstractC89935t;

/* renamed from: ms.bd.o.w */
public class C89948w implements Closeable, AbstractC89935t {

    /* renamed from: a */
    private final FileChannel f203834a;

    static {
        Covode.recordClassIndex(106045);
    }

    public C89948w(File file) {
        MethodCollector.m26663i(749);
        if (file == null || !file.exists()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("File is null or does not exist");
            MethodCollector.m26664o(749);
            throw illegalArgumentException;
        }
        this.f203834a = new FileInputStream(file).getChannel();
        MethodCollector.m26664o(749);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo144475a(ByteBuffer byteBuffer, long j, int i) {
        byteBuffer.position(0);
        byteBuffer.limit(i);
        long j2 = 0;
        while (j2 < ((long) i)) {
            int read = this.f203834a.read(byteBuffer, j + j2);
            if (read != -1) {
                j2 += (long) read;
            } else {
                throw new EOFException();
            }
        }
        byteBuffer.position(0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f203834a.close();
    }

    /* renamed from: a */
    public final List<String> mo144474a() {
        boolean z;
        AbstractC89935t.AbstractC89937b vVar;
        ByteOrder byteOrder;
        AbstractC89935t.AbstractC89936a a;
        this.f203834a.position(0L);
        ArrayList arrayList = new ArrayList();
        this.f203834a.position(0L);
        ByteBuffer allocate = ByteBuffer.allocate(8);
        allocate.order(ByteOrder.LITTLE_ENDIAN);
        mo144475a(allocate, 0, 4);
        if ((((long) allocate.getInt()) & 4294967295L) == 1179403647) {
            mo144475a(allocate, 4, 1);
            short s = (short) (allocate.get() & 255);
            mo144475a(allocate, 5, 1);
            if (((short) (allocate.get() & 255)) == 2) {
                z = true;
            } else {
                z = false;
            }
            if (s == 1) {
                vVar = new C89942u(z, this);
            } else if (s == 2) {
                vVar = new C89945v(z, this);
            } else {
                throw new IllegalStateException("Invalid class type!");
            }
            ByteBuffer allocate2 = ByteBuffer.allocate(8);
            if (vVar.f203817a) {
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            allocate2.order(byteOrder);
            long j = (long) vVar.f203821e;
            if (j == 65535) {
                j = vVar.mo144473a().f203827a;
            }
            long j2 = 0;
            while (true) {
                if (j2 >= j) {
                    break;
                }
                AbstractC89935t.AbstractC89938c a2 = vVar.mo144472a(j2);
                if (a2.f203823a == 2) {
                    long j3 = a2.f203824b;
                    if (j3 != 0) {
                        ArrayList<Long> arrayList2 = new ArrayList();
                        long j4 = 0;
                        int i = 0;
                        do {
                            a = vVar.mo144471a(j3, i);
                            long j5 = a.f203815a;
                            if (j5 == 1) {
                                arrayList2.add(Long.valueOf(a.f203816b));
                            } else if (j5 == 5) {
                                j4 = a.f203816b;
                            }
                            i++;
                        } while (a.f203815a != 0);
                        if (j4 != 0) {
                            for (long j6 = 0; j6 < j; j6++) {
                                AbstractC89935t.AbstractC89938c a3 = vVar.mo144472a(j6);
                                if (a3.f203823a == 1) {
                                    long j7 = a3.f203825c;
                                    if (j7 <= j4 && j4 <= a3.f203826d + j7) {
                                        long j8 = (j4 - j7) + a3.f203824b;
                                        for (Long l : arrayList2) {
                                            long longValue = l.longValue() + j8;
                                            StringBuilder sb = new StringBuilder();
                                            while (true) {
                                                long j9 = longValue + 1;
                                                mo144475a(allocate2, longValue, 1);
                                                short s2 = (short) (allocate2.get() & 255);
                                                if (s2 == 0) {
                                                    break;
                                                }
                                                sb.append((char) s2);
                                                longValue = j9;
                                            }
                                            arrayList.add(sb.toString());
                                        }
                                        return arrayList;
                                    }
                                }
                            }
                            throw new IllegalStateException("Could not map vma to file offset!");
                        }
                        throw new IllegalStateException("String table offset not found!");
                    }
                } else {
                    j2++;
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        throw new IllegalArgumentException("Invalid ELF Magic!");
    }
}
