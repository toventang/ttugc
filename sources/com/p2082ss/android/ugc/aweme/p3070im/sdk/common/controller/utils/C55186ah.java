package com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51428b;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ah */
public final class C55186ah {
    static {
        Covode.recordClassIndex(64931);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.utils.ah$a */
    public static final class C55187a {

        /* renamed from: a */
        public RemoteImageView f126244a;

        /* renamed from: b */
        public AbstractC55220o f126245b;

        /* renamed from: c */
        boolean f126246c = true;

        /* renamed from: d */
        public boolean f126247d = true;

        /* renamed from: e */
        AbstractC24203d<AbstractC24457f> f126248e = new C24202c<AbstractC24457f>() {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.C55186ah.C55187a.C551881 */

            /* renamed from: a */
            boolean f126258a;

            static {
                Covode.recordClassIndex(64933);
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final void onRelease(String str) {
                super.onRelease(str);
                this.f126258a = false;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
                super.onIntermediateImageSet(str, fVar);
                this.f126258a = false;
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final void onFailure(String str, Throwable th) {
                super.onFailure(str, th);
                if (C55187a.this.f126245b != null) {
                    C55187a.this.f126245b.mo91001a(str, th);
                }
                C55187a.this.mo92196a();
                this.f126258a = false;
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final void onSubmit(String str, Object obj) {
                super.onSubmit(str, obj);
                if (C55187a.this.f126245b != null) {
                    C55187a.this.f126245b.mo90999a(str);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
            public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                Animatable i;
                AbstractC24457f fVar2 = fVar;
                if (animatable != null) {
                    this.f126258a = true;
                    if (C55187a.this.f126244a.getController() != null && this.f126258a && (i = C55187a.this.f126244a.getController().mo39821i()) != null && !i.isRunning() && C55187a.this.f126247d) {
                        i.start();
                    }
                    if (C55187a.this.f126245b != null) {
                        C55187a.this.f126245b.mo91000a(str, fVar2, animatable);
                        return;
                    }
                    return;
                }
                this.f126258a = false;
            }
        };

        /* renamed from: f */
        private int f126249f;

        /* renamed from: g */
        private UrlModel f126250g;

        /* renamed from: h */
        private C24636b[] f126251h;

        /* renamed from: i */
        private AbstractC24255a f126252i;

        /* renamed from: j */
        private int f126253j;

        /* renamed from: k */
        private int f126254k;

        /* renamed from: l */
        private C24185e f126255l;

        /* renamed from: m */
        private int f126256m;

        /* renamed from: n */
        private int f126257n;

        static {
            Covode.recordClassIndex(64932);
        }

        /* renamed from: a */
        public final void mo92196a() {
            AbstractC55220o oVar;
            List<String> urlList = this.f126250g.getUrlList();
            int i = this.f126249f;
            this.f126249f = i + 1;
            String a = C55186ah.m100889a(urlList, i);
            if (!TextUtils.isEmpty(a)) {
                C24636b[] a2 = m100892a(a);
                if (this.f126255l == null) {
                    C24185e b = C24182c.m45843b();
                    b.f57309m = this.f126244a.getController();
                    C24185e eVar = (C24185e) b.mo39823a(a2);
                    eVar.f57303g = this.f126248e;
                    this.f126255l = eVar;
                }
                this.f126255l.mo39823a(a2);
                if (this.f126252i == null) {
                    this.f126252i = this.f126255l.mo39827e();
                }
                this.f126244a.setController(this.f126252i);
            } else if (this.f126246c && (oVar = this.f126245b) != null && oVar.mo91002a()) {
                int a3 = C51428b.m95803a(this.f126244a.getContext(), 90.0f);
                ViewGroup.LayoutParams layoutParams = this.f126244a.getLayoutParams();
                layoutParams.width = a3;
                layoutParams.height = a3;
                this.f126244a.setLayoutParams(layoutParams);
            }
        }

        /* renamed from: a */
        private C24636b[] m100892a(String str) {
            if (this.f126251h == null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
                imageDecodeOptionsBuilder.mo40153a(1);
                imageDecodeOptionsBuilder.f57756e = false;
                C24361b bVar = new C24361b(imageDecodeOptionsBuilder);
                C24639c a = C24639c.m47149a(Uri.parse(str));
                a.f58555f = bVar;
                if (this.f126254k > 0 && this.f126253j > 0) {
                    a.f58553d = new C24363d(this.f126253j, this.f126254k);
                }
                this.f126251h = new C24636b[]{a.mo40483a()};
            }
            return this.f126251h;
        }

        public C55187a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, AbstractC55220o oVar, int i3, int i4) {
            this.f126244a = remoteImageView;
            this.f126250g = urlModel;
            this.f126253j = i;
            this.f126254k = i2;
            this.f126245b = oVar;
            this.f126257n = i4;
            this.f126256m = i3;
        }
    }

    /* renamed from: a */
    public static String m100889a(List<String> list, int i) {
        if (!C13603b.m24435a((Collection) list) && i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    /* renamed from: a */
    public static void m100891a(RemoteImageView remoteImageView, UrlModel urlModel, AbstractC55220o oVar, boolean z) {
        m100890a(remoteImageView, urlModel, 0, 0, oVar, z, 0, 0);
    }

    /* renamed from: a */
    public static void m100890a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, AbstractC55220o oVar, boolean z, int i3, int i4) {
        if (!C13603b.m24435a((Collection) urlModel.getUrlList()) || !TextUtils.isEmpty(urlModel.getUri())) {
            C55187a aVar = new C55187a(remoteImageView, urlModel, i, i2, oVar, i3, i4);
            aVar.f126246c = true;
            aVar.f126247d = z;
            aVar.mo92196a();
        }
    }
}
