package com.p2082ss.android.ugc.aweme.comment.p2500n;

import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.google.gson.C27910f;
import com.google.p1998c.p2006h.p2007a.AbstractC27645k;
import com.google.p1998c.p2006h.p2007a.C27646l;
import com.p2082ss.android.ugc.aweme.base.ExecutorC34605m;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36399m;
import com.p2082ss.android.ugc.aweme.comment.util.C37194f;
import com.p2082ss.android.ugc.aweme.comment.util.C37215r;
import com.p2082ss.android.ugc.aweme.model.TextExtraStruct;
import com.p2082ss.android.ugc.aweme.translation.api.TranslationApi;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79027a;
import com.p2082ss.android.ugc.aweme.translation.p4142a.C79030c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.comment.n.c */
public final class RunnableC36550c implements Runnable {

    /* renamed from: a */
    public Comment f86542a;

    /* renamed from: b */
    private C36548b f86543b;

    static {
        Covode.recordClassIndex(43879);
    }

    public final void run() {
        try {
            C27646l.m55298a(TranslationApi.m137860a(this.f86543b.f86539b, new C27910f().mo46674b(this.f86543b.f86538a), 2), new AbstractC27645k<C79027a>() {
                /* class com.p2082ss.android.ugc.aweme.comment.p2500n.RunnableC36550c.C365511 */

                static {
                    Covode.recordClassIndex(43880);
                }

                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final void onFailure(Throwable th) {
                    RunnableC36550c.this.mo64268a(th);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.p1998c.p2006h.p2007a.AbstractC27645k
                public final /* synthetic */ void onSuccess(C79027a aVar) {
                    List<C79030c> list = aVar.f177634a;
                    if (!C13603b.m24435a((Collection) list)) {
                        RunnableC36550c.this.mo64267a(list.get(0), false);
                        if (list.size() > 1) {
                            RunnableC36550c.this.mo64267a(list.get(1), true);
                        }
                        RunnableC36550c.this.f86542a.setTranslated(true);
                        C36547a.m74402a().mo64263a(RunnableC36550c.this.f86542a, false);
                        C36547a a = C36547a.m74402a();
                        Comment comment = RunnableC36550c.this.f86542a;
                        if (comment != null) {
                            Comment clone = comment.clone();
                            a.f86534a.put(comment.getCid(), clone);
                            if (comment.getCommentType() == 0 && !C13603b.m24435a((Collection) clone.getReplyComments())) {
                                Comment comment2 = clone.getReplyComments().get(0);
                                a.f86534a.put(comment2.getCid(), comment2);
                            }
                        }
                        C36547a.m74402a().mo64259a(RunnableC36550c.this.f86542a.getCid()).setValue(new C36399m(RunnableC36550c.this.f86542a, true));
                    }
                }
            }, ExecutorC34605m.f81660a);
        } catch (Exception e) {
            e.printStackTrace();
            mo64268a(new Exception());
        }
    }

    /* renamed from: a */
    public final void mo64268a(Throwable th) {
        C36547a.m74402a().mo64263a(this.f86542a, false);
        C36399m mVar = new C36399m(this.f86542a, false);
        if (th instanceof Exception) {
            mVar.f86087c = (Exception) th;
        }
        C36547a.m74402a().mo64259a(this.f86542a.getCid()).setValue(mVar);
    }

    public RunnableC36550c(Comment comment, C36548b bVar) {
        this.f86542a = comment;
        this.f86543b = bVar;
    }

    /* renamed from: a */
    public final void mo64267a(C79030c cVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        String b = C37215r.m75208b(cVar.f177641a);
        sb.append(b + " ");
        Comment comment = this.f86542a;
        if (z) {
            List<Comment> replyComments = comment.getReplyComments();
            if (C13603b.m24435a((Collection) replyComments)) {
                mo64268a(new Exception());
            } else {
                comment = replyComments.get(0);
            }
        }
        if (comment.getTextExtra() != null) {
            for (int i = 0; i < comment.getTextExtra().size(); i++) {
                TextExtraStruct textExtraStruct = comment.getTextExtra().get(i);
                String str = C37194f.m75167c(comment).substring(Math.min(Math.max(textExtraStruct.getStart(), 0), C37194f.m75167c(comment).length()), Math.min(textExtraStruct.getEnd(), C37194f.m75167c(comment).length())) + " ";
                sb.append(str);
                TextExtraStruct clone = textExtraStruct.clone();
                int length = str.length();
                if (i == 0) {
                    clone.setStart(b.length());
                } else {
                    clone.setStart(((TextExtraStruct) arrayList.get(i - 1)).getEnd() + 1);
                }
                clone.setEnd(clone.getStart() + length);
                arrayList.add(clone);
            }
        }
        String sb2 = sb.toString();
        Comment comment2 = this.f86542a;
        if (z && !C13603b.m24435a((Collection) comment2.getReplyComments())) {
            comment2 = this.f86542a.getReplyComments().get(0);
        }
        comment2.setText(sb2);
        comment2.setTextExtra(arrayList);
    }
}
