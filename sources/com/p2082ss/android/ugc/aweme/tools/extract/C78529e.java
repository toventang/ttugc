package com.p2082ss.android.ugc.aweme.tools.extract;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1836h.C24117a;
import com.facebook.fresco.animation.p1863b.p1864a.C24279c;
import com.facebook.fresco.animation.p1863b.p1866c.C24288b;
import com.facebook.imagepipeline.p1871a.p1872a.AbstractC24323c;
import com.facebook.imagepipeline.p1871a.p1872a.C24325e;
import com.facebook.imagepipeline.p1871a.p1874c.C24336a;
import com.facebook.imagepipeline.p1871a.p1875d.C24346a;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1885j.C24452a;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.facebook.p1844d.AbstractC24157c;
import com.facebook.p1844d.AbstractC24160e;
import com.p2082ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4567d.AbstractC88428a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.e */
public final class C78529e extends AbstractC78487a {

    /* renamed from: g */
    public static final C78530a f176474g = new C78530a((byte) 0);

    /* renamed from: e */
    public String f176475e;

    /* renamed from: f */
    public final VideoPublishEditModel f176476f;

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.e$c */
    static final class C78533c<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C78533c f176482a = new C78533c();

        static {
            Covode.recordClassIndex(91665);
        }

        C78533c() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(91661);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a
    /* renamed from: d */
    public final List<C78595z> mo122412d() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78550l
    /* renamed from: e */
    public final String mo122447e() {
        return "extract_custom_sticker";
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.e$a */
    public static final class C78530a {
        static {
            Covode.recordClassIndex(91662);
        }

        private C78530a() {
        }

        public /* synthetic */ C78530a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.e$e */
    static final class C78535e implements AbstractC88428a {

        /* renamed from: a */
        final /* synthetic */ C78529e f176485a;

        /* renamed from: b */
        final /* synthetic */ AbstractC78550l.AbstractC78551a f176486b;

        static {
            Covode.recordClassIndex(91667);
        }

        C78535e(C78529e eVar, AbstractC78550l.AbstractC78551a aVar) {
            this.f176485a = eVar;
            this.f176486b = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88428a
        /* renamed from: a */
        public final void mo8579a() {
            if (!(this.f176485a.f176476f.extractFramesModel == null || this.f176485a.f176476f.extractFramesModel.getExtractFramesDir() == null)) {
                String extractFramesDir = this.f176485a.f176476f.extractFramesModel.getExtractFramesDir();
                String str = File.separator;
                C89219l.m154716b(str, "");
                if (!C89361p.m154876c(extractFramesDir, str, false)) {
                    extractFramesDir = extractFramesDir + File.separator;
                }
                File[] listFiles = new File(this.f176485a.f176475e).listFiles();
                if (!(listFiles == null || listFiles.length == 0)) {
                    for (File file : listFiles) {
                        StringBuilder append = new StringBuilder().append(extractFramesDir);
                        C89219l.m154716b(file, "");
                        String sb = append.append(file.getName()).toString();
                        C80720e.m139932c(file.getAbsolutePath(), sb);
                        this.f176485a.f176476f.extractFramesModel.addFrameAtLastSegment(new FrameItem(sb, 0, 0, 6, null));
                    }
                }
                C80720e.m139938e(this.f176485a.f176475e);
                C80720e.m139931c(this.f176485a.f176475e);
            }
            this.f176486b.mo122481a(true);
            this.f176485a.mo122410a(true);
            this.f176485a.mo122408a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.e$d */
    static final class C78534d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C78529e f176483a;

        /* renamed from: b */
        final /* synthetic */ AbstractC78550l.AbstractC78551a f176484b;

        static {
            Covode.recordClassIndex(91666);
        }

        C78534d(C78529e eVar, AbstractC78550l.AbstractC78551a aVar) {
            this.f176483a = eVar;
            this.f176484b = aVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            this.f176484b.mo122481a(false);
            this.f176483a.mo122410a(true);
            this.f176483a.mo122408a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.e$b */
    static final class C78531b<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C78529e f176477a;

        /* renamed from: b */
        final /* synthetic */ StickerItemModel f176478b;

        static {
            Covode.recordClassIndex(91663);
        }

        C78531b(C78529e eVar, StickerItemModel stickerItemModel) {
            this.f176477a = eVar;
            this.f176478b = stickerItemModel;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(final AbstractC88982v<Void> vVar) {
            C89219l.m154721d(vVar, "");
            final String str = this.f176478b.path;
            if (!new File(str).exists()) {
                vVar.mo143024a(new IllegalStateException("File not exists"));
                return;
            }
            AbstractC24157c<C24117a<AbstractC24454c>> a = C24428k.m46551a().mo40247e().mo40224a(C24639c.m47149a(Uri.fromFile(new File(str))).mo40483a(), this.f176477a);
            C89219l.m154716b(a, "");
            a.mo39739a(new AbstractC24160e<C24117a<AbstractC24454c>>(this) {
                /* class com.p2082ss.android.ugc.aweme.tools.extract.C78529e.C78531b.C785321 */

                /* renamed from: a */
                final /* synthetic */ C78531b f176479a;

                static {
                    Covode.recordClassIndex(91664);
                }

                @Override // com.facebook.p1844d.AbstractC24160e
                public final void onProgressUpdate(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                }

                @Override // com.facebook.p1844d.AbstractC24160e
                public final void onCancellation(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                    C84911q.m145926b("fetchDecodedImage onCancellation");
                    vVar.mo143023a();
                }

                @Override // com.facebook.p1844d.AbstractC24160e
                public final void onFailure(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                    C84911q.m145926b("fetchDecodedImage Error");
                    vVar.mo143023a();
                }

                @Override // com.facebook.p1844d.AbstractC24160e
                public final void onNewResult(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                    C24117a<AbstractC24454c> d;
                    AbstractC24454c a;
                    int duration;
                    boolean z;
                    int[] iArr;
                    MethodCollector.m26663i(7772);
                    if (cVar == null || (d = cVar.mo39747d()) == null || (a = d.mo39695a()) == null) {
                        MethodCollector.m26664o(7772);
                    } else if (a instanceof C24452a) {
                        C24452a aVar = (C24452a) a;
                        C24325e d2 = aVar.mo40293d();
                        C89219l.m154716b(d2, "");
                        AbstractC24323c cVar2 = d2.f57681a;
                        C89219l.m154716b(cVar2, "");
                        if (cVar2.getDuration() <= 0) {
                            duration = 1;
                        } else {
                            C24325e d3 = aVar.mo40293d();
                            C89219l.m154716b(d3, "");
                            AbstractC24323c cVar3 = d3.f57681a;
                            C89219l.m154716b(cVar3, "");
                            duration = cVar3.getDuration();
                        }
                        C24325e d4 = aVar.mo40293d();
                        C89219l.m154716b(d4, "");
                        AbstractC24323c cVar4 = d4.f57681a;
                        C89219l.m154716b(cVar4, "");
                        int frameCount = cVar4.getFrameCount();
                        int i = ((int) (((float) frameCount) / (((float) duration) / 1000.0f))) * 2;
                        for (int i2 = 0; i2 < frameCount; i2 += i) {
                            C24288b bVar = new C24288b(new C24279c(), new C24336a(new C24346a(), aVar.mo40293d(), new Rect(0, 0, aVar.getWidth(), aVar.getHeight())));
                            Bitmap createBitmap = Bitmap.createBitmap(aVar.getWidth(), aVar.getHeight(), Bitmap.Config.ARGB_8888);
                            bVar.mo40065a(i2, createBitmap);
                            int width = aVar.getWidth();
                            int height = aVar.getHeight();
                            if (width > height) {
                                z = true;
                                iArr = new int[]{C78549k.f176544a[0], (int) ((((float) height) / ((float) width)) * ((float) C78549k.f176544a[0]))};
                            } else {
                                z = true;
                                iArr = new int[]{(int) ((((float) width) / ((float) height)) * ((float) C78549k.f176544a[1])), C78549k.f176544a[1]};
                            }
                            int i3 = iArr[0];
                            char c = z ? 1 : 0;
                            char c2 = z ? 1 : 0;
                            char c3 = z ? 1 : 0;
                            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, i3, iArr[c], z);
                            C78529e eVar = this.f176479a.f176477a;
                            C89219l.m154716b(createScaledBitmap, "");
                            C84891c.m145848a(createScaledBitmap, new File(eVar.f176475e + "extract-frame-custom_sticker-" + System.currentTimeMillis() + ".jpg"), 70, Bitmap.CompressFormat.JPEG);
                            createScaledBitmap.recycle();
                            createBitmap.recycle();
                        }
                        vVar.mo143023a();
                        MethodCollector.m26664o(7772);
                    } else {
                        C78529e eVar2 = this.f176479a.f176477a;
                        String str = str;
                        C89219l.m154716b(str, "");
                        C84891c.m145848a(C84891c.m145845a(str, C78549k.f176544a, Bitmap.Config.ARGB_4444), new File(eVar2.f176475e + "extract-frame-custom_sticker-" + System.currentTimeMillis() + ".jpg"), 70, Bitmap.CompressFormat.JPEG);
                        vVar.mo143023a();
                        MethodCollector.m26664o(7772);
                    }
                }

                {
                    this.f176479a = r1;
                }
            }, Executors.newCachedThreadPool());
        }
    }

    public C78529e(VideoPublishEditModel videoPublishEditModel) {
        C89219l.m154721d(videoPublishEditModel, "");
        this.f176476f = videoPublishEditModel;
        C78553n nVar = this.f176393c;
        C89219l.m154716b(nVar, "");
        String str = nVar.f176546b;
        this.f176475e = str;
        C89219l.m154716b(str, "");
        String str2 = File.separator;
        C89219l.m154716b(str2, "");
        if (!C89361p.m154876c(str, str2, false)) {
            this.f176475e += File.separator;
        }
        String str3 = this.f176475e + "custom_sticker";
        this.f176475e = str3;
        this.f176475e = str3 + File.separator;
        new File(this.f176475e).mkdirs();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78487a
    /* renamed from: a */
    public final void mo122409a(AbstractC78550l.AbstractC78551a aVar) {
        C89219l.m154721d(aVar, "");
        super.mo122409a(aVar);
        if (!m137043b()) {
            aVar.mo122481a(false);
            mo122410a(true);
            mo122408a();
        } else if (!this.f176476f.hasImageStickers()) {
            aVar.mo122481a(false);
            mo122410a(true);
            mo122408a();
        } else {
            List<StickerItemModel> list = this.f176476f.infoStickerModel.stickers;
            C89219l.m154716b(list, "");
            ArrayList arrayList = new ArrayList();
            ArrayList<StickerItemModel> arrayList2 = new ArrayList();
            for (T t : list) {
                if (t.type == 11) {
                    arrayList2.add(t);
                }
            }
            for (StickerItemModel stickerItemModel : arrayList2) {
                C89219l.m154721d(stickerItemModel, "");
                AbstractC88979t a = AbstractC88979t.m154294a(new C78531b(this, stickerItemModel));
                C89219l.m154716b(a, "");
                arrayList.add(a);
            }
            AbstractC88979t.m154313c(arrayList).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143255a(C78533c.f176482a, new C78534d(this, aVar), new C78535e(this, aVar));
        }
    }
}
