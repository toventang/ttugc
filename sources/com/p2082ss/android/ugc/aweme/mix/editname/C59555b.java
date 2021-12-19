package com.p2082ss.android.ugc.aweme.mix.editname;

import com.bytedance.assem.arch.p794a.AbstractC12644a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mix.api.MixFeedApi;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59395a;
import com.p2082ss.android.ugc.aweme.mix.api.response.C59396b;
import p4560f.p4561a.AbstractC88403ab;
import p4560f.p4561a.AbstractC88979t;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.mix.editname.b */
public final class C59555b implements AbstractC12644a<AbstractC59557c> {

    /* renamed from: a */
    public final MixFeedApi f135910a = MixFeedApi.C59385a.m109095a();

    /* renamed from: b */
    public final AbstractC59557c f135911b = new C59556a(this);

    static {
        Covode.recordClassIndex(69952);
    }

    /* Return type fixed from 'com.bytedance.assem.arch.a.d' to match base method */
    @Override // com.bytedance.assem.arch.p794a.AbstractC12644a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ AbstractC59557c mo20458a() {
        return this.f135911b;
    }

    /* renamed from: com.ss.android.ugc.aweme.mix.editname.b$a */
    public static final class C59556a implements AbstractC59557c {

        /* renamed from: a */
        final /* synthetic */ C59555b f135912a;

        static {
            Covode.recordClassIndex(69953);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59556a(C59555b bVar) {
            this.f135912a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.mix.editname.AbstractC59557c
        /* renamed from: a */
        public final AbstractC88979t<C59395a> mo97161a(int i, String str) {
            C89219l.m154721d(str, "");
            return this.f135912a.f135910a.checkPlaylistName(i, str);
        }

        @Override // com.p2082ss.android.ugc.aweme.mix.editname.AbstractC59557c
        /* renamed from: a */
        public final AbstractC88403ab<C59396b> mo97160a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            return this.f135912a.f135910a.manageMixFeed(MixFeedApi.EnumC59386b.RENAME.getOperation(), str, null, null, null, str2);
        }
    }
}
