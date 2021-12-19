package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.SettingsManager;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.C69789ac;
import com.p2082ss.android.ugc.aweme.shortvideo.C69931cj;
import com.p2082ss.android.ugc.aweme.shortvideo.EnumC69936co;
import com.p2082ss.android.ugc.aweme.shortvideo.TTUploaderService;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88748d;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.aj */
public final class C72613aj {

    /* renamed from: h */
    public static final C72614a f162783h = new C72614a((byte) 0);

    /* renamed from: a */
    public Boolean f162784a;

    /* renamed from: b */
    public C69789ac f162785b;

    /* renamed from: c */
    public String f162786c;

    /* renamed from: d */
    public boolean f162787d;

    /* renamed from: e */
    public AbstractC88979t<C69789ac> f162788e;

    /* renamed from: f */
    public AbstractC88412b f162789f;

    /* renamed from: g */
    public AbstractC88412b f162790g;

    /* renamed from: i */
    private final long f162791i;

    static {
        Covode.recordClassIndex(85296);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.aj$a */
    public static final class C72614a {
        static {
            Covode.recordClassIndex(85297);
        }

        private C72614a() {
        }

        public /* synthetic */ C72614a(byte b) {
            this();
        }
    }

    private C72613aj() {
        this.f162791i = (long) SettingsManager.m29616a().mo25394a("maximum_delay", 500);
    }

    /* renamed from: a */
    public final void mo114906a() {
        String str = this.f162786c;
        if (str != null && str.length() != 0 && !C63238c.f143594u.mo93901a()) {
            AbstractC88979t<C69789ac> h = ((TTUploaderService.RetrofitService) C63244g.m114602a().mo73257C().retrofitCreate(AVApiImpl.m123134b().mo109850a(), TTUploaderService.RetrofitService.class)).getTitleSensitivityResult(this.f162786c, EnumC69936co.TEXT_TYPE_TITLE.getValue()).mo143304h(this.f162791i, TimeUnit.MILLISECONDS);
            C88466b.m153696a(16, "initialCapacity");
            AbstractC88979t<C69789ac> a = C88925a.m154171a(new C88748d(h));
            this.f162789f = a.mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C72615b(this), new C72616c(this));
            this.f162788e = a;
        }
    }

    /* renamed from: b */
    public final void mo114908b() {
        C69789ac acVar;
        C69931cj postPrompts;
        String postAnyway;
        C69789ac acVar2;
        C69931cj postPrompts2;
        String goBack;
        C69931cj postPrompts3;
        C84911q.m145921a("TitleSensitivity checkresult triggered");
        C69789ac acVar3 = this.f162785b;
        String str = null;
        if (!(acVar3 == null || (postPrompts3 = acVar3.getPostPrompts()) == null)) {
            str = postPrompts3.getText();
        }
        boolean z = false;
        if (!(str == null || str.length() == 0 || (acVar = this.f162785b) == null || (postPrompts = acVar.getPostPrompts()) == null || (postAnyway = postPrompts.getPostAnyway()) == null || postAnyway.length() == 0 || (acVar2 = this.f162785b) == null || (postPrompts2 = acVar2.getPostPrompts()) == null || (goBack = postPrompts2.getGoBack()) == null || goBack.length() == 0)) {
            z = true;
        }
        this.f162784a = Boolean.valueOf(z);
    }

    public /* synthetic */ C72613aj(byte b) {
        this();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.aj$e */
    public static final class C72618e<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f162797a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f162798b;

        static {
            Covode.recordClassIndex(85301);
        }

        public C72618e(AbstractC89171a aVar, AbstractC89171a aVar2) {
            this.f162797a = aVar;
            this.f162798b = aVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C84911q.m145921a("TitleSensitivity  sync data failed");
            this.f162797a.invoke();
            this.f162798b.invoke();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.aj$c */
    public static final class C72616c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C72613aj f162793a;

        static {
            Covode.recordClassIndex(85299);
        }

        C72616c(C72613aj ajVar) {
            this.f162793a = ajVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C84911q.m145921a("TitleSensitivity request failed or delay}");
            this.f162793a.f162785b = null;
            this.f162793a.f162787d = true;
            this.f162793a.f162784a = false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.aj$d */
    public static final class C72617d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C72613aj f162794a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f162795b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89171a f162796c;

        static {
            Covode.recordClassIndex(85300);
        }

        public C72617d(C72613aj ajVar, AbstractC89171a aVar, AbstractC89171a aVar2) {
            this.f162794a = ajVar;
            this.f162795b = aVar;
            this.f162796c = aVar2;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C84911q.m145921a("TitleSensitivity finish request in time");
            this.f162794a.f162785b = (C69789ac) obj;
            this.f162794a.mo114908b();
            this.f162795b.invoke();
            this.f162796c.invoke();
        }
    }

    /* renamed from: a */
    public final void mo114907a(String str) {
        this.f162785b = null;
        this.f162784a = null;
        this.f162787d = false;
        this.f162787d = false;
        this.f162788e = null;
        AbstractC88412b bVar = this.f162789f;
        if (bVar != null) {
            bVar.dispose();
        }
        AbstractC88412b bVar2 = this.f162790g;
        if (bVar2 != null) {
            bVar2.dispose();
        }
        this.f162786c = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.aj$b */
    public static final class C72615b<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C72613aj f162792a;

        static {
            Covode.recordClassIndex(85298);
        }

        C72615b(C72613aj ajVar) {
            this.f162792a = ajVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            String str;
            C69789ac acVar = (C69789ac) obj;
            this.f162792a.f162785b = acVar;
            this.f162792a.mo114908b();
            StringBuilder append = new StringBuilder("TitleSensitivity response:status_code").append(acVar.getStatusCode()).append(" prompts_text ");
            C69931cj postPrompts = acVar.getPostPrompts();
            if (postPrompts != null) {
                str = postPrompts.getText();
            } else {
                str = null;
            }
            C84911q.m145921a(append.append(str).toString());
        }
    }
}
