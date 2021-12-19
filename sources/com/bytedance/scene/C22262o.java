package com.bytedance.scene;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import org.xmlpull.v1.XmlPullParser;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.scene.o */
public final class C22262o extends LayoutInflater {

    /* renamed from: a */
    private final AbstractC22219j f52657a;

    /* renamed from: b */
    private LayoutInflater f52658b;

    static {
        Covode.recordClassIndex(26074);
    }

    /* renamed from: a */
    private void m41919a() {
        Context s;
        if (this.f52658b == null) {
            if (this.f52657a.f52555s == 0) {
                s = this.f52657a.mo36486t();
            } else {
                s = this.f52657a.mo36485s();
            }
            this.f52658b = this.f52657a.mo36486t().getLayoutInflater().cloneInContext(s);
            LayoutInflater.Filter filter = getFilter();
            if (filter != null) {
                this.f52658b.setFilter(filter);
            }
            LayoutInflater.Factory2 factory2 = getFactory2();
            if (factory2 != null) {
                this.f52658b.setFactory2(factory2);
                return;
            }
            LayoutInflater.Factory factory = getFactory();
            if (factory != null) {
                this.f52658b.setFactory(factory);
            }
        }
    }

    public final LayoutInflater cloneInContext(Context context) {
        return new C22262o(context, this.f52657a);
    }

    public final void setFactory(LayoutInflater.Factory factory) {
        super.setFactory(factory);
        LayoutInflater layoutInflater = this.f52658b;
        if (layoutInflater != null) {
            layoutInflater.setFactory(factory);
        }
    }

    public final void setFactory2(LayoutInflater.Factory2 factory2) {
        super.setFactory2(factory2);
        LayoutInflater layoutInflater = this.f52658b;
        if (layoutInflater != null) {
            layoutInflater.setFactory2(factory2);
        }
    }

    C22262o(Context context, AbstractC22219j jVar) {
        super(context);
        this.f52657a = jVar;
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup) {
        MethodCollector.m26663i(11091);
        m41919a();
        View inflate = this.f52658b.inflate(i, viewGroup);
        MethodCollector.m26664o(11091);
        return inflate;
    }

    @Override // android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup) {
        MethodCollector.m26663i(11241);
        m41919a();
        View inflate = this.f52658b.inflate(xmlPullParser, viewGroup);
        MethodCollector.m26664o(11241);
        return inflate;
    }

    @Override // android.view.LayoutInflater
    public final View inflate(int i, ViewGroup viewGroup, boolean z) {
        m41919a();
        return C1764a.m5927a(this.f52658b, i, viewGroup, z);
    }

    @Override // android.view.LayoutInflater
    public final View inflate(XmlPullParser xmlPullParser, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(11384);
        m41919a();
        View inflate = this.f52658b.inflate(xmlPullParser, viewGroup, z);
        MethodCollector.m26664o(11384);
        return inflate;
    }
}
