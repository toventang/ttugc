package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import androidx.core.app.ActivityC0580d;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.C16048b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61968c;
import com.p2082ss.android.ugc.aweme.notification.p3523e.C61994d;
import com.p2082ss.android.ugc.aweme.notification.p3535vm.NotificationVM;
import com.p2082ss.android.ugc.aweme.notification.utils.C62261f;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80187aa;
import com.p2082ss.android.ugc.aweme.utils.C80471gb;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.notification.h.k */
public abstract class AbstractView$OnLongClickListenerC62118k extends View$OnClickListenerC62026a implements View.OnLongClickListener {

    /* renamed from: a */
    private final AbstractC1214u<Boolean> f140982a = new C62119l(this);

    /* renamed from: i */
    public Context f140983i;

    /* renamed from: j */
    public BaseNotice f140984j;

    /* renamed from: k */
    protected int f140985k;

    /* renamed from: l */
    protected String f140986l;

    static {
        Covode.recordClassIndex(72872);
    }

    /* access modifiers changed from: protected */
    public abstract int ce_();

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public boolean mo100082e() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo100146g() {
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: d */
    public void mo100081d() {
        super.mo100081d();
        if (this.f140768h instanceof NotificationVM) {
            this.f140768h.mo100346e().removeObserver(this.f140982a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public void cf_() {
        C61968c.HandlerC61971c b;
        super.cf_();
        mo100146g();
        if (this.f140768h instanceof NotificationVM) {
            this.f140768h.mo100346e().observe((ActivityC0580d) this.f140983i, this.f140982a);
        }
        if (this.f140984j != null && (b = C61968c.m112097b()) != null) {
            C61994d.m112120a(new C61968c.HandlerC61971c.C61977e(b, this.f140984j, getLayoutPosition()));
        }
    }

    public AbstractView$OnLongClickListenerC62118k(View view) {
        super(view);
        this.f140983i = view.getContext();
        View findViewById = view.findViewById(ce_());
        if (findViewById != null && mo100082e()) {
            findViewById.setOnLongClickListener(this);
        }
    }

    /* renamed from: a */
    public static String m112311a(BaseNotice baseNotice, Context context) {
        return m112310a(baseNotice.createTime, context);
    }

    /* renamed from: a */
    public final void mo100141a(SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice) {
        m112312a(spannableStringBuilder, baseNotice, this.f140983i);
    }

    /* renamed from: a */
    public final void mo100142a(BaseNotice baseNotice, int i) {
        this.f140984j = baseNotice;
        this.f140985k = i;
        this.f140986l = C62261f.m112631a(baseNotice.timeLineType);
    }

    /* renamed from: a */
    public static String m112310a(long j, Context context) {
        String str;
        if (j == 0) {
            return "";
        }
        if (C16048b.m29633a().mo25421a(true, "standardize_timestamp", false)) {
            StringBuilder sb = new StringBuilder(" ");
            C80187aa.C80188a aVar = C80187aa.f179656s;
            str = sb.append(C80187aa.C80188a.m139006a(j * 1000)).toString();
        } else {
            str = " " + C80566ib.m139652b(context, j * 1000);
        }
        String replaceAll = str.replaceAll("(.)", "$1⁠");
        if (!C80471gb.m139483a(context)) {
            return "‭" + replaceAll + (char) 8237;
        }
        return replaceAll;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100143a(String str, int i) {
        mo100144a(str, i, (String) null);
    }

    /* renamed from: a */
    public static void m112312a(SpannableStringBuilder spannableStringBuilder, BaseNotice baseNotice, Context context) {
        int i;
        String a = m112311a(baseNotice, context);
        if (a.indexOf(8237) >= 0) {
            i = 2;
        } else {
            i = 0;
        }
        if (!TextUtils.isEmpty(a)) {
            spannableStringBuilder.append((CharSequence) a);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(context.getResources().getColor(R.color.bz)), (spannableStringBuilder.length() - a.length()) + i, spannableStringBuilder.length(), 17);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100144a(String str, int i, String str2) {
        String str3;
        BaseNotice baseNotice = this.f140984j;
        if (baseNotice != null) {
            str3 = baseNotice.templateId;
        } else {
            str3 = "";
        }
        C33744d a = new C33744d().mo59983a("action_type", "click").mo59983a("account_type", str).mo59983a("client_order", String.valueOf(i)).mo59983a("template_id", str3);
        if (!TextUtils.isEmpty(str2)) {
            a.mo59983a("button_type", str2);
        }
        C39162r.m79460a("notification_message_inner_message", a.f79943a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo100145a(String str, String str2, BaseNotice baseNotice, String str3, String str4, User user) {
        mo100079a(str, str2, baseNotice.clientOrder, baseNotice, "", str4, str3, baseNotice.hasRead ? 1 : 0, user);
    }
}
