package com.p2082ss.android.ugc.aweme.commercialize.preview.p2611d;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.commercialize.preview.p2611d.p2612a.C38316a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.preview.d.a */
public final class C38313a {

    /* renamed from: a */
    public static final int f90537a = R.string.q4;

    /* renamed from: b */
    public static final C38314a f90538b = new C38314a((byte) 0);

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.d.a$a */
    public static final class C38314a {
        static {
            Covode.recordClassIndex(45802);
        }

        private C38314a() {
        }

        public /* synthetic */ C38314a(byte b) {
            this();
        }

        /* renamed from: a */
        public static void m77704a(ViewGroup viewGroup) {
            MethodCollector.m26663i(12171);
            C89219l.m154721d(viewGroup, "");
            viewGroup.removeView(viewGroup.findViewById(R.id.hd));
            MethodCollector.m26664o(12171);
        }

        /* renamed from: a */
        public static void m77703a(Context context, ViewGroup viewGroup, C38316a aVar) {
            MethodCollector.m26663i(12042);
            C89219l.m154721d(context, "");
            C89219l.m154721d(viewGroup, "");
            C38315b bVar = new C38315b(aVar, context);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.hd);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.setBackground(bVar);
            viewGroup.addView(frameLayout);
            MethodCollector.m26664o(12042);
        }
    }

    static {
        Covode.recordClassIndex(45801);
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.preview.d.a$b */
    public static final class C38315b extends Drawable {

        /* renamed from: a */
        public String f90539a;

        /* renamed from: b */
        public int f90540b;

        /* renamed from: c */
        public float f90541c;

        /* renamed from: d */
        public float f90542d;

        /* renamed from: e */
        public int f90543e;

        /* renamed from: f */
        public int f90544f;

        /* renamed from: g */
        private final Paint f90545g;

        static {
            Covode.recordClassIndex(45803);
        }

        public final int getOpacity() {
            return -3;
        }

        public final void setAlpha(int i) {
        }

        public final void setColorFilter(ColorFilter colorFilter) {
        }

        public final void draw(Canvas canvas) {
            C89219l.m154721d(canvas, "");
            this.f90545g.setColor(this.f90540b);
            this.f90545g.setTextSize(this.f90541c);
            this.f90545g.setAntiAlias(true);
            float f = (float) getBounds().right;
            float f2 = (float) getBounds().bottom;
            float measureText = this.f90545g.measureText(this.f90539a);
            canvas.drawColor(0);
            int i = this.f90544f;
            float f3 = 0.0f;
            for (int i2 = 0; i2 < i; i2++) {
                float f4 = (-measureText) / 2.0f;
                int i3 = this.f90543e;
                for (int i4 = 0; i4 < i3; i4++) {
                    canvas.save();
                    canvas.translate(f4, f3);
                    canvas.rotate(this.f90542d);
                    canvas.drawText(this.f90539a, 0.0f, 0.0f, this.f90545g);
                    canvas.restore();
                    f4 += f / ((float) (this.f90543e - 1));
                }
                f3 += f2 / ((float) this.f90544f);
            }
            canvas.save();
            canvas.restore();
        }

        public C38315b(C38316a aVar, Context context) {
            String str;
            int i;
            float b;
            float f;
            int i2;
            int i3;
            C89219l.m154721d(context, "");
            if (aVar == null || (str = aVar.f90546a) == null) {
                str = context.getString(C38313a.f90537a);
                C89219l.m154716b(str, "");
            }
            this.f90539a = str;
            if (aVar != null) {
                i = aVar.f90547b;
            } else {
                i = 520093695;
            }
            this.f90540b = i;
            if (aVar != null) {
                b = aVar.f90548c;
            } else {
                b = C13628n.m24520b(context, 18.0f);
            }
            this.f90541c = b;
            if (aVar != null) {
                f = aVar.f90549d;
            } else {
                f = -15.0f;
            }
            this.f90542d = f;
            if (aVar != null) {
                i2 = aVar.f90550e;
            } else {
                i2 = 3;
            }
            this.f90543e = i2;
            if (aVar != null) {
                i3 = aVar.f90551f;
            } else {
                i3 = 10;
            }
            this.f90544f = i3;
            this.f90545g = new Paint();
        }
    }
}
