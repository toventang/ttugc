package com.p2082ss.android.ugc.aweme.discover.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.ContinuousLoadingAwemeList;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;
import p4640l.p4644b.AbstractC89722f;
import p4640l.p4644b.AbstractC89736t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SearchContinuousLoadingApi */
public interface SearchContinuousLoadingApi {

    /* renamed from: a */
    public static final C41846a f97614a = C41846a.f97615a;

    static {
        Covode.recordClassIndex(49767);
    }

    @AbstractC89722f(mo144276a = "/aweme/v1/search/loadmore/")
    AbstractC88979t<ContinuousLoadingAwemeList> getAwemeList(@AbstractC89736t(mo144292a = "keyword") String str, @AbstractC89736t(mo144292a = "type") int i, @AbstractC89736t(mo144292a = "id") String str2, @AbstractC89736t(mo144292a = "cursor") int i2, @AbstractC89736t(mo144292a = "count") int i3, @AbstractC89736t(mo144292a = "last_create_time") long j);

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchContinuousLoadingApi$a */
    public static final class C41846a {

        /* renamed from: a */
        static final /* synthetic */ C41846a f97615a = new C41846a();

        private C41846a() {
        }

        static {
            Covode.recordClassIndex(49768);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchContinuousLoadingApi$b */
    public static final class C41847b {

        /* renamed from: a */
        public String f97616a;

        /* renamed from: b */
        public int f97617b = -1;

        /* renamed from: c */
        public String f97618c;

        /* renamed from: d */
        public int f97619d;

        /* renamed from: e */
        public int f97620e = 10;

        /* renamed from: f */
        public long f97621f;

        static {
            Covode.recordClassIndex(49769);
        }

        /* renamed from: a */
        public final void mo71012a(C41847b bVar) {
            C89219l.m154721d(bVar, "");
            this.f97616a = bVar.f97616a;
            this.f97617b = bVar.f97617b;
            this.f97618c = bVar.f97618c;
            this.f97619d = bVar.f97619d;
            this.f97620e = bVar.f97620e;
            this.f97621f = bVar.f97621f;
        }
    }
}
