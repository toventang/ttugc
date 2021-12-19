package com.p2082ss.android.ugc.aweme.comment.adapter;

import android.graphics.Bitmap;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.ies.dmt.p1194ui.p1200f.C17235c;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.router.SmartRouter;
import com.bytedance.tux.input.TuxTextView;
import com.facebook.common.p1839k.C24134g;
import com.facebook.drawee.p1845a.p1846a.C24182c;
import com.facebook.drawee.p1845a.p1846a.C24185e;
import com.facebook.drawee.p1854e.C24229q;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.p1890o.C24639c;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.base.C34735v;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.p2379ui.RemoteImageView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.comment.C36535m;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommerceCommentStruct;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36173a;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36176c;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36180f;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36424j;
import com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36428a;
import com.p2082ss.android.ugc.aweme.comment.p2494h.C36487a;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36539b;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37056bq;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.C37075bu;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.CommentTranslationStatusView;
import com.p2082ss.android.ugc.aweme.comment.util.C37188b;
import com.p2082ss.android.ugc.aweme.comment.util.C37194f;
import com.p2082ss.android.ugc.aweme.comment.util.C37208m;
import com.p2082ss.android.ugc.aweme.comment.viewmodel.CommentBatchManagementViewModel;
import com.p2082ss.android.ugc.aweme.comment.widget.C37297b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.emoji.utils.AbstractC46649i;
import com.p2082ss.android.ugc.aweme.emoji.utils.C46646h;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.shortvideo.view.C74147f;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80187aa;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80397em;
import com.p2082ss.android.ugc.aweme.utils.C80509gq;
import com.p2082ss.android.ugc.aweme.utils.C80566ib;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.h */
public final class C36229h extends RecyclerView.ViewHolder implements AbstractC36424j {

    /* renamed from: A */
    CommentBatchManagementViewModel f85565A;

    /* renamed from: B */
    AbstractC1214u<Boolean> f85566B;

    /* renamed from: C */
    String f85567C;

    /* renamed from: D */
    String f85568D;

    /* renamed from: E */
    String f85569E;

    /* renamed from: F */
    boolean f85570F;

    /* renamed from: G */
    private AbstractC46649i f85571G;

    /* renamed from: H */
    private AbstractC37056bq f85572H = new AbstractC37056bq() {
        /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36229h.C362301 */

        static {
            Covode.recordClassIndex(43496);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37056bq
        /* renamed from: a */
        public final void mo63391a(View view) {
            C36229h.this.mo63393a(view, "click_comment_head");
        }
    };

    /* renamed from: I */
    private AbstractC37056bq f85573I = new AbstractC37056bq() {
        /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36229h.C362312 */

        static {
            Covode.recordClassIndex(43497);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37056bq
        /* renamed from: a */
        public final void mo63391a(View view) {
            C36229h.this.mo63393a(view, "click_name");
        }
    };

    /* renamed from: J */
    private AbstractC37056bq f85574J = new AbstractC37056bq() {
        /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36229h.C362323 */

        static {
            Covode.recordClassIndex(43498);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37056bq
        /* renamed from: a */
        public final void mo63391a(View view) {
            C36229h.this.mo63393a(view, "click_button");
        }
    };

    /* renamed from: K */
    private AbstractC37056bq f85575K = new AbstractC37056bq() {
        /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36229h.C362334 */

        static {
            Covode.recordClassIndex(43499);
        }

        @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37056bq
        /* renamed from: a */
        public final void mo63391a(View view) {
            String str;
            Comment comment;
            if (C36229h.this.f85600y != null && C36229h.this.f85599x != null) {
                String str2 = "";
                if (view.getId() == R.id.f2c) {
                    if (C36229h.this.f85600y.getRelationLabel() != null) {
                        str2 = C36229h.this.f85600y.getRelationLabel().getUserId();
                    }
                    str = C36229h.this.f85600y.getUser().getSecUid();
                } else if (C13603b.m24435a((Collection) C36229h.this.f85600y.getReplyComments()) || (comment = C36229h.this.f85600y.getReplyComments().get(0)) == null) {
                    str = str2;
                } else {
                    if (comment.getRelationLabel() != null) {
                        str2 = comment.getRelationLabel().getUserId();
                    }
                    str = comment.getUser().getSecUid();
                }
                if (!TextUtils.isEmpty(str2)) {
                    C36229h.this.f85599x.mo63746a(str2, str);
                }
            }
        }
    };

    /* renamed from: a */
    View f85576a = this.itemView.findViewById(R.id.ach);

    /* renamed from: b */
    View f85577b = this.itemView.findViewById(R.id.c60);

    /* renamed from: c */
    SmartCircleImageView f85578c = ((SmartCircleImageView) this.itemView.findViewById(R.id.nz));

    /* renamed from: d */
    ImageView f85579d = ((ImageView) this.itemView.findViewById(R.id.bxk));

    /* renamed from: e */
    View f85580e = this.itemView.findViewById(R.id.bd3);

    /* renamed from: f */
    View f85581f = this.itemView.findViewById(R.id.c3u);

    /* renamed from: g */
    ImageView f85582g = ((ImageView) this.itemView.findViewById(R.id.bv1));

    /* renamed from: h */
    TextView f85583h = ((TextView) this.itemView.findViewById(R.id.eva));

    /* renamed from: i */
    TextView f85584i = ((TextView) this.itemView.findViewById(R.id.title));

    /* renamed from: j */
    TuxTextView f85585j = ((TuxTextView) this.itemView.findViewById(R.id.a_e));

    /* renamed from: k */
    MentionTextView f85586k = ((MentionTextView) this.itemView.findViewById(R.id.acq));

    /* renamed from: l */
    TextView f85587l = ((TextView) this.itemView.findViewById(R.id.a_q));

    /* renamed from: m */
    TextView f85588m = ((TextView) this.itemView.findViewById(R.id.f2c));

    /* renamed from: n */
    CommentTranslationStatusView f85589n = ((CommentTranslationStatusView) this.itemView.findViewById(R.id.eng));

    /* renamed from: o */
    TuxTextView f85590o = ((TuxTextView) this.itemView.findViewById(R.id.d52));

    /* renamed from: p */
    TuxTextView f85591p = ((TuxTextView) this.itemView.findViewById(R.id.c8v));

    /* renamed from: q */
    protected ViewStub f85592q = ((ViewStub) this.itemView.findViewById(R.id.fc_));

    /* renamed from: r */
    protected RemoteImageView f85593r;

    /* renamed from: s */
    protected TextView f85594s = ((TextView) this.itemView.findViewById(R.id.a_v));

    /* renamed from: t */
    TextView f85595t = ((TextView) this.itemView.findViewById(R.id.a_9));

    /* renamed from: u */
    View f85596u = this.itemView.findViewById(R.id.di_);

    /* renamed from: v */
    ImageView f85597v = ((ImageView) this.itemView.findViewById(R.id.byy));

    /* renamed from: w */
    TextView f85598w = ((TextView) this.itemView.findViewById(R.id.f2i));

    /* renamed from: x */
    public AbstractC36428a f85599x;

    /* renamed from: y */
    public Comment f85600y;

    /* renamed from: z */
    C37297b f85601z;

    static {
        Covode.recordClassIndex(43495);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo63397a() {
        if (this.f85600y.getAliasAweme() != null || !m73841g()) {
            return false;
        }
        String cid = this.f85600y.getCid();
        if (!TextUtils.isEmpty(cid)) {
            Map<String, Comment> map = this.f85565A.f87767b;
            if (map.containsKey(this.f85600y.getCid())) {
                mo63400d();
                map.remove(cid);
            } else {
                m73842h();
                map.put(cid, this.f85600y);
            }
            this.f85565A.mo64781b().postValue(Integer.valueOf(map.size()));
        }
        return true;
    }

    /* renamed from: g */
    private boolean m73841g() {
        CommentBatchManagementViewModel commentBatchManagementViewModel;
        if (!C36176c.m73729a() || (commentBatchManagementViewModel = this.f85565A) == null || !commentBatchManagementViewModel.mo64780a().getValue().booleanValue()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private void m73842h() {
        this.f85579d.setSelected(true);
        View view = this.f85576a;
        view.setBackgroundColor(view.getResources().getColor(R.color.v));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo63400d() {
        this.f85579d.setSelected(false);
        View view = this.f85576a;
        view.setBackgroundColor(view.getResources().getColor(R.color.r));
    }

    /* renamed from: f */
    private void m73840f() {
        MethodCollector.m26663i(9742);
        if (this.f85592q != null) {
            Aweme aliasAweme = this.f85600y.getAliasAweme();
            if (aliasAweme != null) {
                if (this.f85593r == null) {
                    this.f85593r = (RemoteImageView) this.f85592q.inflate();
                }
                this.f85593r.setVisibility(0);
                m73837a(aliasAweme.getVideo());
                MethodCollector.m26664o(9742);
                return;
            }
            RemoteImageView remoteImageView = this.f85593r;
            if (remoteImageView != null) {
                remoteImageView.setVisibility(8);
            }
        }
        MethodCollector.m26664o(9742);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36424j
    /* renamed from: c */
    public final void mo63399c() {
        getClass().getSimpleName();
        Comment comment = this.f85600y;
        if (comment != null) {
            m73838a(comment.isUserDigged(), this.f85600y.getDiggCount(), false, this.f85600y.isAuthorDigged());
        }
    }

    /* renamed from: e */
    private void m73839e() {
        boolean z;
        if (C36535m.m74352a(this.f85600y) || (C36173a.m73726c() && !this.f85570F)) {
            z = true;
        } else {
            z = false;
        }
        String a = C37194f.m75163a(this.f85600y, !z);
        if (!TextUtils.isEmpty(a)) {
            this.f85586k.setText(a);
            this.f85586k.setVisibility(0);
            C46579b.m89899a(this.f85586k);
        } else {
            this.f85586k.setVisibility(8);
        }
        C89219l.m154721d(this.f85600y, "");
        MentionTextView mentionTextView = this.f85586k;
        mentionTextView.setSpanColor(mentionTextView.getResources().getColor(R.color.bx));
        this.f85586k.setSpanStyle(1);
        this.f85586k.setOnSpanClickListener(new C36243p(this));
        MentionTextView mentionTextView2 = this.f85586k;
        mentionTextView2.mo124999a(C37194f.m75165a(this.f85600y, mentionTextView2.getContext(), z), new C74147f(), (MentionTextView.AbstractC81407d) null);
        this.f85586k.setMovementMethod(LinkMovementMethod.getInstance());
        if (this.f85586k.getVisibility() == 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(this.f85586k.getText());
            this.f85586k.setText(spannableStringBuilder);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36424j
    /* renamed from: b */
    public final void mo63398b() {
        boolean z;
        Comment comment = this.f85600y;
        if (comment != null) {
            int i = 4;
            if (C36535m.m74352a(comment)) {
                TextView textView = this.f85594s;
                if (textView != null) {
                    C34729o.m70959b(false, textView, this.f85595t);
                }
                if (this.f85600y.getAliasAweme() == null) {
                    this.f85583h.setVisibility(4);
                    this.f85581f.setVisibility(4);
                    this.f85582g.setVisibility(4);
                }
            } else {
                if (this.f85594s != null) {
                    if (!C36173a.m73726c()) {
                        this.f85594s.setVisibility(8);
                    } else if (this.f85570F) {
                        C34729o.m70959b(false, this.f85594s, this.f85595t);
                    } else {
                        if (C16048b.m29633a().mo25421a(true, "standardize_timestamp", false)) {
                            TextView textView2 = this.f85594s;
                            C80187aa.C80188a aVar = C80187aa.f179656s;
                            textView2.setText(C80187aa.C80188a.m139006a(((long) this.f85600y.getCreateTime()) * 1000));
                        } else {
                            this.f85594s.setText(C80566ib.m139651a(this.itemView.getContext(), ((long) this.f85600y.getCreateTime()) * 1000));
                        }
                        C34729o.m70959b(true, this.f85594s);
                        if (this.f85600y.getAliasAweme() == null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        C34729o.m70959b(z, this.f85595t);
                    }
                }
                if (this.f85600y.getAliasAweme() == null) {
                    TextView textView3 = this.f85583h;
                    if (this.f85600y.getDiggCount() != 0) {
                        i = 0;
                    }
                    textView3.setVisibility(i);
                    this.f85581f.setVisibility(0);
                    this.f85582g.setVisibility(0);
                }
            }
            C36535m.m74351a(this.f85600y, this.f85590o);
            m73839e();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36424j
    /* renamed from: a */
    public final void mo63395a(String str) {
        this.f85567C = str;
    }

    /* renamed from: a */
    private void m73837a(Video video) {
        if (this.f85593r != null && video != null && video.getCover() != null && !C13603b.m24435a((Collection) video.getCover().getUrlList())) {
            UrlModel cover = video.getCover();
            if (this.f85571G == null) {
                this.f85571G = new AbstractC46649i() {
                    /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36229h.C362345 */

                    static {
                        Covode.recordClassIndex(43500);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.emoji.utils.AbstractC46649i
                    /* renamed from: b */
                    public final void mo63350b() {
                    }

                    @Override // com.p2082ss.android.ugc.aweme.emoji.utils.AbstractC46649i
                    /* renamed from: a */
                    public final void mo63349a() {
                        C36229h.this.f85593r.setBackgroundResource(R.color.j);
                        ((C24246a) C36229h.this.f85593r.getHierarchy()).mo39958a(C24229q.AbstractC24231b.f57457g);
                        RemoteImageView remoteImageView = C36229h.this.f85593r;
                        C24185e b = C24182c.m45843b();
                        b.f57309m = C36229h.this.f85593r.getController();
                        C24639c a = C24639c.m47149a(C24134g.m45734a(2131231219));
                        a.f58555f = new ImageDecodeOptionsBuilder().setBitmapConfig(Bitmap.Config.ARGB_8888).mo40154a();
                        b.f57299c = (REQUEST) a.mo40483a();
                        remoteImageView.setController(b.mo39827e());
                    }
                };
            }
            C46646h.m90043a(this.f85593r, cover, this.f85571G);
        }
    }

    /* renamed from: a */
    public final void mo63392a(View view) {
        int i;
        int id = view.getId();
        if (id == R.id.c3u) {
            if (!C36535m.m74352a(this.f85600y) && this.f85600y.getCid() != null && this.f85581f.getVisibility() == 0) {
                if (!C31575b.m65865g().isLogin()) {
                    C58957c.m108319a(C17873f.m33102j(), this.f85567C, "like_comment", new C80222ap().mo123649a("group_id", this.f85568D).mo123649a("log_pb", C59208ac.m108768c(this.f85568D)).f179700a);
                    return;
                }
                Comment comment = this.f85600y;
                if (comment != null && this.f85599x != null) {
                    if (C36487a.m74277a(comment)) {
                        boolean z = !this.f85600y.isUserDigged();
                        boolean isAuthorDigged = this.f85600y.isAuthorDigged();
                        if (TextUtils.equals(this.f85569E, C31575b.m65865g().getCurUserId()) && !TextUtils.equals(this.f85569E, Comment.getAuthorUid(this.f85600y))) {
                            if (z) {
                                C36539b.m74376b(this.f85567C, this.f85568D, this.f85569E, this.f85600y.getCid());
                            }
                            isAuthorDigged = z;
                        }
                        int diggCount = this.f85600y.getDiggCount();
                        if (z) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        m73838a(z, diggCount + i, true, isAuthorDigged);
                    }
                    AbstractC36428a aVar = this.f85599x;
                    Comment comment2 = this.f85600y;
                    getAdapterPosition();
                    aVar.mo63749c(comment2);
                }
            }
        } else if (id == R.id.f2i && !C58001a.m104815a(view, 1200) && !TextUtils.isEmpty(this.f85600y.getReplyToUserId()) && this.f85599x != null && C17873f.m33102j() != null) {
            SmartRouter.buildRoute(C17873f.m33102j(), "aweme://user/profile/").withParam("uid", this.f85600y.getReplyToUserId()).open();
            mo63396a(this.f85600y.getReplyToUserId(), "click_name");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36424j
    /* renamed from: a */
    public final void mo63394a(Comment comment) {
        User curUser;
        C20766v vVar;
        if (comment != null) {
            this.f85577b.setBackgroundResource(R.drawable.ld);
            this.f85600y = comment;
            this.f85601z.mo64892a(this.f85586k.getContext(), comment, new C37075bu(this.f85586k.getContext(), this.f85586k), new C37075bu(this.f85586k.getContext(), null), this.f85589n);
            mo63398b();
            User user = this.f85600y.getUser();
            if (comment.getCommerceInfo() == null) {
                int a = C34728n.m70946a(24.0d);
                if (user != null) {
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
                    if (avatarThumb == null || avatarThumb.getUrlList() == null || avatarThumb.getUrlList().size() == 0) {
                        vVar = C20761r.m39056a(2131232314);
                    } else {
                        vVar = C20761r.m39060a(C34735v.m70965a(avatarThumb));
                    }
                    C36223d.m73822a();
                    C20766v a2 = vVar.mo34185b(C80397em.m139369a(100)).mo34176a(a, a);
                    a2.f49098K = true;
                    C20766v a3 = a2.mo34179a("CommentViewHolder");
                    a3.f49092E = this.f85578c;
                    a3.mo34186c();
                    if (!C36223d.m73822a().f85543a || TextUtils.isEmpty(user.getUserDisplayName())) {
                        this.f85584i.setText(C80580in.m139677a(user, false));
                    } else {
                        this.f85584i.setText(user.getUserDisplayName());
                    }
                }
            } else {
                CommerceCommentStruct commerceInfo = comment.getCommerceInfo();
                int a4 = C34728n.m70946a(24.0d);
                C20766v a5 = C20761r.m39061a(commerceInfo.getAvartalUrl()).mo34185b(C80397em.m139369a(100)).mo34176a(a4, a4);
                a5.f49098K = true;
                C20766v a6 = a5.mo34179a("CommentViewHolder");
                a6.f49092E = this.f85578c;
                a6.mo34186c();
                this.f85584i.setText(commerceInfo.getNickName());
            }
            if (TextUtils.isEmpty(this.f85600y.getReplyToUserName()) || TextUtils.equals("0", this.f85600y.getReplyToReplyCommentId()) || !C36173a.m73725b()) {
                C37188b.m75154b(comment, this.f85585j);
                C37188b.m75153a(comment, this.f85587l);
                C37208m.m75198a(this.f85588m, comment.getRelationLabel());
                C34729o.m70959b(false, this.f85597v, this.f85598w);
            } else {
                this.f85598w.setText(this.f85600y.getReplyToUserName());
                C34729o.m70959b(true, this.f85597v, this.f85598w);
                C34729o.m70959b(false, this.f85585j, this.f85587l, this.f85588m);
                if (this.f85576a != null) {
                    this.f85596u.post(new RunnableC36242o(this));
                }
            }
            if (C36180f.m73734a()) {
                this.f85583h.setText(C53437b.m98615a((long) comment.getDiggCount()));
                m73838a(comment.isUserDigged(), comment.getDiggCount(), false, comment.isAuthorDigged());
                m73840f();
            } else if (this.f85600y.getAliasAweme() == null) {
                this.f85583h.setText(C53437b.m98615a((long) comment.getDiggCount()));
                m73838a(comment.isUserDigged(), comment.getDiggCount(), false, comment.isAuthorDigged());
                RemoteImageView remoteImageView = this.f85593r;
                if (remoteImageView != null && remoteImageView.getVisibility() == 0) {
                    this.f85593r.setVisibility(8);
                }
            } else {
                this.f85582g.setVisibility(8);
                this.f85583h.setVisibility(8);
                this.f85591p.setVisibility(8);
                m73840f();
            }
            if (m73841g() && this.f85600y.getAliasAweme() != null) {
                if (this.f85565A.f87767b.containsKey(this.f85600y.getCid())) {
                    m73842h();
                } else {
                    mo63400d();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63393a(View view, String str) {
        AbstractC36428a aVar;
        if (this.f85600y != null && !C58001a.m104815a(view, 1200)) {
            if (!TextUtils.equals(str, "click_button")) {
                User user = this.f85600y.getUser();
                if (user == null) {
                    return;
                }
                if (user.isAdFake()) {
                    new C79459a(view.getContext()).mo123050a(R.string.o6).mo123053a();
                } else if (!TextUtils.isEmpty(user.getUid()) && (aVar = this.f85599x) != null) {
                    aVar.mo63747a(user.getUid(), user.getSecUid(), str);
                }
            } else if (!mo63397a()) {
                this.f85599x.mo63748b(this.f85600y);
            }
        }
    }

    public C36229h(ViewGroup viewGroup, AbstractC36428a aVar) {
        super(C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.is, viewGroup, false));
        View findViewById = this.itemView.findViewById(R.id.c3u);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC36236i(this));
        }
        View findViewById2 = this.itemView.findViewById(R.id.f2i);
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new View$OnClickListenerC36237j(this));
        }
        this.f85599x = aVar;
        this.itemView.setOnClickListener(new View$OnClickListenerC36238k(this));
        this.itemView.setOnLongClickListener(new View$OnLongClickListenerC36239l(this));
        TuxTextView tuxTextView = this.f85590o;
        if (tuxTextView != null) {
            tuxTextView.setOnTouchListener(new C17235c.View$OnTouchListenerC17237a());
            this.f85590o.setOnClickListener(new View$OnClickListenerC36240m(this));
        }
        this.f85578c.setOnTouchListener(this.f85572H);
        this.f85584i.setOnTouchListener(this.f85573I);
        this.f85595t.setOnTouchListener(this.f85574J);
        this.f85588m.setOnTouchListener(this.f85575K);
        this.f85601z = new C37297b(this.f85586k.getContext());
        C80509gq.m139525a(this.f85586k);
        if (Build.VERSION.SDK_INT >= 23) {
            this.f85586k.setBreakStrategy(0);
        }
        this.f85586k.setLineSpacing(C13628n.m24520b(C17867d.m33078a(), 3.0f), 1.0f);
        if (C36176c.m73729a()) {
            this.f85565A = CommentBatchManagementViewModel.C37228a.m75235a((ActivityC0945e) this.itemView.getContext());
            this.f85566B = new C36241n(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63396a(String str, String str2) {
        C39162r.m79460a("enter_personal_detail", new C33744d().mo59983a("enter_from", this.f85567C).mo59983a("to_user_id", str).mo59983a("group_id", this.f85568D).mo59983a("author_id", this.f85569E).mo59983a("enter_method", str2).mo59980a("self_click", str.equals(C31575b.m65865g().getCurUserId()) ? 1 : 0).f79943a);
    }

    /* renamed from: a */
    private void m73838a(boolean z, int i, boolean z2, boolean z3) {
        int i2;
        boolean z4;
        int i3;
        getClass().getSimpleName();
        if (this.f85591p != null) {
            if (!z3 || TextUtils.equals(this.f85569E, Comment.getAuthorUid(this.f85600y))) {
                z4 = false;
            } else {
                z4 = true;
            }
            TuxTextView tuxTextView = this.f85591p;
            if (z4) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            tuxTextView.setVisibility(i3);
        }
        if (z2) {
            this.f85582g.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.comment.adapter.C36229h.RunnableC362356 */

                static {
                    Covode.recordClassIndex(43501);
                }

                public final void run() {
                    C36229h.this.f85582g.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                }
            }).start();
        }
        this.f85583h.setText(C53437b.m98615a((long) i));
        TextView textView = this.f85583h;
        if (i == 0) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        textView.setVisibility(i2);
        if (z) {
            this.f85582g.setSelected(true);
            ImageView imageView = this.f85582g;
            imageView.setImageDrawable(imageView.getResources().getDrawable(2131232219));
            TextView textView2 = this.f85583h;
            textView2.setTextColor(textView2.getResources().getColor(R.color.bh));
            return;
        }
        this.f85582g.setSelected(false);
        ImageView imageView2 = this.f85582g;
        imageView2.setImageDrawable(imageView2.getResources().getDrawable(2131232220));
        TextView textView3 = this.f85583h;
        textView3.setTextColor(textView3.getResources().getColor(R.color.c5));
    }
}
