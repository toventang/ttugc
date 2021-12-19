package com.p2082ss.android.p2092ad.splash.core;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.p2092ad.splash.AbstractC29675p;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29455b;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29457c;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29462f;
import com.p2082ss.android.p2092ad.splash.core.p2100e.C29474p;
import com.p2082ss.android.p2092ad.splash.core.p2104i.AbstractC29503a;
import com.p2082ss.android.p2092ad.splash.core.p2104i.C29506c;
import com.p2082ss.android.p2092ad.splash.core.video.AbstractC29569b;
import com.p2082ss.android.p2092ad.splash.core.video.C29571c;
import com.p2082ss.android.p2092ad.splash.core.video.C29582f;
import com.p2082ss.android.p2092ad.splash.core.video.C29584g;
import com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b;
import com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29621g;
import com.p2082ss.android.p2092ad.splash.core.video2.BDASplashVideoView;
import com.p2082ss.android.p2092ad.splash.core.video2.C29613c;
import com.p2082ss.android.p2092ad.splash.core.video2.C29618f;
import com.p2082ss.android.p2092ad.splash.p2095c.AbstractC29383a;
import com.p2082ss.android.p2092ad.splash.p2109f.C29644g;
import com.p2082ss.android.p2092ad.splash.p2109f.C29654j;
import com.p2082ss.android.p2092ad.splash.p2109f.C29657l;
import com.p2082ss.android.p2092ad.splash.p2109f.C29658m;
import com.p2082ss.android.p2092ad.splash.p2109f.C29661o;
import com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q;
import com.p2082ss.android.ugc.trill.R;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.b */
public final class C29390b extends RelativeLayout implements AbstractC29502i, HandlerC29663q.AbstractC29664a {

    /* renamed from: A */
    boolean f69777A = false;

    /* renamed from: B */
    private long f69778B = 0;

    /* renamed from: C */
    private Space f69779C;

    /* renamed from: D */
    private TextView f69780D;

    /* renamed from: E */
    private Timer f69781E;

    /* renamed from: a */
    public C29455b f69782a;

    /* renamed from: b */
    public BDASplashImageView f69783b;

    /* renamed from: c */
    ImageView f69784c;

    /* renamed from: d */
    Space f69785d;

    /* renamed from: e */
    ViewGroup f69786e;

    /* renamed from: f */
    TextView f69787f;

    /* renamed from: g */
    ImageView f69788g;

    /* renamed from: h */
    RotateAnimation f69789h;

    /* renamed from: i */
    ViewGroup f69790i;

    /* renamed from: j */
    FrameLayout f69791j;

    /* renamed from: k */
    TextView f69792k;

    /* renamed from: l */
    public View f69793l;

    /* renamed from: m */
    TextView f69794m;

    /* renamed from: n */
    public C29584g f69795n;

    /* renamed from: o */
    public AbstractC29541p f69796o;

    /* renamed from: p */
    public HandlerC29663q f69797p = new HandlerC29663q(this);

    /* renamed from: q */
    boolean f69798q = false;

    /* renamed from: r */
    long f69799r = 0;

    /* renamed from: s */
    public boolean f69800s = false;

    /* renamed from: t */
    FrameLayout f69801t;

    /* renamed from: u */
    TextView f69802u;

    /* renamed from: v */
    TextView f69803v;

    /* renamed from: w */
    BDASplashVideoView f69804w;

    /* renamed from: x */
    public AbstractC29621g f69805x;

    /* renamed from: y */
    public int f69806y = -1;

    /* renamed from: z */
    int f69807z = -1;

    static {
        Covode.recordClassIndex(35784);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29502i
    /* renamed from: b */
    public final void mo51391b() {
    }

    public final boolean performClick() {
        return super.performClick();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51388a() {
        C29539n.m59216a().mo51655a(System.currentTimeMillis());
        this.f69796o.mo51662b();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C29644g.m59688b("Detached!");
        m58875e();
        C29495h.m59109h().mo51600i();
    }

    /* renamed from: d */
    private void m58874d() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        int a = (int) C29661o.m59767a(getContext(), 9.0f);
        layoutParams.setMargins(0, (int) C29661o.m59767a(getContext(), 14.0f), a, 0);
        int i = Build.VERSION.SDK_INT;
        layoutParams.addRule(21);
        layoutParams.setMarginStart(0);
        layoutParams.setMarginEnd(a);
        this.f69792k.setLayoutParams(layoutParams);
    }

    @Override // com.p2082ss.android.p2092ad.splash.core.AbstractC29502i
    /* renamed from: c */
    public final void mo51394c() {
        C29644g.m59688b("on background");
        C29584g gVar = this.f69795n;
        if (!(gVar == null || gVar.f70536d == null)) {
            C29571c cVar = gVar.f70536d;
            if (cVar.f70455a != null) {
                cVar.f70455a.mo51797j();
            }
        }
        AbstractC29621g gVar2 = this.f69805x;
        if (gVar2 != null && gVar2.mo51867e()) {
            this.f69805x.mo51860a(true);
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29390b.ViewTreeObserver$OnPreDrawListenerC294026 */

            static {
                Covode.recordClassIndex(35796);
            }

            public final boolean onPreDraw() {
                C29390b.this.getViewTreeObserver().removeOnPreDrawListener(this);
                C29390b bVar = C29390b.this;
                if (bVar.f69798q) {
                    bVar.f69797p.removeMessages(1);
                    bVar.f69797p.sendEmptyMessageDelayed(1, bVar.f69799r);
                    bVar.mo51388a();
                }
                C29390b.this.f69796o.mo51663b(C29390b.this.f69782a);
                return true;
            }
        });
        if (this.f69777A && this.f69781E == null) {
            Timer timer = new Timer();
            this.f69781E = timer;
            timer.scheduleAtFixedRate(new TimerTask() {
                /* class com.p2082ss.android.p2092ad.splash.core.C29390b.C294037 */

                static {
                    Covode.recordClassIndex(35797);
                }

                public final void run() {
                    Message obtainMessage = C29390b.this.f69797p.obtainMessage();
                    obtainMessage.what = 2;
                    C29390b.this.f69797p.sendMessage(obtainMessage);
                }
            }, (this.f69799r % 1000) + 1000, 1000);
        }
        C29644g.m59688b("onAttachedToWindow");
        C29535k.m59196a().mo51647a(this.f69782a.f70026d, 1000);
    }

    /* renamed from: e */
    private void m58875e() {
        C29584g gVar = this.f69795n;
        if (gVar != null) {
            gVar.mo51838d();
            this.f69795n = null;
        }
        RotateAnimation rotateAnimation = this.f69789h;
        if (rotateAnimation != null) {
            rotateAnimation.cancel();
            this.f69789h = null;
        }
        BDASplashImageView bDASplashImageView = this.f69783b;
        if (bDASplashImageView != null) {
            try {
                Bitmap bitmap = ((BitmapDrawable) bDASplashImageView.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    bitmap.recycle();
                    this.f69783b.setImageBitmap(null);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        C29618f.m59608a().mo51909b();
        AbstractC29621g gVar2 = this.f69805x;
        if (gVar2 != null) {
            gVar2.mo51872j();
            this.f69805x = null;
            this.f69804w = null;
        }
        if (this.f69781E != null) {
            C29644g.m59688b("splash_count_down. detach: timer canceled");
            this.f69781E.cancel();
            this.f69781E = null;
        }
    }

    public final void setSplashAdInteraction(AbstractC29541p pVar) {
        this.f69796o = pVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final AbstractC29612b mo51393c(final C29455b bVar) {
        return new C29613c() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29390b.C294015 */

            static {
                Covode.recordClassIndex(35795);
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b, com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: b */
            public final void mo51424b() {
                C29390b.this.f69796o.mo51658a();
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b, com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: a */
            public final void mo51421a() {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject.put("show_expected", bVar.f70025c);
                    String str = "not_real_time";
                    if (bVar.f69978C) {
                        str = "real_time";
                    }
                    jSONObject.put("show_type", str);
                    int i = 1;
                    jSONObject.putOpt("play_order", 1);
                    if (C29495h.f70200X != -1) {
                        if (C29495h.f70200X != 1) {
                            i = 2;
                        }
                        jSONObject.put("awemelaunch", i);
                    }
                    jSONObject.put("ad_sequence", C29556v.m59363a().mo51759p());
                    jSONObject2.putOpt("ad_extra_data", jSONObject);
                    jSONObject2.putOpt("is_ad_event", "1");
                    if (!C29657l.m59760a(bVar.f70032j)) {
                        jSONObject2.put("log_extra", bVar.f70032j);
                    }
                    jSONObject2.put("ad_fetch_time", bVar.f70024b);
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject2 = null;
                }
                C29495h.m59099a(bVar.f70026d, "splash_ad", "play", jSONObject2);
                if (bVar.f70040r != null) {
                    C29506c.C29507a aVar = new C29506c.C29507a();
                    aVar.f70264a = C29654j.m59706a((AbstractC29383a) bVar);
                    C29506c a = aVar.mo51606a();
                    if (C29495h.m59095a().f70654b) {
                        C29495h.m59108g().mo51602a(C29390b.this.f69783b, "play", bVar.f70026d, bVar.f70040r.f70121a, bVar.f70032j, true, -1, null, a);
                    } else {
                        C29495h.m59108g().mo51604c(C29390b.this.f69783b, bVar.f70026d, bVar.f70040r.f70121a, bVar.f70032j, true, -1, null, a);
                    }
                }
                AbstractC29503a h = C29495h.m59109h();
                long g = (long) C29390b.this.f69805x.mo51869g();
                C29390b.this.f69805x.mo51865c();
                C29390b.this.f69805x.mo51866d();
                h.mo51590a(g);
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b, com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: a */
            public final void mo51422a(int i) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("play_order", 1);
                    jSONObject.put("ad_extra_data", jSONObject2);
                    jSONObject.put("duration", Long.toString((long) i));
                    jSONObject.put("percent", Integer.toString(100));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.f70024b);
                    if (!C29657l.m59760a(bVar.f70032j)) {
                        jSONObject.put("log_extra", bVar.f70032j);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject = null;
                }
                C29495h.m59099a(bVar.f70026d, "splash_ad", "play_over", jSONObject);
                if (bVar.f70040r != null) {
                    C29506c.C29507a aVar = new C29506c.C29507a();
                    aVar.f70264a = C29654j.m59706a((AbstractC29383a) bVar);
                    C29506c a = aVar.mo51606a();
                    if (C29495h.m59095a().f70654b) {
                        C29495h.m59108g().mo51602a(C29390b.this.f69783b, "play_over", bVar.f70026d, bVar.f70040r.f70122b, bVar.f70032j, true, -1, null, a);
                    } else {
                        C29495h.m59108g().mo51605d(C29390b.this.f69783b, bVar.f70026d, bVar.f70040r.f70122b, bVar.f70032j, true, -1, null, a);
                    }
                }
                C29495h.m59109h().mo51595d();
                C29390b.this.f69796o.mo51659a(bVar);
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: b */
            public final void mo51425b(int i, int i2) {
                C29495h.m59109h().mo51589a();
                m58895a(i, i2, "first_quartile");
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: c */
            public final void mo51426c(int i, int i2) {
                C29495h.m59109h().mo51593b();
                m58895a(i, i2, "midpoint");
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: d */
            public final void mo51427d(int i, int i2) {
                C29495h.m59109h().mo51594c();
                m58895a(i, i2, "third_quartile");
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video2.AbstractC29612b, com.p2082ss.android.p2092ad.splash.core.video2.C29613c
            /* renamed from: a */
            public final void mo51423a(int i, int i2) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j = (long) i;
                    jSONObject.put("duration", Long.toString(j));
                    jSONObject.put("percent", C29658m.m59761a(j, (long) i2));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.f70024b);
                    jSONObject.put("break_reason", C29390b.this.f69806y);
                    if (!C29657l.m59760a(bVar.f70032j)) {
                        jSONObject.put("log_extra", bVar.f70032j);
                    }
                    jSONObject2.put("break_reason", C29390b.this.f69806y);
                    jSONObject2.putOpt("play_order", 1);
                    jSONObject.put("ad_extra_data", jSONObject2);
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject = null;
                }
                C29495h.m59099a(bVar.f70026d, "splash_ad", "play_break", jSONObject);
                if (C29390b.this.f69806y != 1) {
                    C29495h.m59109h().mo51598g();
                }
            }

            /* renamed from: a */
            private void m58895a(int i, int i2, String str) {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("play_order", 1);
                    jSONObject.put("ad_extra_data", jSONObject2);
                    long j = (long) i2;
                    jSONObject.put("duration", Long.toString(j));
                    jSONObject.put("percent", C29658m.m59761a((long) i, j));
                    jSONObject.put("is_ad_event", "1");
                    jSONObject.put("ad_fetch_time", bVar.f70024b);
                    if (!TextUtils.isEmpty(bVar.f70032j)) {
                        jSONObject.put("log_extra", bVar.f70032j);
                    }
                } catch (Throwable unused) {
                }
                C29495h.m59099a(bVar.f70026d, "splash_ad", str, jSONObject);
            }
        };
    }

    /* access modifiers changed from: package-private */
    public final void setImageTouchListener(final C29455b bVar) {
        setOnTouchListener(new View.OnTouchListener() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29390b.View$OnTouchListenerC293911 */

            static {
                Covode.recordClassIndex(35785);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                String str;
                if ((C29390b.this.getTouchDelegate() == null || !C29390b.this.getTouchDelegate().onTouchEvent(motionEvent)) && motionEvent.getAction() == 1) {
                    if (C29390b.this.f69800s) {
                        str = "click_normal_area";
                    } else {
                        str = "";
                    }
                    C29457c.C29458a aVar = new C29457c.C29458a();
                    aVar.f70059a = 0;
                    C29457c.C29458a a = aVar.mo51556a((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                    a.f70062d = C29390b.this.f69800s;
                    a.f70061c = str;
                    C29390b.this.f69796o.mo51661a(bVar, a.mo51557a());
                }
                return true;
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final void setSplashAdListener(final C29455b bVar) {
        this.f69795n.f70537e = new AbstractC29569b.AbstractC29570a() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29390b.C2939614 */

            static {
                Covode.recordClassIndex(35790);
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video.AbstractC29569b.AbstractC29570a
            /* renamed from: a */
            public final void mo51411a() {
                C29390b.this.f69796o.mo51658a();
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video.AbstractC29569b.AbstractC29570a
            /* renamed from: b */
            public final void mo51414b() {
                C29390b.this.f69796o.mo51660a(bVar, -1);
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video.AbstractC29569b.AbstractC29570a
            /* renamed from: c */
            public final void mo51415c() {
                C29390b.this.f69796o.mo51659a(bVar);
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video.AbstractC29569b.AbstractC29570a
            /* renamed from: a */
            public final void mo51413a(long j) {
                C29644g.m59688b("Video play Complete ".concat(String.valueOf(j)));
                C29390b.this.f69796o.mo51659a(bVar);
            }

            @Override // com.p2082ss.android.p2092ad.splash.core.video.AbstractC29569b.AbstractC29570a
            /* renamed from: a */
            public final void mo51412a(int i, int i2) {
                C29457c.C29458a aVar = new C29457c.C29458a();
                aVar.f70060b = true;
                C29390b.this.f69796o.mo51664b(bVar, aVar.mo51556a(i, i2).mo51557a());
            }
        };
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 4 || i == 8) {
            m58875e();
        }
    }

    /* access modifiers changed from: package-private */
    public final void setSkipClickListener(final C29455b bVar) {
        this.f69801t.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29390b.View$OnClickListenerC2939412 */

            static {
                Covode.recordClassIndex(35788);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (C29390b.this.f69795n != null) {
                    C29390b.this.f69795n.mo51837c();
                }
                if (C29390b.this.f69805x != null) {
                    C29390b.this.f69806y = 2;
                    C29390b.this.f69805x.mo51863b();
                }
                C29390b.this.f69796o.mo51660a(bVar, -1);
            }
        });
        this.f69786e.setOnClickListener(new View.OnClickListener() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29390b.View$OnClickListenerC2939513 */

            static {
                Covode.recordClassIndex(35789);
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (C29390b.this.f69795n != null) {
                    C29390b.this.f69795n.mo51837c();
                }
                if (C29390b.this.f69805x != null) {
                    C29390b.this.f69806y = 2;
                    C29390b.this.f69805x.mo51863b();
                }
                if (C29495h.f70248x) {
                    C29390b bVar = C29390b.this;
                    bVar.f69787f.setVisibility(4);
                    bVar.f69788g.setVisibility(0);
                    bVar.f69789h = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
                    bVar.f69789h.setDuration(800);
                    bVar.f69789h.setRepeatCount(-1);
                    bVar.f69789h.setRepeatMode(1);
                    bVar.f69789h.setInterpolator(new LinearInterpolator());
                    bVar.f69788g.startAnimation(bVar.f69789h);
                }
                C29390b.this.f69796o.mo51660a(bVar, -1);
            }
        });
    }

    /* renamed from: a */
    static String m58873a(int i) {
        if (i < 0) {
            i = 0;
        }
        if (C29495h.f70249y != 0) {
            return C1764a.m5928a("%ds %s", new Object[]{Integer.valueOf(i), C29495h.f70242r.getResources().getString(C29495h.f70249y)});
        }
        return C1764a.m5928a("%ds %s", new Object[]{Integer.valueOf(i), C29495h.f70242r.getResources().getString(R.string.g06)});
    }

    /* access modifiers changed from: package-private */
    public final void setSkipAndWifiPreloadLayout(C29455b bVar) {
        if (bVar.mo51552v()) {
            if (bVar.f70037o == 1) {
                this.f69801t.setVisibility(0);
            } else {
                this.f69801t.setVisibility(8);
            }
            if (C29495h.f70180D) {
                this.f69803v.setVisibility(0);
            }
            this.f69780D.setVisibility(0);
            mo51389a(bVar.mo51552v(), bVar.mo51541g());
            return;
        }
        if (bVar.f70037o == 1) {
            this.f69786e.setVisibility(0);
        } else {
            this.f69786e.setVisibility(8);
            m58874d();
        }
        if (C29495h.f70180D) {
            this.f69792k.setVisibility(0);
        }
    }

    /* access modifiers changed from: package-private */
    public final void setSplashInfoStyle(C29455b bVar) {
        if (!bVar.mo51552v()) {
            if (!bVar.mo51541g() && C29495h.f70178B == 1) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.addRule(12);
                int a = (int) C29661o.m59767a(getContext(), 10.0f);
                layoutParams.setMargins(0, 0, a, (int) C29661o.m59767a(getContext(), 10.0f));
                int i = Build.VERSION.SDK_INT;
                layoutParams.addRule(21);
                layoutParams.setMarginStart(0);
                layoutParams.setMarginEnd(a);
                this.f69786e.setLayoutParams(layoutParams);
                m58874d();
            } else if (bVar.f70037o != 1) {
                m58874d();
            }
        }
    }

    @Override // com.p2082ss.android.p2092ad.splash.p2109f.HandlerC29663q.AbstractC29664a
    /* renamed from: a */
    public final void mo28809a(Message message) {
        if (message.what == 1) {
            C29644g.m59688b("display timeout");
            Timer timer = this.f69781E;
            if (timer != null) {
                timer.cancel();
                this.f69781E = null;
            }
            this.f69796o.mo51659a(this.f69782a);
        } else if (message.what == 2) {
            int i = this.f69807z - 1;
            this.f69807z = i;
            C29644g.m59688b("splash count down. display seconds left: ".concat(String.valueOf(i)));
            if (i == 0) {
                Timer timer2 = this.f69781E;
                if (timer2 != null) {
                    timer2.cancel();
                    this.f69781E = null;
                    return;
                }
                return;
            }
            String a = m58873a(i);
            this.f69787f.setText(a);
            this.f69802u.setText(a);
        }
    }

    public C29390b(Context context) {
        super(context);
        MethodCollector.m26663i(8707);
        inflate(getContext(), R.layout.b0t, this);
        if (C29495h.f70177A != 0) {
            try {
                TypedArray obtainStyledAttributes = new ContextThemeWrapper(getContext(), C29495h.f70177A).getTheme().obtainStyledAttributes(new int[]{16842836});
                setBackgroundDrawable(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
            } catch (Throwable unused) {
            }
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (C29661o.m59776d(getContext())) {
            findViewById(R.id.e52).setVisibility(0);
        }
        try {
            this.f69783b = (BDASplashImageView) findViewById(R.id.e5d);
            try {
                this.f69804w = (BDASplashVideoView) findViewById(R.id.e5c);
                this.f69785d = (Space) findViewById(R.id.qm);
                this.f69792k = (TextView) findViewById(R.id.fv);
                this.f69793l = findViewById(R.id.e56);
                this.f69794m = (TextView) findViewById(R.id.e58);
                this.f69786e = (ViewGroup) findViewById(R.id.eg);
                this.f69787f = (TextView) findViewById(R.id.ft);
                this.f69784c = (ImageView) findViewById(R.id.fy);
                this.f69801t = (FrameLayout) findViewById(R.id.d1);
                this.f69802u = (TextView) findViewById(R.id.d2);
                this.f69779C = (Space) findViewById(R.id.d0);
                this.f69803v = (TextView) findViewById(R.id.d4);
                this.f69780D = (TextView) findViewById(R.id.d3);
                if (C29495h.f70246v != 0) {
                    this.f69792k.setText(C29495h.f70246v);
                    this.f69803v.setText(C29495h.f70246v);
                } else {
                    this.f69792k.setText(R.string.g09);
                    this.f69803v.setText(R.string.g09);
                }
                if (C29495h.f70249y != 0) {
                    this.f69787f.setText(C29495h.f70249y);
                } else {
                    this.f69787f.setText(R.string.g06);
                }
                if (C29495h.f70247w != 0) {
                    this.f69787f.setBackgroundResource(C29495h.f70247w);
                    this.f69802u.setBackgroundResource(C29495h.f70247w);
                }
                this.f69788g = (ImageView) findViewById(R.id.fs);
                if (C29495h.f70179C != 0) {
                    this.f69788g.setImageResource(C29495h.f70179C);
                } else {
                    this.f69788g.setImageResource(2131233891);
                }
                this.f69790i = (ViewGroup) findViewById(R.id.e5b);
                this.f69791j = (FrameLayout) findViewById(R.id.e5a);
                if (this.f69783b != null && C29495h.f70191O == 1) {
                    this.f69783b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                MethodCollector.m26664o(8707);
            } catch (ClassCastException e) {
                RuntimeException runtimeException = new RuntimeException("curClassLoader: " + BDASplashImageView.class.getClassLoader() + "; objClassLoader:" + findViewById(R.id.e5c).getClass().getClassLoader(), e);
                MethodCollector.m26664o(8707);
                throw runtimeException;
            }
        } catch (ClassCastException e2) {
            RuntimeException runtimeException2 = new RuntimeException("curClassLoader: " + BDASplashImageView.class.getClassLoader() + "; objClassLoader:" + findViewById(R.id.e5d).getClass().getClassLoader(), e2);
            MethodCollector.m26664o(8707);
            throw runtimeException2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo51392b(final C29455b bVar) {
        int i;
        try {
            boolean g = bVar.mo51541g();
            mo51389a(bVar.mo51552v(), g);
            if (g) {
                ViewGroup.LayoutParams layoutParams = this.f69785d.getLayoutParams();
                layoutParams.height = C29654j.m59702a();
                this.f69785d.setLayoutParams(layoutParams);
                this.f69785d.setVisibility(4);
                this.f69784c.setVisibility(8);
            } else {
                this.f69785d.setVisibility(8);
                this.f69784c.setVisibility(0);
            }
            if (C29495h.f70180D && bVar.f70035m == 1) {
                if (bVar.mo51552v()) {
                    this.f69803v.setVisibility(0);
                } else {
                    this.f69792k.setVisibility(0);
                }
            }
            C29462f fVar = bVar.f70001a;
            String b = C29654j.m59739b(fVar);
            if (C29657l.m59760a(b)) {
                return false;
            }
            if (C29495h.f70229e == null) {
                return false;
            }
            if (TextUtils.isEmpty(fVar.f70079e)) {
                C29495h.f70229e.mo28692a(this.f69783b, b, bVar.f70035m, new AbstractC29675p() {
                    /* class com.p2082ss.android.p2092ad.splash.core.C29390b.C293993 */

                    static {
                        Covode.recordClassIndex(35793);
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29675p
                    /* renamed from: a */
                    public final void mo51418a() {
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29675p
                    /* renamed from: c */
                    public final void mo51420c() {
                        C29390b.this.f69796o.mo51658a();
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29675p
                    /* renamed from: b */
                    public final void mo51419b() {
                        C29390b.this.f69796o.mo51659a(bVar);
                    }
                });
            } else {
                C29495h.f70229e.mo28693a(this.f69783b, b, bVar.f70035m, fVar.f70079e, new AbstractC29675p() {
                    /* class com.p2082ss.android.p2092ad.splash.core.C29390b.C294004 */

                    static {
                        Covode.recordClassIndex(35794);
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29675p
                    /* renamed from: a */
                    public final void mo51418a() {
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29675p
                    /* renamed from: c */
                    public final void mo51420c() {
                        C29390b.this.f69796o.mo51658a();
                    }

                    @Override // com.p2082ss.android.p2092ad.splash.AbstractC29675p
                    /* renamed from: b */
                    public final void mo51419b() {
                        C29390b.this.f69796o.mo51659a(bVar);
                    }
                });
            }
            if (bVar.f70039q == 0 || bVar.f70039q == 4) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("show_expected", Integer.valueOf(bVar.f70025c));
                String str = "not_real_time";
                if (bVar.f69978C) {
                    str = "real_time";
                }
                jSONObject.putOpt("show_type", str);
                if (C29495h.f70200X != -1) {
                    if (C29495h.f70200X == 1) {
                        i = 1;
                    } else {
                        i = 2;
                    }
                    jSONObject.put("awemelaunch", i);
                }
                jSONObject.put("ad_sequence", C29556v.m59363a().mo51759p());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt("ad_extra_data", jSONObject);
                jSONObject2.put("is_ad_event", "1");
                if (!C29657l.m59760a(bVar.f70032j)) {
                    jSONObject2.put("log_extra", bVar.f70032j);
                }
                jSONObject2.put("ad_fetch_time", bVar.f70024b);
                C29495h.m59099a(bVar.f70026d, "splash_ad", "show", jSONObject2);
                C29506c.C29507a aVar = new C29506c.C29507a();
                aVar.f70264a = C29654j.m59706a((AbstractC29383a) bVar);
                C29506c a = aVar.mo51606a();
                if (C29495h.m59095a().f70654b) {
                    C29495h.m59108g().mo51602a(this.f69783b, "show", bVar.f70026d, bVar.f70046x, bVar.f70032j, true, -1, null, a);
                } else {
                    C29495h.m59108g().mo51601a(this.f69783b, bVar.f70026d, bVar.f70046x, bVar.f70032j, true, -1, null, a);
                }
            }
            this.f69783b.f69769a = bVar;
            this.f69783b.setInteraction(this.f69796o);
            this.f69783b.setVisibility(0);
            return true;
        } catch (Exception unused) {
            this.f69796o.mo51658a();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo51390a(final C29455b bVar) {
        boolean z;
        boolean z2;
        if (bVar.f70040r == null || bVar.f70001a == null) {
            return false;
        }
        String str = "real_time";
        if (C29495h.f70202Z) {
            this.f69804w.setVisibility(0);
            int i = getResources().getDisplayMetrics().heightPixels;
            if (bVar.mo51541g()) {
                i -= C29654j.m59702a();
                this.f69784c.setVisibility(8);
            } else {
                this.f69784c.setVisibility(0);
            }
            C29474p pVar = bVar.f70040r;
            int i2 = bVar.f70001a.f70077c;
            int i3 = pVar.f70127g;
            if (i2 == 0 || i3 == 0) {
                return false;
            }
            boolean b = mo51392b(bVar);
            AbstractC29621g a = C29654j.m59710a(this.f69804w);
            this.f69805x = a;
            a.mo51859a(mo51393c(bVar));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            int i4 = (i - ((int) (((float) i3) * (((float) i) / ((float) i2))))) / 2;
            layoutParams.topMargin = i4;
            layoutParams.bottomMargin = i4;
            this.f69804w.setSurfaceLayoutParams(layoutParams);
            String b2 = C29654j.m59740b(pVar);
            if (C29657l.m59760a(b2)) {
                return false;
            }
            if (!this.f69805x.mo51862a(b2, pVar.f70129i) || !b) {
                z2 = false;
            } else {
                z2 = true;
            }
            setSkipAndWifiPreloadLayout(bVar);
            setSkipClickListener(bVar);
            setOnTouchListener(new View.OnTouchListener() {
                /* class com.p2082ss.android.p2092ad.splash.core.C29390b.View$OnTouchListenerC294059 */

                static {
                    Covode.recordClassIndex(35799);
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        C29457c.C29458a aVar = new C29457c.C29458a();
                        aVar.f70060b = false;
                        boolean b = C29390b.this.f69796o.mo51664b(bVar, aVar.mo51556a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo51557a());
                        if (C29390b.this.f69805x != null && b) {
                            C29390b.this.f69806y = 1;
                            C29390b.this.f69805x.mo51863b();
                        }
                    }
                    return true;
                }
            });
            this.f69804w.setTextureViewOnTouchListener(new View.OnTouchListener() {
                /* class com.p2082ss.android.p2092ad.splash.core.C29390b.View$OnTouchListenerC2939210 */

                static {
                    Covode.recordClassIndex(35786);
                }

                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 1) {
                        C29457c.C29458a aVar = new C29457c.C29458a();
                        aVar.f70060b = true;
                        boolean b = C29390b.this.f69796o.mo51664b(bVar, aVar.mo51556a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo51557a());
                        if (C29390b.this.f69805x != null && b) {
                            C29390b.this.f69806y = 1;
                            C29390b.this.f69805x.mo51863b();
                        }
                    }
                    return true;
                }
            });
            if (z2) {
                C29618f.m59608a().mo51907a(bVar, C29495h.f70242r);
                C29618f.m59608a().mo51908a(this.f69805x, bVar.f69990O, bVar.mo51536c());
                mo51388a();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (!bVar.f69978C) {
                        str = "not_real_time";
                    }
                    jSONObject.putOpt("show_type", str);
                    jSONObject.putOpt("show_expected", Integer.valueOf(bVar.f70025c));
                    jSONObject2.putOpt("ad_extra_data", jSONObject);
                    jSONObject2.putOpt("is_ad_event", "1");
                    jSONObject2.putOpt("log_extra", bVar.f70032j);
                    jSONObject2.putOpt("ad_fetch_time", Long.valueOf(bVar.f70024b));
                } catch (JSONException e) {
                    e.printStackTrace();
                    jSONObject2 = null;
                }
                C29495h.m59099a(bVar.f70026d, "splash_ad", "banner_show", jSONObject2);
            }
            return z2;
        }
        this.f69790i.setVisibility(0);
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f69790i.getLayoutParams();
        layoutParams2.height = -1;
        layoutParams2.width = -1;
        this.f69790i.setLayoutParams(layoutParams2);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i5 = displayMetrics.heightPixels;
        if (bVar.mo51541g()) {
            i5 -= C29654j.m59702a();
            this.f69784c.setVisibility(8);
        } else {
            this.f69784c.setVisibility(0);
        }
        C29474p pVar2 = bVar.f70040r;
        int i6 = bVar.f70001a.f70077c;
        int i7 = pVar2.f70127g;
        if (i6 == 0 || i7 == 0) {
            return false;
        }
        boolean b3 = mo51392b(bVar);
        int i8 = (int) (((float) i7) * (((float) i5) / ((float) i6)));
        this.f69795n = new C29584g(C29495h.f70242r, this.f69791j);
        setSplashAdListener(bVar);
        String b4 = C29654j.m59740b(pVar2);
        if (C29657l.m59760a(b4)) {
            return false;
        }
        C29582f.C29583a aVar = new C29582f.C29583a();
        aVar.f70516a = b4;
        aVar.f70517b = pVar2.f70124d;
        aVar.f70518c = bVar.f70026d;
        aVar.f70519d = displayMetrics.widthPixels;
        aVar.f70520e = i8;
        aVar.f70521f = pVar2.f70121a;
        aVar.f70522g = bVar.f70032j;
        aVar.f70523h = (i5 - i8) / 2;
        aVar.f70526k = bVar.f70025c;
        aVar.f70524i = false;
        aVar.f70525j = false;
        aVar.f70529n = bVar.mo51552v();
        aVar.f70531p = bVar.f69995T;
        aVar.f70532q = C29654j.m59706a((AbstractC29383a) bVar);
        C29582f a2 = aVar.mo51835a();
        this.f69795n.f70538f = bVar.f69978C;
        if (!this.f69795n.mo51836a(a2) || !b3) {
            z = false;
        } else {
            z = true;
        }
        setSkipAndWifiPreloadLayout(bVar);
        setSkipClickListener(bVar);
        setOnTouchListener(new View.OnTouchListener() {
            /* class com.p2082ss.android.p2092ad.splash.core.C29390b.View$OnTouchListenerC2939311 */

            static {
                Covode.recordClassIndex(35787);
            }

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    if (C29390b.this.f69795n != null) {
                        C29390b.this.f69795n.mo51837c();
                    }
                    C29457c.C29458a aVar = new C29457c.C29458a();
                    aVar.f70060b = false;
                    C29390b.this.f69796o.mo51664b(bVar, aVar.mo51556a((int) motionEvent.getRawX(), (int) motionEvent.getRawY()).mo51557a());
                }
                return true;
            }
        });
        if (z) {
            mo51388a();
            JSONObject jSONObject3 = new JSONObject();
            JSONObject jSONObject4 = new JSONObject();
            try {
                if (!bVar.f69978C) {
                    str = "not_real_time";
                }
                jSONObject3.putOpt("show_type", str);
                jSONObject3.putOpt("show_expected", Integer.valueOf(bVar.f70025c));
                jSONObject4.putOpt("ad_extra_data", jSONObject3);
                jSONObject4.putOpt("is_ad_event", "1");
                jSONObject4.putOpt("log_extra", bVar.f70032j);
                jSONObject4.putOpt("ad_fetch_time", Long.valueOf(bVar.f70024b));
            } catch (JSONException e2) {
                e2.printStackTrace();
                jSONObject4 = null;
            }
            C29495h.m59099a(bVar.f70026d, "splash_ad", "banner_show", jSONObject4);
        }
        return z;
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 24) {
            C29618f.m59608a().mo51910c();
        } else if (i == 25) {
            C29618f.m59608a().mo51910c();
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo51389a(boolean z, boolean z2) {
        if (z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f69779C.getLayoutParams();
            layoutParams.height = C29654j.m59754h() - 4;
            this.f69779C.setLayoutParams(layoutParams);
            int i = Build.VERSION.SDK_INT;
            this.f69801t.setPaddingRelative(4, 4, 0, 4);
            if (!z2) {
                this.f69802u.setBackgroundResource(R.drawable.bkm);
                this.f69802u.setTextColor(getResources().getColor(R.color.p_));
            } else {
                this.f69802u.setBackgroundResource(R.drawable.bkl);
                this.f69802u.setTextColor(getResources().getColor(R.color.pa));
            }
            this.f69780D.setVisibility(0);
        }
    }
}
