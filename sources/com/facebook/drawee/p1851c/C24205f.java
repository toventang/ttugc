package com.facebook.drawee.p1851c;

import android.graphics.drawable.Animatable;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.drawee.c.f */
public class C24205f<INFO> implements AbstractC24203d<INFO> {

    /* renamed from: a */
    private final List<AbstractC24203d<? super INFO>> f57319a = new ArrayList(2);

    static {
        Covode.recordClassIndex(28336);
    }

    /* renamed from: a */
    public final synchronized void mo39829a() {
        MethodCollector.m26663i(6383);
        this.f57319a.clear();
        MethodCollector.m26664o(6383);
    }

    /* renamed from: b */
    public final synchronized void mo39831b(AbstractC24203d<? super INFO> dVar) {
        MethodCollector.m26663i(6381);
        int indexOf = this.f57319a.indexOf(dVar);
        if (indexOf != -1) {
            this.f57319a.set(indexOf, null);
        }
        MethodCollector.m26664o(6381);
    }

    /* renamed from: a */
    public final synchronized void mo39830a(AbstractC24203d<? super INFO> dVar) {
        MethodCollector.m26663i(6377);
        this.f57319a.add(dVar);
        MethodCollector.m26664o(6377);
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public synchronized void onRelease(String str) {
        MethodCollector.m26663i(6963);
        int size = this.f57319a.size();
        for (int i = 0; i < size; i++) {
            try {
                AbstractC24203d<? super INFO> dVar = this.f57319a.get(i);
                if (dVar != null) {
                    dVar.onRelease(str);
                }
            } catch (Exception unused) {
            }
        }
        MethodCollector.m26664o(6963);
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public void onIntermediateImageFailed(String str, Throwable th) {
        int size = this.f57319a.size();
        for (int i = 0; i < size; i++) {
            try {
                AbstractC24203d<? super INFO> dVar = this.f57319a.get(i);
                if (dVar != null) {
                    dVar.onIntermediateImageFailed(str, th);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public void onIntermediateImageSet(String str, INFO info) {
        int size = this.f57319a.size();
        for (int i = 0; i < size; i++) {
            try {
                AbstractC24203d<? super INFO> dVar = this.f57319a.get(i);
                if (dVar != null) {
                    dVar.onIntermediateImageSet(str, info);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public synchronized void onFailure(String str, Throwable th) {
        MethodCollector.m26663i(6815);
        int size = this.f57319a.size();
        for (int i = 0; i < size; i++) {
            try {
                AbstractC24203d<? super INFO> dVar = this.f57319a.get(i);
                if (dVar != null) {
                    dVar.onFailure(str, th);
                }
            } catch (Exception unused) {
            }
        }
        MethodCollector.m26664o(6815);
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public synchronized void onSubmit(String str, Object obj) {
        MethodCollector.m26663i(6525);
        int size = this.f57319a.size();
        for (int i = 0; i < size; i++) {
            try {
                AbstractC24203d<? super INFO> dVar = this.f57319a.get(i);
                if (dVar != null) {
                    dVar.onSubmit(str, obj);
                }
            } catch (Exception unused) {
            }
        }
        MethodCollector.m26664o(6525);
    }

    @Override // com.facebook.drawee.p1851c.AbstractC24203d
    public synchronized void onFinalImageSet(String str, INFO info, Animatable animatable) {
        MethodCollector.m26663i(6812);
        int size = this.f57319a.size();
        for (int i = 0; i < size; i++) {
            try {
                AbstractC24203d<? super INFO> dVar = this.f57319a.get(i);
                if (dVar != null) {
                    dVar.onFinalImageSet(str, info, animatable);
                }
            } catch (Exception unused) {
            }
        }
        MethodCollector.m26664o(6812);
    }
}
