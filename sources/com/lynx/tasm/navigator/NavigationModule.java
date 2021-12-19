package com.lynx.tasm.navigator;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.lynx.jsbridge.AbstractC28359d;
import com.lynx.jsbridge.LynxModule;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.utils.C28929m;
import java.util.HashMap;

public class NavigationModule extends LynxModule {
    public static String NAME = "NavigationModule";

    @AbstractC28359d
    public String getString() {
        return NAME;
    }

    static {
        Covode.recordClassIndex(34928);
    }

    @AbstractC28359d
    public void goBack() {
        C28929m.m57947a(new Runnable() {
            /* class com.lynx.tasm.navigator.NavigationModule.RunnableC288244 */

            static {
                Covode.recordClassIndex(34932);
            }

            public final void run() {
                C28825a c = C28832c.f68069a.mo49964c();
                if (c == null) {
                    return;
                }
                if (!c.f68051a.isEmpty()) {
                    c.mo49956a((LynxView) c.f68054d.remove(c.f68051a.pop()));
                    return;
                }
                AbstractC28831b a = c.mo49954a();
                if (a != null) {
                    a.mo26063v();
                }
            }
        });
    }

    public NavigationModule(Context context) {
        super(context);
    }

    @AbstractC28359d
    public void registerRoute(final ReadableMap readableMap) {
        C28929m.m57947a(new Runnable() {
            /* class com.lynx.tasm.navigator.NavigationModule.RunnableC288211 */

            static {
                Covode.recordClassIndex(34929);
            }

            public final void run() {
                C28832c cVar = C28832c.f68069a;
                ReadableMap readableMap = readableMap;
                C28825a c = cVar.mo49964c();
                if (c != null) {
                    c.f68053c = readableMap.toHashMap();
                }
            }
        });
    }

    public NavigationModule(Context context, Object obj) {
        super(context, obj);
    }

    @AbstractC28359d
    public void navigateTo(final String str, final ReadableMap readableMap) {
        C28929m.m57947a(new Runnable() {
            /* class com.lynx.tasm.navigator.NavigationModule.RunnableC288222 */

            static {
                Covode.recordClassIndex(34930);
            }

            public final void run() {
                C28825a c;
                HashMap<String, Object> hashMap = new HashMap<>();
                ReadableMap readableMap = readableMap;
                if (readableMap != null) {
                    hashMap = readableMap.toHashMap();
                }
                C28832c cVar = C28832c.f68069a;
                String str = str;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if ((cVar.f68070b == null || !cVar.f68070b.mo49967a()) && (c = cVar.mo49964c()) != null) {
                    C28833d dVar = new C28833d(c.mo49955a(str), hashMap);
                    c.mo49957a(dVar, new AbstractC28837g(dVar, str) {
                        /* class com.lynx.tasm.navigator.C28825a.C288261 */

                        /* renamed from: a */
                        final /* synthetic */ C28833d f68056a;

                        /* renamed from: b */
                        final /* synthetic */ String f68057b;

                        static {
                            Covode.recordClassIndex(34934);
                        }

                        @Override // com.lynx.tasm.navigator.AbstractC28837g
                        /* renamed from: a */
                        public final void mo49960a(LynxView lynxView) {
                            if (lynxView != null) {
                                if (!C28825a.this.f68051a.isEmpty()) {
                                    C28825a.m57710b((LynxView) C28825a.this.f68054d.get(C28825a.this.f68051a.peek()));
                                } else {
                                    C28825a.m57710b(C28825a.this.mo49958b());
                                }
                                C28825a.this.f68051a.push(this.f68056a);
                                AbstractC28831b a = C28825a.this.mo49954a();
                                if (a != null) {
                                    a.mo26056a(lynxView);
                                }
                            }
                        }

                        {
                            this.f68056a = r2;
                            this.f68057b = r3;
                        }
                    });
                }
            }
        });
    }

    @AbstractC28359d
    public void replace(final String str, final ReadableMap readableMap) {
        C28929m.m57947a(new Runnable() {
            /* class com.lynx.tasm.navigator.NavigationModule.RunnableC288233 */

            static {
                Covode.recordClassIndex(34931);
            }

            public final void run() {
                C28825a c;
                HashMap<String, Object> hashMap = new HashMap<>();
                ReadableMap readableMap = readableMap;
                if (readableMap != null) {
                    hashMap = readableMap.toHashMap();
                }
                C28832c cVar = C28832c.f68069a;
                String str = str;
                if (!TextUtils.isEmpty(str) && (c = cVar.mo49964c()) != null) {
                    C28833d dVar = new C28833d(c.mo49955a(str), hashMap);
                    c.mo49957a(dVar, new AbstractC28837g(dVar, str) {
                        /* class com.lynx.tasm.navigator.C28825a.C288272 */

                        /* renamed from: a */
                        final /* synthetic */ C28833d f68059a;

                        /* renamed from: b */
                        final /* synthetic */ String f68060b;

                        static {
                            Covode.recordClassIndex(34935);
                        }

                        @Override // com.lynx.tasm.navigator.AbstractC28837g
                        /* renamed from: a */
                        public final void mo49960a(LynxView lynxView) {
                            if (lynxView != null) {
                                if (!C28825a.this.f68051a.isEmpty()) {
                                    C28833d pop = C28825a.this.f68051a.pop();
                                    C28825a.this.mo49956a((LynxView) C28825a.this.f68054d.remove(pop));
                                } else {
                                    C28825a aVar = C28825a.this;
                                    aVar.mo49956a(aVar.mo49958b());
                                }
                                C28825a.this.f68051a.push(this.f68059a);
                                AbstractC28831b a = C28825a.this.mo49954a();
                                if (a != null) {
                                    a.mo26056a(lynxView);
                                }
                            }
                        }

                        {
                            this.f68059a = r2;
                            this.f68060b = r3;
                        }
                    });
                }
            }
        });
    }
}
