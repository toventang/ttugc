package com.ttnet.org.chromium.net.impl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.net.model.C61425e;
import com.p2082ss.android.ugc.aweme.net.model.EnumC61424d;
import com.p2082ss.android.ugc.aweme.net.monitor.C61439n;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61416a;
import com.p2082ss.android.ugc.aweme.net.p3502l.C61417b;
import com.ttnet.org.chromium.net.AbstractC87529ab;
import com.ttnet.org.chromium.net.AbstractC87655t;
import com.ttnet.org.chromium.net.AbstractC87671w;
import com.ttnet.org.chromium.net.AbstractC87674x;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.net.ssl.HttpsURLConnection;

public final class JavaCronetEngine extends AbstractC87592c {

    /* renamed from: b */
    private final String f198871b;

    /* renamed from: c */
    private final ExecutorService f198872c;

    static {
        Covode.recordClassIndex(103558);
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: a */
    public final int mo141744a() {
        return 0;
    }

    /* access modifiers changed from: protected */
    @Override // com.ttnet.org.chromium.net.impl.AbstractC87592c
    /* renamed from: a */
    public final AbstractC87671w mo141880a(AbstractC87671w.AbstractC87673b bVar, Executor executor, int i, List<String> list, int i2, int i3) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87592c
    /* renamed from: a */
    public final AbstractC87674x mo141881a(AbstractC87674x.AbstractC87676b bVar, Executor executor, List<String> list, int i, String str, long j, int i2, long j2, String str2, int i3, String str3, Map<String, String> map, Map<String, String> map2, boolean z) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87592c
    /* renamed from: a */
    public final AbstractC87674x mo141882a(AbstractC87674x.AbstractC87676b bVar, Executor executor, List<String> list, Map<String, String> map, Map<String, String> map2, boolean z) {
        return null;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: a */
    public final void mo141746a(AbstractC87655t.AbstractC87656a aVar) {
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: c */
    public final int mo141761c() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: d */
    public final int mo141764d() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87543g
    /* renamed from: e */
    public final int mo141766e() {
        return -1;
    }

    @Override // com.ttnet.org.chromium.net.AbstractC87536c
    /* renamed from: a */
    public final URLConnection mo141715a(URL url) {
        URLConnection aVar;
        URLConnection aVar2;
        C61425e<URL, URLConnection> m = C61439n.f139485e.mo68809m(new C61425e<>(url, null, null, EnumC61424d.CONTINUE));
        if (m.f139473f == EnumC61424d.INTERCEPT && m.f139469b != null) {
            R r = m.f139469b;
            if (r instanceof HttpsURLConnection) {
                aVar2 = new C61417b(r);
            } else if (!(r instanceof HttpURLConnection)) {
                return r;
            } else {
                aVar2 = new C61416a(r);
            }
            return aVar2;
        } else if (m.f139473f != EnumC61424d.EXCEPTION || m.f139472e == null) {
            URLConnection openConnection = url.openConnection();
            if (openConnection instanceof HttpsURLConnection) {
                aVar = new C61417b((HttpsURLConnection) openConnection);
            } else if (!(openConnection instanceof HttpURLConnection)) {
                return openConnection;
            } else {
                aVar = new C61416a((HttpURLConnection) openConnection);
            }
            return aVar;
        } else {
            throw m.f139472e;
        }
    }

    @Override // com.ttnet.org.chromium.net.impl.AbstractC87592c
    /* renamed from: a */
    public final AbstractC87640p mo141879a(String str, AbstractC87529ab.AbstractC87531b bVar, Executor executor, int i, Collection<Object> collection, boolean z, boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, AbstractC87655t.AbstractC87656a aVar) {
        return new C87597h(bVar, this.f198872c, executor, str, this.f198871b, z3, z4, i2, z5, i3);
    }
}
