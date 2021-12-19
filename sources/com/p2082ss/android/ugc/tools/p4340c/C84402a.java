package com.p2082ss.android.ugc.tools.p4340c;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p036g.AbstractC0688a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1830b.C24065a;
import com.facebook.common.p1830b.C24074i;
import com.facebook.common.p1836h.C24117a;
import com.facebook.common.p1839k.C24134g;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C24361b;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.EnumC24362c;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1879d.C24389j;
import com.facebook.imagepipeline.p1880e.C24413h;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1881f.AbstractC24435b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.p1844d.AbstractC24156b;
import com.facebook.p1844d.AbstractC24157c;
import com.facebook.p1844d.AbstractC24160e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.tools.c.a */
public final class C84402a {

    /* renamed from: com.ss.android.ugc.tools.c.a$b */
    public interface AbstractC84406b {
        static {
            Covode.recordClassIndex(98371);
        }

        /* renamed from: a */
        void mo88263a(AbstractC24157c<C24117a<AbstractC24454c>> cVar);

        /* renamed from: a */
        void mo88264a(Exception exc);
    }

    static {
        Covode.recordClassIndex(98367);
    }

    /* renamed from: a */
    public static void m145175a(SimpleDraweeView simpleDraweeView, String str, int i, int i2, Bitmap.Config config) {
        m145186b(simpleDraweeView, str, i, i2, config);
    }

    /* renamed from: a */
    public static void m145176a(UrlModel urlModel, int i, int i2, final AbstractC0688a<Bitmap> aVar) {
        C24413h e = C24428k.m46551a().mo40247e();
        C24636b[] a = m145181a(urlModel, (i <= 0 || i2 <= 0) ? null : new C24363d(i, i2), (AbstractC24641d) null);
        if (a.length != 0) {
            final AbstractC24157c<C24117a<AbstractC24454c>> a2 = e.mo40224a(a[0], (Object) null);
            a2.mo39739a(new AbstractC24435b() {
                /* class com.p2082ss.android.ugc.tools.p4340c.C84402a.C844031 */

                static {
                    Covode.recordClassIndex(98368);
                }

                @Override // com.facebook.p1844d.AbstractC24156b
                public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                    if (cVar != null) {
                        cVar.mo39750g();
                    }
                    aVar.mo2720a(null);
                }

                @Override // com.facebook.imagepipeline.p1881f.AbstractC24435b
                /* renamed from: a */
                public final void mo9033a(Bitmap bitmap) {
                    MethodCollector.m26663i(11545);
                    if (!a2.mo39745b() || bitmap == null) {
                        aVar.mo2720a(null);
                        MethodCollector.m26664o(11545);
                        return;
                    }
                    aVar.mo2720a(Bitmap.createBitmap(bitmap));
                    a2.mo39750g();
                    MethodCollector.m26664o(11545);
                }
            }, C24065a.f56998a);
        }
    }

    /* renamed from: a */
    public static C24636b[] m145181a(UrlModel urlModel, C24363d dVar, AbstractC24641d dVar2) {
        return m145180a(urlModel, dVar, EnumC24362c.MEDIUM, (AbstractC24641d) null, Bitmap.Config.RGB_565);
    }

    /* renamed from: a */
    public static C24636b[] m145180a(UrlModel urlModel, C24363d dVar, EnumC24362c cVar, AbstractC24641d dVar2, Bitmap.Config config) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            return new C24636b[0];
        }
        ArrayList arrayList = new ArrayList();
        for (String str : urlModel.getUrlList()) {
            if (!TextUtils.isEmpty(str)) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                imageDecodeOptionsBuilder.mo40153a(1);
                imageDecodeOptionsBuilder.f57756e = false;
                C24361b bVar = new C24361b(imageDecodeOptionsBuilder);
                C24639c a = C24639c.m47149a(Uri.parse(str));
                a.f58559j = cVar;
                a.f58555f = bVar;
                if (dVar2 != null) {
                    a.f58560k = dVar2;
                }
                if (dVar != null) {
                    a.f58553d = dVar;
                }
                arrayList.add(a.mo40483a());
            }
        }
        if (arrayList.size() == 0) {
            return new C24636b[0];
        }
        return (C24636b[]) arrayList.toArray(new C24636b[arrayList.size()]);
    }

    /* renamed from: a */
    public static boolean m145178a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return C24428k.m46551a().mo40246d().mo39582d(C24389j.m46446a().mo40187a(C24636b.fromUri(uri)));
    }

    /* renamed from: a */
    public static void m145177a(UrlModel urlModel, final AbstractC84406b bVar) {
        final C24636b[] a = m145181a(urlModel, (C24363d) null, (AbstractC24641d) null);
        final C24413h e = C24428k.m46551a().mo40247e();
        m145179a(e, a, 0, new AbstractC24156b<C24117a<AbstractC24454c>>() {
            /* class com.p2082ss.android.ugc.tools.p4340c.C84402a.C844042 */

            /* renamed from: d */
            private int f188729d = 1;

            static {
                Covode.recordClassIndex(98369);
            }

            @Override // com.facebook.p1844d.AbstractC24156b
            public final void onNewResultImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                bVar.mo88263a(cVar);
            }

            @Override // com.facebook.p1844d.AbstractC24156b
            public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                Throwable e = cVar.mo39748e();
                C24413h hVar = e;
                C24636b[] bVarArr = a;
                int i = this.f188729d;
                this.f188729d = i + 1;
                if (!C84402a.m145179a(hVar, bVarArr, i, this)) {
                    bVar.mo88264a(new RuntimeException(e));
                }
            }
        });
    }

    /* renamed from: a */
    public static boolean m145179a(C24413h hVar, C24636b[] bVarArr, int i, AbstractC24160e<C24117a<AbstractC24454c>> eVar) {
        if (i >= bVarArr.length) {
            return false;
        }
        hVar.mo40224a(bVarArr[i], (Object) null).mo39739a(eVar, C24074i.m45587b());
        return true;
    }

    /* renamed from: com.ss.android.ugc.tools.c.a$a */
    public static class C84405a extends C24202c<AbstractC24457f> {

        /* renamed from: a */
        private final View f188730a;

        static {
            Covode.recordClassIndex(98370);
        }

        public C84405a(View view) {
            this.f188730a = view;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            AbstractC24457f fVar2 = fVar;
            if (fVar2 != null) {
                int width = fVar2.getWidth();
                int height = fVar2.getHeight();
                if (height > 0) {
                    ViewGroup.LayoutParams layoutParams = this.f188730a.getLayoutParams();
                    layoutParams.width = (layoutParams.height * width) / height;
                    this.f188730a.setLayoutParams(layoutParams);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m145184b(SimpleDraweeView simpleDraweeView, String str) {
        m145185b(simpleDraweeView, str, -1, -1);
    }

    /* renamed from: a */
    public static void m145168a(SimpleDraweeView simpleDraweeView, UrlModel urlModel) {
        m145169a(simpleDraweeView, urlModel, -1, -1);
    }

    /* renamed from: a */
    public static void m145165a(SimpleDraweeView simpleDraweeView, int i) {
        if (simpleDraweeView != null) {
            simpleDraweeView.setImageURI(C24639c.m47149a(C24134g.m45734a(i)).mo40483a().mSourceUri);
        }
    }

    /* renamed from: b */
    public static void m145183b(SimpleDraweeView simpleDraweeView, UrlModel urlModel) {
        m145171a(simpleDraweeView, urlModel, new C84408c(null, new C84405a(simpleDraweeView)));
    }

    /* renamed from: a */
    public static void m145173a(SimpleDraweeView simpleDraweeView, String str) {
        m145174a(simpleDraweeView, str, -1, -1);
    }

    /* renamed from: a */
    private static void m145171a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, AbstractC24203d<AbstractC24457f> dVar) {
        m145170a(simpleDraweeView, urlModel, Bitmap.Config.RGB_565, false, dVar);
    }

    /* renamed from: a */
    private static void m145172a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, C24363d dVar) {
        C24636b[] a;
        if (simpleDraweeView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0 && (a = m145181a(urlModel, dVar, (AbstractC24641d) null)) != null && a.length != 0) {
            C24185e b = C24182c.m45843b();
            b.f57309m = simpleDraweeView.getController();
            simpleDraweeView.setController(b.mo39823a(a).mo39827e());
        }
    }

    /* renamed from: a */
    public static void m145166a(SimpleDraweeView simpleDraweeView, Uri uri, int i, int i2) {
        m145167a(simpleDraweeView, uri, i, i2, Bitmap.Config.RGB_565);
    }

    /* renamed from: a */
    public static void m145169a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, int i, int i2) {
        C24363d dVar;
        if (i <= 0 || i2 <= 0) {
            dVar = null;
        } else {
            dVar = new C24363d(i, i2);
        }
        m145172a(simpleDraweeView, urlModel, dVar);
    }

    /* renamed from: b */
    public static void m145185b(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        if (simpleDraweeView != null && !TextUtils.isEmpty(str)) {
            C24363d dVar = null;
            if (i > 0 && i2 > 0) {
                dVar = new C24363d(i, i2);
            }
            C24639c a = C24639c.m47149a(Uri.parse(str));
            if (dVar != null) {
                a.f58553d = dVar;
            }
            C24185e b = C24182c.m45843b();
            b.f57309m = simpleDraweeView.getController();
            b.f57299c = (REQUEST) a.mo40483a();
            b.f57306j = true;
            simpleDraweeView.setController(b.mo39827e());
        }
    }

    /* renamed from: a */
    public static void m145174a(SimpleDraweeView simpleDraweeView, String str, int i, int i2) {
        m145175a(simpleDraweeView, str, i, i2, Bitmap.Config.ARGB_8888);
    }

    /* renamed from: a */
    private static void m145167a(SimpleDraweeView simpleDraweeView, Uri uri, int i, int i2, Bitmap.Config config) {
        m145182b(simpleDraweeView, uri, i, i2, config);
    }

    /* renamed from: b */
    private static void m145182b(SimpleDraweeView simpleDraweeView, Uri uri, int i, int i2, Bitmap.Config config) {
        if (simpleDraweeView != null && uri != null) {
            C24639c a = C24639c.m47149a(uri);
            if (i > 0 && i2 > 0) {
                a.f58553d = new C24363d(i, i2);
            }
            if (config != null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                a.f58555f = new C24361b(imageDecodeOptionsBuilder);
            }
            C24185e b = C24182c.m45843b();
            b.f57309m = simpleDraweeView.getController();
            b.f57299c = (REQUEST) a.mo40483a();
            simpleDraweeView.setController(b.mo39827e());
        }
    }

    /* renamed from: a */
    public static void m145170a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, Bitmap.Config config, boolean z, AbstractC24203d<AbstractC24457f> dVar) {
        C24636b[] a;
        if (simpleDraweeView != null && urlModel != null && simpleDraweeView.getContext() != null && (a = m145180a(urlModel, (C24363d) null, EnumC24362c.MEDIUM, (AbstractC24641d) null, config)) != null && a.length > 0) {
            simpleDraweeView.getContext();
            C24185e b = C24182c.m45843b();
            b.f57309m = simpleDraweeView.getController();
            C24185e eVar = (C24185e) b.mo39823a(a);
            eVar.f57306j = z;
            eVar.f57303g = new C84408c(null, dVar);
            simpleDraweeView.setController(eVar.mo39827e());
        }
    }

    /* renamed from: b */
    private static void m145186b(SimpleDraweeView simpleDraweeView, String str, int i, int i2, Bitmap.Config config) {
        C24363d dVar;
        if (simpleDraweeView != null) {
            if (TextUtils.isEmpty(str)) {
                m145165a(simpleDraweeView, (int) R.drawable.bnp);
                return;
            }
            if (i <= 0 || i2 <= 0) {
                dVar = null;
            } else {
                dVar = new C24363d(i, i2);
            }
            C24639c a = C24639c.m47149a(Uri.parse(str));
            if (dVar != null) {
                a.f58553d = dVar;
            }
            if (config != null) {
                ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                imageDecodeOptionsBuilder.setBitmapConfig(config);
                a.f58555f = new C24361b(imageDecodeOptionsBuilder);
            }
            C24185e b = C24182c.m45843b();
            b.f57309m = simpleDraweeView.getController();
            b.f57303g = null;
            b.f57299c = (REQUEST) a.mo40483a();
            simpleDraweeView.setController(b.mo39827e());
        }
    }
}
