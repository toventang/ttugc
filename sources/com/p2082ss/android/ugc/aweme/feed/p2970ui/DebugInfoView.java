package com.p2082ss.android.ugc.aweme.feed.p2970ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Switch;
import androidx.core.content.C0643b;
import com.C1764a;
import com.bytedance.common.utility.C13627m;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.IAccountUserService;
import com.p2082ss.android.ugc.aweme.account.C31575b;
import com.p2082ss.android.ugc.aweme.app.C33594aj;
import com.p2082ss.android.ugc.aweme.app.C33842s;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.DebugInfoView */
public final class DebugInfoView extends LinearLayout {

    /* renamed from: c */
    public static boolean f115329c = true;

    /* renamed from: d */
    public static final C49996a f115330d = new C49996a((byte) 0);

    /* renamed from: a */
    public ScrollView f115331a;

    /* renamed from: b */
    public Switch f115332b;

    /* renamed from: e */
    private RelativeLayout f115333e;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.DebugInfoView$a */
    public static final class C49996a {
        static {
            Covode.recordClassIndex(59110);
        }

        private C49996a() {
        }

        public /* synthetic */ C49996a(byte b) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(59109);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DebugInfoView(Context context) {
        this(context, null);
        C89219l.m154721d(context, "");
    }

    /* renamed from: a */
    public static final /* synthetic */ ScrollView m93866a(DebugInfoView debugInfoView) {
        ScrollView scrollView = debugInfoView.f115331a;
        if (scrollView == null) {
            C89219l.m154710a("mDebugInfoContainer");
        }
        return scrollView;
    }

    /* renamed from: b */
    public static final /* synthetic */ Switch m93867b(DebugInfoView debugInfoView) {
        Switch r1 = debugInfoView.f115332b;
        if (r1 == null) {
            C89219l.m154710a("mDebugSwitch");
        }
        return r1;
    }

    public final void setContent(String str) {
        MethodCollector.m26663i(4553);
        IAccountUserService g = C31575b.m65865g();
        C89219l.m154716b(g, "");
        if (!g.isLogin() || !C13627m.m24499a(C17867d.f42595s, "lark_inhouse")) {
            MethodCollector.m26664o(4553);
            return;
        }
        C33842s sVar = C33842s.C33843a.f80132a;
        C89219l.m154716b(sVar, "");
        if (sVar.f80111f == null) {
            sVar.f80111f = new C33594aj<>("debug_text", (Boolean) true);
        }
        C33594aj<Boolean> ajVar = sVar.f80111f;
        C89219l.m154716b(ajVar, "");
        Boolean c = ajVar.mo59941c();
        C89219l.m154716b(c, "");
        if (c.booleanValue()) {
            C1764a.m5927a(LayoutInflater.from(getContext()), R.layout.tl, this, true);
            View findViewById = findViewById(R.id.ed3);
            C89219l.m154716b(findViewById, "");
            this.f115331a = (ScrollView) findViewById;
            View findViewById2 = findViewById(R.id.edj);
            C89219l.m154716b(findViewById2, "");
            this.f115332b = (Switch) findViewById2;
            View findViewById3 = findViewById(R.id.dlb);
            C89219l.m154716b(findViewById3, "");
            this.f115333e = (RelativeLayout) findViewById3;
            Switch r1 = this.f115332b;
            if (r1 == null) {
                C89219l.m154710a("mDebugSwitch");
            }
            r1.setOnCheckedChangeListener(new C49997b(this));
            RelativeLayout relativeLayout = this.f115333e;
            if (relativeLayout == null) {
                C89219l.m154710a("mDebugInfoAll");
            }
            relativeLayout.setVisibility(0);
            Switch r12 = this.f115332b;
            if (r12 == null) {
                C89219l.m154710a("mDebugSwitch");
            }
            r12.setChecked(f115329c);
            if (f115329c) {
                ScrollView scrollView = this.f115331a;
                if (scrollView == null) {
                    C89219l.m154710a("mDebugInfoContainer");
                }
                scrollView.setVisibility(0);
            } else {
                ScrollView scrollView2 = this.f115331a;
                if (scrollView2 == null) {
                    C89219l.m154710a("mDebugInfoContainer");
                }
                scrollView2.setVisibility(8);
            }
            Context context = getContext();
            C89219l.m154716b(context, "");
            TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
            tuxTextView.setText(str);
            tuxTextView.setTextColor(C0643b.m2378c(getContext(), R.color.a_));
            tuxTextView.setGravity(getLeft());
            tuxTextView.setTextAlignment(5);
            tuxTextView.setLineSpacing(0.0f, 1.5f);
            tuxTextView.setTextDirection(5);
            ScrollView scrollView3 = this.f115331a;
            if (scrollView3 == null) {
                C89219l.m154710a("mDebugInfoContainer");
            }
            scrollView3.removeAllViews();
            ScrollView scrollView4 = this.f115331a;
            if (scrollView4 == null) {
                C89219l.m154710a("mDebugInfoContainer");
            }
            scrollView4.addView(tuxTextView);
            MethodCollector.m26664o(4553);
            return;
        }
        MethodCollector.m26664o(4553);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DebugInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(4559);
        MethodCollector.m26664o(4559);
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.DebugInfoView$b */
    static final class C49997b implements CompoundButton.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ DebugInfoView f115334a;

        static {
            Covode.recordClassIndex(59111);
        }

        C49997b(DebugInfoView debugInfoView) {
            this.f115334a = debugInfoView;
        }

        public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            if (z) {
                DebugInfoView.m93866a(this.f115334a).setVisibility(0);
                DebugInfoView.f115329c = true;
                DebugInfoView.m93867b(this.f115334a).setChecked(DebugInfoView.f115329c);
                return;
            }
            DebugInfoView.m93866a(this.f115334a).setVisibility(8);
            DebugInfoView.f115329c = false;
            DebugInfoView.m93867b(this.f115334a).setChecked(DebugInfoView.f115329c);
        }
    }
}
