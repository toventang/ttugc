package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33942b;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.C49559p;
import com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.RunnableC49561r;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49673ah;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.AbstractC33208e;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.p2293b.C33205b;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.aweme.video.AbstractC80747i;
import com.p2082ss.android.ugc.aweme.video.C81079v;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.a */
public abstract class AbstractC50032a extends AbstractC49544a {

    /* renamed from: a */
    public View f115489a;

    /* renamed from: b */
    public TextView f115490b;

    /* renamed from: c */
    public TextView f115491c;

    /* renamed from: d */
    public TextView f115492d;

    /* renamed from: e */
    public ImageView f115493e;

    /* renamed from: f */
    private View f115494f;

    static {
        Covode.recordClassIndex(59158);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public final void mo80928a() {
    }

    /* renamed from: a */
    public abstract void mo85137a(Aweme aweme);

    /* renamed from: b */
    public abstract int mo85138b();

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.a$b */
    static final class RunnableC50034b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC50032a f115496a;

        /* renamed from: b */
        final /* synthetic */ Aweme f115497b;

        static {
            Covode.recordClassIndex(59160);
        }

        RunnableC50034b(AbstractC50032a aVar, Aweme aweme) {
            this.f115496a = aVar;
            this.f115497b = aweme;
        }

        public final void run() {
            this.f115496a.mo85137a(this.f115497b);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: i */
    public final void mo81287i() {
        Aweme aweme = this.f113953L;
        if (aweme != null) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50034b(this, aweme)));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.a$a */
    static final class RunnableC50033a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AbstractC50032a f115495a;

        static {
            Covode.recordClassIndex(59159);
        }

        RunnableC50033a(AbstractC50032a aVar) {
            this.f115495a = aVar;
        }

        public final void run() {
            AbstractC50032a aVar = this.f115495a;
            if (C37699a.m76251aW(aVar.f113953L)) {
                AbstractC33208e a = C33205b.m68071a();
                if (a != null) {
                    a.mo59099c();
                }
            } else {
                C81079v.m140776O().mo123908B();
            }
            Aweme aweme = aVar.f113953L;
            C89219l.m154716b(aweme, "");
            String aid = aweme.getAid();
            C89219l.m154716b(aid, "");
            AbstractC81915c.m141874a(new C49673ah(true, aid));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo85139c() {
        Aweme aweme = this.f113953L;
        C89219l.m154716b(aweme, "");
        if (!aweme.isAd()) {
            AbstractC80747i O = C81079v.m140776O();
            Aweme aweme2 = this.f113953L;
            C89219l.m154716b(aweme2, "");
            Video video = aweme2.getVideo();
            Aweme aweme3 = this.f113953L;
            C89219l.m154716b(aweme3, "");
            O.mo123923a(video, aweme3.getAudio(), false, true);
        } else if (C37699a.m76251aW(this.f113953L)) {
            AbstractC33208e a = C33205b.m68071a();
            if (a != null) {
                a.mo59097b();
            }
        } else {
            C81079v.m140776O().mo123950y();
        }
        Aweme aweme4 = this.f113953L;
        C89219l.m154716b(aweme4, "");
        String aid = aweme4.getAid();
        C89219l.m154716b(aid, "");
        AbstractC81915c.m141874a(new C49673ah(false, aid));
    }

    public AbstractC50032a(View view) {
        super(view);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public void mo80931a(DataCenter dataCenter) {
        DataCenter dataCenter2 = this.f113958Q;
        if (dataCenter2 != null) {
            dataCenter2.mo60189a("startPlayAnimation", (AbstractC1214u<C33942b>) this.f113951J);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: b */
    public final void mo80935b(C33942b bVar) {
        VideoItemParams videoItemParams;
        Aweme aweme;
        if (!this.f113952K) {
            View view = this.f115494f;
            if (view instanceof FrameLayout) {
                Objects.requireNonNull(view, "null cannot be cast to non-null type android.widget.FrameLayout");
                ((FrameLayout) view).addView(this.f115489a);
                View view2 = this.f115489a;
                if (view2 != null) {
                    view2.setVisibility(8);
                }
                this.f113952K = true;
            }
        }
        if (bVar != null && (videoItemParams = (VideoItemParams) bVar.mo60212a()) != null && (aweme = videoItemParams.mAweme) != null) {
            mo85137a(aweme);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: c */
    public void mo80938c(C33942b bVar) {
        String str;
        View view;
        if (bVar != null) {
            str = bVar.f80277a;
        } else {
            str = null;
        }
        if (C89219l.m154714a((Object) "startPlayAnimation", (Object) str) && C80635y.m139811f(this.f113953L) && (view = this.f115489a) != null && view.getVisibility() == 0) {
            C49559p.f113984a.mo81305a(new RunnableC49561r(false, new RunnableC50033a(this)));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.feedwidget.widgetcore.AbstractC49544a
    /* renamed from: a */
    public void mo80929a(View view) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        this.f115494f = view;
        View a = C1870c.m6045a((Activity) this.f113959R, mo85138b());
        this.f115489a = a;
        ImageView imageView = null;
        if (a != null) {
            textView = (TextView) a.findViewById(R.id.title);
        } else {
            textView = null;
        }
        this.f115490b = textView;
        View view2 = this.f115489a;
        if (view2 != null) {
            textView2 = (TextView) view2.findViewById(R.id.button);
        } else {
            textView2 = null;
        }
        this.f115491c = textView2;
        View view3 = this.f115489a;
        if (view3 != null) {
            textView3 = (TextView) view3.findViewById(R.id.acq);
        } else {
            textView3 = null;
        }
        this.f115492d = textView3;
        View view4 = this.f115489a;
        if (view4 != null) {
            imageView = (ImageView) view4.findViewById(R.id.bh1);
        }
        this.f115493e = imageView;
    }
}
