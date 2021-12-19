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

/* renamed from: com.ss.android.ugc.aweme.autoplay.player.a */
public final class C34183a implements AbstractC51057e {

    /* renamed from: a */
    public static final C34184a f80838a = new C34184a((byte) 0);

    /* renamed from: b */
    private final AbstractC89244h f80839b = C89250i.m154773a((AbstractC89171a) C34185b.f80845a);

    /* renamed from: c */
    private final Rect f80840c = new Rect(0, 0, 0, 0);

    /* renamed from: e */
    private final Rect f80841e = new Rect(0, 0, 0, 0);

    /* renamed from: f */
    private int f80842f;

    /* renamed from: g */
    private final View f80843g;

    /* renamed from: h */
    private final C51060g f80844h;

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.a$b */
    static final class C34185b extends AbstractC89220m implements AbstractC89171a<int[]> {

        /* renamed from: a */
        public static final C34185b f80845a = new C34185b();

        static {
            Covode.recordClassIndex(41119);
        }

        C34185b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ int[] invoke() {
            return new int[2];
        }
    }

    static {
        Covode.recordClassIndex(41117);
    }

    /* renamed from: b */
    private final int[] m69864b() {
        return (int[]) this.f80839b.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.autoplay.player.a$a */
    public static final class C34184a {
        static {
            Covode.recordClassIndex(41118);
        }

        private C34184a() {
        }

        public /* synthetic */ C34184a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51057e
    /* renamed from: a */
    public final int mo60506a() {
        return this.f80842f;
    }

    /* renamed from: c */
    private final int m69865c() {
        return C51428b.m95803a(this.f80843g.getContext(), 150.0f);
    }

    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51057e
    /* renamed from: a */
    public final void mo60508a(int i) {
        this.f80842f = i;
    }

    /* renamed from: c */
    private static boolean m69866c(Rect rect) {
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
        if (!m69866c(rect)) {
            return false;
        }
        if (this.f80842f == 0) {
            f = ((float) rect.top) + (((float) (rect.bottom - rect.top)) / 2.0f);
            i = this.f80840c.top;
            i2 = this.f80840c.bottom;
        } else {
            f = ((float) rect.left) + (((float) (rect.right - rect.left)) / 2.0f);
            i = this.f80840c.left;
            i2 = this.f80840c.right;
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
        if (!m69866c(rect)) {
            return false;
        }
        if (this.f80842f == 0) {
            f = ((float) this.f80840c.top) + (((float) (this.f80840c.bottom - this.f80840c.top)) / 2.0f);
            i = rect.top;
            i2 = rect.bottom;
        } else {
            f = ((float) this.f80840c.left) + (((float) (this.f80840c.right - this.f80840c.left)) / 2.0f);
            i = rect.left;
            i2 = rect.right;
        }
        if (f < ((float) i) || f > ((float) i2)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x01e7, code lost:
        if (r3 == r2) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01ea, code lost:
        if (r2 != false) goto L_0x0196;
     */
    @Override // com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51057e
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i mo60507a(java.util.Set<? extends com.p2082ss.android.ugc.aweme.flowfeed.utils.AbstractC51064i> r16) {
        /*
        // Method dump skipped, instructions count: 530
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.autoplay.player.C34183a.mo60507a(java.util.Set):com.ss.android.ugc.aweme.flowfeed.utils.i");
    }

    /* renamed from: a */
    private static boolean m69863a(AbstractC51064i iVar, int i) {
        if (iVar == null || iVar.f117781e == i) {
            return false;
        }
        iVar.f117781e = i;
        return true;
    }

    public C34183a(View view, C51060g gVar) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(gVar, "");
        this.f80843g = view;
        this.f80844h = gVar;
    }

    /* renamed from: a */
    private final float m69862a(Rect rect, float f) {
        int i;
        int i2;
        if (this.f80842f == 0) {
            i = rect.top;
        } else {
            i = rect.left;
        }
        if (this.f80842f == 0) {
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
