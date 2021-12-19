package com.p2082ss.ugc.live.barrage.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a;
import com.p2082ss.ugc.live.barrage.p4468b.AbstractC87059a;
import java.util.ArrayList;
import java.util.Iterator;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.live.barrage.view.BarrageLayout */
public final class BarrageLayout extends View {

    /* renamed from: a */
    private final ArrayList<AbstractC87059a> f196293a;

    /* renamed from: b */
    private AbstractC87059a f196294b;

    static {
        Covode.recordClassIndex(102835);
    }

    public BarrageLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: a */
    public final void mo140687a() {
        Iterator<AbstractC87059a> it = this.f196293a.iterator();
        while (it.hasNext()) {
            it.next().mo13469a();
        }
    }

    public final void draw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
        super.draw(canvas);
        Iterator<AbstractC87059a> it = this.f196293a.iterator();
        while (it.hasNext()) {
            C89219l.m154719c(canvas, "");
            Iterator it2 = it.next().f196276e.iterator();
            while (it2.hasNext()) {
                ((AbstractC87048a) it2.next()).mo13468a(canvas);
            }
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        AbstractC87059a aVar;
        C89219l.m154719c(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            Iterator<AbstractC87059a> it = this.f196293a.iterator();
            while (it.hasNext()) {
                AbstractC87059a next = it.next();
                if (next.mo140681a(motionEvent)) {
                    this.f196294b = next;
                    return true;
                }
            }
        } else if (action == 1) {
            AbstractC87059a aVar2 = this.f196294b;
            if (aVar2 != null) {
                return aVar2.mo140681a(motionEvent);
            }
            this.f196294b = null;
        } else if ((action == 2 || action == 3) && (aVar = this.f196294b) != null) {
            return aVar.mo140681a(motionEvent);
        }
        return super.onTouchEvent(motionEvent);
    }

    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m150804a(AbstractC87059a aVar, int i) {
        if (aVar != null) {
            if (i > this.f196293a.size() || i < 0) {
                throw new ArrayIndexOutOfBoundsException();
            }
            this.f196293a.add(i, aVar);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BarrageLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BarrageLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(13168);
        this.f196293a = new ArrayList<>();
        MethodCollector.m26664o(13168);
    }
}
