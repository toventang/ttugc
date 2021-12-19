package com.p2082ss.android.ugc.aweme.profile.p3576ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.p2082ss.android.ugc.aweme.profile.model.LiveEventStruct;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.views.ProfileLiveEventView */
public final class ProfileLiveEventView extends LinearLayout {

    /* renamed from: d */
    private static final C64319a f145786d = new C64319a((byte) 0);

    /* renamed from: a */
    public View f145787a;

    /* renamed from: b */
    public TextView f145788b;

    /* renamed from: c */
    private SmartImageView f145789c;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.views.ProfileLiveEventView$b */
    public interface AbstractC64320b {
        static {
            Covode.recordClassIndex(75767);
        }

        /* renamed from: a */
        void mo103812a(LiveEventStruct liveEventStruct);
    }

    static {
        Covode.recordClassIndex(75765);
    }

    public ProfileLiveEventView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.views.ProfileLiveEventView$a */
    static final class C64319a {
        static {
            Covode.recordClassIndex(75766);
        }

        private C64319a() {
        }

        public /* synthetic */ C64319a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.views.ProfileLiveEventView$c */
    public static final class View$OnClickListenerC64321c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC64320b f145790a;

        /* renamed from: b */
        final /* synthetic */ LiveEventStruct f145791b;

        static {
            Covode.recordClassIndex(75768);
        }

        public View$OnClickListenerC64321c(AbstractC64320b bVar, LiveEventStruct liveEventStruct) {
            this.f145790a = bVar;
            this.f145791b = liveEventStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f145790a.mo103812a(this.f145791b);
        }
    }

    private /* synthetic */ ProfileLiveEventView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ProfileLiveEventView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7726);
        View.inflate(context, R.layout.anz, this);
        View findViewById = findViewById(R.id.d7u);
        C89219l.m154716b(findViewById, "");
        this.f145787a = findViewById;
        View findViewById2 = findViewById(R.id.d7t);
        C89219l.m154716b(findViewById2, "");
        this.f145789c = (SmartImageView) findViewById2;
        View findViewById3 = findViewById(R.id.d7v);
        C89219l.m154716b(findViewById3, "");
        this.f145788b = (TextView) findViewById3;
        MethodCollector.m26664o(7726);
    }
}
