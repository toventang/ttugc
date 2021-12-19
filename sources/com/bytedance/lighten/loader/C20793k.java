package com.bytedance.lighten.loader;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.p1477a.C20765u;
import com.facebook.drawee.p1855f.C24246a;
import com.facebook.drawee.p1855f.C24247b;
import com.facebook.drawee.p1855f.C24250e;
import com.facebook.drawee.p1857h.AbstractC24256b;
import com.facebook.drawee.view.C24261b;

/* renamed from: com.bytedance.lighten.loader.k */
final class C20793k {
    static {
        Covode.recordClassIndex(24369);
    }

    /* renamed from: com.bytedance.lighten.loader.k$a */
    static class View$OnAttachStateChangeListenerC20794a implements View.OnAttachStateChangeListener, View.OnTouchListener {

        /* renamed from: a */
        C24261b<AbstractC24256b> f49199a;

        static {
            Covode.recordClassIndex(24370);
        }

        public View$OnAttachStateChangeListenerC20794a(C24261b<AbstractC24256b> bVar) {
            this.f49199a = bVar;
        }

        public final void onViewAttachedToWindow(View view) {
            C24261b<AbstractC24256b> bVar = this.f49199a;
            if (bVar != null) {
                bVar.mo40003b();
            }
        }

        public final void onViewDetachedFromWindow(View view) {
            C24261b<AbstractC24256b> bVar = this.f49199a;
            if (bVar != null) {
                bVar.mo40005c();
            }
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C24261b<AbstractC24256b> bVar = this.f49199a;
            if (bVar == null || !bVar.mo40002a(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    static C24246a m39127a(ImageView imageView, C20765u uVar) {
        if (imageView == null || uVar == null) {
            return null;
        }
        C24250e eVar = new C24250e();
        if (uVar.f49082v != null) {
            eVar = C20805q.m39137a(eVar, uVar.f49082v);
        }
        C24247b bVar = new C24247b(imageView.getResources());
        bVar.f57492q = uVar.f49079s;
        bVar.f57495t = eVar;
        if (uVar.f49081u != null) {
            bVar.mo39976a(C20828x.m39185a(uVar.f49081u));
        }
        if (uVar.f49074n > 0) {
            bVar.mo39974a(uVar.f49074n);
            if (uVar.f49076p != null) {
                bVar.f57482g = C20828x.m39185a(uVar.f49076p);
            }
        } else if (uVar.f49075o != null) {
            bVar.f57481f = uVar.f49075o;
        }
        if (uVar.f49077q > 0) {
            bVar.mo39977b(uVar.f49077q);
            if (uVar.f49078r != null) {
                bVar.f57486k = C20828x.m39185a(uVar.f49078r);
            }
        }
        if (uVar.f49057L > 0) {
            bVar.f57483h = bVar.f57478c.getDrawable(uVar.f49057L);
            if (uVar.f49058M != null) {
                bVar.f57484i = C20828x.m39185a(uVar.f49058M);
            }
        }
        if (uVar.f49073m > 0) {
            bVar.f57479d = uVar.f49073m;
        }
        return bVar.mo39973a();
    }
}
