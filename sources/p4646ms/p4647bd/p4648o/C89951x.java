package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p4646ms.p4647bd.p4648o.AbstractC89935t;

/* renamed from: ms.bd.o.x */
public class C89951x extends AbstractC89935t.AbstractC89938c {
    static {
        Covode.recordClassIndex(106048);
    }

    public C89951x(C89948w wVar, AbstractC89935t.AbstractC89937b bVar, long j) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f203817a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        long j2 = (j * ((long) bVar.f203820d)) + bVar.f203818b;
        wVar.mo144475a(allocate, j2, 4);
        this.f203823a = ((long) allocate.getInt()) & 4294967295L;
        wVar.mo144475a(allocate, 4 + j2, 4);
        this.f203824b = ((long) allocate.getInt()) & 4294967295L;
        wVar.mo144475a(allocate, 8 + j2, 4);
        this.f203825c = ((long) allocate.getInt()) & 4294967295L;
        wVar.mo144475a(allocate, j2 + 20, 4);
        this.f203826d = ((long) allocate.getInt()) & 4294967295L;
    }
}
