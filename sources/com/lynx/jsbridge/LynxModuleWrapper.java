package com.lynx.jsbridge;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.base.LLog;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class LynxModuleWrapper {

    /* renamed from: a */
    private final LynxModule f66585a;

    /* renamed from: b */
    private final ArrayList<MethodDescriptor> f66586b = new ArrayList<>();

    /* renamed from: c */
    private final ArrayList<AttributeDescriptor> f66587c = new ArrayList<>();

    /* renamed from: d */
    private final String f66588d;

    static {
        Covode.recordClassIndex(34319);
    }

    public LynxModule getModule() {
        return this.f66585a;
    }

    public String getName() {
        return this.f66588d;
    }

    public Collection<AttributeDescriptor> getAttributeDescriptor() {
        if (this.f66587c.isEmpty()) {
            try {
                HashSet hashSet = new HashSet();
                Field[] declaredFields = this.f66585a.getClass().getDeclaredFields();
                for (Field field : declaredFields) {
                    if (((AbstractC28358c) field.getAnnotation(AbstractC28358c.class)) != null) {
                        String name = field.getName();
                        if (!hashSet.contains(name)) {
                            hashSet.add(name);
                            AttributeDescriptor attributeDescriptor = new AttributeDescriptor();
                            attributeDescriptor.f66563a = name;
                            attributeDescriptor.f66564b = new JavaOnlyArray();
                            try {
                                attributeDescriptor.f66564b.add(field.get(this.f66585a));
                            } catch (IllegalAccessException e) {
                                LLog.m56856a(6, "LynxModuleWrapper", e.toString());
                            }
                            this.f66587c.add(attributeDescriptor);
                        } else {
                            throw new IllegalArgumentException("Java Module " + getName() + " attribute name already registered: " + name);
                        }
                    }
                }
            } catch (RuntimeException e2) {
                LLog.m56856a(6, "LynxModuleWrapper", e2.toString());
            }
        }
        return this.f66587c;
    }

    public Collection<MethodDescriptor> getMethodDescriptors() {
        if (this.f66586b.isEmpty()) {
            try {
                HashSet hashSet = new HashSet();
                Method[] declaredMethods = this.f66585a.getClass().getDeclaredMethods();
                for (Method method : declaredMethods) {
                    if (((AbstractC28359d) method.getAnnotation(AbstractC28359d.class)) != null) {
                        String name = method.getName();
                        if (!hashSet.contains(name)) {
                            hashSet.add(name);
                            MethodDescriptor methodDescriptor = new MethodDescriptor();
                            C28360e eVar = new C28360e(method);
                            methodDescriptor.f66598c = name;
                            methodDescriptor.f66597b = eVar.mo48480a();
                            methodDescriptor.f66596a = method;
                            this.f66586b.add(methodDescriptor);
                        } else {
                            throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                        }
                    }
                }
            } catch (RuntimeException e) {
                LLog.m56856a(6, "LynxModuleWrapper", e.toString());
            }
        }
        return this.f66586b;
    }

    public LynxModuleWrapper(String str, LynxModule lynxModule) {
        this.f66588d = str;
        this.f66585a = lynxModule;
    }
}
