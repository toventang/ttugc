package com.p2082ss.android.ugc.aweme.notification.followrequest.p3527b;

import android.app.Activity;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.p1721g.C23144b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.p2379ui.AvatarImageWithVerify;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.notification.adapter.AbstractC61851j;
import com.p2082ss.android.ugc.aweme.notification.followrequest.api.FollowRequestApiManager;
import com.p2082ss.android.ugc.aweme.notification.p3528g.C62023a;
import com.p2082ss.android.ugc.aweme.p2479ck.C36125t;
import com.p2082ss.android.ugc.aweme.p2479ck.C36131u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.trill.R;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.notification.followrequest.b.a */
public final class View$OnClickListenerC62009a extends RecyclerView.ViewHolder implements View.OnClickListener, WeakHandler.IHandler {

    /* renamed from: a */
    public User f140720a;

    /* renamed from: b */
    public AvatarImageWithVerify f140721b;

    /* renamed from: c */
    public TextView f140722c;

    /* renamed from: d */
    public TextView f140723d;

    /* renamed from: e */
    private Activity f140724e;

    /* renamed from: f */
    private WeakHandler f140725f = new WeakHandler(this);

    /* renamed from: g */
    private ImageView f140726g;

    /* renamed from: h */
    private ImageView f140727h;

    /* renamed from: i */
    private ViewGroup f140728i;

    /* renamed from: j */
    private AbstractC61851j f140729j;

    static {
        Covode.recordClassIndex(72760);
    }

    @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
    }

    /* renamed from: a */
    private static boolean m112155a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        C17867d.m33078a();
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m112155a();
        }
        if (!C58029j.f132256h) {
            new C23144b(this.f140724e).mo37640e(R.string.dcq).mo37637b();
            return;
        }
        int id = view.getId();
        if (id == R.id.bqm) {
            AbstractC61851j jVar = this.f140729j;
            if (jVar != null) {
                jVar.mo93501d(getAdapterPosition());
            }
            FollowRequestApiManager.m112154a(this.f140725f, this.f140720a.getUid(), 0);
            LogHelperImpl.m77303a().mo66437c("follow_request_page", this.f140720a.getUid());
        } else if (id == R.id.brc) {
            AbstractC61851j jVar2 = this.f140729j;
            if (jVar2 != null) {
                jVar2.mo93501d(getAdapterPosition());
            }
            FollowRequestApiManager.m112153a(this.f140725f, this.f140720a.getUid());
            LogHelperImpl.m77303a().mo66438d("follow_request_page", this.f140720a.getUid());
        } else if (id == R.id.br0) {
            C36125t.m73596a(C36125t.m73591a(), this.f140724e, C36131u.m73602a("aweme://user/profile/" + this.f140720a.getUid()).mo63248a("sec_user_id", this.f140720a.getSecUid()).mo63249a());
            LogHelperImpl.m77303a().mo66433a("follow_request_page", this.f140720a.getUid(), "click_head");
        } else if (id == R.id.br_ || id == R.id.br1) {
            C36125t.m73596a(C36125t.m73591a(), this.f140724e, C36131u.m73602a("aweme://user/profile/" + this.f140720a.getUid()).mo63248a("sec_user_id", this.f140720a.getSecUid()).mo63249a());
            LogHelperImpl.m77303a().mo66433a("follow_request_page", this.f140720a.getUid(), "click_name");
        } else if (id == R.id.brf) {
            C36125t.m73596a(C36125t.m73591a(), this.f140724e, C36131u.m73602a("aweme://user/profile/" + this.f140720a.getUid()).mo63248a("sec_user_id", this.f140720a.getSecUid()).mo63249a());
            LogHelperImpl.m77303a().mo66433a("follow_request_page", this.f140720a.getUid(), "click_card");
        }
    }

    public View$OnClickListenerC62009a(View view, Activity activity, AbstractC61851j jVar, final Set<String> set) {
        super(view);
        this.f140724e = activity;
        this.f140728i = (ViewGroup) view.findViewById(R.id.brf);
        this.f140721b = (AvatarImageWithVerify) view.findViewById(R.id.br0);
        this.f140722c = (TextView) view.findViewById(R.id.br_);
        this.f140723d = (TextView) view.findViewById(R.id.br1);
        this.f140726g = (ImageView) view.findViewById(R.id.bqm);
        this.f140727h = (ImageView) view.findViewById(R.id.brc);
        this.f140729j = jVar;
        C62023a.m112168a(this.f140728i);
        C62023a.m112168a(this.f140726g);
        C62023a.m112168a(this.f140727h);
        this.f140721b.setOnClickListener(this);
        this.f140722c.setOnClickListener(this);
        this.f140723d.setOnClickListener(this);
        this.f140728i.setOnClickListener(this);
        this.f140726g.setOnClickListener(this);
        this.f140727h.setOnClickListener(this);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.p2082ss.android.ugc.aweme.notification.followrequest.p3527b.View$OnClickListenerC62009a.View$OnAttachStateChangeListenerC620101 */

            static {
                Covode.recordClassIndex(72761);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            public final void onViewAttachedToWindow(View view) {
                if (View$OnClickListenerC62009a.this.f140720a != null && !TextUtils.isEmpty(View$OnClickListenerC62009a.this.f140720a.getUid()) && !set.contains(View$OnClickListenerC62009a.this.f140720a.getUid())) {
                    C39162r.m79460a("follow_request_message", new C33744d().mo59983a("enter_from", "follow_request_page").mo59983a("user_id", View$OnClickListenerC62009a.this.f140720a.getUid()).f79943a);
                    set.add(View$OnClickListenerC62009a.this.f140720a.getUid());
                }
            }
        });
    }
}
