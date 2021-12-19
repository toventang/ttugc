package com.p2082ss.android.ugc.aweme.editSticker.interact.hit;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.lifecycle.C1213t;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.p2082ss.android.ugc.aweme.editSticker.C45890g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45902g;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45835i;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.C45822a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.AbstractC84922b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.C89378p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.interact.hit.b */
public final class C45906b extends AbstractC22219j {

    /* renamed from: f */
    public static final C45907a f106898f = new C45907a((byte) 0);

    /* renamed from: a */
    AbstractC45835i f106899a;

    /* renamed from: b */
    final C45902g f106900b = new C45902g();

    /* renamed from: c */
    public TextView f106901c;

    /* renamed from: d */
    TextView f106902d;

    /* renamed from: e */
    final float f106903e = 8.0f;

    /* renamed from: g */
    private StickerHintTextViewModel f106904g;

    static {
        Covode.recordClassIndex(54431);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.interact.hit.b$a */
    public static final class C45907a {
        static {
            Covode.recordClassIndex(54432);
        }

        private C45907a() {
        }

        public /* synthetic */ C45907a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.interact.hit.b$b */
    public static final class RunnableC45908b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ TextView f106905a;

        static {
            Covode.recordClassIndex(54433);
        }

        RunnableC45908b(TextView textView) {
            this.f106905a = textView;
        }

        public final void run() {
            TextView textView = this.f106905a;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.interact.hit.b$e */
    public static final class C45911e implements AbstractC45835i.AbstractC45836a {

        /* renamed from: a */
        final /* synthetic */ C45906b f106908a;

        static {
            Covode.recordClassIndex(54436);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45835i.AbstractC45836a
        /* renamed from: a */
        public final void mo77187a() {
            TextView textView = this.f106908a.f106901c;
            if (textView == null) {
                C89219l.m154715b();
            }
            textView.setVisibility(0);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45835i.AbstractC45836a
        /* renamed from: b */
        public final void mo77188b() {
            C45906b.m88580a(this.f106908a.f106901c, 3000);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45911e(C45906b bVar) {
            this.f106908a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.interact.hit.b$c */
    static final class C45909c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C45906b f106906a;

        static {
            Covode.recordClassIndex(54434);
        }

        C45909c(C45906b bVar) {
            this.f106906a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C45906b bVar = this.f106906a;
            TextView textView = bVar.f106901c;
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = bVar.f106902d;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: e */
    public final void mo36416e(Bundle bundle) {
        super.mo36416e(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(StickerHintTextViewModel.class);
        C89219l.m154716b(a, "");
        this.f106904g = (StickerHintTextViewModel) a;
    }

    /* renamed from: a */
    public final void mo77290a(C89378p<Integer, Integer> pVar) {
        Integer first;
        if (pVar != null && (first = pVar.getFirst()) != null) {
            int intValue = first.intValue();
            View view = this.f52550n;
            C89219l.m154716b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.width = intValue;
            View view2 = this.f52550n;
            C89219l.m154716b(view2, "");
            marginLayoutParams.setMarginStart((C70636dh.m124831b(view2.getContext()) - intValue) / 2);
            View view3 = this.f52550n;
            C89219l.m154716b(view3, "");
            view3.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.interact.hit.b$d */
    static final class C45910d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C45906b f106907a;

        static {
            Covode.recordClassIndex(54435);
        }

        C45910d(C45906b bVar) {
            this.f106907a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            float f;
            AbstractC84922b bVar;
            ViewGroup.LayoutParams layoutParams;
            C45905a aVar = (C45905a) obj;
            if (aVar != null) {
                C45906b bVar2 = this.f106907a;
                float f2 = aVar.f106894a;
                float f3 = aVar.f106895b;
                int i = aVar.f106896c;
                int i2 = aVar.f106897d;
                if (bVar2.f106901c != null) {
                    switch (i2) {
                        case 0:
                            if (bVar2.f106900b.mo77279a()) {
                                return;
                            }
                            break;
                        case 1:
                            if (bVar2.f106900b.mo77282c()) {
                                return;
                            }
                            break;
                        case 2:
                            if (bVar2.f106900b.mo77283d()) {
                                return;
                            }
                            break;
                        case 3:
                            if (bVar2.f106900b.mo77284e()) {
                                return;
                            }
                            break;
                        case 4:
                            if (bVar2.f106900b.mo77279a()) {
                                return;
                            }
                            break;
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            break;
                        default:
                            return;
                    }
                    if (i2 == 6) {
                        TextView textView = bVar2.f106902d;
                        if (textView != null) {
                            textView.setText(i);
                            Context context = textView.getContext();
                            C89219l.m154716b(context, "");
                            float a = C84912r.m145930a(context, bVar2.f106903e);
                            TextView textView2 = bVar2.f106902d;
                            if (textView2 != null) {
                                layoutParams = textView2.getLayoutParams();
                            } else {
                                layoutParams = null;
                            }
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            if (marginLayoutParams != null) {
                                marginLayoutParams.topMargin = (int) (f3 + a);
                            }
                            TextView textView3 = bVar2.f106902d;
                            if (textView3 != null) {
                                textView3.setLayoutParams(marginLayoutParams);
                            }
                            textView.setVisibility(0);
                            C45906b.m88580a(bVar2.f106902d, 5000);
                            return;
                        }
                        return;
                    }
                    TextView textView4 = bVar2.f106901c;
                    if (textView4 == null) {
                        C89219l.m154715b();
                    }
                    textView4.setText(i);
                    TextView textView5 = bVar2.f106901c;
                    if (textView5 == null) {
                        C89219l.m154715b();
                    }
                    TextView textView6 = bVar2.f106901c;
                    if (textView6 == null) {
                        C89219l.m154715b();
                    }
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C70636dh.m124831b(textView6.getContext()), Integer.MIN_VALUE);
                    TextView textView7 = bVar2.f106901c;
                    if (textView7 == null) {
                        C89219l.m154715b();
                    }
                    textView5.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(C70636dh.m124828a(textView7.getContext()), Integer.MIN_VALUE));
                    if (i2 == 4 && (bVar = C45890g.f106878a) != null && bVar.mo59454e()) {
                        TextView textView8 = bVar2.f106901c;
                        if (textView8 == null) {
                            C89219l.m154715b();
                        }
                        Context context2 = textView8.getContext();
                        C89219l.m154716b(context2, "");
                        f = C84912r.m145930a(context2, 18.0f);
                    } else {
                        f = 0.0f;
                    }
                    TextView textView9 = bVar2.f106901c;
                    if (textView9 == null) {
                        C89219l.m154715b();
                    }
                    if (C84912r.m145932a(textView9)) {
                        TextView textView10 = bVar2.f106901c;
                        if (textView10 == null) {
                            C89219l.m154715b();
                        }
                        f2 = ((float) C70636dh.m124831b(textView10.getContext())) - f2;
                    }
                    TextView textView11 = bVar2.f106901c;
                    if (textView11 == null) {
                        C89219l.m154715b();
                    }
                    if (f2 - (((float) textView11.getMeasuredWidth()) / 2.0f) >= 0.0f) {
                        TextView textView12 = bVar2.f106901c;
                        TextView textView13 = bVar2.f106901c;
                        if (textView13 == null) {
                            C89219l.m154715b();
                        }
                        float measuredWidth = f2 - (((float) textView13.getMeasuredWidth()) / 2.0f);
                        TextView textView14 = bVar2.f106901c;
                        if (textView14 == null) {
                            C89219l.m154715b();
                        }
                        C45906b.m88579a(textView12, measuredWidth, (f3 - ((float) textView14.getMeasuredHeight())) + f);
                    } else {
                        TextView textView15 = bVar2.f106901c;
                        TextView textView16 = bVar2.f106901c;
                        if (textView16 == null) {
                            C89219l.m154715b();
                        }
                        C45906b.m88579a(textView15, 0.0f, (f3 - ((float) textView16.getMeasuredHeight())) + f);
                    }
                    AbstractC45835i iVar = bVar2.f106899a;
                    if (iVar != null) {
                        TextView textView17 = bVar2.f106901c;
                        if (textView17 == null) {
                            C89219l.m154715b();
                        }
                        iVar.mo77168a(textView17, new C45911e(bVar2));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m88580a(TextView textView, long j) {
        if (textView != null) {
            textView.postDelayed(new RunnableC45908b(textView), j);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.zg, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        TextPaint paint;
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        this.f106901c = (TextView) mo36474b(R.id.f4i);
        this.f106902d = (TextView) mo36474b(R.id.f4k);
        TextView textView = this.f106901c;
        if (textView == null) {
            C89219l.m154715b();
        }
        Context context = textView.getContext();
        C89219l.m154716b(context, "");
        this.f106899a = new C45822a(context);
        TextView textView2 = this.f106901c;
        if (!(textView2 == null || (paint = textView2.getPaint()) == null)) {
            paint.setFakeBoldText(true);
        }
        StickerHintTextViewModel stickerHintTextViewModel = this.f106904g;
        if (stickerHintTextViewModel == null) {
            C89219l.m154710a("stickerHintTextViewModel");
        }
        C1213t<Boolean> a = stickerHintTextViewModel.mo77288a();
        if (a != null) {
            a.observe(this, new C45909c(this));
        }
        StickerHintTextViewModel stickerHintTextViewModel2 = this.f106904g;
        if (stickerHintTextViewModel2 == null) {
            C89219l.m154710a("stickerHintTextViewModel");
        }
        C1213t<C45905a> b = stickerHintTextViewModel2.mo77289b();
        if (b != null) {
            b.observe(this, new C45910d(this));
        }
    }

    /* renamed from: a */
    static void m88579a(TextView textView, float f, float f2) {
        ViewGroup.LayoutParams layoutParams;
        if (textView != null) {
            layoutParams = textView.getLayoutParams();
        } else {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = (int) f;
        }
        int i = Build.VERSION.SDK_INT;
        if (marginLayoutParams != null) {
            marginLayoutParams.setMarginStart((int) f);
            marginLayoutParams.topMargin = (int) f2;
        }
        if (textView != null) {
            textView.setLayoutParams(marginLayoutParams);
        }
    }
}
