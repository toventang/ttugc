package com.p2082ss.android.ugc.aweme.comment.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import androidx.lifecycle.C1213t;
import androidx.lifecycle.LiveData;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.comment.api.C36271d;
import com.p2082ss.android.ugc.aweme.comment.api.CommentPinAPI;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36393h;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36394i;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36395j;
import com.p2082ss.android.ugc.aweme.comment.p2489c.EnumC36396k;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36421g;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.CommentTranslationStatusView;
import com.p2082ss.android.ugc.aweme.comment.util.C37194f;
import com.p2082ss.android.ugc.aweme.p2385bd.C34791a;
import com.p2082ss.android.ugc.aweme.views.MentionTextView;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.AbstractC88406ae;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.widget.a */
public final class C37292a implements AbstractC36421g {

    /* renamed from: f */
    public static C37294b f87949f;

    /* renamed from: g */
    public static C37294b f87950g;

    /* renamed from: h */
    public static final C37293a f87951h = new C37293a((byte) 0);

    /* renamed from: a */
    public Context f87952a;

    /* renamed from: b */
    public CommentTranslationStatusView f87953b;

    /* renamed from: c */
    public MentionTextView f87954c;

    /* renamed from: d */
    public C37294b f87955d;

    /* renamed from: e */
    public Comment f87956e;

    static {
        Covode.recordClassIndex(44662);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.a$a */
    public static final class C37293a {
        static {
            Covode.recordClassIndex(44663);
        }

        private C37293a() {
        }

        public /* synthetic */ C37293a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36421g
    /* renamed from: a */
    public final Comment mo63727a() {
        Comment comment = this.f87956e;
        if (comment == null) {
            C89219l.m154710a(UGCMonitor.EVENT_COMMENT);
        }
        return comment;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36421g
    /* renamed from: d */
    public final void mo63732d() {
        CommentTranslationStatusView commentTranslationStatusView = this.f87953b;
        if (commentTranslationStatusView == null) {
            C89219l.m154710a("statusView");
        }
        commentTranslationStatusView.setLoading(false);
    }

    /* renamed from: e */
    public final MentionTextView mo64888e() {
        MentionTextView mentionTextView = this.f87954c;
        if (mentionTextView == null) {
            C89219l.m154710a("mentionTextView");
        }
        return mentionTextView;
    }

    /* renamed from: f */
    public final C37294b mo64889f() {
        C37294b bVar = this.f87955d;
        if (bVar == null) {
            C89219l.m154710a("singlePinStatus");
        }
        return bVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36421g
    /* renamed from: b */
    public final LiveData<C36393h> mo63729b() {
        C37294b bVar = this.f87955d;
        if (bVar == null) {
            C89219l.m154710a("singlePinStatus");
        }
        if (bVar.f87959c || mo63727a() == null || mo63727a().getAwemeId() == null || mo63727a().getCid() == null) {
            return null;
        }
        return m75277a(false, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36421g
    /* renamed from: c */
    public final void mo63731c() {
        MentionTextView mentionTextView = this.f87954c;
        if (mentionTextView == null) {
            C89219l.m154710a("mentionTextView");
        }
        ObjectAnimator duration = ObjectAnimator.ofFloat(mentionTextView, "alpha", 0.0f).setDuration(100L);
        C89219l.m154716b(duration, "");
        duration.setInterpolator(new C34791a());
        MentionTextView mentionTextView2 = this.f87954c;
        if (mentionTextView2 == null) {
            C89219l.m154710a("mentionTextView");
        }
        ObjectAnimator duration2 = ObjectAnimator.ofFloat(mentionTextView2, "alpha", 0.0f, 1.0f).setDuration(100L);
        C89219l.m154716b(duration2, "");
        duration2.setInterpolator(new C34791a());
        duration.addListener(new C37296d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(duration, duration2);
        animatorSet.start();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.a$b */
    public final class C37294b {

        /* renamed from: a */
        AbstractC88412b f87957a;

        /* renamed from: b */
        C1213t<C36393h> f87958b;

        /* renamed from: c */
        public boolean f87959c;

        static {
            Covode.recordClassIndex(44664);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C37294b() {
        }

        /* renamed from: a */
        public final void mo64890a(C36393h hVar) {
            C89219l.m154721d(hVar, "");
            AbstractC88412b bVar = this.f87957a;
            if (bVar != null) {
                bVar.dispose();
            }
            C1213t<C36393h> tVar = this.f87958b;
            if (tVar != null) {
                tVar.postValue(hVar);
            }
            this.f87959c = false;
            this.f87957a = null;
            this.f87958b = null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.a$d */
    public static final class C37296d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C37292a f87964a;

        static {
            Covode.recordClassIndex(44666);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37296d(C37292a aVar) {
            this.f87964a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f87964a.mo64888e().setText(C37194f.m75163a(this.f87964a.mo63727a(), true));
            MentionTextView e = this.f87964a.mo64888e();
            Comment a = this.f87964a.mo63727a();
            Context context = this.f87964a.f87952a;
            if (context == null) {
                C89219l.m154710a("context");
            }
            e.mo124999a(C37194f.m75165a(a, context, false), (MentionTextView.AbstractC81407d) null, (MentionTextView.AbstractC81407d) null);
            C17191a.C17192a aVar = new C17191a.C17192a();
            CharSequence text = this.f87964a.mo64888e().getText();
            C89219l.m154716b(text, "");
            aVar.mo27177a(text);
            this.f87964a.mo64888e().setText(aVar.f40973a);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36421g
    /* renamed from: a */
    public final void mo63728a(boolean z) {
        if (z) {
            CommentTranslationStatusView commentTranslationStatusView = this.f87953b;
            if (commentTranslationStatusView == null) {
                C89219l.m154710a("statusView");
            }
            commentTranslationStatusView.setLoadingText(R.string.al6);
        } else {
            CommentTranslationStatusView commentTranslationStatusView2 = this.f87953b;
            if (commentTranslationStatusView2 == null) {
                C89219l.m154710a("statusView");
            }
            commentTranslationStatusView2.setLoadingText(R.string.amg);
        }
        CommentTranslationStatusView commentTranslationStatusView3 = this.f87953b;
        if (commentTranslationStatusView3 == null) {
            C89219l.m154710a("statusView");
        }
        commentTranslationStatusView3.setLoading(true);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.a$c */
    public static final class C37295c implements AbstractC88406ae<C36395j> {

        /* renamed from: a */
        final /* synthetic */ C37292a f87961a;

        /* renamed from: b */
        final /* synthetic */ C1213t f87962b;

        /* renamed from: c */
        final /* synthetic */ boolean f87963c;

        static {
            Covode.recordClassIndex(44665);
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onError(Throwable th) {
            Throwable th2;
            C89219l.m154721d(th, "");
            th.getMessage();
            C36394i iVar = null;
            if (!(th instanceof C34485a)) {
                th2 = null;
            } else {
                th2 = th;
            }
            C34480a aVar = (C34480a) th2;
            if (aVar == null || aVar.getErrorCode() != 3008034) {
                this.f87961a.mo64889f().mo64890a(new C36393h(EnumC36396k.FAIL, null));
                return;
            }
            C37294b f = this.f87961a.mo64889f();
            EnumC36396k kVar = EnumC36396k.LIMIT;
            Object rawResponse = ((C34485a) th).getRawResponse();
            if (!(rawResponse instanceof C36395j)) {
                rawResponse = null;
            }
            C36395j jVar = (C36395j) rawResponse;
            if (jVar != null) {
                iVar = jVar.f86080a;
            }
            f.mo64890a(new C36393h(kVar, iVar));
        }

        @Override // p4560f.p4561a.AbstractC88406ae
        public final void onSubscribe(AbstractC88412b bVar) {
            C89219l.m154721d(bVar, "");
            C37294b f = this.f87961a.mo64889f();
            C1213t<C36393h> tVar = this.f87962b;
            f.f87957a = bVar;
            f.f87958b = tVar;
            f.f87959c = true;
            boolean z = this.f87963c;
            C37294b f2 = this.f87961a.mo64889f();
            C89219l.m154721d(f2, "");
            if (z) {
                if (!C89219l.m154714a(C37292a.f87949f, f2)) {
                    C37294b bVar2 = C37292a.f87949f;
                    if (bVar2 != null) {
                        bVar2.mo64890a(new C36393h(EnumC36396k.CANCEL, null));
                    }
                    C37292a.f87949f = f2;
                }
            } else if (!C89219l.m154714a(C37292a.f87950g, f2)) {
                C37294b bVar3 = C37292a.f87950g;
                if (bVar3 != null) {
                    bVar3.mo64890a(new C36393h(EnumC36396k.CANCEL, null));
                }
                C37292a.f87950g = f2;
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4560f.p4561a.AbstractC88406ae
        public final /* synthetic */ void onSuccess(C36395j jVar) {
            C36395j jVar2 = jVar;
            C89219l.m154721d(jVar2, "");
            if (jVar2.status_code == 0) {
                this.f87961a.mo64889f().mo64890a(new C36393h(EnumC36396k.SUCCESS, null));
            } else if (jVar2.status_code == 3008034) {
                this.f87961a.mo64889f().mo64890a(new C36393h(EnumC36396k.LIMIT, jVar2.f86080a));
            } else {
                onError(new Exception("response status_code != 0"));
            }
        }

        C37295c(C37292a aVar, C1213t tVar, boolean z) {
            this.f87961a = aVar;
            this.f87962b = tVar;
            this.f87963c = z;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36421g
    /* renamed from: b */
    public final LiveData<C36393h> mo63730b(boolean z) {
        C37294b bVar = this.f87955d;
        if (bVar == null) {
            C89219l.m154710a("singlePinStatus");
        }
        if (bVar.f87959c || mo63727a() == null || mo63727a().getAwemeId() == null || mo63727a().getCid() == null) {
            return null;
        }
        return m75277a(true, z);
    }

    /* renamed from: a */
    private final C1213t<C36393h> m75277a(boolean z, boolean z2) {
        int i;
        C1213t<C36393h> tVar = new C1213t<>();
        CommentPinAPI commentPinAPI = C36271d.f85713a;
        String awemeId = mo63727a().getAwemeId();
        C89219l.m154716b(awemeId, "");
        String cid = mo63727a().getCid();
        C89219l.m154716b(cid, "");
        long currentTimeMillis = System.currentTimeMillis();
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        commentPinAPI.pinComment(awemeId, cid, currentTimeMillis, i, z2).mo142918b(C88925a.m154180b(C88946a.f201991c)).mo142909a(C88391a.m153580a(C88392a.f200660a)).mo116431a_(new C37295c(this, tVar, z));
        return tVar;
    }
}
