package com.bytedance.ies.xelement.input;

import android.content.Context;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.text.method.SingleLineTransformationMethod;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.p2054c.C28725c;
import p4600h.p4611f.p4613b.C89219l;

public class LynxInputView extends LynxBaseInputView {

    /* renamed from: w */
    public static final C19264a f45520w = new C19264a((byte) 0);

    /* renamed from: v */
    public C19279c f45521v;

    static {
        Covode.recordClassIndex(22037);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* renamed from: a */
    public final int mo30606a() {
        return 16;
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == 1216985755 && nextKey.equals("password")) {
                boolean z = false;
                if (!readableMap.isNull(nextKey)) {
                    z = readableMap.getBoolean(nextKey, false);
                }
                setIsPassword(z);
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.input.LynxInputView$a */
    public static final class C19264a {
        static {
            Covode.recordClassIndex(22040);
        }

        private C19264a() {
        }

        public /* synthetic */ C19264a(byte b) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxInputView(AbstractC28520j jVar) {
        super(jVar);
        C89219l.m154719c(jVar, "");
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* renamed from: a */
    public final void mo30608a(EditText editText) {
        C89219l.m154719c(editText, "");
        editText.setLines(1);
        editText.setSingleLine(true);
        editText.setHorizontallyScrolling(true);
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* renamed from: a */
    public final C19279c createView(Context context) {
        C19279c a = super.createView(context);
        this.f45521v = a;
        if (a == null) {
            C89219l.m154710a("mEditText");
        }
        a.setOnEditorActionListener(new C19265b(this));
        a.setOnTouchListener(null);
        a.setImeOptions(6);
        C19279c cVar = this.f45521v;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        return cVar;
    }

    @AbstractC28525m(mo49059a = "password", mo49064f = false)
    public final void setIsPassword(boolean z) {
        if (z) {
            C19279c cVar = this.f45521v;
            if (cVar == null) {
                C89219l.m154710a("mEditText");
            }
            int selectionStart = cVar.getSelectionStart();
            C19279c cVar2 = this.f45521v;
            if (cVar2 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar2.setInputType(128);
            C19279c cVar3 = this.f45521v;
            if (cVar3 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar3.setTransformationMethod(PasswordTransformationMethod.getInstance());
            C19279c cVar4 = this.f45521v;
            if (cVar4 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar4.setSelection(selectionStart);
            return;
        }
        C19279c cVar5 = this.f45521v;
        if (cVar5 == null) {
            C89219l.m154710a("mEditText");
        }
        int selectionStart2 = cVar5.getSelectionStart();
        C19279c cVar6 = this.f45521v;
        if (cVar6 == null) {
            C89219l.m154710a("mEditText");
        }
        cVar6.setInputType(this.f45499s);
        C19279c cVar7 = this.f45521v;
        if (cVar7 == null) {
            C89219l.m154710a("mEditText");
        }
        cVar7.setTransformationMethod(SingleLineTransformationMethod.getInstance());
        C19279c cVar8 = this.f45521v;
        if (cVar8 == null) {
            C89219l.m154710a("mEditText");
        }
        cVar8.setSelection(selectionStart2);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* renamed from: a */
    public final void mo30609a(EditText editText, String str) {
        C89219l.m154719c(editText, "");
        if (str != null) {
            switch (str.hashCode()) {
                case -1034364087:
                    if (str.equals("number")) {
                        editText.setInputType(12290);
                        break;
                    }
                    break;
                case 114715:
                    if (str.equals("tel")) {
                        editText.setInputType(3);
                        break;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        editText.setInputType(1);
                        break;
                    }
                    break;
                case 95582509:
                    if (str.equals("digit")) {
                        editText.setInputType(8194);
                        break;
                    }
                    break;
                case 96619420:
                    if (str.equals("email")) {
                        editText.setInputType(32);
                        break;
                    }
                    break;
                case 1216985755:
                    if (str.equals("password")) {
                        editText.setInputType(128);
                        break;
                    }
                    break;
            }
        }
        this.f45499s = editText.getInputType();
        int selectionStart = editText.getSelectionStart();
        if (!C89219l.m154714a((Object) str, (Object) "password")) {
            editText.setTransformationMethod(SingleLineTransformationMethod.getInstance());
        } else {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        editText.setSelection(selectionStart);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.input.LynxInputView$b */
    public static final class C19265b implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ LynxInputView f45522a;

        static {
            Covode.recordClassIndex(22041);
        }

        C19265b(LynxInputView lynxInputView) {
            this.f45522a = lynxInputView;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            String str;
            if (i != 6 && i != 2 && i != 3 && i != 4 && i != 5 && i != 0) {
                return false;
            }
            if (this.f45522a.f45488h) {
                AbstractC28520j jVar = this.f45522a.mContext;
                C89219l.m154709a((Object) jVar, "");
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f45522a.getSign(), "confirm");
                C19279c cVar3 = this.f45522a.f45521v;
                if (cVar3 == null) {
                    C89219l.m154710a("mEditText");
                }
                Editable text = cVar3.getText();
                if (text != null) {
                    str = text.toString();
                } else {
                    str = null;
                }
                cVar2.mo49838a("value", str);
                cVar.mo49834a(cVar2);
            }
            if (i == 5) {
                return false;
            }
            this.f45522a.mo30613c();
            return true;
        }
    }
}
