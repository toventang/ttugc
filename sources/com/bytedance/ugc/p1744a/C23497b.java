package com.bytedance.ugc.p1744a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ugc.glue.UGCTools;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ugc.a.b */
public final class C23497b {

    /* renamed from: a */
    final int f55703a = UGCTools.getPxByDp(5.0f);

    /* renamed from: b */
    public final ArrayList<Integer[]> f55704b = new ArrayList<>();

    /* renamed from: c */
    final int f55705c;

    /* renamed from: d */
    final int f55706d;

    static {
        Covode.recordClassIndex(27499);
    }

    /* renamed from: com.bytedance.ugc.a.b$b */
    static final class RunnableC23499b implements Runnable {

        /* renamed from: a */
        private final C23497b f55709a;

        /* renamed from: b */
        private final ViewGroup f55710b;

        static {
            Covode.recordClassIndex(27501);
        }

        public final void run() {
            MethodCollector.m26663i(7815);
            int childCount = this.f55710b.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = this.f55710b.getChildAt(i);
                if (childAt instanceof C23498a) {
                    this.f55710b.removeView(childAt);
                    break;
                }
                i++;
            }
            C23498a aVar = new C23498a(this.f55709a, this.f55710b.getContext());
            this.f55710b.addView(aVar, new ViewGroup.LayoutParams(-1, -1));
            aVar.setAlpha(0.1f);
            MethodCollector.m26664o(7815);
        }

        public RunnableC23499b(C23497b bVar, ViewGroup viewGroup) {
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(viewGroup, "");
            this.f55709a = bVar;
            this.f55710b = viewGroup;
        }
    }

    /* renamed from: com.bytedance.ugc.a.b$a */
    public static final class C23498a extends View {

        /* renamed from: a */
        private final Paint f55707a;

        /* renamed from: b */
        private final C23497b f55708b;

        static {
            Covode.recordClassIndex(27500);
        }

        public final void draw(Canvas canvas) {
            int i;
            super.draw(canvas);
            if (C23500c.f55711a && canvas != null) {
                for (Integer[] numArr : this.f55708b.f55704b) {
                    Paint paint = this.f55707a;
                    if (numArr[4].intValue() != 1) {
                        i = -65536;
                    } else {
                        i = -16711936;
                    }
                    paint.setColor(i);
                    canvas.drawRect((float) numArr[0].intValue(), (float) numArr[1].intValue(), (float) numArr[2].intValue(), (float) numArr[3].intValue(), this.f55707a);
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23498a(C23497b bVar, Context context) {
            super(context);
            C89219l.m154719c(bVar, "");
            MethodCollector.m26663i(7951);
            this.f55708b = bVar;
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f55707a = paint;
            MethodCollector.m26664o(7951);
        }
    }

    public C23497b(int i, int i2) {
        this.f55705c = i;
        this.f55706d = i2;
    }

    /* renamed from: a */
    public final void mo38239a(int i, int i2, int i3, int i4, int i5) {
        if (i5 != 0) {
            this.f55704b.add(new Integer[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
        }
    }
}
