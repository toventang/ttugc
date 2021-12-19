package com.p2082ss.android.ugc.aweme.share.improve.p3757b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.p2082ss.android.ugc.aweme.base.utils.C34722h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.qrcode.C66414j;
import com.p2082ss.android.ugc.aweme.sharer.AbstractC69645h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.improve.b.f */
public final class C69119f extends AbstractC69118e {

    /* renamed from: a */
    public static final C69120a f154566a = new C69120a((byte) 0);

    /* renamed from: b */
    private final Aweme f154567b;

    static {
        Covode.recordClassIndex(81433);
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final String mo109548a() {
        return "qr_code";
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo109549a(Context context, AbstractC69645h hVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(hVar, "");
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.f$a */
    public static final class C69120a {
        static {
            Covode.recordClassIndex(81434);
        }

        private C69120a() {
        }

        public /* synthetic */ C69120a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: b */
    public final String mo109553b() {
        String b = C34722h.m70923b(R.string.f4e);
        C89219l.m154716b(b, "");
        return b;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.improve.b.f$b */
    static final class C69121b extends AbstractC89220m implements AbstractC89172b<C22999a, C89391z> {

        /* renamed from: a */
        public static final C69121b f154568a = new C69121b();

        static {
            Covode.recordClassIndex(81435);
        }

        C69121b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C22999a aVar) {
            C22999a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f54431a = R.raw.icon_color_qr_code_circle;
            return C89391z.f203057a;
        }
    }

    public C69119f(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f154567b = aweme;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final Drawable mo109547a(Context context) {
        if (context != null) {
            return C23005c.m43393a(C69121b.f154568a).mo37368a(context);
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.sharer.AbstractC69581b
    /* renamed from: a */
    public final boolean mo61913a(AbstractC69645h hVar, Context context) {
        String desc;
        String str = "";
        C89219l.m154721d(hVar, str);
        C89219l.m154721d(context, str);
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//qrcodev2");
        C66414j.C66415a aVar = new C66414j.C66415a();
        String aid = this.f154567b.getAid();
        aVar.f149318a.type = 1;
        aVar.f149318a.objectId = aid;
        aVar.f149318a.isHashTag = false;
        aVar.f149318a.hashTagName = str;
        aVar.f149318a.enterFrom = "video";
        Aweme aweme = this.f154567b;
        if (aweme == null) {
            desc = str;
        } else {
            desc = aweme.getDesc();
        }
        Aweme aweme2 = this.f154567b;
        if (!(aweme2 == null || aweme2.getAuthor() == null)) {
            str = aweme2.getAuthor().getNickname();
        }
        aVar.f149318a.title = desc;
        aVar.f149318a.describe = str;
        buildRoute.withParam("extra_params", aVar.f149318a).open();
        return true;
    }
}
