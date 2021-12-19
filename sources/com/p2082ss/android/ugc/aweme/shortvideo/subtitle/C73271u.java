package com.p2082ss.android.ugc.aweme.shortvideo.subtitle;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.core.content.C0643b;
import androidx.fragment.app.ActivityC0945e;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.bytedance.services.apm.api.C22708a;
import com.facebook.drawee.p1851c.C24202c;
import com.facebook.imagepipeline.p1885j.AbstractC24457f;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.p2730de.C40963b;
import com.p2082ss.android.ugc.aweme.profile.C63423ai;
import com.p2082ss.android.ugc.aweme.property.C65339ai;
import com.p2082ss.android.ugc.aweme.setting.C68076f;
import com.p2082ss.android.ugc.aweme.setting.CaptionConfig;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70968bl;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.aweme.shortvideo.util.C73991bj;
import com.p2082ss.android.ugc.aweme.sticker.data.C75313h;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.aweme.utils.C80493gg;
import com.p2082ss.android.ugc.aweme.utils.C80558hx;
import com.p2082ss.android.ugc.aweme.view.DetectSoftKeyEditText;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.tools.utils.C84913s;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.AbstractC85541q;
import com.p2082ss.android.vesdk.C85581w;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u */
public final class C73271u extends RecyclerView.AbstractC1350a<C73276e> {

    /* renamed from: o */
    public static final C73273b f164537o = new C73273b((byte) 0);

    /* renamed from: a */
    public View f164538a;

    /* renamed from: b */
    public String f164539b = "";

    /* renamed from: c */
    public final ActivityC0945e f164540c;

    /* renamed from: d */
    public final AbstractC31071f f164541d;

    /* renamed from: e */
    public RecyclerView f164542e;

    /* renamed from: f */
    public ArrayList<C75313h> f164543f;

    /* renamed from: g */
    public int f164544g;

    /* renamed from: h */
    public int f164545h;

    /* renamed from: i */
    public int f164546i;

    /* renamed from: j */
    public int f164547j;

    /* renamed from: k */
    public boolean f164548k;

    /* renamed from: l */
    public final CaptionConfig f164549l;

    /* renamed from: m */
    public final C73218h f164550m;

    /* renamed from: n */
    public final VideoPublishEditModel f164551n;

    /* renamed from: p */
    private final C73287p f164552p;

    /* renamed from: q */
    private final C73277f f164553q;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$d */
    public interface AbstractC73275d {
        static {
            Covode.recordClassIndex(85993);
        }

        /* renamed from: a */
        boolean mo115787a();
    }

    static {
        Covode.recordClassIndex(85989);
    }

    /* Return type fixed from 'androidx.recyclerview.widget.RecyclerView$ViewHolder' to match base method */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ C73276e onCreateViewHolder(ViewGroup viewGroup, int i) {
        return m129332a(this, viewGroup, i);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$b */
    public static final class C73273b {
        static {
            Covode.recordClassIndex(85991);
        }

        private C73273b() {
        }

        public /* synthetic */ C73273b(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$f */
    public static final class C73277f extends C24202c<AbstractC24457f> {
        static {
            Covode.recordClassIndex(85995);
        }

        C73277f() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.String, java.lang.Object, android.graphics.drawable.Animatable] */
        @Override // com.facebook.drawee.p1851c.AbstractC24203d, com.facebook.drawee.p1851c.C24202c
        public final /* synthetic */ void onFinalImageSet(String str, AbstractC24457f fVar, Animatable animatable) {
            if (animatable != null) {
                animatable.start();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final int getItemCount() {
        return this.f164543f.size();
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$p */
    public static final class C73287p implements AbstractC85541q {

        /* renamed from: a */
        final /* synthetic */ C73271u f164585a;

        static {
            Covode.recordClassIndex(86005);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$p$a */
        static final class C73288a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C73287p f164586a;

            static {
                Covode.recordClassIndex(86006);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C73288a(C73287p pVar) {
                super(0);
                this.f164586a = pVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f164586a.f164585a.mo115782a();
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73287p(C73271u uVar) {
            this.f164585a = uVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final void onCallback(int i, int i2, float f, String str) {
            if (i == 4098) {
                C80558hx.m139642a(0, new C73288a(this));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$g */
    static final class RunnableC73278g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73271u f164562a;

        /* renamed from: b */
        final /* synthetic */ int f164563b;

        static {
            Covode.recordClassIndex(85996);
        }

        RunnableC73278g(C73271u uVar, int i) {
            this.f164562a = uVar;
            this.f164563b = i;
        }

        public final void run() {
            this.f164562a.f164548k = false;
            this.f164562a.mo115783a(this.f164563b - 1);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$h */
    static final class RunnableC73279h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73271u f164564a;

        /* renamed from: b */
        final /* synthetic */ int f164565b;

        static {
            Covode.recordClassIndex(85997);
        }

        RunnableC73279h(C73271u uVar, int i) {
            this.f164564a = uVar;
            this.f164565b = i;
        }

        public final void run() {
            this.f164564a.f164548k = false;
            this.f164564a.mo115783a(this.f164565b - 1);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$n */
    public static final class RunnableC73285n implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C73271u f164582a;

        /* renamed from: b */
        final /* synthetic */ int f164583b;

        static {
            Covode.recordClassIndex(86003);
        }

        RunnableC73285n(C73271u uVar, int i) {
            this.f164582a = uVar;
            this.f164583b = i;
        }

        public final void run() {
            RecyclerView.ViewHolder viewHolder;
            DetectSoftKeyEditText detectSoftKeyEditText;
            RecyclerView recyclerView = this.f164582a.f164542e;
            C73276e eVar = null;
            if (recyclerView != null) {
                viewHolder = recyclerView.mo4451f(this.f164583b);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C73276e) {
                eVar = viewHolder;
            }
            C73276e eVar2 = eVar;
            if (eVar2 != null && (detectSoftKeyEditText = eVar2.f164558a) != null) {
                detectSoftKeyEditText.requestFocus();
                this.f164582a.f164550m.mo115757a(detectSoftKeyEditText);
            }
        }
    }

    /* renamed from: a */
    public final void mo115782a() {
        RecyclerView.ViewHolder viewHolder;
        int i = this.f164546i;
        if (i >= 0 && i < this.f164543f.size()) {
            RecyclerView recyclerView = this.f164542e;
            C73276e eVar = null;
            if (recyclerView != null) {
                viewHolder = recyclerView.mo4451f(this.f164546i);
            } else {
                viewHolder = null;
            }
            if (viewHolder instanceof C73276e) {
                eVar = viewHolder;
            }
            C73276e eVar2 = eVar;
            if (eVar2 != null) {
                eVar2.f164560c.mo5836d();
                if (this.f164544g == this.f164546i) {
                    eVar2.f164560c.setVisibility(8);
                    eVar2.f164559b.setVisibility(0);
                }
            }
            this.f164546i = -1;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$m */
    public static final class C73284m implements AbstractC73275d {

        /* renamed from: a */
        final /* synthetic */ C73271u f164578a;

        /* renamed from: b */
        final /* synthetic */ C73276e f164579b;

        /* renamed from: c */
        final /* synthetic */ C75313h f164580c;

        /* renamed from: d */
        final /* synthetic */ int f164581d;

        static {
            Covode.recordClassIndex(86002);
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.subtitle.C73271u.AbstractC73275d
        /* renamed from: a */
        public final boolean mo115787a() {
            int selectionStart = this.f164579b.f164558a.getSelectionStart();
            int length = this.f164580c.getText().length();
            if (selectionStart <= 0 || selectionStart >= length) {
                return true;
            }
            C73271u uVar = this.f164578a;
            C75313h hVar = this.f164580c;
            int i = this.f164581d;
            int length2 = hVar.getText().length();
            if (length2 <= selectionStart) {
                return true;
            }
            String text = hVar.getText();
            Objects.requireNonNull(text, "null cannot be cast to non-null type java.lang.String");
            String substring = text.substring(selectionStart, length2);
            C89219l.m154716b(substring, "");
            long endTime = hVar.getEndTime();
            String text2 = hVar.getText();
            Objects.requireNonNull(text2, "null cannot be cast to non-null type java.lang.String");
            String substring2 = text2.substring(0, selectionStart);
            C89219l.m154716b(substring2, "");
            hVar.setText(substring2);
            hVar.setEndTime(hVar.getStartTime() + (((hVar.getEndTime() - hVar.getStartTime()) * ((long) hVar.getText().length())) / ((long) length2)));
            C75313h hVar2 = new C75313h(hVar.getEndTime() + 1, endTime, substring);
            int i2 = i + 1;
            uVar.f164543f.add(i2, hVar2);
            uVar.f164545h = i;
            uVar.f164544g = i2;
            if (C65339ai.m117025a()) {
                uVar.f164547j = 0;
            } else {
                uVar.f164547j = hVar2.getText().length();
            }
            uVar.notifyItemRangeChanged(i, uVar.getItemCount() - i);
            uVar.mo115783a(i2);
            return true;
        }

        C73284m(C73271u uVar, C73276e eVar, C75313h hVar, int i) {
            this.f164578a = uVar;
            this.f164579b = eVar;
            this.f164580c = hVar;
            this.f164581d = i;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$o */
    public static final class C73286o implements DetectSoftKeyEditText.AbstractC81087b {

        /* renamed from: a */
        final /* synthetic */ C73271u f164584a;

        static {
            Covode.recordClassIndex(86004);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C73286o(C73271u uVar) {
            this.f164584a = uVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.view.DetectSoftKeyEditText.AbstractC81087b
        /* renamed from: a */
        public final void mo115797a(int i) {
            if (!this.f164584a.f164548k) {
                this.f164584a.f164547j = i;
            }
        }
    }

    /* renamed from: a */
    public final void mo115783a(int i) {
        RecyclerView recyclerView = this.f164542e;
        if (recyclerView != null) {
            recyclerView.post(new RunnableC73285n(this, i));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        AbstractC31071f fVar = this.f164541d;
        if (fVar != null) {
            fVar.mo56344c(this.f164552p);
        }
        this.f164542e = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C89219l.m154721d(recyclerView, "");
        super.onDetachedFromRecyclerView(recyclerView);
        this.f164542e = null;
        AbstractC31071f fVar = this.f164541d;
        if (fVar != null) {
            fVar.mo56349d(this.f164552p);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onViewRecycled(C73276e eVar) {
        C73276e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        eVar2.f164558a.setOnSelectionChangedListener(null);
        super.onViewRecycled(eVar2);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$k */
    public static final class C73282k implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C73271u f164573a;

        /* renamed from: b */
        final /* synthetic */ C73276e f164574b;

        static {
            Covode.recordClassIndex(86000);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            if (editable != null && this.f164573a.f164545h == -1 && this.f164574b.getAdapterPosition() >= 0 && this.f164574b.getAdapterPosition() < this.f164573a.getItemCount()) {
                this.f164573a.f164543f.get(this.f164574b.getAdapterPosition()).setText(String.valueOf(this.f164574b.f164558a.getText()));
            }
        }

        C73282k(C73271u uVar, C73276e eVar) {
            this.f164573a = uVar;
            this.f164574b = eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$j */
    static final class View$OnClickListenerC73281j implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C73271u f164569a;

        /* renamed from: b */
        final /* synthetic */ int f164570b;

        /* renamed from: c */
        final /* synthetic */ C75313h f164571c;

        /* renamed from: d */
        final /* synthetic */ C73276e f164572d;

        static {
            Covode.recordClassIndex(85999);
        }

        View$OnClickListenerC73281j(C73271u uVar, int i, C75313h hVar, C73276e eVar) {
            this.f164569a = uVar;
            this.f164570b = i;
            this.f164571c = hVar;
            this.f164572d = eVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f164569a.mo115782a();
            this.f164569a.f164546i = this.f164570b;
            AbstractC31071f fVar = this.f164569a.f164541d;
            if (fVar != null) {
                fVar.mo56259a((int) this.f164571c.getStartTime(), (int) this.f164571c.getEndTime(), C85581w.EnumC85608g.EDITOR_TIMERANGE_FLAG_BEFORE_SPEED);
            }
            AbstractC31071f fVar2 = this.f164569a.f164541d;
            if (fVar2 != null) {
                fVar2.mo56388t();
            }
            LottieAnimationView lottieAnimationView = this.f164572d.f164560c;
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.setAnimation("little_audio_wave_anim.json");
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.mo5826a();
            this.f164572d.f164559b.setVisibility(8);
            C39162r.m79460a("preview_subtitle", new C84425b().mo129406a("enter_from", "video_edit_page").mo129406a("shoot_way", this.f164569a.f164551n.mShootWay).mo129406a("creation_id", this.f164569a.f164551n.creationId).mo129406a("content_source", C70968bl.m125262b(this.f164569a.f164551n)).mo129406a("content_type", C70968bl.m125249a(this.f164569a.f164551n)).mo129406a("enter_method", this.f164569a.f164539b).f188764a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$a */
    public final class C73272a extends InputFilter.LengthFilter {

        /* renamed from: b */
        private final int f164555b;

        static {
            Covode.recordClassIndex(85990);
        }

        public C73272a(int i) {
            super(i);
            this.f164555b = i;
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            if (C65339ai.m117025a()) {
                int i5 = this.f164555b;
                if (spanned == null) {
                    C89219l.m154715b();
                }
                if (i2 - i > i5 - (spanned.length() - (i4 - i3))) {
                    new C79459a(C40963b.m82473a()).mo123052a(C40963b.m82473a().getString(R.string.a9n, Integer.valueOf(C73271u.this.f164549l.getWordsPerLine()))).mo123053a();
                }
            }
            return super.filter(charSequence, i, i2, spanned, i3, i4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$c */
    public final class C73274c implements InputFilter {

        /* renamed from: a */
        public final AbstractC73275d f164556a;

        /* renamed from: b */
        final /* synthetic */ C73271u f164557b;

        static {
            Covode.recordClassIndex(85992);
        }

        public C73274c(C73271u uVar, AbstractC73275d dVar) {
            C89219l.m154721d(dVar, "");
            this.f164557b = uVar;
            this.f164556a = dVar;
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            boolean z;
            if ("\n".equals(charSequence) && i == 0 && i2 == 1) {
                this.f164556a.mo115787a();
                return "";
            }
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || spanned == null || spanned.length() == 0) {
                return null;
            }
            Character ch = '\n';
            C89219l.m154721d(charSequence, "");
            if (charSequence.length() == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            } else if (!ch.equals(Character.valueOf(charSequence.charAt(C89361p.m154930f(charSequence)))) || !C89361p.m154926d(spanned.subSequence(i3, i4).toString(), C89361p.m154827k(charSequence))) {
                return null;
            } else {
                this.f164556a.mo115787a();
                return C89361p.m154827k(charSequence);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$i */
    static final class View$OnFocusChangeListenerC73280i implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C73271u f164566a;

        /* renamed from: b */
        final /* synthetic */ int f164567b;

        /* renamed from: c */
        final /* synthetic */ C73276e f164568c;

        static {
            Covode.recordClassIndex(85998);
        }

        View$OnFocusChangeListenerC73280i(C73271u uVar, int i, C73276e eVar) {
            this.f164566a = uVar;
            this.f164567b = i;
            this.f164568c = eVar;
        }

        public final void onFocusChange(View view, boolean z) {
            C73991bj.m130133d("SubtitleEditAdapter onFocusChanged hasFocus ".concat(String.valueOf(z)));
            if (z) {
                this.f164566a.f164544g = this.f164567b;
            }
            this.f164566a.mo115784a(this.f164568c, this.f164567b, z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$e */
    public final class C73276e extends RecyclerView.ViewHolder {

        /* renamed from: a */
        public final DetectSoftKeyEditText f164558a;

        /* renamed from: b */
        public final ImageView f164559b;

        /* renamed from: c */
        public final LottieAnimationView f164560c;

        /* renamed from: d */
        final /* synthetic */ C73271u f164561d;

        static {
            Covode.recordClassIndex(85994);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73276e(C73271u uVar, View view) {
            super(view);
            C89219l.m154721d(view, "");
            this.f164561d = uVar;
            View findViewById = view.findViewById(R.id.eb6);
            C89219l.m154716b(findViewById, "");
            DetectSoftKeyEditText detectSoftKeyEditText = (DetectSoftKeyEditText) findViewById;
            this.f164558a = detectSoftKeyEditText;
            View findViewById2 = view.findViewById(R.id.eb7);
            C89219l.m154716b(findViewById2, "");
            this.f164559b = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.chf);
            C89219l.m154716b(findViewById3, "");
            this.f164560c = (LottieAnimationView) findViewById3;
            detectSoftKeyEditText.setTypeface(C17301b.m32033a().mo27611a(C17303d.f41573g));
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [androidx.recyclerview.widget.RecyclerView$ViewHolder, int] */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1350a
    public final /* synthetic */ void onBindViewHolder(C73276e eVar, int i) {
        boolean z;
        C73276e eVar2 = eVar;
        C89219l.m154721d(eVar2, "");
        eVar2.f164558a.setVisibility(0);
        eVar2.f164558a.setText(this.f164543f.get(i).getText());
        if (this.f164545h == i) {
            this.f164545h = -1;
        }
        eVar2.f164558a.setOnFocusChangeListener(new View$OnFocusChangeListenerC73280i(this, i, eVar2));
        if (this.f164544g == i) {
            z = true;
        } else {
            z = false;
        }
        mo115784a(eVar2, i, z);
        C75313h hVar = this.f164543f.get(i);
        C89219l.m154716b(hVar, "");
        C75313h hVar2 = hVar;
        C84913s.m145936a(eVar2.f164559b, 0.75f);
        eVar2.f164559b.setOnClickListener(new View$OnClickListenerC73281j(this, i, hVar2, eVar2));
        C73284m mVar = new C73284m(this, eVar2, hVar2, i);
        eVar2.f164558a.setFilters(new InputFilter[]{new C73274c(this, mVar), new C73272a(this.f164549l.getWordsPerLine())});
        eVar2.f164558a.addTextChangedListener(new C73282k(this, eVar2));
        eVar2.f164558a.setSoftKeyListener(new View$OnKeyListenerC73283l(this, hVar2, i));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.subtitle.u$l */
    public static final class View$OnKeyListenerC73283l implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C73271u f164575a;

        /* renamed from: b */
        final /* synthetic */ C75313h f164576b;

        /* renamed from: c */
        final /* synthetic */ int f164577c;

        static {
            Covode.recordClassIndex(86001);
        }

        View$OnKeyListenerC73283l(C73271u uVar, C75313h hVar, int i) {
            this.f164575a = uVar;
            this.f164576b = hVar;
            this.f164577c = i;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            int i2;
            if (!(view instanceof EditText)) {
                view = null;
            }
            EditText editText = (EditText) view;
            if (editText != null) {
                i2 = editText.getSelectionStart();
            } else {
                i2 = 0;
            }
            if (keyEvent == null || keyEvent.getKeyCode() != 67 || keyEvent.getAction() != 0 || i2 != 0 || !C65339ai.m117025a()) {
                return false;
            }
            C73271u uVar = this.f164575a;
            C75313h hVar = this.f164576b;
            int i3 = this.f164577c;
            if (i3 != 0) {
                int i4 = i3 - 1;
                if (uVar.f164543f.get(i4).getText().length() + uVar.f164543f.get(i3).getText().length() <= uVar.f164549l.getWordsPerLine()) {
                    uVar.f164543f.get(i4).setEndTime(hVar.getEndTime());
                    int length = uVar.f164543f.get(i4).getText().length();
                    uVar.f164543f.get(i4).setText(uVar.f164543f.get(i4).getText() + hVar.getText());
                    uVar.f164543f.remove(i3);
                    uVar.f164544g = i4;
                    uVar.f164547j = length;
                    uVar.f164548k = true;
                    uVar.notifyItemRangeChanged(i4, (uVar.getItemCount() - i3) + 2);
                    RecyclerView recyclerView = uVar.f164542e;
                    if (recyclerView != null) {
                        recyclerView.post(new RunnableC73278g(uVar, i3));
                    }
                } else if (uVar.f164543f.get(i4).getText().length() == uVar.f164549l.getWordsPerLine()) {
                    new C79459a(C40963b.m82473a()).mo123052a(C40963b.m82473a().getString(R.string.a9n, Integer.valueOf(uVar.f164549l.getWordsPerLine()))).mo123053a();
                } else {
                    int length2 = uVar.f164543f.get(i4).getText().length();
                    int wordsPerLine = uVar.f164549l.getWordsPerLine() - length2;
                    String text = uVar.f164543f.get(i3).getText();
                    Objects.requireNonNull(text, "null cannot be cast to non-null type java.lang.String");
                    String substring = text.substring(0, wordsPerLine);
                    C89219l.m154716b(substring, "");
                    String text2 = uVar.f164543f.get(i3).getText();
                    Objects.requireNonNull(text2, "null cannot be cast to non-null type java.lang.String");
                    String substring2 = text2.substring(wordsPerLine);
                    C89219l.m154716b(substring2, "");
                    long startTime = (long) (((float) uVar.f164543f.get(i3).getStartTime()) + (((((float) (uVar.f164543f.get(i3).getEndTime() - uVar.f164543f.get(i3).getStartTime())) * 1.0f) * ((float) substring.length())) / ((float) uVar.f164543f.get(i3).getText().length())));
                    uVar.f164543f.get(i4).setText(uVar.f164543f.get(i4).getText() + substring);
                    uVar.f164543f.get(i4).setEndTime(startTime);
                    uVar.f164543f.get(i3).setText(substring2);
                    uVar.f164543f.get(i3).setStartTime(startTime + 1);
                    uVar.f164544g = i4;
                    uVar.f164547j = length2;
                    uVar.f164548k = true;
                    uVar.notifyItemRangeChanged(i4, (uVar.getItemCount() - i3) + 1);
                    RecyclerView recyclerView2 = uVar.f164542e;
                    if (recyclerView2 != null) {
                        recyclerView2.post(new RunnableC73279h(uVar, i3));
                    }
                }
            }
            return true;
        }
    }

    /* renamed from: b */
    private final void m129333b(C73276e eVar, int i, boolean z) {
        if (this.f164546i == i) {
            if (z) {
                eVar.f164559b.setVisibility(8);
                eVar.f164560c.setVisibility(0);
                return;
            }
        } else if (z) {
            eVar.f164559b.setVisibility(0);
            eVar.f164560c.setVisibility(8);
            return;
        }
        eVar.f164559b.setVisibility(8);
        eVar.f164560c.setVisibility(8);
    }

    public C73271u(C73218h hVar, VideoPublishEditModel videoPublishEditModel, AbstractC72510a aVar) {
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(videoPublishEditModel, "");
        C89219l.m154721d(aVar, "");
        this.f164550m = hVar;
        this.f164551n = videoPublishEditModel;
        Activity t = hVar.f164451p.mo36486t();
        Objects.requireNonNull(t, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        this.f164540c = (ActivityC0945e) t;
        this.f164541d = aVar.mo114778C().getValue();
        this.f164543f = new ArrayList<>();
        this.f164545h = -1;
        this.f164546i = -1;
        this.f164547j = -1;
        CaptionConfig a = C68076f.m120375a();
        if (a == null) {
            C89219l.m154715b();
        }
        this.f164549l = a;
        this.f164552p = new C73287p(this);
        this.f164553q = new C73277f();
    }

    /* renamed from: a */
    private static RecyclerView.ViewHolder m129332a(C73271u uVar, ViewGroup viewGroup, int i) {
        boolean a;
        MethodCollector.m26663i(11932);
        C89219l.m154721d(viewGroup, "");
        View a2 = C1764a.m5927a(LayoutInflater.from(uVar.f164540c), R.layout.b2f, viewGroup, false);
        C89219l.m154716b(a2, "");
        uVar.f164538a = a2;
        View view = uVar.f164538a;
        if (view == null) {
            C89219l.m154710a("view");
        }
        C73276e eVar = new C73276e(uVar, view);
        try {
            if (eVar.itemView.getParent() != null) {
                try {
                    a = SettingsManager.m29616a().mo25400a("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (a) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("onCreateViewHolder getParent() != null crash hook, holder ").append(eVar.getClass().getName()).append(" parent ").append(viewGroup.getClass().getName()).append(" viewType ").append(i);
                    C22708a.m42800a(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) eVar.itemView.getParent();
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(eVar.itemView);
                    }
                }
            }
        } catch (Exception e) {
            C63423ai.m115002a(e);
            C51423a.m95786a(e);
        }
        C80493gg.f180088a = eVar.getClass().getName();
        MethodCollector.m26664o(11932);
        return eVar;
    }

    /* renamed from: a */
    public final void mo115784a(C73276e eVar, int i, boolean z) {
        int i2 = 0;
        if (!z) {
            eVar.itemView.setBackgroundResource(0);
            eVar.f164558a.setTextColor(C0643b.m2378c(this.f164540c, R.color.ac));
            eVar.f164558a.clearFocus();
        } else {
            eVar.f164558a.requestFocus();
            eVar.f164558a.setTextColor(C0643b.m2378c(this.f164540c, R.color.a9));
            eVar.itemView.setBackgroundColor(C0643b.m2378c(this.f164540c, R.color.a0));
            int i3 = this.f164547j;
            if (i3 >= 0) {
                Editable text = eVar.f164558a.getText();
                if (text != null) {
                    i2 = text.length();
                }
                if (i3 <= i2) {
                    C73991bj.m130133d("SubtitleEditAdapter set bind selection focusIndex " + this.f164544g + " selectIndex " + this.f164547j);
                    eVar.f164558a.setSelection(this.f164547j);
                }
            }
            eVar.f164558a.setOnSelectionChangedListener(new C73286o(this));
            this.f164550m.mo115757a(eVar.f164558a);
        }
        m129333b(eVar, i, z);
    }
}
