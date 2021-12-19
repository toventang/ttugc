package com.p2082ss.android.ugc.aweme.ecommercebase.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.C20766v;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20737n;
import com.p2082ss.android.ugc.aweme.ecommercebase.view.p2864a.C45677a;
import com.p2082ss.android.ugc.trill.R;
import java.util.Set;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommercebase.view.TagTextView */
public final class TagTextView extends LinearLayout {

    /* renamed from: b */
    public static final C45673a f106314b = new C45673a((byte) 0);

    /* renamed from: a */
    public boolean f106315a;

    /* renamed from: c */
    private int f106316c;

    /* renamed from: d */
    private int f106317d;

    /* renamed from: e */
    private Set<C45676a> f106318e;

    /* renamed from: f */
    private float f106319f;

    /* renamed from: g */
    private SparseArray f106320g;

    static {
        Covode.recordClassIndex(54183);
    }

    public TagTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: a */
    public final View mo76941a(int i) {
        if (this.f106320g == null) {
            this.f106320g = new SparseArray();
        }
        View view = (View) this.f106320g.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f106320g.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercebase.view.TagTextView$a */
    public static final class C45673a {
        static {
            Covode.recordClassIndex(54184);
        }

        private C45673a() {
        }

        public /* synthetic */ C45673a(byte b) {
            this();
        }
    }

    public final Set<C45676a> getTagLayoutParams() {
        return this.f106318e;
    }

    public final float getTagRadius() {
        return this.f106319f;
    }

    public final int getTextFont() {
        return this.f106317d;
    }

    public final int getTextMaxLine() {
        return this.f106316c;
    }

    public final void setTagLayoutParams(Set<C45676a> set) {
        this.f106318e = set;
    }

    public final void setTagRadius(float f) {
        this.f106319f = f;
    }

    public final void setTagShow(boolean z) {
        this.f106315a = z;
    }

    public final void setTextFont(int i) {
        this.f106317d = i;
    }

    public final void setTextMaxLine(int i) {
        this.f106316c = i;
    }

    /* renamed from: a */
    public final float mo76940a(float f) {
        Context context = getContext();
        C89219l.m154716b(context, "");
        Resources resources = context.getResources();
        C89219l.m154716b(resources, "");
        return (f * resources.getDisplayMetrics().density) + 0.5f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommercebase.view.TagTextView$b */
    public static final class C45674b extends AbstractC89220m implements AbstractC89172b<Integer, Drawable> {

        /* renamed from: a */
        final /* synthetic */ TagTextView f106321a;

        static {
            Covode.recordClassIndex(54185);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45674b(TagTextView tagTextView) {
            super(1);
            this.f106321a = tagTextView;
        }

        /* renamed from: a */
        public final Drawable invoke(Integer num) {
            if (num == null) {
                return null;
            }
            if (num.intValue() == 2) {
                return C0643b.m2369a(this.f106321a.getContext(), (int) R.drawable.a5z);
            }
            if (num.intValue() == 1) {
                return C0643b.m2369a(this.f106321a.getContext(), (int) R.drawable.a5y);
            }
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        if (r4 != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setTagBg(com.p2082ss.android.ugc.aweme.ecommercebase.view.p2864a.C45677a r4) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.ecommercebase.view.TagTextView$b r2 = new com.ss.android.ugc.aweme.ecommercebase.view.TagTextView$b
            r2.<init>(r3)
            r1 = 0
            if (r4 == 0) goto L_0x001c
            com.ss.android.ugc.aweme.ecommercebase.dto.GImage r0 = r4.f106339c
            if (r0 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.ecommercebase.dto.GImage r0 = r4.f106339c
            java.util.List r0 = r0.getUrls()
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0027
        L_0x001a:
            java.lang.Integer r1 = r4.f106337a
        L_0x001c:
            android.graphics.drawable.Drawable r0 = r2.invoke(r1)
            r3.setBackground(r0)
            return
        L_0x0024:
            if (r4 == 0) goto L_0x001c
            goto L_0x001a
        L_0x0027:
            com.ss.android.ugc.aweme.ecommercebase.dto.GImage r0 = r4.f106339c
            com.bytedance.lighten.a.a.a r0 = r0.toImageUrlModel()
            com.bytedance.lighten.a.v r1 = com.bytedance.lighten.p1477a.C20761r.m39058a(r0)
            com.ss.android.ugc.aweme.ecommercebase.view.TagTextView$c r0 = new com.ss.android.ugc.aweme.ecommercebase.view.TagTextView$c
            r0.<init>(r3, r2, r4)
            r1.mo34182a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommercebase.view.TagTextView.setTagBg(com.ss.android.ugc.aweme.ecommercebase.view.a.a):void");
    }

    private final void setTagIcon(C45677a aVar) {
        Integer num;
        if (aVar != null) {
            num = aVar.f106337a;
        } else {
            num = null;
        }
        if (num == null || num.intValue() != 0 || aVar.f106339c == null) {
            SmartImageView smartImageView = (SmartImageView) mo76941a(R.id.een);
            C89219l.m154716b(smartImageView, "");
            smartImageView.setVisibility(8);
            return;
        }
        C20766v a = C20761r.m39058a(aVar.f106339c.toImageUrlModel());
        a.f49092E = (SmartImageView) mo76941a(R.id.een);
        a.mo34186c();
        SmartImageView smartImageView2 = (SmartImageView) mo76941a(R.id.een);
        C89219l.m154716b(smartImageView2, "");
        smartImageView2.setVisibility(0);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommercebase.view.TagTextView$c */
    public static final class C45675c implements AbstractC20737n {

        /* renamed from: a */
        final /* synthetic */ TagTextView f106322a;

        /* renamed from: b */
        final /* synthetic */ C45674b f106323b;

        /* renamed from: c */
        final /* synthetic */ C45677a f106324c;

        static {
            Covode.recordClassIndex(54186);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34150a() {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            Object obj;
            Bitmap bitmap2;
            MethodCollector.m26663i(406);
            TagTextView tagTextView = this.f106322a;
            Object obj2 = null;
            try {
                Resources resources = this.f106322a.getResources();
                TagTextView tagTextView2 = this.f106322a;
                float tagRadius = tagTextView2.getTagRadius();
                if (bitmap == null) {
                    bitmap2 = null;
                } else {
                    bitmap2 = Bitmap.createBitmap(tagTextView2.getWidth(), tagTextView2.getHeight(), Bitmap.Config.ARGB_8888);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    RectF rectF = new RectF(new Rect(0, 0, tagTextView2.getWidth(), tagTextView2.getHeight()));
                    Canvas canvas = new Canvas(bitmap2);
                    canvas.drawARGB(0, 0, 0, 0);
                    canvas.drawRoundRect(rectF, tagRadius, tagRadius, paint);
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int width2 = tagTextView2.getWidth();
                    int height2 = tagTextView2.getHeight();
                    Matrix matrix = new Matrix();
                    matrix.postScale(((float) width2) / ((float) width), ((float) height2) / ((float) height));
                    canvas.drawBitmap(bitmap, matrix, paint);
                }
                obj = C89379q.m157068constructorimpl(new BitmapDrawable(resources, bitmap2));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (!C89379q.m157073isFailureimpl(obj)) {
                obj2 = obj;
            }
            Drawable drawable = (BitmapDrawable) obj2;
            if (drawable == null) {
                drawable = this.f106323b.invoke(this.f106324c.f106337a);
            }
            tagTextView.setBackground(drawable);
            MethodCollector.m26664o(406);
        }

        C45675c(TagTextView tagTextView, C45674b bVar, C45677a aVar) {
            this.f106322a = tagTextView;
            this.f106323b = bVar;
            this.f106324c = aVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setTagText(com.p2082ss.android.ugc.aweme.ecommercebase.view.p2864a.C45677a r9) {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommercebase.view.TagTextView.setTagText(com.ss.android.ugc.aweme.ecommercebase.view.a.a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setTagUi(com.p2082ss.android.ugc.aweme.ecommercebase.view.p2864a.C45678b r13) {
        /*
        // Method dump skipped, instructions count: 204
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommercebase.view.TagTextView.setTagUi(com.ss.android.ugc.aweme.ecommercebase.view.a.b):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TagTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TagTextView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(2964);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.y5, this, true);
        this.f106316c = 1;
        this.f106317d = 92;
        this.f106319f = mo76940a(2.0f);
        MethodCollector.m26664o(2964);
    }
}
