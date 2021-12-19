package com.p2082ss.android.ugc.aweme.profile.p3565a;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.tux.icon.TuxIconView;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.profile.a.p */
public final class C63378p extends AbstractC39054a {

    /* renamed from: a */
    Context f143897a;

    /* renamed from: b */
    public String f143898b;

    /* renamed from: c */
    TuxIconView f143899c;

    /* renamed from: d */
    TextView f143900d;

    /* renamed from: e */
    TextView f143901e;

    /* renamed from: f */
    ViewGroup f143902f;

    /* renamed from: g */
    private View f143903g;

    /* renamed from: h */
    private View f143904h;

    /* renamed from: i */
    private View f143905i;

    static {
        Covode.recordClassIndex(74669);
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

    /* renamed from: f */
    public final void mo101991f() {
        List<ImageInfo> imageInfos;
        ImageInfo imageInfo;
        if (this.f92231m != null && (imageInfos = ((Aweme) this.f92231m).getImageInfos()) != null && !imageInfos.isEmpty() && (imageInfo = imageInfos.get(0)) != null) {
            C20766v b = C20761r.m39060a(C34735v.m70965a(imageInfo.getLabelThumb())).mo34185b(C80397em.m139369a(200));
            b.f49092E = this.f92232n;
            b.mo34176a(this.f92232n.getWidth(), this.f92232n.getHeight()).mo34179a("ImageViewHolder").mo34186c();
        }
    }

    public C63378p(View view, String str, final AbstractC35500d dVar) {
        super(view);
        this.f143897a = view.getContext();
        this.f143898b = str;
        this.f143903g = view.findViewById(R.id.acf);
        this.f143904h = view.findViewById(R.id.d4t);
        this.f92232n = (SmartImageView) view.findViewById(R.id.afn);
        this.f143900d = (TextView) view.findViewById(R.id.f18);
        this.f143899c = (TuxIconView) view.findViewById(R.id.fd3);
        this.f143901e = (TextView) view.findViewById(R.id.f6_);
        this.f143902f = (ViewGroup) view.findViewById(R.id.bl7);
        this.f92232n.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.profile.p3565a.C63378p.View$OnClickListenerC633791 */

            static {
                Covode.recordClassIndex(74670);
            }

            public final void onClick(View view) {
                AbstractC35500d dVar;
                ClickAgent.onClick(view);
                if (C63378p.this.f92231m != null && (dVar = dVar) != null) {
                    dVar.mo62403a(view, (Aweme) C63378p.this.f92231m, C63378p.this.f143898b);
                }
            }
        });
        this.f92232n.setAnimationListener(this.f92226l);
        this.f143905i = view.findViewById(R.id.c2r);
    }
}
