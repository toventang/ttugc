package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.common.C39088c;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49955a;
import com.p2082ss.android.ugc.aweme.feed.p2969u.C49966c;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.share.improve.p3758c.C69128d;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.sticker.model.C75445g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage */
public final class StickerSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a */
    public static final C69239a f154768a = new C69239a((byte) 0);

    static {
        Covode.recordClassIndex(81566);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$a */
    public static final class C69239a {
        static {
            Covode.recordClassIndex(81567);
        }

        private C69239a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.StickerSharePackage$a$a */
        public static final class C69240a implements AbstractC69690f {

            /* renamed from: a */
            final /* synthetic */ C75445g f154769a;

            static {
                Covode.recordClassIndex(81568);
            }

            public C69240a(C75445g gVar) {
                this.f154769a = gVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: a */
            public final void mo60845a(SharePackage sharePackage, Context context) {
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123095b(sharePackage, context);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: b */
            public final void mo60847b(SharePackage sharePackage, Context context) {
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123093a(sharePackage, context);
            }

            /* renamed from: a */
            private static void m122358a(String str, boolean z, C75445g gVar) {
                if (z && gVar != null) {
                    C39088c cVar = new C39088c();
                    cVar.mo67838a(new C49955a());
                    C49966c.C49967a aVar = new C49966c.C49967a();
                    aVar.f115215a = gVar.f169545id;
                    aVar.f115216b = 1;
                    aVar.f115221g = 5;
                    aVar.f115222h = str;
                    cVar.mo57616a(aVar.mo85008a());
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: a */
            public final void mo60846a(AbstractC69693h hVar, SharePackage sharePackage, Context context) {
                C89219l.m154721d(hVar, "");
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                if (C69128d.m122236a(hVar)) {
                    m122358a(hVar.mo61919c(), true, this.f154769a);
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b
            /* renamed from: a */
            public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
                C89219l.m154721d(bVar, "");
                C89219l.m154721d(context, "");
                C68863ah.f154028b.mo109361a(bVar.mo109548a(), 0);
                m122358a(bVar.mo109548a(), z, this.f154769a);
            }
        }

        public /* synthetic */ C69239a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }
}
