package com.bytedance.tux.tag;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.AbstractC23168a;
import com.bytedance.tux.icon.C23169b;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1708b.C22983g;
import com.bytedance.tux.p1708b.C22988k;
import com.bytedance.tux.p1708b.p1709a.AbstractC22974b;
import com.bytedance.tux.p1708b.p1709a.C22975c;
import com.bytedance.tux.p1708b.p1709a.C22976d;
import com.bytedance.tux.p1710c.C23001b;
import com.bytedance.tux.p1722h.C23155d;
import com.p2082ss.android.ugc.trill.R;
import java.util.Map;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

public final class TuxTag extends TuxTextView implements AbstractC23168a {

    /* renamed from: f */
    public static final C23314a f55251f = new C23314a((byte) 0);

    /* renamed from: a */
    public int f55252a;

    /* renamed from: b */
    public boolean f55253b;

    /* renamed from: e */
    public boolean f55254e;

    /* renamed from: g */
    private boolean f55255g;

    /* renamed from: h */
    private int f55256h;

    /* renamed from: i */
    private int f55257i;

    /* renamed from: j */
    private int f55258j;

    /* renamed from: k */
    private int f55259k;

    /* renamed from: l */
    private int f55260l;

    /* renamed from: m */
    private RectF f55261m;

    /* renamed from: n */
    private final C23169b f55262n;

    /* renamed from: o */
    private C22988k<TuxTag> f55263o;

    static {
        Covode.recordClassIndex(27266);
    }

    public TuxTag(Context context) {
        this(context, null, 0, 6);
    }

    public TuxTag(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    /* renamed from: com.bytedance.tux.tag.TuxTag$a */
    public static final class C23314a {
        static {
            Covode.recordClassIndex(27267);
        }

        private C23314a() {
        }

        public /* synthetic */ C23314a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo796a() {
        int i;
        if (this.f55255g && this.f55253b) {
            if (TextUtils.isEmpty(getText())) {
                i = 0;
            } else {
                i = this.f55252a;
            }
            this.f55262n.mo37670a(this.f55254e);
            this.f55262n.mo37666a(i);
        }
    }

    /* renamed from: b */
    private final void m43912b() {
        setTagSize(this.f55260l);
        this.f55256h = getMinWidth();
        this.f55257i = getMaxWidth();
        setGravity(19);
        setSingleLine();
        setEllipsize(TextUtils.TruncateAt.END);
        int i = this.f55252a;
        if (i <= 0) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            i = C89241a.m154730a(TypedValue.applyDimension(1, 2.0f, system.getDisplayMetrics()));
        }
        setCompoundDrawablePadding(i);
        setTextColor(this.f55259k);
        setTagBackgroundColor(this.f55258j);
        mo796a();
        int i2 = this.f55257i;
        if (i2 < Integer.MAX_VALUE) {
            setMaxWidth(i2);
        }
        int i3 = this.f55256h;
        if (i3 > 0) {
            setMinWidth(i3);
        }
        this.f55263o.mo37303a(this, (int) R.attr.g4);
    }

    @Override // com.bytedance.tux.icon.AbstractC23168a
    public final void setIconHeight(int i) {
        this.f55262n.f54833a = i;
        mo796a();
    }

    @Override // com.bytedance.tux.icon.AbstractC23168a
    public final void setIconWidth(int i) {
        this.f55262n.f54834b = i;
        mo796a();
    }

    public final void setTagTextColor(int i) {
        this.f55259k = i;
        setTextColor(i);
    }

    public final void setIconTintColor(int i) {
        this.f55262n.f54835c = Integer.valueOf(i);
        mo796a();
    }

    public final void setPressed(boolean z) {
        super.setPressed(z);
        if (this.f55255g) {
            this.f55263o.mo37302a(this);
        }
    }

    public final void setTagBackgroundColor(int i) {
        Drawable background = getBackground();
        if (background instanceof GradientDrawable) {
            ((GradientDrawable) background).setColor(i);
        }
    }

    public final void setTagIcon(Integer num) {
        this.f55262n.mo37669a(num);
        mo796a();
    }

    public final void setTagSize(int i) {
        this.f55260l = i;
        this.f55263o.mo37304a(this, R.attr.ar_, i);
    }

    /* renamed from: com.bytedance.tux.tag.TuxTag$b */
    final class C23315b extends AbstractC22974b<TuxTag> {

        /* renamed from: b */
        private final C22976d f55265b = new C22976d();

        /* renamed from: c */
        private final C22975c f55266c = new C22975c();

        static {
            Covode.recordClassIndex(27268);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C23315b() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.util.Map] */
        @Override // com.bytedance.tux.p1708b.p1709a.AbstractC22974b
        /* renamed from: a */
        public final /* synthetic */ Map mo37289a(TuxTag tuxTag, Map map) {
            TuxTag tuxTag2 = tuxTag;
            C89219l.m154719c(tuxTag2, "");
            C89219l.m154719c(map, "");
            return super.mo37289a(tuxTag2, this.f55266c.mo37289a(tuxTag2, this.f55265b.mo37291a((TuxTextView) tuxTag2, (Map<Integer, ? extends Object>) map)));
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int, java.lang.Object] */
        @Override // com.bytedance.tux.p1708b.p1709a.AbstractC22974b
        /* renamed from: a */
        public final /* synthetic */ boolean mo37290a(TuxTag tuxTag, int i, Object obj) {
            C89219l.m154719c(tuxTag, "");
            C89219l.m154719c(obj, "");
            boolean z = false;
            if (i == C22983g.m43349w().f54332a) {
                C22983g.m43349w();
                C89219l.m154719c(obj, "");
                int intValue = ((Number) obj).intValue();
                TuxTag.this.f55252a = intValue;
                TuxTag tuxTag2 = TuxTag.this;
                if (intValue > 0) {
                    z = true;
                }
                tuxTag2.f55253b = z;
                TuxTag.this.mo796a();
                return true;
            } else if (i != C22983g.m43350x().f54332a) {
                return false;
            } else {
                C22983g.m43350x();
                C89219l.m154719c(obj, "");
                int intValue2 = ((Number) obj).intValue();
                TuxTag.this.setPadding(intValue2, 0, intValue2, 0);
                return true;
            }
        }
    }

    public final void setHollow(boolean z) {
        PorterDuffXfermode porterDuffXfermode;
        this.f55254e = z;
        TextPaint paint = getPaint();
        C89219l.m154709a((Object) paint, "");
        if (z) {
            porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        } else {
            porterDuffXfermode = null;
        }
        paint.setXfermode(porterDuffXfermode);
        mo796a();
    }

    @Override // com.bytedance.tux.icon.AbstractC23168a
    public final void setIconTintColorRes(int i) {
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        Integer a = C23155d.m43641a(context, i);
        if (a != null) {
            setIconTintColor(a.intValue());
        }
    }

    public final void draw(Canvas canvas) {
        if (canvas != null) {
            this.f55261m.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            if (Build.VERSION.SDK_INT >= 21) {
                canvas.saveLayer(this.f55261m, null);
            } else {
                canvas.saveLayer(this.f55261m, null, 31);
            }
            super.draw(canvas);
            canvas.restore();
        }
    }

    public final void setTagIconBitmap(Bitmap bitmap) {
        C89219l.m154719c(bitmap, "");
        C23169b bVar = this.f55262n;
        Context context = getContext();
        C89219l.m154709a((Object) context, "");
        C89219l.m154719c(context, "");
        C89219l.m154719c(bitmap, "");
        C23001b bVar2 = new C23001b(context, -1);
        bVar2.f54440a = new BitmapDrawable(context.getResources(), bitmap);
        bVar.f54838f = bVar2;
        mo796a();
    }

    @Override // com.bytedance.tux.input.TuxTextView, android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        mo796a();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxTag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154719c(context, "");
        this.f55257i = Integer.MAX_VALUE;
        this.f55258j = -1;
        this.f55259k = -1;
        this.f55253b = true;
        this.f55261m = new RectF();
        this.f55263o = new C22988k<>(new C23315b());
        this.f55255g = true;
        C23169b bVar = new C23169b(this);
        this.f55262n = bVar;
        bVar.mo37667a(attributeSet, i);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ao_, R.attr.ap9, R.attr.apj, R.attr.apl, R.attr.ar6, R.attr.ar8, R.attr.ar_, R.attr.ara}, i, 0);
            C89219l.m154709a((Object) obtainStyledAttributes, "");
            this.f55260l = obtainStyledAttributes.getInt(6, -1);
            this.f55258j = obtainStyledAttributes.getColor(0, -7829368);
            setHollow(obtainStyledAttributes.getBoolean(5, false));
            this.f55259k = obtainStyledAttributes.getColor(7, -1);
            int color = obtainStyledAttributes.getColor(4, -1);
            obtainStyledAttributes.recycle();
            bVar.f54835c = Integer.valueOf(color);
        }
        m43912b();
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        mo796a();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxTag(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.cb : i);
    }
}
