package com.p2082ss.android.ugc.aweme.bullet.business;

import android.content.Context;
import android.webkit.WebView;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.share.improve.p3755a.C69037c;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69693h;
import com.p2082ss.android.ugc.aweme.sharer.p3782ui.SharePackage;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bullet.business.ShareBusiness */
public final class ShareBusiness extends AbsShareBusiness {

    /* renamed from: l */
    public WebView f82898l;

    static {
        Covode.recordClassIndex(42274);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00a6, code lost:
        if (r8.f82847e != false) goto L_0x00a8;
     */
    @Override // com.p2082ss.android.ugc.aweme.bullet.business.AbsShareBusiness
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo61926a() {
        /*
        // Method dump skipped, instructions count: 284
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.bullet.business.ShareBusiness.mo61926a():void");
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.business.ShareBusiness$a */
    public static final class C35122a implements AbstractC69690f {

        /* renamed from: a */
        final /* synthetic */ ShareBusiness f82899a;

        static {
            Covode.recordClassIndex(42275);
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: a */
        public final void mo60845a(SharePackage sharePackage, Context context) {
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: b */
        public final void mo60847b(SharePackage sharePackage, Context context) {
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C35122a(ShareBusiness shareBusiness) {
            this.f82899a = shareBusiness;
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69690f
        /* renamed from: a */
        public final void mo60846a(AbstractC69693h hVar, SharePackage sharePackage, Context context) {
            C89219l.m154721d(hVar, "");
            C89219l.m154721d(sharePackage, "");
            C89219l.m154721d(context, "");
            if (hVar instanceof C69037c) {
                this.f82899a.mo61927a(hVar.mo61919c());
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.sharer.p3782ui.AbstractC69660b
        /* renamed from: a */
        public final void mo60844a(AbstractC69581b bVar, boolean z, SharePackage sharePackage, Context context) {
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(context, "");
            this.f82899a.mo61927a(bVar.mo109548a());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareBusiness(C35123a aVar) {
        super(aVar);
        C89219l.m154721d(aVar, "");
    }
}
