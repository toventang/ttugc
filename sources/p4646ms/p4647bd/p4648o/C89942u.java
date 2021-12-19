package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p4646ms.p4647bd.p4648o.AbstractC89935t;

/* renamed from: ms.bd.o.u */
public class C89942u extends AbstractC89935t.AbstractC89937b {

    /* renamed from: g */
    private final C89948w f203830g;

    static {
        Covode.recordClassIndex(106039);
    }

    @Override // p4646ms.p4647bd.p4648o.AbstractC89935t.AbstractC89937b
    /* renamed from: a */
    public final AbstractC89935t.AbstractC89936a mo144471a(long j, int i) {
        return new C89927r(this.f203830g, this, j, i);
    }

    @Override // p4646ms.p4647bd.p4648o.AbstractC89935t.AbstractC89937b
    /* renamed from: a */
    public final AbstractC89935t.AbstractC89938c mo144472a(long j) {
        return new C89951x(this.f203830g, this, j);
    }

    @Override // p4646ms.p4647bd.p4648o.AbstractC89935t.AbstractC89937b
    /* renamed from: a */
    public final AbstractC89935t.AbstractC89939d mo144473a() {
        return new C89957z(this.f203830g, this);
    }

    public C89942u(boolean z, C89948w wVar) {
        ByteOrder byteOrder;
        this.f203817a = z;
        this.f203830g = wVar;
        ByteBuffer allocate = ByteBuffer.allocate(4);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        wVar.mo144475a(allocate, 16, 2);
        allocate.getShort();
        wVar.mo144475a(allocate, 28, 4);
        this.f203818b = ((long) allocate.getInt()) & 4294967295L;
        wVar.mo144475a(allocate, 32, 4);
        this.f203819c = ((long) allocate.getInt()) & 4294967295L;
        wVar.mo144475a(allocate, 42, 2);
        this.f203820d = allocate.getShort() & 65535;
        wVar.mo144475a(allocate, 44, 2);
        this.f203821e = allocate.getShort() & 65535;
        wVar.mo144475a(allocate, 46, 2);
        this.f203822f = allocate.getShort() & 65535;
        wVar.mo144475a(allocate, 48, 2);
        allocate.getShort();
        wVar.mo144475a(allocate, 50, 2);
        allocate.getShort();
    }
}
