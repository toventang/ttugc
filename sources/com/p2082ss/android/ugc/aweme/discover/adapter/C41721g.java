package com.p2082ss.android.ugc.aweme.discover.adapter;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34593a;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a;
import com.p2082ss.android.ugc.aweme.discover.p2771f.C41948f;
import com.p2082ss.android.ugc.aweme.discover.p2771f.C41951g;
import com.p2082ss.android.ugc.aweme.discover.tooltip.AbstractC42534b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51428b;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.p2359ay.C34363c;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.g */
public final class C41721g extends AbstractC39054a {

    /* renamed from: e */
    public static final AbstractC89244h f97334e = C89250i.m154773a((AbstractC89171a) C41724b.f97344a);

    /* renamed from: f */
    public static final AbstractC89244h f97335f = C89250i.m154773a((AbstractC89171a) C41725c.f97345a);

    /* renamed from: g */
    public static final C41723a f97336g = new C41723a((byte) 0);

    /* renamed from: a */
    public AbstractC35500d f97337a;

    /* renamed from: b */
    public int f97338b;

    /* renamed from: c */
    public int f97339c;

    /* renamed from: d */
    public final AbstractC42534b f97340d;

    /* renamed from: h */
    private final View f97341h;

    /* renamed from: i */
    private final View f97342i;

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.g$a */
    public static final class C41723a {
        static {
            Covode.recordClassIndex(49636);
        }

        /* renamed from: a */
        public static boolean m83686a() {
            return ((Boolean) C41721g.f97334e.getValue()).booleanValue();
        }

        /* renamed from: b */
        public static boolean m83687b() {
            return ((Boolean) C41721g.f97335f.getValue()).booleanValue();
        }

        private C41723a() {
        }

        public /* synthetic */ C41723a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a
    /* renamed from: b */
    public final int[] mo62380b() {
        return C80397em.m139369a(200);
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.g$b */
    static final class C41724b extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C41724b f97344a = new C41724b();

        static {
            Covode.recordClassIndex(49637);
        }

        C41724b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(C62845i.m113257a());
        }
    }

    /* renamed from: h */
    private static boolean m83678h() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.adapter.g$c */
    static final class C41725c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C41725c f97345a = new C41725c();

        static {
            Covode.recordClassIndex(49638);
        }

        C41725c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            boolean z;
            if (Build.VERSION.SDK_INT >= 23) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(C34593a.m70629a("aweme_app", "use_dynamic_cover", z));
        }
    }

    static {
        Covode.recordClassIndex(49634);
    }

    /* renamed from: i */
    private static boolean m83679i() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean h = m83678h();
        C58029j.f132253e = h;
        return h;
    }

    /* renamed from: j */
    private static boolean m83680j() {
        boolean z;
        if (!C34593a.m70628a("aweme_app", "use_dynamic_cover")) {
            return C41723a.m83687b();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        return C34593a.m70631b("aweme_app", "use_dynamic_cover", z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0025, code lost:
        if (com.p2082ss.android.ugc.aweme.framework.p3008c.C51426a.m95802a(r0.getContext()) != false) goto L_0x0027;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m83677f() {
        /*
            r3 = this;
            boolean r0 = com.p2082ss.android.ugc.aweme.discover.adapter.C41721g.C41723a.m83686a()
            r2 = 0
            if (r0 == 0) goto L_0x0008
            return r2
        L_0x0008:
            android.view.View r0 = r3.itemView
            java.lang.String r1 = ""
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            r0.getContext()
            boolean r0 = m83679i()
            if (r0 == 0) goto L_0x0027
            android.view.View r0 = r3.itemView
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r1)
            android.content.Context r0 = r0.getContext()
            boolean r0 = com.p2082ss.android.ugc.aweme.framework.p3008c.C51426a.m95802a(r0)
            if (r0 == 0) goto L_0x002f
        L_0x0027:
            boolean r0 = m83680j()
            if (r0 == 0) goto L_0x002f
            r0 = 1
            return r0
        L_0x002f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.adapter.C41721g.m83677f():boolean");
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: c */
    public final void mo62381c() {
        if (this.f92231m != null) {
            Object obj = this.f92231m;
            C89219l.m154716b(obj, "");
            Video video = ((Aweme) obj).getVideo();
            if (video == null) {
                return;
            }
            if (C41951g.m83990a()) {
                if (mo67791a(video, "CoverViewHolder", Bitmap.Config.ARGB_8888)) {
                    this.f92233o = true;
                } else {
                    mo67789a(video.getCover(), "CoverViewHolder", Bitmap.Config.ARGB_8888);
                }
            } else if (mo67790a(video, "CoverViewHolder")) {
                this.f92233o = true;
            } else {
                mo67788a(video.getCover(), "CoverViewHolder");
            }
        }
    }

    /* renamed from: a */
    public final void mo67806a(Aweme aweme, int i) {
        if (aweme != null) {
            super.mo67806a((Object) aweme, i);
            this.f92231m = aweme;
            AbstractC39054a.m79277a(this.f97341h, this.f97339c, this.f97338b);
            mo62381c();
            if (C80635y.m139811f(aweme)) {
                this.f97342i.setVisibility(0);
            } else {
                this.f97342i.setVisibility(8);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a
    /* renamed from: a */
    public final boolean mo67791a(Video video, String str, Bitmap.Config config) {
        if (!C41948f.m83988a().f97839a) {
            return super.mo67791a(video, str, config);
        }
        if (!m83677f()) {
            return false;
        }
        SmartImageView smartImageView = this.f92232n;
        C89219l.m154716b(smartImageView, "");
        if (video == null) {
            C89219l.m154715b();
        }
        if (str == null) {
            C89219l.m154715b();
        }
        if (C34363c.m70317a(smartImageView, video, str, true, this.f92225k, (String) null, true, config, true)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41721g(AbstractC42534b bVar, View view, AbstractC35500d dVar) {
        super(view);
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(view, "");
        this.f97337a = dVar;
        this.f97340d = bVar;
        this.f97338b = C51428b.m95803a(view.getContext(), 133.0f);
        this.f97339c = C51428b.m95803a(view.getContext(), 100.0f);
        View findViewById = view.findViewById(R.id.dnk);
        C89219l.m154716b(findViewById, "");
        this.f97341h = findViewById;
        this.f92232n = (SmartImageView) view.findViewById(R.id.im);
        this.f92232n.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.adapter.C41721g.View$OnClickListenerC417221 */

            /* renamed from: a */
            final /* synthetic */ C41721g f97343a;

            static {
                Covode.recordClassIndex(49635);
            }

            {
                this.f97343a = r1;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                AbstractC35500d dVar = this.f97343a.f97337a;
                if (dVar != null) {
                    dVar.mo62403a(view, (Aweme) this.f97343a.f92231m, null);
                }
                this.f97343a.f97340d.mo70806l();
            }
        });
        if (C16048b.m29633a().mo25421a(true, "stop_main_anim_when_invisible", false)) {
            this.f92232n.setAnimationListener(this.f92226l);
        }
        if (Build.VERSION.SDK_INT >= 23) {
            SmartImageView smartImageView = this.f92232n;
            C89219l.m154716b(smartImageView, "");
            SmartImageView smartImageView2 = this.f92232n;
            C89219l.m154716b(smartImageView2, "");
            smartImageView.setForeground(smartImageView2.getContext().getDrawable(R.drawable.a5d));
        } else {
            C62023a.m112168a(this.f92232n);
        }
        View findViewById2 = view.findViewById(R.id.fc9);
        C89219l.m154716b(findViewById2, "");
        this.f97342i = findViewById2;
        findViewById2.setVisibility(8);
    }
}
