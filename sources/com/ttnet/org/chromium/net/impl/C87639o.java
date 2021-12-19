package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87674x;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.ttnet.org.chromium.net.impl.o */
public class C87639o extends AbstractC87674x.AbstractC87675a {

    /* renamed from: a */
    private static final String f199040a = C87639o.class.getSimpleName();

    /* renamed from: b */
    private final AbstractC87592c f199041b;

    /* renamed from: c */
    private final AbstractC87674x.AbstractC87676b f199042c;

    /* renamed from: d */
    private final Executor f199043d;

    /* renamed from: e */
    private List<String> f199044e;

    /* renamed from: f */
    private int f199045f;

    /* renamed from: g */
    private String f199046g;

    /* renamed from: h */
    private long f199047h;

    /* renamed from: i */
    private int f199048i;

    /* renamed from: j */
    private long f199049j;

    /* renamed from: k */
    private String f199050k;

    /* renamed from: l */
    private int f199051l;

    /* renamed from: m */
    private String f199052m;

    /* renamed from: n */
    private Map<String, String> f199053n;

    /* renamed from: o */
    private Map<String, String> f199054o;

    /* renamed from: p */
    private boolean f199055p = true;

    /* renamed from: q */
    private boolean f199056q = true;

    static {
        Covode.recordClassIndex(103621);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87675a
    /* renamed from: a */
    public final AbstractC87674x mo142012a() {
        if (this.f199056q) {
            return this.f199041b.mo141881a(this.f199042c, this.f199043d, this.f199044e, this.f199045f, this.f199046g, this.f199047h, this.f199048i, this.f199049j, this.f199050k, this.f199051l, this.f199052m, this.f199053n, this.f199054o, this.f199055p);
        }
        return this.f199041b.mo141882a(this.f199042c, this.f199043d, this.f199044e, this.f199053n, this.f199054o, this.f199055p);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87675a
    /* renamed from: a */
    public final AbstractC87674x.AbstractC87675a mo142006a(int i) {
        this.f199045f = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87675a
    /* renamed from: b */
    public final AbstractC87674x.AbstractC87675a mo142013b(int i) {
        this.f199048i = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87675a
    /* renamed from: c */
    public final AbstractC87674x.AbstractC87675a mo142018c(int i) {
        this.f199051l = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87675a
    /* renamed from: a */
    public final AbstractC87674x.AbstractC87675a mo142007a(long j) {
        this.f199047h = j;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87675a
    /* renamed from: b */
    public final AbstractC87674x.AbstractC87675a mo142014b(long j) {
        this.f199049j = j;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87675a
    /* renamed from: a */
    public final AbstractC87674x.AbstractC87675a mo142008a(String str) {
        this.f199046g = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87675a
    /* renamed from: b */
    public final AbstractC87674x.AbstractC87675a mo142015b(String str) {
        this.f199050k = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87675a
    /* renamed from: a */
    public final AbstractC87674x.AbstractC87675a mo142009a(List<String> list) {
        this.f199044e = list;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87675a
    /* renamed from: b */
    public final AbstractC87674x.AbstractC87675a mo142016b(Map<String, String> map) {
        this.f199054o = map;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87675a
    /* renamed from: a */
    public final AbstractC87674x.AbstractC87675a mo142010a(Map<String, String> map) {
        this.f199053n = map;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87675a
    /* renamed from: b */
    public final AbstractC87674x.AbstractC87675a mo142017b(boolean z) {
        this.f199056q = z;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87674x.AbstractC87675a
    /* renamed from: a */
    public final AbstractC87674x.AbstractC87675a mo142011a(boolean z) {
        this.f199055p = z;
        return this;
    }

    C87639o(AbstractC87674x.AbstractC87676b bVar, Executor executor, AbstractC87592c cVar) {
        this.f199041b = cVar;
        this.f199042c = bVar;
        this.f199043d = executor;
    }
}
