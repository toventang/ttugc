package com.p2082ss.ttvideoengine.p4417j;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.p2082ss.ttvideoengine.p4418k.AbstractC86561j;
import com.p2082ss.ttvideoengine.p4418k.C86557i;
import com.p2082ss.ttvideoengine.p4430s.C86633c;
import com.p2082ss.ttvideoengine.p4430s.C86640h;
import com.p2082ss.ttvideoengine.p4430s.C86641i;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

/* renamed from: com.ss.ttvideoengine.j.f */
public class C86520f {

    /* renamed from: a */
    public Class<?> f194735a;

    /* renamed from: b */
    public Object f194736b;

    /* renamed from: c */
    public AbstractC86561j f194737c = new C86557i();

    /* renamed from: d */
    public AbstractC86521a f194738d;

    /* renamed from: e */
    Handler f194739e;

    /* renamed from: f */
    private Object f194740f;

    /* renamed from: g */
    private Object f194741g;

    /* renamed from: com.ss.ttvideoengine.j.f$a */
    public interface AbstractC86521a {
        static {
            Covode.recordClassIndex(101749);
        }

        /* renamed from: a */
        void mo137281a();

        /* renamed from: a */
        void mo137282a(C86633c cVar);
    }

    static {
        Covode.recordClassIndex(101748);
    }

    /* renamed from: a */
    public final void mo137770a(String str) {
        C86641i.m150113b("IntertrustDrmHelper", "setTokenUrlTemplate enter");
        if (this.f194736b != null) {
            try {
                if (this.f194735a == null) {
                    this.f194735a = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
                }
                this.f194735a.getDeclaredMethod("setTokenUrlTemplate", String.class).invoke(this.f194736b, str);
            } catch (ClassNotFoundException e) {
                C86641i.m150117e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
            } catch (NoSuchMethodException e2) {
                C86641i.m150117e("IntertrustDrmHelper", "method not found:" + e2.getLocalizedMessage());
            } catch (IllegalAccessException e3) {
                C86641i.m150117e("IntertrustDrmHelper", "method invoke failied:" + e3.getLocalizedMessage());
            } catch (InvocationTargetException e4) {
                C86641i.m150117e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            }
        }
    }

    /* renamed from: b */
    public final int mo137771b() {
        C86641i.m150113b("IntertrustDrmHelper", "start enter");
        if (this.f194736b == null) {
            return -1;
        }
        try {
            if (this.f194735a == null) {
                this.f194735a = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            return ((Integer) this.f194735a.getDeclaredMethod("start", new Class[0]).invoke(this.f194736b, new Object[0])).intValue();
        } catch (ClassNotFoundException e) {
            C86641i.m150117e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
            return -1;
        } catch (NoSuchMethodException e2) {
            C86641i.m150117e("IntertrustDrmHelper", "method not found:" + e2.getLocalizedMessage());
            return -1;
        } catch (IllegalAccessException e3) {
            C86641i.m150117e("IntertrustDrmHelper", "method invoke failied:" + e3.getLocalizedMessage());
            return -1;
        } catch (InvocationTargetException e4) {
            C86641i.m150117e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            return -1;
        }
    }

    /* renamed from: c */
    public final int mo137772c() {
        C86641i.m150113b("IntertrustDrmHelper", "stop enter");
        if (this.f194736b == null) {
            return -1;
        }
        try {
            if (this.f194735a == null) {
                this.f194735a = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            return ((Integer) this.f194735a.getDeclaredMethod("stop", new Class[0]).invoke(this.f194736b, new Object[0])).intValue();
        } catch (ClassNotFoundException e) {
            C86641i.m150117e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
            return -1;
        } catch (NoSuchMethodException e2) {
            C86641i.m150117e("IntertrustDrmHelper", "method not found:" + e2.getLocalizedMessage());
            return -1;
        } catch (IllegalAccessException e3) {
            C86641i.m150117e("IntertrustDrmHelper", "method invoke failied:" + e3.getLocalizedMessage());
            return -1;
        } catch (InvocationTargetException e4) {
            C86641i.m150117e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            return -1;
        }
    }

    /* renamed from: a */
    public final void mo137768a() {
        C86641i.m150113b("IntertrustDrmHelper", "release enter");
        if (this.f194736b != null) {
            try {
                if (this.f194735a == null) {
                    this.f194735a = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
                }
                this.f194735a.getDeclaredMethod("release", new Class[0]).invoke(this.f194736b, new Object[0]);
                this.f194736b = null;
            } catch (ClassNotFoundException e) {
                C86641i.m150117e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
            } catch (NoSuchMethodException e2) {
                C86641i.m150117e("IntertrustDrmHelper", "method not found:" + e2.getLocalizedMessage());
            } catch (IllegalAccessException e3) {
                C86641i.m150117e("IntertrustDrmHelper", "method invoke failied:" + e3.getLocalizedMessage());
            } catch (InvocationTargetException e4) {
                C86641i.m150117e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.j.f$c */
    public class C86523c implements InvocationHandler {
        static {
            Covode.recordClassIndex(101751);
        }

        private C86523c() {
        }

        /* synthetic */ C86523c(C86520f fVar, byte b) {
            this();
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            int i;
            String str;
            C86641i.m150113b("IntertrustDrmHelper", "intertrust listener invoke");
            String name = method.getName();
            if (name.equals("onTokenProcessed")) {
                C86520f fVar = C86520f.this;
                fVar.f194739e.sendMessage(fVar.f194739e.obtainMessage(0));
                return null;
            } else if (name.equals("onError")) {
                int i2 = -1;
                if (objArr[0] != null) {
                    i = ((Integer) objArr[0]).intValue();
                } else {
                    i = -1;
                }
                if (objArr[1] != null) {
                    i2 = ((Integer) objArr[1]).intValue();
                }
                if (objArr[2] != null) {
                    str = objArr[2].toString();
                } else {
                    str = "";
                }
                if (i == -600000) {
                    i = -9935;
                } else if (i == -600001) {
                    i = -9934;
                }
                C86520f.this.mo137769a(new C86633c("kTTVideoErrorDomainIntertrustDRM", i, i2, str));
                return null;
            } else {
                C86641i.m150115c("IntertrustDrmHelper", "invalid method name:".concat(String.valueOf(name)));
                return null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.j.f$d */
    public class C86524d implements InvocationHandler {
        static {
            Covode.recordClassIndex(101752);
        }

        private C86524d() {
        }

        /* synthetic */ C86524d(C86520f fVar, byte b) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: com.ss.ttvideoengine.k.j */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String str;
            Map map;
            C86641i.m150113b("IntertrustDrmHelper", "network listener invoke");
            String name = method.getName();
            if (name.equals("startTask")) {
                if (objArr[0] != null) {
                    str = objArr[0].toString();
                } else {
                    str = "";
                }
                if (objArr[1] != null) {
                    map = (Map) objArr[1];
                } else {
                    map = null;
                }
                C86520f.this.f194737c.mo137818a(str, map, new C86525e());
            } else if (name.equals("cancel")) {
                C86520f.this.f194737c.mo101097a();
            } else {
                C86641i.m150115c("IntertrustDrmHelper", "invalid method name:".concat(String.valueOf(name)));
            }
            return null;
        }
    }

    /* renamed from: com.ss.ttvideoengine.j.f$e */
    class C86525e implements AbstractC86561j.AbstractC86563b {
        static {
            Covode.recordClassIndex(101753);
        }

        C86525e() {
        }

        @Override // com.p2082ss.ttvideoengine.p4418k.AbstractC86561j.AbstractC86563b
        /* renamed from: a */
        public final void mo137776a(String str, C86633c cVar) {
            if (cVar != null) {
                String str2 = cVar.f195254d;
                C86641i.m150117e("IntertrustDrmHelper", "get token return error code: " + cVar.f195251a + ", internal:" + cVar.f195252b + ", description:" + cVar.f195254d);
                if (!str2.contains("Canceled")) {
                    C86520f.this.mo137769a(cVar);
                }
            } else if (C86520f.this.f194736b != null) {
                try {
                    if (C86520f.this.f194735a == null) {
                        C86520f.this.f194735a = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
                    }
                    C86520f.this.f194735a.getDeclaredMethod("processTokenComplete", String.class).invoke(C86520f.this.f194736b, str);
                } catch (ClassNotFoundException e) {
                    C86641i.m150117e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
                } catch (NoSuchMethodException e2) {
                    C86641i.m150117e("IntertrustDrmHelper", "method not found:" + e2.getLocalizedMessage());
                } catch (IllegalAccessException e3) {
                    C86641i.m150117e("IntertrustDrmHelper", "method invoke failied:" + e3.getLocalizedMessage());
                } catch (InvocationTargetException e4) {
                    C86641i.m150117e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo137769a(C86633c cVar) {
        this.f194739e.sendMessage(this.f194739e.obtainMessage(1, cVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.ttvideoengine.j.f$b */
    public class HandlerC86522b extends Handler {

        /* renamed from: b */
        private WeakReference<C86520f> f194743b;

        static {
            Covode.recordClassIndex(101750);
        }

        public final void handleMessage(Message message) {
            AbstractC86521a aVar;
            C86520f fVar = this.f194743b.get();
            if (fVar != null && (aVar = fVar.f194738d) != null) {
                int i = message.what;
                if (i == 0) {
                    aVar.mo137281a();
                } else if (i == 1) {
                    aVar.mo137282a((C86633c) message.obj);
                }
            }
        }

        public HandlerC86522b(C86520f fVar, Looper looper) {
            super(looper);
            this.f194743b = new WeakReference<>(fVar);
        }
    }

    /* renamed from: a */
    public final int mo137766a(Context context, int i) {
        Object obj;
        C86641i.m150113b("IntertrustDrmHelper", "init enter");
        try {
            Class<?> cls = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            this.f194735a = cls;
            this.f194736b = cls.newInstance();
            Class<?> cls2 = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy$IntertrustDrmProxyListener");
            C86523c cVar = new C86523c(this, (byte) 0);
            this.f194740f = Proxy.newProxyInstance(C86520f.class.getClassLoader(), new Class[]{cls2}, cVar);
            this.f194735a.getDeclaredMethod("setListener", cls2).invoke(this.f194736b, this.f194740f);
            Class<?> cls3 = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy$IntertrustDrmProxyNetworkClient");
            C86524d dVar = new C86524d(this, (byte) 0);
            this.f194741g = Proxy.newProxyInstance(C86520f.class.getClassLoader(), new Class[]{cls3}, dVar);
            this.f194735a.getDeclaredMethod("setNetworkClient", cls3).invoke(this.f194736b, this.f194741g);
            if (i == 0) {
                obj = this.f194735a.getDeclaredMethod("init", Context.class).invoke(this.f194736b, context);
            } else {
                obj = this.f194735a.getDeclaredMethod("init", Context.class, Integer.TYPE).invoke(this.f194736b, context, Integer.valueOf(i));
            }
            this.f194739e = new HandlerC86522b(this, C86640h.m150077a());
            return ((Integer) obj).intValue();
        } catch (ClassNotFoundException e) {
            C86641i.m150117e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
            return -1002;
        } catch (InstantiationException e2) {
            C86641i.m150117e("IntertrustDrmHelper", "instance failed+" + e2.getLocalizedMessage());
            return -1;
        } catch (IllegalAccessException e3) {
            C86641i.m150117e("IntertrustDrmHelper", "illegal access exception:" + e3.getLocalizedMessage());
            return -1;
        } catch (NoSuchMethodException e4) {
            C86641i.m150117e("IntertrustDrmHelper", "method not found:" + e4.getLocalizedMessage());
            return -1;
        } catch (InvocationTargetException e5) {
            C86641i.m150117e("IntertrustDrmHelper", "invoke failed:" + e5.getLocalizedMessage());
            return -1;
        }
    }

    /* renamed from: a */
    public final String mo137767a(String str, int i) {
        C86641i.m150113b("IntertrustDrmHelper", "makeUrl enter");
        if (this.f194736b == null) {
            return null;
        }
        try {
            if (this.f194735a == null) {
                this.f194735a = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            return (String) this.f194735a.getDeclaredMethod("makeUrl", String.class, Integer.TYPE).invoke(this.f194736b, str, Integer.valueOf(i));
        } catch (ClassNotFoundException e) {
            C86641i.m150117e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
            return null;
        } catch (NoSuchMethodException e2) {
            C86641i.m150117e("IntertrustDrmHelper", "method not found:" + e2.getLocalizedMessage());
            return null;
        } catch (IllegalAccessException e3) {
            C86641i.m150117e("IntertrustDrmHelper", "method invoke failied:" + e3.getLocalizedMessage());
            return null;
        } catch (InvocationTargetException e4) {
            C86641i.m150117e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: a */
    public final int mo137765a(int i, String str, String str2) {
        C86641i.m150113b("IntertrustDrmHelper", "processToken enter");
        if (this.f194736b == null) {
            return -1;
        }
        try {
            if (this.f194735a == null) {
                this.f194735a = Class.forName("com.ss.ttm.drm.intertrust.IntertrustDrmProxy");
            }
            return ((Integer) this.f194735a.getDeclaredMethod("processToken", Integer.TYPE, String.class, String.class).invoke(this.f194736b, Integer.valueOf(i), str, str2)).intValue();
        } catch (ClassNotFoundException e) {
            C86641i.m150117e("IntertrustDrmHelper", "class not found:" + e.getLocalizedMessage());
            return -1;
        } catch (NoSuchMethodException e2) {
            C86641i.m150117e("IntertrustDrmHelper", "method not found:" + e2.getLocalizedMessage());
            return -1;
        } catch (IllegalAccessException e3) {
            C86641i.m150117e("IntertrustDrmHelper", "method invoke failied:" + e3.getLocalizedMessage());
            return -1;
        } catch (InvocationTargetException e4) {
            C86641i.m150117e("IntertrustDrmHelper", "method invoke failied:" + e4.getLocalizedMessage());
            return -1;
        }
    }
}
