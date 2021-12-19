package com.p2082ss.android.ugc.aweme.main.replace;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.C13607d;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.app.p2324e.C33730a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.detail.api.DetailApi;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p2082ss.android.ugc.aweme.main.replace.C59118c;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.services.AsyncAVService;
import com.p2082ss.android.ugc.aweme.services.IExternalService;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.ChangeBanMusicConfig;
import com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService;
import com.p2082ss.android.ugc.aweme.shortvideo.view.ProgressDialogC74145d;
import com.p2082ss.android.ugc.aweme.video.C80720e;
import com.p2082ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.main.replace.d */
public final class C59121d {

    /* renamed from: o */
    public static final C59122a f134530o = new C59122a((byte) 0);

    /* renamed from: a */
    public Activity f134531a;

    /* renamed from: b */
    String f134532b = "";

    /* renamed from: c */
    public ProgressDialogC74145d f134533c;

    /* renamed from: d */
    public int f134534d;

    /* renamed from: e */
    final List<String> f134535e = new ArrayList();

    /* renamed from: f */
    public String f134536f;

    /* renamed from: g */
    public String f134537g;

    /* renamed from: h */
    public String f134538h;

    /* renamed from: i */
    public final String f134539i = AVExternalServiceImpl.m113114a().configService().cacheConfig().cacheDir();

    /* renamed from: j */
    final Handler f134540j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    public int f134541k = 20;

    /* renamed from: l */
    float f134542l;

    /* renamed from: m */
    public final Callable<C89391z> f134543m = new CallableC59129f(this);

    /* renamed from: n */
    public final IRecordService.UICallback f134544n = new C59130g(this);

    static {
        Covode.recordClassIndex(69475);
    }

    /* renamed from: com.ss.android.ugc.aweme.main.replace.d$a */
    public static final class C59122a {
        static {
            Covode.recordClassIndex(69476);
        }

        private C59122a() {
        }

        public /* synthetic */ C59122a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.replace.d$e */
    public static final class C59127e implements IExternalService.ServiceLoadCallback {

        /* renamed from: a */
        final /* synthetic */ C59121d f134552a;

        /* renamed from: b */
        final /* synthetic */ String f134553b;

        /* renamed from: c */
        final /* synthetic */ Aweme f134554c;

        static {
            Covode.recordClassIndex(69481);
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
            this.f134552a.mo96631a(true);
        }

        /* renamed from: com.ss.android.ugc.aweme.main.replace.d$e$a */
        static final class CallableC59128a<V> implements Callable {

            /* renamed from: a */
            final /* synthetic */ C59127e f134555a;

            static {
                Covode.recordClassIndex(69482);
            }

            CallableC59128a(C59127e eVar) {
                this.f134555a = eVar;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.f134555a.f134552a.mo96631a(false);
                this.f134555a.f134552a.f134533c = ProgressDialogC74145d.m130371a(C59121d.m108615a(this.f134555a.f134552a), C59121d.m108615a(this.f134555a.f134552a).getResources().getString(R.string.fvf));
                ProgressDialogC74145d dVar = this.f134555a.f134552a.f134533c;
                if (dVar == null) {
                    return null;
                }
                dVar.setIndeterminate(true);
                return C89391z.f203057a;
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C89219l.m154721d(asyncAVService, "");
            C1731i.m5640b(new CallableC59128a(this), C1731i.f5564c);
            String str = this.f134552a.f134536f;
            if (str == null) {
                C89219l.m154710a("mOutPath");
            }
            String str2 = this.f134552a.f134537g;
            if (str2 == null) {
                C89219l.m154710a("mTempMp4Path");
            }
            String str3 = this.f134552a.f134538h;
            if (str3 == null) {
                C89219l.m154710a("mTempWavPath");
            }
            ChangeBanMusicConfig changeBanMusicConfig = new ChangeBanMusicConfig(str, str2, str3, this.f134553b);
            changeBanMusicConfig.setOutputDir(this.f134552a.f134539i);
            asyncAVService.uiService().recordService().startChangeBanMusic(this.f134554c, C59121d.m108615a(this.f134552a), changeBanMusicConfig, this.f134552a.f134544n);
        }

        C59127e(C59121d dVar, String str, Aweme aweme) {
            this.f134552a = dVar;
            this.f134553b = str;
            this.f134554c = aweme;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.replace.d$g */
    public static final class C59130g implements IRecordService.UICallback {

        /* renamed from: a */
        final /* synthetic */ C59121d f134557a;

        static {
            Covode.recordClassIndex(69484);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService.UICallback
        public final void preFail(int i) {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService.UICallback
        public final void preSuccess() {
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService.UICallback
        public final boolean checkIsCanceled() {
            return IRecordService.UICallback.DefaultImpls.checkIsCanceled(this);
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService.UICallback
        public final void postFail() {
            this.f134557a.mo96632b();
        }

        @Override // com.p2082ss.android.ugc.aweme.services.external.p3712ui.IRecordService.UICallback
        public final void postSuccess() {
            this.f134557a.mo96631a(true);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C59130g(C59121d dVar) {
            this.f134557a = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.replace.d$h */
    static final class RunnableC59131h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C59121d f134558a;

        static {
            Covode.recordClassIndex(69485);
        }

        RunnableC59131h(C59121d dVar) {
            this.f134558a = dVar;
        }

        public final void run() {
            if (this.f134558a.f134534d == 0) {
                this.f134558a.mo96632b();
            }
        }
    }

    /* renamed from: b */
    public final void mo96632b() {
        C1731i.m5640b(new CallableC59126d(this), C1731i.f5564c);
    }

    /* renamed from: com.ss.android.ugc.aweme.main.replace.d$c */
    static final class RunnableC59124c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C59121d f134547a;

        /* renamed from: b */
        final /* synthetic */ String f134548b;

        static {
            Covode.recordClassIndex(69478);
        }

        RunnableC59124c(C59121d dVar, String str) {
            this.f134547a = dVar;
            this.f134548b = str;
        }

        public final void run() {
            try {
                final Aweme a = DetailApi.m82809a(this.f134548b, "", 0);
                C29339a.m58754b(new Runnable(this) {
                    /* class com.p2082ss.android.ugc.aweme.main.replace.C59121d.RunnableC59124c.RunnableC591251 */

                    /* renamed from: a */
                    final /* synthetic */ RunnableC59124c f134549a;

                    static {
                        Covode.recordClassIndex(69479);
                    }

                    {
                        this.f134549a = r1;
                    }

                    public final void run() {
                        Aweme aweme;
                        if (C59121d.m108615a(this.f134549a.f134547a) == null || (aweme = a) == null) {
                            this.f134549a.f134547a.mo96631a(true);
                        } else if (aweme.getAuthor() == null) {
                            this.f134549a.f134547a.mo96631a(true);
                        } else {
                            Aweme aweme2 = a;
                            if (aweme2 == null) {
                                this.f134549a.f134547a.mo96631a(true);
                                return;
                            }
                            if (aweme2.getStatus() != null) {
                                AwemeStatus status = a.getStatus();
                                C89219l.m154716b(status, "");
                                if (status.isPrivate()) {
                                    this.f134549a.f134547a.mo96631a(true);
                                    return;
                                }
                            }
                            if (a.getStatus() != null) {
                                AwemeStatus status2 = a.getStatus();
                                C89219l.m154716b(status2, "");
                                if (status2.isDelete()) {
                                    this.f134549a.f134547a.mo96631a(true);
                                    return;
                                }
                            }
                            C59121d dVar = this.f134549a.f134547a;
                            Aweme aweme3 = a;
                            Video video = aweme3.getVideo();
                            C89219l.m154716b(video, "");
                            VideoUrlModel playAddrH264 = video.getPlayAddrH264();
                            if (playAddrH264 == null || playAddrH264.getUrlList().isEmpty()) {
                                dVar.mo96631a(true);
                                return;
                            }
                            List<String> list = dVar.f134535e;
                            List<String> a = C89070n.m154516a(playAddrH264.getUrlList().get(0));
                            ArrayList arrayList = new ArrayList();
                            for (String str : a) {
                                String a2 = C33730a.m69052a(aweme3, str);
                                if (a2 != null) {
                                    arrayList.add(a2);
                                }
                            }
                            list.addAll(arrayList);
                            String b = C13607d.m24442b(playAddrH264.getBitRatedRatioUri());
                            dVar.f134536f = dVar.f134539i + b + ".mp4";
                            dVar.f134537g = dVar.f134539i + "temp_" + b + ".mp4";
                            dVar.f134538h = dVar.f134539i + "temp_" + b + ".wav";
                            String str2 = dVar.f134536f;
                            if (str2 == null) {
                                C89219l.m154710a("mOutPath");
                            }
                            if (!C80720e.m139927b(str2)) {
                                C80720e.m139917a(dVar.f134539i, false);
                                dVar.f134534d = 0;
                                String str3 = dVar.f134539i;
                                String str4 = b + ".mp4";
                                String aid = aweme3.getAid();
                                List<String> list2 = dVar.f134535e;
                                C59123b bVar = new C59123b(dVar, aweme3, dVar.f134535e, "replace_music");
                                C89219l.m154721d(list2, "");
                                String str5 = (str3 == null || !C89361p.m154876c(str3, "/", false)) ? str3 + File.separator + str4 : str3 + str4;
                                if (!LocalVideoPlayerManager.m140055a().mo123961a(aid, str5, new C59118c.C59119a(bVar, str5, list2, str3, str4))) {
                                    C59118c.m108612a(list2, str3, str4, bVar);
                                }
                            } else {
                                dVar.f134541k = 99;
                                dVar.f134542l = 1.0f;
                                dVar.mo96630a(aweme3);
                            }
                            dVar.f134540j.postDelayed(new RunnableC59131h(dVar), 60000);
                        }
                    }
                });
            } catch (Exception unused) {
                this.f134547a.mo96632b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.replace.d$f */
    static final class CallableC59129f<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C59121d f134556a;

        static {
            Covode.recordClassIndex(69483);
        }

        CallableC59129f(C59121d dVar) {
            this.f134556a = dVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ProgressDialogC74145d dVar = this.f134556a.f134533c;
            if (dVar != null) {
                int i = 99;
                if (this.f134556a.f134534d < 99) {
                    i = this.f134556a.f134534d;
                }
                dVar.setProgress(i);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static boolean m108616a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.main.replace.d$d */
    public static final class CallableC59126d<V> implements Callable {

        /* renamed from: a */
        final /* synthetic */ C59121d f134551a;

        static {
            Covode.recordClassIndex(69480);
        }

        CallableC59126d(C59121d dVar) {
            this.f134551a = dVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            if (C59121d.m108615a(this.f134551a) != null) {
                this.f134551a.mo96631a(true);
                new C23144b(C59121d.m108615a(this.f134551a)).mo37640e(R.string.bba).mo37637b();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ Activity m108615a(C59121d dVar) {
        Activity activity = dVar.f134531a;
        if (activity == null) {
            C89219l.m154710a("mContext");
        }
        return activity;
    }

    /* renamed from: a */
    public final void mo96630a(Aweme aweme) {
        if (this.f134531a == null) {
            C89219l.m154710a("mContext");
            return;
        }
        String uuid = UUID.randomUUID().toString();
        C89219l.m154716b(uuid, "");
        AVExternalServiceImpl.m113114a().asyncServiceWithOutPanel("replace_music", new C59127e(this, uuid, aweme));
    }

    /* renamed from: a */
    public final void mo96631a(boolean z) {
        if (z) {
            try {
                if (this.f134531a == null) {
                    C89219l.m154710a("mContext");
                } else {
                    Activity activity = this.f134531a;
                    if (activity == null) {
                        C89219l.m154710a("mContext");
                    }
                    activity.finish();
                }
            } catch (Exception unused) {
            }
        }
        ProgressDialogC74145d dVar = this.f134533c;
        if (dVar != null) {
            dVar.dismiss();
        }
        this.f134533c = null;
    }

    /* renamed from: com.ss.android.ugc.aweme.main.replace.d$b */
    public static final class C59123b extends C59117b {

        /* renamed from: d */
        final /* synthetic */ C59121d f134545d;

        /* renamed from: e */
        final /* synthetic */ Aweme f134546e;

        static {
            Covode.recordClassIndex(69477);
        }

        @Override // com.p2082ss.android.ugc.aweme.main.replace.AbstractC59115a
        /* renamed from: a */
        public final void mo96627a(String str, String str2) {
            C89219l.m154721d(str, "");
            C89219l.m154721d(str2, "");
            super.mo96627a(str, str2);
            C59121d dVar = this.f134545d;
            dVar.f134534d = 99 - dVar.f134541k;
            C1731i.m5640b(this.f134545d.f134543m, C1731i.f5564c);
            if (new File(str2).length() == 0) {
                this.f134545d.mo96632b();
                return;
            }
            this.f134545d.f134536f = str2;
            this.f134545d.mo96630a(this.f134546e);
        }

        @Override // com.p2082ss.android.ugc.aweme.main.replace.AbstractC59115a
        /* renamed from: a */
        public final void mo96626a(Exception exc, String str, Integer num) {
            super.mo96626a(exc, str, num);
            this.f134545d.mo96632b();
        }

        @Override // com.p2082ss.android.ugc.aweme.main.replace.AbstractC59115a
        /* renamed from: a */
        public final void mo96625a(int i, long j, long j2) {
            super.mo96625a(i, j, j2);
            if (C59121d.m108615a(this.f134545d) != null && i >= this.f134545d.f134534d) {
                this.f134545d.f134534d = i;
                C1731i.m5640b(this.f134545d.f134543m, C1731i.f5564c);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C59123b(C59121d dVar, Aweme aweme, List list, String str) {
            super(list, str);
            this.f134545d = dVar;
            this.f134546e = aweme;
        }
    }
}
