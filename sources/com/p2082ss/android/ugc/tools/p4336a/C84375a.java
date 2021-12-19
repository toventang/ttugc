package com.p2082ss.android.ugc.tools.p4336a;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.tools.a.a */
public final class C84375a extends TouchDelegate {

    /* renamed from: a */
    public final View f188639a;

    /* renamed from: b */
    private boolean f188640b;

    /* renamed from: c */
    private final AbstractC89244h f188641c = C89250i.m154773a((AbstractC89171a) C84376a.f188648a);

    /* renamed from: d */
    private final AbstractC89244h f188642d = C89250i.m154773a((AbstractC89171a) new C84378c(this));

    /* renamed from: e */
    private final AbstractC89244h f188643e = C89250i.m154773a((AbstractC89171a) new C84377b(this));

    /* renamed from: f */
    private final int f188644f;

    /* renamed from: g */
    private final int f188645g;

    /* renamed from: h */
    private final ViewGroup f188646h;

    /* renamed from: i */
    private final Rect f188647i = null;

    static {
        Covode.recordClassIndex(98340);
    }

    /* renamed from: b */
    private final Rect m145128b() {
        return (Rect) this.f188642d.getValue();
    }

    /* renamed from: c */
    private final int m145129c() {
        return ((Number) this.f188643e.getValue()).intValue();
    }

    /* renamed from: a */
    public final Rect mo129384a() {
        return (Rect) this.f188641c.getValue();
    }

    /* renamed from: com.ss.android.ugc.tools.a.a$a */
    static final class C84376a extends AbstractC89220m implements AbstractC89171a<Rect> {

        /* renamed from: a */
        public static final C84376a f188648a = new C84376a();

        static {
            Covode.recordClassIndex(98341);
        }

        C84376a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Rect invoke() {
            return new Rect();
        }
    }

    /* renamed from: com.ss.android.ugc.tools.a.a$c */
    static final class C84378c extends AbstractC89220m implements AbstractC89171a<Rect> {

        /* renamed from: a */
        final /* synthetic */ C84375a f188650a;

        static {
            Covode.recordClassIndex(98343);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84378c(C84375a aVar) {
            super(0);
            this.f188650a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Rect invoke() {
            return new Rect(this.f188650a.mo129384a());
        }
    }

    /* renamed from: com.ss.android.ugc.tools.a.a$b */
    static final class C84377b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C84375a f188649a;

        static {
            Covode.recordClassIndex(98342);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84377b(C84375a aVar) {
            super(0);
            this.f188649a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this.f188649a.f188639a.getContext());
            C89219l.m154716b(viewConfiguration, "");
            return Integer.valueOf(viewConfiguration.getScaledTouchSlop());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
        // Method dump skipped, instructions count: 389
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.tools.p4336a.C84375a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84375a(int i, int i2, ViewGroup viewGroup, View view) {
        super(new Rect(), view);
        C89219l.m154721d(viewGroup, "");
        C89219l.m154721d(view, "");
        this.f188644f = i;
        this.f188645g = i2;
        this.f188646h = viewGroup;
        this.f188639a = view;
    }
}
