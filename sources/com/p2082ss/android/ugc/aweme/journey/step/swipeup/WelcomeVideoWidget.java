package com.p2082ss.android.ugc.aweme.journey.step.swipeup;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.journey.step.swipeup.C57038e;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.aweme.p2303ae.C33419a;
import com.p2082ss.android.ugc.aweme.utils.C80311cq;
import com.p2082ss.android.ugc.aweme.video.p4211e.C80721a;
import com.p2082ss.android.ugc.playerkit.videoview.C84294j;
import com.p2082ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.p2082ss.android.ugc.trill.R;
import java.io.File;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89516am;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89561bs;
import kotlinx.coroutines.C89624i;
import p078c.p080b.C1756d;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4603c.C89134h;
import p4600h.p4603c.p4604a.C89099b;
import p4600h.p4603c.p4604a.EnumC89098a;
import p4600h.p4603c.p4605b.p4606a.AbstractC89118k;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.WelcomeVideoWidget */
public final class WelcomeVideoWidget extends Widget implements AbstractC33974au, C57038e.AbstractC57040b {

    /* renamed from: a */
    public final int f129817a;

    /* renamed from: h */
    RemoteImageView f129818h;

    /* renamed from: i */
    View f129819i;

    /* renamed from: j */
    C57038e f129820j;

    /* renamed from: k */
    String f129821k;

    /* renamed from: l */
    public boolean f129822l;

    /* renamed from: m */
    public final String f129823m;

    /* renamed from: n */
    final Integer f129824n;

    /* renamed from: o */
    final boolean f129825o;

    /* renamed from: p */
    final float f129826p;

    /* renamed from: q */
    final boolean f129827q;

    /* renamed from: r */
    private boolean f129828r;

    static {
        Covode.recordClassIndex(66908);
    }

    @Override // com.p2082ss.android.ugc.aweme.journey.step.swipeup.C57038e.AbstractC57040b
    /* renamed from: a */
    public final void mo94178a() {
        this.f129828r = true;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onPause() {
        super.onPause();
        if ((!this.f129827q || !this.f129828r) && this.f129822l) {
            C57038e eVar = this.f129820j;
            if (eVar == null) {
                C89219l.m154710a("mWelcomeVideoHolder");
            } else {
                eVar.mo94194e();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onResume() {
        super.onResume();
        if ((!this.f129827q || !this.f129828r) && this.f129822l) {
            C57038e eVar = this.f129820j;
            if (eVar == null) {
                C89219l.m154710a("mWelcomeVideoHolder");
            } else {
                eVar.mo94193d();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    public final void onDestroy() {
        super.onDestroy();
        if (this.f129822l) {
            C57038e eVar = this.f129820j;
            if (eVar == null) {
                C89219l.m154710a("mWelcomeVideoHolder");
                return;
            }
            eVar.f129871e = false;
            int i = eVar.f129870d.f113577a;
            if (i == 1 || i == 2 || i == 4) {
                C57022a aVar = eVar.f129869c;
                if (aVar == null) {
                    C89219l.m154710a("mPlayVideoHelper");
                }
                aVar.f129837b.mo80280a(aVar.f129838c);
                aVar.f129837b.mo129275i();
                aVar.f129837b.mo129269c();
                aVar.f129837b.mo129270d();
                eVar.f129870d.f113577a = 0;
                eVar.mo94190a();
            }
        }
    }

    /* renamed from: a */
    private static File m103363a(Context context) {
        if (C58016d.f132220a != null && C58016d.f132224e) {
            return C58016d.f132220a;
        }
        File externalCacheDir = context.getExternalCacheDir();
        C58016d.f132220a = externalCacheDir;
        return externalCacheDir;
    }

    @Override // com.p2082ss.android.ugc.aweme.arch.widgets.base.Widget
    /* renamed from: a */
    public final void mo60206a(View view) {
        MethodCollector.m26663i(6770);
        super.mo60206a(view);
        LayoutInflater from = LayoutInflater.from(this.f80270b);
        if (view != null) {
            from.inflate(R.layout.bjw, (ViewGroup) view);
            AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, C33419a.f79451a, null, new C57021b(this, view, null), 2);
            MethodCollector.m26664o(6770);
            return;
        }
        NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        MethodCollector.m26664o(6770);
        throw nullPointerException;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.WelcomeVideoWidget$a */
    public static final class C57020a extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        int f129829a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89124d f129830b;

        /* renamed from: c */
        final /* synthetic */ WelcomeVideoWidget f129831c;

        static {
            Covode.recordClassIndex(66909);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57020a(AbstractC89124d dVar, AbstractC89124d dVar2, WelcomeVideoWidget welcomeVideoWidget) {
            super(2, dVar2);
            this.f129830b = dVar;
            this.f129831c = welcomeVideoWidget;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C57020a(this.f129830b, dVar, this.f129831c);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C57020a) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            String str;
            if (this.f129829a == 0) {
                C89382r.m154942a(obj);
                Context context = this.f129831c.f80270b;
                String str2 = this.f129831c.f129823m;
                Context a = C17867d.m33078a();
                if (C58016d.f132220a == null || !C58016d.f132224e) {
                    C58016d.f132220a = a.getExternalCacheDir();
                }
                File file = C58016d.f132220a;
                if (file == null || (str = file.getAbsolutePath()) == null) {
                    str = "";
                }
                File file2 = new File(str);
                if (file2.exists() || file2.mkdirs()) {
                    File file3 = new File(file2.getAbsoluteFile() + "/" + str2);
                    file3.exists();
                    if (C80311cq.m139222a(context, str2, file3)) {
                        file3.getAbsolutePath();
                    }
                }
                this.f129830b.resumeWith(C89379q.m157068constructorimpl(true));
                return C89391z.f203057a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.journey.step.swipeup.WelcomeVideoWidget$b */
    static final class C57021b extends AbstractC89118k implements AbstractC89183m<AbstractC89516am, AbstractC89124d<? super C89391z>, Object> {

        /* renamed from: a */
        Object f129832a;

        /* renamed from: b */
        int f129833b;

        /* renamed from: c */
        final /* synthetic */ WelcomeVideoWidget f129834c;

        /* renamed from: d */
        final /* synthetic */ View f129835d;

        static {
            Covode.recordClassIndex(66910);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57021b(WelcomeVideoWidget welcomeVideoWidget, View view, AbstractC89124d dVar) {
            super(2, dVar);
            this.f129834c = welcomeVideoWidget;
            this.f129835d = view;
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final AbstractC89124d<C89391z> create(Object obj, AbstractC89124d<?> dVar) {
            C89219l.m154721d(dVar, "");
            return new C57021b(this.f129834c, this.f129835d, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final Object invoke(AbstractC89516am amVar, AbstractC89124d<? super C89391z> dVar) {
            return ((C57021b) create(amVar, dVar)).invokeSuspend(C89391z.f203057a);
        }

        @Override // p4600h.p4603c.p4605b.p4606a.AbstractC89107a
        public final Object invokeSuspend(Object obj) {
            WelcomeVideoWidget welcomeVideoWidget;
            Video video;
            EnumC89098a aVar = EnumC89098a.COROUTINE_SUSPENDED;
            int i = this.f129833b;
            UrlModel urlModel = null;
            if (i == 0) {
                C89382r.m154942a(obj);
                welcomeVideoWidget = this.f129834c;
                this.f129832a = welcomeVideoWidget;
                this.f129833b = 1;
                C89134h hVar = new C89134h(C89099b.m154605a(this));
                if (TextUtils.isEmpty(welcomeVideoWidget.f129821k)) {
                    hVar.resumeWith(C89379q.m157068constructorimpl(false));
                } else if ((C1756d.m5895b(C17867d.m33078a()) / 1024) / 1024 > ((long) welcomeVideoWidget.f129817a)) {
                    AbstractC89568bz unused = C89624i.m155555a(C89561bs.f203280a, null, null, new C57020a(hVar, null, welcomeVideoWidget), 3);
                } else {
                    hVar.resumeWith(C89379q.m157068constructorimpl(false));
                }
                obj = hVar.mo143576a();
                if (obj == EnumC89098a.COROUTINE_SUSPENDED) {
                    C89219l.m154721d(this, "");
                }
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                welcomeVideoWidget = (WelcomeVideoWidget) this.f129832a;
                C89382r.m154942a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            welcomeVideoWidget.f129822l = ((Boolean) obj).booleanValue();
            if (this.f129834c.f129822l) {
                WelcomeVideoWidget welcomeVideoWidget2 = this.f129834c;
                View findViewById = this.f129835d.findViewById(R.id.fc5);
                C89219l.m154716b(findViewById, "");
                welcomeVideoWidget2.f129819i = findViewById;
                View view = welcomeVideoWidget2.f129819i;
                if (view == null) {
                    C89219l.m154710a("mVideoContainer");
                }
                welcomeVideoWidget2.f129820j = new C57038e(view, welcomeVideoWidget2, welcomeVideoWidget2.f129827q);
                C57038e eVar = welcomeVideoWidget2.f129820j;
                if (eVar == null) {
                    C89219l.m154710a("mWelcomeVideoHolder");
                }
                Aweme a = C80721a.m139945a(welcomeVideoWidget2.f129821k);
                Integer num = welcomeVideoWidget2.f129824n;
                boolean z = welcomeVideoWidget2.f129825o;
                float f = welcomeVideoWidget2.f129826p;
                C89219l.m154721d(a, "");
                eVar.f129873g = true;
                eVar.f129872f = a;
                if (eVar.f129870d.f113577a == 2) {
                    C57022a aVar2 = eVar.f129869c;
                    if (aVar2 == null) {
                        C89219l.m154710a("mPlayVideoHelper");
                    }
                    aVar2.f129837b.mo129267b();
                }
                eVar.f129870d.f113577a = 0;
                C57022a aVar3 = eVar.f129869c;
                if (aVar3 == null) {
                    C89219l.m154710a("mPlayVideoHelper");
                }
                C89219l.m154721d(a, "");
                aVar3.f129836a = a;
                Aweme aweme = eVar.f129872f;
                if (!(aweme == null || aweme.getVideo() == null)) {
                    VideoViewComponent videoViewComponent = eVar.f129867a;
                    if (videoViewComponent == null) {
                        C89219l.m154710a("mVideoView");
                    }
                    C84294j jVar = videoViewComponent.f188405b;
                    C89219l.m154716b(jVar, "");
                    if (jVar.mo129311a() instanceof TextureView) {
                        VideoViewComponent videoViewComponent2 = eVar.f129867a;
                        if (videoViewComponent2 == null) {
                            C89219l.m154710a("mVideoView");
                        }
                        videoViewComponent2.f188405b.mo129312a(new C57038e.C57041c(eVar, z, f));
                    }
                    VideoViewComponent videoViewComponent3 = eVar.f129867a;
                    if (videoViewComponent3 == null) {
                        C89219l.m154710a("mVideoView");
                    }
                    C84294j jVar2 = videoViewComponent3.f188405b;
                    C89219l.m154716b(jVar2, "");
                    if (jVar2.mo129311a() instanceof SurfaceView) {
                        VideoViewComponent videoViewComponent4 = eVar.f129867a;
                        if (videoViewComponent4 == null) {
                            C89219l.m154710a("mVideoView");
                        }
                        C84294j jVar3 = videoViewComponent4.f188405b;
                        C89219l.m154716b(jVar3, "");
                        View a2 = jVar3.mo129311a();
                        Objects.requireNonNull(a2, "null cannot be cast to non-null type android.view.SurfaceView");
                        ((SurfaceView) a2).getHolder().addCallback(new C57038e.SurfaceHolder$CallbackC57042d());
                    }
                }
                if (!eVar.f129873g) {
                    RemoteImageView remoteImageView = eVar.f129868b;
                    if (remoteImageView == null) {
                        C89219l.m154710a("mCoverView");
                    }
                    Aweme aweme2 = eVar.f129872f;
                    if (!(aweme2 == null || (video = aweme2.getVideo()) == null)) {
                        urlModel = video.getOriginCover();
                    }
                    C34577e.m70592a(remoteImageView, urlModel);
                } else if (num != null) {
                    int intValue = num.intValue();
                    RemoteImageView remoteImageView2 = eVar.f129868b;
                    if (remoteImageView2 == null) {
                        C89219l.m154710a("mCoverView");
                    }
                    C34577e.m70591a(remoteImageView2, intValue);
                }
                eVar.mo94190a();
                C57038e eVar2 = welcomeVideoWidget2.f129820j;
                if (eVar2 == null) {
                    C89219l.m154710a("mWelcomeVideoHolder");
                }
                eVar2.mo94192c();
            } else {
                WelcomeVideoWidget welcomeVideoWidget3 = this.f129834c;
                ViewGroup viewGroup = (ViewGroup) this.f129835d;
                Integer num2 = welcomeVideoWidget3.f129824n;
                if (num2 != null) {
                    int intValue2 = num2.intValue();
                    View findViewById2 = viewGroup.findViewById(R.id.e72);
                    C89219l.m154716b(findViewById2, "");
                    welcomeVideoWidget3.f129818h = (RemoteImageView) findViewById2;
                    RemoteImageView remoteImageView3 = welcomeVideoWidget3.f129818h;
                    if (remoteImageView3 == null) {
                        C89219l.m154710a("mStaticCover");
                    }
                    remoteImageView3.setVisibility(0);
                    RemoteImageView remoteImageView4 = welcomeVideoWidget3.f129818h;
                    if (remoteImageView4 == null) {
                        C89219l.m154710a("mStaticCover");
                    }
                    C34577e.m70591a(remoteImageView4, intValue2);
                }
            }
            return C89391z.f203057a;
        }
    }

    private WelcomeVideoWidget(String str, Integer num) {
        String str2 = "";
        C89219l.m154721d(str, str2);
        this.f129823m = str;
        this.f129824n = num;
        this.f129825o = false;
        this.f129826p = 1.7777778f;
        this.f129827q = false;
        this.f129817a = 10;
        Context a = C17867d.m33078a();
        if (m103363a(a) != null) {
            StringBuilder sb = new StringBuilder();
            File a2 = m103363a(a);
            if (a2 == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(a2, str2);
            str2 = sb.append(a2.getAbsolutePath()).append(File.separator).append(str).toString();
        }
        this.f129821k = str2;
    }

    public /* synthetic */ WelcomeVideoWidget(String str, Integer num, byte b) {
        this(str, num);
    }
}
