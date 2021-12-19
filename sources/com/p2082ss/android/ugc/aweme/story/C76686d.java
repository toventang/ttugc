package com.p2082ss.android.ugc.aweme.story;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.asve.editor.C31068c;
import com.p2082ss.android.ugc.aweme.canvas.C35377f;
import com.p2082ss.android.ugc.aweme.canvas.C35379g;
import com.p2082ss.android.ugc.aweme.canvas.C35387i;
import com.p2082ss.android.ugc.aweme.canvas.C35413x;
import com.p2082ss.android.ugc.aweme.canvas.C35415y;
import com.p2082ss.android.ugc.aweme.canvas.C35416z;
import com.p2082ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.p2082ss.android.ugc.aweme.filter.p2984d.AbstractC50651a;
import com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.p2082ss.android.ugc.aweme.p2309ak.AbstractC33484c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.scheduler.C67294f;
import com.p2082ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.p2082ss.android.ugc.aweme.services.story.event.StoryPublishEvent;
import com.p2082ss.android.ugc.aweme.shortvideo.C69886bj;
import com.p2082ss.android.ugc.aweme.shortvideo.C70640dl;
import com.p2082ss.android.ugc.aweme.shortvideo.C70649ds;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.C70503u;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.C70528i;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71419h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.eventtrack.C71824e;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73954al;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.story.base.C76627e;
import com.p2082ss.android.ugc.aweme.story.base.model.EditContext;
import com.p2082ss.android.ugc.aweme.story.base.p4021b.C76615b;
import com.p2082ss.android.ugc.aweme.story.draft.C76726b;
import com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.AbstractC77267a;
import com.p2082ss.android.ugc.aweme.story.publish.foreground.C77443a;
import com.p2082ss.android.ugc.aweme.story.publish.p4060a.C77390a;
import com.p2082ss.android.ugc.aweme.story.publish.p4060a.C77409c;
import com.p2082ss.android.ugc.aweme.utils.C80244bh;
import com.p2082ss.android.ugc.tools.utils.C84902i;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.tools.view.p4366e.ProgressDialogC84958b;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.C89378p;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89386u;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4601a.C89070n;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.C89134h;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89110d;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4603c.p4605b.p4606a.C89108b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.story.d */
public final class C76686d implements AbstractC77267a {

    /* renamed from: b */
    public static final C76687a f172102b = new C76687a((byte) 0);

    /* renamed from: a */
    ProgressDialogC84958b f172103a;

    /* renamed from: c */
    private Activity f172104c;

    /* renamed from: d */
    private AbstractC89568bz f172105d;

    /* renamed from: e */
    private boolean f172106e;

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.d$b */
    public static final class C76688b extends AbstractC89110d {

        /* renamed from: a */
        /* synthetic */ Object f172107a;

        /* renamed from: b */
        int f172108b;

        /* renamed from: c */
        final /* synthetic */ C76686d f172109c;

        /* renamed from: d */
        Object f172110d;

        /* renamed from: e */
        Object f172111e;

        /* renamed from: f */
        Object f172112f;

        /* renamed from: g */
        Object f172113g;

        /* renamed from: h */
        Object f172114h;

        /* renamed from: i */
        Object f172115i;

        /* renamed from: j */
        long f172116j;

        static {
            Covode.recordClassIndex(89683);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76688b(C76686d dVar, AbstractC89124d dVar2) {
            super(dVar2);
            this.f172109c = dVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            this.f172107a = obj;
            this.f172108b |= Integer.MIN_VALUE;
            return this.f172109c.mo120435a((String) null, (List<? extends MediaModel>) null, this);
        }
    }

    static {
        Covode.recordClassIndex(89681);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.d$a */
    public static final class C76687a {
        static {
            Covode.recordClassIndex(89682);
        }

        private C76687a() {
        }

        public /* synthetic */ C76687a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.AbstractC77267a
    /* renamed from: b */
    public final boolean mo120441b() {
        return this.f172106e;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.AbstractC77267a
    /* renamed from: c */
    public final AbstractC76429a mo120442c() {
        return C76726b.f172228a;
    }

    /* renamed from: d */
    public final void mo120443d() {
        String str;
        Activity activity = this.f172104c;
        if (activity != null && !activity.isFinishing()) {
            ProgressDialogC84958b bVar = this.f172103a;
            if (bVar == null || !bVar.isShowing()) {
                Activity activity2 = this.f172104c;
                if (activity2 != null) {
                    str = activity2.getString(R.string.g1j);
                } else {
                    str = null;
                }
                ProgressDialogC84958b b = ProgressDialogC84958b.m146021b(activity2, str);
                this.f172103a = b;
                if (b != null) {
                    b.setIndeterminate(true);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.AbstractC77267a
    /* renamed from: a */
    public final void mo120437a() {
        MethodCollector.m26663i(6589);
        C76627e.f171965b.mo120334a().mo86006d().mo86067b();
        C76627e.f171965b.mo120334a().mo86004b().mo86017c();
        synchronized (C76627e.f171965b) {
            try {
                AbstractC50651a aVar = C76627e.f171964a;
                if (aVar != null) {
                    aVar.mo86009g();
                }
                C76627e.f171964a = null;
            } finally {
                MethodCollector.m26664o(6589);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.AbstractC77267a
    /* renamed from: a */
    public final void mo120440a(boolean z) {
        this.f172106e = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.d$h */
    public static final class C76700h extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super Map<String, ? extends CanvasVideoData>>, Object> {

        /* renamed from: a */
        Object f172175a;

        /* renamed from: b */
        int f172176b;

        /* renamed from: c */
        final /* synthetic */ C76686d f172177c;

        /* renamed from: d */
        final /* synthetic */ List f172178d;

        /* renamed from: e */
        final /* synthetic */ String f172179e;

        static {
            Covode.recordClassIndex(89695);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76700h(C76686d dVar, List list, String str, AbstractC89124d dVar2) {
            super(2, dVar2);
            this.f172177c = dVar;
            this.f172178d = list;
            this.f172179e = str;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C76700h(this.f172177c, this.f172178d, this.f172179e, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super Map<String, ? extends CanvasVideoData>> dVar) {
            return ((C76700h) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.story.d$h$a */
        public static final class C76701a<T, R> implements AbstractC88434g {

            /* renamed from: a */
            public static final C76701a f172180a = new C76701a();

            static {
                Covode.recordClassIndex(89696);
            }

            C76701a() {
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                C89219l.m154721d(obj, "");
                return obj;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.story.d$h$d */
        public static final class C76704d<T, R> implements AbstractC88434g {

            /* renamed from: a */
            final /* synthetic */ MediaModel f172184a;

            static {
                Covode.recordClassIndex(89699);
            }

            C76704d(MediaModel mediaModel) {
                this.f172184a = mediaModel;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88434g
            public final /* synthetic */ Object apply(Object obj) {
                C89219l.m154721d(obj, "");
                return new C89378p(this.f172184a, obj);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.story.d$h$c */
        public static final class C76703c<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ AbstractC89124d f172183a;

            static {
                Covode.recordClassIndex(89698);
            }

            C76703c(AbstractC89124d dVar) {
                this.f172183a = dVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                C73991bj.m130131b("prepare photo canvas failed " + C89391z.f203057a);
                this.f172183a.resumeWith(C89379q.m157068constructorimpl(C89041ag.m154415a()));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.story.d$h$b */
        public static final class C76702b<T> implements AbstractC88433f {

            /* renamed from: a */
            final /* synthetic */ C35387i f172181a;

            /* renamed from: b */
            final /* synthetic */ AbstractC89124d f172182b;

            static {
                Covode.recordClassIndex(89697);
            }

            C76702b(C35387i iVar, AbstractC89124d dVar) {
                this.f172181a = iVar;
                this.f172182b = dVar;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                Object[] objArr = (Object[]) obj;
                this.f172181a.mo62288a();
                AbstractC89124d dVar = this.f172182b;
                C89219l.m154716b(objArr, "");
                LinkedHashMap linkedHashMap = new LinkedHashMap(C89271h.m154769b(C89041ag.m154411a(objArr.length), 16));
                for (Object obj2 : objArr) {
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Pair<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, com.ss.android.ugc.aweme.canvas.PhotoPrepareInfo>");
                    C89378p pVar = (C89378p) obj2;
                    String str = ((MediaModel) pVar.getFirst()).f134662b;
                    C89219l.m154716b(str, "");
                    Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Pair<com.ss.android.ugc.aweme.mediachoose.helper.MediaModel, com.ss.android.ugc.aweme.canvas.PhotoPrepareInfo>");
                    linkedHashMap.put(str, C35379g.m72408a((C35413x) pVar.getSecond(), null));
                }
                dVar.resumeWith(C89379q.m157068constructorimpl(linkedHashMap));
            }
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            C89378p a;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f172176b;
            if (i == 0) {
                C89382r.m154942a(obj);
                this.f172175a = this;
                this.f172176b = 1;
                C89134h hVar = new C89134h(C89099b.m154605a(this));
                if (C35416z.f83574a) {
                    a = C89387v.m154943a(C89108b.m154610a(C70640dl.f158120a), C89108b.m154610a(C70640dl.f158121b));
                } else {
                    a = C89387v.m154943a(C89108b.m154610a(C70640dl.f158122c), C89108b.m154610a(C70640dl.f158123d));
                }
                int intValue = ((Number) a.component1()).intValue();
                int intValue2 = ((Number) a.component2()).intValue();
                List list = this.f172178d;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!((MediaModel) obj2).mo96674b()) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList<MediaModel> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList2, 10));
                for (MediaModel mediaModel : arrayList2) {
                    String str = mediaModel.f134662b;
                    C35377f fVar = new C35377f(new C35415y(), true);
                    C89219l.m154716b(str, "");
                    arrayList3.add(fVar.mo62282a(str, intValue, intValue2, false, C76615b.m134199a(this.f172179e, "canvas")).mo143292d(new C76704d(mediaModel)));
                }
                ArrayList arrayList4 = arrayList3;
                if (arrayList4.isEmpty()) {
                    hVar.resumeWith(C89379q.m157068constructorimpl(C89041ag.m154415a()));
                } else {
                    this.f172177c.mo120443d();
                    C35387i iVar = new C35387i(true, arrayList4.size());
                    iVar.f83483a = System.currentTimeMillis();
                    AbstractC88979t.m154301a(arrayList4, C76701a.f172180a).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C76702b(iVar, hVar), new C76703c(hVar));
                }
                obj = hVar.mo143576a();
                if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                    C89219l.m154721d(this, "");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.d$e */
    public static final class C76692e extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super List<? extends C89386u<? extends MediaModel, ? extends String, ? extends EditPreviewInfo>>>, Object> {

        /* renamed from: a */
        Object f172125a;

        /* renamed from: b */
        Object f172126b;

        /* renamed from: c */
        Object f172127c;

        /* renamed from: d */
        Object f172128d;

        /* renamed from: e */
        Object f172129e;

        /* renamed from: f */
        Object f172130f;

        /* renamed from: g */
        Object f172131g;

        /* renamed from: h */
        Object f172132h;

        /* renamed from: i */
        int f172133i;

        /* renamed from: j */
        final /* synthetic */ C76686d f172134j;

        /* renamed from: k */
        final /* synthetic */ List f172135k;

        /* renamed from: l */
        final /* synthetic */ ShortVideoContext f172136l;

        /* renamed from: m */
        private /* synthetic */ Object f172137m;

        static {
            Covode.recordClassIndex(89687);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76692e(C76686d dVar, List list, ShortVideoContext shortVideoContext, AbstractC89124d dVar2) {
            super(2, dVar2);
            this.f172134j = dVar;
            this.f172135k = list;
            this.f172136l = shortVideoContext;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C76692e eVar = new C76692e(this.f172134j, this.f172135k, this.f172136l, dVar);
            eVar.f172137m = obj;
            return eVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super List<? extends C89386u<? extends MediaModel, ? extends String, ? extends EditPreviewInfo>>> dVar) {
            return ((C76692e) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.story.d$e$a */
        public static final class C76693a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super VideoFileInfo>, Object> {

            /* renamed from: a */
            int f172138a;

            /* renamed from: b */
            final /* synthetic */ MediaModel f172139b;

            /* renamed from: c */
            final /* synthetic */ C76692e f172140c;

            /* renamed from: d */
            final /* synthetic */ AbstractC89516am f172141d;

            static {
                Covode.recordClassIndex(89688);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C76693a(MediaModel mediaModel, AbstractC89124d dVar, C76692e eVar, AbstractC89516am amVar) {
                super(2, dVar);
                this.f172139b = mediaModel;
                this.f172140c = eVar;
                this.f172141d = amVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C76693a(this.f172139b, dVar, this.f172140c, this.f172141d);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super VideoFileInfo> dVar) {
                return ((C76693a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                if (this.f172138a == 0) {
                    C89382r.m154942a(obj);
                    String str = this.f172139b.f134662b;
                    C89219l.m154716b(str, "");
                    return C76686d.m134257a(str, this.f172139b);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0076  */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r31) {
            /*
            // Method dump skipped, instructions count: 410
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.C76686d.C76692e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.d$c */
    public static final class C76689c extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f172117a;

        /* renamed from: b */
        final /* synthetic */ C76686d f172118b;

        static {
            Covode.recordClassIndex(89684);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76689c(C76686d dVar, AbstractC89124d dVar2) {
            super(2, dVar2);
            this.f172118b = dVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C76689c(this.f172118b, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C76689c) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            if (this.f172117a == 0) {
                C89382r.m154942a(obj);
                this.f172118b.mo120443d();
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: a */
    public static C71419h m134258a(String str) {
        return new C71419h(C63244g.m114602a().mo73281i().getVideoWidth(), C63244g.m114602a().mo73281i().getVideoHeight(), str, 12);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.d$f */
    public static final class C76694f extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super ArrayList<C89386u<? extends MediaModel, ? extends String, ? extends EditPreviewInfo>>>, Object> {

        /* renamed from: a */
        Object f172142a;

        /* renamed from: b */
        Object f172143b;

        /* renamed from: c */
        Object f172144c;

        /* renamed from: d */
        Object f172145d;

        /* renamed from: e */
        Object f172146e;

        /* renamed from: f */
        Object f172147f;

        /* renamed from: g */
        Object f172148g;

        /* renamed from: h */
        long f172149h;

        /* renamed from: i */
        long f172150i;

        /* renamed from: j */
        int f172151j;

        /* renamed from: k */
        final /* synthetic */ C76686d f172152k;

        /* renamed from: l */
        final /* synthetic */ MediaModel f172153l;

        /* renamed from: m */
        final /* synthetic */ ShortVideoContext f172154m;

        /* renamed from: n */
        private /* synthetic */ Object f172155n;

        static {
            Covode.recordClassIndex(89689);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76694f(C76686d dVar, MediaModel mediaModel, ShortVideoContext shortVideoContext, AbstractC89124d dVar2) {
            super(2, dVar2);
            this.f172152k = dVar;
            this.f172153l = mediaModel;
            this.f172154m = shortVideoContext;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C76694f fVar = new C76694f(this.f172152k, this.f172153l, this.f172154m, dVar);
            fVar.f172155n = obj;
            return fVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super ArrayList<C89386u<? extends MediaModel, ? extends String, ? extends EditPreviewInfo>>> dVar) {
            return ((C76694f) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.story.d$f$a */
        public static final class C76695a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super VideoFileInfo>, Object> {

            /* renamed from: a */
            int f172156a;

            /* renamed from: b */
            final /* synthetic */ C76694f f172157b;

            static {
                Covode.recordClassIndex(89690);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C76695a(C76694f fVar, AbstractC89124d dVar) {
                super(2, dVar);
                this.f172157b = fVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C76695a(this.f172157b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super VideoFileInfo> dVar) {
                return ((C76695a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                if (this.f172156a == 0) {
                    C89382r.m154942a(obj);
                    String str = this.f172157b.f172153l.f134662b;
                    C89219l.m154716b(str, "");
                    return C76686d.m134257a(str, this.f172157b.f172153l);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:7:0x007d  */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
            /*
            // Method dump skipped, instructions count: 263
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.C76686d.C76694f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.d$g */
    public static final class C76696g extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f172158a;

        /* renamed from: b */
        Object f172159b;

        /* renamed from: c */
        int f172160c;

        /* renamed from: d */
        final /* synthetic */ C76686d f172161d;

        /* renamed from: e */
        final /* synthetic */ ShortVideoContext f172162e;

        /* renamed from: f */
        final /* synthetic */ List f172163f;

        /* renamed from: g */
        final /* synthetic */ EditContext f172164g;

        /* renamed from: h */
        final /* synthetic */ long f172165h;

        /* renamed from: i */
        final /* synthetic */ ActivityC0945e f172166i;

        /* renamed from: j */
        private /* synthetic */ Object f172167j;

        static {
            Covode.recordClassIndex(89691);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76696g(C76686d dVar, ShortVideoContext shortVideoContext, List list, EditContext editContext, long j, ActivityC0945e eVar, AbstractC89124d dVar2) {
            super(2, dVar2);
            this.f172161d = dVar;
            this.f172162e = shortVideoContext;
            this.f172163f = list;
            this.f172164g = editContext;
            this.f172165h = j;
            this.f172166i = eVar;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            C76696g gVar = new C76696g(this.f172161d, this.f172162e, this.f172163f, this.f172164g, this.f172165h, this.f172166i, dVar);
            gVar.f172167j = obj;
            return gVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C76696g) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.story.d$g$a */
        public static final class C76698a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89378p<? extends Long, ? extends List<? extends MediaModel>>>, Object> {

            /* renamed from: a */
            int f172171a;

            /* renamed from: b */
            final /* synthetic */ C76696g f172172b;

            static {
                Covode.recordClassIndex(89693);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C76698a(C76696g gVar, AbstractC89124d dVar) {
                super(2, dVar);
                this.f172172b = gVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C76698a(this.f172172b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89378p<? extends Long, ? extends List<? extends MediaModel>>> dVar) {
                return ((C76698a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i = this.f172171a;
                if (i == 0) {
                    C89382r.m154942a(obj);
                    C76686d dVar = this.f172172b.f172161d;
                    String str = this.f172172b.f172162e.f155829n;
                    List<? extends MediaModel> list = this.f172172b.f172163f;
                    this.f172171a = 1;
                    obj = dVar.mo120435a(str, list, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    C89382r.m154942a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.story.d$g$b */
        public static final class C76699b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super Map<String, ? extends CanvasVideoData>>, Object> {

            /* renamed from: a */
            int f172173a;

            /* renamed from: b */
            final /* synthetic */ C76696g f172174b;

            static {
                Covode.recordClassIndex(89694);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C76699b(C76696g gVar, AbstractC89124d dVar) {
                super(2, dVar);
                this.f172174b = gVar;
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
                C89219l.m154721d(dVar, "");
                return new C76699b(this.f172174b, dVar);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super Map<String, ? extends CanvasVideoData>> dVar) {
                return ((C76699b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
            }

            @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
            public final Object invokeSuspend(Object obj) {
                EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
                int i = this.f172173a;
                if (i == 0) {
                    C89382r.m154942a(obj);
                    C76686d dVar = this.f172174b.f172161d;
                    String str = this.f172174b.f172162e.f155829n;
                    List list = this.f172174b.f172163f;
                    this.f172173a = 1;
                    obj = C89624i.m155554a(C31068c.f74429a, new C76700h(dVar, list, str, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    C89382r.m154942a(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0066 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x008f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00b0  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00b6  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0121  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x0199  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x019d  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x01b8 A[RETURN] */
        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r41) {
            /*
            // Method dump skipped, instructions count: 449
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.C76686d.C76696g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: b */
    private static Map<MediaModel, VideoSegment> m134260b(List<? extends MediaModel> list) {
        HashMap hashMap = new HashMap();
        for (T t : list) {
            if (t.mo96674b()) {
                Object obj = C70528i.m124563a(C89070n.m154516a((Object) t), false, null, 6).get(0);
                C89219l.m154716b(obj, "");
                VideoSegment videoSegment = (VideoSegment) obj;
                if (!C73954al.m130048a(videoSegment)) {
                    hashMap.put(t, videoSegment);
                }
            }
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.d$d */
    public static final class C76690d extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89378p<? extends Boolean, ? extends String>>, Object> {

        /* renamed from: a */
        Object f172119a;

        /* renamed from: b */
        int f172120b;

        /* renamed from: c */
        final /* synthetic */ AbstractC33484c f172121c;

        /* renamed from: d */
        final /* synthetic */ String f172122d;

        /* renamed from: e */
        final /* synthetic */ VideoSegment f172123e;

        static {
            Covode.recordClassIndex(89685);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76690d(AbstractC33484c cVar, String str, VideoSegment videoSegment, AbstractC89124d dVar) {
            super(2, dVar);
            this.f172121c = cVar;
            this.f172122d = str;
            this.f172123e = videoSegment;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C76690d(this.f172121c, this.f172122d, this.f172123e, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89378p<? extends Boolean, ? extends String>> dVar) {
            return ((C76690d) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f172120b;
            if (i == 0) {
                C89382r.m154942a(obj);
                this.f172119a = this;
                this.f172120b = 1;
                C89134h hVar = new C89134h(C89099b.m154605a(this));
                this.f172121c.mo59567a(this.f172122d, this.f172123e, new C76691a(hVar));
                obj = hVar.mo143576a();
                if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                    C89219l.m154721d(this, "");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.story.d$d$a */
        public static final class C76691a extends AbstractC89220m implements AbstractC89183m<Boolean, String, C89391z> {

            /* renamed from: a */
            final /* synthetic */ AbstractC89124d f172124a;

            static {
                Covode.recordClassIndex(89686);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C76691a(AbstractC89124d dVar) {
                super(2);
                this.f172124a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ C89391z invoke(Boolean bool, String str) {
                boolean booleanValue = bool.booleanValue();
                C89219l.m154721d(str, "");
                C80244bh.m139085a(this.f172124a, C89387v.m154943a(Boolean.valueOf(booleanValue), str));
                return C89391z.f203057a;
            }
        }
    }

    /* renamed from: a */
    private final boolean m134259a(List<? extends MediaModel> list) {
        int i;
        if (list == null || list.isEmpty()) {
            return false;
        }
        int i2 = 0;
        for (T t : list) {
            if (t.mo96674b()) {
                i = (int) t.f134668h;
            } else {
                i = 0;
            }
            i2 += i;
        }
        if (((long) i2) <= 3600000) {
            return true;
        }
        Activity activity = this.f172104c;
        if (activity != null) {
            new C23144b(activity).mo37640e(R.string.d52).mo37637b();
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.d$i */
    public static final class C76705i extends AbstractC72639k {

        /* renamed from: a */
        final /* synthetic */ AbstractC89187q f172185a;

        /* renamed from: b */
        final /* synthetic */ String f172186b;

        static {
            Covode.recordClassIndex(89700);
        }

        C76705i(AbstractC89187q qVar, String str) {
            this.f172185a = qVar;
            this.f172186b = str;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onFinish(AbstractC72623d dVar, Object obj) {
            C89219l.m154721d(dVar, "");
            super.onFinish(dVar, obj);
            this.f172185a.invoke(this.f172186b, dVar, obj);
        }
    }

    /* renamed from: a */
    public static VideoFileInfo m134257a(String str, MediaModel mediaModel) {
        VEUtils.VEVideoFileInfo a = C70503u.m124367a(str);
        if (a != null) {
            return new VideoFileInfo(a.width, a.height, (long) a.duration, a.fps, a.bitrate, 0, 0, 0, 224, null);
        }
        return new VideoFileInfo(mediaModel.f134672l, mediaModel.f134673m, mediaModel.f134668h, 30, 0, 0, 0, 0, 240, null);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.AbstractC77267a
    /* renamed from: a */
    public final String mo120436a(Bundle bundle, VideoPublishEditModel videoPublishEditModel, AbstractC89187q<? super String, Object, Object, C89391z> qVar) {
        C89219l.m154721d(bundle, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(qVar, "");
        ArrayList arrayList = new ArrayList();
        C89219l.m154721d(bundle, "");
        C84911q.m145921a("ParallelStoryPublishScheduler,startPublish");
        C77409c a = C77390a.m135323a(bundle);
        C77390a.f173642e.mo121031a(a);
        String str = a.f173687d;
        C77390a.m135325a(new C69886bj(bundle), str, true);
        C77390a.m135325a(new C67294f(new C70649ds(0, videoPublishEditModel)), str, true);
        C77390a.m135325a(new C76705i(qVar, str), str, true);
        C77390a.m135325a(new C77443a(arrayList), str, false);
        arrayList.add(new ScheduleInfo(str, bundle));
        new StoryPublishEvent(arrayList, false, 2, null).post();
        return str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo120435a(java.lang.String r17, java.util.List<? extends com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel> r18, p4600h.p4603c.AbstractC89124d<? super p4600h.C89378p<java.lang.Long, ? extends java.util.List<? extends com.p2082ss.android.ugc.aweme.mediachoose.helper.MediaModel>>> r19) {
        /*
        // Method dump skipped, instructions count: 294
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.C76686d.mo120435a(java.lang.String, java.util.List, h.c.d):java.lang.Object");
    }

    @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.AbstractC77267a
    /* renamed from: a */
    public final void mo120438a(Activity activity, VideoPublishEditModel videoPublishEditModel, int i) {
        C89219l.m154721d(activity, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C71824e.m126817a(activity, videoPublishEditModel, null, i, null, null, null, null, C63253l.f143623a.mo73330z().mo93813a(videoPublishEditModel.commerceData), "", true, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.p4047g.p4052c.p4053a.AbstractC77267a
    /* renamed from: a */
    public final void mo120439a(ActivityC0945e eVar, ArrayList<MediaModel> arrayList, Intent intent) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(intent, "");
        AbstractC89568bz bzVar = this.f172105d;
        if (bzVar != null) {
            bzVar.mo143985a((CancellationException) null);
        }
        this.f172104c = eVar;
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            for (MediaModel mediaModel : arrayList) {
                if (!C84902i.m145892a(mediaModel.f134662b)) {
                    arrayList2.add(mediaModel);
                }
            }
            arrayList.removeAll(arrayList2);
            if (m134259a(arrayList)) {
                ShortVideoContext shortVideoContext = (ShortVideoContext) intent.getParcelableExtra("key_short_video_context");
                EditContext editContext = (EditContext) intent.getParcelableExtra("key_story_edit_context");
                if (shortVideoContext != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    ArrayList arrayList3 = new ArrayList(C89070n.m154526a((Iterable) arrayList, 10));
                    for (MediaModel mediaModel2 : arrayList) {
                        try {
                            mediaModel2 = mediaModel2.mo96673a();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        arrayList3.add(mediaModel2);
                    }
                    this.f172105d = C89624i.m155555a(C89561bs.f203280a, C31068c.f74429a, null, new C76696g(this, shortVideoContext, C89070n.m154585g((Collection) arrayList3), editContext, currentTimeMillis, eVar, null), 2);
                }
            }
        }
    }
}
