package com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.p1481d.C20744c;
import com.bytedance.tux.p1722h.C23163i;
import com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b;
import com.p2082ss.android.ugc.aweme.discover.mixfeed.p2789b.C42317b;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveStruct;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41522at;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67540c;
import com.p2082ss.android.ugc.aweme.search.p3695k.C67542d;
import com.p2082ss.android.ugc.aweme.utils.C80508gp;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.c.h */
public final class C42831h extends AbstractView$OnAttachStateChangeListenerC41671b {

    /* renamed from: a */
    public SearchLiveStruct f99887a;

    /* renamed from: b */
    Aweme f99888b;

    /* renamed from: c */
    public String f99889c;

    /* renamed from: d */
    SmartImageView f99890d;

    /* renamed from: e */
    SmartImageView f99891e;

    /* renamed from: f */
    TextView f99892f;

    /* renamed from: g */
    TextView f99893g;

    /* renamed from: h */
    View f99894h;

    /* renamed from: i */
    public AbstractC42833a f99895i;

    /* renamed from: m */
    private SmartImageView f99896m;

    /* renamed from: n */
    private TextView f99897n;

    /* renamed from: o */
    private LinearLayout f99898o;

    /* renamed from: p */
    private LinearLayout f99899p;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.c.h$a */
    public interface AbstractC42833a {
        static {
            Covode.recordClassIndex(50937);
        }

        /* renamed from: a */
        void mo73073a(Aweme aweme);
    }

    static {
        Covode.recordClassIndex(50935);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.adapter.AbstractView$OnAttachStateChangeListenerC41671b
    /* renamed from: I */
    public final View mo70834I() {
        View view = this.itemView;
        C89219l.m154716b(view, "");
        return view;
    }

    /* renamed from: a */
    public final void mo73077a(View view) {
        C89219l.m154721d(view, "");
        if (Build.VERSION.SDK_INT >= 21) {
            view.setOutlineProvider(new C80508gp((int) C20744c.m39047a(mo70878G(), 2.0f)));
            view.setClipToOutline(true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42831h(View view) {
        super(view);
        ViewGroup.LayoutParams layoutParams;
        SmartImageView smartImageView;
        C89219l.m154721d(view, "");
        this.f99890d = (SmartImageView) view.findViewById(R.id.ca_);
        this.f99896m = (SmartImageView) view.findViewById(R.id.caa);
        this.f99891e = (SmartImageView) view.findViewById(R.id.cb1);
        this.f99892f = (TextView) view.findViewById(R.id.cc0);
        this.f99893g = (TextView) view.findViewById(R.id.cb9);
        this.f99897n = (TextView) view.findViewById(R.id.cbz);
        this.f99894h = view.findViewById(R.id.c2k);
        this.f99898o = (LinearLayout) view.findViewById(R.id.adz);
        this.f99899p = (LinearLayout) view.findViewById(R.id.cpp);
        view.setOnClickListener(new View.OnClickListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.p2806c.C42831h.View$OnClickListenerC428321 */

            /* renamed from: a */
            final /* synthetic */ C42831h f99900a;

            static {
                Covode.recordClassIndex(50936);
            }

            {
                this.f99900a = r1;
            }

            public final void onClick(View view) {
                User author;
                Aweme aweme;
                ClickAgent.onClick(view);
                AbstractC42833a aVar = this.f99900a.f99895i;
                Long l = null;
                if (aVar != null) {
                    SearchLiveStruct searchLiveStruct = this.f99900a.f99887a;
                    if (searchLiveStruct != null) {
                        aweme = searchLiveStruct.getLiveAweme();
                    } else {
                        aweme = null;
                    }
                    aVar.mo73073a(aweme);
                }
                C42831h hVar = this.f99900a;
                SearchLiveStruct searchLiveStruct2 = hVar.f99887a;
                if (searchLiveStruct2 != null) {
                    searchLiveStruct2.getLiveAweme();
                }
                C67540c w = ((C67542d) C42317b.m84680b(hVar.mo70877F()).mo106439A("click_info").mo106497x("live_card").mo106479a(Integer.valueOf(hVar.getAdapterPosition()))).mo106496w("0");
                Aweme aweme2 = hVar.f99888b;
                if (!(aweme2 == null || (author = aweme2.getAuthor()) == null)) {
                    l = Long.valueOf(author.roomId);
                }
                w.mo106487g(String.valueOf(l)).mo106459o("search_result").mo96792f();
            }
        });
        if (C16048b.m29633a().mo25412a(true, "search_optm_mask_layer_on_video", 0) == 0 && (smartImageView = this.f99896m) != null) {
            smartImageView.setVisibility(0);
        }
        if (!C41522at.m83463a()) {
            TextView textView = this.f99892f;
            if (textView != null) {
                Resources system = Resources.getSystem();
                C89219l.m154716b(system, "");
                Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics())));
                Resources system2 = Resources.getSystem();
                C89219l.m154716b(system2, "");
                Integer valueOf2 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 6.0f, system2.getDisplayMetrics())));
                Resources system3 = Resources.getSystem();
                C89219l.m154716b(system3, "");
                C23163i.m43668b(textView, valueOf, valueOf2, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system3.getDisplayMetrics()))), 0, false, 16);
            }
            LinearLayout linearLayout = this.f99898o;
            if (linearLayout != null) {
                C23163i.m43668b(linearLayout, 0, 0, 0, 0, false, 16);
            }
            LinearLayout linearLayout2 = this.f99899p;
            if (linearLayout2 != null) {
                Resources system4 = Resources.getSystem();
                C89219l.m154716b(system4, "");
                Integer valueOf3 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system4.getDisplayMetrics())));
                Resources system5 = Resources.getSystem();
                C89219l.m154716b(system5, "");
                C23163i.m43668b(linearLayout2, 0, valueOf3, 0, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system5.getDisplayMetrics()))), false, 16);
            }
            SmartImageView smartImageView2 = this.f99891e;
            if (smartImageView2 != null) {
                layoutParams = smartImageView2.getLayoutParams();
                if (layoutParams != null) {
                    Resources system6 = Resources.getSystem();
                    C89219l.m154716b(system6, "");
                    layoutParams.width = C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system6.getDisplayMetrics()));
                    Resources system7 = Resources.getSystem();
                    C89219l.m154716b(system7, "");
                    layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system7.getDisplayMetrics()));
                }
            } else {
                layoutParams = null;
            }
            SmartImageView smartImageView3 = this.f99891e;
            if (smartImageView3 != null) {
                smartImageView3.setLayoutParams(layoutParams);
            }
        }
    }
}
