package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.C0643b;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.editSticker.C45849b;
import com.p2082ss.android.ugc.aweme.editSticker.p2883f.C45886d;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46104o;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46105p;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.C46110t;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InnerEffectTextLayoutConfig;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.InteractTextStructWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.p2082ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.p2082ss.android.ugc.aweme.editSticker.text.p2885a.C45989b;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46220g;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i;
import com.p2082ss.android.ugc.aweme.editSticker.text.view.TextStickerEditText;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.tools.utils.KeyboardUtils;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.EffectTextStickerInputLayout */
public final class EffectTextStickerInputLayout extends C46224i {

    /* renamed from: N */
    private final RelativeLayout f107382N;

    /* renamed from: O */
    private final ScrollView f107383O;

    /* renamed from: P */
    private final FrameLayout f107384P;

    /* renamed from: Q */
    private InnerEffectTextLayoutConfig f107385Q;

    /* renamed from: a */
    public float f107386a;

    /* renamed from: b */
    public float f107387b;

    /* renamed from: c */
    public final int f107388c;

    /* renamed from: d */
    public C46104o f107389d = new C46104o();

    /* renamed from: e */
    public final C46192u f107390e;

    /* renamed from: f */
    public final C46161n f107391f;

    static {
        Covode.recordClassIndex(54684);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i
    public final void setData(TextStickerData textStickerData) {
    }

    public final InnerEffectTextLayoutConfig getInnerLayoutConfig() {
        return this.f107385Q;
    }

    public final C46104o getScaleInfo() {
        return this.f107389d;
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i
    /* renamed from: b */
    public final void mo78324b() {
        if (this.f107684G) {
            AppCompatEditText focusableEditText = this.f107391f.getFocusableEditText();
            if (focusableEditText != null) {
                KeyboardUtils.m145809b(focusableEditText, getContext());
                return;
            }
            return;
        }
        KeyboardUtils.m145809b(this.f107701h, getContext());
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i
    /* renamed from: c */
    public final void mo78325c() {
        if (this.f107684G) {
            AppCompatEditText focusableEditText = this.f107391f.getFocusableEditText();
            if (focusableEditText != null) {
                KeyboardUtils.m145810c(focusableEditText, getContext());
            }
        } else {
            KeyboardUtils.m145810c(this.f107701h, getContext());
        }
        this.f107391f.setEditable(false);
        C45886d.m88529a((EditText) this.f107701h, false);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i
    public final List<TextStickerTextWrap> getTextWrapList() {
        if (this.f107684G) {
            C46161n nVar = this.f107391f;
            ArrayList arrayList = new ArrayList();
            if (nVar == null) {
                return arrayList;
            }
            Iterator<T> it = nVar.getEditTextList().iterator();
            while (it.hasNext()) {
                arrayList.add(C46110t.m88958a(it.next().f107507a, (List<InteractTextStructWrap>) null));
            }
            return arrayList;
        }
        return C89070n.m154525d(C46110t.m88958a(this.f107701h, (List<InteractTextStructWrap>) null));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.EffectTextStickerInputLayout$b */
    public static final class RunnableC46128b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ EffectTextStickerInputLayout f107394a;

        static {
            Covode.recordClassIndex(54687);
        }

        RunnableC46128b(EffectTextStickerInputLayout effectTextStickerInputLayout) {
            this.f107394a = effectTextStickerInputLayout;
        }

        public final void run() {
            this.f107394a.f107391f.setMaxTextWidth(this.f107394a.f107389d.f107354c);
            TextStickerEditText textStickerEditText = this.f107394a.f107701h;
            C89219l.m154716b(textStickerEditText, "");
            textStickerEditText.setMaxWidth(this.f107394a.f107389d.f107354c);
            float width = ((float) this.f107394a.getWidth()) / ((float) this.f107394a.f107389d.f107354c);
            this.f107394a.f107391f.setScaleX(width);
            this.f107394a.f107391f.setScaleY(width);
            this.f107394a.f107390e.setScale(width);
            TextStickerEditText textStickerEditText2 = this.f107394a.f107701h;
            C89219l.m154716b(textStickerEditText2, "");
            textStickerEditText2.setScaleX(width);
            TextStickerEditText textStickerEditText3 = this.f107394a.f107701h;
            C89219l.m154716b(textStickerEditText3, "");
            textStickerEditText3.setScaleY(width);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i
    /* renamed from: a */
    public final void mo78321a() {
        C46220g gVar = this.f107711r;
        if (gVar.f107668a.size() <= 0 || !(gVar.f107668a.get(0).getTag() instanceof String)) {
            C45989b.m88764a().mo77591a("default", gVar.f107671d);
        } else {
            C45989b.m88764a().f107109d = (String) gVar.f107668a.get(0).getTag();
        }
        gVar.f107670c.scrollTo(0, 0);
        super.mo78321a();
    }

    public final void setScaleInfo(C46104o oVar) {
        C89219l.m154721d(oVar, "");
        if (!C89219l.m154714a(this.f107389d, oVar)) {
            this.f107389d = oVar;
            if (!oVar.f107352a) {
                post(new RunnableC46128b(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo78322a(TextStickerData textStickerData) {
        if (textStickerData != null) {
            setInnerLayoutConfig(textStickerData.getEffectTextLayoutConfig());
            if (this.f107385Q != null) {
                setEffectText(textStickerData.getTextWrapList());
            } else {
                mo78492b(textStickerData.getTextWrapList(), textStickerData.getBgMode(), textStickerData.getColor(), textStickerData.getAlign(), textStickerData.getFontType(), false, textStickerData.getFontSize(), 0);
            }
        }
    }

    public final void setInnerLayoutConfig(InnerEffectTextLayoutConfig innerEffectTextLayoutConfig) {
        this.f107385Q = innerEffectTextLayoutConfig;
        if (innerEffectTextLayoutConfig != null) {
            this.f107391f.setInnerLayoutConfig(innerEffectTextLayoutConfig);
            this.f107684G = true;
            TextStickerEditText textStickerEditText = this.f107701h;
            C89219l.m154716b(textStickerEditText, "");
            textStickerEditText.setVisibility(4);
            LinearLayout linearLayout = this.f107712s;
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
            this.f107391f.setVisibility(0);
            return;
        }
        this.f107684G = false;
        TextStickerEditText textStickerEditText2 = this.f107701h;
        C89219l.m154716b(textStickerEditText2, "");
        textStickerEditText2.setVisibility(0);
        LinearLayout linearLayout2 = this.f107712s;
        C89219l.m154716b(linearLayout2, "");
        linearLayout2.setVisibility(0);
        this.f107391f.setVisibility(4);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i
    public final void setEffectText(List<TextStickerTextWrap> list) {
        if (list == null || list.isEmpty() || list == null) {
            this.f107391f.setText(C89070n.m154525d(new C46105p(null, 0, false, false, 15)));
            return;
        }
        ArrayList arrayList = new ArrayList(C89070n.m154526a((Iterable) list, 10));
        for (T t : list) {
            arrayList.add(new C46105p(t.getText(), t.getSelectionStart(), false, t.getHasFocus()));
        }
        this.f107391f.setText(arrayList);
    }

    /* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.EffectTextStickerInputLayout$a */
    static final class View$OnTouchListenerC46127a implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ EffectTextStickerInputLayout f107393a;

        static {
            Covode.recordClassIndex(54686);
        }

        View$OnTouchListenerC46127a(EffectTextStickerInputLayout effectTextStickerInputLayout) {
            this.f107393a = effectTextStickerInputLayout;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f107393a.f107386a = x;
                this.f107393a.f107387b = y;
                return false;
            } else if (action != 1 || Math.abs(this.f107393a.f107387b - y) >= ((float) this.f107393a.f107388c) || Math.abs(this.f107393a.f107386a - x) >= ((float) this.f107393a.f107388c)) {
                return false;
            } else {
                this.f107393a.mo78325c();
                return false;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EffectTextStickerInputLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(11275);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.bos);
        this.f107382N = relativeLayout;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        C89219l.m154716b(viewConfiguration, "");
        this.f107388c = viewConfiguration.getScaledPagingTouchSlop();
        ScrollView scrollView = new ScrollView(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        scrollView.setLayoutParams(layoutParams);
        scrollView.setFillViewport(true);
        relativeLayout.addView(scrollView);
        scrollView.setOnTouchListener(new View$OnTouchListenerC46127a(this));
        this.f107383O = scrollView;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        scrollView.addView(frameLayout);
        this.f107384P = frameLayout;
        C46192u uVar = new C46192u(context, (byte) 0);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        uVar.setLayoutParams(layoutParams2);
        frameLayout.addView(uVar);
        this.f107390e = uVar;
        C46161n nVar = new C46161n(context);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        nVar.setLayoutParams(layoutParams3);
        nVar.setVisibility(4);
        nVar.setShowHint(true);
        String string = context.getString(R.string.eqe);
        C89219l.m154716b(string, "");
        nVar.setHintString(string);
        nVar.setMaxViewWidth(C70636dh.m124831b(context));
        uVar.addView(nVar);
        this.f107391f = nVar;
        this.f107701h.addTextChangedListener(new TextWatcher(this) {
            /* class com.p2082ss.android.ugc.aweme.editSticker.text.effect.EffectTextStickerInputLayout.C461261 */

            /* renamed from: a */
            final /* synthetic */ EffectTextStickerInputLayout f107392a;

            static {
                Covode.recordClassIndex(54685);
            }

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f107392a = r1;
            }

            public final void afterTextChanged(Editable editable) {
                C45886d.m88528a(this.f107392a.f107701h, 20, C45849b.m88473a().f106763c, null);
            }
        });
        LinearLayout linearLayout = this.f107715v;
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(8);
        if (this.f107710q instanceof TextView) {
            View view = this.f107710q;
            if (view != null) {
                ((TextView) view).setTextColor(C0643b.m2378c(context, R.color.a9));
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                MethodCollector.m26664o(11275);
                throw nullPointerException;
            }
        }
        this.f107701h.bringToFront();
        TextStickerEditText textStickerEditText = this.f107701h;
        C89219l.m154716b(textStickerEditText, "");
        textStickerEditText.setHint(" ");
        TextStickerEditText textStickerEditText2 = this.f107701h;
        C89219l.m154716b(textStickerEditText2, "");
        ViewGroup.LayoutParams layoutParams4 = textStickerEditText2.getLayoutParams();
        layoutParams4.width = -2;
        TextStickerEditText textStickerEditText3 = this.f107701h;
        C89219l.m154716b(textStickerEditText3, "");
        textStickerEditText3.setLayoutParams(layoutParams4);
        MethodCollector.m26664o(11275);
    }

    @Override // com.p2082ss.android.ugc.aweme.editSticker.text.view.C46224i
    /* renamed from: a */
    public final void mo78323a(List<TextStickerTextWrap> list, int i, int i2, int i3, String str, boolean z, int i4, int i5) {
        this.f107391f.setEditable(true);
        C45886d.m88529a((EditText) this.f107701h, true);
        super.mo78323a(list, i, i2, i3, str, z, i4, i5);
    }
}
