package p4628j.p4629a.p4630a;

import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

/* renamed from: j.a.a.g */
public final class C89400g implements AbstractC89404k {

    /* renamed from: a */
    private final List<Class<?>> f203062a = new ArrayList();

    /* renamed from: b */
    private final List<AbstractC89396c<?, ?>> f203063b = new ArrayList();

    /* renamed from: c */
    private final List<AbstractC89398e<?>> f203064c = new ArrayList();

    static {
        Covode.recordClassIndex(105484);
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89404k
    /* renamed from: a */
    public final AbstractC89396c<?, ?> mo143772a(int i) {
        return this.f203063b.get(i);
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89404k
    /* renamed from: b */
    public final AbstractC89398e<?> mo143776b(int i) {
        return this.f203064c.get(i);
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89404k
    /* renamed from: a */
    public final boolean mo143774a(Class<?> cls) {
        boolean z = false;
        while (true) {
            int indexOf = this.f203062a.indexOf(cls);
            if (indexOf == -1) {
                return z;
            }
            this.f203062a.remove(indexOf);
            this.f203063b.remove(indexOf);
            this.f203064c.remove(indexOf);
            z = true;
        }
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89404k
    /* renamed from: b */
    public final int mo143775b(Class<?> cls) {
        int indexOf = this.f203062a.indexOf(cls);
        if (indexOf != -1) {
            return indexOf;
        }
        for (int i = 0; i < this.f203062a.size(); i++) {
            if (this.f203062a.get(i).isAssignableFrom(cls)) {
                return i;
            }
        }
        return -1;
    }

    @Override // p4628j.p4629a.p4630a.AbstractC89404k
    /* renamed from: a */
    public final <T> void mo143773a(Class<? extends T> cls, AbstractC89396c<T, ?> cVar, AbstractC89398e<T> eVar) {
        this.f203062a.add(cls);
        this.f203063b.add(cVar);
        this.f203064c.add(eVar);
    }
}
