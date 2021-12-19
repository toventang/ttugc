package com.p2082ss.android.ugc.aweme.search.p3695k;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.utils.C80632w;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.search.k.d */
public class C67542d<T extends C67540c<T>> extends C67540c<T> {

    /* renamed from: b */
    public static final C67543a f151270b = new C67543a((byte) 0);

    /* renamed from: a */
    public final C67568r f151271a;

    static {
        Covode.recordClassIndex(79179);
    }

    /* renamed from: com.ss.android.ugc.aweme.search.k.d$a */
    public static final class C67543a {
        static {
            Covode.recordClassIndex(79180);
        }

        private C67543a() {
        }

        public /* synthetic */ C67543a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.search.p3695k.C67511b
    /* renamed from: b */
    public final void mo106451b() {
        String str = this.f135167f;
        C89219l.m154716b(str, "");
        String str2 = this.f135169h;
        C67568r rVar = this.f151271a;
        C89219l.m154721d(str, "");
        mo96788a(C80632w.m139801a((Aweme) null, str, str2, rVar));
    }

    /* renamed from: r */
    public final T mo106491r(String str) {
        mo106452c("list_result_type", str);
        return this;
    }

    /* renamed from: s */
    public final T mo106492s(String str) {
        mo106452c("aladdin_words", str);
        return this;
    }

    /* renamed from: t */
    public final T mo106493t(String str) {
        mo106449b("user_tag", str);
        return this;
    }

    /* renamed from: u */
    public final T mo106494u(String str) {
        mo106452c("user_name", str);
        return this;
    }

    /* renamed from: v */
    public final T mo106495v(String str) {
        mo106452c("list_item_id", str);
        return this;
    }

    /* renamed from: x */
    public final T mo106497x(String str) {
        mo106452c("token_type", str);
        return this;
    }

    /* renamed from: y */
    public final T mo106498y(String str) {
        mo106452c("item_rank", str);
        return this;
    }

    /* renamed from: c */
    public final T mo106489c(Integer num) {
        mo106452c("relation_tag", String.valueOf(num));
        return this;
    }

    /* renamed from: d */
    public final T mo106490d(Integer num) {
        mo106452c("aladdin_rank", String.valueOf(num));
        return this;
    }

    /* renamed from: w */
    public final T mo106496w(String str) {
        C89219l.m154721d(str, "");
        mo106452c("is_aladdin", str);
        return this;
    }

    /* renamed from: z */
    public final T mo106499z(String str) {
        if (TextUtils.isEmpty(str) || C89219l.m154714a((Object) "null", (Object) str)) {
            mo106449b("music_tag_info", "");
        } else {
            mo106452c("music_tag_info", str);
        }
        return this;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67542d(String str, C67568r rVar) {
        super(str);
        C89219l.m154721d(str, "");
        this.f151271a = rVar;
    }
}
