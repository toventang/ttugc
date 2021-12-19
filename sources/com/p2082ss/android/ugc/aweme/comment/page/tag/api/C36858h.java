package com.p2082ss.android.ugc.aweme.comment.page.tag.api;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.api.h */
public final class C36858h implements AbstractC12644a<AbstractC36857g> {

    /* renamed from: a */
    public VideoTagApi f86844a;

    /* renamed from: b */
    public final AbstractC36857g f86845b = new C36859a(this);

    static {
        Covode.recordClassIndex(44196);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC36857g mo20458a() {
        return this.f86845b;
    }

    /* renamed from: b */
    public final VideoTagApi mo64357b() {
        VideoTagApi videoTagApi = this.f86844a;
        if (videoTagApi == null) {
            C89219l.m154710a("videoTagApi");
        }
        return videoTagApi;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.page.tag.api.h$a */
    public static final class C36859a implements AbstractC36857g {

        /* renamed from: a */
        final /* synthetic */ C36858h f86846a;

        static {
            Covode.recordClassIndex(44197);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C36859a(C36858h hVar) {
            this.f86846a = hVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.page.tag.api.AbstractC36857g
        /* renamed from: a */
        public final AbstractC88979t<C36852b> mo64354a(long j) {
            return this.f86846a.mo64357b().mentionAwemeCheck(j);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.page.tag.api.AbstractC36857g
        /* renamed from: a */
        public final AbstractC88979t<BaseResponse> mo64355a(String str, String str2, long j) {
            return this.f86846a.mo64357b().tagUpdate(str, str2, j);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.page.tag.api.AbstractC36857g
        /* renamed from: a */
        public final AbstractC88979t<C36852b> mo64356a(String str, String str2, boolean z, long j) {
            return this.f86846a.mo64357b().mentionCheck(str, str2, z, j);
        }
    }
}
