package com.p2082ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p1999a.C27252o;
import com.p2082ss.android.ugc.aweme.services.IPreloadVESo;
import com.p2082ss.android.ugc.aweme.services.PreloadVESoStatus;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;

/* renamed from: com.ss.android.ugc.aweme.cz */
public final class C40899cz implements IPreloadVESo {

    /* renamed from: a */
    public static final AbstractC89244h f95712a = C89250i.m154773a((AbstractC89171a) C40901b.f95718a);

    /* renamed from: b */
    public static final C40900a f95713b = new C40900a((byte) 0);

    /* renamed from: c */
    private volatile PreloadVESoStatus f95714c = PreloadVESoStatus.UNLOAD;

    /* renamed from: d */
    private volatile long f95715d = -1;

    /* renamed from: e */
    private final C27252o f95716e = new C27252o();

    /* renamed from: f */
    private boolean f95717f;

    /* renamed from: com.ss.android.ugc.aweme.cz$a */
    public static final class C40900a {
        static {
            Covode.recordClassIndex(48752);
        }

        /* renamed from: a */
        public static C40899cz m82377a() {
            return (C40899cz) C40899cz.f95712a.getValue();
        }

        private C40900a() {
        }

        public /* synthetic */ C40900a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IPreloadVESo
    public final long getPreLoadVESoCostTime() {
        return this.f95715d;
    }

    @Override // com.p2082ss.android.ugc.aweme.services.IPreloadVESo
    public final PreloadVESoStatus getPreLoadVESoStatus() {
        return this.f95714c;
    }

    /* renamed from: com.ss.android.ugc.aweme.cz$b */
    static final class C40901b extends AbstractC89220m implements AbstractC89171a<C40899cz> {

        /* renamed from: a */
        public static final C40901b f95718a = new C40901b();

        static {
            Covode.recordClassIndex(48753);
        }

        C40901b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C40899cz invoke() {
            return new C40899cz();
        }
    }

    static {
        Covode.recordClassIndex(48751);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        r5.f95716e.mo45340b();
        r5.f95714c = com.p2082ss.android.ugc.aweme.services.PreloadVESoStatus.LOADING;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (com.p2082ss.android.ugc.aweme.property.C65397cj.m117097a() == false) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        com.p2082ss.android.ttve.nativePort.C30731d.f73586f = true;
        r2 = dmt.p4542av.video.p4546c.C88243b.f200282d;
        r1 = com.p2082ss.android.ugc.aweme.port.p3561in.C63238c.f143574a;
        p4600h.p4611f.p4613b.C89219l.m154716b(r1, "");
        r2.mo142775a(r1).mo142774b();
        com.p2082ss.android.ttve.nativePort.C30731d.m63117b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (com.bytedance.ies.abmock.C16048b.m29633a().mo25421a(true, "creative_tools_pre_load_model_so", false) == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        com.p2082ss.android.ugc.effectmanager.DownloadableModelSupport.loadSo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        com.p2082ss.android.ugc.aweme.port.p3561in.C63244g.m114602a().mo73273a();
     */
    @Override // com.p2082ss.android.ugc.aweme.services.IPreloadVESo
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void preLoadVESo() {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.C40899cz.preLoadVESo():void");
    }
}
