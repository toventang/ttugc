package com.p2082ss.android.ugc.aweme.feed.adapter;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.commercialize.feed.AbstractC37879bc;
import com.p2082ss.android.ugc.aweme.commercialize.p2604n.C38264b;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.p2944e.AbstractC49439l;
import com.p2082ss.android.ugc.aweme.p2282ad.FeedAdServiceImpl;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.IFeedAdService;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33205b;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33206c;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.AbstractC90253j;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.DynamicAdViewHolder */
public final class DynamicAdViewHolder extends VideoViewCell implements AbstractC48144ad, AbstractC90253j {

    /* renamed from: a */
    public final AbstractC33208e f111272a;

    static {
        Covode.recordClassIndex(56763);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48144ad, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: G */
    public final void mo80068G() {
        this.f111272a.mo59099c();
        C38264b.f90432b.mo66031b();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: H */
    public final void mo80069H() {
        super.mo80069H();
        this.f111272a.mo59096a(this.f111308j);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48144ad
    /* renamed from: F */
    public final void mo80067F() {
        this.f111272a.mo59097b();
        AbstractC37879bc bcVar = this.f111439ar;
        if (bcVar != null) {
            bcVar.mo65933F();
        }
        C38264b.f90432b.mo66030a();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: g */
    public final void mo80072g() {
        C33206c aH;
        super.mo80072g();
        C33205b.f78904a = null;
        C80298cg.m139205b(this.f111272a);
        AbstractC49439l lVar = this.f111401aE;
        if (!(lVar == null || (aH = lVar.mo81117aH()) == null)) {
            this.f111272a.mo59098b(aH);
        }
        this.f111272a.mo59100d();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48144ad
    /* renamed from: o */
    public final boolean mo80074o() {
        if (this.f111272a.mo59101e()) {
            mo80068G();
            return false;
        }
        mo80067F();
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: n */
    public final void mo80073n() {
        super.mo80073n();
        this.f111447az.mo60189a("ad_on_holder_resume", (AbstractC1214u<C33942b>) this);
        this.f111447az.mo60189a("ad_on_fragment_pager_resume", (AbstractC1214u<C33942b>) this);
        this.f111447az.mo60189a("ad_on_holder_pause", (AbstractC1214u<C33942b>) this);
        this.f111447az.mo60189a("ad_on_fragment_pager_pause", (AbstractC1214u<C33942b>) this);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    public final /* synthetic */ void onChanged(C33942b bVar) {
        onChanged(bVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48234cd, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo80071a(Video video) {
        SmartImageView smartImageView = this.f111472r;
        C89219l.m154716b(smartImageView, "");
        smartImageView.setVisibility(8);
        this.f111445ax = false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DynamicAdViewHolder(C48238ce ceVar) {
        super(ceVar);
        C89219l.m154721d(ceVar, "");
        IFeedAdService c = FeedAdServiceImpl.m67808c();
        FrameLayout frameLayout = this.f111377H;
        C89219l.m154716b(frameLayout, "");
        this.f111272a = c.mo58878a((ViewGroup) frameLayout);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai, com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo70614a(int i) {
        C33206c aH;
        super.mo70614a(i);
        AbstractC33208e eVar = this.f111272a;
        C89219l.m154721d(eVar, "");
        C33205b.f78904a = new WeakReference<>(eVar);
        C80298cg.m139204a(this.f111272a);
        AbstractC49439l lVar = this.f111401aE;
        if (!(lVar == null || (aH = lVar.mo81117aH()) == null)) {
            this.f111272a.mo59095a(aH);
        }
        this.f111272a.mo59097b();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.VideoViewCell
    /* renamed from: a */
    public final void mo80070a(C33942b bVar) {
        super.onChanged(bVar);
        if (bVar != null) {
            String str = bVar.f80277a;
            switch (str.hashCode()) {
                case -2066092964:
                    if (!str.equals("ad_on_holder_resume")) {
                        return;
                    }
                    mo80067F();
                    return;
                case -895459340:
                    if (!str.equals("ad_on_fragment_pager_resume")) {
                        return;
                    }
                    mo80067F();
                    return;
                case 347029479:
                    if (!str.equals("ad_on_holder_pause")) {
                        return;
                    }
                    mo80068G();
                    return;
                case 1493170511:
                    if (!str.equals("ad_on_fragment_pager_pause")) {
                        return;
                    }
                    mo80068G();
                    return;
                default:
                    return;
            }
        }
    }
}
