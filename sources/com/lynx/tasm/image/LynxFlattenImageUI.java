package com.lynx.tasm.image;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxFlattenUI;
import com.lynx.tasm.image.C28805c;
import com.lynx.tasm.image.p2061b.C28799c;
import com.lynx.tasm.p2054c.C28723a;
import java.util.Map;

public class LynxFlattenImageUI extends LynxFlattenUI {

    /* renamed from: b */
    public AbstractC28814d f67916b;

    /* renamed from: c */
    public AbstractC28814d f67917c;

    /* renamed from: d */
    public Bitmap f67918d;

    /* renamed from: e */
    public Bitmap f67919e;

    /* renamed from: f */
    private final C28805c f67920f;

    /* renamed from: g */
    private final C28794b f67921g;

    static {
        Covode.recordClassIndex(34890);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI, com.lynx.tasm.behavior.p2052ui.LynxFlattenUI
    public void onAttach() {
        super.onAttach();
        this.f67920f.mo49921b();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void destroy() {
        this.f67919e = null;
        this.f67918d = null;
        this.f67920f.mo49923d();
        AbstractC28814d dVar = this.f67916b;
        if (dVar != null) {
            dVar.mo49928b();
            this.f67916b = null;
        }
        AbstractC28814d dVar2 = this.f67917c;
        if (dVar2 != null) {
            dVar2.mo49928b();
            this.f67917c = null;
        }
        super.destroy();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onDetach() {
        this.f67919e = null;
        this.f67918d = null;
        this.f67920f.mo49922c();
        AbstractC28814d dVar = this.f67916b;
        if (dVar != null) {
            dVar.mo49928b();
            this.f67916b = null;
        }
        AbstractC28814d dVar2 = this.f67917c;
        if (dVar2 != null) {
            dVar2.mo49928b();
            this.f67917c = null;
        }
        super.onDetach();
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void onLayoutUpdated() {
        super.onLayoutUpdated();
        this.f67920f.mo49916a(getWidth(), getHeight(), this.mPaddingLeft, this.mPaddingTop, this.mPaddingRight, this.mPaddingBottom, this.mBorderLeftWidth, this.mBorderTopWidth, this.mBorderRightWidth, this.mBorderBottomWidth);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void afterPropsUpdated(C28716v vVar) {
        super.afterPropsUpdated(vVar);
        this.f67920f.mo49918a(vVar);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setEvents(Map<String, C28723a> map) {
        super.setEvents(map);
        this.f67920f.mo49920a(map);
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void updateAttributes(C28716v vVar) {
        super.updateAttributes(vVar);
        this.f67920f.mo49918a(vVar);
    }

    public LynxFlattenImageUI(AbstractC28520j jVar) {
        super(jVar);
        C28805c cVar = new C28805c(jVar, this, new C28805c.AbstractC28813a() {
            /* class com.lynx.tasm.image.LynxFlattenImageUI.C287891 */

            static {
                Covode.recordClassIndex(34893);
            }

            @Override // com.lynx.tasm.image.C28805c.AbstractC28813a
            /* renamed from: a */
            public final void mo49906a(Bitmap bitmap) {
                if (LynxFlattenImageUI.this.f67916b != null) {
                    LynxFlattenImageUI.this.f67916b.mo49926a();
                }
                LynxFlattenImageUI.this.f67918d = bitmap;
                LynxFlattenImageUI.this.invalidate();
            }

            @Override // com.lynx.tasm.image.C28805c.AbstractC28813a
            /* renamed from: b */
            public final void mo49907b(Bitmap bitmap) {
                if (LynxFlattenImageUI.this.f67917c != null) {
                    LynxFlattenImageUI.this.f67917c.mo49926a();
                }
                LynxFlattenImageUI.this.f67919e = bitmap;
                LynxFlattenImageUI.this.invalidate();
            }
        });
        this.f67920f = cVar;
        this.f67921g = cVar.f67966a;
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxFlattenUI
    /* renamed from: c */
    public final void mo49320c(Canvas canvas) {
        super.mo49320c(canvas);
        if (this.f67918d != null) {
            if (this.f67916b == null) {
                this.f67916b = C28799c.m57647a();
            }
            this.f67916b.mo49927a(canvas, this.f67918d, this.f67921g);
        } else if (this.f67919e != null) {
            if (this.f67917c == null) {
                this.f67917c = C28799c.m57648b();
            }
            this.f67917c.mo49927a(canvas, this.f67919e, this.f67921g);
        }
    }

    @Override // com.lynx.tasm.behavior.p2052ui.LynxBaseUI
    public void setBorderRadius(int i, float f, float f2) {
        super.setBorderRadius(i, f, f2);
        this.f67920f.mo49915a(i, f, f2);
    }
}
