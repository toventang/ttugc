package com.bytedance.android.livesdk.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Path;
import android.os.Message;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.bytedance.android.live.base.AbstractC2953a;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdk.AbstractC10073p;
import com.bytedance.android.livesdk.model.AbstractC9513a;
import com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a;
import com.bytedance.android.livesdkapi.depend.p680d.AbstractC11633b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.ugc.live.barrage.p4467a.AbstractC87048a;
import com.p2082ss.ugc.live.barrage.view.BarrageLayout;
import java.util.Arrays;
import java.util.Random;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.widget.a */
public final class C11368a implements HandlerC11626a.AbstractC11627a, AbstractC11633b {

    /* renamed from: a */
    public static final C11369a f27317a = new C11369a((byte) 0);

    /* renamed from: b */
    private TypedArray f27318b;

    /* renamed from: c */
    private Bitmap[] f27319c;

    /* renamed from: d */
    private final Random f27320d = new Random();

    /* renamed from: e */
    private AbstractC9513a f27321e;

    /* renamed from: f */
    private final HandlerC11626a f27322f = new HandlerC11626a(this);

    /* renamed from: g */
    private final Context f27323g;

    /* renamed from: h */
    private final ViewGroup f27324h;

    static {
        Covode.recordClassIndex(13024);
    }

    /* renamed from: com.bytedance.android.livesdk.widget.a$a */
    public static final class C11369a {
        static {
            Covode.recordClassIndex(13025);
        }

        private C11369a() {
        }

        public /* synthetic */ C11369a(byte b) {
            this();
        }
    }

    /* renamed from: e */
    private final boolean m20183e() {
        try {
            TypedArray typedArray = this.f27318b;
            if (typedArray == null) {
                return false;
            }
            typedArray.length();
            return false;
        } catch (Throwable unused) {
            return true;
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11633b
    /* renamed from: b */
    public final void mo18243b() {
        this.f27322f.removeMessages(12);
        this.f27322f.removeMessages(13);
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11633b
    /* renamed from: c */
    public final void mo18244c() {
        mo18243b();
        Bitmap[] bitmapArr = this.f27319c;
        if (bitmapArr != null) {
            for (Bitmap bitmap : bitmapArr) {
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
        TypedArray typedArray = this.f27318b;
        if (typedArray != null) {
            typedArray.recycle();
        }
    }

    @Override // com.bytedance.android.livesdkapi.depend.p680d.AbstractC11633b
    /* renamed from: a */
    public final void mo18242a() {
        int nextInt = this.f27320d.nextInt(6) + 5;
        long[] jArr = new long[nextInt];
        for (int i = 0; i < nextInt; i++) {
            jArr[i] = (long) this.f27320d.nextInt(3000);
            this.f27322f.sendEmptyMessageDelayed(13, jArr[i]);
        }
        this.f27322f.sendEmptyMessageDelayed(12, 3000);
        StringBuilder append = new StringBuilder("Barrage count: ").append(nextInt).append(", at times: ");
        String arrays = Arrays.toString(jArr);
        C89219l.m154716b(arrays, "");
        C3854a.m9453a(3, "BarrageLauncher", append.append(arrays).toString());
    }

    /* renamed from: d */
    private final void m20182d() {
        MethodCollector.m26663i(5862);
        if (this.f27323g == null || this.f27324h == null) {
            MethodCollector.m26664o(5862);
            return;
        }
        BarrageLayout barrageLayout = new BarrageLayout(this.f27323g, (AttributeSet) null, 6);
        barrageLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f27324h.addView(barrageLayout);
        AbstractC2953a a = C6193a.m13435a(AbstractC10073p.class);
        if (a == null) {
            C89219l.m154715b();
        }
        AbstractC9513a aVar = (AbstractC9513a) ((AbstractC10073p) a).getDiggController(barrageLayout, 1400);
        this.f27321e = aVar;
        BarrageLayout.m150805a(barrageLayout, aVar);
        int i = 0;
        do {
            Path path = new Path();
            path.moveTo((float) C3966y.m9653a(50.0f), (float) C3966y.m9653a(220.0f));
            float f = (float) (((i - 5) * 6) + 50);
            path.quadTo((float) C3966y.m9653a(f), (float) C3966y.m9653a(220.0f), (float) C3966y.m9653a(f), (float) C3966y.m9653a(40.0f));
            AbstractC9513a aVar2 = this.f27321e;
            if (aVar2 != null) {
                aVar2.mo13470a(path);
            }
            i++;
        } while (i < 10);
        MethodCollector.m26664o(5862);
    }

    @Override // com.bytedance.android.livesdkapi.depend.p679c.HandlerC11626a.AbstractC11627a
    public final void handleMsg(Message message) {
        AbstractC9513a aVar;
        TypedArray typedArray;
        TypedArray typedArray2;
        MethodCollector.m26663i(5721);
        C89219l.m154721d(message, "");
        int i = message.what;
        if (i != 12) {
            if (i == 13) {
                if ((m20183e() || ((typedArray2 = this.f27318b) != null && typedArray2.length() > 0)) && (aVar = this.f27321e) != null && aVar.mo13473b() < 24) {
                    Bitmap[] bitmapArr = this.f27319c;
                    if (bitmapArr != null) {
                        int nextInt = this.f27320d.nextInt(bitmapArr.length);
                        Bitmap bitmap = bitmapArr[nextInt];
                        Resources resources = null;
                        if ((bitmap == null || bitmap.isRecycled()) && (typedArray = this.f27318b) != null) {
                            Context context = this.f27323g;
                            if (context != null) {
                                resources = context.getResources();
                            }
                            bitmapArr[nextInt] = BitmapFactory.decodeResource(resources, typedArray.getResourceId(nextInt, 0));
                        }
                        Bitmap bitmap2 = bitmapArr[nextInt];
                        if (bitmap2 == null || !(!bitmap2.isRecycled())) {
                            MethodCollector.m26664o(5721);
                            return;
                        }
                        AbstractC9513a aVar2 = this.f27321e;
                        if (aVar2 != null) {
                            AbstractC2953a a = C6193a.m13435a(AbstractC10073p.class);
                            if (a == null) {
                                C89219l.m154715b();
                            }
                            AbstractC87048a diggBarrage = ((AbstractC10073p) a).getDiggBarrage(bitmap2, Double.valueOf(this.f27320d.nextDouble()));
                            C89219l.m154716b(diggBarrage, "");
                            aVar2.mo140680a(diggBarrage, false);
                            MethodCollector.m26664o(5721);
                            return;
                        }
                        MethodCollector.m26664o(5721);
                        return;
                    }
                } else {
                    MethodCollector.m26664o(5721);
                    return;
                }
            }
            MethodCollector.m26664o(5721);
            return;
        }
        mo18242a();
        MethodCollector.m26664o(5721);
    }

    public C11368a(Context context, ViewGroup viewGroup) {
        TypedArray typedArray;
        this.f27323g = context;
        this.f27324h = viewGroup;
        Resources a = C3966y.m9655a();
        if (a != null) {
            typedArray = a.obtainTypedArray(R.array.av);
        } else {
            typedArray = null;
        }
        this.f27318b = typedArray;
        if (typedArray != null) {
            this.f27319c = new Bitmap[typedArray.length()];
        }
        m20182d();
    }
}
