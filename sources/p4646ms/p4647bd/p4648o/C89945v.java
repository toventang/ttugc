package p4646ms.p4647bd.p4648o;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import p4646ms.p4647bd.p4648o.AbstractC89935t;

/* renamed from: ms.bd.o.v */
public class C89945v extends AbstractC89935t.AbstractC89937b {

    /* renamed from: g */
    private final C89948w f203832g;

    static {
        Covode.recordClassIndex(106042);
    }

    @Override // p4646ms.p4647bd.p4648o.AbstractC89935t.AbstractC89937b
    /* renamed from: a */
    public final AbstractC89935t.AbstractC89936a mo144471a(long j, int i) {
        return new C89931s(this.f203832g, this, j, i);
    }

    @Override // p4646ms.p4647bd.p4648o.AbstractC89935t.AbstractC89937b
    /* renamed from: a */
    public final AbstractC89935t.AbstractC89938c mo144472a(long j) {
        return new C89954y(this.f203832g, this, j);
    }

    @Override // p4646ms.p4647bd.p4648o.AbstractC89935t.AbstractC89937b
    /* renamed from: a */
    public final AbstractC89935t.AbstractC89939d mo144473a() {
        return new C89866a0(this.f203832g, this);
    }

    public C89945v(boolean z, C89948w wVar) {
        ByteOrder byteOrder;
        this.f203817a = z;
        this.f203832g = wVar;
        ByteBuffer allocate = ByteBuffer.allocate(8);
        if (z) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        }
        allocate.order(byteOrder);
        wVar.mo144475a(allocate, 16, 2);
        allocate.getShort();
        wVar.mo144475a(allocate, 32, 8);
        this.f203818b = allocate.getLong();
        wVar.mo144475a(allocate, 40, 8);
        this.f203819c = allocate.getLong();
        wVar.mo144475a(allocate, 54, 2);
        this.f203820d = allocate.getShort() & 65535;
        wVar.mo144475a(allocate, 56, 2);
        this.f203821e = allocate.getShort() & 65535;
        wVar.mo144475a(allocate, 58, 2);
        this.f203822f = allocate.getShort() & 65535;
        wVar.mo144475a(allocate, 60, 2);
        allocate.getShort();
        wVar.mo144475a(allocate, 62, 2);
        allocate.getShort();
    }
}
