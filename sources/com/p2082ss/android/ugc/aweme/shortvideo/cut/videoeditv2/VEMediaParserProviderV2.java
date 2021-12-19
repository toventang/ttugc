package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.appcompat.app.ActivityC0218d;
import androidx.core.app.ActivityC0580d;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C70638dj;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70068b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70500t;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70581y;
import com.p2082ss.android.ugc.aweme.utils.C80322d;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.vesdk.C85318an;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p077b.AbstractC1729g;
import p077b.C1726d;
import p077b.C1728f;
import p077b.C1731i;
import p077b.C1743j;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2 */
public final class VEMediaParserProviderV2 implements AbstractC33974au {

    /* renamed from: a */
    public boolean f157769a;

    /* renamed from: b */
    public final Map<String, C85318an> f157770b = new LinkedHashMap();

    /* renamed from: c */
    final ExecutorService f157771c;

    /* renamed from: d */
    public final List<Long> f157772d;

    /* renamed from: e */
    public int f157773e;

    /* renamed from: f */
    private final List<C1728f> f157774f;

    /* renamed from: g */
    private final List<C1731i<Bitmap>> f157775g;

    /* renamed from: h */
    private final AbstractC89244h f157776h;

    static {
        Covode.recordClassIndex(83007);
    }

    /* renamed from: a */
    public final C70500t<Bitmap> mo111278a() {
        return (C70500t) this.f157776h.getValue();
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            releaseFrames();
        }
    }

    /* renamed from: b */
    public final void mo111280b() {
        this.f157771c.execute(new RunnableC70555g(this));
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public final void releaseFrames() {
        C1731i.m5640b(new CallableC70554f(this), C1731i.f5562a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$c */
    public static final class CallableC70551c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f157789a;

        /* renamed from: b */
        final /* synthetic */ String f157790b;

        static {
            Covode.recordClassIndex(83013);
        }

        CallableC70551c(VEMediaParserProviderV2 vEMediaParserProviderV2, String str) {
            this.f157789a = vEMediaParserProviderV2;
            this.f157790b = str;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            C70581y<Bitmap> a = this.f157789a.mo111278a().mo111084a(this.f157790b);
            if (a != null) {
                return a.f157923c;
            }
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$h */
    static final class RunnableC70556h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f157801a;

        /* renamed from: b */
        final /* synthetic */ String f157802b;

        static {
            Covode.recordClassIndex(83018);
        }

        RunnableC70556h(VEMediaParserProviderV2 vEMediaParserProviderV2, String str) {
            this.f157801a = vEMediaParserProviderV2;
            this.f157802b = str;
        }

        public final void run() {
            C85318an anVar = this.f157801a.f157770b.get(this.f157802b);
            if (anVar != null) {
                this.f157801a.f157770b.put(this.f157802b, null);
                anVar.mo130628a();
            }
        }
    }

    /* renamed from: c */
    public final void mo111281c() {
        C1731i.m5634a((Collection) this.f157775g).mo5534a(new C70553e(this), C1731i.f5562a, null);
        this.f157775g.clear();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$a */
    static final class C70546a extends AbstractC89220m implements AbstractC89171a<C70500t<Bitmap>> {

        /* renamed from: a */
        final /* synthetic */ Context f157777a;

        static {
            Covode.recordClassIndex(83008);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70546a(Context context) {
            super(0);
            this.f157777a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C70500t<Bitmap> invoke() {
            return new C70500t(this.f157777a, C70638dj.f158101d + "ve_frame_cache2/" + System.currentTimeMillis(), new C70068b());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$g */
    public static final class RunnableC70555g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f157800a;

        static {
            Covode.recordClassIndex(83017);
        }

        RunnableC70555g(VEMediaParserProviderV2 vEMediaParserProviderV2) {
            this.f157800a = vEMediaParserProviderV2;
        }

        public final void run() {
            for (Map.Entry<String, C85318an> entry : this.f157800a.f157770b.entrySet()) {
                VEMediaParserProviderV2 vEMediaParserProviderV2 = this.f157800a;
                vEMediaParserProviderV2.f157771c.execute(new RunnableC70556h(vEMediaParserProviderV2, entry.getKey()));
            }
        }
    }

    /* renamed from: d */
    public final void mo111282d() {
        Iterator<T> it = this.f157774f.iterator();
        while (it.hasNext()) {
            it.next().mo5527c();
        }
        this.f157774f.clear();
        this.f157775g.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$f */
    public static final class CallableC70554f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f157799a;

        static {
            Covode.recordClassIndex(83016);
        }

        CallableC70554f(VEMediaParserProviderV2 vEMediaParserProviderV2) {
            this.f157799a = vEMediaParserProviderV2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f157799a.mo111282d();
            this.f157799a.mo111278a().mo111085a();
            this.f157799a.mo111280b();
            List<Long> list = this.f157799a.f157772d;
            C89219l.m154721d(list, "");
            C89219l.m154721d("video_clip", "");
            if (!list.isEmpty()) {
                C80322d.m139251a("tool_performance_fetch_frames", new C84425b().mo129404a("duration", C89070n.m154600t(list)).mo129403a("count", list.size()).mo129406a("scene", "video_clip").f188764a);
            }
            return C89391z.f203057a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$b */
    public static final class RunnableC70547b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f157778a;

        /* renamed from: b */
        final /* synthetic */ C1726d f157779b;

        /* renamed from: c */
        final /* synthetic */ C1743j f157780c;

        /* renamed from: d */
        final /* synthetic */ String f157781d;

        /* renamed from: e */
        final /* synthetic */ int f157782e;

        /* renamed from: f */
        final /* synthetic */ int f157783f;

        /* renamed from: g */
        final /* synthetic */ String f157784g;

        static {
            Covode.recordClassIndex(83009);
        }

        RunnableC70547b(VEMediaParserProviderV2 vEMediaParserProviderV2, C1726d dVar, C1743j jVar, String str, int i, int i2, String str2) {
            this.f157778a = vEMediaParserProviderV2;
            this.f157779b = dVar;
            this.f157780c = jVar;
            this.f157781d = str;
            this.f157782e = i;
            this.f157783f = i2;
            this.f157784g = str2;
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0077  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x009c  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
            // Method dump skipped, instructions count: 167
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2.RunnableC70547b.run():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$e */
    public static final class C70553e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f157798a;

        static {
            Covode.recordClassIndex(83015);
        }

        C70553e(VEMediaParserProviderV2 vEMediaParserProviderV2) {
            this.f157798a = vEMediaParserProviderV2;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            this.f157798a.mo111280b();
            return null;
        }
    }

    /* renamed from: a */
    private final C1731i<Bitmap> m124574a(String str) {
        C1731i<Bitmap> b = C1731i.m5640b(new CallableC70551c(this, str), C1731i.f5562a);
        C89219l.m154716b(b, "");
        return b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2$d */
    public static final class C70552d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ VEMediaParserProviderV2 f157791a;

        /* renamed from: b */
        final /* synthetic */ boolean f157792b;

        /* renamed from: c */
        final /* synthetic */ int f157793c;

        /* renamed from: d */
        final /* synthetic */ String f157794d;

        /* renamed from: e */
        final /* synthetic */ int f157795e;

        /* renamed from: f */
        final /* synthetic */ AbstractC70557a f157796f;

        /* renamed from: g */
        final /* synthetic */ C89233z.C89237d f157797g;

        static {
            Covode.recordClassIndex(83014);
        }

        C70552d(VEMediaParserProviderV2 vEMediaParserProviderV2, boolean z, int i, String str, int i2, AbstractC70557a aVar, C89233z.C89237d dVar) {
            this.f157791a = vEMediaParserProviderV2;
            this.f157792b = z;
            this.f157793c = i;
            this.f157794d = str;
            this.f157795e = i2;
            this.f157796f = aVar;
            this.f157797g = dVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154716b(iVar, "");
            if (!iVar.mo5544c() || !this.f157792b) {
                Bitmap bitmap = (Bitmap) iVar.mo5545d();
                if (bitmap != null && (!bitmap.isRecycled())) {
                    this.f157796f.mo111302a(bitmap);
                    if (this.f157797g.element != -1) {
                        this.f157791a.f157772d.add(Long.valueOf(System.currentTimeMillis() - this.f157797g.element));
                    }
                }
            } else {
                this.f157791a.mo111279a(this.f157793c, this.f157794d, this.f157795e, this.f157796f, false);
            }
            return C89391z.f203057a;
        }
    }

    public VEMediaParserProviderV2(Context context) {
        C89219l.m154721d(context, "");
        C40787l.C40788a a = C40787l.m82269a(EnumC40793o.FIXED);
        a.f95505c = 1;
        this.f157771c = C40780g.m82242a(a.mo70028a());
        this.f157774f = new ArrayList();
        this.f157775g = new ArrayList();
        this.f157772d = new ArrayList();
        this.f157776h = C89250i.m154773a((AbstractC89171a) new C70546a(context));
        this.f157773e = C71812ep.m126783a(56.0d, C63247i.f143610a);
        C63244g.m114602a().mo73293u();
        if (context instanceof ActivityC0218d) {
            ((ActivityC0580d) context).getLifecycle().mo4012a(this);
        }
    }

    /* renamed from: a */
    private final C1731i<Bitmap> m124575a(String str, String str2, int i) {
        C1728f fVar = new C1728f();
        this.f157774f.add(fVar);
        C1726d b = fVar.mo5526b();
        C89219l.m154716b(b, "");
        C1731i<Bitmap> a = m124573a(b, i, this.f157773e, str2, str);
        this.f157775g.add(a);
        return a;
    }

    /* renamed from: a */
    private final C1731i<Bitmap> m124573a(C1726d dVar, int i, int i2, String str, String str2) {
        C1743j jVar = new C1743j();
        this.f157771c.execute(new RunnableC70547b(this, dVar, jVar, str, i2, i, str2));
        C1731i<TResult> iVar = jVar.f5610a;
        C89219l.m154716b(iVar, "");
        return iVar;
    }

    /* renamed from: a */
    public final void mo111279a(int i, String str, int i2, AbstractC70557a aVar, boolean z) {
        C1731i<Bitmap> a;
        C89233z.C89237d dVar = new C89233z.C89237d();
        dVar.element = -1;
        String str2 = str.toString() + i2;
        if (mo111278a().mo111087b(str2)) {
            a = m124574a(str2);
        } else {
            dVar.element = System.currentTimeMillis();
            a = m124575a(str2, str, i2);
        }
        a.mo5534a(new C70552d(this, z, i, str, i2, aVar, dVar), C1731i.f5564c, null);
    }
}
