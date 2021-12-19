package com.p2082ss.android.ugc.aweme.duet.p2816ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.DialogC26609a;
import com.p2082ss.android.ugc.trill.R;
import org.xml.sax.XMLReader;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.duet.ui.g */
public final class DialogC43291g extends DialogC26609a {

    /* renamed from: a */
    public static final C43292a f101059a = new C43292a((byte) 0);

    /* renamed from: b */
    private final Context f101060b;

    static {
        Covode.recordClassIndex(51496);
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.g$a */
    public static final class C43292a {
        static {
            Covode.recordClassIndex(51497);
        }

        private C43292a() {
        }

        public /* synthetic */ C43292a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.g$d */
    public static final class C43295d implements Html.TagHandler {
        static {
            Covode.recordClassIndex(51500);
        }

        C43295d() {
        }

        public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
            if (z && str != null && str.equals("paragraph") && editable != null) {
                editable.append("\n\n");
                editable.setSpan(new AbsoluteSizeSpan(7, true), editable.length() - 1, editable.length(), 33);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final BottomSheetBehavior<View> mo9590b() {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.d0t);
            C89219l.m154716b(relativeLayout, "");
            ViewParent parent = relativeLayout.getParent();
            if (parent != null) {
                return BottomSheetBehavior.m52754a((View) parent);
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.g$b */
    public static final class View$OnLayoutChangeListenerC43293b implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ DialogC43291g f101061a;

        static {
            Covode.recordClassIndex(51498);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        View$OnLayoutChangeListenerC43293b(DialogC43291g gVar) {
            this.f101061a = gVar;
        }

        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C89219l.m154721d(view, "");
            DialogC43291g gVar = this.f101061a;
            int measuredHeight = view.getMeasuredHeight();
            BottomSheetBehavior<View> b = gVar.mo9590b();
            if (b != null) {
                b.mo43976b(measuredHeight);
            }
            view.removeOnLayoutChangeListener(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.duet.ui.g$c */
    static final class View$OnClickListenerC43294c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ DialogC43291g f101062a;

        static {
            Covode.recordClassIndex(51499);
        }

        View$OnClickListenerC43294c(DialogC43291g gVar) {
            this.f101062a = gVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f101062a.dismiss();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC43291g(Context context) {
        super(context, R.style.we);
        C89219l.m154721d(context, "");
        this.f101060b = context;
    }

    @Override // com.google.android.material.bottomsheet.DialogC26609a, androidx.appcompat.app.DialogC0240h
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.b37);
        ((ImageView) findViewById(R.id.d0g)).setOnClickListener(new View$OnClickListenerC43294c(this));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.d0t);
        C89219l.m154716b(relativeLayout, "");
        relativeLayout.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC43293b(this));
        int b = C13628n.m24521b(this.f101060b) - C13628n.m24525e(getContext());
        Window window = getWindow();
        if (window != null) {
            if (b == 0) {
                b = -1;
            }
            window.setLayout(-1, b);
            window.setGravity(80);
            window.setBackgroundDrawableResource(R.color.c9);
            View findViewById = window.findViewById(R.id.ajx);
            if (findViewById != null) {
                findViewById.setBackgroundDrawable(new ColorDrawable(0));
            }
        }
        String string = this.f101060b.getString(R.string.bd7);
        C89219l.m154716b(string, "");
        Spanned fromHtml = Html.fromHtml(C89361p.m154868a(string, "\n", "<paragraph>"), null, new C43295d());
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.d0i);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(fromHtml);
    }
}
