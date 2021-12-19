package com.p2082ss.android.ugc.aweme.shortvideo.p3839l;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.api.DetailApi;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.music.C60789f;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.IPrivacyConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70661b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.p2082ss.android.ugc.aweme.shortvideo.p3792ae.C69800b;
import com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a.C72731b;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.musicprovider.C84125a;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.l.p */
public final class C71949p {

    /* renamed from: n */
    public static final C71950a f161227n = new C71950a((byte) 0);

    /* renamed from: a */
    public Activity f161228a;

    /* renamed from: b */
    public String f161229b = "";

    /* renamed from: c */
    public Aweme f161230c;

    /* renamed from: d */
    public ProgressDialogC74145d f161231d;

    /* renamed from: e */
    public int f161232e;

    /* renamed from: f */
    public final List<String> f161233f = new ArrayList();

    /* renamed from: g */
    public String f161234g;

    /* renamed from: h */
    public C69905c f161235h;

    /* renamed from: i */
    public int f161236i = 20;

    /* renamed from: j */
    public float f161237j;

    /* renamed from: k */
    public float f161238k;

    /* renamed from: l */
    public boolean f161239l;

    /* renamed from: m */
    public final Callable<C89391z> f161240m;

    /* renamed from: o */
    private String f161241o;

    /* renamed from: p */
    private String f161242p;

    /* renamed from: q */
    private final String f161243q = AVExternalServiceImpl.m113114a().configService().cacheConfig().cacheDir();

    /* renamed from: r */
    private final Handler f161244r = new Handler(Looper.getMainLooper());

    /* renamed from: s */
    private final AbstractC89244h f161245s = C89250i.m154773a((AbstractC89171a) new C71958i(this));

    static {
        Covode.recordClassIndex(84498);
    }

    /* renamed from: e */
    private final C60789f m127028e() {
        return (C60789f) this.f161245s.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.p$a */
    public static final class C71950a {
        static {
            Covode.recordClassIndex(84499);
        }

        private C71950a() {
        }

        public /* synthetic */ C71950a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.p$g */
    public static final class C71956g implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ C71949p f161253a;

        /* renamed from: b */
        final /* synthetic */ Intent f161254b;

        /* renamed from: c */
        final /* synthetic */ StitchParams f161255c;

        static {
            Covode.recordClassIndex(84505);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onDismiss() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onDismiss(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onOK() {
            IExternalService.ServiceLoadCallback.DefaultImpls.onOK(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onFailed() {
            this.f161253a.mo113598d();
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            this.f161253a.mo113598d();
            IRecordService recordService = asyncAVService.uiService().recordService();
            Activity activity = this.f161253a.f161228a;
            if (activity == null) {
                C89219l.m154715b();
            }
            recordService.startStitch(activity, this.f161254b, this.f161255c);
        }

        C71956g(C71949p pVar, Intent intent, StitchParams stitchParams) {
            this.f161253a = pVar;
            this.f161254b = intent;
            this.f161255c = stitchParams;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.p$l */
    public static final class RunnableC71961l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C71949p f161260a;

        static {
            Covode.recordClassIndex(84510);
        }

        RunnableC71961l(C71949p pVar) {
            this.f161260a = pVar;
        }

        public final void run() {
            if (this.f161260a.f161232e == 0) {
                this.f161260a.mo113596b();
            }
        }
    }

    /* renamed from: b */
    public final void mo113596b() {
        C1731i.m5640b(new CallableC71955f(this), C1731i.f5564c);
    }

    /* renamed from: d */
    public final void mo113598d() {
        try {
            ProgressDialogC74145d dVar = this.f161231d;
            if (dVar != null) {
                dVar.dismiss();
            }
        } catch (Exception unused) {
        }
        this.f161231d = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.p$b */
    public static final class C71951b implements AbstractC61065b {

        /* renamed from: a */
        final /* synthetic */ C71949p f161246a;

        /* renamed from: b */
        final /* synthetic */ Music f161247b;

        static {
            Covode.recordClassIndex(84500);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69324a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: b */
        public final void mo69328b() {
            C71949p pVar = this.f161246a;
            pVar.f161232e = 99 - pVar.f161236i;
            C1731i.m5640b(this.f161246a.f161240m, C1731i.f5564c);
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69326a(C84125a aVar) {
            C89219l.m154721d(aVar, "");
            this.f161246a.mo113596b();
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69325a(int i) {
            C71949p pVar = this.f161246a;
            pVar.f161232e = ((int) (((float) i) * pVar.f161238k)) + (99 - this.f161246a.f161236i);
            C1731i.m5640b(this.f161246a.f161240m, C1731i.f5564c);
        }

        C71951b(C71949p pVar, Music music) {
            this.f161246a = pVar;
            this.f161247b = music;
        }

        @Override // com.p2082ss.android.ugc.aweme.music.service.AbstractC61065b
        /* renamed from: a */
        public final void mo69327a(String str, MusicWaveBean musicWaveBean) {
            C89219l.m154721d(str, "");
            C71949p pVar = this.f161246a;
            C69905c a = C69800b.m123327a(this.f161247b.convertToMusicModel());
            a.path = str;
            pVar.f161235h = a;
            this.f161246a.mo113597c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.p$d */
    public static final class CallableC71953d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ Aweme f161250a;

        static {
            Covode.recordClassIndex(84502);
        }

        public CallableC71953d(Aweme aweme) {
            this.f161250a = aweme;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            IPrivacyConfig privacyConfig = AVExternalServiceImpl.m113114a().configService().privacyConfig();
            String aid = this.f161250a.getAid();
            C89219l.m154716b(aid, "");
            return privacyConfig.checkDuetReactPermission(aid, 2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.p$f */
    public static final class CallableC71955f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C71949p f161252a;

        static {
            Covode.recordClassIndex(84504);
        }

        CallableC71955f(C71949p pVar) {
            this.f161252a = pVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Activity activity = this.f161252a.f161228a;
            if (activity == null) {
                return null;
            }
            this.f161252a.mo113598d();
            new C23144b(activity).mo37640e(R.string.bba).mo37637b();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.p$h */
    static final class CallableC71957h<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C71949p f161256a;

        static {
            Covode.recordClassIndex(84506);
        }

        CallableC71957h(C71949p pVar) {
            this.f161256a = pVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ProgressDialogC74145d dVar = this.f161256a.f161231d;
            if (dVar != null) {
                int i = 99;
                if (this.f161256a.f161232e < 99) {
                    i = this.f161256a.f161232e;
                }
                dVar.setProgress(i);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.p$i */
    static final class C71958i extends AbstractC89220m implements AbstractC89171a<C60789f> {

        /* renamed from: a */
        final /* synthetic */ C71949p f161257a;

        static {
            Covode.recordClassIndex(84507);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71958i(C71949p pVar) {
            super(0);
            this.f161257a = pVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C60789f invoke() {
            Activity activity = this.f161257a.f161228a;
            if (activity == null) {
                C89219l.m154715b();
            }
            return new C60789f(activity, false, false, false, "stitch", 12);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.p$j */
    static final class CallableC71959j<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C71949p f161258a;

        static {
            Covode.recordClassIndex(84508);
        }

        CallableC71959j(C71949p pVar) {
            this.f161258a = pVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Aweme aweme = this.f161258a.f161230c;
            if (aweme == null) {
                C89219l.m154710a("mAweme");
            }
            return DetailApi.m82809a(aweme.getAid(), "", 0);
        }
    }

    public C71949p() {
        m127027a(20);
        this.f161240m = new CallableC71957h(this);
    }

    /* renamed from: c */
    public final void mo113597c() {
        String str;
        if (!C80580in.m139687c() && this.f161228a != null) {
            String uuid = UUID.randomUUID().toString();
            C89219l.m154716b(uuid, "");
            C33744d a = new C33744d().mo59983a("creation_id", uuid).mo59983a("shoot_way", "stitch");
            Aweme aweme = this.f161230c;
            if (aweme == null) {
                C89219l.m154710a("mAweme");
            }
            C39162r.m79460a("shoot", a.mo59983a("group_id", aweme.getAid()).mo59983a("enter_from", this.f161229b).mo59983a("enter_method", "click_stitch_button").mo59983a("content_source", "shoot").mo59983a("content_type", "video").f79943a);
            String str2 = this.f161234g;
            if (str2 == null) {
                C89219l.m154710a("mOutPath");
            }
            C69905c cVar = this.f161235h;
            String str3 = null;
            if (cVar != null) {
                str = cVar.getPath();
            } else {
                str = null;
            }
            boolean z = this.f161239l;
            Aweme aweme2 = this.f161230c;
            if (aweme2 == null) {
                C89219l.m154710a("mAweme");
            }
            User author = aweme2.getAuthor();
            Aweme aweme3 = this.f161230c;
            if (aweme3 == null) {
                C89219l.m154710a("mAweme");
            }
            String aid = aweme3.getAid();
            C69905c cVar2 = this.f161235h;
            if (cVar2 != null) {
                str3 = cVar2.getMusicId();
            }
            StitchParams stitchParams = new StitchParams(null, str2, cVar, str, 0, z, str3, author, aid, null, 0, null, null, false, false, 0, 0, 130576, null);
            Intent intent = new Intent();
            intent.putExtra("creation_id", uuid);
            intent.putExtra("shoot_way", "stitch");
            AVExternalServiceImpl.m113114a().asyncServiceWithOutPanel("stitch", new C71956g(this, intent, stitchParams));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0 == null) goto L_0x0024;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo113593a() {
        /*
        // Method dump skipped, instructions count: 366
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71949p.mo113593a():void");
    }

    /* renamed from: a */
    private final void m127027a(int i) {
        this.f161236i = i;
        float f = ((float) i) / 99.0f;
        this.f161238k = f;
        this.f161237j = 1.0f - f;
    }

    /* renamed from: a */
    public final void mo113594a(Music music) {
        if (this.f161239l) {
            C60789f e = m127028e();
            MusicModel convertToMusicModel = music.convertToMusicModel();
            C89219l.m154716b(convertToMusicModel, "");
            e.mo98201a(convertToMusicModel, new C71951b(this, music), false, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.p$k */
    static final class C71960k<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C71949p f161259a;

        static {
            Covode.recordClassIndex(84509);
        }

        C71960k(C71949p pVar) {
            this.f161259a = pVar;
        }

        @Override // p077b.AbstractC1729g
        public final Object then(C1731i<Aweme> iVar) {
            C89219l.m154721d(iVar, "");
            if (!iVar.mo5544c() && !iVar.mo5539b() && iVar.mo5545d() != null) {
                C71949p pVar = this.f161259a;
                Aweme d = iVar.mo5545d();
                C89219l.m154716b(d, "");
                pVar.f161230c = d;
            }
            this.f161259a.mo113593a();
            return null;
        }
    }

    /* renamed from: a */
    public final void mo113595a(String str) {
        Activity activity = this.f161228a;
        if (activity != null) {
            new C23144b(activity).mo37635a(str).mo37637b();
            mo113598d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.p$e */
    public static final class C71954e<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ C71949p f161251a;

        static {
            Covode.recordClassIndex(84503);
        }

        public C71954e(C71949p pVar) {
            this.f161251a = pVar;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            Resources resources;
            Resources resources2;
            C89219l.m154721d(iVar, "");
            String str = null;
            if (iVar.mo5544c() || iVar.mo5539b()) {
                C71949p pVar = this.f161251a;
                Activity activity = pVar.f161228a;
                if (activity == null || (resources = activity.getResources()) == null || (str = resources.getString(R.string.dcr)) == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(str, "");
                pVar.mo113595a(str);
            } else if (!((C70661b) iVar.mo5545d()).f158161a) {
                String str2 = ((C70661b) iVar.mo5545d()).f158164d;
                if (str2.length() == 0) {
                    Activity activity2 = this.f161251a.f161228a;
                    if (activity2 == null || (resources2 = activity2.getResources()) == null || (str = resources2.getString(R.string.g4y)) == null) {
                        C89219l.m154715b();
                    }
                    str2 = str;
                }
                this.f161251a.mo113595a(str2);
            } else {
                C71949p pVar2 = this.f161251a;
                Aweme aweme = pVar2.f161230c;
                if (aweme == null) {
                    C89219l.m154710a("mAweme");
                }
                if (!C80635y.m139809d(aweme)) {
                    C1731i.m5640b(new CallableC71959j(pVar2), C1731i.f5562a).mo5534a(new C71960k(pVar2), C1731i.f5564c, null);
                } else {
                    pVar2.mo113593a();
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.l.p$c */
    public static final class C71952c extends C72731b {

        /* renamed from: a */
        final /* synthetic */ C71949p f161248a;

        /* renamed from: b */
        final /* synthetic */ Aweme f161249b;

        static {
            Covode.recordClassIndex(84501);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a.AbstractC72729a
        /* renamed from: a */
        public final void mo113580a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            super.mo113580a(str, str2);
            C71949p pVar = this.f161248a;
            pVar.f161232e = 99 - pVar.f161236i;
            C1731i.m5640b(this.f161248a.f161240m, C1731i.f5564c);
            if (new File(str2).length() == 0) {
                C51423a.m95790a((Throwable) new Exception("WaterMarkComposer download file size == 0: " + this.f161248a.f161233f));
                this.f161248a.mo113596b();
                return;
            }
            this.f161248a.f161234g = str2;
            if (this.f161249b.getMusic() == null || !this.f161248a.f161239l) {
                this.f161248a.mo113597c();
                return;
            }
            C71949p pVar2 = this.f161248a;
            Music music = this.f161249b.getMusic();
            C89219l.m154716b(music, "");
            pVar2.mo113594a(music);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a.AbstractC72729a
        /* renamed from: a */
        public final void mo113579a(Exception exc, String str, Integer num) {
            super.mo113579a(exc, str, num);
            this.f161248a.mo113596b();
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.reaction.p3855a.AbstractC72729a
        /* renamed from: a */
        public final void mo113578a(int i, long j, long j2) {
            super.mo113578a(i, j, j2);
            if (this.f161248a.f161228a != null) {
                if (i > 99) {
                    i = 99;
                }
                C71949p pVar = this.f161248a;
                pVar.f161232e = (int) (((float) i) * pVar.f161237j);
                C1731i.m5640b(this.f161248a.f161240m, C1731i.f5564c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C71952c(C71949p pVar, Aweme aweme, List list, String str) {
            super(list, str);
            this.f161248a = pVar;
            this.f161249b = aweme;
        }
    }
}
