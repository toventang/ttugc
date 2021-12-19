package com.p2082ss.android.ugc.aweme.story.publish.p4060a;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.p2719cv.C40780g;
import com.p2082ss.android.ugc.aweme.p2719cv.C40787l;
import com.p2082ss.android.ugc.aweme.p2719cv.EnumC40793o;
import com.p2082ss.android.ugc.aweme.p2730de.ExecutorC40975j;
import com.p2082ss.android.ugc.aweme.scheduler.AbstractC67333k;
import com.p2082ss.android.ugc.aweme.scheduler.C67286a;
import com.p2082ss.android.ugc.aweme.scheduler.C67291e;
import com.p2082ss.android.ugc.aweme.scheduler.C67296h;
import com.p2082ss.android.ugc.aweme.scheduler.C67334l;
import com.p2082ss.android.ugc.aweme.scheduler.RunnableC67311i;
import com.p2082ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.C70646dq;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72623d;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72639k;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.AbstractC72685x;
import com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.publish.a.b */
public final class C77399b {

    /* renamed from: e */
    public static final boolean f173655e = SettingsManager.m29616a().mo25400a("enable_all_schedule_alog", false);

    /* renamed from: f */
    public static final C77400a f173656f = new C77400a((byte) 0);

    /* renamed from: a */
    public final int f173657a = 10;

    /* renamed from: b */
    public final int f173658b = 1;

    /* renamed from: c */
    public final boolean f173659c = false;

    /* renamed from: d */
    public final boolean f173660d = true;

    /* renamed from: g */
    private final AbstractC89244h f173661g = C89250i.m154773a((AbstractC89171a) new C77406g(this));

    /* renamed from: h */
    private final AbstractC89244h f173662h = C89250i.m154773a((AbstractC89171a) C77404e.f173673a);

    /* renamed from: i */
    private final AbstractC89244h f173663i = C89250i.m154773a((AbstractC89171a) C77405f.f173674a);

    /* renamed from: j */
    private final boolean f173664j = true;

    /* renamed from: c */
    private final C67291e m135342c() {
        return (C67291e) this.f173663i.getValue();
    }

    /* renamed from: a */
    public final C67334l mo121032a() {
        return (C67334l) this.f173661g.getValue();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final ExecutorService mo121037b() {
        return (ExecutorService) this.f173662h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.b$a */
    public static final class C77400a {
        static {
            Covode.recordClassIndex(90431);
        }

        private C77400a() {
        }

        public /* synthetic */ C77400a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.b$f */
    static final class C77405f extends AbstractC89220m implements AbstractC89171a<C67291e> {

        /* renamed from: a */
        public static final C77405f f173674a = new C77405f();

        static {
            Covode.recordClassIndex(90436);
        }

        C77405f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67291e invoke() {
            return new C67291e();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.b$e */
    static final class C77404e extends AbstractC89220m implements AbstractC89171a<ExecutorService> {

        /* renamed from: a */
        public static final C77404e f173673a = new C77404e();

        static {
            Covode.recordClassIndex(90435);
        }

        C77404e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ExecutorService invoke() {
            C40787l.C40788a a = C40787l.m82269a(EnumC40793o.SERIAL);
            a.f95504b = "StoryPublishTaskExecutor";
            return C40780g.m82242a(a.mo70028a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.b$g */
    static final class C77406g extends AbstractC89220m implements AbstractC89171a<C67334l> {

        /* renamed from: a */
        final /* synthetic */ C77399b f173675a;

        static {
            Covode.recordClassIndex(90437);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C77406g(C77399b bVar) {
            super(0);
            this.f173675a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C67334l invoke() {
            return new C67334l(this.f173675a.f173657a, this.f173675a.f173658b, this.f173675a.f173660d, this.f173675a.f173659c);
        }
    }

    static {
        Covode.recordClassIndex(90430);
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.b$c */
    static final class RunnableC77402c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RunnableC67311i.C67312a f173668a;

        /* renamed from: b */
        final /* synthetic */ AbstractC72685x f173669b;

        /* renamed from: c */
        final /* synthetic */ AbstractC72639k f173670c;

        static {
            Covode.recordClassIndex(90433);
        }

        RunnableC77402c(RunnableC67311i.C67312a aVar, AbstractC72685x xVar, AbstractC72639k kVar) {
            this.f173668a = aVar;
            this.f173669b = xVar;
            this.f173670c = kVar;
        }

        public final void run() {
            this.f173670c.onFinish(((AbstractC72685x.C72686a) this.f173669b).f162960a, ((AbstractC72685x.C72686a) this.f173669b).f162961b);
            C73991bj.m130133d("StoryPublishTaskExecutor | addCallback direct finish " + this.f173668a.f150839a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.b$h */
    public static final class RunnableC77407h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C77399b f173676a;

        /* renamed from: b */
        final /* synthetic */ String f173677b = null;

        /* renamed from: c */
        final /* synthetic */ AbstractC72639k f173678c;

        static {
            Covode.recordClassIndex(90438);
        }

        RunnableC77407h(C77399b bVar, String str, AbstractC72639k kVar) {
            this.f173676a = bVar;
            this.f173678c = kVar;
        }

        public final void run() {
            Iterator<T> it = this.f173676a.mo121032a().mo106182b(this.f173677b).iterator();
            while (it.hasNext()) {
                RunnableC67311i iVar = it.next().f150843e;
                if (iVar != null) {
                    iVar.mo106148b(this.f173678c);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.b$b */
    public static final class RunnableC77401b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C77399b f173665a;

        /* renamed from: b */
        final /* synthetic */ AbstractC72639k f173666b;

        /* renamed from: c */
        final /* synthetic */ String f173667c;

        static {
            Covode.recordClassIndex(90432);
        }

        RunnableC77401b(C77399b bVar, AbstractC72639k kVar, String str) {
            this.f173665a = bVar;
            this.f173666b = kVar;
            this.f173667c = str;
        }

        public final void run() {
            C77399b bVar = this.f173665a;
            AbstractC72639k kVar = this.f173666b;
            String str = this.f173667c;
            C89219l.m154721d(kVar, "");
            RunnableC67311i.C67312a a = bVar.mo121032a().mo106178a(str);
            if (a != null) {
                AbstractC72685x xVar = a.f150840b;
                if (xVar instanceof AbstractC72685x.C72686a) {
                    ExecutorC40975j.f95810a.execute(new RunnableC77402c(a, xVar, kVar));
                    return;
                }
                RunnableC67311i iVar = a.f150843e;
                if (iVar != null) {
                    iVar.mo106142a(kVar);
                    C73991bj.m130133d("StoryPublishTaskExecutor | addCallback success " + a.f150839a);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.b$d */
    static final class RunnableC77403d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C77399b f173671a;

        /* renamed from: b */
        final /* synthetic */ String f173672b;

        static {
            Covode.recordClassIndex(90434);
        }

        RunnableC77403d(C77399b bVar, String str) {
            this.f173671a = bVar;
            this.f173672b = str;
        }

        public final void run() {
            List<RunnableC67311i.C67312a> b = this.f173671a.mo121032a().mo106182b(this.f173672b);
            ArrayList<RunnableC67311i.C67312a> arrayList = new ArrayList();
            for (T t : b) {
                if (!(t.f150840b instanceof AbstractC72685x.C72686a)) {
                    arrayList.add(t);
                }
            }
            for (RunnableC67311i.C67312a aVar : arrayList) {
                RunnableC67311i iVar = aVar.f150843e;
                if (iVar != null) {
                    iVar.mo106147b();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.story.publish.a.b$i */
    public static final class RunnableC77408i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RunnableC67311i.C67312a f173679a;

        /* renamed from: b */
        final /* synthetic */ C77399b f173680b;

        /* renamed from: c */
        final /* synthetic */ String f173681c;

        /* renamed from: d */
        final /* synthetic */ C72678q f173682d;

        static {
            Covode.recordClassIndex(90439);
        }

        RunnableC77408i(RunnableC67311i.C67312a aVar, C77399b bVar, String str, C72678q qVar) {
            this.f173679a = aVar;
            this.f173680b = bVar;
            this.f173681c = str;
            this.f173682d = qVar;
        }

        public final void run() {
            RunnableC67311i iVar;
            this.f173679a.mo106151a(this.f173682d);
            AbstractC72685x xVar = this.f173679a.f150840b;
            if (xVar instanceof AbstractC72685x.C72687b) {
                C67296h.m119240b("ReStartNewPublish " + this.f173681c);
            } else if (xVar instanceof AbstractC72685x.C72686a) {
                AbstractC72623d dVar = ((AbstractC72685x.C72686a) xVar).f162960a;
                if (dVar instanceof AbstractC72623d.C72626c) {
                    C67296h.m119240b("ReStartAlreadySuccessPublish " + this.f173681c);
                } else if (dVar instanceof AbstractC72623d.C72624a) {
                    C73991bj.m130128a("PublishScheduler | reStart Cancel Publish, reStart new. old:" + this.f173681c + " new:" + this.f173680b.mo121036b(this.f173682d));
                } else if (dVar instanceof AbstractC72623d.C72625b) {
                    C73991bj.m130128a("PublishScheduler | reStart Failed Publish, reStart new. old:" + this.f173681c + " new:" + this.f173680b.mo121036b(this.f173682d));
                }
            } else if ((xVar instanceof AbstractC72685x.C72689d) && (iVar = this.f173679a.f150843e) != null) {
                iVar.mo106141a();
            }
        }
    }

    /* renamed from: a */
    public static Bitmap m135340a(C72678q qVar) {
        C89219l.m154721d(qVar, "");
        if (!(qVar.f162938k instanceof VideoPublishEditModel)) {
            return null;
        }
        BaseShortVideoContext baseShortVideoContext = qVar.f162938k;
        Objects.requireNonNull(baseShortVideoContext, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel");
        return C70646dq.m124867a((VideoPublishEditModel) baseShortVideoContext);
    }

    /* renamed from: a */
    public final void mo121034a(AbstractC72639k kVar) {
        C89219l.m154721d(kVar, "");
        C73991bj.m130133d("StoryPublishTaskExecutor | removeCallback call " + ((String) null));
        mo121037b().execute(new RunnableC77407h(this, null, kVar));
    }

    /* renamed from: b */
    public final String mo121036b(C72678q qVar) {
        boolean z = f173655e;
        C67291e c = m135342c();
        C67334l a = mo121032a();
        ExecutorService b = mo121037b();
        C89219l.m154716b(b, "");
        RunnableC67311i iVar = new RunnableC67311i("StoryPublishTaskExecutor", qVar, z, c, a, b);
        if (!mo121032a().mo106181a(iVar.f150829a)) {
            return null;
        }
        mo121037b().execute(iVar);
        C73991bj.m130128a("StoryPublishTaskExecutor | startNewPublish creationId:" + qVar.f162929b + " publishId:" + iVar.f150829a.f150839a);
        return iVar.f150829a.f150839a;
    }

    /* renamed from: a */
    public final void mo121035a(AbstractC72639k kVar, String str) {
        C89219l.m154721d(kVar, "");
        C73991bj.m130133d("StoryPublishTaskExecutor | addCallback call ".concat(String.valueOf(str)));
        mo121037b().execute(new RunnableC77401b(this, kVar, str));
    }

    /* renamed from: a */
    public final String mo121033a(Bundle bundle, String str, AbstractC67333k kVar) {
        C89219l.m154721d(bundle, "");
        return m135341a(C67286a.m119212a(bundle), str, kVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized java.lang.String m135341a(com.p2082ss.android.ugc.aweme.shortvideo.publish.C72678q r5, java.lang.String r6, com.p2082ss.android.ugc.aweme.scheduler.AbstractC67333k r7) {
        /*
        // Method dump skipped, instructions count: 176
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.publish.p4060a.C77399b.m135341a(com.ss.android.ugc.aweme.shortvideo.publish.q, java.lang.String, com.ss.android.ugc.aweme.scheduler.k):java.lang.String");
    }
}
