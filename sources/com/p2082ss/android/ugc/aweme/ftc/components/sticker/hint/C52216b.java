package com.p2082ss.android.ugc.aweme.ftc.components.sticker.hint;

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
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.editSticker.C45890g;
import com.p2082ss.android.ugc.aweme.editSticker.interact.C45902g;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45835i;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.C45822a;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.tools.view.AbstractC84922b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.hint.b */
public final class C52216b extends AbstractC22219j {

    /* renamed from: d */
    public static final C52217a f120275d = new C52217a((byte) 0);

    /* renamed from: a */
    AbstractC45835i f120276a;

    /* renamed from: b */
    final C45902g f120277b = new C45902g();

    /* renamed from: c */
    public TextView f120278c;

    /* renamed from: e */
    private FTCStickerHintTextViewModel f120279e;

    static {
        Covode.recordClassIndex(61600);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.hint.b$a */
    public static final class C52217a {
        static {
            Covode.recordClassIndex(61601);
        }

        private C52217a() {
        }

        public /* synthetic */ C52217a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.hint.b$b */
    static final class RunnableC52218b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C52216b f120280a;

        static {
            Covode.recordClassIndex(61602);
        }

        RunnableC52218b(C52216b bVar) {
            this.f120280a = bVar;
        }

        public final void run() {
            TextView textView = this.f120280a.f120278c;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.hint.b$e */
    public static final class C52221e implements AbstractC45835i.AbstractC45836a {

        /* renamed from: a */
        final /* synthetic */ C52216b f120283a;

        static {
            Covode.recordClassIndex(61605);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45835i.AbstractC45836a
        /* renamed from: a */
        public final void mo77187a() {
            TextView textView = this.f120283a.f120278c;
            if (textView == null) {
                C89219l.m154715b();
            }
            textView.setVisibility(0);
        }

        @Override // com.p2082ss.android.ugc.aweme.editSticker.p2877a.AbstractC45835i.AbstractC45836a
        /* renamed from: b */
        public final void mo77188b() {
            C52216b bVar = this.f120283a;
            TextView textView = bVar.f120278c;
            if (textView != null) {
                textView.postDelayed(new RunnableC52218b(bVar), 3000);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C52221e(C52216b bVar) {
            this.f120283a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.hint.b$c */
    static final class C52219c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52216b f120281a;

        static {
            Covode.recordClassIndex(61603);
        }

        C52219c(C52216b bVar) {
            this.f120281a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            TextView textView = this.f120281a.f120278c;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.components.sticker.hint.b$d */
    static final class C52220d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C52216b f120282a;

        static {
            Covode.recordClassIndex(61604);
        }

        C52220d(C52216b bVar) {
            this.f120282a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            float f;
            AbstractC84922b bVar;
            C52215a aVar = (C52215a) obj;
            if (aVar != null) {
                C52216b bVar2 = this.f120282a;
                float f2 = aVar.f120271a;
                float f3 = aVar.f120272b;
                int i = aVar.f120273c;
                int i2 = aVar.f120274d;
                if (bVar2.f120278c != null) {
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    if (i2 != 4 || bVar2.f120277b.mo77279a()) {
                                        return;
                                    }
                                } else if (bVar2.f120277b.mo77284e()) {
                                    return;
                                }
                            } else if (bVar2.f120277b.mo77283d()) {
                                return;
                            }
                        } else if (bVar2.f120277b.mo77282c()) {
                            return;
                        }
                    } else if (bVar2.f120277b.mo77279a()) {
                        return;
                    }
                    TextView textView = bVar2.f120278c;
                    if (textView == null) {
                        C89219l.m154715b();
                    }
                    textView.setText(i);
                    TextView textView2 = bVar2.f120278c;
                    if (textView2 == null) {
                        C89219l.m154715b();
                    }
                    TextView textView3 = bVar2.f120278c;
                    if (textView3 == null) {
                        C89219l.m154715b();
                    }
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(C70636dh.m124831b(textView3.getContext()), Integer.MIN_VALUE);
                    TextView textView4 = bVar2.f120278c;
                    if (textView4 == null) {
                        C89219l.m154715b();
                    }
                    textView2.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(C70636dh.m124828a(textView4.getContext()), Integer.MIN_VALUE));
                    if (i2 == 4 && (bVar = C45890g.f106878a) != null && bVar.mo59454e()) {
                        TextView textView5 = bVar2.f120278c;
                        if (textView5 == null) {
                            C89219l.m154715b();
                        }
                        Context context = textView5.getContext();
                        C89219l.m154716b(context, "");
                        f = C84912r.m145930a(context, 18.0f);
                    } else {
                        f = 0.0f;
                    }
                    TextView textView6 = bVar2.f120278c;
                    if (textView6 == null) {
                        C89219l.m154715b();
                    }
                    if (C84912r.m145932a(textView6)) {
                        TextView textView7 = bVar2.f120278c;
                        if (textView7 == null) {
                            C89219l.m154715b();
                        }
                        f2 = ((float) C70636dh.m124831b(textView7.getContext())) - f2;
                    }
                    TextView textView8 = bVar2.f120278c;
                    if (textView8 == null) {
                        C89219l.m154715b();
                    }
                    if (f2 - (((float) textView8.getMeasuredWidth()) / 2.0f) >= 0.0f) {
                        TextView textView9 = bVar2.f120278c;
                        if (textView9 == null) {
                            C89219l.m154715b();
                        }
                        float measuredWidth = f2 - (((float) textView9.getMeasuredWidth()) / 2.0f);
                        TextView textView10 = bVar2.f120278c;
                        if (textView10 == null) {
                            C89219l.m154715b();
                        }
                        bVar2.mo87922a(measuredWidth, (f3 - ((float) textView10.getMeasuredHeight())) + f);
                    } else {
                        TextView textView11 = bVar2.f120278c;
                        if (textView11 == null) {
                            C89219l.m154715b();
                        }
                        bVar2.mo87922a(0.0f, (f3 - ((float) textView11.getMeasuredHeight())) + f);
                    }
                    AbstractC45835i iVar = bVar2.f120276a;
                    if (iVar != null) {
                        TextView textView12 = bVar2.f120278c;
                        if (textView12 == null) {
                            C89219l.m154715b();
                        }
                        iVar.mo77168a(textView12, new C52221e(bVar2));
                    }
                }
            }
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.at1, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo87922a(float f, float f2) {
        ViewGroup.LayoutParams layoutParams;
        TextView textView = this.f120278c;
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
        TextView textView2 = this.f120278c;
        if (textView2 != null) {
            textView2.setLayoutParams(marginLayoutParams);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        TextPaint paint;
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(FTCStickerHintTextViewModel.class);
        C89219l.m154716b(a, "");
        this.f120279e = (FTCStickerHintTextViewModel) a;
        this.f120278c = (TextView) mo36474b(R.id.f4i);
        TextView textView = this.f120278c;
        if (textView == null) {
            C89219l.m154715b();
        }
        Context context = textView.getContext();
        C89219l.m154716b(context, "");
        this.f120276a = new C45822a(context);
        TextView textView2 = this.f120278c;
        if (!(textView2 == null || (paint = textView2.getPaint()) == null)) {
            paint.setFakeBoldText(true);
        }
        FTCStickerHintTextViewModel fTCStickerHintTextViewModel = this.f120279e;
        if (fTCStickerHintTextViewModel == null) {
            C89219l.m154710a("stickerHintTextViewModel");
        }
        fTCStickerHintTextViewModel.mo87920a().observe(this, new C52219c(this));
        FTCStickerHintTextViewModel fTCStickerHintTextViewModel2 = this.f120279e;
        if (fTCStickerHintTextViewModel2 == null) {
            C89219l.m154710a("stickerHintTextViewModel");
        }
        fTCStickerHintTextViewModel2.mo87921b().observe(this, new C52220d(this));
    }
}
