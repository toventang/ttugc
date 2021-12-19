package com.p2082ss.android.ugc.aweme.comment.p2500n;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2085a.p2086a.p2087a.C29339a;
import com.p2082ss.android.ugc.aweme.arch.widgets.base.C33943c;
import com.p2082ss.android.ugc.aweme.base.livedata.C34603a;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36399m;
import com.p2082ss.android.ugc.aweme.comment.p2503ui.CommentTranslationStatusView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.comment.n.a */
public class C36547a {

    /* renamed from: b */
    private static C36547a f86533b;

    /* renamed from: a */
    HashMap<String, Comment> f86534a = new HashMap<>();

    /* renamed from: c */
    private Set<String> f86535c = new HashSet();

    /* renamed from: d */
    private HashMap<String, Comment> f86536d = new HashMap<>();

    /* renamed from: e */
    private Set<String> f86537e = new HashSet();

    static {
        Covode.recordClassIndex(43876);
    }

    private C36547a() {
    }

    /* renamed from: a */
    public static C36547a m74402a() {
        MethodCollector.m26663i(9241);
        if (f86533b == null) {
            synchronized (C36547a.class) {
                try {
                    if (f86533b == null) {
                        f86533b = new C36547a();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(9241);
                    throw th;
                }
            }
        }
        C36547a aVar = f86533b;
        MethodCollector.m26664o(9241);
        return aVar;
    }

    /* renamed from: a */
    public final C33943c<C36399m> mo64259a(String str) {
        this.f86537e.add(str);
        return C34603a.C34604a.f81659a.mo61063a(str);
    }

    /* renamed from: b */
    public final Comment mo64264b(String str) {
        return this.f86534a.get(str);
    }

    /* renamed from: b */
    public final boolean mo64265b(Comment comment) {
        return this.f86535c.contains(comment.getCid());
    }

    /* renamed from: a */
    public final void mo64260a(AbstractC1204m mVar) {
        for (String str : this.f86537e) {
            if (!TextUtils.isEmpty(str)) {
                if (mVar != null) {
                    mo64259a(str).removeObservers(mVar);
                }
                C34603a.C34604a.f81659a.f81658a.remove(str);
            }
        }
        this.f86537e.clear();
        this.f86534a.clear();
        this.f86536d.clear();
    }

    /* renamed from: a */
    public final void mo64261a(Comment comment) {
        m74403a(comment, this.f86536d.get(comment.getCid()), false);
        m74402a().mo64259a(comment.getCid()).setValue(new C36399m(comment, true));
    }

    /* renamed from: a */
    public final void mo64263a(Comment comment, boolean z) {
        if (z) {
            this.f86535c.add(comment.getCid());
        } else {
            this.f86535c.remove(comment.getCid());
        }
    }

    /* renamed from: a */
    private static void m74403a(Comment comment, Comment comment2, boolean z) {
        while (comment != null && comment2 != null) {
            comment.setTranslated(z);
            comment.setText(comment2.getText());
            comment.setTextExtra(comment2.getTextExtra());
            if (comment.getCommentType() == 0 && !C13603b.m24435a((Collection) comment.getReplyComments()) && !C13603b.m24435a((Collection) comment2.getReplyComments())) {
                comment = comment.getReplyComments().get(0);
                comment2 = comment2.getReplyComments().get(0);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo64262a(Comment comment, C36548b bVar, CommentTranslationStatusView commentTranslationStatusView) {
        Comment b = mo64264b(comment.getCid());
        if (b != null) {
            m74403a(comment, b, true);
            m74402a().mo64259a(comment.getCid()).setValue(new C36399m(comment, true));
            return;
        }
        mo64263a(comment, true);
        this.f86536d.put(comment.getCid(), comment.clone());
        commentTranslationStatusView.setLoadingText(R.string.am9);
        commentTranslationStatusView.setLoading(true);
        C29339a.m58752a(new RunnableC36550c(comment, bVar));
    }
}
