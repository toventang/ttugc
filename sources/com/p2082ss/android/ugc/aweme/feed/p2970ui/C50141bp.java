package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2979x.C50539g;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.bp */
public final class C50141bp extends AbstractC50304g implements AbstractC1214u<C33942b> {

    /* renamed from: l */
    private View f115733l;

    static {
        Covode.recordClassIndex(59267);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85143a() {
    }

    /* renamed from: c */
    private final boolean m94089c() {
        if (!C50539g.m94744a(this.f116150a) || C39223a.m79591e().mo68728c() != 3) {
            return false;
        }
        return true;
    }

    public C50141bp(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85145a(DataCenter dataCenter) {
        DataCenter a;
        if (dataCenter != null && (a = dataCenter.mo60189a("on_viewpager_page_selected", (AbstractC1214u<C33942b>) this)) != null) {
            a.mo60189a("startPlayAnimation", (AbstractC1214u<C33942b>) this);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        String str;
        C33942b bVar2 = bVar;
        if (C89219l.m154714a((Object) "homepage_hot", (Object) this.f116151b) && this.f116154e == 0 && this.f116160k == 1) {
            if (bVar2 != null) {
                str = bVar2.f80277a;
            } else {
                str = null;
            }
            m94088a(str);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85144a(View view) {
        MethodCollector.m26663i(5885);
        View a = C1870c.m6045a((Activity) this.f116156g, (int) R.layout.tr);
        C89219l.m154716b(a, "");
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a);
        }
        this.f115733l = a;
        if (a != null) {
            a.setVisibility(8);
            MethodCollector.m26664o(5885);
            return;
        }
        MethodCollector.m26664o(5885);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85146a(VideoItemParams videoItemParams) {
        super.mo85146a(videoItemParams);
        if (C89219l.m154714a((Object) "homepage_hot", (Object) this.f116151b) && this.f116154e == 0 && this.f116160k == 1) {
            m94088a("on_viewpager_page_selected");
        }
    }

    /* renamed from: a */
    private final void m94088a(String str) {
        View view;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1180796502) {
                if (hashCode == 307897710 && str.equals("startPlayAnimation") && (view = this.f115733l) != null && view.getVisibility() == 0) {
                    AbstractC80747i O = C81079v.m140776O();
                    C89219l.m154716b(O, "");
                    if (O.mo123892o()) {
                        C81079v.m140776O().mo123908B();
                    }
                }
            } else if (!str.equals("on_viewpager_page_selected")) {
            } else {
                if (m94089c()) {
                    View view2 = this.f115733l;
                    if (view2 != null) {
                        view2.setVisibility(0);
                    }
                    C33744d a = new C33744d().mo59983a("enter_from", this.f116151b);
                    Aweme aweme = this.f116150a;
                    C89219l.m154716b(aweme, "");
                    C33744d a2 = a.mo59983a("group_id", aweme.getAid());
                    Aweme aweme2 = this.f116150a;
                    C89219l.m154716b(aweme2, "");
                    C39162r.m79460a("opt_out_layer_show", a2.mo59983a("author_id", aweme2.getAuthorUid()).mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(C59208ac.m108759a(this.f116150a, this.f116154e))).f79943a);
                    return;
                }
                View view3 = this.f115733l;
                if (view3 != null) {
                    view3.setVisibility(8);
                }
            }
        }
    }
}
