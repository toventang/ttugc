package com.bytedance.ugc.p1744a;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.p1744a.C23487a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ugc.a.c */
public final class C23500c {

    /* renamed from: a */
    static boolean f55711a;

    /* renamed from: b */
    public static final C23500c f55712b = new C23500c();

    /* renamed from: com.bytedance.ugc.a.c$a */
    public static abstract class AbstractC23501a {

        /* renamed from: b */
        public static final C23502a f55713b = new C23502a((byte) 0);

        static {
            Covode.recordClassIndex(27503);
        }

        /* renamed from: a */
        public abstract boolean mo19176a(C23497b bVar, View view, int i, int i2, int i3, int i4, int i5, int i6, AbstractC23501a aVar);

        /* renamed from: com.bytedance.ugc.a.c$a$a */
        public static final class C23502a {
            static {
                Covode.recordClassIndex(27504);
            }

            private C23502a() {
            }

            public /* synthetic */ C23502a(byte b) {
                this();
            }

            /* renamed from: a */
            public static int m44203a(Drawable drawable) {
                while (drawable instanceof StateListDrawable) {
                    drawable = ((StateListDrawable) drawable).getCurrent();
                }
                if (drawable == null) {
                    return 0;
                }
                if (drawable instanceof ColorDrawable) {
                    int color = ((ColorDrawable) drawable).getColor();
                    if (Color.alpha(color) < 5) {
                        return 0;
                    }
                    int red = Color.red(color);
                    int green = Color.green(color);
                    int blue = Color.blue(color);
                    if (red <= 240 || green <= 240 || blue <= 240) {
                        return 1;
                    }
                    return 2;
                }
                return 1;
            }

            /* renamed from: a */
            public static boolean m44204a(View view) {
                C89219l.m154719c(view, "");
                C89219l.m154719c(view, "");
                if (view.getVisibility() != 0 || ((double) view.getAlpha()) < 0.05d || ((double) view.getScaleX()) < 0.01d || ((double) view.getScaleY()) < 0.01d) {
                    return true;
                }
                return false;
            }
        }
    }

    /* renamed from: com.bytedance.ugc.a.c$b */
    public interface AbstractC23503b {
        static {
            Covode.recordClassIndex(27505);
        }

        /* renamed from: a */
        int mo38242a();
    }

    /* renamed from: com.bytedance.ugc.a.c$c */
    public static abstract class AbstractC23504c {
        static {
            Covode.recordClassIndex(27506);
        }

        /* renamed from: a */
        public abstract void mo19173a(View view, String str, int i, int i2, int i3);
    }

    /* renamed from: com.bytedance.ugc.a.c$d */
    public static abstract class AbstractC23505d {
        static {
            Covode.recordClassIndex(27507);
        }

        /* renamed from: a */
        public void mo19174a(String str, long j) {
            C89219l.m154719c(str, "");
        }

        /* renamed from: b */
        public void mo19175b(String str, long j) {
            C89219l.m154719c(str, "");
        }
    }

    private C23500c() {
    }

    static {
        Covode.recordClassIndex(27502);
    }

    /* renamed from: b */
    public static void m44201b(View view, String str, AbstractC23501a aVar, AbstractC23504c cVar, AbstractC23505d dVar) {
        C89219l.m154719c(view, "");
        C89219l.m154719c(str, "");
        C89219l.m154719c(view, "");
        C89219l.m154719c(str, "");
        new C23487a.RunnableC23489b(view, str, aVar, null, cVar, dVar).run();
    }

    /* renamed from: com.bytedance.ugc.a.c$e */
    public static abstract class AbstractC23506e<T extends View> extends AbstractC23501a {
        static {
            Covode.recordClassIndex(27508);
        }

        /* renamed from: a */
        public abstract int mo38237a(T t);

        /* renamed from: b */
        public abstract T mo38238b(View view);

        @Override // com.bytedance.ugc.p1744a.C23500c.AbstractC23501a
        /* renamed from: a */
        public final boolean mo19176a(C23497b bVar, View view, int i, int i2, int i3, int i4, int i5, int i6, AbstractC23501a aVar) {
            int a;
            C89219l.m154719c(bVar, "");
            C89219l.m154719c(view, "");
            T b = mo38238b(view);
            if (b == null) {
                return false;
            }
            if (AbstractC23501a.C23502a.m44204a(view)) {
                a = 0;
            } else {
                a = mo38237a(b);
                if (a == 0) {
                    C89219l.m154719c(b, "");
                    a = AbstractC23501a.C23502a.m44203a(view.getBackground());
                }
            }
            bVar.mo38239a(i3, i4, i5, i6, a);
            return true;
        }
    }
}
