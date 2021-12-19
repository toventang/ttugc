package com.bytedance.ies.xelement.input;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13846c;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.C15346a;
import com.bytedance.ies.xelement.input.C19279c;
import com.bytedance.ies.xelement.input.C19282d;
import com.bytedance.ies.xelement.input.p1382a.C19273a;
import com.bytedance.ies.xelement.input.p1383b.C19275a;
import com.bytedance.ies.xelement.input.p1383b.C19276b;
import com.bytedance.ies.xelement.input.p1383b.C19277c;
import com.bytedance.ies.xelement.input.p1383b.C19278d;
import com.bytedance.ies.xelement.text.p1397a.AbstractC19417b;
import com.bytedance.ies.xelement.text.p1397a.C19416a;
import com.bytedance.ies.xelement.text.p1397a.C19418c;
import com.bytedance.ies.xelement.text.p1397a.C19420d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.usermgmt.StringSet;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.AbstractC28528p;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.shadow.text.C28558h;
import com.lynx.tasm.p2054c.C28723a;
import com.lynx.tasm.p2054c.C28725c;
import com.lynx.tasm.utils.C28930n;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

public class LynxTextAreaView extends LynxBaseInputView {

    /* renamed from: F */
    public static final C19266a f45523F = new C19266a((byte) 0);

    /* renamed from: J */
    private static Field f45524J;

    /* renamed from: K */
    private static Field f45525K;

    /* renamed from: A */
    public final List<AbstractC19289g> f45526A = new ArrayList();

    /* renamed from: B */
    public final int f45527B = 1;

    /* renamed from: C */
    public final int f45528C = 16;

    /* renamed from: D */
    int f45529D;

    /* renamed from: E */
    public AbstractC89172b<? super Context, ? extends AbstractC19417b> f45530E = C19267b.f45539a;

    /* renamed from: G */
    private final int f45531G;

    /* renamed from: H */
    private boolean f45532H;

    /* renamed from: I */
    private boolean f45533I;

    /* renamed from: v */
    public C19279c f45534v;

    /* renamed from: w */
    public boolean f45535w;

    /* renamed from: x */
    public int f45536x;

    /* renamed from: y */
    public ClipboardManager f45537y;

    /* renamed from: z */
    public boolean f45538z;

    static {
        Covode.recordClassIndex(22042);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* renamed from: a */
    public final void mo30609a(EditText editText, String str) {
        C89219l.m154719c(editText, "");
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (nextKey.hashCode()) {
                case -1550570986:
                    if (nextKey.equals("richtype")) {
                        setRichType(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case -428786256:
                    if (nextKey.equals("max-height")) {
                        setMaxHeight(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
                case 419784731:
                    if (nextKey.equals("maxlines")) {
                        int i = Integer.MAX_VALUE;
                        if (!readableMap.isNull(nextKey)) {
                            i = readableMap.getInt(nextKey, Integer.MAX_VALUE);
                        }
                        setMaxLines(i);
                        continue;
                    }
                    break;
                case 2043213058:
                    if (nextKey.equals("min-height")) {
                        setMinHeight(readableMap.getString(nextKey));
                        continue;
                    }
                    break;
            }
            super.dispatchProperties(vVar);
        }
    }

    @AbstractC28528p
    public final void resetSelectionMenu() {
    }

    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$a */
    public static final class C19266a {
        static {
            Covode.recordClassIndex(22045);
        }

        private C19266a() {
        }

        public /* synthetic */ C19266a(byte b) {
            this();
        }
    }

    /* renamed from: f */
    private final boolean m35986f() {
        C19279c cVar = this.f45534v;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        if (cVar.getMaxHeight() < 0) {
            return false;
        }
        C19279c cVar2 = this.f45534v;
        if (cVar2 == null) {
            C89219l.m154710a("mEditText");
        }
        if (cVar2.getMinHeight() >= 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* renamed from: b */
    public final void mo30611b() {
        super.mo30611b();
        if (this.f45483c != null && m35986f()) {
            if (mo30615d()) {
                int i = this.f45529D;
                m35987g();
                if (this.f45529D != i) {
                    mo30666e();
                    return;
                }
                return;
            }
            this.f45533I = true;
        }
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void layout() {
        super.layout();
        if (mo30615d() && this.f45533I) {
            m35987g();
        }
        if (mo30615d() && this.f45532H) {
            this.f45500t.mo30699b();
            this.f45532H = false;
        }
        if (m35986f()) {
            mo30666e();
        }
    }

    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$e */
    public static final class C19270e implements C19282d.AbstractC19283a {

        /* renamed from: a */
        final /* synthetic */ LynxTextAreaView f45544a;

        static {
            Covode.recordClassIndex(22049);
        }

        @Override // com.bytedance.ies.xelement.input.C19282d.AbstractC19283a
        /* renamed from: a */
        public final boolean mo30677a() {
            Editable text = LynxTextAreaView.m35982a(this.f45544a).getText();
            if (text != null && text.length() == 0) {
                return false;
            }
            Iterator<T> it = this.f45544a.f45526A.iterator();
            while (true) {
                boolean z = false;
                while (true) {
                    if (!it.hasNext()) {
                        return z;
                    }
                    T next = it.next();
                    if (!z) {
                        Editable text2 = LynxTextAreaView.m35982a(this.f45544a).getText();
                        if (text2 == null) {
                            C89219l.m154707a();
                        }
                        C89219l.m154709a((Object) text2, "");
                        if (next.mo30680a(text2)) {
                        }
                    }
                    z = true;
                }
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19270e(LynxTextAreaView lynxTextAreaView) {
            this.f45544a = lynxTextAreaView;
        }
    }

    /* renamed from: g */
    private final void m35987g() {
        if (f45525K == null) {
            try {
                Field declaredField = TextView.class.getDeclaredField("mHintLayout");
                f45525K = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (Exception e) {
                LLog.m56862d("LynxTextAreaView", Log.getStackTraceString(e));
            }
        }
        try {
            Field field = f45525K;
            if (field == null) {
                C89219l.m154707a();
            }
            Layout layout = (Layout) field.get(this.mView);
            if (layout != null) {
                if (layout.getHeight() != this.f45529D) {
                    this.f45529D = layout.getHeight();
                }
                View view = this.mView;
                C89219l.m154709a((Object) view, "");
                int maxHeight = ((EditText) view).getMaxHeight();
                View view2 = this.mView;
                C89219l.m154709a((Object) view2, "");
                int minHeight = ((EditText) view2).getMinHeight();
                int i = this.f45529D;
                if (i > maxHeight) {
                    this.f45529D = maxHeight;
                } else if (i < minHeight) {
                    this.f45529D = minHeight;
                }
                this.f45533I = false;
            }
        } catch (Exception e2) {
            LLog.m56862d("LynxTextAreaView", Log.getStackTraceString(e2));
        }
    }

    /* renamed from: e */
    public final void mo30666e() {
        if (f45524J == null) {
            try {
                Field declaredField = TextView.class.getDeclaredField("mLayout");
                f45524J = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            } catch (Exception e) {
                LLog.m56862d("LynxTextAreaView", Log.getStackTraceString(e));
                return;
            }
        }
        try {
            Field field = f45524J;
            if (field == null) {
                C89219l.m154707a();
            }
            Layout layout = (Layout) field.get(this.mView);
            int i = 0;
            if (layout != null) {
                i = layout.getHeight();
            }
            View view = this.mView;
            if (view == null) {
                C89219l.m154707a();
            }
            int minHeight = ((EditText) view).getMinHeight();
            View view2 = this.mView;
            if (view2 == null) {
                C89219l.m154707a();
            }
            int maxHeight = ((EditText) view2).getMaxHeight();
            if (i < minHeight) {
                m35985a(minHeight);
            } else if (i > maxHeight) {
                m35985a(maxHeight);
            } else {
                m35985a(i);
            }
        } catch (Exception e2) {
            LLog.m56862d("LynxTextAreaView", Log.getStackTraceString(e2));
        }
    }

    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$f */
    public static final class C19271f implements C19279c.AbstractC19281b {

        /* renamed from: a */
        final /* synthetic */ LynxTextAreaView f45545a;

        static {
            Covode.recordClassIndex(22050);
        }

        /* renamed from: b */
        private static void m35996b(ClipboardManager clipboardManager, ClipData clipData) {
            if (!((Boolean) C15346a.m28238a(clipboardManager, new Object[]{clipData}, 101807, "void", false, null).first).booleanValue()) {
                clipboardManager.setPrimaryClip(clipData);
                C15346a.m28240a(null, clipboardManager, new Object[]{clipData}, 101807, "com_bytedance_ies_xelement_input_LynxTextAreaView$setRichType$2_android_content_ClipboardManager_setPrimaryClip(Landroid/content/ClipboardManager;Landroid/content/ClipData;)V");
            }
        }

        @Override // com.bytedance.ies.xelement.input.C19279c.AbstractC19281b
        /* renamed from: a */
        public final boolean mo30678a() {
            Method declaredMethod;
            int i;
            ClipData clipData;
            int selectionStart = Selection.getSelectionStart(LynxTextAreaView.m35982a(this.f45545a).getText());
            int selectionEnd = Selection.getSelectionEnd(LynxTextAreaView.m35982a(this.f45545a).getText());
            if (Build.VERSION.SDK_INT <= 22) {
                declaredMethod = TextView.class.getDeclaredMethod("stopSelectionActionMode", new Class[0]);
                C89219l.m154709a((Object) declaredMethod, "");
            } else {
                declaredMethod = TextView.class.getDeclaredMethod("stopTextActionMode", new Class[0]);
                C89219l.m154709a((Object) declaredMethod, "");
            }
            if (selectionStart == -1 || selectionEnd == -1) {
                try {
                    ClipboardManager clipboardManager = this.f45545a.f45537y;
                    if (clipboardManager != null) {
                        m35995a(clipboardManager, ClipData.newPlainText(null, ""));
                    }
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(LynxTextAreaView.m35982a(this.f45545a), new Object[0]);
                } catch (Throwable th) {
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(LynxTextAreaView.m35982a(this.f45545a), new Object[0]);
                    throw th;
                }
                return true;
            }
            if (selectionStart <= selectionEnd) {
                i = selectionStart;
            } else {
                i = selectionEnd;
            }
            if (selectionStart <= selectionEnd) {
                selectionStart = selectionEnd;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LynxTextAreaView.m35982a(this.f45545a).getText());
            C19276b[] bVarArr = (C19276b[]) spannableStringBuilder.getSpans(i, selectionStart, C19276b.class);
            C19420d[] dVarArr = (C19420d[]) spannableStringBuilder.getSpans(i, selectionStart, C19420d.class);
            for (C19276b bVar : bVarArr) {
                int spanStart = spannableStringBuilder.getSpanStart(bVar);
                spannableStringBuilder.delete(spanStart, spannableStringBuilder.getSpanEnd(bVar));
                spannableStringBuilder.insert(spanStart, (CharSequence) (bVar.f45555b + bVar.f45554a));
            }
            for (C19420d dVar : dVarArr) {
                spannableStringBuilder.removeSpan(dVar);
            }
            if (i > spannableStringBuilder.length() || selectionStart > spannableStringBuilder.length()) {
                clipData = ClipData.newPlainText(null, "");
                C89219l.m154709a((Object) clipData, "");
            } else {
                clipData = ClipData.newPlainText(null, spannableStringBuilder.subSequence(i, selectionStart));
                C89219l.m154709a((Object) clipData, "");
            }
            try {
                ClipboardManager clipboardManager2 = this.f45545a.f45537y;
                if (clipboardManager2 != null) {
                    m35995a(clipboardManager2, clipData);
                }
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(LynxTextAreaView.m35982a(this.f45545a), new Object[0]);
            } catch (Throwable th2) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(LynxTextAreaView.m35982a(this.f45545a), new Object[0]);
                throw th2;
            }
            return true;
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C19271f(LynxTextAreaView lynxTextAreaView) {
            this.f45545a = lynxTextAreaView;
        }

        /* renamed from: a */
        private static void m35995a(ClipboardManager clipboardManager, ClipData clipData) {
            C89219l.m154721d(clipData, "");
            try {
                m35996b(clipboardManager, clipData);
            } catch (Exception e) {
                C51423a.m95792b("ClipboardLancet", e.getLocalizedMessage());
            }
        }
    }

    @AbstractC28525m(mo49059a = "maxlines", mo49063e = Integer.MAX_VALUE)
    public final void setMaxLines(int i) {
        this.f45496p = i;
    }

    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$b */
    static final class C19267b extends AbstractC89220m implements AbstractC89172b<Context, C19416a> {

        /* renamed from: a */
        public static final C19267b f45539a = new C19267b();

        static {
            Covode.recordClassIndex(22046);
        }

        C19267b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C19416a invoke(Context context) {
            C89219l.m154719c(context, "");
            return new C19416a();
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ C19279c m35982a(LynxTextAreaView lynxTextAreaView) {
        C19279c cVar = lynxTextAreaView.f45534v;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        return cVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LynxTextAreaView(AbstractC28520j jVar) {
        super(jVar);
        C89219l.m154719c(jVar, "");
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* renamed from: a */
    public final void mo30608a(EditText editText) {
        C89219l.m154719c(editText, "");
        editText.setHorizontallyScrolling(false);
        editText.setSingleLine(false);
        editText.setGravity(48);
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setEvents(Map<String, C28723a> map) {
        super.setEvents(map);
        if (map != null) {
            this.f45484d = map.containsKey("line");
            this.f45538z = map.containsKey("mention");
        }
    }

    /* renamed from: a */
    private final void m35985a(int i) {
        if (Math.max(this.f45495o, this.f45529D) != i) {
            this.f45495o = i;
            ShadowNode b = this.mContext.mo49041b(getSign());
            if (b != null && m35986f()) {
                b.mo49092d();
                this.f45532H = true;
            }
        }
    }

    @AbstractC28525m(mo49059a = "max-height")
    public final void setMaxHeight(String str) {
        if (str == null) {
            View view = this.mView;
            if (view == null) {
                C89219l.m154707a();
            }
            ((EditText) view).setMaxLines(Integer.MAX_VALUE);
        }
        float b = C28930n.m57958b(str, 0.0f);
        View view2 = this.mView;
        if (view2 == null) {
            C89219l.m154707a();
        }
        double d = (double) b;
        Double.isNaN(d);
        ((EditText) view2).setMaxHeight((int) (d + 0.5d));
        mo30666e();
    }

    @AbstractC28525m(mo49059a = "min-height")
    public final void setMinHeight(String str) {
        if (str == null) {
            View view = this.mView;
            if (view == null) {
                C89219l.m154707a();
            }
            ((EditText) view).setMinLines(0);
            return;
        }
        float b = C28930n.m57958b(str, 0.0f);
        View view2 = this.mView;
        if (view2 == null) {
            C89219l.m154707a();
        }
        double d = (double) b;
        Double.isNaN(d);
        ((EditText) view2).setMinHeight((int) (d + 0.5d));
        mo30666e();
    }

    /* renamed from: a */
    private final <T> JavaOnlyArray m35983a(Class<T> cls) {
        C19279c cVar = this.f45534v;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        Editable text = cVar.getText();
        if (text == null) {
            C89219l.m154707a();
        }
        C89219l.m154709a((Object) text, "");
        Object[] spans = text.getSpans(0, text.length(), cls);
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        for (Object obj : spans) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            javaOnlyMap.put("start", Integer.valueOf(text.getSpanStart(obj)));
            javaOnlyMap.put("end", Integer.valueOf(text.getSpanEnd(obj)));
            javaOnlyArray.add(javaOnlyMap);
        }
        return javaOnlyArray;
    }

    @AbstractC28528p
    public final void getTextInfo(Callback callback) {
        if (callback != null) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            C19279c cVar = this.f45534v;
            if (cVar == null) {
                C89219l.m154710a("mEditText");
            }
            javaOnlyMap.put("text", String.valueOf(cVar.getText()));
            int i = this.f45536x;
            int i2 = this.f45527B;
            if ((i & i2) == i2) {
                javaOnlyMap.put("mention", m35983a(C19276b.class));
            }
            int i3 = this.f45536x;
            int i4 = this.f45528C;
            if ((i3 & i4) == i4) {
                javaOnlyMap.put("emoji", m35983a(C19420d.class));
            }
            callback.invoke(0, javaOnlyMap);
        }
    }

    @AbstractC28525m(mo49059a = "richtype")
    public final void setRichType(String str) {
        if (str == null) {
            str = "none";
        }
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "none", false)) {
            this.f45536x = this.f45531G;
            this.f45526A.clear();
            C19279c cVar = this.f45534v;
            if (cVar == null) {
                C89219l.m154710a("mEditText");
            }
            C19282d dVar = cVar.f45561a;
            if (dVar != null) {
                dVar.f45564a = null;
            }
            C19279c cVar2 = this.f45534v;
            if (cVar2 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar2.f45562b = null;
            return;
        }
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "mention", false)) {
            this.f45536x |= this.f45527B;
            this.f45526A.add(C19275a.f45553a);
            this.f45490j = true;
            C19279c cVar3 = this.f45534v;
            if (cVar3 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar3.setEditableFactory(new C19277c(new C19278d(C89204ab.m154669a(C19276b.class))));
        }
        if (C89361p.m154908a((CharSequence) str, (CharSequence) "bracket", false)) {
            this.f45536x |= this.f45528C;
            this.f45526A.add(C19273a.f45547a);
            C19418c a = C19418c.C19419a.m36225a();
            AbstractC89172b<? super Context, ? extends AbstractC19417b> bVar = this.f45530E;
            AbstractC28520j jVar = this.mContext;
            C89219l.m154709a((Object) jVar, "");
            a.mo30986a((AbstractC19417b) bVar.invoke(jVar));
            this.f45535w = true;
        }
        if ((this.f45536x ^ this.f45531G) != 0) {
            C19279c cVar4 = this.f45534v;
            if (cVar4 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar4.setBackSpaceListener(new C19270e(this));
            this.f45537y = (ClipboardManager) m35984a(this.mContext, "clipboard");
            C19279c cVar5 = this.f45534v;
            if (cVar5 == null) {
                C89219l.m154710a("mEditText");
            }
            cVar5.setCopyListener(new C19271f(this));
            return;
        }
        this.f45535w = false;
    }

    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$c */
    public static final class C19268c implements TextWatcher {

        /* renamed from: a */
        final /* synthetic */ C19279c f45540a;

        /* renamed from: b */
        final /* synthetic */ LynxTextAreaView f45541b;

        static {
            Covode.recordClassIndex(22047);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00f2, code lost:
            if (r7 != false) goto L_0x00f4;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void afterTextChanged(android.text.Editable r18) {
            /*
            // Method dump skipped, instructions count: 471
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.xelement.input.LynxTextAreaView.C19268c.afterTextChanged(android.text.Editable):void");
        }

        C19268c(C19279c cVar, LynxTextAreaView lynxTextAreaView) {
            this.f45540a = cVar;
            this.f45541b = lynxTextAreaView;
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if ((this.f45541b.f45536x & this.f45541b.f45527B) == this.f45541b.f45527B && this.f45541b.f45538z && !this.f45541b.f45490j && i2 == 0 && i3 == 1 && !TextUtils.isEmpty(charSequence) && charSequence != null && (charSequence.charAt(i) == '@' || charSequence.charAt(i) == '#')) {
                AbstractC28520j jVar = this.f45541b.mContext;
                C89219l.m154709a((Object) jVar, "");
                jVar.f67064e.mo49834a(new C28725c(this.f45541b.getSign(), "mention"));
            }
            if (!this.f45541b.f45485e && this.f45541b.f45490j) {
                this.f45541b.f45490j = false;
            }
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (!this.f45541b.f45490j && i3 != 0) {
                C19276b bVar = null;
                if ((this.f45541b.f45536x & this.f45541b.f45528C) == this.f45541b.f45528C) {
                    int i4 = i + i2;
                    Object[] spans = this.f45540a.getEditableText().getSpans(i, i4, C19420d.class);
                    C89219l.m154709a((Object) spans, "");
                    int length = spans.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= length) {
                            break;
                        }
                        Object obj = spans[i5];
                        if (this.f45540a.getEditableText().getSpanStart(obj) != i || this.f45540a.getEditableText().getSpanEnd(obj) != i4) {
                            i5++;
                        } else if (obj != null) {
                            this.f45540a.getEditableText().removeSpan(obj);
                        }
                    }
                }
                if ((this.f45541b.f45536x & this.f45541b.f45527B) == this.f45541b.f45527B) {
                    int i6 = i2 + i;
                    Object[] spans2 = this.f45540a.getEditableText().getSpans(i, i6, C19276b.class);
                    C89219l.m154709a((Object) spans2, "");
                    int length2 = spans2.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= length2) {
                            break;
                        }
                        Object obj2 = spans2[i7];
                        if (this.f45540a.getEditableText().getSpanStart(obj2) == i && this.f45540a.getEditableText().getSpanEnd(obj2) == i6) {
                            bVar = obj2;
                            break;
                        }
                        i7++;
                    }
                    C19276b bVar2 = bVar;
                    if (bVar2 != null) {
                        this.f45541b.f45490j = true;
                        this.f45540a.getEditableText().delete(this.f45540a.getEditableText().getSpanStart(bVar2), this.f45540a.getEditableText().getSpanEnd(bVar2));
                        this.f45541b.f45490j = true;
                        this.f45540a.getEditableText().insert(i, bVar2.f45555b + bVar2.f45554a);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    /* renamed from: a */
    public final C19279c createView(Context context) {
        C19279c a = super.createView(context);
        this.f45534v = a;
        if (a == null) {
            C89219l.m154710a("mEditText");
        }
        a.addTextChangedListener(new C19268c(a, this));
        a.setOnEditorActionListener(new C19269d(a, this));
        C19279c cVar = this.f45534v;
        if (cVar == null) {
            C89219l.m154710a("mEditText");
        }
        mo30608a(cVar);
        C19279c cVar2 = this.f45534v;
        if (cVar2 == null) {
            C89219l.m154710a("mEditText");
        }
        return cVar2;
    }

    /* renamed from: a */
    public final void mo30664a(AbstractC89172b<? super Context, ? extends AbstractC19417b> bVar) {
        C89219l.m154719c(bVar, "");
        this.f45530E = bVar;
    }

    /* renamed from: a */
    private static Object m35984a(AbstractC28520j jVar, String str) {
        Object obj;
        MethodCollector.m26663i(1499);
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
                    MethodCollector.m26664o(1499);
                }
            }
        } else {
            obj = jVar.getSystemService(str);
        }
        return obj;
    }

    @AbstractC28528p
    public final void addMention(ReadableMap readableMap, Callback callback) {
        C19276b bVar;
        int i;
        if (readableMap != null) {
            int i2 = this.f45536x;
            int i3 = this.f45527B;
            if ((i2 & i3) == i3 && readableMap.hasKey(StringSet.name)) {
                if (readableMap.hasKey("symbol")) {
                    String string = readableMap.getString(StringSet.name);
                    C89219l.m154709a((Object) string, "");
                    String string2 = readableMap.getString("symbol");
                    C89219l.m154709a((Object) string2, "");
                    bVar = new C19276b(string, string2);
                } else {
                    String string3 = readableMap.getString(StringSet.name);
                    C89219l.m154709a((Object) string3, "");
                    bVar = new C19276b(string3);
                }
                SpannableString spannableString = new SpannableString(bVar.f45555b + bVar.f45554a);
                int i4 = -65536;
                int length = spannableString.length();
                C19279c cVar = this.f45534v;
                if (cVar == null) {
                    C89219l.m154710a("mEditText");
                }
                spannableString.setSpan(Integer.valueOf(cVar.getHeight()), 0, length, 33);
                if (readableMap.hasKey("font-style")) {
                    i = readableMap.getInt("font-style");
                } else {
                    i = 1;
                }
                spannableString.setSpan(new StyleSpan(i), 0, length, 33);
                if (readableMap.hasKey("font-color")) {
                    i4 = Color.parseColor(readableMap.getString("font-color"));
                }
                spannableString.setSpan(new C28558h(i4), 0, length, 33);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) C19276b.m36000a(spannableString, bVar));
                if (readableMap.hasKey("extraSpace")) {
                    spannableStringBuilder.append((CharSequence) readableMap.getString("extraSpace"));
                } else {
                    spannableStringBuilder.append((CharSequence) " ");
                }
                C19279c cVar2 = this.f45534v;
                if (cVar2 == null) {
                    C89219l.m154710a("mEditText");
                }
                C19282d a = cVar2.mo30688a();
                if (a != null) {
                    a.commitText(spannableStringBuilder, 1);
                }
                if (callback != null) {
                    callback.invoke(0);
                }
            } else if (callback != null) {
                callback.invoke(4);
            }
        }
    }

    @Override // com.bytedance.ies.xelement.input.LynxBaseInputView
    @AbstractC28528p
    public void sendDelEvent(ReadableMap readableMap, Callback callback) {
        boolean z;
        if (readableMap != null) {
            if ((this.f45536x ^ this.f45531G) == 0) {
                super.sendDelEvent(readableMap, callback);
                return;
            }
            Iterator<T> it = this.f45526A.iterator();
            loop0:
            while (true) {
                z = false;
                while (true) {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    T next = it.next();
                    if (!z) {
                        C19279c cVar = this.f45534v;
                        if (cVar == null) {
                            C89219l.m154710a("mEditText");
                        }
                        Editable text = cVar.getText();
                        if (text == null) {
                            C89219l.m154707a();
                        }
                        C89219l.m154709a((Object) text, "");
                        if (next.mo30680a(text)) {
                        }
                    }
                    z = true;
                }
            }
            if (!z) {
                try {
                    int i = readableMap.getInt("action");
                    if (i == 0) {
                        int i2 = readableMap.getInt("length");
                        C19279c cVar2 = this.f45534v;
                        if (cVar2 == null) {
                            C89219l.m154710a("mEditText");
                        }
                        C19282d a = cVar2.mo30688a();
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
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.xelement.input.LynxTextAreaView$d */
    public static final class C19269d implements TextView.OnEditorActionListener {

        /* renamed from: a */
        final /* synthetic */ C19279c f45542a;

        /* renamed from: b */
        final /* synthetic */ LynxTextAreaView f45543b;

        static {
            Covode.recordClassIndex(22048);
        }

        C19269d(C19279c cVar, LynxTextAreaView lynxTextAreaView) {
            this.f45542a = cVar;
            this.f45543b = lynxTextAreaView;
        }

        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            String str;
            if ((i != 6 && i != 2 && i != 3 && i != 4 && i != 5 && i != 0) || !this.f45543b.f45488h) {
                return false;
            }
            AbstractC28520j jVar = this.f45543b.mContext;
            C89219l.m154709a((Object) jVar, "");
            C28719c cVar = jVar.f67064e;
            C28725c cVar2 = new C28725c(this.f45543b.getSign(), "confirm");
            Editable text = this.f45542a.getText();
            if (text != null) {
                str = text.toString();
            } else {
                str = null;
            }
            cVar2.mo49838a("value", str);
            cVar.mo49834a(cVar2);
            return false;
        }
    }
}
