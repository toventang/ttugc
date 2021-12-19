package com.p2082ss.android.ugc.aweme.anchor.multi.p2314ui;

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
import com.p2082ss.android.ugc.aweme.feed.assem.C48342a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.p2949i.AbstractC49691s;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.feed.service.C49912a;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.anchor.multi.ui.FeedMultiTagLayout */
public final class FeedMultiTagLayout extends FrameLayout implements AbstractC34673c {

    /* renamed from: a */
    public AbstractC34674d f79608a;

    /* renamed from: b */
    private AbstractC49691s<C49672ag> f79609b;

    /* renamed from: c */
    private boolean f79610c;

    /* renamed from: d */
    private Drawable f79611d;

    static {
        Covode.recordClassIndex(40371);
    }

    public FeedMultiTagLayout(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public FeedMultiTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c
    /* renamed from: k */
    public final View mo59621k() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.multi.ui.FeedMultiTagLayout$a */
    static final class RunnableC33510a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FeedMultiTagLayout f79612a;

        static {
            Covode.recordClassIndex(40372);
        }

        RunnableC33510a(FeedMultiTagLayout feedMultiTagLayout) {
            this.f79612a = feedMultiTagLayout;
        }

        public final void run() {
            this.f79612a.mo59612b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.multi.ui.FeedMultiTagLayout$b */
    static final class RunnableC33511b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FeedMultiTagLayout f79613a;

        static {
            Covode.recordClassIndex(40373);
        }

        RunnableC33511b(FeedMultiTagLayout feedMultiTagLayout) {
            this.f79613a = feedMultiTagLayout;
        }

        public final void run() {
            this.f79613a.mo59613c();
        }
    }

    /* renamed from: l */
    public final void mo59622l() {
        this.f79608a.mo61335a(this);
    }

    /* renamed from: m */
    private SmartImageView m68656m() {
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

    /* renamed from: com.ss.android.ugc.aweme.anchor.multi.ui.FeedMultiTagLayout$c */
    static final class RunnableC33512c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ FeedMultiTagLayout f79614a;

        static {
            Covode.recordClassIndex(40374);
        }

        RunnableC33512c(FeedMultiTagLayout feedMultiTagLayout) {
            this.f79614a = feedMultiTagLayout;
        }

        public final void run() {
            if (this.f79614a.f79608a.mo61336a()) {
                this.f79614a.setVisibility(0);
                this.f79614a.f79608a.mo61337b(this.f79614a);
            }
        }
    }

    /* renamed from: b */
    public final void mo59612b() {
        if (!this.f79610c) {
            Context context = getContext();
            Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
            C1870c.m6046a((Activity) context, R.layout.rt, this, true);
            this.f79610c = true;
        }
    }

    /* renamed from: a */
    public final void mo59611a() {
        if (C48342a.f112042a) {
            C58254p.m105190a().post(new RunnableC33510a(this));
            C58254p.m105190a().post(new RunnableC33511b(this));
            C58254p.m105190a().post(new RunnableC33512c(this));
            return;
        }
        mo59612b();
        mo59613c();
        if (this.f79608a.mo61336a()) {
            setVisibility(0);
            this.f79608a.mo61337b(this);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.anchor.AbstractC34673c
    /* renamed from: c */
    public final void mo59613c() {
        if (this.f79610c) {
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
            m68656m().setImageResource(R.color.c9);
            m68656m().setVisibility(8);
        }
    }

    public final void setOnInternalEventListener(AbstractC49691s<C49672ag> sVar) {
        C89219l.m154721d(sVar, "");
        this.f79609b = sVar;
    }

    public final void setRootBackgroundDrawable(Drawable drawable) {
        this.f79611d = drawable;
        mo59612b();
        View findViewById = findViewById(R.id.jm);
        C89219l.m154716b(findViewById, "");
        ((LinearLayout) findViewById).setBackground(this.f79611d);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FeedMultiTagLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6358);
        Object a = C49912a.m93715a(AbstractC34674d.class);
        C89219l.m154716b(a, "");
        this.f79608a = (AbstractC34674d) a;
        MethodCollector.m26664o(6358);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ FeedMultiTagLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final int mo59610a(Aweme aweme, Activity activity, String str, JSONObject jSONObject) {
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(activity, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(jSONObject, "");
        return this.f79608a.mo61334a(aweme, activity, str, jSONObject, this.f79609b, false, this);
    }
}
