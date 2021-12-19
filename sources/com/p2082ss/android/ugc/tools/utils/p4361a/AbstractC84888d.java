package com.p2082ss.android.ugc.tools.utils.p4361a;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.utils.a.d */
public abstract class AbstractC84888d extends AbstractC84880a {

    /* renamed from: p */
    public static final C84889a f189718p = new C84889a((byte) 0);

    /* renamed from: i */
    private final float f189719i;

    /* renamed from: j */
    private float f189720j;

    /* renamed from: k */
    public float f189721k;

    /* renamed from: l */
    public float f189722l;

    /* renamed from: m */
    public float f189723m;

    /* renamed from: n */
    public float f189724n;

    /* renamed from: o */
    public int f189725o;

    /* renamed from: q */
    private float f189726q;

    /* renamed from: r */
    private float f189727r;

    /* renamed from: s */
    private float f189728s;

    static {
        Covode.recordClassIndex(98882);
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.utils.p4361a.AbstractC84880a
    /* renamed from: a */
    public abstract void mo129680a(int i, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.utils.p4361a.AbstractC84880a
    /* renamed from: b */
    public abstract void mo129682b(int i, MotionEvent motionEvent);

    /* renamed from: com.ss.android.ugc.tools.utils.a.d$a */
    public static final class C84889a {
        static {
            Covode.recordClassIndex(98883);
        }

        private C84889a() {
        }

        public /* synthetic */ C84889a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC84888d(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C89219l.m154716b(viewConfiguration, "");
        this.f189719i = (float) viewConfiguration.getScaledEdgeSlop();
    }

    /* access modifiers changed from: protected */
    @Override // com.p2082ss.android.ugc.tools.utils.p4361a.AbstractC84880a
    /* renamed from: b */
    public void mo129683b(MotionEvent motionEvent) {
        float f;
        C89219l.m154721d(motionEvent, "");
        super.mo129683b(motionEvent);
        MotionEvent motionEvent2 = this.f189700a;
        this.f189727r = -1.0f;
        this.f189728s = -1.0f;
        if (motionEvent2 == null) {
            C89219l.m154715b();
        }
        float x = motionEvent2.getX(0);
        float y = motionEvent2.getY(0);
        float f2 = 0.0f;
        if (motionEvent2.getPointerCount() >= 2) {
            f2 = motionEvent2.getX(1);
            f = motionEvent2.getY(1);
        } else {
            f = 0.0f;
        }
        this.f189721k = f2 - x;
        this.f189722l = f - y;
        float x2 = motionEvent.getX(0);
        float y2 = motionEvent.getY(0);
        if (motionEvent.getPointerCount() >= 2) {
            f2 = motionEvent.getX(1);
            f = motionEvent.getY(1);
        }
        this.f189723m = f2 - x2;
        this.f189724n = f - y2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo129685c(MotionEvent motionEvent) {
        float f;
        boolean z;
        boolean z2;
        C89219l.m154721d(motionEvent, "");
        Resources resources = this.f189706g.getResources();
        C89219l.m154716b(resources, "");
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        this.f189720j = ((float) displayMetrics.widthPixels) - this.f189719i;
        float f2 = this.f189719i;
        float f3 = ((float) displayMetrics.heightPixels) - f2;
        this.f189726q = f3;
        int i = this.f189725o;
        float f4 = f2 - ((float) i);
        float f5 = this.f189720j + ((float) i);
        float f6 = f3 + ((float) i);
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        C89219l.m154721d(motionEvent, "");
        float x = motionEvent.getX() - motionEvent.getRawX();
        float f7 = 0.0f;
        if (1 < motionEvent.getPointerCount()) {
            f = motionEvent.getX(1) - x;
        } else {
            f = 0.0f;
        }
        C89219l.m154721d(motionEvent, "");
        float y = motionEvent.getY() - motionEvent.getRawY();
        if (1 < motionEvent.getPointerCount()) {
            f7 = motionEvent.getY(1) - y;
        }
        if (rawX < f4 || rawY < f4 || rawX > f5 || rawY > f6) {
            z = true;
        } else {
            z = false;
        }
        if (f < f4 || f7 < f4 || f > f5 || f7 > f6) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z) {
            return z2 ? true : true;
        }
        if (z2) {
            return true;
        }
        return false;
    }
}
