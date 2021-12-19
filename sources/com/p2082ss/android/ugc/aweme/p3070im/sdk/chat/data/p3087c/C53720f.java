package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17420a;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53735ac;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53740ad;
import java.util.Map;
import java.util.concurrent.Callable;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88407af;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88976q;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.c.f */
public final class C53720f implements AbstractC53719e {

    /* renamed from: a */
    private final AbstractC17420a f123248a;

    static {
        Covode.recordClassIndex(63300);
    }

    public /* synthetic */ C53720f() {
        this(AbstractC17420a.C17421a.m32276a());
    }

    private C53720f(AbstractC17420a aVar) {
        C89219l.m154721d(aVar, "");
        this.f123248a = aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53719e
    /* renamed from: a */
    public final AbstractC17427b mo90298a(String str) {
        C89219l.m154721d(str, "");
        return AbstractC17427b.C17428a.m32308a(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53719e
    /* renamed from: e */
    public final void mo90303e(String str) {
        C89219l.m154721d(str, "");
        this.f123248a.mo27731c(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53719e
    /* renamed from: f */
    public final boolean mo90304f(String str) {
        C89219l.m154721d(str, "");
        return this.f123248a.mo27733d(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53719e
    /* renamed from: b */
    public final AbstractC88973n<C19638h> mo90300b(String str) {
        C89219l.m154721d(str, "");
        AbstractC17420a aVar = this.f123248a;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        AbstractC88973n<C19638h> a = AbstractC88973n.m154246a((Callable) new C53735ac.CallableC53737b(aVar, str));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53719e
    /* renamed from: c */
    public final AbstractC88973n<C19638h> mo90301c(String str) {
        C89219l.m154721d(str, "");
        AbstractC17420a aVar = this.f123248a;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        AbstractC88973n<C19638h> a = AbstractC88973n.m154246a((Callable) new C53735ac.CallableC53736a(aVar, str));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53719e
    /* renamed from: d */
    public final AbstractC88403ab<C19638h> mo90302d(String str) {
        C89219l.m154721d(str, "");
        AbstractC17420a aVar = this.f123248a;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        AbstractC88403ab<C19638h> a = AbstractC88403ab.m153596a((AbstractC88407af) new C53735ac.C53738c(aVar, str));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53719e
    /* renamed from: a */
    public final AbstractC88410b mo90299a(String str, Map<String, String> map) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(map, "");
        AbstractC17427b a = mo90298a(str);
        C89219l.m154721d(a, "");
        C89219l.m154721d(map, "");
        AbstractC88973n a2 = AbstractC88973n.m154243a((AbstractC88976q) new C53740ad.C53741a(a, map));
        C89219l.m154716b(a2, "");
        AbstractC88410b b = a2.mo143240b();
        C89219l.m154716b(b, "");
        return b;
    }
}
