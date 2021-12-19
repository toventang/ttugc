package com.lynx.jsbridge;

import android.content.Context;
import androidx.p025c.C0484a;
import com.bytedance.covode.number.Covode;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.base.LLog;
import com.lynx.tasm.behavior.AbstractC28520j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LynxModuleManager {

    /* renamed from: a */
    Map<String, LynxModuleWrapper> f66582a;

    /* renamed from: b */
    Context f66583b;

    /* renamed from: c */
    private final Map<String, C28361f> f66584c = new HashMap();

    static {
        Covode.recordClassIndex(34318);
    }

    public LynxModuleManager(Context context) {
        this.f66583b = context;
    }

    /* renamed from: a */
    private static void m56655a(Exception exc) {
        LLog.m56856a(6, "LynxModuleManager", "get Module failed".concat(String.valueOf(exc)));
    }

    private LynxModuleWrapper moduleWrapperForName(String str) {
        LynxModuleWrapper a = m56654a(str);
        if (a != null) {
            return a;
        }
        LynxEnv b = LynxEnv.m56706b();
        if (b.f66646m == null) {
            b.f66646m = new LynxModuleManager(b.f66634a);
        }
        return b.f66646m.m56654a(str);
    }

    /* renamed from: a */
    public final void mo48442a(List<C28361f> list) {
        if (!(list == null || list.size() == 0)) {
            for (C28361f fVar : list) {
                String str = fVar.f66611a;
                C28361f fVar2 = this.f66584c.get(str);
                if (fVar2 != null) {
                    LLog.m56856a(6, "LynxModuleManager", "Duplicated LynxModule For Name: " + str + ", " + fVar2 + " will be override");
                }
                this.f66584c.put(str, fVar);
            }
        }
    }

    /* renamed from: a */
    private LynxModuleWrapper m56654a(String str) {
        LynxModule lynxModule;
        if (str == null) {
            LLog.m56856a(6, "LynxModuleManager", "getModule failed, name is null");
            return null;
        }
        if (this.f66582a == null) {
            this.f66582a = new C0484a();
        }
        if (this.f66582a.get(str) != null) {
            return this.f66582a.get(str);
        }
        C28361f fVar = this.f66584c.get(str);
        if (fVar == null) {
            return null;
        }
        Class<? extends LynxModule> cls = fVar.f66612b;
        try {
            if (LynxContextModule.class.isAssignableFrom(cls)) {
                if (!(this.f66583b instanceof AbstractC28520j)) {
                    throw new Exception(cls.getCanonicalName() + " must be created with LynxContext");
                } else if (fVar.f66613c == null) {
                    Constructor<?>[] constructors = cls.getConstructors();
                    int length = constructors.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        Constructor<?> constructor = constructors[i];
                        Class<?>[] parameterTypes = constructor.getParameterTypes();
                        if (parameterTypes.length != 1 || !AbstractC28520j.class.equals(parameterTypes[0])) {
                            if (parameterTypes.length == 2 && AbstractC28520j.class.equals(parameterTypes[0]) && Object.class.equals(parameterTypes[1])) {
                                lynxModule = (LynxModule) constructor.newInstance((AbstractC28520j) this.f66583b, null);
                                break;
                            }
                            i++;
                        } else {
                            lynxModule = (LynxModule) constructor.newInstance((AbstractC28520j) this.f66583b);
                            break;
                        }
                    }
                    LLog.m56856a(2, "LynxModuleManager", "getModule" + str + "failed");
                    return null;
                } else {
                    lynxModule = (LynxModule) cls.getConstructor(AbstractC28520j.class, Object.class).newInstance((AbstractC28520j) this.f66583b, fVar.f66613c);
                }
            } else if (fVar.f66613c == null) {
                Constructor<?>[] constructors2 = cls.getConstructors();
                int length2 = constructors2.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length2) {
                        break;
                    }
                    Constructor<?> constructor2 = constructors2[i2];
                    Class<?>[] parameterTypes2 = constructor2.getParameterTypes();
                    if (parameterTypes2.length != 1 || !Context.class.equals(parameterTypes2[0])) {
                        if (parameterTypes2.length == 2 && Context.class.equals(parameterTypes2[0]) && Object.class.equals(parameterTypes2[1])) {
                            lynxModule = (LynxModule) constructor2.newInstance(this.f66583b, null);
                            break;
                        }
                        i2++;
                    } else {
                        lynxModule = (LynxModule) constructor2.newInstance(this.f66583b);
                        break;
                    }
                }
            } else {
                lynxModule = (LynxModule) cls.getConstructor(Context.class, Object.class).newInstance(this.f66583b, fVar.f66613c);
            }
            if (lynxModule == null) {
                LLog.m56856a(2, "LynxModuleManager", "getModule" + str + "failed");
                return null;
            }
            LynxModuleWrapper lynxModuleWrapper = new LynxModuleWrapper(str, lynxModule);
            this.f66582a.put(str, lynxModuleWrapper);
            return lynxModuleWrapper;
        } catch (InstantiationException e) {
            m56655a(e);
        } catch (IllegalAccessException e2) {
            m56655a(e2);
        } catch (NoSuchMethodException e3) {
            m56655a(e3);
        } catch (InvocationTargetException e4) {
            m56655a(e4);
        } catch (Exception e5) {
            m56655a(e5);
        }
    }

    /* renamed from: a */
    public final void mo48441a(String str, Class<? extends LynxModule> cls, Object obj) {
        C28361f fVar = new C28361f();
        fVar.f66611a = str;
        fVar.f66612b = cls;
        fVar.f66613c = obj;
        C28361f fVar2 = this.f66584c.get(str);
        if (fVar2 != null) {
            LLog.m56856a(6, "LynxModuleManager", "Duplicated LynxModule For Name: " + str + ", " + fVar2 + " will be override");
        }
        this.f66584c.put(str, fVar);
        LLog.m56856a(2, "LynxModuleManager", "registered module with name: " + str + " class" + cls);
    }
}
