package com.facebook.p1826c.p1828b;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1831c.C24075a;
import com.facebook.common.p1831c.C24077c;
import com.facebook.common.p1832d.AbstractC24093k;
import com.facebook.common.p1832d.C24091i;
import com.facebook.common.p1833e.C24099a;
import com.facebook.p1825b.AbstractC24018a;
import com.facebook.p1826c.p1827a.AbstractC24022b;
import com.facebook.p1826c.p1828b.AbstractC24045d;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

/* renamed from: com.facebook.c.b.f */
public class C24052f implements AbstractC24045d {

    /* renamed from: b */
    private static final Class<?> f56968b = C24052f.class;

    /* renamed from: a */
    volatile C24053a f56969a = new C24053a(null, null);

    /* renamed from: c */
    private final int f56970c;

    /* renamed from: d */
    private final AbstractC24093k<File> f56971d;

    /* renamed from: e */
    private final String f56972e;

    /* renamed from: f */
    private final AbstractC24022b f56973f;

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: c */
    public final void mo39557c() {
        m45541e().mo39557c();
    }

    static {
        Covode.recordClassIndex(28178);
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: d */
    public final Collection<AbstractC24045d.AbstractC24046a> mo39559d() {
        return m45541e().mo39559d();
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: a */
    public final boolean mo39553a() {
        try {
            return m45541e().mo39553a();
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: b */
    public final void mo39556b() {
        try {
            m45541e().mo39556b();
        } catch (IOException e) {
            C24099a.m45648b(f56968b, "purgeUnexpectedResources", e);
        }
    }

    /* renamed from: e */
    private synchronized AbstractC24045d m45541e() {
        AbstractC24045d dVar;
        MethodCollector.m26663i(5309);
        C24053a aVar = this.f56969a;
        if (aVar.f56974a == null || aVar.f56975b == null || !aVar.f56975b.exists()) {
            if (!(this.f56969a.f56974a == null || this.f56969a.f56975b == null)) {
                C24075a.m45590b(this.f56969a.f56975b);
            }
            File file = new File(this.f56971d.mo34217b(), this.f56972e);
            try {
                C24077c.m45595a(file);
                Class<?> cls = f56968b;
                String absolutePath = file.getAbsolutePath();
                if (C24099a.f57025a.mo39656b(3)) {
                    C24099a.f57025a.mo39654b(cls.getSimpleName(), C1764a.m5929a(null, "Created cache directory %s", new Object[]{absolutePath}));
                }
                this.f56969a = new C24053a(file, new C24033a(file, this.f56970c, this.f56973f));
            } catch (C24077c.C24078a e) {
                MethodCollector.m26664o(5309);
                throw e;
            }
        }
        dVar = (AbstractC24045d) C24091i.m45617a(this.f56969a.f56974a);
        MethodCollector.m26664o(5309);
        return dVar;
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: a */
    public final long mo39549a(AbstractC24045d.AbstractC24046a aVar) {
        return m45541e().mo39549a(aVar);
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: b */
    public final long mo39554b(String str) {
        return m45541e().mo39554b(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.c.b.f$a */
    public static class C24053a {

        /* renamed from: a */
        public final AbstractC24045d f56974a;

        /* renamed from: b */
        public final File f56975b;

        static {
            Covode.recordClassIndex(28179);
        }

        C24053a(File file, AbstractC24045d dVar) {
            this.f56974a = dVar;
            this.f56975b = file;
        }
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: c */
    public final boolean mo39558c(String str, Object obj) {
        return m45541e().mo39558c(str, obj);
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: a */
    public final AbstractC24045d.AbstractC24047b mo39551a(String str, Object obj) {
        return m45541e().mo39551a(str, obj);
    }

    @Override // com.facebook.p1826c.p1828b.AbstractC24045d
    /* renamed from: b */
    public final AbstractC24018a mo39555b(String str, Object obj) {
        return m45541e().mo39555b(str, obj);
    }

    public C24052f(int i, AbstractC24093k<File> kVar, String str, AbstractC24022b bVar) {
        this.f56970c = i;
        this.f56973f = bVar;
        this.f56971d = kVar;
        this.f56972e = str;
    }
}
