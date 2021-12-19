package com.p2082ss.android.ugc.aweme.comment.p2496j;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17873f;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.p2082ss.android.ugc.aweme.comment.p2490d.C36404c;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36422h;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36423i;
import com.p2082ss.android.ugc.aweme.comment.util.C37221v;
import com.p2082ss.android.ugc.aweme.common.AbstractC39085b;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39100a;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.common.p2633e.C39101b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.comment.j.p */
public final class C36520p extends C39101b<C36518o> implements AbstractC39102c<Comment> {

    /* renamed from: g */
    public static Map<String, C36521a> f86466g;

    /* renamed from: a */
    public AbstractC36423i f86467a;

    /* renamed from: b */
    public AbstractC36422h f86468b;

    /* renamed from: c */
    public CommentReplyButtonStruct f86469c;

    /* renamed from: d */
    public C37221v f86470d;

    /* renamed from: e */
    public String f86471e;

    /* renamed from: f */
    public String f86472f;

    /* renamed from: l */
    private String f86473l;

    static {
        Covode.recordClassIndex(43823);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List, boolean] */
    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<Comment> list, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        AbstractC36422h hVar = this.f86468b;
        if (hVar != null) {
            hVar.mo63387a(3);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.C39088c, com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c, com.p2082ss.android.ugc.aweme.common.p2633e.C39101b
    /* renamed from: b */
    public final void mo57527b() {
        AbstractC36422h hVar = this.f86468b;
        if (hVar != null) {
            hVar.mo63387a(3);
        }
    }

    /* renamed from: d */
    public final String mo63992d() {
        CommentReplyButtonStruct commentReplyButtonStruct = this.f86469c;
        if (commentReplyButtonStruct != null) {
            return commentReplyButtonStruct.getCid();
        }
        return "";
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.j.p$a */
    public static class C36521a {

        /* renamed from: a */
        public int f86474a = -1;

        /* renamed from: b */
        public int f86475b = 3;

        /* renamed from: c */
        public int f86476c = 0;

        /* renamed from: d */
        public boolean f86477d = false;

        /* renamed from: e */
        public boolean f86478e = true;

        /* renamed from: f */
        public int f86479f = 0;

        /* renamed from: g */
        public boolean f86480g = true;

        /* renamed from: h */
        public int f86481h;

        static {
            Covode.recordClassIndex(43824);
        }

        C36521a() {
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        if (!(this.f86469c == null || this.f92286h.mData == null)) {
            this.f86469c.setCursor(this.f92286h.mData.cursor);
            this.f86469c.setHasMore(((AbstractC39100a) this.f92286h).isHasMore());
        }
        if (this.f86468b == null) {
            return;
        }
        if (((AbstractC39100a) this.f92286h).isHasMore()) {
            this.f86468b.mo63387a(1);
        } else {
            this.f86468b.mo63387a(2);
        }
    }

    /* renamed from: a */
    public final void mo63990a(C37221v vVar) {
        this.f86470d = vVar;
        ((C36510i) this.f92286h).f86445e = vVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        C33615a.m68848a((Context) C17873f.m33102j(), (Throwable) exc, (int) R.string.g1i);
        AbstractC36422h hVar = this.f86468b;
        if (hVar != null) {
            hVar.mo63387a(0);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        C33615a.m68848a((Context) C17873f.m33102j(), (Throwable) exc, (int) R.string.g1i);
        AbstractC36422h hVar = this.f86468b;
        if (hVar != null) {
            hVar.mo63387a(1);
        }
    }

    /* renamed from: a */
    public static C36521a m74324a(String str) {
        if (f86466g == null) {
            f86466g = new HashMap();
        }
        C36521a aVar = f86466g.get(str);
        if (aVar != null || f86466g.containsKey(str)) {
            return aVar;
        }
        return new C36521a();
    }

    /* renamed from: b */
    public final boolean mo63991b(int i) {
        List<Comment> list;
        C37221v vVar = this.f86470d;
        if (vVar != null) {
            list = vVar.mo64774b(this.f86469c.getCid());
        } else {
            list = null;
        }
        if (list == null || this.f86469c.getExpandSize() >= list.size()) {
            return true;
        }
        int min = Math.min(this.f86469c.getExpandSize() + i, list.size());
        AbstractC36423i iVar = this.f86467a;
        if (iVar != null) {
            iVar.mo63733a(mo63992d(), list.subList(this.f86469c.getExpandSize(), min));
        }
        this.f86469c.setExpandSize(min);
        if (this.f86468b == null) {
            return false;
        }
        if (((long) this.f86469c.getExpandSize()) >= this.f86469c.getReplyCommentTotal()) {
            this.f86468b.mo63387a(2);
            return false;
        }
        this.f86468b.mo63387a(1);
        return false;
    }

    /* renamed from: a */
    private void m74328a(List<Comment> list) {
        List<Comment> b;
        C37221v vVar = this.f86470d;
        if (vVar != null && (b = vVar.mo64774b(this.f86469c.getCid())) != null) {
            Iterator<Comment> it = list.iterator();
            while (it.hasNext()) {
                Comment next = it.next();
                if (next != null && b.contains(next)) {
                    it.remove();
                }
            }
        }
    }

    public C36520p(String str, String str2) {
        mo67838a((AbstractC39085b) new C36518o());
        mo67839a_(this);
        this.f86472f = str2;
        this.f86473l = str;
        f86466g = new HashMap();
    }

    /* renamed from: a */
    public static void m74325a(String str, int i) {
        if (str != null) {
            C36521a a = m74324a(str);
            if (!a.f86477d) {
                a.f86476c += i;
            }
            f86466g.put(str, a);
        }
    }

    /* renamed from: a */
    public static void m74326a(String str, C36521a aVar) {
        if (str != null && aVar != null) {
            if (C36404c.m74102a() || C36404c.m74103b()) {
                aVar.f86475b = 3;
            } else if (C36404c.m74106e()) {
                aVar.f86475b = 10;
            } else if (!C36404c.m74104c() && !C36404c.m74105d()) {
                aVar.f86475b = 3;
            } else if (aVar.f86478e) {
                int i = 12;
                if (aVar.f86475b < 12) {
                    i = aVar.f86475b + 3;
                }
                aVar.f86475b = i;
            }
            aVar.f86478e = true;
            f86466g.put(str, aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<Comment> list, boolean z) {
        boolean isHasMore = ((AbstractC39100a) this.f92286h).isHasMore();
        if (this.f86469c != null) {
            m74328a(list);
            this.f86469c.setReplyCommentTotal(((C36510i) this.f92286h).mo63982b());
            this.f86469c.setCursor(this.f92286h.mData.cursor);
            this.f86469c.addExpandSize(list.size());
            if (!isHasMore || ((C36510i) this.f92286h).mo63982b() <= ((long) this.f86469c.getExpandSize())) {
                isHasMore = false;
            } else {
                isHasMore = true;
            }
            this.f86469c.setHasMore(isHasMore);
        }
        AbstractC36423i iVar = this.f86467a;
        if (iVar != null) {
            iVar.mo63733a(mo63992d(), list);
        }
        AbstractC36422h hVar = this.f86468b;
        if (hVar == null) {
            return;
        }
        if (isHasMore) {
            hVar.mo63387a(1);
        } else {
            hVar.mo63387a(2);
        }
    }

    /* renamed from: a */
    public static void m74327a(String str, boolean z) {
        int i;
        C36521a a = m74324a(str);
        if (z) {
            i = 0;
        } else {
            i = a.f86481h + 1;
        }
        a.f86481h = i;
        f86466g.put(str, a);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<Comment> list, boolean z) {
        boolean isHasMore = ((AbstractC39100a) this.f92286h).isHasMore();
        if (this.f86469c != null) {
            m74328a(list);
            this.f86469c.setReplyCommentTotal(((C36510i) this.f92286h).mo63982b());
            this.f86469c.setCursor(this.f92286h.mData.cursor);
            this.f86469c.addExpandSize(list.size());
            if (!isHasMore || ((C36510i) this.f92286h).mo63982b() <= ((long) this.f86469c.getExpandSize())) {
                isHasMore = false;
            } else {
                isHasMore = true;
            }
            this.f86469c.setHasMore(isHasMore);
        }
        AbstractC36423i iVar = this.f86467a;
        if (iVar != null) {
            iVar.mo63733a(mo63992d(), list);
        }
        AbstractC36422h hVar = this.f86468b;
        if (hVar == null) {
            return;
        }
        if (isHasMore) {
            hVar.mo63387a(1);
        } else {
            hVar.mo63387a(2);
        }
    }

    /* renamed from: a */
    public final void mo63989a(int i, CommentReplyButtonStruct commentReplyButtonStruct, long j, String str, int i2) {
        mo57616a(Integer.valueOf(i), commentReplyButtonStruct.getCommentId(), commentReplyButtonStruct.getTopIds(), Long.valueOf(j), this.f86473l, str, Integer.valueOf(i2));
    }
}
