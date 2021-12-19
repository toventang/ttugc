package com.lynx.tasm.behavior.utils;

import com.bytedance.covode.number.Covode;
import com.lynx.react.bridge.ReadableMapKeySetIterator;
import com.lynx.tasm.behavior.C28716v;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.behavior.utils.C28703d;
import java.util.HashMap;
import java.util.Map;

public class PropsUpdater {

    /* renamed from: a */
    public static final Map<Class<?>, LynxUISetter<?>> f67694a = new HashMap();

    /* renamed from: b */
    private static final Map<Class<?>, ShadowNodeSetter<?>> f67695b = new HashMap();

    /* renamed from: c */
    private static final Map<String, Settable> f67696c = new HashMap();

    static {
        Covode.recordClassIndex(34789);
    }

    public static class FallbackLynxUISetter<T extends LynxBaseUI> implements LynxUISetter<T> {

        /* renamed from: a */
        private final Map<String, C28703d.AbstractC28713j> f67697a;

        static {
            Covode.recordClassIndex(34790);
        }

        private FallbackLynxUISetter(Class<? extends LynxBaseUI> cls) {
            this.f67697a = C28703d.m57485a(cls);
        }

        public /* synthetic */ FallbackLynxUISetter(Class cls, byte b) {
            this(cls);
        }

        @Override // com.lynx.tasm.behavior.utils.LynxUISetter
        public void setProperty(LynxBaseUI lynxBaseUI, String str, C28716v vVar) {
            C28703d.AbstractC28713j jVar = this.f67697a.get(str);
            if (jVar != null) {
                jVar.mo49817a(lynxBaseUI, vVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static class FallbackShadowNodeSetter<T extends ShadowNode> implements ShadowNodeSetter<T> {

        /* renamed from: a */
        private final Map<String, C28703d.AbstractC28713j> f67698a;

        static {
            Covode.recordClassIndex(34791);
        }

        private FallbackShadowNodeSetter(Class<? extends ShadowNode> cls) {
            this.f67698a = C28703d.m57487b(cls);
        }

        /* synthetic */ FallbackShadowNodeSetter(Class cls, byte b) {
            this(cls);
        }

        @Override // com.lynx.tasm.behavior.utils.ShadowNodeSetter
        /* renamed from: a */
        public final void mo30605a(ShadowNode shadowNode, String str, C28716v vVar) {
            C28703d.AbstractC28713j jVar = this.f67698a.get(str);
            if (jVar != null) {
                jVar.mo49816a(shadowNode, vVar);
            }
        }
    }

    /* renamed from: b */
    private static <T extends ShadowNode> ShadowNodeSetter<T> m57479b(Class<? extends ShadowNode> cls) {
        Map<Class<?>, ShadowNodeSetter<?>> map = f67695b;
        ShadowNodeSetter<?> shadowNodeSetter = map.get(cls);
        if (shadowNodeSetter == null) {
            shadowNodeSetter = (ShadowNodeSetter) m57477a(cls);
            if (shadowNodeSetter == null) {
                shadowNodeSetter = new FallbackShadowNodeSetter<>(cls, (byte) 0);
            }
            map.put(cls, shadowNodeSetter);
        }
        return shadowNodeSetter;
    }

    /* renamed from: a */
    public static <T> T m57477a(Class<?> cls) {
        String str = cls.getName() + "$$PropsSetter";
        T t = (T) f67696c.get(str);
        if (t != null) {
            return t;
        }
        try {
            return (T) Class.forName(str).newInstance();
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (IllegalAccessException | InstantiationException e) {
            throw new RuntimeException("Unable to instantiate methods getter for ".concat(String.valueOf(str)), e);
        }
    }

    /* renamed from: a */
    public static <T extends ShadowNode> void m57478a(T t, C28716v vVar) {
        ShadowNodeSetter b = m57479b(t.getClass());
        ReadableMapKeySetIterator keySetIterator = vVar.f67715a.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            b.mo30605a(t, keySetIterator.nextKey(), vVar);
        }
    }
}
