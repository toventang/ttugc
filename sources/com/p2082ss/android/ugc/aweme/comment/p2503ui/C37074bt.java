package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.p2082ss.android.ugc.aweme.app.api.p2319b.C33615a;
import com.p2082ss.android.ugc.aweme.awemeservice.AwemeService;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.C34480a;
import com.p2082ss.android.ugc.aweme.base.api.p2365a.p2367b.C34485a;
import com.p2082ss.android.ugc.aweme.comment.C36535m;
import com.p2082ss.android.ugc.aweme.comment.adapter.C36205a;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36387c;
import com.p2082ss.android.ugc.aweme.comment.p2489c.C36397l;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36415a;
import com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36417c;
import com.p2082ss.android.ugc.aweme.comment.p2495i.C36499g;
import com.p2082ss.android.ugc.aweme.comment.p2496j.C36520p;
import com.p2082ss.android.ugc.aweme.comment.util.C37221v;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39060f;
import com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h;
import com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c;
import com.p2082ss.android.ugc.aweme.discover.p2767c.C41893a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80494gh;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81915c;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.bt */
public final class C37074bt implements AbstractC36415a, AbstractC36417c, AbstractC39063h.AbstractC39067a, AbstractC39102c<Comment> {

    /* renamed from: a */
    public String f87344a;

    /* renamed from: b */
    RecyclerView f87345b;

    /* renamed from: c */
    C37221v f87346c;

    /* renamed from: d */
    public Comment f87347d;

    /* renamed from: e */
    private DmtStatusView f87348e;

    /* renamed from: f */
    private Context f87349f;

    /* renamed from: g */
    private int f87350g;

    /* renamed from: h */
    private Aweme f87351h;

    static {
        Covode.recordClassIndex(44428);
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59511a(Exception exc) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void bl_() {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59523c(List<Comment> list, boolean z) {
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2629a.AbstractC39063h.AbstractC39067a
    /* renamed from: l */
    public final void mo62679l() {
    }

    /* renamed from: a */
    public final void mo64578a(List<Comment> list) {
        AbstractC39060f fVar = (AbstractC39060f) mo64572a();
        if (fVar != null) {
            int i = 0;
            fVar.mo67829d(false);
            fVar.mo62377b_(list);
            this.f87348e.mo27385g();
            RecyclerView recyclerView = this.f87345b;
            if (!m74762b(list) && !m74765c(list)) {
                i = 8;
            }
            recyclerView.setVisibility(i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: a */
    public final void mo59512a(List<Comment> list, boolean z) {
        C36205a aVar = (C36205a) mo64572a();
        if (aVar != null) {
            aVar.mo67829d(true);
            if (z) {
                aVar.aq_();
            } else if (!aVar.f85510f) {
                aVar.mo67829d(false);
            } else {
                aVar.ap_();
            }
            if (list != null) {
                Iterator<Comment> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Comment next = it.next();
                    if (next.getCommentType() == 1 && next.isAuthorPin()) {
                        this.f87347d = next;
                        break;
                    }
                }
                aVar.mo62377b_(list);
            }
            this.f87345b.setVisibility(0);
            this.f87348e.mo27382d();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36417c
    /* renamed from: a */
    public final void mo63702a(String str, String str2, Exception exc) {
        List<Comment> list;
        RecyclerView.AbstractC1350a a = mo64572a();
        if (a != null && (list = this.f87346c.f87756b) != null) {
            int i = R.string.b6t;
            int i2 = 0;
            while (true) {
                if (i2 >= list.size()) {
                    break;
                }
                Comment comment = list.get(i2);
                if (TextUtils.equals(str, comment.getCid())) {
                    if (comment.isUserDigged()) {
                        i = R.string.h11;
                    }
                    a.notifyItemChanged(i2);
                } else {
                    i2++;
                }
            }
            if ((exc instanceof C34485a) && ((C34480a) exc).getErrorCode() == 3002043) {
                if (str2 == "1") {
                    i = R.string.amb;
                } else if (str2 == "2") {
                    i = R.string.amc;
                }
            }
            C33615a.m68848a(this.f87349f, (Throwable) exc, i);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36417c
    /* renamed from: a */
    public final void mo63703a(Object... objArr) {
        C36205a aVar = (C36205a) mo64572a();
        if (aVar != null) {
            aVar.mo63359a((String) objArr[0]);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36415a
    /* renamed from: a */
    public final void mo63699a(String str, C36499g gVar) {
        Comment comment;
        C36205a aVar = (C36205a) mo64572a();
        if (aVar != null) {
            if (!(str == null || (comment = this.f87347d) == null || !str.equals(comment.getCid()))) {
                this.f87347d = null;
            }
            aVar.mo63360a(str, this.f87346c.mo64776d(str));
            boolean z = gVar != null && gVar.f86373a;
            if (aVar.mo60933c() == 0 || (z && aVar.mo60933c() == 1)) {
                aVar.mo67829d(false);
                if (z) {
                    aVar.mo63354a(0, 1);
                    aVar.notifyItemRemoved(1);
                } else {
                    aVar.notifyItemRemoved(0);
                }
                this.f87348e.mo27385g();
            }
            if (gVar != null && gVar.f86374b) {
                AbstractC81915c.m141874a(new C36397l(3, gVar.f86375c));
            }
            AbstractC81915c.m141874a(new C36387c(4, this.f87344a));
        }
    }

    /* renamed from: a */
    public final void mo64579a(Set<String> set, Map<String, Comment> map) {
        C36205a aVar = (C36205a) mo64572a();
        if (aVar != null) {
            aVar.mo63361a(set, map);
            if (aVar.mo60933c() == 0) {
                aVar.mo67829d(false);
                aVar.notifyItemRemoved(0);
                this.f87348e.mo27385g();
            }
            AbstractC81915c.m141874a(new C36387c(4, this.f87344a));
        }
    }

    /* renamed from: a */
    public final void mo64580a(boolean z, Comment comment) {
        int i;
        if (!z || comment != null) {
            if (z) {
                Rect c = m74764c(comment);
                if (c != null) {
                    int[] iArr = new int[2];
                    this.f87345b.getLocationOnScreen(iArr);
                    i = c.top - iArr[1];
                    int max = Math.max(0, (this.f87345b.computeVerticalScrollRange() - this.f87345b.computeVerticalScrollOffset()) - this.f87345b.getHeight());
                    if (i > max) {
                        this.f87345b.animate().translationY((float) (max - i)).setDuration(300).start();
                        i = max;
                    }
                } else {
                    i = 0;
                }
                this.f87350g = i;
            } else {
                this.f87345b.animate().translationY(0.0f).setDuration(300).start();
                i = -this.f87350g;
                this.f87350g = 0;
            }
            RecyclerView recyclerView = this.f87345b;
            if (recyclerView != null) {
                recyclerView.mo4395a(0, i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final RecyclerView.AbstractC1350a mo64572a() {
        C41893a aVar = (C41893a) this.f87345b.getAdapter();
        if (aVar == null) {
            return null;
        }
        return aVar.f97741f;
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    public final void aW_() {
        AbstractC39063h hVar = (AbstractC39063h) mo64572a();
        if (hVar != null) {
            hVar.ao_();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59515b() {
        this.f87345b.setVisibility(0);
        this.f87348e.mo27384f();
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: f */
    public final void mo59525f() {
        mo64578a(new ArrayList());
    }

    /* renamed from: c */
    private int m74763c() {
        C41893a aVar = (C41893a) this.f87345b.getAdapter();
        if (aVar == null) {
            return 0;
        }
        return aVar.mo71052a().size();
    }

    /* renamed from: c */
    private Rect m74764c(Comment comment) {
        RecyclerView.ViewHolder d;
        if (comment == null || (d = m74766d(comment)) == null) {
            return null;
        }
        return C80494gh.m139516a(d);
    }

    /* renamed from: a */
    static List<Comment> m74760a(C36205a aVar) {
        ArrayList arrayList = new ArrayList();
        List e = aVar.mo63369e();
        if (!C13603b.m24435a((Collection) e)) {
            arrayList.addAll(e);
        }
        return arrayList;
    }

    /* renamed from: b */
    private static boolean m74762b(List<Comment> list) {
        Comment comment;
        if (!C13603b.m24435a((Collection) list) && (comment = list.get(0)) != null && comment.getCommentType() == 220) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.comment.p2492f.AbstractC36415a
    /* renamed from: d */
    public final void mo63700d(Exception exc) {
        if ((exc instanceof C34485a) && ((C34480a) exc).getErrorCode() == 3002042) {
            C33615a.m68848a(this.f87349f, (Throwable) exc, (int) R.string.ama);
        }
    }

    /* renamed from: c */
    private static boolean m74765c(List<Comment> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCommentType() == 221) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo64581b(Comment comment) {
        C36205a aVar = (C36205a) mo64572a();
        aVar.notifyItemChanged(aVar.mo63365c(comment.getCid(), 1), 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0039 A[ADDED_TO_REGION] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private androidx.recyclerview.widget.RecyclerView.ViewHolder m74766d(com.p2082ss.android.ugc.aweme.comment.model.Comment r8) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.C37074bt.m74766d(com.ss.android.ugc.aweme.comment.model.Comment):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo64573a(Comment comment) {
        int h = C36535m.m74360h(comment);
        RecyclerView.AbstractC1350a a = mo64572a();
        if (h >= 0 && a != null) {
            a.notifyItemChanged(h, 1);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59516b(Exception exc) {
        mo64576a(exc, new ArrayList());
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: c */
    public final void mo59522c(Exception exc) {
        AbstractC39063h hVar = (AbstractC39063h) mo64572a();
        if (hVar != null) {
            hVar.mo67823i();
        }
    }

    /* renamed from: a */
    public final void mo64577a(String str) {
        C36205a aVar = (C36205a) mo64572a();
        if (aVar != null) {
            aVar.mo63364b(str, this.f87346c.mo64775c(str));
            if (aVar.mo60933c() == 0) {
                aVar.mo67829d(false);
                aVar.notifyItemRemoved(0);
                this.f87348e.mo27385g();
            }
            AbstractC81915c.m141874a(new C36387c(4, this.f87344a));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.common.p2633e.AbstractC39102c
    /* renamed from: b */
    public final void mo59517b(List<Comment> list, boolean z) {
        C36205a aVar = (C36205a) mo64572a();
        if (aVar != null) {
            aVar.mo67829d(true);
            if (list != null && !list.isEmpty() && z) {
                aVar.aq_();
            } else if (!aVar.f85510f) {
                aVar.mo67829d(false);
            } else {
                aVar.ap_();
            }
            aVar.mo62376b(list);
        }
    }

    /* renamed from: a */
    public final void mo64575a(Comment comment, boolean z) {
        if (comment != null && comment.getShouldDisplayFakeComment()) {
            boolean z2 = !C36535m.m74352a(comment);
            if (z2) {
                mo64582b(comment, z);
            }
            if (!C36535m.m74357e(comment)) {
                C36535m.m74356d(comment);
            }
            if (!z2) {
                mo64573a(comment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0105, code lost:
        if (r3 < 0) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0166, code lost:
        if (r5 < 0) goto L_0x0168;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64582b(com.p2082ss.android.ugc.aweme.comment.model.Comment r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 420
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.p2503ui.C37074bt.mo64582b(com.ss.android.ugc.aweme.comment.model.Comment, boolean):void");
    }

    /* renamed from: a */
    public final void mo64576a(Exception exc, List<Comment> list) {
        AbstractC39060f fVar = (AbstractC39060f) mo64572a();
        if (fVar != null) {
            if (fVar.f92274v) {
                fVar.mo67829d(false);
            }
            fVar.mo62377b_(list);
            if (exc instanceof C34485a) {
                this.f87348e.mo27385g();
                this.f87345b.setVisibility(8);
                if (((C34480a) exc).getErrorCode() == 14) {
                    C33615a.m68848a(this.f87349f, (Throwable) exc, (int) R.string.g1i);
                    return;
                }
                return;
            }
            this.f87348e.mo27387h();
            this.f87345b.setVisibility(8);
        }
    }

    /* renamed from: a */
    static boolean m74761a(Comment comment, int i, int i2) {
        int h = C36535m.m74360h(comment);
        if (h != -1 && i >= 0 && i2 >= 0 && h >= i && h <= i2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo64574a(Comment comment, int i, int i2, boolean z) {
        AbstractC39060f fVar;
        List e;
        if (comment != null) {
            if (!C36535m.m74352a(comment)) {
                mo64582b(comment, z);
            }
            C36535m.m74362j(comment);
            C36535m.m74358f(comment);
            int h = C36535m.m74360h(comment);
            RecyclerView.AbstractC1350a a = mo64572a();
            if ((a instanceof C36205a) && (e = (fVar = (AbstractC39060f) a).mo63369e()) != null && h >= 0 && h <= e.size() - 1) {
                e.set(h, comment);
                fVar.notifyItemChanged(h);
            }
            List<Comment> list = this.f87346c.f87756b;
            if (list != null) {
                int i3 = 0;
                while (true) {
                    if (i3 >= list.size()) {
                        break;
                    } else if (TextUtils.equals(list.get(i3).getFakeId(), comment.getFakeId())) {
                        list.set(i3, comment);
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            List<CommentReplyListItem> list2 = this.f87346c.f87755a;
            if (list2 != null) {
                Iterator<CommentReplyListItem> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    CommentReplyListItem next = it.next();
                    if (TextUtils.equals(next.mComment.getFakeId(), comment.getFakeId())) {
                        next.mComment = comment;
                    } else if (TextUtils.equals(next.mComment.getCid(), comment.getReplyId())) {
                        List<Comment> list3 = next.mReplyComments;
                        if (list3 != null) {
                            int size = list3.size();
                            int i4 = 0;
                            while (true) {
                                if (i4 >= size) {
                                    break;
                                } else if (TextUtils.equals(list3.get(i4).getFakeId(), comment.getFakeId())) {
                                    C36520p.m74325a(next.mComment.getCid(), 1);
                                    list3.set(i4, comment);
                                    break;
                                } else {
                                    i4++;
                                }
                            }
                        }
                    }
                }
            }
            if (m74761a(comment, i, i2) && !comment.isIgnoreToast()) {
                new C79459a(this.f87345b.getContext()).mo123050a(R.string.am0).mo123053a();
            }
            C36535m.m74359g(comment);
            this.f87345b.setVisibility(0);
            AwemeService.m70060b().mo60688c(this.f87344a);
            this.f87348e.mo27382d();
        }
    }

    public C37074bt(Context context, DmtStatusView dmtStatusView, RecyclerView recyclerView, C37221v vVar, Aweme aweme) {
        this.f87349f = context;
        this.f87348e = dmtStatusView;
        this.f87345b = recyclerView;
        this.f87346c = vVar;
        this.f87351h = aweme;
    }
}
