package com.p2082ss.android.ugc.aweme.ftc.components.audiorecord;

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

/* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.b */
public final class C52013b extends RelativeLayout {

    /* renamed from: a */
    public final ImageView f119822a;

    /* renamed from: b */
    final C52011a f119823b;

    /* renamed from: c */
    public int f119824c;

    /* renamed from: d */
    int f119825d;

    /* renamed from: e */
    int f119826e;

    /* renamed from: f */
    public int f119827f = -1;

    /* renamed from: g */
    public int f119828g = -1;

    /* renamed from: h */
    int f119829h = 1;

    /* renamed from: i */
    AbstractC52047g f119830i;

    /* renamed from: j */
    private int f119831j = -1;

    /* renamed from: k */
    private int f119832k = -1;

    /* renamed from: l */
    private final C52020e f119833l;

    static {
        Covode.recordClassIndex(61388);
    }

    public final Stack<Point> getStack() {
        Stack<Point> stack = new Stack<>();
        stack.addAll(this.f119823b.getMStack());
        return stack;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.b$b */
    static final class RunnableC52015b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C52013b f119835a;

        /* renamed from: b */
        final /* synthetic */ float f119836b;

        static {
            Covode.recordClassIndex(61390);
        }

        RunnableC52015b(C52013b bVar, float f) {
            this.f119835a = bVar;
            this.f119836b = f;
        }

        public final void run() {
            this.f119835a.mo87746a();
            this.f119835a.mo87748a((int) ((((float) this.f119835a.f119824c) + (((float) (this.f119835a.f119828g - this.f119835a.f119827f)) * this.f119836b)) - ((float) (this.f119835a.f119822a.getWidth() / 2))));
        }
    }

    /* renamed from: a */
    public final void mo87746a() {
        this.f119827f = this.f119824c;
        this.f119828g = getWidth() - this.f119824c;
        this.f119831j = this.f119827f - (this.f119822a.getWidth() / 2);
        this.f119832k = this.f119828g - (this.f119822a.getWidth() / 2);
    }

    /* renamed from: c */
    private final int m96752c(int i) {
        int i2 = this.f119831j;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.f119832k;
        return i > i3 ? i3 : i;
    }

    /* renamed from: a */
    public final void mo87747a(float f) {
        post(new RunnableC52015b(this, f));
    }

    /* renamed from: b */
    public final Point mo87750b(int i) {
        Point push = this.f119823b.getMStack().push(new Point(i, i, System.currentTimeMillis()));
        C89219l.m154716b(push, "");
        return push;
    }

    public final void setStack(Stack<Point> stack) {
        C89219l.m154721d(stack, "");
        this.f119823b.getMStack().clear();
        if (!C13603b.m24435a((Collection) stack)) {
            this.f119823b.getMStack().addAll(stack);
        }
        this.f119823b.invalidate();
    }

    /* renamed from: a */
    public final void mo87748a(int i) {
        if (i >= 0) {
            ViewGroup.LayoutParams layoutParams = this.f119822a.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            if (C78099c.m136517a(getContext())) {
                layoutParams2.setMarginEnd(m96752c(i));
            } else {
                layoutParams2.leftMargin = m96752c(i);
            }
            this.f119822a.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.audiorecord.b$a */
    static final class View$OnTouchListenerC52014a implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C52013b f119834a;

        static {
            Covode.recordClassIndex(61389);
        }

        View$OnTouchListenerC52014a(C52013b bVar) {
            this.f119834a = bVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            int action = motionEvent.getAction();
            if (action == 1) {
                C52013b bVar = this.f119834a;
                C89219l.m154716b(view, "");
                bVar.mo87749a(view, motionEvent.getRawX(), true);
            } else if (action == 2) {
                C52013b bVar2 = this.f119834a;
                C89219l.m154716b(view, "");
                bVar2.mo87749a(view, motionEvent.getRawX(), false);
            } else if (action == 3) {
                C52013b bVar3 = this.f119834a;
                C89219l.m154716b(view, "");
                bVar3.mo87749a(view, motionEvent.getRawX(), true);
            }
            return true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52013b(Context context, C52020e eVar) {
        super(context);
        C89219l.m154721d(context, "");
        C89219l.m154721d(eVar, "");
        MethodCollector.m26663i(11562);
        this.f119822a = new ImageView(context);
        this.f119823b = new C52011a(context);
        this.f119833l = eVar;
        MethodCollector.m26664o(11562);
    }

    /* renamed from: a */
    public final void mo87749a(View view, float f, boolean z) {
        if (!this.f119833l.f119877f) {
            mo87746a();
            int i = (int) f;
            mo87748a(m96752c(i));
            float c = ((float) ((m96752c(i) + (view.getWidth() / 2)) - this.f119824c)) / ((float) (this.f119828g - this.f119827f));
            if (((double) c) > 0.99d) {
                c = 1.0f;
            }
            if (((double) c) < 0.01d) {
                c = 0.0f;
            }
            AbstractC52047g gVar = this.f119830i;
            if (gVar != null) {
                gVar.mo87772a(c, z);
            }
        }
    }
}
