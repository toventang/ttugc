package com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget;

import android.animation.ValueAnimator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3341a.C57435a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a;
import com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.PeriscopeLayout;
import com.p2082ss.android.ugc.aweme.music.model.Music;
import com.p2082ss.android.ugc.aweme.performance.AbstractC62844h;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.MusicCoverWidget */
public final class MusicCoverWidget extends AbsFeedWidget {

    /* renamed from: a */
    public static final C57427a f130921a = new C57427a((byte) 0);

    static {
        Covode.recordClassIndex(67353);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.MusicCoverWidget$a */
    public static final class C57427a {
        static {
            Covode.recordClassIndex(67354);
        }

        private C57427a() {
        }

        public /* synthetic */ C57427a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.MusicCoverWidget$b */
    public static final class C57428b extends AbstractC57436a implements AbstractC1214u<C33942b> {

        /* renamed from: a */
        public FrameLayout f130922a;

        /* renamed from: b */
        public long f130923b;

        /* renamed from: c */
        final /* synthetic */ View f130924c;

        /* renamed from: j */
        private SmartCircleImageView f130925j;

        /* renamed from: k */
        private PeriscopeLayout f130926k;

        /* renamed from: l */
        private boolean f130927l;

        /* renamed from: m */
        private ValueAnimator f130928m;

        static {
            Covode.recordClassIndex(67355);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: b */
        public final String mo94694b() {
            return "music_cover";
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94687a() {
            m104076d();
        }

        /* renamed from: g */
        private final void m104078g() {
            PeriscopeLayout periscopeLayout = this.f130926k;
            if (periscopeLayout != null) {
                periscopeLayout.mo94815b();
            }
        }

        /* renamed from: d */
        private final void m104076d() {
            if (this.f130927l) {
                this.f130927l = false;
                m104077e();
                m104078g();
            }
        }

        /* renamed from: e */
        private final void m104077e() {
            ValueAnimator valueAnimator;
            if (this.f130922a != null && (valueAnimator = this.f130928m) != null) {
                valueAnimator.end();
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: c */
        public final Map<String, String> mo94700c() {
            String str;
            Music music;
            HashMap hashMap = new HashMap();
            Aweme aweme = this.f130950d;
            if (aweme == null || (music = aweme.getMusic()) == null || (str = music.getMid()) == null) {
                str = "";
            }
            hashMap.put("music_id", str);
            return hashMap;
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94690a(DataCenter dataCenter) {
            DataCenter a;
            DataCenter a2;
            if (dataCenter != null && (a = dataCenter.mo60189a("start_animation", (AbstractC1214u<C33942b>) this)) != null && (a2 = a.mo60189a("pause_animation", (AbstractC1214u<C33942b>) this)) != null) {
                a2.mo60189a("stop_animation", (AbstractC1214u<C33942b>) this);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.feedwidget.MusicCoverWidget$b$a */
        static final class C57429a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C57428b f130929a;

            static {
                Covode.recordClassIndex(67356);
            }

            C57429a(C57428b bVar) {
                this.f130929a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - this.f130929a.f130923b > 64) {
                    this.f130929a.f130923b = currentTimeMillis;
                    FrameLayout frameLayout = this.f130929a.f130922a;
                    if (frameLayout != null) {
                        C89219l.m154716b(valueAnimator, "");
                        Object animatedValue = valueAnimator.getAnimatedValue();
                        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                        frameLayout.setRotation(((Float) animatedValue).floatValue());
                    }
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94689a(View view) {
            MethodCollector.m26663i(7234);
            if (view instanceof FrameLayout) {
                FrameLayout frameLayout = (FrameLayout) view;
                View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.acu, (ViewGroup) null);
                this.f130922a = (FrameLayout) inflate.findViewById(R.id.cnm);
                this.f130925j = (SmartCircleImageView) inflate.findViewById(R.id.cnl);
                this.f130926k = (PeriscopeLayout) inflate.findViewById(R.id.ctt);
                frameLayout.addView(inflate);
            }
            MethodCollector.m26664o(7234);
        }

        @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.p3342b.AbstractC57436a
        /* renamed from: a */
        public final void mo94691a(C57435a aVar) {
            Music music;
            Music music2;
            super.mo94691a(aVar);
            this.f130927l = false;
            Aweme aweme = this.f130950d;
            UrlModel urlModel = null;
            if (aweme != null && (music = aweme.getMusic()) != null && music.getCoverThumb() != null) {
                Aweme aweme2 = this.f130950d;
                if (!(aweme2 == null || (music2 = aweme2.getMusic()) == null)) {
                    urlModel = music2.getCoverThumb();
                }
                C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel)).mo34176a(C34728n.m70946a(27.0d), C34728n.m70946a(27.0d));
                a.f49098K = true;
                C20766v a2 = a.mo34179a("MusicCoverWidget");
                a2.f49092E = this.f130925j;
                a2.mo34186c();
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(C33942b bVar) {
            C33942b bVar2 = bVar;
            if (bVar2 != null) {
                String str = bVar2.f80277a;
                int hashCode = str.hashCode();
                if (hashCode != -463583257) {
                    if (hashCode != -301890681) {
                        if (hashCode == 64864379 && str.equals("pause_animation") && this.f130927l) {
                            this.f130927l = false;
                            m104077e();
                            PeriscopeLayout periscopeLayout = this.f130926k;
                            if (periscopeLayout != null) {
                                periscopeLayout.mo94816c();
                                periscopeLayout.f131231k.removeCallbacks(periscopeLayout.f131232l);
                                periscopeLayout.mo94813a();
                            }
                        }
                    } else if (str.equals("stop_animation")) {
                        m104076d();
                    }
                } else if (str.equals("start_animation") && !this.f130927l) {
                    this.f130927l = true;
                    if (this.f130922a != null) {
                        ValueAnimator valueAnimator = this.f130928m;
                        if (valueAnimator != null) {
                            valueAnimator.end();
                        } else {
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
                            ofFloat.setDuration(8000L);
                            ofFloat.setRepeatMode(1);
                            ofFloat.setInterpolator(new LinearInterpolator());
                            ofFloat.setRepeatCount(-1);
                            ofFloat.addUpdateListener(new C57429a(this));
                            this.f130928m = ofFloat;
                        }
                        ValueAnimator valueAnimator2 = this.f130928m;
                        if (valueAnimator2 != null) {
                            valueAnimator2.start();
                        }
                    }
                    PeriscopeLayout periscopeLayout2 = this.f130926k;
                    if (periscopeLayout2 != null) {
                        C62845i.m113256a(new AbstractC62844h() {
                            /* class com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget.PeriscopeLayout.C575172 */

                            /* renamed from: a */
                            final /* synthetic */ int f131246a = 3000;

                            /* renamed from: b */
                            final /* synthetic */ int f131247b = 800;

                            static {
                                Covode.recordClassIndex(67459);
                            }

                            @Override // com.p2082ss.android.ugc.aweme.performance.AbstractC62844h
                            /* renamed from: a */
                            public final void mo85806a() {
                                PeriscopeLayout.this.f131230j = this.f131246a;
                                PeriscopeLayout periscopeLayout = PeriscopeLayout.this;
                                periscopeLayout.f131229i = this.f131247b;
                                periscopeLayout.f131231k.removeCallbacksAndMessages(null);
                                periscopeLayout.f131231k.postDelayed(periscopeLayout.f131232l, (long) (periscopeLayout.f131225e.nextInt(4) * 100));
                            }
                        });
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C57428b(View view, View view2) {
            super(view2);
            this.f130924c = view;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.kids.commonfeed.feedwidget.AbsFeedWidget
    /* renamed from: b */
    public final AbstractC57436a mo94686b(View view) {
        return new C57428b(view, view);
    }
}
