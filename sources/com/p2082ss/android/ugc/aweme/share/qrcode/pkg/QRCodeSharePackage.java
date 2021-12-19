package com.p2082ss.android.ugc.aweme.share.qrcode.pkg;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.qrcode.pkg.QRCodeSharePackage */
public final class QRCodeSharePackage extends SharePackage {

    /* renamed from: b */
    public static final C69397b f155006b = new C69397b((byte) 0);

    /* renamed from: a */
    public AbstractC69396a f155007a;

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.pkg.QRCodeSharePackage$a */
    public interface AbstractC69396a {
        static {
            Covode.recordClassIndex(81730);
        }

        /* renamed from: a */
        void mo109638a(AbstractC69581b bVar, Context context);
    }

    static {
        Covode.recordClassIndex(81729);
    }

    /* renamed from: com.ss.android.ugc.aweme.share.qrcode.pkg.QRCodeSharePackage$b */
    public static final class C69397b {
        static {
            Covode.recordClassIndex(81731);
        }

        private C69397b() {
        }

        public /* synthetic */ C69397b(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QRCodeSharePackage(SharePackage.C69654a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage
    /* renamed from: a */
    public final boolean mo109573a(AbstractC69581b bVar, Context context, AbstractC89172b<? super Boolean, C89391z> bVar2) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(context, "");
        C89219l.m154721d(bVar2, "");
        AbstractC69396a aVar = this.f155007a;
        if (aVar != null) {
            aVar.mo109638a(bVar, context);
        }
        bVar2.invoke(true);
        return true;
    }
}
