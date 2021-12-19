package com.p2082ss.android.ugc.aweme.account.p2280ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.aweme.account.C31685i;
import com.p2082ss.android.ugc.aweme.account.p2274n.C32850c;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator */
public class InputWithIndicator extends LinearLayout {

    /* renamed from: e */
    public static final C32968a f78451e = new C32968a((byte) 0);

    /* renamed from: a */
    public AbstractC89171a<Boolean> f78452a;

    /* renamed from: b */
    public AbstractC32969b f78453b;

    /* renamed from: c */
    public int f78454c;

    /* renamed from: d */
    public int f78455d;

    /* renamed from: f */
    private final AbstractC89244h f78456f;

    /* renamed from: g */
    private final AbstractC89244h f78457g;

    /* renamed from: h */
    private final AbstractC89244h f78458h;

    /* renamed from: i */
    private final AbstractC89244h f78459i;

    /* renamed from: j */
    private final AbstractC89244h f78460j;

    /* renamed from: k */
    private final AbstractC89244h f78461k;

    /* renamed from: l */
    private final AbstractC89244h f78462l;

    /* renamed from: m */
    private int f78463m;

    /* renamed from: n */
    private HashMap f78464n;

    /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$b */
    public interface AbstractC32969b {
        static {
            Covode.recordClassIndex(39768);
        }

        /* renamed from: b */
        void mo57514b(int i);
    }

    static {
        Covode.recordClassIndex(39764);
    }

    public InputWithIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final ImageView getCheckImageView() {
        return (ImageView) this.f78457g.getValue();
    }

    private final ImageView getClearButton() {
        return (ImageView) this.f78456f.getValue();
    }

    private final ImageView getEyeCloseImageView() {
        return (ImageView) this.f78459i.getValue();
    }

    private final ImageView getEyeOpenImageView() {
        return (ImageView) this.f78458h.getValue();
    }

    private final LoadingCircleView getLoadingView() {
        return (LoadingCircleView) this.f78460j.getValue();
    }

    private static /* synthetic */ void getPrimaryIndicatorType$annotations() {
    }

    private static /* synthetic */ void getSecondaryIndicatorType$annotations() {
    }

    /* renamed from: b */
    public final View mo58761b(int i) {
        if (this.f78464n == null) {
            this.f78464n = new HashMap();
        }
        View view = (View) this.f78464n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f78464n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final int getDefaultIndicatorSize() {
        return ((Number) this.f78462l.getValue()).intValue();
    }

    public final int getDefaultPadding() {
        return ((Number) this.f78461k.getValue()).intValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$a */
    public static final class C32968a {
        static {
            Covode.recordClassIndex(39767);
        }

        private C32968a() {
        }

        public /* synthetic */ C32968a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$f */
    static final class C32974f extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C32974f f78471a = new C32974f();

        static {
            Covode.recordClassIndex(39773);
        }

        C32974f() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C34728n.m70946a(28.0d));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$g */
    static final class C32975g extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C32975g f78472a = new C32975g();

        static {
            Covode.recordClassIndex(39774);
        }

        C32975g() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(C34728n.m70946a(6.0d));
        }
    }

    public final EditText getEditText() {
        DmtEditText dmtEditText = (DmtEditText) mo58761b(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        return dmtEditText;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$c */
    static final class C32970c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ InputWithIndicator f78467a;

        static {
            Covode.recordClassIndex(39769);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32970c(InputWithIndicator inputWithIndicator) {
            super(0);
            this.f78467a = inputWithIndicator;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            DmtEditText dmtEditText = (DmtEditText) this.f78467a.mo58761b(R.id.bol);
            C89219l.m154716b(dmtEditText, "");
            Editable text = dmtEditText.getText();
            boolean z = false;
            if (text != null && text.length() > 0) {
                DmtEditText dmtEditText2 = (DmtEditText) this.f78467a.mo58761b(R.id.bol);
                C89219l.m154716b(dmtEditText2, "");
                if (dmtEditText2.isFocused()) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$d */
    static final class C32971d extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ InputWithIndicator f78468a;

        static {
            Covode.recordClassIndex(39770);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32971d(InputWithIndicator inputWithIndicator) {
            super(0);
            this.f78468a = inputWithIndicator;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            ImageView a = this.f78468a.mo58759a(2131231079);
            a.setPadding(this.f78468a.getDefaultPadding(), this.f78468a.getDefaultPadding(), this.f78468a.getDefaultPadding(), this.f78468a.getDefaultPadding());
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$e */
    static final class C32972e extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ InputWithIndicator f78469a;

        static {
            Covode.recordClassIndex(39771);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32972e(InputWithIndicator inputWithIndicator) {
            super(0);
            this.f78469a = inputWithIndicator;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            ImageView a = this.f78469a.mo58759a(R.drawable.j5);
            a.setPadding(this.f78469a.getDefaultPadding(), this.f78469a.getDefaultPadding(), this.f78469a.getDefaultPadding(), this.f78469a.getDefaultPadding());
            a.setOnClickListener(new View$OnClickListenerC32973a(this));
            return a;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$e$a */
        static final class View$OnClickListenerC32973a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C32972e f78470a;

            static {
                Covode.recordClassIndex(39772);
            }

            View$OnClickListenerC32973a(C32972e eVar) {
                this.f78470a = eVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f78470a.f78469a.setText("");
                AbstractC32969b bVar = this.f78470a.f78469a.f78453b;
                if (bVar != null) {
                    bVar.mo57514b(1);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$h */
    static final class C32976h extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ InputWithIndicator f78473a;

        static {
            Covode.recordClassIndex(39775);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32976h(InputWithIndicator inputWithIndicator) {
            super(0);
            this.f78473a = inputWithIndicator;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            ImageView a = this.f78473a.mo58759a(R.drawable.j9);
            a.setOnClickListener(new View$OnClickListenerC32977a(this));
            a.setPadding(this.f78473a.getDefaultPadding() / 2, 0, this.f78473a.getDefaultPadding() / 2, 0);
            return a;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$h$a */
        static final class View$OnClickListenerC32977a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C32976h f78474a;

            static {
                Covode.recordClassIndex(39776);
            }

            View$OnClickListenerC32977a(C32976h hVar) {
                this.f78474a = hVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f78474a.f78473a.f78454c == 4) {
                    this.f78474a.f78473a.mo58760a(5, this.f78474a.f78473a.f78455d);
                } else {
                    this.f78474a.f78473a.mo58760a(this.f78474a.f78473a.f78454c, 5);
                }
                AbstractC32969b bVar = this.f78474a.f78473a.f78453b;
                if (bVar != null) {
                    bVar.mo57514b(4);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$i */
    static final class C32978i extends AbstractC89220m implements AbstractC89171a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ InputWithIndicator f78475a;

        static {
            Covode.recordClassIndex(39777);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32978i(InputWithIndicator inputWithIndicator) {
            super(0);
            this.f78475a = inputWithIndicator;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ImageView invoke() {
            ImageView a = this.f78475a.mo58759a(R.drawable.j8);
            a.setOnClickListener(new View$OnClickListenerC32979a(this));
            a.setPadding(this.f78475a.getDefaultPadding() / 2, 0, this.f78475a.getDefaultPadding() / 2, 0);
            return a;
        }

        /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$i$a */
        static final class View$OnClickListenerC32979a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C32978i f78476a;

            static {
                Covode.recordClassIndex(39778);
            }

            View$OnClickListenerC32979a(C32978i iVar) {
                this.f78476a = iVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                if (this.f78476a.f78475a.f78454c == 5) {
                    this.f78476a.f78475a.mo58760a(4, this.f78476a.f78475a.f78455d);
                } else {
                    this.f78476a.f78475a.mo58760a(this.f78476a.f78475a.f78454c, 4);
                }
                AbstractC32969b bVar = this.f78476a.f78475a.f78453b;
                if (bVar != null) {
                    bVar.mo57514b(5);
                }
            }
        }
    }

    public final String getText() {
        String obj;
        DmtEditText dmtEditText = (DmtEditText) mo58761b(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        Editable text = dmtEditText.getText();
        if (text == null || (obj = text.toString()) == null) {
            return "";
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj2 = C89361p.m154910b((CharSequence) obj).toString();
        if (obj2 == null) {
            return "";
        }
        return obj2;
    }

    /* renamed from: com.ss.android.ugc.aweme.account.ui.InputWithIndicator$j */
    static final class C32980j extends AbstractC89220m implements AbstractC89171a<LoadingCircleView> {

        /* renamed from: a */
        final /* synthetic */ InputWithIndicator f78477a;

        /* renamed from: b */
        final /* synthetic */ Context f78478b;

        static {
            Covode.recordClassIndex(39779);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32980j(InputWithIndicator inputWithIndicator, Context context) {
            super(0);
            this.f78477a = inputWithIndicator;
            this.f78478b = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LoadingCircleView invoke() {
            LoadingCircleView loadingCircleView = new LoadingCircleView(this.f78478b, (AttributeSet) null, 6);
            loadingCircleView.setLoadingColor(C0643b.m2378c(this.f78478b, R.color.bz));
            loadingCircleView.setLineWidth((float) C34728n.m70946a(3.0d));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f78477a.getDefaultIndicatorSize(), this.f78477a.getDefaultIndicatorSize());
            layoutParams.gravity = 16;
            loadingCircleView.setLayoutParams(layoutParams);
            loadingCircleView.setPadding(this.f78477a.getDefaultPadding(), this.f78477a.getDefaultPadding(), this.f78477a.getDefaultPadding(), this.f78477a.getDefaultPadding());
            loadingCircleView.mo58783a();
            return loadingCircleView;
        }
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:40:0x007e */
    /* JADX WARN: Type inference failed for: r1v4, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.ss.android.ugc.aweme.account.ui.LoadingCircleView] */
    /* JADX WARN: Type inference failed for: r1v7, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v8, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v9, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m67603a() {
        /*
        // Method dump skipped, instructions count: 196
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator.m67603a():void");
    }

    public final void setAutoHideRules(AbstractC89171a<Boolean> aVar) {
        C89219l.m154721d(aVar, "");
        this.f78452a = aVar;
    }

    public final void setListener(AbstractC32969b bVar) {
        C89219l.m154721d(bVar, "");
        this.f78453b = bVar;
    }

    public final void setContainerPadding(int i) {
        ((LinearLayout) mo58761b(R.id.bom)).setPadding(i, i, i, i);
    }

    public final void setIndicatorVisible(boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        LinearLayout linearLayout = (LinearLayout) mo58761b(R.id.bom);
        C89219l.m154716b(linearLayout, "");
        linearLayout.setVisibility(i);
    }

    public final void setTextWatcher(TextWatcher textWatcher) {
        C89219l.m154721d(textWatcher, "");
        ((DmtEditText) mo58761b(R.id.bol)).addTextChangedListener(textWatcher);
    }

    /* renamed from: a */
    private final void m67604a(List<? extends View> list) {
        MethodCollector.m26663i(11897);
        ((LinearLayout) mo58761b(R.id.bom)).removeAllViews();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((LinearLayout) mo58761b(R.id.bom)).addView(it.next());
        }
        invalidate();
        MethodCollector.m26664o(11897);
    }

    /* renamed from: c */
    private final void m67605c(int i) {
        DmtEditText dmtEditText = (DmtEditText) mo58761b(R.id.bol);
        C89219l.m154716b(dmtEditText, "");
        int selectionStart = dmtEditText.getSelectionStart();
        DmtEditText dmtEditText2 = (DmtEditText) mo58761b(R.id.bol);
        C89219l.m154716b(dmtEditText2, "");
        int selectionEnd = dmtEditText2.getSelectionEnd();
        DmtEditText dmtEditText3 = (DmtEditText) mo58761b(R.id.bol);
        C89219l.m154716b(dmtEditText3, "");
        dmtEditText3.setInputType(i);
        ((DmtEditText) mo58761b(R.id.bol)).setSelection(selectionStart, selectionEnd);
    }

    public final void setText(CharSequence charSequence) {
        C89219l.m154721d(charSequence, "");
        ((DmtEditText) mo58761b(R.id.bol)).setText(charSequence);
        if (charSequence.length() > 0) {
            ((DmtEditText) mo58761b(R.id.bol)).setSelection(charSequence.length());
        }
    }

    /* renamed from: a */
    public final ImageView mo58759a(int i) {
        MethodCollector.m26663i(11728);
        ImageView imageView = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(getDefaultIndicatorSize(), getDefaultIndicatorSize());
        layoutParams.gravity = 16;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageResource(i);
        MethodCollector.m26664o(11728);
        return imageView;
    }

    /* renamed from: a */
    public final void mo58760a(int i, int i2) {
        if (i2 != this.f78455d || i != this.f78454c) {
            this.f78455d = i2;
            this.f78454c = i;
            m67603a();
        }
    }

    private /* synthetic */ InputWithIndicator(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private InputWithIndicator(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(12041);
        this.f78452a = new C32970c(this);
        this.f78456f = C89250i.m154773a((AbstractC89171a) new C32972e(this));
        this.f78457g = C89250i.m154773a((AbstractC89171a) new C32971d(this));
        this.f78458h = C89250i.m154773a((AbstractC89171a) new C32978i(this));
        this.f78459i = C89250i.m154773a((AbstractC89171a) new C32976h(this));
        this.f78460j = C89250i.m154773a((AbstractC89171a) new C32980j(this, context));
        this.f78461k = C89250i.m154773a((AbstractC89171a) C32975g.f78472a);
        this.f78462l = C89250i.m154773a((AbstractC89171a) C32974f.f78471a);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843091, 16843104, 16843296, R.attr.ws, R.attr.wu, R.attr.x1, R.attr.x2, R.attr.x3, R.attr.x4, R.attr.ab3});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f78454c = obtainStyledAttributes.getInt(3, 0);
        this.f78455d = obtainStyledAttributes.getInt(9, 0);
        this.f78463m = obtainStyledAttributes.getDimensionPixelSize(4, C34728n.m70946a(28.0d));
        String string = obtainStyledAttributes.getString(6);
        int i = obtainStyledAttributes.getInt(0, 1);
        int i2 = obtainStyledAttributes.getInt(1, 0);
        int i3 = obtainStyledAttributes.getInt(2, 1);
        float f = (float) obtainStyledAttributes.getInt(8, 15);
        int color = obtainStyledAttributes.getColor(5, C0643b.m2378c(context, R.color.bx));
        View.inflate(context, R.layout.gh, this);
        int resourceId = obtainStyledAttributes.getResourceId(7, 80);
        if (resourceId != 80) {
            DmtEditText dmtEditText = (DmtEditText) mo58761b(R.id.bol);
            C89219l.m154716b(dmtEditText, "");
            dmtEditText.setId(resourceId);
        }
        obtainStyledAttributes.recycle();
        if (i2 > 0) {
            C32850c.m67444a((EditText) mo58761b(R.id.bol), i2);
        }
        DmtEditText dmtEditText2 = (DmtEditText) mo58761b(R.id.bol);
        C89219l.m154716b(dmtEditText2, "");
        dmtEditText2.setMaxLines(i);
        DmtEditText dmtEditText3 = (DmtEditText) mo58761b(R.id.bol);
        C89219l.m154716b(dmtEditText3, "");
        dmtEditText3.setHint(string);
        DmtEditText dmtEditText4 = (DmtEditText) mo58761b(R.id.bol);
        C89219l.m154716b(dmtEditText4, "");
        dmtEditText4.setTextSize(f);
        if (i3 != 129) {
            DmtEditText dmtEditText5 = (DmtEditText) mo58761b(R.id.bol);
            C89219l.m154716b(dmtEditText5, "");
            dmtEditText5.setInputType(i3);
        }
        ((DmtEditText) mo58761b(R.id.bol)).setTextColor(color);
        ((DmtEditText) mo58761b(R.id.bol)).addTextChangedListener(new C31685i(this) {
            /* class com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator.C329661 */

            /* renamed from: a */
            final /* synthetic */ InputWithIndicator f78465a;

            static {
                Covode.recordClassIndex(39765);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            {
                this.f78465a = r1;
            }

            @Override // com.p2082ss.android.ugc.aweme.account.C31685i
            public final void afterTextChanged(Editable editable) {
                InputWithIndicator inputWithIndicator = this.f78465a;
                inputWithIndicator.setIndicatorVisible(inputWithIndicator.f78452a.invoke().booleanValue());
            }
        });
        ((DmtEditText) mo58761b(R.id.bol)).setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
            /* class com.p2082ss.android.ugc.aweme.account.p2280ui.InputWithIndicator.View$OnFocusChangeListenerC329672 */

            /* renamed from: a */
            final /* synthetic */ InputWithIndicator f78466a;

            static {
                Covode.recordClassIndex(39766);
            }

            {
                this.f78466a = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                InputWithIndicator inputWithIndicator = this.f78466a;
                boolean z2 = false;
                if (z) {
                    DmtEditText dmtEditText = (DmtEditText) inputWithIndicator.mo58761b(R.id.bol);
                    C89219l.m154716b(dmtEditText, "");
                    Editable text = dmtEditText.getText();
                    if (text != null && text.length() > 0) {
                        z2 = true;
                    }
                }
                inputWithIndicator.setIndicatorVisible(z2);
            }
        });
        if (this.f78454c == 1) {
            LinearLayout linearLayout = (LinearLayout) mo58761b(R.id.bom);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(8);
        }
        ((DmtEditText) mo58761b(R.id.bol)).setFontType(C17303d.f41573g);
        m67603a();
        MethodCollector.m26664o(12041);
    }
}
