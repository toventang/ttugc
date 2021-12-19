package com.bytedance.creativex.recorder.gesture;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1215v;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout;
import com.p2082ss.android.ugc.aweme.AbstractC33974au;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84882b;
import com.p2082ss.android.ugc.tools.utils.p4361a.C84885c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class DefaultGesturePresenter implements VideoRecordGestureLayout.AbstractC14312a, AbstractC33974au {

    /* renamed from: a */
    public boolean f34658a = true;

    /* renamed from: b */
    public float f34659b = 0.0f;

    /* renamed from: c */
    public boolean f34660c;

    /* renamed from: d */
    boolean f34661d = true;

    /* renamed from: e */
    private List<AbstractC14318d> f34662e = new ArrayList();

    /* renamed from: f */
    private Map<Integer, Integer> f34663f = new HashMap();

    /* renamed from: g */
    private VideoRecordGestureLayout f34664g;

    /* renamed from: h */
    private AbstractC14324b f34665h;

    /* renamed from: i */
    private int f34666i;

    static {
        Covode.recordClassIndex(16380);
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            disAttachView();
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: a */
    public final boolean mo23048a(ScaleGestureDetector scaleGestureDetector) {
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23048a(scaleGestureDetector)) {
                return true;
            }
        }
        AbstractC14324b bVar = this.f34665h;
        if (bVar != null) {
            return bVar.mo23112c();
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: a */
    public final boolean mo23051a(C84885c cVar) {
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23051a(cVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: a */
    public final boolean mo23049a(C84882b bVar) {
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23049a(bVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: a */
    public final boolean mo23050a(C84882b bVar, float f, float f2) {
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23050a(bVar, f, f2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    private boolean m26022d() {
        if (!this.f34658a) {
            return true;
        }
        return false;
    }

    @AbstractC1215v(mo4029a = AbstractC1196i.EnumC1198a.ON_DESTROY)
    public void disAttachView() {
        this.f34664g.setOnGestureListener(null);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: c */
    public final void mo23059c() {
        if (!m26022d()) {
            Iterator<AbstractC14318d> it = this.f34662e.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: b */
    public final boolean mo23054b() {
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23054b()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: a */
    public final boolean mo23044a() {
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23044a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo23043a(AbstractC14318d dVar) {
        mo23040a(1, dVar);
    }

    /* renamed from: a */
    public final void mo23042a(View view) {
        if (view instanceof VideoRecordGestureLayout) {
            VideoRecordGestureLayout videoRecordGestureLayout = (VideoRecordGestureLayout) view;
            this.f34664g = videoRecordGestureLayout;
            videoRecordGestureLayout.setOnGestureListener(this);
        }
    }

    /* renamed from: a */
    public final AbstractC14318d mo23039a(int i) {
        Integer num = this.f34663f.get(Integer.valueOf(i));
        if (num == null) {
            return null;
        }
        return this.f34662e.get(num.intValue());
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: f */
    public final void mo23068f(MotionEvent motionEvent) {
        if (!m26022d()) {
            for (AbstractC14318d dVar : this.f34662e) {
                if (dVar != null) {
                    dVar.mo23104g(motionEvent);
                }
            }
        }
    }

    /* renamed from: g */
    private boolean m26023g(MotionEvent motionEvent) {
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23062c(motionEvent)) {
                return true;
            }
        }
        AbstractC14324b bVar = this.f34665h;
        if (bVar == null || !bVar.mo23105a()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: b */
    public final void mo23053b(C84882b bVar) {
        if (!m26022d()) {
            for (AbstractC14318d dVar : this.f34662e) {
                if (dVar != null) {
                    dVar.mo23053b(bVar);
                }
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: d */
    public final boolean mo23064d(MotionEvent motionEvent) {
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23064d(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: e */
    public final boolean mo23067e(MotionEvent motionEvent) {
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23067e(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: c */
    public final boolean mo23061c(float f) {
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23061c(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: b */
    public final boolean mo23055b(float f) {
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23055b(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: c */
    public final boolean mo23062c(MotionEvent motionEvent) {
        if (m26022d() || !this.f34661d) {
            return false;
        }
        this.f34661d = false;
        new Handler().postDelayed(new RunnableC14309a(this), 300);
        return m26023g(motionEvent);
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: a */
    public final boolean mo23045a(float f) {
        if (m26022d()) {
            return false;
        }
        AbstractC14324b bVar = this.f34665h;
        if (bVar != null) {
            bVar.mo23113d();
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23045a(f)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: b */
    public final boolean mo23056b(MotionEvent motionEvent) {
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23056b(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: a */
    public final boolean mo23046a(MotionEvent motionEvent) {
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23046a(motionEvent)) {
                return true;
            }
        }
        AbstractC14324b bVar = this.f34665h;
        if (bVar == null || !bVar.mo23108a(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: b */
    public final boolean mo23058b(ScaleGestureDetector scaleGestureDetector) {
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23058b(scaleGestureDetector)) {
                return true;
            }
        }
        AbstractC14324b bVar = this.f34665h;
        if (bVar != null) {
            scaleGestureDetector.getScaleFactor();
            if (bVar.mo23110b()) {
                return true;
            }
        }
        AbstractC14324b bVar2 = this.f34665h;
        if (bVar2 != null) {
            return bVar2.mo23109a(scaleGestureDetector);
        }
        return false;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: b */
    public final void mo23052b(MotionEvent motionEvent, int[] iArr) {
        if (!m26022d()) {
            for (AbstractC14318d dVar : this.f34662e) {
                if (dVar != null) {
                    dVar.mo23052b(motionEvent, iArr);
                }
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: d */
    public final void mo23063d(MotionEvent motionEvent, int[] iArr) {
        if (!m26022d()) {
            for (AbstractC14318d dVar : this.f34662e) {
                if (dVar != null) {
                    dVar.mo23063d(motionEvent, iArr);
                }
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: e */
    public final void mo23066e(MotionEvent motionEvent, int[] iArr) {
        if (!m26022d()) {
            for (AbstractC14318d dVar : this.f34662e) {
                if (dVar != null) {
                    dVar.mo23066e(motionEvent, iArr);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo23040a(int i, AbstractC14318d dVar) {
        Integer num = this.f34663f.get(Integer.valueOf(i));
        if (num != null) {
            this.f34662e.set(num.intValue(), dVar);
            return;
        }
        this.f34662e.add(dVar);
        this.f34663f.put(Integer.valueOf(i), Integer.valueOf(this.f34662e.size() - 1));
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: c */
    public final void mo23060c(MotionEvent motionEvent, int[] iArr) {
        if (!m26022d()) {
            for (AbstractC14318d dVar : this.f34662e) {
                if (dVar != null) {
                    dVar.mo23060c(motionEvent, iArr);
                }
            }
        }
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: a */
    public final void mo23041a(MotionEvent motionEvent, int[] iArr) {
        if (!m26022d()) {
            for (AbstractC14318d dVar : this.f34662e) {
                if (dVar != null) {
                    dVar.mo23041a(motionEvent, iArr);
                }
            }
        }
    }

    public DefaultGesturePresenter(Context context, AbstractC1204m mVar, AbstractC14324b bVar, View view) {
        this.f34665h = bVar;
        mo23042a(view);
        mVar.getLifecycle().mo4012a(this);
        this.f34666i = ViewConfiguration.get(context).getScaledPagingTouchSlop();
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: b */
    public final boolean mo23057b(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        boolean z = false;
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23057b(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        if (!this.f34660c && Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY())) {
            AbstractC14324b bVar = this.f34665h;
            if (bVar != null && bVar.mo23107a(f, this.f34659b)) {
                z = true;
            }
            this.f34659b = 0.0f;
        }
        return z;
    }

    @Override // com.bytedance.creativex.recorder.gesture.api.VideoRecordGestureLayout.AbstractC14312a
    /* renamed from: a */
    public final boolean mo23047a(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        AbstractC14324b bVar;
        if (m26022d()) {
            return false;
        }
        for (AbstractC14318d dVar : this.f34662e) {
            if (dVar != null && dVar.mo23047a(motionEvent, motionEvent2, f, f2)) {
                return true;
            }
        }
        int abs = (int) Math.abs(motionEvent.getX() - motionEvent2.getX());
        int abs2 = (int) Math.abs(motionEvent.getY() - motionEvent2.getY());
        if (abs > this.f34666i && abs > abs2 && !this.f34660c) {
            float width = this.f34659b + (f / ((float) this.f34664g.getWidth()));
            this.f34659b = width;
            float min = Math.min(width, 1.0f);
            this.f34659b = min;
            float max = Math.max(min, -1.0f);
            this.f34659b = max;
            AbstractC14324b bVar2 = this.f34665h;
            if (bVar2 == null || !bVar2.mo23106a(max)) {
                return false;
            }
            return true;
        } else if (abs >= abs2 || (bVar = this.f34665h) == null || !bVar.mo23111b(f2)) {
            return false;
        } else {
            return true;
        }
    }
}
