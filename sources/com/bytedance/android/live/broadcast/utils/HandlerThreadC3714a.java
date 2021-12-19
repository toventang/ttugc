package com.bytedance.android.live.broadcast.utils;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.livesdk.p425aa.C6555i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.p1830b.C24065a;
import com.facebook.common.p1836h.C24117a;
import com.facebook.imagepipeline.nativecode.NativeBlurFilter;
import com.facebook.imagepipeline.p1880e.C24428k;
import com.facebook.imagepipeline.p1881f.AbstractC24435b;
import com.facebook.imagepipeline.p1885j.AbstractC24454c;
import com.facebook.imagepipeline.p1890o.C24636b;
import com.facebook.p1844d.AbstractC24157c;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.live.broadcast.utils.a */
public final class HandlerThreadC3714a extends HandlerThread implements Handler.Callback {

    /* renamed from: a */
    public Bitmap f10291a;

    /* renamed from: b */
    public Handler f10292b;

    /* renamed from: c */
    private int[] f10293c = {R.drawable.bo8, R.drawable.bo9, R.drawable.bo_, R.drawable.boa, R.drawable.bob, R.drawable.boc, R.drawable.bod, R.drawable.boe, R.drawable.bof, R.drawable.bog, R.drawable.boh, R.drawable.boi, R.drawable.boj, R.drawable.bok, R.drawable.bol};

    /* renamed from: d */
    private Surface f10294d;

    /* renamed from: e */
    private C3716a f10295e;

    /* renamed from: f */
    private int f10296f = -1;

    /* renamed from: g */
    private Bitmap f10297g;

    /* renamed from: h */
    private Bitmap f10298h;

    /* renamed from: i */
    private Bitmap[] f10299i;

    /* renamed from: j */
    private Paint f10300j;

    /* renamed from: k */
    private Paint f10301k;

    /* renamed from: l */
    private int f10302l;

    /* renamed from: m */
    private Rect f10303m;

    /* renamed from: n */
    private Rect f10304n;

    /* renamed from: o */
    private Rect f10305o;

    /* renamed from: p */
    private boolean f10306p;

    /* renamed from: com.bytedance.android.live.broadcast.utils.a$a */
    public static class C3716a {

        /* renamed from: a */
        public String f10308a;

        /* renamed from: b */
        public int f10309b;

        /* renamed from: c */
        public int f10310c;

        static {
            Covode.recordClassIndex(4231);
        }
    }

    static {
        Covode.recordClassIndex(4229);
    }

    public final boolean quitSafely() {
        boolean quitSafely = super.quitSafely();
        Handler handler = this.f10292b;
        if (handler != null) {
            handler.sendEmptyMessage(235);
        }
        return quitSafely;
    }

    /* access modifiers changed from: protected */
    public final void onLooperPrepared() {
        super.onLooperPrepared();
        this.f10292b = new Handler(getLooper(), this);
        mo9029a();
        C24428k.m46551a().mo40247e().mo40224a(C24636b.fromUri(this.f10295e.f10308a), (Object) null).mo39739a(new AbstractC24435b() {
            /* class com.bytedance.android.live.broadcast.utils.HandlerThreadC3714a.C37151 */

            static {
                Covode.recordClassIndex(4230);
            }

            @Override // com.facebook.p1844d.AbstractC24156b
            public final void onFailureImpl(AbstractC24157c<C24117a<AbstractC24454c>> cVar) {
                C3854a.m9453a(6, "interact", "Fetch avatar bitmap failed");
            }

            @Override // com.facebook.imagepipeline.p1881f.AbstractC24435b
            /* renamed from: a */
            public final void mo9033a(Bitmap bitmap) {
                MethodCollector.m26663i(7177);
                if (bitmap == null) {
                    C3854a.m9453a(6, "interact", "Fetch avatar bitmap null");
                    MethodCollector.m26664o(7177);
                    return;
                }
                if (HandlerThreadC3714a.this.f10291a != null) {
                    HandlerThreadC3714a.this.f10291a.recycle();
                }
                HandlerThreadC3714a.this.f10291a = bitmap.copy(Bitmap.Config.ARGB_8888, false);
                HandlerThreadC3714a.this.mo9029a();
                MethodCollector.m26664o(7177);
            }
        }, C24065a.f56998a);
    }

    /* renamed from: a */
    public final void mo9029a() {
        MethodCollector.m26663i(6079);
        try {
            Bitmap bitmap = this.f10297g;
            if (bitmap != null && !bitmap.isRecycled()) {
                this.f10297g.recycle();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(this.f10291a, this.f10295e.f10309b, this.f10295e.f10310c, false);
            this.f10297g = createScaledBitmap;
            NativeBlurFilter.iterativeBoxBlur(createScaledBitmap, 3, 10);
            Bitmap bitmap2 = this.f10298h;
            if (bitmap2 != null && !bitmap2.isRecycled()) {
                this.f10298h.recycle();
            }
            int i = (int) (((float) this.f10295e.f10309b) * 0.41935483f);
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(this.f10291a, i, i, false);
            Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap2.getWidth(), createScaledBitmap2.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, createScaledBitmap2.getWidth(), createScaledBitmap2.getHeight());
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawCircle((float) (createScaledBitmap2.getWidth() / 2), (float) (createScaledBitmap2.getHeight() / 2), (float) (createScaledBitmap2.getWidth() / 2), paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(createScaledBitmap2, rect, rect, paint);
            this.f10298h = createBitmap;
            createScaledBitmap2.recycle();
            int length = this.f10293c.length;
            this.f10302l = length;
            this.f10299i = new Bitmap[length];
            Resources resources = C3966y.m9669e().getResources();
            for (int i2 = 0; i2 < this.f10302l; i2++) {
                this.f10299i[i2] = BitmapFactory.decodeResource(resources, this.f10293c[i2]);
            }
            Handler handler = this.f10292b;
            if (handler != null) {
                handler.sendEmptyMessage(233);
            }
            MethodCollector.m26664o(6079);
        } catch (Exception e) {
            C3854a.m9453a(6, "interact", e.toString());
            MethodCollector.m26664o(6079);
        }
    }

    public final boolean handleMessage(Message message) {
        Canvas lockCanvas;
        Bitmap bitmap;
        MethodCollector.m26663i(6075);
        switch (message.what) {
            case 233:
                if (!this.f10306p) {
                    try {
                        if (this.f10294d.isValid() && (lockCanvas = this.f10294d.lockCanvas(this.f10303m)) != null) {
                            if (this.f10297g.isRecycled() && (bitmap = this.f10291a) != null && !bitmap.isRecycled()) {
                                this.f10297g = Bitmap.createScaledBitmap(this.f10291a, this.f10295e.f10309b, this.f10295e.f10310c, false);
                            }
                            lockCanvas.drawBitmap(this.f10297g, (Rect) null, this.f10303m, (Paint) null);
                            lockCanvas.drawRect(this.f10303m, this.f10301k);
                            int i = this.f10296f;
                            if (i >= 0) {
                                Bitmap[] bitmapArr = this.f10299i;
                                this.f10296f = i + 1;
                                Bitmap bitmap2 = bitmapArr[i];
                                if (bitmap2 != null && !bitmap2.isRecycled()) {
                                    lockCanvas.drawBitmap(bitmap2, (Rect) null, this.f10305o, this.f10300j);
                                }
                                if (this.f10296f >= this.f10302l) {
                                    this.f10296f = -1;
                                }
                            }
                            Bitmap bitmap3 = this.f10298h;
                            if (bitmap3 != null && !bitmap3.isRecycled()) {
                                lockCanvas.drawBitmap(this.f10298h, (Rect) null, this.f10304n, this.f10300j);
                            }
                            this.f10294d.unlockCanvasAndPost(lockCanvas);
                            Handler handler = this.f10292b;
                            if (handler != null) {
                                handler.sendEmptyMessageDelayed(233, 130);
                                break;
                            }
                        }
                    } catch (Exception e) {
                        C6555i.m14021b();
                        C3854a.m9455a(6, "ttlive_exception", e.getStackTrace());
                    }
                }
                break;
            case 234:
                if (this.f10296f < 0) {
                    this.f10296f = 0;
                    break;
                }
                break;
            case 235:
                this.f10306p = true;
                Bitmap bitmap4 = this.f10291a;
                if (bitmap4 != null && !bitmap4.isRecycled()) {
                    this.f10291a.recycle();
                    this.f10291a = null;
                }
                Bitmap bitmap5 = this.f10297g;
                if (bitmap5 != null && !bitmap5.isRecycled()) {
                    this.f10297g.recycle();
                    this.f10297g = null;
                }
                Bitmap bitmap6 = this.f10298h;
                if (bitmap6 != null && !bitmap6.isRecycled()) {
                    this.f10298h.recycle();
                    this.f10298h = null;
                }
                Bitmap[] bitmapArr2 = this.f10299i;
                if (bitmapArr2 != null) {
                    for (Bitmap bitmap7 : bitmapArr2) {
                        if (bitmap7 != null && !bitmap7.isRecycled()) {
                            bitmap7.recycle();
                        }
                    }
                    this.f10299i = null;
                }
                this.f10294d.release();
                this.f10294d = null;
                break;
        }
        MethodCollector.m26664o(6075);
        return true;
    }

    public HandlerThreadC3714a(Surface surface, C3716a aVar) {
        super("AudioEffectDrewThread");
        MethodCollector.m26663i(5920);
        this.f10294d = surface;
        this.f10295e = aVar;
        this.f10303m = new Rect(0, 0, aVar.f10309b, aVar.f10310c);
        int i = (int) (((float) aVar.f10309b) * 0.41935483f);
        int i2 = (aVar.f10309b - i) / 2;
        int i3 = (aVar.f10310c - i) / 2;
        this.f10304n = new Rect(i2, i3, i2 + i, i + i3);
        int i4 = (int) (((float) aVar.f10309b) * 0.5645161f);
        int i5 = (aVar.f10309b - i4) / 2;
        int i6 = (aVar.f10310c - i4) / 2;
        this.f10305o = new Rect(i5, i6, i5 + i4, i4 + i6);
        Paint paint = new Paint(1);
        this.f10300j = paint;
        paint.setAntiAlias(true);
        this.f10300j.setFilterBitmap(true);
        this.f10300j.setDither(true);
        Paint paint2 = new Paint(1);
        this.f10301k = paint2;
        paint2.setAntiAlias(true);
        this.f10301k.setFilterBitmap(true);
        this.f10301k.setDither(true);
        this.f10301k.setColor(Color.parseColor("#80000000"));
        this.f10291a = BitmapFactory.decodeResource(C3966y.m9669e().getResources(), R.drawable.bxm);
        MethodCollector.m26664o(5920);
    }
}
