package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ab */
public final class C50037ab extends AbstractC50304g implements AbstractC1214u<C33942b> {

    /* renamed from: l */
    RemoteImageView f115500l;

    /* renamed from: m */
    public FrameLayout f115501m;

    /* renamed from: n */
    TextView f115502n;

    /* renamed from: o */
    private boolean f115503o;

    static {
        Covode.recordClassIndex(59163);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85143a() {
        this.f115503o = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo85149d() {
        this.f116155f.mo60191a("dismiss_live_window", (Object) true);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: b */
    public final void mo85147b() {
        UrlModel avatarLarger;
        super.mo85147b();
        if (this.f116150a != null && this.f116150a.getAuthor() != null && (avatarLarger = this.f116150a.getAuthor().getAvatarLarger()) != null) {
            this.f115500l.post(new RunnableC50040ae(this, avatarLarger));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo85148c() {
        User author;
        if (this.f116150a != null && !this.f115503o && (author = this.f116150a.getAuthor()) != null) {
            this.f116155f.mo60191a("live_window_clicked", (Object) true);
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f28232b.f28259c = this.f116150a.getAid();
            enterRoomConfig.f28233c.f28293J = this.f116151b;
            enterRoomConfig.f28233c.f28295L = "live_window";
            LiveOuterService.m107269s().mo95835i().mo105593a(this.f116156g, author, enterRoomConfig);
        }
    }

    public C50037ab(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85145a(DataCenter dataCenter) {
        dataCenter.mo60189a("live_has_end", (AbstractC1214u<C33942b>) this);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85146a(VideoItemParams videoItemParams) {
        super.mo85146a(videoItemParams);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C33942b bVar) {
        Boolean bool;
        C33942b bVar2 = bVar;
        if (bVar2 != null && TextUtils.equals(bVar2.f80277a, "live_has_end") && (bool = (Boolean) bVar2.mo60212a()) != null && bool.booleanValue()) {
            this.f115503o = true;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.p2970ui.AbstractC50304g
    /* renamed from: a */
    public final void mo85144a(View view) {
        MethodCollector.m26663i(10906);
        View a = C1870c.m6045a((Activity) this.f116156g, (int) R.layout.a0c);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(a);
        }
        this.f115500l = (RemoteImageView) a.findViewById(R.id.b0m);
        this.f115501m = (FrameLayout) a.findViewById(R.id.b0o);
        this.f115502n = (TextView) a.findViewById(R.id.b0q);
        View findViewById = a.findViewById(R.id.b0n);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC50038ac(this));
        }
        View findViewById2 = a.findViewById(R.id.b0p);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC50039ad(this));
        }
        if (C80471gb.m139483a(view.getContext())) {
            this.f115502n.setBackgroundResource(R.drawable.a93);
        } else {
            this.f115502n.setBackgroundResource(R.drawable.a92);
        }
        this.f115502n.setText(LiveOuterService.m107269s().mo95836j().mo96052a(view.getContext(), "pm_following_livecard_live_icon"));
        MethodCollector.m26664o(10906);
    }
}
