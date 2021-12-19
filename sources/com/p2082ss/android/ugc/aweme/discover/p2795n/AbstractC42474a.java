package com.p2082ss.android.ugc.aweme.discover.p2795n;

import android.content.Context;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.common.p1832d.C24091i;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.widget.FixedRatioFrameLayout;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a;
import com.p2082ss.android.ugc.aweme.discover.p2760a.C41520as;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.discover.n.a */
public abstract class AbstractC42474a extends AbstractC39054a {

    /* renamed from: a */
    protected Context f99020a;

    static {
        Covode.recordClassIndex(50562);
    }

    /* renamed from: C */
    public abstract boolean mo72621C();

    /* renamed from: D */
    public abstract void mo72622D();

    /* renamed from: E */
    public abstract void mo72623E();

    /* renamed from: G */
    public abstract void mo72624G();

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a
    /* renamed from: b */
    public int[] mo62380b() {
        return C80397em.m139369a(201);
    }

    /* renamed from: H */
    public void mo72625H() {
        Video video;
        if (this.f92231m != null && (video = ((Aweme) this.f92231m).getVideo()) != null) {
            if (mo67790a(video, "AbsCellViewHolder")) {
                this.f92233o = true;
            } else if (video.getCover() == null || video.getCover().getUrlList() == null || video.getCover().getUrlList().size() == 0 || TextUtils.isEmpty(video.getCover().getUrlList().get(0))) {
                this.f92232n.setImageResource(R.color.j);
            } else {
                mo67788a(video.getCover(), "AbsCellViewHolder");
            }
        }
    }

    public AbstractC42474a(View view) {
        super(view);
        this.f99020a = view.getContext();
    }

    /* renamed from: a */
    protected static void m84896a(SmartImageView smartImageView) {
        float f;
        ViewGroup viewGroup = (ViewGroup) smartImageView.getParent();
        if (viewGroup instanceof FixedRatioFrameLayout) {
            FixedRatioFrameLayout fixedRatioFrameLayout = (FixedRatioFrameLayout) viewGroup;
            if (C41520as.m83460a() == 0 || C41520as.m83460a() == 1 || C41520as.m83460a() == 3) {
                f = 0.625f;
            } else {
                f = 0.75f;
            }
            fixedRatioFrameLayout.setWhRatio(f);
        }
        PointF pointF = new PointF(0.5f, 0.0f);
        C24091i.m45617a(pointF);
        ((C24246a) smartImageView.getHierarchy()).mo39951a(2).mo39934a(pointF);
    }
}
