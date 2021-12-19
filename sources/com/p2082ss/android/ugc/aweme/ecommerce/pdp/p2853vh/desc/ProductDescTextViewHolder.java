package com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.desc;

import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.C0643b;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44777f;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44784m;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2852d.C44785n;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.C44955i;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescTextViewHolder */
public final class ProductDescTextViewHolder extends AbsFullSpanVH<C44784m> implements AbstractC33974au {

    /* renamed from: g */
    public static final int f104857g = ((int) C13628n.m24520b(C17867d.m33078a(), 11.0f));

    /* renamed from: j */
    public static final int f104858j = ((int) C13628n.m24520b(C17867d.m33078a(), 3.0f));

    /* renamed from: k */
    public static final int f104859k = ((int) C13628n.m24520b(C17867d.m33078a(), 20.0f));

    /* renamed from: l */
    public static final C44942a f104860l = new C44942a((byte) 0);

    /* renamed from: f */
    public final AbstractC89172b<Integer, Object> f104861f;

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.pdp.vh.desc.ProductDescTextViewHolder$a */
    public static final class C44942a {
        static {
            Covode.recordClassIndex(53357);
        }

        private C44942a() {
        }

        public /* synthetic */ C44942a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void cc_() {
        super.cc_();
        View view = this.itemView;
        C89219l.m154716b(view, "");
        C44998a.C44999a.m87685a(view, false);
    }

    static {
        Covode.recordClassIndex(53356);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    /* renamed from: g */
    public final void mo33829g() {
        super.mo33829g();
        if (C89219l.m154714a((Object) ((C44784m) aQ_()).f104489b, (Object) "title")) {
            mo76082a(new C44955i(aQ_(), (byte) 0));
        } else {
            mo76082a((C44955i) null);
        }
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(Object obj) {
        int i;
        C44784m mVar = (C44784m) obj;
        C89219l.m154721d(mVar, "");
        View view = this.itemView;
        C89219l.m154716b(view, "");
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.text);
        String str = mVar.f104489b;
        int hashCode = str.hashCode();
        int i2 = 0;
        if (hashCode != 3735) {
            if (hashCode != 3556653) {
                if (hashCode == 110371416 && str.equals("title")) {
                    Object invoke = this.f104861f.invoke(Integer.valueOf(getAdapterPosition() + 1));
                    tuxTextView.setTuxFont(62);
                    if (!(invoke instanceof C44784m) || !C89219l.m154714a((Object) ((C44784m) invoke).f104489b, (Object) "text")) {
                        View view2 = this.itemView;
                        View view3 = this.itemView;
                        C89219l.m154716b(view3, "");
                        int paddingLeft = view3.getPaddingLeft();
                        int i3 = f104859k;
                        View view4 = this.itemView;
                        C89219l.m154716b(view4, "");
                        view2.setPadding(paddingLeft, i3, view4.getPaddingRight(), f104857g);
                    } else {
                        View view5 = this.itemView;
                        View view6 = this.itemView;
                        C89219l.m154716b(view6, "");
                        int paddingLeft2 = view6.getPaddingLeft();
                        int i4 = f104859k;
                        View view7 = this.itemView;
                        C89219l.m154716b(view7, "");
                        view5.setPadding(paddingLeft2, i4, view7.getPaddingRight(), 0);
                    }
                    View view8 = this.itemView;
                    C89219l.m154716b(view8, "");
                    FrameLayout frameLayout = (FrameLayout) view8.findViewById(R.id.ant);
                    C89219l.m154716b(frameLayout, "");
                    frameLayout.setVisibility(8);
                    tuxTextView.setTextColor(C0643b.m2378c(tuxTextView.getContext(), R.color.c5));
                }
            } else if (str.equals("text")) {
                Object invoke2 = this.f104861f.invoke(Integer.valueOf(getAdapterPosition() + 1));
                Object invoke3 = this.f104861f.invoke(Integer.valueOf(getAdapterPosition() - 1));
                tuxTextView.setTuxFont(61);
                tuxTextView.setTextColor(C0643b.m2378c(tuxTextView.getContext(), R.color.bx));
                int i5 = C45563h.f106109e;
                int i6 = C45563h.f106109e;
                if ((invoke2 instanceof C44784m) && (C89219l.m154714a((Object) ((C44784m) invoke2).f104489b, (Object) "text") || C89219l.m154714a((Object) ((C44784m) invoke2).f104489b, (Object) "title"))) {
                    i6 = 0;
                }
                if (!(invoke3 instanceof C44784m) || !C89219l.m154714a((Object) ((C44784m) invoke3).f104489b, (Object) "text")) {
                    i2 = i5;
                }
                View view9 = this.itemView;
                View view10 = this.itemView;
                C89219l.m154716b(view10, "");
                int paddingLeft3 = view10.getPaddingLeft();
                View view11 = this.itemView;
                C89219l.m154716b(view11, "");
                view9.setPadding(paddingLeft3, i2, view11.getPaddingRight(), i6);
                View view12 = this.itemView;
                C89219l.m154716b(view12, "");
                FrameLayout frameLayout2 = (FrameLayout) view12.findViewById(R.id.ant);
                C89219l.m154716b(frameLayout2, "");
                frameLayout2.setVisibility(8);
            }
        } else if (str.equals("ul")) {
            tuxTextView.setTuxFont(61);
            tuxTextView.setTextColor(C0643b.m2378c(tuxTextView.getContext(), R.color.bx));
            View view13 = this.itemView;
            C89219l.m154716b(view13, "");
            FrameLayout frameLayout3 = (FrameLayout) view13.findViewById(R.id.ant);
            C89219l.m154716b(frameLayout3, "");
            frameLayout3.setVisibility(0);
            Object invoke4 = this.f104861f.invoke(Integer.valueOf(getAdapterPosition() - 1));
            Object invoke5 = this.f104861f.invoke(Integer.valueOf(getAdapterPosition() + 1));
            if ((invoke4 instanceof C44777f) || (invoke4 instanceof C44785n)) {
                i = C45563h.f106109e;
            } else {
                i = 0;
            }
            if ((invoke5 instanceof C44777f) || (invoke5 instanceof C44785n) || invoke5 == null) {
                i2 = C45563h.f106109e;
            }
            View view14 = this.itemView;
            View view15 = this.itemView;
            C89219l.m154716b(view15, "");
            int paddingLeft4 = view15.getPaddingLeft();
            View view16 = this.itemView;
            C89219l.m154716b(view16, "");
            view14.setPadding(paddingLeft4, i, view16.getPaddingRight(), i2);
        }
        View view17 = this.itemView;
        C89219l.m154716b(view17, "");
        TuxTextView tuxTextView2 = (TuxTextView) view17.findViewById(R.id.text);
        C89219l.m154716b(tuxTextView2, "");
        tuxTextView2.setText(mVar.f104488a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: h.f.a.b<? super java.lang.Integer, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ProductDescTextViewHolder(android.view.ViewGroup r5, p4600h.p4611f.p4612a.AbstractC89172b<? super java.lang.Integer, ? extends java.lang.Object> r6) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r3)
            android.content.Context r2 = r5.getContext()
            r1 = 2131559010(0x7f0d0262, float:1.8743352E38)
            r0 = 0
            android.view.View r0 = com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2851c.C44766a.m87492a(r2, r1, r5, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r3)
            r4.<init>(r0)
            r4.f104861f = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.pdp.p2853vh.desc.ProductDescTextViewHolder.<init>(android.view.ViewGroup, h.f.a.b):void");
    }
}
