package com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.InputResultIndicator;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem */
public class InputItem extends LinearLayout {

    /* renamed from: a */
    public static final C43597a f101638a = new C43597a((byte) 0);

    /* renamed from: b */
    private boolean f101639b;

    /* renamed from: c */
    private SparseArray f101640c;

    static {
        Covode.recordClassIndex(51840);
    }

    public InputItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public View mo74090a(int i) {
        if (this.f101640c == null) {
            this.f101640c = new SparseArray();
        }
        View view = (View) this.f101640c.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f101640c.put(i, findViewById);
        return findViewById;
    }

    public View getContentView() {
        return null;
    }

    public int getContentViewLayoutId() {
        return -1;
    }

    public View getFooterView() {
        return null;
    }

    public int getFooterViewLayoutId() {
        return -1;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem$a */
    public static final class C43597a {
        static {
            Covode.recordClassIndex(51841);
        }

        private C43597a() {
        }

        public /* synthetic */ C43597a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo74091a() {
        ((InputResultIndicator) mo74090a(R.id.boi)).mo74039a();
    }

    /* renamed from: a */
    public final void mo74092a(String str) {
        if (str != null) {
            ((InputResultIndicator) mo74090a(R.id.boi)).mo74040a(str);
        }
    }

    public final void setTitle(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) mo74090a(R.id.title);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
            View a = mo74090a(R.id.eir);
            C89219l.m154716b(a, "");
            a.setVisibility(0);
            return;
        }
        TuxTextView tuxTextView2 = (TuxTextView) mo74090a(R.id.title);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setVisibility(0);
        View a2 = mo74090a(R.id.eir);
        C89219l.m154716b(a2, "");
        a2.setVisibility(8);
        TuxTextView tuxTextView3 = (TuxTextView) mo74090a(R.id.title);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setText(str);
    }

    private /* synthetic */ InputItem(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(6253);
        if (this.f101639b) {
            ((FrameLayout) mo74090a(R.id.acz)).addView(view, layoutParams);
            MethodCollector.m26664o(6253);
            return;
        }
        super.addView(view, i, layoutParams);
        MethodCollector.m26664o(6253);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InputItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(6256);
        View.inflate(context, R.layout.nz, this);
        this.f101639b = true;
        setOrientation(1);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        setLayoutParams(layoutParams);
        int contentViewLayoutId = getContentViewLayoutId();
        View contentView = getContentView();
        if (contentViewLayoutId != -1) {
            View.inflate(context, contentViewLayoutId, this);
        } else if (contentView != null) {
            addView(contentView);
        }
        int footerViewLayoutId = getFooterViewLayoutId();
        View footerView = footerViewLayoutId != -1 ? View.inflate(context, footerViewLayoutId, null) : getFooterView();
        if (footerView != null) {
            ((FrameLayout) mo74090a(R.id.b7n)).addView(footerView);
        }
        MethodCollector.m26664o(6256);
    }
}
