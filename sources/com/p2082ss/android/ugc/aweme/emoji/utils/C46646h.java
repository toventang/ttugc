package com.p2082ss.android.ugc.aweme.emoji.utils;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.emoji.utils.h */
public final class C46646h {
    static {
        Covode.recordClassIndex(55238);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.utils.h$a */
    public static final class C46647a {

        /* renamed from: a */
        public RemoteImageView f108768a;

        /* renamed from: b */
        public AbstractC46649i f108769b;

        /* renamed from: c */
        public boolean f108770c = true;

        /* renamed from: d */
        AbstractC24203d<AbstractC24457f> f108771d = new AbstractC24203d<AbstractC24457f>() {
            /* class com.p2082ss.android.ugc.aweme.emoji.utils.C46646h.C46647a.C466481 */

            /* renamed from: a */
            boolean f108779a;

            static {
                Covode.recordClassIndex(55240);
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final void onIntermediateImageFailed(String str, Throwable th) {
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final void onSubmit(String str, Object obj) {
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final void onRelease(String str) {
                this.f108779a = false;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
                this.f108779a = false;
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final void onFailure(String str, Throwable th) {
                if (C46647a.this.f108769b != null) {
                    C46647a.this.f108769b.mo63349a();
                }
                C46647a.this.mo79267a();
                this.f108779a = false;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                Animatable i;
                if (animatable != null) {
                    this.f108779a = true;
                    if (C46647a.this.f108768a.getController() != null && this.f108779a && (i = C46647a.this.f108768a.getController().mo39821i()) != null && !i.isRunning() && C46647a.this.f108770c) {
                        i.start();
                    }
                    if (C46647a.this.f108769b != null) {
                        C46647a.this.f108769b.mo63350b();
                        return;
                    }
                    return;
                }
                this.f108779a = false;
            }
        };

        /* renamed from: e */
        private int f108772e;

        /* renamed from: f */
        private UrlModel f108773f;

        /* renamed from: g */
        private C24636b[] f108774g;

        /* renamed from: h */
        private AbstractC24255a f108775h;

        /* renamed from: i */
        private int f108776i;

        /* renamed from: j */
        private int f108777j;

        /* renamed from: k */
        private C24185e f108778k;

        static {
            Covode.recordClassIndex(55239);
        }

        /* renamed from: a */
        public final void mo79267a() {
            List<String> urlList = this.f108773f.getUrlList();
            int i = this.f108772e;
            this.f108772e = i + 1;
            C24636b[] a = m90046a(m90045a(urlList, i));
            if (this.f108778k == null) {
                C24185e b = C24182c.m45843b();
                b.f57309m = this.f108768a.getController();
                C24185e eVar = (C24185e) b.mo39823a(a);
                eVar.f57303g = this.f108771d;
                this.f108778k = eVar;
            }
            this.f108778k.mo39823a(a);
            if (this.f108775h == null) {
                this.f108775h = this.f108778k.mo39827e();
            }
            this.f108768a.setController(this.f108775h);
        }

        /* renamed from: a */
        private C24636b[] m90046a(String str) {
            if (this.f108774g == null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.ARGB_8888);
                imageDecodeOptionsBuilder.mo40153a(1);
                imageDecodeOptionsBuilder.f57756e = false;
                C24361b bVar = new C24361b(imageDecodeOptionsBuilder);
                C24639c a = C24639c.m47149a(Uri.parse(str));
                a.f58555f = bVar;
                if (this.f108777j > 0 && this.f108776i > 0) {
                    a.f58553d = new C24363d(this.f108776i, this.f108777j);
                }
                this.f108774g = new C24636b[]{a.mo40483a()};
            }
            return this.f108774g;
        }

        /* renamed from: a */
        private static String m90045a(List<String> list, int i) {
            if (!C13603b.m24435a((Collection) list) && i < list.size()) {
                return list.get(i);
            }
            return null;
        }

        C46647a(RemoteImageView remoteImageView, UrlModel urlModel, AbstractC46649i iVar) {
            this.f108768a = remoteImageView;
            this.f108773f = urlModel;
            this.f108776i = 0;
            this.f108777j = 0;
            this.f108769b = iVar;
        }
    }

    /* renamed from: a */
    public static void m90044a(RemoteImageView remoteImageView, String str) {
        if (!TextUtils.isEmpty(str)) {
            List<String> singletonList = Collections.singletonList(str);
            UrlModel urlModel = new UrlModel();
            urlModel.setUrlList(singletonList);
            m90043a(remoteImageView, urlModel, null);
        }
    }

    /* renamed from: a */
    public static void m90043a(RemoteImageView remoteImageView, UrlModel urlModel, AbstractC46649i iVar) {
        if (!C13603b.m24435a((Collection) urlModel.getUrlList()) || !TextUtils.isEmpty(urlModel.getUri())) {
            C46647a aVar = new C46647a(remoteImageView, urlModel, iVar);
            aVar.f108770c = true;
            aVar.mo79267a();
        }
    }
}
