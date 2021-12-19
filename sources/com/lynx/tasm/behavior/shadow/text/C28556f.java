package com.lynx.tasm.behavior.shadow.text;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.p2048a.AbstractC28464a;
import com.lynx.tasm.p2054c.C28723a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.lynx.tasm.behavior.shadow.text.f */
public class C28556f extends ClickableSpan implements AbstractC28464a {

    /* renamed from: a */
    public AbstractC28464a f67185a;

    /* renamed from: b */
    private int f67186b;

    /* renamed from: c */
    private Map<String, C28723a> f67187c;

    static {
        Covode.recordClassIndex(34572);
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public boolean blockNativeEvent() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public boolean ignoreFocus() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public boolean isFocusable() {
        return false;
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public void offResponseChain() {
    }

    public void onClick(View view) {
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public void onFocusChanged(boolean z, boolean z2) {
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public void onResponseChain() {
    }

    public void updateDrawState(TextPaint textPaint) {
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public Map<String, C28723a> getEvents() {
        return this.f67187c;
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public int getSign() {
        return this.f67186b;
    }

    @Override // com.lynx.tasm.behavior.p2048a.AbstractC28464a
    public AbstractC28464a parent() {
        return this.f67185a;
    }

    public C28556f(int i, Map<String, C28723a> map) {
        this.f67186b = i;
        if (map != null) {
            HashMap hashMap = new HashMap();
            this.f67187c = hashMap;
            hashMap.putAll(map);
            return;
        }
        this.f67187c = null;
    }
}
