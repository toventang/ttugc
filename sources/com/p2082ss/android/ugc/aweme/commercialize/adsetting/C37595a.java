package com.p2082ss.android.ugc.aweme.commercialize.adsetting;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.trill.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.adsetting.a */
public final class C37595a extends AbstractC37603b {

    /* renamed from: f */
    public static final C37597b f88878f = new C37597b((byte) 0);

    /* renamed from: a */
    public String f88879a = "";

    /* renamed from: b */
    public AbstractC37596a f88880b;

    /* renamed from: c */
    public long f88881c = 30;

    /* renamed from: d */
    public long f88882d;

    /* renamed from: e */
    public long f88883e;

    /* renamed from: g */
    private HashMap f88884g;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.adsetting.a$a */
    public interface AbstractC37596a {
        static {
            Covode.recordClassIndex(45014);
        }

        /* renamed from: a */
        void mo65505a();

        /* renamed from: a */
        void mo65506a(long j, long j2);
    }

    static {
        Covode.recordClassIndex(45013);
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.adsetting.AbstractC37603b
    /* renamed from: a */
    public final View mo65503a(int i) {
        if (this.f88884g == null) {
            this.f88884g = new HashMap();
        }
        View view = (View) this.f88884g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f88884g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.commercialize.adsetting.AbstractC37603b
    /* renamed from: a */
    public final void mo65504a() {
        HashMap hashMap = this.f88884g;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.commercialize.adsetting.AbstractC37603b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo65504a();
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.adsetting.a$b */
    public static final class C37597b {
        static {
            Covode.recordClassIndex(45015);
        }

        private C37597b() {
        }

        public /* synthetic */ C37597b(byte b) {
            this();
        }

        /* renamed from: a */
        public static C37595a m75858a(String str, AbstractC37596a aVar, long j, long j2) {
            C37595a aVar2 = new C37595a();
            aVar2.f88879a = str;
            aVar2.f88880b = aVar;
            aVar2.f88882d = j;
            aVar2.f88883e = j2;
            return aVar2;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.adsetting.a$d */
    static final class View$OnClickListenerC37599d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37595a f88886a;

        static {
            Covode.recordClassIndex(45017);
        }

        View$OnClickListenerC37599d(C37595a aVar) {
            this.f88886a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            AbstractC37596a aVar = this.f88886a.f88880b;
            if (aVar != null) {
                aVar.mo65505a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.adsetting.a$g */
    static final class View$OnClickListenerC37602g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37595a f88890a;

        static {
            Covode.recordClassIndex(45020);
        }

        View$OnClickListenerC37602g(C37595a aVar) {
            this.f88890a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f88890a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.adsetting.a$c */
    static final class View$OnClickListenerC37598c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37595a f88885a;

        static {
            Covode.recordClassIndex(45016);
        }

        View$OnClickListenerC37598c(C37595a aVar) {
            this.f88885a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            long j = this.f88885a.f88881c * 24 * 60 * 60;
            AbstractC37596a aVar = this.f88885a.f88880b;
            if (aVar != null) {
                aVar.mo65506a(this.f88885a.f88882d, j);
            }
            this.f88885a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.adsetting.a$e */
    static final class View$OnClickListenerC37600e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C37595a f88887a;

        static {
            Covode.recordClassIndex(45018);
        }

        View$OnClickListenerC37600e(C37595a aVar) {
            this.f88887a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            long j = (this.f88887a.f88881c * 24 * 60 * 60) + currentTimeMillis;
            AbstractC37596a aVar = this.f88887a.f88880b;
            if (aVar != null) {
                aVar.mo65506a(currentTimeMillis, j);
            }
            this.f88887a.dismiss();
        }
    }

    /* renamed from: a */
    private static void m75853a(View view, int i) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i;
            view.setLayoutParams(marginLayoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.adsetting.a$f */
    static final class C37601f implements RadioGroup.OnCheckedChangeListener {

        /* renamed from: a */
        final /* synthetic */ C37595a f88888a;

        /* renamed from: b */
        final /* synthetic */ SimpleDateFormat f88889b;

        static {
            Covode.recordClassIndex(45019);
        }

        C37601f(C37595a aVar, SimpleDateFormat simpleDateFormat) {
            this.f88888a = aVar;
            this.f88889b = simpleDateFormat;
        }

        public final void onCheckedChanged(RadioGroup radioGroup, int i) {
            long j;
            C37595a aVar = this.f88888a;
            if (i == R.id.den) {
                j = 7;
            } else if (i == R.id.del) {
                j = 30;
            } else if (i == R.id.dem) {
                j = 60;
            } else {
                j = 0;
            }
            aVar.f88881c = j;
            if (this.f88888a.f88882d != 0) {
                TuxTextView tuxTextView = (TuxTextView) this.f88888a.mo65503a(R.id.f01);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setText(this.f88888a.getResources().getString(R.string.wd) + ":\n" + this.f88889b.format(Long.valueOf(this.f88888a.f88882d * 1000)) + " - " + this.f88889b.format(new Date((this.f88888a.f88883e + (this.f88888a.f88881c * 24 * 60 * 60)) * 1000)));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.commercialize.adsetting.AbstractC37603b
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        TuxTextView tuxTextView = (TuxTextView) mo65503a(R.id.f63);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(this.f88879a);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault());
        if (this.f88882d != 0) {
            TuxTextView tuxTextView2 = (TuxTextView) mo65503a(R.id.f01);
            C89219l.m154716b(tuxTextView2, "");
            tuxTextView2.setVisibility(0);
            long j = this.f88883e + (this.f88881c * 24 * 60 * 60);
            TuxTextView tuxTextView3 = (TuxTextView) mo65503a(R.id.f01);
            C89219l.m154716b(tuxTextView3, "");
            tuxTextView3.setText(getResources().getString(R.string.wd) + ":\n" + simpleDateFormat.format(Long.valueOf(this.f88882d * 1000)) + " - " + simpleDateFormat.format(new Date(j * 1000)));
            ((TuxTextView) mo65503a(R.id.esk)).setOnClickListener(new View$OnClickListenerC37598c(this));
            ((TuxTextView) mo65503a(R.id.es0)).setOnClickListener(new View$OnClickListenerC37599d(this));
            TuxTextView tuxTextView4 = (TuxTextView) mo65503a(R.id.esk);
            C89219l.m154716b(tuxTextView4, "");
            tuxTextView4.setText(getResources().getString(R.string.eyy));
            TuxTextView tuxTextView5 = (TuxTextView) mo65503a(R.id.es0);
            C89219l.m154716b(tuxTextView5, "");
            tuxTextView5.setText(getResources().getString(R.string.fns));
            TuxTextView tuxTextView6 = (TuxTextView) mo65503a(R.id.es0);
            C89219l.m154716b(tuxTextView6, "");
            ((TuxTextView) mo65503a(R.id.es0)).setTextColor(C0643b.m2378c(tuxTextView6.getContext(), R.color.bh));
            TuxTextView tuxTextView7 = (TuxTextView) mo65503a(R.id.es0);
            C89219l.m154716b(tuxTextView7, "");
            tuxTextView7.setGravity(17);
            TuxTextView tuxTextView8 = (TuxTextView) mo65503a(R.id.esk);
            C89219l.m154716b(tuxTextView8, "");
            m75853a(tuxTextView8, C34728n.m70946a(6.0d));
            TuxTextView tuxTextView9 = (TuxTextView) mo65503a(R.id.es0);
            C89219l.m154716b(tuxTextView9, "");
            m75853a(tuxTextView9, C34728n.m70946a(12.0d));
        } else {
            TuxTextView tuxTextView10 = (TuxTextView) mo65503a(R.id.f01);
            C89219l.m154716b(tuxTextView10, "");
            tuxTextView10.setVisibility(8);
            ((TuxTextView) mo65503a(R.id.esk)).setOnClickListener(new View$OnClickListenerC37600e(this));
            TuxTextView tuxTextView11 = (TuxTextView) mo65503a(R.id.esk);
            C89219l.m154716b(tuxTextView11, "");
            tuxTextView11.setText(getResources().getString(R.string.vx));
            TuxTextView tuxTextView12 = (TuxTextView) mo65503a(R.id.es0);
            C89219l.m154716b(tuxTextView12, "");
            tuxTextView12.setText(getResources().getString(R.string.b62));
            TuxTextView tuxTextView13 = (TuxTextView) mo65503a(R.id.es0);
            C89219l.m154716b(tuxTextView13, "");
            ((TuxTextView) mo65503a(R.id.es0)).setTextColor(C0643b.m2378c(tuxTextView13.getContext(), R.color.c5));
            TuxTextView tuxTextView14 = (TuxTextView) mo65503a(R.id.es0);
            C89219l.m154716b(tuxTextView14, "");
            tuxTextView14.setGravity(8388611);
            TuxTextView tuxTextView15 = (TuxTextView) mo65503a(R.id.esk);
            C89219l.m154716b(tuxTextView15, "");
            m75853a(tuxTextView15, C34728n.m70946a(16.0d));
            TuxTextView tuxTextView16 = (TuxTextView) mo65503a(R.id.es0);
            C89219l.m154716b(tuxTextView16, "");
            m75853a(tuxTextView16, C34728n.m70946a(16.0d));
        }
        ((RadioGroup) mo65503a(R.id.djx)).setOnCheckedChangeListener(new C37601f(this, simpleDateFormat));
        ((ImageView) view.findViewById(R.id.bu5)).setOnClickListener(new View$OnClickListenerC37602g(this));
    }
}
