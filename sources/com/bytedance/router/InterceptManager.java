package com.bytedance.router;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.bytedance.router.interceptor.IInterceptorProvider;
import com.bytedance.router.interceptor.RewriteManager;
import com.bytedance.router.mapping.SmartRouterInterceptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class InterceptManager {
    private IInterceptorProvider interceptorProvider;
    private Map<String, IInterceptor> mAssignInterceptors = new HashMap();
    private volatile boolean mInterceptorProviderIsInited;
    private List<IInterceptor> mInterceptors = new LinkedList();
    private AtomicBoolean mIsInited = new AtomicBoolean(false);
    private List<IInterceptor> mLastInterceptors = new LinkedList();
    private RewriteManager mRewriteManager;
    private SmartRouterInterceptor mSmartRouterInterceptor;

    static {
        Covode.recordClassIndex(25812);
    }

    public RewriteManager getRewriteManager() {
        return this.mRewriteManager;
    }

    public InterceptManager() {
        if (this.mRewriteManager == null) {
            this.mRewriteManager = new RewriteManager();
        }
        this.mInterceptors.add(this.mRewriteManager);
        this.mSmartRouterInterceptor = new SmartRouterInterceptor();
    }

    public void initInterceptors() {
        if (!this.mIsInited.get()) {
            ArrayList arrayList = new ArrayList();
            this.mSmartRouterInterceptor.initInterceptors(arrayList);
            this.mInterceptors.addAll(arrayList);
            HashMap hashMap = new HashMap();
            this.mSmartRouterInterceptor.initAssignInterceptors(hashMap);
            this.mAssignInterceptors.putAll(hashMap);
        }
        this.mIsInited.set(true);
    }

    public void addInterceptorProvider(IInterceptorProvider iInterceptorProvider) {
        if (iInterceptorProvider != null) {
            this.interceptorProvider = iInterceptorProvider;
        }
    }

    public void addInterceptor(IInterceptor iInterceptor) {
        MethodCollector.m26663i(13536);
        if (iInterceptor == null) {
            MethodCollector.m26664o(13536);
            return;
        }
        synchronized (this) {
            try {
                this.mInterceptors.add(iInterceptor);
            } finally {
                MethodCollector.m26664o(13536);
            }
        }
    }

    public void addLastInterceptor(IInterceptor iInterceptor) {
        MethodCollector.m26663i(13537);
        if (iInterceptor == null) {
            MethodCollector.m26664o(13537);
            return;
        }
        synchronized (this) {
            try {
                this.mLastInterceptors.add(iInterceptor);
            } finally {
                MethodCollector.m26664o(13537);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean whetherIntercept(String str) {
        MethodCollector.m26663i(13640);
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(13640);
            return false;
        }
        synchronized (this) {
            try {
                if (!this.mInterceptorProviderIsInited) {
                    IInterceptorProvider iInterceptorProvider = this.interceptorProvider;
                    if (iInterceptorProvider != null) {
                        this.mInterceptors.addAll(iInterceptorProvider.getInterceptors());
                    }
                    this.mInterceptorProviderIsInited = true;
                }
                RouteIntent build = new RouteIntent.Builder(str).build();
                for (IInterceptor iInterceptor : this.mInterceptors) {
                    if (iInterceptor.matchInterceptRules(build)) {
                        return true;
                    }
                }
                for (IInterceptor iInterceptor2 : this.mLastInterceptors) {
                    if (iInterceptor2.matchInterceptRules(build)) {
                        MethodCollector.m26664o(13640);
                        return true;
                    }
                }
                MethodCollector.m26664o(13640);
                return false;
            } finally {
                MethodCollector.m26664o(13640);
            }
        }
    }

    public void addAssignInterceptor(String str, IInterceptor iInterceptor) {
        MethodCollector.m26663i(13538);
        if (TextUtils.isEmpty(str) || iInterceptor == null) {
            MethodCollector.m26664o(13538);
            return;
        }
        synchronized (this) {
            try {
                this.mAssignInterceptors.put(str, iInterceptor);
            } finally {
                MethodCollector.m26664o(13538);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean processRouteIntent(Context context, RouteIntent routeIntent) {
        MethodCollector.m26663i(13584);
        if (routeIntent == null) {
            MethodCollector.m26664o(13584);
            return true;
        }
        synchronized (this) {
            try {
                if (!this.mInterceptorProviderIsInited) {
                    IInterceptorProvider iInterceptorProvider = this.interceptorProvider;
                    if (iInterceptorProvider != null) {
                        this.mInterceptors.addAll(iInterceptorProvider.getInterceptors());
                    }
                    this.mInterceptorProviderIsInited = true;
                }
                for (IInterceptor iInterceptor : this.mInterceptors) {
                    if (iInterceptor.matchInterceptRules(routeIntent) && iInterceptor.onInterceptRoute(context, routeIntent)) {
                        return true;
                    }
                }
                for (IInterceptor iInterceptor2 : this.mLastInterceptors) {
                    if (iInterceptor2.matchInterceptRules(routeIntent) && iInterceptor2.onInterceptRoute(context, routeIntent)) {
                        MethodCollector.m26664o(13584);
                        return true;
                    }
                }
                MethodCollector.m26664o(13584);
                return false;
            } finally {
                MethodCollector.m26664o(13584);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean processAssignInterceptor(Context context, List<String> list, RouteIntent routeIntent) {
        MethodCollector.m26663i(13585);
        if (routeIntent == null) {
            MethodCollector.m26664o(13585);
            return true;
        }
        synchronized (this) {
            try {
                for (String str : list) {
                    IInterceptor iInterceptor = this.mAssignInterceptors.get(str);
                    if (iInterceptor != null && iInterceptor.onInterceptRoute(context, routeIntent)) {
                        return true;
                    }
                }
                MethodCollector.m26664o(13585);
                return false;
            } finally {
                MethodCollector.m26664o(13585);
            }
        }
    }
}
