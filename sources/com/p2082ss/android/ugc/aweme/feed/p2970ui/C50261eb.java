package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.kakao.usermgmt.StringSet;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.app.C33830n;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33743c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.eb */
public final class C50261eb extends AbstractC50304g {

    /* renamed from: l */
    private View f116057l;

    /* renamed from: m */
    private TuxIconView f116058m;

    /* renamed from: n */
    private TextView f116059n;

    /* renamed from: o */
    private TuxIconView f116060o;

    static {
        Covode.recordClassIndex(59387);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85143a() {
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85145a(DataCenter dataCenter) {
    }

    public C50261eb(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85144a(View view) {
        MethodCollector.m26663i(4677);
        if (view instanceof FrameLayout) {
            View a = C1870c.m6045a((Activity) this.f116156g, (int) R.layout.tp);
            this.f116057l = a;
            this.f116058m = (TuxIconView) a.findViewById(R.id.fdk);
            this.f116059n = (TextView) this.f116057l.findViewById(R.id.fdl);
            this.f116060o = (TuxIconView) this.f116057l.findViewById(R.id.fdj);
            ((FrameLayout) view).addView(this.f116057l);
        }
        MethodCollector.m26664o(4677);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85146a(VideoItemParams videoItemParams) {
        String str;
        super.mo85146a(videoItemParams);
        if (this.f116150a == null) {
            C34729o.m70955a(this.f116057l, 8);
            return;
        }
        String str2 = "";
        if (this.f116150a.isProhibitedAndShouldTell()) {
            View view = this.f116057l;
            view.setBackgroundColor(C0643b.m2378c(view.getContext(), R.color.c8));
            this.f116058m.setIconRes(R.raw.icon_exclamation_mark_circle_fill);
            this.f116060o.setVisibility(0);
            if (!TextUtils.isEmpty(this.f116150a.getVideoDetailNoticeBottom())) {
                this.f116059n.setText(this.f116150a.getVideoDetailNoticeBottom());
            } else {
                this.f116059n.setText(R.string.h71);
                C33830n.m69192a("notice_content_empty", str2, new C33743c().mo59976a(StringSet.type, "video_detail_notice_bottom").mo59976a("log_id", this.f116150a.getRequestId()).mo59976a("item_id", this.f116150a.getAid()).mo59977a());
            }
            this.f116057l.setOnClickListener(new View$OnClickListenerC50262ec(this));
            C34729o.m70955a(this.f116057l, 0);
        } else if (C80635y.m139806a(this.f116150a)) {
            Aweme aweme = this.f116150a;
            if (aweme.getStatus() == null || aweme.getStatus().getVideoMuteInfo() == null || TextUtils.isEmpty(aweme.getStatus().getVideoMuteInfo().getMuteDetailNotice())) {
                C34729o.m70955a(this.f116057l, 8);
            } else if (aweme.getStatus().getMusicEditStatus() == 2) {
                View view2 = this.f116057l;
                view2.setBackgroundColor(C0643b.m2378c(view2.getContext(), R.color.a4));
                this.f116057l.setOnClickListener(View$OnClickListenerC50263ed.f116062a);
                this.f116058m.setVisibility(8);
                this.f116059n.setText(R.string.faw);
                C34729o.m70955a(this.f116057l, 0);
            } else {
                String muteDetailNotice = aweme.getStatus().getVideoMuteInfo().getMuteDetailNotice();
                String muteDetailUrl = aweme.getStatus().getVideoMuteInfo().getMuteDetailUrl();
                View view3 = this.f116057l;
                view3.setBackgroundColor(C0643b.m2378c(view3.getContext(), R.color.a4));
                this.f116058m.setIconRes(R.raw.icon_speaker_x_mark_fill_ltr);
                this.f116059n.setText(muteDetailNotice);
                if (TextUtils.isEmpty(muteDetailUrl)) {
                    this.f116060o.setVisibility(8);
                    this.f116057l.setOnClickListener(View$OnClickListenerC50264ee.f116063a);
                } else {
                    this.f116060o.setVisibility(0);
                    this.f116057l.setOnClickListener(new View$OnClickListenerC50265ef(muteDetailUrl, aweme));
                }
                C34729o.m70955a(this.f116057l, 0);
                if (TextUtils.isEmpty(muteDetailUrl)) {
                    str = "2";
                } else {
                    str = "1";
                }
                C33744d dVar = new C33744d();
                if (!TextUtils.isEmpty(this.f116150a.getAid())) {
                    str2 = this.f116150a.getAid();
                }
                C39162r.m79460a("video_play_page_mute_tag_show", dVar.mo59983a("object_id", str2).mo59983a("tag_type", str).f79943a);
            }
        } else {
            C34729o.m70955a(this.f116057l, 8);
        }
    }
}
