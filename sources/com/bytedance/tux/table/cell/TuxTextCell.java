package com.bytedance.tux.table.cell;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C22999a;
import com.bytedance.tux.p1710c.C23005c;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.table.EnumC23277b;
import com.bytedance.tux.table.cell.AbstractC23283a;
import com.bytedance.tux.table.cell.AbstractC23293c;
import com.bytedance.tux.table.p1726a.C23275a;
import com.bytedance.tux.table.p1726a.C23276b;
import com.bytedance.tux.widget.ExpandableLayout;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import p4600h.C89376n;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

public final class TuxTextCell extends LinearLayout {

    /* renamed from: a */
    public final C23282a f55186a;

    /* renamed from: b */
    public AbstractC89172b<? super Boolean, C89391z> f55187b;

    /* renamed from: c */
    private AbstractC23293c.AbstractC23296b f55188c;

    /* renamed from: d */
    private boolean f55189d;

    /* renamed from: e */
    private EnumC23277b f55190e;

    /* renamed from: f */
    private boolean f55191f;

    /* renamed from: g */
    private EnumC23292b f55192g;

    /* renamed from: h */
    private boolean f55193h;

    /* renamed from: i */
    private boolean f55194i;

    /* renamed from: j */
    private boolean f55195j;

    /* renamed from: k */
    private HashMap f55196k;

    static {
        Covode.recordClassIndex(27230);
    }

    public TuxTextCell(Context context) {
        this(context, null, 0, 6);
    }

    public TuxTextCell(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4);
    }

    /* renamed from: a */
    private View m43840a(int i) {
        if (this.f55196k == null) {
            this.f55196k = new HashMap();
        }
        View view = (View) this.f55196k.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f55196k.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
    }

    public final AbstractC23293c.AbstractC23296b getAccessory() {
        return this.f55188c;
    }

    public final boolean getCellEnabled() {
        return this.f55191f;
    }

    public final EnumC23277b getInset() {
        return this.f55190e;
    }

    public final EnumC23292b getVariant() {
        return this.f55192g;
    }

    public final boolean getWithSeparator() {
        return this.f55189d;
    }

    private final boolean getSubtitleIsShow() {
        TuxTextView tuxTextView = (TuxTextView) m43840a(R.id.ebd);
        C89219l.m154709a((Object) tuxTextView, "");
        if (tuxTextView.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public final CharSequence getSubtitle() {
        TuxTextView tuxTextView = (TuxTextView) m43840a(R.id.ebd);
        C89219l.m154709a((Object) tuxTextView, "");
        return tuxTextView.getText();
    }

    public final CharSequence getTitle() {
        TuxTextView tuxTextView = (TuxTextView) m43840a(R.id.title_tv);
        C89219l.m154709a((Object) tuxTextView, "");
        return tuxTextView.getText();
    }

    /* renamed from: b */
    private final void m43844b() {
        ConstraintLayout constraintLayout = (ConstraintLayout) m43840a(R.id.a2w);
        if (!this.f55191f) {
            constraintLayout.setBackgroundResource(0);
            return;
        }
        AbstractC23293c.AbstractC23296b bVar = this.f55188c;
        if (bVar == null || !bVar.mo37951c()) {
            constraintLayout.setBackgroundResource(0);
            return;
        }
        Context context = constraintLayout.getContext();
        C89219l.m154709a((Object) context, "");
        constraintLayout.setBackground(C23163i.m43665b(context));
    }

    /* renamed from: a */
    private final void m43841a() {
        int i;
        int i2;
        if (this.f55193h) {
            TuxTextView tuxTextView = (TuxTextView) m43840a(R.id.title_tv);
            int i3 = 0;
            if (this.f55195j) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                i = C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
            } else {
                i = 0;
            }
            if (!getSubtitleIsShow()) {
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                i3 = C89241a.m154730a(TypedValue.applyDimension(1, 17.0f, system2.getDisplayMetrics()));
            }
            C23163i.m43668b(tuxTextView, Integer.valueOf(i), null, null, Integer.valueOf(i3), false, 22);
            TuxTextView tuxTextView2 = (TuxTextView) m43840a(R.id.ebd);
            AbstractC23283a aVar = null;
            if (getSubtitleIsShow() && tuxTextView2 != null) {
                AbstractC23293c.AbstractC23296b bVar = this.f55188c;
                if (bVar != null) {
                    aVar = bVar.mo37947a();
                }
                if (C89219l.m154714a(aVar, AbstractC23283a.C23291h.f55212b) || C89219l.m154714a(aVar, AbstractC23283a.C23284a.f55206b)) {
                    Resources system3 = Resources.getSystem();
                    C89219l.m154709a((Object) system3, "");
                    i2 = C89241a.m154730a(TypedValue.applyDimension(1, 9.0f, system3.getDisplayMetrics()));
                } else {
                    Resources system4 = Resources.getSystem();
                    C89219l.m154709a((Object) system4, "");
                    i2 = C89241a.m154730a(TypedValue.applyDimension(1, 6.0f, system4.getDisplayMetrics()));
                }
                C23163i.m43668b(tuxTextView2, null, Integer.valueOf(i2), null, null, false, 29);
            }
            AbstractC23293c.AbstractC23296b bVar2 = this.f55188c;
            if (bVar2 != null) {
                bVar2.mo37954f();
            }
        }
    }

    public final void setCellEnabled(boolean z) {
        this.f55191f = z;
        setViewEnable(z);
    }

    public final void setLoading(boolean z) {
        AbstractC23293c.AbstractC23296b bVar = this.f55188c;
        if (bVar != null) {
            bVar.mo37948a(z);
        }
    }

    public final void setOnClickListener(AbstractC89172b<? super Boolean, C89391z> bVar) {
        if (!isClickable()) {
            setClickable(true);
        }
        this.f55187b = bVar;
    }

    /* renamed from: a */
    private final int m43839a(EnumC23292b bVar) {
        int i = C23310d.f55242a[bVar.ordinal()];
        if (i == 1) {
            return this.f55186a.f55200a;
        }
        if (i == 2) {
            return this.f55186a.f55201b;
        }
        throw new C89376n();
    }

    private final void setWithIcon(boolean z) {
        int i;
        this.f55195j = z;
        TuxIconView tuxIconView = (TuxIconView) m43840a(R.id.icon_iv);
        C89219l.m154709a((Object) tuxIconView, "");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        tuxIconView.setVisibility(i);
        m43841a();
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.f55193h) {
            ConstraintLayout constraintLayout = (ConstraintLayout) m43840a(R.id.a2w);
            C89219l.m154709a((Object) constraintLayout, "");
            constraintLayout.setEnabled(z);
            setViewEnable(z);
        }
    }

    public final void setIcon(AbstractC89172b<? super ImageView, C89391z> bVar) {
        C89219l.m154719c(bVar, "");
        View a = m43840a(R.id.icon_iv);
        C89219l.m154709a((Object) a, "");
        bVar.invoke(a);
        setWithIcon(true);
    }

    public final void setTitle(CharSequence charSequence) {
        TuxTextView tuxTextView = (TuxTextView) m43840a(R.id.title_tv);
        C89219l.m154709a((Object) tuxTextView, "");
        tuxTextView.setText(charSequence);
    }

    public final void setVariant(EnumC23292b bVar) {
        C89219l.m154719c(bVar, "");
        this.f55192g = bVar;
        ((TuxTextView) m43840a(R.id.title_tv)).setTextColor(m43839a(bVar));
    }

    public final void setWithSeparator(boolean z) {
        int i;
        this.f55189d = z;
        View a = m43840a(R.id.dvt);
        C89219l.m154709a((Object) a, "");
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        a.setVisibility(i);
    }

    private final void setViewEnable(boolean z) {
        int i;
        int i2;
        TuxTextView tuxTextView = (TuxTextView) m43840a(R.id.title_tv);
        if (z) {
            i = m43839a(this.f55192g);
        } else {
            i = this.f55186a.f55204e;
        }
        tuxTextView.setTextColor(i);
        TuxTextView tuxTextView2 = (TuxTextView) m43840a(R.id.ebd);
        C23282a aVar = this.f55186a;
        if (z) {
            i2 = aVar.f55202c;
        } else {
            i2 = aVar.f55204e;
        }
        tuxTextView2.setTextColor(i2);
        m43843a(z);
        AbstractC23293c.AbstractC23296b bVar = this.f55188c;
        if (bVar != null) {
            bVar.mo37950b(z);
        }
        m43844b();
    }

    public final void setInset(EnumC23277b bVar) {
        C89219l.m154719c(bVar, "");
        this.f55190e = bVar;
        int px = bVar.toPx();
        ConstraintLayout constraintLayout = (ConstraintLayout) m43840a(R.id.a2w);
        C89219l.m154709a((Object) constraintLayout, "");
        C23163i.m43660a((View) constraintLayout, Integer.valueOf(px), (Integer) null, Integer.valueOf(px), (Integer) null, false, 26);
    }

    /* renamed from: a */
    private final void m43843a(boolean z) {
        int i;
        if (!this.f55194i) {
            TuxIconView tuxIconView = (TuxIconView) m43840a(R.id.icon_iv);
            if (z) {
                i = this.f55186a.f55203d;
            } else {
                i = this.f55186a.f55204e;
            }
            tuxIconView.setTintColor(i);
        }
    }

    public final void setIcon(C22999a aVar) {
        boolean z = false;
        if (aVar != null) {
            ((TuxIconView) m43840a(R.id.icon_iv)).setIconRes(aVar.f54431a);
            this.f55194i = false;
            Integer num = aVar.f54434d;
            if (num != null) {
                ((TuxIconView) m43840a(R.id.icon_iv)).setTintColor(num.intValue());
                this.f55194i = true;
            }
            Integer num2 = aVar.f54435e;
            if (num2 != null) {
                ((TuxIconView) m43840a(R.id.icon_iv)).setTintColorRes(num2.intValue());
                this.f55194i = true;
            }
            m43843a(this.f55191f);
            z = true;
        }
        setWithIcon(z);
    }

    public final void setSubtitle(CharSequence charSequence) {
        TuxTextView tuxTextView = (TuxTextView) m43840a(R.id.ebd);
        C89219l.m154709a((Object) tuxTextView, "");
        int visibility = tuxTextView.getVisibility();
        if (charSequence == null || charSequence.length() == 0) {
            TuxTextView tuxTextView2 = (TuxTextView) m43840a(R.id.ebd);
            C89219l.m154709a((Object) tuxTextView2, "");
            tuxTextView2.setVisibility(8);
        } else {
            TuxTextView tuxTextView3 = (TuxTextView) m43840a(R.id.ebd);
            C89219l.m154709a((Object) tuxTextView3, "");
            tuxTextView3.setText(charSequence);
            TuxTextView tuxTextView4 = (TuxTextView) m43840a(R.id.ebd);
            C89219l.m154709a((Object) tuxTextView4, "");
            tuxTextView4.setVisibility(0);
        }
        TuxTextView tuxTextView5 = (TuxTextView) m43840a(R.id.ebd);
        C89219l.m154709a((Object) tuxTextView5, "");
        if (visibility != tuxTextView5.getVisibility()) {
            m43841a();
        }
    }

    public final void setAccessory(AbstractC23293c.AbstractC23296b bVar) {
        View view;
        AbstractC23293c.AbstractC23296b bVar2 = this.f55188c;
        if (bVar2 != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) m43840a(R.id.a2w);
            C89219l.m154709a((Object) constraintLayout, "");
            View b = bVar2.mo37949b();
            TuxTextView tuxTextView = (TuxTextView) m43840a(R.id.title_tv);
            C89219l.m154709a((Object) tuxTextView, "");
            C23276b.m43838b(constraintLayout, b, tuxTextView);
            ((ExpandableLayout) m43840a(R.id.axx)).removeAllViews();
            bVar2.mo37953e();
        }
        if (bVar != null) {
            ConstraintLayout constraintLayout2 = (ConstraintLayout) m43840a(R.id.a2w);
            C89219l.m154709a((Object) constraintLayout2, "");
            View b2 = bVar.mo37949b();
            TuxTextView tuxTextView2 = (TuxTextView) m43840a(R.id.title_tv);
            C89219l.m154709a((Object) tuxTextView2, "");
            C23276b.m43837a(constraintLayout2, b2, tuxTextView2);
            ConstraintLayout constraintLayout3 = (ConstraintLayout) m43840a(R.id.a2w);
            C89219l.m154709a((Object) constraintLayout3, "");
            C89219l.m154719c(constraintLayout3, "");
            bVar.mo37950b(constraintLayout3.isEnabled());
            if (C89219l.m154714a(bVar.mo37947a(), AbstractC23283a.C23288e.f55209b) && (view = ((AbstractC23293c.C23303g) bVar).f55233e) != null) {
                ExpandableLayout expandableLayout = (ExpandableLayout) m43840a(R.id.axx);
                C89219l.m154709a((Object) expandableLayout, "");
                expandableLayout.setVisibility(0);
                expandableLayout.addView(view);
            }
        }
        this.f55188c = bVar;
        m43844b();
        m43841a();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        TuxTextView tuxTextView;
        MethodCollector.m26663i(9492);
        AbstractC23293c.AbstractC23296b bVar = this.f55188c;
        TuxTextView tuxTextView2 = null;
        if (bVar != null) {
            AbstractC23283a a = bVar.mo37947a();
            if (C89219l.m154714a(a, AbstractC23283a.C23289f.f55210b)) {
                tuxTextView = bVar.mo37949b();
            } else if (C89219l.m154714a(a, AbstractC23283a.C23287d.f55208b)) {
                View b = bVar.mo37949b();
                if (b != null) {
                    TuxTextView labelTv$tux_release = ((C23275a) b).getLabelTv$tux_release();
                    C89219l.m154709a((Object) labelTv$tux_release, "");
                    int visibility = labelTv$tux_release.getVisibility();
                    tuxTextView = labelTv$tux_release;
                    if (visibility != 0) {
                        tuxTextView = null;
                    }
                } else {
                    C89388w wVar = new C89388w("null cannot be cast to non-null type");
                    MethodCollector.m26664o(9492);
                    throw wVar;
                }
            } else {
                tuxTextView = null;
            }
            boolean z = tuxTextView instanceof TuxTextView;
            TuxTextView tuxTextView3 = tuxTextView;
            if (!z) {
                tuxTextView3 = null;
            }
            TuxTextView tuxTextView4 = tuxTextView3;
            if (tuxTextView4 != null) {
                tuxTextView4.setMaxWidth(Integer.MAX_VALUE);
                tuxTextView2 = tuxTextView4;
            }
        }
        super.onMeasure(i, i2);
        if (tuxTextView2 == null) {
            MethodCollector.m26664o(9492);
            return;
        }
        AbstractC23293c.AbstractC23296b bVar2 = this.f55188c;
        if (bVar2 == null) {
            MethodCollector.m26664o(9492);
            return;
        }
        TuxTextView tuxTextView5 = (TuxTextView) m43840a(R.id.title_tv);
        C89219l.m154709a((Object) tuxTextView5, "");
        if (tuxTextView5.getLineCount() > 1) {
            tuxTextView2.setMaxWidth(C23276b.f55182a);
            super.onMeasure(i, i2);
            TuxTextView tuxTextView6 = (TuxTextView) m43840a(R.id.title_tv);
            C89219l.m154709a((Object) tuxTextView6, "");
            if (tuxTextView6.getLineCount() == 1) {
                bVar2.mo37952d();
                if (this.f55195j) {
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()));
                }
                int size = (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight();
                TuxTextView tuxTextView7 = (TuxTextView) m43840a(R.id.title_tv);
                C89219l.m154709a((Object) tuxTextView7, "");
                tuxTextView7.getMeasuredWidth();
                TuxIconView tuxIconView = (TuxIconView) m43840a(R.id.icon_iv);
                C89219l.m154709a((Object) tuxIconView, "");
                tuxIconView.getMeasuredWidth();
                tuxTextView2.setMaxWidth(size);
            }
        }
        MethodCollector.m26664o(9492);
    }

    /* renamed from: a */
    private static void m43842a(int i, int i2, TuxTextView tuxTextView) {
        tuxTextView.setTuxFont(i);
        tuxTextView.setTextColor(i2);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxTextCell(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        AbstractC23283a aVar;
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(9796);
        this.f55190e = EnumC23277b.PADDING_16;
        this.f55191f = true;
        this.f55192g = EnumC23292b.NORMAL;
        C1764a.m5927a(LayoutInflater.from(context), R.layout.m, this, true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g5, R.attr.g6, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.aok, R.attr.aol, R.attr.aom, R.attr.aon, R.attr.aop, R.attr.ap6, R.attr.apr, R.attr.aqo, R.attr.ar5, R.attr.aro}, i, 0);
        C89219l.m154709a((Object) obtainStyledAttributes, "");
        C23282a aVar2 = new C23282a(obtainStyledAttributes.getColor(14, 0), obtainStyledAttributes.getColor(15, 0), obtainStyledAttributes.getColor(11, 0), obtainStyledAttributes.getColor(5, 0), obtainStyledAttributes.getColor(13, 0));
        this.f55186a = aVar2;
        int i2 = obtainStyledAttributes.getInt(16, 0);
        int i3 = aVar2.f55200a;
        TuxTextView tuxTextView = (TuxTextView) m43840a(R.id.title_tv);
        setTitle(obtainStyledAttributes.getString(26));
        C89219l.m154709a((Object) tuxTextView, "");
        m43842a(i2, i3, tuxTextView);
        int i4 = obtainStyledAttributes.getInt(12, 0);
        int i5 = aVar2.f55202c;
        TuxTextView tuxTextView2 = (TuxTextView) m43840a(R.id.ebd);
        setSubtitle(obtainStyledAttributes.getString(25));
        C89219l.m154709a((Object) tuxTextView2, "");
        m43842a(i4, i5, tuxTextView2);
        final int resourceId = obtainStyledAttributes.getResourceId(22, 0);
        setIcon(C23005c.m43393a(new AbstractC89172b<C22999a, C89391z>(this) {
            /* class com.bytedance.tux.table.cell.TuxTextCell.C232801 */

            /* renamed from: a */
            final /* synthetic */ TuxTextCell f55197a;

            static {
                Covode.recordClassIndex(27231);
            }

            {
                this.f55197a = r2;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C22999a aVar) {
                C22999a aVar2 = aVar;
                C89219l.m154719c(aVar2, "");
                aVar2.f54431a = resourceId;
                aVar2.f54434d = Integer.valueOf(this.f55197a.f55186a.f55203d);
                return C89391z.f203057a;
            }
        }));
        if (resourceId != 0) {
            z = true;
        } else {
            z = false;
        }
        setWithIcon(z);
        View a = m43840a(R.id.dvt);
        a.findViewById(R.id.dvt).setBackgroundColor(obtainStyledAttributes.getColor(10, 0));
        setWithSeparator(obtainStyledAttributes.getBoolean(24, false));
        setInset(EnumC23277b.PADDING_16);
        if (obtainStyledAttributes.hasValue(20)) {
            switch (obtainStyledAttributes.getInt(20, -1)) {
                case 0:
                    aVar = AbstractC23283a.C23289f.f55210b;
                    break;
                case 1:
                    aVar = AbstractC23283a.C23287d.f55208b;
                    break;
                case 2:
                    aVar = AbstractC23283a.C23291h.f55212b;
                    break;
                case 3:
                    aVar = AbstractC23283a.C23290g.f55211b;
                    break;
                case 4:
                    aVar = AbstractC23283a.C23285b.f55207b;
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                    aVar = AbstractC23283a.C23288e.f55209b;
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                    aVar = AbstractC23283a.C23284a.f55206b;
                    break;
                default:
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unsupported text cell accessory");
                    MethodCollector.m26664o(9796);
                    throw illegalArgumentException;
            }
            Context context2 = getContext();
            C89219l.m154709a((Object) context2, "");
            setAccessory(aVar.mo37945a(context2, attributeSet));
        }
        obtainStyledAttributes.recycle();
        this.f55193h = true;
        setViewEnable(true);
        m43841a();
        ((ConstraintLayout) m43840a(R.id.a2w)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.bytedance.tux.table.cell.TuxTextCell.View$OnClickListenerC232812 */

            /* renamed from: a */
            final /* synthetic */ TuxTextCell f55199a;

            static {
                Covode.recordClassIndex(27232);
            }

            {
                this.f55199a = r1;
            }

            public final void onClick(View view) {
                AbstractC23293c.AbstractC23296b accessory = this.f55199a.getAccessory();
                if (accessory == null) {
                    AbstractC89172b<? super Boolean, C89391z> bVar = this.f55199a.f55187b;
                    if (bVar != null) {
                        bVar.invoke(Boolean.valueOf(this.f55199a.getCellEnabled()));
                    }
                } else if (!this.f55199a.getCellEnabled()) {
                    AbstractC89171a<C89391z> aVar = accessory.f55218a;
                    if (aVar != null) {
                        aVar.invoke();
                    }
                } else if (accessory.mo37951c()) {
                    accessory.mo37949b().performClick();
                }
            }
        });
        MethodCollector.m26664o(9796);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxTextCell(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.cc : i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.tux.table.cell.TuxTextCell$a */
    public static final class C23282a {

        /* renamed from: a */
        public final int f55200a;

        /* renamed from: b */
        public final int f55201b;

        /* renamed from: c */
        public final int f55202c;

        /* renamed from: d */
        public final int f55203d;

        /* renamed from: e */
        public final int f55204e;

        static {
            Covode.recordClassIndex(27233);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C23282a)) {
                return false;
            }
            C23282a aVar = (C23282a) obj;
            return this.f55200a == aVar.f55200a && this.f55201b == aVar.f55201b && this.f55202c == aVar.f55202c && this.f55203d == aVar.f55203d && this.f55204e == aVar.f55204e;
        }

        public final int hashCode() {
            return (((((((this.f55200a * 31) + this.f55201b) * 31) + this.f55202c) * 31) + this.f55203d) * 31) + this.f55204e;
        }

        public final String toString() {
            return "TextColor(title=" + this.f55200a + ", destructiveTitle=" + this.f55201b + ", subtitle=" + this.f55202c + ", icon=" + this.f55203d + ", disable=" + this.f55204e + ")";
        }

        public C23282a(int i, int i2, int i3, int i4, int i5) {
            this.f55200a = i;
            this.f55201b = i2;
            this.f55202c = i3;
            this.f55203d = i4;
            this.f55204e = i5;
        }
    }
}
