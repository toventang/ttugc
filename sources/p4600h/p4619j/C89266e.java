package p4600h.p4619j;

import com.bytedance.covode.number.Covode;
import java.util.Iterator;
import p4600h.p4607d.C89142c;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;

/* renamed from: h.j.e */
public class C89266e implements AbstractC89196a, Iterable<Integer> {

    /* renamed from: d */
    public static final C89267a f202926d = new C89267a((byte) 0);

    /* renamed from: a */
    public final int f202927a;

    /* renamed from: b */
    public final int f202928b;

    /* renamed from: c */
    public final int f202929c;

    static {
        Covode.recordClassIndex(105350);
    }

    /* renamed from: h.j.e$a */
    public static final class C89267a {
        static {
            Covode.recordClassIndex(105351);
        }

        private C89267a() {
        }

        public /* synthetic */ C89267a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C89266e m154754a(int i, int i2, int i3) {
            return new C89266e(i, i2, i3);
        }
    }

    /* Return type fixed from 'java.util.Iterator' to match base method */
    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Integer> iterator() {
        return new C89268f(this.f202927a, this.f202928b, this.f202929c);
    }

    /* renamed from: a */
    public boolean mo143680a() {
        if (this.f202929c > 0) {
            if (this.f202927a > this.f202928b) {
                return true;
            }
            return false;
        } else if (this.f202927a < this.f202928b) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        if (mo143680a()) {
            return -1;
        }
        return (((this.f202927a * 31) + this.f202928b) * 31) + this.f202929c;
    }

    public String toString() {
        StringBuilder append;
        int i;
        if (this.f202929c > 0) {
            append = new StringBuilder().append(this.f202927a).append("..").append(this.f202928b).append(" step ");
            i = this.f202929c;
        } else {
            append = new StringBuilder().append(this.f202927a).append(" downTo ").append(this.f202928b).append(" step ");
            i = -this.f202929c;
        }
        return append.append(i).toString();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C89266e)) {
            return false;
        }
        if (mo143680a() && ((C89266e) obj).mo143680a()) {
            return true;
        }
        C89266e eVar = (C89266e) obj;
        if (this.f202927a == eVar.f202927a && this.f202928b == eVar.f202928b && this.f202929c == eVar.f202929c) {
            return true;
        }
        return false;
    }

    public C89266e(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f202927a = i;
            if (i3 > 0) {
                if (i < i2) {
                    i2 -= C89142c.m154633a(i2, i, i3);
                }
            } else if (i > i2) {
                i2 += C89142c.m154633a(i, i2, -i3);
            }
            this.f202928b = i2;
            this.f202929c = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }
}
