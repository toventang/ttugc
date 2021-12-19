package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint;

import android.app.Application;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65390cc;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.C70090e;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70416b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84896h;
import com.p2082ss.android.ugc.tools.utils.C84904k;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.clipparam.VEAlgorithmPath;
import com.p2082ss.android.vesdk.clipparam.VEClipAlgorithmParam;
import com.p2082ss.android.vesdk.clipparam.VEClipSourceParam;
import com.p2082ss.android.vesdk.clipparam.VEClipTimelineParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l */
public final class C70467l {

    /* renamed from: g */
    public static final C70469a f157447g = new C70469a((byte) 0);

    /* renamed from: a */
    public AbstractC31071f f157448a;

    /* renamed from: b */
    public int f157449b = -1;

    /* renamed from: c */
    public C69905c f157450c;

    /* renamed from: d */
    public AbstractC70470b f157451d;

    /* renamed from: e */
    public int f157452e;

    /* renamed from: f */
    public final C70416b f157453f;

    /* renamed from: h */
    private final HashMap<String, List<C70090e>> f157454h = new HashMap<>();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$b */
    public interface AbstractC70470b {
        static {
            Covode.recordClassIndex(82913);
        }

        /* renamed from: a */
        void mo110888a(int i);

        /* renamed from: a */
        void mo110889a(long j);

        /* renamed from: a */
        boolean mo110890a();

        /* renamed from: b */
        List<VideoSegment> mo110891b();
    }

    static {
        Covode.recordClassIndex(82910);
    }

    /* renamed from: a */
    public static boolean m124303a(int i) {
        return i == 6 || i == 7;
    }

    /* renamed from: d */
    private static boolean m124304d(int i) {
        return i == 1 || i == 4 || i == 3;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$a */
    public static final class C70469a {
        static {
            Covode.recordClassIndex(82912);
        }

        private C70469a() {
        }

        public /* synthetic */ C70469a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final boolean mo111032a() {
        AbstractC31071f fVar = this.f157448a;
        if (fVar != null) {
            try {
                if (fVar.mo56356f() == C85581w.EnumC85611j.STARTED) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo111031a(boolean z, boolean z2, int i, AbstractC70440f fVar) {
        m124308k();
        if (z2) {
            mo111028a((AbstractC70440f) new C70473e(this, fVar, i, 4), true);
        } else if (z) {
            AbstractC70470b bVar = this.f157451d;
            if (bVar == null) {
                C89219l.m154715b();
            }
            List<VideoSegment> b = bVar.mo110891b();
            if (!C84904k.m145909a(b)) {
                ArrayList arrayList = new ArrayList();
                for (T t : b) {
                    if (t.f156722n != null) {
                        arrayList.add(t.f156722n.clone());
                    }
                }
                C69905c cVar = this.f157450c;
                if (cVar != null) {
                    HashMap<String, List<C70090e>> hashMap = this.f157454h;
                    String musicId = cVar.getMusicId();
                    C89219l.m154716b(musicId, "");
                    hashMap.put(musicId, arrayList);
                }
            }
            mo111035b(this.f157450c, i, 6, fVar);
        } else {
            mo111035b(this.f157450c, i, 7, fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$e */
    public static final class C70473e implements AbstractC70440f {

        /* renamed from: a */
        final /* synthetic */ C70467l f157463a;

        /* renamed from: b */
        final /* synthetic */ AbstractC70440f f157464b;

        /* renamed from: c */
        final /* synthetic */ int f157465c;

        /* renamed from: d */
        final /* synthetic */ int f157466d;

        static {
            Covode.recordClassIndex(82916);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110701a() {
            AbstractC70440f fVar = this.f157464b;
            if (fVar != null) {
                fVar.mo110701a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110702a(int i) {
            C70467l lVar = this.f157463a;
            lVar.mo111035b(lVar.f157450c, this.f157465c, this.f157466d, this.f157464b);
        }

        C70473e(C70467l lVar, AbstractC70440f fVar, int i, int i2) {
            this.f157463a = lVar;
            this.f157464b = fVar;
            this.f157465c = i;
            this.f157466d = i2;
        }
    }

    /* renamed from: i */
    private final boolean m124306i() {
        if (this.f157449b >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private final boolean m124307j() {
        if (this.f157448a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo111034b() {
        AbstractC31071f fVar = this.f157448a;
        if (fVar != null) {
            fVar.mo56390u();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$h */
    public static final class C70476h implements AbstractC70440f {

        /* renamed from: a */
        final /* synthetic */ C70467l f157473a;

        /* renamed from: b */
        final /* synthetic */ AbstractC70440f f157474b;

        /* renamed from: c */
        final /* synthetic */ int f157475c;

        static {
            Covode.recordClassIndex(82919);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110701a() {
            this.f157473a.f157449b = -1;
            AbstractC70440f fVar = this.f157474b;
            if (fVar != null) {
                fVar.mo110701a();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70440f
        /* renamed from: a */
        public final void mo110702a(int i) {
            this.f157473a.f157449b = i;
            if (!C70467l.m124303a(this.f157475c)) {
                this.f157473a.mo111024a(this.f157475c, -1);
            } else {
                if (this.f157473a.f157451d != null) {
                    AbstractC70470b bVar = this.f157473a.f157451d;
                    if (bVar == null) {
                        C89219l.m154715b();
                    }
                    bVar.mo110888a(this.f157475c);
                }
                C70467l lVar = this.f157473a;
                this.f157473a.mo111026a(lVar.mo111033b(lVar.f157452e));
            }
            AbstractC70440f fVar = this.f157474b;
            if (fVar != null) {
                fVar.mo110702a(this.f157473a.f157449b);
            }
        }

        C70476h(C70467l lVar, AbstractC70440f fVar, int i) {
            this.f157473a = lVar;
            this.f157474b = fVar;
            this.f157475c = i;
        }
    }

    /* renamed from: k */
    private final void m124308k() {
        if (this.f157451d == null) {
            throw new IllegalArgumentException("stickpoint listener not init");
        }
    }

    /* renamed from: c */
    public final void mo111036c() {
        AbstractC31071f fVar;
        if (!mo111032a() && (fVar = this.f157448a) != null) {
            fVar.mo56388t();
        }
    }

    /* renamed from: e */
    public final int mo111039e() {
        AbstractC31071f fVar = this.f157448a;
        if (fVar == null) {
            return 0;
        }
        return fVar.mo56370k();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$m */
    static final class CallableC70481m<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C70467l f157485a;

        /* renamed from: b */
        final /* synthetic */ String f157486b;

        /* renamed from: c */
        final /* synthetic */ VEAlgorithmPath f157487c;

        /* renamed from: d */
        final /* synthetic */ int f157488d;

        /* renamed from: e */
        final /* synthetic */ int f157489e;

        static {
            Covode.recordClassIndex(82924);
        }

        CallableC70481m(C70467l lVar, String str, VEAlgorithmPath vEAlgorithmPath, int i, int i2) {
            this.f157485a = lVar;
            this.f157486b = str;
            this.f157487c = vEAlgorithmPath;
            this.f157488d = i;
            this.f157489e = i2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            return Integer.valueOf(this.f157485a.f157453f.mo110989a(this.f157486b, this.f157487c, this.f157488d, this.f157489e, null));
        }
    }

    public C70467l() {
        C70416b bVar = new C70416b();
        this.f157453f = bVar;
        bVar.f157358a = new C70416b.AbstractC70417a(this) {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70467l.C704681 */

            /* renamed from: a */
            final /* synthetic */ C70467l f157455a;

            static {
                Covode.recordClassIndex(82911);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f157455a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70416b.AbstractC70417a
            /* renamed from: a */
            public final int mo110990a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath) {
                C89219l.m154721d(str, "");
                C89219l.m154721d(vEAlgorithmPath, "");
                if (this.f157455a.f157448a == null) {
                    return -1;
                }
                AbstractC31071f fVar = this.f157455a.f157448a;
                if (fVar == null) {
                    C89219l.m154715b();
                }
                int a = fVar.mo56286a(str, i, i2, vEAlgorithmPath);
                AbstractC31071f fVar2 = this.f157455a.f157448a;
                if (fVar2 == null) {
                    C89219l.m154715b();
                }
                fVar2.mo56313a(0, 1, 0.5f);
                return a;
            }
        };
    }

    /* renamed from: h */
    private final List<VEClipAlgorithmParam> m124305h() {
        if (this.f157448a == null || !m124306i()) {
            return null;
        }
        AbstractC31071f fVar = this.f157448a;
        if (fVar == null) {
            C89219l.m154715b();
        }
        return fVar.mo56373l();
    }

    /* renamed from: d */
    public final boolean mo111038d() {
        Integer valueOf;
        AbstractC31071f fVar = this.f157448a;
        if (fVar == null || (valueOf = Integer.valueOf(fVar.mo56369j(this.f157449b))) == null || valueOf.intValue() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final boolean mo111040f() {
        if (this.f157448a != null && m124306i()) {
            AbstractC31071f fVar = this.f157448a;
            if (fVar == null) {
                C89219l.m154715b();
            }
            if (fVar.mo56242C() == 0) {
                mo111024a(5, -1);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$i */
    public static final class CallableC70477i<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C70467l f157476a;

        /* renamed from: b */
        final /* synthetic */ int f157477b;

        /* renamed from: c */
        final /* synthetic */ int f157478c;

        static {
            Covode.recordClassIndex(82920);
        }

        CallableC70477i(C70467l lVar, int i, int i2) {
            this.f157476a = lVar;
            this.f157477b = i;
            this.f157478c = i2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            AbstractC31071f fVar = this.f157476a.f157448a;
            if (fVar == null) {
                C89219l.m154715b();
            }
            int e = fVar.mo56352e(this.f157477b, this.f157478c);
            if (e >= 0) {
                AbstractC31071f fVar2 = this.f157476a.f157448a;
                if (fVar2 == null) {
                    C89219l.m154715b();
                }
                e = fVar2.mo56243D();
                if (e >= 0) {
                    AbstractC31071f fVar3 = this.f157476a.f157448a;
                    if (fVar3 == null) {
                        C89219l.m154715b();
                    }
                    e = fVar3.mo56241B();
                }
            }
            return Integer.valueOf(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$k */
    public static final class CallableC70479k<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C70467l f157482a;

        /* renamed from: b */
        final /* synthetic */ boolean f157483b;

        static {
            Covode.recordClassIndex(82922);
        }

        CallableC70479k(C70467l lVar, boolean z) {
            this.f157482a = lVar;
            this.f157483b = z;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i;
            if (this.f157482a.f157448a != null) {
                AbstractC31071f fVar = this.f157482a.f157448a;
                if (fVar == null) {
                    C89219l.m154715b();
                }
                i = fVar.mo56243D();
                if (this.f157483b && i >= 0) {
                    AbstractC31071f fVar2 = this.f157482a.f157448a;
                    if (fVar2 == null) {
                        C89219l.m154715b();
                    }
                    i = fVar2.mo56241B();
                }
            } else {
                i = -1;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: g */
    public final void mo111041g() {
        AbstractC70470b bVar;
        List<VideoSegment> b;
        if (!(!C70455f.f157420d || (bVar = this.f157451d) == null || (b = bVar.mo110891b()) == null)) {
            for (T t : b) {
                if (C84896h.m145866a(t.mo110571a(false), true)) {
                    t.f156710b = 3000;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$f */
    public static final class CallableC70474f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C70467l f157467a;

        /* renamed from: b */
        final /* synthetic */ String f157468b;

        /* renamed from: c */
        final /* synthetic */ VEAlgorithmPath f157469c;

        /* renamed from: d */
        final /* synthetic */ int f157470d;

        /* renamed from: e */
        final /* synthetic */ int f157471e;

        static {
            Covode.recordClassIndex(82917);
        }

        CallableC70474f(C70467l lVar, String str, VEAlgorithmPath vEAlgorithmPath, int i, int i2) {
            this.f157467a = lVar;
            this.f157468b = str;
            this.f157469c = vEAlgorithmPath;
            this.f157470d = i;
            this.f157471e = i2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            long j;
            int i;
            C70416b bVar = this.f157467a.f157453f;
            String str = this.f157468b;
            VEAlgorithmPath vEAlgorithmPath = this.f157469c;
            int i2 = this.f157470d;
            int b = C63253l.f143623a.mo73306b().mo101542b(str);
            if (C65390cc.m117087a()) {
                j = C63244g.m114602a().mo73284l().getMaxDurationResolver().getMaxShootingDuration();
            } else {
                j = 15000;
            }
            int i3 = (int) j;
            if (b > 0) {
                i = bVar.mo110989a(str, vEAlgorithmPath, i2, Math.min(Math.min(i3, b), i2 + 20000), Integer.valueOf(b));
            } else {
                i = -1;
            }
            int i4 = this.f157471e;
            if ((i4 == 2 || i4 == 4) && i >= 0) {
                AbstractC31071f fVar = this.f157467a.f157448a;
                if (fVar == null) {
                    C89219l.m154715b();
                }
                i = fVar.mo56241B();
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$c */
    static final class CallableC70471c<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C70467l f157456a;

        /* renamed from: b */
        final /* synthetic */ int f157457b;

        /* renamed from: c */
        final /* synthetic */ List f157458c;

        static {
            Covode.recordClassIndex(82914);
        }

        CallableC70471c(C70467l lVar, int i, List list) {
            this.f157456a = lVar;
            this.f157457b = i;
            this.f157458c = list;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            int i = this.f157457b;
            List list = this.f157458c;
            if (list == null) {
                C89219l.m154715b();
            }
            int size = i - list.size();
            ArrayList<VEClipSourceParam> arrayList = new ArrayList<>();
            ArrayList<VEClipTimelineParam> arrayList2 = new ArrayList<>();
            for (VideoSegment videoSegment : this.f157458c) {
                VEClipSourceParam vEClipSourceParam = new VEClipSourceParam();
                vEClipSourceParam.clipFilePath = videoSegment.mo110571a(false).toString();
                vEClipSourceParam.clipWidth = videoSegment.f156714f;
                vEClipSourceParam.clipHeight = videoSegment.f156715g;
                arrayList.add(vEClipSourceParam);
                VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                vEClipTimelineParam.speed = (double) EnumC78601i.NORMAL.value();
                vEClipTimelineParam.trimIn = 0;
                vEClipTimelineParam.trimOut = (int) videoSegment.f156710b;
                arrayList2.add(vEClipTimelineParam);
            }
            AbstractC31071f fVar = this.f157456a.f157448a;
            if (fVar == null) {
                C89219l.m154715b();
            }
            int a = fVar.mo56269a(size, arrayList, arrayList2);
            if (a >= 0) {
                AbstractC31071f fVar2 = this.f157456a.f157448a;
                if (fVar2 == null) {
                    C89219l.m154715b();
                }
                a = fVar2.mo56243D();
                if (a >= 0) {
                    AbstractC31071f fVar3 = this.f157456a.f157448a;
                    if (fVar3 == null) {
                        C89219l.m154715b();
                    }
                    a = fVar3.mo56241B();
                }
            }
            return Integer.valueOf(a);
        }
    }

    /* renamed from: a */
    public final void mo111029a(AbstractC70470b bVar) {
        C89219l.m154721d(bVar, "");
        this.f157451d = bVar;
    }

    /* renamed from: c */
    public final void mo111037c(int i) {
        AbstractC31071f fVar = this.f157448a;
        if (fVar != null) {
            fVar.mo56342c(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$g */
    public static final class C70475g<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC70440f f157472a;

        static {
            Covode.recordClassIndex(82918);
        }

        C70475g(AbstractC70440f fVar) {
            this.f157472a = fVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<Integer> iVar) {
            if (iVar == null || iVar.mo5545d() == null || iVar.mo5545d().intValue() < 0) {
                AbstractC70440f fVar = this.f157472a;
                if (fVar == null) {
                    return null;
                }
                fVar.mo110701a();
                return null;
            }
            AbstractC70440f fVar2 = this.f157472a;
            if (fVar2 == null) {
                return null;
            }
            Integer d = iVar.mo5545d();
            C89219l.m154716b(d, "");
            fVar2.mo110702a(d.intValue());
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$l */
    public static final class C70480l<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC70440f f157484a;

        static {
            Covode.recordClassIndex(82923);
        }

        C70480l(AbstractC70440f fVar) {
            this.f157484a = fVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<Integer> iVar) {
            if (iVar == null || iVar.mo5545d() == null) {
                AbstractC70440f fVar = this.f157484a;
                if (fVar == null) {
                    return null;
                }
                fVar.mo110701a();
                return null;
            }
            AbstractC70440f fVar2 = this.f157484a;
            if (fVar2 == null) {
                return null;
            }
            Integer d = iVar.mo5545d();
            C89219l.m154716b(d, "");
            fVar2.mo110702a(d.intValue());
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$n */
    static final class C70482n<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ AbstractC70440f f157490a;

        static {
            Covode.recordClassIndex(82925);
        }

        C70482n(AbstractC70440f fVar) {
            this.f157490a = fVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<Integer> iVar) {
            if (iVar == null || iVar.mo5545d() == null || iVar.mo5545d().intValue() < 0) {
                AbstractC70440f fVar = this.f157490a;
                if (fVar == null) {
                    return null;
                }
                fVar.mo110701a();
                return null;
            }
            AbstractC70440f fVar2 = this.f157490a;
            if (fVar2 == null) {
                return null;
            }
            Integer d = iVar.mo5545d();
            C89219l.m154716b(d, "");
            fVar2.mo110702a(d.intValue());
            return null;
        }
    }

    /* renamed from: b */
    public final long mo111033b(int i) {
        AbstractC70470b bVar = this.f157451d;
        long j = 0;
        if (bVar != null) {
            List<VideoSegment> b = bVar.mo110891b();
            if (C84904k.m145909a(b)) {
                return 0;
            }
            if (i >= 0 && i < b.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (!b.get(i2).f156717i) {
                        j += b.get(i2).mo110580e() - b.get(i2).mo110578d();
                    }
                }
            }
        }
        return j;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$d */
    static final class C70472d<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C70467l f157459a;

        /* renamed from: b */
        final /* synthetic */ AbstractC70440f f157460b;

        /* renamed from: c */
        final /* synthetic */ int f157461c;

        /* renamed from: d */
        final /* synthetic */ List f157462d;

        static {
            Covode.recordClassIndex(82915);
        }

        C70472d(C70467l lVar, AbstractC70440f fVar, int i, List list) {
            this.f157459a = lVar;
            this.f157460b = fVar;
            this.f157461c = i;
            this.f157462d = list;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<Integer> iVar) {
            if (iVar == null || iVar.mo5545d() == null) {
                AbstractC70440f fVar = this.f157460b;
                if (fVar == null) {
                    return null;
                }
                fVar.mo110701a();
                return null;
            } else if (iVar.mo5545d().intValue() == 0) {
                int i = this.f157461c;
                List list = this.f157462d;
                if (list == null) {
                    C89219l.m154715b();
                }
                this.f157459a.mo111024a(1, i - list.size());
                AbstractC70440f fVar2 = this.f157460b;
                if (fVar2 == null) {
                    return null;
                }
                fVar2.mo110702a(iVar.mo5545d().intValue());
                return null;
            } else {
                AbstractC70440f fVar3 = this.f157460b;
                if (fVar3 == null) {
                    return null;
                }
                fVar3.mo110701a();
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.l$j */
    public static final class C70478j<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C70467l f157479a;

        /* renamed from: b */
        final /* synthetic */ AbstractC70440f f157480b;

        /* renamed from: c */
        final /* synthetic */ int f157481c;

        static {
            Covode.recordClassIndex(82921);
        }

        C70478j(C70467l lVar, AbstractC70440f fVar, int i) {
            this.f157479a = lVar;
            this.f157480b = fVar;
            this.f157481c = i;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<Integer> iVar) {
            if (iVar == null || iVar.mo5545d() == null) {
                AbstractC70440f fVar = this.f157480b;
                if (fVar == null) {
                    return null;
                }
                fVar.mo110701a();
                return null;
            }
            Integer d = iVar.mo5545d();
            if (d != null && d.intValue() == 0) {
                this.f157479a.mo111024a(3, this.f157481c);
                AbstractC70440f fVar2 = this.f157480b;
                if (fVar2 == null) {
                    return null;
                }
                Integer d2 = iVar.mo5545d();
                C89219l.m154716b(d2, "");
                fVar2.mo110702a(d2.intValue());
                return null;
            }
            AbstractC70440f fVar3 = this.f157480b;
            if (fVar3 == null) {
                return null;
            }
            fVar3.mo110701a();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo111026a(long j) {
        AbstractC31071f fVar = this.f157448a;
        if (fVar != null) {
            fVar.mo56265a((int) j, C85581w.EnumC85607f.EDITOR_SEEK_FLAG_LastSeek);
        }
    }

    /* renamed from: a */
    private static void m124301a(VEClipAlgorithmParam vEClipAlgorithmParam, VideoSegment videoSegment) {
        if (vEClipAlgorithmParam != null && videoSegment != null && C70455f.f157420d && C84896h.m145866a(videoSegment.mo110571a(false), false) && vEClipAlgorithmParam.range > 3000) {
            videoSegment.f156710b = (long) vEClipAlgorithmParam.range;
        }
    }

    /* renamed from: a */
    public final void mo111024a(int i, int i2) {
        long j;
        boolean a;
        if (m124306i()) {
            m124308k();
            AbstractC70470b bVar = this.f157451d;
            if (bVar == null) {
                C89219l.m154715b();
            }
            List<VideoSegment> b = bVar.mo110891b();
            if (!C84904k.m145909a(b)) {
                List<VEClipAlgorithmParam> h = m124305h();
                if (C84904k.m145909a(h)) {
                    mo111026a(0L);
                    return;
                }
                for (VideoSegment videoSegment : b) {
                    if (h == null) {
                        C89219l.m154715b();
                    }
                    for (VEClipAlgorithmParam vEClipAlgorithmParam : h) {
                        if (vEClipAlgorithmParam.index == videoSegment.f156709a) {
                            m124301a(vEClipAlgorithmParam, videoSegment);
                            if (videoSegment.f156722n == null) {
                                if (i == 5) {
                                    j = (long) vEClipAlgorithmParam.trimIn;
                                } else {
                                    j = 0;
                                }
                                videoSegment.f156722n = new C70090e(videoSegment.f156709a, j, (long) vEClipAlgorithmParam.range, videoSegment.f156710b);
                                AbstractC70470b bVar2 = this.f157451d;
                                if (bVar2 == null) {
                                    a = false;
                                } else {
                                    a = bVar2.mo110890a();
                                }
                                videoSegment.f156723o = a;
                            } else if (i == 5) {
                                videoSegment.f156722n.resetVideoStartTime((long) vEClipAlgorithmParam.trimIn, (long) vEClipAlgorithmParam.range);
                            } else if (i == 2 || i == 6) {
                                HashMap<String, List<C70090e>> hashMap = this.f157454h;
                                C69905c cVar = this.f157450c;
                                if (cVar == null) {
                                    C89219l.m154715b();
                                }
                                List<C70090e> list = hashMap.get(cVar.getMusicId());
                                if (C84904k.m145909a(list)) {
                                    videoSegment.f156722n.updateVideoStartTime((long) vEClipAlgorithmParam.range);
                                } else {
                                    C70090e eVar = null;
                                    if (list == null) {
                                        C89219l.m154715b();
                                    }
                                    for (C70090e eVar2 : list) {
                                        if (eVar2.getVideoIndex() == videoSegment.f156709a) {
                                            eVar = eVar2;
                                        }
                                    }
                                    if (eVar != null) {
                                        videoSegment.f156722n.resetVideoStartTime(eVar.getVideoStart(), eVar.getVideoRange());
                                    } else {
                                        videoSegment.f156722n.resetVideoStartTime(0, (long) vEClipAlgorithmParam.range);
                                    }
                                }
                            } else if (m124304d(i)) {
                                videoSegment.f156722n.updateVideoStartTime((long) vEClipAlgorithmParam.range);
                            }
                        }
                    }
                }
                AbstractC70470b bVar3 = this.f157451d;
                if (bVar3 != null) {
                    bVar3.mo110888a(i);
                    bVar3.mo110889a(mo111033b(i2));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo111028a(AbstractC70440f fVar, boolean z) {
        C1731i.m5640b(new CallableC70479k(this, z), C1731i.f5563b).mo5534a(new C70480l(fVar), C1731i.f5564c, null);
    }

    /* renamed from: a */
    public final void mo111025a(int i, int i2, AbstractC70440f fVar) {
        if (i == i2 && fVar != null) {
            fVar.mo110701a();
        } else if (this.f157448a != null && m124306i()) {
            C1731i.m5640b(new CallableC70477i(this, i, i2), C1731i.f5562a).mo5534a(new C70478j(this, fVar, i2), C1731i.f5564c, null);
        }
    }

    /* renamed from: a */
    public final void mo111030a(List<? extends VideoSegment> list, int i, AbstractC70440f fVar) {
        if (this.f157448a == null) {
            fVar.mo110701a();
        } else if (C84904k.m145909a(list)) {
            fVar.mo110701a();
        } else {
            C1731i.m5640b(new CallableC70471c(this, i, list), C1731i.f5562a).mo5534a(new C70472d(this, fVar, i, list), C1731i.f5564c, null);
        }
    }

    /* renamed from: b */
    public final void mo111035b(C69905c cVar, int i, int i2, AbstractC70440f fVar) {
        this.f157450c = cVar;
        this.f157453f.f157359b = cVar;
        if (m124307j() && cVar != null && cVar.getStickPointMusicAlg() != null) {
            String c = C70455f.m124271c(cVar);
            Application application = null;
            try {
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
                AbstractC63167ab applicationService = createIAVServiceProxybyMonsterPlugin.getApplicationService();
                C89219l.m154716b(applicationService, "");
                application = applicationService.mo93774c();
            } catch (Exception unused) {
                C84911q.m145928d("ServiceManager fail, no context and local music load fail");
            }
            if (C80720e.m139927b(c) || C69823b.m123386a(application, Uri.parse(c))) {
                m124302a(c, i, i2, C70416b.m124200a(cVar), new C70476h(this, fVar, i2));
            }
        }
    }

    /* renamed from: a */
    public final void mo111027a(C69905c cVar, int i, int i2, AbstractC70440f fVar) {
        String c = C70455f.m124271c(cVar);
        if (!C80720e.m139927b(c)) {
            fVar.mo110701a();
        }
        C1731i.m5640b(new CallableC70481m(this, c, C70416b.m124200a(cVar), i, i2), C1731i.f5562a).mo5534a(new C70482n(fVar), C1731i.f5564c, null);
    }

    /* renamed from: a */
    private final void m124302a(String str, int i, int i2, VEAlgorithmPath vEAlgorithmPath, AbstractC70440f fVar) {
        C1731i.m5640b(new CallableC70474f(this, str, vEAlgorithmPath, i, i2), C1731i.f5562a).mo5534a(new C70475g(fVar), C1731i.f5564c, null);
    }
}
