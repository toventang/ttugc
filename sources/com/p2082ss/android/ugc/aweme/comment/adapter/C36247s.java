package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.kakao.usermgmt.StringSet;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.SmartAvatarImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.comment.C36535m;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommerceCommentStruct;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36173a;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36176c;
import com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37056bq;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.C37075bu;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.CommentTranslationStatusView;
import com.p2082ss.android.ugc.aweme.comment.util.C37194f;
import com.p2082ss.android.ugc.aweme.comment.viewmodel.CommentBatchManagementViewModel;
import com.p2082ss.android.ugc.aweme.comment.widget.C37292a;
import com.p2082ss.android.ugc.aweme.comment.widget.C37297b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.feed.C49907s;
import com.p2082ss.android.ugc.aweme.feed.EnumC48310af;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51428b;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.view.C74147f;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80509gq;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80581io;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.s */
public class C36247s extends RecyclerView.ViewHolder {

    /* renamed from: A */
    View f85631A;

    /* renamed from: B */
    protected TextView f85632B;

    /* renamed from: C */
    protected AbstractC36428a f85633C;

    /* renamed from: D */
    private AbstractC37056bq f85634D = new AbstractC37056bq() {
        /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36247s.C362481 */

        static {
            Covode.recordClassIndex(43514);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37056bq
        /* renamed from: a */
        public final void mo63391a(View view) {
            C36247s.this.mo63414a(view, "click_comment_head");
        }
    };

    /* renamed from: E */
    private AbstractC37056bq f85635E = new AbstractC37056bq() {
        /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36247s.C362492 */

        static {
            Covode.recordClassIndex(43515);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37056bq
        /* renamed from: a */
        public final void mo63391a(View view) {
            C36247s.this.mo63414a(view, "click_name");
        }
    };

    /* renamed from: F */
    private AbstractC37056bq f85636F = new AbstractC37056bq() {
        /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36247s.C362503 */

        static {
            Covode.recordClassIndex(43516);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37056bq
        /* renamed from: a */
        public final void mo63391a(View view) {
            C36247s.this.mo63414a(view, "click_button");
        }
    };

    /* renamed from: a */
    public Comment f85637a;

    /* renamed from: b */
    View f85638b;

    /* renamed from: c */
    SmartAvatarImageView f85639c;

    /* renamed from: d */
    ImageView f85640d;

    /* renamed from: e */
    TuxTextView f85641e;

    /* renamed from: f */
    protected MentionTextView f85642f;

    /* renamed from: g */
    public View f85643g;

    /* renamed from: h */
    TuxTextView f85644h;

    /* renamed from: i */
    protected MentionTextView f85645i;

    /* renamed from: j */
    ImageView f85646j;

    /* renamed from: k */
    protected View f85647k;

    /* renamed from: l */
    CommentTranslationStatusView f85648l;

    /* renamed from: m */
    TextView f85649m;

    /* renamed from: n */
    ImageView f85650n;

    /* renamed from: o */
    View f85651o;

    /* renamed from: p */
    int f85652p;

    /* renamed from: q */
    protected String f85653q;

    /* renamed from: r */
    protected String f85654r;

    /* renamed from: s */
    protected String f85655s;

    /* renamed from: t */
    protected boolean f85656t;

    /* renamed from: u */
    protected int f85657u;

    /* renamed from: v */
    protected C37297b f85658v;

    /* renamed from: w */
    protected C37292a f85659w;

    /* renamed from: x */
    protected boolean f85660x = true;

    /* renamed from: y */
    protected CommentBatchManagementViewModel f85661y;

    /* renamed from: z */
    protected AbstractC1214u<Boolean> f85662z;

    static {
        Covode.recordClassIndex(43513);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo63411a() {
    }

    /* renamed from: b */
    public void mo63419b() {
        mo63422c();
    }

    /* renamed from: h */
    private boolean mo63434h() {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        if (!C36176c.m73729a() || (commentBatchManagementViewModel = this.f85661y) == null || !commentBatchManagementViewModel.mo64780a().getValue().booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private void m73861i() {
        this.f85640d.setSelected(true);
        View view = this.f85631A;
        view.setBackgroundColor(view.getResources().getColor(R.color.v));
    }

    /* renamed from: j */
    private void m73862j() {
        this.f85640d.setSelected(false);
        View view = this.f85631A;
        view.setBackgroundColor(view.getResources().getColor(R.color.r));
    }

    /* renamed from: e */
    public final void mo63425e() {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        if ((this.itemView.getContext() instanceof ActivityC0945e) && C36176c.m73729a() && (commentBatchManagementViewModel = this.f85661y) != null) {
            commentBatchManagementViewModel.mo64780a().removeObserver(this.f85662z);
        }
    }

    /* renamed from: d */
    public final void mo63424d() {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        if ((this.itemView.getContext() instanceof ActivityC0945e) && C36176c.m73729a() && (commentBatchManagementViewModel = this.f85661y) != null) {
            commentBatchManagementViewModel.mo64780a().observe((ActivityC0580d) this.itemView.getContext(), this.f85662z);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo63426f() {
        Comment comment;
        if (this.f85633C != null && (comment = this.f85637a) != null && comment.getUser() != null && this.f85637a.getCid() != null && !mo63433g()) {
            this.f85633C.mo63743a(this.f85658v, this.f85637a);
        }
    }

    /* renamed from: g */
    private boolean mo63433g() {
        if (!mo63434h()) {
            return false;
        }
        String cid = this.f85637a.getCid();
        if (TextUtils.isEmpty(cid)) {
            return true;
        }
        Map<String, Comment> map = this.f85661y.f87767b;
        if (map.containsKey(this.f85637a.getCid())) {
            m73862j();
            map.remove(cid);
        } else {
            m73861i();
            map.put(cid, this.f85637a);
        }
        this.f85661y.mo64781b().postValue(Integer.valueOf(map.size()));
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo63422c() {
        boolean z;
        if (C36535m.m74352a(this.f85637a) || (C36173a.m73726c() && !this.f85656t)) {
            z = true;
        } else {
            z = false;
        }
        String a = C37194f.m75163a(this.f85637a, !z);
        if (!TextUtils.isEmpty(a)) {
            this.f85642f.setText(a);
            this.f85642f.setVisibility(0);
            C46579b.m89899a(this.f85642f);
        } else {
            this.f85642f.setVisibility(8);
        }
        C89219l.m154721d(this.f85637a, "");
        MentionTextView mentionTextView = this.f85642f;
        mentionTextView.setSpanColor(mentionTextView.getResources().getColor(R.color.bx));
        this.f85642f.setSpanStyle(1);
        this.f85642f.setOnSpanClickListener(new C36254v(this));
        this.f85642f.mo124999a(C37194f.m75165a(this.f85637a, this.f85642f.getContext(), z), new C74147f(), (MentionTextView.AbstractC81407d) null);
        this.f85642f.setMovementMethod(LinkMovementMethod.getInstance());
        if (this.f85642f.getVisibility() == 0) {
            C17191a.C17192a aVar = new C17191a.C17192a();
            aVar.mo27177a(this.f85642f.getText());
            this.f85642f.setText(aVar.f40973a);
        }
    }

    /* renamed from: c */
    public final void mo63423c(String str) {
        this.f85655s = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.adapter.s$a */
    public class View$OnClickListenerC36251a implements View.OnClickListener, View.OnLongClickListener {
        static {
            Covode.recordClassIndex(43517);
        }

        View$OnClickListenerC36251a() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (C36247s.this.f85633C != null && C36247s.this.f85637a != null) {
                C36247s.this.f85633C.mo63743a(C36247s.this.f85658v, C36247s.this.f85637a);
            }
        }

        public final boolean onLongClick(View view) {
            if (C36247s.this.f85633C == null || C36247s.this.f85637a == null) {
                return true;
            }
            C36247s.this.f85633C.mo63744a(C36247s.this.f85658v, C36247s.this.f85637a, C36247s.this.f85659w);
            return true;
        }
    }

    /* renamed from: a */
    public final void mo63412a(int i) {
        this.f85657u = i;
    }

    /* renamed from: b */
    public final void mo63420b(String str) {
        this.f85654r = str;
    }

    /* renamed from: a */
    public void mo63417a(String str) {
        this.f85653q = str;
    }

    /* renamed from: b */
    public final void mo63421b(boolean z) {
        this.f85656t = z;
    }

    /* renamed from: a */
    public final void mo63418a(boolean z) {
        this.f85660x = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo63416a(TextExtraStruct textExtraStruct) {
        if (textExtraStruct.getUserId().equals(C31575b.m65865g().getCurUserId())) {
            C39162r.m79460a("self_mention_click", new C33744d().mo59983a("enter_from", this.f85653q).f79943a);
        }
        if (C17873f.m33102j() != null) {
            SmartRouter.buildRoute(C17873f.m33102j(), "aweme://user/profile/").withParam("uid", textExtraStruct.getUserId()).withParam("extra_from_pre_page", "notification_page").withParam("sec_uid", textExtraStruct.getSecUid()).open();
        }
        this.f85642f.getContext();
        C39162r.m79455a(StringSet.name, "comment_at", textExtraStruct.getUserId(), 0);
        C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_from", this.f85653q).mo59983a("to_user_id", textExtraStruct.getUserId()).mo59983a("group_id", this.f85654r).mo59983a("author_id", this.f85655s).mo59983a("enter_method", "comment_at").mo59980a("self_click", textExtraStruct.getUserId().equals(C31575b.m65865g().getCurUserId()) ? 1 : 0).f79943a);
        C49907s.m93686a(EnumC48310af.PROFILE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo63413a(View view, Boolean bool) {
        int i;
        float f;
        ImageView imageView = this.f85640d;
        if (imageView != null) {
            if (bool.booleanValue()) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
            MentionTextView mentionTextView = this.f85642f;
            Context context = view.getContext();
            if (bool.booleanValue()) {
                f = 16.0f;
            } else {
                f = 0.0f;
            }
            mentionTextView.setPadding(0, 0, (int) C13628n.m24520b(context, f), 0);
            if (bool.booleanValue()) {
                C34729o.m70959b(false, this.f85650n, this.f85651o, this.f85649m);
                return;
            }
            C34729o.m70959b(true, this.f85650n, this.f85651o, this.f85649m);
            m73862j();
        }
    }

    /* renamed from: a */
    public final void mo63414a(View view, String str) {
        AbstractC36428a aVar;
        if (this.f85637a != null && !C58001a.m104815a(view, 1200)) {
            if (!TextUtils.equals(str, "click_button")) {
                User user = this.f85637a.getUser();
                if (user == null) {
                    return;
                }
                if (user.isAdFake()) {
                    new C79459a(view.getContext()).mo123050a(R.string.o6).mo123053a();
                } else if (!TextUtils.isEmpty(user.getUid()) && (aVar = this.f85633C) != null) {
                    aVar.mo63747a(user.getUid(), user.getSecUid(), str);
                }
            } else if (!mo63433g()) {
                this.f85633C.mo63748b(this.f85637a);
            }
        }
    }

    public C36247s(View view, AbstractC36428a aVar) {
        super(view);
        this.f85652p = C51428b.m95803a(view.getContext(), 32.0f);
        this.f85638b = view.findViewById(R.id.c60);
        this.f85639c = (SmartAvatarImageView) view.findViewById(R.id.nz);
        this.f85640d = (ImageView) view.findViewById(R.id.bxk);
        this.f85641e = (TuxTextView) view.findViewById(R.id.title);
        this.f85642f = (MentionTextView) view.findViewById(R.id.acq);
        this.f85643g = view.findViewById(R.id.di1);
        this.f85644h = (TuxTextView) view.findViewById(R.id.dib);
        this.f85645i = (MentionTextView) view.findViewById(R.id.di2);
        this.f85646j = (ImageView) view.findViewById(R.id.axv);
        this.f85647k = view.findViewById(R.id.di3);
        this.f85648l = (CommentTranslationStatusView) view.findViewById(R.id.eng);
        this.f85649m = (TextView) view.findViewById(R.id.eva);
        this.f85650n = (ImageView) view.findViewById(R.id.bv1);
        this.f85651o = view.findViewById(R.id.c3u);
        this.f85631A = view.findViewById(R.id.ach);
        this.f85632B = (TextView) view.findViewById(R.id.a_9);
        this.f85633C = aVar;
        view.setOnClickListener(new View$OnClickListenerC36252t(this));
        this.f85658v = new C37297b(view.getContext());
        this.f85659w = new C37292a();
        C80509gq.m139525a(this.f85642f);
        C80509gq.m139525a(this.f85645i);
        if (C36176c.m73729a()) {
            this.f85661y = CommentBatchManagementViewModel.C37228a.m75235a((ActivityC0945e) view.getContext());
            this.f85662z = new C36253u(this, view);
        }
        SmartAvatarImageView smartAvatarImageView = this.f85639c;
        if (smartAvatarImageView != null) {
            smartAvatarImageView.setOnTouchListener(this.f85634D);
            this.f85641e.setOnTouchListener(this.f85635E);
            this.f85632B.setOnTouchListener(this.f85636F);
        }
    }

    /* renamed from: a */
    public void mo63415a(Comment comment, Rect rect) {
        User curUser;
        int paddingTop;
        int paddingBottom;
        int paddingStart;
        int paddingEnd;
        if (comment != null && this.f85642f != null) {
            View view = this.f85638b;
            if (rect != null) {
                if (rect.top >= 0) {
                    paddingTop = rect.top;
                } else {
                    paddingTop = view.getPaddingTop();
                }
                if (rect.bottom >= 0) {
                    paddingBottom = rect.bottom;
                } else {
                    paddingBottom = view.getPaddingBottom();
                }
                int i = Build.VERSION.SDK_INT;
                if (rect.left >= 0) {
                    paddingStart = rect.left;
                } else {
                    paddingStart = view.getPaddingStart();
                }
                if (rect.right >= 0) {
                    paddingEnd = rect.right;
                } else {
                    paddingEnd = view.getPaddingEnd();
                }
                view.setPaddingRelative(paddingStart, paddingTop, paddingEnd, paddingBottom);
            }
            this.f85637a = comment;
            this.f85658v.mo64892a(this.f85642f.getContext(), comment, new C37075bu(this.f85642f.getContext(), this.f85642f), new C37075bu(this.f85642f.getContext(), this.f85645i), this.f85648l);
            C37292a aVar = this.f85659w;
            Context context = this.f85642f.getContext();
            MentionTextView mentionTextView = this.f85642f;
            CommentTranslationStatusView commentTranslationStatusView = this.f85648l;
            C89219l.m154721d(context, "");
            C89219l.m154721d(comment, "");
            C89219l.m154721d(mentionTextView, "");
            C89219l.m154721d(commentTranslationStatusView, "");
            aVar.f87954c = mentionTextView;
            aVar.f87952a = context;
            C89219l.m154721d(comment, "");
            aVar.f87956e = comment;
            aVar.f87953b = commentTranslationStatusView;
            aVar.f87955d = new C37292a.C37294b();
            this.f85643g.setVisibility(8);
            mo63419b();
            User user = comment.getUser();
            if (comment.getCommerceInfo() != null) {
                CommerceCommentStruct commerceInfo = comment.getCommerceInfo();
                C20766v b = C20761r.m39061a(commerceInfo.getAvartalUrl()).mo34185b(C80397em.m139369a(100));
                int i2 = this.f85652p;
                C20766v a = b.mo34176a(i2, i2);
                a.f49098K = true;
                C20766v a2 = a.mo34179a("CommentViewHolder");
                a2.f49092E = this.f85639c;
                a2.mo34186c();
                this.f85641e.setText(commerceInfo.getNickName());
            } else if (user != null) {
                UrlModel avatarThumb = user.getAvatarThumb();
                if (C36223d.m73822a().f85545c) {
                    curUser = C80580in.m139683b();
                } else {
                    C31575b.m65859a();
                    curUser = C31575b.f75524a.mo57069e().getCurUser();
                }
                if (!(curUser == null || curUser.getUid() == null || !curUser.getUid().equals(user.getUid()))) {
                    avatarThumb = curUser.getAvatarThumb();
                }
                if (!(avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0)) {
                    C36223d.m73822a();
                    C20766v b2 = C20761r.m39060a(C34735v.m70965a(avatarThumb)).mo34185b(C80397em.m139369a(100));
                    int i3 = this.f85652p;
                    C20766v a3 = b2.mo34176a(i3, i3);
                    a3.f49098K = true;
                    C20766v a4 = a3.mo34179a("CommentViewHolder");
                    a4.f49092E = this.f85639c;
                    a4.mo34186c();
                }
                if (!C36223d.m73822a().f85543a || TextUtils.isEmpty(user.getUserDisplayName())) {
                    this.f85641e.setText(C80580in.m139677a(user, false));
                } else {
                    this.f85641e.setText(user.getUserDisplayName());
                }
                C80581io.m139704a(this.itemView.getContext(), user.getCustomVerify(), user.getEnterpriseVerifyReason(), this.f85641e);
                mo63411a();
            }
            if (!mo63434h()) {
                return;
            }
            if (this.f85661y.f87767b.containsKey(this.f85637a.getCid())) {
                m73861i();
            } else {
                m73862j();
            }
        }
    }
}
