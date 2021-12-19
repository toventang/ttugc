package com.bytedance.ies.uikit.dialog;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.ies.uikit.dialog.a */
public final class C18254a {

    /* renamed from: A */
    TextView f43504A;

    /* renamed from: B */
    TextView f43505B;

    /* renamed from: C */
    public View f43506C;

    /* renamed from: D */
    public boolean f43507D;

    /* renamed from: E */
    public ListAdapter f43508E;

    /* renamed from: F */
    public int f43509F = -1;

    /* renamed from: G */
    int f43510G;

    /* renamed from: H */
    int f43511H;

    /* renamed from: I */
    public int f43512I;

    /* renamed from: J */
    public int f43513J;

    /* renamed from: K */
    public int f43514K;

    /* renamed from: L */
    public int f43515L;

    /* renamed from: M */
    int f43516M;

    /* renamed from: N */
    public Handler f43517N;

    /* renamed from: O */
    final View.OnClickListener f43518O = new View.OnClickListener() {
        /* class com.bytedance.ies.uikit.dialog.C18254a.View$OnClickListenerC182551 */

        static {
            Covode.recordClassIndex(20915);
        }

        public final void onClick(View view) {
            Message obtain;
            if (view == C18254a.this.f43532n && C18254a.this.f43534p != null) {
                obtain = Message.obtain(C18254a.this.f43534p);
            } else if (view != C18254a.this.f43535q || C18254a.this.f43537s == null) {
                if (view == C18254a.this.f43538t && C18254a.this.f43540v != null) {
                    obtain = Message.obtain(C18254a.this.f43540v);
                }
                C18254a.this.f43517N.obtainMessage(1, C18254a.this.f43520b).sendToTarget();
            } else {
                obtain = Message.obtain(C18254a.this.f43537s);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            C18254a.this.f43517N.obtainMessage(1, C18254a.this.f43520b).sendToTarget();
        }
    };

    /* renamed from: a */
    public final Context f43519a;

    /* renamed from: b */
    public final DialogInterface f43520b;

    /* renamed from: c */
    final Window f43521c;

    /* renamed from: d */
    CharSequence f43522d;

    /* renamed from: e */
    CharSequence f43523e;

    /* renamed from: f */
    public ListView f43524f;

    /* renamed from: g */
    View f43525g;

    /* renamed from: h */
    int f43526h;

    /* renamed from: i */
    int f43527i;

    /* renamed from: j */
    int f43528j;

    /* renamed from: k */
    int f43529k;

    /* renamed from: l */
    int f43530l;

    /* renamed from: m */
    boolean f43531m;

    /* renamed from: n */
    public Button f43532n;

    /* renamed from: o */
    CharSequence f43533o;

    /* renamed from: p */
    public Message f43534p;

    /* renamed from: q */
    public Button f43535q;

    /* renamed from: r */
    CharSequence f43536r;

    /* renamed from: s */
    public Message f43537s;

    /* renamed from: t */
    public Button f43538t;

    /* renamed from: u */
    CharSequence f43539u;

    /* renamed from: v */
    public Message f43540v;

    /* renamed from: w */
    public ScrollView f43541w;

    /* renamed from: x */
    int f43542x;

    /* renamed from: y */
    Drawable f43543y;

    /* renamed from: z */
    ImageView f43544z;

    static {
        Covode.recordClassIndex(20914);
    }

    /* renamed from: com.bytedance.ies.uikit.dialog.a$b */
    static final class HandlerC18265b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f43608a;

        static {
            Covode.recordClassIndex(20925);
        }

        public HandlerC18265b(DialogInterface dialogInterface) {
            this.f43608a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f43608a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void mo29131a(CharSequence charSequence) {
        this.f43522d = charSequence;
        TextView textView = this.f43504A;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: com.bytedance.ies.uikit.dialog.a$a */
    public static class C18260a {

        /* renamed from: A */
        public int f43557A;

        /* renamed from: B */
        public boolean f43558B;

        /* renamed from: C */
        public boolean[] f43559C;

        /* renamed from: D */
        public boolean f43560D;

        /* renamed from: E */
        public boolean f43561E;

        /* renamed from: F */
        public int f43562F = -1;

        /* renamed from: G */
        public DialogInterface.OnMultiChoiceClickListener f43563G;

        /* renamed from: H */
        public Cursor f43564H;

        /* renamed from: I */
        public String f43565I;

        /* renamed from: J */
        public String f43566J;

        /* renamed from: K */
        public boolean f43567K;

        /* renamed from: L */
        public AdapterView.OnItemSelectedListener f43568L;

        /* renamed from: M */
        public boolean f43569M = true;

        /* renamed from: a */
        public final Context f43570a;

        /* renamed from: b */
        public final LayoutInflater f43571b;

        /* renamed from: c */
        public int f43572c;

        /* renamed from: d */
        public Drawable f43573d;

        /* renamed from: e */
        public int f43574e;

        /* renamed from: f */
        public CharSequence f43575f;

        /* renamed from: g */
        public View f43576g;

        /* renamed from: h */
        public CharSequence f43577h;

        /* renamed from: i */
        public CharSequence f43578i;

        /* renamed from: j */
        public DialogInterface.OnClickListener f43579j;

        /* renamed from: k */
        public CharSequence f43580k;

        /* renamed from: l */
        public DialogInterface.OnClickListener f43581l;

        /* renamed from: m */
        public CharSequence f43582m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f43583n;

        /* renamed from: o */
        public boolean f43584o;

        /* renamed from: p */
        public DialogInterface.OnCancelListener f43585p;

        /* renamed from: q */
        public DialogInterface.OnDismissListener f43586q;

        /* renamed from: r */
        public DialogInterface.OnKeyListener f43587r;

        /* renamed from: s */
        public CharSequence[] f43588s;

        /* renamed from: t */
        public ListAdapter f43589t;

        /* renamed from: u */
        public DialogInterface.OnClickListener f43590u;

        /* renamed from: v */
        public int f43591v;

        /* renamed from: w */
        public View f43592w;

        /* renamed from: x */
        public int f43593x;

        /* renamed from: y */
        public int f43594y;

        /* renamed from: z */
        public int f43595z;

        static {
            Covode.recordClassIndex(20920);
        }

        public C18260a(Context context) {
            this.f43570a = context;
            this.f43584o = true;
            this.f43571b = (LayoutInflater) m33973a(context, "layout_inflater");
        }

        /* renamed from: a */
        private static Object m33973a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(12374);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                            } catch (Exception e) {
                                C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        C58027i.f132246a = false;
                    } finally {
                        MethodCollector.m26664o(12374);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    /* renamed from: a */
    public final void mo29129a(int i) {
        this.f43543y = null;
        this.f43542x = i;
        ImageView imageView = this.f43544z;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            imageView.setVisibility(8);
        }
    }

    /* renamed from: a */
    static boolean m33969a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m33969a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: com.bytedance.ies.uikit.dialog.a$c */
    static class C18266c extends ArrayAdapter<CharSequence> {
        static {
            Covode.recordClassIndex(20926);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }

        public C18266c(Context context, int i, CharSequence[] charSequenceArr) {
            super(context, i, (int) R.id.efq, charSequenceArr);
        }
    }

    public C18254a(Context context, DialogInterface dialogInterface, Window window) {
        this.f43519a = context;
        this.f43520b = dialogInterface;
        this.f43521c = window;
        this.f43517N = new HandlerC18265b(dialogInterface);
        this.f43510G = R.layout.b0w;
        this.f43511H = 0;
        this.f43512I = R.layout.b0x;
        this.f43513J = R.layout.b0z;
        this.f43514K = R.layout.b10;
        this.f43515L = R.layout.b0y;
    }

    /* renamed from: a */
    public static void m33968a(View view, View view2, View view3) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i = 0;
            } else {
                i = 4;
            }
            view2.setVisibility(i);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i3 = 4;
            }
            view3.setVisibility(i3);
        }
    }

    /* renamed from: a */
    public final void mo29130a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message) {
        if (onClickListener != null) {
            message = this.f43517N.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f43539u = charSequence;
            this.f43540v = message;
        } else if (i == -2) {
            this.f43536r = charSequence;
            this.f43537s = message;
        } else if (i == -1) {
            this.f43533o = charSequence;
            this.f43534p = message;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
