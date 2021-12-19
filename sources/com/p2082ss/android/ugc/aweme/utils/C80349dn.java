package com.p2082ss.android.ugc.aweme.utils;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.aweme.base.C34592h;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.utils.dn */
public final class C80349dn {

    /* renamed from: com.ss.android.ugc.aweme.utils.dn$b */
    public interface AbstractC80351b {
        static {
            Covode.recordClassIndex(93619);
        }
    }

    static {
        Covode.recordClassIndex(93617);
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.dn$a */
    public static class C80350a implements AbstractC24203d<AbstractC24457f> {

        /* renamed from: a */
        private ImageModel f179879a;

        /* renamed from: b */
        private AbstractC80351b f179880b = null;

        static {
            Covode.recordClassIndex(93618);
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onIntermediateImageFailed(String str, Throwable th) {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onRelease(String str) {
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onSubmit(String str, Object obj) {
        }

        public C80350a(ImageModel imageModel, AbstractC80351b bVar) {
            this.f179879a = imageModel;
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onFailure(String str, Throwable th) {
            if (this.f179880b != null) {
                new RuntimeException(th);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            List<String> urls;
            AbstractC24457f fVar2 = fVar;
            C80352do.f179881a.mo123711a(this.f179879a);
            if (fVar2 != null) {
                fVar2.getWidth();
                fVar2.getHeight();
            }
            if (this.f179879a != null) {
                C80352do doVar = C80352do.f179881a;
                ImageModel imageModel = this.f179879a;
                if (!(imageModel == null || (urls = imageModel.getUrls()) == null || urls.isEmpty())) {
                    doVar.f179882b.execute(new Runnable(urls) {
                        /* class com.p2082ss.android.ugc.aweme.utils.C80352do.RunnableC803531 */

                        /* renamed from: a */
                        final /* synthetic */ List f179885a;

                        static {
                            Covode.recordClassIndex(93621);
                        }

                        public final void run() {
                            MethodCollector.m26663i(12616);
                            synchronized (C80352do.this.f179884d) {
                                try {
                                    C80352do.this.f179883c.removeAll(this.f179885a);
                                } finally {
                                    MethodCollector.m26664o(12616);
                                }
                            }
                        }

                        {
                            this.f179885a = r2;
                        }
                    });
                }
                this.f179879a.setLoaded(true);
            }
        }
    }

    /* renamed from: a */
    public static void m139316a(SimpleDraweeView simpleDraweeView, ImageModel imageModel) {
        C24363d dVar;
        if (simpleDraweeView != null && imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            int measuredWidth = simpleDraweeView.getMeasuredWidth();
            int measuredHeight = simpleDraweeView.getMeasuredHeight();
            if (measuredWidth <= 0 || measuredHeight <= 0) {
                dVar = null;
            } else {
                dVar = new C24363d(measuredWidth, measuredHeight);
            }
            C24636b[] a = m139317a(imageModel, dVar, null);
            if (a != null && a.length != 0) {
                C24185e b = C24182c.m45843b();
                b.f57309m = simpleDraweeView.getController();
                AbstractC24198b a2 = b.mo39823a(a);
                a2.f57303g = new C80350a(imageModel, null);
                simpleDraweeView.setController(a2.mo39827e());
            }
        }
    }

    /* renamed from: a */
    private static C24636b[] m139317a(ImageModel imageModel, C24363d dVar, AbstractC24641d dVar2) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return new C24636b[0];
        }
        ArrayList arrayList = new ArrayList();
        C34592h hVar = new C34592h();
        for (String str : imageModel.getUrls()) {
            if (!C13627m.m24498a(str)) {
                C24639c a = C24639c.m47149a(Uri.parse(str));
                if (dVar != null) {
                    a.f58553d = dVar;
                }
                hVar.mo61047a(a);
                arrayList.add(a.mo40483a());
            }
        }
        if (arrayList.size() == 0) {
            return new C24636b[0];
        }
        return (C24636b[]) arrayList.toArray(new C24636b[arrayList.size()]);
    }
}
