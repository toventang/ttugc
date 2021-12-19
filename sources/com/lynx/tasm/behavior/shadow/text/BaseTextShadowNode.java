package com.lynx.tasm.behavior.shadow.text;

import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.p1392b.C19386b;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.lynx.react.bridge.AbstractC28367a;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.react.bridge.ReadableType;
import com.lynx.tasm.base.TraceEvent;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.C28601c;
import com.lynx.tasm.behavior.shadow.C28542g;
import com.lynx.tasm.behavior.shadow.C28544i;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.utils.C28715e;
import com.lynx.tasm.utils.C28926j;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import java.text.Bidi;
import java.util.List;

public class BaseTextShadowNode extends ShadowNode {

    /* renamed from: a */
    private boolean f67158a;

    /* renamed from: b */
    private boolean f67159b;

    /* renamed from: c */
    private float f67160c = 1.0E21f;

    /* renamed from: o */
    public C28561k f67161o = new C28561k();

    /* renamed from: p */
    public boolean f67162p;

    /* renamed from: q */
    protected int f67163q;

    static {
        Covode.recordClassIndex(34552);
    }

    @AbstractC28525m(mo49059a = "direction", mo49063e = 0)
    public void setDirection(int i) {
        this.f67161o.f67195e = i;
        mo49092d();
    }

    @AbstractC28525m(mo49059a = "enable-font-scaling")
    public void setEnableFontScaling(String str) {
        m57102a(Boolean.parseBoolean(str));
    }

    @AbstractC28525m(mo49059a = "include-font-padding")
    public void setIncludeFontPadding(boolean z) {
        this.f67161o.f67206p = z;
        mo49092d();
    }

    @AbstractC28525m(mo49059a = "letter-spacing", mo49062d = 1.0E21f)
    public void setLetterSpacing(float f) {
        this.f67161o.f67202l = f;
        mo49092d();
    }

    @AbstractC28525m(mo49059a = "text-align", mo49063e = 3)
    public void setTextAlign(int i) {
        this.f67161o.f67194d = i;
        mo49092d();
    }

    @AbstractC28525m(mo49059a = "text-decoration", mo49063e = 0)
    public void setTextDecoration(int i) {
        this.f67161o.f67209s = i;
        mo49092d();
    }

    @AbstractC28525m(mo49059a = "text-overflow", mo49063e = 0)
    public void setTextOverflow(int i) {
        this.f67161o.f67200j = i;
        mo49092d();
    }

    @AbstractC28525m(mo49059a = "white-space", mo49063e = 0)
    public void setWhiteSpace(int i) {
        this.f67161o.f67199i = i;
        mo49092d();
    }

    /* renamed from: com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$b */
    public static class C28548b {

        /* renamed from: a */
        protected int f67167a;

        /* renamed from: b */
        protected int f67168b;

        /* renamed from: c */
        protected Object f67169c;

        static {
            Covode.recordClassIndex(34555);
        }

        /* renamed from: a */
        public void mo49146a(SpannableStringBuilder spannableStringBuilder) {
            int i;
            int i2 = this.f67167a;
            if (i2 == 0) {
                i = 18;
            } else {
                i = 34;
            }
            spannableStringBuilder.setSpan(this.f67169c, i2, this.f67168b, i);
        }

        public C28548b(int i, int i2, Object obj) {
            this.f67167a = i;
            this.f67168b = i2;
            this.f67169c = obj;
        }
    }

    @AbstractC28525m(mo49059a = "line-spacing", mo49062d = 0.0f)
    public void setLineSpacing(float f) {
        if (this.f67162p) {
            this.f67161o.f67203m = f;
        } else {
            this.f67161o.f67203m = C28926j.m57940c(f);
        }
        mo49092d();
    }

    @AbstractC28525m(mo49059a = "text-shadow")
    public void setTextShadow(ReadableArray readableArray) {
        this.f67161o.f67208r = null;
        if (readableArray != null) {
            List<C28601c> a = C28601c.m57197a(readableArray);
            if (a.size() != 0) {
                this.f67161o.f67208r = a.get(0);
            }
        }
    }

    @AbstractC28525m(mo49059a = "use-web-line-height")
    public void setUseWebLineHeight(boolean z) {
        if (this.f67159b != z) {
            this.f67159b = z;
            float f = this.f67160c;
            if (f != 1.0E21f) {
                setLineHeight(f);
            }
        }
    }

    @AbstractC28525m(mo49059a = "word-break")
    public void setWordBreakStrategy(int i) {
        if (i == 1) {
            this.f67163q = 1;
        } else if (i == 0) {
            this.f67163q = 2;
        } else {
            this.f67163q = 0;
        }
        mo49092d();
    }

    /* renamed from: a */
    private void m57102a(boolean z) {
        this.f67158a = z;
        setFontSize(this.f67161o.f67204n);
        for (int i = 0; i < mo49106f(); i++) {
            ShadowNode b = mo49103b(i);
            if (b instanceof BaseTextShadowNode) {
                ((BaseTextShadowNode) b).m57102a(this.f67158a);
            }
        }
    }

    @AbstractC28525m(mo49059a = C19386b.f45894a)
    public void setColor(AbstractC28367a aVar) {
        if (aVar.mo48559h() != ReadableType.Array) {
            if (aVar.mo48559h() == ReadableType.Int) {
                this.f67161o.f67193c = Integer.valueOf(aVar.mo48555d());
            } else {
                this.f67161o.f67193c = null;
            }
            mo49092d();
        }
    }

    @AbstractC28525m(mo49059a = "font-family")
    public void setFontFamily(String str) {
        if (str == null) {
            if (!TextUtils.isEmpty(this.f67161o.f67207q)) {
                this.f67161o.f67207q = null;
                mo49092d();
            }
        } else if (!str.equals(this.f67161o.f67207q)) {
            this.f67161o.f67207q = str;
            mo49092d();
        }
    }

    @AbstractC28525m(mo49059a = C19386b.f45895b, mo49062d = 1.0E21f)
    public void setFontSize(float f) {
        if (f != 1.0E21f) {
            f = (float) Math.round(f);
        }
        if (this.f67158a) {
            f = C28926j.m57939b(C28926j.m57940c(f)) * this.f67138k.mo49032a().getResources().getConfiguration().fontScale;
        }
        float f2 = (float) ((int) f);
        if (this.f67161o.f67204n != f2) {
            this.f67161o.f67204n = f2;
        }
        mo49092d();
    }

    @AbstractC28525m(mo49059a = "font-style", mo49063e = 0)
    public void setFontStyle(int i) {
        if (i == 0) {
            if (this.f67161o.f67198h != 0) {
                this.f67161o.f67198h = 0;
                mo49092d();
            }
        } else if ((i == 1 || i == 2) && this.f67161o.f67198h != 2) {
            this.f67161o.f67198h = 2;
            mo49092d();
        }
    }

    @AbstractC28525m(mo49059a = C19386b.f45896c, mo49063e = 0)
    public void setFontWeight(int i) {
        int i2 = 0;
        switch (i) {
            case 1:
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
            case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
            case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                i2 = 1;
                break;
        }
        if (i != this.f67161o.f67197g) {
            this.f67161o.f67197g = i;
            this.f67161o.f67198h = i2;
            mo49092d();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r3.f67161o.f67192b < 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r3.f67161o.f67192b = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r3.f67161o.f67192b = -1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
    @com.lynx.tasm.behavior.AbstractC28525m(mo49059a = "text-maxlength")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextMaxLength(java.lang.String r4) {
        /*
            r3 = this;
            r2 = -1
            com.lynx.tasm.behavior.shadow.text.k r1 = r3.f67161o     // Catch:{ all -> 0x0017 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0017 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0017 }
            r1.f67192b = r0     // Catch:{ all -> 0x0017 }
            r3.mo49092d()     // Catch:{ all -> 0x0017 }
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.f67161o
            int r0 = r0.f67192b
            if (r0 >= 0) goto L_0x0026
            goto L_0x0021
        L_0x0017:
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.f67161o     // Catch:{ all -> 0x0027 }
            r0.f67192b = r2     // Catch:{ all -> 0x0027 }
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.f67161o
            int r0 = r0.f67192b
            if (r0 >= 0) goto L_0x0026
        L_0x0021:
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.f67161o
            r0.f67192b = r2
            return
        L_0x0026:
            return
        L_0x0027:
            r1 = move-exception
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.f67161o
            int r0 = r0.f67192b
            if (r0 >= 0) goto L_0x0032
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.f67161o
            r0.f67192b = r2
        L_0x0032:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode.setTextMaxLength(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r3.f67161o.f67191a < 0) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r3.f67161o.f67191a = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r3.f67161o.f67191a = -1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
    @com.lynx.tasm.behavior.AbstractC28525m(mo49059a = "text-maxline")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setTextMaxLine(java.lang.String r4) {
        /*
            r3 = this;
            r2 = -1
            com.lynx.tasm.behavior.shadow.text.k r1 = r3.f67161o     // Catch:{ all -> 0x0017 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0017 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0017 }
            r1.f67191a = r0     // Catch:{ all -> 0x0017 }
            r3.mo49092d()     // Catch:{ all -> 0x0017 }
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.f67161o
            int r0 = r0.f67191a
            if (r0 >= 0) goto L_0x0026
            goto L_0x0021
        L_0x0017:
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.f67161o     // Catch:{ all -> 0x0027 }
            r0.f67191a = r2     // Catch:{ all -> 0x0027 }
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.f67161o
            int r0 = r0.f67191a
            if (r0 >= 0) goto L_0x0026
        L_0x0021:
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.f67161o
            r0.f67191a = r2
            return
        L_0x0026:
            return
        L_0x0027:
            r1 = move-exception
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.f67161o
            int r0 = r0.f67191a
            if (r0 >= 0) goto L_0x0032
            com.lynx.tasm.behavior.shadow.text.k r0 = r3.f67161o
            r0.f67191a = r2
        L_0x0032:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode.setTextMaxLine(java.lang.String):void");
    }

    @AbstractC28525m(mo49059a = "text-vertical-align")
    public void setTextVerticalAlign(String str) {
        if ("top".equals(str)) {
            this.f67161o.f67196f = 0;
        } else if ("center".equals(str)) {
            this.f67161o.f67196f = 1;
        } else if ("bottom".equals(str)) {
            this.f67161o.f67196f = 2;
        }
        mo49092d();
    }

    /* renamed from: com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode$a */
    public static class C28547a extends C28548b {

        /* renamed from: d */
        private final Layout.Alignment f67164d;

        /* renamed from: e */
        private final int f67165e;

        /* renamed from: f */
        private final boolean f67166f;

        static {
            Covode.recordClassIndex(34554);
        }

        @Override // com.lynx.tasm.behavior.shadow.text.BaseTextShadowNode.C28548b
        /* renamed from: a */
        public final void mo49146a(SpannableStringBuilder spannableStringBuilder) {
            int i;
            if (this.f67167a == 0) {
                i = 18;
            } else {
                i = 34;
            }
            Layout.Alignment alignment = this.f67164d;
            if (this.f67165e == 0 && !this.f67166f && !new Bidi(spannableStringBuilder.subSequence(this.f67167a, this.f67168b).toString(), -2).baseIsLeftToRight()) {
                alignment = alignment == Layout.Alignment.ALIGN_NORMAL ? Layout.Alignment.ALIGN_OPPOSITE : alignment == Layout.Alignment.ALIGN_OPPOSITE ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
            }
            spannableStringBuilder.setSpan(new LynxStandardAlignmentSpan(alignment), this.f67167a, this.f67168b, i);
        }

        public C28547a(int i, int i2, Layout.Alignment alignment, int i3, boolean z) {
            super(i, i2, null);
            this.f67164d = alignment;
            this.f67165e = i3;
            this.f67166f = z;
        }
    }

    @AbstractC28525m(mo49059a = "line-height", mo49062d = 1.0E21f)
    public void setLineHeight(float f) {
        this.f67160c = f;
        if (this.f67159b && f != 1.0E21f) {
            f = C28926j.m57938a((float) ((int) C28926j.m57940c(f)));
        } else if (this.f67158a) {
            f = C28926j.m57939b(C28926j.m57940c(f)) * this.f67138k.mo49032a().getResources().getConfiguration().fontScale;
        }
        if (this.f67161o.f67201k != f) {
            this.f67161o.f67201k = f;
            mo49092d();
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: b */
    public final void mo49104b(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            try {
                switch (nextKey.hashCode()) {
                    case -2137322088:
                        if (!nextKey.equals("include-font-padding")) {
                            break;
                        } else {
                            setIncludeFontPadding(readableMap.getBoolean(nextKey, false));
                            break;
                        }
                    case 125536225:
                        if (!nextKey.equals("use-web-line-height")) {
                            break;
                        } else {
                            setUseWebLineHeight(readableMap.getBoolean(nextKey, false));
                            break;
                        }
                    case 1629007544:
                        if (!nextKey.equals("text-maxline")) {
                            break;
                        } else {
                            setTextMaxLine(readableMap.getString(nextKey));
                            break;
                        }
                    case 2104465578:
                        if (!nextKey.equals("text-maxlength")) {
                            break;
                        } else {
                            setTextMaxLength(readableMap.getString(nextKey));
                            break;
                        }
                }
            } catch (Exception e) {
                e.printStackTrace();
                throw new RuntimeException("setProperty error: " + nextKey + "\n" + e.toString());
            }
        }
        super.mo49104b(vVar);
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: a */
    public final void mo49099a(ShadowNode shadowNode, int i) {
        super.mo49099a(shadowNode, i);
        if (shadowNode instanceof BaseTextShadowNode) {
            ((BaseTextShadowNode) shadowNode).m57102a(this.f67158a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo30989a(SpannableStringBuilder spannableStringBuilder, RawTextShadowNode rawTextShadowNode) {
        if (rawTextShadowNode.f67172b) {
            spannableStringBuilder.append((CharSequence) C28715e.m57502a(rawTextShadowNode.f67171a));
        } else {
            spannableStringBuilder.append((CharSequence) C28715e.m57503b(rawTextShadowNode.f67171a));
        }
    }

    /* renamed from: a */
    public void mo30991a(SpannableStringBuilder spannableStringBuilder, List<C28548b> list) {
        int length = spannableStringBuilder.length();
        int f = mo49106f();
        for (int i = 0; i < f; i++) {
            ShadowNode b = mo49103b(i);
            if (b instanceof RawTextShadowNode) {
                RawTextShadowNode rawTextShadowNode = (RawTextShadowNode) b;
                if (rawTextShadowNode.f67171a != null) {
                    mo30989a(spannableStringBuilder, rawTextShadowNode);
                }
            } else if (b instanceof BaseTextShadowNode) {
                BaseTextShadowNode baseTextShadowNode = (BaseTextShadowNode) b;
                baseTextShadowNode.mo30991a(spannableStringBuilder, list);
                C28561k kVar = this.f67161o;
                kVar.f67205o = baseTextShadowNode.f67161o.f67205o | kVar.f67205o;
            } else if (b instanceof AbsInlineImageShadowNode) {
                spannableStringBuilder.append("I");
                ((AbsInlineImageShadowNode) b).mo49116a(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), list);
                this.f67161o.f67205o = true;
            } else {
                throw new RuntimeException("Unexpected view type nested under text node: " + b.getClass());
            }
        }
        int length2 = spannableStringBuilder.length();
        if (length2 > length) {
            mo49125a(length, length2, list);
        }
    }

    /* renamed from: a */
    private void m57103a(int[] iArr, double[] dArr) {
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            float f = 1.0E21f;
            int i2 = 1;
            boolean z = true;
            switch (iArr[i]) {
                case 1:
                    setFontSize((float) dArr[i]);
                    break;
                case 2:
                    int i3 = (int) ((long) dArr[i]);
                    if (i3 == 0) {
                        i3 = -16777216;
                    }
                    this.f67161o.f67193c = Integer.valueOf(i3);
                    break;
                case 3:
                    this.f67161o.f67199i = (int) dArr[i];
                    break;
                case 4:
                    this.f67161o.f67200j = (int) dArr[i];
                    break;
                case ABRConfig.ABR_STARTUP_MODEL_KEY:
                    int i4 = (int) dArr[i];
                    switch (i4) {
                        case 1:
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            break;
                        case 2:
                        case 3:
                        case 4:
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                        default:
                            i2 = 0;
                            break;
                    }
                    this.f67161o.f67197g = i4;
                    this.f67161o.f67198h = i2;
                    break;
                case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                    int i5 = (int) dArr[i];
                    if (i5 == 0) {
                        if (this.f67161o.f67198h != 0) {
                            this.f67161o.f67198h = 0;
                            break;
                        } else {
                            break;
                        }
                    } else if ((i5 == 1 || i5 == 2) && this.f67161o.f67198h != 2) {
                        this.f67161o.f67198h = 2;
                        break;
                    }
                case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                    float f2 = (float) dArr[i];
                    if (f2 != -1.0f) {
                        f = f2;
                    }
                    setLineHeight(f);
                    break;
                case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                    if (((int) dArr[i]) == 0) {
                        z = false;
                    }
                    m57102a(z);
                    break;
                case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                    float f3 = (float) dArr[i];
                    if (f3 != -1.0f) {
                        f = f3;
                    }
                    this.f67161o.f67202l = f;
                    break;
                case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                    float f4 = (float) dArr[i];
                    if (f4 == -1.0f) {
                        f4 = 0.0f;
                    }
                    this.f67161o.f67203m = C28926j.m57940c(f4);
                    break;
                case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                    this.f67161o.f67194d = (int) dArr[i];
                    break;
                case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                    int i6 = (int) dArr[i];
                    if (i6 != 0) {
                        if (i6 == 1) {
                            this.f67163q = 1;
                            break;
                        } else {
                            this.f67163q = 0;
                            break;
                        }
                    } else {
                        this.f67163q = 2;
                        break;
                    }
                case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                    if (((int) dArr[i]) == 0) {
                        this.f67161o.f67209s &= -2;
                        break;
                    } else {
                        this.f67161o.f67209s |= 1;
                        break;
                    }
                case ABRConfig.ABR_SELECT_SCENE:
                    if (((int) dArr[i]) == 0) {
                        this.f67161o.f67209s &= -3;
                        break;
                    } else {
                        this.f67161o.f67209s |= 2;
                        break;
                    }
                case 15:
                    if (((int) dArr[i]) == 0) {
                        this.f67161o.f67208r = null;
                        break;
                    } else {
                        C28561k kVar = this.f67161o;
                        if (kVar.f67208r == null) {
                            kVar.f67208r = new C28601c();
                            break;
                        } else {
                            break;
                        }
                    }
                case 16:
                    this.f67161o.f67208r.f67343b = (float) dArr[i];
                    break;
                case 17:
                    this.f67161o.f67208r.f67344c = (float) dArr[i];
                    break;
                case LiveRechargeAgeThresholdSetting.DEFAULT:
                    this.f67161o.f67208r.f67345d = (float) dArr[i];
                    break;
                case 19:
                    this.f67161o.f67208r.f67342a = (int) ((long) dArr[i]);
                    break;
                case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                    if (this.f67139l == null) {
                        this.f67139l = new C28544i();
                    }
                    this.f67139l.f67151a = (int) dArr[i];
                    break;
                case 21:
                    if (this.f67139l == null) {
                        this.f67139l = new C28544i();
                    }
                    this.f67139l.f67152b = (float) dArr[i];
                    break;
            }
        }
    }

    @Override // com.lynx.tasm.behavior.shadow.ShadowNode
    /* renamed from: a */
    public final void mo49102a(int[] iArr, double[] dArr, String str) {
        String str2 = "FiberBaseText.setTextStyleData." + mo49105e();
        TraceEvent.m56864a(0, str2);
        if (iArr.length > 0 || !this.f67161o.f67207q.equals(str)) {
            mo49092d();
        }
        this.f67161o.f67207q = str;
        m57103a(iArr, dArr);
        TraceEvent.m56869b(0, str2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo49125a(int i, int i2, List<C28548b> list) {
        boolean z;
        if (this.f67161o.f67193c != null) {
            list.add(new C28548b(i, i2, new C28558h(this.f67161o.f67193c.intValue())));
        }
        if ((this.f67161o.f67209s & 2) != 0) {
            list.add(new C28548b(i, i2, new LynxStrikethroughSpan()));
        }
        if ((this.f67161o.f67209s & 1) != 0) {
            list.add(new C28548b(i, i2, new LynxUnderlineSpan()));
        }
        if (this.f67161o.f67195e == 0) {
            Layout.Alignment b = this.f67161o.mo49179b();
            int i3 = this.f67161o.f67195e;
            if (this.f67161o.f67194d == 3) {
                z = true;
            } else {
                z = false;
            }
            list.add(new C28547a(i, i2, b, i3, z));
        }
        if (this.f67161o.f67196f != -1 && Build.VERSION.SDK_INT > 25) {
            list.add(new C28548b(i, i2, new C28551a(this.f67161o.f67196f)));
        }
        if (!C28542g.m57093a(this.f67161o.f67201k)) {
            list.add(new C28548b(i, i2, new C28553c(this.f67161o.f67201k, this.f67162p)));
        }
        if (this.f67161o.f67208r != null) {
            list.add(new C28548b(i, i2, new C28559i(this.f67161o.f67208r)));
        }
        if (this.f67161o.f67202l != 1.0E21f && Build.VERSION.SDK_INT >= 21) {
            list.add(new C28548b(i, i2, new C28552b(this.f67161o.f67202l)));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            list.add(new C28548b(i, i2, new C28554d(this.f67161o.f67198h, this.f67161o.f67197g)));
        } else if (this.f67161o.f67198h == 1 || this.f67161o.f67198h == 2) {
            list.add(new C28548b(i, i2, new StyleSpan(this.f67161o.mo49178a())));
        }
    }
}
