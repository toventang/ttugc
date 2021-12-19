package com.p2082ss.android.ugc.aweme.favorites.p2927i;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33721c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.comment.C36274b;
import com.p2082ss.android.ugc.aweme.comment.ICommentFavoriteService;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36399m;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36401a;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36415a;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36425k;
import com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36499g;
import com.p2082ss.android.ugc.aweme.comment.p2496j.C36504c;
import com.p2082ss.android.ugc.aweme.comment.p2496j.C36506e;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36539b;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36540c;
import com.p2082ss.android.ugc.aweme.comment.p2500n.C36547a;
import com.p2082ss.android.ugc.aweme.comment.p2500n.C36548b;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.CommentTranslationStatusView;
import com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b;
import com.p2082ss.android.ugc.aweme.comment.util.C37206l;
import com.p2082ss.android.ugc.aweme.comment.widget.C37297b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.common.p2634f.C39110a;
import com.p2082ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import com.p2082ss.android.ugc.aweme.favorites.p2919a.C47179b;
import com.p2082ss.android.ugc.aweme.favorites.p2925g.C47433a;
import com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.forward.p3004a.C51414a;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.comment.CommentFavoriteServiceImpl;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p077b.AbstractC1729g;
import p077b.C1731i;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.i.b */
public final class View$OnClickListenerC47440b extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener, AbstractC1214u<C36399m>, AbstractC36415a, AbstractC36425k, AbstractC36953b, C47434a.AbstractC47435a {

    /* renamed from: a */
    public Comment f110176a;

    /* renamed from: b */
    public Activity f110177b;

    /* renamed from: c */
    public Fragment f110178c;

    /* renamed from: d */
    public C36274b f110179d;

    /* renamed from: e */
    public AbstractC36429b f110180e;

    /* renamed from: f */
    public C36547a f110181f;

    /* renamed from: g */
    public C47179b f110182g;

    /* renamed from: h */
    public C36506e f110183h;

    /* renamed from: i */
    public TuxButton f110184i;

    /* renamed from: j */
    public TuxButton f110185j;

    /* renamed from: k */
    public ConstraintLayout f110186k;

    /* renamed from: l */
    public RemoteImageView f110187l;

    /* renamed from: m */
    public SmartCircleImageView f110188m;

    /* renamed from: n */
    public TuxTextView f110189n;

    /* renamed from: o */
    public TuxTextView f110190o;

    /* renamed from: p */
    public TuxTextView f110191p;

    /* renamed from: q */
    public CommentTranslationStatusView f110192q;

    /* renamed from: r */
    public final long f110193r = 1000;

    /* renamed from: s */
    private C23208a f110194s;

    static {
        Covode.recordClassIndex(56053);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: a */
    public final void mo64425a(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: a */
    public final void mo64426a(String str, int i) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: b */
    public final void mo64428b(String str) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: e */
    public final void mo64430e(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: f */
    public final void mo64431f(Comment comment) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: f */
    public final void mo64432f(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: g */
    public final void mo64433g(Comment comment) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: o */
    public final String mo64436o() {
        return "";
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    public final void onEvent(C51414a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: p */
    public final int mo64438p() {
        return 3;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: q */
    public final boolean mo64439q() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: n */
    public final Comment mo64435n() {
        return this.f110176a;
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.b$b */
    public static final class C47442b implements AbstractC36429b {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47440b f110198a;

        static {
            Covode.recordClassIndex(56055);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b
        /* renamed from: a */
        public final void mo63753a() {
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b
        /* renamed from: e */
        public final void mo63758e() {
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b
        /* renamed from: h */
        public final void mo63761h() {
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b
        /* renamed from: i */
        public final void mo63762i() {
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b
        /* renamed from: j */
        public final void mo63763j() {
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b
        /* renamed from: f */
        public final void mo63759f() {
            this.f110198a.mo63735a();
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b
        /* renamed from: g */
        public final void mo63760g() {
            this.f110198a.mo63736b();
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b
        /* renamed from: k */
        public final void mo63764k() {
            Comment comment = this.f110198a.f110176a;
            if (comment != null) {
                this.f110198a.mo79709a(comment, 1);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b
        /* renamed from: l */
        public final void mo63765l() {
            Comment comment = this.f110198a.f110176a;
            if (comment != null) {
                this.f110198a.mo79709a(comment, 0);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b
        /* renamed from: b */
        public final void mo63755b() {
            C36504c cVar;
            Comment comment = this.f110198a.f110176a;
            if (comment != null) {
                View$OnClickListenerC47440b bVar = this.f110198a;
                if (!bVar.mo79710d()) {
                    C89219l.m154721d(comment, "");
                    C33744d a = new C33744d().mo59983a("enter_from", "collection_comment");
                    String cid = comment.getCid();
                    if (cid == null) {
                        cid = "";
                    }
                    C33744d a2 = a.mo59983a("comment_id", cid);
                    String awemeId = comment.getAwemeId();
                    if (awemeId == null) {
                        awemeId = "";
                    }
                    C39162r.m79460a("delete_comment", a2.mo59983a("group_id", awemeId).mo59983a("is_video", "0").f79943a);
                    C36506e eVar = bVar.f110183h;
                    if (!(eVar == null || (cVar = (C36504c) eVar.f92286h) == null)) {
                        cVar.f86433d = new C36499g(false, false, comment);
                    }
                    C36506e eVar2 = bVar.f110183h;
                    if (eVar2 != null) {
                        String cid2 = comment.getCid();
                        String awemeId2 = comment.getAwemeId();
                        int a3 = C33721c.m69041a("");
                        ((C36504c) eVar2.f92286h).f86432c = awemeId2;
                        eVar2.mo57616a(cid2, Integer.valueOf(a3), 0);
                    }
                }
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b
        /* renamed from: c */
        public final void mo63756c() {
            Comment comment;
            String str;
            String str2;
            User author;
            Activity activity = this.f110198a.f110177b;
            if (activity != null && (comment = this.f110198a.f110176a) != null) {
                C89219l.m154721d(comment, "");
                IAccountUserService g = C31575b.m65865g();
                if (g != null) {
                    str = g.getCurUserId();
                } else {
                    str = null;
                }
                C33744d a = new C33744d().mo59983a("enter_from", "collection_comment").mo59983a("enter_method", "click_report_button");
                Aweme aliasAweme = comment.getAliasAweme();
                if (aliasAweme == null || (author = aliasAweme.getAuthor()) == null || (str2 = author.getUid()) == null) {
                    str2 = "";
                }
                C33744d a2 = a.mo59983a("author_id", str2);
                String awemeId = comment.getAwemeId();
                if (awemeId == null) {
                    awemeId = "";
                }
                C33744d a3 = a2.mo59983a("group_id", awemeId);
                String cid = comment.getCid();
                if (cid == null) {
                    cid = "";
                }
                C33744d a4 = a3.mo59983a("comment_id", cid);
                if (str == null) {
                    str = "";
                }
                C39162r.m79460a("report_comment", a4.mo59983a("user_id", str).mo59983a("is_video", "0").f79943a);
                User user = comment.getUser();
                C89219l.m154716b(user, "");
                C37206l.C37207a.m75195a(activity, comment, user.getUid(), C13628n.m24521b(activity));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b
        /* renamed from: d */
        public final void mo63757d() {
            String str;
            String str2;
            String uid;
            User author;
            Comment comment = this.f110198a.f110176a;
            if (comment != null) {
                View$OnClickListenerC47440b bVar = this.f110198a;
                String str3 = "";
                C89219l.m154721d(comment, str3);
                IAccountUserService g = C31575b.m65865g();
                if (g != null) {
                    str = g.getCurUserId();
                } else {
                    str = null;
                }
                C33744d dVar = new C33744d();
                Aweme aliasAweme = comment.getAliasAweme();
                if (aliasAweme == null || (author = aliasAweme.getAuthor()) == null || (str2 = author.getUid()) == null) {
                    str2 = str3;
                }
                C33744d a = dVar.mo59983a("author_id", str2).mo59983a("enter_from", "collection_comment");
                String awemeId = comment.getAwemeId();
                if (awemeId == null) {
                    awemeId = str3;
                }
                C33744d a2 = a.mo59983a("group_id", awemeId);
                String cid = comment.getCid();
                if (cid == null) {
                    cid = str3;
                }
                C33744d a3 = a2.mo59983a("comment_id", cid);
                if (str == null) {
                    str = str3;
                }
                C33744d a4 = a3.mo59983a("user_id", str);
                User user = comment.getUser();
                if (!(user == null || (uid = user.getUid()) == null)) {
                    str3 = uid;
                }
                C39162r.m79460a("copy_comment", a4.mo59983a("to_user_id", str3).f79943a);
                if (bVar.f110179d != null) {
                    C36274b.m73915a(comment);
                }
                bVar.mo79708a(R.string.brx, 0);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C47442b(View$OnClickListenerC47440b bVar) {
            this.f110198a = bVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b
        /* renamed from: a */
        public final void mo63754a(CommentVideoModel.Type type) {
            C36274b bVar;
            C36274b bVar2 = this.f110198a.f110179d;
            if (bVar2 != null && bVar2.f85750u && type == CommentVideoModel.Type.COMMENT && (bVar = this.f110198a.f110179d) != null) {
                bVar.mo63485a("comment_press", type);
            }
        }
    }

    /* renamed from: e */
    private static boolean m90461e() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36425k
    /* renamed from: b */
    public final void mo63736b() {
        C36547a aVar;
        Comment comment = this.f110176a;
        if (comment != null && (aVar = this.f110181f) != null) {
            aVar.mo64261a(comment);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.favorites.p2926h.C47434a.AbstractC47435a
    /* renamed from: c */
    public final void mo79706c() {
        Comment comment = this.f110176a;
        if (comment != null) {
            C47434a.m90453b(comment.getCid());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: m */
    public final Aweme mo64434m() {
        Comment comment = this.f110176a;
        if (comment != null) {
            return comment.getAliasAweme();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo79710d() {
        if (this.f110177b == null) {
            return true;
        }
        if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
            C58029j.f132256h = m90461e();
        }
        if (C58029j.f132256h) {
            return false;
        }
        mo79708a(R.string.dcq, 0);
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36425k
    /* renamed from: a */
    public final void mo63735a() {
        String str;
        String str2;
        C36547a aVar;
        User author;
        Comment comment = this.f110176a;
        if (comment != null) {
            String str3 = "";
            C89219l.m154721d(comment, str3);
            IAccountUserService g = C31575b.m65865g();
            if (g != null) {
                str = g.getCurUserId();
            } else {
                str = null;
            }
            C33744d dVar = new C33744d();
            Aweme aliasAweme = comment.getAliasAweme();
            if (aliasAweme == null || (author = aliasAweme.getAuthor()) == null || (str2 = author.getUid()) == null) {
                str2 = str3;
            }
            C33744d a = dVar.mo59983a("author_id", str2).mo59983a("enter_from", "collection_comment");
            String cid = comment.getCid();
            if (cid == null) {
                cid = str3;
            }
            C33744d a2 = a.mo59983a("comment_id", cid);
            if (str == null) {
                str = str3;
            }
            C33744d a3 = a2.mo59983a("user_id", str);
            String awemeId = comment.getAwemeId();
            if (awemeId != null) {
                str3 = awemeId;
            }
            C39162r.m79460a("translate_comment", a3.mo59983a("group_id", str3).f79943a);
            C36548b a4 = C37297b.m75287a(comment, SettingServiceImpl.m120782v().mo108872h());
            if (a4 != null && (aVar = this.f110181f) != null) {
                aVar.mo64262a(comment, a4, this.f110192q);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.b$c */
    static final class DialogInterface$OnCancelListenerC47443c implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47440b f110199a;

        static {
            Covode.recordClassIndex(56056);
        }

        DialogInterface$OnCancelListenerC47443c(View$OnClickListenerC47440b bVar) {
            this.f110199a = bVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            AbstractC36429b bVar = this.f110199a.f110180e;
            if (bVar != null) {
                bVar.mo63758e();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.b$e */
    static final class DialogInterface$OnCancelListenerC47445e implements DialogInterface.OnCancelListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47440b f110202a;

        static {
            Covode.recordClassIndex(56058);
        }

        DialogInterface$OnCancelListenerC47445e(View$OnClickListenerC47440b bVar) {
            this.f110202a = bVar;
        }

        public final void onCancel(DialogInterface dialogInterface) {
            AbstractC36429b bVar = this.f110202a.f110180e;
            if (bVar != null) {
                bVar.mo63758e();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36415a
    /* renamed from: d */
    public final void mo63700d(Exception exc) {
        Activity activity = this.f110177b;
        if (activity != null) {
            C33615a.m68848a((Context) activity, (Throwable) exc, (int) R.string.g1i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.b$g */
    public static final class View$OnClickListenerC47447g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47440b f110204a;

        static {
            Covode.recordClassIndex(56060);
        }

        public View$OnClickListenerC47447g(View$OnClickListenerC47440b bVar) {
            this.f110204a = bVar;
        }

        public final void onClick(View view) {
            C36274b bVar;
            ClickAgent.onClick(view);
            C36274b bVar2 = this.f110204a.f110179d;
            if (bVar2 != null && bVar2.f85750u && (bVar = this.f110204a.f110179d) != null) {
                bVar.mo63485a("collection_reply_button", CommentVideoModel.Type.COMMENT);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: e */
    public final void mo64429e(Comment comment) {
        mo79708a(R.string.bry, 2131232029);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.favorites.i.b$a */
    public static final class C47441a<TTaskResult, TContinuationResult> implements AbstractC1729g {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47440b f110195a;

        /* renamed from: b */
        final /* synthetic */ Comment f110196b;

        /* renamed from: c */
        final /* synthetic */ int f110197c;

        static {
            Covode.recordClassIndex(56054);
        }

        C47441a(View$OnClickListenerC47440b bVar, Comment comment, int i) {
            this.f110195a = bVar;
            this.f110196b = comment;
            this.f110197c = i;
        }

        @Override // p077b.AbstractC1729g
        public final /* synthetic */ Object then(C1731i iVar) {
            C89219l.m154721d(iVar, "");
            if (!iVar.mo5544c() && !iVar.mo5539b()) {
                C47179b bVar = this.f110195a.f110182g;
                if (bVar != null) {
                    bVar.mo79578a(this.f110196b);
                }
                if (this.f110197c == 1) {
                    this.f110196b.setCollectStatus(1);
                } else {
                    this.f110196b.setCollectStatus(0);
                }
                ICommentFavoriteService a = CommentFavoriteServiceImpl.m128654a();
                String cid = this.f110196b.getCid();
                C89219l.m154716b(cid, "");
                a.mo63317a(cid, this.f110197c);
            }
            return C89391z.f203057a;
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C36399m mVar) {
        Activity activity;
        C36399m mVar2 = mVar;
        if (mVar2 != null && mVar2.f86085a != null && (activity = this.f110177b) != null && !activity.isFinishing()) {
            if (mVar2.f86086b) {
                Comment comment = mVar2.f86085a;
                C89219l.m154716b(comment, "");
                this.f110192q.setLoading(false);
                Comment comment2 = this.f110176a;
                if (comment2 != null) {
                    comment2.setTranslated(comment.isTranslated());
                }
                this.f110190o.setText(comment.getText());
                return;
            }
            this.f110192q.setLoading(false);
            Activity activity2 = this.f110177b;
            if (activity2 != null) {
                C33615a.m68848a((Context) activity2, (Throwable) mVar2.f86087c, (int) R.string.g1i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.b$f */
    public static final class View$OnClickListenerC47446f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47440b f110203a;

        static {
            Covode.recordClassIndex(56059);
        }

        public View$OnClickListenerC47446f(View$OnClickListenerC47440b bVar) {
            this.f110203a = bVar;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            String str3;
            User author;
            User author2;
            User author3;
            ClickAgent.onClick(view);
            C36274b bVar = this.f110203a.f110179d;
            if (bVar != null && bVar.f85750u) {
                Comment comment = this.f110203a.f110176a;
                User user = null;
                if (comment != null) {
                    String str4 = "";
                    C89219l.m154721d(comment, str4);
                    Aweme aliasAweme = comment.getAliasAweme();
                    if (aliasAweme == null || (author3 = aliasAweme.getAuthor()) == null) {
                        str = null;
                    } else {
                        str = author3.getUid();
                    }
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, str4);
                    int i = 1 ^ (C89219l.m154714a(str, g.getCurUserId()) ? 1 : 0);
                    String awemeId = comment.getAwemeId();
                    if (awemeId == null) {
                        awemeId = str4;
                    }
                    Aweme aliasAweme2 = comment.getAliasAweme();
                    if (aliasAweme2 == null || (author2 = aliasAweme2.getAuthor()) == null || (str2 = author2.getUid()) == null) {
                        str2 = str4;
                    }
                    C36540c.m74386a("collection_reply_button", "collection_comment", awemeId, str2, i);
                    C33744d dVar = new C33744d();
                    Aweme aliasAweme3 = comment.getAliasAweme();
                    if (aliasAweme3 == null || (author = aliasAweme3.getAuthor()) == null || (str3 = author.getUid()) == null) {
                        str3 = str4;
                    }
                    C33744d a = dVar.mo59983a("author_id", str3).mo59983a("enter_from", "collection_comment").mo59983a("enter_method", "collection_reply_button");
                    String awemeId2 = comment.getAwemeId();
                    if (awemeId2 != null) {
                        str4 = awemeId2;
                    }
                    C39162r.m79460a("enter_text", a.mo59983a("group_id", str4).mo59983a("comment_category", "reply").f79943a);
                }
                C36274b bVar2 = this.f110203a.f110179d;
                if (bVar2 != null) {
                    Comment comment2 = this.f110203a.f110176a;
                    if (comment2 != null) {
                        user = comment2.getUser();
                    }
                    bVar2.mo63475a(user, "collection_comment");
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public View$OnClickListenerC47440b(View view) {
        super(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.dwk);
        C89219l.m154716b(findViewById, "");
        this.f110184i = (TuxButton) findViewById;
        View findViewById2 = view.findViewById(R.id.dwl);
        C89219l.m154716b(findViewById2, "");
        this.f110185j = (TuxButton) findViewById2;
        View findViewById3 = view.findViewById(R.id.dwj);
        C89219l.m154716b(findViewById3, "");
        this.f110186k = (ConstraintLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.dwt);
        C89219l.m154716b(findViewById4, "");
        this.f110187l = (RemoteImageView) findViewById4;
        View findViewById5 = view.findViewById(R.id.dwi);
        C89219l.m154716b(findViewById5, "");
        this.f110188m = (SmartCircleImageView) findViewById5;
        View findViewById6 = view.findViewById(R.id.dwo);
        C89219l.m154716b(findViewById6, "");
        this.f110189n = (TuxTextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.dwn);
        C89219l.m154716b(findViewById7, "");
        this.f110190o = (TuxTextView) findViewById7;
        View findViewById8 = view.findViewById(R.id.dwm);
        C89219l.m154716b(findViewById8, "");
        this.f110191p = (TuxTextView) findViewById8;
        View findViewById9 = view.findViewById(R.id.eng);
        C89219l.m154716b(findViewById9, "");
        this.f110192q = (CommentTranslationStatusView) findViewById9;
    }

    public final void onClick(View view) {
        String str;
        String str2;
        Aweme aliasAweme;
        String cid;
        ClickAgent.onClick(view);
        String str3 = "";
        C89219l.m154721d(view, str3);
        Comment comment = this.f110176a;
        if (comment != null) {
            C89219l.m154721d(comment, str3);
            C33744d a = new C33744d().mo59983a("enter_from", "collection_comment");
            String awemeId = comment.getAwemeId();
            if (awemeId == null) {
                awemeId = str3;
            }
            C33744d a2 = a.mo59983a("group_id", awemeId);
            String cid2 = comment.getCid();
            if (cid2 == null) {
                cid2 = str3;
            }
            C39162r.m79460a("enter_comment_list", a2.mo59983a("trigger_comment_id", cid2).f79943a);
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(this.f110177b, "aweme://aweme/detail/");
        Comment comment2 = this.f110176a;
        if (comment2 == null || (str = comment2.getAwemeId()) == null) {
            str = str3;
        }
        SmartRoute withParam = buildRoute.withParam("id", str).withParam("refer", "collection_comment");
        Comment comment3 = this.f110176a;
        if (!(comment3 == null || (cid = comment3.getCid()) == null)) {
            str3 = cid;
        }
        SmartRoute withParam2 = withParam.withParam("cid", str3).withParam("video_from", "collection_comment");
        Comment comment4 = this.f110176a;
        if (comment4 == null || (aliasAweme = comment4.getAliasAweme()) == null) {
            str2 = null;
        } else {
            str2 = aliasAweme.getAid();
        }
        withParam2.withParam("last_group_id", str2).open();
    }

    public final boolean onLongClick(View view) {
        Comment comment;
        String text;
        C23208a.C23213d a;
        if (!(view == null || this.f110177b == null || this.f110180e == null || this.f110179d == null || (comment = this.f110176a) == null)) {
            String authorUid = Comment.getAuthorUid(comment);
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            boolean equals = TextUtils.equals(authorUid, g.getCurUserId());
            ArrayList<String> arrayList = new ArrayList();
            Activity activity = this.f110177b;
            if (activity != null) {
                String string = activity.getString(R.string.alp);
                C89219l.m154716b(string, "");
                arrayList.add(string);
                String string2 = activity.getString(R.string.brv);
                C89219l.m154716b(string2, "");
                arrayList.add(string2);
                String string3 = activity.getString(R.string.au1);
                C89219l.m154716b(string3, "");
                arrayList.add(string3);
                if (!equals) {
                    Comment comment2 = this.f110176a;
                    if (comment2 == null || !comment2.isTranslated()) {
                        String string4 = activity.getString(R.string.am8);
                        C89219l.m154716b(string4, "");
                        arrayList.add(string4);
                    } else {
                        String string5 = activity.getString(R.string.alq);
                        C89219l.m154716b(string5, "");
                        arrayList.add(string5);
                    }
                }
                String string6 = activity.getString(R.string.fa_);
                C89219l.m154716b(string6, "");
                arrayList.add(string6);
                if (equals) {
                    String string7 = activity.getString(R.string.b4w);
                    C89219l.m154716b(string7, "");
                    arrayList.add(string7);
                }
            }
            ActivityC0945e eVar = null;
            AbstractC0952i iVar = null;
            if (C36401a.m74100c()) {
                ArrayList arrayList2 = new ArrayList();
                for (String str : arrayList) {
                    C36274b bVar = this.f110179d;
                    if (!(bVar == null || (a = bVar.mo63465a(this.f110180e, str, this.f110176a)) == null)) {
                        arrayList2.add(a);
                    }
                }
                Comment comment3 = this.f110176a;
                String a2 = C80580in.m139677a(comment3 != null ? comment3.getUser() : null, false);
                Comment comment4 = this.f110176a;
                if (!(comment4 == null || (text = comment4.getText()) == null || text.length() <= 0)) {
                    StringBuilder append = new StringBuilder().append(a2).append(": ");
                    Comment comment5 = this.f110176a;
                    a2 = append.append(comment5 != null ? comment5.getText() : null).toString();
                }
                C23208a.C23211b bVar2 = new C23208a.C23211b();
                C89219l.m154716b(a2, "");
                this.f110194s = bVar2.mo37794a(a2).mo37791a().mo37795a(arrayList2).mo37793a(new DialogInterface$OnCancelListenerC47443c(this)).mo37798b("").mo37800b();
                if (!(!arrayList2.isEmpty())) {
                    return false;
                }
                Comment comment6 = this.f110176a;
                if (comment6 != null) {
                    C47433a.m90443a(comment6);
                }
                C23208a aVar = this.f110194s;
                if (aVar != null) {
                    Fragment fragment = this.f110178c;
                    if (fragment != null) {
                        iVar = fragment.getFragmentManager();
                    }
                    aVar.show(iVar, "CommentCollectViewHolder");
                }
                return true;
            }
            Fragment fragment2 = this.f110178c;
            if (fragment2 != null) {
                eVar = fragment2.getActivity();
            }
            C39110a aVar2 = new C39110a(eVar);
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            aVar2.mo67871a((CharSequence[]) array, new DialogInterface$OnClickListenerC47444d(this, arrayList));
            aVar2.mo67870a(new DialogInterface$OnCancelListenerC47445e(this));
            if (!arrayList.isEmpty()) {
                Comment comment7 = this.f110176a;
                if (comment7 != null) {
                    C47433a.m90443a(comment7);
                }
                aVar2.f92306a.mo458b();
                return true;
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36415a
    /* renamed from: a */
    public final void mo63699a(String str, C36499g gVar) {
        C47179b bVar;
        Comment comment = this.f110176a;
        if (comment != null && (bVar = this.f110182g) != null) {
            bVar.mo79578a(comment);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo79708a(int i, int i2) {
        Activity activity = this.f110177b;
        if (activity == null) {
            return;
        }
        if (i2 != 0) {
            new C23144b(activity).mo37635a(activity.getString(i)).mo37636b(i2).mo37637b();
        } else {
            new C23144b(activity).mo37635a(activity.getString(i)).mo37637b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.i.b$d */
    static final class DialogInterface$OnClickListenerC47444d implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View$OnClickListenerC47440b f110200a;

        /* renamed from: b */
        final /* synthetic */ List f110201b;

        static {
            Covode.recordClassIndex(56057);
        }

        DialogInterface$OnClickListenerC47444d(View$OnClickListenerC47440b bVar, List list) {
            this.f110200a = bVar;
            this.f110201b = list;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:93:0x0150, code lost:
            if (android.text.TextUtils.equals(r2, r0) != false) goto L_0x0152;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.content.DialogInterface r5, int r6) {
            /*
            // Method dump skipped, instructions count: 393
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.favorites.p2927i.View$OnClickListenerC47440b.DialogInterface$OnClickListenerC47444d.onClick(android.content.DialogInterface, int):void");
        }
    }

    /* renamed from: a */
    public final void mo79709a(Comment comment, int i) {
        if (!mo79710d()) {
            C36540c.m74383a("collection_comment", i, comment);
            C1731i<BaseResponse> collectComment = UserFavoritesApi.f109832a.collectComment(comment.getCid(), i);
            if (collectComment != null) {
                collectComment.mo5534a(new C47441a(this, comment, i), C1731i.f5564c, null);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: b */
    public final void mo64427b(Exception exc, int i, Comment comment) {
        mo79708a(R.string.fa6, 0);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: a */
    public final void mo64424a(int i, int i2, String str, String str2, boolean z) {
        Aweme aliasAweme;
        String cid;
        String str3 = str;
        Comment comment = this.f110176a;
        if (comment != null && (aliasAweme = comment.getAliasAweme()) != null) {
            String str4 = "";
            if (str3 == null) {
                str3 = str4;
            }
            String a = C36539b.m74368a(this.f110176a);
            C89219l.m154716b(a, str4);
            Comment comment2 = this.f110176a;
            if (!(comment2 == null || (cid = comment2.getCid()) == null)) {
                str4 = cid;
            }
            C36540c.m74379a(aliasAweme, str3, "collection_comment", a, str4, this.f110176a, "list", String.valueOf(i2), 0, "collection_text_panel", null, null, null, false, false, null, null, null, null, null, null, false, null, null, null, 0, "collection_text", null, null, null, null, null, null, null, null, null, null, -134218496, 63);
        }
    }
}
