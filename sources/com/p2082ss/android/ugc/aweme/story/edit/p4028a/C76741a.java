package com.p2082ss.android.ugc.aweme.story.edit.p4028a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.editSticker.C45890g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45921f;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45883b;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.sticker.view.C76113a;
import com.p2082ss.android.ugc.tools.view.AbstractC84922b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.edit.a.a */
public final class C76741a extends C76113a {

    /* renamed from: g */
    public static final C76742a f172250g = new C76742a((byte) 0);

    /* renamed from: h */
    private final RectF f172251h;

    /* renamed from: i */
    private final AbstractC89244h f172252i;

    /* renamed from: j */
    private final AbstractC89244h f172253j;

    static {
        Covode.recordClassIndex(89737);
    }

    private final DashPathEffect getDashPathEffect() {
        return (DashPathEffect) this.f172252i.getValue();
    }

    private final int getFakeViewStyle() {
        return ((Number) this.f172253j.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.a.a$a */
    public static final class C76742a {
        static {
            Covode.recordClassIndex(89738);
        }

        private C76742a() {
        }

        public /* synthetic */ C76742a(byte b) {
            this();
        }
    }

    /* renamed from: d */
    private final boolean m134326d() {
        if (getFakeViewStyle() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.a.a$b */
    static final class C76743b extends AbstractC89220m implements AbstractC89171a<DashPathEffect> {

        /* renamed from: a */
        public static final C76743b f172254a = new C76743b();

        static {
            Covode.recordClassIndex(89739);
        }

        C76743b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DashPathEffect invoke() {
            return new DashPathEffect(new float[]{(float) C71812ep.m126783a(4.0d, C63247i.f143610a), (float) C71812ep.m126783a(4.0d, C63247i.f143610a)}, 0.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.story.edit.a.a$c */
    static final class C76744c extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C76744c f172255a = new C76744c();

        static {
            Covode.recordClassIndex(89740);
        }

        C76744c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
            C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
            return Integer.valueOf(!createIAVServiceProxybyMonsterPlugin.getStoryService().mo93867a());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.C76113a
    /* renamed from: a */
    public final boolean mo119846a() {
        if (super.mo119846a() || this.f171005d.top <= this.f171002a.top) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.C76113a
    /* renamed from: a */
    public final void mo119845a(Canvas canvas) {
        Paint paint = this.f171003b;
        C89219l.m154716b(paint, "");
        paint.setPathEffect(getDashPathEffect());
        super.mo119845a(canvas);
        Paint paint2 = this.f171003b;
        C89219l.m154716b(paint2, "");
        paint2.setPathEffect(null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C76741a(Context context) {
        super(context, null);
        C89219l.m154721d(context, "");
        this.f172251h = new RectF();
        this.f172252i = C89250i.m154773a((AbstractC89171a) C76743b.f172254a);
        this.f172253j = C89250i.m154773a((AbstractC89171a) C76744c.f172255a);
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.C76113a
    /* renamed from: c */
    public final void mo119848c(Context context) {
        AbstractC45921f dVar;
        AbstractC84922b bVar;
        if (this.f171007f == null && getEnableFakeFeedView()) {
            if (m134326d()) {
                if (context == null) {
                    C89219l.m154715b();
                }
                dVar = new C76746c(context, (byte) 0);
            } else {
                if (context == null) {
                    C89219l.m154715b();
                }
                dVar = new C76747d(context, (byte) 0);
            }
            this.f171007f = dVar;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C70636dh.m124831b(getContext()), C76113a.m133465a(context));
            layoutParams.gravity = 1;
            if (m134326d() && (bVar = C45890g.f106878a) != null && !bVar.mo59454e()) {
                layoutParams.topMargin = C70636dh.m124833c(context);
            }
            this.f171007f.getContentView().setLayoutParams(layoutParams);
            addView(this.f171007f.getContentView());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.C76113a
    /* renamed from: b */
    public final void mo119847b(Context context) {
        float f;
        int i;
        if (!m134326d()) {
            super.mo119847b(context);
        } else if (this.f171002a == null) {
            AbstractC84922b bVar = C45890g.f106878a;
            if (bVar == null || bVar.mo59454e()) {
                f = 0.0f;
            } else {
                f = (float) C70636dh.m124833c(context);
            }
            float a = (float) C71812ep.m126783a(8.0d, C63247i.f143610a);
            float a2 = ((float) C71812ep.m126783a(60.0d, C63247i.f143610a)) + f;
            float b = ((float) C70636dh.m124831b(context)) - ((float) C71812ep.m126783a(8.0d, C63247i.f143610a));
            float e = ((float) C70636dh.m124836e(context)) - ((float) C71812ep.m126783a(8.0d, C63247i.f143610a));
            AbstractC84922b bVar2 = C45890g.f106878a;
            int i2 = 0;
            if (bVar2 != null) {
                i = bVar2.mo59455f();
            } else {
                i = 0;
            }
            float f2 = e - ((float) i);
            AbstractC84922b bVar3 = C45890g.f106878a;
            if (bVar3 != null) {
                i2 = bVar3.mo59453d();
            }
            this.f171002a = new RectF(a, a2, b, f2 - ((float) i2));
            this.f172251h.set(this.f171002a.left, -((float) C70636dh.m124828a(getContext())), this.f171002a.right, this.f171002a.bottom);
        }
    }

    public /* synthetic */ C76741a(Context context, byte b) {
        this(context);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.interact.view.AbstractC45920e, com.p2082ss.android.ugc.aweme.sticker.view.C76113a
    /* renamed from: b */
    public final boolean mo77322b(PointF[] pointFArr, float f, float f2) {
        if (!m134326d()) {
            return super.mo77322b(pointFArr, f, f2);
        }
        if (pointFArr == null) {
            return true;
        }
        RectF a = C45883b.m88523a(pointFArr);
        C89219l.m154716b(a, "");
        if (a.isEmpty()) {
            return true;
        }
        a.offset(((float) this.f171004c) + f, f2);
        return this.f172251h.contains(a);
    }
}
