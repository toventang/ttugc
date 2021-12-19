package com.bytedance.frameworks.baselib.network.http.p984c;

import com.bytedance.covode.number.Covode;
import java.net.URI;

/* renamed from: com.bytedance.frameworks.baselib.network.http.c.b */
public interface AbstractC14627b {

    /* renamed from: a */
    public static final AbstractC14627b f35418a = new AbstractC14627b() {
        /* class com.bytedance.frameworks.baselib.network.http.p984c.AbstractC14627b.C146281 */

        static {
            Covode.recordClassIndex(16719);
        }

        @Override // com.bytedance.frameworks.baselib.network.http.p984c.AbstractC14627b
        /* renamed from: a */
        public final boolean mo23504a(URI uri, C14633e eVar) {
            return true;
        }
    };

    /* renamed from: b */
    public static final AbstractC14627b f35419b = new AbstractC14627b() {
        /* class com.bytedance.frameworks.baselib.network.http.p984c.AbstractC14627b.C146292 */

        static {
            Covode.recordClassIndex(16720);
        }

        @Override // com.bytedance.frameworks.baselib.network.http.p984c.AbstractC14627b
        /* renamed from: a */
        public final boolean mo23504a(URI uri, C14633e eVar) {
            return false;
        }
    };

    /* renamed from: c */
    public static final AbstractC14627b f35420c = new AbstractC14627b() {
        /* class com.bytedance.frameworks.baselib.network.http.p984c.AbstractC14627b.C146303 */

        static {
            Covode.recordClassIndex(16721);
        }

        @Override // com.bytedance.frameworks.baselib.network.http.p984c.AbstractC14627b
        /* renamed from: a */
        public final boolean mo23504a(URI uri, C14633e eVar) {
            return C14633e.m26740a(eVar.f35430d, uri.getHost());
        }
    };

    /* renamed from: a */
    boolean mo23504a(URI uri, C14633e eVar);

    static {
        Covode.recordClassIndex(16718);
    }
}
