package com.p2082ss.android.ugc.aweme.kids.common.p3331ui.p3332a;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.utils.C80537hk;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.common.ui.a.c */
public final class C57364c extends AbstractC57358a {

    /* renamed from: d */
    public static final C57366a f130758d = new C57366a((byte) 0);

    /* renamed from: b */
    public final String f130759b;

    /* renamed from: c */
    public final AbstractC57367d f130760c;

    /* renamed from: e */
    private final boolean f130761e;

    static {
        Covode.recordClassIndex(67282);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.common.ui.a.c$a */
    public static final class C57366a {
        static {
            Covode.recordClassIndex(67284);
        }

        private C57366a() {
        }

        public /* synthetic */ C57366a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C57364c m103977a(ViewGroup viewGroup, String str, AbstractC57367d dVar, boolean z) {
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(str, "");
            C89219l.m154721d(dVar, "");
            View a = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.abo, viewGroup, false);
            C89219l.m154716b(a, "");
            return new C57364c(a, str, dVar, z, (byte) 0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: c */
    public final void mo62381c() {
        Aweme aweme = (Aweme) this.f92231m;
        if (aweme != null) {
            m103973a(aweme.getVideo());
        }
    }

    /* renamed from: a */
    private final void m103973a(Video video) {
        String str;
        List<String> urlList;
        if (video != null) {
            if (mo94627a(video, "KidsAewmeViewHolder")) {
                this.f92233o = true;
                return;
            }
            UrlModel cover = video.getCover();
            if (cover == null || (urlList = cover.getUrlList()) == null) {
                str = null;
            } else {
                str = (String) C89070n.m154583g((List) urlList);
            }
            if (C80537hk.m139613a(str)) {
                mo94626a(video.getCover(), "KidsAewmeViewHolder");
            } else {
                this.f92232n.setActualImageResource(R.color.j);
            }
        }
    }

    /* renamed from: a */
    private final void m103972a(AwemeStatistics awemeStatistics) {
        int i = 8;
        if (this.f130761e) {
            View view = this.itemView;
            C89219l.m154716b(view, "");
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.c1r);
            if (linearLayout != null) {
                if (awemeStatistics != null) {
                    i = 0;
                }
                linearLayout.setVisibility(i);
            }
            if (awemeStatistics != null) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.c1s);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(C53437b.m98615a(awemeStatistics.getPlayCount()));
                return;
            }
            return;
        }
        View view3 = this.itemView;
        C89219l.m154716b(view3, "");
        LinearLayout linearLayout2 = (LinearLayout) view3.findViewById(R.id.c1r);
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: b */
    private static boolean m103974b(Aweme aweme) {
        Boolean bool;
        String str;
        VideoMaskInfo videoMaskInfo;
        VideoMaskInfo videoMaskInfo2;
        VideoMaskInfo videoMaskInfo3;
        String str2 = null;
        if (aweme == null || (videoMaskInfo3 = aweme.getVideoMaskInfo()) == null) {
            bool = null;
        } else {
            bool = videoMaskInfo3.getShowMask();
        }
        if (!C89219l.m154714a((Object) bool, (Object) true)) {
            return false;
        }
        if (aweme == null || (videoMaskInfo2 = aweme.getVideoMaskInfo()) == null) {
            str = null;
        } else {
            str = videoMaskInfo2.getTitle();
        }
        if (!C80537hk.m139613a(str)) {
            return false;
        }
        if (!(aweme == null || (videoMaskInfo = aweme.getVideoMaskInfo()) == null)) {
            str2 = videoMaskInfo.getCancelMaskLabel();
        }
        if (C80537hk.m139613a(str2)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo94629a(Aweme aweme) {
        int i;
        if (aweme != null) {
            this.f92231m = aweme;
            m103973a(aweme.getVideo());
            m103972a(aweme.getStatistics());
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.c1q);
        if (frameLayout != null) {
            if (m103974b((Aweme) this.f92231m)) {
                i = 0;
            } else {
                i = 8;
            }
            frameLayout.setVisibility(i);
        }
    }

    private C57364c(View view, String str, AbstractC57367d dVar, boolean z) {
        super(view);
        this.f130759b = str;
        this.f130760c = dVar;
        this.f130761e = z;
        this.f92232n = (SmartImageView) view.findViewById(R.id.c1p);
        SmartImageView smartImageView = this.f92232n;
        if (smartImageView != null) {
            smartImageView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.p2082ss.android.ugc.aweme.kids.common.p3331ui.p3332a.C57364c.View$OnClickListenerC573651 */

                /* renamed from: a */
                final /* synthetic */ C57364c f130762a;

                static {
                    Covode.recordClassIndex(67283);
                }

                {
                    this.f130762a = r1;
                }

                public final void onClick(View view) {
                    AbstractC57367d dVar;
                    ClickAgent.onClick(view);
                    Aweme aweme = (Aweme) this.f130762a.f92231m;
                    if (aweme != null && (dVar = this.f130762a.f130760c) != null) {
                        dVar.mo94631a(view, aweme, this.f130762a.f130759b);
                    }
                }
            });
        }
        if (Build.VERSION.SDK_INT >= 23) {
            SmartImageView smartImageView2 = this.f92232n;
            if (smartImageView2 != null) {
                smartImageView2.setForeground(C0643b.m2369a(view.getContext(), (int) R.drawable.azt));
            }
        } else {
            C62023a.m112168a(this.f92232n);
        }
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.c1q);
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public /* synthetic */ C57364c(View view, String str, AbstractC57367d dVar, boolean z, byte b) {
        this(view, str, dVar, z);
    }
}
