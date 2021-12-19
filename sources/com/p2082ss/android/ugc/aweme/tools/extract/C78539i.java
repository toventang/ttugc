package com.p2082ss.android.ugc.aweme.tools.extract;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.android.livesdk.livesetting.watchlive.InteractFirstFrameTimeOutDurationSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14179f;
import com.p2082ss.android.ugc.asve.p2217f.C31098f;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.p2082ss.android.ugc.tools.C84401c;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.i */
public final class C78539i implements AbstractC78554o {

    /* renamed from: s */
    public static final int[] f176492s = {360, 640};

    /* renamed from: t */
    public static final C78540a f176493t = new C78540a((byte) 0);

    /* renamed from: a */
    public ExtractFramesModel f176494a;

    /* renamed from: b */
    public volatile boolean f176495b;

    /* renamed from: c */
    public String f176496c;

    /* renamed from: d */
    public C78553n f176497d;

    /* renamed from: e */
    public AbstractC78555p f176498e;

    /* renamed from: f */
    public final AtomicBoolean f176499f = new AtomicBoolean(false);

    /* renamed from: g */
    public long f176500g;

    /* renamed from: h */
    public String f176501h;

    /* renamed from: i */
    public AbstractC89183m<? super String, ? super String, String> f176502i = new C78541b(this);

    /* renamed from: j */
    public volatile boolean f176503j;

    /* renamed from: k */
    public final HashMap<String, Boolean> f176504k = new HashMap<>();

    /* renamed from: l */
    public final Application f176505l;

    /* renamed from: m */
    public final String f176506m;

    /* renamed from: n */
    public final AbstractC31133a f176507n;

    /* renamed from: o */
    int f176508o;

    /* renamed from: p */
    int f176509p;

    /* renamed from: q */
    public final boolean f176510q;

    /* renamed from: r */
    public final AbstractC78563v f176511r;

    /* renamed from: u */
    private String f176512u;

    /* renamed from: v */
    private ScheduledExecutorService f176513v;

    /* renamed from: w */
    private final boolean f176514w;

    /* renamed from: x */
    private final AbstractC14179f f176515x;

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.i$a */
    public static final class C78540a {
        static {
            Covode.recordClassIndex(91672);
        }

        private C78540a() {
        }

        public /* synthetic */ C78540a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o
    /* renamed from: e */
    public final ExtractFramesModel mo122474e() {
        return this.f176494a;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o
    /* renamed from: f */
    public final String mo122475f() {
        return this.f176512u;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o
    /* renamed from: c */
    public final void mo122472c() {
        this.f176494a.removeLastSegment();
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o
    /* renamed from: d */
    public final void mo122473d() {
        this.f176494a.removeMultiImages();
    }

    static {
        Covode.recordClassIndex(91671);
    }

    /* renamed from: g */
    private static ScheduledExecutorService m137113g() {
        return (ScheduledExecutorService) C40780g.m82242a(C40787l.m82269a(EnumC40793o.SCHEDULED).mo70025a(1).mo70028a());
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o
    /* renamed from: b */
    public final void mo122471b() {
        this.f176495b = false;
        this.f176494a = new ExtractFramesModel(this.f176506m);
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        this.f176496c = uuid;
        ScheduledExecutorService scheduledExecutorService = this.f176513v;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdown();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o
    /* renamed from: a */
    public final String mo122463a() {
        AbstractC78555p pVar = this.f176498e;
        if (pVar != null) {
            pVar.mo115156a();
        }
        if (!this.f176514w) {
            return null;
        }
        this.f176495b = true;
        this.f176497d.mo122484a(this.f176502i.invoke(this.f176506m, this.f176496c), this.f176506m, this.f176496c);
        ExtractFramesModel extractFramesModel = this.f176494a;
        String str = this.f176497d.f176546b;
        String str2 = "";
        C89219l.m154716b(str, str2);
        extractFramesModel.setExtractFramesDir(str);
        this.f176512u = UUID.randomUUID().toString();
        this.f176494a.addFrameSegment(new ArrayList<>(), this.f176512u);
        int size = this.f176494a.getAllFrames().size();
        String str3 = this.f176512u;
        if (str3 != null) {
            str2 = str3;
        }
        mo122467a(mo122462a(size, str2), 0);
        String str4 = this.f176512u;
        if (str4 != null) {
            this.f176504k.put(str4, true);
        }
        return this.f176512u;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.extract.i$d */
    public static final class RunnableC78544d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C78539i f176522a;

        /* renamed from: b */
        final /* synthetic */ String f176523b;

        /* renamed from: c */
        final /* synthetic */ int f176524c;

        static {
            Covode.recordClassIndex(91676);
        }

        RunnableC78544d(C78539i iVar, String str, int i) {
            this.f176522a = iVar;
            this.f176523b = str;
            this.f176524c = i;
        }

        public final void run() {
            boolean z;
            final String a;
            int i;
            int[] iArr;
            int i2;
            final long currentTimeMillis = System.currentTimeMillis();
            if (this.f176522a.f176495b && !C89219l.m154714a((Object) this.f176522a.f176504k.get(this.f176523b), (Object) false)) {
                int i3 = this.f176524c;
                if (i3 == 2 || i3 == 4) {
                    this.f176522a.f176499f.set(true);
                }
                if (!this.f176522a.f176499f.get() || !this.f176522a.f176510q || this.f176522a.f176511r.mo116051a()) {
                    z = false;
                } else {
                    z = true;
                }
                C78553n nVar = this.f176522a.f176497d;
                if (z) {
                    a = nVar.mo122485b();
                } else {
                    a = nVar.mo122482a();
                }
                C89219l.m154716b(a, "");
                this.f176522a.f176500g = System.currentTimeMillis();
                C78539i iVar = this.f176522a;
                if (z) {
                    if (iVar.f176509p > iVar.f176508o) {
                        i2 = 720;
                    } else {
                        i2 = 1280;
                    }
                    iArr = iVar.f176508o > 720 ? new int[]{i2, (int) ((((float) iVar.f176509p) / ((float) iVar.f176508o)) * ((float) i2))} : new int[]{iVar.f176508o, iVar.f176509p};
                } else {
                    if (iVar.f176509p > iVar.f176508o) {
                        i = C78539i.f176492s[0];
                    } else {
                        i = C78539i.f176492s[1];
                    }
                    iArr = new int[]{i, (int) ((((float) iVar.f176509p) / ((float) iVar.f176508o)) * ((float) i))};
                }
                this.f176522a.f176499f.set(false);
                final long d = this.f176522a.f176507n.mo56616d();
                this.f176522a.f176507n.mo56599a(a, iArr[0], iArr[1], this.f176522a.f176511r.mo116051a(), Bitmap.CompressFormat.JPEG, (AbstractC89172b<? super Integer, C89391z>) new AbstractC89172b<Integer, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.tools.extract.C78539i.RunnableC78544d.C785451 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC78544d f176525a;

                    static {
                        Covode.recordClassIndex(91677);
                    }

                    {
                        this.f176525a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                    public final /* synthetic */ C89391z invoke(Integer num) {
                        int i;
                        final int intValue = num.intValue();
                        long currentTimeMillis = System.currentTimeMillis() - this.f176525a.f176522a.f176500g;
                        C1731i.m5636a(new Callable<Object>(this) {
                            /* class com.p2082ss.android.ugc.aweme.tools.extract.C78539i.RunnableC78544d.C785451.CallableC785461 */

                            /* renamed from: a */
                            final /* synthetic */ C785451 f176529a;

                            static {
                                Covode.recordClassIndex(91678);
                            }

                            {
                                this.f176529a = r1;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                if (intValue == 0) {
                                    this.f176529a.f176525a.f176522a.f176503j = true;
                                    ExtractFramesModel extractFramesModel = this.f176529a.f176525a.f176522a.f176494a;
                                    FrameItem frameItem = new FrameItem(a, 0, 0, 6, null);
                                    frameItem.setTimeStamp(d);
                                    extractFramesModel.addFrameAtLastSegment(frameItem);
                                    return null;
                                }
                                C84401c.f188722f.mo123660b("Default Frame Extractor Fail : ret " + intValue);
                                return null;
                            }
                        }, C1731i.f5564c);
                        AbstractC78555p pVar = this.f176525a.f176522a.f176498e;
                        if (pVar != null) {
                            pVar.mo115157a(System.currentTimeMillis() - currentTimeMillis);
                        }
                        C78539i iVar = this.f176525a.f176522a;
                        Runnable a = this.f176525a.f176522a.mo122462a(this.f176525a.f176524c + 1, this.f176525a.f176523b);
                        if (currentTimeMillis > InteractFirstFrameTimeOutDurationSetting.DEFAULT) {
                            i = 0;
                        } else {
                            i = (int) (InteractFirstFrameTimeOutDurationSetting.DEFAULT - currentTimeMillis);
                        }
                        iVar.mo122467a(a, i);
                        return C89391z.f203057a;
                    }
                }, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.extract.i$e */
    public static final class CallableC78547e<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C78539i f176531a;

        /* renamed from: b */
        final /* synthetic */ List f176532b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89172b f176533c;

        static {
            Covode.recordClassIndex(91679);
        }

        CallableC78547e(C78539i iVar, List list, AbstractC89172b bVar) {
            this.f176531a = iVar;
            this.f176532b = list;
            this.f176533c = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001e, code lost:
            if (p4600h.p4622m.C89361p.m154929e((java.lang.CharSequence) r1, (java.lang.CharSequence) r10.f176531a.f176506m) == false) goto L_0x0020;
         */
        @Override // java.util.concurrent.Callable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ p4600h.C89391z call() {
            /*
            // Method dump skipped, instructions count: 264
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.extract.C78539i.CallableC78547e.call():java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o
    /* renamed from: a */
    public final void mo122464a(ExtractFramesModel extractFramesModel) {
        if (extractFramesModel != null) {
            this.f176494a = extractFramesModel;
            this.f176497d.f176546b = extractFramesModel.getExtractFramesDir();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.i$c */
    static final class C78542c extends AbstractC89220m implements AbstractC89172b<List<? extends String>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C78539i f176517a;

        /* renamed from: b */
        final /* synthetic */ String f176518b;

        /* renamed from: c */
        final /* synthetic */ boolean f176519c;

        static {
            Covode.recordClassIndex(91674);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78542c(C78539i iVar, String str, boolean z) {
            super(1);
            this.f176517a = iVar;
            this.f176518b = str;
            this.f176519c = z;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(List<? extends String> list) {
            final List<? extends String> list2 = list;
            C89219l.m154721d(list2, "");
            C31098f.m64301a(new AbstractC89171a<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.tools.extract.C78539i.C78542c.C785431 */

                /* renamed from: a */
                final /* synthetic */ C78542c f176520a;

                static {
                    Covode.recordClassIndex(91675);
                }

                {
                    this.f176520a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    C78539i iVar = this.f176520a.f176517a;
                    List<String> list = list2;
                    String str = this.f176520a.f176518b;
                    boolean z = this.f176520a.f176519c;
                    HashMap<Integer, List<String>> multiStickers = iVar.f176494a.getMultiStickers();
                    if (multiStickers == null || multiStickers.isEmpty()) {
                        iVar.f176494a.initSegmentEffectPhoto();
                    }
                    if (!z || !iVar.f176503j) {
                        iVar.f176494a.addMultiImages(list);
                    } else {
                        iVar.f176494a.addMultiImagesAfterShoot(list);
                    }
                    iVar.f176494a.bindSegmentEffectPhoto(list, str);
                    return C89391z.f203057a;
                }
            });
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o
    /* renamed from: a */
    public final void mo122465a(AbstractC78555p pVar) {
        C89219l.m154721d(pVar, "");
        this.f176498e = pVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o
    /* renamed from: a */
    public final void mo122466a(AbstractC89183m<? super String, ? super String, String> mVar) {
        C89219l.m154721d(mVar, "");
        this.f176502i = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o
    /* renamed from: a */
    public final void mo122468a(String str) {
        AbstractC78555p pVar = this.f176498e;
        if (pVar != null) {
            pVar.mo115158b();
        }
        this.f176495b = false;
        if (str != null) {
            this.f176504k.put(str, false);
        }
    }

    /* renamed from: a */
    public final Runnable mo122462a(int i, String str) {
        return new RunnableC78544d(this, str, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.extract.i$b */
    static final class C78541b extends AbstractC89220m implements AbstractC89183m<String, String, String> {

        /* renamed from: a */
        final /* synthetic */ C78539i f176516a;

        static {
            Covode.recordClassIndex(91673);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C78541b(C78539i iVar) {
            super(2);
            this.f176516a = iVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ String invoke(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            Context applicationContext = this.f176516a.f176505l.getApplicationContext();
            if (C58003a.f132201c && applicationContext == null) {
                applicationContext = C58003a.f132199a;
            }
            C89219l.m154716b(applicationContext, "");
            if (C58016d.f132222c == null || !C58016d.f132224e) {
                C58016d.f132222c = applicationContext.getFilesDir();
            }
            File file = C58016d.f132222c;
            C89219l.m154716b(file, "");
            String absolutePath = file.getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            return absolutePath;
        }
    }

    /* renamed from: a */
    public final void mo122467a(Runnable runnable, int i) {
        ScheduledExecutorService scheduledExecutorService = this.f176513v;
        if (scheduledExecutorService == null || scheduledExecutorService.isShutdown()) {
            this.f176513v = m137113g();
        }
        ScheduledExecutorService scheduledExecutorService2 = this.f176513v;
        if (scheduledExecutorService2 == null) {
            C89219l.m154715b();
        }
        scheduledExecutorService2.schedule(runnable, (long) i, TimeUnit.MILLISECONDS);
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o
    /* renamed from: a */
    public final void mo122469a(List<String> list, AbstractC89172b<? super List<String>, C89391z> bVar) {
        C89219l.m154721d(list, "");
        C89219l.m154721d(bVar, "");
        C1731i.m5635a((Callable) new CallableC78547e(this, list, bVar));
    }

    @Override // com.p2082ss.android.ugc.aweme.tools.extract.AbstractC78554o
    /* renamed from: a */
    public final void mo122470a(List<String> list, boolean z) {
        String str = "";
        C89219l.m154721d(list, str);
        if (!list.isEmpty()) {
            String str2 = this.f176512u;
            if (str2 != null) {
                str = str2;
            }
            mo122469a(list, new C78542c(this, str, z));
        }
    }

    public C78539i(Application application, String str, AbstractC31133a aVar, int i, int i2, boolean z, boolean z2, AbstractC78563v vVar, AbstractC14179f fVar) {
        C89219l.m154721d(application, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(vVar, "");
        C89219l.m154721d(fVar, "");
        this.f176505l = application;
        this.f176506m = str;
        this.f176507n = aVar;
        this.f176508o = i;
        this.f176509p = i2;
        this.f176514w = z;
        this.f176510q = z2;
        this.f176511r = vVar;
        this.f176515x = fVar;
        this.f176494a = new ExtractFramesModel(str);
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        this.f176496c = uuid;
        this.f176497d = new C78553n(application);
    }
}
