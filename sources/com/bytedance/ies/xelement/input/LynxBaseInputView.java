package com.bytedance.ies.xelement.input;

import android.app.Activity;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.usermgmt.StringSet;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.C28368b;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.DialogC28519i;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28725c;
import com.lynx.tasm.utils.C28930n;
import com.lynx.tasm.utils.ColorUtils;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import p4600h.C89388w;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;
import p4600h.p4621l.AbstractC89306h;
import p4600h.p4622m.AbstractC89345j;
import p4600h.p4622m.C89350l;
import p4600h.p4622m.C89361p;

public class LynxBaseInputView extends LynxUI<EditText> {

    /* renamed from: u */
    public static final C19256a f45478u = new C19256a((byte) 0);

    /* renamed from: A */
    private boolean f45479A;

    /* renamed from: B */
    private boolean f45480B;

    /* renamed from: a */
    public C19279c f45481a;

    /* renamed from: b */
    public int f45482b = 140;

    /* renamed from: c */
    public String f45483c;

    /* renamed from: d */
    public boolean f45484d;

    /* renamed from: e */
    public boolean f45485e;

    /* renamed from: f */
    public boolean f45486f;

    /* renamed from: g */
    public boolean f45487g;

    /* renamed from: h */
    public boolean f45488h;

    /* renamed from: i */
    public boolean f45489i;

    /* renamed from: j */
    public boolean f45490j;

    /* renamed from: k */
    public float f45491k;

    /* renamed from: l */
    public float f45492l;

    /* renamed from: m */
    public int f45493m;

    /* renamed from: n */
    public boolean f45494n;

    /* renamed from: o */
    public int f45495o;

    /* renamed from: p */
    public int f45496p = Integer.MAX_VALUE;

    /* renamed from: q */
    public boolean f45497q;

    /* renamed from: r */
    public boolean f45498r;

    /* renamed from: s */
    public int f45499s = 1;

    /* renamed from: t */
    public C19285f f45500t = new C19285f(this);

    /* renamed from: v */
    private Integer f45501v;

    /* renamed from: w */
    private boolean f45502w;

    /* renamed from: x */
    private AbstractC19284e f45503x;

    /* renamed from: y */
    private boolean f45504y;

    /* renamed from: z */
    private int f45505z;

    /* renamed from: com.bytedance.ies.xelement.input.LynxBaseInputView$h */
    enum EnumC19263h {
        SHOW,
        HIDE,
        KEEP,
        BLUR;

        static {
            Covode.recordClassIndex(22036);
        }
    }

    static {
        Covode.recordClassIndex(22026);
    }

    /* renamed from: a */
    public int mo30606a() {
        return 0;
    }

    /* renamed from: a */
    public void mo30608a(EditText editText) {
        C89219l.m154719c(editText, "");
    }

    /* renamed from: a */
    public void mo30609a(EditText editText, String str) {
        C89219l.m154719c(editText, "");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            boolean z = true;
            boolean z2 = false;
            boolean z3 = false;
            int i = 0;
            boolean z4 = false;
            boolean z5 = false;
            switch (nextKey.hashCode()) {
                case -1988401764:
                    if (nextKey.equals("letter-spacing")) {
                        setLetterSpacing(readableMap.isNull(nextKey) ? 0.0f : (float) readableMap.getDouble(nextKey, 0.0d));
                        continue;
                    }
                    break;
                case -1730062511:
                    if (nextKey.equals("smart-scroll")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, true);
                        }
                        setSmartScroll(z);
                        continue;
                    }
                    break;
                case -1586082113:
                    if (nextKey.equals(C19386b.f45895b)) {
                        setFontTextSize(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case -962590849:
                    if (nextKey.equals("direction")) {
                        int i2 = 3;
                        if (!readableMap.isNull(nextKey)) {
                            i2 = readableMap.getInt(nextKey, 3);
                        }
                        setLynxDirection(i2);
                        continue;
                    }
                    break;
                case -866730430:
                    if (nextKey.equals("readonly")) {
                        if (!readableMap.isNull(nextKey)) {
                            z2 = readableMap.getBoolean(nextKey, false);
                        }
                        setIsReadOnly(z2);
                        continue;
                    }
                    break;
                case -525534091:
                    if (nextKey.equals("fullscreen-mode")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, true);
                        }
                        setKeyBoardFullscreenMode(z);
                        continue;
                    }
                    break;
                case -445272125:
                    if (nextKey.equals("show-soft-input-onfocus")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, true);
                        }
                        setShowSoftInputOnFocus(z);
                        continue;
                    }
                    break;
                case -140393755:
                    if (nextKey.equals("placeholder-font-size")) {
                        setPlaceholderTextSize(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 3575610:
                    if (nextKey.equals(StringSet.type)) {
                        setInputType(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 94842723:
                    if (nextKey.equals(C19386b.f45894a)) {
                        setFontColor(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 97604824:
                    if (nextKey.equals("focus")) {
                        if (!readableMap.isNull(nextKey)) {
                            z5 = readableMap.getBoolean(nextKey, false);
                        }
                        setFocus(z5);
                        continue;
                    }
                    break;
                case 111972721:
                    if (nextKey.equals("value")) {
                        setInputValue(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 124732746:
                    if (nextKey.equals("maxlength")) {
                        setMaxLength(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 270940796:
                    if (nextKey.equals("disabled")) {
                        if (!readableMap.isNull(nextKey)) {
                            z4 = readableMap.getBoolean(nextKey, false);
                        }
                        setDisable(z4);
                        continue;
                    }
                    break;
                case 598246771:
                    if (nextKey.equals("placeholder")) {
                        setPlaceholder(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 746232421:
                    if (nextKey.equals("text-align")) {
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, 0);
                        }
                        setTextAlign(i);
                        continue;
                    }
                    break;
                case 1101235489:
                    if (nextKey.equals("adjust-mode")) {
                        setAdjustMode(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1155760891:
                    if (nextKey.equals("bottom-inset")) {
                        setBottomInset(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 1437560563:
                    if (nextKey.equals("auto-fit")) {
                        if (!readableMap.isNull(nextKey)) {
                            z = readableMap.getBoolean(nextKey, true);
                        }
                        setAutoFit(z);
                        continue;
                    }
                    break;
                case 1782197877:
                    if (nextKey.equals("enableAutoFill")) {
                        if (!readableMap.isNull(nextKey)) {
                            z3 = readableMap.getBoolean(nextKey, false);
                        }
                        setIsAutoFillEnabled(z3);
                        continue;
                    }
                    break;
                case 1901673625:
                    if (nextKey.equals("caret-color")) {
                        setCursorColor(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 2018420361:
                    if (nextKey.equals("placeholder-color")) {
                        setPlaceholderColor(readableMap.getDynamic(nextKey));
                        continue;
                    }
                    break;
                case 2033358039:
                    if (nextKey.equals("placeholder-style")) {
                        setPlaceHolderStyle(readableMap.getMap(nextKey));
                        continue;
                    }
                    break;
                case 2051146279:
                    if (nextKey.equals("confirm-type")) {
                        setConfirmType(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    /* renamed from: com.bytedance.ies.xelement.input.LynxBaseInputView$a */
    public static final class C19256a {
        static {
            Covode.recordClassIndex(22029);
        }

        private C19256a() {
        }

        public /* synthetic */ C19256a(byte b) {
            this();
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public int getOverflow() {
        if (Build.VERSION.SDK_INT <= 20) {
            return 3;
        }
        return super.getOverflow();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public boolean isFocusable() {
        C19279c cVar = this.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        return cVar.isFocusable();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.input.LynxBaseInputView$f */
    public static final class RunnableC19261f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LynxBaseInputView f45513a;

        static {
            Covode.recordClassIndex(22034);
        }

        RunnableC19261f(LynxBaseInputView lynxBaseInputView) {
            this.f45513a = lynxBaseInputView;
        }

        public final void run() {
            Object a = m35976a(this.f45513a.mContext, "input_method");
            if (a != null) {
                ((InputMethodManager) a).showSoftInput(LynxBaseInputView.m35963a(this.f45513a), 1);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }

        /* renamed from: a */
        private static Object m35976a(AbstractC28520j jVar, String str) {
            Object obj;
            MethodCollector.m26663i(3973);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = jVar.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = jVar.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = jVar.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                            } catch (Exception e) {
                                C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        C58027i.f132246a = false;
                    } finally {
                        MethodCollector.m26664o(3973);
                    }
                }
            } else {
                obj = jVar.getSystemService(str);
            }
            return obj;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.input.LynxBaseInputView$g */
    public static final class RunnableC19262g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ LynxBaseInputView f45514a;

        static {
            Covode.recordClassIndex(22035);
        }

        RunnableC19262g(LynxBaseInputView lynxBaseInputView) {
            this.f45514a = lynxBaseInputView;
        }

        public final void run() {
            Object a = m35977a(this.f45514a.mContext, "input_method");
            if (a != null) {
                ((InputMethodManager) a).hideSoftInputFromWindow(LynxBaseInputView.m35963a(this.f45514a).getWindowToken(), 0);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }

        /* renamed from: a */
        private static Object m35977a(AbstractC28520j jVar, String str) {
            Object obj;
            MethodCollector.m26663i(1);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = jVar.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = jVar.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = jVar.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                            } catch (Exception e) {
                                C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        C58027i.f132246a = false;
                    } finally {
                        MethodCollector.m26664o(1);
                    }
                }
            } else {
                obj = jVar.getSystemService(str);
            }
            return obj;
        }
    }

    /* renamed from: e */
    private void mo30666e() {
        C19279c cVar = this.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        cVar.requestFocus();
        if (!this.f45504y) {
            if (this.mContext != null) {
                C19279c cVar2 = this.f45481a;
                if (cVar2 == null) {
                    C89219l.m154710a("mEditText");
                }
                cVar2.post(new RunnableC19261f(this));
            }
        } else if (this.mContext != null) {
            C19279c cVar3 = this.f45481a;
            if (cVar3 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar3.post(new RunnableC19262g(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo30613c() {
        C19279c cVar = this.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        cVar.clearFocus();
        if (!this.f45504y && this.mContext != null) {
            Object a = m35964a(this.mContext, "input_method");
            if (a != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) a;
                C19279c cVar2 = this.f45481a;
                if (cVar2 == null) {
                    C89219l.m154710a("mEditText");
                }
                inputMethodManager.hideSoftInputFromWindow(cVar2.getWindowToken(), 0);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo30615d() {
        C19279c cVar = this.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        int bottom = cVar.getBottom();
        C19279c cVar2 = this.f45481a;
        if (cVar2 == null) {
            C89219l.m154710a("mEditText");
        }
        if (bottom <= cVar2.getTop()) {
            return false;
        }
        C19279c cVar3 = this.f45481a;
        if (cVar3 == null) {
            C89219l.m154710a("mEditText");
        }
        int right = cVar3.getRight();
        C19279c cVar4 = this.f45481a;
        if (cVar4 == null) {
            C89219l.m154710a("mEditText");
        }
        if (right > cVar4.getLeft()) {
            return true;
        }
        return false;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void destroy() {
        DialogC28519i iVar;
        C19285f fVar = this.f45500t;
        if (!(fVar.f45569b == null || (iVar = fVar.f45571d) == null)) {
            iVar.mo49029b(fVar.f45569b);
        }
        try {
            DialogC28519i iVar2 = fVar.f45571d;
            if (iVar2 != null) {
                iVar2.mo49030c();
            }
        } catch (RuntimeException e) {
            fVar.f45568a.mo48666a(e);
        }
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void layout() {
        super.layout();
        C19279c cVar = this.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        cVar.setPadding(this.mBorderLeftWidth + this.mPaddingLeft, this.mBorderTopWidth + this.mPaddingTop, this.mBorderRightWidth + this.mPaddingRight, this.mBorderBottomWidth + this.mPaddingBottom);
        if (mo30615d() && this.f45480B) {
            setFocus(true);
            this.f45480B = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo30611b() {
        String str = this.f45483c;
        if (str == null) {
            return;
        }
        if (this.f45501v == null) {
            C19279c cVar = this.f45481a;
            if (cVar == null) {
                C89219l.m154710a("mEditText");
            }
            cVar.setHint(this.f45483c);
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        Integer num = this.f45501v;
        if (num != null) {
            spannableString.setSpan(new AbsoluteSizeSpan(num.intValue(), false), 0, spannableString.length(), 33);
            C19279c cVar2 = this.f45481a;
            if (cVar2 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar2.setHint(spannableString);
            return;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    /* renamed from: com.bytedance.ies.xelement.input.LynxBaseInputView$d */
    public static final class C19259d implements AbstractC19284e {

        /* renamed from: a */
        final /* synthetic */ LynxBaseInputView f45509a;

        /* renamed from: b */
        private int f45510b = 140;

        /* renamed from: c */
        private CharSequence f45511c = "";

        static {
            Covode.recordClassIndex(22032);
        }

        @Override // com.bytedance.ies.xelement.input.AbstractC19284e
        /* renamed from: a */
        public final AbstractC19284e mo30654a(int i) {
            this.f45510b = i;
            return this;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19259d(LynxBaseInputView lynxBaseInputView) {
            this.f45509a = lynxBaseInputView;
        }

        @Override // com.bytedance.ies.xelement.input.AbstractC19284e
        /* renamed from: a */
        public final AbstractC19284e mo30655a(String str) {
            C89219l.m154719c(str, "");
            this.f45511c = str;
            return this;
        }

        public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            Editable text;
            C89219l.m154719c(charSequence, "");
            C89219l.m154719c(spanned, "");
            if ((!(charSequence instanceof SpannableStringBuilder) || ((SpannableStringBuilder) charSequence).getSpans(i, i2, UnderlineSpan.class) == null) && (!C89361p.m154870a(this.f45511c))) {
                charSequence = new C89350l(this.f45511c.toString()).replace(charSequence, "");
                i2 = charSequence.length();
            }
            int length = this.f45510b - (spanned.length() - (i4 - i3));
            if (length <= 0) {
                if (this.f45509a.f45489i && (text = LynxBaseInputView.m35963a(this.f45509a).getText()) != null && text.length() == this.f45509a.f45482b) {
                    LynxBaseInputView.m35963a(this.f45509a);
                    AbstractC28520j jVar = this.f45509a.mContext;
                    C89219l.m154709a((Object) jVar, "");
                    jVar.f67064e.mo49834a(new C28725c(this.f45509a.getSign(), "length"));
                }
                return "";
            } else if (length >= i2 - i) {
                return charSequence;
            } else {
                AbstractC89306h findAll$default = C89350l.findAll$default(new C89350l("(?:[🌀-🗿]|[🤀-🧿]|[😀-🙏]|[🚀-🛿]|[☀-⛿]️?|[✀-➿]️?|Ⓜ️?|[🇦-🇿]{1,2}|[🅰🅱🅾🅿🆎🆑-🆚]️?|[#*0-9]️?⃣|[↔-↙↩-↪]️?|[⬅-⬇⬛⬜⭐⭕]️?|[⤴⤵]️?|[〰〽]️?|[㊗㊙]️?|[🈁🈂🈚🈯🈲-🈺🉐🉑]️?|[‼⁉]️?|[▪▫▶◀◻-◾]️?|[©®]️?|[™ℹ]️?|🀄️?|🃏️?|[⌚⌛⌨⏏⏩-⏳⏸-⏺]️?)"), charSequence, 0, 2, null);
                C89233z.C89238e eVar = new C89233z.C89238e();
                Iterator a = findAll$default.mo2926a();
                while (a.hasNext()) {
                    AbstractC89345j jVar2 = (AbstractC89345j) a.next();
                    if (jVar2.mo143719a().f202927a + jVar2.mo143720b().length() > length + i) {
                        eVar.element = (T) charSequence.subSequence(i, jVar2.mo143719a().f202927a);
                        return eVar.element;
                    }
                }
                return charSequence.subSequence(i, length + i);
            }
        }
    }

    /* renamed from: com.bytedance.ies.xelement.input.LynxBaseInputView$b */
    public static final class C19257b implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ LynxBaseInputView f45506a;

        static {
            Covode.recordClassIndex(22030);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C19257b(LynxBaseInputView lynxBaseInputView) {
            this.f45506a = lynxBaseInputView;
        }

        public final void afterTextChanged(Editable editable) {
            if (this.f45506a.f45485e && !this.f45506a.f45490j && editable != null) {
                AbstractC28520j jVar = this.f45506a.mContext;
                C89219l.m154709a((Object) jVar, "");
                C28719c cVar = jVar.f67064e;
                C28725c cVar2 = new C28725c(this.f45506a.getSign(), "input");
                cVar2.mo49838a("value", editable.toString());
                cVar2.mo49838a("cursor", Integer.valueOf(LynxBaseInputView.m35963a(this.f45506a).getSelectionEnd()));
                cVar2.mo49838a("textLength", Integer.valueOf(editable.toString().length()));
                cVar.mo49834a(cVar2);
            }
            if (this.f45506a.f45490j) {
                this.f45506a.f45490j = false;
            }
        }
    }

    @AbstractC28525m(mo49059a = "auto-fit", mo49064f = true)
    public final void setAutoFit(boolean z) {
        this.f45500t.f45575h = z;
    }

    /* renamed from: a */
    public static final /* synthetic */ C19279c m35963a(LynxBaseInputView lynxBaseInputView) {
        C19279c cVar = lynxBaseInputView.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        return cVar;
    }

    @AbstractC28525m(mo49059a = "adjust-mode")
    public final void setAdjustMode(String str) {
        if (str == null) {
            str = "end";
        }
        C19285f fVar = this.f45500t;
        C89219l.m154719c(str, "");
        fVar.f45574g = str;
    }

    @AbstractC28525m(mo49059a = "placeholder")
    public final void setPlaceholder(String str) {
        if (str == null) {
            str = "";
        }
        this.f45483c = str;
        mo30611b();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxBaseInputView(AbstractC28520j jVar) {
        super(jVar);
        C89219l.m154719c(jVar, "");
    }

    @AbstractC28525m(mo49059a = "bottom-inset")
    public final void setBottomInset(String str) {
        if (str == null) {
            str = "0px";
        }
        C19285f fVar = this.f45500t;
        C89219l.m154719c(str, "");
        fVar.f45576i = (int) C28930n.m57958b(str, 0.0f);
    }

    @AbstractC28528p
    public final void setInputFilter(ReadableMap readableMap) {
        AbstractC19284e eVar;
        if (readableMap != null && (eVar = this.f45503x) != null) {
            String string = readableMap.getString("pattern");
            C89219l.m154709a((Object) string, "");
            eVar.mo30655a(string);
        }
    }

    @AbstractC28525m(mo49059a = StringSet.type)
    public final void setInputType(String str) {
        if (str == null) {
            str = "text";
        }
        C19279c cVar = this.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        mo30609a(cVar, str);
    }

    @AbstractC28525m(mo49059a = "readonly", mo49064f = false)
    public final void setIsReadOnly(boolean z) {
        C19279c cVar = this.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        cVar.setFocusable(!z);
        C19279c cVar2 = this.f45481a;
        if (cVar2 == null) {
            C89219l.m154710a("mEditText");
        }
        cVar2.setFocusableInTouchMode(!z);
    }

    @AbstractC28525m(mo49059a = "smart-scroll", mo49064f = true)
    public final void setSmartScroll(boolean z) {
        C19285f fVar = this.f45500t;
        fVar.f45580m = z;
        if (z) {
            DialogC28519i iVar = fVar.f45571d;
            if (iVar != null) {
                iVar.show();
                return;
            }
            return;
        }
        DialogC28519i iVar2 = fVar.f45571d;
        if (iVar2 != null) {
            iVar2.mo49030c();
        }
    }

    @AbstractC28525m(mo49059a = "disabled", mo49064f = false)
    public final void setDisable(boolean z) {
        C19279c cVar = this.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        cVar.setEnabled(!z);
        C19279c cVar2 = this.f45481a;
        if (cVar2 == null) {
            C89219l.m154710a("mEditText");
        }
        cVar2.setFocusable(!z);
        C19279c cVar3 = this.f45481a;
        if (cVar3 == null) {
            C89219l.m154710a("mEditText");
        }
        cVar3.setFocusableInTouchMode(!z);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setEvents(Map<String, C28723a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f45487g = map.containsKey("blur");
            this.f45488h = map.containsKey("confirm");
            this.f45486f = map.containsKey("focus");
            this.f45485e = map.containsKey("input");
            this.f45489i = map.containsKey("length");
        }
    }

    @AbstractC28525m(mo49059a = "focus", mo49064f = false)
    public final void setFocus(boolean z) {
        if (mo30615d() || !z) {
            this.f45502w = z;
            if (z) {
                mo30666e();
                AbstractC28520j jVar = this.mContext;
                C89219l.m154709a((Object) jVar, "");
                jVar.f67065f.f67717b = this;
                return;
            }
            mo30613c();
            return;
        }
        this.f45480B = true;
    }

    @AbstractC28525m(mo49059a = "value")
    public final void setInputValue(String str) {
        if (str == null) {
            str = "";
        }
        C19279c cVar = this.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        if (!C89219l.m154714a((Object) str, (Object) String.valueOf(cVar.getText()))) {
            m35965a(str, null, null);
        }
    }

    @AbstractC28525m(mo49059a = "fullscreen-mode", mo49064f = true)
    public final void setKeyBoardFullscreenMode(boolean z) {
        if (!z) {
            C19279c cVar = this.f45481a;
            if (cVar == null) {
                C89219l.m154710a("mEditText");
            }
            C19279c cVar2 = this.f45481a;
            if (cVar2 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar.setImeOptions(cVar2.getImeOptions() | 33554432 | 268435456);
            return;
        }
        C19279c cVar3 = this.f45481a;
        if (cVar3 == null) {
            C89219l.m154710a("mEditText");
        }
        cVar3.setImeOptions(1);
    }

    @AbstractC28525m(mo49059a = "letter-spacing", mo49062d = 0.0f)
    public final void setLetterSpacing(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            C19279c cVar = this.f45481a;
            if (cVar == null) {
                C89219l.m154710a("mEditText");
            }
            if (cVar.getTextSize() != 0.0f) {
                C19279c cVar2 = this.f45481a;
                if (cVar2 == null) {
                    C89219l.m154710a("mEditText");
                }
                C19279c cVar3 = this.f45481a;
                if (cVar3 == null) {
                    C89219l.m154710a("mEditText");
                }
                cVar2.setLetterSpacing(f / cVar3.getTextSize());
            }
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    @AbstractC28525m(mo49059a = "direction", mo49063e = 3)
    public void setLynxDirection(int i) {
        this.mLynxDirection = i;
        int i2 = Build.VERSION.SDK_INT;
        int i3 = this.mLynxDirection;
        if (i3 == 0) {
            C19279c cVar = this.f45481a;
            if (cVar == null) {
                C89219l.m154710a("mEditText");
            }
            cVar.setTextDirection(5);
        } else if (i3 == 2) {
            C19279c cVar2 = this.f45481a;
            if (cVar2 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar2.setTextDirection(4);
        } else if (i3 == 3) {
            C19279c cVar3 = this.f45481a;
            if (cVar3 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar3.setTextDirection(3);
        }
    }

    @AbstractC28525m(mo49059a = "placeholder-style")
    public final void setPlaceHolderStyle(ReadableMap readableMap) {
        AbstractC28367a dynamic;
        AbstractC28367a dynamic2;
        if (readableMap != null) {
            if (readableMap.hasKey(C19386b.f45894a) && (dynamic2 = readableMap.getDynamic(C19386b.f45894a)) != null) {
                setPlaceholderColor(dynamic2);
            }
            if (readableMap.hasKey(C19386b.f45895b) && (dynamic = readableMap.getDynamic(C19386b.f45895b)) != null) {
                setPlaceholderTextSize(dynamic);
            }
        }
    }

    @AbstractC28525m(mo49059a = "text-align", mo49063e = 0)
    public final void setTextAlign(int i) {
        int a = mo30606a();
        if (i == 0) {
            C19279c cVar = this.f45481a;
            if (cVar == null) {
                C89219l.m154710a("mEditText");
            }
            cVar.setGravity(a | 3);
        } else if (i == 1) {
            C19279c cVar2 = this.f45481a;
            if (cVar2 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar2.setGravity(a | 17);
        } else if (i == 2) {
            C19279c cVar3 = this.f45481a;
            if (cVar3 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar3.setGravity(a | 5);
        }
    }

    @AbstractC28528p
    public final void blur(Callback callback) {
        C19279c cVar = this.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        if (cVar.isFocused()) {
            mo30613c();
            C19279c cVar2 = this.f45481a;
            if (cVar2 == null) {
                C89219l.m154710a("mEditText");
            }
            if (!cVar2.isFocused()) {
                if (callback != null) {
                    callback.invoke(0, "Success to blur.");
                }
            } else if (callback != null) {
                callback.invoke(1, "Fail to blur.");
            }
        } else if (callback != null) {
            callback.invoke(1, "Target is not focused now.");
        }
    }

    @AbstractC28528p
    public final void focus(Callback callback) {
        mo30666e();
        C19279c cVar = this.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        if (cVar.isFocused()) {
            AbstractC28520j jVar = this.mContext;
            C89219l.m154709a((Object) jVar, "");
            jVar.f67065f.f67717b = this;
            if (callback != null) {
                callback.invoke(0, "Success to focus.");
            }
        } else if (callback != null) {
            callback.invoke(1, "Fail to focus.");
        }
    }

    @AbstractC28528p
    public final void select(Callback callback) {
        C19279c cVar = this.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        if (cVar.getText() != null) {
            C19279c cVar2 = this.f45481a;
            if (cVar2 == null) {
                C89219l.m154710a("mEditText");
            }
            C19279c cVar3 = this.f45481a;
            if (cVar3 == null) {
                C89219l.m154710a("mEditText");
            }
            Editable text = cVar3.getText();
            if (text == null) {
                C89219l.m154707a();
            }
            cVar2.setSelection(0, text.length());
            if (callback != null) {
                callback.invoke(0, "Success.");
            }
        } else if (callback != null) {
            callback.invoke(1, "Input is not ready.");
        }
    }

    @AbstractC28525m(mo49059a = C19386b.f45894a, mo49063e = 0)
    public final void setFontColor(AbstractC28367a aVar) {
        C89219l.m154719c(aVar, "");
        ReadableType h = aVar.mo48559h();
        if (h != null) {
            int i = C19274b.f45548a[h.ordinal()];
            if (i == 1) {
                C19279c cVar = this.f45481a;
                if (cVar == null) {
                    C89219l.m154710a("mEditText");
                }
                cVar.setTextColor(aVar.mo48555d());
                return;
            } else if (i == 2) {
                C19279c cVar2 = this.f45481a;
                if (cVar2 == null) {
                    C89219l.m154710a("mEditText");
                }
                cVar2.setTextColor(ColorUtils.m57910a(aVar.mo48556e()));
                return;
            }
        }
        aVar.mo48559h().name();
    }

    @AbstractC28525m(mo49059a = C19386b.f45895b)
    public final void setFontTextSize(AbstractC28367a aVar) {
        if (aVar == null) {
            C19279c cVar = this.f45481a;
            if (cVar == null) {
                C89219l.m154710a("mEditText");
            }
            cVar.setTextSize(0, C28930n.m57954a("14px", 0.0f, 0.0f));
            return;
        }
        ReadableType h = aVar.mo48559h();
        if (h != null) {
            int i = C19274b.f45549b[h.ordinal()];
            if (i == 1) {
                C19279c cVar2 = this.f45481a;
                if (cVar2 == null) {
                    C89219l.m154710a("mEditText");
                }
                cVar2.setTextSize(0, (float) aVar.mo48554c());
            } else if (i == 2) {
                C19279c cVar3 = this.f45481a;
                if (cVar3 == null) {
                    C89219l.m154710a("mEditText");
                }
                cVar3.setTextSize(0, C28930n.m57954a(aVar.mo48556e(), 0.0f, 0.0f));
            }
        }
    }

    @AbstractC28525m(mo49059a = "enableAutoFill", mo49064f = false)
    public final void setIsAutoFillEnabled(boolean z) {
        this.f45479A = z;
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC28520j jVar = this.mContext;
            C89219l.m154709a((Object) jVar, "");
            if (!(jVar.getBaseContext() instanceof Activity)) {
                return;
            }
            if (this.f45479A) {
                AbstractC28520j jVar2 = this.mContext;
                C89219l.m154709a((Object) jVar2, "");
                Context baseContext = jVar2.getBaseContext();
                if (baseContext != null) {
                    Window window = ((Activity) baseContext).getWindow();
                    C89219l.m154709a((Object) window, "");
                    View decorView = window.getDecorView();
                    C89219l.m154709a((Object) decorView, "");
                    decorView.setImportantForAutofill(1);
                    return;
                }
                throw new C89388w("null cannot be cast to non-null type");
            }
            AbstractC28520j jVar3 = this.mContext;
            C89219l.m154709a((Object) jVar3, "");
            Context baseContext2 = jVar3.getBaseContext();
            if (baseContext2 != null) {
                Window window2 = ((Activity) baseContext2).getWindow();
                C89219l.m154709a((Object) window2, "");
                View decorView2 = window2.getDecorView();
                C89219l.m154709a((Object) decorView2, "");
                decorView2.setImportantForAutofill(8);
                return;
            }
            throw new C89388w("null cannot be cast to non-null type");
        }
    }

    @AbstractC28525m(mo49059a = "maxlength")
    public final void setMaxLength(AbstractC28367a aVar) {
        if (aVar == null) {
            this.f45482b = 140;
        } else {
            ReadableType h = aVar.mo48559h();
            if (h != null) {
                int i = C19274b.f45550c[h.ordinal()];
                if (i == 1) {
                    String e = aVar.mo48556e();
                    C89219l.m154709a((Object) e, "");
                    this.f45482b = Integer.parseInt(e);
                } else if (i == 2 || i == 3 || i == 4) {
                    this.f45482b = aVar.mo48555d();
                }
            }
            aVar.mo48559h().name();
        }
        if (this.f45482b < 0) {
            this.f45482b = Integer.MAX_VALUE;
        }
        AbstractC19284e eVar = this.f45503x;
        if (eVar != null) {
            eVar.mo30654a(this.f45482b);
        }
    }

    @AbstractC28525m(mo49059a = "placeholder-color")
    public final void setPlaceholderColor(AbstractC28367a aVar) {
        if (aVar == null) {
            C19279c cVar = this.f45481a;
            if (cVar == null) {
                C89219l.m154710a("mEditText");
            }
            cVar.setHintTextColor(0);
            return;
        }
        ReadableType h = aVar.mo48559h();
        if (h != null) {
            int i = C19274b.f45551d[h.ordinal()];
            if (i == 1 || i == 2) {
                C19279c cVar2 = this.f45481a;
                if (cVar2 == null) {
                    C89219l.m154710a("mEditText");
                }
                cVar2.setHintTextColor(aVar.mo48555d());
                return;
            } else if (i == 3) {
                String e = aVar.mo48556e();
                if (e != null) {
                    int a = ColorUtils.m57910a(e);
                    C19279c cVar3 = this.f45481a;
                    if (cVar3 == null) {
                        C89219l.m154710a("mEditText");
                    }
                    cVar3.setHintTextColor(a);
                    return;
                }
                return;
            }
        }
        aVar.mo48559h().name();
    }

    @AbstractC28525m(mo49059a = "placeholder-font-size")
    public final void setPlaceholderTextSize(AbstractC28367a aVar) {
        if (aVar == null) {
            this.f45501v = Integer.valueOf((int) C28930n.m57958b("14px", 0.0f));
        } else {
            ReadableType h = aVar.mo48559h();
            if (h != null) {
                int i = C19274b.f45552e[h.ordinal()];
                if (i == 1 || i == 2) {
                    this.f45501v = Integer.valueOf(aVar.mo48555d());
                } else if (i == 3) {
                    this.f45501v = Integer.valueOf((int) aVar.mo48554c());
                } else if (i == 4) {
                    this.f45501v = Integer.valueOf((int) C28930n.m57958b(aVar.mo48556e(), 0.0f));
                }
            }
            aVar.mo48559h().name();
        }
        mo30611b();
    }

    @AbstractC28525m(mo49059a = "confirm-type")
    public final void setConfirmType(String str) {
        if (str == null) {
            str = "done";
        }
        switch (str.hashCode()) {
            case -906336856:
                if (str.equals("search")) {
                    C19279c cVar = this.f45481a;
                    if (cVar == null) {
                        C89219l.m154710a("mEditText");
                    }
                    cVar.setImeOptions(3);
                    return;
                }
                return;
            case 3304:
                if (str.equals("go")) {
                    C19279c cVar2 = this.f45481a;
                    if (cVar2 == null) {
                        C89219l.m154710a("mEditText");
                    }
                    cVar2.setImeOptions(2);
                    return;
                }
                return;
            case 3089282:
                if (str.equals("done")) {
                    C19279c cVar3 = this.f45481a;
                    if (cVar3 == null) {
                        C89219l.m154710a("mEditText");
                    }
                    cVar3.setImeOptions(6);
                    return;
                }
                return;
            case 3377907:
                if (str.equals("next")) {
                    C19279c cVar4 = this.f45481a;
                    if (cVar4 == null) {
                        C89219l.m154710a("mEditText");
                    }
                    cVar4.setImeOptions(5);
                    return;
                }
                return;
            case 3526536:
                if (str.equals("send")) {
                    C19279c cVar5 = this.f45481a;
                    if (cVar5 == null) {
                        C89219l.m154710a("mEditText");
                    }
                    cVar5.setImeOptions(4);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r6 == null) goto L_0x0028;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004c A[Catch:{ all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0051 A[Catch:{ all -> 0x005b }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @com.lynx.tasm.behavior.AbstractC28525m(mo49059a = "caret-color")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setCursorColor(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 181
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxBaseInputView.setCursorColor(java.lang.String):void");
    }

    @AbstractC28525m(mo49059a = "show-soft-input-onfocus", mo49064f = true)
    public final void setShowSoftInputOnFocus(boolean z) {
        Method method;
        try {
            method = C19279c.class.getMethod("setShowSoftInputOnFocus", Boolean.TYPE);
            try {
                method.setAccessible(true);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            method = null;
        }
        AbstractC28520j jVar = this.mContext;
        C89219l.m154709a((Object) jVar, "");
        Context baseContext = jVar.getBaseContext();
        if (!(baseContext instanceof Activity)) {
            return;
        }
        if (!z) {
            this.f45504y = true;
            Activity activity = (Activity) baseContext;
            Window window = activity.getWindow();
            C89219l.m154709a((Object) window, "");
            this.f45505z = window.getAttributes().softInputMode & 15;
            Window window2 = activity.getWindow();
            C89219l.m154709a((Object) window2, "");
            activity.getWindow().setSoftInputMode((window2.getAttributes().softInputMode ^ 15) | 3);
            if (method != null) {
                C19279c cVar = this.f45481a;
                if (cVar == null) {
                    C89219l.m154710a("mEditText");
                }
                method.invoke(cVar, false);
                return;
            }
            return;
        }
        this.f45504y = false;
        Activity activity2 = (Activity) baseContext;
        Window window3 = activity2.getWindow();
        C89219l.m154709a((Object) window3, "");
        activity2.getWindow().setSoftInputMode((window3.getAttributes().softInputMode ^ 15) | this.f45505z);
        if (method != null) {
            C19279c cVar2 = this.f45481a;
            if (cVar2 == null) {
                C89219l.m154710a("mEditText");
            }
            method.invoke(cVar2, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C19279c createView(Context context) {
        if (context == null) {
            C89219l.m154707a();
        }
        this.f45481a = new C19279c(context);
        this.f45503x = new C19259d(this);
        C19279c cVar = this.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        InputFilter[] inputFilterArr = new InputFilter[1];
        AbstractC19284e eVar = this.f45503x;
        if (eVar != null) {
            inputFilterArr[0] = eVar;
            cVar.setFilters(inputFilterArr);
            cVar.addTextChangedListener(new C19257b(this));
            cVar.setOnFocusChangeListener(new View$OnFocusChangeListenerC19258c(cVar, this));
            cVar.setBackground(null);
            cVar.setImeOptions(1);
            C19279c cVar2 = this.f45481a;
            if (cVar2 == null) {
                C89219l.m154710a("mEditText");
            }
            mo30608a(cVar2);
            C19279c cVar3 = this.f45481a;
            if (cVar3 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar3.setOnTouchListener(new View$OnTouchListenerC19260e(this));
            if (Build.VERSION.SDK_INT >= 26) {
                AbstractC28520j jVar = this.mContext;
                C89219l.m154709a((Object) jVar, "");
                if (jVar.getBaseContext() instanceof Activity) {
                    AbstractC28520j jVar2 = this.mContext;
                    C89219l.m154709a((Object) jVar2, "");
                    Context baseContext = jVar2.getBaseContext();
                    if (baseContext != null) {
                        Window window = ((Activity) baseContext).getWindow();
                        C89219l.m154709a((Object) window, "");
                        View decorView = window.getDecorView();
                        C89219l.m154709a((Object) decorView, "");
                        decorView.setImportantForAutofill(8);
                    } else {
                        throw new C89388w("null cannot be cast to non-null type");
                    }
                }
            }
            C19279c cVar4 = this.f45481a;
            if (cVar4 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar4.setTextSize(0, C28930n.m57954a("14px", 0.0f, 0.0f));
            C19279c cVar5 = this.f45481a;
            if (cVar5 == null) {
                C89219l.m154710a("mEditText");
            }
            return cVar5;
        }
        throw new C89388w("null cannot be cast to non-null type");
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public void onFocusChanged(boolean z, boolean z2) {
        if (z2 && !this.f45504y) {
            return;
        }
        if (!z || this.f45494n) {
            mo30613c();
        } else {
            mo30666e();
        }
    }

    @AbstractC28528p
    public final void addText(ReadableMap readableMap, Callback callback) {
        if (readableMap != null) {
            String string = readableMap.getString("text");
            C19279c cVar = this.f45481a;
            if (cVar == null) {
                C89219l.m154710a("mEditText");
            }
            C19282d a = cVar.mo30688a();
            if (a != null) {
                a.finishComposingText();
            }
            C19279c cVar2 = this.f45481a;
            if (cVar2 == null) {
                C89219l.m154710a("mEditText");
            }
            C19282d a2 = cVar2.mo30688a();
            if (a2 != null) {
                a2.commitText(string, 1);
            }
            if (callback != null) {
                callback.invoke(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.input.LynxBaseInputView$c */
    public static final class View$OnFocusChangeListenerC19258c implements View.OnFocusChangeListener {

        /* renamed from: a */
        final /* synthetic */ C19279c f45507a;

        /* renamed from: b */
        final /* synthetic */ LynxBaseInputView f45508b;

        static {
            Covode.recordClassIndex(22031);
        }

        View$OnFocusChangeListenerC19258c(C19279c cVar, LynxBaseInputView lynxBaseInputView) {
            this.f45507a = cVar;
            this.f45508b = lynxBaseInputView;
        }

        public final void onFocusChange(View view, boolean z) {
            String str = null;
            if (z) {
                if (this.f45508b.f45486f) {
                    AbstractC28520j jVar = this.f45508b.mContext;
                    C89219l.m154709a((Object) jVar, "");
                    C28719c cVar = jVar.f67064e;
                    C28725c cVar2 = new C28725c(this.f45508b.getSign(), "focus");
                    Editable text = this.f45507a.getText();
                    if (text != null) {
                        str = text.toString();
                    }
                    cVar2.mo49838a("value", str);
                    cVar.mo49834a(cVar2);
                }
                if (this.f45508b.f45500t.mo30698a()) {
                    this.f45508b.f45500t.mo30699b();
                }
            } else if (this.f45508b.f45487g) {
                AbstractC28520j jVar2 = this.f45508b.mContext;
                C89219l.m154709a((Object) jVar2, "");
                C28719c cVar3 = jVar2.f67064e;
                C28725c cVar4 = new C28725c(this.f45508b.getSign(), "blur");
                Editable text2 = this.f45507a.getText();
                if (text2 != null) {
                    str = text2.toString();
                }
                cVar4.mo49838a("value", str);
                cVar3.mo49834a(cVar4);
            }
        }
    }

    /* renamed from: a */
    private static Object m35964a(AbstractC28520j jVar, String str) {
        Object obj;
        MethodCollector.m26663i(1101);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    obj = jVar.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = jVar.getSystemService(str);
        } else if (C58027i.f132246a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = jVar.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                        } catch (Exception e) {
                            C13846c.m25011a(e, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    C58027i.f132246a = false;
                } finally {
                    MethodCollector.m26664o(1101);
                }
            }
        } else {
            obj = jVar.getSystemService(str);
        }
        return obj;
    }

    @AbstractC28528p
    public void sendDelEvent(ReadableMap readableMap, Callback callback) {
        if (readableMap != null) {
            try {
                int i = readableMap.getInt("action");
                if (i == 0) {
                    int i2 = readableMap.getInt("length");
                    C19279c cVar = this.f45481a;
                    if (cVar == null) {
                        C89219l.m154710a("mEditText");
                    }
                    C19282d a = cVar.mo30688a();
                    if (a != null) {
                        a.deleteSurroundingText(i2, 0);
                    }
                } else if (i == 1) {
                    ((EditText) this.mView).dispatchKeyEvent(new KeyEvent(0, 67));
                }
                if (callback != null) {
                    callback.invoke(0);
                }
            } catch (Throwable th) {
                if (callback != null) {
                    callback.invoke(1, th);
                }
            }
        }
    }

    @AbstractC28528p
    public final void setValue(ReadableMap readableMap, Callback callback) {
        String str;
        Integer num;
        if (readableMap != null) {
            if (readableMap.hasKey("value")) {
                str = readableMap.getString("value");
            } else {
                str = "";
            }
            if (readableMap.hasKey("index")) {
                num = Integer.valueOf(readableMap.getInt("index"));
            } else {
                num = null;
            }
            C89219l.m154709a((Object) str, "");
            m35965a(str, num, callback);
        } else if (callback != null) {
            callback.invoke(4, "Param is not a map.");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.input.LynxBaseInputView$e */
    public static final class View$OnTouchListenerC19260e implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ LynxBaseInputView f45512a;

        static {
            Covode.recordClassIndex(22033);
        }

        View$OnTouchListenerC19260e(LynxBaseInputView lynxBaseInputView) {
            this.f45512a = lynxBaseInputView;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154709a((Object) motionEvent, "");
            int action = motionEvent.getAction();
            boolean z = true;
            if (action == 0) {
                C89219l.m154709a((Object) view, "");
                view.getParent().requestDisallowInterceptTouchEvent(true);
                this.f45512a.f45491k = motionEvent.getX();
                this.f45512a.f45492l = motionEvent.getY();
                this.f45512a.f45493m = view.getScrollY();
            } else if (action == 1) {
                C89219l.m154709a((Object) view, "");
                view.getParent().requestDisallowInterceptTouchEvent(false);
                this.f45512a.f45491k = 0.0f;
                this.f45512a.f45492l = 0.0f;
                LynxBaseInputView lynxBaseInputView = this.f45512a;
                if (Math.abs(view.getScrollY() - this.f45512a.f45493m) <= 10) {
                    z = false;
                }
                lynxBaseInputView.f45494n = z;
            } else if (action != 2) {
                if (action == 3) {
                    C89219l.m154709a((Object) view, "");
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                    this.f45512a.f45491k = 0.0f;
                    this.f45512a.f45492l = 0.0f;
                    LynxBaseInputView lynxBaseInputView2 = this.f45512a;
                    if (Math.abs(view.getScrollY() - this.f45512a.f45493m) <= 10) {
                        z = false;
                    }
                    lynxBaseInputView2.f45494n = z;
                }
            } else if ((!LynxBaseInputView.m35963a(this.f45512a).canScrollVertically(1) && motionEvent.getY() < this.f45512a.f45492l) || (!LynxBaseInputView.m35963a(this.f45512a).canScrollVertically(-1) && motionEvent.getY() > this.f45512a.f45492l)) {
                C89219l.m154709a((Object) view, "");
                view.getParent().requestDisallowInterceptTouchEvent(false);
            }
            return false;
        }
    }

    @AbstractC28528p
    public final void controlKeyBoard(ReadableMap readableMap, Callback callback) {
        if (readableMap != null) {
            int i = readableMap.getInt("action");
            int length = EnumC19263h.values().length;
            if (i >= 0 && length > i) {
                C19279c cVar = this.f45481a;
                if (cVar == null) {
                    C89219l.m154710a("mEditText");
                }
                if (!cVar.isFocused()) {
                    C19279c cVar2 = this.f45481a;
                    if (cVar2 == null) {
                        C89219l.m154710a("mEditText");
                    }
                    cVar2.requestFocus();
                    AbstractC28520j jVar = this.mContext;
                    C89219l.m154709a((Object) jVar, "");
                    jVar.f67065f.f67717b = this;
                }
                Object a = m35964a(this.mContext, "input_method");
                if (a != null) {
                    InputMethodManager inputMethodManager = (InputMethodManager) a;
                    if (i == EnumC19263h.SHOW.ordinal()) {
                        C19279c cVar3 = this.f45481a;
                        if (cVar3 == null) {
                            C89219l.m154710a("mEditText");
                        }
                        inputMethodManager.showSoftInput(cVar3, 1);
                    } else if (i == EnumC19263h.HIDE.ordinal()) {
                        C19279c cVar4 = this.f45481a;
                        if (cVar4 == null) {
                            C89219l.m154710a("mEditText");
                        }
                        inputMethodManager.hideSoftInputFromWindow(cVar4.getWindowToken(), 0);
                    } else if (i != EnumC19263h.KEEP.ordinal() && i == EnumC19263h.BLUR.ordinal()) {
                        mo30613c();
                    }
                    if (callback != null) {
                        callback.invoke(0);
                        return;
                    }
                    return;
                }
                throw new C89388w("null cannot be cast to non-null type");
            } else if (callback != null) {
                callback.invoke(4);
            }
        }
    }

    @AbstractC28528p
    public final void setSelectionRange(ReadableMap readableMap, Callback callback) {
        int i;
        int i2;
        if (readableMap != null) {
            if (readableMap.hasKey("selectionStart")) {
                i = readableMap.getInt("selectionStart");
            } else {
                i = -1;
            }
            if (readableMap.hasKey("selectionEnd")) {
                i2 = readableMap.getInt("selectionEnd");
            } else {
                i2 = -1;
            }
            C19279c cVar = this.f45481a;
            if (cVar == null) {
                C89219l.m154710a("mEditText");
            }
            if (cVar.getText() != null) {
                C19279c cVar2 = this.f45481a;
                if (cVar2 == null) {
                    C89219l.m154710a("mEditText");
                }
                Editable text = cVar2.getText();
                if (text == null) {
                    C89219l.m154707a();
                }
                int length = text.length();
                if (length != -1 && i <= length && i2 <= length && i >= 0 && i2 >= 0) {
                    C19279c cVar3 = this.f45481a;
                    if (cVar3 == null) {
                        C89219l.m154710a("mEditText");
                    }
                    cVar3.setSelection(i, i2);
                    if (callback != null) {
                        callback.invoke(0, "Success.");
                        return;
                    }
                    return;
                }
            }
            if (callback != null) {
                callback.invoke(4, "Range does not meet expectations.");
            }
        } else if (callback != null) {
            callback.invoke(4, "Param is not a map.");
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setTextStyleData(int[] iArr, double[] dArr, String str) {
        C89219l.m154719c(iArr, "");
        C89219l.m154719c(dArr, "");
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            int i2 = iArr[i];
            if (i2 == 1) {
                JavaOnlyArray from = JavaOnlyArray.from(C89070n.m154524c(Float.valueOf((float) dArr[i])));
                C89219l.m154709a((Object) from, "");
                C28368b a = C28368b.m56681a(from, 0);
                C89219l.m154709a((Object) a, "");
                setFontTextSize(a);
            } else if (i2 == 2) {
                C19279c cVar = this.f45481a;
                if (cVar == null) {
                    C89219l.m154710a("mEditText");
                }
                cVar.setTextColor((int) ((long) dArr[i]));
            } else if (i2 == 11) {
                setTextAlign((int) dArr[i]);
            }
        }
    }

    /* renamed from: a */
    private final void m35965a(String str, Integer num, Callback callback) {
        C19279c cVar = this.f45481a;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        if (cVar.getText() != null) {
            this.f45490j = true;
            C19279c cVar2 = this.f45481a;
            if (cVar2 == null) {
                C89219l.m154710a("mEditText");
            }
            Editable text = cVar2.getText();
            C19279c cVar3 = this.f45481a;
            if (cVar3 == null) {
                C89219l.m154710a("mEditText");
            }
            Editable text2 = cVar3.getText();
            if (text2 == null) {
                C89219l.m154707a();
            }
            C19279c cVar4 = this.f45481a;
            if (cVar4 == null) {
                C89219l.m154710a("mEditText");
            }
            Editable text3 = cVar4.getText();
            if (text3 == null) {
                C89219l.m154707a();
            }
            text2.replace(0, text3.length(), str);
            C19279c cVar5 = this.f45481a;
            if (cVar5 == null) {
                C89219l.m154710a("mEditText");
            }
            if (C89219l.m154714a(cVar5.getText(), text)) {
                this.f45490j = false;
            }
            if (num != null && num.intValue() >= 0) {
                int intValue = num.intValue();
                C19279c cVar6 = this.f45481a;
                if (cVar6 == null) {
                    C89219l.m154710a("mEditText");
                }
                Editable text4 = cVar6.getText();
                if (text4 == null) {
                    C89219l.m154707a();
                }
                if (intValue <= text4.length()) {
                    C19279c cVar7 = this.f45481a;
                    if (cVar7 == null) {
                        C89219l.m154710a("mEditText");
                    }
                    cVar7.setSelection(num.intValue());
                }
            }
            if (callback != null) {
                callback.invoke(0, "Success.");
            }
        } else if (callback != null) {
            callback.invoke(1, "Input is not ready.");
        }
    }
}
