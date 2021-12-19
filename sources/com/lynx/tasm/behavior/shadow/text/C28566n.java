package com.lynx.tasm.behavior.shadow.text;

import android.graphics.Typeface;
import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;

/* renamed from: com.lynx.tasm.behavior.shadow.text.n */
public class C28566n {

    /* renamed from: d */
    private static final BoringLayout.Metrics f67213d = new BoringLayout.Metrics();

    /* renamed from: a */
    public Layout f67214a;

    /* renamed from: b */
    final C28570p f67215b;

    /* renamed from: c */
    boolean f67216c;

    /* renamed from: e */
    private Typeface f67217e;

    /* renamed from: f */
    private float f67218f = -1.0f;

    /* renamed from: g */
    private int f67219g = -1;

    /* renamed from: h */
    private int f67220h = -1;

    /* JADX WARNING: Removed duplicated region for block: B:108:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0276 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0213  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0220  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m57138a(com.lynx.tasm.behavior.AbstractC28520j r31) {
        /*
        // Method dump skipped, instructions count: 3790
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lynx.tasm.behavior.shadow.text.C28566n.m57138a(com.lynx.tasm.behavior.j):void");
    }

    static {
        Covode.recordClassIndex(34582);
    }

    /* renamed from: com.lynx.tasm.behavior.shadow.text.n$a */
    public static class C28567a extends Exception {

        /* renamed from: a */
        private String f67221a;

        static {
            Covode.recordClassIndex(34583);
        }

        public C28567a(String str) {
            this.f67221a = str;
        }
    }

    C28566n(AbstractC28520j jVar, C28570p pVar) {
        C28558h[] hVarArr;
        this.f67215b = pVar;
        m57138a(jVar);
        if (pVar.f67230g) {
            Layout layout = this.f67214a;
            if (layout.getEllipsisCount(layout.getLineCount() - 1) != 0 && (pVar.f67224a.f67231a instanceof SpannableStringBuilder)) {
                int lineCount = this.f67214a.getLineCount() - 1;
                int lineStart = this.f67214a.getLineStart(lineCount) + this.f67214a.getEllipsisStart(lineCount);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(pVar.f67224a.f67231a);
                C28558h[] hVarArr2 = (C28558h[]) spannableStringBuilder.getSpans(0, 1, C28558h.class);
                if (hVarArr2 != null && hVarArr2.length != 0 && (hVarArr = (C28558h[]) spannableStringBuilder.getSpans(lineStart, lineStart + 1, C28558h.class)) != null && hVarArr.length != 0) {
                    C28558h hVar = hVarArr[hVarArr.length - 1];
                    int spanStart = spannableStringBuilder.getSpanStart(hVar);
                    int spanEnd = spannableStringBuilder.getSpanEnd(hVar);
                    spannableStringBuilder.removeSpan(hVar);
                    if (spanStart < lineStart) {
                        spannableStringBuilder.setSpan(hVar, spanStart, lineStart, 33);
                    }
                    spannableStringBuilder.setSpan(new C28558h(hVarArr2[0].f67189a), lineStart, spanEnd, 34);
                    pVar.f67224a.f67231a = spannableStringBuilder;
                    this.f67214a = null;
                    m57138a(jVar);
                }
            }
        }
    }

    /* renamed from: a */
    private StaticLayout.Builder m57137a(CharSequence charSequence, Layout.Alignment alignment, TextPaint textPaint, float f) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, (int) Math.floor((double) f));
        obtain.setAlignment(alignment);
        obtain.setLineSpacing(this.f67215b.f67224a.f67232b.f67203m, 1.0f);
        obtain.setIncludePad(this.f67215b.f67224a.f67232b.f67206p);
        obtain.setTextDirection(this.f67215b.f67224a.f67232b.mo49180c());
        obtain.setBreakStrategy(this.f67215b.f67229f);
        if (Build.VERSION.SDK_INT >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        return obtain;
    }
}
