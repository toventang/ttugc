package com.p2082ss.android.ugc.aweme.story.publish;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.story.Story;
import com.p2082ss.android.ugc.aweme.feed.model.story.UserStory;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService;
import com.p2082ss.android.ugc.aweme.services.story.StoryCoverExtractConfig;
import com.p2082ss.android.ugc.aweme.services.story.event.ScheduleInfo;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72606ah;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72690y;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.story.p4055i.C77283a;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

/* renamed from: com.ss.android.ugc.aweme.story.publish.f */
public final class C77429f implements AbstractC77389a {

    /* renamed from: a */
    static float f173726a;

    /* renamed from: b */
    public static List<Aweme> f173727b = new ArrayList();

    /* renamed from: c */
    static int f173728c;

    /* renamed from: d */
    public static int f173729d;

    /* renamed from: e */
    public static boolean f173730e;

    /* renamed from: f */
    public static List<C77444g> f173731f;

    /* renamed from: g */
    public static final Map<String, Bitmap> f173732g = new LinkedHashMap();

    /* renamed from: h */
    public static final C77429f f173733h = new C77429f();

    /* renamed from: i */
    private static final Map<Object, AbstractC77426d> f173734i = new LinkedHashMap();

    private C77429f() {
    }

    @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77389a
    /* renamed from: a */
    public final List<Aweme> mo120165a() {
        return f173727b;
    }

    /* renamed from: d */
    public static float m135379d() {
        return m135374b();
    }

    /* renamed from: c */
    public static boolean m135378c() {
        List<C77444g> list = f173731f;
        boolean z = false;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().f173767b.f173722b == EnumC77446i.FAILED) {
                    z = true;
                }
            }
        }
        return z;
    }

    static {
        Covode.recordClassIndex(90460);
    }

    /* renamed from: b */
    public static float m135374b() {
        int i;
        List<C77444g> list = f173731f;
        if (list != null) {
            i = list.size();
        } else {
            i = 0;
        }
        float f = (float) i;
        float f2 = 0.0f;
        List<C77444g> list2 = f173731f;
        if (list2 != null) {
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                f2 += it.next().f173767b.f173721a;
            }
        }
        return f2 / f;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.f$b */
    public static final class C77431b extends AbstractC72639k {

        /* renamed from: a */
        final /* synthetic */ String f173736a;

        static {
            Covode.recordClassIndex(90462);
        }

        C77431b(String str) {
            this.f173736a = str;
        }

        /* renamed from: com.ss.android.ugc.aweme.story.publish.f$b$c */
        static final class C77434c extends AbstractC89220m implements AbstractC89172b<AbstractC77426d, C89391z> {

            /* renamed from: a */
            public static final C77434c f173741a = new C77434c();

            static {
                Covode.recordClassIndex(90465);
            }

            C77434c() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(AbstractC77426d dVar) {
                AbstractC77426d dVar2 = dVar;
                C89219l.m154721d(dVar2, "");
                dVar2.mo89657a(C77429f.f173729d);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.publish.f$b$a */
        static final class C77432a extends AbstractC89220m implements AbstractC89172b<AbstractC77426d, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C77431b f173737a;

            /* renamed from: b */
            final /* synthetic */ AbstractC72623d f173738b;

            /* renamed from: c */
            final /* synthetic */ C77444g f173739c;

            static {
                Covode.recordClassIndex(90463);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C77432a(C77431b bVar, AbstractC72623d dVar, C77444g gVar) {
                super(1);
                this.f173737a = bVar;
                this.f173738b = dVar;
                this.f173739c = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(AbstractC77426d dVar) {
                AbstractC77426d dVar2 = dVar;
                C89219l.m154721d(dVar2, "");
                dVar2.mo89661b(this.f173737a.f173736a, this.f173739c.f173767b);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.publish.f$b$b */
        static final class C77433b extends AbstractC89220m implements AbstractC89172b<AbstractC77426d, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C89233z.C89238e f173740a;

            static {
                Covode.recordClassIndex(90464);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C77433b(C89233z.C89238e eVar) {
                super(1);
                this.f173740a = eVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(AbstractC77426d dVar) {
                AbstractC77426d dVar2 = dVar;
                C89219l.m154721d(dVar2, "");
                dVar2.mo89658a((EnumC77446i) this.f173740a.element);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.publish.f$b$d */
        static final class C77435d extends AbstractC89220m implements AbstractC89172b<AbstractC77426d, C89391z> {

            /* renamed from: a */
            final /* synthetic */ C77431b f173742a;

            /* renamed from: b */
            final /* synthetic */ int f173743b;

            /* renamed from: c */
            final /* synthetic */ C77444g f173744c;

            static {
                Covode.recordClassIndex(90466);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C77435d(C77431b bVar, int i, C77444g gVar) {
                super(1);
                this.f173742a = bVar;
                this.f173743b = i;
                this.f173744c = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(AbstractC77426d dVar) {
                AbstractC77426d dVar2 = dVar;
                C89219l.m154721d(dVar2, "");
                dVar2.mo89656a(C77429f.f173726a);
                dVar2.mo89660a(this.f173742a.f173736a, this.f173744c.f173767b);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.story.publish.f$b$e */
        public static final class C77436e implements IAVInfoService.IGetInfoCallback<int[]> {

            /* renamed from: a */
            final /* synthetic */ C77431b f173745a;

            /* renamed from: b */
            final /* synthetic */ String f173746b;

            static {
                Covode.recordClassIndex(90467);
            }

            /* renamed from: com.ss.android.ugc.aweme.story.publish.f$b$e$a */
            static final class C77437a extends AbstractC89220m implements AbstractC89172b<AbstractC77426d, C89391z> {

                /* renamed from: a */
                final /* synthetic */ C77436e f173747a;

                /* renamed from: b */
                final /* synthetic */ int[] f173748b;

                static {
                    Covode.recordClassIndex(90468);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C77437a(C77436e eVar, int[] iArr) {
                    super(1);
                    this.f173747a = eVar;
                    this.f173748b = iArr;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89172b
                public final /* synthetic */ C89391z invoke(AbstractC77426d dVar) {
                    AbstractC77426d dVar2 = dVar;
                    C89219l.m154721d(dVar2, "");
                    C77444g c = C77429f.m135377c(this.f173747a.f173745a.f173736a);
                    if (c != null) {
                        dVar2.mo89662c(this.f173747a.f173745a.f173736a, c.f173767b);
                    }
                    return C89391z.f203057a;
                }
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.p2082ss.android.ugc.aweme.services.external.ability.IAVInfoService.IGetInfoCallback
            public final /* synthetic */ void finish(int[] iArr) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                int[] iArr2 = iArr;
                String str = this.f173745a.f173736a;
                int i6 = 0;
                int i7 = 0;
                for (T t : C77429f.f173727b) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        C89070n.m154520a();
                    }
                    T t2 = t;
                    if (TextUtils.equals(str, t2.getScheduleId())) {
                        Video video = new Video();
                        VideoUrlModel videoUrlModel = new VideoUrlModel();
                        if (iArr2 != null) {
                            i = iArr2[0];
                        } else {
                            i = 0;
                        }
                        videoUrlModel.setWidth(i);
                        if (iArr2 != null) {
                            i2 = iArr2[1];
                        } else {
                            i2 = 0;
                        }
                        videoUrlModel.setHeight(i2);
                        if (iArr2 != null) {
                            i3 = iArr2[10];
                        } else {
                            i3 = 0;
                        }
                        videoUrlModel.setDuration((double) i3);
                        videoUrlModel.setUri(this.f173746b);
                        videoUrlModel.setUrlList(C89070n.m154516a(videoUrlModel.getUri()));
                        videoUrlModel.setUrlKey(videoUrlModel.getUri());
                        video.setPlayAddr(videoUrlModel);
                        if (iArr2 != null) {
                            i4 = iArr2[0];
                        } else {
                            i4 = 0;
                        }
                        video.setWidth(i4);
                        if (iArr2 != null) {
                            i5 = iArr2[1];
                        } else {
                            i5 = 0;
                        }
                        video.setHeight(i5);
                        if (iArr2 != null) {
                            i6 = iArr2[10];
                        }
                        video.setDuration((double) i6);
                        t2.setVideo(video);
                        C77429f.m135373a(new C77437a(this, iArr2));
                        return;
                    }
                    i7 = i8;
                }
            }

            C77436e(C77431b bVar, String str) {
                this.f173745a = bVar;
                this.f173746b = str;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onProgress(int i, Object obj) {
            super.onProgress(i, obj);
            C77444g c = C77429f.m135377c(this.f173736a);
            if (c != null) {
                c.f173767b.f173721a = ((float) i) / 100.0f;
                C77429f.f173726a = C77429f.m135374b();
                C77429f.m135373a(new C77435d(this, i, c));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:76:0x013d, code lost:
            if (r4 != false) goto L_0x013f;
         */
        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onFinish(com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d r14, java.lang.Object r15) {
            /*
            // Method dump skipped, instructions count: 388
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.publish.C77429f.C77431b.onFinish(com.ss.android.ugc.aweme.shortvideo.publish.d, java.lang.Object):void");
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k
        public final void onStageUpdate(String str, AbstractC72606ah ahVar, Object obj) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(ahVar, "");
            super.onStageUpdate(str, ahVar, obj);
            if (TextUtils.equals(str, "STAGE_SYNTHETIC") && (ahVar instanceof AbstractC72606ah.C72607a)) {
                AbstractC72606ah.C72607a aVar = (AbstractC72606ah.C72607a) ahVar;
                if (aVar.f162763a instanceof AbstractC72690y.C72691a) {
                    AbstractC72690y yVar = aVar.f162763a;
                    Objects.requireNonNull(yVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.publish.Result.Success");
                    String obj2 = ((AbstractC72690y.C72691a) yVar).f162966a.toString();
                    AVExternalServiceImpl.m113114a().abilityService().infoService().videoInfo(obj2, true, new C77436e(this, obj2));
                }
            }
        }
    }

    /* renamed from: b */
    public static void m135375b(String str) {
        f173732g.remove(str);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.f$a */
    static final class C77430a extends AbstractC89220m implements AbstractC89172b<Bitmap, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f173735a;

        static {
            Covode.recordClassIndex(90461);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77430a(String str) {
            super(1);
            this.f173735a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Bitmap bitmap) {
            if (bitmap != null) {
                C77429f.f173732g.put(this.f173735a, bitmap);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.f$c */
    static final class C77438c extends AbstractC89220m implements AbstractC89172b<AbstractC77426d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ String f173749a;

        static {
            Covode.recordClassIndex(90469);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77438c(String str) {
            super(1);
            this.f173749a = str;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC77426d dVar) {
            AbstractC77426d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo89659a(this.f173749a);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.f$d */
    static final class C77439d extends AbstractC89220m implements AbstractC89172b<AbstractC77426d, C89391z> {

        /* renamed from: a */
        public static final C77439d f173750a = new C77439d();

        static {
            Covode.recordClassIndex(90470);
        }

        C77439d() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC77426d dVar) {
            AbstractC77426d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            dVar2.mo89655a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: e */
    public static void m135381e(String str) {
        C89219l.m154721d(str, "");
        f173734i.remove(str);
    }

    /* renamed from: a */
    public static void m135373a(AbstractC89172b<? super AbstractC77426d, C89391z> bVar) {
        for (Map.Entry<Object, AbstractC77426d> entry : f173734i.entrySet()) {
            bVar.invoke(entry.getValue());
        }
    }

    /* renamed from: c */
    public static C77444g m135377c(String str) {
        List<C77444g> list = f173731f;
        if (list == null) {
            return null;
        }
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                C89070n.m154520a();
            }
            T t2 = t;
            if (TextUtils.equals(str, t2.f173766a.getScheduleId())) {
                return t2;
            }
            i = i2;
        }
        return null;
    }

    /* renamed from: d */
    public static boolean m135380d(String str) {
        List<C77444g> list = f173731f;
        if (list == null) {
            return false;
        }
        for (T t : list) {
            if (TextUtils.equals(t.f173766a.getScheduleId(), str)) {
                AbstractC72639k kVar = t.f173767b.f173725e;
                if (kVar != null) {
                    C77445h.f173768a.removeCallback(str, kVar);
                }
                List<C77444g> list2 = f173731f;
                if (list2 == null || !list2.remove(t)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    private static void m135383g(String str) {
        for (T t : f173727b) {
            if (TextUtils.equals(str, t.getScheduleId())) {
                f173727b.remove(t);
                return;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77389a
    /* renamed from: a */
    public final void mo120166a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        if (C76706a.m134278d(aweme)) {
            IAwemeService b = AwemeService.m70060b();
            if (b != null) {
                b.mo60677a(aweme);
            }
            aweme.setScheduleId(aweme.getAid());
            f173727b.add(aweme);
        }
    }

    /* renamed from: b */
    private static boolean m135376b(Aweme aweme) {
        Story story;
        Story story2;
        if (aweme.getAwemeType() != 40 || aweme.getStory() == null || (story = aweme.getStory()) == null || story.isFaked() || (story2 = aweme.getStory()) == null || story2.isPublishing() || TextUtils.isEmpty(aweme.getAid())) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static String m135382f(String str) {
        ScheduleInfo scheduleInfo;
        Bundle scheduleParam;
        String string;
        if (str == null) {
            return "";
        }
        List<C77444g> list = f173731f;
        T t = null;
        if (list == null) {
            return "";
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            if (C89219l.m154714a((Object) next.f173766a.getScheduleId(), (Object) str)) {
                t = next;
                break;
            }
        }
        T t2 = t;
        if (t2 == null || (scheduleInfo = t2.f173766a) == null || (scheduleParam = scheduleInfo.getScheduleParam()) == null || (string = scheduleParam.getString("creation_id")) == null) {
            return "";
        }
        return string;
    }

    @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77389a
    /* renamed from: a */
    public final void mo120168a(String str) {
        C89219l.m154721d(str, "");
        boolean d = m135380d(str);
        m135383g(str);
        m135375b(str);
        m135373a(new C77438c(str));
        if (d) {
            f173729d--;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77389a
    /* renamed from: a */
    public final void mo120169a(List<C77444g> list) {
        if (list != null) {
            if (f173731f == null) {
                f173731f = new ArrayList();
            }
            List<C77444g> list2 = f173731f;
            if (list2 != null) {
                for (T t : list2) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        if (TextUtils.equals(t.f173766a.getScheduleId(), list.get(size).f173766a.getScheduleId())) {
                            list.remove(size);
                        }
                    }
                }
            }
            List<C77444g> list3 = f173731f;
            if (list3 != null) {
                list3.addAll(list);
            }
            f173729d = list.size();
            m135373a(C77439d.f173750a);
            f173730e = true;
            int i = 0;
            for (T t2 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    C89070n.m154520a();
                }
                T t3 = t2;
                Aweme aweme = new Aweme();
                aweme.setAid(t3.f173766a.getScheduleId());
                aweme.setAwemeType(40);
                aweme.setStory(new Story(0, false, 0, false, 0, false, false, false, true, 255, null));
                aweme.setScheduleId(t3.f173766a.getScheduleId());
                aweme.setAuthor(C80580in.m139683b());
                f173727b.add(aweme);
                t3.f173767b.f173724d = aweme;
                String scheduleId = t3.f173766a.getScheduleId();
                StoryCoverExtractConfig storyCoverExtractConfig = new StoryCoverExtractConfig(0, 0, 0, 7, null);
                C77430a aVar = new C77430a(scheduleId);
                C89219l.m154721d(scheduleId, "");
                C89219l.m154721d(storyCoverExtractConfig, "");
                C89219l.m154721d(aVar, "");
                C77445h.f173768a.getCover(scheduleId, storyCoverExtractConfig, aVar);
                t3.f173767b.f173725e = new C77431b(scheduleId);
                C77445h hVar = C77445h.f173768a;
                AbstractC72639k kVar = t3.f173767b.f173725e;
                if (kVar == null) {
                    C89219l.m154715b();
                }
                hVar.addCallback(scheduleId, kVar);
                i = i2;
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77389a
    /* renamed from: a */
    public final void mo120167a(Object obj, AbstractC77426d dVar) {
        C89219l.m154721d(obj, "");
        C89219l.m154721d(dVar, "");
        f173734i.put(obj, dVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.story.publish.AbstractC77389a
    /* renamed from: a */
    public final int mo120164a(UserStory userStory, boolean z) {
        C89219l.m154721d(userStory, "");
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= f173727b.size()) {
                break;
            }
            Aweme aweme = f173727b.get(i);
            if (aweme.getCreateTime() != 0 && userStory.getLastStoryCreatedAt() / 1000 < aweme.getCreateTime()) {
                C77283a.m135111b("PublishManager", "aweme create time: " + aweme.getCreateTime() + ", server last create time: " + (userStory.getLastStoryCreatedAt() / 1000) + ", userStory instance: " + System.identityHashCode(userStory) + ", originTotalCount: " + userStory.getOriginTotalCount());
                break;
            }
            if (m135376b(aweme)) {
                i2++;
                if (z) {
                    f173727b.remove(i);
                    i--;
                }
            }
            i++;
        }
        return i2;
    }
}
