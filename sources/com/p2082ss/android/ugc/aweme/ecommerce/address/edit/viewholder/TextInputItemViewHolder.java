package com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.input.TuxTextView;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.address.edit.C43478j;
import com.p2082ss.android.ugc.aweme.ecommerce.address.p2820a.C43340a;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45571l;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder */
public final class TextInputItemViewHolder extends JediSimpleViewHolder<C43340a> implements AbstractC33974au {

    /* renamed from: f */
    public final CandHelper f101470f;

    /* renamed from: g */
    public long f101471g = -1;

    /* renamed from: j */
    public int f101472j;

    /* renamed from: k */
    private final AbstractC89244h f101473k;

    /* renamed from: l */
    private TextWatcher f101474l;

    static {
        Covode.recordClassIndex(51743);
    }

    /* renamed from: m */
    public final AddressEditViewModel mo63351m() {
        return (AddressEditViewModel) this.f101473k.getValue();
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder$a */
    public static final class C43510a extends AbstractC89220m implements AbstractC89171a<AddressEditViewModel> {

        /* renamed from: a */
        final /* synthetic */ JediViewHolder f101475a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f101476b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f101477c;

        static {
            Covode.recordClassIndex(51744);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43510a(JediViewHolder jediViewHolder, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f101475a = jediViewHolder;
            this.f101476b = cVar;
            this.f101477c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v11, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v16, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v21, types: [com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 3 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel invoke() {
            /*
            // Method dump skipped, instructions count: 117
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder.C43510a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_address_edit_viewholder_TextInputItemViewHolder$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86566xff935038(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder$e */
    static final class View$OnClickListenerC43514e implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TextInputItemViewHolder f101487a;

        /* renamed from: b */
        final /* synthetic */ C43340a f101488b;

        static {
            Covode.recordClassIndex(51748);
        }

        View$OnClickListenerC43514e(TextInputItemViewHolder textInputItemViewHolder, C43340a aVar) {
            this.f101487a = textInputItemViewHolder;
            this.f101488b = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            C43478j jVar = this.f101487a.mo63351m().f101255l;
            if (jVar != null) {
                jVar.mo74000c(this.f101488b.f101148a.f101199d);
            }
        }
    }

    /* renamed from: a */
    public final void mo74007a(boolean z) {
        Integer num = ((C43340a) aQ_()).f101148a.f101203h;
        if (num != null && num.intValue() == 5) {
            mo63351m().mo73966a(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder$b */
    public static final class C43511b extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f101478a = 700;

        /* renamed from: b */
        final /* synthetic */ InputItem f101479b;

        /* renamed from: c */
        final /* synthetic */ TextInputItemViewHolder f101480c;

        /* renamed from: d */
        final /* synthetic */ C43340a f101481d;

        static {
            Covode.recordClassIndex(51745);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                EditText editText = ((InputWithIndicator) this.f101479b.mo74090a(R.id.boj)).getEditText();
                Object a = m86567a(this.f101480c.itemView.getContext(), "input_method");
                Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                editText.requestFocus();
                ((InputMethodManager) a).showSoftInput(editText, 0);
            }
        }

        /* renamed from: a */
        private static Object m86567a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(6634);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                            } catch (Exception e) {
                                C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        C58027i.f132246a = false;
                    } finally {
                        MethodCollector.m26664o(6634);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43511b(InputItem inputItem, TextInputItemViewHolder textInputItemViewHolder, C43340a aVar) {
            super(700);
            this.f101479b = inputItem;
            this.f101480c = textInputItemViewHolder;
            this.f101481d = aVar;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputItemViewHolder(android.view.ViewGroup r6) {
        /*
            r5 = this;
            java.lang.String r4 = ""
            p4600h.p4611f.p4613b.C89219l.m154721d(r6, r4)
            android.content.Context r0 = r6.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558949(0x7f0d0225, float:1.8743228E38)
            r0 = 0
            android.view.View r0 = com.C1764a.m5927a(r2, r1, r6, r0)
            p4600h.p4611f.p4613b.C89219l.m154716b(r0, r4)
            r5.<init>(r0)
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.address.edit.AddressEditViewModel.class
            h.k.c r1 = p4600h.p4611f.p4613b.C89204ab.m154669a(r0)
            com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder$a r0 = new com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder$a
            r0.<init>(r5, r1, r1)
            h.h r0 = p4600h.C89250i.m154773a(r0)
            r5.f101473k = r0
            com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper r3 = new com.ss.android.ugc.aweme.ecommerce.address.candinput.CandHelper
            android.content.Context r2 = r6.getContext()
            p4600h.p4611f.p4613b.C89219l.m154716b(r2, r4)
            android.view.View r1 = r5.itemView
            p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)
            r0 = 2131365098(0x7f0a0cea, float:1.8350052E38)
            android.view.View r0 = r1.findViewById(r0)
            com.ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator r0 = (com.p2082ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator) r0
            android.widget.EditText r0 = r0.getEditText()
            r3.<init>(r2, r0)
            r5.f101470f = r3
            r0 = -1
            r5.f101471g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    /* renamed from: a */
    public final /* synthetic */ void mo33817a(C43340a aVar) {
        int i;
        C43340a aVar2 = aVar;
        C89219l.m154721d(aVar2, "");
        this.f101470f.mo73864a(mo63351m(), aVar2.f101148a.f101199d);
        View view = this.itemView;
        C89219l.m154716b(view, "");
        ((InputWithIndicator) view.findViewById(R.id.boj)).setIndicatorClickListener(new View$OnClickListenerC43514e(this, aVar2));
        Integer num = aVar2.f101148a.f101203h;
        int i2 = 0;
        if (num != null) {
            if (num.intValue() == 0) {
                View view2 = this.itemView;
                C89219l.m154716b(view2, "");
                ((InputWithIndicator) view2.findViewById(R.id.boj)).getEditText().setTag(0);
                View view3 = this.itemView;
                C89219l.m154716b(view3, "");
                ((InputWithIndicator) view3.findViewById(R.id.boj)).setInputType(1);
            } else if (num.intValue() == 5) {
                View view4 = this.itemView;
                C89219l.m154716b(view4, "");
                ((InputWithIndicator) view4.findViewById(R.id.boj)).getEditText().setTag(5);
                View view5 = this.itemView;
                C89219l.m154716b(view5, "");
                ((InputWithIndicator) view5.findViewById(R.id.boj)).setInputType(32);
            }
        }
        View view6 = this.itemView;
        Objects.requireNonNull(view6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem");
        InputItem inputItem = (InputItem) view6;
        TextWatcher textWatcher = this.f101474l;
        if (textWatcher != null) {
            ((InputWithIndicator) inputItem.mo74090a(R.id.boj)).getEditText().removeTextChangedListener(textWatcher);
        }
        inputItem.setTitle(aVar2.f101148a.f101202g);
        ((InputWithIndicator) inputItem.mo74090a(R.id.boj)).setHint(aVar2.f101148a.f101198c);
        Integer num2 = aVar2.f101148a.f101201f;
        if (num2 != null) {
            i = num2.intValue();
        } else {
            i = Integer.MAX_VALUE;
        }
        ((InputWithIndicator) inputItem.mo74090a(R.id.boj)).setMaxLines(i);
        if (i > 1 && (true ^ C89219l.m154714a((Object) aVar2.f101148a.f101199d, (Object) "address"))) {
            ((InputWithIndicator) inputItem.mo74090a(R.id.boj)).setInputType(((InputWithIndicator) inputItem.mo74090a(R.id.boj)).getInputType() | 131072);
        }
        Integer num3 = aVar2.f101148a.f101200e;
        if (num3 != null) {
            i2 = num3.intValue();
        }
        ((InputWithIndicator) inputItem.mo74090a(R.id.boj)).setMaxLength(i2);
        Object obj = aVar2.f101149b;
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str != null) {
            ((InputWithIndicator) inputItem.mo74090a(R.id.boj)).setText(str);
        } else {
            ((InputWithIndicator) inputItem.mo74090a(R.id.boj)).setText("");
        }
        String str2 = aVar2.f101150c;
        if (str2 != null) {
            inputItem.mo74092a(str2);
        } else {
            inputItem.mo74091a();
        }
        View view7 = this.itemView;
        C89219l.m154716b(view7, "");
        FrameLayout frameLayout = (FrameLayout) view7.findViewById(R.id.acz);
        C89219l.m154716b(frameLayout, "");
        frameLayout.setOnClickListener(new C43511b(inputItem, this, aVar2));
        if (C89219l.m154714a((Object) this.f101470f.f101161d, (Object) "sug")) {
            this.f101472j = ((InputWithIndicator) inputItem.mo74090a(R.id.boj)).getEditText().getText().length();
        }
        this.f101474l = new C43512c(this, aVar2);
        ((InputWithIndicator) inputItem.mo74090a(R.id.boj)).getEditText().addTextChangedListener(this.f101474l);
        ((InputWithIndicator) inputItem.mo74090a(R.id.boj)).setOnEditTextFocusChangeListener(new View$OnFocusChangeListenerC43513d(inputItem, this, aVar2));
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder$c */
    public static final class C43512c extends C45571l {

        /* renamed from: a */
        final /* synthetic */ TextInputItemViewHolder f101482a;

        /* renamed from: b */
        final /* synthetic */ C43340a f101483b;

        static {
            Covode.recordClassIndex(51746);
        }

        C43512c(TextInputItemViewHolder textInputItemViewHolder, C43340a aVar) {
            this.f101482a = textInputItemViewHolder;
            this.f101483b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.util.C45571l
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            super.onTextChanged(charSequence, i, i2, i3);
            if (charSequence != null) {
                if (!C89219l.m154714a((Object) charSequence.toString(), this.f101483b.f101149b)) {
                    this.f101482a.mo63351m().f101251e = true;
                }
                this.f101483b.f101149b = charSequence.toString();
            }
            if (this.f101482a.f101470f.f101160c == 0) {
                this.f101482a.f101470f.f101160c = 1;
                this.f101482a.f101470f.mo73865b(this.f101482a.mo63351m(), this.f101483b.f101148a.f101199d);
                return;
            }
            CandHelper candHelper = this.f101482a.f101470f;
            View view = this.f101482a.itemView;
            C89219l.m154716b(view, "");
            candHelper.mo73863a(((InputWithIndicator) view.findViewById(R.id.boj)).getEditText(), this.f101483b.f101148a.f101199d, this.f101482a.mo63351m());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.TextInputItemViewHolder$d */
    static final class View$OnFocusChangeListenerC43513d implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ InputItem f101484a;

        /* renamed from: b */
        final /* synthetic */ TextInputItemViewHolder f101485b;

        /* renamed from: c */
        final /* synthetic */ C43340a f101486c;

        static {
            Covode.recordClassIndex(51747);
        }

        View$OnFocusChangeListenerC43513d(InputItem inputItem, TextInputItemViewHolder textInputItemViewHolder, C43340a aVar) {
            this.f101484a = inputItem;
            this.f101485b = textInputItemViewHolder;
            this.f101486c = aVar;
        }

        public final void onFocusChange(View view, boolean z) {
            String str;
            if (C89219l.m154714a((Object) this.f101486c.f101148a.f101199d, (Object) "address")) {
                this.f101485b.mo63351m().mo33689c(new AddressEditViewModel.C43411t(z));
            }
            if (z) {
                this.f101485b.f101472j = ((InputWithIndicator) this.f101484a.mo74090a(R.id.boj)).getEditText().getText().length();
                if (!(!C89219l.m154714a((Object) this.f101486c.f101148a.f101199d, (Object) "address") || (str = this.f101486c.f101148a.f101205j) == null || str.length() == 0)) {
                    InputItem inputItem = this.f101484a;
                    String str2 = this.f101486c.f101148a.f101205j;
                    if (!(str2 == null || str2.length() == 0)) {
                        TuxTextView tuxTextView = (TuxTextView) inputItem.mo74090a(R.id.h9);
                        C89219l.m154716b(tuxTextView, "");
                        tuxTextView.setVisibility(0);
                        TuxTextView tuxTextView2 = (TuxTextView) inputItem.mo74090a(R.id.h9);
                        C89219l.m154716b(tuxTextView2, "");
                        tuxTextView2.setText(str2);
                    }
                }
                this.f101485b.f101471g = SystemClock.elapsedRealtime();
                C43478j jVar = this.f101485b.mo63351m().f101255l;
                if (jVar != null) {
                    jVar.mo73995a(this.f101486c.f101148a.f101199d);
                }
                if (this.f101486c.f101149b == null) {
                    this.f101486c.f101149b = "";
                }
                CandHelper candHelper = this.f101485b.f101470f;
                View view2 = this.f101485b.itemView;
                C89219l.m154716b(view2, "");
                candHelper.mo73863a(((InputWithIndicator) view2.findViewById(R.id.boj)).getEditText(), this.f101486c.f101148a.f101199d, this.f101485b.mo63351m());
                this.f101484a.mo74091a();
                this.f101486c.f101150c = null;
                this.f101485b.mo74007a(true);
                return;
            }
            if (C89219l.m154714a((Object) this.f101486c.f101148a.f101199d, (Object) "address")) {
                InputItem inputItem2 = this.f101484a;
                TuxTextView tuxTextView3 = (TuxTextView) inputItem2.mo74090a(R.id.h9);
                C89219l.m154716b(tuxTextView3, "");
                tuxTextView3.setText("");
                TuxTextView tuxTextView4 = (TuxTextView) inputItem2.mo74090a(R.id.h9);
                C89219l.m154716b(tuxTextView4, "");
                tuxTextView4.setVisibility(8);
            }
            ((InputWithIndicator) this.f101484a.mo74090a(R.id.boj)).getEditText().setText(((InputWithIndicator) this.f101484a.mo74090a(R.id.boj)).getEditText().getText());
            this.f101485b.mo63351m();
            String a = AddressEditViewModel.m86484a(this.f101486c.f101148a.f101204i, this.f101486c.f101149b);
            if (a != null) {
                this.f101484a.mo74092a(a);
                this.f101486c.f101150c = a;
            }
            this.f101485b.mo74007a(false);
            this.f101485b.f101470f.mo73865b(this.f101485b.mo63351m(), this.f101486c.f101148a.f101199d);
            int length = ((InputWithIndicator) this.f101484a.mo74090a(R.id.boj)).getEditText().getText().length() - this.f101485b.f101472j;
            if (length == 0) {
                if (!C89219l.m154714a((Object) this.f101485b.f101470f.f101161d, (Object) "sug")) {
                    this.f101485b.f101470f.f101161d = "";
                }
            } else if (length > 0) {
                this.f101485b.f101470f.f101161d = "add";
            } else {
                this.f101485b.f101470f.f101161d = "del";
            }
            if (this.f101485b.f101471g != -1) {
                C43478j jVar2 = this.f101485b.mo63351m().f101255l;
                if (jVar2 != null) {
                    jVar2.mo73996a(this.f101486c.f101148a.f101199d, SystemClock.elapsedRealtime() - this.f101485b.f101471g, this.f101485b.f101470f.f101161d);
                }
                this.f101485b.f101471g = -1;
            }
        }
    }
}
