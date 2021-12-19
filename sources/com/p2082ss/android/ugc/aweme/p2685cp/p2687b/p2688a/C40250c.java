package com.p2082ss.android.ugc.aweme.p2685cp.p2687b.p2688a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.common.utility.C13598c;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.xelement.defaultimpl.player.impl.AbstractC19205d;
import com.facebook.common.p1830b.C24065a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1881f.AbstractC24435b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.p1844d.AbstractC24157c;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.cp.b.a.c */
public final class C40250c implements AbstractC19205d {

    /* renamed from: a */
    private AbstractC24157c<C24117a<AbstractC24454c>> f94461a;

    /* renamed from: b */
    private final int f94462b;

    static {
        Covode.recordClassIndex(48051);
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.impl.AbstractC19205d
    /* renamed from: a */
    public final void mo30554a() {
        AbstractC24157c<C24117a<AbstractC24454c>> cVar = this.f94461a;
        if (cVar != null) {
            cVar.mo39750g();
        }
        this.f94461a = null;
    }

    public C40250c() {
        int i;
        Context a = C17867d.m33078a();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C13598c.m24426a(a, "window");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int orientation = windowManager.getDefaultDisplay().getOrientation();
        if (orientation == 1 || orientation == 3) {
            i = displayMetrics.heightPixels;
        } else {
            i = displayMetrics.widthPixels;
        }
        this.f94462b = Math.min(i / 3, 300);
    }

    /* renamed from: com.ss.android.ugc.aweme.cp.b.a.c$a */
    public static final class C40251a extends AbstractC24435b {

        /* renamed from: a */
        final /* synthetic */ C40250c f94463a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89172b f94464b;

        static {
            Covode.recordClassIndex(48052);
        }

        @Override // com.facebook.imagepipeline.p1881f.AbstractC24435b
        /* renamed from: a */
        public final void mo9033a(Bitmap bitmap) {
            this.f94464b.invoke(bitmap);
        }

        @Override // com.facebook.p1844d.AbstractC24156b
        public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
            this.f94464b.invoke(null);
        }

        C40251a(C40250c cVar, AbstractC89172b bVar) {
            this.f94463a = cVar;
            this.f94464b = bVar;
        }
    }

    @Override // com.bytedance.ies.xelement.defaultimpl.player.impl.AbstractC19205d
    /* renamed from: a */
    public final void mo30555a(String str, AbstractC89172b<? super Bitmap, C89391z> bVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(bVar, "");
        AbstractC24157c<C24117a<AbstractC24454c>> cVar = this.f94461a;
        if (cVar != null) {
            cVar.mo39750g();
        }
        C24413h e = C24428k.m46551a().mo40247e();
        C24639c a = C24639c.m47149a(Uri.parse(str));
        int i = this.f94462b;
        a.f58553d = new C24363d(i, i);
        AbstractC24157c<C24117a<AbstractC24454c>> a2 = e.mo40224a(a.mo40483a(), (Object) null);
        a2.mo39739a(new C40251a(this, bVar), C24065a.f56998a);
        this.f94461a = a2;
    }
}
