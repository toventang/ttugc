package com.p2082ss.android.ugc.aweme.commercialize.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.commercialize.log.C38187i;
import com.p2082ss.android.ugc.aweme.commercialize.util.C38585e;
import com.p2082ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.AbstractC33115c;
import com.p2082ss.android.ugc.aweme.p2282ad.p2284b.C33113b;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.OpenURLHintLayout */
public final class OpenURLHintLayout extends HeaderFrameLayout implements View.OnClickListener {

    /* renamed from: f */
    private Aweme f91636f;

    /* renamed from: g */
    private boolean f91637g;

    static {
        Covode.recordClassIndex(46355);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout
    public final boolean getCanScaleContent() {
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.commercialize.views.HeaderFrameLayout
    public final boolean getCanScroll() {
        return this.f91637g;
    }

    /* renamed from: a */
    public final void mo67406a(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        setScrollOffset(0);
        setAweme(aweme);
        if (this.f91637g) {
            if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
                C38187i.C38188a aVar = new C38187i.C38188a();
                aVar.f90222a = awemeRawAd;
                aVar.f90224c = false;
                C38585e.m78291a("draw_ad", "open_card_show", aVar.mo66507a(), awemeRawAd);
            }
            View header = getHeader();
            if (header != null) {
                postDelayed(new HeaderFrameLayout.RunnableC38799b(this, header, this), 500);
            }
        }
    }

    public final void onClick(View view) {
        AwemeRawAd awemeRawAd;
        AwemeRawAd awemeRawAd2;
        ClickAgent.onClick(view);
        C89219l.m154721d(view, "");
        int id = view.getId();
        if (id == R.id.f4) {
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33115c a = C33113b.m67826a();
            if (a != null) {
                a.mo58929a(getContext(), this.f91636f);
            }
            Aweme aweme = this.f91636f;
            if (aweme != null && (awemeRawAd2 = aweme.getAwemeRawAd()) != null) {
                C38187i.C38188a aVar = new C38187i.C38188a();
                aVar.f90222a = awemeRawAd2;
                aVar.f90224c = false;
                C38585e.m78291a("draw_ad", "open_card_jump", aVar.mo66507a(), awemeRawAd2);
            }
        } else if (id == R.id.f2) {
            View header = getHeader();
            if (header != null) {
                postDelayed(new HeaderFrameLayout.RunnableC38802c(this, header, this), 0);
            }
            Aweme aweme2 = this.f91636f;
            if (!(aweme2 == null || (awemeRawAd = aweme2.getAwemeRawAd()) == null)) {
                C38187i.C38188a aVar2 = new C38187i.C38188a();
                aVar2.f90222a = awemeRawAd;
                aVar2.f90224c = false;
                C38585e.m78291a("draw_ad", "open_card_close", aVar2.mo66507a(), awemeRawAd);
            }
            setAweme(null);
        }
    }

    private final void setAweme(Aweme aweme) {
        int i;
        String str;
        AwemeRawAd awemeRawAd;
        String str2;
        AwemeRawAd awemeRawAd2;
        AwemeRawAd awemeRawAd3;
        MethodCollector.m26663i(7342);
        if (aweme == null || (awemeRawAd3 = aweme.getAwemeRawAd()) == null) {
            i = -1;
        } else {
            i = awemeRawAd3.getTipsType();
        }
        String str3 = null;
        if (i == 1) {
            C89219l.m154716b(C33113b.C33114a.f78704a, "");
            AbstractC33115c a = C33113b.m67826a();
            if (a != null) {
                if (aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null) {
                    str = null;
                } else {
                    str = awemeRawAd2.getOpenUrl();
                }
                if (a.mo58955c(str)) {
                    View header = getHeader();
                    if (header == null) {
                        header = LayoutInflater.from(getContext()).inflate(R.layout.v6, this);
                    }
                    View findViewById = header.findViewById(R.id.f6);
                    C89219l.m154716b(findViewById, "");
                    TextView textView = (TextView) findViewById;
                    if (!(aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null)) {
                        C89219l.m154716b(awemeRawAd, "");
                        String schemaName = awemeRawAd.getSchemaName();
                        if (schemaName == null || schemaName.length() == 0) {
                            str2 = getResources().getString(R.string.o9);
                        } else {
                            str2 = awemeRawAd.getSchemaName();
                        }
                        str3 = getResources().getString(R.string.oc, str2);
                        C89219l.m154716b(str3, "");
                    }
                    textView.setText(str3);
                    header.findViewById(R.id.f4).setOnClickListener(this);
                    header.findViewById(R.id.f2).setOnClickListener(this);
                    this.f91637g = true;
                    this.f91636f = aweme;
                    MethodCollector.m26664o(7342);
                    return;
                }
            }
        }
        this.f91637g = false;
        this.f91636f = null;
        MethodCollector.m26664o(7342);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenURLHintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        setHeaderId(R.id.f5);
    }
}
