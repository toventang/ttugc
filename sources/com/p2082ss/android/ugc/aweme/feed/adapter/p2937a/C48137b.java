package com.p2082ss.android.ugc.aweme.feed.adapter.p2937a;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.player.sdk.api.AbstractC63042j;
import com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84293i;
import com.p2082ss.android.ugc.playerkit.videoview.AbstractC84295k;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.a.b */
public final class C48137b extends AbstractC48136a {

    /* renamed from: b */
    private final AbstractC89244h f111527b;

    static {
        Covode.recordClassIndex(56879);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: A */
    public final void mo80149A() {
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84292h
    /* renamed from: a */
    public final void mo80280a(OnUIPlayListener onUIPlayListener) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: a */
    public final void mo80270a(AbstractC84295k kVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: b */
    public final void mo80209b(Aweme aweme) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.p2937a.AbstractC48136a
    /* renamed from: c */
    public final AbstractC84293i mo80273c() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: e */
    public final void mo80215e(int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: e */
    public final void mo80217e(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.playerkit.videoview.AbstractC84292h
    /* renamed from: j */
    public final AbstractC63042j.C63049g mo80281j() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompleted(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPlayCompletedFirstTime(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onPreparePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener
    public final void onResumePlay(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: s */
    public final int mo80228s() {
        return 1;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: w */
    public final boolean mo80232w() {
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: x */
    public final Surface mo80233x() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: z */
    public final void mo80235z() {
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48147ag
    /* renamed from: y */
    public final View mo80234y() {
        return (View) this.f111527b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.a.b$a */
    static final class C48138a extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ Context f111528a;

        static {
            Covode.recordClassIndex(56880);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C48138a(Context context) {
            super(0);
            this.f111528a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            MethodCollector.m26663i(5825);
            View view = new View(this.f111528a);
            view.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -1));
            MethodCollector.m26664o(5825);
            return view;
        }
    }

    public C48137b(Context context) {
        C89219l.m154721d(context, "");
        this.f111527b = C89250i.m154774a(EnumC89331m.NONE, new C48138a(context));
    }
}
