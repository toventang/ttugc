package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p4646ms.p4647bd.p4648o.AbstractC89935t;

/* renamed from: ms.bd.o.s */
public class C89931s extends AbstractC89935t.AbstractC89936a {
    static {
        Covode.recordClassIndex(106028);
    }

    public C89931s(C89948w wVar, AbstractC89935t.AbstractC89937b bVar, long j, int i) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (bVar.f203817a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = j + ((long) (i * 16));
        wVar.mo144475a(allocate, j2, 8);
        this.f203815a = allocate.getLong();
        wVar.mo144475a(allocate, j2 + 8, 8);
        this.f203816b = allocate.getLong();
    }
}
