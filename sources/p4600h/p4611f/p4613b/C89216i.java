package p4600h.p4611f.p4613b;

import com.bytedance.covode.number.Covode;
import p4600h.p4620k.AbstractC89276b;
import p4600h.p4620k.AbstractC89279e;

/* renamed from: h.f.b.i */
public class C89216i extends AbstractC89208c implements AbstractC89215h, AbstractC89279e {
    private final int arity;
    private final int flags;

    static {
        Covode.recordClassIndex(105300);
    }

    /* access modifiers changed from: protected */
    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public AbstractC89276b computeReflected() {
        return this;
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89215h
    public int getArity() {
        return this.arity;
    }

    /* access modifiers changed from: protected */
    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public AbstractC89279e getReflected() {
        return (AbstractC89279e) super.getReflected();
    }

    @Override // p4600h.p4620k.AbstractC89279e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // p4600h.p4620k.AbstractC89279e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // p4600h.p4620k.AbstractC89279e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // p4600h.p4620k.AbstractC89279e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // p4600h.p4611f.p4613b.AbstractC89208c, p4600h.p4620k.AbstractC89276b, p4600h.p4620k.AbstractC89279e
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public int hashCode() {
        int hashCode;
        if (getOwner() == null) {
            hashCode = 0;
        } else {
            hashCode = getOwner().hashCode() * 31;
        }
        return ((hashCode + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    public String toString() {
        AbstractC89276b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public C89216i(int i) {
        this(i, NO_RECEIVER, null, null, null, 0);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C89216i) {
            C89216i iVar = (C89216i) obj;
            if (!C89219l.m154714a(getOwner(), iVar.getOwner()) || !getName().equals(iVar.getName()) || !getSignature().equals(iVar.getSignature()) || this.flags != iVar.flags || this.arity != iVar.arity || !C89219l.m154714a(getBoundReceiver(), iVar.getBoundReceiver())) {
                return false;
            }
            return true;
        } else if (obj instanceof AbstractC89279e) {
            return obj.equals(compute());
        } else {
            return false;
        }
    }

    public C89216i(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C89216i(int r7, java.lang.Object r8, java.lang.Class r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            r6 = this;
            r1 = r12 & 1
            r0 = 1
            if (r1 != r0) goto L_0x0015
            r5 = 1
        L_0x0006:
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.arity = r7
            int r0 = r12 >> 1
            r6.flags = r0
            return
        L_0x0015:
            r0 = 0
            r5 = 0
            goto L_0x0006
        */
        throw new UnsupportedOperationException("Method not decompiled: p4600h.p4611f.p4613b.C89216i.<init>(int, java.lang.Object, java.lang.Class, java.lang.String, java.lang.String, int):void");
    }
}
