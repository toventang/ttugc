package com.p2082ss.android.ugc.aweme.autoplay.player;

import android.graphics.Rect;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51057e;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i;
import com.p2082ss.android.ugc.aweme.flowfeed.utils.C51060g;
import com.p2082ss.android.ugc.aweme.framework.p3009d.C51428b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.d */
public class C34195d implements AbstractC51057e {

    /* renamed from: c */
    public static final C34196a f80853c = new C34196a((byte) 0);

    /* renamed from: a */
    public final Rect f80854a = new Rect(0, 0, 0, 0);

    /* renamed from: b */
    public final Rect f80855b = new Rect(0, 0, 0, 0);

    /* renamed from: e */
    private final AbstractC89244h f80856e = C89250i.m154773a((AbstractC89171a) C34197b.f80860a);

    /* renamed from: f */
    private int f80857f;

    /* renamed from: g */
    private final View f80858g;

    /* renamed from: h */
    private final C51060g f80859h;

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.d$b */
    static final class C34197b extends AbstractC89220m implements AbstractC89171a<int[]> {

        /* renamed from: a */
        public static final C34197b f80860a = new C34197b();

        static {
            Covode.recordClassIndex(41131);
        }

        C34197b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ int[] invoke() {
            return new int[2];
        }
    }

    static {
        Covode.recordClassIndex(41129);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int[] mo60514b() {
        return (int[]) this.f80856e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.d$a */
    public static final class C34196a {
        static {
            Covode.recordClassIndex(41130);
        }

        private C34196a() {
        }

        public /* synthetic */ C34196a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51057e
    /* renamed from: a */
    public final int mo60506a() {
        return this.f80857f;
    }

    /* renamed from: e */
    public final View mo60517e() {
        return this.f80858g;
    }

    /* renamed from: c */
    public int mo60515c() {
        return C51428b.m95803a(this.f80858g.getContext(), 150.0f);
    }

    /* renamed from: d */
    public void mo60516d() {
        this.f80858g.getLocationOnScreen(mo60514b());
        this.f80855b.left = mo60514b()[0];
        this.f80855b.top = mo60514b()[1];
        this.f80855b.right = mo60514b()[0] + this.f80858g.getWidth();
        this.f80855b.bottom = mo60514b()[1] + this.f80858g.getHeight();
        float height = (float) this.f80855b.height();
        this.f80854a.set(this.f80855b.left, (int) (((float) this.f80855b.top) + (0.0f * height)), this.f80855b.right, (int) (((float) this.f80855b.top) + (height * 1.0f)));
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51057e
    /* renamed from: a */
    public final void mo60508a(int i) {
        this.f80857f = i;
    }

    /* renamed from: c */
    private static boolean m69882c(Rect rect) {
        if (rect.right <= rect.left || rect.bottom <= rect.top) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51057e
    /* renamed from: a */
    public final boolean mo60509a(Rect rect) {
        float f;
        int i;
        int i2;
        C89219l.m154721d(rect, "");
        if (!m69882c(rect)) {
            return false;
        }
        if (this.f80857f == 0) {
            f = ((float) rect.top) + (((float) (rect.bottom - rect.top)) / 2.0f);
            i = this.f80854a.top;
            i2 = this.f80854a.bottom;
        } else {
            f = ((float) rect.left) + (((float) (rect.right - rect.left)) / 2.0f);
            i = this.f80854a.left;
            i2 = this.f80854a.right;
        }
        if (f < ((float) i) || f > ((float) i2)) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51057e
    /* renamed from: b */
    public final boolean mo60510b(Rect rect) {
        float f;
        int i;
        int i2;
        C89219l.m154721d(rect, "");
        if (!m69882c(rect)) {
            return false;
        }
        if (this.f80857f == 0) {
            f = ((float) this.f80854a.top) + (((float) (this.f80854a.bottom - this.f80854a.top)) / 2.0f);
            i = rect.top;
            i2 = rect.bottom;
        } else {
            f = ((float) this.f80854a.left) + (((float) (this.f80854a.right - this.f80854a.left)) / 2.0f);
            i = rect.left;
            i2 = rect.right;
        }
        if (f < ((float) i) || f > ((float) i2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x018e, code lost:
        if (r3 == r2) goto L_0x013d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0191, code lost:
        if (r2 != false) goto L_0x013d;
     */
    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51057e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i mo60507a(java.util.Set<? extends com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i> r16) {
        /*
        // Method dump skipped, instructions count: 441
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.autoplay.player.C34195d.mo60507a(java.util.Set):com.ss.android.ugc.aweme.flowfeed.utils.i");
    }

    /* renamed from: a */
    private static boolean m69881a(AbstractC51064i iVar, int i) {
        if (iVar == null || iVar.f117781e == i) {
            return false;
        }
        iVar.f117781e = i;
        return true;
    }

    public C34195d(View view, C51060g gVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(gVar, "");
        this.f80858g = view;
        this.f80859h = gVar;
    }

    /* renamed from: a */
    private final float m69880a(Rect rect, float f) {
        int i;
        int i2;
        if (this.f80857f == 0) {
            i = rect.top;
        } else {
            i = rect.left;
        }
        if (this.f80857f == 0) {
            i2 = rect.bottom;
        } else {
            i2 = rect.right;
        }
        float f2 = (float) i;
        if (f2 <= f && ((float) i2) >= f) {
            return 0.0f;
        }
        if (f2 > f) {
            return f2 - f;
        }
        return f - ((float) i2);
    }
}
