package com.p2082ss.android.ugc.aweme.editSticker.text.view;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.tux.tooltip.AbstractC23317a;
import com.bytedance.tux.tooltip.EnumC23352h;
import com.bytedance.tux.tooltip.p1727a.p1729b.C23329a;
import com.p2082ss.android.ttve.utils.C30745b;
import com.p2082ss.android.ugc.aweme.editSticker.C45866d;
import com.p2082ss.android.ugc.aweme.editSticker.C45890g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45902g;
import com.p2082ss.android.ugc.aweme.editSticker.p2880d.AbstractC45873f;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45880a;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45886d;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46109s;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45995c;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46117c;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46120f;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2887c.AbstractC46122h;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.p3890a.C74268b;
import com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d;
import com.p2082ss.android.ugc.tools.utils.C84892d;
import com.p2082ss.android.ugc.tools.view.C84916a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.i */
public class C46224i extends FrameLayout {

    /* renamed from: A */
    public boolean f107678A = true;

    /* renamed from: B */
    public AbstractC46122h f107679B;

    /* renamed from: C */
    public AbstractC45873f f107680C;

    /* renamed from: D */
    public AbstractC46231c f107681D;

    /* renamed from: E */
    public List<InteractTextStructWrap> f107682E = new ArrayList();

    /* renamed from: F */
    public int f107683F = 0;

    /* renamed from: G */
    protected boolean f107684G = false;

    /* renamed from: H */
    public boolean f107685H = false;

    /* renamed from: I */
    public AbstractC46229a f107686I = null;

    /* renamed from: J */
    public boolean f107687J = false;

    /* renamed from: K */
    public AbstractC23317a f107688K = null;

    /* renamed from: L */
    protected int f107689L = 1;

    /* renamed from: M */
    AbstractC46230b f107690M;

    /* renamed from: N */
    private View f107691N;

    /* renamed from: O */
    private View f107692O;

    /* renamed from: P */
    private View f107693P;

    /* renamed from: a */
    private Context f107694a;

    /* renamed from: b */
    private boolean f107695b = true;

    /* renamed from: c */
    private InputMethodManager f107696c;

    /* renamed from: d */
    private AbstractC46120f f107697d;

    /* renamed from: e */
    private AbstractC46117c f107698e;

    /* renamed from: f */
    private View f107699f;

    /* renamed from: g */
    protected View f107700g;

    /* renamed from: h */
    public TextStickerEditText f107701h;

    /* renamed from: i */
    protected ColorSelectLayout f107702i;

    /* renamed from: j */
    protected ImageView f107703j;

    /* renamed from: k */
    protected ImageView f107704k;

    /* renamed from: l */
    public ImageView f107705l;

    /* renamed from: m */
    protected int f107706m = 1;

    /* renamed from: n */
    protected int f107707n = -1;

    /* renamed from: o */
    protected int f107708o = 2;

    /* renamed from: p */
    protected int f107709p = -1;

    /* renamed from: q */
    protected View f107710q;

    /* renamed from: r */
    protected C46220g f107711r;

    /* renamed from: s */
    protected LinearLayout f107712s;

    /* renamed from: t */
    public C46239q f107713t;

    /* renamed from: u */
    View f107714u;

    /* renamed from: v */
    public LinearLayout f107715v;

    /* renamed from: w */
    protected String f107716w;

    /* renamed from: x */
    protected String f107717x;

    /* renamed from: y */
    protected boolean f107718y;

    /* renamed from: z */
    protected boolean f107719z;

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.i$a */
    public interface AbstractC46229a {
        static {
            Covode.recordClassIndex(54791);
        }

        /* renamed from: a */
        void mo78528a(String str, C46239q qVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.i$b */
    public interface AbstractC46230b {
        static {
            Covode.recordClassIndex(54792);
        }

        /* renamed from: a */
        void mo77584a();
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.view.i$c */
    public interface AbstractC46231c {
        static {
            Covode.recordClassIndex(54793);
        }

        /* renamed from: a */
        void mo77582a();

        /* renamed from: b */
        void mo77583b();
    }

    static {
        Covode.recordClassIndex(54786);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo78495e() {
    }

    /* access modifiers changed from: protected */
    public int getLayoutRes() {
        return R.layout.zf;
    }

    /* access modifiers changed from: protected */
    public int getScene() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public void setEffectText(List<TextStickerTextWrap> list) {
    }

    public int getAlignTxt() {
        return this.f107708o;
    }

    public int getCurColor() {
        return this.f107709p;
    }

    public int getCurTxtMode() {
        return this.f107706m;
    }

    public EditText getEditText() {
        return this.f107701h;
    }

    public AbstractC46231c getVisibleController() {
        return this.f107681D;
    }

    /* renamed from: i */
    public final boolean mo78513i() {
        if (!this.f107695b) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    private void m89151m() {
        C46220g gVar = this.f107711r;
        if (gVar != null) {
            gVar.mo78483a(C45989b.m88764a().mo77594b());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo78324b() {
        InputMethodManager inputMethodManager;
        if (this.f107701h != null && (inputMethodManager = this.f107696c) != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
    }

    public Point getEditPageSize() {
        return new Point(getWidth(), getHeight());
    }

    public TextStickerTextWrap getTextWrap() {
        return C46110t.m88958a(this.f107701h, this.f107682E);
    }

    public List<TextStickerTextWrap> getTextWrapList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(getTextWrap());
        return arrayList;
    }

    private int getEditTextLength() {
        if (this.f107701h.getText() != null) {
            return this.f107701h.getText().length();
        }
        return 0;
    }

    /* renamed from: c */
    public void mo78325c() {
        InputMethodManager inputMethodManager;
        TextStickerEditText textStickerEditText = this.f107701h;
        if (textStickerEditText != null && (inputMethodManager = this.f107696c) != null) {
            inputMethodManager.hideSoftInputFromWindow(textStickerEditText.getWindowToken(), 0);
        }
    }

    /* renamed from: d */
    public final void mo78494d() {
        ImageView imageView = this.f107705l;
        if (imageView != null) {
            imageView.setClickable(false);
            this.f107705l.setAlpha(0.5f);
            this.f107705l.setImageResource(2131232698);
        }
    }

    public Point getEditInputCenterPoint() {
        return new Point(C30745b.m63131a(this.f107694a) / 2, ((int) C30745b.m63132b(this.f107694a, 52.0f)) + (this.f107691N.getHeight() / 2));
    }

    public String getEditTextStr() {
        if (this.f107701h.getText() != null) {
            return this.f107701h.getText().toString();
        }
        return "";
    }

    /* renamed from: h */
    public final void mo78512h() {
        AbstractC23317a aVar = this.f107688K;
        if (aVar != null) {
            aVar.dismiss();
        }
        if (!this.f107695b) {
            C45880a.m88522b(this);
            this.f107695b = true;
            AbstractC46120f fVar = this.f107697d;
            if (fVar != null) {
                fVar.mo77581b();
            }
        }
    }

    /* renamed from: k */
    private void m89149k() {
        int i = this.f107708o;
        if (i == 2) {
            this.f107704k.setImageResource(2131232447);
        } else if (i == 1) {
            this.f107704k.setImageResource(2131232451);
        } else if (i == 3) {
            this.f107704k.setImageResource(2131232452);
        }
    }

    /* renamed from: l */
    private void m89150l() {
        int i = this.f107706m;
        if (i == 1) {
            this.f107703j.setImageResource(2131232450);
        } else if (i == 2) {
            this.f107703j.setImageResource(2131232446);
        } else if (i == 3) {
            this.f107703j.setImageResource(2131232458);
        } else if (i == 4) {
            this.f107703j.setImageResource(2131232457);
        }
    }

    /* renamed from: a */
    public void mo78321a() {
        this.f107711r.mo78481a();
        this.f107706m = 1;
        this.f107707n = -1;
        int i = C46109s.m88954a().mo78297b().f107365b;
        this.f107709p = i;
        this.f107708o = 2;
        this.f107701h.mo78446a(this.f107706m, i);
        this.f107701h.mo78447a("", 0);
    }

    /* renamed from: g */
    public final void mo78497g() {
        C45880a.m88521a(this);
        AbstractC46120f fVar = this.f107697d;
        if (fVar != null) {
            fVar.mo77580a();
        }
        if (C84892d.m145850a(C45989b.m88764a().mo77594b())) {
            C45866d.m88492e().mo77255a(getContext(), R.string.b1c);
        }
    }

    public Point getEditInputScreenCenterPoint() {
        int[] iArr = new int[2];
        this.f107691N.getLocationOnScreen(iArr);
        Point point = new Point(this.f107691N.getWidth() / 2, this.f107691N.getHeight() / 2);
        return new Point(iArr[0] + point.x, iArr[1] + point.y);
    }

    public Point getReadIconPosition() {
        ImageView imageView = this.f107705l;
        if (imageView == null || imageView.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        this.f107705l.getLocationOnScreen(iArr);
        iArr[0] = iArr[0] + (this.f107705l.getWidth() / 2);
        return new Point(iArr[0], iArr[1]);
    }

    /* access modifiers changed from: protected */
    public int getTopMargin() {
        int identifier;
        Context context = getContext();
        if (context != null && (identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android")) > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final /* synthetic */ void mo78514j() {
        int i = this.f107708o;
        if (i == 2) {
            this.f107708o = 1;
        } else if (i == 1) {
            this.f107708o = 3;
        } else if (i == 3) {
            this.f107708o = 2;
        }
        m89149k();
        this.f107701h.setAligin(this.f107708o);
        int i2 = this.f107708o;
        String str = "center";
        if (i2 != 2) {
            if (i2 == 1) {
                str = "left";
            } else if (i2 == 3) {
                str = "right";
            }
        }
        AbstractC46122h hVar = this.f107679B;
        if (hVar != null) {
            hVar.mo78315a(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        if (r1 == 4) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo78496f() {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.editSticker.e r0 = com.p2082ss.android.ugc.aweme.editSticker.C45890g.m88534a()
            com.ss.android.ugc.aweme.editSticker.f r0 = r0.f106862b
            boolean r0 = r0.f106870a
            r6 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0048
            int r0 = r7.f107706m
            if (r0 != r3) goto L_0x003b
            r7.f107706m = r6
        L_0x0014:
            r7.m89150l()
            com.ss.android.ugc.aweme.editSticker.text.view.TextStickerEditText r2 = r7.f107701h
            int r1 = r7.f107706m
            int r0 = r7.f107709p
            r2.mo78446a(r1, r0)
            int r1 = r7.f107706m
            r7.f107707n = r1
            r0 = 0
            if (r1 != r3) goto L_0x0030
        L_0x0027:
            r5 = 0
        L_0x0028:
            com.ss.android.ugc.aweme.editSticker.text.c.h r0 = r7.f107679B
            if (r0 == 0) goto L_0x002f
            r0.mo78317b(r5)
        L_0x002f:
            return
        L_0x0030:
            if (r1 != r4) goto L_0x0034
            r5 = 1
            goto L_0x0028
        L_0x0034:
            if (r1 != r5) goto L_0x0038
            r5 = 2
            goto L_0x0028
        L_0x0038:
            if (r1 != r6) goto L_0x0027
            goto L_0x0028
        L_0x003b:
            if (r0 != r6) goto L_0x0040
            r7.f107706m = r4
            goto L_0x0014
        L_0x0040:
            if (r0 != r4) goto L_0x0045
            r7.f107706m = r5
            goto L_0x0014
        L_0x0045:
            r7.f107706m = r3
            goto L_0x0014
        L_0x0048:
            int r0 = r7.f107706m
            if (r0 != r3) goto L_0x004f
            r7.f107706m = r4
            goto L_0x0014
        L_0x004f:
            if (r0 != r4) goto L_0x0054
            r7.f107706m = r5
            goto L_0x0014
        L_0x0054:
            r7.f107706m = r3
            goto L_0x0014
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i.mo78496f():void");
    }

    public void setBgColorChangeListener(AbstractC46117c cVar) {
        this.f107698e = cVar;
    }

    public void setInputLayoutShowListener(AbstractC46120f fVar) {
        this.f107697d = fVar;
    }

    public void setOnReadTextClickListener(AbstractC46229a aVar) {
        this.f107686I = aVar;
    }

    public void setTextStickerInputMobListener(AbstractC46122h hVar) {
        this.f107679B = hVar;
    }

    public void setTextStickerUpdateListener(AbstractC46230b bVar) {
        this.f107690M = bVar;
    }

    public void setTextStickerView(C46239q qVar) {
        this.f107713t = qVar;
    }

    public void setVisibleController(AbstractC46231c cVar) {
        this.f107681D = cVar;
    }

    public void setWikiTextStickerMob(AbstractC45873f fVar) {
        this.f107680C = fVar;
    }

    /* renamed from: a */
    public final void mo78487a(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f107699f.getLayoutParams();
        layoutParams.bottomMargin = i;
        this.f107699f.setLayoutParams(layoutParams);
    }

    /* renamed from: b */
    public final void mo78491b(int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f107699f.getLayoutParams();
        layoutParams.bottomMargin += i;
        this.f107699f.setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo78493c(int i) {
        this.f107701h.mo78446a(this.f107706m, i);
        this.f107709p = i;
        AbstractC46122h hVar = this.f107679B;
        if (hVar != null) {
            hVar.mo78313a(i);
        }
    }

    public void setData(TextStickerData textStickerData) {
        int bgMode = textStickerData.getBgMode();
        int color = textStickerData.getColor();
        int align = textStickerData.getAlign();
        this.f107706m = bgMode;
        this.f107709p = color;
        this.f107708o = align;
        if (TextUtils.isEmpty(textStickerData.getFontType())) {
            C45989b.m88764a().mo77591a(textStickerData.getFontType(), getScene());
        }
    }

    public void setReadTextIcon(boolean z) {
        ImageView imageView = this.f107705l;
        if (imageView != null) {
            imageView.setClickable(true);
            this.f107705l.setAlpha(1.0f);
            this.f107685H = z;
            if (z) {
                this.f107705l.setImageResource(2131232697);
            } else {
                this.f107705l.setImageResource(2131232698);
            }
        }
    }

    /* renamed from: b */
    private void m89148b(C45995c cVar) {
        boolean z;
        if (cVar != null) {
            if (cVar.f107119c == 1) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (this.f107707n == -1 || this.f107706m != 1) {
                    this.f107707n = this.f107706m;
                    this.f107706m = 1;
                }
                this.f107703j.setAlpha(0.34f);
                this.f107703j.setClickable(false);
                this.f107703j.setTag(false);
                return;
            }
            int i = this.f107707n;
            if (i != -1) {
                this.f107706m = i;
            }
            this.f107703j.setAlpha(1.0f);
            this.f107703j.setClickable(true);
            this.f107703j.setTag(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo78488a(C45995c cVar) {
        if (cVar != null) {
            m89148b(cVar);
            C45989b.m88764a().mo77591a(cVar.f107121e, getScene());
            this.f107701h.setFontType(C45989b.m88764a().mo77596c(getScene()));
            this.f107701h.mo78446a(this.f107706m, this.f107709p);
            if (getScene() == 0) {
                if (cVar.f107122f > 0) {
                    this.f107701h.setFontSize(cVar.f107122f);
                } else {
                    this.f107701h.setFontSize(28);
                }
            }
            AbstractC46122h hVar = this.f107679B;
            if (hVar != null) {
                hVar.mo78314a(cVar);
            }
        }
    }

    /* renamed from: a */
    private static Object m89147a(Context context, String str) {
        Object obj;
        MethodCollector.m26663i(11509);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(11509);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }

    public C46224i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(11349);
        this.f107694a = context;
        this.f107696c = (InputMethodManager) m89147a(context, "input_method");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.w3});
            this.f107689L = obtainStyledAttributes.getInt(0, 1);
            obtainStyledAttributes.recycle();
        }
        View inflate = LayoutInflater.from(this.f107694a).inflate(getLayoutRes(), (ViewGroup) null);
        this.f107700g = inflate;
        this.f107699f = inflate.findViewById(R.id.ad0);
        this.f107691N = this.f107700g.findViewById(R.id.bos);
        this.f107701h = (TextStickerEditText) this.f107700g.findViewById(R.id.ax1);
        this.f107703j = (ImageView) this.f107700g.findViewById(R.id.dx0);
        C46220g gVar = new C46220g(this.f107694a, getScene());
        gVar.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f107711r = gVar;
        gVar.mo78483a(C45989b.m88764a().mo77594b());
        ((LinearLayout) this.f107700g.findViewById(R.id.b7m)).addView(this.f107711r);
        this.f107704k = (ImageView) this.f107700g.findViewById(R.id.i5);
        if (C45890g.m88534a().f106862b.f106873d) {
            ImageView imageView = (ImageView) this.f107700g.findViewById(R.id.eqe);
            this.f107705l = imageView;
            imageView.setOnClickListener(new AbstractView$OnClickListenerC81432d() {
                /* class com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i.C462251 */

                static {
                    Covode.recordClassIndex(54787);
                }

                @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
                /* renamed from: a */
                public final void mo77200a(View view) {
                    if (C46224i.this.f107686I != null) {
                        C46224i.this.f107686I.mo78528a(C46110t.m88973i(C46224i.this.getTextWrapList()), C46224i.this.f107713t);
                    }
                }
            });
            this.f107705l.setVisibility(0);
        }
        this.f107701h.addTextChangedListener(new TextWatcher() {
            /* class com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i.C462262 */

            static {
                Covode.recordClassIndex(54788);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (TextUtils.isEmpty(editable.toString().trim())) {
                    C46224i.this.mo78494d();
                    return;
                }
                C46224i iVar = C46224i.this;
                iVar.setReadTextIcon(iVar.f107685H);
            }
        });
        this.f107704k.setOnClickListener(new View$OnClickListenerC46232j(this));
        ColorSelectLayout colorSelectLayout = (ColorSelectLayout) this.f107700g.findViewById(R.id.a7w);
        this.f107702i = colorSelectLayout;
        colorSelectLayout.setColorChangeListener(new C46233k(this));
        this.f107711r.setClickFontStyleListener(new C46234l(this));
        this.f107703j.setOnClickListener(new AbstractView$OnClickListenerC81432d() {
            /* class com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i.C462273 */

            static {
                Covode.recordClassIndex(54789);
            }

            @Override // com.p2082ss.android.ugc.aweme.views.AbstractView$OnClickListenerC81432d
            /* renamed from: a */
            public final void mo77200a(View view) {
                C46224i.this.mo78496f();
            }
        });
        this.f107712s = (LinearLayout) this.f107700g.findViewById(R.id.cep);
        View findViewById = this.f107700g.findViewById(R.id.ec3);
        View findViewById2 = this.f107700g.findViewById(R.id.f54);
        if (this.f107689L == 0) {
            this.f107710q = findViewById;
            findViewById2.setVisibility(8);
        } else {
            this.f107710q = findViewById2;
            findViewById.setVisibility(8);
        }
        this.f107710q.setOnClickListener(new View$OnClickListenerC46235m(this));
        this.f107700g.setOnClickListener(new View$OnClickListenerC46236n(this));
        this.f107703j.setImageResource(2131232446);
        addView(this.f107700g);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f107700g.getLayoutParams();
        layoutParams.topMargin = getTopMargin();
        this.f107700g.setLayoutParams(layoutParams);
        findViewById(R.id.cw6).setOnClickListener(View$OnClickListenerC46237o.f107730a);
        this.f107692O = this.f107700g.findViewById(R.id.rx);
        this.f107714u = this.f107700g.findViewById(R.id.rw);
        View findViewById3 = this.f107700g.findViewById(R.id.dun);
        this.f107693P = findViewById3;
        findViewById3.setVisibility(8);
        this.f107692O.setBackground(C84916a.m145947a(-1, 16777215, (int) C30745b.m63132b(getContext(), 2.0f), (int) C30745b.m63132b(getContext(), 4.0f)));
        this.f107714u.setBackground(C84916a.m145949a(C46109s.m88954a().mo78297b().f107364a, GradientDrawable.Orientation.TR_BL));
        this.f107693P.setOnClickListener(new View$OnClickListenerC46238p(this));
        C74268b.m130674a(this.f107693P);
        this.f107703j.setOnTouchListener(new View.OnTouchListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.p3890a.C74268b.View$OnTouchListenerC742713 */

            static {
                Covode.recordClassIndex(87043);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.getTag() != null && !((Boolean) view.getTag()).booleanValue()) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    C74268b.m130675a(view, true);
                } else if (action == 1 || action == 3) {
                    C74268b.m130675a(view, false);
                }
                return false;
            }
        });
        this.f107710q.setOnTouchListener(new View.OnTouchListener() {
            /* class com.p2082ss.android.ugc.aweme.shortvideo.widget.p3890a.C74268b.View$OnTouchListenerC742691 */

            static {
                Covode.recordClassIndex(87041);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (view.getTag() != null && !((Boolean) view.getTag()).booleanValue()) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    C74268b.m130676a(true, view);
                } else if (action == 1 || action == 3) {
                    C74268b.m130676a(false, view);
                }
                return false;
            }
        });
        C74268b.m130674a(this.f107704k);
        this.f107715v = (LinearLayout) findViewById(R.id.ceq);
        mo78495e();
        MethodCollector.m26664o(11349);
    }

    /* renamed from: a */
    public final void mo78489a(String str, String str2, int i) {
        mo78323a(C46110t.m88961a(str), 0, -1, 0, str2, true, 28, i);
    }

    /* renamed from: a */
    public final void mo78490a(String str, String str2, boolean z) {
        this.f107716w = str;
        this.f107717x = str2;
        this.f107718y = z;
        this.f107719z = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo78492b(List<TextStickerTextWrap> list, int i, int i2, int i3, String str, boolean z, int i4, int i5) {
        int d;
        this.f107707n = -1;
        m89151m();
        C45886d.m88527a(this.f107701h);
        this.f107701h.setTextSize((float) i4);
        this.f107702i.mo78438a(z, i2);
        String c = C46110t.m88967c(list);
        List<InteractTextStructWrap> d2 = C46110t.m88968d(list);
        this.f107682E = d2;
        this.f107683F = i5 - d2.size();
        this.f107701h.setTextStructWrapList(this.f107682E);
        if (z) {
            C45989b.m88764a().mo77589a(getScene());
            mo78321a();
            if (getScene() == 0 && (d = C45989b.m88764a().mo77598d()) > 0) {
                this.f107701h.setFontSize(d);
            }
        } else {
            this.f107701h.mo78447a(c, c.length());
            this.f107702i.setSelectColorView(i2);
            this.f107706m = i;
            this.f107708o = i3;
            this.f107709p = i2;
            C45989b.m88764a().mo77591a(str, getScene());
        }
        m89150l();
        this.f107701h.setFontType(C45989b.m88764a().mo77596c(getScene()));
        this.f107701h.mo78446a(i, i2);
        this.f107701h.setAligin(this.f107708o);
        this.f107711r.mo78481a();
        m89149k();
        m89148b(C45989b.m88764a().mo77599d(getScene()));
        if (!this.f107678A) {
            this.f107714u.setBackground(C84916a.m145949a(C46109s.m88954a().mo78297b().f107364a, GradientDrawable.Orientation.TR_BL));
        }
    }

    /* renamed from: a */
    public void mo78323a(List<TextStickerTextWrap> list, int i, int i2, int i3, String str, boolean z, int i4, int i5) {
        if (this.f107684G) {
            setEffectText(list);
        } else {
            mo78492b(list, i, i2, i3, str, z, i4, i5);
        }
        if (this.f107695b || z) {
            this.f107695b = false;
            mo78324b();
        }
        C46239q qVar = this.f107713t;
        if (!(qVar == null || qVar.getData() == null)) {
            setReadTextIcon(this.f107713t.getData().getHasReadTextAudio());
        }
        if (this.f107687J) {
            ImageView imageView = this.f107705l;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
        } else {
            ImageView imageView2 = this.f107705l;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
        final C45902g gVar = new C45902g();
        if (!this.f107687J && gVar.f106891a.getInt("edit_text_tux_bubble_1", 0) < 2) {
            postDelayed(new Runnable() {
                /* class com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i.RunnableC462284 */

                static {
                    Covode.recordClassIndex(54790);
                }

                public final void run() {
                    if (C46224i.this.f107705l != null) {
                        try {
                            gVar.mo77278a(false);
                            C46224i.this.f107688K = ((C23329a) ((C23329a) ((C23329a) new C23329a(C46224i.this.getContext()).mo38041b(C46224i.this.f107705l)).mo38034a(EnumC23352h.TOP)).mo38030a(5000L)).mo38023e(R.string.gbd).mo38012d();
                            C46224i.this.f107688K.mo38001a();
                            if (C46224i.this.f107679B != null) {
                                C46224i.this.f107679B.mo78312a();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }, 200);
        }
    }
}
