package com.p2082ss.android.ugc.aweme.commercialize.p2566g;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.android.base.runtime.p1120b.C16101a;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p1879d.C24389j;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1844d.AbstractC24156b;
import com.facebook.p1844d.AbstractC24157c;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.commercialize.g.b */
public final class C38002b {

    /* renamed from: com.ss.android.ugc.aweme.commercialize.g.b$a */
    public interface AbstractC38004a {
        static {
            Covode.recordClassIndex(45465);
        }

        /* renamed from: a */
        void mo59242a();

        /* renamed from: b */
        void mo59243b();
    }

    static {
        Covode.recordClassIndex(45463);
    }

    /* renamed from: a */
    public static boolean m77063a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return C24428k.m46551a().mo40246d().mo39582d(C24389j.m46446a().mo40187a(C24636b.fromUri(uri)));
    }

    /* renamed from: a */
    public static void m77060a(SimpleDraweeView simpleDraweeView, UrlModel urlModel) {
        m77061a(simpleDraweeView, urlModel, new C38001a(simpleDraweeView));
    }

    /* renamed from: a */
    public static void m77062a(String str, final AbstractC38004a aVar) {
        if (str != null && !str.isEmpty() && !m77063a(Uri.parse(str))) {
            C24428k.m46551a().mo40247e().mo40232c(C24636b.fromUri(str), null).mo39739a(new AbstractC24156b<Void>() {
                /* class com.p2082ss.android.ugc.aweme.commercialize.p2566g.C38002b.C380031 */

                static {
                    Covode.recordClassIndex(45464);
                }

                @Override // com.facebook.p1844d.AbstractC24156b
                public final void onFailureImpl(AbstractC24157c<Void> cVar) {
                    AbstractC38004a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo59243b();
                    }
                }

                @Override // com.facebook.p1844d.AbstractC24156b
                public final void onNewResultImpl(AbstractC24157c<Void> cVar) {
                    AbstractC38004a aVar = aVar;
                    if (aVar != null) {
                        aVar.mo59242a();
                    }
                }
            }, C16101a.m29901a());
        }
    }

    /* renamed from: a */
    public static void m77061a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, AbstractC24203d dVar) {
        C24636b[] a;
        if (simpleDraweeView != null && simpleDraweeView.getContext() != null && urlModel != null && !C13603b.m24435a((Collection) urlModel.getUrlList()) && (a = C34577e.m70605a(urlModel, Bitmap.Config.ARGB_8888)) != null && a.length != 0) {
            C24185e b = C24182c.m45843b();
            b.f57309m = simpleDraweeView.getController();
            b.f57306j = false;
            AbstractC24198b a2 = b.mo39823a(a);
            a2.f57303g = C34577e.m70586a(dVar);
            simpleDraweeView.setController(a2.mo39827e());
        }
    }
}
