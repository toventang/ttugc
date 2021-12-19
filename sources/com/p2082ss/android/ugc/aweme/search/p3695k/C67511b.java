package com.p2082ss.android.ugc.aweme.search.p3695k;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67511b;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.k.b */
public class C67511b<T extends C67511b<T>> extends AbstractC59233c<T> {

    /* renamed from: c */
    public static final C67512a f151214c = new C67512a((byte) 0);

    /* renamed from: a */
    private final HashMap<String, String> f151215a = new HashMap<>();

    static {
        Covode.recordClassIndex(79148);
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: a */
    public void mo69786a() {
    }

    /* renamed from: b */
    public void mo106451b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.search.k.b$a */
    public static final class C67512a {
        static {
            Covode.recordClassIndex(79149);
        }

        private C67512a() {
        }

        public /* synthetic */ C67512a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.metrics.AbstractC59233c
    /* renamed from: e */
    public final void mo96791e() {
        super.mo96791e();
        this.f135168g.putAll(this.f151215a);
    }

    /* renamed from: i */
    public final T mo106453i(String str) {
        mo106452c("group_id", str);
        return this;
    }

    /* renamed from: j */
    public final T mo106454j(String str) {
        mo106452c("author_id", str);
        return this;
    }

    /* renamed from: k */
    public final T mo106455k(String str) {
        mo106452c("music_id", str);
        return this;
    }

    /* renamed from: l */
    public final T mo106456l(String str) {
        mo106452c("user_list", str);
        return this;
    }

    /* renamed from: m */
    public final T mo106457m(String str) {
        mo106452c("previous_page", str);
        return this;
    }

    /* renamed from: n */
    public final T mo106458n(String str) {
        mo106452c("request_id", str);
        return this;
    }

    /* renamed from: p */
    public final T mo106460p(String str) {
        mo106452c("enter_method", str);
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67511b(String str) {
        super(str);
        C89219l.m154721d(str, "");
    }

    /* renamed from: o */
    public final T mo106459o(String str) {
        this.f135169h = str;
        mo106451b();
        mo106452c("enter_from", str);
        return this;
    }

    /* renamed from: b */
    public final T mo106450b(Map<String, String> map) {
        C89219l.m154721d(map, "");
        this.f151215a.putAll(map);
        return this;
    }

    /* renamed from: b */
    public final T mo106449b(String str, String str2) {
        C89219l.m154721d(str, "");
        HashMap<String, String> hashMap = this.f151215a;
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(str, str2);
        return this;
    }

    /* renamed from: c */
    public final T mo106452c(String str, String str2) {
        C89219l.m154721d(str, "");
        if (!(str2 == null || str2.length() == 0)) {
            this.f151215a.put(str, str2);
        }
        return this;
    }
}
