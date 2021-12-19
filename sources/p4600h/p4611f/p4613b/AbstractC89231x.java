package p4600h.p4611f.p4613b;

import com.bytedance.covode.number.Covode;
import p4600h.p4620k.AbstractC89276b;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: h.f.b.x */
public abstract class AbstractC89231x extends AbstractC89228u implements AbstractC89290k {
    static {
        Covode.recordClassIndex(105315);
    }

    /* access modifiers changed from: protected */
    @Override // p4600h.p4611f.p4613b.AbstractC89208c
    public AbstractC89276b computeReflected() {
        return this;
    }

    public AbstractC89231x() {
    }

    @Override // p4600h.p4620k.AbstractC89290k
    public AbstractC89290k.AbstractC89291a getGetter() {
        return ((AbstractC89290k) getReflected()).getGetter();
    }

    public AbstractC89231x(Object obj) {
        super(obj);
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // p4600h.p4620k.AbstractC89290k
    public Object getDelegate(Object obj) {
        return ((AbstractC89290k) getReflected()).getDelegate(obj);
    }

    public AbstractC89231x(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
