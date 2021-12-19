package com.p2082ss.android.ugc.aweme.detail.p2749h;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.MarqueeView2;
import com.p2082ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.p2082ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MvModel;
import com.p2082ss.android.ugc.aweme.tools.detail.IMovieReuseService;
import com.p2082ss.android.ugc.aweme.utils.C80567ic;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.detail.h.u */
public final class C41213u extends AbstractC41220y {

    /* renamed from: a */
    private MvModel f96312a;

    /* renamed from: bx */
    private String f96313bx;

    static {
        Covode.recordClassIndex(49096);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: o */
    public final int mo70389o() {
        return R.string.h4r;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: n */
    public final void mo70388n() {
        if (this.f183419bv == null || !MSAdaptionService.m97895c().mo89375b(this.f183419bv)) {
            IMovieReuseService a = MovieReuseServiceImpl.m110905a();
            if (this.f96312a != null) {
                a.mo98781a(aH_(), this.f96312a.getMvId());
                C39162r.m79460a("shoot", new C33744d().mo59983a("enter_method", "mv_feed").mo59983a("mv_id", this.f96312a.getMvId()).mo59983a("enter_from", "mv_page").mo59983a("shoot_way", "mv_page").mo59983a("content_type", "mv").mo59983a("group_id", this.f96313bx).f79943a);
                return;
            }
            return;
        }
        Toast makeText = Toast.makeText(this.f183419bv, this.f183419bv.getString(R.string.bed), 0);
        if (Build.VERSION.SDK_INT == 25) {
            C80567ic.m139657a(makeText);
        }
        makeText.show();
    }

    public C41213u(Bundle bundle) {
        this.f96312a = (MvModel) bundle.getSerializable("feed_data_movie_model");
        this.f96313bx = bundle.getString("feed_data_movie_group_id", "");
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.detail.p2749h.AbstractC41220y
    /* renamed from: a */
    public final View mo70386a(RelativeLayout relativeLayout) {
        View a = C1764a.m5927a(LayoutInflater.from(this.f183419bv), R.layout.wn, relativeLayout, false);
        if (this.f96312a != null) {
            C34577e.m70592a((RemoteImageView) a.findViewById(R.id.cme), this.f96312a.getIconUrl());
            mo70549a((MarqueeView2) a.findViewById(R.id.b0s), this.f96312a.getName());
        }
        return a;
    }
}
