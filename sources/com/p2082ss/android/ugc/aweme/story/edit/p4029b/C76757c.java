package com.p2082ss.android.ugc.aweme.story.edit.p4029b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65357b;
import com.p2082ss.android.ugc.aweme.shortvideo.C70635dg;
import com.p2082ss.android.ugc.aweme.story.edit.model.C77148a;
import com.p2082ss.android.ugc.aweme.story.edit.model.StoryEditClipModel;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4619j.C89271h;

/* renamed from: com.ss.android.ugc.aweme.story.edit.b.c */
public final class C76757c extends AbstractC76755a {

    /* renamed from: c */
    private int f172278c;

    /* renamed from: d */
    private int f172279d;

    static {
        Covode.recordClassIndex(89753);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: a */
    public final int mo112106a() {
        if (this.f172278c == 0) {
            m134350e();
        }
        return this.f172278c;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: b */
    public final int mo112109b() {
        if (this.f172279d == 0) {
            m134350e();
        }
        return this.f172279d;
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: c */
    public final int mo112111c() {
        if (this.f172273a) {
            return mo112106a();
        }
        return C77148a.m134755b(this.f172274b);
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.edit.AbstractC70977bq
    /* renamed from: d */
    public final int mo112112d() {
        if (this.f172273a) {
            return mo112109b();
        }
        return C77148a.m134757c(this.f172274b);
    }

    /* renamed from: e */
    private final void m134350e() {
        int i;
        int a;
        int ceil;
        int b;
        int c;
        if (C77148a.m134759d(this.f172274b)) {
            if (this.f172274b.getVideoCanvasWidth() > 0) {
                b = this.f172274b.getVideoCanvasWidth();
            } else {
                b = C77148a.m134755b(this.f172274b);
            }
            this.f172278c = b;
            if (this.f172274b.getVideoCanvasHeight() > 0) {
                c = this.f172274b.getVideoCanvasHeight();
            } else {
                c = C77148a.m134757c(this.f172274b);
            }
            this.f172279d = c;
            return;
        }
        boolean a2 = C70635dg.m124827a(C77148a.m134755b(this.f172274b), C77148a.m134757c(this.f172274b));
        if (a2) {
            a = C77148a.m134755b(this.f172274b);
        } else {
            int[] h = C65357b.m117052h();
            if (h != null) {
                i = h[0];
            } else {
                i = 720;
            }
            a = m134346a(C89271h.m154772c(C77148a.m134755b(this.f172274b), i));
        }
        this.f172278c = a;
        if (a2) {
            ceil = C77148a.m134757c(this.f172274b);
        } else {
            double d = (double) a;
            Double.isNaN(d);
            ceil = (int) (Math.ceil(d / 9.0d) * 16.0d);
        }
        this.f172279d = ceil;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C76757c(StoryEditClipModel storyEditClipModel) {
        super(storyEditClipModel);
        C89219l.m154721d(storyEditClipModel, "");
    }
}
