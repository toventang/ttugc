package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtButton;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.keva.Keva;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34577e;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.AbstractC61571e;
import com.p2082ss.android.ugc.aweme.notice.api.p3513d.C61569d;
import com.p2082ss.android.ugc.aweme.notification.bean.C61890t;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.tutorial.TutorialVideoViewModel;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notification.h.aq */
public final class View$OnClickListenerC62059aq extends C62129p implements View.OnClickListener {

    /* renamed from: a */
    private final View f140879a;

    /* renamed from: b */
    private final AvatarImageView f140880b;

    /* renamed from: c */
    private final TextView f140881c;

    /* renamed from: d */
    private final DmtButton f140882d;

    /* renamed from: e */
    private TutorialVideoViewModel f140883e;

    /* renamed from: f */
    private Context f140884f;

    /* renamed from: q */
    private String f140885q = "";

    /* renamed from: r */
    private String f140886r = "";

    static {
        Covode.recordClassIndex(72813);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.C62129p
    public final int ce_() {
        return R.id.cv7;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        return false;
    }

    /* renamed from: c */
    private static boolean m112252c() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    private final void m112251b(String str) {
        if (!TextUtils.isEmpty(this.f140885q)) {
            C39162r.m79460a(str, new C33744d().mo59983a("group_id", this.f140885q).f79943a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC62059aq(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.cv7);
        C89219l.m154716b(findViewById, "");
        this.f140879a = findViewById;
        View findViewById2 = view.findViewById(R.id.cuf);
        C89219l.m154716b(findViewById2, "");
        AvatarImageView avatarImageView = (AvatarImageView) findViewById2;
        this.f140880b = avatarImageView;
        View findViewById3 = view.findViewById(R.id.cu7);
        C89219l.m154716b(findViewById3, "");
        this.f140881c = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.cu6);
        C89219l.m154716b(findViewById4, "");
        DmtButton dmtButton = (DmtButton) findViewById4;
        this.f140882d = dmtButton;
        C62262g.m112634a(findViewById);
        C62023a.m112168a(avatarImageView);
        C62023a.m112168a(dmtButton);
        dmtButton.setOnClickListener(this);
        findViewById.setOnClickListener(this);
        avatarImageView.setOnClickListener(this);
        dmtButton.getLayoutParams().width = C62262g.m112633a(this.f140983i);
        this.f140883e = new TutorialVideoViewModel();
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f140884f = context;
    }

    /* renamed from: a */
    public final void mo100115a(C61890t tVar) {
        if (tVar != null) {
            this.f140885q = tVar.f140520a;
            this.f140886r = tVar.f140525f;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) tVar.f140522c);
            spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) tVar.f140523d);
            this.f140881c.setText(spannableStringBuilder);
            C34577e.m70608b(this.f140880b, tVar.f140521b, -1, -1);
            this.f140882d.setText(tVar.f140524e);
            m112251b("show_teach_video");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112252c();
        }
        if (!C58029j.f132256h) {
            View view2 = this.itemView;
            C89219l.m154716b(view2, "");
            new C23144b(view2).mo37640e(R.string.dcq).mo37637b();
        } else if (!TextUtils.isEmpty(this.f140886r)) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            String curUserId = g.getCurUserId();
            Keva repo = Keva.getRepo("top_message_keva_repo");
            repo.storeLong("current_show_time_".concat(String.valueOf(curUserId)), System.currentTimeMillis());
            repo.storeInt("clicked_".concat(String.valueOf(curUserId)), 1);
            C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a(this.f140886r).f85356a.mo52126a());
            m112251b("enter_teach_video");
            AbstractC61571e eVar = (AbstractC61571e) C61569d.C61570a.m111506a(AbstractC61571e.class);
            if (eVar != null) {
                eVar.mo60987b("");
                eVar.mo60989d("");
                eVar.mo60991f("");
                eVar.mo60993h("");
                eVar.mo60995j("");
                eVar.mo60997l("");
            }
        }
    }
}
