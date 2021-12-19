package com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34164k;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.AbstractC34259f;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchPlayerCore;
import com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchVideoView;
import com.p2082ss.android.ugc.aweme.discover.alading.p2764a.AbstractC41814c;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.feed.widget.LinearGradientDraweeView;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51043a;
import com.p2082ss.android.ugc.aweme.flowfeed.p2993a.AbstractC51044b;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.search.activity.SearchResultActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.p3837j.C71904j;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.f */
public final class View$OnAttachStateChangeListenerC34123f extends AbstractC34164k implements View.OnAttachStateChangeListener {

    /* renamed from: y */
    static final float f80675y = 1.7777778f;

    /* renamed from: z */
    public static final C34125a f80676z = new C34125a((byte) 0);

    /* renamed from: a */
    public boolean f80677a;

    /* renamed from: b */
    public AbstractC41814c f80678b;

    /* renamed from: c */
    public AwemeRawAd f80679c;

    /* renamed from: d */
    final SearchVideoView f80680d;

    /* renamed from: e */
    public final LinearGradientDraweeView f80681e;

    /* renamed from: f */
    final TuxTextView f80682f;

    /* renamed from: g */
    final TuxTextView f80683g;

    /* renamed from: l */
    final SmartCircleImageView f80684l;

    /* renamed from: m */
    final TuxTextView f80685m;

    /* renamed from: n */
    final View f80686n;

    /* renamed from: o */
    public final LinearGradientDraweeView f80687o;

    /* renamed from: p */
    final ConstraintLayout f80688p;

    /* renamed from: q */
    public boolean f80689q;

    /* renamed from: r */
    final C34126b f80690r = new C34126b(this);

    /* renamed from: s */
    int f80691s;

    /* renamed from: t */
    int f80692t;

    /* renamed from: u */
    boolean f80693u;

    /* renamed from: v */
    boolean f80694v;

    /* renamed from: w */
    public final View f80695w;

    /* renamed from: x */
    final AbstractC34259f f80696x;

    public final void onViewAttachedToWindow(View view) {
    }

    public final void onViewDetachedFromWindow(View view) {
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.f$a */
    public static final class C34125a {
        static {
            Covode.recordClassIndex(41059);
        }

        private C34125a() {
        }

        public /* synthetic */ C34125a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34164k
    /* renamed from: j */
    public final /* bridge */ /* synthetic */ ImageView mo60357j() {
        return this.f80681e;
    }

    @Override // com.p2082ss.android.ugc.aweme.autoplay.p2348d.AbstractC34164k
    /* renamed from: l */
    public final SearchVideoView mo60359l() {
        return this.f80680d;
    }

    static {
        Covode.recordClassIndex(41057);
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.d.a.f$b */
    public static final class C34126b implements SearchVideoView.AbstractC34237b {

        /* renamed from: a */
        final /* synthetic */ View$OnAttachStateChangeListenerC34123f f80698a;

        static {
            Covode.recordClassIndex(41060);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C34126b(View$OnAttachStateChangeListenerC34123f fVar) {
            this.f80698a = fVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.autoplay.player.video.SearchVideoView.AbstractC34237b
        /* renamed from: a */
        public final void mo60415a(C71904j jVar) {
            C89219l.m154721d(jVar, "");
            if (jVar.f161106c == 0) {
                this.f80698a.f80689q = true;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnAttachStateChangeListenerC34123f(View view, AbstractC51043a aVar, C51060g gVar, AbstractC51044b bVar, View view2, AbstractC34259f fVar) {
        super(view, aVar, gVar, bVar);
        SearchPlayerCore core;
        AbstractC84293i surfaceHolder;
        C89219l.m154721d(view, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(gVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(view2, "");
        C89219l.m154721d(fVar, "");
        this.f80695w = view2;
        this.f80696x = fVar;
        SearchVideoView searchVideoView = (SearchVideoView) view.findViewById(R.id.fe8);
        C89219l.m154716b(searchVideoView, "");
        this.f80680d = searchVideoView;
        LinearGradientDraweeView linearGradientDraweeView = (LinearGradientDraweeView) view.findViewById(R.id.afn);
        C89219l.m154716b(linearGradientDraweeView, "");
        this.f80681e = linearGradientDraweeView;
        this.f80682f = (TuxTextView) view.findViewById(R.id.dal);
        this.f80683g = (TuxTextView) view.findViewById(R.id.c8p);
        this.f80684l = (SmartCircleImageView) view.findViewById(R.id.n2);
        this.f80685m = (TuxTextView) view.findViewById(R.id.n4);
        this.f80686n = view.findViewById(R.id.bfw);
        this.f80687o = (LinearGradientDraweeView) view.findViewById(R.id.bfx);
        this.f80688p = (ConstraintLayout) view.findViewById(R.id.uk);
        this.f80691s = C13628n.m24504a(view.getContext());
        this.f80692t = C13628n.m24521b(view.getContext());
        mo60347a(new C34122e(mo60348g(), searchVideoView));
        view.addOnAttachStateChangeListener(this);
        if (!(aVar.mo60504h() == null || (core = searchVideoView.getCore()) == null || (surfaceHolder = core.getSurfaceHolder()) == null)) {
            surfaceHolder.mo129312a(aVar.mo60504h());
        }
        C17873f.m33095c().mo143289d(new AbstractC88433f(this) {
            /* class com.p2082ss.android.ugc.aweme.autoplay.p2348d.p2349a.View$OnAttachStateChangeListenerC34123f.C341241 */

            /* renamed from: a */
            final /* synthetic */ View$OnAttachStateChangeListenerC34123f f80697a;

            static {
                Covode.recordClassIndex(41058);
            }

            {
                this.f80697a = r1;
            }

            @Override // p4560f.p4561a.p4567d.AbstractC88433f
            public final /* synthetic */ void accept(Object obj) {
                if (obj instanceof SearchResultActivity) {
                    this.f80697a.f80680d.mo60631e();
                }
            }
        });
    }
}
