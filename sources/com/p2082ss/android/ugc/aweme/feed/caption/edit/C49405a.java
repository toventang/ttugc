package com.p2082ss.android.ugc.aweme.feed.caption.edit;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.ies.ugc.appcontext.C17867d;
import com.bytedance.services.apm.api.C22708a;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.a */
public final class C49405a extends RecyclerView.AbstractC1350a<C49407b> {

    /* renamed from: a */
    public int f113533a = -1;

    /* renamed from: b */
    public View f113534b;

    /* renamed from: c */
    public View f113535c;

    /* renamed from: d */
    public int f113536d = -1;

    /* renamed from: e */
    boolean f113537e;

    /* renamed from: f */
    public final EditCaptionViewModel f113538f;

    /* renamed from: g */
    public final AbstractC49406a f113539g;

    /* renamed from: h */
    private RecyclerView f113540h;

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.a$a */
    public interface AbstractC49406a {
        static {
            Covode.recordClassIndex(58218);
        }

        /* renamed from: a */
        void mo81013a(int i);

        /* renamed from: b */
        void mo81016b(int i);
    }

    static {
        Covode.recordClassIndex(58217);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C49407b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m92481a(this, viewGroup, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        List<CaptionData> srcSubtitleItem;
        EditCaptionItem editCaptionItem = this.f113538f.f113451a;
        if (editCaptionItem == null || (srcSubtitleItem = editCaptionItem.getSrcSubtitleItem()) == null) {
            return 0;
        }
        return srcSubtitleItem.size();
    }

    /* renamed from: a */
    public final void mo81031a() {
        RecyclerView.ViewHolder f;
        View view = this.f113535c;
        if (view != null) {
            KeyboardUtils.m70897c(view);
            view.clearFocus();
        }
        RecyclerView recyclerView = this.f113540h;
        if (recyclerView != null && (f = recyclerView.mo4451f(this.f113536d)) != null) {
            Objects.requireNonNull(f, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionAdapter.SubtitleViewHolder");
            C49407b bVar = (C49407b) f;
            bVar.f113544d.mo5837e();
            bVar.f113544d.setVisibility(8);
            bVar.f113545e.setVisibility(8);
            bVar.f113546f.setVisibility(8);
            bVar.f113547g.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo81033b() {
        RecyclerView.ViewHolder f;
        RecyclerView recyclerView = this.f113540h;
        if (recyclerView != null && (f = recyclerView.mo4451f(this.f113536d)) != null) {
            Objects.requireNonNull(f, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionAdapter.SubtitleViewHolder");
            C49407b bVar = (C49407b) f;
            if (bVar.f113544d.getVisibility() == 0) {
                bVar.f113544d.mo5837e();
                bVar.f113544d.setVisibility(8);
                bVar.f113545e.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.a$e */
    static final class View$OnClickListenerC49410e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49405a f113556a;

        /* renamed from: b */
        final /* synthetic */ int f113557b;

        /* renamed from: c */
        final /* synthetic */ C49407b f113558c;

        static {
            Covode.recordClassIndex(58222);
        }

        View$OnClickListenerC49410e(C49405a aVar, int i, C49407b bVar) {
            this.f113556a = aVar;
            this.f113557b = i;
            this.f113558c = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113556a.f113539g.mo81013a(this.f113557b);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        this.f113540h = recyclerView;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.a$h */
    static final class View$OnClickListenerC49413h implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49405a f113565a;

        /* renamed from: b */
        final /* synthetic */ int f113566b;

        /* renamed from: c */
        final /* synthetic */ C49407b f113567c;

        static {
            Covode.recordClassIndex(58225);
        }

        View$OnClickListenerC49413h(C49405a aVar, int i, C49407b bVar) {
            this.f113565a = aVar;
            this.f113566b = i;
            this.f113567c = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            Editable text = this.f113567c.f113542b.getText();
            if (text != null) {
                text.clear();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.a$c */
    public static final class C49408c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ EditCaptionItem f113549a;

        /* renamed from: b */
        final /* synthetic */ C49405a f113550b;

        /* renamed from: c */
        final /* synthetic */ int f113551c;

        /* renamed from: d */
        final /* synthetic */ C49407b f113552d;

        static {
            Covode.recordClassIndex(58220);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            CaptionData captionData;
            List<CaptionData> transSubtitleItem = this.f113549a.getTransSubtitleItem();
            if (transSubtitleItem != null && (captionData = transSubtitleItem.get(this.f113551c)) != null) {
                captionData.setText(String.valueOf(this.f113552d.f113542b.getText()));
            }
        }

        C49408c(EditCaptionItem editCaptionItem, C49405a aVar, int i, C49407b bVar) {
            this.f113549a = editCaptionItem;
            this.f113550b = aVar;
            this.f113551c = i;
            this.f113552d = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.a$d */
    static final class View$OnClickListenerC49409d implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49405a f113553a;

        /* renamed from: b */
        final /* synthetic */ int f113554b;

        /* renamed from: c */
        final /* synthetic */ C49407b f113555c;

        static {
            Covode.recordClassIndex(58221);
        }

        View$OnClickListenerC49409d(C49405a aVar, int i, C49407b bVar) {
            this.f113553a = aVar;
            this.f113554b = i;
            this.f113555c = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113553a.f113539g.mo81013a(this.f113554b);
            this.f113555c.f113542b.requestFocus();
            Editable text = this.f113555c.f113542b.getText();
            if (text != null) {
                this.f113555c.f113542b.setSelection(text.toString().length());
            }
            KeyboardUtils.m70894a(this.f113555c.f113542b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.a$g */
    static final class View$OnClickListenerC49412g implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49405a f113562a;

        /* renamed from: b */
        final /* synthetic */ int f113563b;

        /* renamed from: c */
        final /* synthetic */ C49407b f113564c;

        static {
            Covode.recordClassIndex(58224);
        }

        View$OnClickListenerC49412g(C49405a aVar, int i, C49407b bVar) {
            this.f113562a = aVar;
            this.f113563b = i;
            this.f113564c = bVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113564c.f113545e.setVisibility(8);
            this.f113564c.f113544d.setVisibility(0);
            this.f113564c.f113544d.mo5826a();
            this.f113562a.f113539g.mo81016b(this.f113563b);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewAttachedToWindow(C49407b bVar) {
        C49407b bVar2 = bVar;
        C89219l.m154721d(bVar2, "");
        super.onViewAttachedToWindow(bVar2);
        if (this.f113537e && String.valueOf(bVar2.f113542b.getText()).length() == 0) {
            bVar2.f113542b.requestFocus();
            KeyboardUtils.m70894a(bVar2.f113542b);
            this.f113537e = false;
        }
    }

    /* renamed from: a */
    public final void mo81032a(int i) {
        RecyclerView.ViewHolder f;
        RecyclerView.ViewHolder f2;
        if (i != -1 && i != this.f113533a) {
            mo81031a();
            int i2 = this.f113533a;
            this.f113533a = i;
            RecyclerView recyclerView = this.f113540h;
            if (!(recyclerView == null || (f2 = recyclerView.mo4451f(i2)) == null)) {
                Objects.requireNonNull(f2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionAdapter.SubtitleViewHolder");
                C49407b bVar = (C49407b) f2;
                bVar.f113542b.setTextColor(C17867d.m33078a().getResources().getColor(R.color.ac));
                bVar.f113541a.setTextColor(C17867d.m33078a().getResources().getColor(R.color.ad));
                bVar.f113543c.setBackgroundColor(C17867d.m33078a().getResources().getColor(R.color.ur));
                bVar.f113544d.mo5837e();
                bVar.f113544d.setVisibility(8);
                bVar.f113545e.setVisibility(8);
                bVar.f113546f.setVisibility(8);
                bVar.f113547g.setVisibility(8);
            }
            RecyclerView recyclerView2 = this.f113540h;
            if (recyclerView2 != null && (f = recyclerView2.mo4451f(i)) != null) {
                Objects.requireNonNull(f, "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.caption.edit.EditCaptionAdapter.SubtitleViewHolder");
                C49407b bVar2 = (C49407b) f;
                bVar2.f113542b.setTextColor(C17867d.m33078a().getResources().getColor(R.color.a9));
                bVar2.f113541a.setTextColor(C17867d.m33078a().getResources().getColor(R.color.ac));
                bVar2.f113543c.setBackgroundColor(C17867d.m33078a().getResources().getColor(R.color.a0));
                bVar2.f113546f.setVisibility(0);
            }
        }
    }

    public C49405a(EditCaptionViewModel editCaptionViewModel, AbstractC49406a aVar) {
        C89219l.m154721d(editCaptionViewModel, "");
        C89219l.m154721d(aVar, "");
        this.f113538f = editCaptionViewModel;
        this.f113539g = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.a$b */
    public final class C49407b extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final TextView f113541a;

        /* renamed from: b */
        public final DetectSoftKeyEditText f113542b;

        /* renamed from: c */
        public final LinearLayout f113543c;

        /* renamed from: d */
        public final LottieAnimationView f113544d;

        /* renamed from: e */
        public final ImageView f113545e;

        /* renamed from: f */
        public final ImageView f113546f;

        /* renamed from: g */
        public final ImageView f113547g;

        /* renamed from: h */
        final /* synthetic */ C49405a f113548h;

        static {
            Covode.recordClassIndex(58219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C49407b(C49405a aVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f113548h = aVar;
            View findViewById = view.findViewById(R.id.e5q);
            C89219l.m154716b(findViewById, "");
            this.f113541a = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.ash);
            C89219l.m154716b(findViewById2, "");
            this.f113542b = (DetectSoftKeyEditText) findViewById2;
            View findViewById3 = view.findViewById(R.id.brr);
            C89219l.m154716b(findViewById3, "");
            this.f113543c = (LinearLayout) findViewById3;
            View findViewById4 = view.findViewById(R.id.chf);
            C89219l.m154716b(findViewById4, "");
            this.f113544d = (LottieAnimationView) findViewById4;
            View findViewById5 = view.findViewById(R.id.ene);
            C89219l.m154716b(findViewById5, "");
            this.f113545e = (ImageView) findViewById5;
            View findViewById6 = view.findViewById(R.id.d07);
            C89219l.m154716b(findViewById6, "");
            this.f113546f = (ImageView) findViewById6;
            View findViewById7 = view.findViewById(R.id.a6f);
            C89219l.m154716b(findViewById7, "");
            this.f113547g = (ImageView) findViewById7;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.caption.edit.a$f */
    static final class View$OnFocusChangeListenerC49411f implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C49405a f113559a;

        /* renamed from: b */
        final /* synthetic */ int f113560b;

        /* renamed from: c */
        final /* synthetic */ C49407b f113561c;

        static {
            Covode.recordClassIndex(58223);
        }

        View$OnFocusChangeListenerC49411f(C49405a aVar, int i, C49407b bVar) {
            this.f113559a = aVar;
            this.f113560b = i;
            this.f113561c = bVar;
        }

        public final void onFocusChange(View view, boolean z) {
            if (z) {
                this.f113559a.f113539g.mo81013a(this.f113560b);
                this.f113559a.f113535c = view;
                this.f113559a.f113536d = this.f113560b;
                this.f113561c.f113546f.setVisibility(8);
                this.f113561c.f113547g.setVisibility(0);
                this.f113561c.f113545e.setVisibility(0);
                KeyboardUtils.m70894a(this.f113561c.f113542b);
                return;
            }
            this.f113561c.f113547g.setVisibility(8);
            this.f113561c.f113545e.setVisibility(8);
            this.f113561c.f113544d.setVisibility(8);
            this.f113561c.f113544d.mo5837e();
            KeyboardUtils.m70897c(this.f113561c.f113542b);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C49407b bVar, int i) {
        boolean z;
        String str;
        CaptionData captionData;
        String text;
        CaptionData captionData2;
        C49407b bVar2 = bVar;
        String str2 = "";
        C89219l.m154721d(bVar2, str2);
        EditCaptionItem editCaptionItem = this.f113538f.f113451a;
        if (editCaptionItem != null) {
            if (this.f113533a == i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                bVar2.f113542b.setTextColor(C17867d.m33078a().getResources().getColor(R.color.a9));
                bVar2.f113541a.setTextColor(C17867d.m33078a().getResources().getColor(R.color.ac));
                bVar2.f113543c.setBackgroundColor(C17867d.m33078a().getResources().getColor(R.color.a0));
            } else {
                bVar2.f113542b.setTextColor(C17867d.m33078a().getResources().getColor(R.color.ac));
                bVar2.f113541a.setTextColor(C17867d.m33078a().getResources().getColor(R.color.ad));
                bVar2.f113543c.setBackgroundColor(C17867d.m33078a().getResources().getColor(R.color.ur));
            }
            bVar2.f113541a.setVisibility(0);
            bVar2.f113542b.setVisibility(0);
            bVar2.f113542b.setFontType(C17303d.f41568b);
            TextView textView = bVar2.f113541a;
            List<CaptionData> srcSubtitleItem = editCaptionItem.getSrcSubtitleItem();
            if (srcSubtitleItem == null || (captionData2 = srcSubtitleItem.get(i)) == null || (str = captionData2.getText()) == null) {
                str = str2;
            }
            textView.setText(str);
            DetectSoftKeyEditText detectSoftKeyEditText = bVar2.f113542b;
            List<CaptionData> transSubtitleItem = editCaptionItem.getTransSubtitleItem();
            if (!(transSubtitleItem == null || (captionData = transSubtitleItem.get(i)) == null || (text = captionData.getText()) == null)) {
                str2 = text;
            }
            detectSoftKeyEditText.setText(str2);
            bVar2.f113542b.addTextChangedListener(new C49408c(editCaptionItem, this, i, bVar2));
            bVar2.setIsRecyclable(false);
            LottieAnimationView lottieAnimationView = bVar2.f113544d;
            lottieAnimationView.setAnimation("little_audio_wave_anim.json");
            lottieAnimationView.setRepeatCount(-1);
            bVar2.f113543c.setOnClickListener(new View$OnClickListenerC49409d(this, i, bVar2));
            bVar2.f113542b.setOnClickListener(new View$OnClickListenerC49410e(this, i, bVar2));
            bVar2.f113542b.setOnFocusChangeListener(new View$OnFocusChangeListenerC49411f(this, i, bVar2));
            bVar2.f113545e.setOnClickListener(new View$OnClickListenerC49412g(this, i, bVar2));
            bVar2.f113547g.setOnClickListener(new View$OnClickListenerC49413h(this, i, bVar2));
        }
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m92481a(C49405a aVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(4647);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(viewGroup.getContext()), R.layout.ry, viewGroup, false);
        C89219l.m154716b(a2, "");
        aVar.f113534b = a2;
        View view = aVar.f113534b;
        if (view == null) {
            C89219l.m154710a("contentView");
        }
        C49407b bVar = new C49407b(aVar, view);
        try {
            if (bVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(bVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) bVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(bVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = bVar.getClass().getName();
        MethodCollector.m26664o(4647);
        return bVar;
    }
}
