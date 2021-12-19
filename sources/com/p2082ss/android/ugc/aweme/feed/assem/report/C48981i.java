package com.p2082ss.android.ugc.aweme.feed.assem.report;

import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p2082ss.android.ugc.aweme.language.C58071d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.report.i */
public final class C48981i extends AbstractC48491a<C48959c> {

    /* renamed from: u */
    public static final C48982a f112883u = new C48982a((byte) 0);

    /* renamed from: v */
    private SparseArray f112884v;

    static {
        Covode.recordClassIndex(57770);
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12711w
    /* renamed from: D */
    public final int mo20547D() {
        return R.layout.su;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.assem.base.AbstractC48491a
    /* renamed from: H */
    public final View mo80494H() {
        if (this.f112884v == null) {
            this.f112884v = new SparseArray();
        }
        View view = (View) this.f112884v.get(R.id.dii);
        if (view != null) {
            return view;
        }
        View t = mo20528t();
        if (t == null) {
            return null;
        }
        View findViewById = t.findViewById(R.id.dii);
        this.f112884v.put(R.id.dii, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.p795b.AbstractC12693u
    /* renamed from: c */
    public final void mo20517c(View view) {
        C89219l.m154721d(view, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.i$a */
    public static final class C48982a {
        static {
            Covode.recordClassIndex(57771);
        }

        private C48982a() {
        }

        public /* synthetic */ C48982a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.assem.report.i$b */
    static final class View$OnClickListenerC48983b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C48981i f112885a;

        /* renamed from: b */
        final /* synthetic */ VideoItemParams f112886b;

        static {
            Covode.recordClassIndex(57772);
        }

        View$OnClickListenerC48983b(C48981i iVar, VideoItemParams videoItemParams) {
            this.f112885a = iVar;
            this.f112886b = videoItemParams;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Aweme aweme = this.f112886b.mAweme;
            C89219l.m154716b(aweme, "");
            FrameLayout frameLayout = (FrameLayout) this.f112885a.mo80494H();
            C89219l.m154716b(frameLayout, "");
            C48956a.m92139a(aweme, frameLayout);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.assem.arch.p795b.AbstractC12658i
    /* renamed from: a */
    public final /* synthetic */ void mo20467a(VideoItemParams videoItemParams) {
        VideoItemParams videoItemParams2 = videoItemParams;
        C89219l.m154721d(videoItemParams2, "");
        if (TextUtils.equals(videoItemParams2.mEventType, "homepage_hot")) {
            C58071d.m104907a();
            if (C48957b.m92140a()) {
                FrameLayout frameLayout = (FrameLayout) mo80494H();
                if (frameLayout != null) {
                    frameLayout.setVisibility(0);
                }
                FrameLayout frameLayout2 = (FrameLayout) mo80494H();
                if (frameLayout2 != null) {
                    frameLayout2.setOnClickListener(new View$OnClickListenerC48983b(this, videoItemParams2));
                    return;
                }
                return;
            }
        }
        FrameLayout frameLayout3 = (FrameLayout) mo80494H();
        if (frameLayout3 != null) {
            frameLayout3.setVisibility(4);
        }
    }
}
