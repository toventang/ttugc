package com.bytedance.android.live.core.p218f;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.p218f.C3951p;
import com.bytedance.android.live.core.p218f.p219a.C3894c;
import com.bytedance.android.live.core.widget.HSAnimImageView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.livesetting.linkmic.TTliveAnchorDeviceScoreSetting;
import com.bytedance.android.livesdk.livesetting.other.EnableImageDefault565Setting;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.android.livesdk.livesetting.watchlive.TTliveAudienceDeviceRatingLowSetting;
import com.bytedance.common.utility.C13617h;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1830b.C24065a;
import com.facebook.common.p1835g.AbstractC24111h;
import com.facebook.common.p1836h.C24117a;
import com.facebook.common.p1839k.C24134g;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1851c.AbstractC24198b;
import com.facebook.drawee.p1851c.AbstractC24203d;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.C24363d;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1879d.C24389j;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1881f.AbstractC24435b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.facebook.imagepipeline.p1890o.AbstractC24641d;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.p1844d.AbstractC24157c;
import com.facebook.p1844d.AbstractC24160e;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.live.core.f.k */
public final class C3941k {

    /* renamed from: a */
    private static final Handler f10831a = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m9607a(HSImageView hSImageView, String str, String str2) {
        if (hSImageView != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            m9616b(hSImageView, HSAnimImageView.m9805b(str, str2));
        }
    }

    /* renamed from: a */
    public static void m9605a(HSImageView hSImageView, String str) {
        if (hSImageView != null && !TextUtils.isEmpty(str)) {
            hSImageView.setImageURI(C24639c.m47149a(Uri.parse(str)).mo40483a().mSourceUri);
        }
    }

    /* renamed from: a */
    public static void m9606a(HSImageView hSImageView, String str, AbstractC24641d dVar) {
        if (hSImageView != null && !TextUtils.isEmpty(str)) {
            C24639c a = C24639c.m47149a(Uri.parse(str));
            a.f58560k = dVar;
            C24636b a2 = a.mo40483a();
            C24185e b = C24182c.m45843b();
            b.f57309m = hSImageView.getController();
            AbstractC24198b a3 = b.mo39823a(new C24636b[]{a2});
            hSImageView.setImageURI(a2.mSourceUri);
            hSImageView.setController(a3.mo39827e());
        }
    }

    /* renamed from: a */
    public static void m9604a(HSImageView hSImageView, ImageModel imageModel, AbstractC24641d dVar) {
        m9609a(hSImageView, imageModel, null, dVar, null, false);
    }

    /* renamed from: a */
    public static void m9609a(SimpleDraweeView simpleDraweeView, ImageModel imageModel, Drawable drawable, AbstractC24641d dVar, C3951p.AbstractC3953a aVar, boolean z) {
        m9608a(simpleDraweeView, imageModel, drawable, -1, -1, dVar, aVar, z, false);
    }

    /* renamed from: a */
    public static void m9608a(SimpleDraweeView simpleDraweeView, ImageModel imageModel, Drawable drawable, int i, int i2, AbstractC24641d dVar, C3951p.AbstractC3953a aVar, boolean z, boolean z2) {
        if (simpleDraweeView != null && imageModel != null && imageModel.getUrls() != null && imageModel.getUrls().size() != 0) {
            C24363d dVar2 = null;
            if (i < 0 || i2 < 0) {
                i = simpleDraweeView.getMeasuredWidth();
                i2 = simpleDraweeView.getMeasuredHeight();
            }
            if (i > 0 && i2 > 0) {
                dVar2 = new C24363d(i, i2);
            }
            C24636b[] a = m9613a(imageModel, dVar2, dVar, z2);
            if (a != null && a.length != 0) {
                C24185e b = C24182c.m45843b();
                b.f57309m = simpleDraweeView.getController();
                AbstractC24198b a2 = b.mo39823a(a);
                if (z) {
                    a2.f57306j = true;
                }
                if (drawable != null) {
                    if (simpleDraweeView.getHierarchy() == null) {
                        C24247b bVar = new C24247b(simpleDraweeView.getContext().getResources());
                        bVar.f57479d = 300;
                        bVar.f57481f = drawable;
                        bVar.f57482g = C24229q.AbstractC24231b.f57458h;
                        simpleDraweeView.setHierarchy(bVar.mo39973a());
                    } else {
                        C24246a aVar2 = (C24246a) simpleDraweeView.getHierarchy();
                        aVar2.mo39961b(300);
                        aVar2.mo39953a(1, drawable);
                        simpleDraweeView.setHierarchy(aVar2);
                    }
                }
                a2.f57303g = new C3945b(imageModel, aVar);
                simpleDraweeView.setController(a2.mo39827e());
            }
        }
    }

    /* renamed from: a */
    private static C24636b[] m9613a(ImageModel imageModel, C24363d dVar, AbstractC24641d dVar2, boolean z) {
        if (imageModel == null || imageModel.getUrls() == null || imageModel.getUrls().size() == 0) {
            return new C24636b[0];
        }
        ArrayList arrayList = new ArrayList();
        C3894c cVar = new C3894c();
        for (String str : imageModel.getUrls()) {
            if (!C13627m.m24498a(str)) {
                C24639c a = C24639c.m47149a(Uri.parse(str));
                if (dVar2 != null) {
                    a.f58560k = dVar2;
                }
                if (dVar != null) {
                    a.f58553d = dVar;
                }
                cVar.mo9259a(a);
                if (z) {
                    ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
                    imageDecodeOptionsBuilder.setBitmapConfig(Bitmap.Config.RGB_565);
                    a.f58555f = imageDecodeOptionsBuilder.mo40154a();
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
    public static boolean m9612a(Uri uri) {
        if (uri == null) {
            return false;
        }
        return C24428k.m46551a().mo40246d().mo39582d(C24389j.m46446a().mo40187a(C24636b.fromUri(uri)));
    }

    /* renamed from: a */
    public static void m9611a(String str, AbstractC24435b bVar) {
        Uri parse;
        if (str != null && (parse = Uri.parse(str)) != null) {
            C24639c a = C24639c.m47149a(parse);
            a.f58557h = true;
            C24428k.m46551a().mo40247e().mo40224a(a.mo40483a(), (Object) null).mo39739a(bVar, C24065a.f56998a);
        }
    }

    /* renamed from: a */
    public static Drawable m9596a() {
        return C3966y.m9669e().getResources().getDrawable(2131234646);
    }

    static {
        Covode.recordClassIndex(4470);
    }

    /* renamed from: a */
    public static void m9610a(Runnable runnable) {
        f10831a.post(runnable);
    }

    /* renamed from: com.bytedance.android.live.core.f.k$a */
    public static class C3944a {

        /* renamed from: a */
        public final ImageModel f10835a;

        /* renamed from: b */
        public Drawable f10836b;

        /* renamed from: c */
        public int f10837c = 300;

        /* renamed from: d */
        public int f10838d = -1;

        /* renamed from: e */
        public int f10839e = -1;

        /* renamed from: f */
        public AbstractC24641d f10840f;

        /* renamed from: g */
        public C3951p.AbstractC3953a f10841g;

        /* renamed from: h */
        public boolean f10842h;

        /* renamed from: i */
        public boolean f10843i;

        static {
            Covode.recordClassIndex(4473);
        }

        public C3944a(ImageModel imageModel) {
            boolean z;
            if (!EnableImageDefault565Setting.INSTANCE.getValue() || TTliveAudienceDeviceRatingLowSetting.INSTANCE.getValue() < TTliveAnchorDeviceScoreSetting.INSTANCE.getValue()) {
                z = false;
            } else {
                z = true;
            }
            this.f10843i = z;
            this.f10835a = imageModel;
        }
    }

    /* renamed from: b */
    public static InputStream m9614b(Uri uri) {
        MethodCollector.m26663i(12323);
        final PipedOutputStream pipedOutputStream = new PipedOutputStream();
        try {
            PipedInputStream pipedInputStream = new PipedInputStream(pipedOutputStream);
            C24428k.m46551a().mo40247e().mo40229b(C24639c.m47149a(uri).mo40483a(), null).mo39739a(new AbstractC24160e<C24117a<AbstractC24111h>>() {
                /* class com.bytedance.android.live.core.p218f.C3941k.C39421 */

                static {
                    Covode.recordClassIndex(4471);
                }

                @Override // com.facebook.p1844d.AbstractC24160e
                public final void onProgressUpdate(AbstractC24157c<C24117a<AbstractC24111h>> cVar) {
                }

                @Override // com.facebook.p1844d.AbstractC24160e
                public final void onCancellation(AbstractC24157c<C24117a<AbstractC24111h>> cVar) {
                    try {
                        pipedOutputStream.close();
                    } catch (IOException unused) {
                    } finally {
                        cVar.mo39750g();
                    }
                }

                @Override // com.facebook.p1844d.AbstractC24160e
                public final void onFailure(AbstractC24157c<C24117a<AbstractC24111h>> cVar) {
                    try {
                        pipedOutputStream.close();
                    } catch (IOException unused) {
                    } finally {
                        cVar.mo39750g();
                    }
                }

                @Override // com.facebook.p1844d.AbstractC24160e
                public final void onNewResult(AbstractC24157c<C24117a<AbstractC24111h>> cVar) {
                    MethodCollector.m26663i(12309);
                    C24117a<AbstractC24111h> d = cVar.mo39747d();
                    if (d != null) {
                        AbstractC24111h a = d.mo39695a();
                        byte[] bArr = new byte[a.mo39673a()];
                        a.mo39674a(0, bArr, 0, a.mo39673a());
                        try {
                            pipedOutputStream.write(bArr);
                            pipedOutputStream.close();
                        } catch (IOException unused) {
                        } catch (Throwable th) {
                            cVar.mo39750g();
                            MethodCollector.m26664o(12309);
                            throw th;
                        }
                        cVar.mo39750g();
                        MethodCollector.m26664o(12309);
                        return;
                    }
                    MethodCollector.m26664o(12309);
                }
            }, AsyncTask.THREAD_POOL_EXECUTOR);
            MethodCollector.m26664o(12323);
            return pipedInputStream;
        } catch (IOException unused) {
            MethodCollector.m26664o(12323);
            return null;
        }
    }

    /* renamed from: a */
    public static void m9598a(ImageModel imageModel) {
        if (C3966y.m9669e() != null && imageModel != null && !C13617h.m24465a(imageModel.getUrls())) {
            C24428k.m46551a().mo40247e().mo40232c(C24636b.fromUri(imageModel.getUrls().get(0)), C3966y.m9669e());
        }
    }

    /* renamed from: com.bytedance.android.live.core.f.k$b */
    public static class C3945b implements AbstractC24203d<AbstractC24457f> {

        /* renamed from: a */
        private ImageModel f10844a;

        /* renamed from: b */
        private C3951p.AbstractC3953a f10845b;

        static {
            Covode.recordClassIndex(4474);
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

        public C3945b(ImageModel imageModel, C3951p.AbstractC3953a aVar) {
            this.f10844a = imageModel;
            this.f10845b = aVar;
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onFailure(String str, Throwable th) {
            C3951p.AbstractC3953a aVar = this.f10845b;
            if (aVar != null) {
                aVar.mo9303a(this.f10844a, new RuntimeException(th));
            }
        }

        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final void onSubmit(String str, Object obj) {
            C3951p.AbstractC3953a aVar = this.f10845b;
            if (aVar != null) {
                aVar.mo9301a(this.f10844a);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            int i;
            List<String> urls;
            AbstractC24457f fVar2 = fVar;
            C3949o.f10850a.mo9299a(this.f10844a);
            int i2 = -1;
            if (fVar2 != null) {
                i = fVar2.getWidth();
                i2 = fVar2.getHeight();
            } else {
                i = -1;
            }
            if (this.f10844a != null) {
                C3949o oVar = C3949o.f10850a;
                ImageModel imageModel = this.f10844a;
                if (!(imageModel == null || (urls = imageModel.getUrls()) == null || urls.isEmpty() || ThreadPoolOptExperiment.INSTANCE.isEnableAll() || oVar.f10851b == null)) {
                    oVar.f10851b.execute(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004d: INVOKE  
                          (wrap: java.util.concurrent.ExecutorService : 0x0046: IGET  (r1v3 java.util.concurrent.ExecutorService) = (r5v0 'oVar' com.bytedance.android.live.core.f.o) com.bytedance.android.live.core.f.o.b java.util.concurrent.ExecutorService)
                          (wrap: com.bytedance.android.live.core.f.o$1 : 0x004a: CONSTRUCTOR  (r0v9 com.bytedance.android.live.core.f.o$1) = (r5v0 'oVar' com.bytedance.android.live.core.f.o), (r2v0 'urls' java.util.List<java.lang.String>) call: com.bytedance.android.live.core.f.o.1.<init>(com.bytedance.android.live.core.f.o, java.util.List):void type: CONSTRUCTOR)
                         type: INTERFACE call: java.util.concurrent.ExecutorService.execute(java.lang.Runnable):void in method: com.bytedance.android.live.core.f.k.b.onFinalImageSet(java.lang.String, com.facebook.imagepipeline.j.f, android.graphics.drawable.Animatable):void, file: classes4.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:217)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:110)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:56)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:99)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:143)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                        	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:93)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:59)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:244)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:237)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:342)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:264)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                        Caused by: jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x004a: CONSTRUCTOR  (r0v9 com.bytedance.android.live.core.f.o$1) = (r5v0 'oVar' com.bytedance.android.live.core.f.o), (r2v0 'urls' java.util.List<java.lang.String>) call: com.bytedance.android.live.core.f.o.1.<init>(com.bytedance.android.live.core.f.o, java.util.List):void type: CONSTRUCTOR in method: com.bytedance.android.live.core.f.k.b.onFinalImageSet(java.lang.String, com.facebook.imagepipeline.j.f, android.graphics.drawable.Animatable):void, file: classes4.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:255)
                        	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:119)
                        	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:103)
                        	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:806)
                        	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:746)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:367)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:249)
                        	... 24 more
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.bytedance.android.live.core.f.o, state: GENERATED_AND_UNLOADED
                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:215)
                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:630)
                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:363)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:230)
                        	... 30 more
                        */
                    /*
                        this = this;
                        com.facebook.imagepipeline.j.f r8 = (com.facebook.imagepipeline.p1885j.AbstractC24457f) r8
                        com.bytedance.android.live.core.f.o r1 = com.bytedance.android.live.core.p218f.C3949o.f10850a
                        com.bytedance.android.live.base.model.ImageModel r0 = r6.f10844a
                        r1.mo9299a(r0)
                        r4 = -1
                        if (r8 == 0) goto L_0x0051
                        int r3 = r8.getWidth()
                        int r4 = r8.getHeight()
                    L_0x0014:
                        com.bytedance.android.live.base.model.ImageModel r0 = r6.f10844a
                        if (r0 == 0) goto L_0x0030
                        com.bytedance.android.live.core.f.o r5 = com.bytedance.android.live.core.p218f.C3949o.f10850a
                        com.bytedance.android.live.base.model.ImageModel r0 = r6.f10844a
                        if (r0 == 0) goto L_0x002a
                        java.util.List r2 = r0.getUrls()
                        if (r2 == 0) goto L_0x002a
                        boolean r0 = r2.isEmpty()
                        if (r0 == 0) goto L_0x003a
                    L_0x002a:
                        com.bytedance.android.live.base.model.ImageModel r1 = r6.f10844a
                        r0 = 1
                        r1.setLoaded(r0)
                    L_0x0030:
                        com.bytedance.android.live.core.f.p$a r1 = r6.f10845b
                        if (r1 == 0) goto L_0x0039
                        com.bytedance.android.live.base.model.ImageModel r0 = r6.f10844a
                        r1.mo9302a(r0, r3, r4)
                    L_0x0039:
                        return
                    L_0x003a:
                        com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment r0 = com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment.INSTANCE
                        boolean r0 = r0.isEnableAll()
                        if (r0 != 0) goto L_0x002a
                        java.util.concurrent.ExecutorService r0 = r5.f10851b
                        if (r0 == 0) goto L_0x002a
                        java.util.concurrent.ExecutorService r1 = r5.f10851b
                        com.bytedance.android.live.core.f.o$1 r0 = new com.bytedance.android.live.core.f.o$1
                        r0.<init>(r2)
                        r1.execute(r0)
                        goto L_0x002a
                    L_0x0051:
                        r3 = -1
                        goto L_0x0014
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.p218f.C3941k.C3945b.onFinalImageSet(java.lang.String, java.lang.Object, android.graphics.drawable.Animatable):void");
                }
            }

            /* renamed from: a */
            public static void m9600a(HSImageView hSImageView, int i) {
                if (hSImageView != null) {
                    hSImageView.setImageURI(C24639c.m47149a(C24134g.m45734a(i)).mo40483a().mSourceUri);
                }
            }

            /* renamed from: b */
            private static void m9616b(HSImageView hSImageView, String str) {
                if (hSImageView != null && !TextUtils.isEmpty(str)) {
                    C24185e a = C24182c.m45843b().mo39799b(Uri.parse(str));
                    a.f57306j = true;
                    a.f57309m = hSImageView.getController();
                    hSImageView.setController(a.mo39827e());
                }
            }

            /* renamed from: a */
            public static void m9601a(HSImageView hSImageView, ImageModel imageModel) {
                m9609a(hSImageView, imageModel, null, null, null, false);
            }

            /* renamed from: b */
            public static void m9615b(HSImageView hSImageView, ImageModel imageModel, C3951p.AbstractC3953a aVar) {
                m9609a(hSImageView, imageModel, m9596a(), null, aVar, false);
            }

            /* renamed from: a */
            public static AbstractC24157c<C24117a<AbstractC24454c>> m9597a(ImageModel imageModel, int i, int i2) {
                C24363d dVar;
                if (i <= 0 || i2 <= 0) {
                    dVar = null;
                } else {
                    dVar = new C24363d(i, i2);
                }
                C24636b[] a = m9613a(imageModel, dVar, (AbstractC24641d) null, false);
                if (a == null || a.length == 0) {
                    return null;
                }
                return C24428k.m46551a().mo40247e().mo40224a(a[0], (Object) null);
            }

            /* renamed from: a */
            public static void m9602a(HSImageView hSImageView, ImageModel imageModel, C3951p.AbstractC3953a aVar) {
                m9609a(hSImageView, imageModel, null, null, aVar, false);
            }

            /* renamed from: a */
            public static void m9603a(HSImageView hSImageView, ImageModel imageModel, C3951p.AbstractC3953a aVar, boolean z) {
                m9609a(hSImageView, imageModel, null, null, aVar, z);
            }

            /* renamed from: a */
            public static void m9599a(ImageModel imageModel, int i, int i2, AbstractC24641d dVar, final C3951p.AbstractC3955b bVar) {
                C24363d dVar2;
                if (i <= 0 || i2 <= 0) {
                    dVar2 = null;
                } else {
                    dVar2 = new C24363d(i, i2);
                }
                C24636b[] a = m9613a(imageModel, dVar2, dVar, false);
                if (a != null && a.length != 0) {
                    final AbstractC24157c<C24117a<AbstractC24454c>> a2 = C24428k.m46551a().mo40247e().mo40224a(a[0], (Object) null);
                    a2.mo39739a(new AbstractC24435b() {
                        /* class com.bytedance.android.live.core.p218f.C3941k.C39432 */

                        static {
                            Covode.recordClassIndex(4472);
                        }

                        @Override // com.facebook.p1844d.AbstractC24156b
                        public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                            if (cVar != null) {
                                cVar.mo39750g();
                            }
                            if (bVar != null) {
                                C3941k.m9610a(new RunnableC3948n(bVar));
                            }
                        }

                        @Override // com.facebook.imagepipeline.p1881f.AbstractC24435b
                        /* renamed from: a */
                        public final void mo9033a(Bitmap bitmap) {
                            MethodCollector.m26663i(12944);
                            if (a2.mo39745b() && bitmap != null) {
                                C3941k.m9610a(new RunnableC3946l(bVar, Bitmap.createBitmap(bitmap)));
                            } else if (bVar != null) {
                                C3941k.m9610a(new RunnableC3947m(bVar));
                            }
                            a2.mo39750g();
                            MethodCollector.m26664o(12944);
                        }
                    }, C24065a.f56998a);
                }
            }
        }
