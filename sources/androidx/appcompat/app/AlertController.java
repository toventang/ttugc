package androidx.appcompat.app;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

final class AlertController {

    /* renamed from: A */
    NestedScrollView f519A;

    /* renamed from: B */
    int f520B;

    /* renamed from: C */
    Drawable f521C;

    /* renamed from: D */
    ImageView f522D;

    /* renamed from: E */
    TextView f523E;

    /* renamed from: F */
    TextView f524F;

    /* renamed from: G */
    public View f525G;

    /* renamed from: H */
    ListAdapter f526H;

    /* renamed from: I */
    int f527I = -1;

    /* renamed from: J */
    int f528J;

    /* renamed from: K */
    int f529K;

    /* renamed from: L */
    int f530L;

    /* renamed from: M */
    int f531M;

    /* renamed from: N */
    int f532N;

    /* renamed from: O */
    int f533O;

    /* renamed from: P */
    boolean f534P;

    /* renamed from: Q */
    public int f535Q;

    /* renamed from: R */
    Handler f536R;

    /* renamed from: S */
    final View.OnClickListener f537S = new View.OnClickListener() {
        /* class androidx.appcompat.app.AlertController.View$OnClickListenerC01981 */

        static {
            Covode.recordClassIndex(229);
        }

        public final void onClick(View view) {
            Message obtain;
            if (view == AlertController.this.f552o && AlertController.this.f554q != null) {
                obtain = Message.obtain(AlertController.this.f554q);
            } else if (view != AlertController.this.f556s || AlertController.this.f558u == null) {
                if (view == AlertController.this.f560w && AlertController.this.f562y != null) {
                    obtain = Message.obtain(AlertController.this.f562y);
                }
                AlertController.this.f536R.obtainMessage(1, AlertController.this.f539b).sendToTarget();
            } else {
                obtain = Message.obtain(AlertController.this.f558u);
            }
            if (obtain != null) {
                obtain.sendToTarget();
            }
            AlertController.this.f536R.obtainMessage(1, AlertController.this.f539b).sendToTarget();
        }
    };

    /* renamed from: a */
    final Context f538a;

    /* renamed from: b */
    final DialogC0240h f539b;

    /* renamed from: c */
    final Window f540c;

    /* renamed from: d */
    final int f541d;

    /* renamed from: e */
    CharSequence f542e;

    /* renamed from: f */
    CharSequence f543f;

    /* renamed from: g */
    public ListView f544g;

    /* renamed from: h */
    View f545h;

    /* renamed from: i */
    int f546i;

    /* renamed from: j */
    int f547j;

    /* renamed from: k */
    int f548k;

    /* renamed from: l */
    int f549l;

    /* renamed from: m */
    int f550m;

    /* renamed from: n */
    boolean f551n;

    /* renamed from: o */
    Button f552o;

    /* renamed from: p */
    CharSequence f553p;

    /* renamed from: q */
    Message f554q;

    /* renamed from: r */
    Drawable f555r;

    /* renamed from: s */
    Button f556s;

    /* renamed from: t */
    CharSequence f557t;

    /* renamed from: u */
    Message f558u;

    /* renamed from: v */
    Drawable f559v;

    /* renamed from: w */
    Button f560w;

    /* renamed from: x */
    CharSequence f561x;

    /* renamed from: y */
    Message f562y;

    /* renamed from: z */
    Drawable f563z;

    static {
        Covode.recordClassIndex(228);
    }

    /* renamed from: androidx.appcompat.app.AlertController$b */
    static final class HandlerC0208b extends Handler {

        /* renamed from: a */
        private WeakReference<DialogInterface> f632a;

        static {
            Covode.recordClassIndex(240);
        }

        public HandlerC0208b(DialogInterface dialogInterface) {
            this.f632a = new WeakReference<>(dialogInterface);
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f632a.get(), message.what);
            } else if (i == 1) {
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    /* renamed from: a */
    public final void mo379a(CharSequence charSequence) {
        this.f542e = charSequence;
        TextView textView = this.f523E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    public static class C0203a {

        /* renamed from: A */
        public int f579A;

        /* renamed from: B */
        public int f580B;

        /* renamed from: C */
        public int f581C;

        /* renamed from: D */
        public int f582D;

        /* renamed from: E */
        public boolean f583E;

        /* renamed from: F */
        public boolean[] f584F;

        /* renamed from: G */
        public boolean f585G;

        /* renamed from: H */
        public boolean f586H;

        /* renamed from: I */
        public int f587I = -1;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f588J;

        /* renamed from: K */
        public Cursor f589K;

        /* renamed from: L */
        public String f590L;

        /* renamed from: M */
        public String f591M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f592N;

        /* renamed from: O */
        public boolean f593O = true;

        /* renamed from: a */
        public final Context f594a;

        /* renamed from: b */
        public final LayoutInflater f595b;

        /* renamed from: c */
        public int f596c;

        /* renamed from: d */
        public Drawable f597d;

        /* renamed from: e */
        public int f598e;

        /* renamed from: f */
        public CharSequence f599f;

        /* renamed from: g */
        public View f600g;

        /* renamed from: h */
        public CharSequence f601h;

        /* renamed from: i */
        public CharSequence f602i;

        /* renamed from: j */
        public Drawable f603j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f604k;

        /* renamed from: l */
        public CharSequence f605l;

        /* renamed from: m */
        public Drawable f606m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f607n;

        /* renamed from: o */
        public CharSequence f608o;

        /* renamed from: p */
        public Drawable f609p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f610q;

        /* renamed from: r */
        public boolean f611r;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f612s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f613t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f614u;

        /* renamed from: v */
        public CharSequence[] f615v;

        /* renamed from: w */
        public ListAdapter f616w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f617x;

        /* renamed from: y */
        public int f618y;

        /* renamed from: z */
        public View f619z;

        static {
            Covode.recordClassIndex(235);
        }

        public C0203a(Context context) {
            this.f594a = context;
            this.f611r = true;
            this.f595b = (LayoutInflater) m630a(context, "layout_inflater");
        }

        /* renamed from: a */
        private static Object m630a(Context context, String str) {
            Object systemService;
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        return context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                return context.getSystemService(str);
            } else if (!C58027i.f132246a) {
                return context.getSystemService(str);
            } else {
                synchronized (ClipboardManager.class) {
                    systemService = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                        } catch (Exception e) {
                            C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                }
                return systemService;
            }
        }
    }

    /* renamed from: a */
    static void m624a(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    static boolean m625a(View view) {
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
            if (m625a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo377a(int i) {
        this.f521C = null;
        this.f520B = i;
        ImageView imageView = this.f522D;
        if (imageView == null) {
            return;
        }
        if (i != 0) {
            imageView.setVisibility(0);
            this.f522D.setImageResource(this.f520B);
            return;
        }
        imageView.setVisibility(8);
    }

    public static class RecycleListView extends ListView {

        /* renamed from: a */
        final int f577a;

        /* renamed from: b */
        final int f578b;

        static {
            Covode.recordClassIndex(234);
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a6o, R.attr.a6r});
            this.f578b = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
            this.f577a = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
        }
    }

    /* renamed from: a */
    static ViewGroup m622a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: androidx.appcompat.app.AlertController$c */
    static class C0209c extends ArrayAdapter<CharSequence> {
        static {
            Covode.recordClassIndex(241);
        }

        public final long getItemId(int i) {
            return (long) i;
        }

        public final boolean hasStableIds() {
            return true;
        }

        public C0209c(Context context, int i, CharSequence[] charSequenceArr) {
            super(context, i, 16908308, charSequenceArr);
        }
    }

    /* renamed from: a */
    static void m623a(View view, View view2, View view3) {
        int i;
        int i2 = 0;
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
                i2 = 4;
            }
            view3.setVisibility(i2);
        }
    }

    public AlertController(Context context, DialogC0240h hVar, Window window) {
        this.f538a = context;
        this.f539b = hVar;
        this.f540c = window;
        this.f536R = new HandlerC0208b(hVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16842994, R.attr.lu, R.attr.lv, R.attr.a2o, R.attr.a2p, R.attr.a5y, R.attr.ac6, R.attr.aco}, R.attr.i5, 0);
        this.f528J = obtainStyledAttributes.getResourceId(0, 0);
        this.f529K = obtainStyledAttributes.getResourceId(2, 0);
        this.f530L = obtainStyledAttributes.getResourceId(4, 0);
        this.f531M = obtainStyledAttributes.getResourceId(5, 0);
        this.f532N = obtainStyledAttributes.getResourceId(7, 0);
        this.f533O = obtainStyledAttributes.getResourceId(3, 0);
        this.f534P = obtainStyledAttributes.getBoolean(6, true);
        this.f541d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        hVar.cn_();
    }

    /* renamed from: a */
    public final void mo378a(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (onClickListener != null) {
            message = this.f536R.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.f561x = charSequence;
            this.f562y = message;
            this.f563z = drawable;
        } else if (i == -2) {
            this.f557t = charSequence;
            this.f558u = message;
            this.f559v = drawable;
        } else if (i == -1) {
            this.f553p = charSequence;
            this.f554q = message;
            this.f555r = drawable;
        } else {
            throw new IllegalArgumentException("Button does not exist");
        }
    }
}
