package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1211b.AbstractC17427b;
import com.bytedance.p1399im.core.p1408d.C19638h;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.AbstractC53732a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d.C53744b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88410b;
import p4560f.p4561a.AbstractC88973n;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4574a.C88502d;
import p4560f.p4561a.p4568e.p4573e.p4576c.C88620t;
import p4560f.p4561a.p4587h.C88925a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.c.h */
public final class C53722h implements AbstractC53721g {

    /* renamed from: a */
    public final ConcurrentHashMap<String, AbstractC17427b> f123249a;

    /* renamed from: b */
    public final AbstractC53719e f123250b;

    static {
        Covode.recordClassIndex(63302);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.c.h$c */
    static final class C53725c implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C53722h f123254a;

        /* renamed from: b */
        final /* synthetic */ String f123255b;

        static {
            Covode.recordClassIndex(63305);
        }

        C53725c(C53722h hVar, String str) {
            this.f123254a = hVar;
            this.f123255b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            this.f123254a.f123249a.remove(this.f123255b);
        }
    }

    public /* synthetic */ C53722h() {
        this(new C53720f());
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53721g
    /* renamed from: b */
    public final AbstractC88973n<C19638h> mo90307b(String str) {
        C89219l.m154721d(str, "");
        return this.f123250b.mo90301c(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53721g
    /* renamed from: d */
    public final boolean mo90309d(String str) {
        C89219l.m154721d(str, "");
        return this.f123250b.mo90304f(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.c.h$b */
    static final class C53724b<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C53722h f123253a;

        static {
            Covode.recordClassIndex(63304);
        }

        C53724b(C53722h hVar) {
            this.f123253a = hVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C19638h hVar = (C19638h) obj;
            C89219l.m154721d(hVar, "");
            AbstractC53719e eVar = this.f123253a.f123250b;
            String conversationId = hVar.getConversationId();
            C89219l.m154716b(conversationId, "");
            eVar.mo90303e(conversationId);
            return hVar;
        }
    }

    private C53722h(AbstractC53719e eVar) {
        C89219l.m154721d(eVar, "");
        this.f123250b = eVar;
        this.f123249a = new ConcurrentHashMap<>();
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.c.h$a */
    static final class C53723a<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C53722h f123251a;

        /* renamed from: b */
        final /* synthetic */ String f123252b;

        static {
            Covode.recordClassIndex(63303);
        }

        C53723a(C53722h hVar, String str) {
            this.f123251a = hVar;
            this.f123252b = str;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C19638h hVar = (C19638h) obj;
            C89219l.m154721d(hVar, "");
            if (hVar.isTemp()) {
                return this.f123251a.f123250b.mo90302d(this.f123252b);
            }
            AbstractC88403ab a = AbstractC88403ab.m153602a(hVar);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.c.h$d */
    static final class C53726d<T, R> implements AbstractC88434g {

        /* renamed from: a */
        final /* synthetic */ C53722h f123256a;

        /* renamed from: b */
        final /* synthetic */ String f123257b;

        /* renamed from: c */
        final /* synthetic */ String f123258c;

        static {
            Covode.recordClassIndex(63306);
        }

        C53726d(C53722h hVar, String str, String str2) {
            this.f123256a = hVar;
            this.f123257b = str;
            this.f123258c = str2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88434g
        public final /* synthetic */ Object apply(Object obj) {
            C19638h hVar = (C19638h) obj;
            C89219l.m154721d(hVar, "");
            Map<String, String> localExt = hVar.getLocalExt();
            if (localExt == null || !localExt.containsKey(this.f123257b)) {
                return C88925a.m154165a(C88502d.f200771a);
            }
            localExt.remove(this.f123257b);
            return this.f123256a.f123250b.mo90299a(this.f123258c, localExt);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53721g
    /* renamed from: a */
    public final AbstractC88979t<AbstractC53732a> mo90306a(String str) {
        AbstractC17427b putIfAbsent;
        C89219l.m154721d(str, "");
        ConcurrentHashMap<String, AbstractC17427b> concurrentHashMap = this.f123249a;
        AbstractC17427b bVar = concurrentHashMap.get(str);
        if (bVar == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (bVar = this.f123250b.mo90298a(str)))) != null) {
            bVar = putIfAbsent;
        }
        C89219l.m154716b(bVar, "");
        AbstractC17427b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        AbstractC88979t<AbstractC53732a> a = new C53744b(bVar2).mo143262a(new C53725c(this, str));
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53721g
    /* renamed from: c */
    public final AbstractC88403ab<C19638h> mo90308c(String str) {
        C89219l.m154721d(str, "");
        AbstractC88973n<C19638h> b = this.f123250b.mo90300b(str);
        AbstractC88403ab<C19638h> d = this.f123250b.mo90302d(str);
        C88466b.m153697a((Object) d, "other is null");
        AbstractC88403ab<C19638h> c = C88925a.m154163a(new C88620t(b, d)).mo142914a((AbstractC88434g) new C53723a(this, str)).mo142925c(new C53724b(this));
        C89219l.m154716b(c, "");
        return c;
    }

    @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3087c.AbstractC53721g
    /* renamed from: a */
    public final AbstractC88410b mo90305a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        AbstractC88410b b = this.f123250b.mo90300b(str).mo143241b(new C53726d(this, str2, str));
        C89219l.m154716b(b, "");
        return b;
    }
}
