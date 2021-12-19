package com.p2082ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.audiorecord.Point;
import com.p2082ss.android.ugc.aweme.tools.C78099c;
import java.util.Collection;
import java.util.Objects;
import java.util.Stack;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.b */
public final class C70889b extends RelativeLayout {

    /* renamed from: a */
    public final ImageView f158708a;

    /* renamed from: b */
    final C70887a f158709b;

    /* renamed from: c */
    public int f158710c;

    /* renamed from: d */
    int f158711d;

    /* renamed from: e */
    int f158712e;

    /* renamed from: f */
    public int f158713f = -1;

    /* renamed from: g */
    public int f158714g = -1;

    /* renamed from: h */
    int f158715h = 1;

    /* renamed from: i */
    AbstractC70927i f158716i;

    /* renamed from: j */
    private int f158717j = -1;

    /* renamed from: k */
    private int f158718k = -1;

    /* renamed from: l */
    private final int f158719l = 50;

    /* renamed from: m */
    private final C70899g f158720m;

    static {
        Covode.recordClassIndex(83383);
    }

    public final Stack<Point> getStack() {
        Stack<Point> stack = new Stack<>();
        stack.addAll(this.f158709b.getMStack());
        return stack;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.b$b */
    static final class RunnableC70891b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C70889b f158722a;

        /* renamed from: b */
        final /* synthetic */ float f158723b;

        static {
            Covode.recordClassIndex(83385);
        }

        RunnableC70891b(C70889b bVar, float f) {
            this.f158722a = bVar;
            this.f158723b = f;
        }

        public final void run() {
            this.f158722a.mo112062a();
            this.f158722a.mo112064a((int) ((((float) this.f158722a.f158710c) + (((float) (this.f158722a.f158714g - this.f158722a.f158713f)) * this.f158723b)) - ((float) (this.f158722a.f158708a.getWidth() / 2))));
        }
    }

    /* renamed from: a */
    public final void mo112062a() {
        this.f158713f = this.f158710c;
        this.f158714g = getWidth() - this.f158710c;
        this.f158717j = this.f158713f - (this.f158708a.getWidth() / 2);
        this.f158718k = this.f158714g - (this.f158708a.getWidth() / 2);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.b$a */
    public static final class View$OnTouchListenerC70890a implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C70889b f158721a;

        static {
            Covode.recordClassIndex(83384);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnTouchListenerC70890a(C70889b bVar) {
            this.f158721a = bVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 1) {
                this.f158721a.mo112065a(view, motionEvent.getRawX(), true);
            } else if (action == 2) {
                this.f158721a.mo112065a(view, motionEvent.getRawX(), false);
            } else if (action == 3) {
                this.f158721a.mo112065a(view, motionEvent.getRawX(), true);
            }
            return true;
        }
    }

    /* renamed from: c */
    private final int m125173c(int i) {
        int i2 = this.f158717j;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f158718k;
        return i > i3 ? i3 : i;
    }

    /* renamed from: a */
    public final void mo112063a(float f) {
        post(new RunnableC70891b(this, f));
    }

    /* renamed from: b */
    public final Point mo112066b(int i) {
        Point push = this.f158709b.getMStack().push(new Point(i, i, System.currentTimeMillis()));
        C89219l.m154716b(push, "");
        return push;
    }

    public final void setStack(Stack<Point> stack) {
        C89219l.m154721d(stack, "");
        this.f158709b.getMStack().clear();
        if (!C13603b.m24435a((Collection) stack)) {
            this.f158709b.getMStack().addAll(stack);
        }
        this.f158709b.invalidate();
    }

    /* renamed from: a */
    public final void mo112064a(int i) {
        if (i >= 0) {
            ViewGroup.LayoutParams layoutParams = this.f158708a.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (C78099c.m136517a(getContext())) {
                layoutParams2.setMarginEnd(m125173c(i));
            } else {
                layoutParams2.leftMargin = m125173c(i);
            }
            this.f158708a.setLayoutParams(layoutParams2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C70889b(Context context, C70899g gVar) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(gVar, "");
        MethodCollector.m26663i(11214);
        this.f158708a = new ImageView(context);
        this.f158709b = new C70887a(context);
        this.f158720m = gVar;
        MethodCollector.m26664o(11214);
    }

    /* renamed from: a */
    public final void mo112065a(View view, float f, boolean z) {
        if (!this.f158720m.f158775f) {
            mo112062a();
            int i = (int) f;
            mo112064a(m125173c(i));
            float c = ((float) ((m125173c(i) + (view.getWidth() / 2)) - this.f158710c)) / ((float) (this.f158714g - this.f158713f));
            if (((double) c) > 0.99d) {
                c = 1.0f;
            }
            if (((double) c) < 0.01d) {
                c = 0.0f;
            }
            AbstractC70927i iVar = this.f158716i;
            if (iVar != null) {
                iVar.mo112095a(c, z);
            }
        }
    }
}
