package com.bytedance.tux.table.cell;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.RotateAnimation;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.AbstractC23176a;
import com.bytedance.tux.input.TuxCheckBox;
import com.bytedance.tux.input.TuxRadio;
import com.bytedance.tux.input.TuxSwitch;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1706a.p1707a.C22971a;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.bytedance.tux.table.cell.AbstractC23283a;
import com.bytedance.tux.table.p1726a.C23275a;
import com.bytedance.tux.widget.ExpandableLayout;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.bytedance.tux.table.cell.c */
public interface AbstractC23293c {
    static {
        Covode.recordClassIndex(27244);
    }

    /* renamed from: com.bytedance.tux.table.cell.c$c */
    public static final class C23297c extends AbstractC23296b {

        /* renamed from: c */
        public final TuxButton f55220c;

        static {
            Covode.recordClassIndex(27248);
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: c */
        public final boolean mo37951c() {
            return false;
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC23283a mo37947a() {
            return AbstractC23283a.C23284a.f55206b;
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: b */
        public final View mo37949b() {
            return this.f55220c;
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: f */
        public final void mo37954f() {
            TuxButton tuxButton = this.f55220c;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            C23163i.m43668b(tuxButton, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 12.0f, system.getDisplayMetrics()))), null, null, false, 29);
        }

        public /* synthetic */ C23297c(Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public final void mo37955a(CharSequence charSequence) {
            this.f55220c.setText(charSequence);
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: a */
        public final void mo37948a(boolean z) {
            super.mo37948a(z);
            this.f55220c.setLoading(z);
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: b */
        public final void mo37950b(boolean z) {
            super.mo37950b(z);
            this.f55220c.setEnabled(z);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23297c(Context context, AttributeSet attributeSet) {
            super(context);
            C89219l.m154719c(context, "");
            TuxButton tuxButton = new TuxButton(context, null, 0, 6);
            this.f55220c = tuxButton;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g5, R.attr.g6, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.aok, R.attr.aol, R.attr.aom, R.attr.aon, R.attr.aop, R.attr.ap6, R.attr.apr, R.attr.aqo, R.attr.ar5, R.attr.aro}, R.attr.cc, 0);
            C89219l.m154709a((Object) obtainStyledAttributes, "");
            int i = obtainStyledAttributes.getInt(19, Integer.MIN_VALUE);
            int i2 = obtainStyledAttributes.getInt(17, Integer.MIN_VALUE);
            String string = obtainStyledAttributes.getString(18);
            obtainStyledAttributes.recycle();
            tuxButton.setButtonVariant(i);
            tuxButton.setButtonSize(i2);
            mo37955a(string);
        }
    }

    /* renamed from: com.bytedance.tux.table.cell.c$d */
    public static final class C23298d extends AbstractC23299e {
        static {
            Covode.recordClassIndex(27249);
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC23283a mo37947a() {
            return AbstractC23283a.C23285b.f55207b;
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: f */
        public final void mo37954f() {
            View view = this.f55221c.f55215b;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            C23163i.m43668b(view, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 14.0f, system.getDisplayMetrics()))), null, null, false, 29);
        }

        public /* synthetic */ C23298d(Context context) {
            this(context, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23298d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C89219l.m154719c(context, "");
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23299e
        /* renamed from: a */
        public final CompoundButton mo37956a(Context context, AttributeSet attributeSet) {
            C89219l.m154719c(context, "");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g5, R.attr.g6, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.aok, R.attr.aol, R.attr.aom, R.attr.aon, R.attr.aop, R.attr.ap6, R.attr.apr, R.attr.aqo, R.attr.ar5, R.attr.aro}, R.attr.cc, 0);
            C89219l.m154709a((Object) obtainStyledAttributes, "");
            int i = obtainStyledAttributes.getInt(21, 0);
            obtainStyledAttributes.recycle();
            TuxCheckBox tuxCheckBox = new TuxCheckBox(context, null, 0, 6);
            tuxCheckBox.setShape(i);
            return tuxCheckBox;
        }
    }

    /* renamed from: com.bytedance.tux.table.cell.c$f */
    public static final class C23302f extends AbstractC23296b {

        /* renamed from: c */
        public final C23275a f55228c;

        /* renamed from: d */
        private final int f55229d;

        /* renamed from: e */
        private final int f55230e;

        static {
            Covode.recordClassIndex(27253);
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC23283a mo37947a() {
            return AbstractC23283a.C23287d.f55208b;
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: b */
        public final View mo37949b() {
            return this.f55228c;
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: d */
        public final int mo37952d() {
            if (!this.f55228c.getWithIcon$tux_release()) {
                return 0;
            }
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            return C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics()));
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: f */
        public final void mo37954f() {
            int a;
            C23275a aVar = this.f55228c;
            if (aVar.getCustomView$tux_release() == null) {
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                a = C89241a.m154730a(TypedValue.applyDimension(1, 17.0f, system.getDisplayMetrics()));
            } else {
                Resources system2 = Resources.getSystem();
                C89219l.m154709a((Object) system2, "");
                a = C89241a.m154730a(TypedValue.applyDimension(1, 15.0f, system2.getDisplayMetrics()));
            }
            C23163i.m43668b(aVar, null, Integer.valueOf(a), null, null, false, 29);
        }

        public /* synthetic */ C23302f(Context context) {
            this(context, null);
        }

        /* renamed from: a */
        public final void mo37964a(CharSequence charSequence) {
            this.f55228c.setLabel(charSequence);
        }

        /* renamed from: a */
        public final void mo37962a(View.OnClickListener onClickListener) {
            C89219l.m154719c(onClickListener, "");
            this.f55228c.setOnClickListener(onClickListener);
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: b */
        public final void mo37950b(boolean z) {
            int i;
            int i2;
            super.mo37950b(z);
            C23275a aVar = this.f55228c;
            if (z) {
                i = this.f55229d;
            } else {
                i = this.f55230e;
            }
            aVar.setTextColor(i);
            C23275a aVar2 = this.f55228c;
            if (z) {
                i2 = this.f55229d;
            } else {
                i2 = this.f55230e;
            }
            aVar2.setIconColor(i2);
        }

        /* renamed from: a */
        public final void mo37963a(View view, boolean z) {
            int i;
            C23275a aVar = this.f55228c;
            if (aVar.f55180a != null) {
                aVar.removeView(aVar.f55180a);
            }
            int i2 = 0;
            if (view != null) {
                aVar.addView(view, 0);
            }
            aVar.f55180a = view;
            TuxTextView tuxTextView = (TuxTextView) aVar.mo37908a(R.id.c2l);
            C89219l.m154709a((Object) tuxTextView, "");
            if (view == null) {
                i = 0;
            } else {
                i = 8;
            }
            tuxTextView.setVisibility(i);
            TuxIconView tuxIconView = (TuxIconView) aVar.mo37908a(R.id.icon_iv);
            C89219l.m154709a((Object) tuxIconView, "");
            if (view != null && !z) {
                i2 = 8;
            }
            tuxIconView.setVisibility(i2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23302f(Context context, AttributeSet attributeSet) {
            super(context);
            C89219l.m154719c(context, "");
            C23275a aVar = new C23275a(context, (byte) 0);
            this.f55228c = aVar;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g5, R.attr.g6, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.aok, R.attr.aol, R.attr.aom, R.attr.aon, R.attr.aop, R.attr.ap6, R.attr.apr, R.attr.aqo, R.attr.ar5, R.attr.aro}, R.attr.cc, 0);
            C89219l.m154709a((Object) obtainStyledAttributes, "");
            int color = obtainStyledAttributes.getColor(6, 0);
            this.f55229d = color;
            this.f55230e = obtainStyledAttributes.getColor(13, 0);
            int resourceId = obtainStyledAttributes.getResourceId(2, 0);
            mo37964a(obtainStyledAttributes.getString(23));
            int i = obtainStyledAttributes.getInt(7, 0);
            obtainStyledAttributes.recycle();
            aVar.setFont(i);
            aVar.setTextColor(color);
            aVar.setIconRes(resourceId);
            aVar.setIconColor(color);
        }
    }

    /* renamed from: com.bytedance.tux.table.cell.c$g */
    public static final class C23303g extends AbstractC23296b {

        /* renamed from: c */
        final TuxIconView f55231c;

        /* renamed from: d */
        public boolean f55232d;

        /* renamed from: e */
        public final View f55233e = null;

        /* renamed from: f */
        private final AbstractC89244h f55234f;

        /* renamed from: g */
        private final AbstractC89244h f55235g;

        static {
            Covode.recordClassIndex(27254);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public final RotateAnimation mo37965g() {
            return (RotateAnimation) this.f55234f.getValue();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public final RotateAnimation mo37966h() {
            return (RotateAnimation) this.f55235g.getValue();
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC23283a mo37947a() {
            return AbstractC23283a.C23288e.f55209b;
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: b */
        public final View mo37949b() {
            return this.f55231c;
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: e */
        public final void mo37953e() {
            mo37965g().cancel();
            mo37966h().cancel();
        }

        /* renamed from: com.bytedance.tux.table.cell.c$g$a */
        static final class C23305a extends AbstractC89220m implements AbstractC89171a<RotateAnimation> {

            /* renamed from: a */
            public static final C23305a f55237a = new C23305a();

            static {
                Covode.recordClassIndex(27256);
            }

            C23305a() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ RotateAnimation invoke() {
                RotateAnimation rotateAnimation = new RotateAnimation(180.0f, 0.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(200);
                rotateAnimation.setFillAfter(true);
                rotateAnimation.setInterpolator(C22971a.m43307c());
                return rotateAnimation;
            }
        }

        /* renamed from: com.bytedance.tux.table.cell.c$g$b */
        static final class C23306b extends AbstractC89220m implements AbstractC89171a<RotateAnimation> {

            /* renamed from: a */
            public static final C23306b f55238a = new C23306b();

            static {
                Covode.recordClassIndex(27257);
            }

            C23306b() {
                super(0);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ RotateAnimation invoke() {
                RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 180.0f, 1, 0.5f, 1, 0.5f);
                rotateAnimation.setDuration(200);
                rotateAnimation.setFillAfter(true);
                rotateAnimation.setInterpolator(C22971a.m43307c());
                return rotateAnimation;
            }
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: f */
        public final void mo37954f() {
            TuxIconView tuxIconView = this.f55231c;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            C23163i.m43668b(tuxIconView, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 18.0f, system.getDisplayMetrics()))), null, null, false, 29);
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: b */
        public final void mo37950b(boolean z) {
            super.mo37950b(z);
            this.f55231c.setEnabled(z);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23303g(Context context, AttributeSet attributeSet) {
            super(context);
            C89219l.m154719c(context, "");
            TuxIconView tuxIconView = new TuxIconView(context, null, 0, 6);
            this.f55231c = tuxIconView;
            this.f55234f = C89250i.m154773a((AbstractC89171a) C23306b.f55238a);
            this.f55235g = C89250i.m154773a((AbstractC89171a) C23305a.f55237a);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g5, R.attr.g6, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.aok, R.attr.aol, R.attr.aom, R.attr.aon, R.attr.aop, R.attr.ap6, R.attr.apr, R.attr.aqo, R.attr.ar5, R.attr.aro}, R.attr.cc, 0);
            C89219l.m154709a((Object) obtainStyledAttributes, "");
            int color = obtainStyledAttributes.getColor(4, 0);
            int resourceId = obtainStyledAttributes.getResourceId(3, 0);
            obtainStyledAttributes.recycle();
            tuxIconView.setIconRes(resourceId);
            tuxIconView.setTintColor(color);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            tuxIconView.setIconWidth(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            tuxIconView.setIconHeight(C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system2.getDisplayMetrics())));
            tuxIconView.setOnClickListener(new View.OnClickListener(this) {
                /* class com.bytedance.tux.table.cell.AbstractC23293c.C23303g.View$OnClickListenerC233041 */

                /* renamed from: a */
                final /* synthetic */ C23303g f55236a;

                static {
                    Covode.recordClassIndex(27255);
                }

                {
                    this.f55236a = r1;
                }

                public final void onClick(View view) {
                    ViewParent parent;
                    ViewParent parent2;
                    C89219l.m154709a((Object) view, "");
                    if (view.isEnabled()) {
                        if (this.f55236a.f55232d) {
                            C23303g gVar = this.f55236a;
                            gVar.f55232d = false;
                            View view2 = gVar.f55233e;
                            if (view2 == null || (parent2 = view2.getParent()) == null) {
                                throw new C89388w("null cannot be cast to non-null type");
                            }
                            ExpandableLayout expandableLayout = (ExpandableLayout) parent2;
                            expandableLayout.f55383b.reverse();
                            expandableLayout.f55385d = true;
                            gVar.f55231c.startAnimation(gVar.mo37966h());
                            return;
                        }
                        C23303g gVar2 = this.f55236a;
                        gVar2.f55232d = true;
                        View view3 = gVar2.f55233e;
                        if (view3 == null || (parent = view3.getParent()) == null) {
                            throw new C89388w("null cannot be cast to non-null type");
                        }
                        ExpandableLayout expandableLayout2 = (ExpandableLayout) parent;
                        expandableLayout2.f55383b.start();
                        expandableLayout2.f55385d = false;
                        gVar2.f55231c.startAnimation(gVar2.mo37965g());
                    }
                }
            });
        }
    }

    /* renamed from: com.bytedance.tux.table.cell.c$h */
    public static final class C23307h extends AbstractC23296b {

        /* renamed from: c */
        private final TuxTextView f55239c;

        /* renamed from: d */
        private final int f55240d;

        /* renamed from: e */
        private final int f55241e;

        static {
            Covode.recordClassIndex(27258);
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: c */
        public final boolean mo37951c() {
            return false;
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC23283a mo37947a() {
            return AbstractC23283a.C23289f.f55210b;
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: b */
        public final View mo37949b() {
            return this.f55239c;
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: f */
        public final void mo37954f() {
            TuxTextView tuxTextView = this.f55239c;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            C23163i.m43668b(tuxTextView, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 17.0f, system.getDisplayMetrics()))), null, null, false, 29);
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: b */
        public final void mo37950b(boolean z) {
            int i;
            super.mo37950b(z);
            TuxTextView tuxTextView = this.f55239c;
            if (z) {
                i = this.f55240d;
            } else {
                i = this.f55241e;
            }
            tuxTextView.setTextColor(i);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23307h(Context context, AttributeSet attributeSet) {
            super(context);
            C89219l.m154719c(context, "");
            TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
            this.f55239c = tuxTextView;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g5, R.attr.g6, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.aok, R.attr.aol, R.attr.aom, R.attr.aon, R.attr.aop, R.attr.ap6, R.attr.apr, R.attr.aqo, R.attr.ar5, R.attr.aro}, R.attr.cc, 0);
            C89219l.m154709a((Object) obtainStyledAttributes, "");
            int i = obtainStyledAttributes.getInt(7, 0);
            int color = obtainStyledAttributes.getColor(6, 0);
            this.f55240d = color;
            this.f55241e = obtainStyledAttributes.getColor(13, 0);
            tuxTextView.setText(obtainStyledAttributes.getString(23));
            obtainStyledAttributes.recycle();
            tuxTextView.setTuxFont(i);
            tuxTextView.setTextColor(color);
            tuxTextView.setMaxLines(1);
            tuxTextView.setSingleLine();
            tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    /* renamed from: com.bytedance.tux.table.cell.c$i */
    public static final class C23308i extends AbstractC23299e {
        static {
            Covode.recordClassIndex(27259);
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC23283a mo37947a() {
            return AbstractC23283a.C23290g.f55211b;
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: f */
        public final void mo37954f() {
            View view = this.f55221c.f55215b;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            C23163i.m43668b(view, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 14.0f, system.getDisplayMetrics()))), null, null, false, 29);
        }

        public /* synthetic */ C23308i(Context context) {
            this(context, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23308i(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C89219l.m154719c(context, "");
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23299e
        /* renamed from: a */
        public final CompoundButton mo37956a(Context context, AttributeSet attributeSet) {
            C89219l.m154719c(context, "");
            return new TuxRadio(context, null, 0, 6);
        }
    }

    /* renamed from: com.bytedance.tux.table.cell.c$j */
    public static final class C23309j extends AbstractC23299e {
        static {
            Covode.recordClassIndex(27260);
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ AbstractC23283a mo37947a() {
            return AbstractC23283a.C23291h.f55212b;
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: f */
        public final void mo37954f() {
            View view = this.f55221c.f55215b;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            C23163i.m43668b(view, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 13.5f, system.getDisplayMetrics()))), null, null, false, 29);
        }

        public /* synthetic */ C23309j(Context context) {
            this(context, null);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23309j(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C89219l.m154719c(context, "");
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23299e
        /* renamed from: a */
        public final CompoundButton mo37956a(Context context, AttributeSet attributeSet) {
            C89219l.m154719c(context, "");
            return new TuxSwitch(context, null, 0, 6);
        }
    }

    /* renamed from: com.bytedance.tux.table.cell.c$e */
    public static abstract class AbstractC23299e extends AbstractC23296b {

        /* renamed from: c */
        public final C23294a<CompoundButton> f55221c;

        /* renamed from: d */
        public AbstractC89171a<Boolean> f55222d;

        static {
            Covode.recordClassIndex(27250);
        }

        /* renamed from: a */
        public abstract CompoundButton mo37956a(Context context, AttributeSet attributeSet);

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: b */
        public final View mo37949b() {
            return this.f55221c.f55215b;
        }

        /* renamed from: g */
        public final boolean mo37960g() {
            return ((CompoundButton) this.f55221c.f55214a).isChecked();
        }

        /* renamed from: a */
        public final void mo37957a(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
            ((CompoundButton) this.f55221c.f55214a).setOnClickListener(new View$OnClickListenerC23301a(this, onCheckedChangeListener));
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: b */
        public final void mo37950b(boolean z) {
            super.mo37950b(z);
            ((CompoundButton) this.f55221c.f55214a).setEnabled(z);
        }

        /* renamed from: c */
        public final void mo37959c(boolean z) {
            ((CompoundButton) this.f55221c.f55214a).setChecked(z);
        }

        /* renamed from: com.bytedance.tux.table.cell.c$e$a */
        static final class View$OnClickListenerC23301a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ AbstractC23299e f55226a;

            /* renamed from: b */
            final /* synthetic */ CompoundButton.OnCheckedChangeListener f55227b;

            static {
                Covode.recordClassIndex(27252);
            }

            View$OnClickListenerC23301a(AbstractC23299e eVar, CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
                this.f55226a = eVar;
                this.f55227b = onCheckedChangeListener;
            }

            public final void onClick(View view) {
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f55227b;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged((CompoundButton) this.f55226a.f55221c.f55214a, this.f55226a.mo37960g());
                }
            }
        }

        /* renamed from: a */
        public final void mo37958a(AbstractC89171a<Boolean> aVar) {
            CompoundButton compoundButton = (CompoundButton) this.f55221c.f55214a;
            if (compoundButton instanceof AbstractC23176a) {
                ((AbstractC23176a) compoundButton).setInterceptToggleListener(aVar);
            }
            this.f55222d = aVar;
        }

        @Override // com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23296b
        /* renamed from: a */
        public final void mo37948a(boolean z) {
            int i;
            super.mo37948a(z);
            C23294a<CompoundButton> aVar = this.f55221c;
            T t = aVar.f55214a;
            int i2 = 0;
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            t.setVisibility(i);
            TuxSpinner tuxSpinner = aVar.f55216c;
            if (!z) {
                i2 = 8;
            }
            tuxSpinner.setVisibility(i2);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public AbstractC23299e(final Context context, final AttributeSet attributeSet) {
            super(context);
            C89219l.m154719c(context, "");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g5, R.attr.g6, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.aok, R.attr.aol, R.attr.aom, R.attr.aon, R.attr.aop, R.attr.ap6, R.attr.apr, R.attr.aqo, R.attr.ar5, R.attr.aro}, R.attr.cc, 0);
            C89219l.m154709a((Object) obtainStyledAttributes, "");
            boolean z = obtainStyledAttributes.getBoolean(1, false);
            obtainStyledAttributes.recycle();
            this.f55221c = new C23294a<>(context, attributeSet, new AbstractC89171a<CompoundButton>(this) {
                /* class com.bytedance.tux.table.cell.AbstractC23293c.AbstractC23299e.C233001 */

                /* renamed from: a */
                final /* synthetic */ AbstractC23299e f55223a;

                static {
                    Covode.recordClassIndex(27251);
                }

                {
                    this.f55223a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ CompoundButton invoke() {
                    return this.f55223a.mo37956a(context, attributeSet);
                }
            });
            mo37959c(z);
        }
    }

    /* renamed from: com.bytedance.tux.table.cell.c$b */
    public static abstract class AbstractC23296b {

        /* renamed from: a */
        public AbstractC89171a<C89391z> f55218a;

        /* renamed from: b */
        public final Context f55219b;

        static {
            Covode.recordClassIndex(27247);
        }

        /* renamed from: a */
        public abstract AbstractC23283a mo37947a();

        /* renamed from: a */
        public void mo37948a(boolean z) {
        }

        /* renamed from: b */
        public abstract View mo37949b();

        /* renamed from: b */
        public void mo37950b(boolean z) {
        }

        /* renamed from: c */
        public boolean mo37951c() {
            return true;
        }

        /* renamed from: d */
        public int mo37952d() {
            return 0;
        }

        /* renamed from: e */
        public void mo37953e() {
        }

        /* renamed from: f */
        public abstract void mo37954f();

        public AbstractC23296b(Context context) {
            C89219l.m154719c(context, "");
            this.f55219b = context;
        }
    }

    /* renamed from: com.bytedance.tux.table.cell.c$a */
    public static final class C23294a<T extends View> {

        /* renamed from: a */
        public final T f55214a;

        /* renamed from: b */
        public final View f55215b;

        /* renamed from: c */
        final TuxSpinner f55216c;

        static {
            Covode.recordClassIndex(27245);
        }

        public C23294a(Context context, AttributeSet attributeSet, AbstractC89171a<? extends T> aVar) {
            C89219l.m154719c(context, "");
            C89219l.m154719c(aVar, "");
            MethodCollector.m26663i(7346);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842766, 16843014, R.attr.g5, R.attr.g6, R.attr.g7, R.attr.g8, R.attr.g9, R.attr.g_, R.attr.ga, R.attr.gb, R.attr.gc, R.attr.gd, R.attr.ge, R.attr.gf, R.attr.gg, R.attr.gh, R.attr.gi, R.attr.aok, R.attr.aol, R.attr.aom, R.attr.aon, R.attr.aop, R.attr.ap6, R.attr.apr, R.attr.aqo, R.attr.ar5, R.attr.aro}, R.attr.cc, 0);
            C89219l.m154709a((Object) obtainStyledAttributes, "");
            int resourceId = obtainStyledAttributes.getResourceId(8, 0);
            int color = obtainStyledAttributes.getColor(9, 0);
            obtainStyledAttributes.recycle();
            FrameLayout frameLayout = new FrameLayout(context);
            this.f55215b = frameLayout;
            T t = (T) ((View) aVar.invoke());
            this.f55214a = t;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            t.setLayoutParams(layoutParams);
            TuxSpinner tuxSpinner = new TuxSpinner(context, null, 0, 6);
            this.f55216c = tuxSpinner;
            tuxSpinner.mo37899a(resourceId, color);
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            int a = C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(a, C89241a.m154730a(TypedValue.applyDimension(1, 24.0f, system2.getDisplayMetrics())));
            layoutParams2.gravity = 17;
            tuxSpinner.setLayoutParams(layoutParams2);
            frameLayout.addView(t);
            frameLayout.addView(tuxSpinner);
            frameLayout.setOnClickListener(new View.OnClickListener(this) {
                /* class com.bytedance.tux.table.cell.AbstractC23293c.C23294a.View$OnClickListenerC232951 */

                /* renamed from: a */
                final /* synthetic */ C23294a f55217a;

                static {
                    Covode.recordClassIndex(27246);
                }

                {
                    this.f55217a = r1;
                }

                public final void onClick(View view) {
                    this.f55217a.f55214a.performClick();
                }
            });
            tuxSpinner.setVisibility(8);
            MethodCollector.m26664o(7346);
        }
    }
}
