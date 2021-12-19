package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.InputWithIndicator;
import com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44074d;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44075e;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44084m;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.C44086o;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g */
public abstract class AbstractC44228g extends InputItem implements AbstractC44225e {

    /* renamed from: b */
    private AbstractC89172b<? super List<C44084m>, String> f103150b = C44231c.f103158a;

    /* renamed from: c */
    private AbstractC89171a<C89391z> f103151c = C44230b.f103157a;

    /* renamed from: d */
    private SparseArray f103152d;

    static {
        Covode.recordClassIndex(52540);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.address.widget.inputitem.InputItem
    /* renamed from: a */
    public View mo74090a(int i) {
        if (this.f103152d == null) {
            this.f103152d = new SparseArray();
        }
        View view = (View) this.f103152d.get(i);
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f103152d.put(i, findViewById);
        return findViewById;
    }

    public abstract InputWithIndicator getInputView();

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g$b */
    static final class C44230b extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        public static final C44230b f103157a = new C44230b();

        static {
            Covode.recordClassIndex(52542);
        }

        C44230b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* bridge */ /* synthetic */ C89391z invoke() {
            return C89391z.f203057a;
        }
    }

    public final AbstractC89171a<C89391z> getOnErrorClear() {
        return this.f103151c;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, java.lang.String>, h.f.a.b<java.util.List<com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.dto.m>, java.lang.String> */
    public final AbstractC89172b<List<C44084m>, String> getOnVerify() {
        return this.f103150b;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g$c */
    static final class C44231c extends AbstractC89220m implements AbstractC89172b {

        /* renamed from: a */
        public static final C44231c f103158a = new C44231c();

        static {
            Covode.recordClassIndex(52543);
        }

        C44231c() {
            super(1);
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Object invoke(Object obj) {
            C89219l.m154721d(obj, "");
            return null;
        }
    }

    public final void setOnErrorClear(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        this.f103151c = aVar;
    }

    public final void setOnVerify(AbstractC89172b<? super List<C44084m>, String> bVar) {
        C89219l.m154721d(bVar, "");
        this.f103150b = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.g$a */
    public static final class C44229a extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f103153a = 700;

        /* renamed from: b */
        final /* synthetic */ InputWithIndicator f103154b;

        /* renamed from: c */
        final /* synthetic */ AbstractC44228g f103155c;

        /* renamed from: d */
        final /* synthetic */ C44075e f103156d;

        static {
            Covode.recordClassIndex(52541);
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                EditText editText = this.f103154b.getEditText();
                FrameLayout frameLayout = (FrameLayout) this.f103155c.mo74090a(R.id.acz);
                C89219l.m154716b(frameLayout, "");
                Object a = m86987a(frameLayout.getContext(), "input_method");
                Objects.requireNonNull(a, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                editText.requestFocus();
                ((InputMethodManager) a).showSoftInput(editText, 0);
            }
        }

        /* renamed from: a */
        private static Object m86987a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(7544);
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
                        MethodCollector.m26664o(7544);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C44229a(InputWithIndicator inputWithIndicator, AbstractC44228g gVar, C44075e eVar) {
            super(700);
            this.f103154b = inputWithIndicator;
            this.f103155c = gVar;
            this.f103156d = eVar;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbstractC44228g(Context context, AttributeSet attributeSet, int i) {
        super(context, (AttributeSet) null, 0);
        C89219l.m154721d(context, "");
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.payment.view.element.AbstractC44225e
    /* renamed from: a */
    public void mo75055a(C44075e eVar, C44086o oVar, List<C44084m> list, Object obj) {
        Integer num;
        int i;
        int i2;
        boolean z;
        Integer num2;
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(oVar, "");
        InputWithIndicator inputView = getInputView();
        if (inputView != null) {
            DmtEditText dmtEditText = (DmtEditText) inputView.mo74041a(R.id.bol);
            C89219l.m154716b(dmtEditText, "");
            dmtEditText.setHint(eVar.f102749h);
            C44074d dVar = eVar.f102754m;
            if (dVar != null) {
                num = dVar.f102738b;
            } else {
                num = null;
            }
            int ordinal = EnumC44275n.NUMBER.ordinal();
            int i3 = 1;
            if (num != null && num.intValue() == ordinal) {
                i = 2;
            } else {
                int ordinal2 = EnumC44275n.PHONE.ordinal();
                if (num != null && num.intValue() == ordinal2) {
                    i = 3;
                } else {
                    int ordinal3 = EnumC44275n.TEXT.ordinal();
                    if (num != null && num.intValue() == ordinal3) {
                        i = 1;
                    } else {
                        i = inputView.getInputType();
                    }
                }
            }
            inputView.setInputType(i);
            FrameLayout frameLayout = (FrameLayout) mo74090a(R.id.acz);
            C89219l.m154716b(frameLayout, "");
            frameLayout.setOnClickListener(new C44229a(inputView, this, eVar));
            C44074d dVar2 = eVar.f102754m;
            if (dVar2 == null || (num2 = dVar2.f102737a) == null) {
                i2 = Integer.MAX_VALUE;
            } else {
                i2 = num2.intValue();
            }
            inputView.setMaxLength(i2);
            C44074d dVar3 = eVar.f102754m;
            if (dVar3 == null || !dVar3.f102739c) {
                z = false;
            } else {
                z = true;
                i3 = Integer.MAX_VALUE;
            }
            inputView.setMaxLines(i3);
            if (z) {
                inputView.setInputType(inputView.getInputType() | 131072);
            }
        }
        if (obj instanceof String) {
            mo74092a((String) obj);
        } else {
            mo74091a();
        }
    }
}
