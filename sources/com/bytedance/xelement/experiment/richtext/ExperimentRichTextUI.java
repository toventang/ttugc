package com.bytedance.xelement.experiment.richtext;

import android.content.Context;
import android.webkit.WebSettings;
import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.AbstractC28525m;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.p2082ss.android.newmedia.p2167e.p2168a.C30140d;
import p4600h.p4611f.p4613b.C89219l;

public final class ExperimentRichTextUI extends LynxUI<C30140d> {
    static {
        Covode.recordClassIndex(27808);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void dispatchProperties(C28716v vVar) {
        ReadableMap readableMap = vVar.f67715a;
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            if (nextKey.hashCode() == 3213227 && nextKey.equals("html")) {
                setSpan(readableMap.getString(nextKey));
            } else {
                super.dispatchProperties(vVar);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExperimentRichTextUI(AbstractC28520j jVar) {
        super(jVar);
        C89219l.m154721d(jVar, "");
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public final /* synthetic */ C30140d createView(Context context) {
        if (context == null) {
            C89219l.m154715b();
        }
        C30140d dVar = new C30140d(context);
        dVar.setVerticalScrollBarEnabled(false);
        dVar.setHorizontalScrollBarEnabled(false);
        dVar.setOnTouchListener(View$OnTouchListenerC23706a.f56057a);
        return dVar;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public final void setFontSize(float f) {
        super.setFontSize(f);
        WebSettings settings = ((C30140d) this.mView).getSettings();
        if (settings != null) {
            settings.setDefaultFontSize((int) f);
        }
        ((C30140d) this.mView).reload();
        invalidate();
    }

    @AbstractC28525m(mo49059a = "html")
    public final void setSpan(String str) {
        if (str == null) {
            str = "";
        }
        ((C30140d) this.mView).loadData(str, "text/html; charset=utf-8", "UTF-8");
        invalidate();
    }
}
