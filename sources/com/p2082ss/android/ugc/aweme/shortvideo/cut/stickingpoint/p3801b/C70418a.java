package com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3801b;

import android.app.Application;
import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.Downloader;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.out.AVServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63167ab;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.IFoundationAVService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70762ea;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70455f;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.C70464i;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70406a;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70407b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3801b.C70428b;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70436b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.aweme.utils.C80418fa;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a */
public final class C70418a {

    /* renamed from: a */
    public static final C70418a f157360a = new C70418a();

    private C70418a() {
    }

    static {
        Covode.recordClassIndex(82861);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$e */
    public static final class CallableC70426e<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ String f157372a;

        /* renamed from: b */
        final /* synthetic */ String f157373b;

        static {
            Covode.recordClassIndex(82869);
        }

        CallableC70426e(String str, String str2) {
            this.f157372a = str;
            this.f157373b = str2;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            boolean z;
            String str = this.f157372a;
            if (str == null) {
                C89219l.m154715b();
            }
            String str2 = this.f157373b;
            if (str2 == null) {
                C89219l.m154715b();
            }
            if (VEUtils.getMusicDefaultAlgorithm(str, str2) == 0) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a */
    public static final class C70419a implements C70428b.AbstractC70430b {

        /* renamed from: a */
        final /* synthetic */ AbstractC70436b f157361a;

        /* renamed from: b */
        final /* synthetic */ C69905c f157362b;

        static {
            Covode.recordClassIndex(82862);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$a */
        public static final class C70420a extends C70407b {

            /* renamed from: a */
            final /* synthetic */ C70419a f157363a;

            static {
                Covode.recordClassIndex(82863);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C70420a(C70419a aVar) {
                this.f157363a = aVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70436b, com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70407b
            /* renamed from: b */
            public final void mo110906b(C69905c cVar, boolean z) {
                AbstractC70436b bVar = this.f157363a.f157361a;
                if (bVar != null) {
                    bVar.mo110906b(cVar, z);
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$b */
        public static final class C70421b extends C70407b {

            /* renamed from: a */
            final /* synthetic */ C70419a f157364a;

            static {
                Covode.recordClassIndex(82864);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C70421b(C70419a aVar) {
                this.f157364a = aVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70436b, com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70407b
            /* renamed from: b */
            public final void mo110906b(C69905c cVar, boolean z) {
                AbstractC70436b bVar = this.f157364a.f157361a;
                if (bVar != null) {
                    bVar.mo110906b(cVar, z);
                }
            }
        }

        C70419a(AbstractC70436b bVar, C69905c cVar) {
            this.f157361a = bVar;
            this.f157362b = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
            if (r0 == null) goto L_0x000e;
         */
        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3801b.C70428b.AbstractC70430b
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo110991a(com.p2082ss.android.ugc.aweme.shortvideo.C70762ea r4, boolean r5) {
            /*
                r3 = this;
                if (r5 == 0) goto L_0x002f
                if (r4 == 0) goto L_0x0022
                boolean r0 = r4.existOnSetAlgFile()
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                if (r0 != 0) goto L_0x0011
            L_0x000e:
                p4600h.p4611f.p4613b.C89219l.m154715b()
            L_0x0011:
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L_0x0024
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.c.b r2 = r3.f157361a
                if (r2 == 0) goto L_0x0021
                com.ss.android.ugc.aweme.shortvideo.c r1 = r3.f157362b
                r0 = 1
                r2.mo110906b(r1, r0)
            L_0x0021:
                return
            L_0x0022:
                r0 = 0
                goto L_0x000e
            L_0x0024:
                com.ss.android.ugc.aweme.shortvideo.c r1 = r3.f157362b
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$a r0 = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$a
                r0.<init>(r3)
                com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3801b.C70418a.m124207a(r1, r0)
                return
            L_0x002f:
                com.ss.android.ugc.aweme.shortvideo.c r1 = r3.f157362b
                com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$b r0 = new com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$a$b
                r0.<init>(r3)
                com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3801b.C70418a.m124207a(r1, r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3801b.C70418a.C70419a.mo110991a(com.ss.android.ugc.aweme.shortvideo.ea, boolean):void");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$c */
    public static final class C70423c extends C70407b {

        /* renamed from: a */
        final /* synthetic */ AbstractC70436b f157368a;

        /* renamed from: b */
        final /* synthetic */ Context f157369b;

        static {
            Covode.recordClassIndex(82866);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$c$a */
        public static final class C70424a extends C70407b {

            /* renamed from: a */
            final /* synthetic */ C70423c f157370a;

            static {
                Covode.recordClassIndex(82867);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C70424a(C70423c cVar) {
                this.f157370a = cVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70436b, com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70407b
            /* renamed from: b */
            public final void mo110906b(C69905c cVar, boolean z) {
                AbstractC70436b bVar = this.f157370a.f157368a;
                if (bVar != null) {
                    bVar.mo110906b(cVar, z);
                }
            }
        }

        C70423c(AbstractC70436b bVar, Context context) {
            this.f157368a = bVar;
            this.f157369b = context;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3802c.AbstractC70436b, com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70407b
        /* renamed from: a */
        public final void mo110905a(C69905c cVar, boolean z) {
            if (z) {
                AbstractC70436b bVar = this.f157368a;
                if (bVar != null) {
                    bVar.mo110905a(cVar, true);
                }
                Context context = this.f157369b;
                C70424a aVar = new C70424a(this);
                if (context == null || cVar == null || cVar.getStickPointMusicAlg() == null) {
                    aVar.mo110906b(cVar, false);
                    return;
                }
                C70428b bVar2 = new C70428b();
                bVar2.f157381e = new C70419a(aVar, cVar);
                C70762ea stickPointMusicAlg = cVar.getStickPointMusicAlg();
                C89219l.m154721d(context, "");
                if (stickPointMusicAlg == null) {
                    C70428b.AbstractC70430b bVar3 = bVar2.f157381e;
                    if (bVar3 != null) {
                        bVar3.mo110991a(stickPointMusicAlg, bVar2.f157383g);
                        return;
                    }
                    return;
                }
                bVar2.f157382f = stickPointMusicAlg;
                bVar2.f157377a = context;
                bVar2.f157383g = false;
                bVar2.f157379c.clear();
                bVar2.f157380d.clear();
                bVar2.f157378b = 0;
                if (!TextUtils.isEmpty(stickPointMusicAlg.getVeBeatsUrl())) {
                    bVar2.f157379c.add(stickPointMusicAlg.getVeBeatsUrl());
                    bVar2.f157380d.add(stickPointMusicAlg.getVeBeatsPath());
                    bVar2.f157384h.add("ve-beats");
                }
                if (!TextUtils.isEmpty(stickPointMusicAlg.getDownBeatsUrl())) {
                    bVar2.f157379c.add(stickPointMusicAlg.getDownBeatsUrl());
                    bVar2.f157380d.add(stickPointMusicAlg.getDownBeatsPath());
                    bVar2.f157384h.add("down-beats");
                }
                if (!TextUtils.isEmpty(stickPointMusicAlg.getNoStrengthBeatsUrl())) {
                    bVar2.f157379c.add(stickPointMusicAlg.getNoStrengthBeatsUrl());
                    bVar2.f157380d.add(stickPointMusicAlg.getNoStrengthBeatsPath());
                    bVar2.f157384h.add("no-strength-beats");
                }
                if (!TextUtils.isEmpty(stickPointMusicAlg.getManModeBeatsUrl())) {
                    bVar2.f157379c.add(stickPointMusicAlg.getManModeBeatsUrl());
                    bVar2.f157380d.add(stickPointMusicAlg.getManModeBeatsPath());
                    bVar2.f157384h.add("man_mode");
                }
                if (bVar2.f157379c.size() == 0) {
                    C70428b.AbstractC70430b bVar4 = bVar2.f157381e;
                    if (bVar4 != null) {
                        bVar4.mo110991a(stickPointMusicAlg, bVar2.f157383g);
                        return;
                    }
                    return;
                }
                bVar2.mo110993a();
                return;
            }
            AbstractC70436b bVar5 = this.f157368a;
            if (bVar5 != null) {
                bVar5.mo110905a(cVar, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$d */
    public static final class C70425d implements IFoundationAVService.IFetchResourcesListener {

        /* renamed from: a */
        final /* synthetic */ IFoundationAVService.IFetchResourcesListener f157371a;

        static {
            Covode.recordClassIndex(82868);
        }

        C70425d(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
            this.f157371a = iFetchResourcesListener;
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onFailed(Exception exc) {
            C89219l.m154721d(exc, "");
            C70455f.f157419c = false;
            IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = this.f157371a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onFailed(exc);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IFoundationAVService.IFetchResourcesListener
        public final void onSuccess(String[] strArr) {
            C89219l.m154721d(strArr, "");
            C70455f.f157419c = true;
            IFoundationAVService.IFetchResourcesListener iFetchResourcesListener = this.f157371a;
            if (iFetchResourcesListener != null) {
                iFetchResourcesListener.onSuccess(strArr);
            }
        }
    }

    /* renamed from: a */
    public static void m124206a(IFoundationAVService.IFetchResourcesListener iFetchResourcesListener) {
        if (C70455f.f157420d) {
            AVServiceImpl.m113116a().fetchResourcesNeededByRequirements(new String[]{"VideoMontage"}, new C70425d(iFetchResourcesListener));
        } else if (iFetchResourcesListener != null) {
            iFetchResourcesListener.onFailed(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$b */
    public static final class C70422b extends C70406a {

        /* renamed from: a */
        final /* synthetic */ String f157365a;

        /* renamed from: b */
        final /* synthetic */ AbstractC70436b f157366b;

        /* renamed from: c */
        final /* synthetic */ C69905c f157367c;

        static {
            Covode.recordClassIndex(82865);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70406a
        public final void onSuccessed(DownloadInfo downloadInfo) {
            if (!C80720e.m139927b(this.f157365a)) {
                AbstractC70436b bVar = this.f157366b;
                if (bVar != null) {
                    bVar.mo110905a(this.f157367c, false);
                }
                C70464i.m124294a(false, this.f157367c, (Exception) null);
                return;
            }
            AbstractC70436b bVar2 = this.f157366b;
            if (bVar2 != null) {
                bVar2.mo110905a(this.f157367c, true);
            }
            C70464i.m124294a(true, this.f157367c, (Exception) null);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p3800a.C70406a
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            AbstractC70436b bVar = this.f157366b;
            if (bVar != null) {
                bVar.mo110905a(this.f157367c, false);
            }
            C70464i.m124294a(false, this.f157367c, (Exception) baseException);
        }

        C70422b(String str, AbstractC70436b bVar, C69905c cVar) {
            this.f157365a = str;
            this.f157366b = bVar;
            this.f157367c = cVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.b.a$f */
    public static final class C70427f<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C70407b f157374a;

        /* renamed from: b */
        final /* synthetic */ C69905c f157375b;

        static {
            Covode.recordClassIndex(82870);
        }

        C70427f(C70407b bVar, C69905c cVar) {
            this.f157374a = bVar;
            this.f157375b = cVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<Boolean> iVar) {
            if (iVar == null || !iVar.mo5545d().booleanValue()) {
                C70407b bVar = this.f157374a;
                if (bVar == null) {
                    return null;
                }
                bVar.mo110906b(this.f157375b, false);
                return null;
            }
            C70407b bVar2 = this.f157374a;
            if (bVar2 == null) {
                return null;
            }
            bVar2.mo110906b(this.f157375b, true);
            return null;
        }
    }

    /* renamed from: a */
    public static void m124207a(C69905c cVar, C70407b bVar) {
        String c = C70455f.m124271c(cVar);
        String b = C70455f.m124269b(cVar);
        if (!C80720e.m139927b(c)) {
            bVar.mo110906b(cVar, false);
        } else if (TextUtils.isEmpty(b)) {
            bVar.mo110906b(cVar, false);
        } else {
            C1731i.m5640b(new CallableC70426e(c, b), C1731i.f5562a).mo5534a(new C70427f(bVar, cVar), C1731i.f5564c, null);
        }
    }

    /* renamed from: a */
    public static void m124204a(Context context, C69905c cVar, AbstractC70436b bVar) {
        m124208b(context, cVar, new C70423c(bVar, context));
    }

    /* renamed from: b */
    private static void m124208b(Context context, C69905c cVar, AbstractC70436b bVar) {
        if (context == null || cVar == null || TextUtils.isEmpty(cVar.getPath())) {
            bVar.mo110905a(cVar, false);
            return;
        }
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
        if (C69823b.m123388a(c, application)) {
            bVar.mo110905a(cVar, true);
        } else {
            m124205a(application, C80418fa.m139407a(cVar), c, new C70422b(c, bVar, cVar));
        }
    }

    /* renamed from: a */
    public static void m124205a(Context context, String str, String str2, C70406a aVar) {
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            aVar.onFailed(new DownloadInfo((Cursor) null), new BaseException());
        } else if (C80720e.m139927b(str2)) {
            aVar.onSuccessed(new DownloadInfo((Cursor) null));
        } else {
            File file = new File(str2);
            Downloader.with(context).url(str).ignoreDataVerify(true).savePath(file.getParent() + File.separator).name(file.getName()).mainThreadListener(aVar).download();
        }
    }
}
