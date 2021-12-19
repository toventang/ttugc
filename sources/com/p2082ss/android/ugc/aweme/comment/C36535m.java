package com.p2082ss.android.ugc.aweme.comment;

import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.comment.model.Comment;
import com.p2082ss.android.ugc.aweme.comment.p2495i.AbstractC36489a;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.m */
public final class C36535m {

    /* renamed from: a */
    public static final Map<String, C36536a> f86493a = new HashMap();

    /* renamed from: b */
    public static final C36535m f86494b = new C36535m();

    private C36535m() {
    }

    static {
        Covode.recordClassIndex(43838);
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.m$a */
    public static final class C36536a {

        /* renamed from: a */
        public final int f86495a;

        /* renamed from: b */
        public final Comment f86496b;

        /* renamed from: c */
        public final int f86497c;

        /* renamed from: d */
        public final AbstractC36489a f86498d;

        /* renamed from: e */
        public final int f86499e;

        /* renamed from: f */
        public final Comment f86500f;

        static {
            Covode.recordClassIndex(43839);
        }

        public C36536a() {
            this(0, null, 0, null, 0, null, 63);
        }

        /* renamed from: a */
        private static C36536a m74363a(int i, Comment comment, int i2, AbstractC36489a aVar, int i3, Comment comment2) {
            return new C36536a(i, comment, i2, aVar, i3, comment2);
        }

        /* renamed from: a */
        public static /* synthetic */ C36536a m74364a(C36536a aVar, int i, Comment comment, int i2, AbstractC36489a aVar2, int i3, Comment comment2, int i4) {
            Comment comment3 = comment2;
            int i5 = i3;
            int i6 = i;
            Comment comment4 = comment;
            int i7 = i2;
            AbstractC36489a aVar3 = aVar2;
            if ((i4 & 1) != 0) {
                i6 = aVar.f86495a;
            }
            if ((i4 & 2) != 0) {
                comment4 = aVar.f86496b;
            }
            if ((i4 & 4) != 0) {
                i7 = aVar.f86497c;
            }
            if ((i4 & 8) != 0) {
                aVar3 = aVar.f86498d;
            }
            if ((i4 & 16) != 0) {
                i5 = aVar.f86499e;
            }
            if ((i4 & 32) != 0) {
                comment3 = aVar.f86500f;
            }
            return m74363a(i6, comment4, i7, aVar3, i5, comment3);
        }

        public final String toString() {
            return "CommentPostingStatus(status=" + this.f86495a + ", comment=" + this.f86496b + ", position=" + this.f86497c + ", params=" + this.f86498d + ", requestType=" + this.f86499e + ", replyComment=" + this.f86500f + ")";
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = this.f86495a * 31;
            Comment comment = this.f86496b;
            int i4 = 0;
            if (comment != null) {
                i = comment.hashCode();
            } else {
                i = 0;
            }
            int i5 = (((i3 + i) * 31) + this.f86497c) * 31;
            AbstractC36489a aVar = this.f86498d;
            if (aVar != null) {
                i2 = aVar.hashCode();
            } else {
                i2 = 0;
            }
            int i6 = (((i5 + i2) * 31) + this.f86499e) * 31;
            Comment comment2 = this.f86500f;
            if (comment2 != null) {
                i4 = comment2.hashCode();
            }
            return i6 + i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36536a)) {
                return false;
            }
            C36536a aVar = (C36536a) obj;
            if (this.f86495a == aVar.f86495a && !(!C89219l.m154714a(this.f86496b, aVar.f86496b)) && this.f86497c == aVar.f86497c && !(!C89219l.m154714a(this.f86498d, aVar.f86498d)) && this.f86499e == aVar.f86499e && !(!C89219l.m154714a(this.f86500f, aVar.f86500f))) {
                return true;
            }
            return false;
        }

        private C36536a(int i, Comment comment, int i2, AbstractC36489a aVar, int i3, Comment comment2) {
            this.f86495a = i;
            this.f86496b = comment;
            this.f86497c = i2;
            this.f86498d = aVar;
            this.f86499e = i3;
            this.f86500f = comment2;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C36536a(int i, Comment comment, int i2, AbstractC36489a aVar, int i3, Comment comment2, int i4) {
            this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? null : comment, (i4 & 4) != 0 ? -1 : i2, (i4 & 8) != 0 ? null : aVar, (i4 & 16) == 0 ? i3 : -1, (i4 & 32) == 0 ? comment2 : null);
        }
    }

    /* renamed from: g */
    public static void m74359g(Comment comment) {
        if (comment != null) {
            f86493a.remove(comment.getFakeId());
        }
    }

    /* renamed from: b */
    public static boolean m74354b(Comment comment) {
        C36536a aVar;
        if (comment == null || (aVar = f86493a.get(comment.getFakeId())) == null || aVar.f86495a != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m74357e(Comment comment) {
        C36536a aVar;
        if (comment == null || (aVar = f86493a.get(comment.getFakeId())) == null || aVar.f86495a != 3) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static int m74360h(Comment comment) {
        C36536a aVar;
        if (comment == null || (aVar = f86493a.get(comment.getFakeId())) == null) {
            return -1;
        }
        return aVar.f86497c;
    }

    /* renamed from: i */
    public static AbstractC36489a m74361i(Comment comment) {
        C36536a aVar;
        if (comment == null || (aVar = f86493a.get(comment.getFakeId())) == null) {
            return null;
        }
        return aVar.f86498d;
    }

    /* renamed from: c */
    public static void m74355c(Comment comment) {
        C36536a aVar;
        if (comment != null) {
            Map<String, C36536a> map = f86493a;
            String fakeId = comment.getFakeId();
            C89219l.m154716b(fakeId, "");
            C36536a aVar2 = map.get(comment.getFakeId());
            if (aVar2 == null || (aVar = C36536a.m74364a(aVar2, 2, null, 0, null, 0, null, 62)) == null) {
                aVar = new C36536a(2, null, 0, null, 0, null, 62);
            }
            map.put(fakeId, aVar);
        }
    }

    /* renamed from: d */
    public static void m74356d(Comment comment) {
        C36536a aVar;
        if (comment != null) {
            Map<String, C36536a> map = f86493a;
            String fakeId = comment.getFakeId();
            C89219l.m154716b(fakeId, "");
            C36536a aVar2 = map.get(comment.getFakeId());
            if (aVar2 == null || (aVar = C36536a.m74364a(aVar2, 1, null, 0, null, 0, null, 62)) == null) {
                aVar = new C36536a(1, null, 0, null, 0, null, 62);
            }
            map.put(fakeId, aVar);
        }
    }

    /* renamed from: f */
    public static void m74358f(Comment comment) {
        C36536a aVar;
        if (comment != null) {
            Map<String, C36536a> map = f86493a;
            String fakeId = comment.getFakeId();
            C89219l.m154716b(fakeId, "");
            C36536a aVar2 = map.get(comment.getFakeId());
            if (aVar2 == null || (aVar = C36536a.m74364a(aVar2, 4, null, 0, null, 0, null, 62)) == null) {
                aVar = new C36536a(4, null, 0, null, 0, null, 62);
            }
            map.put(fakeId, aVar);
        }
    }

    /* renamed from: j */
    public static void m74362j(Comment comment) {
        String replyToUserId;
        if (comment != null) {
            Map<String, C36536a> map = f86493a;
            C36536a aVar = map.get(comment.getFakeId());
            if (aVar != null) {
                Comment comment2 = aVar.f86496b;
                String replyToUserId2 = comment.getReplyToUserId();
                if (!((replyToUserId2 != null && replyToUserId2.length() != 0) || comment2 == null || (replyToUserId = comment2.getReplyToUserId()) == null || replyToUserId.length() == 0)) {
                    comment.setReplyToUserId(comment2.getReplyToUserId());
                }
                String fakeId = comment.getFakeId();
                C89219l.m154716b(fakeId, "");
                map.put(fakeId, C36536a.m74364a(aVar, 0, comment, 0, null, 0, null, 61));
                return;
            }
            String fakeId2 = comment.getFakeId();
            C89219l.m154716b(fakeId2, "");
            map.put(fakeId2, new C36536a(0, comment, 0, null, 0, null, 61));
        }
    }

    /* renamed from: a */
    public static boolean m74352a(Comment comment) {
        C36536a aVar;
        int i;
        if (comment != null && (aVar = f86493a.get(comment.getFakeId())) != null && 1 <= (i = aVar.f86495a) && 3 >= i && aVar.f86497c >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m74350a(Comment comment, int i) {
        C36536a aVar;
        if (comment != null) {
            Map<String, C36536a> map = f86493a;
            String fakeId = comment.getFakeId();
            C89219l.m154716b(fakeId, "");
            C36536a aVar2 = map.get(comment.getFakeId());
            if (aVar2 == null || (aVar = C36536a.m74364a(aVar2, 0, null, i, null, 0, null, 59)) == null) {
                aVar = new C36536a(0, null, i, null, 0, null, 59);
            }
            map.put(fakeId, aVar);
        }
    }

    /* renamed from: b */
    public static void m74353b(Comment comment, int i) {
        C36536a aVar;
        if (comment != null) {
            Map<String, C36536a> map = f86493a;
            String fakeId = comment.getFakeId();
            C89219l.m154716b(fakeId, "");
            C36536a aVar2 = map.get(comment.getFakeId());
            if (aVar2 == null || (aVar = C36536a.m74364a(aVar2, 0, null, 0, null, i, null, 47)) == null) {
                aVar = new C36536a(0, null, 0, null, i, null, 47);
            }
            map.put(fakeId, aVar);
        }
    }

    /* renamed from: a */
    public static void m74351a(Comment comment, TuxTextView tuxTextView) {
        if (comment != null && tuxTextView != null) {
            C36536a aVar = f86493a.get(comment.getFakeId());
            if (aVar == null || aVar.f86495a != 2) {
                tuxTextView.setVisibility(8);
                return;
            }
            tuxTextView.setVisibility(0);
            tuxTextView.setTextColor(C0643b.m2378c(C17867d.m33078a(), R.color.bh));
            tuxTextView.setText(R.string.alz);
        }
    }
}
