package com.p2082ss.android.ugc.aweme.tools.draft.ftc.p4106a;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1204m;
import androidx.viewpager.widget.PagerAdapter;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.account.model.AbstractC32846a;
import com.p2082ss.android.ugc.aweme.adaptation.C33398a;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70635dg;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.AbstractC78339f;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.C78341g;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.util.FTCPreviewSurfaceView;
import com.p2082ss.android.ugc.aweme.tools.draft.ftc.view.PeriscopeLayout;
import com.p2082ss.android.ugc.aweme.views.AlwaysMarqueeTextView;
import com.p2082ss.android.ugc.trill.R;
import dmt.p4542av.video.C88303z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.a.a */
public final class C78250a extends PagerAdapter {

    /* renamed from: a */
    public AbstractC32846a f175748a;

    /* renamed from: b */
    public final List<VideoPublishEditModel> f175749b = new ArrayList();

    /* renamed from: c */
    public final Map<Integer, C78251a> f175750c = new LinkedHashMap();

    /* renamed from: d */
    private boolean f175751d = true;

    /* renamed from: e */
    private final Context f175752e;

    /* renamed from: f */
    private final AbstractC1204m f175753f;

    /* renamed from: g */
    private final AbstractC89172b<AbstractC78339f, C89391z> f175754g;

    static {
        Covode.recordClassIndex(91365);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final boolean isViewFromObject(View view, Object obj) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(obj, "");
        return view == obj;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.a.a$a */
    public static final class C78251a {

        /* renamed from: a */
        public boolean f175755a = true;

        /* renamed from: b */
        public C88303z f175756b;

        /* renamed from: c */
        public long f175757c;

        /* renamed from: d */
        final AvatarImageView f175758d;

        /* renamed from: e */
        final ImageView f175759e;

        /* renamed from: f */
        public final AlwaysMarqueeTextView f175760f;

        /* renamed from: g */
        final SmartCircleImageView f175761g;

        /* renamed from: h */
        public final FrameLayout f175762h;

        /* renamed from: i */
        final TuxTextView f175763i;

        /* renamed from: j */
        final TuxTextView f175764j;

        /* renamed from: k */
        public final FrameLayout f175765k;

        /* renamed from: l */
        final View f175766l;

        /* renamed from: m */
        public final VideoPublishEditModel f175767m;

        /* renamed from: n */
        final AbstractC32846a f175768n;

        /* renamed from: o */
        public final AbstractC89172b<AbstractC78339f, C89391z> f175769o;

        /* renamed from: p */
        private final Handler f175770p = new Handler(Looper.getMainLooper());

        /* renamed from: q */
        private boolean f175771q;

        /* renamed from: r */
        private ValueAnimator f175772r;

        /* renamed from: s */
        private FTCPreviewSurfaceView f175773s;

        /* renamed from: t */
        private final PeriscopeLayout f175774t;

        /* renamed from: u */
        private final AbstractC1204m f175775u;

        static {
            Covode.recordClassIndex(91366);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.a.a$a$b */
        public static final class RunnableC78254b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C78251a f175778a;

            static {
                Covode.recordClassIndex(91369);
            }

            RunnableC78254b(C78251a aVar) {
                this.f175778a = aVar;
            }

            public final void run() {
                this.f175778a.f175760f.requestFocus();
            }
        }

        /* renamed from: a */
        public final C88303z mo122147a() {
            C88303z zVar = this.f175756b;
            if (zVar == null) {
                C89219l.m154710a("mPresenter");
            }
            return zVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo122149b() {
            if (!this.f175771q) {
                this.f175771q = true;
                m136742c();
                this.f175774t.mo122242a();
            }
        }

        /* renamed from: c */
        private final void m136742c() {
            ValueAnimator valueAnimator = this.f175772r;
            if (valueAnimator != null) {
                valueAnimator.end();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
                ofFloat.setDuration(8000L);
                ofFloat.setRepeatMode(1);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.setRepeatCount(-1);
                ofFloat.addUpdateListener(new C78255c(this));
                this.f175772r = ofFloat;
            }
            ValueAnimator valueAnimator2 = this.f175772r;
            if (valueAnimator2 != null) {
                valueAnimator2.start();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.a.a$a$a */
        static final class View$OnClickListenerC78253a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C78251a f175777a;

            static {
                Covode.recordClassIndex(91368);
            }

            View$OnClickListenerC78253a(C78251a aVar) {
                this.f175777a = aVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f175777a.f175769o.invoke(new AbstractC78339f.C78340a(this.f175777a.f175767m));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.tools.draft.ftc.a.a$a$c */
        public static final class C78255c implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C78251a f175779a;

            static {
                Covode.recordClassIndex(91370);
            }

            C78255c(C78251a aVar) {
                this.f175779a = aVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f175779a.f175757c > 64) {
                    this.f175779a.f175757c = currentTimeMillis;
                    FrameLayout frameLayout = this.f175779a.f175762h;
                    C89219l.m154716b(valueAnimator, "");
                    Object animatedValue = valueAnimator.getAnimatedValue();
                    Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                    frameLayout.setRotation(((Float) animatedValue).floatValue());
                }
            }
        }

        /* renamed from: a */
        private final void m136741a(VideoPublishEditModel videoPublishEditModel) {
            this.f175756b = new C88303z(videoPublishEditModel.videoEditorType);
            Context context = this.f175766l.getContext();
            C89219l.m154716b(context, "");
            AbstractC1204m mVar = this.f175775u;
            FTCPreviewSurfaceView fTCPreviewSurfaceView = this.f175773s;
            C88303z zVar = this.f175756b;
            if (zVar == null) {
                C89219l.m154710a("mPresenter");
            }
            C78341g.m136805a(context, mVar, fTCPreviewSurfaceView, zVar, videoPublishEditModel);
            FTCPreviewSurfaceView fTCPreviewSurfaceView2 = this.f175773s;
            int intValue = C78341g.m136804a(this.f175767m).getFirst().intValue();
            int intValue2 = C78341g.m136804a(this.f175767m).getSecond().intValue();
            if (fTCPreviewSurfaceView2 != null) {
                Context context2 = fTCPreviewSurfaceView2.getContext();
                int e = C70636dh.m124836e(context2);
                int b = C70636dh.m124831b(context2);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                int d = C70636dh.m124835d(context2);
                if (d != C33398a.f79357a.mo59451b()) {
                    C33398a.f79357a.mo59449a(d);
                }
                if (e * 9 > b * 16) {
                    e = C33398a.f79357a.mo59452b(C33398a.m68487c());
                }
                if (C70635dg.m124827a(intValue, intValue2)) {
                    layoutParams.width = (intValue * e) / intValue2;
                    layoutParams.height = e;
                    layoutParams.topMargin = 0;
                    layoutParams.leftMargin = (b - layoutParams.width) / 2;
                } else {
                    layoutParams.width = b;
                    layoutParams.height = (intValue2 * b) / intValue;
                    layoutParams.topMargin = ((e - layoutParams.height) / 2) + 0;
                    layoutParams.leftMargin = 0;
                }
                int i = Build.VERSION.SDK_INT;
                layoutParams.setMarginStart(layoutParams.leftMargin);
                fTCPreviewSurfaceView2.setLayoutParams(layoutParams);
            }
        }

        /* renamed from: a */
        public final void mo122148a(boolean z) {
            if (z) {
                C88303z zVar = this.f175756b;
                if (zVar == null) {
                    C89219l.m154710a("mPresenter");
                }
                zVar.mo142800e();
                mo122149b();
                this.f175770p.post(new RunnableC78254b(this));
                C39162r.m79461a("video_play", new C33743c().mo59976a("enter_from", "personal_homepage").mo59976a("group_id", this.f175767m.creationId).mo59976a("author_id", this.f175768n.mo58660c()).mo59977a());
            } else {
                if (this.f175771q) {
                    this.f175771q = false;
                    ValueAnimator valueAnimator = this.f175772r;
                    if (valueAnimator != null) {
                        valueAnimator.end();
                    }
                    PeriscopeLayout periscopeLayout = this.f175774t;
                    periscopeLayout.f175976k.removeCallbacksAndMessages(null);
                    periscopeLayout.f175976k.removeCallbacks(periscopeLayout.f175977l);
                    int childCount = periscopeLayout.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        periscopeLayout.mo122243a(periscopeLayout.getChildAt(i));
                    }
                }
                C88303z zVar2 = this.f175756b;
                if (zVar2 == null) {
                    C89219l.m154710a("mPresenter");
                }
                zVar2.mo142799d();
            }
            this.f175755a = z;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.tools.draft.ftc.util.f, h.z> */
        /* JADX WARN: Multi-variable type inference failed */
        public C78251a(View view, AbstractC1204m mVar, VideoPublishEditModel videoPublishEditModel, AbstractC32846a aVar, AbstractC89172b<? super AbstractC78339f, C89391z> bVar) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(mVar, "");
            C89219l.m154721d(videoPublishEditModel, "");
            C89219l.m154721d(aVar, "");
            C89219l.m154721d(bVar, "");
            this.f175766l = view;
            this.f175775u = mVar;
            this.f175767m = videoPublishEditModel;
            this.f175768n = aVar;
            this.f175769o = bVar;
            View findViewById = view.findViewById(R.id.d5p);
            C89219l.m154716b(findViewById, "");
            this.f175773s = (FTCPreviewSurfaceView) findViewById;
            View findViewById2 = view.findViewById(R.id.b0e);
            C89219l.m154716b(findViewById2, "");
            this.f175758d = (AvatarImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.b0f);
            C89219l.m154716b(findViewById3, "");
            this.f175759e = (ImageView) findViewById3;
            View findViewById4 = view.findViewById(R.id.ezo);
            C89219l.m154716b(findViewById4, "");
            this.f175760f = (AlwaysMarqueeTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.b0h);
            C89219l.m154716b(findViewById5, "");
            this.f175761g = (SmartCircleImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.cnm);
            C89219l.m154716b(findViewById6, "");
            this.f175762h = (FrameLayout) findViewById6;
            View findViewById7 = view.findViewById(R.id.ctt);
            C89219l.m154716b(findViewById7, "");
            this.f175774t = (PeriscopeLayout) findViewById7;
            View findViewById8 = view.findViewById(R.id.f6v);
            C89219l.m154716b(findViewById8, "");
            this.f175763i = (TuxTextView) findViewById8;
            View findViewById9 = view.findViewById(R.id.ev0);
            C89219l.m154716b(findViewById9, "");
            this.f175764j = (TuxTextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.b0b);
            C89219l.m154716b(findViewById10, "");
            this.f175765k = (FrameLayout) findViewById10;
            m136741a(videoPublishEditModel);
            view.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.tools.draft.ftc.p4106a.C78250a.C78251a.View$OnClickListenerC782521 */

                /* renamed from: a */
                final /* synthetic */ C78251a f175776a;

                static {
                    Covode.recordClassIndex(91367);
                }

                {
                    this.f175776a = r1;
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C78251a aVar = this.f175776a;
                    aVar.mo122148a(!aVar.f175755a);
                }
            });
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final int getCount() {
        return this.f175749b.size();
    }

    /* renamed from: a */
    public final C78251a mo122146a(int i) {
        return this.f175750c.get(Integer.valueOf(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final Object instantiateItem(ViewGroup viewGroup, int i) {
        String str;
        String str2;
        MethodCollector.m26663i(8718);
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(LayoutInflater.from(this.f175752e), R.layout.adi, viewGroup, false);
        viewGroup.addView(a);
        if (!this.f175750c.containsKey(Integer.valueOf(i))) {
            C89219l.m154716b(a, "");
            AbstractC1204m mVar = this.f175753f;
            VideoPublishEditModel videoPublishEditModel = this.f175749b.get(i);
            AbstractC32846a aVar = this.f175748a;
            if (aVar == null) {
                C89219l.m154710a("userData");
            }
            this.f175750c.put(Integer.valueOf(i), new C78251a(a, mVar, videoPublishEditModel, aVar, this.f175754g));
        }
        C78251a aVar2 = this.f175750c.get(Integer.valueOf(i));
        if (aVar2 != null) {
            boolean z = this.f175751d;
            aVar2.f175759e.setOnClickListener(new C78251a.View$OnClickListenerC78253a(aVar2));
            AlwaysMarqueeTextView alwaysMarqueeTextView = aVar2.f175760f;
            VideoPublishEditModel videoPublishEditModel2 = aVar2.f175767m;
            Context context = aVar2.f175766l.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            AbstractC32846a aVar3 = aVar2.f175768n;
            C69905c originalRecordMusic = videoPublishEditModel2.getOriginalRecordMusic();
            if (originalRecordMusic == null || (str = originalRecordMusic.musicName) == null) {
                str = context.getResources().getString(R.string.dm3);
                C89219l.m154716b(str, "");
            }
            C69905c originalRecordMusic2 = videoPublishEditModel2.getOriginalRecordMusic();
            UrlModel urlModel = null;
            if ((originalRecordMusic2 == null || (str2 = originalRecordMusic2.authorName) == null) && (aVar3 == null || (str2 = aVar3.mo58658a()) == null)) {
                str2 = "";
            }
            alwaysMarqueeTextView.setText(str + '-' + str2);
            C69905c originalRecordMusic3 = aVar2.f175767m.getOriginalRecordMusic();
            if (originalRecordMusic3 != null) {
                urlModel = originalRecordMusic3.coverThumb;
            }
            C20766v a2 = C20761r.m39060a(C34735v.m70965a(urlModel)).mo34176a(C34728n.m70946a(27.0d), C34728n.m70946a(27.0d));
            a2.f49098K = true;
            a2.f49092E = aVar2.f175761g;
            a2.mo34186c();
            aVar2.mo122149b();
            C34577e.m70592a(aVar2.f175758d, aVar2.f175768n.mo58664g());
            aVar2.f175763i.setText("@" + aVar2.f175768n.mo58658a());
            if (!TextUtils.isEmpty(aVar2.f175767m.title)) {
                aVar2.f175764j.setVisibility(0);
                aVar2.f175764j.setText(aVar2.f175767m.title);
            }
            if (!z) {
                C88303z zVar = aVar2.f175756b;
                if (zVar == null) {
                    C89219l.m154710a("mPresenter");
                }
                zVar.mo142799d();
            }
        }
        this.f175751d = false;
        C89219l.m154716b(a, "");
        MethodCollector.m26664o(8718);
        return a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: h.f.a.b<? super com.ss.android.ugc.aweme.tools.draft.ftc.util.f, h.z> */
    /* JADX WARN: Multi-variable type inference failed */
    public C78250a(Context context, AbstractC1204m mVar, AbstractC89172b<? super AbstractC78339f, C89391z> bVar) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(bVar, "");
        this.f175752e = context;
        this.f175753f = mVar;
        this.f175754g = bVar;
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        C88303z a;
        MethodCollector.m26663i(8856);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(obj, "");
        if (this.f175750c.containsKey(Integer.valueOf(i))) {
            C78251a aVar = this.f175750c.get(Integer.valueOf(i));
            if (!(aVar == null || (a = aVar.mo122147a()) == null)) {
                a.mo142796b();
            }
            this.f175750c.remove(Integer.valueOf(i));
        }
        viewGroup.removeView((View) obj);
        MethodCollector.m26664o(8856);
    }
}
