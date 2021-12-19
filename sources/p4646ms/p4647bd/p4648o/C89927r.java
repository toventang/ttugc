package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p4646ms.p4647bd.p4648o.AbstractC89935t;

/* renamed from: ms.bd.o.r */
public class C89927r extends AbstractC89935t.AbstractC89936a {
    static {
        Covode.recordClassIndex(106024);
    }

    public C89927r(C89948w wVar, AbstractC89935t.AbstractC89937b bVar, long j, int i) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f203817a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = j + ((long) (i * 8));
        wVar.mo144475a(allocate, j2, 4);
        this.f203815a = ((long) allocate.getInt()) & 4294967295L;
        wVar.mo144475a(allocate, j2 + 4, 4);
        this.f203816b = ((long) allocate.getInt()) & 4294967295L;
    }
}
