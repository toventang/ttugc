package com.bytedance.android.livesdk.chatroom.p499ui;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.do */
public final class DialogC7913do extends Dialog {

    /* renamed from: a */
    public AbstractC7914a f19680a;

    /* renamed from: b */
    public AbstractC7915b f19681b;

    /* renamed from: c */
    private Context f19682c;

    /* renamed from: d */
    private RelativeLayout f19683d = ((RelativeLayout) this.f19686g.findViewById(R.id.eld));

    /* renamed from: e */
    private LiveRoundImageView f19684e = ((LiveRoundImageView) this.f19686g.findViewById(R.id.elb));

    /* renamed from: f */
    private HSImageView f19685f = ((HSImageView) this.f19686g.findViewById(R.id.el1));

    /* renamed from: g */
    private View f19686g;

    /* renamed from: h */
    private TextView f19687h = ((TextView) this.f19686g.findViewById(R.id.dms));

    /* renamed from: i */
    private TextView f19688i = ((TextView) this.f19686g.findViewById(R.id.dmr));

    /* renamed from: j */
    private TextView f19689j = ((TextView) this.f19686g.findViewById(R.id.dmn));

    /* renamed from: k */
    private TextView f19690k = ((TextView) this.f19686g.findViewById(R.id.dmm));

    /* renamed from: l */
    private LinearLayout f19691l = ((LinearLayout) this.f19686g.findViewById(R.id.dmo));

    /* renamed from: m */
    private TextView f19692m = ((TextView) this.f19686g.findViewById(R.id.dmp));

    /* renamed from: n */
    private TextView f19693n = ((TextView) this.f19686g.findViewById(R.id.dmq));

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.do$a */
    public interface AbstractC7914a {
        static {
            Covode.recordClassIndex(8709);
        }

        /* renamed from: a */
        void mo8527a();
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.do$b */
    public interface AbstractC7915b {
        static {
            Covode.recordClassIndex(8710);
        }

        /* renamed from: a */
        void mo8528a();
    }

    static {
        Covode.recordClassIndex(8708);
    }

    public final void dismiss() {
        super.dismiss();
    }

    /* renamed from: a */
    public final void mo14210a() {
        this.f19690k.setVisibility(8);
    }

    public final void onBackPressed() {
        AbstractC7914a aVar = this.f19680a;
        if (aVar != null) {
            aVar.mo8527a();
        }
        super.onBackPressed();
    }

    public final void show() {
        super.show();
        Window window = getWindow();
        if (window != null) {
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            layoutParams.copyFrom(window.getAttributes());
            layoutParams.width = (int) this.f19682c.getResources().getDimension(R.dimen.y8);
            layoutParams.height = -2;
            window.setAttributes(layoutParams);
        }
    }

    /* renamed from: a */
    public static DialogC7913do m16042a(Context context) {
        return new DialogC7913do(context);
    }

    /* renamed from: b */
    public final void mo14214b(CharSequence charSequence) {
        this.f19688i.setText(charSequence);
    }

    /* renamed from: a */
    public final void mo14211a(View.OnClickListener onClickListener) {
        this.f19689j.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public final void mo14212a(CharSequence charSequence) {
        this.f19687h.setText(charSequence);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r3 <= (r1.getHeight() + r2)) goto L_0x0034;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r1 = r6.getAction()
            r0 = 1
            if (r0 != r1) goto L_0x0034
            android.content.Context r1 = r5.getContext()
            float r0 = r6.getX()
            int r4 = (int) r0
            float r0 = r6.getY()
            int r3 = (int) r0
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r1)
            int r2 = r0.getScaledWindowTouchSlop()
            android.view.Window r0 = r5.getWindow()
            if (r0 == 0) goto L_0x002d
            android.view.Window r0 = r5.getWindow()
            android.view.View r0 = r0.getDecorView()
            if (r0 != 0) goto L_0x0039
        L_0x002d:
            com.bytedance.android.livesdk.chatroom.ui.do$b r0 = r5.f19681b
            if (r0 == 0) goto L_0x0034
            r0.mo8528a()
        L_0x0034:
            boolean r0 = super.onTouchEvent(r6)
            return r0
        L_0x0039:
            android.view.Window r0 = r5.getWindow()
            android.view.View r1 = r0.getDecorView()
            int r0 = -r2
            if (r4 < r0) goto L_0x002d
            if (r3 < r0) goto L_0x002d
            int r0 = r1.getWidth()
            int r0 = r0 + r2
            if (r4 > r0) goto L_0x002d
            int r0 = r1.getHeight()
            int r0 = r0 + r2
            if (r3 <= r0) goto L_0x0034
            goto L_0x002d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p499ui.DialogC7913do.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private DialogC7913do(Context context) {
        super(context, R.style.a32);
        MethodCollector.m26663i(9692);
        this.f19682c = context;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.b79, (ViewGroup) null);
        this.f19686g = inflate;
        setContentView(inflate);
        this.f19689j.setVisibility(0);
        this.f19691l.setVisibility(8);
        MethodCollector.m26664o(9692);
    }

    /* renamed from: a */
    public final void mo14213a(boolean z, String str) {
        this.f19689j.setEnabled(z);
        this.f19689j.setText(str);
    }
}
