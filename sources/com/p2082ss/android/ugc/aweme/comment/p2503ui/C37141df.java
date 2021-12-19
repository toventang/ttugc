package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13627m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.uikit.p1279a.AbstractC18234b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1721g.C23144b;
import com.p084a.p088b.C1870c;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.comment.C36274b;
import com.p2082ss.android.ugc.aweme.comment.api.C36269c;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a;
import com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36430c;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36539b;
import com.p2082ss.android.ugc.aweme.comment.services.AbstractC36952a;
import com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.compliance.api.C39223a;
import com.p2082ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.FadeImageView;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeControl;
import com.p2082ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.p2082ss.android.ugc.aweme.feed.p2949i.C49672ag;
import com.p2082ss.android.ugc.aweme.forward.p3004a.C51414a;
import com.p2082ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.story.p4025d.C76706a;
import com.p2082ss.android.ugc.aweme.utils.C80298cg;
import com.p2082ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.AbstractC90252i;
import org.greenrobot.eventbus.AbstractC90253j;
import org.greenrobot.eventbus.AbstractC90264r;
import org.greenrobot.eventbus.RunnableC90250g;
import org.greenrobot.eventbus.ThreadMode;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88982v;
import p4560f.p4561a.AbstractC88983w;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.p4611f.p4613b.C89219l;
import p4623i.p4624a.p4625a.p4626a.p4627a.C89393b;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.df */
public final class C37141df extends AbstractC18234b implements AbstractC36413a, AbstractC36953b, AbstractC90252i, AbstractC90253j {

    /* renamed from: k */
    public static final C37142a f87519k = new C37142a((byte) 0);

    /* renamed from: a */
    public AbstractC36952a f87520a;

    /* renamed from: b */
    public C36274b f87521b;

    /* renamed from: c */
    public AbstractC36430c f87522c;

    /* renamed from: d */
    public String f87523d = "";

    /* renamed from: e */
    public AbstractC88982v<Aweme> f87524e;

    /* renamed from: j */
    public final StringBuffer f87525j = new StringBuffer();

    /* renamed from: l */
    private boolean f87526l;

    /* renamed from: m */
    private boolean f87527m;

    /* renamed from: n */
    private AbstractC88979t<Aweme> f87528n;

    /* renamed from: o */
    private final C88411a f87529o = new C88411a();

    /* renamed from: p */
    private SparseArray f87530p;

    static {
        Covode.recordClassIndex(44495);
    }

    /* renamed from: a */
    public final View mo64666a(int i) {
        if (this.f87530p == null) {
            this.f87530p = new SparseArray();
        }
        View view = (View) this.f87530p.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f87530p.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: a */
    public final void mo63683a(float f) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: a */
    public final void mo63684a(String str, String str2) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: b */
    public final void mo63687b(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: c */
    public final void mo63688c() {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: c */
    public final void mo63689c(boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: g */
    public final void mo63693g() {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: g */
    public final void mo64433g(Comment comment) {
    }

    @Override // org.greenrobot.eventbus.AbstractC90252i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(2, new RunnableC90250g(C37141df.class, "onVideoEvent", C49672ag.class, ThreadMode.MAIN, 0, false));
        hashMap.put(5, new RunnableC90250g(C37141df.class, "onCommentEvent", C36387c.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: h */
    public final void mo63694h() {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: n */
    public final Comment mo64435n() {
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    public final void onEvent(C51414a aVar) {
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: p */
    public final int mo64438p() {
        return 1;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.df$a */
    public static final class C37142a {
        static {
            Covode.recordClassIndex(44496);
        }

        private C37142a() {
        }

        public /* synthetic */ C37142a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: m */
    public final Aweme mo64434m() {
        return mo64667l();
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.f43437f = false;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.df$i */
    static final class RunnableC37150i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C37141df f87539a;

        /* renamed from: b */
        final /* synthetic */ boolean f87540b;

        static {
            Covode.recordClassIndex(44504);
        }

        RunnableC37150i(C37141df dfVar, boolean z) {
            this.f87539a = dfVar;
            this.f87540b = z;
        }

        public final void run() {
            this.f87539a.mo63685a(!this.f87540b);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b
    public final boolean af_() {
        if (!super.af_() || getContext() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final Aweme mo64667l() {
        AbstractC36952a aVar = this.f87520a;
        if (aVar != null) {
            return aVar.mo64420h();
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: o */
    public final String mo64436o() {
        String i;
        AbstractC36952a aVar = this.f87520a;
        if (aVar == null || (i = aVar.mo64421i()) == null) {
            return "";
        }
        return i;
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        C80298cg.m139205b(this);
        SparseArray sparseArray = this.f87530p;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        mo63686b();
        m74906b(9);
    }

    /* renamed from: t */
    private final C37048bj m74908t() {
        AbstractC0952i k;
        AbstractC36952a aVar = this.f87520a;
        Fragment fragment = null;
        if (!(aVar == null || (k = aVar.mo64423k()) == null)) {
            fragment = k.mo3551a("comment_page");
        }
        return (C37048bj) fragment;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: d */
    public final void mo63690d() {
        this.f87526l = true;
        LinearLayout linearLayout = (LinearLayout) mo64666a(R.id.ccb);
        if (linearLayout != null) {
            linearLayout.setVisibility(4);
            linearLayout.setEnabled(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: e */
    public final void mo63692e() {
        this.f87526l = false;
        LinearLayout linearLayout = (LinearLayout) mo64666a(R.id.ccb);
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
            linearLayout.setEnabled(true);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: i */
    public final void mo63695i() {
        AbstractC0952i fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            C89219l.m154716b(fragmentManager, "");
            Fragment a = fragmentManager.mo3551a("story_comment_input_tag");
            if (a != null) {
                fragmentManager.mo3552a().mo3455a(a).mo3473c();
            }
        }
    }

    /* renamed from: r */
    public final String mo64670r() {
        Aweme h;
        String aid;
        AbstractC36952a aVar = this.f87520a;
        if (aVar == null || (h = aVar.mo64420h()) == null || (aid = h.getAid()) == null) {
            return "";
        }
        return aid;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r1 < 0) goto L_0x001b;
     */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m74907s() {
        /*
            r6 = this;
            java.lang.String r5 = ""
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r6.mo64667l()
            com.ss.android.ugc.aweme.comment.services.CommentService r0 = com.p2082ss.android.ugc.aweme.comment.CommentServiceImpl.m73664e()
            boolean r0 = r0.mo63307c(r1)
            r3 = 0
            if (r0 != 0) goto L_0x0018
            boolean r0 = com.p2082ss.android.ugc.aweme.login.p3424b.C58956a.m108315a(r1)
            if (r0 == 0) goto L_0x001f
        L_0x0018:
            r1 = 0
        L_0x001a:
            r3 = r1
        L_0x001b:
            r2 = 2131369285(0x7f0a1d45, float:1.8358544E38)
            goto L_0x0030
        L_0x001f:
            if (r1 == 0) goto L_0x0018
            com.ss.android.ugc.aweme.feed.model.AwemeStatistics r0 = r1.getStatistics()
            if (r0 == 0) goto L_0x0018
            long r1 = r0.getCommentCount()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            goto L_0x001b
        L_0x0030:
            java.lang.String r1 = com.p2082ss.android.ugc.aweme.i18n.C53437b.m98615a(r3)     // Catch:{ Exception -> 0x0044 }
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r5)     // Catch:{ Exception -> 0x0044 }
            android.view.View r0 = r6.mo64666a(r2)     // Catch:{ Exception -> 0x0044 }
            com.bytedance.tux.input.TuxTextView r0 = (com.bytedance.tux.input.TuxTextView) r0     // Catch:{ Exception -> 0x0044 }
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r5)     // Catch:{ Exception -> 0x0044 }
            r0.setText(r1)     // Catch:{ Exception -> 0x0044 }
            return
        L_0x0044:
            r0 = move-exception
            com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a.m95790a(r0)
            android.view.View r1 = r6.mo64666a(r2)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r5)
            java.lang.String r0 = "0"
            r1.setText(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.C37141df.m74907s():void");
    }

    /* renamed from: u */
    private final boolean m74909u() {
        AbstractC36952a aVar = this.f87520a;
        if (!(aVar == null || aVar.mo64420h() == null)) {
            AbstractC36952a aVar2 = this.f87520a;
            if (aVar2 == null) {
                C89219l.m154715b();
            }
            Aweme h = aVar2.mo64420h();
            if (!(h == null || h.getStatus() == null)) {
                AwemeStatus status = h.getStatus();
                C89219l.m154716b(status, "");
                if (status.getPrivateStatus() == 1 && h.getAuthor() != null) {
                    User author = h.getAuthor();
                    C89219l.m154716b(author, "");
                    String uid = author.getUid();
                    IAccountUserService g = C31575b.m65865g();
                    C89219l.m154716b(g, "");
                    User curUser = g.getCurUser();
                    C89219l.m154716b(curUser, "");
                    if (TextUtils.equals(uid, curUser.getUid())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: j */
    public final void mo63696j() {
        boolean a = C39223a.m79589c().mo68606a(3);
        if (this.f87527m != a && this.f87521b != null) {
            this.f87527m = a;
            if (a) {
                LinearLayout linearLayout = (LinearLayout) mo64666a(R.id.cdi);
                C89219l.m154716b(linearLayout, "");
                linearLayout.setVisibility(8);
            } else {
                LinearLayout linearLayout2 = (LinearLayout) mo64666a(R.id.cdi);
                C89219l.m154716b(linearLayout2, "");
                linearLayout2.setVisibility(0);
            }
            C36274b bVar = this.f87521b;
            if (bVar == null) {
                C89219l.m154715b();
            }
            bVar.mo63497b(this.f87527m);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: k */
    public final void mo63697k() {
        if (af_() && mo64666a(R.id.aug) != null) {
            Aweme bindAweme = ((StoryEmojiReactionView) mo64666a(R.id.aug)).getBindAweme();
            if (this.f87525j.length() > 0) {
                String stringBuffer = this.f87525j.toString();
                C89219l.m154716b(stringBuffer, "");
                if (bindAweme != null) {
                    bindAweme.getAid();
                }
                AbstractC36952a aVar = this.f87520a;
                if (aVar != null) {
                    aVar.mo64415a(false);
                }
                C36274b bVar = this.f87521b;
                if (bVar != null) {
                    bVar.mo63478a(stringBuffer, bindAweme);
                }
                this.f87525j.setLength(0);
            }
            ((StoryEmojiReactionView) mo64666a(R.id.aug)).mo79274a(mo64667l());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: b */
    public final void mo63686b() {
        if (af_()) {
            IAccountUserService g = C31575b.m65865g();
            C89219l.m154716b(g, "");
            if (!g.isLogin()) {
                MentionEditText mentionEditText = (MentionEditText) mo64666a(R.id.a9d);
                C89219l.m154716b(mentionEditText, "");
                mentionEditText.setFocusable(false);
            } else {
                MentionEditText mentionEditText2 = (MentionEditText) mo64666a(R.id.a9d);
                C89219l.m154716b(mentionEditText2, "");
                mentionEditText2.setFocusable(true);
                MentionEditText mentionEditText3 = (MentionEditText) mo64666a(R.id.a9d);
                C89219l.m154716b(mentionEditText3, "");
                mentionEditText3.setFocusableInTouchMode(true);
                ((MentionEditText) mo64666a(R.id.a9d)).requestFocus();
            }
            Aweme l = mo64667l();
            if (l == null || !l.isProhibited()) {
                MentionEditText mentionEditText4 = (MentionEditText) mo64666a(R.id.a9d);
                C89219l.m154716b(mentionEditText4, "");
                mentionEditText4.setEnabled(true);
                C36274b bVar = this.f87521b;
                if (bVar != null) {
                    bVar.mo63466a();
                }
                if (m74905a(l)) {
                    StoryEmojiReactionView storyEmojiReactionView = (StoryEmojiReactionView) mo64666a(R.id.aug);
                    C89219l.m154716b(storyEmojiReactionView, "");
                    storyEmojiReactionView.setVisibility(8);
                    return;
                }
                StoryEmojiReactionView storyEmojiReactionView2 = (StoryEmojiReactionView) mo64666a(R.id.aug);
                C89219l.m154716b(storyEmojiReactionView2, "");
                storyEmojiReactionView2.setVisibility(0);
                return;
            }
            MentionEditText mentionEditText5 = (MentionEditText) mo64666a(R.id.a9d);
            C89219l.m154716b(mentionEditText5, "");
            mentionEditText5.setEnabled(false);
            ((MentionEditText) mo64666a(R.id.a9d)).setHint(R.string.akw);
            StoryEmojiReactionView storyEmojiReactionView3 = (StoryEmojiReactionView) mo64666a(R.id.aug);
            C89219l.m154716b(storyEmojiReactionView3, "");
            storyEmojiReactionView3.setVisibility(8);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: a */
    public final void mo63682a() {
        if (mo64666a(R.id.a9d) != null) {
            Aweme l = mo64667l();
            m74907s();
            if (l == null || !l.isProhibited()) {
                MentionEditText mentionEditText = (MentionEditText) mo64666a(R.id.a9d);
                C89219l.m154716b(mentionEditText, "");
                mentionEditText.setEnabled(true);
                C36274b bVar = this.f87521b;
                if (bVar != null) {
                    bVar.mo63466a();
                    bVar.mo63512k();
                    FadeImageView fadeImageView = (FadeImageView) mo64666a(R.id.ejt);
                    C89219l.m154716b(fadeImageView, "");
                    fadeImageView.setVisibility(8);
                }
                if (m74905a(l)) {
                    StoryEmojiReactionView storyEmojiReactionView = (StoryEmojiReactionView) mo64666a(R.id.aug);
                    C89219l.m154716b(storyEmojiReactionView, "");
                    storyEmojiReactionView.setVisibility(8);
                    return;
                }
                StoryEmojiReactionView storyEmojiReactionView2 = (StoryEmojiReactionView) mo64666a(R.id.aug);
                C89219l.m154716b(storyEmojiReactionView2, "");
                storyEmojiReactionView2.setVisibility(0);
                return;
            }
            MentionEditText mentionEditText2 = (MentionEditText) mo64666a(R.id.a9d);
            C89219l.m154716b(mentionEditText2, "");
            mentionEditText2.setEnabled(false);
            ((MentionEditText) mo64666a(R.id.a9d)).setHint(R.string.akw);
            StoryEmojiReactionView storyEmojiReactionView3 = (StoryEmojiReactionView) mo64666a(R.id.aug);
            C89219l.m154716b(storyEmojiReactionView3, "");
            storyEmojiReactionView3.setVisibility(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e8, code lost:
        if (android.text.TextUtils.equals(r1, r0.getUid()) == false) goto L_0x00ea;
     */
    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo64439q() {
        /*
        // Method dump skipped, instructions count: 260
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.C37141df.mo64439q():boolean");
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.df$b */
    public static final class C37143b extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ C37141df f87531a;

        static {
            Covode.recordClassIndex(44497);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37143b(C37141df dfVar) {
            this.f87531a = dfVar;
        }

        public final void updateDrawState(TextPaint textPaint) {
            C89219l.m154721d(textPaint, "");
            textPaint.setUnderlineText(false);
        }

        public final void onClick(View view) {
            C89219l.m154721d(view, "");
            IBanAppealService c = C39223a.m79589c();
            Context context = this.f87531a.getContext();
            if (context == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(context, "");
            c.mo68602a(context, "float_comment");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.df$g */
    public static final class C37148g implements StoryEmojiReactionView.AbstractC46662d {

        /* renamed from: a */
        final /* synthetic */ C37141df f87536a;

        static {
            Covode.recordClassIndex(44502);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37148g(C37141df dfVar) {
            this.f87536a = dfVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.emoji.views.StoryEmojiReactionView.AbstractC46662d
        /* renamed from: a */
        public final void mo64674a(StoryEmojiReactionView.C46661c cVar, Aweme aweme) {
            boolean z;
            C89219l.m154721d(cVar, "");
            if (aweme != null && !C76706a.m134285k(aweme)) {
                boolean z2 = false;
                if (this.f87536a.f87525j.length() <= 148) {
                    if (this.f87536a.f87525j.length() == 0) {
                        AbstractC36952a aVar = this.f87536a.f87520a;
                        if (aVar != null) {
                            z = aVar.mo64417b(cVar.f108800b);
                        } else {
                            z = false;
                        }
                        aweme.getAid();
                        if (!z) {
                            this.f87536a.f87525j.setLength(0);
                            return;
                        }
                        AbstractC36952a aVar2 = this.f87536a.f87520a;
                        if (aVar2 != null) {
                            aVar2.mo64415a(true);
                        }
                    } else {
                        aweme.getAid();
                        AbstractC36952a aVar3 = this.f87536a.f87520a;
                        if (aVar3 != null) {
                            aVar3.mo64419c(cVar.f108800b);
                        }
                    }
                    this.f87536a.f87525j.append(cVar.f108800b);
                    AbstractC88982v<Aweme> vVar = this.f87536a.f87524e;
                    if (vVar != null) {
                        vVar.mo143031a(aweme);
                        return;
                    }
                    return;
                }
                AbstractC36952a aVar4 = this.f87536a.f87520a;
                if (aVar4 != null) {
                    aVar4.mo64415a(false);
                }
                String stringBuffer = this.f87536a.f87525j.toString();
                C89219l.m154716b(stringBuffer, "");
                aweme.getAid();
                C36274b bVar = this.f87536a.f87521b;
                if (bVar != null) {
                    bVar.mo63478a(stringBuffer, aweme);
                }
                this.f87536a.f87525j.setLength(0);
                AbstractC36952a aVar5 = this.f87536a.f87520a;
                if (aVar5 != null) {
                    z2 = aVar5.mo64417b(cVar.f108800b);
                }
                aweme.getAid();
                if (z2) {
                    this.f87536a.f87525j.append(cVar.f108800b);
                    AbstractC36952a aVar6 = this.f87536a.f87520a;
                    if (aVar6 != null) {
                        aVar6.mo64415a(true);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.df$d */
    static final class C37145d<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C37141df f87533a;

        static {
            Covode.recordClassIndex(44499);
        }

        C37145d(C37141df dfVar) {
            this.f87533a = dfVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            ((Throwable) obj).getMessage();
            AbstractC36952a aVar = this.f87533a.f87520a;
            if (aVar != null) {
                aVar.mo64415a(false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.df$e */
    static final class C37146e<T> implements AbstractC88983w {

        /* renamed from: a */
        final /* synthetic */ C37141df f87534a;

        static {
            Covode.recordClassIndex(44500);
        }

        C37146e(C37141df dfVar) {
            this.f87534a = dfVar;
        }

        @Override // p4560f.p4561a.AbstractC88983w
        public final void subscribe(AbstractC88982v<Aweme> vVar) {
            C89219l.m154721d(vVar, "");
            this.f87534a.f87524e = vVar;
        }
    }

    /* renamed from: b */
    private final void m74906b(int i) {
        AbstractC36952a aVar = this.f87520a;
        if (aVar != null) {
            aVar.mo63634a(new C49672ag(i));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: a */
    public final void mo64425a(String str) {
        LinearLayout linearLayout = (LinearLayout) mo64666a(R.id.ccb);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(4);
        m74906b(8);
        AbstractC36430c cVar = this.f87522c;
        if (cVar != null) {
            cVar.mo63766c();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: b */
    public final void mo64428b(String str) {
        String aid;
        Aweme l = mo64667l();
        String str2 = this.f87523d;
        String str3 = "";
        if (l == null) {
            aid = str3;
        } else {
            aid = l.getAid();
            str3 = l.getAuthorUid();
        }
        C36539b.m74372a(str, str2, aid, str3);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: f */
    public final void mo64432f(boolean z) {
        if (z) {
            ForwardStatisticsServiceImpl.m95759b().mo86846a(mo64436o(), mo64667l(), "detail", "click_original");
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f87521b = new C36274b(this, hashCode(), this);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.df$c */
    static final class C37144c<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C37141df f87532a;

        static {
            Covode.recordClassIndex(44498);
        }

        C37144c(C37141df dfVar) {
            this.f87532a = dfVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            Aweme aweme = (Aweme) obj;
            if (this.f87532a.f87525j.length() > 0) {
                String stringBuffer = this.f87532a.f87525j.toString();
                C89219l.m154716b(stringBuffer, "");
                if (aweme != null) {
                    aweme.getAid();
                }
                AbstractC36952a aVar = this.f87532a.f87520a;
                if (aVar != null) {
                    aVar.mo64415a(false);
                }
                C36274b bVar = this.f87532a.f87521b;
                if (bVar != null) {
                    bVar.mo63478a(stringBuffer, aweme);
                }
                this.f87532a.f87525j.setLength(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.df$f */
    static final class View$OnClickListenerC37147f implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37141df f87535a;

        static {
            Covode.recordClassIndex(44501);
        }

        View$OnClickListenerC37147f(C37141df dfVar) {
            this.f87535a = dfVar;
        }

        public final void onClick(View view) {
            AbstractC36952a aVar;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(view, 1200) && !C76706a.m134285k(this.f87535a.mo64667l()) && (aVar = this.f87535a.f87520a) != null) {
                aVar.mo64414a("click_comment_icon");
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: d */
    public final void mo63691d(boolean z) {
        LinearLayout linearLayout = (LinearLayout) mo64666a(R.id.ccb);
        if (linearLayout != null) {
            linearLayout.post(new RunnableC37150i(this, z));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: f */
    public final void mo64431f(Comment comment) {
        C37048bj t = m74908t();
        if (t != null) {
            t.mo63704a(comment);
        }
        if (comment != null) {
            if (comment.isStoryEmojiComment()) {
                if (comment != null) {
                    comment.getAwemeId();
                    comment.getFakeId();
                    comment.getText();
                }
                AbstractC36952a aVar = this.f87520a;
                if (aVar != null) {
                    aVar.mo64413a(comment);
                    return;
                }
                return;
            } else if (comment != null) {
                comment.getAwemeId();
                comment.getFakeId();
                comment.getText();
            }
        }
        AbstractC36952a aVar2 = this.f87520a;
        if (aVar2 != null) {
            aVar2.mo64416b(comment);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onVideoEvent(C49672ag agVar) {
        String str;
        C89219l.m154721d(agVar, "");
        if (14 == agVar.f114315a) {
            Object obj = agVar.f114316b;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj;
            Aweme l = mo64667l();
            if (l != null) {
                str = l.getAid();
            } else {
                str = null;
            }
            if (C13627m.m24499a(str, str2)) {
                m74907s();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: e */
    public final void mo64430e(boolean z) {
        LinearLayout linearLayout = (LinearLayout) mo64666a(R.id.ccb);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(0);
        MentionEditText mentionEditText = (MentionEditText) mo64666a(R.id.a9d);
        C89219l.m154716b(mentionEditText, "");
        if (!TextUtils.isEmpty(mentionEditText.getText())) {
            FadeImageView fadeImageView = (FadeImageView) mo64666a(R.id.ejt);
            C89219l.m154716b(fadeImageView, "");
            fadeImageView.setVisibility(0);
        } else {
            FadeImageView fadeImageView2 = (FadeImageView) mo64666a(R.id.ejt);
            C89219l.m154716b(fadeImageView2, "");
            fadeImageView2.setVisibility(8);
        }
        m74906b(9);
        AbstractC36430c cVar = this.f87522c;
        if (cVar != null) {
            cVar.mo63767d();
        }
        if (this.f87521b != null && mo64666a(R.id.a9d) != null) {
            if (this.f87521b == null) {
                C89219l.m154715b();
            }
            C36274b.m73917a((MentionEditText) mo64666a(R.id.a9d), (int) R.color.a9);
        }
    }

    @AbstractC90264r(mo145422a = ThreadMode.MAIN)
    public final void onCommentEvent(C36387c cVar) {
        C36274b bVar;
        C89219l.m154721d(cVar, "");
        int i = cVar.f86061a;
        Aweme l = mo64667l();
        if (i == 8) {
            if (cVar.f86062b instanceof String) {
                Object obj = cVar.f86062b;
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                if (!(l == null || l.getAid() == null || !C89219l.m154714a((Object) l.getAid(), obj) || (bVar = this.f87521b) == null)) {
                    bVar.mo63466a();
                }
            } else {
                return;
            }
        } else if (!(i == 3 || i == 4 || i == 8)) {
            return;
        }
        if (cVar.f86062b instanceof Object[]) {
            Object obj2 = cVar.f86062b;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Array<*>");
            if (((Object[]) obj2).length == 2) {
                m74907s();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.df$h */
    static final class View$OnClickListenerC37149h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37141df f87537a;

        /* renamed from: b */
        final /* synthetic */ View f87538b;

        static {
            Covode.recordClassIndex(44503);
        }

        View$OnClickListenerC37149h(C37141df dfVar, View view) {
            this.f87537a = dfVar;
            this.f87538b = view;
        }

        public final void onClick(View view) {
            C46534a aVar;
            AwemeControl awemeControl;
            ClickAgent.onClick(view);
            if (!C58001a.m104815a(this.f87538b, 1200) && !C76706a.m134285k(this.f87537a.mo64667l())) {
                Aweme l = this.f87537a.mo64667l();
                if (l == null || (awemeControl = l.getAwemeControl()) == null || awemeControl.canComment()) {
                    this.f87537a.mo64670r();
                    MentionEditText mentionEditText = (MentionEditText) this.f87537a.mo64666a(R.id.a9d);
                    C89219l.m154716b(mentionEditText, "");
                    String.valueOf(mentionEditText.getText());
                    AbstractC36952a aVar2 = this.f87537a.f87520a;
                    if (aVar2 != null) {
                        aVar2.mo64415a(false);
                    }
                    C36274b bVar = this.f87537a.f87521b;
                    if (bVar != null) {
                        MentionEditText mentionEditText2 = (MentionEditText) this.f87537a.mo64666a(R.id.a9d);
                        C89219l.m154716b(mentionEditText2, "");
                        Editable text = mentionEditText2.getText();
                        MentionEditText mentionEditText3 = (MentionEditText) this.f87537a.mo64666a(R.id.a9d);
                        C89219l.m154716b(mentionEditText3, "");
                        ArrayList<TextExtraStruct> textExtraStructList = mentionEditText3.getTextExtraStructList();
                        C36274b bVar2 = this.f87537a.f87521b;
                        if (bVar2 != null) {
                            aVar = bVar2.f85740k;
                        } else {
                            aVar = null;
                        }
                        bVar.mo63480a((CharSequence) text, (List<TextExtraStruct>) textExtraStructList, aVar, false, false);
                    }
                    FadeImageView fadeImageView = (FadeImageView) this.f87537a.mo64666a(R.id.ejt);
                    C89219l.m154716b(fadeImageView, "");
                    fadeImageView.setVisibility(8);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008f, code lost:
        if (android.text.TextUtils.equals(r1, r0.getUid()) == false) goto L_0x0091;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m74905a(com.p2082ss.android.ugc.aweme.feed.model.Aweme r5) {
        /*
        // Method dump skipped, instructions count: 207
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.C37141df.m74905a(com.ss.android.ugc.aweme.feed.model.Aweme):boolean");
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: e */
    public final void mo64429e(Comment comment) {
        String str;
        String str2;
        C89219l.m154721d(comment, "");
        comment.getAwemeId();
        comment.getFakeId();
        comment.getText();
        String awemeId = comment.getAwemeId();
        if (awemeId == null || awemeId.length() == 0) {
            str = mo64670r();
        } else {
            str = comment.getAwemeId();
        }
        AwemeService.m70060b().mo60688c(str);
        List<TextExtraStruct> textExtra = comment.getTextExtra();
        String awemeId2 = comment.getAwemeId();
        if (awemeId2 == null || awemeId2.length() == 0) {
            str2 = mo64670r();
        } else {
            str2 = comment.getAwemeId();
        }
        if (!(textExtra == null || this.f87521b == null)) {
            for (TextExtraStruct textExtraStruct : textExtra) {
                C36274b bVar = this.f87521b;
                if (bVar == null) {
                    C89219l.m154715b();
                }
                Iterator<User> it = bVar.f85733d.iterator();
                while (it.hasNext()) {
                    User next = it.next();
                    C89219l.m154716b(next, "");
                    String uid = next.getUid();
                    C89219l.m154716b(textExtraStruct, "");
                    if (TextUtils.equals(uid, textExtraStruct.getUserId())) {
                        int atType = next.getAtType();
                        if (atType == 3) {
                            getContext();
                            C39162r.m79457a("comment_at", "follow", str2, next.getUid());
                        } else if (atType == 1) {
                            getContext();
                            C39162r.m79457a("comment_at", "search", str2, next.getUid());
                        } else if (atType == 4) {
                            getContext();
                            C39162r.m79457a("comment_at", "recent", str2, next.getUid());
                        }
                    }
                }
            }
        }
        C37048bj t = m74908t();
        comment.setIgnoreToast(true);
        if (t != null) {
            t.mo63705a(comment, false);
        }
        if (comment.isStoryEmojiComment()) {
            comment.getAwemeId();
            comment.getFakeId();
            comment.getCid();
            comment.getText();
            AbstractC36952a aVar = this.f87520a;
            if (aVar != null) {
                aVar.mo64418c(comment);
            }
        } else {
            comment.getAwemeId();
            comment.getFakeId();
            comment.getCid();
            comment.getText();
            AbstractC36952a aVar2 = this.f87520a;
            if (aVar2 != null) {
                aVar2.mo64418c(comment);
            }
        }
        if (af_() && getActivity() != null) {
            new C23144b(this).mo37640e(R.string.al7).mo37637b();
            mo63682a();
            AbstractC81915c.m141874a(new C36387c(3, new Object[]{str, comment.clone()}));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2491e.AbstractC36413a
    /* renamed from: a */
    public final void mo63685a(boolean z) {
        if (!af_()) {
            af_();
            return;
        }
        LinearLayout linearLayout = (LinearLayout) mo64666a(R.id.ccb);
        C89219l.m154716b(linearLayout, "");
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (z) {
            LinearLayout linearLayout2 = (LinearLayout) mo64666a(R.id.cdw);
            C89219l.m154716b(linearLayout2, "");
            if (linearLayout2.getVisibility() == 8 && C76706a.m134287m(mo64667l())) {
                LinearLayout linearLayout3 = (LinearLayout) mo64666a(R.id.cdw);
                C89219l.m154716b(linearLayout3, "");
                linearLayout3.setVisibility(0);
                C34729o.m70955a(mo64666a(R.id.fak), 0);
                Context context = getContext();
                if (context == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(context, "");
                marginLayoutParams.height = context.getResources().getDimensionPixelOffset(R.dimen.ds);
                C89219l.m154716b(C33403c.C33406b.f79409a, "");
                if (C33403c.f79374d) {
                    marginLayoutParams.height += C33403c.f79375e;
                }
                LinearLayout linearLayout4 = (LinearLayout) mo64666a(R.id.ccb);
                C89219l.m154716b(linearLayout4, "");
                linearLayout4.setLayoutParams(marginLayoutParams);
                return;
            }
            return;
        }
        LinearLayout linearLayout5 = (LinearLayout) mo64666a(R.id.cdw);
        C89219l.m154716b(linearLayout5, "");
        if (linearLayout5.getVisibility() == 0) {
            LinearLayout linearLayout6 = (LinearLayout) mo64666a(R.id.cdw);
            C89219l.m154716b(linearLayout6, "");
            linearLayout6.setVisibility(8);
            View a = mo64666a(R.id.fak);
            C89219l.m154716b(a, "");
            a.setVisibility(8);
            marginLayoutParams.height = 1;
            LinearLayout linearLayout7 = (LinearLayout) mo64666a(R.id.ccb);
            C89219l.m154716b(linearLayout7, "");
            linearLayout7.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((LinearLayout) mo64666a(R.id.cdw)).setBackgroundResource(R.drawable.b2y);
        mo64666a(R.id.eqh);
        TuxTextView tuxTextView = (TuxTextView) mo64666a(R.id.eqh);
        C89219l.m154716b(tuxTextView, "");
        String str = getString(R.string.ajd) + " ";
        String string = getString(R.string.h_a);
        C89219l.m154716b(string, "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str + string);
        spannableStringBuilder.setSpan(new C37143b(this), str.length(), spannableStringBuilder.length(), 18);
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(C0643b.m2378c(context, R.color.a9)), str.length(), spannableStringBuilder.length(), 18);
        spannableStringBuilder.setSpan(new StyleSpan(1), str.length(), spannableStringBuilder.length(), 18);
        tuxTextView.setText(spannableStringBuilder);
        TuxTextView tuxTextView2 = (TuxTextView) mo64666a(R.id.eqh);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setMovementMethod(new LinkMovementMethod());
        C36274b bVar = this.f87521b;
        if (bVar != null) {
            mo64666a(R.id.c3l);
            bVar.mo63477a((MentionEditText) mo64666a(R.id.a9d), null, null, null, (TextView) mo64666a(R.id.eqh), mo64670r(), this.f87523d, true);
        }
        boolean a = C39223a.m79589c().mo68606a(3);
        this.f87527m = a;
        C36274b bVar2 = this.f87521b;
        if (bVar2 != null) {
            bVar2.mo63497b(a);
        }
        if (this.f87527m) {
            LinearLayout linearLayout = (LinearLayout) mo64666a(R.id.cdi);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
        } else {
            LinearLayout linearLayout2 = (LinearLayout) mo64666a(R.id.cdi);
            C89219l.m154716b(linearLayout2, "");
            linearLayout2.setVisibility(0);
        }
        MentionEditText mentionEditText = (MentionEditText) mo64666a(R.id.a9d);
        mentionEditText.setCursorVisible(false);
        C89219l.m154716b(mentionEditText, "");
        mentionEditText.setTextColor(C0643b.m2378c(mentionEditText.getContext(), R.color.a_));
        mentionEditText.setHintTextColor(C0643b.m2378c(mentionEditText.getContext(), R.color.ln));
        mentionEditText.setTextAlignment(5);
        ((LinearLayout) mo64666a(R.id.ccm)).setOnClickListener(new View$OnClickListenerC37147f(this));
        m74907s();
        AbstractC88979t<Aweme> a2 = AbstractC88979t.m154294a(new C37146e(this));
        this.f87528n = a2;
        if (a2 != null) {
            AbstractC88412b a3 = a2.mo143291d(1, TimeUnit.SECONDS).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C37144c(this), new C37145d(this));
            C89219l.m154716b(a3, "");
            C88934a.m154195a(a3, this.f87529o);
        }
        if (m74905a(mo64667l())) {
            StoryEmojiReactionView storyEmojiReactionView = (StoryEmojiReactionView) mo64666a(R.id.aug);
            C89219l.m154716b(storyEmojiReactionView, "");
            C89393b.m154949a(storyEmojiReactionView);
        } else {
            StoryEmojiReactionView storyEmojiReactionView2 = (StoryEmojiReactionView) mo64666a(R.id.aug);
            C89219l.m154716b(storyEmojiReactionView2, "");
            C89393b.m154951c(storyEmojiReactionView2);
        }
        ((StoryEmojiReactionView) mo64666a(R.id.aug)).f108786b = mo64667l();
        ((StoryEmojiReactionView) mo64666a(R.id.aug)).setStoryEmojiReactionListener(new C37148g(this));
        ((FadeImageView) mo64666a(R.id.ejt)).setOnClickListener(new View$OnClickListenerC37149h(this, view));
        C33403c.m68506a(mo64666a(R.id.cdw), mo64666a(R.id.fak), null);
        if (!C76706a.m134287m(mo64667l())) {
            mo63685a(false);
        }
        if (this.f87526l) {
            mo63690d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (r3 == null) goto L_0x0013;
     */
    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64426a(java.lang.String r5, int r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r4.mo64667l()
            java.lang.String r2 = r4.f87523d
            java.lang.String r1 = ""
            if (r3 == 0) goto L_0x0010
            java.lang.String r0 = r3.getAid()
            if (r0 != 0) goto L_0x0017
        L_0x0010:
            r0 = r1
            if (r3 != 0) goto L_0x0017
        L_0x0013:
            com.p2082ss.android.ugc.aweme.comment.p2499m.C36539b.m74370a(r5, r6, r2, r0, r1)
            return
        L_0x0017:
            java.lang.String r1 = r3.getAuthorUid()
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.C37141df.mo64426a(java.lang.String, int):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: b */
    public final void mo64427b(Exception exc, int i, Comment comment) {
        C89219l.m154721d(exc, "");
        if (comment != null) {
            comment.getAwemeId();
            comment.getFakeId();
            comment.getCid();
            comment.getText();
        }
        C36269c.m73911a(getContext(), exc, (int) R.string.ak4);
        if (comment != null) {
            comment.setIgnoreToast(true);
        }
        C37048bj t = m74908t();
        if (t != null) {
            t.mo63707a(exc, i, comment);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        View a = C1870c.m6046a(getActivity(), R.layout.ig, viewGroup, false);
        if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C13628n.m24504a(getContext()), -2);
            layoutParams.addRule(12);
            C89219l.m154716b(a, "");
            a.setLayoutParams(layoutParams);
        } else if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(C13628n.m24504a(getContext()), -2);
            layoutParams2.gravity = 80;
            C89219l.m154716b(a, "");
            a.setLayoutParams(layoutParams2);
        } else {
            ViewGroup.LayoutParams layoutParams3 = new ViewGroup.LayoutParams(C13628n.m24504a(getContext()), -2);
            C89219l.m154716b(a, "");
            a.setLayoutParams(layoutParams3);
        }
        C80298cg.m139204a(this);
        return a;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b
    /* renamed from: a */
    public final void mo64424a(int i, int i2, String str, String str2, boolean z) {
        AbstractC36952a aVar = this.f87520a;
        if (aVar != null) {
            aVar.mo64412a(i2);
        }
        if (TextUtils.equals(str2, "story_button_send")) {
            m74906b(57);
            return;
        }
        C49672ag agVar = new C49672ag(11);
        Bundle bundle = new Bundle();
        bundle.putInt("emojiReact", z ? 1 : 0);
        agVar.f114317c = bundle;
        AbstractC36952a aVar2 = this.f87520a;
        if (aVar2 != null) {
            aVar2.mo63634a(agVar);
        }
    }
}
