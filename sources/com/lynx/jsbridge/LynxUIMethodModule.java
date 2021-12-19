package com.lynx.jsbridge;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.AbstractRunnableC28370d;
import com.lynx.react.bridge.Callback;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import com.lynx.tasm.behavior.C28529q;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.UIGroup;
import com.lynx.tasm.behavior.utils.AbstractC28700a;
import com.lynx.tasm.behavior.utils.LynxUIMethodsExecutor;
import com.lynx.tasm.utils.C28929m;

public class LynxUIMethodModule extends LynxContextModule {
    static {
        Covode.recordClassIndex(34321);
    }

    public LynxUIMethodModule(AbstractC28520j jVar) {
        super(jVar);
    }

    /* access modifiers changed from: package-private */
    @AbstractC28359d
    public void invokeUIMethod(final String str, final ReadableArray readableArray, final String str2, final ReadableMap readableMap, final Callback callback) {
        C28929m.m57947a(new AbstractRunnableC28370d(this.mLynxContext) {
            /* class com.lynx.jsbridge.LynxUIMethodModule.C283511 */

            static {
                Covode.recordClassIndex(34322);
            }

            @Override // com.lynx.react.bridge.AbstractRunnableC28370d
            /* renamed from: a */
            public final void mo48440a() {
                int i;
                boolean z;
                if (!str.isEmpty()) {
                    i = Integer.parseInt(str);
                } else {
                    i = -1;
                }
                AbstractC28520j jVar = LynxUIMethodModule.this.mLynxContext;
                ReadableArray readableArray = readableArray;
                String str = str2;
                ReadableMap readableMap = readableMap;
                C283521 r5 = new Callback() {
                    /* class com.lynx.jsbridge.LynxUIMethodModule.C283511.C283521 */

                    static {
                        Covode.recordClassIndex(34323);
                    }

                    @Override // com.lynx.react.bridge.Callback
                    public final void invoke(Object... objArr) {
                        if (callback != null) {
                            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
                            javaOnlyMap.putInt("code", ((Integer) objArr[0]).intValue());
                            if (objArr.length > 1) {
                                javaOnlyMap.put("data", objArr[1]);
                            }
                            callback.invoke(javaOnlyMap);
                        }
                    }
                };
                C28529q qVar = jVar.f67069j.get();
                if (qVar != null) {
                    LynxBaseUI b = qVar.mo49082b(i);
                    String str2 = "component not found";
                    if (b != null) {
                        String str3 = "";
                        for (int i2 = 0; i2 < readableArray.size(); i2++) {
                            String string = readableArray.getString(i2);
                            if (readableMap == null || readableMap.size() <= 0 || !readableMap.hasKey("_isCallByRefId") || !readableMap.getBoolean("_isCallByRefId")) {
                                z = false;
                            } else {
                                z = true;
                            }
                            if (string.startsWith("#") || z) {
                                String substring = string.substring(1);
                                if (z) {
                                    b = qVar.mo49083b(string, b);
                                } else {
                                    b = qVar.mo49072a(substring, b);
                                }
                                if (b == null) {
                                    str2 = "not found ".concat(String.valueOf(string));
                                } else {
                                    if (b.mIdSelector == null || !b.mIdSelector.equals(substring)) {
                                        if (!(b instanceof UIGroup)) {
                                            str2 = "You must set flatten to false with ".concat(String.valueOf(str3));
                                        } else {
                                            str3 = string;
                                        }
                                    }
                                }
                            } else {
                                r5.invoke(5, string + " not support，only support id selector currently");
                                return;
                            }
                        }
                        Class<?> cls = b.getClass();
                        AbstractC28700a<?> aVar = LynxUIMethodsExecutor.f67691a.get(cls);
                        if (aVar == null) {
                            aVar = (AbstractC28700a) LynxUIMethodsExecutor.m57475a(cls);
                            if (aVar == null) {
                                String str4 = "MethodInvoker not generated for class: " + cls.getName() + ". You should add module lynxProcessor";
                                LLog.m56856a(6, "MethodsExecutor", str4);
                                if (!LynxEnv.m56706b().f66652s || !LynxEnv.m56706b().f66640g) {
                                    aVar = new LynxUIMethodsExecutor.FallbackLynxUIMethodInvoker<>(cls);
                                } else {
                                    throw new IllegalStateException(str4);
                                }
                            }
                            LynxUIMethodsExecutor.f67691a.put(cls, aVar);
                        }
                        aVar.invoke(b, str, readableMap, r5);
                        return;
                    }
                    r5.invoke(2, str2);
                }
            }
        });
    }
}
