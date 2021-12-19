package com.p2082ss.android.ugc.aweme.feed.helper;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.adaptation.C33416j;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.feed.model.OcrLocation;
import com.p2082ss.android.ugc.aweme.feed.model.Video;
import com.p2082ss.android.ugc.aweme.sticker.p3963k.AbstractC75401d;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.c */
public final class C49617c {

    /* renamed from: a */
    protected static int f114168a;

    /* renamed from: b */
    protected static int f114169b;

    /* renamed from: c */
    public static int f114170c;

    /* renamed from: f */
    private static int f114171f;

    /* renamed from: g */
    private static int f114172g;

    /* renamed from: d */
    public int f114173d = -1;

    /* renamed from: e */
    public int f114174e = -1;

    static {
        Covode.recordClassIndex(58464);
    }

    /* renamed from: a */
    public final void mo81412a(Context context, Video video, View view, View view2, OcrLocation ocrLocation) {
        if (video != null) {
            if (C33403c.f79374d) {
                m93051b(context, view, video.getWidth(), video.getHeight());
                m93051b(context, view2, video.getWidth(), video.getHeight());
                return;
            }
            mo81411a(context, view, video.getWidth(), video.getHeight());
            mo81411a(context, view2, video.getWidth(), video.getHeight());
        }
    }

    /* renamed from: a */
    public final void mo81413a(Context context, Video video, View view, OcrLocation ocrLocation) {
        if (video != null) {
            if (C33403c.f79374d) {
                m93051b(context, view, video.getWidth(), video.getHeight());
            } else {
                mo81411a(context, view, video.getWidth(), video.getHeight());
            }
        }
    }

    /* renamed from: a */
    private static int m93043a() {
        return (m93054c() - C33403c.m68502a()) - C33403c.C33406b.f79409a.f79384i;
    }

    /* renamed from: b */
    private static int m93049b() {
        return m93054c() - C33403c.C33406b.f79409a.f79382g;
    }

    /* renamed from: c */
    private static int m93054c() {
        if (Build.VERSION.SDK_INT < 28 || !C33403c.C33406b.f79409a.f79389r) {
            return f114172g;
        }
        return f114169b;
    }

    /* renamed from: a */
    public static void m93044a(Context context) {
        try {
            f114170c = C13628n.m24525e(context);
            f114171f = C34723i.m70929c();
            m93050b(context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static void m93046a(View view) {
        if (view.getLayoutParams() == null) {
            view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
        }
        if (view.getLayoutParams().width != -1 || view.getLayoutParams().height != -1) {
            view.getLayoutParams().width = -1;
            view.getLayoutParams().height = -1;
            view.requestLayout();
        }
    }

    /* renamed from: b */
    private static void m93050b(Context context) {
        if (C33416j.m68520a()) {
            int i = Build.VERSION.SDK_INT;
            Display defaultDisplay = ((Activity) context).getWindowManager().getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getRealMetrics(displayMetrics);
            f114172g = displayMetrics.heightPixels;
            f114169b = C33416j.m68521b();
            f114168a = C33416j.m68522c();
            return;
        }
        int i2 = Build.VERSION.SDK_INT;
        Display defaultDisplay2 = ((Activity) context).getWindowManager().getDefaultDisplay();
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        defaultDisplay2.getRealMetrics(displayMetrics2);
        f114172g = displayMetrics2.heightPixels;
        f114169b = displayMetrics2.heightPixels + f114170c;
        f114168a = displayMetrics2.widthPixels;
    }

    /* renamed from: a */
    public final AbstractC75401d.C75402a mo81410a(Context context, Video video) {
        MethodCollector.m26663i(3798);
        if (video == null) {
            MethodCollector.m26664o(3798);
            return null;
        }
        AbstractC75401d.C75402a aVar = new AbstractC75401d.C75402a(video.getWidth(), video.getHeight());
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.MarginLayoutParams(0, 0));
        if (C33403c.f79374d) {
            m93052b(context, view, video.getWidth(), video.getHeight(), aVar);
        } else {
            m93045a(context, view, video.getWidth(), video.getHeight(), aVar);
        }
        MethodCollector.m26664o(3798);
        return aVar;
    }

    /* renamed from: a */
    private static void m93047a(View view, int i, int i2) {
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (marginLayoutParams.width == i2 && marginLayoutParams.height == i) {
                int i3 = Build.VERSION.SDK_INT;
                return;
            }
            marginLayoutParams.width = i2;
            marginLayoutParams.height = i;
            view.setLayoutParams(marginLayoutParams);
            view.setRotation(0.0f);
        }
    }

    /* renamed from: b */
    private void m93051b(Context context, View view, int i, int i2) {
        m93052b(context, view, i, i2, null);
    }

    /* renamed from: a */
    public final void mo81411a(Context context, View view, int i, int i2) {
        m93045a(context, view, i, i2, (AbstractC75401d.C75402a) null);
    }

    /* renamed from: a */
    private void m93045a(Context context, View view, int i, int i2, AbstractC75401d.C75402a aVar) {
        int i3;
        int i4 = Build.VERSION.SDK_INT;
        if (f114169b == 0 || f114168a == 0) {
            m93050b(context);
        }
        int i5 = f114168a;
        double d = (double) i5;
        int i6 = f114169b;
        double d2 = (double) i6;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        int i7 = 0;
        if (d3 <= 0.5d) {
            if (C33403c.C33406b.f79409a.f79383h != 0) {
                i3 = C33403c.C33406b.f79409a.f79385j;
                if (i3 == 0) {
                    i3 = m93054c() - C33403c.C33406b.f79409a.f79382g;
                }
                m93055c(view, i, i2, i3, f114168a, aVar);
            } else if (C33403c.C33406b.f79409a.f79388q) {
                i3 = m93043a();
            } else {
                i3 = m93049b();
            }
            if (!C33403c.C33406b.f79409a.f79386k) {
                i3 -= C33403c.C33406b.f79409a.f79383h;
            }
            m93055c(view, i, i2, i3, f114168a, aVar);
        } else if (d3 >= 0.6666666666666666d) {
            m93048a(view, i, i2, i5, i6, aVar);
        } else {
            int i8 = f114172g;
            if (C33403c.C33406b.f79409a.f79388q) {
                i7 = C33403c.m68502a();
            }
            m93053b(view, i, i2, (i8 - i7) - C33403c.C33406b.f79409a.f79382g, f114168a, aVar);
        }
    }

    /* renamed from: b */
    private void m93052b(Context context, View view, int i, int i2, AbstractC75401d.C75402a aVar) {
        int i3 = Build.VERSION.SDK_INT;
        if (f114169b == 0 || f114168a == 0) {
            m93050b(context);
        }
        int i4 = C33403c.C33406b.f79409a.f79385j;
        int i5 = f114168a;
        double d = (double) i5;
        int i6 = f114169b;
        double d2 = (double) i6;
        Double.isNaN(d);
        Double.isNaN(d2);
        if (d / d2 <= 0.5d) {
            m93055c(view, i, i2, i4, i5, aVar);
            return;
        }
        double d3 = (double) i5;
        double d4 = (double) i6;
        Double.isNaN(d3);
        Double.isNaN(d4);
        if (d3 / d4 >= 0.6666666666666666d) {
            m93048a(view, i, i2, i5, i6, aVar);
        } else {
            m93053b(view, i, i2, i4, i5, aVar);
        }
    }

    /* renamed from: c */
    private void m93055c(View view, int i, int i2, int i3, int i4, AbstractC75401d.C75402a aVar) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) i4;
        double d5 = (double) i3;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        if (d3 > 0.625d || d6 > 0.625d || d3 < 0.4699999988079071d) {
            if (i <= 0 || i2 <= 0) {
                i3 = i4;
            } else {
                i3 = (i2 * i4) / i;
            }
        } else if (i <= 0 || i2 <= 0) {
            i4 = i3;
        } else {
            i4 = (i * i3) / i2;
        }
        if (aVar != null) {
            aVar.f169476a = i4;
            aVar.f169477b = i3;
        }
        this.f114173d = i3;
        this.f114174e = i4;
        if (view != null) {
            m93047a(view, i3, i4);
        }
    }

    /* renamed from: a */
    private static void m93048a(View view, int i, int i2, int i3, int i4, AbstractC75401d.C75402a aVar) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        if (d / d2 > 1.0d) {
            if (i <= 0 || i2 <= 0) {
                i4 = i3;
            } else {
                i4 = (i2 * i3) / i;
            }
        } else if (i <= 0 || i2 <= 0) {
            i3 = i4;
        } else {
            i3 = (i * i4) / i2;
        }
        if (aVar != null) {
            aVar.f169476a = i3;
            aVar.f169477b = i4;
        }
        m93047a(view, i4, i3);
    }

    /* renamed from: b */
    private void m93053b(View view, int i, int i2, int i3, int i4, AbstractC75401d.C75402a aVar) {
        double d = (double) i;
        double d2 = (double) i2;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = d / d2;
        double d4 = (double) i4;
        double d5 = (double) i3;
        Double.isNaN(d4);
        Double.isNaN(d5);
        double d6 = d4 / d5;
        if (d3 > 0.5625d || d6 > 0.5625d || d3 < 0.4699999988079071d) {
            if (i <= 0 || i2 <= 0) {
                i3 = i4;
            } else {
                i3 = (i2 * i4) / i;
            }
        } else if (i <= 0 || i2 <= 0) {
            i4 = i3;
        } else {
            i4 = (i * i3) / i2;
        }
        if (aVar != null) {
            aVar.f169476a = i4;
            aVar.f169477b = i3;
        }
        this.f114174e = i4;
        this.f114173d = i3;
        if (view != null) {
            m93047a(view, i3, i4);
        }
    }
}
