package com.p2082ss.android.ugc.aweme.commercialize.link.video;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.drawee.p1855f.C24246a;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38214ac;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.video.c */
public final class View$OnClickListenerC38043c extends LinearLayout implements View.OnClickListener, AbstractC38046f {

    /* renamed from: a */
    private RemoteImageView f89896a;

    /* renamed from: b */
    private TextView f89897b;

    /* renamed from: c */
    private ImageView f89898c;

    /* renamed from: d */
    private AbstractC38047g f89899d;

    static {
        Covode.recordClassIndex(45508);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38046f
    /* renamed from: c */
    public final View mo66322c() {
        return this;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38046f
    /* renamed from: a */
    public final void mo66318a() {
        AbstractC38047g gVar = this.f89899d;
        if (gVar != null) {
            gVar.mo66017a();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38046f
    /* renamed from: b */
    public final void mo66321b() {
        AbstractC38047g gVar = this.f89899d;
        if (gVar != null) {
            gVar.mo66020d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38046f
    /* renamed from: a */
    public final void mo66319a(AbstractC38047g gVar) {
        this.f89899d = gVar;
    }

    public View$OnClickListenerC38043c(Context context) {
        this(context, (byte) 0);
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        AbstractC38047g gVar = this.f89899d;
        if (gVar != null) {
            gVar.mo66018b();
        }
    }

    private View$OnClickListenerC38043c(Context context, byte b) {
        this(context, (char) 0);
    }

    private View$OnClickListenerC38043c(Context context, char c) {
        super(context, null, 0);
        MethodCollector.m26663i(6411);
        C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.a08, this, true);
        setPadding(C34728n.m70946a(5.0d), C34728n.m70946a(5.0d), C34728n.m70946a(5.0d), C34728n.m70946a(5.0d));
        setBackgroundResource(R.drawable.b11);
        this.f89896a = (RemoteImageView) findViewById(R.id.c9t);
        this.f89897b = (TextView) findViewById(R.id.c9s);
        this.f89898c = (ImageView) findViewById(R.id.c9u);
        setOnClickListener(this);
        MethodCollector.m26664o(6411);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.link.video.AbstractC38046f
    /* renamed from: a */
    public final void mo66320a(C38214ac acVar, AbstractC38047g gVar, CommerceTagLayout commerceTagLayout) {
        this.f89899d = gVar;
        if (acVar == null) {
            this.f89896a.setImageResource(R.color.c9);
            this.f89897b.setText("");
            return;
        }
        ((C24246a) this.f89896a.getHierarchy()).mo39970d(R.color.j);
        UrlModel urlModel = acVar.avatarIcon;
        if (urlModel == null || C13603b.m24435a((Collection) urlModel.getUrlList())) {
            this.f89896a.setImageResource(R.color.c9);
        } else {
            C34577e.m70592a(this.f89896a, acVar.avatarIcon);
        }
        if (acVar.showCloseTips) {
            this.f89898c.setVisibility(0);
        } else {
            this.f89898c.setVisibility(8);
        }
        this.f89898c.setOnClickListener(new View$OnClickListenerC38044d(commerceTagLayout, gVar));
        this.f89897b.setText(acVar.title);
        if (!TextUtils.isEmpty(acVar.label)) {
            TextView textView = (TextView) findViewById(R.id.g0);
            textView.setVisibility(0);
            textView.setText(acVar.label);
        }
    }
}
