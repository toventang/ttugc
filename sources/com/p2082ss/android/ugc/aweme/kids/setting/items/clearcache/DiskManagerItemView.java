package com.p2082ss.android.ugc.aweme.kids.setting.items.clearcache;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.DiskManagerItemView */
public final class DiskManagerItemView extends CommonItemView {

    /* renamed from: h */
    public static final C57830a f131877h = new C57830a((byte) 0);

    /* renamed from: i */
    private View f131878i;

    /* renamed from: j */
    private View f131879j;

    /* renamed from: k */
    private int f131880k;

    static {
        Covode.recordClassIndex(67836);
    }

    public DiskManagerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.clearcache.DiskManagerItemView$a */
    public static final class C57830a {
        static {
            Covode.recordClassIndex(67837);
        }

        private C57830a() {
        }

        public /* synthetic */ C57830a(byte b) {
            this();
        }
    }

    /* renamed from: h */
    public final void mo95152h() {
        TextView textView = this.f40932b;
        if (textView != null) {
            textView.setVisibility(4);
        }
    }

    /* renamed from: e */
    public final boolean mo95149e() {
        View view = this.f131878i;
        if (view == null) {
            C89219l.m154710a("loadingView");
        }
        if (view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final void mo95150f() {
        View view = this.f131878i;
        if (view == null) {
            C89219l.m154710a("loadingView");
        }
        view.setVisibility(0);
        View view2 = this.f131879j;
        if (view2 == null) {
            C89219l.m154710a("loadingTextView");
        }
        view2.setVisibility(0);
    }

    /* renamed from: g */
    public final void mo95151g() {
        View view = this.f131878i;
        if (view == null) {
            C89219l.m154710a("loadingView");
        }
        view.setVisibility(4);
        View view2 = this.f131879j;
        if (view2 == null) {
            C89219l.m154710a("loadingTextView");
        }
        view2.setVisibility(4);
    }

    /* renamed from: i */
    public final void mo95153i() {
        TextView textView = this.f40932b;
        if (textView != null) {
            textView.setAlpha(0.0f);
            textView.setVisibility(0);
            textView.animate().alpha(1.0f).setDuration(150).setListener(null);
        }
    }

    @Override // com.bytedance.ies.dmt.p1194ui.common.views.CommonItemView
    /* renamed from: a */
    public final void mo27131a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes;
        C1764a.m5927a(LayoutInflater.from(context), R.layout.abx, this, true);
        mo27135b(context, attributeSet);
        mo27130a();
        if (!(context == null || (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.abf})) == null)) {
            this.f131880k = (int) obtainStyledAttributes.getDimension(0, 0.0f);
            obtainStyledAttributes.recycle();
        }
        View findViewById = findViewById(R.id.c1k);
        C89219l.m154716b(findViewById, "");
        this.f131878i = findViewById;
        View findViewById2 = findViewById(R.id.f7h);
        C89219l.m154716b(findViewById2, "");
        this.f131879j = findViewById2;
        View view = this.f131878i;
        if (view == null) {
            C89219l.m154710a("loadingView");
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams) layoutParams).setMargins(this.f131880k, 0, 0, 0);
        TextView textView = this.f40932b;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private /* synthetic */ DiskManagerItemView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private DiskManagerItemView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
    }
}
