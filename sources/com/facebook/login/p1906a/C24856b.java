package com.facebook.login.p1906a;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.login.a.b */
public class C24856b {

    /* renamed from: a */
    private final String f59006a;

    /* renamed from: b */
    private final WeakReference<View> f59007b;

    /* renamed from: c */
    private final Context f59008c;

    /* renamed from: d */
    private C24860a f59009d;

    /* renamed from: e */
    private PopupWindow f59010e;

    /* renamed from: f */
    private EnumC24861b f59011f = EnumC24861b.BLUE;

    /* renamed from: g */
    private long f59012g = 6000;

    /* renamed from: h */
    private final ViewTreeObserver.OnScrollChangedListener f59013h = new ViewTreeObserver.OnScrollChangedListener() {
        /* class com.facebook.login.p1906a.C24856b.ViewTreeObserver$OnScrollChangedListenerC248571 */

        static {
            Covode.recordClassIndex(29046);
        }

        public final void onScrollChanged() {
            if (C24856b.m47658a(C24856b.this).get() != null && C24856b.m47659b(C24856b.this) != null && C24856b.m47659b(C24856b.this).isShowing()) {
                if (C24856b.m47659b(C24856b.this).isAboveAnchor()) {
                    C24856b.m47660c(C24856b.this).mo40762b();
                } else {
                    C24856b.m47660c(C24856b.this).mo40761a();
                }
            }
        }
    };

    static {
        Covode.recordClassIndex(29045);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.login.a.b$a */
    public class C24860a extends FrameLayout {

        /* renamed from: a */
        public ImageView f59017a = ((ImageView) findViewById(R.id.a8c));

        /* renamed from: b */
        public ImageView f59018b = ((ImageView) findViewById(R.id.a8a));

        /* renamed from: c */
        public View f59019c = findViewById(R.id.a84);

        /* renamed from: d */
        public ImageView f59020d = ((ImageView) findViewById(R.id.a85));

        static {
            Covode.recordClassIndex(29049);
        }

        /* renamed from: a */
        public final void mo40761a() {
            this.f59017a.setVisibility(0);
            this.f59018b.setVisibility(4);
        }

        /* renamed from: b */
        public final void mo40762b() {
            this.f59017a.setVisibility(4);
            this.f59018b.setVisibility(0);
        }

        public C24860a(Context context) {
            super(context);
            MethodCollector.m26663i(5934);
            LayoutInflater.from(getContext()).inflate(R.layout.ne, this);
            MethodCollector.m26664o(5934);
        }
    }

    /* renamed from: com.facebook.login.a.b$b */
    public enum EnumC24861b {
        BLUE,
        BLACK;

        static {
            Covode.recordClassIndex(29050);
        }
    }

    /* renamed from: c */
    private void m47661c() {
        if (!C24677a.m47209a(this)) {
            try {
                PopupWindow popupWindow = this.f59010e;
                if (popupWindow != null && popupWindow.isShowing()) {
                    if (this.f59010e.isAboveAnchor()) {
                        this.f59009d.mo40762b();
                    } else {
                        this.f59009d.mo40761a();
                    }
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: d */
    private void m47662d() {
        if (!C24677a.m47209a(this)) {
            try {
                m47663e();
                if (this.f59007b.get() != null) {
                    this.f59007b.get().getViewTreeObserver().addOnScrollChangedListener(this.f59013h);
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: e */
    private void m47663e() {
        if (!C24677a.m47209a(this)) {
            try {
                if (this.f59007b.get() != null) {
                    this.f59007b.get().getViewTreeObserver().removeOnScrollChangedListener(this.f59013h);
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: b */
    public final void mo40757b() {
        if (!C24677a.m47209a(this)) {
            try {
                m47663e();
                PopupWindow popupWindow = this.f59010e;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: a */
    public final void mo40754a() {
        if (!C24677a.m47209a(this)) {
            try {
                if (this.f59007b.get() != null) {
                    C24860a aVar = new C24860a(this.f59008c);
                    this.f59009d = aVar;
                    ((TextView) aVar.findViewById(R.id.a8b)).setText(this.f59006a);
                    if (this.f59011f == EnumC24861b.BLUE) {
                        this.f59009d.f59019c.setBackgroundResource(2131231604);
                        this.f59009d.f59018b.setImageResource(2131231605);
                        this.f59009d.f59017a.setImageResource(2131231606);
                        this.f59009d.f59020d.setImageResource(2131231607);
                    } else {
                        this.f59009d.f59019c.setBackgroundResource(2131231600);
                        this.f59009d.f59018b.setImageResource(2131231601);
                        this.f59009d.f59017a.setImageResource(2131231602);
                        this.f59009d.f59020d.setImageResource(2131231603);
                    }
                    View decorView = ((Activity) this.f59008c).getWindow().getDecorView();
                    int width = decorView.getWidth();
                    int height = decorView.getHeight();
                    m47662d();
                    this.f59009d.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                    C24860a aVar2 = this.f59009d;
                    PopupWindow popupWindow = new PopupWindow(aVar2, aVar2.getMeasuredWidth(), this.f59009d.getMeasuredHeight());
                    this.f59010e = popupWindow;
                    popupWindow.showAsDropDown(this.f59007b.get());
                    m47661c();
                    if (this.f59012g > 0) {
                        this.f59009d.postDelayed(new Runnable() {
                            /* class com.facebook.login.p1906a.C24856b.RunnableC248582 */

                            static {
                                Covode.recordClassIndex(29047);
                            }

                            public final void run() {
                                if (!C24677a.m47209a(this)) {
                                    try {
                                        C24856b.this.mo40757b();
                                    } catch (Throwable th) {
                                        C24677a.m47208a(th, this);
                                    }
                                }
                            }
                        }, this.f59012g);
                    }
                    this.f59010e.setTouchable(true);
                    this.f59009d.setOnClickListener(new View.OnClickListener() {
                        /* class com.facebook.login.p1906a.C24856b.View$OnClickListenerC248593 */

                        static {
                            Covode.recordClassIndex(29048);
                        }

                        public final void onClick(View view) {
                            if (!C24677a.m47209a(this)) {
                                try {
                                    C24856b.this.mo40757b();
                                } catch (Throwable th) {
                                    C24677a.m47208a(th, this);
                                }
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: a */
    public final void mo40755a(long j) {
        if (!C24677a.m47209a(this)) {
            try {
                this.f59012g = j;
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ WeakReference m47658a(C24856b bVar) {
        if (C24677a.m47209a(C24856b.class)) {
            return null;
        }
        try {
            return bVar.f59007b;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24856b.class);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ PopupWindow m47659b(C24856b bVar) {
        if (C24677a.m47209a(C24856b.class)) {
            return null;
        }
        try {
            return bVar.f59010e;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24856b.class);
            return null;
        }
    }

    /* renamed from: c */
    static /* synthetic */ C24860a m47660c(C24856b bVar) {
        if (C24677a.m47209a(C24856b.class)) {
            return null;
        }
        try {
            return bVar.f59009d;
        } catch (Throwable th) {
            C24677a.m47208a(th, C24856b.class);
            return null;
        }
    }

    /* renamed from: a */
    public final void mo40756a(EnumC24861b bVar) {
        if (!C24677a.m47209a(this)) {
            try {
                this.f59011f = bVar;
            } catch (Throwable th) {
                C24677a.m47208a(th, this);
            }
        }
    }

    public C24856b(String str, View view) {
        this.f59006a = str;
        this.f59007b = new WeakReference<>(view);
        this.f59008c = view.getContext();
    }
}
