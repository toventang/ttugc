package com.p2082ss.android.ugc.aweme.comment;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.DialogInterface$OnCancelListenerC0944d;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.android.livesdk.util.rxutils.p646a.C11122a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.policy.PrivacyPolicyStore;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.p1724a.C23208a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.activity.processor.AbstractC33102w;
import com.p2082ss.android.ugc.aweme.app.p2322c.C33721c;
import com.p2082ss.android.ugc.aweme.app.p2328f.C33744d;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.aweme.base.utils.C34719f;
import com.p2082ss.android.ugc.aweme.base.utils.C34721g;
import com.p2082ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.p2082ss.android.ugc.aweme.comment.gift.model.GiftViewModel;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommentAtSummonFriendItem;
import com.p2082ss.android.ugc.aweme.comment.model.CommentResponse;
import com.p2082ss.android.ugc.aweme.comment.model.CommentRethinkPopup;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36392g;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36405d;
import com.p2082ss.android.ugc.aweme.comment.p2493g.AbstractC36429b;
import com.p2082ss.android.ugc.aweme.comment.p2495i.AbstractC36489a;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36497f;
import com.p2082ss.android.ugc.aweme.comment.p2496j.AbstractC36522q;
import com.p2082ss.android.ugc.aweme.comment.p2496j.C36517n;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36539b;
import com.p2082ss.android.ugc.aweme.comment.p2499m.C36540c;
import com.p2082ss.android.ugc.aweme.comment.p2500n.C36547a;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.C37057br;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.C37157k;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz;
import com.p2082ss.android.ugc.aweme.comment.services.AbstractC36953b;
import com.p2082ss.android.ugc.aweme.comment.util.C37194f;
import com.p2082ss.android.ugc.aweme.comment.util.C37216s;
import com.p2082ss.android.ugc.aweme.comment.util.C37218u;
import com.p2082ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.p2082ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.p2082ss.android.ugc.aweme.commercialize.p2540e.p2541a.C37699a;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.discover.hitrank.C42066d;
import com.p2082ss.android.ugc.aweme.emoji.p2899d.p2900a.C46460b;
import com.p2082ss.android.ugc.aweme.emoji.p2904g.C46534a;
import com.p2082ss.android.ugc.aweme.emoji.p2906i.p2913c.C46579b;
import com.p2082ss.android.ugc.aweme.feed.C48027ac;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p2082ss.android.ugc.aweme.lancet.C58029j;
import com.p2082ss.android.ugc.aweme.login.C58957c;
import com.p2082ss.android.ugc.aweme.metrics.C59208ac;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.providedservices.IMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.IIMService;
import com.p2082ss.android.ugc.aweme.p3070im.service.model.IMUser;
import com.p2082ss.android.ugc.aweme.p3382l.p3383a.C58001a;
import com.p2082ss.android.ugc.aweme.profile.C63419ae;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.services.MainServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.services.IVideoGiftService;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.p2082ss.android.ugc.aweme.share.C68863ah;
import com.p2082ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.upvote.event.C79900c;
import com.p2082ss.android.ugc.aweme.utils.C80222ap;
import com.p2082ss.android.ugc.aweme.utils.C80228av;
import com.p2082ss.android.ugc.aweme.utils.C80409eu;
import com.p2082ss.android.ugc.aweme.utils.C80580in;
import com.p2082ss.android.ugc.aweme.utils.C80636z;
import com.p2082ss.android.ugc.aweme.views.mention.MentionEditText;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ss.android.ugc.aweme.comment.b */
public final class C36274b implements AbstractC33102w, AbstractC36522q, DialogInterface$OnShowListenerC37084bz.AbstractC37097a, DialogInterface$OnShowListenerC37084bz.AbstractC37098b, DialogInterface$OnShowListenerC37084bz.AbstractC37099c {

    /* renamed from: A */
    private int f85717A = 0;

    /* renamed from: B */
    private View.OnTouchListener f85718B;

    /* renamed from: C */
    private View.OnClickListener f85719C;

    /* renamed from: D */
    private View f85720D;

    /* renamed from: E */
    private View f85721E;

    /* renamed from: F */
    private TextView f85722F;

    /* renamed from: G */
    private boolean f85723G = false;

    /* renamed from: H */
    private C36164a f85724H;

    /* renamed from: I */
    private View f85725I;

    /* renamed from: J */
    private boolean f85726J;

    /* renamed from: K */
    private boolean f85727K;

    /* renamed from: L */
    private List<Object> f85728L = new CopyOnWriteArrayList();

    /* renamed from: M */
    private boolean f85729M = false;

    /* renamed from: a */
    public MentionEditText f85730a;

    /* renamed from: b */
    public Fragment f85731b;

    /* renamed from: c */
    public AbstractC36953b f85732c;

    /* renamed from: d */
    public HashSet<User> f85733d = new HashSet<>();

    /* renamed from: e */
    public C36517n f85734e;

    /* renamed from: f */
    public C36291a f85735f;

    /* renamed from: g */
    boolean f85736g;

    /* renamed from: h */
    public boolean f85737h = true;

    /* renamed from: i */
    public String f85738i;

    /* renamed from: j */
    public AbstractC36293b f85739j;

    /* renamed from: k */
    public C46534a f85740k;

    /* renamed from: l */
    public View f85741l;

    /* renamed from: m */
    public DataCenter f85742m;

    /* renamed from: n */
    public boolean f85743n = false;

    /* renamed from: o */
    public String f85744o = "";

    /* renamed from: p */
    public List<EditText> f85745p = new CopyOnWriteArrayList();

    /* renamed from: q */
    public C23208a f85746q;

    /* renamed from: r */
    public ConstraintLayout f85747r;

    /* renamed from: s */
    public GiftViewModel f85748s;

    /* renamed from: t */
    IVideoGiftService f85749t = VideoGiftService.m120814l();

    /* renamed from: u */
    public boolean f85750u = false;

    /* renamed from: v */
    private String f85751v;

    /* renamed from: w */
    private int f85752w;

    /* renamed from: x */
    private boolean f85753x;

    /* renamed from: y */
    private String f85754y = "";

    /* renamed from: z */
    private int f85755z;

    /* renamed from: com.ss.android.ugc.aweme.comment.b$b */
    public interface AbstractC36293b {
        static {
            Covode.recordClassIndex(43568);
        }

        /* renamed from: a */
        int mo63538a();
    }

    static {
        Covode.recordClassIndex(43549);
    }

    /* renamed from: d */
    private static int m73919d(boolean z) {
        return z ? 60 : 150;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37098b
    /* renamed from: h */
    public final void mo63509h() {
        mo63489b();
    }

    /* renamed from: a */
    public final void mo63470a(EditText editText) {
        if (!(editText == null || !this.f85745p.contains(editText) || this.f85723G)) {
            this.f85723G = true;
            for (EditText editText2 : this.f85745p) {
                if (editText2 != editText && !C34721g.m70920a(editText2.getText(), editText.getText())) {
                    editText2.setText(editText.getText());
                }
            }
            this.f85723G = false;
        }
    }

    /* renamed from: a */
    public final void mo63477a(MentionEditText mentionEditText, View view, View view2, View view3, TextView textView, String str, String str2, boolean z) {
        this.f85738i = str2;
        this.f85729M = z;
        if (m73927v() != null) {
            this.f85748s.mo63840a(this.f85738i, m73927v().getGroupId(), m73924s(), m73927v().getRequestId());
        }
        this.f85730a = mentionEditText;
        mo63490b(mentionEditText);
        this.f85722F = textView;
        textView.setVisibility(this.f85743n ? 0 : 8);
        Fragment fragment = this.f85731b;
        if (fragment != null && this.f85730a != null) {
            if (fragment.getContext() != null) {
                this.f85730a.setMentionTextColor(C0643b.m2378c(this.f85731b.getContext(), R.color.bx));
            }
            this.f85719C = new View$OnClickListenerC36384c(this, str2, str);
            this.f85718B = new View$OnTouchListenerC36400d(this, str2, str);
            this.f85730a.setFocusable(false);
            this.f85730a.setFocusableInTouchMode(false);
            this.f85730a.setInputType(0);
            this.f85730a.setOnClickListener(this.f85719C);
            this.f85730a.setOnTouchListener(this.f85718B);
            if (view != null) {
                this.f85720D = view;
                if (C80580in.m139687c() || this.f85743n) {
                    view.setVisibility(8);
                }
                this.f85720D.setOnClickListener(new View$OnClickListenerC36414f(this, str2, str, mentionEditText));
            }
            if (view2 != null) {
                this.f85721E = view2;
                if (C80580in.m139687c() || this.f85743n) {
                    view2.setVisibility(8);
                }
                C11122a.m19756a(view2).mo143301g(1, TimeUnit.SECONDS).mo143289d(new C36427g(this, mentionEditText, str, str2));
            }
            if (view3 != null) {
                this.f85725I = view3;
                if (this.f85749t.mo108903a(m73927v())) {
                    this.f85725I.setVisibility(0);
                } else {
                    this.f85725I.setVisibility(8);
                }
                C11122a.m19756a(this.f85725I).mo143301g(1, TimeUnit.SECONDS).mo143289d(new C36486h(this));
            }
            mo63466a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ boolean mo63488a(String str, String str2, View view, MotionEvent motionEvent) {
        if (this.f85730a.isFocused() || this.f85730a.isFocusable() || this.f85730a.isFocusableInTouchMode()) {
            this.f85730a.setFocusable(false);
            this.f85730a.setFocusableInTouchMode(false);
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                view.performClick();
                mo63469a(view, str, str2);
            } else if (action != 2) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63469a(View view, String str, String str2) {
        Context context;
        Fragment fragment = this.f85731b;
        if (fragment == null || (context = fragment.getContext()) == null) {
            context = C17867d.m33078a();
        }
        if (!mo63515n() || C58001a.m104815a(view, 1200)) {
            return;
        }
        if (!C31575b.m65865g().isLogin()) {
            C58957c.m108319a(this.f85731b.getActivity(), str, "click_type_comment", new C80222ap().mo123649a("group_id", str2).mo123649a("log_pb", C59208ac.m108768c(str2)).f179700a);
        } else if (C80580in.m139687c()) {
            new C79459a(context).mo123050a(R.string.acx).mo123053a();
        } else if (!mo63505e()) {
            if (this.f85717A == 1) {
                new C79459a(context).mo123050a(R.string.alx).mo123053a();
            } else if (this.f85732c.mo64434m() != null && !C80636z.m139819d(this.f85732c.mo64434m())) {
                this.f85736g = true;
                if (view instanceof MentionEditText) {
                    mo63481a(((MentionEditText) view).getHint(), false);
                } else if (mo63515n()) {
                    mo63466a();
                    mo63481a((CharSequence) this.f85751v, false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo63487a(boolean z) {
        if (!mo63515n() || mo63505e()) {
            return;
        }
        if (z) {
            mo63479a(this.f85730a.getHint(), "click_gift_icon");
        } else {
            new C79459a(this.f85731b.getContext()).mo123050a(R.string.h8v).mo123053a();
        }
    }

    /* renamed from: a */
    public final void mo63481a(CharSequence charSequence, boolean z) {
        if (mo63515n()) {
            Bundle a = mo63464a(charSequence);
            a.putBoolean("showEmojiPanel", z);
            a.putBoolean("isCommentDesc", this.f85729M);
            mo63472a(DialogInterface$OnShowListenerC37084bz.m74807a(this.f85732c.mo64438p(), mo63507f(), this.f85738i, a));
            mo63502d();
        }
    }

    /* renamed from: a */
    public final void mo63479a(CharSequence charSequence, String str) {
        if (mo63515n()) {
            Bundle a = mo63464a(charSequence);
            a.putBoolean("showGiftPanel", true);
            this.f85748s.f86230e = str;
            DialogInterface$OnShowListenerC37084bz a2 = DialogInterface$OnShowListenerC37084bz.m74807a(this.f85732c.mo64438p(), mo63507f(), this.f85738i, a);
            mo63483a(str);
            mo63472a(a2);
            mo63502d();
        }
    }

    /* renamed from: a */
    public final void mo63475a(User user, String str) {
        if (mo63515n()) {
            this.f85754y = str;
            int o = mo63516o();
            int p = this.f85732c.mo64438p();
            mo63507f();
            DialogInterface$OnShowListenerC37084bz a = DialogInterface$OnShowListenerC37084bz.m74806a(p, false, this.f85738i);
            Bundle arguments = a.getArguments();
            if (arguments != null) {
                arguments.putSerializable("user", user);
                arguments.putInt("maxLength", o);
                arguments.putBoolean("showAt", true);
            }
            mo63472a(a);
        }
    }

    /* renamed from: a */
    public final void mo63472a(DialogInterface$OnShowListenerC37084bz bzVar) {
        bzVar.f87376H = this;
        bzVar.f87375G = this;
        bzVar.f87377I = this;
        m73925t();
        m73926u();
        bzVar.f87387S = m73927v();
        bzVar.mo64594a(this);
        bzVar.f87394Z = this.f85748s;
        mo63514m();
        bzVar.f87389U = this.f85724H;
        bzVar.mo64595a(this.f85740k);
        CommentVideoModel.Type type = CommentVideoModel.Type.NONE;
        Fragment fragment = this.f85731b;
        if (fragment instanceof C37157k) {
            if (((C37157k) fragment).mo64732z()) {
                type = CommentVideoModel.Type.COMMENT;
            }
            bzVar.f87397aa = ((C37157k) this.f85731b).mo64731y();
        }
        if (this.f85750u) {
            type = CommentVideoModel.Type.COMMENT;
        }
        bzVar.f87392X = type;
        try {
            bzVar.show(this.f85731b.getChildFragmentManager(), "input");
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void mo63478a(CharSequence charSequence, Aweme aweme) {
        String str;
        this.f85752w = 1;
        this.f85732c.mo64424a(1, charSequence.length() / 2, charSequence.toString(), "close_text_button_send", true);
        this.f85726J = false;
        AbstractC36953b bVar = this.f85732c;
        String o = bVar == null ? "" : bVar.mo64436o();
        if (aweme != null) {
            str = aweme.getAid();
        } else {
            str = "";
        }
        C36497f.C36498a aVar = (C36497f.C36498a) new C36497f.C36498a().mo63858a(str).mo63860b(charSequence.toString()).mo63859a((List<? extends TextExtraStruct>) null).mo63857a((C46534a) null).mo63856a(C33721c.m69041a(o)).mo63862d("");
        aVar.f86372p = true;
        this.f85734e.f86462a = 1;
        this.f85734e.mo63987a(aVar.mo63874b());
        mo63492b((C46534a) null);
        this.f85726J = false;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37098b
    /* renamed from: a */
    public final void mo63471a(CommentVideoModel.Type type) {
        if (type == CommentVideoModel.Type.NONE) {
            return;
        }
        if (this.f85750u) {
            mo63485a("collection_text_panel", type);
        } else {
            mo63485a("comment_click", type);
        }
    }

    /* renamed from: a */
    public final void mo63485a(String str, CommentVideoModel.Type type) {
        AbstractC36953b bVar;
        Comment n;
        User user;
        String cid;
        String str2;
        String str3;
        if (mo63515n() && this.f85731b.getActivity() != null && (bVar = this.f85732c) != null && bVar.mo64435n() != null && (user = (n = this.f85732c.mo64435n()).getUser()) != null) {
            String o = this.f85732c.mo64436o();
            if (n.getCommentType() == 2) {
                cid = n.getReplyId();
                str2 = n.getCid();
            } else {
                cid = n.getCid();
                str2 = "";
            }
            String o2 = this.f85732c.mo64436o().isEmpty() ? this.f85738i : this.f85732c.mo64436o();
            if (this.f85750u && (str.equals("collection_text_panel") || str.equals("comment_press") || str.equals("collection_reply_button"))) {
                o2 = "collection_comment";
            }
            ActivityC0945e activity = this.f85731b.getActivity();
            String uid = user.getUid();
            String b = C80580in.m139684b(user);
            UrlModel avatarThumb = user.getAvatarThumb();
            String text = n.getText();
            String cid2 = n.getCid();
            String awemeId = n.getAwemeId();
            String s = m73924s();
            int a = C33721c.m69041a(o);
            if (type == CommentVideoModel.Type.COMMENT) {
                str3 = "comment_reply";
            } else {
                str3 = "question_and_answer";
            }
            C37218u.m75212a(activity, new CommentVideoModel(uid, b, avatarThumb, text, cid2, awemeId, s, cid, str2, a, str, 0, 0, type, str3, o2));
            if (type == CommentVideoModel.Type.COMMENT) {
                Fragment fragment = this.f85731b;
                if (fragment instanceof C37157k) {
                    ((C37157k) fragment).mo64698a(n, str);
                    mo63508g();
                }
            }
            if (o2.equals("collection_comment")) {
                m73916a(n, o2, str);
            }
            mo63508g();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37098b
    /* renamed from: a */
    public final void mo63484a(String str, int i) {
        AbstractC36953b bVar = this.f85732c;
        if (bVar != null) {
            bVar.mo64426a(str, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37098b
    /* renamed from: a */
    public final void mo63468a(int i, int i2, int i3, String str, String str2, CommentAtSummonFriendItem commentAtSummonFriendItem) {
        User user;
        Aweme m = this.f85732c.mo64434m();
        String str3 = this.f85738i;
        C33744d a = new C33744d().mo59980a("input_text_length", i).mo59980a("user_text_length", i2).mo59980a("rank", i3).mo59983a("search_keyword", str).mo59983a("enter_from", str3).mo59983a("to_user_id", str2);
        if (m != null) {
            a.mo59983a("group_id", m.getAid()).mo59983a("author_id", m.getAuthorUid());
            C76598h.m134177a(a, m);
            C79900c.m138665a(a, m, str3);
            user = m.getAuthor();
        } else {
            user = null;
        }
        C80409eu.m139390a(a, user);
        if (C59208ac.m108762a(str3)) {
            a.mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(m.getRequestId()));
            a.mo59983a("search_id", commentAtSummonFriendItem.searchId);
            C39162r.m79463b("add_comment_at", C59208ac.m108761a(a.f79943a));
            return;
        }
        C39162r.m79460a("add_comment_at", a.f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37098b
    /* renamed from: a */
    public final void mo63474a(User user) {
        Context context;
        IIMService createIIMServicebyMonsterPlugin = IMService.createIIMServicebyMonsterPlugin(false);
        IMUser fromUser = IMUser.fromUser(user);
        Fragment fragment = this.f85731b;
        if (fragment == null || (context = fragment.getContext()) == null) {
            context = C17867d.m33078a();
        }
        Aweme v = m73927v();
        if (v != null) {
            createIIMServicebyMonsterPlugin.shareSingleMsg(context, fromUser, C68863ah.f154027a.mo109397a(context, v, this.f85738i, "comment_at"), new C36488i(this, v, fromUser, createIIMServicebyMonsterPlugin));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37099c
    /* renamed from: a */
    public final void mo63473a(C46534a aVar) {
        DialogInterface$OnShowListenerC37084bz bzVar;
        MentionEditText.MentionSpan[] mentionText;
        Editable text;
        MentionEditText mentionEditText = this.f85730a;
        boolean z = false;
        boolean z2 = !this.f85753x && (mentionEditText != null && ((text = mentionEditText.getText()) == null || text.length() == 0)) && aVar == null;
        this.f85732c.mo64430e(z2);
        if (mo63515n() && (bzVar = (DialogInterface$OnShowListenerC37084bz) this.f85731b.getChildFragmentManager().mo3551a("input")) != null) {
            if (bzVar.f87421d == null || (mentionText = bzVar.f87421d.getMentionText()) == null || mentionText.length == 0) {
                this.f85733d.clear();
            } else {
                Iterator<User> it = this.f85733d.iterator();
                while (it.hasNext()) {
                    User next = it.next();
                    boolean z3 = false;
                    for (MentionEditText.MentionSpan mentionSpan : mentionText) {
                        if (TextUtils.equals(next.getUid(), mentionSpan.f182050a)) {
                            z3 = true;
                        }
                    }
                    if (!z3) {
                        it.remove();
                    }
                }
            }
        }
        if (z2) {
            mo63512k();
            mo63492b((C46534a) null);
        } else {
            mo63492b(aVar);
        }
        View view = this.f85741l;
        if (view != null && view.getVisibility() == 0) {
            this.f85741l.setVisibility(8);
        }
        View view2 = this.f85725I;
        if (view2 != null && (view2 instanceof TuxIconView)) {
            if (this.f85732c.mo64438p() == 1 || this.f85732c.mo64438p() == 2) {
                z = true;
            }
            ((TuxIconView) this.f85725I).setTintColorRes(R.attr.ac);
            this.f85725I.setAlpha(z ? 1.0f : 0.5f);
            C11122a.m19756a(this.f85725I).mo143301g(1, TimeUnit.SECONDS).mo143289d(new C36501j(this, z));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2496j.AbstractC36522q
    /* renamed from: a */
    public final void mo63482a(Exception exc, Comment comment) {
        if (mo63515n()) {
            CaptchaHelperServiceImpl.m72448a();
        }
        C36291a aVar = this.f85735f;
        if (aVar != null) {
            if (!aVar.mo63537a(exc, this.f85752w, comment)) {
                this.f85735f.mo63534a(comment);
            } else {
                return;
            }
        }
        AbstractC36953b bVar = this.f85732c;
        if (bVar != null) {
            bVar.mo64427b(exc, this.f85752w, comment);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r3 = (com.p2082ss.android.ugc.aweme.profile.model.User) r8.getSerializableExtra("extra_data");
     */
    @Override // com.p2082ss.android.ugc.aweme.activity.processor.AbstractC33102w
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57337a(int r6, int r7, android.content.Intent r8) {
        /*
        // Method dump skipped, instructions count: 110
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.C36274b.mo57337a(int, int, android.content.Intent):void");
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37097a
    /* renamed from: a */
    public final void mo63486a(String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean) {
        m73918a(false, str, charSequence, str2, i, logPbBean);
    }

    /* renamed from: a */
    public final void mo63483a(String str) {
        C39162r.m79460a("show_gift_panel", new C33744d().mo59983a("enter_from", this.f85738i).mo59983a("group_id", m73923r()).mo59983a("author_id", m73924s()).mo59983a("user_id", C31575b.m65865g().getCurUserId()).mo59980a("is_follow", C37216s.m75210b(m73927v())).mo59980a("is_like", C37216s.m75209a(m73927v())).mo59983a("enter_method", str).f79943a);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37098b
    /* renamed from: a */
    public final void mo63480a(CharSequence charSequence, List<TextExtraStruct> list, C46534a aVar, boolean z, boolean z2) {
        String str;
        Aweme v = m73927v();
        GiftViewModel giftViewModel = this.f85748s;
        if (!((giftViewModel == null || giftViewModel.mo63841b().getValue() == null) && TextUtils.isEmpty(charSequence)) && mo63515n()) {
            if (C80580in.m139687c()) {
                new C79459a(this.f85731b.getContext()).mo123050a(R.string.acx).mo123053a();
                return;
            }
            this.f85731b.getContext();
            if (!C58029j.f132256h || !C58029j.m104846b() || C58029j.m104847c()) {
                C58029j.f132256h = m73922q();
            }
            if (!C58029j.f132256h) {
                new C23144b(this.f85731b).mo37640e(R.string.dcq).mo37637b();
            } else if (CommentServiceImpl.m73664e().mo63307c(v)) {
                CommentServiceImpl.m73664e().mo63287a(this.f85731b.getContext(), R.string.ak1, this.f85731b.getString(R.string.am_));
            } else if (!CommentServiceImpl.m73664e().mo63304b(v)) {
                CommentServiceImpl.m73664e().mo63287a(this.f85731b.getContext(), R.string.aki, this.f85731b.getString(R.string.akh));
            } else if (charSequence.length() > m73919d(z)) {
                new C79459a(this.f85731b.getContext()).mo123050a(R.string.a4j).mo123053a();
            } else {
                if (aVar != null) {
                    C46460b.m89694a(aVar);
                }
                int i = 2;
                if (z) {
                    this.f85752w = 3;
                } else if (this.f85732c.mo64435n() != null) {
                    this.f85752w = 2;
                } else {
                    this.f85752w = 1;
                }
                this.f85727K = false;
                this.f85732c.mo64424a(this.f85752w, C46579b.m89897a(charSequence.toString()), charSequence.toString(), z2 ? "close_text_button_send" : "button_send", false);
                this.f85726J = false;
                AbstractC36953b bVar = this.f85732c;
                String o = bVar == null ? "" : bVar.mo64436o();
                if (v != null) {
                    str = v.getAid();
                } else {
                    str = "";
                }
                C36497f.C36498a aVar2 = (C36497f.C36498a) new C36497f.C36498a().mo63858a(str).mo63860b(charSequence.toString()).mo63859a(list).mo63857a(aVar).mo63856a(C33721c.m69041a(o)).mo63862d("");
                aVar2.f86372p = false;
                AbstractC36953b bVar2 = this.f85732c;
                if (bVar2 == null || bVar2.mo64435n() == null) {
                    this.f85734e.f86462a = this.f85737h ? 1 : 0;
                } else {
                    Comment n = this.f85732c.mo64435n();
                    if (n.getCommentType() == 2) {
                        this.f85734e.f86462a = 2;
                        AbstractC36489a.AbstractC36490a c = aVar2.mo63861c(n.getReplyId());
                        c.f86288e = n.getCid();
                        aVar2 = (C36497f.C36498a) c.mo63855a();
                    } else {
                        C36517n nVar = this.f85734e;
                        if (!this.f85737h) {
                            i = 0;
                        }
                        nVar.f86462a = i;
                        aVar2 = (C36497f.C36498a) aVar2.mo63861c(n.getCid());
                    }
                }
                GiftViewModel giftViewModel2 = this.f85748s;
                if (!(giftViewModel2 == null || giftViewModel2.mo63841b().getValue() == null)) {
                    long id = this.f85748s.mo63841b().getValue().getId();
                    aVar2.f86294k = id;
                    aVar2.f86293j = m73924s();
                    if (this.f85748s.mo63842c().getValue() != null) {
                        aVar2.f86295l = this.f85748s.mo63842c().getValue().get(Long.valueOf(id));
                    }
                    if (!this.f85749t.mo108906d()) {
                        this.f85749t.mo108907e();
                    }
                }
                if ((this.f85731b instanceof C37157k) && C36405d.m74107a() != 0) {
                    aVar2.f86371o = 0;
                }
                aVar2.f86370n = 0;
                this.f85734e.mo63987a(aVar2.mo63874b());
                if (list != null && list.size() > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (TextExtraStruct textExtraStruct : list) {
                        arrayList.add(textExtraStruct.getUserId());
                    }
                    C39162r.m79460a("send_comment_at", new C33744d().mo59982a("to_user_id", arrayList).mo59983a("group_id", v.getAid()).mo59983a("author_id", v.getAuthorUid()).mo59983a("enter_from", this.f85738i).f79943a);
                    this.f85724H.f85433d.clear();
                }
                mo63492b((C46534a) null);
                this.f85726J = false;
            }
        }
    }

    /* renamed from: c */
    public final void mo63498c() {
        C23208a aVar = this.f85746q;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: l */
    public final void mo63513l() {
        mo63512k();
        mo63492b((C46534a) null);
    }

    /* renamed from: m */
    public final void mo63514m() {
        this.f85724H = new C36164a();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.b$a */
    public class C36291a {

        /* renamed from: a */
        public Map<String, Editable> f85789a;

        /* renamed from: b */
        public Map<String, Comment> f85790b;

        /* renamed from: c */
        public C37057br f85791c;

        /* renamed from: d */
        public Comment f85792d;

        /* renamed from: f */
        private Comment f85794f;

        /* renamed from: g */
        private int f85795g;

        static {
            Covode.recordClassIndex(43566);
        }

        /* renamed from: a */
        public final void mo63533a() {
            this.f85789a.clear();
            this.f85790b.clear();
            this.f85792d = null;
        }

        private C36291a() {
            this.f85789a = new HashMap();
            this.f85790b = new HashMap();
            this.f85795g = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo63534a(Comment comment) {
            if (comment != null) {
                this.f85789a.remove(comment.getFakeId());
                this.f85790b.remove(comment.getFakeId());
            }
        }

        /* synthetic */ C36291a(C36274b bVar, byte b) {
            this();
        }

        /* renamed from: a */
        public final void mo63535a(Comment comment, boolean z) {
            C36535m.m74356d(comment);
            AbstractC36489a i = C36535m.m74361i(comment);
            if (i instanceof C36497f) {
                ((C36497f) i).f86367p = 1;
                C36274b.this.f85734e.mo63988b(i);
            } else {
                C36535m.m74355c(comment);
            }
            mo63533a();
            if (z) {
                mo63536a("comment_rethink_hit", comment, new C33744d().mo59980a("no_sw", 0));
            }
        }

        /* renamed from: a */
        public final void mo63536a(String str, Comment comment, C33744d dVar) {
            C39162r.m79460a(str, dVar.mo59983a(UGCMonitor.EVENT_COMMENT, comment.getText()).mo59983a("group_id", comment.getAwemeId()).mo59983a("user_id", C31575b.m65865g().getCurUserId()).mo59980a("resend_same_cmt", this.f85795g).f79943a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final boolean mo63537a(final Exception exc, final int i, final Comment comment) {
            CommentRethinkPopup commentRethinkPopup = null;
            if (exc instanceof C34485a) {
                C34485a aVar = (C34485a) exc;
                if (aVar.getErrorCode() == 3017002) {
                    Object rawResponse = aVar.getRawResponse();
                    if (rawResponse instanceof CommentResponse) {
                        commentRethinkPopup = rawResponse;
                    }
                    CommentResponse commentResponse = (CommentResponse) commentRethinkPopup;
                    if (commentResponse == null || (commentRethinkPopup = commentResponse.commentRethinkPopup) == null) {
                        commentRethinkPopup = new CommentRethinkPopup(null, null, null, null, 15, null);
                    }
                }
            }
            if (commentRethinkPopup == null || comment == null) {
                return false;
            }
            this.f85792d = comment;
            Comment comment2 = this.f85794f;
            if (comment2 == null || !TextUtils.equals(comment2.getText(), comment.getText())) {
                this.f85795g = 0;
            } else {
                this.f85795g = 1;
            }
            this.f85794f = comment;
            if (!(C36274b.this.f85731b instanceof C37157k)) {
                mo63535a(comment, true);
                return true;
            }
            Fragment a = C36274b.this.f85731b.getChildFragmentManager().mo3551a("input");
            Fragment a2 = C36274b.this.f85731b.getChildFragmentManager().mo3551a("comment_rethink");
            final C37157k kVar = (C37157k) C36274b.this.f85731b;
            if (kVar.mo63708a() && a == null && a2 == null) {
                C37057br a3 = C37057br.C37062c.m74750a(commentRethinkPopup);
                this.f85791c = a3;
                a3.f87312a = new C37057br.AbstractC37063d() {
                    /* class com.p2082ss.android.ugc.aweme.comment.C36274b.C36291a.C362921 */

                    /* renamed from: f */
                    private boolean f85801f;

                    static {
                        Covode.recordClassIndex(43567);
                    }

                    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.C37057br.AbstractC37063d
                    /* renamed from: c */
                    public final void mo63312c() {
                        this.f85801f = true;
                        C36291a.this.mo63536a("comment_rethink_cg_ck", comment, new C33744d());
                    }

                    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.C37057br.AbstractC37063d
                    /* renamed from: a */
                    public final void mo63310a() {
                        C36291a.this.mo63535a(comment, false);
                        C36291a.this.mo63536a("comment_rethink_post_ck", comment, new C33744d().mo59982a("if_click_cg", Boolean.valueOf(this.f85801f)));
                    }

                    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.C37057br.AbstractC37063d
                    /* renamed from: b */
                    public final void mo63311b() {
                        if (C36274b.this.f85732c != null) {
                            C36274b.this.f85732c.mo64427b(exc, i, comment);
                        }
                        Comment comment = C36291a.this.f85790b.get(comment.getFakeId());
                        if (comment != null) {
                            kVar.mo64705b(comment, "");
                        } else {
                            C36274b.this.f85730a.performClick();
                        }
                        C36274b.this.f85730a.setText(C36291a.this.f85789a.get(comment.getFakeId()));
                        C36291a.this.mo63533a();
                        C36291a.this.mo63536a("comment_rethink_edit_ck", comment, new C33744d().mo59982a("if_click_cg", Boolean.valueOf(this.f85801f)));
                    }
                };
                try {
                    this.f85791c.show(C36274b.this.f85731b.getChildFragmentManager(), "comment_rethink");
                    mo63536a("comment_rethink_sw", comment, new C33744d());
                    return true;
                } catch (IllegalStateException unused) {
                    mo63535a(comment, true);
                    return true;
                }
            } else {
                mo63535a(comment, true);
                return true;
            }
        }
    }

    /* renamed from: q */
    private static boolean m73922q() {
        try {
            return C34719f.C34720a.f82009a.mo61395c();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: v */
    private Aweme m73927v() {
        AbstractC36953b bVar = this.f85732c;
        if (bVar == null) {
            return null;
        }
        return bVar.mo64434m();
    }

    /* renamed from: d */
    public final void mo63502d() {
        DataCenter dataCenter = this.f85742m;
        if (dataCenter != null) {
            dataCenter.mo60191a("comment_dialog_state", (Object) 6);
        }
    }

    /* renamed from: f */
    public final boolean mo63507f() {
        if (this.f85732c.mo64434m() == null) {
            return false;
        }
        this.f85732c.mo64434m();
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37098b
    /* renamed from: i */
    public final int mo63510i() {
        AbstractC36293b bVar = this.f85739j;
        if (bVar != null) {
            return bVar.mo63538a();
        }
        return 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37099c
    /* renamed from: j */
    public final void mo63511j() {
        this.f85732c.mo64425a(this.f85754y);
        this.f85736g = false;
        this.f85754y = "";
    }

    /* renamed from: n */
    public final boolean mo63515n() {
        Fragment fragment = this.f85731b;
        if (fragment == null || !fragment.isAdded()) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    private boolean m73921p() {
        Aweme m = this.f85732c.mo64434m();
        if (m == null || m.getVideoControl() == null || m.getVideoControl().timerStatus != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: r */
    private String m73923r() {
        AbstractC36953b bVar = this.f85732c;
        if (bVar == null || bVar.mo64434m() == null) {
            return "";
        }
        return this.f85732c.mo64434m().getAid();
    }

    /* renamed from: s */
    private String m73924s() {
        AbstractC36953b bVar = this.f85732c;
        if (bVar == null || bVar.mo64434m() == null) {
            return "";
        }
        return this.f85732c.mo64434m().getAuthorUid();
    }

    /* renamed from: t */
    private boolean m73925t() {
        Aweme m = this.f85732c.mo64434m();
        if (m == null || !m.getAwemeControl().canForward()) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    private boolean m73926u() {
        Aweme m = this.f85732c.mo64434m();
        if (m == null || !m.getAwemeControl().canComment()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo63489b() {
        C39162r.m79460a("click_emoji_entrance", new C33744d().mo59983a("enter_from", this.f85738i).f79943a);
    }

    /* renamed from: g */
    public final void mo63508g() {
        DialogInterface$OnCancelListenerC0944d dVar;
        if (mo63515n() && (dVar = (DialogInterface$OnCancelListenerC0944d) this.f85731b.getChildFragmentManager().mo3551a("input")) != null) {
            try {
                dVar.dismiss();
            } catch (IllegalStateException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final int mo63516o() {
        boolean z;
        if (this.f85732c.mo64438p() == 4) {
            z = true;
        } else {
            z = false;
        }
        return m73919d(z);
    }

    /* renamed from: k */
    public final void mo63512k() {
        MentionEditText mentionEditText = this.f85730a;
        if (mentionEditText != null) {
            mentionEditText.setText("");
            this.f85730a.setHint(this.f85751v);
            mo63470a(this.f85730a);
            GiftViewModel giftViewModel = this.f85748s;
            if (giftViewModel != null) {
                giftViewModel.mo63841b().setValue(null);
            }
        }
        this.f85733d.clear();
    }

    /* renamed from: e */
    public final boolean mo63505e() {
        if (C37699a.m76256ab(this.f85732c.mo64434m())) {
            new C79459a(C17867d.m33078a()).mo123050a(R.string.np).mo123053a();
            return true;
        }
        Aweme m = this.f85732c.mo64434m();
        if (m != null && m.isScheduleVideo()) {
            return true;
        }
        if (m73921p()) {
            Fragment fragment = this.f85731b;
            if (fragment == null || fragment.getContext() == null) {
                C17867d.m33078a();
            }
            return true;
        } else if (!this.f85732c.mo64439q() || CommentServiceImpl.m73664e().mo63307c(this.f85732c.mo64434m()) || !CommentServiceImpl.m73664e().mo63304b(this.f85732c.mo64434m()) || C80636z.m139819d(this.f85732c.mo64434m()) || C80580in.m139687c()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo63466a() {
        if (mo63515n()) {
            AbstractC36953b bVar = this.f85732c;
            if (bVar != null) {
                String str = null;
                if (bVar.mo64434m() != null && this.f85732c.getClass().equals(C37157k.class)) {
                    this.f85732c.mo64434m().getAid();
                    String h = SettingServiceImpl.m120782v().mo108872h();
                    if ("in".equals(h)) {
                        h = "id";
                    }
                    ICommerceEggService c = CommerceEggServiceImpl.m76488c();
                    if (c != null) {
                        str = c.mo65834a(h);
                    }
                }
                if (this.f85732c.mo64434m() != null && this.f85732c.mo64434m().isScheduleVideo()) {
                    this.f85751v = this.f85731b.getResources().getString(R.string.feh);
                } else if (CommentServiceImpl.m73664e().mo63307c(this.f85732c.mo64434m())) {
                    this.f85751v = this.f85731b.getResources().getString(R.string.am_);
                } else if (!CommentServiceImpl.m73664e().mo63304b(this.f85732c.mo64434m())) {
                    this.f85751v = this.f85731b.getResources().getString(R.string.akh);
                } else if (str != null) {
                    this.f85751v = str;
                } else {
                    int p = this.f85732c.mo64438p();
                    if (p == 2) {
                        this.f85751v = this.f85731b.getResources().getString(R.string.aj9);
                    } else if (p == 4) {
                        this.f85751v = this.f85731b.getResources().getString(R.string.c00);
                    } else if (p != 7) {
                        this.f85751v = this.f85731b.getResources().getString(R.string.aj9);
                    } else {
                        this.f85751v = this.f85731b.getResources().getString(R.string.ow);
                    }
                }
            } else {
                this.f85751v = this.f85731b.getResources().getString(R.string.aj9);
            }
            MentionEditText mentionEditText = this.f85730a;
            if (mentionEditText != null) {
                mentionEditText.setHint(this.f85751v);
            }
        }
    }

    /* renamed from: a */
    public final void mo63467a(int i) {
        this.f85717A = i;
        MentionEditText mentionEditText = this.f85730a;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37098b
    /* renamed from: b */
    public final void mo63493b(User user) {
        this.f85733d.add(user);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37098b
    /* renamed from: b */
    public final void mo63494b(CharSequence charSequence) {
        MentionEditText mentionEditText = this.f85730a;
        if (mentionEditText != null) {
            mentionEditText.setHint(charSequence);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37098b
    /* renamed from: c */
    public final void mo63501c(boolean z) {
        this.f85732c.mo64432f(z);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2496j.AbstractC36522q
    /* renamed from: d */
    public final void mo63503d(Comment comment) {
        AbstractC36953b bVar = this.f85732c;
        if (bVar != null) {
            bVar.mo64433g(comment);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37097a
    /* renamed from: e */
    public final void mo63504e(String str) {
        C39162r.m79460a("show_emoji_board", new C33744d().mo59983a("enter_from", this.f85738i).mo59983a("tab_name", str).f79943a);
    }

    /* renamed from: b */
    public final void mo63490b(EditText editText) {
        if (editText != null && !this.f85745p.contains(editText)) {
            MentionEditText mentionEditText = this.f85730a;
            if (mentionEditText != null) {
                editText.setText(mentionEditText.getText());
            }
            this.f85745p.add(editText);
        }
    }

    /* renamed from: a */
    public static void m73915a(Comment comment) {
        try {
            C80228av.m139063a("copy_label", C17867d.m33078a().getResources().getString(R.string.au4, C80580in.m139676a(comment.getUser())) + comment.getText(), C17867d.m33078a(), PrivacyCert.Builder.with("bpea-221").usage("Long press the comment content to provide copy function. ").tag("longPressToCopyComment").policies(PrivacyPolicyStore.getClipboardPrivacyPolicy()).build());
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public static String m73920d(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(str.getBytes("UTF8"));
            byte[] digest = instance.digest();
            String str2 = "";
            for (int i = 0; i < digest.length; i++) {
                str2 = str2 + Integer.toHexString((digest[i] & 255) | -256).substring(6);
            }
            return str2;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2496j.AbstractC36522q
    /* renamed from: b */
    public final void mo63491b(Comment comment) {
        mo63492b((C46534a) null);
        if (!this.f85750u) {
            this.f85730a.setText("");
        }
        if (comment == null || !comment.isStoryEmojiComment()) {
            mo63508g();
        }
        C36291a aVar = this.f85735f;
        if (aVar != null) {
            MentionEditText mentionEditText = this.f85730a;
            Comment n = this.f85732c.mo64435n();
            if (comment != null && !TextUtils.isEmpty(mentionEditText.getText())) {
                aVar.f85789a.put(comment.getFakeId(), mentionEditText.getText());
                if (n != null) {
                    aVar.f85790b.put(comment.getFakeId(), n);
                }
            }
        }
        AbstractC36953b bVar = this.f85732c;
        if (bVar != null) {
            bVar.mo64431f(comment);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37098b
    /* renamed from: c */
    public final void mo63500c(String str) {
        if (this.f85732c.mo64434m() != null) {
            Aweme m = this.f85732c.mo64434m();
            String str2 = this.f85738i;
            C33744d a = new C33744d().mo59983a("enter_method", str).mo59983a("group_id", m.getAid()).mo59983a("author_id", m.getAuthorUid());
            if (C59208ac.m108762a(str2)) {
                a.mo59983a("log_pb", C48027ac.C48028a.f111257a.mo80055a(m.getRequestId()));
                C39162r.m79463b("search_comment_at", C59208ac.m108761a(a.f79943a));
                return;
            }
            C39162r.m79460a("search_comment_at", a.f79943a);
        }
    }

    /* renamed from: f */
    public final void mo63506f(String str) {
        GiftViewModel giftViewModel = this.f85748s;
        if (giftViewModel != null && giftViewModel.mo63841b().getValue() != null) {
            C39162r.m79460a("video_gift_send_click", new C33744d().mo59983a("enter_method", str).mo59983a("author_id", m73924s()).mo59983a("group_id", m73923r()).mo59983a("enter_from", this.f85738i).mo59982a("current_balance", this.f85748s.mo63843d().getValue()).f79943a);
        }
    }

    /* renamed from: b */
    public final void mo63492b(C46534a aVar) {
        if (this.f85740k != aVar) {
            this.f85740k = aVar;
            Iterator<Object> it = this.f85728L.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2496j.AbstractC36522q
    /* renamed from: c */
    public final void mo63499c(Comment comment) {
        if (this.f85732c != null) {
            if (comment != null) {
                C36547a a = C36547a.m74402a();
                Comment b = a.mo64264b(comment.getCid());
                if (b != null) {
                    comment.setText(C37194f.m75167c(b));
                    comment.setTextExtra(b.getTextExtra());
                }
                List<Comment> replyComments = comment.getReplyComments();
                if (!C13603b.m24435a((Collection) replyComments)) {
                    for (Comment comment2 : replyComments) {
                        Comment b2 = a.mo64264b(comment2.getCid());
                        if (b2 != null) {
                            comment2.setText(C37194f.m75167c(b2));
                            comment2.setTextExtra(b2.getTextExtra());
                        }
                    }
                }
            }
            this.f85732c.mo64429e(comment);
            C42066d.f98067b.mo71244a(this.f85732c.mo64434m(), 2);
        }
        if (comment != null) {
            AbstractC81915c.m141874a(new C36392g(comment.getLabelInfo(), comment.getAwemeId()));
        }
        MainServiceImpl.createIMainServicebyMonsterPlugin(false).tryShowIllegalUsernameDialog(UGCMonitor.EVENT_COMMENT, new RunnableC36523k(this), new RunnableC36531l(this));
        if (this.f85731b.getActivity() != null) {
            C63419ae.f143971a.showRemindUserCompleteProfileDialog(this.f85731b.getActivity(), this.f85738i, UGCMonitor.EVENT_COMMENT, new DialogInterface$OnDismissListenerC36412e(this));
        }
        C36291a aVar = this.f85735f;
        if (aVar != null) {
            aVar.mo63534a(comment);
        }
        SpecActServiceImpl.m131497i().mo118029b("post_comment");
    }

    /* renamed from: a */
    public final Bundle mo63464a(CharSequence charSequence) {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("hint", charSequence);
        bundle.putInt("maxLength", mo63516o());
        bundle.putBoolean("showAt", true);
        return bundle;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37098b
    /* renamed from: b */
    public final void mo63495b(String str) {
        AbstractC36953b bVar = this.f85732c;
        if (bVar != null) {
            bVar.mo64428b(str);
        }
    }

    /* renamed from: b */
    public final void mo63497b(boolean z) {
        this.f85743n = z;
        if (z) {
            this.f85722F.setVisibility(0);
            this.f85730a.setVisibility(8);
            View view = this.f85720D;
            if (view != null) {
                view.setVisibility(8);
            }
            View view2 = this.f85721E;
            if (view2 != null) {
                view2.setVisibility(8);
            }
            C39162r.m79460a("tns_ags_float_comment_ban", new C33744d().f79943a);
            return;
        }
        this.f85722F.setVisibility(8);
        this.f85730a.setVisibility(0);
        View view3 = this.f85720D;
        if (view3 != null) {
            view3.setVisibility(0);
        }
        View view4 = this.f85721E;
        if (view4 != null) {
            view4.setVisibility(0);
        }
    }

    /* renamed from: a */
    public static void m73917a(MentionEditText mentionEditText, int i) {
        if (mentionEditText != null && !C13603b.m24435a((Collection) mentionEditText.getTextExtraStructList())) {
            mentionEditText.setMentionTextColor(mentionEditText.getResources().getColor(i));
            mentionEditText.mo125101a();
        }
    }

    public C36274b(Fragment fragment, int i, AbstractC36953b bVar) {
        if (fragment != null) {
            this.f85731b = fragment;
            this.f85732c = bVar;
            C36517n nVar = new C36517n();
            this.f85734e = nVar;
            nVar.mo67839a_(this);
            this.f85755z = i;
            this.f85751v = this.f85731b.getResources().getString(R.string.aj9);
            this.f85724H = new C36164a();
            if (this.f85731b instanceof C37157k) {
                this.f85735f = new C36291a(this, (byte) 0);
            }
            this.f85748s = (GiftViewModel) C1181ae.m3881a(fragment.getActivity(), (C1175ad.AbstractC1177b) null).mo3983a(GiftViewModel.class);
            if (m73927v() != null) {
                this.f85748s.f86233h = m73927v();
                return;
            }
            return;
        }
        throw new RuntimeException("Empty fragment/service!");
    }

    /* renamed from: a */
    private static void m73916a(Comment comment, String str, String str2) {
        String cid;
        String str3;
        String str4;
        if (comment.getCommentType() == 2) {
            cid = comment.getReplyId();
        } else {
            cid = comment.getCid();
        }
        if (!TextUtils.isEmpty(comment.getReplyToReplyCommentId()) && !TextUtils.equals(comment.getReplyToReplyCommentId(), "0")) {
            str3 = "reply_to_reply";
        } else if (TextUtils.isEmpty(comment.getReplyId()) || TextUtils.equals(comment.getReplyId(), "0")) {
            str3 = "original";
        } else {
            str3 = "reply";
        }
        if (comment.getAliasAweme() != null) {
            str4 = comment.getAliasAweme().getAuthorUid();
        } else {
            str4 = "";
        }
        C36539b.m74374a(str2, comment.getAwemeId(), comment.getCid(), comment.getUser().getUid(), cid, -1, -1, str3, str, null, !TextUtils.equals(str4, C31575b.m65865g().getCurUserId()) ? 1 : 0);
    }

    /* renamed from: a */
    public final C23208a.C23213d mo63465a(final AbstractC36429b bVar, String str, Comment comment) {
        if (comment == null) {
            return null;
        }
        if (TextUtils.equals(str, this.f85731b.getString(R.string.fa_))) {
            return (C23208a.C23213d) ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str)).mo37801c(R.raw.icon_flag).mo37786a(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.comment.C36274b.View$OnClickListenerC3627711 */

                static {
                    Covode.recordClassIndex(43552);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C36274b.this.mo63498c();
                    bVar.mo63756c();
                }
            });
        }
        if (TextUtils.equals(str, this.f85731b.getString(R.string.c_p))) {
            return (C23208a.C23213d) ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str)).mo37801c(R.raw.icon_arrow_turn_up_right).mo37786a(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.comment.C36274b.View$OnClickListenerC3627812 */

                static {
                    Covode.recordClassIndex(43553);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C36274b.this.mo63498c();
                    bVar.mo63753a();
                }
            });
        }
        if (TextUtils.equals(str, this.f85731b.getString(R.string.b4w))) {
            return (C23208a.C23213d) ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str)).mo37801c(R.raw.icon_trash_bin).mo37789b(1).mo37786a(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.comment.C36274b.View$OnClickListenerC3627913 */

                static {
                    Covode.recordClassIndex(43554);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C36274b.this.mo63498c();
                    bVar.mo63755b();
                }
            });
        }
        if (TextUtils.equals(str, this.f85731b.getString(R.string.au1))) {
            return (C23208a.C23213d) ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str)).mo37801c(R.raw.icon_doc_on_doc).mo37786a(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.comment.C36274b.View$OnClickListenerC3628014 */

                static {
                    Covode.recordClassIndex(43555);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C36274b.this.mo63498c();
                    bVar.mo63757d();
                }
            });
        }
        if (TextUtils.equals(str, this.f85731b.getString(R.string.am8))) {
            return (C23208a.C23213d) ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str)).mo37801c(R.raw.icon_globe).mo37786a(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.comment.C36274b.View$OnClickListenerC3628115 */

                static {
                    Covode.recordClassIndex(43556);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C36274b.this.mo63498c();
                    bVar.mo63759f();
                }
            });
        }
        if (TextUtils.equals(str, this.f85731b.getString(R.string.alq))) {
            return (C23208a.C23213d) ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str)).mo37801c(R.raw.icon_globe).mo37786a(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.comment.C36274b.View$OnClickListenerC3628216 */

                static {
                    Covode.recordClassIndex(43557);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C36274b.this.mo63498c();
                    bVar.mo63760g();
                }
            });
        }
        if (TextUtils.equals(str, this.f85731b.getString(R.string.akz))) {
            return (C23208a.C23213d) ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str)).mo37801c(R.raw.icon_pin).mo37786a(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.comment.C36274b.View$OnClickListenerC362832 */

                static {
                    Covode.recordClassIndex(43558);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C36274b.this.mo63498c();
                    bVar.mo63761h();
                }
            });
        }
        if (TextUtils.equals(str, this.f85731b.getString(R.string.ame))) {
            return (C23208a.C23213d) ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str)).mo37801c(R.raw.icon_pin_fill).mo37786a(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.comment.C36274b.View$OnClickListenerC362843 */

                static {
                    Covode.recordClassIndex(43559);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C36274b.this.mo63498c();
                    bVar.mo63762i();
                }
            });
        }
        if (TextUtils.equals(str, this.f85731b.getString(R.string.alp))) {
            return (C23208a.C23213d) ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str)).mo37801c(R.raw.icon_video).mo37786a(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.comment.C36274b.View$OnClickListenerC362854 */

                static {
                    Covode.recordClassIndex(43560);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C36274b.this.mo63498c();
                    bVar.mo63754a(CommentVideoModel.Type.COMMENT);
                }
            });
        }
        if (TextUtils.equals(str, this.f85731b.getString(R.string.ajr))) {
            return (C23208a.C23213d) ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str)).mo37801c(R.raw.icon_pen_on_paper).mo37786a(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.comment.C36274b.View$OnClickListenerC362865 */

                static {
                    Covode.recordClassIndex(43561);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C36274b.this.mo63498c();
                    bVar.mo63763j();
                }
            });
        }
        if (TextUtils.equals(str, this.f85731b.getString(R.string.brs)) || TextUtils.equals(str, this.f85731b.getString(R.string.brt))) {
            return (C23208a.C23213d) ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str)).mo37801c(R.raw.icon_bookmark).mo37786a(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.comment.C36274b.View$OnClickListenerC362876 */

                static {
                    Covode.recordClassIndex(43562);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C36274b.this.mo63498c();
                    bVar.mo63764k();
                }
            });
        }
        if (TextUtils.equals(str, this.f85731b.getString(R.string.brv))) {
            return (C23208a.C23213d) ((C23208a.C23213d) new C23208a.C23213d().mo37788a(str)).mo37801c(R.raw.icon_bookmark_fill).mo37786a(new View.OnClickListener() {
                /* class com.p2082ss.android.ugc.aweme.comment.C36274b.View$OnClickListenerC362887 */

                static {
                    Covode.recordClassIndex(43563);
                }

                public final void onClick(View view) {
                    ClickAgent.onClick(view);
                    C36274b.this.mo63498c();
                    bVar.mo63765l();
                }
            });
        }
        return null;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2503ui.DialogInterface$OnShowListenerC37084bz.AbstractC37097a
    /* renamed from: b */
    public final void mo63496b(String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean) {
        if (TextUtils.equals(str, "recommend") || TextUtils.equals(str, "search")) {
            m73918a(true, str, charSequence, str2, i, logPbBean);
        }
    }

    /* renamed from: a */
    private void m73918a(boolean z, String str, CharSequence charSequence, String str2, int i, LogPbBean logPbBean) {
        String str3;
        String str4;
        String str5 = "";
        if (charSequence != null) {
            str3 = charSequence.toString();
        } else {
            str3 = str5;
        }
        Aweme m = this.f85732c.mo64434m();
        if (m != null) {
            str4 = m.getAuthorUid();
            str5 = m.getAid();
        } else {
            str4 = str5;
        }
        if (z) {
            C36540c.m74392b(str, str5, str4, str3, str2, i, logPbBean);
        } else {
            C36540c.m74388a(str, str5, str4, str3, str2, i, logPbBean);
        }
    }

    /* renamed from: a */
    public final void mo63476a(MentionEditText mentionEditText, View view, View view2, View view3, TextView textView, String str, String str2) {
        mo63477a(mentionEditText, view, view2, view3, textView, str, str2, false);
    }
}
