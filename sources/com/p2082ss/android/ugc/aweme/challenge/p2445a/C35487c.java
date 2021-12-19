package com.p2082ss.android.ugc.aweme.challenge.p2445a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.challenge.p2449e.C35517a;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a;
import com.p2082ss.android.ugc.aweme.detail.base.C41113b;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.a.c */
public class C35487c extends AbstractC35485a {

    /* renamed from: a */
    protected Context f83684a;

    /* renamed from: b */
    protected String f83685b;

    /* renamed from: c */
    protected RemoteImageView f83686c;

    /* renamed from: d */
    protected TextView f83687d;

    /* renamed from: e */
    protected TextView f83688e;

    /* renamed from: f */
    protected TextView f83689f;

    /* renamed from: g */
    protected TextView f83690g;

    /* renamed from: h */
    protected TuxTextView f83691h;

    /* renamed from: i */
    protected View f83692i;

    /* renamed from: j */
    protected View f83693j;

    static {
        Covode.recordClassIndex(42675);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo62382d() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39054a
    /* renamed from: b */
    public final int[] mo62380b() {
        return C80397em.m139369a(200);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: c */
    public final void mo62381c() {
        Video video;
        if (this.f92231m != null && (video = ((Aweme) this.f92231m).getVideo()) != null) {
            if (mo67790a(video, "DetailAwemeViewHolder")) {
                this.f92233o = true;
            } else {
                mo67788a(video.getCover(), "DetailAwemeViewHolder");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2445a.AbstractC35485a
    /* renamed from: a */
    public final void mo62374a() {
        Video video;
        if (this.f92231m != null && (video = ((Aweme) this.f92231m).getVideo()) != null) {
            if (!C35517a.m72613a() || !mo62382d()) {
                if (mo67790a(video, "DetailAwemeViewHolder")) {
                    this.f92233o = true;
                } else {
                    mo67788a(video.getCover(), "DetailAwemeViewHolder");
                }
            } else if (mo67791a(video, "DetailAwemeViewHolder", Bitmap.Config.ARGB_8888)) {
                this.f92233o = true;
            } else {
                mo67789a(video.getCover(), "DetailAwemeViewHolder", Bitmap.Config.ARGB_8888);
            }
        }
    }

    /* renamed from: a */
    public final void mo62378a(Aweme aweme) {
        this.f83691h.setVisibility(0);
        if (aweme.getStatistics() != null) {
            this.f83691h.setText(C53437b.m98615a(aweme.getStatistics().getDiggCount()));
            this.f83691h.setContentDescription("");
        }
    }

    /* renamed from: a */
    protected static void m72567a(TextView textView, AwemeTextLabelModel awemeTextLabelModel) {
        if (TextUtils.isEmpty(awemeTextLabelModel.getLabelName())) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(awemeTextLabelModel.getLabelName());
        textView.setTextSize(0, (float) C34728n.m70946a(12.0d));
        textView.setTextColor(Color.parseColor(awemeTextLabelModel.getTextColor()));
        textView.setBackground(C34729o.m70951a(Color.parseColor(awemeTextLabelModel.getBgColor()), (float) C34728n.m70946a(2.0d)));
        textView.setSingleLine();
    }

    @Override // com.p2082ss.android.ugc.aweme.challenge.p2445a.AbstractC35485a
    /* renamed from: a */
    public final void mo62375a(Aweme aweme, int i, boolean z) {
        mo62379b(aweme, i, z);
    }

    /* renamed from: b */
    public void mo62379b(Aweme aweme, int i, boolean z) {
        super.mo67806a(aweme, i);
        this.f92232n.setContentDescription("");
        if (aweme != null) {
            this.f92231m = aweme;
            if (z) {
                mo62374a();
            }
            this.f83686c.setVisibility(4);
            this.f83687d.setVisibility(8);
            this.f83688e.setVisibility(8);
            this.f83689f.setVisibility(8);
            this.f83693j.setVisibility(8);
            C41113b.m82815a(this.f83692i, (Aweme) ((AbstractC39054a) this).f92231m);
            this.f83690g.setVisibility(8);
            C41113b.m82815a(this.f83690g, aweme);
        }
    }

    public C35487c(View view, String str, final AbstractC35500d dVar) {
        super(view);
        this.f83684a = view.getContext();
        this.f83685b = str;
        this.f92232n = (SmartImageView) view.findViewById(R.id.afn);
        this.f83686c = (RemoteImageView) view.findViewById(R.id.buy);
        this.f83690g = (TextView) view.findViewById(R.id.eeq);
        this.f83688e = (TextView) view.findViewById(R.id.bzs);
        this.f83689f = (TextView) view.findViewById(R.id.bzw);
        this.f83687d = (TextView) view.findViewById(R.id.c0a);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.c8p);
        this.f83691h = tuxTextView;
        tuxTextView.setVisibility(8);
        View findViewById = view.findViewById(R.id.fc9);
        this.f83692i = findViewById;
        findViewById.setVisibility(8);
        View findViewById2 = view.findViewById(R.id.uw);
        this.f83693j = findViewById2;
        findViewById2.setVisibility(8);
        this.f92232n.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.ugc.aweme.challenge.p2445a.C35487c.View$OnClickListenerC354881 */

            static {
                Covode.recordClassIndex(42676);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (((Aweme) C35487c.this.f92231m).getStatus() == null || !((Aweme) C35487c.this.f92231m).getStatus().isDelete()) {
                    AbstractC35500d dVar = dVar;
                    if (dVar != null) {
                        dVar.mo62403a(view, (Aweme) C35487c.this.f92231m, C35487c.this.f83685b);
                        return;
                    }
                    return;
                }
                new C23144b(view).mo37640e(R.string.h6z).mo37637b();
            }
        });
        this.f92232n.setAnimationListener(this.f92226l);
    }
}
