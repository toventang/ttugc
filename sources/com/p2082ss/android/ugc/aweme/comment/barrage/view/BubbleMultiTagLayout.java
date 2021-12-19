package com.p2082ss.android.ugc.aweme.comment.barrage.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c;
import com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34674d;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.service.C49912a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.BubbleMultiTagLayout */
public final class BubbleMultiTagLayout extends FrameLayout implements AbstractC34673c {

    /* renamed from: a */
    public AbstractC34674d f85991a;

    /* renamed from: b */
    AbstractC49691s<C49672ag> f85992b;

    /* renamed from: c */
    private boolean f85993c;

    /* renamed from: d */
    private Drawable f85994d;

    static {
        Covode.recordClassIndex(43650);
    }

    public BubbleMultiTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c
    /* renamed from: k */
    public final View mo59621k() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.BubbleMultiTagLayout$a */
    static final class RunnableC36363a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BubbleMultiTagLayout f85995a;

        static {
            Covode.recordClassIndex(43651);
        }

        RunnableC36363a(BubbleMultiTagLayout bubbleMultiTagLayout) {
            this.f85995a = bubbleMultiTagLayout;
        }

        public final void run() {
            this.f85995a.mo63625a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.BubbleMultiTagLayout$b */
    static final class RunnableC36364b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BubbleMultiTagLayout f85996a;

        static {
            Covode.recordClassIndex(43652);
        }

        RunnableC36364b(BubbleMultiTagLayout bubbleMultiTagLayout) {
            this.f85996a = bubbleMultiTagLayout;
        }

        public final void run() {
            this.f85996a.mo59613c();
        }
    }

    /* renamed from: b */
    private SmartImageView m74071b() {
        View findViewById = findViewById(R.id.jn);
        C89219l.m154716b(findViewById, "");
        return (SmartImageView) findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c
    /* renamed from: d */
    public final SmartImageView mo59614d() {
        View findViewById = findViewById(R.id.jk);
        C89219l.m154716b(findViewById, "");
        return (SmartImageView) findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c
    /* renamed from: e */
    public final TextView mo59615e() {
        View findViewById = findViewById(R.id.jp);
        C89219l.m154716b(findViewById, "");
        return (TextView) findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c
    /* renamed from: f */
    public final TextView mo59616f() {
        View findViewById = findViewById(R.id.jq);
        C89219l.m154716b(findViewById, "");
        return (TextView) findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c
    /* renamed from: g */
    public final ImageView mo59617g() {
        View findViewById = findViewById(R.id.jl);
        C89219l.m154716b(findViewById, "");
        return (ImageView) findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c
    /* renamed from: h */
    public final View mo59618h() {
        View findViewById = findViewById(R.id.jm);
        C89219l.m154716b(findViewById, "");
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c
    /* renamed from: i */
    public final View mo59619i() {
        View findViewById = findViewById(R.id.js);
        C89219l.m154716b(findViewById, "");
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c
    /* renamed from: j */
    public final TextView mo59620j() {
        View findViewById = findViewById(R.id.jo);
        C89219l.m154716b(findViewById, "");
        return (TextView) findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.barrage.view.BubbleMultiTagLayout$c */
    static final class RunnableC36365c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ BubbleMultiTagLayout f85997a;

        static {
            Covode.recordClassIndex(43653);
        }

        RunnableC36365c(BubbleMultiTagLayout bubbleMultiTagLayout) {
            this.f85997a = bubbleMultiTagLayout;
        }

        public final void run() {
            if (this.f85997a.f85991a.mo61336a()) {
                this.f85997a.setVisibility(0);
                this.f85997a.f85991a.mo61337b(this.f85997a);
            }
        }
    }

    /* renamed from: a */
    public final void mo63625a() {
        if (!this.f85993c) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            C1870c.m6046a((Activity) context, R.layout.i1, this, true);
            this.f85993c = true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c
    /* renamed from: c */
    public final void mo59613c() {
        if (this.f85993c) {
            setVisibility(8);
            TextView e = mo59615e();
            e.setText("");
            ViewGroup.LayoutParams layoutParams = e.getLayoutParams();
            layoutParams.width = -2;
            e.setLayoutParams(layoutParams);
            mo59616f().setVisibility(8);
            TextView j = mo59620j();
            j.setVisibility(8);
            j.setText("");
            ViewGroup.LayoutParams layoutParams2 = j.getLayoutParams();
            layoutParams2.width = -2;
            j.setLayoutParams(layoutParams2);
            mo59619i().setVisibility(8);
            mo59617g().setVisibility(8);
            mo59614d().setImageResource(R.color.c9);
            m74071b().setImageResource(R.color.c9);
            m74071b().setVisibility(8);
        }
    }

    public final void setOnInternalEventListener(AbstractC49691s<C49672ag> sVar) {
        C89219l.m154721d(sVar, "");
        this.f85992b = sVar;
    }

    public final void setRootBackgroundDrawable(Drawable drawable) {
        this.f85994d = drawable;
        mo63625a();
        View findViewById = findViewById(R.id.jm);
        C89219l.m154716b(findViewById, "");
        ((LinearLayout) findViewById).setBackground(this.f85994d);
    }

    private /* synthetic */ BubbleMultiTagLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BubbleMultiTagLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(10832);
        Object a = C49912a.m93715a(AbstractC34674d.class);
        C89219l.m154716b(a, "");
        this.f85991a = (AbstractC34674d) a;
        MethodCollector.m26664o(10832);
    }
}
