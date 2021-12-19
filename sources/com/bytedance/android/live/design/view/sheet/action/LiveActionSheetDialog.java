package com.bytedance.android.live.design.view.sheet.action;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.android.live.design.view.action.LiveActionButton;
import com.bytedance.android.live.design.view.sheet.LiveFixedHeightSheetDialog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;

public class LiveActionSheetDialog extends LiveFixedHeightSheetDialog implements AbstractC33974au {

    /* renamed from: i */
    private LinearLayout f11461i;

    /* renamed from: j */
    private View f11462j;

    /* renamed from: k */
    private TextView f11463k;

    /* renamed from: l */
    private final List<C4114a> f11464l;

    /* renamed from: m */
    private CharSequence f11465m;

    /* renamed from: n */
    private C4115b f11466n;

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog$b */
    public static class C4115b extends C4116c {

        /* renamed from: a */
        public C4117a f11468a;

        /* renamed from: b */
        public LiveActionButton f11469b;

        static {
            Covode.recordClassIndex(4668);
        }
    }

    static {
        Covode.recordClassIndex(4666);
    }

    @Override // com.bytedance.android.live.design.app.LifecycleAwareDialog, com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, com.bytedance.android.live.design.view.sheet.LiveFixedHeightSheetDialog, androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog$c */
    public static class C4116c {

        /* renamed from: c */
        View f11470c;

        static {
            Covode.recordClassIndex(4669);
        }

        private C4116c() {
        }

        /* synthetic */ C4116c(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog$a */
    public static class C4114a extends C4116c {

        /* renamed from: a */
        public final List<C4115b> f11467a = new ArrayList();

        static {
            Covode.recordClassIndex(4667);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo9601a() {
            return this.f11467a.size();
        }

        private C4114a() {
            super((byte) 0);
        }
    }

    /* renamed from: d */
    private void m9997d() {
        if (this.f11463k != null) {
            if (!TextUtils.isEmpty(this.f11465m)) {
                this.f11463k.setText(this.f11465m);
                this.f11463k.setVisibility(0);
            } else {
                this.f11463k.setVisibility(8);
            }
        }
        m9996c();
    }

    /* renamed from: c */
    private void m9996c() {
        View view = this.f11462j;
        if (view != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            if (this.f11464l.size() > 0 && this.f11464l.get(0).mo9601a() > 0) {
                C4117a aVar = this.f11464l.get(0).f11467a.get(0).f11468a;
                if (TextUtils.isEmpty(this.f11465m) && (aVar instanceof C4119c) && ((C4119c) aVar).f11476d != null) {
                    marginLayoutParams.topMargin = this.f11462j.getContext().getResources().getDimensionPixelSize(R.dimen.o3);
                    this.f11462j.setLayoutParams(marginLayoutParams);
                }
            }
            marginLayoutParams.topMargin = 0;
            this.f11462j.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        this.f11465m = charSequence;
        m9997d();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, androidx.appcompat.app.DialogC0240h, android.app.Dialog
    public void setTitle(int i) {
        setTitle(getContext().getResources().getString(i));
    }

    /* renamed from: a */
    private int m9990a(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.f11464l.get(i3).mo9601a() * 2;
        }
        return i2 + 0;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveBottomSheetDialog, com.bytedance.android.live.design.view.sheet.LiveBaseSheetDialog, androidx.appcompat.app.DialogC0240h, com.bytedance.android.live.design.view.sheet.LiveFixedHeightSheetDialog
    public void onCreate(Bundle bundle) {
        MethodCollector.m26663i(8441);
        super.onCreate(bundle);
        setContentView(getLayoutInflater().inflate(R.layout.ajh, (ViewGroup) null), new ViewGroup.LayoutParams(-1, -2));
        this.f11463k = (TextView) findViewById(R.id.cl);
        this.f11461i = (LinearLayout) findViewById(R.id.cj);
        View findViewById = findViewById(R.id.ck);
        this.f11462j = findViewById;
        if (this.f11463k == null || this.f11461i == null || findViewById == null) {
            MethodCollector.m26664o(8441);
            return;
        }
        m9997d();
        for (int i = 0; i < this.f11464l.size(); i++) {
            m9991a(i, m9990a(i), this.f11464l.get(i));
        }
        LinearLayout linearLayout = this.f11461i;
        if (!(linearLayout == null || this.f11466n == null)) {
            m9993a(linearLayout.getChildCount(), (C4116c) this.f11466n);
            m9995a(false, this.f11461i.getChildCount(), this.f11466n);
        }
        MethodCollector.m26664o(8441);
    }

    /* renamed from: a */
    private void m9992a(int i, C4115b bVar) {
        MethodCollector.m26663i(8602);
        if (bVar.f11470c == null) {
            View view = new View(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, view.getContext().getResources().getDimensionPixelSize(R.dimen.np));
            if ((bVar.f11468a instanceof C4119c) && ((C4119c) bVar.f11468a).f11476d != null) {
                int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.o1);
                layoutParams.rightMargin = dimensionPixelSize;
                layoutParams.leftMargin = dimensionPixelSize;
            }
            view.setLayoutParams(layoutParams);
            view.setBackgroundColor(C4079b.m9889a(view, (int) R.attr.am1));
            this.f11461i.addView(view, i);
            bVar.f11470c = view;
        }
        MethodCollector.m26664o(8602);
    }

    /* renamed from: a */
    private void m9993a(int i, C4116c cVar) {
        MethodCollector.m26663i(8446);
        if (cVar.f11470c == null) {
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, view.getContext().getResources().getDimensionPixelSize(R.dimen.o6)));
            view.setBackgroundColor(C4079b.m9889a(view, (int) R.attr.ale));
            this.f11461i.addView(view, i);
            cVar.f11470c = view;
        }
        MethodCollector.m26664o(8446);
    }

    /* renamed from: a */
    private void m9994a(C4117a aVar, LiveActionButton liveActionButton) {
        if (aVar instanceof C4119c) {
            liveActionButton.setIcon(((C4119c) aVar).f11476d);
        }
        liveActionButton.setText(aVar.f11471a);
        liveActionButton.setOnClickListener(new View$OnClickListenerC4118b(this, aVar));
        liveActionButton.setEnabled(aVar.f11473c);
        liveActionButton.mo9531a(aVar.f11472b);
    }

    /* renamed from: a */
    private void m9991a(int i, int i2, C4114a aVar) {
        List<C4115b> list = aVar.f11467a;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= list.size()) {
                break;
            }
            if (i3 >= aVar.mo9601a() - 1) {
                z = false;
            }
            m9995a(z, i2, list.get(i3));
            i2 += 2;
            i3++;
        }
        if (i < this.f11464l.size() - 1) {
            m9993a(m9990a(i + 1) - 1, aVar);
        }
    }

    /* renamed from: a */
    private void m9995a(boolean z, int i, C4115b bVar) {
        MethodCollector.m26663i(8444);
        C4117a aVar = bVar.f11468a;
        LiveActionButton liveActionButton = new LiveActionButton(getContext());
        liveActionButton.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        m9994a(aVar, liveActionButton);
        this.f11461i.addView(liveActionButton, i);
        bVar.f11469b = liveActionButton;
        if (z) {
            m9992a(i + 1, bVar);
        }
        MethodCollector.m26664o(8444);
    }
}
