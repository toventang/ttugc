package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87671w;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.ttnet.org.chromium.net.impl.n */
public class C87638n extends AbstractC87671w.AbstractC87672a {

    /* renamed from: a */
    private static final String f199032a = C87638n.class.getSimpleName();

    /* renamed from: b */
    private final AbstractC87592c f199033b;

    /* renamed from: c */
    private final Executor f199034c = null;

    /* renamed from: d */
    private final AbstractC87671w.AbstractC87673b f199035d;

    /* renamed from: e */
    private int f199036e;

    /* renamed from: f */
    private List<String> f199037f;

    /* renamed from: g */
    private int f199038g;

    /* renamed from: h */
    private int f199039h;

    static {
        Covode.recordClassIndex(103620);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87671w.AbstractC87672a
    /* renamed from: a */
    public final AbstractC87671w mo142003a() {
        return this.f199033b.mo141880a(this.f199035d, this.f199034c, this.f199036e, this.f199037f, this.f199038g, this.f199039h);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87671w.AbstractC87672a
    /* renamed from: a */
    public final AbstractC87671w.AbstractC87672a mo142001a(int i) {
        this.f199036e = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87671w.AbstractC87672a
    /* renamed from: b */
    public final AbstractC87671w.AbstractC87672a mo142004b(int i) {
        this.f199038g = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87671w.AbstractC87672a
    /* renamed from: c */
    public final AbstractC87671w.AbstractC87672a mo142005c(int i) {
        this.f199039h = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87671w.AbstractC87672a
    /* renamed from: a */
    public final AbstractC87671w.AbstractC87672a mo142002a(List<String> list) {
        this.f199037f = list;
        return this;
    }

    C87638n(AbstractC87671w.AbstractC87673b bVar, AbstractC87592c cVar) {
        this.f199033b = cVar;
        this.f199035d = bVar;
    }
}
