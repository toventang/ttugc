package com.p2082ss.android.ugc.aweme.music.p3481ui.viewholder;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Animatable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20724a;
import com.facebook.drawee.p1857h.AbstractC24255a;
import com.facebook.p1860f.p1861a.AbstractC24269a;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2377h.C34593a;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.challenge.AbstractC35500d;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.framework.p3008c.C51426a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.p2359ay.C34363c;
import com.p2082ss.android.ugc.aweme.performance.C62845i;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80635y;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.MusicDetailVideoItemViewHolder */
public final class MusicDetailVideoItemViewHolder extends JediSimpleViewHolder<Aweme> implements AbstractC39062g, AbstractC39062g {

    /* renamed from: n */
    public static final C61206a f138958n = new C61206a((byte) 0);

    /* renamed from: f */
    public final Context f138959f;

    /* renamed from: g */
    public Aweme f138960g;

    /* renamed from: j */
    public AbstractC20724a f138961j;

    /* renamed from: k */
    public final boolean f138962k;

    /* renamed from: l */
    public final AbstractC35500d f138963l;

    /* renamed from: m */
    public final String f138964m;

    /* renamed from: o */
    private boolean f138965o;

    /* renamed from: p */
    private final RemoteImageView f138966p;

    /* renamed from: q */
    private final TextView f138967q;

    /* renamed from: r */
    private final TextView f138968r;

    /* renamed from: s */
    private final TextView f138969s;

    /* renamed from: t */
    private final TextView f138970t;

    /* renamed from: u */
    private final View f138971u;

    /* renamed from: v */
    private final SmartImageView f138972v;

    /* renamed from: w */
    private final float f138973w;

    /* renamed from: x */
    private boolean f138974x;

    static {
        Covode.recordClassIndex(71811);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.MusicDetailVideoItemViewHolder$a */
    public static final class C61206a {
        static {
            Covode.recordClassIndex(71812);
        }

        private C61206a() {
        }

        public /* synthetic */ C61206a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: c */
    public final void mo62381c() {
        m110836m();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: e */
    public final boolean mo66995e() {
        return this.f138965o;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    public final void as_() {
        this.f138972v.mo34198c();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    public final void au_() {
        this.f138972v.mo34197b();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        this.f138974x = true;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: f */
    public final void mo33828f() {
        super.mo33828f();
        this.f138974x = true;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: g */
    public final void mo33829g() {
        super.mo33829g();
        this.f138974x = true;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: h */
    public final void mo33830h() {
        super.mo33830h();
        this.f138974x = false;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: i */
    public final void mo33831i() {
        super.mo33831i();
        this.f138974x = false;
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: j */
    public final void mo33832j() {
        super.mo33832j();
        this.f138974x = false;
    }

    /* renamed from: o */
    private static boolean m110838o() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.p1467b.AbstractC20630e, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void ay_() {
        super.ay_();
        if (this.f138960g != null) {
            getAdapterPosition();
        }
    }

    /* renamed from: p */
    private static boolean m110839p() {
        if (C58029j.f132253e && C58029j.m104846b() && !C58029j.m104847c()) {
            return C58029j.f132253e;
        }
        boolean o = m110838o();
        C58029j.f132253e = o;
        return o;
    }

    /* renamed from: q */
    private static boolean m110840q() {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        return C34593a.m70629a("aweme_app", "use_dynamic_cover", z);
    }

    /* renamed from: m */
    private final void m110836m() {
        Aweme aweme = this.f138960g;
        if (aweme != null) {
            Video video = aweme.getVideo();
            C89219l.m154716b(video, "");
            if (m110835a(video, "MusicDetailVideoItemViewHolder")) {
                this.f138965o = true;
            } else {
                m110834a(video.getCover(), "MusicDetailVideoItemViewHolder");
            }
        }
    }

    /* renamed from: n */
    private boolean m110837n() {
        if (C62845i.m113257a()) {
            return false;
        }
        View view = this.itemView;
        C89219l.m154716b(view, "");
        view.getContext();
        if (m110839p()) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            if (!C51426a.m95802a(view2.getContext())) {
                return false;
            }
        }
        if (m110840q()) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    public final void at_() {
        if (this.f138972v.getController() != null) {
            AbstractC24255a controller = this.f138972v.getController();
            if (controller == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(controller, "");
            if (controller.mo39821i() != null) {
                AbstractC24255a controller2 = this.f138972v.getController();
                if (controller2 == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(controller2, "");
                Animatable i = controller2.mo39821i();
                if (i instanceof AbstractC24269a) {
                    ((AbstractC24269a) i).mo40040a();
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: a */
    public final void mo66990a(boolean z) {
        this.f138972v.setUserVisibleHint(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39062g
    /* renamed from: b */
    public final void mo66994b(boolean z) {
        this.f138972v.setAttached(z);
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.MusicDetailVideoItemViewHolder$b */
    static final class View$OnClickListenerC61207b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusicDetailVideoItemViewHolder f138975a;

        /* renamed from: b */
        final /* synthetic */ Aweme f138976b;

        static {
            Covode.recordClassIndex(71813);
        }

        View$OnClickListenerC61207b(MusicDetailVideoItemViewHolder musicDetailVideoItemViewHolder, Aweme aweme) {
            this.f138975a = musicDetailVideoItemViewHolder;
            this.f138976b = aweme;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (this.f138976b.getStatus() == null || !this.f138976b.getStatus().isDelete()) {
                this.f138975a.f138963l.mo62403a(view, this.f138975a.f138960g, this.f138975a.f138964m);
            } else {
                new C79459a(this.f138975a.f138959f).mo123050a(R.string.h6z).mo123053a();
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(Aweme aweme) {
        Aweme aweme2 = aweme;
        C89219l.m154721d(aweme2, "");
        this.f138972v.setOnClickListener(new View$OnClickListenerC61207b(this, aweme2));
        this.f138972v.setAnimationListener(this.f138961j);
        this.f138972v.setUserVisibleHint(false);
        SmartImageView smartImageView = this.f138972v;
        getPosition();
        smartImageView.setContentDescription("");
        this.f138960g = aweme2;
        if (this.f138962k) {
            m110836m();
        }
        this.f138966p.setVisibility(4);
        this.f138967q.setVisibility(8);
        this.f138968r.setVisibility(8);
        this.f138969s.setVisibility(8);
        m110833a(this.f138971u, aweme2);
        this.f138970t.setVisibility(8);
        m110833a(this.f138970t, aweme2);
        if (aweme2.getMusicStarter() != null) {
            this.f138969s.setVisibility(0);
            if (!TextUtils.isEmpty(aweme2.getLabelMusicStarterText())) {
                this.f138969s.setText(aweme2.getLabelMusicStarterText());
            }
        }
        if (aweme2.isPgcShow() && aweme2.getTextTopLabels() != null && aweme2.getTextTopLabels().size() > 0) {
            this.f138967q.setVisibility(0);
            this.f138966p.setVisibility(8);
            TextView textView = this.f138967q;
            AwemeTextLabelModel awemeTextLabelModel = aweme2.getTextTopLabels().get(0);
            C89219l.m154716b(awemeTextLabelModel, "");
            AwemeTextLabelModel awemeTextLabelModel2 = awemeTextLabelModel;
            if (TextUtils.isEmpty(awemeTextLabelModel2.getLabelName())) {
                textView.setVisibility(8);
                return;
            }
            textView.setText(awemeTextLabelModel2.getLabelName());
            textView.setTextSize(0, this.f138973w);
            textView.setTextColor(Color.parseColor(awemeTextLabelModel2.getTextColor()));
            textView.setBackground(C34729o.m70951a(Color.parseColor(awemeTextLabelModel2.getBgColor()), (float) C34728n.m70946a(2.0d)));
            textView.setSingleLine();
        }
    }

    /* renamed from: a */
    private static void m110833a(View view, Aweme aweme) {
        if (C80635y.m139811f(aweme)) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* renamed from: a */
    private final void m110834a(UrlModel urlModel, String str) {
        Video video;
        C20766v a = C20761r.m39060a(C34735v.m70965a(urlModel));
        int[] a2 = C80397em.m139369a(200);
        if (a2 != null) {
            a.mo34185b(a2);
        }
        a.f49092E = this.f138972v;
        a.mo34179a(str).mo34186c();
        Aweme aweme = this.f138960g;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            video.setCachedOuterCoverUrl(urlModel);
            video.setCachedOuterCoverSize(a2);
        }
    }

    /* renamed from: a */
    private final boolean m110835a(Video video, String str) {
        if (!m110837n()) {
            return false;
        }
        C34363c cVar = C34363c.f81236a;
        SmartImageView smartImageView = this.f138972v;
        if (video == null) {
            C89219l.m154715b();
        }
        if (C34363c.m70319a(cVar, smartImageView, video, str, true, false, 96)) {
            return true;
        }
        return false;
    }
}
