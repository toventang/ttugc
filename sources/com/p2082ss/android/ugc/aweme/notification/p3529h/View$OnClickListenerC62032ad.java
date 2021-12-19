package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.follow.widet.C51086a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.FriendNotice;
import com.p2082ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.utils.C62269l;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationFollowUserBtn;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.UserVerify;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.notification.h.ad */
public final class View$OnClickListenerC62032ad extends AbstractView$OnLongClickListenerC62118k implements View.OnClickListener {

    /* renamed from: a */
    private RelativeLayout f140786a;

    /* renamed from: b */
    private AvatarImageWithVerify f140787b;

    /* renamed from: c */
    private TextView f140788c;

    /* renamed from: d */
    private NotificationFollowUserBtn f140789d;

    /* renamed from: e */
    private FriendNotice f140790e;

    /* renamed from: f */
    private Context f140791f;

    /* renamed from: m */
    private C51086a f140792m = new C51086a(this.f140789d, null);

    static {
        Covode.recordClassIndex(72786);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k
    public final int ce_() {
        return R.id.cuc;
    }

    /* renamed from: h */
    private static boolean m112208h() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k
    /* renamed from: f */
    public final void mo100100f() {
        super.mo100146g();
        this.f140768h.mo100338a(this.f140984j, new C62033ae(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C89391z mo100103c() {
        C62259e.m112619a("friend", this.f140985k, this.f140986l, this.f140768h.mo100337a(), this.f140984j.templateId);
        return null;
    }

    public View$OnClickListenerC62032ad(View view) {
        super(view);
        this.f140791f = view.getContext();
        this.f140786a = (RelativeLayout) view.findViewById(R.id.cuc);
        this.f140787b = (AvatarImageWithVerify) view.findViewById(R.id.cub);
        this.f140788c = (TextView) view.findViewById(R.id.cu7);
        NotificationFollowUserBtn notificationFollowUserBtn = (NotificationFollowUserBtn) view.findViewById(R.id.cu6);
        this.f140789d = notificationFollowUserBtn;
        notificationFollowUserBtn.getLayoutParams().width = C62262g.m112633a(this.f140983i);
        C62262g.m112634a(this.f140786a);
        C62262g.m112634a(this.f140787b);
        C62023a.m112168a(this.f140789d);
        this.f140786a.setOnClickListener(this);
        this.f140787b.setOnClickListener(this);
        this.f140787b.setRequestImgSize(C80397em.m139369a(101));
    }

    /* renamed from: a */
    public final void mo100102a(MusNotice musNotice) {
        UserVerify userVerify;
        if (musNotice != null && musNotice.friendNotice != null) {
            FriendNotice friendNotice = musNotice.friendNotice;
            this.f140790e = friendNotice;
            User user = friendNotice.getUser();
            if (user != null) {
                userVerify = new UserVerify(user.getAvatarThumb(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), Integer.valueOf(user.getVerificationType()));
            } else {
                userVerify = null;
            }
            this.f140787b.setUserData(userVerify);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String a = C62269l.m112651a(this.f140790e.getUser());
            if (a != null) {
                spannableStringBuilder.append((CharSequence) a);
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
            }
            spannableStringBuilder.append(" ");
            spannableStringBuilder.append((CharSequence) this.f140791f.getString(R.string.d8n));
            mo100141a(spannableStringBuilder, musNotice);
            this.f140788c.setText(spannableStringBuilder);
            this.f140789d.setFollowStatus(this.f140790e.getUser().getFollowStatus());
            C51086a aVar = this.f140792m;
            if (aVar != null) {
                aVar.mo86508a(this.f140790e.getUser());
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112208h();
        }
        if (!C58029j.f132256h) {
            new C23144b(this.itemView).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        int id = view.getId();
        if (id == R.id.cuc || id == R.id.cu6) {
            mo100143a("friend", getLayoutPosition());
            C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a(this.f140790e.getOpenUrl()).mo63248a("enter_from", "message").f85356a.mo52126a());
        } else if (id == R.id.cub) {
            C36125t.m73598a(C36125t.m73591a(), C36131u.m73602a(this.f140790e.getOpenUrl()).mo63248a("enter_from", "message").f85356a.mo52126a());
        }
    }
}
