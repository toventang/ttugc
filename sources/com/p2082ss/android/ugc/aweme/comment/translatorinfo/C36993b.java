package com.p2082ss.android.ugc.aweme.comment.translatorinfo;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.comment.translatorinfo.api.CommentTranslatorInfoApi;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.translatorinfo.b */
public final class C36993b {

    /* renamed from: a */
    public CommentTranslatorInfoApi.C36991a f87127a;

    /* renamed from: b */
    public final Context f87128b;

    /* renamed from: c */
    public final AbstractC36990a f87129c;

    static {
        Covode.recordClassIndex(44342);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.translatorinfo.b$a */
    public static final class C36994a implements AbstractC88406ae<CommentTranslatorInfoApi.C36991a> {

        /* renamed from: a */
        final /* synthetic */ C36993b f87130a;

        /* renamed from: b */
        final /* synthetic */ Aweme f87131b;

        static {
            Covode.recordClassIndex(44343);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            C89219l.m154721d(th, "");
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(CommentTranslatorInfoApi.C36991a aVar) {
            CommentTranslatorInfoApi.C36991a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            this.f87130a.f87127a = aVar2;
            this.f87130a.f87129c.mo64487r();
        }

        C36994a(C36993b bVar, Aweme aweme) {
            this.f87130a = bVar;
            this.f87131b = aweme;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0056 A[EDGE_INSN: B:34:0x0056->B:25:0x0056 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64492a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r11) {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.translatorinfo.C36993b.mo64492a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public C36993b(Context context, AbstractC36990a aVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        this.f87128b = context;
        this.f87129c = aVar;
    }
}
