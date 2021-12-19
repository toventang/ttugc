package com.lynx.tasm.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxUI;
import com.lynx.tasm.image.C28805c;
import com.lynx.tasm.p2054c.C28723a;
import java.util.Map;

public class LynxImageUI extends LynxUI<C28815e> {

    /* renamed from: a */
    public final C28805c f67923a;

    static {
        Covode.recordClassIndex(34894);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onAttach() {
        super.onAttach();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onDetach() {
        super.onDetach();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void destroy() {
        this.f67923a.mo49923d();
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        this.f67923a.mo49916a(getWidth(), getHeight(), this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom, this.mBorderLeftWidth, this.mBorderTopWidth, this.mBorderRightWidth, this.mBorderBottomWidth);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void afterPropsUpdated(C28716v vVar) {
        super.afterPropsUpdated(vVar);
        this.f67923a.mo49918a(vVar);
    }

    /* Return type fixed from 'android.view.View' to match base method */
    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI
    public /* synthetic */ C28815e createView(Context context) {
        C28815e eVar = new C28815e(context);
        eVar.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.lynx.tasm.image.LynxImageUI.View$OnAttachStateChangeListenerC287912 */

            /* renamed from: b */
            private boolean f67926b;

            static {
                Covode.recordClassIndex(34898);
            }

            public final void onViewAttachedToWindow(View view) {
                if (this.f67926b) {
                    LynxImageUI.this.f67923a.mo49921b();
                }
                this.f67926b = false;
            }

            public final void onViewDetachedFromWindow(View view) {
                this.f67926b = true;
                LynxImageUI.this.f67923a.mo49922c();
            }
        });
        return eVar;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setEvents(Map<String, C28723a> map) {
        super.setEvents(map);
        this.f67923a.mo49920a(map);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxUI, com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updateAttributes(C28716v vVar) {
        super.updateAttributes(vVar);
        this.f67923a.mo49918a(vVar);
    }

    public LynxImageUI(AbstractC28520j jVar) {
        super(jVar);
        C28805c cVar = new C28805c(jVar, this, new C28805c.AbstractC28813a() {
            /* class com.lynx.tasm.image.LynxImageUI.C287901 */

            static {
                Covode.recordClassIndex(34897);
            }

            @Override // com.lynx.tasm.image.C28805c.AbstractC28813a
            /* renamed from: a */
            public final void mo49906a(Bitmap bitmap) {
                C28815e eVar = (C28815e) LynxImageUI.this.mView;
                if (eVar.f68008a != null) {
                    eVar.f68008a.mo49926a();
                }
                eVar.f68011d = bitmap;
                eVar.invalidate();
            }

            @Override // com.lynx.tasm.image.C28805c.AbstractC28813a
            /* renamed from: b */
            public final void mo49907b(Bitmap bitmap) {
                C28815e eVar = (C28815e) LynxImageUI.this.mView;
                if (eVar.f68009b != null) {
                    eVar.f68009b.mo49926a();
                }
                eVar.f68012e = bitmap;
                eVar.invalidate();
            }
        });
        this.f67923a = cVar;
        ((C28815e) this.mView).f68010c = cVar.f67966a;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setBorderRadius(int i, float f, float f2) {
        super.setBorderRadius(i, f, f2);
        this.f67923a.mo49915a(i, f, f2);
    }
}
