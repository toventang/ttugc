package com.bytedance.android.live.liveinteract.platform.common.p377h;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24195a;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1886k.C24460a;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.liveinteract.platform.common.h.d */
public final class C5746d {

    /* renamed from: a */
    public static final C5746d f14573a = new C5746d();

    /* renamed from: b */
    private static final C5748b f14574b = new C5748b();

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.h.d$b */
    public static final class C5748b extends C24460a {
        static {
            Covode.recordClassIndex(6346);
        }

        C5748b() {
        }

        @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
        public final void onRequestSuccess(C24636b bVar, String str, boolean z) {
            Uri uri;
            super.onRequestSuccess(bVar, str, z);
            StringBuilder sb = new StringBuilder(" preLoad, onRequestSuccess, uri = ");
            if (bVar != null) {
                uri = bVar.mSourceUri;
            } else {
                uri = null;
            }
            C3854a.m9453a(4, "WebPResourceUtilsTAG", sb.append(uri).toString());
        }

        @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
        public final void onRequestStart(C24636b bVar, Object obj, String str, boolean z) {
            Uri uri;
            super.onRequestStart(bVar, obj, str, z);
            StringBuilder sb = new StringBuilder(" preLoad, onRequestStart, uri = ");
            if (bVar != null) {
                uri = bVar.mSourceUri;
            } else {
                uri = null;
            }
            C3854a.m9453a(4, "WebPResourceUtilsTAG", sb.append(uri).toString());
        }

        @Override // com.facebook.imagepipeline.p1886k.C24460a, com.facebook.imagepipeline.p1886k.AbstractC24462c
        public final void onRequestFailure(C24636b bVar, String str, Throwable th, boolean z) {
            Uri uri;
            super.onRequestFailure(bVar, str, th, z);
            StringBuilder sb = new StringBuilder(" preLoad, onRequestFailure, uri = ");
            if (bVar != null) {
                uri = bVar.mSourceUri;
            } else {
                uri = null;
            }
            C3854a.m9453a(4, "WebPResourceUtilsTAG", sb.append(uri).append(" throwable = ").append(th).toString());
        }
    }

    private C5746d() {
    }

    static {
        Covode.recordClassIndex(6344);
    }

    /* renamed from: com.bytedance.android.live.liveinteract.platform.common.h.d$a */
    public static final class C5747a extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f14575a;

        static {
            Covode.recordClassIndex(6345);
        }

        C5747a(AbstractC89171a aVar) {
            this.f14575a = aVar;
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final void onFailure(String str, Throwable th) {
            super.onFailure(str, th);
            C3854a.m9453a(4, "WebPResourceUtilsTAG", "onFailure, id = " + str + "  throwable = " + th);
            AbstractC89171a aVar = this.f14575a;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* renamed from: a */
    public static final void m12614a(Context context, String str) {
        C89219l.m154721d(context, "");
        C3854a.m9453a(4, "WebPResourceUtilsTAG", " preLoad, targetUrl = ".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            C24413h e = C24428k.m46551a().mo40247e();
            C24639c a = C24639c.m47149a(Uri.parse(str));
            a.f58564o = f14574b;
            e.mo40236d(a.mo40483a(), context);
        }
    }

    /* renamed from: a */
    public static final void m12615a(SimpleDraweeView simpleDraweeView, String str, AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(simpleDraweeView, "");
        C3854a.m9453a(4, "WebPResourceUtilsTAG", " loadWebP, targetUrl = ".concat(String.valueOf(str)));
        if (!TextUtils.isEmpty(str)) {
            C24185e a = C24182c.m45843b().mo39799b(Uri.parse(str));
            a.f57306j = true;
            a.f57303g = new C5747a(aVar);
            AbstractC24195a c = a.mo39827e();
            C89219l.m154716b(c, "");
            simpleDraweeView.setController(c);
        } else if (aVar != null) {
            aVar.invoke();
        }
    }
}
