package com.p2082ss.android.ugc.aweme.emoji.systembigemoji;

import com.bytedance.common.utility.p909d.C13608a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.p2082ss.android.socialbase.downloader.exception.BaseException;
import com.p2082ss.android.socialbase.downloader.model.DownloadInfo;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.download.component_api.AbstractC43167a;
import com.p2082ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.p2082ss.android.ugc.aweme.download.component_api.EnumC43176c;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.model.C46516b;
import com.p2082ss.android.ugc.aweme.emoji.emojichoose.model.ResourcesResponse;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46644f;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46650j;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2304af.C33429a;
import com.p2082ss.android.ugc.aweme.p2690cr.AbstractC40381g;
import com.p2082ss.android.ugc.aweme.p2690cr.C40353e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56226b;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3263m.C56244a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.AbstractC89587ci;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.internal.C89652o;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.g */
public class C46629g implements AbstractC46627e {

    /* renamed from: e */
    public static final C46630a f108731e = new C46630a((byte) 0);

    /* renamed from: a */
    private final List<AbstractC46627e> f108732a = new ArrayList();

    /* renamed from: c */
    final AbstractC89516am f108733c = C89517an.m155448a(C89546bf.f203267b);

    /* renamed from: d */
    public boolean f108734d;

    static {
        Covode.recordClassIndex(55220);
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.g$a */
    public static final class C46630a {

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.g$a$a */
        public static final class C46631a extends AbstractC89110d {

            /* renamed from: a */
            /* synthetic */ Object f108735a;

            /* renamed from: b */
            int f108736b;

            /* renamed from: c */
            final /* synthetic */ C46630a f108737c;

            static {
                Covode.recordClassIndex(55222);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C46631a(C46630a aVar, AbstractC89124d dVar) {
                super(dVar);
                this.f108737c = aVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                this.f108735a = obj;
                this.f108736b |= Integer.MIN_VALUE;
                return this.f108737c.mo79236a((String) null, this);
            }
        }

        static {
            Covode.recordClassIndex(55221);
        }

        private C46630a() {
        }

        public /* synthetic */ C46630a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m90016a(C46516b bVar) {
            File file = new File(C46650j.m90052a(bVar));
            if (file.exists() && file.isFile()) {
                m90018a(file);
            }
        }

        /* renamed from: a */
        private static boolean m90018a(File file) {
            MethodCollector.m26663i(10527);
            try {
                C40353e.C40356c cVar = (C40353e.C40356c) SettingsManager.m29616a().mo25397a("storage_intercepter_key", C40353e.C40356c.class, AbstractC40381g.f94567a);
                if (C40353e.m81545a(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_delete_log", C40353e.m81542a(cVar));
                }
                if (C40353e.m81549c(file.getAbsolutePath(), cVar)) {
                    C40353e.m81540a(file, new RuntimeException(), "exception_handle", C40353e.m81542a(cVar));
                    MethodCollector.m26664o(10527);
                    return false;
                }
            } catch (Throwable unused) {
            }
            boolean delete = file.delete();
            MethodCollector.m26664o(10527);
            return delete;
        }

        /* renamed from: a */
        public static void m90017a(String str, List<? extends C46516b> list) {
            File[] listFiles;
            String replace;
            HashMap hashMap = new HashMap();
            for (C46516b bVar : list) {
                StringBuilder append = new StringBuilder().append(bVar.getId()).append("_");
                if (bVar.getVersion() == null) {
                    replace = null;
                } else {
                    replace = bVar.getVersion().replace(".", "_");
                }
                String sb = append.append(replace).toString();
                C89219l.m154716b(sb, "");
                hashMap.put(sb, true);
            }
            File file = new File(C46650j.m90053a(str));
            if (file.exists() && file.isDirectory() && (listFiles = file.listFiles()) != null) {
                if (listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        C89219l.m154716b(file2, "");
                        if (hashMap.get(file2.getName()) == null) {
                            try {
                                C13608a.m24445a(file2.getAbsolutePath());
                                m90018a(new File(file2.getAbsolutePath()));
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo79236a(java.lang.String r6, p4600h.p4603c.AbstractC89124d<? super com.p2082ss.android.ugc.aweme.emoji.emojichoose.model.ResourcesResponse> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46629g.C46630a.C46631a
                if (r0 == 0) goto L_0x001f
                r4 = r7
                com.ss.android.ugc.aweme.emoji.systembigemoji.g$a$a r4 = (com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46629g.C46630a.C46631a) r4
                int r0 = r4.f108736b
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 & r1
                if (r0 == 0) goto L_0x001f
                int r0 = r4.f108736b
                int r0 = r0 - r1
                r4.f108736b = r0
            L_0x0013:
                java.lang.Object r3 = r4.f108735a
                h.c.a.a r2 = p4600h.p4603c.p4604a.EnumC89098a.COROUTINE_SUSPENDED
                int r0 = r4.f108736b
                r1 = 1
                if (r0 == 0) goto L_0x0031
                if (r0 != r1) goto L_0x0029
                goto L_0x0025
            L_0x001f:
                com.ss.android.ugc.aweme.emoji.systembigemoji.g$a$a r4 = new com.ss.android.ugc.aweme.emoji.systembigemoji.g$a$a
                r4.<init>(r5, r7)
                goto L_0x0013
            L_0x0025:
                p4600h.C89382r.m154942a(r3)     // Catch:{ InterruptedException -> 0x0049, ExecutionException -> 0x0044 }
                goto L_0x0043
            L_0x0029:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            L_0x0031:
                p4600h.C89382r.m154942a(r3)
                com.ss.android.ugc.aweme.emoji.utils.EmojiApi r0 = com.p2082ss.android.ugc.aweme.emoji.utils.C46640b.f108757a
                kotlinx.coroutines.av r0 = r0.getResources(r6)
                r4.f108736b = r1
                java.lang.Object r3 = r0.mo144106a(r4)
                if (r3 != r2) goto L_0x0043
                return r2
            L_0x0043:
                return r3
            L_0x0044:
                r0 = move-exception
                r0.printStackTrace()
                goto L_0x004d
            L_0x0049:
                r0 = move-exception
                r0.printStackTrace()
            L_0x004d:
                r0 = 0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46629g.C46630a.mo79236a(java.lang.String, h.c.d):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.g$b */
    public static final class RunnableC46632b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C46629g f108738a;

        /* renamed from: b */
        final /* synthetic */ C46516b f108739b;

        static {
            Covode.recordClassIndex(55223);
        }

        RunnableC46632b(C46629g gVar, C46516b bVar) {
            this.f108738a = gVar;
            this.f108739b = bVar;
        }

        public final void run() {
            this.f108738a.mo79231a(this.f108739b, false);
        }
    }

    /* renamed from: a */
    private static boolean m90009a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private static boolean m90010b() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean a = m90009a();
        C58029j.f132253e = a;
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.g$c */
    public static final class C46633c extends AbsDownloadListener {

        /* renamed from: a */
        final /* synthetic */ C46629g f108740a;

        /* renamed from: b */
        final /* synthetic */ C46516b f108741b;

        /* renamed from: c */
        final /* synthetic */ boolean f108742c = false;

        static {
            Covode.recordClassIndex(55224);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onCanceled(DownloadInfo downloadInfo) {
            C89219l.m154721d(downloadInfo, "");
            C46628f.m90008b(this.f108741b.getResourceUrl());
            C46630a.m90016a(this.f108741b);
            this.f108740a.mo79231a(this.f108741b, false);
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onSuccessed(DownloadInfo downloadInfo) {
            boolean z;
            String[] list;
            C89219l.m154721d(downloadInfo, "");
            this.f108741b.getResourceUrl();
            C46628f.m90008b(this.f108741b.getResourceUrl());
            C46630a.m90016a(this.f108741b);
            C46516b bVar = this.f108741b;
            if (bVar != null) {
                File file = new File(C46650j.m90055b(bVar));
                if (file.exists() && file.isDirectory() && (list = file.list()) != null && list.length != 0) {
                    z = true;
                    this.f108740a.mo79231a(this.f108741b, z);
                    IMService.createIIMServicebyMonsterPlugin(false).getDurationPerfMon().mo92037a(new C46638i(String.valueOf(this.f108741b.getId())), new C46637h(true, this.f108741b.getId()));
                }
            }
            z = false;
            this.f108740a.mo79231a(this.f108741b, z);
            IMService.createIIMServicebyMonsterPlugin(false).getDurationPerfMon().mo92037a(new C46638i(String.valueOf(this.f108741b.getId())), new C46637h(true, this.f108741b.getId()));
        }

        @Override // com.p2082ss.android.socialbase.downloader.depend.IDownloadListener, com.p2082ss.android.socialbase.downloader.depend.AbsDownloadListener
        public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
            C89219l.m154721d(downloadInfo, "");
            C89219l.m154721d(baseException, "");
            baseException.getMessage();
            this.f108741b.getResourceUrl();
            C46628f.m90008b(this.f108741b.getResourceUrl());
            if (this.f108742c) {
                this.f108740a.mo79235b(this.f108741b);
            } else {
                C46630a.m90016a(this.f108741b);
                this.f108740a.mo79231a(this.f108741b, false);
            }
            IMService.createIIMServicebyMonsterPlugin(false).getDurationPerfMon().mo92037a(new C46638i(String.valueOf(this.f108741b.getId())), new C46637h(false, this.f108741b.getId()));
        }

        C46633c(C46629g gVar, C46516b bVar, boolean z) {
            this.f108740a = gVar;
            this.f108741b = bVar;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.g$e */
    public static final class C46636e extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f108750a;

        /* renamed from: b */
        final /* synthetic */ C46629g f108751b;

        /* renamed from: c */
        final /* synthetic */ boolean f108752c;

        /* renamed from: d */
        final /* synthetic */ C46516b f108753d;

        static {
            Covode.recordClassIndex(55227);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46636e(C46629g gVar, boolean z, C46516b bVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f108751b = gVar;
            this.f108752c = z;
            this.f108753d = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C46636e(this.f108751b, this.f108752c, this.f108753d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C46636e) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f108750a == 0) {
                C89382r.m154942a(obj);
                this.f108751b.mo79234a(this.f108752c, this.f108753d);
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.emoji.systembigemoji.g$d */
    public static final class C46634d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f108743a;

        /* renamed from: b */
        final /* synthetic */ C46629g f108744b;

        /* renamed from: c */
        final /* synthetic */ String f108745c;

        /* renamed from: d */
        final /* synthetic */ boolean f108746d;

        static {
            Covode.recordClassIndex(55225);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C46634d(C46629g gVar, String str, boolean z, AbstractC89124d dVar) {
            super(2, dVar);
            this.f108744b = gVar;
            this.f108745c = str;
            this.f108746d = z;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C46634d(this.f108744b, this.f108745c, this.f108746d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C46634d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f108743a;
            if (i == 0) {
                C89382r.m154942a(obj);
                C46630a aVar2 = C46629g.f108731e;
                String str = this.f108745c;
                this.f108743a = 1;
                obj = aVar2.mo79236a(str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else if (i == 2) {
                try {
                    C89382r.m154942a(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                    C56244a.m102188a(e);
                }
                return C89391z.f203057a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResourcesResponse resourcesResponse = (ResourcesResponse) obj;
            final C89233z.C89238e eVar = new C89233z.C89238e();
            eVar.element = resourcesResponse != null ? (T) resourcesResponse.getResources() : null;
            if (resourcesResponse == null || resourcesResponse.status_code != 0) {
                T t = (T) C46644f.m90040a("im_resources_".concat(String.valueOf(this.f108745c)), C46516b.class);
                if (t == null) {
                    t = (T) new ArrayList();
                }
                eVar.element = t;
            } else {
                T t2 = eVar.element;
                if (t2 == null) {
                    t2 = (T) new ArrayList();
                }
                eVar.element = t2;
                for (C46516b bVar : eVar.element) {
                    C89219l.m154716b(bVar, "");
                    bVar.setType(this.f108745c);
                }
                C46644f.m90042a("im_resources_".concat(String.valueOf(this.f108745c)), (List) eVar.element);
                if (eVar.element.size() > 0) {
                    C46630a.m90017a(this.f108745c, (List<? extends C46516b>) eVar.element);
                }
            }
            AbstractC89587ci ciVar = C89652o.f203399a;
            C466351 r0 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                /* class com.p2082ss.android.ugc.aweme.emoji.systembigemoji.C46629g.C46634d.C466351 */

                /* renamed from: a */
                int f108747a;

                /* renamed from: b */
                final /* synthetic */ C46634d f108748b;

                static {
                    Covode.recordClassIndex(55226);
                }

                {
                    this.f108748b = r2;
                }

                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                    C89219l.m154721d(dVar, "");
                    return 

                    /* renamed from: b */
                    public final boolean mo79235b(C46516b bVar) {
                        C89219l.m154721d(bVar, "");
                        C17867d.m33078a();
                        if (!m90010b()) {
                            C29339a.m58752a(new RunnableC46632b(this, bVar));
                            return false;
                        } else if (C46628f.m90006a(bVar.getResourceUrl()) != null) {
                            return false;
                        } else {
                            File file = new File(C46650j.m90052a(bVar));
                            if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
                                return false;
                            }
                            IMService.createIIMServicebyMonsterPlugin(false).getDurationPerfMon().mo92038a((AbstractC56226b) new C46638i(String.valueOf(bVar.getId())), true);
                            C46628f.m90007a(bVar.getResourceUrl(), bVar);
                            C46633c cVar = new C46633c(this, bVar, false);
                            AbstractC43167a with = DownloadServiceManager.INSTANCE.getDownloadService().with(bVar.getResourceUrl());
                            with.f100629f = C46650j.m90053a(bVar.getType());
                            with.f100626c = C46650j.m90051a(bVar.getId(), bVar.getVersion()) + ".zip";
                            with.f100601D = cVar;
                            with.mo73400a("emoji_resources_manager").mo73405b(C46650j.m90054a(bVar.getType(), bVar.getId(), bVar.getVersion())).mo73397a(EnumC43176c.ZIP);
                            return true;
                        }
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo79231a(C46516b bVar, boolean z) {
                        C89219l.m154721d(bVar, "");
                        AbstractC89568bz unused = C89624i.m155555a(this.f108733c, C33429a.f79465a, null, new C46636e(this, z, bVar, null), 2);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.emoji.systembigemoji.AbstractC46627e
                    /* renamed from: a */
                    public final void mo79233a(String str, List<? extends C46516b> list) {
                        C89219l.m154721d(str, "");
                        C89219l.m154721d(list, "");
                        for (AbstractC46627e eVar : this.f108732a) {
                            eVar.mo79233a(str, (List<C46516b>) list);
                        }
                    }

                    @Override // com.p2082ss.android.ugc.aweme.emoji.systembigemoji.AbstractC46627e
                    /* renamed from: a */
                    public final void mo79234a(boolean z, C46516b bVar) {
                        C89219l.m154721d(bVar, "");
                        for (AbstractC46627e eVar : this.f108732a) {
                            eVar.mo79234a(z, bVar);
                        }
                    }

                    /* access modifiers changed from: protected */
                    /* renamed from: a */
                    public void mo79232a(String str, List<? extends C46516b> list, boolean z) {
                        C89219l.m154721d(str, "");
                        C89219l.m154721d(list, "");
                        mo79233a(str, list);
                        this.f108734d = list.isEmpty();
                    }
                }
