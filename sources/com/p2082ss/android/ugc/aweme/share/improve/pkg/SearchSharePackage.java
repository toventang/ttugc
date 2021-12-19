package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import com.p2082ss.android.ugc.aweme.utils.C80411ew;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.SearchSharePackage */
public final class SearchSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a */
    public static final C69237a f154766a = new C69237a((byte) 0);

    static {
        Covode.recordClassIndex(81563);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.SearchSharePackage$a */
    public static final class C69237a {
        static {
            Covode.recordClassIndex(81564);
        }

        private C69237a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.SearchSharePackage$a$a */
        public static final class C69238a implements AbstractC69690f {

            /* renamed from: a */
            final /* synthetic */ String f154767a;

            static {
                Covode.recordClassIndex(81565);
            }

            public C69238a(String str) {
                this.f154767a = str;
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

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
            /* renamed from: a */
            public final void mo60846a(AbstractC69693h hVar, SharePackage sharePackage, Context context) {
                C89219l.m154721d(hVar, "");
                C89219l.m154721d(sharePackage, "");
                C89219l.m154721d(context, "");
                AbstractC69690f.C69691a.m123094a(hVar, sharePackage, context);
            }

            @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b
            /* renamed from: a */
            public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
                C89219l.m154721d(bVar, "");
                C89219l.m154721d(context, "");
                if (z) {
                    String a = bVar.mo109548a();
                    String str = this.f154767a;
                    C33744d dVar = new C33744d();
                    dVar.mo59983a("platform", a);
                    C89219l.m154716b(dVar, "");
                    C80411ew.m139395a(str, dVar);
                    C39162r.m79460a("share_search_result", dVar.f79943a);
                }
            }
        }

        public /* synthetic */ C69237a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }
}
