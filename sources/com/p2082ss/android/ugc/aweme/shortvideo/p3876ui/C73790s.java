package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.scheduler.PublishService;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.tools.p4340c.C84402a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.s */
public final class C73790s implements AbstractC73761o {

    /* renamed from: a */
    public final ActivityC0945e f165658a;

    /* renamed from: b */
    public final Aweme f165659b;

    /* renamed from: c */
    public final AbstractC73762p f165660c;

    /* renamed from: d */
    private SmartImageView f165661d;

    /* renamed from: e */
    private ImageView f165662e;

    /* renamed from: f */
    private TextView f165663f;

    /* renamed from: g */
    private final View f165664g;

    static {
        Covode.recordClassIndex(86529);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73761o
    /* renamed from: a */
    public final void mo116111a(String str) {
        C89219l.m154721d(str, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73761o
    /* renamed from: b */
    public final void mo116112b() {
        if (this.f165660c.isShowing()) {
            C63244g.m114602a().mo73287o().mo104793m().mo104825a(null);
            PublishService.C67284a.m119208a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.AbstractC73761o
    /* renamed from: a */
    public final void mo116110a() {
        Aweme aweme = this.f165659b;
        if (aweme.getVideo() != null) {
            C84402a.m145169a(this.f165661d, aweme.getVideo().getCover(), (int) C13628n.m24520b(this.f165658a, 48.0f), (int) C13628n.m24520b(this.f165658a, 62.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.s$a */
    static final class View$OnClickListenerC73791a implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73790s f165665a;

        static {
            Covode.recordClassIndex(86530);
        }

        View$OnClickListenerC73791a(C73790s sVar) {
            this.f165665a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f165665a.f165660c.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.s$b */
    static final class View$OnClickListenerC73792b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73790s f165666a;

        static {
            Covode.recordClassIndex(86531);
        }

        View$OnClickListenerC73792b(C73790s sVar) {
            this.f165666a = sVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            createIAVServiceProxybyMonsterPlugin.getStoryService().mo93864a(this.f165666a.f165658a, this.f165666a.f165659b);
            this.f165666a.f165660c.dismiss();
        }
    }

    public C73790s(ActivityC0945e eVar, Aweme aweme, AbstractC73762p pVar, View view) {
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(aweme, "");
        C89219l.m154721d(pVar, "");
        C89219l.m154721d(view, "");
        this.f165658a = eVar;
        this.f165659b = aweme;
        this.f165660c = pVar;
        this.f165664g = view;
        View findViewById = view.findViewById(R.id.buj);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type com.bytedance.lighten.loader.SmartImageView");
        this.f165661d = (SmartImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.bu5);
        Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.ImageView");
        this.f165662e = (ImageView) findViewById2;
        TextView textView = (TextView) view.findViewById(R.id.f62);
        this.f165663f = textView;
        if (textView != null) {
            String string = eVar.getResources().getString(R.string.g5k);
            C89219l.m154716b(string, "");
            textView.setText(new SpannableStringBuilder(string));
            textView.setMovementMethod(new LinkMovementMethod());
        }
        ImageView imageView = this.f165662e;
        if (imageView == null) {
            C89219l.m154715b();
        }
        imageView.setOnClickListener(new View$OnClickListenerC73791a(this));
        TextView textView2 = this.f165663f;
        if (textView2 != null) {
            textView2.setOnClickListener(new View$OnClickListenerC73792b(this));
        }
    }
}
