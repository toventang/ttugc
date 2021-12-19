package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.view.style.StyleTextView;
import com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.m */
public final class C46159m extends C85035a {

    /* renamed from: a */
    private final boolean f107465a;

    /* renamed from: b */
    private final int f107466b;

    /* renamed from: d */
    private final int f107467d;

    /* renamed from: e */
    private final int f107468e;

    /* renamed from: f */
    private final int f107469f;

    /* renamed from: g */
    private final boolean f107470g;

    /* renamed from: h */
    private final int f107471h;

    /* renamed from: i */
    private final int f107472i;

    /* renamed from: j */
    private final int f107473j;

    /* renamed from: k */
    private final boolean f107474k;

    /* renamed from: l */
    private final boolean f107475l;

    /* renamed from: m */
    private final int f107476m;

    /* renamed from: n */
    private final int f107477n;

    /* renamed from: o */
    private final int f107478o;

    /* renamed from: p */
    private final int f107479p;

    static {
        Covode.recordClassIndex(54718);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.m$a */
    public static class C46160a {

        /* renamed from: a */
        public boolean f107480a;

        /* renamed from: b */
        public int f107481b;

        /* renamed from: c */
        public int f107482c;

        /* renamed from: d */
        public int f107483d;

        /* renamed from: e */
        public int f107484e;

        /* renamed from: f */
        public boolean f107485f = true;

        /* renamed from: g */
        public int f107486g = 4;

        /* renamed from: h */
        public int f107487h = 4;

        /* renamed from: i */
        public int f107488i = R.color.bh;

        /* renamed from: j */
        public boolean f107489j = true;

        /* renamed from: k */
        public boolean f107490k = true;

        /* renamed from: l */
        public int f107491l = 2;

        /* renamed from: m */
        public int f107492m = R.color.bh;

        /* renamed from: n */
        public int f107493n = R.color.b9;

        /* renamed from: o */
        public int f107494o = 2;

        /* renamed from: p */
        public final Context f107495p;

        static {
            Covode.recordClassIndex(54719);
        }

        public C46160a(Context context) {
            C89219l.m154721d(context, "");
            this.f107495p = context;
        }
    }

    @Override // com.p2082ss.android.ugc.tools.view.widget.p4369c.C85035a
    /* renamed from: a */
    public final View mo78372a(Context context) {
        C89219l.m154721d(context, "");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        StyleTextView styleTextView = new StyleTextView(context);
        styleTextView.setLayoutParams(layoutParams);
        styleTextView.setGravity(17);
        styleTextView.setTextColor(C0643b.m2378c(context, R.color.bx));
        return styleTextView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46159m(Context context, boolean z, int i, int i2, int i3, int i4, boolean z2, int i5, int i6, int i7, boolean z3, boolean z4, int i8, int i9, int i10, int i11) {
        super(context, z, i, i2, i3, i4, z2, i5, i6, i7, z3, z4, i8, i9, i10, i11);
        C89219l.m154721d(context, "");
        this.f107465a = z;
        this.f107466b = i;
        this.f107467d = i2;
        this.f107468e = i3;
        this.f107469f = i4;
        this.f107470g = z2;
        this.f107471h = i5;
        this.f107472i = i6;
        this.f107473j = i7;
        this.f107474k = z3;
        this.f107475l = z4;
        this.f107476m = i8;
        this.f107477n = i9;
        this.f107478o = i10;
        this.f107479p = i11;
    }
}
