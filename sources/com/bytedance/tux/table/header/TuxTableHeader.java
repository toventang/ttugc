package com.bytedance.tux.table.header;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.table.EnumC23274a;
import com.bytedance.tux.table.EnumC23277b;
import com.bytedance.tux.table.header.AbstractC23311a;
import com.bytedance.tux.table.p1726a.C23276b;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89376n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

public final class TuxTableHeader extends ConstraintLayout {

    /* renamed from: g */
    private EnumC23274a f55243g;

    /* renamed from: h */
    private EnumC23277b f55244h;

    /* renamed from: i */
    private View.OnClickListener f55245i;

    /* renamed from: j */
    private boolean f55246j;

    /* renamed from: k */
    private AbstractC23311a.AbstractC23312a f55247k;

    /* renamed from: l */
    private HashMap f55248l;

    static {
        Covode.recordClassIndex(27262);
    }

    public TuxTableHeader(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: b */
    private View m43908b(int i) {
        if (this.f55248l == null) {
            this.f55248l = new HashMap();
        }
        View view = (View) this.f55248l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f55248l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final AbstractC23311a.AbstractC23312a getAccessory() {
        return this.f55247k;
    }

    public final EnumC23277b getHeaderInset() {
        return this.f55244h;
    }

    public final EnumC23274a getHeaderSize() {
        return this.f55243g;
    }

    public final View.OnClickListener getInfoIconClickListener() {
        return this.f55245i;
    }

    public final boolean getShowSeparator() {
        return this.f55246j;
    }

    /* renamed from: c */
    private final boolean m43910c() {
        CharSequence subtitle;
        if (this.f55243g == EnumC23274a.SMALL || (subtitle = getSubtitle()) == null || subtitle.length() == 0) {
            return false;
        }
        return true;
    }

    public final CharSequence getSubtitle() {
        TuxTextView tuxTextView = (TuxTextView) m43908b(R.id.ebd);
        C89219l.m154709a((Object) tuxTextView, "");
        return tuxTextView.getText();
    }

    public final CharSequence getTitle() {
        TuxTextView tuxTextView = (TuxTextView) m43908b(R.id.title_tv);
        C89219l.m154709a((Object) tuxTextView, "");
        return tuxTextView.getText();
    }

    /* renamed from: b */
    private final void m43909b() {
        int i;
        View a;
        View a2;
        int a3;
        int i2 = 0;
        if (this.f55243g == EnumC23274a.SMALL) {
            LinearLayout linearLayout = (LinearLayout) m43908b(R.id.eja);
            C89219l.m154709a((Object) linearLayout, "");
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            C23163i.m43668b(linearLayout, null, valueOf, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system2.getDisplayMetrics()))), false, 21);
            View b = m43908b(R.id.dvt);
            C89219l.m154709a((Object) b, "");
            if (this.f55246j) {
                Resources system3 = Resources.getSystem();
                C89219l.m154709a((Object) system3, "");
                i2 = C89241a.m154730a(TypedValue.applyDimension(1, 9.0f, system3.getDisplayMetrics()));
            }
            C23163i.m43668b(b, null, Integer.valueOf(i2), null, null, false, 29);
            TuxTextView tuxTextView = (TuxTextView) m43908b(R.id.ebd);
            C89219l.m154709a((Object) tuxTextView, "");
            tuxTextView.setVisibility(8);
            AbstractC23311a.AbstractC23312a aVar = this.f55247k;
            if (aVar != null && (a2 = aVar.mo37982a()) != null) {
                if (this.f55246j) {
                    Resources system4 = Resources.getSystem();
                    C89219l.m154709a((Object) system4, "");
                    a3 = C89241a.m154730a(TypedValue.applyDimension(1, 29.0f, system4.getDisplayMetrics()));
                } else {
                    Resources system5 = Resources.getSystem();
                    C89219l.m154709a((Object) system5, "");
                    a3 = C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system5.getDisplayMetrics()));
                }
                C23163i.m43668b(a2, null, Integer.valueOf(a3), null, null, false, 29);
                return;
            }
            return;
        }
        View b2 = m43908b(R.id.dvt);
        C89219l.m154709a((Object) b2, "");
        if (this.f55246j) {
            Resources system6 = Resources.getSystem();
            C89219l.m154709a((Object) system6, "");
            i = C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system6.getDisplayMetrics()));
        } else {
            i = 0;
        }
        C23163i.m43668b(b2, null, Integer.valueOf(i), null, null, false, 29);
        Resources system7 = Resources.getSystem();
        C89219l.m154709a((Object) system7, "");
        int a4 = C89241a.m154730a(TypedValue.applyDimension(1, 17.0f, system7.getDisplayMetrics()));
        if (m43910c()) {
            LinearLayout linearLayout2 = (LinearLayout) m43908b(R.id.eja);
            C89219l.m154709a((Object) linearLayout2, "");
            C23163i.m43668b(linearLayout2, null, Integer.valueOf(a4), null, null, false, 29);
            TuxTextView tuxTextView2 = (TuxTextView) m43908b(R.id.ebd);
            C89219l.m154709a((Object) tuxTextView2, "");
            Resources system8 = Resources.getSystem();
            C89219l.m154709a((Object) system8, "");
            Integer valueOf2 = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 6.0f, system8.getDisplayMetrics())));
            Resources system9 = Resources.getSystem();
            C89219l.m154709a((Object) system9, "");
            C23163i.m43668b(tuxTextView2, null, valueOf2, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system9.getDisplayMetrics()))), false, 21);
            TuxTextView tuxTextView3 = (TuxTextView) m43908b(R.id.ebd);
            C89219l.m154709a((Object) tuxTextView3, "");
            tuxTextView3.setVisibility(0);
        } else {
            LinearLayout linearLayout3 = (LinearLayout) m43908b(R.id.eja);
            C89219l.m154709a((Object) linearLayout3, "");
            Integer valueOf3 = Integer.valueOf(a4);
            Resources system10 = Resources.getSystem();
            C89219l.m154709a((Object) system10, "");
            C23163i.m43668b(linearLayout3, null, valueOf3, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 8.0f, system10.getDisplayMetrics()))), false, 21);
            TuxTextView tuxTextView4 = (TuxTextView) m43908b(R.id.ebd);
            C89219l.m154709a((Object) tuxTextView4, "");
            tuxTextView4.setVisibility(8);
        }
        AbstractC23311a.AbstractC23312a aVar2 = this.f55247k;
        if (aVar2 != null && (a = aVar2.mo37982a()) != null) {
            if (this.f55246j) {
                Resources system11 = Resources.getSystem();
                C89219l.m154709a((Object) system11, "");
                a4 = C89241a.m154730a(TypedValue.applyDimension(1, 25.0f, system11.getDisplayMetrics()));
            }
            C23163i.m43668b(a, null, Integer.valueOf(a4), null, null, false, 29);
        }
    }

    public final void setHeaderInset(EnumC23277b bVar) {
        C89219l.m154719c(bVar, "");
        this.f55244h = bVar;
        int px = bVar.toPx();
        C23163i.m43660a((View) this, Integer.valueOf(px), (Integer) null, Integer.valueOf(px), (Integer) null, false, 26);
    }

    public final void setShowSeparator(boolean z) {
        int i;
        this.f55246j = z;
        View b = m43908b(R.id.dvt);
        C89219l.m154709a((Object) b, "");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        b.setVisibility(i);
        m43909b();
    }

    public final void setTitle(CharSequence charSequence) {
        TuxTextView tuxTextView = (TuxTextView) m43908b(R.id.title_tv);
        C89219l.m154709a((Object) tuxTextView, "");
        tuxTextView.setText(charSequence);
    }

    /* renamed from: a */
    private final int m43905a(TypedArray typedArray) {
        int i;
        int i2 = C23313b.f55249a[this.f55243g.ordinal()];
        if (i2 == 1) {
            i = 15;
        } else if (i2 == 2) {
            i = 14;
        } else if (i2 == 3) {
            i = 13;
        } else {
            throw new C89376n();
        }
        return typedArray.getInt(i, 0);
    }

    /* renamed from: b */
    private final int m43907b(TypedArray typedArray) {
        int i;
        int i2 = C23313b.f55250b[this.f55243g.ordinal()];
        if (i2 == 1) {
            i = 12;
        } else if (i2 == 2) {
            i = 11;
        } else if (i2 == 3) {
            i = 10;
        } else {
            throw new C89376n();
        }
        return typedArray.getColor(i, 0);
    }

    public final void setInfoIconClickListener(View.OnClickListener onClickListener) {
        int i;
        TuxIconView tuxIconView = (TuxIconView) m43908b(R.id.bn4);
        C89219l.m154709a((Object) tuxIconView, "");
        if (onClickListener != null) {
            i = 0;
        } else {
            i = 8;
        }
        tuxIconView.setVisibility(i);
        ((TuxIconView) m43908b(R.id.bn4)).setOnClickListener(onClickListener);
    }

    public final void setAccessory(AbstractC23311a.AbstractC23312a aVar) {
        AbstractC23311a.AbstractC23312a aVar2 = this.f55247k;
        if (aVar2 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) m43908b(R.id.be4);
            C89219l.m154709a((Object) constraintLayout, "");
            View a = aVar2.mo37982a();
            LinearLayout linearLayout = (LinearLayout) m43908b(R.id.eja);
            C89219l.m154709a((Object) linearLayout, "");
            C23276b.m43838b(constraintLayout, a, linearLayout);
        }
        if (aVar != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) m43908b(R.id.be4);
            C89219l.m154709a((Object) constraintLayout2, "");
            View a2 = aVar.mo37982a();
            LinearLayout linearLayout2 = (LinearLayout) m43908b(R.id.eja);
            C89219l.m154709a((Object) linearLayout2, "");
            C23276b.m43837a(constraintLayout2, a2, linearLayout2);
        } else {
            aVar = null;
        }
        this.f55247k = aVar;
        m43909b();
    }

    public final void setHeaderSize(EnumC23274a aVar) {
        C89219l.m154719c(aVar, "");
        this.f55243g = aVar;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, new int[]{R.attr.fo, R.attr.fp, R.attr.fq, R.attr.fr, R.attr.fs, R.attr.ft, R.attr.fu, R.attr.fv, R.attr.fw, R.attr.fx, R.attr.fy, R.attr.fz, R.attr.g0, R.attr.g1, R.attr.g2, R.attr.g3}, R.attr.ca, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        int a = m43905a(obtainStyledAttributes);
        int b = m43907b(obtainStyledAttributes);
        TuxTextView tuxTextView = (TuxTextView) m43908b(R.id.title_tv);
        C89219l.m154709a((Object) tuxTextView, "");
        m43906a(a, b, tuxTextView);
        obtainStyledAttributes.recycle();
        m43909b();
    }

    public final void setSubtitle(CharSequence charSequence) {
        int i;
        TuxTextView tuxTextView = (TuxTextView) m43908b(R.id.ebd);
        C89219l.m154709a((Object) tuxTextView, "");
        CharSequence text = tuxTextView.getText();
        TuxTextView tuxTextView2 = (TuxTextView) m43908b(R.id.ebd);
        C89219l.m154709a((Object) tuxTextView2, "");
        tuxTextView2.setText(charSequence);
        if (this.f55243g != EnumC23274a.SMALL) {
            TuxTextView tuxTextView3 = (TuxTextView) m43908b(R.id.ebd);
            C89219l.m154709a((Object) tuxTextView3, "");
            if (charSequence == null || charSequence.length() == 0) {
                i = 8;
            } else {
                i = 0;
            }
            tuxTextView3.setVisibility(i);
            if (text == null || text.length() == 0) {
                if (charSequence == null || charSequence.length() == 0) {
                    if (text == null) {
                        return;
                    }
                }
                m43909b();
            }
            if (text.length() != 0) {
                if (!(charSequence == null || charSequence.length() == 0)) {
                    return;
                }
                m43909b();
            }
        }
    }

    /* renamed from: a */
    private static void m43906a(int i, int i2, TuxTextView tuxTextView) {
        tuxTextView.setTuxFont(i);
        tuxTextView.setTextColor(i2);
    }

    private /* synthetic */ TuxTableHeader(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxTableHeader(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, R.attr.ca);
        C89219l.m154719c(context, "");
        this.f55243g = EnumC23274a.SMALL;
        this.f55244h = EnumC23277b.PADDING_16;
        C1764a.m5927a(LayoutInflater.from(context), R.layout.l, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.fo, R.attr.fp, R.attr.fq, R.attr.fr, R.attr.fs, R.attr.ft, R.attr.fu, R.attr.fv, R.attr.fw, R.attr.fx, R.attr.fy, R.attr.fz, R.attr.g0, R.attr.g1, R.attr.g2, R.attr.g3}, R.attr.ca, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        int a = m43905a(obtainStyledAttributes);
        int b = m43907b(obtainStyledAttributes);
        TuxTextView tuxTextView = (TuxTextView) m43908b(R.id.title_tv);
        C89219l.m154709a((Object) tuxTextView, "");
        m43906a(a, b, tuxTextView);
        int i = obtainStyledAttributes.getInt(9, 0);
        int color = obtainStyledAttributes.getColor(8, 0);
        TuxTextView tuxTextView2 = (TuxTextView) m43908b(R.id.ebd);
        C89219l.m154709a((Object) tuxTextView2, "");
        m43906a(i, color, tuxTextView2);
        View b2 = m43908b(R.id.dvt);
        b2.findViewById(R.id.dvt).setBackgroundColor(obtainStyledAttributes.getColor(7, 0));
        TuxIconView tuxIconView = (TuxIconView) m43908b(R.id.bn4);
        tuxIconView.setIconRes(obtainStyledAttributes.getResourceId(4, 0));
        tuxIconView.setTintColor(obtainStyledAttributes.getColor(3, 0));
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        tuxIconView.setIconWidth(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics())));
        Resources system2 = Resources.getSystem();
        C89219l.m154709a((Object) system2, "");
        tuxIconView.setIconHeight(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system2.getDisplayMetrics())));
        obtainStyledAttributes.recycle();
        m43909b();
    }
}
