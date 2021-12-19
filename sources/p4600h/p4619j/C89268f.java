package p4600h.p4619j;

import com.bytedance.covode.number.Covode;
import java.util.NoSuchElementException;
import p4600h.p4601a.AbstractC89040af;

/* renamed from: h.j.f */
public final class C89268f extends AbstractC89040af {

    /* renamed from: a */
    public final int f202930a;

    /* renamed from: b */
    private final int f202931b;

    /* renamed from: c */
    private boolean f202932c;

    /* renamed from: d */
    private int f202933d;

    static {
        Covode.recordClassIndex(105352);
    }

    public final boolean hasNext() {
        return this.f202932c;
    }

    @Override // p4600h.p4601a.AbstractC89040af
    /* renamed from: a */
    public final int mo143429a() {
        int i = this.f202933d;
        if (i != this.f202931b) {
            this.f202933d = this.f202930a + i;
        } else if (this.f202932c) {
            this.f202932c = false;
        } else {
            throw new NoSuchElementException();
        }
        return i;
    }

    public C89268f(int i, int i2, int i3) {
        this.f202930a = i3;
        this.f202931b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.f202932c = z;
        this.f202933d = !z ? i2 : i;
    }
}
