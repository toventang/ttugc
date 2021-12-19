package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.facebook.imagepipeline.memory.q */
public abstract class AbstractC24501q<T> implements AbstractC24476aa<T> {

    /* renamed from: a */
    private final Set<T> f58210a = new HashSet();

    /* renamed from: b */
    private final C24488g<T> f58211b = new C24488g<>();

    static {
        Covode.recordClassIndex(28645);
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24476aa
    /* renamed from: a */
    public final T mo40348a() {
        return m46810c(this.f58211b.mo40369a());
    }

    /* renamed from: c */
    private T m46810c(T t) {
        if (t != null) {
            synchronized (this) {
                this.f58210a.remove(t);
            }
        }
        return t;
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24476aa
    /* renamed from: a */
    public T mo40349a(int i) {
        return m46810c(this.f58211b.mo40370a(i));
    }

    @Override // com.facebook.imagepipeline.memory.AbstractC24476aa
    /* renamed from: a */
    public void mo40350a(T t) {
        boolean add;
        synchronized (this) {
            add = this.f58210a.add(t);
        }
        if (add) {
            this.f58211b.mo40371a(mo40351b(t), t);
        }
    }
}
