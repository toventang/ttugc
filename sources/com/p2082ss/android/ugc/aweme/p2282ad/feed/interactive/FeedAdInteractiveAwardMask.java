package com.p2082ss.android.ugc.aweme.p2282ad.feed.interactive;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.rich.p1268a.C18129a;
import com.p2082ss.android.ugc.aweme.commercialize_ad_api.p2626a.AbstractC39043a;
import com.p2082ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.feed.AbstractC33214c;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveAwardMask */
public final class FeedAdInteractiveAwardMask extends RelativeLayout {

    /* renamed from: a */
    private final AbstractC89244h f79053a;

    /* renamed from: b */
    private AbstractC33284a f79054b;

    /* renamed from: c */
    private HashMap f79055c;

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveAwardMask$a */
    public interface AbstractC33284a {
        static {
            Covode.recordClassIndex(40112);
        }

        /* renamed from: a */
        void mo59249a(boolean z);
    }

    static {
        Covode.recordClassIndex(40111);
    }

    public FeedAdInteractiveAwardMask(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final View mo59244a(int i) {
        if (this.f79055c == null) {
            this.f79055c = new HashMap();
        }
        View view = (View) this.f79055c.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f79055c.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final AbstractC33214c getFeedAdDepend() {
        return (AbstractC33214c) this.f79053a.getValue();
    }

    public final AbstractC33284a getCallback() {
        return this.f79054b;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveAwardMask$d */
    static final class C33288d extends AbstractC89220m implements AbstractC89171a<AbstractC33214c> {

        /* renamed from: a */
        public static final C33288d f79060a = new C33288d();

        static {
            Covode.recordClassIndex(40116);
        }

        C33288d() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC33214c invoke() {
            AbstractC39043a a = CommercializeAdServiceImpl.m79243a().mo67720a(17);
            if (!(a instanceof AbstractC33214c)) {
                return null;
            }
            return a;
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackgroundColor(C0643b.m2378c(getContext(), R.color.bk));
        setOnClickListener(new View$OnClickListenerC33289e(this));
    }

    public final void setCallback(AbstractC33284a aVar) {
        this.f79054b = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveAwardMask$b */
    static final class View$OnClickListenerC33285b implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedAdInteractiveAwardMask f79056a;

        static {
            Covode.recordClassIndex(40113);
        }

        View$OnClickListenerC33285b(FeedAdInteractiveAwardMask feedAdInteractiveAwardMask) {
            this.f79056a = feedAdInteractiveAwardMask;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC33284a callback = this.f79056a.getCallback();
            if (callback != null) {
                callback.mo59249a(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveAwardMask$e */
    static final class View$OnClickListenerC33289e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedAdInteractiveAwardMask f79061a;

        static {
            Covode.recordClassIndex(40117);
        }

        View$OnClickListenerC33289e(FeedAdInteractiveAwardMask feedAdInteractiveAwardMask) {
            this.f79061a = feedAdInteractiveAwardMask;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC33284a callback = this.f79061a.getCallback();
            if (callback != null) {
                callback.mo59249a(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ad.feed.interactive.FeedAdInteractiveAwardMask$c */
    static final class View$OnClickListenerC33286c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ FeedAdInteractiveAwardMask f79057a;

        /* renamed from: b */
        final /* synthetic */ Aweme f79058b;

        static {
            Covode.recordClassIndex(40114);
        }

        View$OnClickListenerC33286c(FeedAdInteractiveAwardMask feedAdInteractiveAwardMask, Aweme aweme) {
            this.f79057a = feedAdInteractiveAwardMask;
            this.f79058b = aweme;
        }

        public final void onClick(View view) {
            AwemeRawAd awemeRawAd;
            ClickAgent.onClick(view);
            AbstractC33284a callback = this.f79057a.getCallback();
            if (callback != null) {
                callback.mo59249a(false);
            }
            AbstractC33214c feedAdDepend = this.f79057a.getFeedAdDepend();
            if (feedAdDepend != null) {
                feedAdDepend.mo59145a(this.f79057a.getContext(), this.f79058b, 48, C332871.f79059a);
            }
            Aweme aweme = this.f79058b;
            if (aweme != null) {
                awemeRawAd = aweme.getAwemeRawAd();
            } else {
                awemeRawAd = null;
            }
            C18129a.m33746a("draw_ad", "click", awemeRawAd).mo28900b("refer", "popup_window").mo28901b();
        }
    }

    private /* synthetic */ FeedAdInteractiveAwardMask(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private FeedAdInteractiveAwardMask(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6400);
        this.f79053a = C89250i.m154773a((AbstractC89171a) C33288d.f79060a);
        MethodCollector.m26664o(6400);
    }
}
