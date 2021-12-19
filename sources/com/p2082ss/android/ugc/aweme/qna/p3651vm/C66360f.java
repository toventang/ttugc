package com.p2082ss.android.ugc.aweme.qna.p3651vm;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.profile.model.User;
import com.p2082ss.android.ugc.aweme.qna.api.C66011h;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.vm.f */
public final class C66360f implements AbstractC12853j {

    /* renamed from: a */
    public final AbstractC12783f<C66011h> f149233a;

    /* renamed from: b */
    public final Long f149234b;

    /* renamed from: c */
    public final Long f149235c;

    /* renamed from: d */
    public final Boolean f149236d;

    /* renamed from: e */
    public final User f149237e;

    static {
        Covode.recordClassIndex(77878);
    }

    /* renamed from: a */
    public static C66360f m118018a(AbstractC12783f<C66011h> fVar, Long l, Long l2, Boolean bool, User user) {
        C89219l.m154721d(fVar, "");
        return new C66360f(fVar, l, l2, bool, user);
    }

    /* renamed from: a */
    public static /* synthetic */ C66360f m118019a(C66360f fVar, AbstractC12783f fVar2, Long l, Long l2, Boolean bool, User user, int i) {
        if ((i & 1) != 0) {
            fVar2 = fVar.f149233a;
        }
        if ((i & 2) != 0) {
            l = fVar.f149234b;
        }
        if ((i & 4) != 0) {
            l2 = fVar.f149235c;
        }
        if ((i & 8) != 0) {
            bool = fVar.f149236d;
        }
        if ((i & 16) != 0) {
            user = fVar.f149237e;
        }
        return m118018a(fVar2, l, l2, bool, user);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C66360f)) {
            return false;
        }
        C66360f fVar = (C66360f) obj;
        return C89219l.m154714a(this.f149233a, fVar.f149233a) && C89219l.m154714a(this.f149234b, fVar.f149234b) && C89219l.m154714a(this.f149235c, fVar.f149235c) && C89219l.m154714a(this.f149236d, fVar.f149236d) && C89219l.m154714a(this.f149237e, fVar.f149237e);
    }

    public final int hashCode() {
        AbstractC12783f<C66011h> fVar = this.f149233a;
        int i = 0;
        int hashCode = (fVar != null ? fVar.hashCode() : 0) * 31;
        Long l = this.f149234b;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.f149235c;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Boolean bool = this.f149236d;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        User user = this.f149237e;
        if (user != null) {
            i = user.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "QnaBannerState(response=" + this.f149233a + ", answersCount=" + this.f149234b + ", questionsCount=" + this.f149235c + ", allowAskQuestion=" + this.f149236d + ", user=" + this.f149237e + ")";
    }

    public /* synthetic */ C66360f() {
        this(C12797s.f31127a, 0L, 0L, null, null);
    }

    private C66360f(AbstractC12783f<C66011h> fVar, Long l, Long l2, Boolean bool, User user) {
        C89219l.m154721d(fVar, "");
        this.f149233a = fVar;
        this.f149234b = l;
        this.f149235c = l2;
        this.f149236d = bool;
        this.f149237e = user;
    }
}
