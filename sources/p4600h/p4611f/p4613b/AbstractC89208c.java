package p4600h.p4611f.p4613b;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.C89194b;
import p4600h.p4620k.AbstractC89276b;
import p4600h.p4620k.AbstractC89278d;
import p4600h.p4620k.AbstractC89292l;
import p4600h.p4620k.EnumC89293m;

/* renamed from: h.f.b.c */
public abstract class AbstractC89208c implements AbstractC89276b, Serializable {
    public static final Object NO_RECEIVER = C89209a.f202888a;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient AbstractC89276b reflected;
    private final String signature;

    /* access modifiers changed from: protected */
    public abstract AbstractC89276b computeReflected();

    /* renamed from: h.f.b.c$a */
    static class C89209a implements Serializable {

        /* renamed from: a */
        public static final C89209a f202888a = new C89209a();

        private C89209a() {
        }

        private Object readResolve() {
            return f202888a;
        }

        static {
            Covode.recordClassIndex(105293);
        }
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // p4600h.p4620k.AbstractC89276b
    public String getName() {
        return this.name;
    }

    public String getSignature() {
        return this.signature;
    }

    public AbstractC89208c() {
        this(NO_RECEIVER);
    }

    static {
        Covode.recordClassIndex(105292);
    }

    public AbstractC89276b compute() {
        AbstractC89276b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        AbstractC89276b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    @Override // p4600h.p4620k.AbstractC89275a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @Override // p4600h.p4620k.AbstractC89276b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    /* access modifiers changed from: protected */
    public AbstractC89276b getReflected() {
        AbstractC89276b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new C89194b();
    }

    @Override // p4600h.p4620k.AbstractC89276b
    public AbstractC89292l getReturnType() {
        return getReflected().getReturnType();
    }

    @Override // p4600h.p4620k.AbstractC89276b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // p4600h.p4620k.AbstractC89276b
    public EnumC89293m getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // p4600h.p4620k.AbstractC89276b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // p4600h.p4620k.AbstractC89276b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // p4600h.p4620k.AbstractC89276b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // p4600h.p4620k.AbstractC89276b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public AbstractC89278d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        if (this.isTopLevel) {
            return C89204ab.m154670a(cls, "");
        }
        return C89204ab.m154669a(cls);
    }

    protected AbstractC89208c(Object obj) {
        this(obj, null, null, null, false);
    }

    @Override // p4600h.p4620k.AbstractC89276b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // p4600h.p4620k.AbstractC89276b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    protected AbstractC89208c(Object obj, Class cls, String str, String str2, boolean z) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z;
    }
}
