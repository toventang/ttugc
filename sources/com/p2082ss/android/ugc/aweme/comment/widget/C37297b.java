package com.p2082ss.android.ugc.aweme.comment.widget;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.base.utils.C34729o;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2484a.C36173a;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36399m;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36425k;
import com.p2082ss.android.ugc.aweme.comment.p2500n.C36547a;
import com.p2082ss.android.ugc.aweme.comment.p2500n.C36548b;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.AbstractC37083by;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.CommentTranslationStatusView;
import com.p2082ss.android.ugc.aweme.comment.util.C37194f;
import com.p2082ss.android.ugc.aweme.comment.util.C37215r;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.widget.b */
public final class C37297b implements AbstractC1214u<C36399m>, AbstractC36425k {

    /* renamed from: a */
    private Context f87965a;

    /* renamed from: b */
    private AbstractC37083by f87966b;

    /* renamed from: c */
    private AbstractC37083by f87967c;

    /* renamed from: d */
    private Comment f87968d;

    /* renamed from: e */
    private CommentTranslationStatusView f87969e;

    /* renamed from: f */
    private C36547a f87970f = C36547a.m74402a();

    /* renamed from: g */
    private boolean f87971g;

    static {
        Covode.recordClassIndex(44667);
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36425k
    /* renamed from: b */
    public final void mo63736b() {
        Comment comment = this.f87968d;
        if (comment != null) {
            this.f87970f.mo64261a(comment);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36425k
    /* renamed from: a */
    public final void mo63735a() {
        C36548b a;
        if (this.f87968d != null && (a = m75287a(this.f87968d, SettingServiceImpl.m120782v().mo108872h())) != null) {
            this.f87970f.mo64262a(this.f87968d, a, this.f87969e);
        }
    }

    public C37297b(Context context) {
        this.f87965a = context;
    }

    /* renamed from: a */
    private static String m75288a(Comment comment) {
        String a = C37194f.m75163a(comment, false);
        if (TextUtils.isEmpty(a)) {
            return "";
        }
        boolean[] zArr = new boolean[a.length()];
        if (comment.getTextExtra() != null) {
            for (TextExtraStruct textExtraStruct : comment.getTextExtra()) {
                for (int max = Math.max(0, textExtraStruct.getStart()); max < Math.min(a.length(), textExtraStruct.getEnd()); max++) {
                    zArr[max] = true;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            if (!zArr[i]) {
                sb.append(a.charAt(i));
            }
        }
        return C37215r.m75207a(sb.toString().trim());
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.AbstractC1214u
    public final /* synthetic */ void onChanged(C36399m mVar) {
        Activity a;
        CharSequence a2;
        C36399m mVar2 = mVar;
        if (mVar2 != null && mVar2.f86085a != null && (a = C34729o.m70950a(this.f87965a)) != null && !a.isFinishing()) {
            Comment comment = mVar2.f86085a;
            if (mVar2.f86086b) {
                this.f87969e.setLoading(false);
                boolean c = C36173a.m73726c();
                AbstractC37083by byVar = this.f87966b;
                Boolean valueOf = Boolean.valueOf(c);
                if (this.f87971g) {
                    a2 = new C17191a.C17192a().mo27178a(comment.getText(), new CommentTranslationBlock$2(this, C0643b.m2378c(this.f87965a, R.color.bx)), 18).mo27178a(" " + C37194f.m75162a(comment), new CommentTranslationBlock$1(this, C0643b.m2378c(this.f87965a, R.color.bz)), 18).f40973a;
                } else {
                    a2 = C37194f.m75163a(comment, !valueOf.booleanValue());
                }
                byVar.mo64584a(a2, C37194f.m75165a(comment, this.f87965a, c));
                List<Comment> replyComments = comment.getReplyComments();
                if (comment.getCommentType() == 0 && this.f87967c != null && !C13603b.m24435a((Collection) replyComments)) {
                    Comment comment2 = replyComments.get(0);
                    this.f87967c.mo64584a(C37194f.m75163a(comment2, true), C37194f.m75165a(comment2, this.f87965a, c));
                    return;
                }
                return;
            }
            Exception exc = mVar2.f86087c;
            this.f87969e.setLoading(false);
            if (exc != null) {
                C33615a.m68848a(this.f87965a, (Throwable) exc, (int) R.string.g1i);
            }
        }
    }

    /* renamed from: a */
    public static C36548b m75287a(Comment comment, String str) {
        C36548b bVar = new C36548b();
        String a = m75288a(comment);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        bVar.mo64266a(a);
        if (comment.getCommentType() == 0 && !C13603b.m24435a((Collection) comment.getReplyComments())) {
            bVar.mo64266a(m75288a(comment.getReplyComments().get(0)));
        }
        bVar.f86539b = str;
        return bVar;
    }

    /* renamed from: a */
    public final void mo64892a(Context context, Comment comment, AbstractC37083by byVar, AbstractC37083by byVar2, CommentTranslationStatusView commentTranslationStatusView) {
        if (comment == null || comment.isTranslated()) {
            if (commentTranslationStatusView != null) {
                commentTranslationStatusView.setVisibility(8);
            }
        } else if (commentTranslationStatusView != null) {
            Comment comment2 = this.f87968d;
            if (comment2 != null) {
                this.f87970f.mo64259a(comment2.getCid()).removeObserver(this);
            }
            this.f87965a = context;
            this.f87968d = comment;
            this.f87966b = byVar;
            this.f87967c = byVar2;
            this.f87969e = commentTranslationStatusView;
            AbstractC1204m a = byVar.mo64583a();
            if (a == null) {
                this.f87970f.mo64259a(this.f87968d.getCid()).mo60214a(this, false);
            } else {
                this.f87970f.mo64259a(this.f87968d.getCid()).mo60213a(a, this, false);
            }
            this.f87969e.setLoadingText(R.string.am9);
            this.f87969e.setLoading(this.f87970f.mo64265b(this.f87968d));
            this.f87970f.mo64265b(this.f87968d);
        }
    }
}
