package com.lynx.jsbridge;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.AbstractRunnableC28370d;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28521k;
import com.lynx.tasm.behavior.C28524l;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.utils.C28929m;
import java.util.Iterator;

public class LynxIntersectionObserverModule extends LynxContextModule {
    static {
        Covode.recordClassIndex(34311);
    }

    public LynxIntersectionObserverModule(AbstractC28520j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: package-private */
    @AbstractC28359d
    public void disconnect(final int i) {
        C28929m.m57947a(new AbstractRunnableC28370d(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.C283505 */

            static {
                Covode.recordClassIndex(34316);
            }

            @Override // com.lynx.react.bridge.AbstractRunnableC28370d
            /* renamed from: a */
            public final void mo48440a() {
                C28521k a = LynxIntersectionObserverModule.this.mLynxContext.mo49040b().mo49052a(i);
                if (a != null) {
                    a.f67088f.clear();
                    C28524l lVar = a.f67084b.get();
                    int i = a.f67083a;
                    Iterator<C28521k> it = lVar.f67106a.iterator();
                    while (it.hasNext()) {
                        C28521k next = it.next();
                        if (next.f67083a == i) {
                            lVar.f67106a.remove(next);
                            return;
                        }
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    @AbstractC28359d
    public void relativeToViewport(final int i, final ReadableMap readableMap) {
        C28929m.m57947a(new AbstractRunnableC28370d(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.C283483 */

            static {
                Covode.recordClassIndex(34314);
            }

            @Override // com.lynx.react.bridge.AbstractRunnableC28370d
            /* renamed from: a */
            public final void mo48440a() {
                C28521k a = LynxIntersectionObserverModule.this.mLynxContext.mo49040b().mo49052a(i);
                if (a != null) {
                    ReadableMap readableMap = readableMap;
                    a.f67087e = null;
                    a.mo49046a(readableMap);
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    @AbstractC28359d
    public void createIntersectionObserver(final int i, final String str, final ReadableMap readableMap) {
        C28929m.m57947a(new AbstractRunnableC28370d(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.C283461 */

            static {
                Covode.recordClassIndex(34312);
            }

            @Override // com.lynx.react.bridge.AbstractRunnableC28370d
            /* renamed from: a */
            public final void mo48440a() {
                C28524l b = LynxIntersectionObserverModule.this.mLynxContext.mo49040b();
                if (b.mo49052a(i) == null) {
                    int i = -1;
                    if (!str.isEmpty()) {
                        i = Integer.parseInt(str);
                    }
                    b.mo49055a(new C28521k(b, i, i, readableMap));
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    @AbstractC28359d
    public void observe(final int i, final String str, final int i2) {
        C28929m.m57947a(new AbstractRunnableC28370d(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.C283494 */

            static {
                Covode.recordClassIndex(34315);
            }

            @Override // com.lynx.react.bridge.AbstractRunnableC28370d
            /* renamed from: a */
            public final void mo48440a() {
                LynxBaseUI a;
                C28521k a2 = LynxIntersectionObserverModule.this.mLynxContext.mo49040b().mo49052a(i);
                if (a2 != null) {
                    String str = str;
                    int i = i2;
                    if (str.startsWith("#") && (a = a2.f67084b.get().mo49051a().mo49035a(str.substring(1), a2.f67086d)) != null) {
                        for (int i2 = 0; i2 < a2.f67088f.size(); i2++) {
                            if (a2.f67088f.get(i2).f67103a == a) {
                                return;
                            }
                        }
                        C28521k.C28523b bVar = new C28521k.C28523b((byte) 0);
                        bVar.f67103a = a;
                        bVar.f67104b = i;
                        a2.f67088f.add(bVar);
                        a2.mo49047a(bVar, a2.mo49048b(), true);
                    }
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    @AbstractC28359d
    public void relativeTo(final int i, final String str, final ReadableMap readableMap) {
        C28929m.m57947a(new AbstractRunnableC28370d(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxIntersectionObserverModule.C283472 */

            static {
                Covode.recordClassIndex(34313);
            }

            @Override // com.lynx.react.bridge.AbstractRunnableC28370d
            /* renamed from: a */
            public final void mo48440a() {
                C28521k a = LynxIntersectionObserverModule.this.mLynxContext.mo49040b().mo49052a(i);
                if (a != null) {
                    String str = str;
                    ReadableMap readableMap = readableMap;
                    if (str.startsWith("#")) {
                        a.f67087e = a.f67084b.get().mo49051a().mo49035a(str.substring(1), a.f67086d);
                        a.mo49046a(readableMap);
                    }
                }
            }
        });
    }
}
