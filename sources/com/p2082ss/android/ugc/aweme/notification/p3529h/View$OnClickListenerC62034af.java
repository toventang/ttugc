package com.p2082ss.android.ugc.aweme.notification.p3529h;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.live.LiveOuterService;
import com.p2082ss.android.ugc.aweme.notification.bean.C61884p;
import com.p2082ss.android.ugc.aweme.notification.utils.C62259e;
import com.p2082ss.android.ugc.aweme.notification.utils.C62262g;
import com.p2082ss.android.ugc.aweme.notification.view.C62291e;
import com.p2082ss.android.ugc.aweme.notification.view.LiveCircleView;
import com.p2082ss.android.ugc.aweme.notification.view.NotificationBoldSpan;
import com.p2082ss.android.ugc.aweme.story.live.C77354d;
import com.p2082ss.android.ugc.trill.R;
import p4600h.C89391z;

/* renamed from: com.ss.android.ugc.aweme.notification.h.af */
public final class View$OnClickListenerC62034af extends AbstractView$OnLongClickListenerC62118k implements View.OnClickListener {

    /* renamed from: a */
    public C62291e f140794a;

    /* renamed from: b */
    private ConstraintLayout f140795b;

    /* renamed from: c */
    private AvatarImageView f140796c;

    /* renamed from: d */
    private LiveCircleView f140797d;

    /* renamed from: e */
    private TextView f140798e;

    /* renamed from: f */
    private Button f140799f;

    /* renamed from: m */
    private Context f140800m;

    static {
        Covode.recordClassIndex(72788);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k
    public final int ce_() {
        return R.id.cv7;
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.AbstractView$OnLongClickListenerC62118k, com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    /* renamed from: e */
    public final boolean mo100082e() {
        return false;
    }

    /* renamed from: h */
    private static boolean m112212h() {
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
        this.f140768h.mo100338a(this.f140984j, new C62035ag(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ C89391z mo100105c() {
        C62259e.m112619a("live", this.f140985k, this.f140986l, this.f140768h.mo100337a(), this.f140984j.templateId);
        return null;
    }

    /* renamed from: a */
    public final void mo100104a(C61884p pVar) {
        if (pVar != null) {
            this.f140794a.mo100283a(pVar.f140503a);
            this.f140794a.mo100282a();
            String charSequence = this.f140798e.getText().toString();
            if (!TextUtils.isEmpty(charSequence)) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) charSequence);
                spannableStringBuilder.setSpan(new NotificationBoldSpan(), 0, spannableStringBuilder.length(), 33);
                this.f140798e.setText(spannableStringBuilder);
            }
        }
    }

    public View$OnClickListenerC62034af(View view) {
        super(view);
        this.f140800m = view.getContext();
        this.f140795b = (ConstraintLayout) view.findViewById(R.id.cv7);
        this.f140796c = (AvatarImageView) view.findViewById(R.id.br6);
        this.f140797d = (LiveCircleView) view.findViewById(R.id.br7);
        this.f140798e = (TextView) view.findViewById(R.id.cu7);
        this.f140799f = (Button) view.findViewById(R.id.cu6);
        C62262g.m112634a(this.f140795b);
        C62262g.m112634a(this.f140796c);
        C62262g.m112634a(this.f140799f);
        this.f140799f.setOnClickListener(this);
        this.f140795b.setOnClickListener(this);
        this.f140796c.setOnClickListener(this);
        C62291e eVar = new C62291e();
        this.f140794a = eVar;
        ConstraintLayout constraintLayout = this.f140795b;
        eVar.f141390b = (AvatarImageView) constraintLayout.findViewById(R.id.br6);
        eVar.f141389a = (LiveCircleView) constraintLayout.findViewById(R.id.br7);
    }

    @Override // com.p2082ss.android.ugc.aweme.notification.p3529h.View$OnClickListenerC62026a
    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112212h();
        }
        if (!C58029j.f132256h) {
            new C23144b(this.itemView).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        int id = view.getId();
        if (id == R.id.cv7 || id == R.id.cu6 || id == R.id.br6 || id == R.id.br7) {
            mo100143a("live", getLayoutPosition());
            EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
            enterRoomConfig.f28233c.f28298O = true;
            C77354d.m135260a("message", "");
            LogHelperImpl.m77303a().mo66436b("message", "new_type");
            LiveOuterService.m107269s().mo95835i().mo105595b(this.f140800m, enterRoomConfig, "message");
        }
    }
}
