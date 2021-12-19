package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.p1721g.C23144b;
import com.facebook.common.p1839k.C24134g;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.C61542b;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.C61627b;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.bean.MusNotificationDetailArg;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.h.ac */
public final class View$OnClickListenerC62031ac extends AbstractView$OnLongClickListenerC62118k implements View.OnClickListener {

    /* renamed from: a */
    private View f140781a;

    /* renamed from: b */
    private AvatarImageView f140782b;

    /* renamed from: c */
    private TextView f140783c;

    /* renamed from: d */
    private C61627b f140784d;

    /* renamed from: e */
    private Context f140785e;

    static {
        Covode.recordClassIndex(72785);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k
    public final int ce_() {
        return R.id.cv7;
    }

    /* renamed from: c */
    private static boolean m112206c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    public View$OnClickListenerC62031ac(View view) {
        super(view);
        this.f140785e = view.getContext();
        this.f140781a = view.findViewById(R.id.cv7);
        this.f140782b = (AvatarImageView) view.findViewById(R.id.cuf);
        this.f140783c = (TextView) view.findViewById(R.id.cu7);
        C62262g.m112634a(this.f140781a);
        C62023a.m112168a(this.f140782b);
        this.f140781a.setOnClickListener(this);
        this.f140782b.setOnClickListener(this);
    }

    /* renamed from: a */
    public final void mo100101a(MusNotice musNotice) {
        if (musNotice != null && musNotice.adHelperNotice != null) {
            this.f140784d = musNotice.adHelperNotice;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.f140785e.getString(R.string.ch_));
            spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            if (!TextUtils.isEmpty(this.f140784d.f139874b)) {
                spannableStringBuilder.append(": ");
                spannableStringBuilder.append((CharSequence) this.f140784d.f139874b);
            }
            this.f140782b.setImageURI(C24134g.m45734a(2131231293));
            mo100141a(spannableStringBuilder, musNotice);
            this.f140783c.setText(spannableStringBuilder);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        String str;
        ClickAgent.onClick(view);
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112206c();
        }
        if (!C58029j.f132256h) {
            new C23144b(this.itemView).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(this.f140785e, "//notice/detail");
        int a = C61542b.m111458a(21);
        if (this.f140984j != null) {
            str = this.f140984j.nid;
        } else {
            str = null;
        }
        buildRoute.withNavArg(new MusNotificationDetailArg(21, a, "", "", str)).open();
    }
}
