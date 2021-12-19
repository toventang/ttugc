package com.p2082ss.android.ugc.aweme.share.improve.pkg;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.p3754i.C68960a;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveEventSharePackage */
public final class LiveEventSharePackage extends LinkDefaultSharePackage {

    /* renamed from: a */
    public static final C69224a f154738a = new C69224a((byte) 0);

    static {
        Covode.recordClassIndex(81544);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveEventSharePackage$a */
    public static final class C69224a {
        static {
            Covode.recordClassIndex(81545);
        }

        private C69224a() {
        }

        public /* synthetic */ C69224a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.share.improve.pkg.LiveEventSharePackage$a$a */
        public static final class C69225a extends AbstractC89220m implements AbstractC89172b<AbstractC69581b, Boolean> {

            /* renamed from: a */
            public static final C69225a f154739a = new C69225a();

            static {
                Covode.recordClassIndex(81546);
            }

            C69225a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Boolean invoke(AbstractC69581b bVar) {
                C89219l.m154721d(bVar, "");
                return false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveEventSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final boolean mo109573a(AbstractC69581b bVar, Context context, AbstractC89172b<? super Boolean, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar2, "");
        C68960a.m121644a().mo109504a(bVar.mo109548a(), 0);
        return false;
    }
}
