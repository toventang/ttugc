package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p4646ms.p4647bd.p4648o.AbstractC89935t;

/* renamed from: ms.bd.o.z */
public class C89957z extends AbstractC89935t.AbstractC89939d {
    static {
        Covode.recordClassIndex(106054);
    }

    public C89957z(C89948w wVar, AbstractC89935t.AbstractC89937b bVar) {
        ByteOrder byteOrder;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (bVar.f203817a) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        wVar.mo144475a(allocate, bVar.f203819c + ((long) (bVar.f203822f * 0)) + 28, 4);
        this.f203827a = ((long) allocate.getInt()) & 4294967295L;
    }
}
