package com.p2082ss.android.ugc.aweme.shortvideo.cut;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.app.ActivityC0580d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.p1878c.C24359g;
import com.facebook.imagepipeline.p1885j.AbstractC24453b;
import com.facebook.imagepipeline.p1885j.C24455d;
import com.facebook.imagepipeline.p1885j.C24458g;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.AbstractC70086a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.AbstractC70092g;
import com.p2082ss.android.ugc.tools.utils.C84891c;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.vesdk.C85318an;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl */
public final class VEMediaParserFrameProviderImpl implements AbstractC33974au, AbstractC70092g {

    /* renamed from: a */
    public boolean f156606a;

    /* renamed from: b */
    public final Map<String, C85318an> f156607b = new LinkedHashMap();

    /* renamed from: c */
    public int f156608c;

    /* renamed from: d */
    public final Context f156609d;

    /* renamed from: e */
    private final ExecutorService f156610e = C40780g.m82242a(C40787l.m82269a(EnumC40793o.FIXED).mo70025a(1).mo70028a());

    /* renamed from: f */
    private final AbstractC89244h f156611f;

    static {
        Covode.recordClassIndex(82451);
    }

    /* renamed from: a */
    public final C70500t<Bitmap> mo110498a() {
        return (C70500t) this.f156611f.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            releaseFrames();
        }
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void releaseFrames() {
        C1731i.m5635a((Callable) new CallableC70040e(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$c */
    public static final class CallableC70038c<V> implements Callable<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f156621a;

        /* renamed from: b */
        final /* synthetic */ String f156622b;

        static {
            Covode.recordClassIndex(82457);
        }

        CallableC70038c(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, String str) {
            this.f156621a = vEMediaParserFrameProviderImpl;
            this.f156622b = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Bitmap call() {
            C70581y<Bitmap> a = this.f156621a.mo110498a().mo111084a(this.f156622b);
            if (a != null) {
                return a.f157923c;
            }
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$e */
    public static final class CallableC70040e<V> implements Callable<C89391z> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f156629a;

        static {
            Covode.recordClassIndex(82459);
        }

        CallableC70040e(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl) {
            this.f156629a = vEMediaParserFrameProviderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ C89391z call() {
            this.f156629a.mo110498a().mo111085a();
            this.f156629a.mo110503b();
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$g */
    public static final class RunnableC70042g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f156631a;

        /* renamed from: b */
        final /* synthetic */ String f156632b;

        static {
            Covode.recordClassIndex(82461);
        }

        RunnableC70042g(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, String str) {
            this.f156631a = vEMediaParserFrameProviderImpl;
            this.f156632b = str;
        }

        public final void run() {
            C85318an anVar = this.f156631a.f156607b.get(this.f156632b);
            if (anVar != null) {
                anVar.mo130628a();
                this.f156631a.f156607b.put(this.f156632b, null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.model.AbstractC70092g
    /* renamed from: b */
    public final void mo110503b() {
        this.f156610e.submit(new RunnableC70041f(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$f */
    public static final class RunnableC70041f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f156630a;

        static {
            Covode.recordClassIndex(82460);
        }

        RunnableC70041f(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl) {
            this.f156630a = vEMediaParserFrameProviderImpl;
        }

        public final void run() {
            for (Map.Entry<String, C85318an> entry : this.f156630a.f156607b.entrySet()) {
                this.f156630a.mo110502a(entry.getKey());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$a */
    static final class C70033a extends AbstractC89220m implements AbstractC89171a<C70500t<Bitmap>> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f156612a;

        static {
            Covode.recordClassIndex(82452);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70033a(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl) {
            super(0);
            this.f156612a = vEMediaParserFrameProviderImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70500t<Bitmap> invoke() {
            return new C70500t(this.f156612a.f156609d, (C84902i.m145895b(this.f156612a.f156609d).toString() + "/") + "ve_frame_cache2/" + System.currentTimeMillis(), new C70068b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$b */
    public static final class CallableC70034b<V> implements Callable<Bitmap> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f156613a;

        /* renamed from: b */
        final /* synthetic */ String f156614b;

        /* renamed from: c */
        final /* synthetic */ int f156615c;

        /* renamed from: d */
        final /* synthetic */ String f156616d;

        static {
            Covode.recordClassIndex(82453);
        }

        CallableC70034b(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, String str, int i, String str2) {
            this.f156613a = vEMediaParserFrameProviderImpl;
            this.f156614b = str;
            this.f156615c = i;
            this.f156616d = str2;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Bitmap call() {
            MethodCollector.m26663i(12450);
            C700351 r2 = new AbstractC89172b<String, C85318an>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl.CallableC70034b.C700351 */

                /* renamed from: a */
                final /* synthetic */ CallableC70034b f156617a;

                static {
                    Covode.recordClassIndex(82454);
                }

                {
                    this.f156617a = r2;
                }

                /* renamed from: a */
                public final C85318an invoke(String str) {
                    C89219l.m154721d(str, "");
                    C85318an anVar = new C85318an();
                    anVar.mo130629a(str.toString());
                    this.f156617a.f156613a.f156607b.put(str.toString(), anVar);
                    return anVar;
                }
            };
            C85318an anVar = this.f156613a.f156607b.get(this.f156614b.toString());
            if (anVar == null) {
                anVar = r2.invoke(this.f156614b);
            }
            final C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = null;
            String str = this.f156614b;
            if (C84902i.m145892a(str)) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(str, options);
                String str2 = options.outMimeType;
                if (!TextUtils.isEmpty(str2)) {
                    C89219l.m154716b(str2, "");
                    if (C89361p.m154908a((CharSequence) str2, (CharSequence) "png", true) || C89361p.m154908a((CharSequence) str2, (CharSequence) "jpg", true) || C89361p.m154908a((CharSequence) str2, (CharSequence) "jpeg", true)) {
                        eVar.element = (T) C84891c.m145844a(this.f156614b, new int[]{this.f156613a.f156608c, this.f156613a.f156608c});
                        if (eVar.element != null && !eVar.element.isRecycled()) {
                            C1731i.m5636a(new Callable<C89391z>(this) {
                                /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl.CallableC70034b.CallableC700362 */

                                /* renamed from: a */
                                final /* synthetic */ CallableC70034b f156618a;

                                static {
                                    Covode.recordClassIndex(82455);
                                }

                                {
                                    this.f156618a = r1;
                                }

                                /* Return type fixed from 'java.lang.Object' to match base method */
                                @Override // java.util.concurrent.Callable
                                public final /* synthetic */ C89391z call() {
                                    this.f156618a.f156613a.mo110498a().mo111086a(this.f156618a.f156616d, new C70581y<>(eVar.element.getWidth(), eVar.element.getHeight(), eVar.element), C700371.f156620a);
                                    return C89391z.f203057a;
                                }
                            }, C1731i.f5562a);
                        }
                        T t = eVar.element;
                        MethodCollector.m26664o(12450);
                        return t;
                    }
                }
            }
            eVar.element = (T) anVar.mo130627a(this.f156615c, this.f156613a.f156608c, this.f156613a.f156606a);
            C1731i.m5636a(new Callable<C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl.CallableC70034b.CallableC700362 */

                /* renamed from: a */
                final /* synthetic */ CallableC70034b f156618a;

                static {
                    Covode.recordClassIndex(82455);
                }

                {
                    this.f156618a = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ C89391z call() {
                    this.f156618a.f156613a.mo110498a().mo111086a(this.f156618a.f156616d, new C70581y<>(eVar.element.getWidth(), eVar.element.getHeight(), eVar.element), C700371.f156620a);
                    return C89391z.f203057a;
                }
            }, C1731i.f5562a);
            T t2 = eVar.element;
            MethodCollector.m26664o(12450);
            return t2;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.model.AbstractC70092g
    /* renamed from: a */
    public final void mo110499a(int i) {
        this.f156608c = i;
    }

    /* renamed from: b */
    private final C1731i<Bitmap> m123672b(String str) {
        C1731i<Bitmap> a = C1731i.m5635a((Callable) new CallableC70038c(this, str));
        C89219l.m154716b(a, "");
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl$d */
    public static final class C70039d<TTaskResult, TContinuationResult> implements AbstractC1729g<Bitmap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserFrameProviderImpl f156623a;

        /* renamed from: b */
        final /* synthetic */ boolean f156624b;

        /* renamed from: c */
        final /* synthetic */ int f156625c;

        /* renamed from: d */
        final /* synthetic */ String f156626d;

        /* renamed from: e */
        final /* synthetic */ int f156627e;

        /* renamed from: f */
        final /* synthetic */ AbstractC70086a f156628f;

        static {
            Covode.recordClassIndex(82458);
        }

        C70039d(VEMediaParserFrameProviderImpl vEMediaParserFrameProviderImpl, boolean z, int i, String str, int i2, AbstractC70086a aVar) {
            this.f156623a = vEMediaParserFrameProviderImpl;
            this.f156624b = z;
            this.f156625c = i;
            this.f156626d = str;
            this.f156627e = i2;
            this.f156628f = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [b.i] */
        @Override // p077b.AbstractC1729g
        public final /* synthetic */ C89391z then(C1731i<Bitmap> iVar) {
            C24117a a;
            C89219l.m154716b(iVar, "");
            if (!iVar.mo5544c() || !this.f156624b) {
                Bitmap d = iVar.mo5545d();
                if (d != null && (!d.isRecycled()) && (a = C24117a.m45706a(new C24455d(d, C24359g.m46366a(), C24458g.f58105a))) != null && a.mo39700d()) {
                    AbstractC70086a aVar = this.f156628f;
                    C24117a<AbstractC24453b> b = a.clone();
                    C89219l.m154716b(b, "");
                    aVar.mo110587a(b);
                    C24117a.m45712c(a);
                }
            } else {
                this.f156623a.mo110501a(this.f156625c, this.f156626d, this.f156627e, this.f156628f, false);
            }
            return C89391z.f203057a;
        }
    }

    public VEMediaParserFrameProviderImpl(Context context) {
        C89219l.m154721d(context, "");
        this.f156609d = context;
        this.f156608c = (int) C84912r.m145930a(context, 60.0f);
        this.f156611f = C89250i.m154773a((AbstractC89171a) new C70033a(this));
        if (context instanceof ActivityC0218d) {
            ((ActivityC0580d) context).getLifecycle().mo4012a(this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.model.AbstractC70092g
    /* renamed from: a */
    public final void mo110502a(String str) {
        C89219l.m154721d(str, "");
        this.f156610e.submit(new RunnableC70042g(this, str));
    }

    /* renamed from: a */
    private final C1731i<Bitmap> m123671a(String str, String str2, int i) {
        C1731i<Bitmap> a = C1731i.m5636a(new CallableC70034b(this, str2, i, str), this.f156610e);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.model.AbstractC70092g
    /* renamed from: a */
    public final void mo110500a(int i, String str, int i2, AbstractC70086a aVar) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(aVar, "");
        mo110501a(i, str, i2, aVar, true);
    }

    /* renamed from: a */
    public final void mo110501a(int i, String str, int i2, AbstractC70086a aVar, boolean z) {
        C1731i<Bitmap> a;
        String str2 = str + i2;
        if (mo110498a().mo111087b(str2)) {
            a = m123672b(str2);
        } else {
            a = m123671a(str2, str, i2);
        }
        a.mo5533a(new C70039d(this, z, i, str, i2, aVar), C1731i.f5564c);
    }
}
