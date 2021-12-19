package com.lynx.tasm.behavior;

import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.p2048a.AbstractC28464a;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.p2054c.C28731i;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.lynx.tasm.behavior.w */
public class C28717w {

    /* renamed from: a */
    public AbstractC28464a f67716a;

    /* renamed from: b */
    public AbstractC28464a f67717b;

    /* renamed from: c */
    public float f67718c = 0.0f;

    /* renamed from: d */
    public boolean f67719d;

    /* renamed from: e */
    final HashSet<Integer> f67720e = new HashSet<>();

    /* renamed from: f */
    private C28529q f67721f;

    /* renamed from: g */
    private GestureDetector f67722g = new GestureDetector(this.f67721f.f67111c, new C28718a(this, (byte) 0), new Handler(Looper.getMainLooper()));

    /* renamed from: h */
    private LinkedList<AbstractC28464a> f67723h = new LinkedList<>();

    /* renamed from: i */
    private PointF f67724i = new PointF(Float.MIN_VALUE, Float.MIN_VALUE);

    /* renamed from: j */
    private boolean f67725j;

    /* renamed from: k */
    private boolean f67726k;

    /* renamed from: l */
    private PointF f67727l;

    static {
        Covode.recordClassIndex(34811);
    }

    /* renamed from: c */
    private C28719c m57520c() {
        return this.f67721f.f67111c.f67064e;
    }

    /* renamed from: b */
    private void m57518b() {
        Iterator<AbstractC28464a> it = this.f67723h.iterator();
        while (it.hasNext()) {
            it.next().offResponseChain();
        }
        this.f67723h.clear();
        this.f67720e.clear();
    }

    /* renamed from: a */
    private void m57515a() {
        this.f67723h.clear();
        AbstractC28464a aVar = this.f67716a;
        if (aVar != null) {
            do {
                this.f67723h.push(aVar);
                aVar = aVar.parent();
            } while (aVar != null);
            while (!this.f67723h.isEmpty() && (this.f67723h.getLast().getEvents() == null || !this.f67723h.getLast().getEvents().containsKey("click"))) {
                this.f67723h.removeLast();
            }
            Iterator<AbstractC28464a> it = this.f67723h.iterator();
            while (it.hasNext()) {
                it.next().onResponseChain();
            }
            if (this.f67723h.isEmpty()) {
                this.f67726k = true;
            } else {
                this.f67726k = false;
            }
        }
    }

    /* renamed from: com.lynx.tasm.behavior.w$a */
    class C28718a extends GestureDetector.SimpleOnGestureListener {
        static {
            Covode.recordClassIndex(34812);
        }

        private C28718a() {
        }

        public final void onLongPress(MotionEvent motionEvent) {
            if (C28717w.this.f67716a != null) {
                C28717w wVar = C28717w.this;
                if (wVar.mo49831a(wVar.f67716a)) {
                    C28717w wVar2 = C28717w.this;
                    wVar2.mo49829a(wVar2.f67716a, "longpress", motionEvent.getX(), motionEvent.getY());
                }
            }
            super.onLongPress(motionEvent);
        }

        /* synthetic */ C28718a(C28717w wVar, byte b) {
            this();
        }
    }

    public C28717w(C28529q qVar) {
        this.f67721f = qVar;
    }

    /* renamed from: d */
    private void m57522d(MotionEvent motionEvent) {
        if (this.f67719d || this.f67725j || !mo49831a(this.f67716a)) {
            LLog.m56860b("Lynx", "not tap:" + this.f67719d + this.f67725j);
        } else {
            mo49829a(this.f67716a, "tap", motionEvent.getX(), motionEvent.getY());
        }
    }

    /* renamed from: c */
    private void m57521c(MotionEvent motionEvent) {
        Object obj;
        if (this.f67726k || this.f67719d || this.f67723h.isEmpty() || this.f67723h.getLast() == null || !mo49831a(this.f67723h.getLast())) {
            StringBuilder append = new StringBuilder("not click:").append(this.f67726k).append(this.f67719d);
            LinkedList<AbstractC28464a> linkedList = this.f67723h;
            if (linkedList != null) {
                obj = Boolean.valueOf(linkedList.isEmpty());
            } else {
                obj = "";
            }
            LLog.m56860b("Lynx", append.append(obj).toString());
            return;
        }
        mo49829a(this.f67723h.getLast(), "click", motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: e */
    private boolean m57523e(MotionEvent motionEvent) {
        C28529q qVar = this.f67721f;
        if (qVar == null || qVar.f67110b == null) {
            return true;
        }
        LinkedList linkedList = new LinkedList();
        for (AbstractC28464a b = m57517b(motionEvent, this.f67721f.f67110b); b != null; b = b.parent()) {
            linkedList.push(b);
        }
        if (linkedList.size() < this.f67723h.size()) {
            return true;
        }
        for (int i = 0; i < this.f67723h.size(); i++) {
            AbstractC28464a aVar = this.f67723h.get(i);
            if (aVar == null || aVar != linkedList.get(i)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m57516a(MotionEvent motionEvent) {
        this.f67725j = false;
        this.f67724i = new PointF(motionEvent.getX(), motionEvent.getY());
        this.f67719d = false;
        this.f67727l = new PointF(motionEvent.getX(), motionEvent.getY());
        this.f67720e.clear();
    }

    /* renamed from: b */
    private boolean m57519b(MotionEvent motionEvent) {
        PointF pointF = this.f67727l;
        if (pointF == null) {
            this.f67727l = new PointF(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        boolean z = false;
        if (pointF.x == motionEvent.getX() && this.f67727l.y == motionEvent.getY()) {
            return false;
        }
        PointF pointF2 = this.f67724i;
        if (pointF2 == null || Math.abs(pointF2.x - motionEvent.getX()) > this.f67718c || Math.abs(this.f67724i.y - motionEvent.getY()) > this.f67718c) {
            this.f67725j = true;
        }
        if (this.f67719d || ((!this.f67723h.isEmpty() && !mo49831a(this.f67723h.getLast())) || this.f67726k || m57523e(motionEvent))) {
            z = true;
        }
        this.f67726k = z;
        this.f67727l.x = motionEvent.getX();
        this.f67727l.y = motionEvent.getY();
        return true;
    }

    /* renamed from: a */
    public final boolean mo49831a(AbstractC28464a aVar) {
        if (aVar == null) {
            return false;
        }
        HashSet<Integer> hashSet = this.f67720e;
        if (hashSet == null || hashSet.isEmpty()) {
            return true;
        }
        Boolean bool = true;
        while (true) {
            if (aVar.parent() != aVar) {
                if (!this.f67720e.contains(Integer.valueOf(aVar.getSign()))) {
                    aVar = aVar.parent();
                    if (aVar == null) {
                        break;
                    }
                } else {
                    bool = false;
                    break;
                }
            } else {
                break;
            }
        }
        return bool.booleanValue();
    }

    /* renamed from: b */
    private AbstractC28464a m57517b(MotionEvent motionEvent, UIGroup uIGroup) {
        if (uIGroup == null) {
            uIGroup = this.f67721f.f67110b;
        }
        return uIGroup.hitTest(motionEvent.getX(), motionEvent.getY());
    }

    /* renamed from: a */
    private C28731i.C28732a m57514a(AbstractC28464a aVar, C28731i.C28732a aVar2) {
        if (!(aVar instanceof LynxBaseUI)) {
            return aVar2;
        }
        Rect boundingClientRect = this.f67721f.f67110b.getBoundingClientRect();
        Rect boundingClientRect2 = ((LynxBaseUI) aVar).getBoundingClientRect();
        return new C28731i.C28732a(((float) (boundingClientRect.left - boundingClientRect2.left)) + aVar2.f67747a, ((float) (boundingClientRect.top - boundingClientRect2.top)) + aVar2.f67748b);
    }

    /* renamed from: a */
    public final boolean mo49830a(MotionEvent motionEvent, UIGroup uIGroup) {
        boolean z;
        boolean z2;
        C28529q qVar;
        if (motionEvent.getActionMasked() == 0) {
            this.f67716a = m57517b(motionEvent, uIGroup);
            m57516a(motionEvent);
            m57515a();
            mo49829a(this.f67716a, "touchstart", motionEvent.getX(), motionEvent.getY());
        } else if (this.f67716a != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 1) {
                if (!this.f67716a.ignoreFocus() && !this.f67719d && mo49831a(this.f67716a)) {
                    AbstractC28464a aVar = this.f67717b;
                    AbstractC28464a aVar2 = this.f67716a;
                    this.f67717b = aVar2;
                    if (aVar2 != aVar) {
                        if (aVar2 != null && aVar2.isFocusable()) {
                            AbstractC28464a aVar3 = this.f67716a;
                            if (aVar == null || !aVar.isFocusable()) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            aVar3.onFocusChanged(true, z2);
                        }
                        if (aVar != null && aVar.isFocusable()) {
                            AbstractC28464a aVar4 = this.f67716a;
                            if (aVar4 == null || !aVar4.isFocusable()) {
                                z = false;
                            } else {
                                z = true;
                            }
                            aVar.onFocusChanged(false, z);
                        }
                    }
                }
                mo49829a(this.f67716a, "touchend", motionEvent.getX(), motionEvent.getY());
                m57521c(motionEvent);
                m57522d(motionEvent);
                m57518b();
            } else if (actionMasked != 2) {
                if (actionMasked == 3) {
                    mo49829a(this.f67716a, "touchcancel", motionEvent.getX(), motionEvent.getY());
                    m57518b();
                }
            } else if (m57519b(motionEvent)) {
                mo49829a(this.f67716a, "touchmove", motionEvent.getX(), motionEvent.getY());
            }
        }
        this.f67722g.onTouchEvent(motionEvent);
        AbstractC28464a aVar5 = this.f67716a;
        if (aVar5 == null || (qVar = this.f67721f) == null || aVar5 == qVar.f67110b) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo49829a(AbstractC28464a aVar, String str, float f, float f2) {
        if (m57520c() != null) {
            C28731i.C28732a aVar2 = new C28731i.C28732a(f, f2);
            m57520c().mo49836a(new C28731i(aVar.getSign(), str, aVar2, aVar2, m57514a(aVar, aVar2)));
            return;
        }
        LLog.m56856a(4, "Lynx", "sendTouchEvent: eventEmitter null");
    }
}
