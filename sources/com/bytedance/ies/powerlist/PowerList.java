package com.bytedance.ies.powerlist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1204m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.analytics.p124a.View$OnAttachStateChangeListenerC2587f;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.header.C17660a;
import com.bytedance.ies.powerlist.header.FixedViewCell;
import com.bytedance.ies.powerlist.optimize.p1233a.C17664b;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.ies.powerlist.page.AbstractC17689c;
import com.bytedance.ies.powerlist.page.EnumC17688b;
import com.bytedance.ies.powerlist.page.config.AbstractC17692b;
import com.bytedance.ies.powerlist.page.config.C17693c;
import java.util.Iterator;
import java.util.Map;
import p4600h.C89388w;
import p4600h.p4601a.C89064i;
import p4600h.p4611f.p4613b.C89219l;

public class PowerList extends RecyclerView implements View.OnAttachStateChangeListener {

    /* renamed from: O */
    public PowerAdapter f42167O;

    static {
        Covode.recordClassIndex(20185);
    }

    public PowerStub getPrimaryStub() {
        return this.f42167O.mo28058g();
    }

    public int getFooterCount() {
        return getPrimaryStub().mo28100b();
    }

    public int getHeaderCount() {
        return getPrimaryStub().mo28096a();
    }

    public C17656f<AbstractC17641a> getState() {
        PowerAdapter powerAdapter = this.f42167O;
        if (!powerAdapter.f42112c) {
            return null;
        }
        PowerStub powerStub = powerAdapter.f42110a;
        if (powerStub == null) {
            C89219l.m154710a("mainStub");
        }
        return powerStub.f42169a;
    }

    public PowerList(Context context) {
        this(context, null);
    }

    /* renamed from: i */
    public final void mo28088i(View view) {
        mo28079a(0, view);
    }

    public void setListConfig(C17693c cVar) {
        this.f42167O.mo28051a(cVar, EnumC17688b.Direct);
    }

    /* renamed from: a */
    public final void mo28080a(AbstractC17654e eVar) {
        this.f42167O.mo28048a(eVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.AbstractC1350a aVar) {
        if (aVar instanceof PowerAdapter) {
            super.setAdapter(aVar);
            return;
        }
        throw new RuntimeException("Not Allow setAdapter in PowerList");
    }

    public void setOrientation(int i) {
        getContext();
        setLayoutManager(new LinearLayoutManager(i, false));
    }

    /* renamed from: a */
    public final void mo28081a(AbstractC17689c cVar) {
        this.f42167O.mo28049a(cVar);
    }

    /* renamed from: a */
    public final void mo28082a(AbstractC17692b<?> bVar) {
        this.f42167O.mo28050a(bVar, false, getState());
    }

    /* renamed from: j */
    public final void mo28089j(View view) {
        PowerStub primaryStub = getPrimaryStub();
        if (view != null) {
            int i = primaryStub.f42171c;
            primaryStub.f42171c = i + 1;
            primaryStub.f42176h.add(primaryStub.f42176h.size(), new C17660a(view, i));
            primaryStub.f42172d.put(Integer.valueOf(i), FixedViewCell.class);
            primaryStub.mo28101c();
        }
    }

    public void setViewTypeMap(Map<Class<? extends PowerCell<?>>, Object> map) {
        PowerAdapter powerAdapter = this.f42167O;
        if (map != null) {
            for (Map.Entry<Class<? extends PowerCell<?>>, Object> entry : map.entrySet()) {
                Class<? extends PowerCell<?>> key = entry.getKey();
                if (key != null) {
                    powerAdapter.mo28056e().put(key, entry.getValue());
                } else {
                    throw new C89388w("null cannot be cast to non-null type");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo28083a(Class<? extends PowerCell<?>>... clsArr) {
        PowerAdapter powerAdapter = this.f42167O;
        C89219l.m154719c(clsArr, "");
        PowerStub g = powerAdapter.mo28058g();
        if (g != null) {
            g.mo28099a(C89064i.m154508i(clsArr));
        }
        C17664b bVar = powerAdapter.mo28062k().f42258b;
        if (bVar != null) {
            bVar.mo28153b();
        }
    }

    public void onViewAttachedToWindow(View view) {
        AbstractC1196i lifecycle;
        PowerAdapter powerAdapter = this.f42167O;
        powerAdapter.f42121l = true;
        AbstractC1204m j = powerAdapter.mo28061j();
        if (!(j == null || (lifecycle = j.getLifecycle()) == null)) {
            lifecycle.mo4013b(powerAdapter);
        }
        Iterator<T> it = powerAdapter.mo28046a().iterator();
        while (it.hasNext()) {
            it.next().mo28098a(powerAdapter.mo28061j());
        }
        if (powerAdapter.getLifecycle().mo4011a().compareTo((Enum) AbstractC1196i.EnumC1199b.CREATED) < 0) {
            powerAdapter.f42122m.mo4016a(AbstractC1196i.EnumC1198a.ON_CREATE);
        }
    }

    public void onViewDetachedFromWindow(View view) {
        AbstractC1196i lifecycle;
        AbstractC1196i lifecycle2;
        PowerAdapter powerAdapter = this.f42167O;
        powerAdapter.f42121l = false;
        AbstractC1204m j = powerAdapter.mo28061j();
        if (!(j == null || (lifecycle2 = j.getLifecycle()) == null)) {
            lifecycle2.mo4012a(powerAdapter);
        }
        for (T t : powerAdapter.mo28046a()) {
            t.f42169a.f42188a.removeObserver(t);
            AbstractC1204m mVar = t.f42177i;
            if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
                lifecycle.mo4013b(t);
            }
            t.f42177i = null;
        }
    }

    public void setLifecycleOwner(AbstractC1204m mVar) {
        AbstractC1196i lifecycle;
        AbstractC1196i lifecycle2;
        AbstractC1196i lifecycle3;
        PowerAdapter powerAdapter = this.f42167O;
        C89219l.m154719c(mVar, "");
        AbstractC1204m j = powerAdapter.mo28061j();
        powerAdapter.f42120k = mVar;
        if (powerAdapter.f42121l && (!C89219l.m154714a(powerAdapter.mo28061j(), j))) {
            if (!(j == null || (lifecycle3 = j.getLifecycle()) == null)) {
                lifecycle3.mo4013b(powerAdapter);
            }
            AbstractC1204m j2 = powerAdapter.mo28061j();
            if (!(j2 == null || (lifecycle2 = j2.getLifecycle()) == null)) {
                lifecycle2.mo4012a(powerAdapter);
            }
            for (T t : powerAdapter.mo28046a()) {
                AbstractC1204m j3 = powerAdapter.mo28061j();
                C89219l.m154719c(j3, "");
                AbstractC1204m mVar2 = t.f42177i;
                if (!(mVar2 == null || (lifecycle = mVar2.getLifecycle()) == null)) {
                    lifecycle.mo4013b(t);
                }
                j3.getLifecycle().mo4012a(t);
            }
        }
    }

    /* renamed from: a */
    public final void mo28079a(int i, View view) {
        getPrimaryStub().mo28097a(i, view);
    }

    public PowerList(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PowerList(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        PowerAdapter powerAdapter = new PowerAdapter(this);
        this.f42167O = powerAdapter;
        setAdapter(powerAdapter);
        getContext();
        setLayoutManager(new LinearLayoutManager());
        addOnAttachStateChangeListener(this);
        addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC2587f());
    }
}
