package com.facebook.p1814a.p1816b;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import com.bytedance.covode.number.Covode;
import com.facebook.C24872m;
import com.facebook.internal.C24699ae;
import com.facebook.internal.p1894a.p1896b.C24677a;
import com.facebook.p1814a.C23964g;
import com.facebook.p1814a.p1816b.p1817a.C23880a;
import com.facebook.p1814a.p1816b.p1817a.C23888f;
import com.facebook.p1814a.p1820e.C23929b;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.a.b.a */
public class C23876a {

    /* renamed from: a */
    private static final String f56513a = C23876a.class.getCanonicalName();

    static {
        Covode.recordClassIndex(27997);
    }

    /* renamed from: com.facebook.a.b.a$a */
    public static class View$OnClickListenerC23878a implements View.OnClickListener {

        /* renamed from: a */
        public boolean f56516a;

        /* renamed from: b */
        private C23880a f56517b;

        /* renamed from: c */
        private WeakReference<View> f56518c;

        /* renamed from: d */
        private WeakReference<View> f56519d;

        /* renamed from: e */
        private View.OnClickListener f56520e;

        static {
            Covode.recordClassIndex(27999);
        }

        public final void onClick(View view) {
            if (!C24677a.m47209a(this)) {
                try {
                    View.OnClickListener onClickListener = this.f56520e;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                    }
                    if (this.f56519d.get() != null && this.f56518c.get() != null) {
                        C23876a.m45144b(this.f56517b, this.f56519d.get(), this.f56518c.get());
                    }
                } catch (Throwable th) {
                    C24677a.m47208a(th, this);
                }
            }
        }

        private View$OnClickListenerC23878a(C23880a aVar, View view, View view2) {
            if (aVar != null && view != null && view2 != null) {
                this.f56520e = C23888f.m45165g(view2);
                this.f56517b = aVar;
                this.f56518c = new WeakReference<>(view2);
                this.f56519d = new WeakReference<>(view);
                this.f56516a = true;
            }
        }

        /* synthetic */ View$OnClickListenerC23878a(C23880a aVar, View view, View view2, byte b) {
            this(aVar, view, view2);
        }
    }

    /* renamed from: a */
    public static View$OnClickListenerC23878a m45142a(C23880a aVar, View view, View view2) {
        if (C24677a.m47209a(C23876a.class)) {
            return null;
        }
        try {
            return new View$OnClickListenerC23878a(aVar, view, view2, (byte) 0);
        } catch (Throwable th) {
            C24677a.m47208a(th, C23876a.class);
            return null;
        }
    }

    /* renamed from: com.facebook.a.b.a$b */
    public static class C23879b implements AdapterView.OnItemClickListener {

        /* renamed from: a */
        public boolean f56521a;

        /* renamed from: b */
        private C23880a f56522b;

        /* renamed from: c */
        private WeakReference<AdapterView> f56523c;

        /* renamed from: d */
        private WeakReference<View> f56524d;

        /* renamed from: e */
        private AdapterView.OnItemClickListener f56525e;

        static {
            Covode.recordClassIndex(28000);
        }

        private C23879b(C23880a aVar, View view, AdapterView adapterView) {
            if (aVar != null && view != null && adapterView != null) {
                this.f56525e = adapterView.getOnItemClickListener();
                this.f56522b = aVar;
                this.f56523c = new WeakReference<>(adapterView);
                this.f56524d = new WeakReference<>(view);
                this.f56521a = true;
            }
        }

        /* synthetic */ C23879b(C23880a aVar, View view, AdapterView adapterView, byte b) {
            this(aVar, view, adapterView);
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            AdapterView.OnItemClickListener onItemClickListener = this.f56525e;
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(adapterView, view, i, j);
            }
            if (this.f56524d.get() != null && this.f56523c.get() != null) {
                C23876a.m45144b(this.f56522b, this.f56524d.get(), this.f56523c.get());
            }
        }
    }

    /* renamed from: a */
    public static C23879b m45143a(C23880a aVar, View view, AdapterView adapterView) {
        if (C24677a.m47209a(C23876a.class)) {
            return null;
        }
        try {
            return new C23879b(aVar, view, adapterView, (byte) 0);
        } catch (Throwable th) {
            C24677a.m47208a(th, C23876a.class);
            return null;
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m45144b(C23880a aVar, View view, View view2) {
        if (!C24677a.m47209a(C23876a.class)) {
            try {
                if (!C24677a.m47209a(C23876a.class)) {
                    try {
                        final String str = aVar.f56526a;
                        final Bundle a = C23894c.m45184a(aVar, view, view2);
                        if (!C24677a.m47209a(C23876a.class)) {
                            try {
                                String string = a.getString("_valueToSum");
                                if (string != null) {
                                    a.putDouble("_valueToSum", C23929b.m45240a(string));
                                }
                                a.putString("_is_fb_codeless", "1");
                            } catch (Throwable th) {
                                C24677a.m47208a(th, C23876a.class);
                            }
                        }
                        C24872m.m47689c().execute(new Runnable() {
                            /* class com.facebook.p1814a.p1816b.C23876a.RunnableC238771 */

                            static {
                                Covode.recordClassIndex(27998);
                            }

                            public final void run() {
                                if (!C24677a.m47209a(this)) {
                                    try {
                                        C24699ae.m47299a();
                                        C23964g.m45317a(C24872m.f59047g).f56728a.mo39460b();
                                    } catch (Throwable th) {
                                        C24677a.m47208a(th, this);
                                    }
                                }
                            }
                        });
                    } catch (Throwable th2) {
                        C24677a.m47208a(th2, C23876a.class);
                    }
                }
            } catch (Throwable th3) {
                C24677a.m47208a(th3, C23876a.class);
            }
        }
    }
}
