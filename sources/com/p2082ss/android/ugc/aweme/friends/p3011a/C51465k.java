package com.p2082ss.android.ugc.aweme.friends.p3011a;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.invite.I18nFollowAndInviteUserBtn;
import com.p2082ss.android.ugc.aweme.friends.model.Friend;
import com.p2082ss.android.ugc.aweme.friends.p3013c.AbstractC51481b;
import com.p2082ss.android.ugc.aweme.friends.p3015e.C51488a;
import com.p2082ss.android.ugc.aweme.metrics.C59256u;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.recommend.C66623g;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.friends.a.k */
public final class C51465k<T extends User> extends RecyclerView.ViewHolder {

    /* renamed from: a */
    final boolean f118633a;

    /* renamed from: b */
    Context f118634b;

    /* renamed from: c */
    public T f118635c;

    /* renamed from: d */
    public int f118636d;

    /* renamed from: e */
    AbstractC51481b f118637e;

    /* renamed from: f */
    View f118638f;

    /* renamed from: g */
    TextView f118639g;

    /* renamed from: h */
    TextView f118640h;

    /* renamed from: i */
    I18nFollowAndInviteUserBtn f118641i;

    /* renamed from: j */
    ViewGroup f118642j;

    /* renamed from: k */
    TextView f118643k;

    /* renamed from: l */
    boolean f118644l;

    /* renamed from: m */
    TextView f118645m;

    /* renamed from: n */
    public int f118646n;

    /* renamed from: o */
    int f118647o;

    /* renamed from: p */
    String f118648p = "";

    static {
        Covode.recordClassIndex(60724);
    }

    /* renamed from: a */
    static String m95864a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? "" : "vk" : "facebook" : "twitter" : "weibo" : "contact_friend";
    }

    /* renamed from: b */
    public final void mo86948b() {
        T t = this.f118635c;
        if (t != null) {
            this.f118641i.mo73175a(t.getFollowStatus(), this.f118635c.getFollowerStatus());
        }
    }

    /* renamed from: d */
    public final String mo86950d() {
        int i = this.f118636d;
        if (i == 0) {
            return "contact";
        }
        if (i == 3) {
            return "facebook";
        }
        if (i == 2) {
            return "twitter";
        }
        if (i == 4) {
            return "vk";
        }
        return "";
    }

    /* renamed from: a */
    public static boolean m95865a() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: c */
    public final void mo86949c() {
        if (m95863a(this.f118635c) != null) {
            if (!m95863a(this.f118635c).isInvited()) {
                this.f118641i.mo87034d();
            } else {
                this.f118641i.mo87035e();
            }
        }
    }

    /* renamed from: a */
    static Friend m95863a(T t) {
        if (t instanceof Friend) {
            return (Friend) t;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo86947a(String str) {
        T t = this.f118635c;
        if (t != null && !TextUtils.isEmpty(t.getUid())) {
            C39162r.m79455a(str, m95864a(this.f118636d), this.f118635c.getUid(), 0);
            C51488a.m95939d(this.f118635c, this.f118646n, "", mo86950d());
            C59256u q = new C59256u().mo96834a("find_friends_page").mo96839q(this.f118648p);
            q.f135350a = C59256u.EnumC59259c.CARD;
            q.f135352b = C59256u.EnumC59257a.ENTER_PROFILE;
            q.mo96832a(this.f118635c).mo96841s(this.f118635c.getRequestId()).mo96792f();
            SmartRouter.buildRoute(this.f118634b, "aweme://user/profile/").withParam("uid", this.f118635c.getUid()).withParam("sec_user_id", this.f118635c.getSecUid()).withParam("from_discover", m95864a(this.f118636d)).withParam("recommend_enter_profile_params", new C66623g("find_friends_page", null, C59256u.EnumC59259c.CARD, this.f118635c.getRecType(), C66623g.getFollowType(this.f118635c), this.f118635c.getUid(), null, null, this.f118635c.getRequestId(), null, this.f118635c.getFriendTypeStr(), this.f118635c.getSocialInfo())).open();
        }
    }

    public C51465k(View view, AbstractC51481b bVar, boolean z, boolean z2, final String str) {
        super(view);
        this.f118644l = z2;
        this.f118633a = z;
        this.f118634b = view.getContext();
        this.f118638f = view.findViewById(R.id.bsr);
        this.f118639g = (TextView) view.findViewById(R.id.f8p);
        this.f118640h = (TextView) view.findViewById(R.id.f88);
        this.f118641i = (I18nFollowAndInviteUserBtn) view.findViewById(R.id.f87);
        this.f118648p = str;
        this.f118642j = (ViewGroup) view.findViewById(R.id.b92);
        this.f118637e = bVar;
        this.f118641i.setOnClickListener(new View$OnClickListenerC51468l(this));
        this.f118638f.setOnClickListener(new View$OnClickListenerC51469m(this));
        this.f118639g.setOnClickListener(new View$OnClickListenerC51470n(this));
        this.f118642j.setOnClickListener(new View$OnClickListenerC51471o(this));
        this.f118643k = (TextView) view.findViewById(R.id.bmr);
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.p2082ss.android.ugc.aweme.friends.p3011a.C51465k.View$OnAttachStateChangeListenerC514661 */

            static {
                Covode.recordClassIndex(60725);
            }

            public final void onViewDetachedFromWindow(View view) {
            }

            public final void onViewAttachedToWindow(View view) {
                if (C51465k.this.f118636d != 0) {
                    C51488a.m95911a(C51465k.this.f118635c, C51465k.this.f118646n, "", C51465k.this.mo86950d());
                    C59256u q = new C59256u().mo96834a("find_friends_page").mo96839q(str);
                    q.f135350a = C59256u.EnumC59259c.CARD;
                    q.f135352b = C59256u.EnumC59257a.SHOW;
                    q.mo96832a(C51465k.this.f118635c).mo96841s(C51465k.this.f118635c.getRequestId()).mo96792f();
                } else if (!TextUtils.isEmpty(C51465k.this.f118635c.getUid())) {
                    C51488a.m95911a(C51465k.this.f118635c, C51465k.this.f118646n, "", C51465k.this.mo86950d());
                    C59256u q2 = new C59256u().mo96834a("find_friends_page").mo96839q(str);
                    q2.f135350a = C59256u.EnumC59259c.CARD;
                    q2.f135352b = C59256u.EnumC59257a.SHOW;
                    q2.mo96832a(C51465k.this.f118635c).mo96841s(C51465k.this.f118635c.getRequestId()).mo96792f();
                }
            }
        });
        if (z2) {
            this.f118645m = (TextView) view.findViewById(R.id.f8j);
            this.f118641i.setShowMessage(I18nFollowAndInviteUserBtn.m95704b());
            return;
        }
        this.f118641i.setShowMessage(false);
    }
}
