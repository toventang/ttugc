package com.p2082ss.android.ugc.aweme.ecommerce.pdp.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.android.ecommerce.p165k.C2841l;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p1477a.C20761r;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20737n;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.repository.dto.HalfWaistBanner;
import com.p2082ss.android.ugc.aweme.ecommercebase.dto.GImage;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4600h.C89379q;
import p4600h.C89382r;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.HalfWaistView */
public final class HalfWaistView extends FrameLayout {

    /* renamed from: a */
    public static final C44992a f104961a = new C44992a((byte) 0);

    /* renamed from: b */
    private SparseArray f104962b;

    static {
        Covode.recordClassIndex(53412);
    }

    public HalfWaistView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public HalfWaistView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: a */
    public final View mo76120a(int i) {
        if (this.f104962b == null) {
            this.f104962b = new SparseArray();
        }
        View view = (View) this.f104962b.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f104962b.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.HalfWaistView$a */
    public static final class C44992a {
        static {
            Covode.recordClassIndex(53413);
        }

        private C44992a() {
        }

        public /* synthetic */ C44992a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.HalfWaistView$b */
    public static final class C44993b implements AbstractC20737n {

        /* renamed from: a */
        final /* synthetic */ HalfWaistView f104963a;

        static {
            Covode.recordClassIndex(53414);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34150a() {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44993b(HalfWaistView halfWaistView) {
            this.f104963a = halfWaistView;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            Object obj;
            Bitmap bitmap2;
            MethodCollector.m26663i(7161);
            BitmapDrawable bitmapDrawable = null;
            try {
                Resources resources = this.f104963a.getResources();
                HalfWaistView halfWaistView = this.f104963a;
                if (bitmap == null) {
                    bitmap2 = null;
                } else {
                    bitmap2 = Bitmap.createBitmap(halfWaistView.getWidth(), halfWaistView.getHeight(), Bitmap.Config.ARGB_8888);
                    Matrix matrix = new Matrix();
                    matrix.postScale(((float) halfWaistView.getWidth()) / ((float) bitmap.getWidth()), ((float) halfWaistView.getHeight()) / ((float) bitmap.getHeight()));
                    Canvas canvas = new Canvas(bitmap2);
                    Paint paint = new Paint();
                    paint.setAntiAlias(true);
                    canvas.drawBitmap(bitmap, matrix, paint);
                }
                obj = C89379q.m157068constructorimpl(new BitmapDrawable(resources, bitmap2));
            } catch (Throwable th) {
                obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
            }
            if (!C89379q.m157073isFailureimpl(obj)) {
                bitmapDrawable = obj;
            }
            BitmapDrawable bitmapDrawable2 = bitmapDrawable;
            if (bitmapDrawable2 != null) {
                this.f104963a.setBackgroundDrawable(bitmapDrawable2);
                MethodCollector.m26664o(7161);
                return;
            }
            MethodCollector.m26664o(7161);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.view.HalfWaistView$c */
    public static final class C44994c implements AbstractC20737n {

        /* renamed from: a */
        final /* synthetic */ HalfWaistView f104964a;

        static {
            Covode.recordClassIndex(53415);
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34150a() {
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C44994c(HalfWaistView halfWaistView) {
            this.f104964a = halfWaistView;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            if (bitmap != null && bitmap.getWidth() * bitmap.getHeight() != 0) {
                SmartImageView smartImageView = (SmartImageView) this.f104964a.mo76120a(R.id.bd_);
                C89219l.m154716b(smartImageView, "");
                smartImageView.getLayoutParams().width = (((int) C2841l.m8120a(this.f104964a.getContext(), 9.77f)) * bitmap.getWidth()) / bitmap.getHeight();
                Context context = this.f104964a.getContext();
                C89219l.m154716b(context, "");
                ((SmartImageView) this.f104964a.mo76120a(R.id.bd_)).setBackgroundDrawable(new BitmapDrawable(context.getResources(), bitmap));
            }
        }
    }

    private final void setBackGround(GImage gImage) {
        List<String> urls;
        if (gImage == null || (urls = gImage.getUrls()) == null || urls.isEmpty()) {
            setBackgroundDrawable(null);
        } else {
            C20761r.m39058a(gImage.toImageUrlModel()).mo34182a(new C44993b(this));
        }
    }

    private final void setImage(GImage gImage) {
        if (gImage != null) {
            C20761r.m39058a(gImage.toImageUrlModel()).mo34182a(new C44994c(this));
            return;
        }
        SmartImageView smartImageView = (SmartImageView) mo76120a(R.id.bd_);
        C89219l.m154716b(smartImageView, "");
        smartImageView.setVisibility(8);
    }

    public final void setHalfWaistUi(HalfWaistBanner halfWaistBanner) {
        Object obj;
        C89219l.m154721d(halfWaistBanner, "");
        setImage(halfWaistBanner.f104650b);
        setBackGround(halfWaistBanner.f104649a);
        String str = halfWaistBanner.f104651c;
        String str2 = halfWaistBanner.f104652d;
        if (!(str2 == null || str2.length() == 0 || str2.charAt(0) == '#')) {
            str2 = "#".concat(String.valueOf(str2));
        }
        TuxTextView tuxTextView = (TuxTextView) mo76120a(R.id.bda);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(str);
        try {
            obj = C89379q.m157068constructorimpl(Integer.valueOf(Color.parseColor(str2)));
        } catch (Throwable th) {
            obj = C89379q.m157068constructorimpl(C89382r.m154941a(th));
        }
        if (C89379q.m157073isFailureimpl(obj)) {
            obj = null;
        }
        Integer num = (Integer) obj;
        if (num != null) {
            ((TuxTextView) mo76120a(R.id.bda)).setTextColor(num.intValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private HalfWaistView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7416);
        C1764a.m5927a(LayoutInflater.from(context), R.layout.pm, this, true);
        MethodCollector.m26664o(7416);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ HalfWaistView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }
}
