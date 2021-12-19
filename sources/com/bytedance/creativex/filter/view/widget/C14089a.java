package com.bytedance.creativex.filter.view.widget;

import android.content.Context;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.creativex.filter.view.widget.a */
public class C14089a extends RelativeLayout {

    /* renamed from: a */
    public static final String f34271a = C14089a.class.getSimpleName();

    /* renamed from: b */
    public TextView f34272b;

    /* renamed from: c */
    public TextView f34273c;

    /* renamed from: d */
    public float f34274d;

    /* renamed from: e */
    public Runnable f34275e;

    /* renamed from: f */
    private RunnableC14092a f34276f;

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    static {
        Covode.recordClassIndex(16158);
    }

    /* renamed from: com.bytedance.creativex.filter.view.widget.a$a */
    class RunnableC14092a implements Runnable {

        /* renamed from: a */
        CharSequence f34279a;

        /* renamed from: b */
        CharSequence f34280b;

        /* renamed from: c */
        boolean f34281c;

        static {
            Covode.recordClassIndex(16161);
        }

        public final void run() {
            float f;
            TextView textView;
            TextView textView2;
            float f2;
            if (C14089a.this.f34272b != null && C14089a.this.f34273c != null) {
                C14089a.this.animate().cancel();
                C14089a.this.f34272b.animate().cancel();
                C14089a.this.f34273c.animate().cancel();
                C14089a aVar = C14089a.this;
                aVar.removeCallbacks(aVar.f34275e);
                C14089a.this.setAlpha(1.0f);
                C14089a.this.setVisibility(0);
                if (this.f34281c) {
                    f = C14089a.this.f34274d;
                } else {
                    f = 0.0f;
                }
                if (this.f34281c) {
                    textView = C14089a.this.f34272b;
                } else {
                    textView = C14089a.this.f34273c;
                }
                if (this.f34281c) {
                    textView2 = C14089a.this.f34273c;
                } else {
                    textView2 = C14089a.this.f34272b;
                }
                if (this.f34281c) {
                    f2 = 0.0f;
                } else {
                    f2 = C14089a.this.f34274d;
                }
                textView.setTranslationX(f2);
                textView2.setTranslationX(f2);
                textView.setAlpha(1.0f);
                textView2.setAlpha(0.0f);
                textView.setText(this.f34279a);
                textView2.setText(this.f34280b);
                textView.animate().translationX(f).alpha(0.0f).withEndAction(new Runnable() {
                    /* class com.bytedance.creativex.filter.view.widget.C14089a.RunnableC14092a.RunnableC140931 */

                    static {
                        Covode.recordClassIndex(16162);
                    }

                    public final void run() {
                        C14089a.this.postDelayed(C14089a.this.f34275e, 600);
                    }
                }).setDuration(300).start();
                textView2.animate().translationX(f).alpha(1.0f).setDuration(300).start();
            }
        }

        public RunnableC14092a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
            this.f34279a = charSequence;
            this.f34280b = charSequence2;
            this.f34281c = z;
        }
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public C14089a(Context context) {
        this(context, (byte) 0);
    }

    private C14089a(Context context, byte b) {
        this(context, (char) 0);
    }

    private C14089a(Context context, char c) {
        super(context, null, 0);
        MethodCollector.m26663i(9608);
        this.f34275e = new Runnable() {
            /* class com.bytedance.creativex.filter.view.widget.C14089a.RunnableC140901 */

            static {
                Covode.recordClassIndex(16159);
            }

            public final void run() {
                C14089a.this.animate().alpha(0.0f).withEndAction(new Runnable() {
                    /* class com.bytedance.creativex.filter.view.widget.C14089a.RunnableC140901.RunnableC140911 */

                    static {
                        Covode.recordClassIndex(16160);
                    }

                    public final void run() {
                        C14089a.this.setVisibility(8);
                    }
                }).setDuration(300).start();
            }
        };
        inflate(getContext(), R.layout.b3l, this);
        this.f34272b = (TextView) findViewById(R.id.b30);
        this.f34273c = (TextView) findViewById(R.id.dth);
        this.f34272b.setAlpha(1.0f);
        this.f34273c.setAlpha(1.0f);
        this.f34273c.setVisibility(0);
        this.f34272b.setVisibility(0);
        MethodCollector.m26664o(9608);
    }

    /* renamed from: a */
    public final void mo22632a(CharSequence charSequence, CharSequence charSequence2, boolean z) {
        RunnableC14092a aVar = new RunnableC14092a(charSequence, charSequence2, z);
        if (this.f34274d != 0.0f) {
            aVar.run();
        } else {
            this.f34276f = aVar;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(9610);
        super.onLayout(z, i, i2, i3, i4);
        TextView textView = this.f34272b;
        if (!(textView == null || this.f34273c == null)) {
            this.f34274d = textView.getX() - this.f34273c.getX();
        }
        RunnableC14092a aVar = this.f34276f;
        if (aVar != null) {
            aVar.run();
            this.f34276f = null;
        }
        MethodCollector.m26664o(9610);
    }
}
