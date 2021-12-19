package com.p2082ss.android.ugc.aweme.base;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1830b.C24065a;
import com.facebook.common.p1830b.C24074i;
import com.facebook.common.p1836h.C24117a;
import com.facebook.common.p1839k.C24134g;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.facebook.drawee.p1851c.AbstractC24203d;
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
import com.facebook.p1825b.AbstractC24018a;
import com.facebook.p1825b.C24019b;
import com.facebook.p1844d.AbstractC24156b;
import com.facebook.p1844d.AbstractC24157c;
import com.facebook.p1844d.AbstractC24160e;
import com.p2082ss.android.ugc.aweme.base.model.C34606a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2373e.p2374a.AbstractC34583a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.base.e */
public final class C34577e {

    /* renamed from: a */
    public static boolean f81614a;

    /* renamed from: com.ss.android.ugc.aweme.base.e$a */
    public interface AbstractC34582a {
        static {
            Covode.recordClassIndex(41544);
        }

        /* renamed from: a */
        void mo61037a();

        /* renamed from: a */
        void mo61038a(Exception exc);
    }

    static {
        Covode.recordClassIndex(41539);
    }

    /* renamed from: a */
    public static void m70597a(RemoteImageView remoteImageView, UrlModel urlModel, AbstractC24203d<AbstractC24457f> dVar, boolean z) {
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            if (remoteImageView.getContext() != null) {
                m70585a(remoteImageView.getContext());
            }
            C24636b[] a = m70607a(urlModel, (C24363d) null, (AbstractC24641d) null);
            if (a != null && a.length != 0) {
                C24185e b = C24182c.m45843b();
                b.f57309m = remoteImageView.getController();
                C24185e eVar = (C24185e) b.mo39823a(a);
                eVar.f57306j = z;
                eVar.f57303g = m70586a(dVar);
                remoteImageView.setController(eVar.mo39827e());
            }
        }
    }

    /* renamed from: a */
    public static void m70600a(RemoteImageView remoteImageView, String str, int i, int i2) {
        m70602a(remoteImageView, str, i, i2, true);
    }

    /* renamed from: a */
    public static void m70599a(RemoteImageView remoteImageView, String str) {
        m70602a(remoteImageView, str, -1, -1, false);
    }

    /* renamed from: a */
    private static void m70602a(RemoteImageView remoteImageView, String str, int i, int i2, boolean z) {
        if (remoteImageView != null) {
            if (TextUtils.isEmpty(str)) {
                m70591a(remoteImageView, 2131232314);
                return;
            }
            C24363d dVar = null;
            if (i > 0 && i2 > 0) {
                dVar = new C24363d(i, i2);
            }
            C24639c a = C24639c.m47149a(Uri.parse(str));
            if (dVar != null) {
                a.f58553d = dVar;
            }
            C24185e b = C24182c.m45843b();
            b.f57309m = remoteImageView.getController();
            b.f57299c = (REQUEST) a.mo40483a();
            b.f57306j = z;
            remoteImageView.setController(b.mo39827e());
        }
    }

    /* renamed from: a */
    public static void m70596a(RemoteImageView remoteImageView, UrlModel urlModel, AbstractC24203d<AbstractC24457f> dVar) {
        EnumC24362c cVar = EnumC24362c.MEDIUM;
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            if (remoteImageView.getContext() != null) {
                m70585a(remoteImageView.getContext());
            }
            C24636b[] a = m70606a(urlModel, (C24363d) null, cVar, (AbstractC24641d) null, Bitmap.Config.RGB_565);
            if (a != null && a.length != 0) {
                C24185e b = C24182c.m45843b();
                b.f57309m = remoteImageView.getController();
                AbstractC24198b a2 = b.mo39823a(a);
                a2.f57303g = m70586a(dVar);
                remoteImageView.setController(a2.mo39827e());
            }
        }
    }

    /* renamed from: a */
    public static void m70595a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, AbstractC24641d dVar, AbstractC24203d<AbstractC24457f> dVar2) {
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            C24363d dVar3 = null;
            if (i > 0 && i2 > 0) {
                dVar3 = new C24363d(i, i2);
            }
            if (remoteImageView.getContext() != null) {
                m70585a(remoteImageView.getContext());
            }
            C24636b[] a = m70607a(urlModel, dVar3, dVar);
            if (a != null && a.length != 0) {
                C24185e b = C24182c.m45843b();
                b.f57309m = remoteImageView.getController();
                AbstractC24198b a2 = b.mo39823a(a);
                a2.f57303g = m70586a(dVar2);
                remoteImageView.setController(a2.mo39827e());
            }
        }
    }

    /* renamed from: a */
    public static void m70594a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2, AbstractC24641d dVar) {
        C24363d dVar2;
        C24636b[] a;
        if (i <= 0 || i2 <= 0) {
            dVar2 = null;
        } else {
            dVar2 = new C24363d(i, i2);
        }
        if (remoteImageView != null && urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0 && (a = m70607a(urlModel, dVar2, dVar)) != null && a.length != 0) {
            C24185e b = C24182c.m45843b();
            b.f57309m = remoteImageView.getController();
            remoteImageView.setController(b.mo39823a(a).mo39827e());
        }
    }

    /* renamed from: a */
    public static void m70598a(RemoteImageView remoteImageView, C34606a aVar) {
        int i = C345814.f81622a[aVar.f81662a.ordinal()];
        if (i == 1) {
            m70591a(remoteImageView, aVar.mo61082a());
        } else if (i == 2) {
            m70592a(remoteImageView, (UrlModel) aVar.f81663b);
        } else if (i == 3) {
            m70608b(remoteImageView, (String) aVar.f81663b, -1, -1);
        }
    }

    /* renamed from: a */
    private static void m70601a(RemoteImageView remoteImageView, String str, int i, int i2, Bitmap.Config config) {
        if (remoteImageView != null) {
            if (TextUtils.isEmpty(str)) {
                m70591a(remoteImageView, 2131232314);
                return;
            }
            C24363d dVar = null;
            if (i > 0 && i2 > 0) {
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
            b.f57309m = remoteImageView.getController();
            b.f57299c = (REQUEST) a.mo40483a();
            remoteImageView.setController(b.mo39827e());
        }
    }

    /* renamed from: a */
    public static C24636b[] m70607a(UrlModel urlModel, C24363d dVar, AbstractC24641d dVar2) {
        return m70606a(urlModel, dVar, EnumC24362c.MEDIUM, dVar2, Bitmap.Config.RGB_565);
    }

    /* renamed from: a */
    public static C24636b[] m70605a(UrlModel urlModel, Bitmap.Config config) {
        return m70606a(urlModel, (C24363d) null, EnumC24362c.MEDIUM, (AbstractC24641d) null, config);
    }

    /* renamed from: a */
    private static C24636b[] m70606a(UrlModel urlModel, C24363d dVar, EnumC24362c cVar, AbstractC24641d dVar2, Bitmap.Config config) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().size() == 0) {
            return new C24636b[0];
        }
        ArrayList arrayList = new ArrayList();
        C34592h hVar = null;
        if (!f81614a) {
            hVar = new C34592h();
        }
        for (String str : urlModel.getUrlList()) {
            if (!C13627m.m24498a(str)) {
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
                if (hVar != null) {
                    hVar.mo61047a(a);
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
    public static boolean m70603a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return C24428k.m46551a().mo40246d().mo39582d(C24389j.m46446a().mo40187a(C24636b.fromUri(uri)));
    }

    /* renamed from: a */
    public static boolean m70604a(C24413h hVar, C24636b[] bVarArr, int i, AbstractC24160e<C24117a<AbstractC24454c>> eVar) {
        if (i >= bVarArr.length) {
            return false;
        }
        hVar.mo40224a(bVarArr[i], (Object) null).mo39739a(eVar, C24074i.m45587b());
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.base.e$4 */
    static /* synthetic */ class C345814 {

        /* renamed from: a */
        static final /* synthetic */ int[] f81622a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        static {
            /*
                r0 = 41543(0xa247, float:5.8214E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.android.ugc.aweme.base.model.a$a[] r0 = com.p2082ss.android.ugc.aweme.base.model.C34606a.EnumC34607a.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.android.ugc.aweme.base.C34577e.C345814.f81622a = r2
                com.ss.android.ugc.aweme.base.model.a$a r0 = com.p2082ss.android.ugc.aweme.base.model.C34606a.EnumC34607a.RES_ID     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.android.ugc.aweme.base.C34577e.C345814.f81622a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.android.ugc.aweme.base.model.a$a r0 = com.p2082ss.android.ugc.aweme.base.model.C34606a.EnumC34607a.URL_MODEL     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.android.ugc.aweme.base.C34577e.C345814.f81622a     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.android.ugc.aweme.base.model.a$a r0 = com.p2082ss.android.ugc.aweme.base.model.C34606a.EnumC34607a.URL     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.base.C34577e.C345814.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static AbstractC24203d<AbstractC24457f> m70586a(final AbstractC24203d<AbstractC24457f> dVar) {
        return new AbstractC24203d<AbstractC24457f>() {
            /* class com.p2082ss.android.ugc.aweme.base.C34577e.C345781 */

            static {
                Covode.recordClassIndex(41540);
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final void onRelease(String str) {
                AbstractC24203d dVar = dVar;
                if (dVar != null) {
                    dVar.onRelease(str);
                }
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final void onFailure(String str, Throwable th) {
                AbstractC24203d dVar = dVar;
                if (dVar != null) {
                    dVar.onFailure(str, th);
                }
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final void onIntermediateImageFailed(String str, Throwable th) {
                AbstractC24203d dVar = dVar;
                if (dVar != null) {
                    dVar.onIntermediateImageFailed(str, th);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final /* bridge */ /* synthetic */ void onIntermediateImageSet(String str, AbstractC24457f fVar) {
                AbstractC24203d dVar = dVar;
                if (dVar != null) {
                    dVar.onIntermediateImageSet(str, fVar);
                }
            }

            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final void onSubmit(String str, Object obj) {
                AbstractC24203d dVar = dVar;
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
            @Override // com.facebook.drawee.p1851c.AbstractC24203d
            public final /* bridge */ /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
                AbstractC24203d dVar = dVar;
                if (dVar != null) {
                    dVar.onFinalImageSet(str, fVar, animatable);
                }
            }
        };
    }

    /* renamed from: a */
    private static Context m70585a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* renamed from: a */
    public static String m70587a(UrlModel urlModel) {
        if (urlModel != null) {
            try {
                if (Environment.getExternalStorageState().equals("mounted")) {
                    List<String> urlList = urlModel.getUrlList();
                    if (urlList != null && !urlList.isEmpty()) {
                        int size = urlList.size();
                        for (int i = 0; i < size; i++) {
                            if (m70603a(Uri.parse(urlList.get(i)))) {
                                return urlList.get(i);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* renamed from: b */
    public static void m70609b(String str) {
        if (str != null && !str.isEmpty() && !m70603a(Uri.parse(str))) {
            C24428k.m46551a().mo40247e().mo40236d(C24636b.fromUri(str), null);
        }
    }

    /* renamed from: a */
    public static String m70588a(String str) {
        AbstractC24018a a;
        File file;
        if (str == null || str.isEmpty()) {
            return "";
        }
        Uri parse = Uri.parse(str);
        if (!m70603a(parse) || (a = C24428k.m46551a().mo40246d().mo39575a(C24389j.m46446a().mo40187a(C24636b.fromUri(parse)))) == null || (file = ((C24019b) a).f56886a) == null) {
            return "";
        }
        return file.getAbsolutePath();
    }

    /* renamed from: a */
    public static void m70590a(UrlModel urlModel, final AbstractC34582a aVar) {
        final C24636b[] a = m70607a(urlModel, (C24363d) null, (AbstractC24641d) null);
        final C24413h e = C24428k.m46551a().mo40247e();
        m70604a(e, a, 0, new AbstractC24156b<C24117a<AbstractC24454c>>() {
            /* class com.p2082ss.android.ugc.aweme.base.C34577e.C345803 */

            /* renamed from: d */
            private int f81621d = 1;

            static {
                Covode.recordClassIndex(41542);
            }

            @Override // com.facebook.p1844d.AbstractC24156b
            public final void onNewResultImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                aVar.mo61037a();
            }

            @Override // com.facebook.p1844d.AbstractC24156b
            public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                Throwable e = cVar.mo39748e();
                C24413h hVar = e;
                C24636b[] bVarArr = a;
                int i = this.f81621d;
                this.f81621d = i + 1;
                if (!C34577e.m70604a(hVar, bVarArr, i, this)) {
                    aVar.mo61038a(new RuntimeException(e));
                }
            }
        });
    }

    /* renamed from: a */
    public static void m70591a(RemoteImageView remoteImageView, int i) {
        if (remoteImageView != null) {
            remoteImageView.setImageURI(C24639c.m47149a(C24134g.m45734a(i)).mo40483a().mSourceUri);
        }
    }

    /* renamed from: a */
    public static void m70592a(RemoteImageView remoteImageView, UrlModel urlModel) {
        m70594a(remoteImageView, urlModel, -1, -1, (AbstractC24641d) null);
    }

    /* renamed from: b */
    public static void m70608b(RemoteImageView remoteImageView, String str, int i, int i2) {
        m70601a(remoteImageView, str, i, i2, Bitmap.Config.ARGB_8888);
    }

    /* renamed from: a */
    public static void m70589a(UrlModel urlModel, int i, int i2, final AbstractC34583a<Bitmap> aVar) {
        C24363d dVar;
        C24413h e = C24428k.m46551a().mo40247e();
        if (i <= 0 || i2 <= 0) {
            dVar = null;
        } else {
            dVar = new C24363d(i, i2);
        }
        C24636b[] a = m70607a(urlModel, dVar, (AbstractC24641d) null);
        if (a.length != 0) {
            final AbstractC24157c<C24117a<AbstractC24454c>> a2 = e.mo40224a(a[0], (Object) null);
            a2.mo39739a(new AbstractC24435b() {
                /* class com.p2082ss.android.ugc.aweme.base.C34577e.C345792 */

                static {
                    Covode.recordClassIndex(41541);
                }

                @Override // com.facebook.p1844d.AbstractC24156b
                public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                    if (cVar != null) {
                        cVar.mo39750g();
                    }
                    aVar.mo61039a(null);
                }

                @Override // com.facebook.imagepipeline.p1881f.AbstractC24435b
                /* renamed from: a */
                public final void mo9033a(Bitmap bitmap) {
                    MethodCollector.m26663i(12947);
                    if (!a2.mo39745b() || bitmap == null) {
                        aVar.mo61039a(null);
                        MethodCollector.m26664o(12947);
                        return;
                    }
                    aVar.mo61039a(Bitmap.createBitmap(bitmap));
                    a2.mo39750g();
                    MethodCollector.m26664o(12947);
                }
            }, C24065a.f56998a);
        }
    }

    /* renamed from: a */
    public static void m70593a(RemoteImageView remoteImageView, UrlModel urlModel, int i, int i2) {
        m70594a(remoteImageView, urlModel, i, i2, (AbstractC24641d) null);
    }
}
