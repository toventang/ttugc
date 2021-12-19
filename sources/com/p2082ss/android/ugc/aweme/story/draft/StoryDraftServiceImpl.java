package com.p2082ss.android.ugc.aweme.story.draft;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.C81908b;
import com.p2082ss.android.ugc.asve.editor.C31068c;
import com.p2082ss.android.ugc.aweme.draft.C43212j;
import com.p2082ss.android.ugc.aweme.draft.model.C43223c;
import com.p2082ss.android.ugc.aweme.draft.model.C43225d;
import com.p2082ss.android.ugc.aweme.draft.model.C43234h;
import com.p2082ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.p2082ss.android.ugc.aweme.draft.model.DraftLoadResult;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.story.IStoryDraftService;
import com.p2082ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.C69744c;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70974bn;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72477c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3850p.C72479d;
import com.p2082ss.android.ugc.aweme.story.base.p4020a.C76607a;
import com.p2082ss.android.ugc.aweme.story.base.p4021b.C76615b;
import com.p2082ss.android.ugc.aweme.story.edit.C76740a;
import com.p2082ss.android.ugc.aweme.story.publish.C77422c;
import com.p2082ss.android.ugc.aweme.story.publish.p4060a.C77390a;
import com.p2082ss.android.ugc.aweme.story.publish.p4060a.C77409c;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89517an;
import kotlinx.coroutines.C89546bf;
import kotlinx.coroutines.C89624i;
import kotlinx.coroutines.android.AbstractC89522b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89382r;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4601a.C89086z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl */
public final class StoryDraftServiceImpl implements IStoryDraftService {

    /* renamed from: d */
    public static final C76707a f172187d = new C76707a((byte) 0);

    /* renamed from: a */
    public final AbstractC89172b<C43223c, Boolean> f172188a = C76712e.f172200a;

    /* renamed from: b */
    public final AbstractC89172b<C43223c, Boolean> f172189b = C76711d.f172199a;

    /* renamed from: c */
    public final AbstractC89172b<C43223c, Boolean> f172190c = new C76710c(this);

    /* renamed from: e */
    private final AbstractC89244h f172191e = C89250i.m154773a((AbstractC89171a) C76718h.f172220a);

    static {
        Covode.recordClassIndex(89702);
    }

    /* renamed from: b */
    private final boolean m134290b() {
        return ((Boolean) this.f172191e.getValue()).booleanValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl$a */
    public static final class C76707a {
        static {
            Covode.recordClassIndex(89703);
        }

        private C76707a() {
        }

        public /* synthetic */ C76707a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryDraftService
    public final List<C43223c> queryDraftList() {
        if (!m134290b()) {
            return C89086z.INSTANCE;
        }
        return C76726b.m134305a(this.f172190c);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl$h */
    static final class C76718h extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C76718h f172220a = new C76718h();

        static {
            Covode.recordClassIndex(89714);
        }

        C76718h() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z = false;
            if (C76607a.m134194a()) {
                IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
                C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
                if (!createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: a */
    public static IStoryDraftService m134289a() {
        MethodCollector.m26663i(6741);
        Object a = C81908b.m141854a(IStoryDraftService.class, false);
        if (a != null) {
            IStoryDraftService iStoryDraftService = (IStoryDraftService) a;
            MethodCollector.m26664o(6741);
            return iStoryDraftService;
        }
        if (C81908b.f183382el == null) {
            synchronized (IStoryDraftService.class) {
                try {
                    if (C81908b.f183382el == null) {
                        C81908b.f183382el = new StoryDraftServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(6741);
                    throw th;
                }
            }
        }
        StoryDraftServiceImpl storyDraftServiceImpl = (StoryDraftServiceImpl) C81908b.f183382el;
        MethodCollector.m26664o(6741);
        return storyDraftServiceImpl;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl$e */
    static final class C76712e extends AbstractC89220m implements AbstractC89172b<C43223c, Boolean> {

        /* renamed from: a */
        public static final C76712e f172200a = new C76712e();

        static {
            Covode.recordClassIndex(89708);
        }

        C76712e() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(C43223c cVar) {
            boolean z;
            C43223c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            if (System.currentTimeMillis() - cVar2.f100887J <= 86400000) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryDraftService
    public final String getDraftDirPath(C43223c cVar) {
        C89219l.m154721d(cVar, "");
        String str = cVar.f100900W.f100824bD;
        if (str != null) {
            return C76615b.m134199a(str, null);
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl$g */
    public static final class C76715g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f172207a;

        /* renamed from: b */
        Object f172208b;

        /* renamed from: c */
        int f172209c;

        /* renamed from: d */
        final /* synthetic */ StoryDraftServiceImpl f172210d;

        /* renamed from: e */
        final /* synthetic */ AbstractC89172b f172211e;

        static {
            Covode.recordClassIndex(89711);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76715g(StoryDraftServiceImpl storyDraftServiceImpl, AbstractC89172b bVar, AbstractC89124d dVar) {
            super(2, dVar);
            this.f172210d = storyDraftServiceImpl;
            this.f172211e = bVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C76715g(this.f172210d, this.f172211e, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C76715g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl$g$a */
        public static final class C76717a extends AbstractC89220m implements AbstractC89172b<C43223c, Boolean> {

            /* renamed from: a */
            final /* synthetic */ C76715g f172218a;

            /* renamed from: b */
            final /* synthetic */ List f172219b;

            static {
                Covode.recordClassIndex(89713);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C76717a(C76715g gVar, List list) {
                super(1);
                this.f172218a = gVar;
                this.f172219b = list;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ Boolean invoke(C43223c cVar) {
                C89219l.m154721d(cVar, "");
                boolean booleanValue = this.f172218a.f172210d.f172190c.invoke(cVar).booleanValue();
                if (!booleanValue) {
                    this.f172219b.add(cVar);
                }
                return Boolean.valueOf(booleanValue);
            }
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            final List<C43223c> arrayList;
            final List list;
            String str;
            C89378p a;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f172209c;
            if (i == 0) {
                C89382r.m154942a(obj);
                final C89233z.C89236c cVar = new C89233z.C89236c();
                cVar.element = 0;
                Collection<C77409c> values = C77390a.f173641d.values();
                C89219l.m154716b(values, "");
                List<C77409c> j = C89070n.m154590j(values);
                ArrayList arrayList2 = new ArrayList();
                for (C77409c cVar2 : j) {
                    BaseShortVideoContext baseShortVideoContext = cVar2.mo121043a().f162938k;
                    if (!(baseShortVideoContext instanceof VideoPublishEditModel)) {
                        baseShortVideoContext = null;
                    }
                    VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) baseShortVideoContext;
                    if (!(videoPublishEditModel == null || (str = videoPublishEditModel.sessionId) == null || (a = C89387v.m154943a(str, cVar2)) == null)) {
                        arrayList2.add(a);
                    }
                }
                final Map a2 = C89041ag.m154417a(arrayList2);
                arrayList = new ArrayList();
                List<C43223c> a3 = C76726b.m134305a(new C76717a(this, arrayList));
                cVar.element = a3.size();
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) a3, 10));
                for (T t : a3) {
                    new C70974bn("StoryDraftServiceImpl");
                    VideoPublishEditModel a4 = C70974bn.m125289a((C43223c) t);
                    Workspace a5 = C69744c.m123268a(null, null, a4.mMusicPath, a4.reverseVideoPath());
                    a4.mIsFromDraft = true;
                    a4.isStoryEditMode = true;
                    File h = a5.mo110099h();
                    C89219l.m154716b(h, "");
                    a4.mOutputFile = h.getPath();
                    File i2 = a5.mo110100i();
                    C89219l.m154716b(i2, "");
                    a4.mEncodedAudioOutputFile = i2.getPath();
                    File j2 = a5.mo110101j();
                    C89219l.m154716b(j2, "");
                    a4.mParallelUploadOutputFile = j2.getPath();
                    arrayList3.add(C89387v.m154943a(t, a4));
                }
                ArrayList<C89378p> arrayList4 = arrayList3;
                ArrayList arrayList5 = new ArrayList(C89070n.m154526a((Iterable) arrayList4, 10));
                for (C89378p pVar : arrayList4) {
                    VideoPublishEditModel videoPublishEditModel2 = (VideoPublishEditModel) pVar.component2();
                    C89219l.m154716b(videoPublishEditModel2, "");
                    Bundle a6 = C76740a.m134318a(videoPublishEditModel2);
                    a6.putString("publish_last_output_file_cache", ((C43223c) pVar.component1()).f100900W.f100826bF);
                    arrayList5.add(C89387v.m154943a(videoPublishEditModel2.sessionId, a6));
                }
                ArrayList<C89378p> arrayList6 = arrayList5;
                List arrayList7 = new ArrayList(C89070n.m154526a((Iterable) arrayList6, 10));
                for (C89378p pVar2 : arrayList6) {
                    Object component1 = pVar2.component1();
                    Bundle bundle = (Bundle) pVar2.component2();
                    C77409c cVar3 = (C77409c) a2.get(component1);
                    if (cVar3 == null) {
                        cVar3 = C77390a.m135323a(bundle);
                        C77390a.m135325a(new C77422c(bundle), cVar3.f173687d, true);
                        C72479d.m127866a(C72477c.f162474a).mo114737a(1);
                    }
                    arrayList7.add(new ScheduleInfo(cVar3.f173687d, bundle));
                }
                list = arrayList7;
                AbstractC89522b bVar = C31068c.f74429a;
                C767161 r8 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                    /* class com.p2082ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl.C76715g.C767161 */

                    /* renamed from: a */
                    int f172212a;

                    /* renamed from: b */
                    final /* synthetic */ C76715g f172213b;

                    static {
                        Covode.recordClassIndex(89712);
                    }

                    {
                        this.f172213b = r2;
                    }

                    @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                    public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                        C89219l.m154721d(dVar, "");
                        return 

                        /* access modifiers changed from: package-private */
                        /* renamed from: com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl$b */
                        public static final class C76708b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                            /* renamed from: a */
                            int f172192a;

                            /* renamed from: b */
                            final /* synthetic */ StoryDraftServiceImpl f172193b;

                            /* renamed from: c */
                            final /* synthetic */ AbstractC89172b f172194c;

                            static {
                                Covode.recordClassIndex(89704);
                            }

                            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                            C76708b(StoryDraftServiceImpl storyDraftServiceImpl, AbstractC89172b bVar, AbstractC89124d dVar) {
                                super(2, dVar);
                                this.f172193b = storyDraftServiceImpl;
                                this.f172194c = bVar;
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                C89219l.m154721d(dVar, "");
                                return new C76708b(this.f172193b, this.f172194c, dVar);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                            @Override // p4600h.p4611f.p4612a.AbstractC89183m
                            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                return ((C76708b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                            }

                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                            public final Object invokeSuspend(Object obj) {
                                final boolean z;
                                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                int i = this.f172192a;
                                if (i == 0) {
                                    C89382r.m154942a(obj);
                                    List<C43223c> queryDraftList = this.f172193b.queryDraftList();
                                    if (queryDraftList == null || queryDraftList.isEmpty()) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    AbstractC89522b bVar = C31068c.f74429a;
                                    C767091 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                        /* class com.p2082ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl.C76708b.C767091 */

                                        /* renamed from: a */
                                        int f172195a;

                                        /* renamed from: b */
                                        final /* synthetic */ C76708b f172196b;

                                        static {
                                            Covode.recordClassIndex(89705);
                                        }

                                        {
                                            this.f172196b = r2;
                                        }

                                        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                            C89219l.m154721d(dVar, "");
                                            return 

                                            /* renamed from: com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl$c */
                                            static final class C76710c extends AbstractC89220m implements AbstractC89172b<C43223c, Boolean> {

                                                /* renamed from: a */
                                                final /* synthetic */ StoryDraftServiceImpl f172198a;

                                                static {
                                                    Covode.recordClassIndex(89706);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C76710c(StoryDraftServiceImpl storyDraftServiceImpl) {
                                                    super(1);
                                                    this.f172198a = storyDraftServiceImpl;
                                                }

                                                /* Return type fixed from 'java.lang.Object' to match base method */
                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                public final /* synthetic */ Boolean invoke(C43223c cVar) {
                                                    boolean z;
                                                    C89219l.m154721d(cVar, "");
                                                    if (!this.f172198a.f172188a.invoke(cVar).booleanValue() || !this.f172198a.f172189b.invoke(cVar).booleanValue()) {
                                                        z = false;
                                                    } else {
                                                        z = true;
                                                    }
                                                    return Boolean.valueOf(z);
                                                }
                                            }

                                            /* access modifiers changed from: package-private */
                                            /* renamed from: com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl$f */
                                            public static final class C76713f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

                                                /* renamed from: a */
                                                int f172201a;

                                                /* renamed from: b */
                                                final /* synthetic */ StoryDraftServiceImpl f172202b;

                                                /* renamed from: c */
                                                final /* synthetic */ AbstractC89172b f172203c;

                                                static {
                                                    Covode.recordClassIndex(89709);
                                                }

                                                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                                                C76713f(StoryDraftServiceImpl storyDraftServiceImpl, AbstractC89172b bVar, AbstractC89124d dVar) {
                                                    super(2, dVar);
                                                    this.f172202b = storyDraftServiceImpl;
                                                    this.f172203c = bVar;
                                                }

                                                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                    C89219l.m154721d(dVar, "");
                                                    return new C76713f(this.f172202b, this.f172203c, dVar);
                                                }

                                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                                                @Override // p4600h.p4611f.p4612a.AbstractC89183m
                                                public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
                                                    return ((C76713f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
                                                }

                                                @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                public final Object invokeSuspend(Object obj) {
                                                    EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                                                    int i = this.f172201a;
                                                    if (i == 0) {
                                                        C89382r.m154942a(obj);
                                                        final List<C43223c> queryDraftList = this.f172202b.queryDraftList();
                                                        AbstractC89522b bVar = C31068c.f74429a;
                                                        C767141 r1 = new AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object>(this, null) {
                                                            /* class com.p2082ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl.C76713f.C767141 */

                                                            /* renamed from: a */
                                                            int f172204a;

                                                            /* renamed from: b */
                                                            final /* synthetic */ C76713f f172205b;

                                                            static {
                                                                Covode.recordClassIndex(89710);
                                                            }

                                                            {
                                                                this.f172205b = r2;
                                                            }

                                                            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
                                                            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                                                                C89219l.m154721d(dVar, "");
                                                                return 

                                                                @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryDraftService
                                                                public final void checkIfStoryDraftExisted(AbstractC89172b<? super Boolean, C89391z> bVar) {
                                                                    C89219l.m154721d(bVar, "");
                                                                    C84911q.m145921a("StoryDraftServiceImpl:checkIfStoryDraftExisted");
                                                                    if (!m134290b()) {
                                                                        bVar.invoke(false);
                                                                    } else {
                                                                        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C76708b(this, bVar, null), 3);
                                                                    }
                                                                }

                                                                @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryDraftService
                                                                public final void queryDraftList(AbstractC89172b<? super List<? extends C43223c>, C89391z> bVar) {
                                                                    C89219l.m154721d(bVar, "");
                                                                    if (!m134290b()) {
                                                                        bVar.invoke(C89086z.INSTANCE);
                                                                    } else {
                                                                        AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C76713f(this, bVar, null), 3);
                                                                    }
                                                                }

                                                                @Override // com.p2082ss.android.ugc.aweme.services.story.IStoryDraftService
                                                                public final void restoreScheduleInfoFromDraft(AbstractC89172b<? super List<ScheduleInfo>, C89391z> bVar) {
                                                                    C89219l.m154721d(bVar, "");
                                                                    C84911q.m145921a("StoryDraftServiceImpl:restoreScheduleInfoFromDraft");
                                                                    if (!m134290b()) {
                                                                        C84911q.m145921a("StoryDraftServiceImpl:draft disable,directly return");
                                                                        bVar.invoke(C89086z.INSTANCE);
                                                                        return;
                                                                    }
                                                                    AbstractC89568bz unused = C89624i.m155555a(C89517an.m155448a(C89546bf.f203267b), null, null, new C76715g(this, bVar, null), 3);
                                                                }

                                                                /* renamed from: com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl$d */
                                                                static final class C76711d extends AbstractC89220m implements AbstractC89172b<C43223c, Boolean> {

                                                                    /* renamed from: a */
                                                                    public static final C76711d f172199a = new C76711d();

                                                                    static {
                                                                        Covode.recordClassIndex(89707);
                                                                    }

                                                                    C76711d() {
                                                                        super(1);
                                                                    }

                                                                    /* Return type fixed from 'java.lang.Object' to match base method */
                                                                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                                                    @Override // p4600h.p4611f.p4612a.AbstractC89172b
                                                                    public final /* synthetic */ Boolean invoke(C43223c cVar) {
                                                                        EditPreviewInfo h;
                                                                        List<EditVideoSegment> videoList;
                                                                        C43223c cVar2 = cVar;
                                                                        C89219l.m154721d(cVar2, "");
                                                                        String str = cVar2.f100900W.f100824bD;
                                                                        boolean z = true;
                                                                        z = true;
                                                                        if (str == null || str.length() == 0 || !C84902i.m145892a(C76615b.m134199a(cVar2.f100900W.f100824bD, null)) || (h = C43225d.m86338h(cVar2)) == null || (videoList = h.getVideoList()) == null) {
                                                                            z = false;
                                                                        } else if (!(videoList instanceof Collection) || !videoList.isEmpty()) {
                                                                            Iterator<T> it = videoList.iterator();
                                                                            while (true) {
                                                                                if (it.hasNext()) {
                                                                                    if (!C84902i.m145892a(it.next().getVideoPath())) {
                                                                                        break;
                                                                                    }
                                                                                } else {
                                                                                    break;
                                                                                }
                                                                            }
                                                                        }
                                                                        String f = cVar2.mo73676f();
                                                                        C89219l.m154716b(f, "");
                                                                        int a = C43234h.m86346a(cVar2);
                                                                        String a2 = C43212j.m86179a(cVar2.f100886I);
                                                                        long j = cVar2.f100900W.f100846bs;
                                                                        int i = z ? 1 : 0;
                                                                        int i2 = z ? 1 : 0;
                                                                        int i3 = z ? 1 : 0;
                                                                        int i4 = z ? 1 : 0;
                                                                        C63244g.m114602a().mo73275c().mo101843a().mo101859a(new DraftLoadResult(f, a, a2, j, new DraftCheckResult(i, null, null, 0, 14, null), cVar2.f100900W.f100827bG));
                                                                        return Boolean.valueOf(z);
                                                                    }
                                                                }
                                                            }
