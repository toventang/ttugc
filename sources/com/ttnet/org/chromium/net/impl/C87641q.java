package com.ttnet.org.chromium.net.impl;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.AbstractC87529ab;
import com.ttnet.org.chromium.net.AbstractC87545h;
import com.ttnet.org.chromium.net.AbstractC87655t;
import com.ttnet.org.chromium.net.AbstractC87678z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: com.ttnet.org.chromium.net.impl.q */
public class C87641q extends AbstractC87545h.AbstractC87546a {

    /* renamed from: b */
    private static final String f199058b = C87641q.class.getSimpleName();

    /* renamed from: a */
    public final ArrayList<Pair<String, String>> f199059a = new ArrayList<>();

    /* renamed from: c */
    private final AbstractC87592c f199060c;

    /* renamed from: d */
    private final String f199061d;

    /* renamed from: e */
    private final AbstractC87529ab.AbstractC87531b f199062e;

    /* renamed from: f */
    private final Executor f199063f;

    /* renamed from: g */
    private String f199064g;

    /* renamed from: h */
    private boolean f199065h;

    /* renamed from: i */
    private boolean f199066i;

    /* renamed from: j */
    private int f199067j = 3;

    /* renamed from: k */
    private Collection<Object> f199068k;

    /* renamed from: l */
    private AbstractC87678z f199069l;

    /* renamed from: m */
    private Executor f199070m;

    /* renamed from: n */
    private boolean f199071n;

    /* renamed from: o */
    private boolean f199072o;

    /* renamed from: p */
    private int f199073p;

    /* renamed from: q */
    private boolean f199074q;

    /* renamed from: r */
    private int f199075r;

    /* renamed from: s */
    private AbstractC87655t.AbstractC87656a f199076s;

    /* renamed from: t */
    private int f199077t;

    /* renamed from: u */
    private int f199078u;

    /* renamed from: v */
    private int f199079v;

    /* renamed from: w */
    private int f199080w;

    @Override // com.ttnet.org.chromium.net.AbstractC87545h.AbstractC87546a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC87545h.AbstractC87546a mo141794a() {
        this.f199065h = true;
        return this;
    }

    static {
        Covode.recordClassIndex(103623);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87545h.AbstractC87546a
    /* renamed from: b */
    public final /* synthetic */ AbstractC87545h mo141800b() {
        AbstractC87640p a = this.f199060c.mo141879a(this.f199061d, this.f199062e, this.f199063f, this.f199067j, this.f199068k, this.f199065h, this.f199066i, this.f199071n, this.f199072o, this.f199073p, this.f199074q, this.f199075r, this.f199076s);
        String str = this.f199064g;
        if (str != null) {
            a.mo141856a(str);
        }
        Iterator<Pair<String, String>> it = this.f199059a.iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            a.mo141859b((String) next.first, (String) next.second);
        }
        AbstractC87678z zVar = this.f199069l;
        if (zVar != null) {
            a.mo141854a(zVar, this.f199070m);
        }
        a.mo141858b(this.f199077t);
        a.mo141860c(this.f199078u);
        a.mo141861d(this.f199079v);
        a.mo141862e(this.f199080w);
        return a;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87545h.AbstractC87546a
    /* renamed from: c */
    public final /* bridge */ /* synthetic */ AbstractC87545h.AbstractC87546a mo141801c(int i) {
        this.f199067j = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87530a
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ AbstractC87529ab.AbstractC87530a mo141696d(int i) {
        this.f199077t = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87530a
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ AbstractC87529ab.AbstractC87530a mo141697e(int i) {
        this.f199078u = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87530a
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ AbstractC87529ab.AbstractC87530a mo141698f(int i) {
        this.f199079v = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87529ab.AbstractC87530a
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ AbstractC87529ab.AbstractC87530a mo141699g(int i) {
        this.f199080w = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87545h.AbstractC87546a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC87545h.AbstractC87546a mo141795a(int i) {
        this.f199072o = true;
        this.f199073p = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87545h.AbstractC87546a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ AbstractC87545h.AbstractC87546a mo141799b(int i) {
        this.f199074q = true;
        this.f199075r = i;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87545h.AbstractC87546a
    /* renamed from: a */
    public final AbstractC87545h.AbstractC87546a mo141797a(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.f199064g = str;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87545h.AbstractC87546a
    /* renamed from: a */
    public final /* synthetic */ AbstractC87545h.AbstractC87546a mo141796a(AbstractC87678z zVar, Executor executor) {
        Objects.requireNonNull(zVar, "Invalid UploadDataProvider.");
        Objects.requireNonNull(executor, "Invalid UploadDataProvider Executor.");
        if (this.f199064g == null) {
            this.f199064g = "POST";
        }
        this.f199069l = zVar;
        this.f199070m = executor;
        return this;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87545h.AbstractC87546a
    /* renamed from: a */
    public final /* synthetic */ AbstractC87545h.AbstractC87546a mo141798a(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        this.f199059a.add(Pair.create(str, str2));
        if ("Accept-Encoding".equalsIgnoreCase(str)) {
            this.f199059a.add(Pair.create(str, str2));
        }
        return this;
    }

    C87641q(String str, AbstractC87529ab.AbstractC87531b bVar, Executor executor, AbstractC87592c cVar) {
        Objects.requireNonNull(str, "URL is required.");
        Objects.requireNonNull(bVar, "Callback is required.");
        Objects.requireNonNull(executor, "Executor is required.");
        this.f199061d = str;
        this.f199062e = bVar;
        this.f199063f = executor;
        this.f199060c = cVar;
    }
}
