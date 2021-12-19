package com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.api;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.api.CommentFilterApi;
import com.p2082ss.android.ugc.aweme.compliance.business.commentfilter.p2648b.C39381a;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.api.a */
public final class C39377a {

    /* renamed from: b */
    public static final C39378a f92957b = new C39378a((byte) 0);

    /* renamed from: a */
    public final DataCenter f92958a;

    /* renamed from: c */
    private final AbstractC89244h f92959c = C89250i.m154773a((AbstractC89171a) C39380c.f92961a);

    static {
        Covode.recordClassIndex(47063);
    }

    /* renamed from: a */
    public final CommentFilterApi.API mo68821a() {
        return (CommentFilterApi.API) this.f92959c.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.api.a$a */
    public static final class C39378a {
        static {
            Covode.recordClassIndex(47064);
        }

        private C39378a() {
        }

        public /* synthetic */ C39378a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.api.a$c */
    static final class C39380c extends AbstractC89220m implements AbstractC89171a<CommentFilterApi.API> {

        /* renamed from: a */
        public static final C39380c f92961a = new C39380c();

        static {
            Covode.recordClassIndex(47066);
        }

        C39380c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ CommentFilterApi.API invoke() {
            return CommentFilterApi.f92956a;
        }
    }

    /* renamed from: b */
    public final void mo68822b() {
        CommentFilterApi.API a = mo68821a();
        C89219l.m154716b(a, "");
        a.getCommentFilterKeywords().mo5534a(new C39379b(this), C1731i.f5564c, null);
    }

    public C39377a(DataCenter dataCenter) {
        this.f92958a = dataCenter;
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.business.commentfilter.api.a$b */
    static final class C39379b<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C39377a f92960a;

        static {
            Covode.recordClassIndex(47065);
        }

        C39379b(C39377a aVar) {
            this.f92960a = aVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<C39381a> iVar) {
            DataCenter dataCenter;
            C89219l.m154716b(iVar, "");
            if (!iVar.mo5539b() && !iVar.mo5544c() && iVar.mo5535a() && (dataCenter = this.f92960a.f92958a) != null) {
                dataCenter.mo60191a("list_keywords", iVar.mo5545d().f92962a);
            }
            return null;
        }
    }
}
