package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3185c;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.graphics.drawable.C0705a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.p1208im.core.api.p1215e.C17453a;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55068f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55069g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3172c.C55071i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55186ah;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.util.Collection;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a */
public final class C55198a {

    /* renamed from: a */
    public static final C55198a f126262a = new C55198a();

    /* renamed from: a */
    public static final void m100927a(RemoteImageView remoteImageView, UrlModel urlModel) {
        m100933a(remoteImageView, urlModel, (AbstractC24641d) null, 0, 0, (AbstractC24203d) null, 60);
    }

    /* renamed from: a */
    public static final void m100928a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2) {
        m100933a(remoteImageView, urlModel, (AbstractC24641d) null, i, i2, (AbstractC24203d) null, 32);
    }

    /* renamed from: a */
    public static final void m100931a(RemoteImageView remoteImageView, UrlModel urlModel, AbstractC24641d dVar) {
        m100933a(remoteImageView, urlModel, dVar, 0, 0, (AbstractC24203d) null, 56);
    }

    private C55198a() {
    }

    /* renamed from: a */
    private static boolean m100936a(UrlModel urlModel) {
        return C55068f.m100707a() && m100937b(urlModel);
    }

    /* renamed from: a */
    public static final void m100935a(RemoteImageView remoteImageView, String str) {
        if (remoteImageView != null && str != null) {
            if (!C55069g.m100708a() || !C55071i.m100716a(str)) {
                C34577e.m70608b(remoteImageView, str, -1, -1);
            } else {
                C56244a.m102191c("MessageFrescoHelper", "bindImage with illegal url ".concat(String.valueOf(str)));
            }
        }
    }

    static {
        Covode.recordClassIndex(64943);
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a$a */
    public static final class C55199a implements AbstractC55220o {

        /* renamed from: a */
        final /* synthetic */ AbstractC55220o f126263a;

        /* renamed from: b */
        final /* synthetic */ C55201b f126264b;

        static {
            Covode.recordClassIndex(64944);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o
        /* renamed from: a */
        public final boolean mo91002a() {
            AbstractC55220o oVar = this.f126263a;
            if (oVar != null) {
                return oVar.mo91002a();
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o
        /* renamed from: a */
        public final void mo90999a(String str) {
            AbstractC55220o oVar = this.f126263a;
            if (oVar != null) {
                oVar.mo90999a(str);
            }
            this.f126264b.onSubmit(str, null);
        }

        C55199a(AbstractC55220o oVar, C55201b bVar) {
            this.f126263a = oVar;
            this.f126264b = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o
        /* renamed from: a */
        public final void mo91001a(String str, Throwable th) {
            AbstractC55220o oVar = this.f126263a;
            if (oVar != null) {
                oVar.mo91001a(str, th);
            }
            this.f126264b.onFailure(str, th);
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.AbstractC55220o
        /* renamed from: a */
        public final void mo91000a(String str, AbstractC24457f fVar, Animatable animatable) {
            AbstractC55220o oVar = this.f126263a;
            if (oVar != null) {
                oVar.mo91000a(str, fVar, animatable);
            }
            this.f126264b.mo92197a(fVar, animatable);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a$b */
    public static final class C55200b implements AbstractC24203d<AbstractC24457f> {

        /* renamed from: a */
        final /* synthetic */ C55201b f126265a;

        /* renamed from: b */
        final /* synthetic */ AbstractC24203d f126266b;

        static {
            Covode.recordClassIndex(64945);
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onRelease(String str) {
            this.f126265a.onRelease(str);
            AbstractC24203d dVar = this.f126266b;
            if (dVar != null) {
                dVar.onRelease(str);
            }
        }

        C55200b(C55201b bVar, AbstractC24203d dVar) {
            this.f126265a = bVar;
            this.f126266b = dVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
            AbstractC24203d dVar = this.f126266b;
            if (dVar != null) {
                dVar.onIntermediateImageSet(str, fVar);
            }
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onFailure(String str, Throwable th) {
            this.f126265a.onFailure(str, th);
            AbstractC24203d dVar = this.f126266b;
            if (dVar != null) {
                dVar.onFailure(str, th);
            }
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onIntermediateImageFailed(String str, Throwable th) {
            this.f126265a.onIntermediateImageFailed(str, th);
            AbstractC24203d dVar = this.f126266b;
            if (dVar != null) {
                dVar.onIntermediateImageFailed(str, th);
            }
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onSubmit(String str, Object obj) {
            this.f126265a.onSubmit(str, obj);
            AbstractC24203d dVar = this.f126266b;
            if (dVar != null) {
                dVar.onSubmit(str, obj);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            AbstractC24457f fVar2 = fVar;
            this.f126265a.mo92197a(fVar2, animatable);
            AbstractC24203d dVar = this.f126266b;
            if (dVar != null) {
                dVar.onFinalImageSet(str, fVar2, animatable);
            }
        }
    }

    /* renamed from: b */
    private static boolean m100937b(UrlModel urlModel) {
        if (!C55069g.m100708a() || !C55071i.m100713a(urlModel)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m100926a(RemoteImageView remoteImageView, int i) {
        C89219l.m154721d(remoteImageView, "");
        Drawable b = C0196a.m619b(remoteImageView.getContext(), i);
        if (b != null) {
            C0705a.m2500a(b, true);
        }
        remoteImageView.setImageDrawable(b);
    }

    /* renamed from: a */
    public static void m100930a(RemoteImageView remoteImageView, UrlModel urlModel, AbstractC24203d<AbstractC24457f> dVar) {
        C89219l.m154721d(dVar, "");
        m100933a(remoteImageView, urlModel, (AbstractC24641d) null, 0, 0, dVar, 28);
    }

    /* renamed from: a */
    private static void m100932a(RemoteImageView remoteImageView, UrlModel urlModel, AbstractC24641d dVar, int i, int i2, AbstractC24203d<AbstractC24457f> dVar2) {
        if (remoteImageView != null && urlModel != null) {
            String str = null;
            if (m100937b(urlModel)) {
                StringBuilder sb = new StringBuilder("bindImage with illegal url ");
                if (C17453a.m32408a((Collection<? extends Object>) urlModel.getUrlList())) {
                    List<String> urlList = urlModel.getUrlList();
                    if (urlList != null) {
                        str = (String) C89070n.m154583g((List) urlList);
                    }
                } else {
                    str = urlModel.getUri();
                }
                C56244a.m102191c("MessageFrescoHelper", sb.append(str).toString());
                return;
            }
            List<String> urlList2 = urlModel.getUrlList();
            if (urlList2 != null) {
                str = (String) C89070n.m154583g((List) urlList2);
            }
            C34577e.m70595a(remoteImageView, urlModel, i, i2, dVar, new C55200b(new C55201b(str), dVar2));
        }
    }

    /* renamed from: a */
    public static final void m100929a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, int i3, int i4, AbstractC55220o oVar) {
        List<String> urlList;
        List<String> list;
        List<String> urlList2;
        String str = null;
        if (m100936a(urlModel)) {
            StringBuilder sb = new StringBuilder("bindImage with illegal gif ");
            if (urlModel != null) {
                list = urlModel.getUrlList();
            } else {
                list = null;
            }
            if (C17453a.m32408a((Collection<? extends Object>) list)) {
                if (!(urlModel == null || (urlList2 = urlModel.getUrlList()) == null)) {
                    str = (String) C89070n.m154583g((List) urlList2);
                }
            } else if (urlModel != null) {
                str = urlModel.getUri();
            }
            C56244a.m102191c("MessageFrescoHelper", sb.append(str).toString());
            return;
        }
        if (!(urlModel == null || (urlList = urlModel.getUrlList()) == null)) {
            str = (String) C89070n.m154583g((List) urlList);
        }
        C55186ah.m100890a(remoteImageView, urlModel, i, i2, new C55199a(oVar, new C55201b(str)), true, i3, i4);
    }

    /* renamed from: a */
    public static /* synthetic */ void m100933a(RemoteImageView remoteImageView, UrlModel urlModel, AbstractC24641d dVar, int i, int i2, AbstractC24203d dVar2, int i3) {
        AbstractC24641d dVar3 = dVar;
        int i4 = i;
        int i5 = i2;
        AbstractC24203d dVar4 = null;
        if ((i3 & 4) != 0) {
            dVar3 = null;
        }
        if ((i3 & 8) != 0) {
            i4 = 0;
        }
        if ((i3 & 16) != 0) {
            i5 = 0;
        }
        if ((i3 & 32) == 0) {
            dVar4 = dVar2;
        }
        m100932a(remoteImageView, urlModel, dVar3, i4, i5, dVar4);
    }
}
