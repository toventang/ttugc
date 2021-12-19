package com.p2082ss.android.ugc.aweme.profile.p3576ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.profile.model.ProfileNgoStruct;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.views.DonationLinkView */
public final class DonationLinkView extends LinearLayout {

    /* renamed from: c */
    public static final int f145780c = R.color.bh;

    /* renamed from: d */
    public static final C64316a f145781d = new C64316a((byte) 0);

    /* renamed from: a */
    public ImageView f145782a;

    /* renamed from: b */
    public TextView f145783b;

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.views.DonationLinkView$b */
    public interface AbstractC64317b {
        static {
            Covode.recordClassIndex(75763);
        }

        /* renamed from: a */
        void mo103810a(int i);
    }

    public DonationLinkView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.views.DonationLinkView$a */
    public static final class C64316a {
        static {
            Covode.recordClassIndex(75762);
        }

        private C64316a() {
        }

        public /* synthetic */ C64316a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(75761);
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.ui.views.DonationLinkView$c */
    public static final class View$OnClickListenerC64318c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC64317b f145784a;

        /* renamed from: b */
        final /* synthetic */ ProfileNgoStruct f145785b;

        static {
            Covode.recordClassIndex(75764);
        }

        public View$OnClickListenerC64318c(AbstractC64317b bVar, ProfileNgoStruct profileNgoStruct) {
            this.f145784a = bVar;
            this.f145785b = profileNgoStruct;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f145784a.mo103810a(this.f145785b.getId());
        }
    }

    private /* synthetic */ DonationLinkView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DonationLinkView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7728);
        View.inflate(context, R.layout.anp, this);
        View findViewById = findViewById(R.id.anb);
        C89219l.m154716b(findViewById, "");
        this.f145782a = (ImageView) findViewById;
        View findViewById2 = findViewById(R.id.anc);
        C89219l.m154716b(findViewById2, "");
        this.f145783b = (TextView) findViewById2;
        MethodCollector.m26664o(7728);
    }
}
