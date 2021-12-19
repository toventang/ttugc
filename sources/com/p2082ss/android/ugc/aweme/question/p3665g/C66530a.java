package com.p2082ss.android.ugc.aweme.question.p3665g;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.question.g.a */
public final class C66530a {
    @AbstractC27891c(mo46611a = "translation_info")

    /* renamed from: a */
    public List<C66531a> f149592a = new ArrayList();
    @AbstractC27891c(mo46611a = "trg_lang")

    /* renamed from: b */
    public String f149593b;

    static {
        Covode.recordClassIndex(78073);
    }

    /* renamed from: a */
    public final void mo105517a(String str) {
        if (str != null) {
            this.f149592a.add(new C66531a(this, str));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.question.g.a$a */
    public final class C66531a {
        @AbstractC27891c(mo46611a = "src_content")

        /* renamed from: a */
        public String f149594a;

        /* renamed from: b */
        final /* synthetic */ C66530a f149595b;

        static {
            Covode.recordClassIndex(78074);
        }

        public C66531a(C66530a aVar, String str) {
            C89219l.m154721d(str, "");
            this.f149595b = aVar;
            this.f149594a = str;
        }
    }
}
