package com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4035b;

import android.app.Activity;
import android.content.ClipboardManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.p969f.p970a.p971a.AbstractC14552j;
import com.bytedance.p969f.p970a.p971a.C14544f;
import com.bytedance.p969f.p970a.p971a.p972a.AbstractC14537a;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d;
import com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.EnumC89331m;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.b.c */
public final class C76865c extends AbstractC22219j implements AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f172501a = {new C89232y(C76865c.class, "gestureService", "getGestureService()Lcom/bytedance/createx/editor/gesture/IGestureService;", 0)};

    /* renamed from: f */
    public static final C76868c f172502f = new C76868c((byte) 0);

    /* renamed from: b */
    public boolean f172503b = true;

    /* renamed from: c */
    public View f172504c;

    /* renamed from: d */
    final AbstractC89244h f172505d = C89250i.m154774a(EnumC89331m.NONE, new C76867b(this));

    /* renamed from: e */
    final AbstractC89244h f172506e = C89250i.m154773a((AbstractC89171a) new C76872g(this));

    /* renamed from: g */
    private final AbstractC89244h f172507g = C89250i.m154774a(EnumC89331m.NONE, new C76866a(this));

    /* renamed from: h */
    private final AbstractC89248d f172508h = C21572a.m40504a(getDiContainer(), AbstractC14552j.class);

    /* renamed from: i */
    private final C21582f f172509i;

    static {
        Covode.recordClassIndex(89861);
    }

    /* renamed from: a */
    public final AbstractC76760e mo120472a() {
        return (AbstractC76760e) this.f172507g.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.b.c$c */
    public static final class C76868c {
        static {
            Covode.recordClassIndex(89864);
        }

        private C76868c() {
        }

        public /* synthetic */ C76868c(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f172509i;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.b.c$a */
    public static final class C76866a extends AbstractC89220m implements AbstractC89171a<AbstractC76760e> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172510a;

        static {
            Covode.recordClassIndex(89862);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76866a(AbstractC21566a aVar) {
            super(0);
            this.f172510a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.b.e] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172510a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.b.e> r1 = com.p2082ss.android.ugc.aweme.story.edit.p4029b.AbstractC76760e.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4035b.C76865c.C76866a.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.b.c$b */
    public static final class C76867b extends AbstractC89220m implements AbstractC89171a<AbstractC77066d> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f172511a;

        static {
            Covode.recordClassIndex(89863);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C76867b(AbstractC21566a aVar) {
            super(0);
            this.f172511a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f172511a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.aweme.story.edit.business.shared.toolbar.d> r1 = com.p2082ss.android.ugc.aweme.story.edit.business.shared.toolbar.AbstractC77066d.class
                r0 = 0
                java.lang.Object r0 = r2.mo35249a(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4035b.C76865c.C76867b.invoke():com.bytedance.als.b");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.b.c$g */
    static final class C76872g extends AbstractC89220m implements AbstractC89171a<Vibrator> {

        /* renamed from: a */
        final /* synthetic */ C76865c f172515a;

        static {
            Covode.recordClassIndex(89868);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76872g(C76865c cVar) {
            super(0);
            this.f172515a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Vibrator invoke() {
            Object a = m134493a(this.f172515a.mo36486t(), "vibrator");
            Objects.requireNonNull(a, "null cannot be cast to non-null type android.os.Vibrator");
            return a;
        }

        /* renamed from: a */
        private static Object m134493a(Activity activity, String str) {
            Object obj;
            MethodCollector.m26663i(6470);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = activity.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = activity.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = activity.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                            } catch (Exception e) {
                                C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        C58027i.f132246a = false;
                    } finally {
                        MethodCollector.m26664o(6470);
                    }
                }
            } else {
                obj = activity.getSystemService(str);
            }
            return obj;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.b.c$f */
    public static final class C76871f extends AbstractC14537a {

        /* renamed from: a */
        final /* synthetic */ C76865c f172514a;

        static {
            Covode.recordClassIndex(89867);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C76871f(C76865c cVar) {
            this.f172514a = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cb, code lost:
            if (new android.graphics.RectF(r5, r3, r2, (float) (r1 + r0.getHeight())).contains(r11.floatValue(), r10.floatValue()) == false) goto L_0x00cd;
         */
        @Override // com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14549a, com.bytedance.p969f.p970a.p971a.GestureDetector$OnDoubleTapListenerC14546h.AbstractC14550b
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo23404c(android.view.MotionEvent r14) {
            /*
            // Method dump skipped, instructions count: 206
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.story.edit.business.shared.p4033b.p4035b.C76865c.C76871f.mo23404c(android.view.MotionEvent):boolean");
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m134488a(C76865c cVar) {
        View view = cVar.f172504c;
        if (view == null) {
            C89219l.m154710a("detectContainer");
        }
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.b.c$d */
    static final class C76869d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C76865c f172512a;

        static {
            Covode.recordClassIndex(89865);
        }

        C76869d(C76865c cVar) {
            this.f172512a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            ViewGroup.LayoutParams layoutParams = C76865c.m134488a(this.f172512a).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                C89219l.m154716b(num, "");
                marginLayoutParams.topMargin = num.intValue();
                C76865c.m134488a(this.f172512a).setLayoutParams(marginLayoutParams);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.business.shared.b.b.c$e */
    static final class C76870e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C76865c f172513a;

        static {
            Covode.recordClassIndex(89866);
        }

        C76870e(C76865c cVar) {
            this.f172513a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            ViewGroup.LayoutParams layoutParams = C76865c.m134488a(this.f172513a).getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                layoutParams = null;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (marginLayoutParams != null) {
                int a = C71812ep.m126783a(16.0d, C63247i.f143610a);
                C89219l.m154716b(num, "");
                marginLayoutParams.bottomMargin = a + num.intValue();
                C76865c.m134488a(this.f172513a).setLayoutParams(marginLayoutParams);
            }
        }
    }

    public C76865c(C21582f fVar) {
        C89219l.m154721d(fVar, "");
        this.f172509i = fVar;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        mo120472a().mo114792Q().observe(this, new C76869d(this));
        mo120472a().mo114793R().observe(this, new C76870e(this));
        ((AbstractC14552j) this.f172508h.mo23374a(this, f172501a[0])).mo23383a(new C14544f(0, new C76871f(this)));
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.b1r, viewGroup, false);
        View findViewById = a.findViewById(R.id.akd);
        C89219l.m154716b(findViewById, "");
        this.f172504c = findViewById;
        C89219l.m154716b(a, "");
        return a;
    }
}
