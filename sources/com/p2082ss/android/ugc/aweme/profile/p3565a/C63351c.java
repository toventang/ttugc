package com.p2082ss.android.ugc.aweme.profile.p3565a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.SharePrefCache;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38167al;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a;
import com.p2082ss.android.ugc.aweme.detail.transition.C41333b;
import com.p2082ss.android.ugc.aweme.discover.p2771f.C41951g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50545m;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.login.p3424b.C58956a;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.profile.C63808i;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.profile.a.c */
public final class C63351c extends AbstractC39054a {

    /* renamed from: A */
    private View f143819A;

    /* renamed from: B */
    private TextView f143820B;

    /* renamed from: C */
    private View f143821C;

    /* renamed from: D */
    private Drawable f143822D;

    /* renamed from: E */
    private boolean f143823E = true;

    /* renamed from: F */
    private C63808i f143824F = new C63808i();

    /* renamed from: G */
    private View f143825G;

    /* renamed from: a */
    public String f143826a;

    /* renamed from: b */
    public String f143827b = "";

    /* renamed from: c */
    public boolean f143828c = false;

    /* renamed from: d */
    public int f143829d = 0;

    /* renamed from: e */
    public int f143830e = 0;

    /* renamed from: f */
    private Context f143831f;

    /* renamed from: g */
    private TextView f143832g;

    /* renamed from: h */
    private TextView f143833h;

    /* renamed from: i */
    private FrameLayout f143834i;

    /* renamed from: j */
    private View f143835j;

    /* renamed from: q */
    private View f143836q;

    /* renamed from: r */
    private TuxIconView f143837r;

    /* renamed from: s */
    private TuxTextView f143838s;

    /* renamed from: t */
    private TuxTextView f143839t;

    /* renamed from: u */
    private ImageView f143840u;

    /* renamed from: v */
    private TuxIconView f143841v;

    /* renamed from: w */
    private ViewGroup f143842w;

    /* renamed from: x */
    private View f143843x;

    /* renamed from: y */
    private View f143844y;

    /* renamed from: z */
    private TextView f143845z;

    static {
        Covode.recordClassIndex(74642);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: c */
    public final void mo62381c() {
        mo101991f();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a
    /* renamed from: b */
    public final int[] mo62380b() {
        return C80397em.m139369a(200);
    }

    /* renamed from: h */
    private void m114950h() {
        this.f143823E = true;
        this.f143820B.setVisibility(8);
        this.f143839t.setVisibility(8);
        this.f143842w.setVisibility(0);
        if (this.f143843x.getVisibility() == 0) {
            this.f143843x.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final void mo101991f() {
        if (this.f92231m != null) {
            Video video = ((Aweme) this.f92231m).getVideo();
            if (video == null || !video.isCallback()) {
                m114949d((Aweme) this.f92231m);
            } else {
                m114945a(video);
            }
        }
    }

    /* renamed from: a */
    public static void m114942a(Aweme aweme) {
        if (aweme != null) {
            boolean z = C38167al.m77380a().f90149b;
        }
    }

    /* renamed from: b */
    private void m114947b(Aweme aweme) {
        this.f143838s.setVisibility(0);
        m114941a(this.f143838s, C0643b.m2369a(this.f143831f, 2131231737));
        this.f143838s.setText(new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Long.valueOf(aweme.getScheduleTime() * 1000)));
        this.f143838s.setTuxFont(72);
    }

    /* renamed from: c */
    private void m114948c(Aweme aweme) {
        if (this.f143843x.getVisibility() == 0) {
            this.f143841v.setVisibility(8);
        } else if (this.f143837r.getVisibility() == 0) {
            this.f143841v.setVisibility(8);
        } else if (C80635y.m139806a(aweme)) {
            this.f143841v.setVisibility(0);
        } else {
            this.f143841v.setVisibility(8);
        }
    }

    /* renamed from: d */
    private void m114949d(Aweme aweme) {
        Bitmap.Config config;
        UrlModel a = this.f143824F.mo102372a(aweme.getAid());
        if (a == null || a.getUrlList().size() == 0 || TextUtils.isEmpty(a.getUrlList().get(0))) {
            m114945a(aweme.getVideo());
            return;
        }
        if (C41951g.m83990a()) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = null;
        }
        mo67789a(a, "AwemeViewHolder", config);
    }

    /* renamed from: a */
    private void m114945a(Video video) {
        Bitmap.Config config;
        if (video != null) {
            Bitmap.Config config2 = null;
            if (C41951g.m83990a()) {
                config = Bitmap.Config.ARGB_8888;
            } else {
                config = null;
            }
            if (mo67791a(video, "AwemeViewHolder", config)) {
                this.f92233o = true;
            } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty(video.getCover().getUrlList().get(0))) {
                this.f92232n.setImageResource(R.color.j);
            } else {
                UrlModel cover = video.getCover();
                if (C41951g.m83990a()) {
                    config2 = Bitmap.Config.ARGB_8888;
                }
                mo67789a(cover, "AwemeViewHolder", config2);
            }
        }
    }

    /* renamed from: a */
    private void m114946a(String str) {
        this.f143838s.setVisibility(0);
        m114941a(this.f143838s, C0643b.m2369a(this.f143831f, 2131233453));
        this.f143838s.setText(str);
        this.f143838s.setTuxFont(72);
    }

    /* renamed from: a */
    private static void m114941a(TextView textView, Drawable drawable) {
        if (textView != null) {
            int i = Build.VERSION.SDK_INT;
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
    }

    /* renamed from: a */
    private void m114943a(Aweme aweme, boolean z, int i) {
        if (z && i == 0 && C50545m.m94762a(aweme)) {
            if (!C13603b.m24435a((Collection) aweme.getGeofencingRegions())) {
                ImageView imageView = this.f143840u;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    return;
                }
                return;
            }
            ImageView imageView2 = this.f143840u;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
    }

    public C63351c(View view, String str, final AbstractC35500d dVar) {
        super(view);
        this.f143831f = view.getContext();
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.p2082ss.android.ugc.aweme.profile.p3565a.C63351c.View$OnAttachStateChangeListenerC633521 */

            static {
                Covode.recordClassIndex(74643);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            public final void onViewAttachedToWindow(View view) {
                if (C63351c.this.f92231m != null && TextUtils.equals(((Aweme) C63351c.this.f92231m).getAid(), C63351c.this.f143827b) && !C63351c.this.f143828c && C63351c.this.f143830e == 0) {
                    C39162r.m79460a("just_watched_video_show", new C33744d().mo59983a("enter_from", "others_homepage").mo59983a("request_id", ((Aweme) C63351c.this.f92231m).getRequestId()).mo59983a("group_id", ((Aweme) C63351c.this.f92231m).getAid()).mo59983a("author_id", ((Aweme) C63351c.this.f92231m).getAuthorUid()).mo59980a("order", C63351c.this.f143829d + 1).f79943a);
                }
            }
        });
        this.f143826a = str;
        this.f143835j = view.findViewById(R.id.acf);
        this.f143836q = view.findViewById(R.id.d4t);
        this.f92232n = (SmartImageView) view.findViewById(R.id.afn);
        this.f143838s = (TuxTextView) view.findViewById(R.id.f18);
        this.f143832g = (TextView) view.findViewById(R.id.f6_);
        this.f143833h = (TextView) view.findViewById(R.id.euu);
        this.f143834i = (FrameLayout) view.findViewById(R.id.b47);
        this.f143837r = (TuxIconView) view.findViewById(R.id.fd3);
        this.f143840u = (ImageView) view.findViewById(R.id.fcl);
        this.f143841v = (TuxIconView) view.findViewById(R.id.fc0);
        this.f143839t = (TuxTextView) view.findViewById(R.id.d_j);
        this.f143842w = (ViewGroup) view.findViewById(R.id.fcx);
        this.f143844y = view.findViewById(R.id.e67);
        this.f143845z = (TextView) view.findViewById(R.id.e65);
        this.f143820B = (TextView) view.findViewById(R.id.eeq);
        this.f143843x = view.findViewById(R.id.cif);
        this.f143825G = view.findViewById(R.id.c1o);
        this.f92232n.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.profile.p3565a.C63351c.View$OnClickListenerC633532 */

            static {
                Covode.recordClassIndex(74644);
            }

            public final void onClick(View view) {
                AbstractC35500d dVar;
                ClickAgent.onClick(view);
                if (C63351c.this.f92231m != null && (dVar = dVar) != null) {
                    dVar.mo62403a(view, (Aweme) C63351c.this.f92231m, C63351c.this.f143826a);
                }
            }
        });
        this.f92232n.setAnimationListener(this.f92226l);
        this.f143819A = view.findViewById(R.id.fc9);
        this.f143821C = view.findViewById(R.id.c2r);
    }

    /* renamed from: a */
    private void m114944a(Aweme aweme, boolean z, int i, boolean z2) {
        if (!z2 || (((!z || i != 0) && !C50545m.m94762a(aweme)) || aweme.getStatus().getPrivateStatus() == 0)) {
            this.f143837r.setVisibility(8);
            return;
        }
        this.f143837r.setVisibility(0);
        if (aweme.getStatus().getPrivateStatus() == 1) {
            this.f143837r.setIconRes(R.raw.icon_lock_small);
        } else if (aweme.getStatus().getPrivateStatus() == 2) {
            this.f143837r.setIconRes(R.raw.icon_two_person);
        }
    }

    /* renamed from: a */
    public final void mo101990a(Aweme aweme, int i, boolean z, boolean z2, int i2, String str) {
        if (aweme != null && this.f92232n != null) {
            this.f92231m = aweme;
            this.f143827b = str;
            this.f143828c = z2;
            this.f143829d = i;
            this.f143830e = i2;
            m114950h();
            if (C41333b.f96464a && this.f92231m != null) {
                C0792v.m2752a(this.f92232n, ((Aweme) this.f92231m).getAid());
            }
            if (!TextUtils.equals(aweme.getAid(), str) || z2 || i2 != 0) {
                this.f143825G.setVisibility(8);
            } else {
                this.f143825G.setVisibility(0);
            }
            if (((Aweme) this.f92231m).isProhibited() && C59208ac.m108774h((Aweme) this.f92231m)) {
                this.f143839t.setVisibility(0);
                this.f143842w.setVisibility(8);
                this.f143843x.setVisibility(0);
                this.f143839t.setTuxFont(73);
                if (!TextUtils.isEmpty(((Aweme) this.f92231m).getCoverNotice())) {
                    this.f143839t.setText(((Aweme) this.f92231m).getCoverNotice());
                } else {
                    C33830n.m69192a("notice_content_empty", "", new C33743c().mo59976a(StringSet.type, "cover_notice").mo59976a("log_id", ((Aweme) this.f92231m).getRequestId()).mo59976a("item_id", ((Aweme) this.f92231m).getAid()).mo59977a());
                }
            }
            AwemeStatistics statistics = aweme.getStatistics();
            if (aweme.getIsTop() == 1 && i2 == 0) {
                this.f143832g.setVisibility(0);
            } else {
                this.f143832g.setVisibility(8);
            }
            if (aweme.getCommerceVideoAuthInfo() == null || aweme.getCommerceVideoAuthInfo().getDarkPostStatus() != 1) {
                this.f143833h.setVisibility(8);
                this.f143834i.setVisibility(8);
            } else {
                this.f143833h.setVisibility(0);
                this.f143834i.setVisibility(0);
            }
            boolean booleanValue = SharePrefCache.inst().getIsPrivateAvailable().mo59941c().booleanValue();
            if (aweme.isScheduleVideo()) {
                m114947b(aweme);
            } else {
                long j = 0;
                if (!z2 || i2 != 0) {
                    if (statistics != null) {
                        j = statistics.getPlayCount();
                    }
                    m114946a(C53437b.m98615a(j));
                } else {
                    this.f143838s.setVisibility(0);
                    if (statistics != null) {
                        j = statistics.getPlayCount();
                    }
                    String a = C53437b.m98615a(j);
                    if (this.f143822D == null) {
                        this.f143822D = C0643b.m2369a(this.f143831f, 2131233453);
                    }
                    m114941a(this.f143838s, this.f143822D);
                    this.f143838s.setText(a);
                    this.f143838s.setTextColor(C0643b.m2378c(this.f143831f, R.color.l));
                    this.f143838s.setTuxFont(72);
                }
            }
            m114944a(aweme, z2, i2, booleanValue);
            m114943a(aweme, z2, i2);
            m114948c(aweme);
            if (C58956a.m108315a(aweme)) {
                this.f143838s.setVisibility(4);
            }
            if (z) {
                mo101991f();
                if (!C38167al.m77380a().mo66466a(aweme.getAid())) {
                    C38167al.m77380a().mo66467b(aweme.getAid());
                    m114942a(aweme);
                }
            }
            if (Build.VERSION.SDK_INT >= 23) {
                this.f92232n.setForeground(this.itemView.getContext().getDrawable(R.drawable.b7_));
            } else {
                C62023a.m112168a(this.f92232n);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                this.f92232n.setForeground(this.itemView.getContext().getDrawable(R.drawable.b7_));
            } else {
                C62023a.m112168a(this.f92232n);
            }
            if (C80635y.m139811f((Aweme) this.f92231m)) {
                this.f143819A.setVisibility(0);
            } else {
                this.f143819A.setVisibility(8);
            }
        }
    }
}
