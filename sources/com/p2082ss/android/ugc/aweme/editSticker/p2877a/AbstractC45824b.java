package com.p2082ss.android.ugc.aweme.editSticker.p2877a;

import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.C23342c;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23319b;
import com.bytedance.tux.tooltip.p1727a.p1728a.C23322d;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45902g;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.widget.AVAutoRTLImageView;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.a.b */
public abstract class AbstractC45824b {

    /* renamed from: j */
    public static final List<AbstractC45824b> f106776j = new ArrayList();

    /* renamed from: k */
    public static final C45825a f106777k = new C45825a((byte) 0);

    /* renamed from: a */
    public boolean f106778a;

    /* renamed from: b */
    public boolean f106779b;

    /* renamed from: c */
    public C45841l f106780c;

    /* renamed from: d */
    public AbstractC23317a f106781d;

    /* renamed from: e */
    public final Context f106782e;

    /* renamed from: f */
    public final C45902g f106783f = new C45902g();

    /* renamed from: g */
    public int f106784g = 1;

    /* renamed from: h */
    public final View f106785h;

    /* renamed from: i */
    public final AbstractC45840k f106786i;

    /* renamed from: l */
    private final Handler f106787l = new Handler();

    /* renamed from: m */
    private EnumC23352h f106788m = EnumC23352h.TOP;

    /* renamed from: a */
    public boolean mo77175a(C23322d dVar) {
        C89219l.m154721d(dVar, "");
        return false;
    }

    /* renamed from: c */
    public abstract View mo77177c();

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.b$a */
    public static final class C45825a {
        static {
            Covode.recordClassIndex(54348);
        }

        private C45825a() {
        }

        public /* synthetic */ C45825a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo77172a() {
        AbstractC23317a aVar = this.f106781d;
        if (aVar != null) {
            aVar.dismiss();
        }
    }

    /* renamed from: f */
    public final void mo77180f() {
        f106776j.add(this);
    }

    /* renamed from: g */
    public final void mo77181g() {
        f106776j.remove(this);
    }

    /* renamed from: b */
    public final void mo77176b() {
        this.f106787l.removeCallbacksAndMessages(null);
        C45841l lVar = this.f106780c;
        if (lVar != null) {
            lVar.isShowing();
        }
        this.f106780c = null;
    }

    static {
        Covode.recordClassIndex(54347);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final LinearLayout mo77178d() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout = new LinearLayout(this.f106782e);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(1);
        linearLayout.setMinimumWidth((int) C84912r.m145930a(this.f106782e, 104.0f));
        linearLayout.setGravity(16);
        return linearLayout;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final View mo77179e() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, (int) C84912r.m145930a(this.f106782e, 0.5f));
        View view = new View(this.f106782e);
        layoutParams.leftMargin = (int) C84912r.m145930a(this.f106782e, 12.0f);
        layoutParams.rightMargin = (int) C84912r.m145930a(this.f106782e, 12.0f);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(C0643b.m2378c(this.f106782e, R.color.a9));
        view.setAlpha(0.2f);
        return view;
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.a.b$b */
    static final class C45826b extends AbstractC89220m implements AbstractC89172b<C23322d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC45824b f106789a;

        static {
            Covode.recordClassIndex(54349);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45826b(AbstractC45824b bVar) {
            super(1);
            this.f106789a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23322d dVar) {
            C23322d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            this.f106789a.mo77175a(dVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    private static Context m88436a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (C58003a.f132201c && applicationContext == null) {
            return C58003a.f132199a;
        }
        return applicationContext;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo77173a(int i) {
        if (i > 0) {
            this.f106784g = i;
        }
    }

    public AbstractC45824b(View view, AbstractC45840k kVar) {
        C89219l.m154721d(view, "");
        this.f106785h = view;
        this.f106786i = kVar;
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f106782e = context;
    }

    /* renamed from: a */
    private static Object m88438a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    /* renamed from: a */
    private boolean m88439a(PointF pointF, boolean z) {
        C89219l.m154721d(pointF, "");
        float a = C84912r.m145930a(this.f106782e, 41.0f);
        float a2 = C84912r.m145930a(this.f106782e, 12.0f);
        float a3 = (a * ((float) this.f106784g)) + a2 + C84912r.m145930a(this.f106782e, 60.0f);
        Object a4 = m88438a(m88436a(this.f106782e), "window");
        Objects.requireNonNull(a4, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) a4).getDefaultDisplay();
        C89219l.m154716b(defaultDisplay, "");
        int width = defaultDisplay.getWidth();
        int height = defaultDisplay.getHeight();
        if (z) {
            if (pointF.x < 0.0f || pointF.y < a3 || pointF.x > ((float) width)) {
                return true;
            }
            return false;
        } else if (pointF.x < 0.0f || pointF.x > ((float) width) || pointF.y > ((float) height) - a3) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static float[] m88440a(RectF rectF, float f) {
        float[] fArr = {rectF.left, rectF.top, rectF.right, rectF.top, rectF.left, rectF.bottom, rectF.right, rectF.bottom};
        Matrix matrix = new Matrix();
        matrix.postRotate(f, ((fArr[2] - fArr[0]) / 2.0f) + fArr[0], ((fArr[5] - fArr[3]) / 2.0f) + fArr[3]);
        matrix.mapPoints(fArr);
        return fArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final LinearLayout mo77171a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, (int) C84912r.m145930a(this.f106782e, 44.0f));
        LinearLayout linearLayout = new LinearLayout(this.f106782e);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setMinimumWidth((int) C84912r.m145930a(this.f106782e, 104.0f));
        TuxTextView tuxTextView = new TuxTextView(this.f106782e, null, 0, 6);
        tuxTextView.setTextColor(C0643b.m2378c(this.f106782e, R.color.a9));
        tuxTextView.setTuxFont(62);
        tuxTextView.setMaxLines(1);
        tuxTextView.setGravity(16);
        tuxTextView.setText(this.f106782e.getString(i2));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        int i3 = Build.VERSION.SDK_INT;
        layoutParams2.setMarginStart((int) C84912r.m145930a(this.f106782e, 4.0f));
        layoutParams2.setMarginEnd((int) C84912r.m145930a(this.f106782e, 12.0f));
        tuxTextView.setLayoutParams(layoutParams2);
        AVAutoRTLImageView aVAutoRTLImageView = new AVAutoRTLImageView(this.f106782e);
        aVAutoRTLImageView.setImageResource(i);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        int i4 = Build.VERSION.SDK_INT;
        if (C84912r.m145935c(this.f106782e)) {
            layoutParams3.setMarginEnd((int) C84912r.m145930a(this.f106782e, 12.0f));
        } else {
            layoutParams3.setMarginStart((int) C84912r.m145930a(this.f106782e, 12.0f));
        }
        aVAutoRTLImageView.setLayoutParams(layoutParams3);
        linearLayout.addView(aVAutoRTLImageView, 0);
        linearLayout.addView(tuxTextView, 1);
        int i5 = Build.VERSION.SDK_INT;
        aVAutoRTLImageView.setLayoutDirection(0);
        return linearLayout;
    }

    /* renamed from: a */
    private static PointF m88437a(RectF rectF, float f, boolean z) {
        PointF pointF = new PointF();
        float[] a = m88440a(rectF, f);
        if (a[1] + a[3] >= a[5] + a[7] || z) {
            pointF.set((a[4] + a[6]) / 2.0f, (a[5] + a[7]) / 2.0f);
        } else {
            pointF.set((a[0] + a[2]) / 2.0f, (a[1] + a[3]) / 2.0f);
        }
        return pointF;
    }

    /* renamed from: a */
    public void mo77174a(RectF rectF, int i, int i2, float f, boolean z) {
        C89219l.m154721d(rectF, "");
        PointF a = m88437a(rectF, f, false);
        this.f106788m = EnumC23352h.TOP;
        if (m88439a(a, true)) {
            a = m88437a(rectF, f, true);
            this.f106788m = EnumC23352h.BOTTOM;
            if (m88439a(a, false)) {
                a.x = (float) i;
                a.y = (float) i2;
                this.f106788m = EnumC23352h.TOP;
            }
        }
        if (mo77175a(new C23322d(this.f106782e))) {
            C23319b bVar = new C23319b(this.f106782e);
            ((C23319b) bVar.mo38028a(C0643b.m2378c(this.f106782e, R.color.c7)).mo38034a(this.f106788m)).mo38011a(new C45826b(this)).mo38029a((int) a.x, (int) a.y).mo38030a(-1001L);
            AbstractC23317a d = bVar.mo38012d();
            this.f106781d = d;
            if (d == null) {
                C89219l.m154715b();
            }
            d.mo38001a();
            return;
        }
        AbstractC23317a d2 = new C23342c(this.f106782e).mo38028a(C0643b.m2378c(this.f106782e, R.color.c7)).mo38029a((int) a.x, (int) a.y).mo38034a(this.f106788m).mo38031a(mo77177c()).mo38037a(true, (View.OnClickListener) null).mo38036a(true).mo38030a(-1001L).mo38012d();
        this.f106781d = d2;
        if (d2 == null) {
            C89219l.m154715b();
        }
        d2.mo38001a();
    }
}
