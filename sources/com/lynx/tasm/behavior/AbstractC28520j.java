package com.lynx.tasm.behavior;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.kakao.usermgmt.StringSet;
import com.lynx.jsbridge.C28357b;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.AbstractC28838o;
import com.lynx.tasm.C28719c;
import com.lynx.tasm.C28781g;
import com.lynx.tasm.C28816j;
import com.lynx.tasm.LynxView;
import com.lynx.tasm.behavior.p2052ui.LynxBaseUI;
import com.lynx.tasm.behavior.p2052ui.UIBody;
import com.lynx.tasm.behavior.shadow.ShadowNode;
import com.lynx.tasm.core.JSProxy;
import com.lynx.tasm.p2055d.C28751a;
import com.lynx.tasm.provider.C28845c;
import com.lynx.tasm.utils.C28917d;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.lynx.tasm.behavior.j */
public abstract class AbstractC28520j extends ContextWrapper implements AbstractC28509e {

    /* renamed from: a */
    private LayoutInflater f67060a;

    /* renamed from: b */
    public AbstractC28510f f67061b;

    /* renamed from: c */
    public JavaOnlyMap f67062c;

    /* renamed from: d */
    public ReadableMap f67063d;

    /* renamed from: e */
    public C28719c f67064e;

    /* renamed from: f */
    public C28717w f67065f;

    /* renamed from: g */
    public C28781g f67066g;

    /* renamed from: h */
    public WeakReference<JSProxy> f67067h;

    /* renamed from: i */
    public UIBody f67068i;

    /* renamed from: j */
    public WeakReference<C28529q> f67069j;

    /* renamed from: k */
    public WeakReference<C28524l> f67070k;

    /* renamed from: l */
    public String f67071l;

    /* renamed from: m */
    public AbstractC28838o f67072m;

    /* renamed from: n */
    public WeakReference<LynxView> f67073n;

    /* renamed from: o */
    public WeakReference<C28576t> f67074o;

    /* renamed from: p */
    public DisplayMetrics f67075p;

    /* renamed from: q */
    public boolean f67076q;

    /* renamed from: r */
    public boolean f67077r = true;

    /* renamed from: s */
    public boolean f67078s;

    /* renamed from: t */
    public C28845c f67079t;

    /* renamed from: u */
    public List<AbstractC28532r> f67080u;

    /* renamed from: v */
    private Map<String, C28751a> f67081v;

    /* renamed from: w */
    private WeakReference<Context> f67082w;

    static {
        Covode.recordClassIndex(34518);
    }

    @Override // com.lynx.tasm.behavior.AbstractC28509e
    /* renamed from: a */
    public abstract void mo48666a(Exception exc);

    /* renamed from: a */
    public final void mo49039a(String str, String str2, String str3) {
        if (this.f67072m != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("src", str);
                jSONObject.put("error_msg", str3);
                jSONObject.put(StringSet.type, str2);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.f67072m.mo19151a(new C28816j(jSONObject.toString(), 301));
        }
    }

    /* renamed from: a */
    public final Context mo49032a() {
        return this.f67082w.get();
    }

    /* renamed from: b */
    public final C28524l mo49040b() {
        return this.f67070k.get();
    }

    /* renamed from: c */
    public final Long mo49043c() {
        JSProxy jSProxy = this.f67067h.get();
        if (jSProxy != null) {
            return Long.valueOf(jSProxy.f67785b);
        }
        return null;
    }

    /* renamed from: a */
    public final C28357b mo49033a(String str) {
        JSProxy jSProxy;
        WeakReference<JSProxy> weakReference = this.f67067h;
        if (weakReference == null || (jSProxy = weakReference.get()) == null) {
            return null;
        }
        return jSProxy.mo49856a(str);
    }

    /* renamed from: b */
    public final ShadowNode mo49041b(int i) {
        C28576t tVar = this.f67074o.get();
        if (tVar != null) {
            return tVar.f67240c.mo49192a(i);
        }
        return null;
    }

    /* renamed from: a */
    public final LynxBaseUI mo49034a(int i) {
        C28529q qVar = this.f67069j.get();
        if (qVar != null) {
            return qVar.mo49070a(i);
        }
        return null;
    }

    /* renamed from: b */
    public final C28751a mo49042b(String str) {
        String a = C28917d.m57922a(str);
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        synchronized (C28917d.class) {
            if (this.f67081v == null) {
                this.f67081v = new HashMap();
            }
            C28751a aVar = this.f67081v.get(a);
            if (aVar != null) {
                return aVar;
            }
            C28751a a2 = C28917d.m57921a(this, a);
            if (a2 != null) {
                this.f67081v.put(a, a2);
            }
            return a2;
        }
    }

    @Override // android.content.Context, android.content.ContextWrapper
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return m56993a(getBaseContext(), str);
        }
        if (this.f67060a == null) {
            this.f67060a = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f67060a;
    }

    /* renamed from: a */
    public final void mo49036a(ReadableMap readableMap) {
        if (this.f67062c == null) {
            this.f67062c = new JavaOnlyMap();
        }
        this.f67062c.merge(readableMap);
    }

    /* renamed from: a */
    public final void mo49037a(LynxBaseUI lynxBaseUI) {
        C28717w wVar = this.f67065f;
        if (wVar != null && wVar.f67720e != null) {
            wVar.f67720e.add(Integer.valueOf(lynxBaseUI.getSign()));
        }
    }

    public AbstractC28520j(Context context, DisplayMetrics displayMetrics) {
        super(context);
        this.f67082w = new WeakReference<>(context);
        DisplayMetrics displayMetrics2 = new DisplayMetrics();
        this.f67075p = displayMetrics2;
        displayMetrics2.setTo(displayMetrics);
    }

    /* renamed from: a */
    private static Object m56993a(Context context, String str) {
        Object systemService;
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!C58027i.f132247b && "connectivity".equals(str)) {
                try {
                    new C21708b().mo35361a();
                    C58027i.f132247b = true;
                    return context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            return context.getSystemService(str);
        } else if (!C58027i.f132246a) {
            return context.getSystemService(str);
        } else {
            synchronized (ClipboardManager.class) {
                systemService = context.getSystemService(str);
                if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                    try {
                        Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                        declaredField.setAccessible(true);
                        declaredField.set(systemService, new C58027i.HandlerC58028a((Handler) declaredField.get(systemService)));
                    } catch (Exception e) {
                        C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                    }
                }
                C58027i.f132246a = false;
            }
            return systemService;
        }
    }

    /* renamed from: a */
    public final LynxBaseUI mo49035a(String str, LynxBaseUI lynxBaseUI) {
        C28529q qVar = this.f67069j.get();
        if (qVar != null) {
            return qVar.mo49072a(str, lynxBaseUI);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo49038a(String str, JavaOnlyArray javaOnlyArray) {
        C28357b a = mo49033a("GlobalEventEmitter");
        if (a != null) {
            JavaOnlyArray javaOnlyArray2 = new JavaOnlyArray();
            javaOnlyArray2.pushString(str);
            javaOnlyArray2.pushArray(javaOnlyArray);
            a.mo48479a("emit", javaOnlyArray2);
        }
    }
}
