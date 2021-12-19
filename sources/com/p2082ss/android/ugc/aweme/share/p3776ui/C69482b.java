package com.p2082ss.android.ugc.aweme.share.p3776ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.SparseArray;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.loader.SmartCircleImageView;
import com.bytedance.lighten.p1477a.p1480c.AbstractC20728e;
import com.p2082ss.android.ugc.aweme.base.model.UrlModel;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.share.ui.b */
public final class C69482b extends LinearLayout {

    /* renamed from: e */
    public static final C69483a f155217e = new C69483a((byte) 0);

    /* renamed from: a */
    public String f155218a;

    /* renamed from: b */
    public UrlModel f155219b;

    /* renamed from: c */
    public AbstractC69484b f155220c;

    /* renamed from: d */
    public Context f155221d;

    /* renamed from: f */
    private SparseArray f155222f;

    /* renamed from: com.ss.android.ugc.aweme.share.ui.b$b */
    public interface AbstractC69484b {
        static {
            Covode.recordClassIndex(81824);
        }

        /* renamed from: a */
        void mo109729a();
    }

    static {
        Covode.recordClassIndex(81822);
    }

    /* renamed from: a */
    public final View mo109730a(int i) {
        if (this.f155222f == null) {
            this.f155222f = new SparseArray();
        }
        View view = (View) this.f155222f.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f155222f.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ui.b$a */
    public static final class C69483a {
        static {
            Covode.recordClassIndex(81823);
        }

        private C69483a() {
        }

        public /* synthetic */ C69483a(byte b) {
            this();
        }
    }

    public final Context getMContext() {
        return this.f155221d;
    }

    public final Bitmap getDefaultBitmap() {
        MethodCollector.m26663i(6918);
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f155221d.getResources(), R.raw.icon_color_default_avatar);
        if (decodeResource == null) {
            C89219l.m154715b();
        }
        Bitmap a = m122699a(decodeResource);
        MethodCollector.m26664o(6918);
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.share.ui.b$c */
    public static final class C69485c extends AbstractC20728e {

        /* renamed from: a */
        final /* synthetic */ C69482b f155223a;

        static {
            Covode.recordClassIndex(81825);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public C69485c(C69482b bVar) {
            this.f155223a = bVar;
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34166a(Throwable th) {
            if (th != null) {
                th.printStackTrace();
            }
            ((SmartCircleImageView) this.f155223a.mo109730a(R.id.cbq)).setImageBitmap(this.f155223a.getDefaultBitmap());
        }

        @Override // com.bytedance.lighten.p1477a.p1480c.AbstractC20737n
        /* renamed from: a */
        public final void mo34165a(Bitmap bitmap) {
            if (bitmap != null) {
                ((SmartCircleImageView) this.f155223a.mo109730a(R.id.cbq)).setImageBitmap(C69482b.m122699a(bitmap));
                AbstractC69484b bVar = this.f155223a.f155220c;
                if (bVar != null) {
                    bVar.mo109729a();
                    return;
                }
                return;
            }
            ((SmartCircleImageView) this.f155223a.mo109730a(R.id.cbq)).setImageBitmap(this.f155223a.getDefaultBitmap());
            AbstractC69484b bVar2 = this.f155223a.f155220c;
            if (bVar2 != null) {
                bVar2.mo109729a();
            }
        }
    }

    public final void setMContext(Context context) {
        C89219l.m154721d(context, "");
        this.f155221d = context;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C69482b(Context context) {
        super(context);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7069);
        this.f155221d = context;
        View.inflate(context, R.layout.aza, this);
        MethodCollector.m26664o(7069);
    }

    /* renamed from: a */
    public static Bitmap m122699a(Bitmap bitmap) {
        MethodCollector.m26663i(6916);
        C89219l.m154721d(bitmap, "");
        int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        float f = ((float) min) / 2.0f;
        canvas.drawCircle(f, f, f, paint);
        C89219l.m154716b(createBitmap, "");
        MethodCollector.m26664o(6916);
        return createBitmap;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private C69482b(Context context, byte b) {
        this(context);
        C89219l.m154721d(context, "");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C69482b(Context context, char c) {
        this(context, (byte) 0);
        C89219l.m154721d(context, "");
    }
}
