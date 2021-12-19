package com.p2082ss.android.ugc.aweme.ecommerce.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0643b;
import androidx.core.p037h.C0792v;
import com.C1764a;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.common.C17177c;
import com.bytedance.ies.dmt.p1194ui.p1198d.C17191a;
import com.bytedance.ies.dmt.p1194ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p1194ui.widget.View$OnTouchListenerC17271b;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard */
public final class AddressInfoCard extends ConstraintLayout {

    /* renamed from: h */
    public static final C45576a f106129h = new C45576a((byte) 0);

    /* renamed from: g */
    public boolean f106130g;

    /* renamed from: i */
    private boolean f106131i;

    /* renamed from: j */
    private int f106132j;

    /* renamed from: k */
    private String f106133k;

    /* renamed from: l */
    private String f106134l;

    /* renamed from: m */
    private String f106135m;

    /* renamed from: n */
    private String f106136n;

    /* renamed from: o */
    private String f106137o;

    /* renamed from: p */
    private String f106138p;

    /* renamed from: q */
    private boolean f106139q;

    /* renamed from: r */
    private String f106140r;

    /* renamed from: s */
    private String f106141s;

    /* renamed from: t */
    private SparseArray f106142t;

    static {
        Covode.recordClassIndex(54069);
    }

    public AddressInfoCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: b */
    public final View mo9603b(int i) {
        if (this.f106142t == null) {
            this.f106142t = new SparseArray();
        }
        View view = (View) this.f106142t.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f106142t.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard$a */
    public static final class C45576a {
        static {
            Covode.recordClassIndex(54070);
        }

        private C45576a() {
        }

        public /* synthetic */ C45576a(byte b) {
            this();
        }
    }

    public final String getAddressDetailText() {
        return this.f106137o;
    }

    public final String getEmailText() {
        return this.f106135m;
    }

    public final boolean getHasPrefix() {
        return this.f106131i;
    }

    public final String getHintText() {
        return this.f106141s;
    }

    public final String getNameText() {
        return this.f106133k;
    }

    public final String getPhoneText() {
        return this.f106134l;
    }

    public final boolean getReachable() {
        return this.f106139q;
    }

    public final String getRegionText() {
        return this.f106136n;
    }

    public final int getSuffixType() {
        return this.f106132j;
    }

    public final String getUiMode() {
        return this.f106140r;
    }

    public final String getZipcodeText() {
        return this.f106138p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ecommerce.widget.AddressInfoCard$b */
    public static final class RunnableC45577b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ AddressInfoCard f106143a;

        static {
            Covode.recordClassIndex(54071);
        }

        RunnableC45577b(AddressInfoCard addressInfoCard) {
            this.f106143a = addressInfoCard;
        }

        public final void run() {
            Rect rect = new Rect();
            ((TuxTextView) this.f106143a.mo9603b(R.id.aqv)).getHitRect(rect);
            rect.top -= (int) C13628n.m24520b(this.f106143a.getContext(), 6.0f);
            rect.bottom += (int) C13628n.m24520b(this.f106143a.getContext(), 6.0f);
            rect.left -= (int) C13628n.m24520b(this.f106143a.getContext(), 16.0f);
            rect.right += (int) C13628n.m24520b(this.f106143a.getContext(), 16.0f);
            FrameLayout frameLayout = (FrameLayout) this.f106143a.mo9603b(R.id.aah);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setTouchDelegate(new TouchDelegate(rect, this.f106143a.mo9603b(R.id.aqv)));
        }
    }

    public final void setDefault(boolean z) {
        int i;
        this.f106130g = z;
        TuxTextView tuxTextView = (TuxTextView) mo9603b(R.id.aid);
        C89219l.m154716b(tuxTextView, "");
        if (this.f106130g) {
            i = 0;
        } else {
            i = 8;
        }
        tuxTextView.setVisibility(i);
    }

    public final void setPaddingVertical(int i) {
        float f = (float) i;
        setPadding(0, (int) C13628n.m24520b(getContext(), f), 0, (int) C13628n.m24520b(getContext(), f));
    }

    public final void setAddressDetailText(String str) {
        this.f106137o = str;
        TuxTextView tuxTextView = (TuxTextView) mo9603b(R.id.h8);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(this.f106137o);
        TuxTextView tuxTextView2 = (TuxTextView) mo9603b(R.id.h8);
        C89219l.m154716b(tuxTextView2, "");
        String str2 = this.f106137o;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        tuxTextView2.setVisibility(i);
    }

    public final void setEmailText(String str) {
        this.f106135m = str;
        TuxTextView tuxTextView = (TuxTextView) mo9603b(R.id.atd);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(this.f106135m);
        TuxTextView tuxTextView2 = (TuxTextView) mo9603b(R.id.atd);
        C89219l.m154716b(tuxTextView2, "");
        String str2 = this.f106135m;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        tuxTextView2.setVisibility(i);
    }

    public final void setHintText(String str) {
        boolean z;
        this.f106141s = str;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            TuxTextView tuxTextView = (TuxTextView) mo9603b(R.id.bf6);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setVisibility(8);
        } else {
            TuxTextView tuxTextView2 = (TuxTextView) mo9603b(R.id.bf6);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
        }
        TuxTextView tuxTextView3 = (TuxTextView) mo9603b(R.id.bf6);
        C89219l.m154716b(tuxTextView3, "");
        tuxTextView3.setText(this.f106141s);
    }

    public final void setNameText(String str) {
        this.f106133k = str;
        TuxTextView tuxTextView = (TuxTextView) mo9603b(R.id.cpj);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(this.f106133k);
        TuxTextView tuxTextView2 = (TuxTextView) mo9603b(R.id.cpj);
        C89219l.m154716b(tuxTextView2, "");
        String str2 = this.f106133k;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        tuxTextView2.setVisibility(i);
    }

    public final void setRegionText(String str) {
        this.f106136n = str;
        TuxTextView tuxTextView = (TuxTextView) mo9603b(R.id.dhc);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(this.f106136n);
        TuxTextView tuxTextView2 = (TuxTextView) mo9603b(R.id.dhc);
        C89219l.m154716b(tuxTextView2, "");
        String str2 = this.f106136n;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        tuxTextView2.setVisibility(i);
    }

    public final void setZipcodeText(String str) {
        this.f106138p = str;
        TuxTextView tuxTextView = (TuxTextView) mo9603b(R.id.fk7);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(this.f106138p);
        TuxTextView tuxTextView2 = (TuxTextView) mo9603b(R.id.fk7);
        C89219l.m154716b(tuxTextView2, "");
        String str2 = this.f106138p;
        int i = 0;
        if (str2 == null || str2.length() == 0) {
            i = 8;
        }
        tuxTextView2.setVisibility(i);
    }

    public final void setPhoneText(String str) {
        C17191a aVar;
        this.f106134l = str;
        TuxTextView tuxTextView = (TuxTextView) mo9603b(R.id.d1_);
        C89219l.m154716b(tuxTextView, "");
        String str2 = this.f106134l;
        int i = 0;
        if (str2 != null) {
            List<String> b = C89361p.m154915b(str2, new String[]{")"});
            StringBuilder sb = new StringBuilder();
            String str3 = (String) C89070n.m154561b((List) b, 0);
            if (str3 == null) {
                str3 = "";
            }
            String sb2 = sb.append(str3).append(")").toString();
            String str4 = (String) C89070n.m154561b((List) b, 1);
            if (str4 == null) {
                str4 = "";
            }
            aVar = new C17191a.C17192a().mo27177a(sb2).mo27179b(str4).f40973a;
        } else {
            aVar = null;
        }
        tuxTextView.setText(aVar);
        TuxTextView tuxTextView2 = (TuxTextView) mo9603b(R.id.d1_);
        C89219l.m154716b(tuxTextView2, "");
        String str5 = this.f106134l;
        if (str5 == null || str5.length() == 0) {
            i = 8;
        }
        tuxTextView2.setVisibility(i);
    }

    public final void setReachable(boolean z) {
        this.f106139q = z;
        int c = C0643b.m2378c(getContext(), R.color.bx);
        int c2 = C0643b.m2378c(getContext(), R.color.c4);
        if (!this.f106139q) {
            c = C0643b.m2378c(getContext(), R.color.bz);
            c2 = C0643b.m2378c(getContext(), R.color.bz);
        }
        ((TuxTextView) mo9603b(R.id.cpj)).setTextColor(c);
        ((TuxTextView) mo9603b(R.id.d1_)).setTextColor(c2);
        ((TuxTextView) mo9603b(R.id.dhc)).setTextColor(c2);
        ((TuxTextView) mo9603b(R.id.h8)).setTextColor(c2);
        ((TuxTextView) mo9603b(R.id.fk7)).setTextColor(c2);
    }

    public final void setSuffixType(int i) {
        int i2;
        int i3;
        this.f106132j = i;
        RadioButton radioButton = (RadioButton) mo9603b(R.id.ddr);
        C89219l.m154716b(radioButton, "");
        int i4 = 0;
        if (this.f106132j == 3) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        radioButton.setVisibility(i2);
        AutoRTLImageView autoRTLImageView = (AutoRTLImageView) mo9603b(R.id.b7x);
        C89219l.m154716b(autoRTLImageView, "");
        if (this.f106132j == 2) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        autoRTLImageView.setVisibility(i3);
        TuxTextView tuxTextView = (TuxTextView) mo9603b(R.id.aqv);
        C89219l.m154716b(tuxTextView, "");
        if (this.f106132j != 1) {
            i4 = 8;
        }
        tuxTextView.setVisibility(i4);
        if (this.f106132j == 1) {
            post(new RunnableC45577b(this));
            return;
        }
        FrameLayout frameLayout = (FrameLayout) mo9603b(R.id.aah);
        C89219l.m154716b(frameLayout, "");
        frameLayout.setTouchDelegate(null);
    }

    public final void setHasPrefix(boolean z) {
        int i;
        this.f106131i = z;
        TuxIconView tuxIconView = (TuxIconView) mo9603b(R.id.d5a);
        C89219l.m154716b(tuxIconView, "");
        if (this.f106131i) {
            i = 0;
        } else {
            i = 8;
        }
        tuxIconView.setVisibility(i);
        if (this.f106131i) {
            TuxTextView tuxTextView = (TuxTextView) mo9603b(R.id.cpj);
            C89219l.m154716b(tuxTextView, "");
            TuxTextView tuxTextView2 = (TuxTextView) mo9603b(R.id.cpj);
            C89219l.m154716b(tuxTextView2, "");
            ViewGroup.LayoutParams layoutParams = tuxTextView2.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.C0547a aVar = (ConstraintLayout.C0547a) layoutParams;
            int i2 = Build.VERSION.SDK_INT;
            aVar.setMarginStart((int) C13628n.m24520b(getContext(), 12.0f));
            tuxTextView.setLayoutParams(aVar);
            return;
        }
        TuxTextView tuxTextView3 = (TuxTextView) mo9603b(R.id.cpj);
        C89219l.m154716b(tuxTextView3, "");
        TuxTextView tuxTextView4 = (TuxTextView) mo9603b(R.id.cpj);
        C89219l.m154716b(tuxTextView4, "");
        ViewGroup.LayoutParams layoutParams2 = tuxTextView4.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.C0547a aVar2 = (ConstraintLayout.C0547a) layoutParams2;
        int i3 = Build.VERSION.SDK_INT;
        aVar2.setMarginStart((int) C13628n.m24520b(getContext(), 16.0f));
        tuxTextView3.setLayoutParams(aVar2);
    }

    public final void setUiMode(String str) {
        C89219l.m154721d(str, "");
        this.f106140r = str;
        if (str.hashCode() == -902286926 && str.equals("simple")) {
            TuxTextView tuxTextView = (TuxTextView) mo9603b(R.id.cpj);
            C89219l.m154716b(tuxTextView, "");
            tuxTextView.setMaxLines(1);
            TuxTextView tuxTextView2 = (TuxTextView) mo9603b(R.id.d1_);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setMaxLines(1);
            TuxTextView tuxTextView3 = (TuxTextView) mo9603b(R.id.h8);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setMaxLines(2);
            TuxTextView tuxTextView4 = (TuxTextView) mo9603b(R.id.dhc);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setMaxLines(1);
            TuxTextView tuxTextView5 = (TuxTextView) mo9603b(R.id.fk7);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setMaxLines(1);
            return;
        }
        TuxTextView tuxTextView6 = (TuxTextView) mo9603b(R.id.cpj);
        C89219l.m154716b(tuxTextView6, "");
        tuxTextView6.setMaxLines(Integer.MAX_VALUE);
        TuxTextView tuxTextView7 = (TuxTextView) mo9603b(R.id.d1_);
        C89219l.m154716b(tuxTextView7, "");
        tuxTextView7.setMaxLines(1);
        TuxTextView tuxTextView8 = (TuxTextView) mo9603b(R.id.h8);
        C89219l.m154716b(tuxTextView8, "");
        tuxTextView8.setMaxLines(Integer.MAX_VALUE);
        TuxTextView tuxTextView9 = (TuxTextView) mo9603b(R.id.dhc);
        C89219l.m154716b(tuxTextView9, "");
        tuxTextView9.setMaxLines(Integer.MAX_VALUE);
        TuxTextView tuxTextView10 = (TuxTextView) mo9603b(R.id.fk7);
        C89219l.m154716b(tuxTextView10, "");
        tuxTextView10.setMaxLines(1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddressInfoCard(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AddressInfoCard(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        this.f106131i = true;
        this.f106132j = 2;
        this.f106133k = "";
        this.f106134l = "";
        this.f106135m = "";
        this.f106136n = "";
        this.f106137o = "";
        this.f106138p = "";
        this.f106139q = true;
        this.f106140r = "simple";
        this.f106141s = "";
        C1764a.m5927a(LayoutInflater.from(context), R.layout.nx, this, true);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -2;
            layoutParams.width = -1;
        } else {
            layoutParams = new ConstraintLayout.C0547a(-1, -2);
        }
        setLayoutParams(layoutParams);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.p4, R.attr.pd});
        C89219l.m154716b(obtainStyledAttributes, "");
        setHasPrefix(obtainStyledAttributes.getBoolean(0, true));
        setSuffixType(obtainStyledAttributes.getInt(1, 2));
        obtainStyledAttributes.recycle();
        setPaddingVertical(16);
        C0792v.m2746a(this, C17177c.m31711c(context));
        ((TuxTextView) mo9603b(R.id.aqv)).setOnTouchListener(new View$OnTouchListenerC17271b());
    }
}
